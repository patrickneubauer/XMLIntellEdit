package at.ac.tuwien.big.xmlintelledit.intelledit.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.GlobalSearch;
import at.ac.tuwien.big.xmlintelledit.intelledit.global.MOEAChangeVariable;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.RejectingFilterManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.SimpleStream;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicValidator;

/**Read in an Ecore File and Generate Fixes for it*/
public class FixerGenerator {
	
	public static void printFixes(File xmiFile, File ecoreFile) throws IOException {
		Resource ecoreRes = OclExtractor.getEcore(ecoreFile);
		Map<EClass, Map<String, String>> allOCLExpressionsStr = OclExtractor.getAllClassOCLExpressions(ecoreRes);
		Map<EClass, Map<String, OCLExpression>> allOCLExpressions = OclExtractor.getAllOCLExpressions(allOCLExpressionsStr);
		
		Resource xmiRes = OclExtractor.getXMI(xmiFile, ecoreRes);
		MyResource myRes = MyResource.get(xmiRes);
		
		RejectingFilterManager man = new RejectingFilterManager();
		man.initDefault();
		EcoreEnvironmentFactory fact = EcoreEnvironmentFactory.INSTANCE;
		OCL ocl = OCL.newInstance();
		
		DynamicValidator valid = new DynamicValidator();
		
		for (EObject eobj: (Iterable<EObject>)(()->xmiRes.getAllContents())) {
			if (eobj == null) {
				continue;
			}
			EClass cl = eobj.eClass();
			if (cl == null) {
				continue;
			}
			Map<String, OCLExpression> oclExpr = allOCLExpressions.getOrDefault(cl, Collections.emptyMap());
			
			
			
			for (Entry<String,OCLExpression> entr: oclExpr.entrySet()) {
				/*String name = entr.getKey();
				EvaluationEnvironment localEvalEnv = fact.createEvaluationEnvironment();

				localEvalEnv.add(Environment.SELF_VARIABLE_NAME, eobj);

				Map extents = localEvalEnv.createExtentMap(eobj);

				EvaluationVisitor ev = fact
					.createEvaluationVisitor(fact.createEnvironment(), localEvalEnv, extents);

				
				TracingEvaluationVisitor evalVisitor = new TracingEvaluationVisitor(ev);
				Object ret = entr.getValue().accept(evalVisitor);
				System.out.println("Evaluation of " + name+" was " + ret + " ("+oclExpr+")");
				if (!(ret instanceof Boolean) || !((Boolean)ret)) {
					
					EvalResult res = evalVisitor.getTopResult();
					
					System.out.println("") ;
					man.calculateEverything(myRes, res);
					System.out.println("Need fix - Quality " + res.getQuality(MakeTrueImpl.INSTANCE, man));
					System.out.println("Calculated Everything");
					List<ChangeType<?, ?>> allPossibleChanges = res.getAllFixingActions();
					Collections.shuffle(allPossibleChanges);
					for (ChangeType<?, ?> change: allPossibleChanges) {
						Undoer undoer = change.apply();
						Object newRet = entr.getValue().accept(ev);
						if (newRet instanceof Boolean && ((Boolean)newRet)) {
							System.out.println("I could really fix the problem with " + change);
							break;
						} else {
							System.out.println("I could not fix the problem with " + change);
							undoer.undo();
						}
					}
					System.out.println("Fix Attempts:");
					res.printAllFixAttempts();
					System.out.println("Direct Fixing Actions:");
					res.printAllDirectFixingActions();
					System.out.println("Fixing Actions:");
					res.printAllFixingActions();
				}*/
				/*LocalSearchInterfaceImpl impl = LocalSearchInterfaceImpl.create(MyResource.get(xmiRes),
						entr.getKey(),
						new OCLExpressionEvaluable(entr.getValue()), eobj, SimpleStream.getStream((os,ns,oq,curCosts)
								->{
									System.out.println("Found solution:\n "+os);
									return new ProposalImpl<>(ns);
								}), NeighborhoodProvider.DEFAULT_LOCALSEARCH, -1.0);
				impl.initSearch();
				for (int i = 0; i < 100; ++i) {
					impl.doSomeSearch();
				}*/
			}

		}/*
		GlobalSearch gs = new GlobalSearch(valid, new SimpleStream<Change<?>>() {

			@Override
			public Proposal<?, ?> add(Change<?> original, Change<?> processed, double localErrorRemaining,
					double curCosts) {
				System.out.println("Received solution!");
			}
		});*//*//TODO: if needed, fix compile errors
		valid.checkFile(xmiRes);
				NondominatedPopulation pop = exec.run();
		valid.abort();
		for (int k = 0; k < 3; ++k) {
			for (int i = 0; i < pop.size(); ++i) {
				Solution s = pop.get(i);
				System.out.println("Solution " +i+", Violated Constraints: "+s.getObjective(0)+", Costs: "+s.getObjective(1));
				for (int j = 0; j < s.getNumberOfVariables(); ++j) {
					Variable var = (MOEAChangeVariable)s.getVariable(j);
					System.out.println("Variable "+j+": "+((MOEAChangeVariable)var).getCurChange());
				}

				problem.evaluate(s);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		xmiRes.save(new HashMap<>());
		*/
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("model/router.xmi");
		File routeroutput = new File("model/routeroutput.xmi");
		Files.copy(file.toPath(), new FileOutputStream(routeroutput));
		File ecore = new File("model/router.ecore");
		printFixes(routeroutput,ecore);
	}

}
