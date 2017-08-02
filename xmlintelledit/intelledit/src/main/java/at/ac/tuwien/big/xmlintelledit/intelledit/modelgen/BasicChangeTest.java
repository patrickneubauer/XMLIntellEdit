package at.ac.tuwien.big.xmlintelledit.intelledit.modelgen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.test.OclExtractor;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreMapTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.URIBasedEcoreTransferFunction;

public class BasicChangeTest {
	
	public static void main(String[] args) {
		File ecoreFile = new File("model/serviceexample.ecore");
		Resource ecoreRes = OclExtractor.getEcore(ecoreFile);
		
		Random random = new Random();
		
		File noChange = new File("model/change_no.xmi");
		File midChange = new File("model/change_applied.xmi");
		File afterChange = new File("model/change_undone.xmi");
		
		for (int i = 0; i < 30; ++i) {
			SuperRandomModelGenerator gen = new SuperRandomModelGenerator(ecoreRes, 20, 100, 0);
			Resource generated = new XMLResourceImpl();
			gen.populate(generated);
			MyResource res = MyResource.get(generated);
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			Resource[] resAr = new Resource[1];
			Resource cloned = res.clone(copier);
			EcoreTransferFunction etf = new EcoreMapTransferFunction(res.getResource(), cloned, copier);
			etf = new URIBasedEcoreTransferFunction(res.getResource(), cloned);
			if (!res.equals(MyResource.get(cloned),etf)) {
				System.err.println("Clone error!!");
			}
			
			for (int j = 0; j < 1000; ++j) {
				Change<?> ch = res.randomChange(random).compileWithMissing();
				if (ch != null) {
					if (ch.toString().contains("Cluster")) {
						System.err.println();
					}
					System.out.print("Trying " + ch+" ==> ");
					Undoer ud = ch.transfered(etf).execute();
					ud.undo();
					if (!res.equals(MyResource.get(cloned),etf)) {
						System.out.println("ERROR");
						Map<Object,Object> options = new HashMap<Object, Object>();
						options.put(XMIResource.SCHEMA_LOCATION, true);
						try {
							res.getResource().save(new FileOutputStream(noChange),options);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						Undoer undoer = ch.execute();
						try {
							res.getResource().save(new FileOutputStream(midChange),options);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						undoer.undo();
						try {
							res.getResource().save(new FileOutputStream(afterChange),options);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("OK");
					}
				}
				
			}
		}
	}

}
