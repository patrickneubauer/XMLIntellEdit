package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

public class OCLBasedQuickfixDefinition {

	private final String constraintName;
	private final String validatorClassName;
	private final EClass elementClass;
	private final EAttribute targetAttribute;

	public OCLBasedQuickfixDefinition(String constraintName, EClass elementClass, EAttribute targetAttribute) {
		this.constraintName = constraintName;
		this.validatorClassName = elementClass.getName() + "Validator";
		this.elementClass = elementClass;
		this.targetAttribute = targetAttribute;
	}

	public String getConstraintName() {
		return constraintName;
	}

	public String getValidatorClassName() {
		return validatorClassName;
	}

	public EClass getElementClass() {
		return elementClass;
	}

	public EAttribute getTargetAttribute() {
		return targetAttribute;
	}
}
