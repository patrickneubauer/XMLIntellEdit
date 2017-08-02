package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.io.Serializable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class OCLBasedValidationQuickfix implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;
	private final String description;
	private final String image;
	private final Object value;
	
	public OCLBasedValidationQuickfix(String name, String description, String image, Object value) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.value = value;
	}

	public static OCLBasedValidationQuickfix fromValue(Object value, String attributeName) {
		return new OCLBasedValidationQuickfix("Set '" + attributeName + "' to '" + value + "'", "Set '" + attributeName + "' to '" + value + "'", null, value);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	public Object getValue() {
		return value;
	}
	
	public void apply(EObject object, EAttribute attribute) {
		object.eSet(attribute, value);
	}
}
