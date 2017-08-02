package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface OCLBooleanExpressionEvaluator<T> {

	boolean isValid(T self);
	
	EStructuralFeature findErrorFeature(T self);
	
}
