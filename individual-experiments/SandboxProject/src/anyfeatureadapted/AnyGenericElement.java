/**
 */
package anyfeatureadapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link anyfeatureadapted.AnyGenericElement#getElemName <em>Elem Name</em>}</li>
 *   <li>{@link anyfeatureadapted.AnyGenericElement#getAnyGenericAttr <em>Any Generic Attr</em>}</li>
 *   <li>{@link anyfeatureadapted.AnyGenericElement#getElemValue <em>Elem Value</em>}</li>
 *   <li>{@link anyfeatureadapted.AnyGenericElement#getChildElem <em>Child Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericElement()
 * @model
 * @generated
 */
public interface AnyGenericElement extends AnyGenericConstruct {
	/**
	 * Returns the value of the '<em><b>Elem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem Name</em>' attribute.
	 * @see #setElemName(String)
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericElement_ElemName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getElemName();

	/**
	 * Sets the value of the '{@link anyfeatureadapted.AnyGenericElement#getElemName <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Name</em>' attribute.
	 * @see #getElemName()
	 * @generated
	 */
	void setElemName(String value);

	/**
	 * Returns the value of the '<em><b>Any Generic Attr</b></em>' containment reference list.
	 * The list contents are of type {@link anyfeatureadapted.AnyGenericAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Generic Attr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Generic Attr</em>' containment reference list.
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericElement_AnyGenericAttr()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnyGenericAttribute> getAnyGenericAttr();

	/**
	 * Returns the value of the '<em><b>Elem Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem Value</em>' attribute.
	 * @see #setElemValue(String)
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericElement_ElemValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getElemValue();

	/**
	 * Sets the value of the '{@link anyfeatureadapted.AnyGenericElement#getElemValue <em>Elem Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Value</em>' attribute.
	 * @see #getElemValue()
	 * @generated
	 */
	void setElemValue(String value);

	/**
	 * Returns the value of the '<em><b>Child Elem</b></em>' containment reference list.
	 * The list contents are of type {@link anyfeatureadapted.AnyGenericElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Elem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Elem</em>' containment reference list.
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericElement_ChildElem()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnyGenericElement> getChildElem();

} // AnyGenericElement
