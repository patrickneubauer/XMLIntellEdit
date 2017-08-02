/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADVANCEDPROPERTYPATH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH#getAc <em>Ac</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH#getAspect <em>Aspect</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH#getPropertys <em>Propertys</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getADVANCEDPROPERTYPATH()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternAc patternAspect'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternAc='self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternAspect='(self.aspect=null) or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface ADVANCEDPROPERTYPATH extends EObject {
	/**
	 * Returns the value of the '<em><b>Ac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ac</em>' attribute.
	 * @see #setAc(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getADVANCEDPROPERTYPATH_Ac()
	 * @model required="true"
	 * @generated
	 */
	String getAc();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH#getAc <em>Ac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ac</em>' attribute.
	 * @see #getAc()
	 * @generated
	 */
	void setAc(String value);

	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' attribute.
	 * @see #setAspect(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getADVANCEDPROPERTYPATH_Aspect()
	 * @model
	 * @generated
	 */
	String getAspect();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH#getAspect <em>Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' attribute.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(String value);

	/**
	 * Returns the value of the '<em><b>Propertys</b></em>' containment reference list.
	 * The list contents are of type {@link eclassxmlschemacommon_2_0Simplified.PROPERTYELM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propertys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propertys</em>' containment reference list.
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getADVANCEDPROPERTYPATH_Propertys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PROPERTYELM> getPropertys();

} // ADVANCEDPROPERTYPATH
