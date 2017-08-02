/**
 */
package anyfeatureadapted;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Generic Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link anyfeatureadapted.AnyGenericAttribute#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link anyfeatureadapted.AnyGenericAttribute#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericAttribute()
 * @model
 * @generated
 */
public interface AnyGenericAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericAttribute_AttrName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link anyfeatureadapted.AnyGenericAttribute#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Value</em>' attribute.
	 * @see #setAttrValue(String)
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getAnyGenericAttribute_AttrValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getAttrValue();

	/**
	 * Sets the value of the '{@link anyfeatureadapted.AnyGenericAttribute#getAttrValue <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Value</em>' attribute.
	 * @see #getAttrValue()
	 * @generated
	 */
	void setAttrValue(String value);

} // AnyGenericAttribute
