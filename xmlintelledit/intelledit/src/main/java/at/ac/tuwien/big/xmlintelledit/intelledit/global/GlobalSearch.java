package at.ac.tuwien.big.xmlintelledit.intelledit.global;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.Stack;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.moeaframework.Executor;
import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.Variation;
import org.moeaframework.core.spi.OperatorFactory;
import org.moeaframework.core.spi.OperatorProvider;
import org.moeaframework.problem.AbstractProblem;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.composite.CompositeChangeImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.SimpleStream;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.URIBasedEcoreTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicValidatorIFace;

public class GlobalSearch {
	
	public static final boolean FILTER_GRAMMAR_ERROR = true;
	
	private DynamicValidatorIFace valid;
	private SimpleStream<Change<?>> stream;
	private Resource resource;
	
	static {
		OperatorFactory opfact = OperatorFactory.getInstance();
		opfact.addProvider(new OperatorProvider() {
			
			@Override
			public String getVariationHint(Problem problem) {
				return "variatechange";
			}
			
			@Override
			public Variation getVariation(String name, Properties properties, Problem problem) {
				if ("variatechange".equals(name)) {
				return new Variation() {
					
					private Random random = new Random();
					
					@Override
					public int getArity() {
						return 2;
					}
					
					@Override
					public Solution[] evolve(Solution[] parents) {
						Solution first = parents[0];
						Solution second = parents[1];
						int border = random.nextInt(Math.min(first.getNumberOfVariables(),second.getNumberOfVariables()));
						
						Solution[] ret = new Solution[2];
						ret[0] = new Solution(first.getNumberOfVariables(), first.getNumberOfObjectives());
						ret[1] = new Solution(second.getNumberOfVariables(), first.getNumberOfObjectives());
						for (int i = 0; i < border; ++i) {
							ret[1].setVariable(i, first.getVariable(i).copy());
							ret[0].setVariable(i, second.getVariable(i).copy());
						}
						for (int i = border; i < first.getNumberOfVariables(); ++i) {
							ret[0].setVariable(i, first.getVariable(i).copy());
							ret[1].setVariable(i, second.getVariable(i).copy());
						}
						return ret;
					}
				};
				} else if ("mutatechange".equals(name)) {
					return new Variation() {
						
						private Random random = new Random();
						
						@Override
						public int getArity() {
							return 1;
						}
						
						@Override
						public Solution[] evolve(Solution[] parents) {
							Solution first = parents[0];					
							try {
								int randInd = random.nextInt(first.getNumberOfVariables());
								MyResourceContainer container = (MyResourceContainer)first.getAttribute("container");
								EcoreTransferFunction tf = container.pullResource();
								Stack<Undoer> undos = new Stack<Undoer>();
								for (int i = 0; i < randInd; ++i) {
									MOEAChangeVariable var = (MOEAChangeVariable)first.getVariable(randInd);
									if (var == null || var.getCurChange() == null) {continue;}
									undos.push(var.getCurChange().transfered(tf).execute());
								}
								((MOEAChangeVariable)first.getVariable(randInd)).randomChange(tf);
								while (!undos.isEmpty()) {
									undos.pop().undo();
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
							return parents;
						}
					};
				}
				return null;
			}
			
			@Override
			public String getMutationHint(Problem problem) {
				return "mutatechange";
			}
		});
	}
	
	public GlobalSearch(MyResource resource, DynamicValidatorIFace valid, SimpleStream<Change<?>> stream) {
		
		this.valid = valid;
		this.stream = stream;
		setResource(resource.getResource());
	}
	
	public Resource getResource() {
		return resource;
	}
	
	private MyResourceContainer container;
	
	private Resource clone;
	private Copier copier;
	
	public MyResourceContainer getContainer() {
		return container;
	}
	
	public void setResource(Resource res) {
		try {
		/*if (resource != null && resource.equals(res)) {
			return;
		}*/
		if (this.clone != null) {
			if (MyResource.get(res).equalsRes(MyResource.get(clone))) {
				if (res == this.resource) {
					return;
				}
			}
		}
		this.copier = new Copier();
		this.clone = MyResource.get(res).clone(copier);
		this.resource = res;
		this.container = new MyResourceContainer(res);
		if (t == null || t.isInterrupted() || !t.isAlive()) {
			startSearch();
		}
		} catch (Exception e) {
			String str = Arrays.toString(e.getStackTrace());
			System.out.println(str);
		}
	}
	
	public void changedSomething() {
		if (resource != null) {
			container = new MyResourceContainer(MyResource.get(resource).clone());
		}
	}
	
	private Thread t;

	public void startSearch() {
		new Thread(()->{
			abortSearch();
			synchronized(GlobalSearch.this) {
				while (t != null && t.isAlive()) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				aborted = false;		
				t = new Thread(()->{
				Problem problem = new AbstractProblem(20,3) {			
					
					@Override
					public void close() {
						
						super.close();
					}
					
					@Override
					public Solution newSolution() {
						try {
							Solution sol = new Solution(getNumberOfVariables(), getNumberOfObjectives());
							sol.setAttribute("container", container);
							for (int i = 0; i < getNumberOfVariables(); ++i) {
								MOEAChangeVariable var = new MOEAChangeVariable(GlobalSearch.this);
								sol.setVariable(i, var);
							}
							return sol;
						} catch (Exception e) {
							e.printStackTrace();
							return null;
						}
					}
					
					@Override
					public void evaluate(Solution sol) {
						if (aborted) {
							throw new RuntimeException("I was interrupted!");
						}
						try {
						EcoreTransferFunction tf = container.pullResource();
						MyResource trg = MyResource.get(tf.forwardResource());
						List<Change<?>> chs = new ArrayList<Change<?>>();
						sol.setAttribute("container", container);
						
						for (int i = 0; i < getNumberOfVariables(); ++i)  {
							Variable  var = sol.getVariable(i);
							if (var == null) {
								continue;
							}
							if (var instanceof MOEAChangeVariable) {
								MOEAChangeVariable mvar = (MOEAChangeVariable)var;
								if (mvar.getCurChange() != null) {
									try {
										//mvar.getCurChange().checkChange();
										Resource changeFrom = mvar.getCurChange().forResource();
										Resource changeTo = tf.backResource();
										if (!Objects.equals(changeFrom,changeTo)) {
											if (changeFrom != null && changeTo != null) {
												URIBasedEcoreTransferFunction utf = new URIBasedEcoreTransferFunction(mvar.getCurChange().forResource(), tf.backResource());
												mvar.getCurChange().transfer(utf);
											}
											mvar.getCurChange().checkChange();
										} else {
											mvar.getCurChange().checkChange();
										}
										
										chs.add(mvar.getCurChange().transfered(tf));
									} catch (Exception e) {
										e.printStackTrace();
										System.err.println("Error transfering ... "+e.getMessage());
									}
								}
							} else {
								throw new RuntimeException("I can only work with my variables!");
							}
						}
						CompositeChangeImpl cci = new CompositeChangeImpl(trg.getResource(), chs);
						ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
						double[] constraintsViolated = eval.evaluate(cci, new Evaluation());
						if (!Double.isNaN(constraintsViolated[0])) {
							sol.setObjective(0, -constraintsViolated[0]);
						} else {
							sol.setObjective(0, 99999999);
						}
						if (!Double.isNaN(constraintsViolated[1])) {
							sol.setObjective(1, constraintsViolated[1]);
						}  else {
							sol.setObjective(1, 99999999);
						}
						if (!Double.isNaN(constraintsViolated[2])) {
							sol.setObjective(2, -constraintsViolated[2]);
						} else {
							sol.setObjective(2, 99999999);
						}
						if (constraintsViolated[2] > 0.0 && (constraintsViolated[8] == 0.0 || !FILTER_GRAMMAR_ERROR) ) {
							cci = cci.clone();
							cci.checkChange();
							cci.removeEmptyWhenExecuting();
							cci.removeUnnecessarySubchanges();
							cci.checkChange();
							stream.add(cci, cci.transfered(tf.inverse()), constraintsViolated);
						}
						container.pushResource(tf);
						} catch (Exception e) {
							String str = Arrays.toString(e.getStackTrace()).replace(",","\n");
							System.err.println(str);
						}
					}
				};
				//problem = new DistributedProblem(problem, Executors.newCachedThreadPool());
				
				exec = new Executor().
						withAlgorithm("NSGAII").withProblem(problem).withMaxTime(1000*1000*1000L).withProperty("populationSize", 100);
				//TODO: Nur jetzt, weil es alles so unübersichtlich macht
				//exec.run();
				});
				t.setPriority(2);
				t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
					
					@Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println(e.getMessage());
						String s = Arrays.toString(e.getStackTrace()).replace(",", "\n");
						System.out.println(s);
					}
				});
				t.start();
			}
		}).start();
	}
	
	private boolean aborted;
	
	public void abortSearch() {
		aborted = true;
		if (exec != null) {
			exec.cancel();
		}
		try {
			if (t != null) {
				t.interrupt();
			}
		} catch (Exception e) {
		}
	}
	
	Executor exec;

	public Change<?> randomQuickfix(Random random) {
		Change<?> qf = valid.randomQuickfix(random);
		return qf;
	}

	



}
