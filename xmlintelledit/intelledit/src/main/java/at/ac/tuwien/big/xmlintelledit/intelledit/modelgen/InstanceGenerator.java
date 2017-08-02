package at.ac.tuwien.big.xmlintelledit.intelledit.modelgen;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluableManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationCallback;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableManagerImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.GlobalSearch;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.MyResourceContainer;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal.Source;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl.ProposalImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.NeighborhoodProvider;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.SimpleStream;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.LocalSearchInterfaceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.SearchTask;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.URIBasedEcoreTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicValidatorIFace;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.ExpressionQuickfixInfo;

public class InstanceGenerator implements DynamicValidatorIFace {

	private ViolatedConstraintsEvaluator evaluator = new ViolatedConstraintsEvaluator();
	
	private PriorityBlockingQueue<Proposal> proposals = new PriorityBlockingQueue<Proposal>(
			100, new Comparator<Proposal>() {

				@Override
				public int compare(Proposal o1, Proposal o2) {
					int ret = -Double.compare(o1.getCurQuality(), o2.getCurQuality());
					if (ret == 0) {
						ret = -o1.getQuality().compareTo(o2.getQuality());
					}
					if (ret == 0) {
						ret = Double.compare(o1.getCosts(), o2.getCosts());
					}
					return ret;
				}
			});
	
	private double curQuality;
	
	public Proposal getBestProposal() {
		while (!proposals.isEmpty()) {
			Proposal ret = proposals.poll();
			if ((Double)ret.getQuality() > curQuality && ret.getCurQuality() > 0.0) {
				return ret;
			}
		}
		return null;
	}
	
	public void applyBestProposal() {
		Proposal best = getBestProposal();
		if (best != null) {
			System.out.println("Apply " + best);
			best.getChange().execute();
		} else {
			System.out.println("No proposal has been found!");
		}
	}
	
	public InstanceGenerator(Resource curResource) {
		this.curResource = curResource;
	}
	
	public void checkResource() {
		ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
		double[] dv = eval.evaluate(Change.empty(curResource), new Evaluation());
		curQuality = dv[0];
		System.out.println("Quality now: "+curQuality);
		search.changedSomething();
		for (EObject eobj: (Iterable<EObject>)()->curResource.getAllContents()) {
			checkObject(eobj);
		}
		
	}
	
	public MyResource getResource() {
		return MyResource.get(curResource);
	}
	
	public Resource getMainResource() {
		return curResource;
	}
	
	private GlobalSearch search;
	
	public void initGenetic() {
		search = new GlobalSearch(getResource(), this, new SimpleStream<Change<?>>() {
			
			@Override
			public Proposal<?, ?> add(Change<?> original, Change<?> processed, double[] evals) {
				if (search == null) {
					return null;
				}
				double curCosts = evals[1];
				double localErrorRemaining = -evals[0];
				if (localErrorRemaining < 0) {
					System.err.println();
				}
				if (GlobalSearch.FILTER_GRAMMAR_ERROR && evals[ViolatedConstraintsEvaluator.GRAMMAR_ERRORS] > 0.0) {
					return null;
				}
				double fixedConstraints = evals[2];
				MyResourceContainer cont = search.getContainer();
				//Check if it can be pareto-dominating
				List<Proposal<?, ?>> curList = new ArrayList<Proposal<?,?>>();
				Evaluation wrapper = new Evaluation();
				for (Proposal<?, ?> curP: curList) {
					if (curP.getCosts() <= curCosts && (Double)curP.getQuality() >= -localErrorRemaining && curP.getCurQuality() >= fixedConstraints) {
						if (!curP.getChange().forResource().equals(curResource)) {
							curP.getChange().transfer(new URIBasedEcoreTransferFunction(curP.getChange().forResource(), curResource));
						}
						EcoreTransferFunction etf = cont.pullResource();
						//-violated constraints currently, costs, resolved constraints, removed violations, removed fulfilled, added constraints, added fulfilled, invalidated constraints
						double[] costs = new ViolatedConstraintsEvaluator().evaluate(curP.getChange().transfered(etf), wrapper);
						if (costs[0] > 0) {
							System.err.println("??");
							costs = new ViolatedConstraintsEvaluator().evaluate(curP.getChange().transfered(etf), wrapper);
						}
						if (GlobalSearch.FILTER_GRAMMAR_ERROR && costs[ViolatedConstraintsEvaluator.GRAMMAR_ERRORS] > 0.0) {
							continue;
						}
						cont.pushResource(etf);
						curP.setCurQuality(costs[2]);
						((Proposal<Double,?>)curP).setQuality(costs[0]);
						curP.setCosts(costs[1]);
						if (curP.getCosts() <= curCosts && (Double)curP.getQuality() >= -localErrorRemaining && curP.getCurQuality() >= fixedConstraints) {
							return null;
						}
					}
				}
				//It is in the pareto-set
				ProposalImpl ret = new ProposalImpl<>(Source.LOCAL,processed);
				
				ret.setCosts(curCosts);
				ret.setCurQuality(fixedConstraints);
				ret.setQuality(-localErrorRemaining);			
				synchronized (this) {
					if (proposedQuickfixesSet.add(ret.getChange())) {
						proposedQuickfixes.add(ret.getChange());
						proposals.add(ret);
						if (proposals.size() > 500) {
							PriorityBlockingQueue<Proposal> oldProp = proposals;
							proposals = new PriorityBlockingQueue<Proposal>();
							for (int i = 0; i < 250; ++i) {
								proposals.add(oldProp.poll());
							}
						}
					}
				}
				
				return ret;
			}
		});
		if (search != null) {
			search.setResource(getResource().getResource());
			search.changedSomething();
		}
	}
	
	public void doRun(long stepMs, long totalMs) {
		long startTime = new Date().getTime();
		long totalEndTime = startTime+totalMs;
		long endTime = startTime;
		initGenetic();
		for(;;) {
			endTime+= stepMs;
			endTime = Math.min(totalEndTime,endTime);
			if (endTime < new Date().getTime()) {
				break;
			}
			synchronized(InstanceGenerator.this) {
				proposals.clear();
				proposedQuickfixes.clear();
				proposedQuickfixesSet.clear();
				searchTask.clear();
			}
			checkResource();
			try {
				long sleepTime = endTime-new Date().getTime();
				if (sleepTime <= 0) {
					break;
				}
				Thread.sleep(sleepTime);
				applyBestProposal();
			} catch (InterruptedException e) {
			}
		}
		abort();
	}

	private boolean isFinished;

	public final PriorityQueue<SearchTask> searchTask = new PriorityQueue<SearchTask>();
	private Resource curResource;
	
	final Runnable taskRunnable = ()->{
		for(;;) {
			if (isFinished || Thread.currentThread().isInterrupted()) {
				return;
			}
			SearchTask task = pollTask();
			while (task == null) {
				try {
					synchronized(Thread.currentThread()) {
						Thread.currentThread().wait();
					}
				} catch (InterruptedException e) {
					return;
				}
				task = pollTask();
			}
			if (!task.isFinished() && !task.isObsolete(curResource)) {
				task.run();
				pushTask(task);
			}
		}
	};
	
	Thread[] allThreads = new Thread[Runtime.getRuntime().availableProcessors()];
	{
		for (int i = 0; i < allThreads.length; ++i) {
			allThreads[i] = new Thread(taskRunnable);
			allThreads[i].start();
		}
	}
	
	public synchronized SearchTask pollTask() {
		if (searchTask.isEmpty()) {
			return null;
		}
		SearchTask ret = searchTask.poll();
		return ret;
	}
	
	public synchronized void pushTask(SearchTask task) {
		searchTask.add(task);
		for (int i = 0; i < allThreads.length; ++i) {
			synchronized(allThreads[i]) {
				allThreads[i].notify();
			}
		}
	}
	
	

	public static Map<String,ExpressionQuickfixInfo> storedQuickfixes 
		= new HashMap<String, ExpressionQuickfixInfo>();


	public ExpressionQuickfixInfo getQuickfixes(String string) {
		ExpressionQuickfixInfo ret = storedQuickfixes.get(string);
		if (ret == null) {
			storedQuickfixes.put(string, ret = new ExpressionQuickfixInfo(this,string));
		}
		return ret;
	}
	

	public void checkObject(EObject theObj) {
		MyResource myres = MyResource.get(theObj.eResource());
		EvaluableManager evalMan = new EvaluableManagerImpl();
		


		Resource xmiRes = theObj.eResource();
		String myFragment = xmiRes.getURIFragment(theObj);
		
		
		evalMan.performTypicalEvaluation(myres, theObj, new EvaluationCallback() {

		@Override
		public void callbackSuccess(Evaluable evaluable, EvaluationState state, Object result) {}

		@Override
		public void callbackFailure(Evaluable evaluable, EvaluationState state, Object result,
				EvalResult topResult) {
			
			//TODO: Lösche Quickfixes wenn sinnvoll bzw. übertrage sie
			String exprId = myres.getEvaluableId(evaluable);
			
			String evalIdBase = myFragment+"%EXPR%"+exprId;
			
			ExpressionQuickfixInfo curInfo = getQuickfixes(evalIdBase);
			

			double originalQuality = state.getQuality();
			
			final SimpleStream<Change<?>>  stream = SimpleStream.getStream((oc,nc,evals)
					->{
						//Evaluate old change - this is applied already in this moment!
						double[] changeEvals = evaluator.evaluate(oc, new Evaluation());
						double changeEval = changeEvals[0];
						double resolved = changeEvals[2];
						double costs = changeEvals[1];
						if (GlobalSearch.FILTER_GRAMMAR_ERROR && changeEvals[ViolatedConstraintsEvaluator.GRAMMAR_ERRORS] > 0.0) {
							return null;
						}
						//TODO: ...
					
						/*if (uniqueÍd - 5 > myId) {
							oldInfo.clear(); //TOOD: ...
						}*/
						boolean addBasicId = true;

						Proposal<Double,?> prop = new ProposalImpl<>(Source.LOCAL,nc);
						prop.setCurQuality(resolved);
						prop.setQuality(changeEval);
						prop.setCosts(costs);
						
						synchronized(InstanceGenerator.this){
							if (proposedQuickfixesSet.add(prop.getChange())) {
								proposedQuickfixes.add(prop.getChange());
								proposals.add(prop);
								if (proposals.size() > 500) {
									PriorityBlockingQueue<Proposal> oldProp = proposals;
									proposals = new PriorityBlockingQueue<Proposal>();
									for (int i = 0; i < 250; ++i) {
										Proposal aprop = oldProp.poll();
										if (aprop != null) {
											proposals.add(aprop);
										}
									}
								}
							}
						}
						return prop;
					});
			

				try {
					LocalSearchInterfaceImpl directFix = LocalSearchInterfaceImpl.create(myres,
							"",
							evaluable, theObj, stream, NeighborhoodProvider.DEFAULT_DIRECTFIX, originalQuality
								);
					LocalSearchInterfaceImpl localSearch = LocalSearchInterfaceImpl.create(myres,
							"",
							evaluable, theObj, stream, NeighborhoodProvider.DEFAULT_LOCALSEARCH, originalQuality
									);
					directFix.initSearch();
					localSearch.initSearch();
					//Check old solutions and transfer
					curInfo.resetOrReeinit(myres.getResource(), directFix, localSearch);
					pushTask(directFix);
					pushTask(localSearch);
				} catch (Exception e) {
					e.printStackTrace();
					StringWriter writer = new StringWriter();
					PrintWriter pw = new PrintWriter(writer);
					e.printStackTrace(pw);
					String op = writer.toString();
					System.out.println(op);
				}
		}

	});
}


	public void abort() {
		isFinished = true;
		if (search != null) {
			search.abortSearch();
		}
		for (int i = 0; i < allThreads.length; ++i) {
			if (allThreads[i] !=  null && allThreads[i].isAlive()) {
				try {
					allThreads[i].interrupt();
				} catch (Exception e) {
					e.printStackTrace();
					System.err.println("Finalize exception " + e.getMessage());
				}
			}
		}
	}
	
	public List<Change<?>> proposedQuickfixes = new ArrayList<Change<?>>();
	public Set<Change<?>> proposedQuickfixesSet = new HashSet<Change<?>>();

	@Override
	public Change<?> randomQuickfix(Random random) {
		if (proposedQuickfixes.isEmpty()) {
			return Change.empty(getResource().getResource());
		} else {
			return proposedQuickfixes.get(random.nextInt(proposedQuickfixes.size()));
		}
	}

	@Override
	public ChangeType<?,?> randomChange(Random random) {
		return MyResource.get(curResource).randomChange(random);
	}

	
}
