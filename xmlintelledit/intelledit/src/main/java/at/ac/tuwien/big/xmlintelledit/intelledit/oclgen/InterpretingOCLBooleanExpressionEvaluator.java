package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;

public class InterpretingOCLBooleanExpressionEvaluator implements OCLBooleanExpressionEvaluator<Object> {
	
	static {
		//Just to be able to call everything for OCL
		new StandaloneSetup().setPlatformUri("./");
//		CompleteOCLStandaloneSetup.doSetup();
//		OCLinEcoreStandaloneSetup.doSetup();
//		OCLstdlibStandaloneSetup.doSetup();
		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		OCL.initialize(null);
	}
	
	private final OCLExpression oclExpression;

	public InterpretingOCLBooleanExpressionEvaluator(EClassifier context, String oclExpression) {
		OCL ocl = OCL.newInstance();
		Helper oclHelper = ocl.createOCLHelper();
		oclHelper.setContext(context);
		
		try {
			this.oclExpression = oclHelper.createQuery(oclExpression);
		} catch (ParserException ex) {
			throw new RuntimeException(ex);
		}
	} 
	
	@Override
	public boolean isValid(Object context) {
		OCL ocl = OCL.newInstance();
		return ocl.check(context, oclExpression);
	}

	@Override
	public EStructuralFeature findErrorFeature(Object self) {
		return null;
	}
	
}
