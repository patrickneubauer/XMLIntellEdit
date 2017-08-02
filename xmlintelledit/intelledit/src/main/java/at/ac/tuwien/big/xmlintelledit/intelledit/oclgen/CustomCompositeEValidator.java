package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.validation.CompositeEValidator;

import com.google.inject.Inject;

public class CustomCompositeEValidator extends CompositeEValidator {

	private static final Logger logger = Logger.getLogger(CustomCompositeEValidator.class);
	
	@Inject
	private OperationCanceledManager operationCanceledManager;
	
	private String allowedPackagePrefix;

	public void setAllowedPackagePrefix(String allowedPackagePrefix) {
		this.allowedPackagePrefix = allowedPackagePrefix;
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) throws OperationCanceledError {
		boolean result = true;
		for (int i = 0; i < getContents().size(); i++) {
			EValidatorEqualitySupport val = getContents().get(i);
			
			if (val.getDelegate().getClass().getName().startsWith(allowedPackagePrefix)) {
				try {
					result &= val.getDelegate().validate(eObject, diagnostics, context);
				} catch (Throwable e) {
					operationCanceledManager.propagateAsErrorIfCancelException(e);
					logger.error("Error executing EValidator", e);
					diagnostics.add(createExceptionDiagnostic("Error executing EValidator", eObject, e));
				}
			}
		}
		
		return result;
	}

	private Diagnostic createExceptionDiagnostic(String message, Object source, Throwable t) {
		return new BasicDiagnostic(Diagnostic.ERROR, source.toString(), 0, message, new Object[] { t });
	}

}
