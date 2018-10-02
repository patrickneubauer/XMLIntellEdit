package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Objects;

import at.ac.tuwien.big.vfunc.nbasic.constraint.OclDerivationEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.composite.CompositeChangeImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluableManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationCallback;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableManagerImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.MultiplicityEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.OCLExpressionEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.XmlDatatypeEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.ChangeSomethingImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.GlobalSearch;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.MyResourceContainer;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceInfo;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal.Source;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.ProposalList;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl.ProposalImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.NeighborhoodProvider;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.SimpleStream;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.LocalSearchInterfaceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ResourceEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.SearchTask;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.URIBasedEcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class DynamicValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator implements DynamicValidatorIFace{

	
	private static final long MIN_MS_BETWEEN_QUICKFIX_CALLS = 1000;
	
	public static final boolean PREFILTER_CHANGES = true;
	
	public static Map<String,DynamicValidator> validator = new HashMap<>();
	public static Map<String,ExpressionQuickfixInfo> storedQuickfixes 
		= new WeakHashMap<>();
	public static DynamicValidator getValidator(String id) {
		DynamicValidator ret = validator.get(id);
		if (ret != null) {
			return ret;
		}
		for (Entry<String,DynamicValidator> entr: validator.entrySet()) {
			if (entr.getKey().equals(id)) {
				return entr.getValue();
			}
		}
		return null;
	}
	
	public static boolean isBetterOrEqual(double[] thisResult, double[] thanThatResult) {
		if (-thisResult[0] > -thanThatResult[0]) { //local error remaining larger
			return false;
		}
		if (thisResult[1] > thanThatResult[1]) { //costs higher
			return false;
		}
		if (thisResult[2] < thanThatResult[2]) { //fixed constraints lower
			return false;
		}
		return true;
		//return thisResult[0] != thanThatResult[0] || thisResult[1] != thanThatResult[1] || thisResult[2] != thanThatResult[2];
	}

	public static<T> boolean isListWithMissing(Iterable<T> smaller, Iterable<T> larger) {
		Iterator<T> smallerIter = smaller.iterator();
		Iterator<T> largerIter = larger.iterator();
		mainLoop: while (smallerIter.hasNext()) {
			T next = smallerIter.next();
			while (largerIter.hasNext()) {
				if (Objects.equal(next, largerIter.next())) {
					continue mainLoop;
				}
			}
			return false;
		}
		return true;
	} 
	
	private WeakHashMap<Issue,Boolean> allIssues = new WeakHashMap<>();
	

	//public ExecutorService mainExecutor = Executors.newFixedThreadPool(1);
		
	private WeakHashMap<QuickfixReference,Boolean> displayedReferences = new WeakHashMap<>();
	

	private GlobalSearch search;
	
	private long lastQuickfixCall = 0;
	private boolean isFinished;
	public final PriorityQueue<SearchTask> searchTask = new PriorityQueue<>();
	
	private Resource curResource;
	
	private Resource mainResource;
	final Runnable taskRunnable = ()->{
		for(;;) {
			if (this.isFinished || Thread.currentThread().isInterrupted()) {
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
			if (!task.isFinished() && !task.isObsolete(this.curResource)) {
				task.run();
				pushTask(task);
			}
		}
	};
	
	Thread[] allThreads = new Thread[Math.max(Runtime.getRuntime().availableProcessors(),1)];
	
	{
		for (int i = 0; i < this.allThreads.length; ++i) {
			this.allThreads[i] = new Thread(this.taskRunnable);
			this.allThreads[i].setPriority(Thread.MIN_PRIORITY);
			this.allThreads[i].start();
		}
	}

	private ResourceEvaluator evaluator = ResourceEvaluator.DEFAULT;
	
	private String validatorId = UUID.randomUUID().toString();
	
	{
		validator.put(this.validatorId,this);
	}
	
	
	//Brauche Tracing FixAttempt//Object --> Change<?>
	
	private long uniqueId = 0;
	
	private WeakHashMap<Resource, Collection<Change<?>>[]> quickfixChanges = new WeakHashMap<>();
	
	private boolean fileCheck = false;
	private long advanceId;
	
	private List<Proposal<?, ?>> paretoFront = new ArrayList<>();


	private boolean haveChecked = false;
	
	private boolean haveSaved = false;

	private Object resetThreadObj = new Object();
	
	public Thread resetThread = new Thread(()->{
		for(;;) {

			try {
				synchronized(this.resetThreadObj) {
					this.resetThreadObj.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
		synchronized (this.paretoFront) {
			this.haveChecked = true;
			if (!this.haveSaved) {
				continue;
			}
			EObject theObj = this.mainResource.getContents().iterator().next();

					if (this.search == null && this.curResource != null) {
						this.search = new GlobalSearch(getResource(), this, new SimpleStream<Change<?>>() {
			
							@Override
							public Proposal<?, ?> add(Change<?> original, Change<?> processed, double[] evals) {
								if (DynamicValidator.this.search == null) {
									return null;
								}

								if (GlobalSearch.FILTER_GRAMMAR_ERROR && evals[ViolatedConstraintsEvaluator.GRAMMAR_ERRORS] > 0.0) {
									return null;
								}
								double curCosts = evals[1];
								double localErrorRemaining = -evals[0];
								double fixedConstraints = evals[2];
								MyResourceContainer cont = DynamicValidator.this.search.getContainer();
								//Check if it can be pareto-dominating
								List<Proposal<?, ?>> curList = new ArrayList<>();
								synchronized(DynamicValidator.this.paretoFront) {
									curList.addAll(DynamicValidator.this.paretoFront);
								}
								Evaluation wrapper = new Evaluation();
								for (Proposal<?, ?> curP: curList) {
									if (curP.getCosts() <= curCosts && (Double)curP.getQuality() >= -localErrorRemaining && curP.getCurQuality() >= fixedConstraints) {
										EcoreTransferFunction etf = cont.pullResource();
										if (!curP.getChange().forResource().equals(etf.backResource())) {
											curP.getChange().transfer(new URIBasedEcoreTransferFunction(curP.getChange().forResource(), etf.backResource()));
										}
										//-violated constraints currently, costs, resolved constraints, removed violations, removed fulfilled, added constraints, added fulfilled, invalidated constraints
										double[] costs = new ViolatedConstraintsEvaluator().evaluate(curP.getChange().transfered(etf), wrapper);
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
								

								double[] bestResult = optimize(processed,processed,wrapper,evals);
								if (bestResult != null) {
									curCosts = bestResult[1];
									localErrorRemaining = -bestResult[0];
									fixedConstraints = bestResult[2];
								}
								

								if (DynamicValidator.this.mainResource instanceof XtextResource && DynamicValidator.PREFILTER_CHANGES && !original.canBeQuickfixApplied(((XtextResource)DynamicValidator.this.mainResource).getSerializer())) {
									return null;
								}
								//It is in the pareto-set
								ProposalImpl ret = new ProposalImpl<>(Source.GENETIC,processed);
								
								ret.setCosts(curCosts);
								ret.setCurQuality(fixedConstraints);
								ret.setQuality(-localErrorRemaining);
								
								
		
								synchronized (DynamicValidator.this.paretoFront) {

									double curCostsf = curCosts;
									double localErrorRemainingf = localErrorRemaining;
									double fixedConstraintsf = fixedConstraints;
									DynamicValidator.this.paretoFront.removeIf((x)->(x.getCosts()>=curCostsf && x.getCurQuality() <= -localErrorRemainingf && (Double)x.getQuality() <= fixedConstraintsf));
									DynamicValidator.this.paretoFront.add(ret);
									notifySolutionFound();
								}
								
								
								return ret;
							}
						});
					}
				if (this.search != null) {
					this.search.setResource(this.curResource);
					this.search.changedSomething();
				}
				
	 		
			}
			
			} catch (Exception e22)  {
				e22.printStackTrace();
			}
			
		}
		}); 
	
	{
		this.resetThread.start();
	}
	
	public void abort() {
		this.isFinished = true;
		if (this.search != null) {
			this.search.abortSearch();
		}
		for (int i = 0; i < this.allThreads.length; ++i) {
			if (this.allThreads[i] !=  null && this.allThreads[i].isAlive()) {
				try {
					this.allThreads[i].interrupt();
				} catch (Exception e) {
					e.printStackTrace();
					System.err.println("Finalize exception " + e.getMessage());
				}
			}
		}
	}
	
	public synchronized long advanceId() {
		return ++this.advanceId;
	}
	
	@Check(CheckType.NORMAL)
	public synchronized void checkAllExpressions(EObject theRealObj) {
		
		long myIdU = this.uniqueId;
		if (theRealObj.eContainer() == null) {
			synchronized (this) {
				++this.uniqueId;
				myIdU = this.uniqueId; 
			}
			
		}
		long myId = myIdU;
		Resource xmiRes = theRealObj.eResource();
		if (xmiRes == null) {
			throw new RuntimeException("Validating object without resource!");
		}
		MyResource myresu = MyResource.get(this.curResource);
		if (this.mainResource != xmiRes /*|| theRealObj.eContainer() == null*/) {
			//TODO: Bei anderen Objekten ist das jetzt auch so ... eContainer() == null ist wohl ein schlechter Ratgeber
			this.mainResource = xmiRes;
			this.curResource = MyResource.get(xmiRes).clone();
			myresu = MyResource.get(this.curResource);
		}
		
		final MyResource myres = myresu;
		
		
		
		EvaluableManager evalMan = new EvaluableManagerImpl();
		
		

		String myFragment = xmiRes.getURIFragment(theRealObj);
		
		URIBasedEcoreTransferFunction utf = new URIBasedEcoreTransferFunction(xmiRes, this.curResource);
		
		EObject theObj = utf.forward(theRealObj);
		
		try {
		
		evalMan.performTypicalEvaluation(myres, theObj, new EvaluationCallback() {

			@Override
			public void callbackFailure(Evaluable evaluable, EvaluationState state, Object result,
					EvalResult topResult) {
				
				String exprId = myres.getEvaluableId(evaluable);
				
				String evalIdBase = myFragment+"%EXPR%"+exprId;
				
				ExpressionQuickfixInfo oldInfo = getQuickfixes(evalIdBase);
				ExpressionQuickfixInfo curInfo = getQuickfixes(evalIdBase);
				//TODO: Lösche Quickfixes wenn sinnvoll bzw. übertrage sie
				
				
				FixAttemptReferenceInfo compeleteInfo = topResult.getCompleteReferenceInfo();
				Collection<FixAttemptReference> references = compeleteInfo.getFixAttemptReferences();
				if (references.isEmpty()) {
					FixAttemptReference temp = new FixAttemptReferenceImpl(theObj,true);
					references = Collections.singleton(temp);
					compeleteInfo.addFixAttemptReference(temp, new EvaluableReferenceImpl(evaluable), new ChangeSomethingImpl());
				}
				
				String issueDescrBase = "Constraint " +exprId + " invalid!\n" ;
				if (evaluable instanceof MultiplicityEvaluable) {
					MultiplicityEvaluable me = (MultiplicityEvaluable)evaluable;
					issueDescrBase = "Multiplicity of " + me.getFeature()+" must be "+me.getBoundStr();
				} else if (evaluable instanceof XmlDatatypeEvaluable) {
					XmlDatatypeEvaluable me = (XmlDatatypeEvaluable)evaluable;
					issueDescrBase = "Attribute must have XML datatype " + me.getDatatype();
				} else if (evaluable instanceof OCLExpressionEvaluable) {
					OCLExpressionEvaluable oe = (OCLExpressionEvaluable)evaluable;
					String message = oe.evaluateMessage(theObj);
					if (message != null) {
						issueDescrBase = message+"\n";
					} 
				} else if (evaluable instanceof OclDerivationEvaluable) {
					OclDerivationEvaluable oe = (OclDerivationEvaluable)evaluable;
					String message = oe.evaluateMessage(theObj);
					if (message != null) {
						issueDescrBase = message+"\n";
					}
				}
				String otherIssueDesc = "";
				Map<FixAttemptReference,String> refToId = new HashMap<>();
				Map<String,FixAttemptReference> idToRef = new HashMap<>();
				int idVal = 0;
				for (FixAttemptReference ref: references) {
					StringBuilder issueDescr = new StringBuilder();
					issueDescr.append(issueDescrBase);
					for (Entry<FixAttempt,Set<EvaluableReference<?>>> attempt: compeleteInfo.getAssociatedAttempts(ref).entrySet()) {
						issueDescr.append(attempt.getKey()+" (Expression "+attempt.getValue()+")\n");
					}
					String idStr = (myId)+"_"+(++idVal);
					refToId.put(ref,idStr);
					idToRef.put(idStr,ref);
					EObject obj = ref.forObject();
					URIBasedEcoreTransferFunction utf = new URIBasedEcoreTransferFunction(DynamicValidator.this.curResource, DynamicValidator.this.mainResource);
					EObject displayForObject = utf.forward(obj);
					if (!DynamicValidator.this.fileCheck) {
						if (obj != null && obj.eResource() != theObj.eResource()) {
							if (!otherIssueDesc.isEmpty()) {
								otherIssueDesc = otherIssueDesc+", ";
							} 
							otherIssueDesc += "Obj " + obj+": "+issueDescr;
						} else {
							if (ref instanceof FixAttemptFeatureReference) {
								FixAttemptFeatureReference fref = (FixAttemptFeatureReference)ref;
								error(issueDescr.toString(), displayForObject, fref.getFeature(), fref.getValueIndex(), "DYNISSUE_ANY_"+evalIdBase+idStr, DynamicValidator.this.validatorId,
										evalIdBase,idStr);
							} else {
								boolean ok = false;
								EAttribute idAttr = null;
								if (!ref.isCompleteObject()) {
									idAttr = displayForObject.eClass().getEIDAttribute();
									if (idAttr == null)  {
										EStructuralFeature esf = displayForObject.eClass().getEStructuralFeature("name");
										if (esf instanceof EAttribute) {
											idAttr = (EAttribute)esf;
										}
									}
								}
								if (idAttr != null) {
									Collection col = MyEcoreUtil.getAsCollection(displayForObject, idAttr);
									if (!col.isEmpty()) {
										ok = true;
										error(issueDescr.toString(), displayForObject, idAttr, -1, "DYNISSUE_ANY_"+evalIdBase+idStr, DynamicValidator.this.validatorId,
												evalIdBase,idStr);
									}
								}
								if (!ok) {
									error(issueDescr.toString(), displayForObject, null, -1, "DYNISSUE_ANY_"+evalIdBase+idStr, DynamicValidator.this.validatorId,
										evalIdBase,idStr);
								}
							}
						}
					}
				}
				if (!DynamicValidator.this.fileCheck) {
					if (!otherIssueDesc.isEmpty()) {
						error("Other file issues: " + otherIssueDesc, theObj, null, -1, "DYNISSUE_ANY_"+DynamicValidator.this.uniqueId,DynamicValidator.this.validatorId,evalIdBase,"");
					}
				}
				
				
				double originalQuality = state.getQuality();
				
				final SimpleStream<Change<?>>  stream = SimpleStream.getStream((oc,nc,evals)
						->{
							//Evaluate old change - this is applied already in this moment!
							Resource[] store = new Resource[1];
							EcoreTransferFunction cf = oc.forMyResource().cloneFunc(store);
							double[] changeEvals = DynamicValidator.this.evaluator.evaluate(oc, new Evaluation());
							if (!oc.forMyResource().equalsTarget(cf)) {
								System.err.println("Error in my change!");
							}
							double changeEval = changeEvals[0];
							double resolved = changeEvals[2];
							double costs = changeEvals[1];
							if (GlobalSearch.FILTER_GRAMMAR_ERROR && changeEvals[ViolatedConstraintsEvaluator.GRAMMAR_ERRORS] > 0.0) {
								return null;
							}
							if (changeEval <= 0.0 && resolved <= 0.0) {
								//Don't do anything if it doesn't improve anything
								return null;
							}
							
							if (DynamicValidator.this.mainResource instanceof XtextResource) {
								XtextResource xres = (XtextResource)DynamicValidator.this.mainResource;
								oc.testSerialize(xres.getSerializer(), xres.getParser());
							}
							
							if (DynamicValidator.this.mainResource instanceof XtextResource && DynamicValidator.PREFILTER_CHANGES && !oc.canBeQuickfixApplied(((XtextResource)DynamicValidator.this.mainResource).getSerializer())) {
								return null;
							}
							
							//TODO: ...
							
							Map<FixAttemptReference, String> bpMap = refToId;
							/*if (uniqueÍd - 5 > myId) {
								oldInfo.clear(); //TOOD: ...
							}*/
							boolean addBasicId = true;
							Collection<Change<?>>[] curChange = DynamicValidator.this.quickfixChanges.get(DynamicValidator.this.curResource);
							if (curChange == null) {
								DynamicValidator.this.quickfixChanges.put(DynamicValidator.this.curResource, curChange = new Collection[]{new HashSet<Change<?>>(), new ArrayList<Change<?>>()});
							}
						
									
							
							if (curChange[0].add(nc)) {
								curChange[1].add(nc);
							}

							Proposal<Double,?> prop = new ProposalImpl<>(Source.LOCAL,nc);
							prop.setCurQuality(resolved);
							prop.setQuality(changeEval);
							prop.setCosts(costs);
							List<Proposal> removeProposals = new ArrayList<>();
							List<BasicChange<?>> myChanges = nc.getReducedBasicChanges();
							//Check if this is unnecessary
							Set<String> attemptIds = new HashSet<>();
							for (FixAttemptReference ref: nc.getFixReferences()) {
								String id = refToId.get(ref);
								if (id != null) {
									attemptIds.add(id);
								}
							}
							Set<String> lookIds = new HashSet<>(attemptIds);
							lookIds.add("");
							for (String id: lookIds) {
								ProposalList<Double, ? extends Proposal<?,?>> list = curInfo.getChanges(id);
								for (Proposal<Double,?> p: list.getProposals()) {
									if (p.getCurQuality() >= prop.getCurQuality() && p.getQuality() >= prop.getQuality())  {
										List<BasicChange<?>> otherChanges = p.getBasicChanges();
										//this is candidate for removal
										if (otherChanges.size() <= myChanges.size()) {
											if (isListWithMissing(otherChanges, myChanges)) {
												return null;
											}
										}
									}
									if (p.getCurQuality() <= prop.getCurQuality() && p.getQuality() <= prop.getQuality()) {
										List<BasicChange<?>> otherChanges = p.getBasicChanges();
										//other is candidate for removal
										if (otherChanges.size() >= myChanges.size()) {
											if (isListWithMissing(myChanges, otherChanges)) {
												removeProposals.add(p);
											}
										}
									}
								}
							}
							for (Proposal p: removeProposals) {
								curInfo.removeProposal(p);
							}
							
							if (attemptIds.isEmpty()) {
								nc.getFixReferences();
								attemptIds.add("");
							}
							for (String id: attemptIds) {
								addBasicId = false;
								curInfo.addChange(id, prop);
							}
							String str = prop.getChange()+" with costs "+prop.getCosts()+" and quality "+prop.getQuality()+"/"+prop.getCurQuality();
							System.out.println(str);
							notifySolutionFound();
							return prop;
						});
				

					try {
						LocalSearchInterfaceImpl directFix = LocalSearchInterfaceImpl.create(myres,
								exprId,
								evaluable, theObj, stream, NeighborhoodProvider.DEFAULT_DIRECTFIX, originalQuality
									);
						LocalSearchInterfaceImpl localSearch = LocalSearchInterfaceImpl.create(myres,
								exprId,
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

			@Override
			public void callbackSuccess(Evaluable evaluable, EvaluationState state, Object result) {}

		});
		} catch (Exception e) {
			String str = Arrays.toString(e.getStackTrace()).replace(",","\n");
			System.err.println(str);
		}
		this.haveSaved = true;
	}
	public synchronized void checkFile(Resource res) {
		boolean oldFileCheck = this.fileCheck;
		this.fileCheck = true;
		this.mainResource = res;
		this.curResource = MyResource.get(res).clone();
		for (EObject eobj: (Iterable<EObject>)()->res.getAllContents()) {
			if (eobj == null || eobj.eClass() == null) {continue;}
			checkAllExpressions(eobj);
		}
		this.fileCheck = oldFileCheck;
	}
	public ExpressionQuickfixInfo createQuickfixes(String string) {
		ExpressionQuickfixInfo ret;
				
		ExpressionQuickfixInfo old = 
				storedQuickfixes.put(string, ret = new ExpressionQuickfixInfo(this,string));
		/*if (old != null) {
			old.clear();
		}*/
		return ret;
	}
	
	public Map<QuickfixReference,Boolean> displayedReferences() {
		return this.displayedReferences;
	}
	
	@Override
	public void finalize() throws Throwable {			
		try {
			abort();
		} catch (Exception e) {
			
		}
		try {
			super.finalize();
		} catch (Exception e) {
			
		}
	}
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://router/1.0"));
	    IMarker marker;
		return result;
	}
	
	@Override
	public Resource getMainResource() {
		return this.mainResource;
	}
	
	public ExpressionQuickfixInfo getQuickfixes(String string) {
		ExpressionQuickfixInfo ret = storedQuickfixes.get(string);
		if (ret == null) {
			storedQuickfixes.put(string, ret = new ExpressionQuickfixInfo(this,string));
		}
		return ret;
	}
	@Override
	public MyResource getResource() {
		return MyResource.get(this.curResource);
	}
	
	public boolean knowIssue(Issue issue) {
		if (/*allIssues.put(issue,true) != null ||*/ new Date().getTime() > this.lastQuickfixCall + MIN_MS_BETWEEN_QUICKFIX_CALLS) {
			this.allIssues.clear();
			this.allIssues.put(issue,true);
			this.displayedReferences.clear();
			this.lastQuickfixCall = new Date().getTime();
			return true;
		}
		return false;
	}
	
	public void notifySolutionFound() {
		System.out.println("Quickfixes should be refreshed!");
		/*if (mainResource instanceof XtextResource)  {
			XtextResource xr = (XtextResource)mainResource;
			xr.getResourceServiceProvider().getResourceValidator().validate(xr, CheckMode.FAST_ONLY, CancelIndicator.NullImpl);
		}*/

	}
	
    
	
	public double[] optimize(Change<?> eval, Change<?> ch, Evaluation wrapper, double[] initResult) {
		if (ch instanceof CompositeChangeImpl) {
			CompositeChangeImpl cci = (CompositeChangeImpl)ch;
			List<Change<?>> subChanges = cci.unbox();
			List<Change<?>> original = new ArrayList<>(subChanges);
			double[] bestResult = initResult;
			boolean improved = false;
			boolean anyImproved = false;
			do {
				improved = false;
				for (int i = 0; i < subChanges.size(); ++i) {
					Change<?> removed = subChanges.remove(i);
					double[] curResult = new ViolatedConstraintsEvaluator().evaluate(eval, wrapper);
					if (isBetterOrEqual(curResult, bestResult)) {
						bestResult = curResult;
						improved = true;
						continue;
					}
					subChanges.add(i,removed);
				}
				for (int i = 0; i < subChanges.size(); ++i) {
					double[] subResult = optimize(eval,subChanges.get(i),wrapper,bestResult);
					if (subResult != null) {
						improved = true;
						bestResult = subResult;
					} 
				}
				anyImproved|= improved;
			} while(improved);
			if (anyImproved) {
				String improvement = ("Improved "+original+ " to "+subChanges);
				System.out.println(improvement);
			}
			return anyImproved?bestResult:null;
		}
		return null;
	}

	public synchronized SearchTask pollTask() {
		if (this.searchTask.isEmpty()) {
			return null;
		}
		SearchTask ret = this.searchTask.poll();
		return ret;
	}
	
	public synchronized void pushTask(SearchTask task) {
		this.searchTask.add(task);
		for (int i = 0; i < this.allThreads.length; ++i) {
			synchronized(this.allThreads[i]) {
				this.allThreads[i].notify();
			}
		}
	}
	
	@Override
	public ChangeType<?,?> randomChange(Random random) {
		return MyResource.get(this.curResource).randomChange(random);
	}
	
	@Override
	public Change<?> randomQuickfix(Random random) {
		Collection<Change<?>>[] col = this.quickfixChanges.get(this.curResource);
		if (col != null && !col[1].isEmpty()) {
			return ((List<Change<?>>)col[1]).get(random.nextInt(col[1].size()));
		}
		return null;
	}

	@Override
	public void register(EValidatorRegistrar registrar) {
		// Do nothing to prevent registration and duplicate validation messages
		super.register(registrar);
	}

	@Check(CheckType.FAST)
	public void resetGenetic(EObject theObj) {

		if (theObj.eContainer() == null) {
			if (theObj != null && theObj.eResource() != null) {
				this.curResource = MyResource.get(theObj.eResource()).clone();
				this.mainResource = theObj.eResource();
			}
			try {
				List<Proposal<?, ?>> curList = new ArrayList<>();
				synchronized(this.paretoFront) {
					curList.addAll(this.paretoFront);
				}
				String idStr = "GENETIC_"+advanceId();
				ExpressionQuickfixInfo quickfixes = getQuickfixes(idStr);
				
				
				
				Evaluation wrapper = new Evaluation();
				for (Proposal<?, ?> curP: curList) {
					
					
					EcoreTransferFunction etf = this.search.getContainer().pullResource();
					if (!curP.getChange().forResource().equals(etf.backResource())) {
						EcoreTransferFunction trf = new URIBasedEcoreTransferFunction(curP.getChange().forResource(), etf.backResource());
						curP.getChange().transfer(trf);
					}
					
					//-violated constraints currently, costs, resolved constraints, removed violations, removed fulfilled, added constraints, added fulfilled, invalidated constraints
					curP.getChange().checkChange();
					Change<?> transfered = curP.getChange().transfered(etf);
					double[] costs = new ViolatedConstraintsEvaluator().evaluate(transfered, wrapper);
				
					this.search.getContainer().pushResource(etf);
					curP.setCurQuality(costs[2]);
					((Proposal<Double,?>)curP).setQuality(costs[0]);
					curP.setCosts(costs[1]);
				}
				
				curList.removeIf((x)->x.getCurQuality()<= 0);
				synchronized (this.paretoFront) {
					this.paretoFront.removeIf((x)->x.getCurQuality()<= 0);
				}
				
			
				int ind = 0;
				for (Proposal<?, ?> curP: curList) {
					EcoreTransferFunction trf = new URIBasedEcoreTransferFunction(curP.getChange().forResource(), this.curResource);
					if (!curP.getChange().forResource().equals(this.curResource)) {
						
						curP.getChange().transfer(trf);
					}
					String indexStr = ""+ind;
					quickfixes.addChange(indexStr, curP);
					boolean addBasicId = true;
					
					
					for (FixAttemptReference ref: curP.getChange().getFixReferences()) {
						EObject eobj = ref.forObject();
						if (eobj == null) {continue;}
						URIBasedEcoreTransferFunction utf = new URIBasedEcoreTransferFunction(eobj.eResource(), this.mainResource);
						EObject displayForObj = utf.forward(eobj);
						if (ref instanceof FixAttemptFeatureReference) {
							FixAttemptFeatureReference fref = (FixAttemptFeatureReference)ref;
							info("Possible improvement: "+-curP.getCurQuality()+" Constraints violated, "+curP.getCosts()+" costs",
									displayForObj,fref.getFeature(),fref.getValueIndex(),"DYNISSUE_ANY_GENETIC_"+indexStr,this.validatorId,idStr,indexStr);
						} else {
							info("Possible improvement: "+-curP.getCurQuality()+" Constraints violated, "+curP.getCosts()+" costs",
									displayForObj,null,"DYNISSUE_ANY_GENETIC_"+indexStr,this.validatorId,idStr,indexStr);
						}
					}
					++ind;
				}
				synchronized (this.resetThreadObj) {
					this.resetThreadObj.notify();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		
	
	}

	public void setFileCheck(boolean fileCheck) {
		this.fileCheck = fileCheck	;
	}
	
}
