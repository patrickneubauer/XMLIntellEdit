package at.ac.tuwien.big.xmlintelledit.intelledit.modelgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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

public class QuickfixTest {

	public static void main(String[] args) throws IOException {
		File ecoreFile = new File("model/serviceexample.ecore");
		Resource ecoreRes = OclExtractor.getEcore(ecoreFile);
		File genDir = new File(ecoreFile.getParent()+File.separator+"qfgenerated");
		genDir.mkdirs();
		FileOutputStream violatedConstraints = null ;
		try {
			violatedConstraints = new FileOutputStream("model/qfviolatedconstraints");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		genDir.mkdir();
		for (int i = 0; i < 100; ++i) {
			SuperRandomModelGenerator gen = new SuperRandomModelGenerator(ecoreRes, 20, 100, 0);
			File target = new File(genDir.getAbsolutePath()+File.separator+"qfgenerated_"+i+"_modified.xmi");
			File source = new File(genDir.getAbsolutePath()+File.separator+"qfgenerated_"+i+".xmi");
			Resource generated = new XMLResourceImpl(URI.createFileURI(source.getAbsolutePath()));
			gen.populate(generated);
			try {
				Map<Object, Object> saveOptions = new HashMap<>();
				saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION,true);
				OutputStream os = new FileOutputStream(source);
				generated.save(os,saveOptions);
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
			double[] vc = eval.evaluate(Change.empty(generated), new Evaluation());
			QuickfixTestRunner runner = new QuickfixTestRunner(generated);
			runner.doRun(500, 500000);
			double[] vc2 = eval.evaluate(Change.empty(generated), new Evaluation());
			
			try {
				violatedConstraints.write((i+","+(-vc[0])+","+(-vc2[0])+"\n").getBytes());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				Map<Object, Object> saveOptions = new HashMap<>();
				saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION,true);
				OutputStream os = new FileOutputStream(target);
				generated.save(os,saveOptions);
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		violatedConstraints.flush();
		violatedConstraints.close();
	}
}
