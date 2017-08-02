/**
 */
package Library3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Library3.AnyGenericElement#getElemName <em>Elem Name</em>}</li>
 *   <li>{@link Library3.AnyGenericElement#getAnyGenericAttr <em>Any Generic Attr</em>}</li>
 *   <li>{@link Library3.AnyGenericElement#getElemValue <em>Elem Value</em>}</li>
 *   <li>{@link Library3.AnyGenericElement#getAnyGenericElement <em>Any Generic Element</em>}</li>
 * </ul>
 *
 * @see Library3.Library3Package#getAnyGenericElement()
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
	 * @see Library3.Library3Package#getAnyGenericElement_ElemName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getElemName();

	/**
	 * Sets the value of the '{@link Library3.AnyGenericElement#getElemName <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Name</em>' attribute.
	 * @see #getElemName()
	 * @generated
	 */
	void setElemName(String value);

	/**
	 * Returns the value of the '<em><b>Any Generic Attr</b></em>' containment reference list.
	 * The list contents are of type {@link Library3.AnyGenericAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Generic Attr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Generic Attr</em>' containment reference list.
	 * @see Library3.Library3Package#getAnyGenericElement_AnyGenericAttr()
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
	 * @see Library3.Library3Package#getAnyGenericElement_ElemValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getElemValue();

	/**
	 * Sets the value of the '{@link Library3.AnyGenericElement#getElemValue <em>Elem Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Value</em>' attribute.
	 * @see #getElemValue()
	 * @generated
	 */
	void setElemValue(String value);

	/**
	 * Returns the value of the '<em><b>Any Generic Element</b></em>' containment reference list.
	 * The list contents are of type {@link Library3.AnyGenericElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Generic Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Generic Element</em>' containment reference list.
	 * @see Library3.Library3Package#getAnyGenericElement_AnyGenericElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnyGenericElement> getAnyGenericElement();

} // AnyGenericElement
