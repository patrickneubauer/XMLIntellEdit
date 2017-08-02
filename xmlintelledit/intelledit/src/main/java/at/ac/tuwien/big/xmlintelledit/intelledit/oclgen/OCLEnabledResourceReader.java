package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.xtext.mwe.Reader;

public class OCLEnabledResourceReader extends Reader {

	@Override
	protected ResourceSet getResourceSet() {
		ResourceSet resourceSet = super.getResourceSet();
//		org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
//		org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();
//		org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup.doSetup();
//		org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup.doSetup();
//		org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
//		org.eclipse.ocl.examples.pivot.OCL.initialize(resourceSet);
		OCLDelegateDomain.initialize(resourceSet);
		OCL.initialize(resourceSet);
		return resourceSet;
	}

}
