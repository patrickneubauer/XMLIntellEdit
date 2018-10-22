package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.CostProvider;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.composite.CompositeChangeImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluableManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableManagerImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.GlobalSearch;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceInfo;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.ProposalList;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl.ProposalListImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.LocalSearchInterface;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.NeighborhoodProvider;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.SimpleStream;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreMapTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class LocalSearchInterfaceImpl implements LocalSearchInterface {
	
	public static enum SearchType {
		DEFAULT, SIMULATED_ANNEALING
	}
	private class SolutionState implements Comparable<SolutionState> {
		
		private LocalSearchPartialSolution solution;
		
		private Iterator<? extends Change<?>> iter;
		private int usedSolutions;
		public SolutionState(LocalSearchPartialSolution solution, Iterator<? extends Change<?>> iter) {
			this.solution = solution;
			this.iter = iter;
		}
		
		public void addUsedSolution(int num) {
			this.usedSolutions+= num;
		}
		
		@Override
		public int compareTo(SolutionState arg0) {
			int ret = -Double.compare(getEffectiveQuality(), arg0.getEffectiveQuality());
			return ret;
		}
		
		public double getEffectiveQuality() {
			return this.solution.getQuality()-this.usedSolutions*LocalSearchInterfaceImpl.this.objectReduction;
		}

		public double getOriginalQuality() {
			return this.solution.getImproveQuality();
		}

		public LocalSearchPartialSolution getSolution() {
			return this.solution;
		}

		public Iterator<? extends Change<?>> iter() {
			int i = 0;
			while (this.iter == null || !this.iter.hasNext() && ++i < 10) {
				this.iter = LocalSearchInterfaceImpl.this.provider.getNeighbours(this.solution).iterator();
			}
			return this.iter;
		}

		public Iterator<? extends Change<?>> sampledIter() {
			int i = 0;
			while (this.iter == null || !this.iter.hasNext() && ++i < 10) {
				this.iter = LocalSearchInterfaceImpl.this.provider.sampleNeighbours(this.solution).iterator();
			}
			return this.iter;
		}
	}
	private static final long maxTime = 5*1000L;
	public static LocalSearchInterfaceImpl create(MyResource res, String name, Evaluable expr, EObject context, SimpleStream<Change<?>> stream,
			NeighborhoodProvider provider, double originalQuality) {
		return new LocalSearchInterfaceImpl(res, name, expr, context, stream, provider, originalQuality, -1, -1);
	}
	public static LocalSearchInterfaceImpl create(MyResource res, String name, Evaluable expr, EObject context, SimpleStream<Change<?>> stream,
			NeighborhoodProvider provider, double originalQuality, int maxNeighbors, int maxSolutions) {
		return new LocalSearchInterfaceImpl(res, name, expr, context, stream, provider, originalQuality, maxNeighbors, maxSolutions);
	}
	private Evaluable orieval;
	private String name;
	private EObject context;
	private SimpleStream<Change<?>> stream;
	private MyResource clonedRes;
	
	private WeakReference<MyResource> originalRes;
	
	private EcoreUtil.Copier copier;
	
	private EcoreTransferFunction transferFunc;
	
	private int processedChanges = 0;
	
	private CostProvider costProvider = CostProvider.DEFAULT_PROVIDER;
	private boolean isInterrpted = false;
	private ProposalList<Double,? extends Proposal<Double,?>> myProposals =
			new ProposalListImpl<>();
	private boolean isFinished;
	private NeighborhoodProvider provider = NeighborhoodProvider.DEFAULT_DIRECTFIX;
	
	private int maxNeighbors = Integer.MAX_VALUE;
	
	private int maxSolutions = Integer.MAX_VALUE;
	
	private double objectReduction = 0.0002;
	
	private double originalQuality = 0.0; 
	
	private Resource clonedResRes;
		
	private long stepTime = maxTime/10;
	
	private long totalTime = Long.MAX_VALUE;
	
	private PriorityQueue<SolutionState> curSolutions = new PriorityQueue<>();
	
	private Set<List<Change<?>>> allSolutions = new HashSet<>();

	private EvaluableManager manager = new EvaluableManagerImpl();

	private boolean abort= false;

	private int calculatedSolutions = 0;
	

	private SearchType curType = SearchType.SIMULATED_ANNEALING;

	private List<Change<?>> checkSolutions = new ArrayList<>();
	
	private List<Change<?>> returnedSolutions = new ArrayList<>();
	
	private int curCheckSolutionIndex = 0;
	
	
	
	private LocalSearchInterfaceImpl(MyResource res, String name, Evaluable expr, EObject context, SimpleStream<Change<?>> stream,
			NeighborhoodProvider provider, double originalQuality, int maxNeighbors, int maxSolutions) {
		this.name = name;
		this.orieval = expr;
		
		this.stream = stream;
		
		this.provider = provider;
		if (maxNeighbors == -1) {
			maxNeighbors = provider==NeighborhoodProvider.DEFAULT_DIRECTFIX?Integer.MAX_VALUE:100;
		}
		if (maxSolutions == -1) {
			maxSolutions = provider==NeighborhoodProvider.DEFAULT_DIRECTFIX?Integer.MAX_VALUE:1000;
		}
		this.originalQuality = originalQuality;
		this.maxNeighbors = maxNeighbors;
		this.maxSolutions = maxSolutions;
		this.processedChanges = provider == NeighborhoodProvider.DEFAULT_LOCALSEARCH?100:0;
		this.maxSolutions+= this.processedChanges;

		//Theoretisch k�nnte man hier statisch slicen
		initResourceCopy(res,context);
		
	}
	@Override
	public void abortSearch() {
		
		this.abort = true;
		/*stepTime = totalTime = 0;
		clonedRes = null;
		copier = null;
		transferFunc = null;
		curSolutions = null;*/
	}
	private Change<?>[] buildOriginalResourceChange(List<Change<?>> oldchanges, Change<?>... toAdd) {
		List<Change<?>> newchanges = new ArrayList<>();
		EcoreTransferFunction toOriginal = toOriginalResource();
		List<Change<?>> totalOldChanges = new ArrayList<>();
		for (Change<?> ch: oldchanges) {
			totalOldChanges.add(ch);
		}
		for (Change<?> ch: toAdd) {
			totalOldChanges.add(ch);
		}
		Change<?> oldr = new CompositeChangeImpl(this.clonedRes.getResource(), totalOldChanges);
		oldr.removeEmptyWhenExecuting();
		oldr.removeUnnecessarySubchanges();
		if (oldr.unbox().size() == 1) {
			oldr = oldr.unbox().get(0);
		}
		Change<?> newr = oldr.transfered(toOriginal);		
		return new Change<?>[]{oldr,newr};
	}
	@Override
	public LocalSearchInterface clone() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void copyFrom(LocalSearchInterface localSearchInterface, boolean reuseResource) {
		if (!(localSearchInterface instanceof LocalSearchInterfaceImpl)) {
			throw new UnsupportedOperationException("Can't copy localSearchInterfaceImpl with different class");
		}
		LocalSearchInterfaceImpl other = (LocalSearchInterfaceImpl)localSearchInterface;
		this.checkSolutions = other.getReturnedOrCheckSolutions();
		
	}
	
	@Override
	public synchronized boolean doSomeSearch() {
		try {
		if (this.abort) {
			return false;
		}
		this.stepTime = Math.min(this.totalTime, this.stepTime);
		this.totalTime-= this.stepTime;
		double endTime = new Date().getTime()+this.stepTime;
		int numActions = 200;
		int curAction = 0;
		if (this.curCheckSolutionIndex < this.checkSolutions.size()) {
			
			for (; this.curCheckSolutionIndex < this.checkSolutions.size(); ++this.curCheckSolutionIndex) {
				if (this.abort || new Date().getTime() >= endTime) {
					//System.out.println("Time elapsed!");
					return false;
				}
				Change<?> oriChange = this.checkSolutions.get(this.curCheckSolutionIndex);
				Change<?> curChange = oriChange.transfered(this.transferFunc);
				Undoer undoer = curChange.execute();
				this.clonedRes.checkResource();
				try {
					++this.processedChanges;
					EvaluationState state = this.manager.basicEvaluate(this.clonedRes,getOriginalEvaluable(), getContext());
					Object ret = state.getBasicResult();
					//System.out.println("Evaluation of " + name+" was " + ret + " ("+getOriginalEvaluable()+")");
					if (!(ret instanceof Boolean) || !((Boolean)ret)) {
							//Need search
						EvalResult res = state.getResult();
						double curQuality = state.getQuality();
						res.printAllDirectFixingActions();
						FixAttemptReferenceInfo completeInfo = res.getCompleteReferenceInfo();
						completeInfo.printComplete();
						Stack<Change<?>> alStack = new Stack<>();
						alStack.addAll(curChange.unbox());
						if (this.allSolutions.add(oriChange.unbox())) {
							 if (curQuality > this.originalQuality) {
								 undoer.undo();
								 LocalSearchPartialSolution initSol = new LocalSearchPartialSolution(alStack, curQuality,  res.getAllDirectFixingActions());
								 this.curSolutions.add(new SolutionState(initSol, this.provider.getNeighbours(initSol).iterator()));
								 this.returnedSolutions.add(oriChange);
								 getStream().add(curChange, oriChange, curQuality, oriChange.getCosts());
								 undoer = curChange.execute();
							 }
						}
					} else {
						 if (this.allSolutions.add(oriChange.unbox())) {
							 this.returnedSolutions.add(oriChange);
							 undoer.undo();
							 if (!GlobalSearch.FILTER_GRAMMAR_ERROR ) {
								 getStream().add(curChange,oriChange, 1.0, oriChange.getCosts());
							 }
							 undoer = curChange.execute();
						 }
					}
				} finally {
					undoer.undo();
					this.clonedRes.checkResource();
				}
			}
			if (this.curCheckSolutionIndex >= this.checkSolutions.size() && !this.checkSolutions.isEmpty()) {
				this.checkSolutions.clear();
			}
		}
		Copier newCopier = new EcoreUtil.Copier();
		Resource oldBase = this.clonedRes.clone(newCopier);
		
		if (this.curType == SearchType.SIMULATED_ANNEALING) {
			while (!this.curSolutions.isEmpty()) {
				if (this.abort || (++curAction > numActions)) {
					//System.out.println("Time elapsed!");
					return false;
				}
				if (this.processedChanges > this.maxSolutions) {
					this.abort = true;
					return false;
				}
				++this.processedChanges;
				
				SolutionState original = this.curSolutions.poll();
				
				int changeNumb = 2;
				Random random = new Random();
				while (random.nextBoolean()) {
					++changeNumb;
				}
				

				List<Undoer> undoers = new ArrayList<>();
				List<Change<?>> addChanges = new ArrayList<>();
				try {
				for (Change<?> change: original.getSolution().getChanges()) {
					undoers.add(change.execute());
				}
				
				SolutionState changed = original;
				SolutionState best = original;
				List<LocalSearchPartialSolution> clearSolutions = new ArrayList<>();
				
				for (int chn = 0; chn < changeNumb; ++chn) {
					Iterator<? extends Change<?>> chIter = changed.sampledIter();
					int noNeighbors = 0;
					while (chIter.hasNext()) {
						Change ch = chIter.next();
						
						if (ch.isIdentity()) {
							if (noNeighbors++ >= 10) {
								break;
							}
							continue;
						}
						

						addChanges.add(ch);
						String changeString = String.valueOf(ch);
						String[] end = changeString.split(" ");
						String last = end[end.length-1];
						boolean isOk = false;
						/*if (last.length() == 10) {
							isOk = true;
							for (int i = 0; i < last.length(); ++i) {
								if (!Character.isDigit(last.charAt(i))) {
									isOk = false;
								}
							}
							if (isOk) {
								System.out.println("Good change found: "+changeNumb);
							}
						}*/
						 Undoer undoer = ch.execute();
						 undoers.add(undoer);
						 try {
							 EvaluationState state = this.manager.basicEvaluate(this.clonedRes,getOriginalEvaluable(), getContext());
							 Object ret = state.getBasicResult();

							 EvalResult res = state.getResult();
							 double curQuality = state.getQuality();
							 LocalSearchPartialSolution toAdd = changed.getSolution().added(ch, curQuality, this.provider.getBaseFixes(res));
							 SolutionState newChanged = new SolutionState(toAdd,null);
							 if (curQuality > best.getOriginalQuality() || curQuality >= 1.0) {
								 if (curQuality > best.getOriginalQuality()) {
									 clearSolutions.add(best.getSolution());
									 best = newChanged;
								 }
								 for (int i = undoers.size()-1; i >= 0; --i) {
										undoers.get(i).undo();
								 }
								 Change<?>[] oriNewChange = buildOriginalResourceChange(changed.getSolution().getChanges(),ch);
								 if (this.allSolutions.add(oriNewChange[0].unbox())) {
									 this.returnedSolutions.add(oriNewChange[1]);
									 getStream().add(oriNewChange[0],oriNewChange[1], curQuality, oriNewChange[1].getCosts());
								 }
								 undoers = new ArrayList<>();
								 for (Change<?> change: changed.getSolution().getChanges()) {
									undoers.add(change.execute());
								 }
								 undoers.add(ch.execute());
							 } else {
								 clearSolutions.add(toAdd);
							 }
								 
							 changed = newChanged;
						 } finally {
							
						 }
						
						break;
					}
					
					for (LocalSearchPartialSolution clear: clearSolutions) {
						//clear.clearFixes();
					}
					
				}
				
				this.curSolutions.add(best);
				if (this.provider != NeighborhoodProvider.DEFAULT_DIRECTFIX) {
					System.out.println("Local search tries changes " + Arrays.toString(addChanges.toArray()));
				}
			}  catch (Exception e)  {
				if (this.abort) {
					return false;
				}
				e.printStackTrace();
				StringWriter writer = new StringWriter();
				PrintWriter pw = new PrintWriter(writer);
				e.printStackTrace(pw);
				String op = writer.toString();
				System.out.println(op);
			} finally {

				 for (int i = undoers.size()-1; i >= 0; --i) {
					undoers.get(i).undo();
				 }
			}
			}
			
		} else {
		
		try {
		while (!this.curSolutions.isEmpty()) {
			if (this.abort || new Date().getTime() >= endTime) {
				//System.out.println("Time elapsed!");
				return false;
			}
			if (this.processedChanges > this.maxSolutions) {
				this.abort = true;
				return false;
			}
			++this.processedChanges;
			SolutionState curSol = this.curSolutions.poll();
			List<Undoer> undoers = new ArrayList<>();
			try {
			for (Change<?> change: curSol.getSolution().getChanges()) {
				undoers.add(change.execute());
			}
			//Jetzt ist man einmal auf dem alten Stand
			//Probiere alles an Fixes durch
			//Man muss ein paar ausprobieren und dann weiter machen, aber das existierende speichern
			int curNeighbors = 0;
			Iterator<? extends Change<?>> chIter = curSol.iter();
			
			for (Change<?> ch: (Iterable<Change<?>>)(Iterable)(()->chIter)) {
				
				if (ch.isIdentity()) {
					continue;
				}
				if (curNeighbors++ >= this.maxNeighbors) {
					//Store Iterator
					curSol.addUsedSolution(curNeighbors);
					this.curSolutions.add(curSol);
					break;
				}
				boolean previouslyName = false;
				Set<String> acceptableNames = new HashSet<>(Arrays.asList("R1","G1","G2","C1","C2","Bla"));
				
				 for (EObject obj:this.clonedRes.iterateAllContents()) {
						if (obj != null && (obj.eClass().getName().equals("Consumer") || obj.eClass().getName().equals("Computer")) ) {
							if (!acceptableNames.contains(obj.eGet(obj.eClass().getEStructuralFeature("name")))) {
								previouslyName = true;
							} 
						}
					 }
				
				 Undoer undoer = ch.execute();
				 boolean haveUndone = false;
				 try {
				 /*System.out.println("Trying " +ch);
				 fact = EcoreEnvironmentFactory.INSTANCE;*/
				 EvaluationState state = this.manager.basicEvaluate(this.clonedRes,getOriginalEvaluable(), getContext());
				 Object ret = state.getBasicResult();

				 
				 if (ret instanceof Boolean && ((Boolean)ret)) {
					 //Passt, jetzt muss man nicht mehr weitermachen!

					/* for (EObject obj:clonedRes.iterateAllContents()) {
							if (obj != null && (obj.eClass().getName().equals("Consumer") || obj.eClass().getName().equals("Computer")) ) {
								if (!acceptableNames.contains(obj.eGet(obj.eClass().getEStructuralFeature("name"))) && !(ch instanceof BasicClearConstantChange)) {
									System.err.println("Namename");
								} 
							}
						 }*/
					 undoer.undo();
					 haveUndone = true;
					 for (int i = undoers.size()-1; i >= 0; --i) {
							undoers.get(i).undo();
					 }
					 Change<?>[] oriNewChange = buildOriginalResourceChange(curSol.getSolution().getChanges(),ch);
					 if (this.allSolutions.add(oriNewChange[0].unbox())) {
						 
						 this.returnedSolutions.add(oriNewChange[1]);
						 getStream().add(oriNewChange[0],oriNewChange[1], 1.0, oriNewChange[1].getCosts());
					 }
					 undoers = new ArrayList<>();
					 for (Change<?> change: curSol.getSolution().getChanges()) {
						undoers.add(change.execute());
					 }
				 } else {
					 EvalResult res = state.getResult();
					 double curQuality = state.getQuality();
					 LocalSearchPartialSolution toAdd = curSol.getSolution().added(ch, curQuality, this.provider.getBaseFixes(res));
					 if (this.allSolutions.add(toAdd.getChanges())) {
						 this.curSolutions.add(new SolutionState(toAdd,null));
						 if (curQuality > curSol.getOriginalQuality()) {
							
							 
							 undoer.undo();
							 haveUndone = true;
							 for (int i = undoers.size()-1; i >= 0; --i) {
									undoers.get(i).undo();
							 }
							 Change<?>[] oriNewChange = buildOriginalResourceChange(curSol.getSolution().getChanges(),ch);
							 this.returnedSolutions.add(oriNewChange[1]);
							 getStream().add(oriNewChange[0],oriNewChange[1], curQuality, oriNewChange[1].getCosts());
							 undoers = new ArrayList<>();
							 for (Change<?> change: curSol.getSolution().getChanges()) {
								undoers.add(change.execute());
							 }
						 }
					 }
					 
				 }
				/* if (returnedSolutions.size() > 200) {
					 System.err.println("High number of solutions?!");
				 }*/
				 }finally {
					 if (!haveUndone) {
						 undoer.undo();
					 }
				 }
					if (!previouslyName) {
					
					 for (EObject obj:this.clonedRes.iterateAllContents()) {
							if (obj != null && (obj.eClass().getName().equals("Consumer") || obj.eClass().getName().equals("Computer")) ) {
								if (!acceptableNames.contains(obj.eGet(obj.eClass().getEStructuralFeature("name")))) {
									previouslyName = true;
								} 
							}
						 }
					}
				
			}
			
		
			} catch (Exception e)  {
				if (this.abort) {
					return false;
				}
				e.printStackTrace();
				StringWriter writer = new StringWriter();
				PrintWriter pw = new PrintWriter(writer);
				e.printStackTrace(pw);
				String op = writer.toString();
				System.out.println(op);
			} finally {			
				for (int i = undoers.size()-1; i >= 0; --i) {
					undoers.get(i).undo();
				}
			}
			if (!this.clonedRes.equals(MyResource.get(oldBase), new EcoreMapTransferFunction(this.clonedRes.getResource(),
					oldBase, newCopier))) {
				System.err.println("....");
			}
		}
			
		} catch (Exception e) {
			if (this.abort) {
				return false;
			}
			StringWriter writer = new StringWriter();
			PrintWriter pw = new PrintWriter(writer);
			e.printStackTrace(pw);
			String op = writer.toString();
			System.out.println(op);
		}
		
		}
		if (this.curSolutions.isEmpty()) {
			this.isFinished = true;
		}
		} catch (Exception e) {
			if (this.abort) {return false;}
			throw e;
		}
		return this.isFinished;
	}
	
	@Override
	public EObject getContext() {
		return this.context;
	}
	
	@Override
	public NeighborhoodProvider getNeighborhood() {
		return this.provider;
	}

	@Override
	public Evaluable<?,?> getOriginalEvaluable() {
		return this.orieval;
	}
	
	@Override
	public double getQuality() {
		return -this.processedChanges;
	}
	
	public List<Change<?>> getReturnedOrCheckSolutions() {
		if (this.checkSolutions.isEmpty()) {
			return this.returnedSolutions;
		}
		return this.checkSolutions;
	}
	
	public List<Change<?>> getReturnedSolutions() {
		return this.returnedSolutions;
	}
	
	@Override
	public SimpleStream<Change<?>> getStream() {
		return this.stream;
	}
	
	public void initResourceCopy(MyResource res, EObject context) {
		this.copier = new EcoreUtil.Copier();
		
		this.clonedResRes = res.clone(this.copier);
		this.clonedRes = MyResource.get(this.clonedResRes);
		this.context = this.copier.get(context);
		this.originalRes = new WeakReference<>(res);
		this.transferFunc = new EcoreMapTransferFunction(this.originalRes.get().getResource(),
				this.clonedRes.getResource(), this.copier);
	}

	@Override
	public synchronized void initSearch() {
		

		EvaluationState state = this.manager.basicEvaluate(this.clonedRes,getOriginalEvaluable(), getContext());
		Object ret = state.getBasicResult();
		//System.out.println("Evaluation of " + name+" was " + ret + " ("+getOriginalEvaluable()+")");
		if (!(ret instanceof Boolean) || !((Boolean)ret)) {
			double curQuality = state.getQuality();
			EvalResult res = state.getResult();
			FixAttemptReferenceInfo completeInfo = res.getCompleteReferenceInfo();
			LocalSearchPartialSolution initSol = new LocalSearchPartialSolution(new Stack<Change<?>>(), curQuality, this.provider.getBaseFixes(res));
			this.allSolutions.add(new ArrayList<>());
			this.curSolutions.add(new SolutionState(initSol, this.provider.getNeighbours(initSol).iterator()));
		}
			
	}

	@Override
	public void interrupt() {
		abortSearch();
	}

	@Override
	public boolean isFinished() {
		return this.isFinished;
	}
	
	@Override
	public boolean isObsolete(Resource curResource) {
		return this.abort || this.originalRes.get() == null || !this.originalRes.get().getResource().equals(curResource);
	}
	
	@Override
	public void run() {
		doSomeSearch();
	}
	@Override
	public void setNeighborhood(NeighborhoodProvider provider) {
		this.provider = provider;
	}
	public void setTime(long stepTimeMs, long totalTimeMs) {
		this.stepTime = stepTimeMs;
		this.totalTime = totalTimeMs;
	}
	
	public EcoreTransferFunction toOriginalResource() {
		return this.transferFunc.inverse();
	}
	
	public EcoreTransferFunction toThisResource() {
		return this.transferFunc;
	}

	@Override
	public void transfer(EcoreTransferFunction func) {
		this.context = func.forward(this.context);
	}


}
