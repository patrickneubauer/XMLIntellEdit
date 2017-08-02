/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSVALUEASSIGNMENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT#getAssignedValue <em>Assigned Value</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSVALUEASSIGNMENT()
 * @model
 * @generated
 */
public interface CLASSVALUEASSIGNMENT extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Class Defined Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class Defined Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class Defined Property</em>' containment reference.
	 * @see #setSuperClassDefinedProperty(PROPERTYREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSVALUEASSIGNMENT_SuperClassDefinedProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PROPERTYREFERENCE getSuperClassDefinedProperty();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class Defined Property</em>' containment reference.
	 * @see #getSuperClassDefinedProperty()
	 * @generated
	 */
	void setSuperClassDefinedProperty(PROPERTYREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Assigned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Value</em>' containment reference.
	 * @see #setAssignedValue(ASSIGNEDVALUE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSVALUEASSIGNMENT_AssignedValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ASSIGNEDVALUE getAssignedValue();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT#getAssignedValue <em>Assigned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Value</em>' containment reference.
	 * @see #getAssignedValue()
	 * @generated
	 */
	void setAssignedValue(ASSIGNEDVALUE value);

} // CLASSVALUEASSIGNMENT
