package at.ac.tuwien.big.xmlintelledit.intelledit.modelgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.BasicDeleteConstantChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.CreateObjectChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.DeleteObjectChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.test.OclExtractor;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class ValidatorTest {

	public static void main(String[] args) throws IOException {
		final int totalTries = 10000;
		File ecoreFile = new File("model/serviceexample.ecore");
		Resource ecoreRes = OclExtractor.getEcore(ecoreFile);
		File genDir = new File(ecoreFile.getParent()+File.separator+"vgenerated");
		genDir.mkdirs();
		FileOutputStream violatedConstraints = null ;
		try {
			violatedConstraints = new FileOutputStream("model/vvalidator");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		genDir.mkdir();
		List<Resource> generatedResources = new ArrayList<Resource>();
		while (generatedResources.size() <  Math.sqrt(totalTries/4)) {
			for (int i = 0; i < 30; ++i) {
				SuperRandomModelGenerator gen = new SuperRandomModelGenerator(ecoreRes, 40, 100, 100);
				File target = new File(genDir.getAbsolutePath()+File.separator+"generated_"+i+".xmi");
				Resource generated = new XMLResourceImpl(URI.createFileURI(target.getAbsolutePath()));
				gen.populate(generated);
				//Try to fix
				QuickfixTestRunner fixer = new QuickfixTestRunner(generated);
				fixer.doRun(1000, 10000);
				ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
				double[] vc = eval.evaluate(Change.empty(generated), new Evaluation());
				if (vc[0] == 0.0) {
					//It's ok!
					generatedResources.add(generated);
				}
				System.out.println("Now have "+generatedResources.size()+"/"+Math.sqrt(totalTries/4)+"Resources!");
			}
			System.out.println("Now have "+generatedResources.size()+"/"+Math.sqrt(totalTries/4)+"Resources!");
		}
		System.out.println("Have " + generatedResources.size() + " Resources!");
		Random random = new Random(1234);
		int haveTries = 0;
		for (int i = 0; i < generatedResources.size(); ++i) {
			int nowTries = (totalTries-haveTries)/(generatedResources.size()-i);
			MyResource res = MyResource.get(generatedResources.get(i));
			for (int j = 0; j < nowTries; ++j) {
				//Do some random change
				Change<?> rnd = null;
				for (int k = 0; k < 10; ++k) {
					rnd = res.randomChange(random).compileWithMissing();
					if (rnd instanceof CreateObjectChange || rnd instanceof DeleteObjectChange) {
						rnd = null;
					} else {
						break;
					}
				}
				
				if (rnd == null) {
					continue;
				}
				ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
				double[] vc = eval.evaluate(rnd, new Evaluation());
				if (vc[0] == 0.0) {
					if (rnd instanceof DeleteObjectChange || rnd instanceof BasicDeleteConstantChange) {
						continue;
					} else {
						rnd.execute();
						continue;
					}
				} else {
					//Check "real" change VS displayed
					Set<FixAttemptReference> fixRefs = rnd.getFixReferences();
					Set<FixAttemptReference> realRefs = new HashSet<FixAttemptReference>(fixRefs);
					Undoer undoer = rnd.execute();
					for (FixAttemptReference ref: fixRefs) {
						if (ref instanceof FixAttemptFeatureReferenceImpl)  {
							FixAttemptFeatureReferenceImpl fref = (FixAttemptFeatureReferenceImpl)ref;
							int haveIndex = ((List)MyEcoreUtil.getAsCollection(ref.forObject(), fref.getFeature())).indexOf(fref.getValue());
							if (haveIndex == -1) {
								//you need complete
								realRefs.add(new FixAttemptFeatureReferenceImpl(ref.forObject(), fref.getFeature()));
							}
						}
					}
					eval.augmentSet(realRefs);
					if (realRefs.isEmpty()) {
						System.err.println("Strange ...");
						
					} else {
						Set<FixAttemptReference> myrefs = new HashSet<FixAttemptReference>();
						Set<FixAttemptReference> xtextrefs = new HashSet<FixAttemptReference>();
						boolean onlyMultiplicity = eval.calcMyErrorFixAttemptReference(res, myrefs, xtextrefs);
						if (!onlyMultiplicity) {
							Set<FixAttemptReference> corrmy = new HashSet<FixAttemptReference>(myrefs);
							Set<FixAttemptReference> corrxtext = new HashSet<FixAttemptReference>(xtextrefs);
							corrmy.retainAll(realRefs);
							corrxtext.retainAll(realRefs);
							if (myrefs.isEmpty()) {
								eval.calcMyErrorFixAttemptReference(res, myrefs, xtextrefs);
								System.err.println("Strange ...");
							}
							double myPrecision = ((double)corrmy.size())/Math.max(1,myrefs.size());
							double xtextPrecision = ((double)corrxtext.size())/Math.max(1,xtextrefs.size());
							double myRecall = ((double)corrmy.size())/realRefs.size();
							double xtextRecall = ((double)corrxtext.size())/realRefs.size();
							try {
								violatedConstraints.write((realRefs.size()+","+myrefs.size()+","+xtextrefs.size()+","+corrmy.size()+","+corrxtext.size()+","+myPrecision+","+myRecall+","+xtextPrecision+","+xtextRecall+"\n").getBytes());
								System.out.println("My Precision: " +myPrecision+"/"+myRecall+ " VS Xtext: "+xtextPrecision+"/"+xtextRecall);
							
								System.out.println((realRefs.size()+","+myrefs.size()+","+xtextrefs.size()+","+corrmy.size()+","+corrxtext.size()+","+myPrecision+","+myRecall+","+xtextPrecision+","+xtextRecall+"\n"));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					undoer.undo();
				}
			}
		}
		violatedConstraints.flush();
		violatedConstraints.close();;
	}
	
}
