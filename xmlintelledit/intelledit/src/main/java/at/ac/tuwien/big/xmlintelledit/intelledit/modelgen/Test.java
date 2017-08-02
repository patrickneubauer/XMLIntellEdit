package at.ac.tuwien.big.xmlintelledit.intelledit.modelgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.test.OclExtractor;

public class Test {
	
	public static void main(String[] args) throws IOException {
		File ecoreFile = new File("model/serviceexample.ecore");
		Resource ecoreRes = OclExtractor.getEcore(ecoreFile);
		File genDir = new File(ecoreFile.getParent()+File.separator+"generated");
		genDir.mkdirs();
		FileOutputStream violatedConstraints = null ;
		try {
			violatedConstraints = new FileOutputStream("model/violatedconstraints");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		genDir.mkdir();
		for (int objectSize: new int[]{5,20,100}) {
			for (int assocSize: new int[]{10,50,250,1000}) {
				for (double useScoping: new double[]{0.0,0.25,0.5,0.75,1.0}) {
				
					for (int i = 0; i < 30; ++i) {
						SuperRandomModelGenerator gen = new SuperRandomModelGenerator(ecoreRes, objectSize, assocSize-(int)(useScoping*assocSize), (int)(useScoping*assocSize));
						File target = new File(genDir.getAbsolutePath()+File.separator+"generated_"+objectSize+"_"+assocSize+"_"+useScoping+"_"+i+".xmi");
						Resource generated = new XMLResourceImpl(URI.createFileURI(target.getAbsolutePath()));
						gen.populate(generated);
						ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
						double[] vc = eval.evaluate(Change.empty(generated), new Evaluation());
						try {
							violatedConstraints.write((objectSize+","+assocSize+","+useScoping+","+i+","+vc[0]+"\n").getBytes());
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						try {
							Map<Object, Object> saveOptions = new HashMap<>();
							saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION,true); 
							generated.save(saveOptions);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		violatedConstraints.flush();
		violatedConstraints.close();
	}

}
