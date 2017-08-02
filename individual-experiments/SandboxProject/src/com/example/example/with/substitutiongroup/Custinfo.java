/**
 */
package com.example.example.with.substitutiongroup;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.substitutiongroup.Custinfo#getNameGroup <em>Name Group</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.Custinfo#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.substitutiongroup.SubstitutiongroupPackage#getCustinfo()
 * @model extendedMetaData="name='custinfo' kind='elementOnly'"
 * @generated
 */
public interface Custinfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Group</em>' attribute list.
	 * @see com.example.example.with.substitutiongroup.SubstitutiongroupPackage#getCustinfo_NameGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='name:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNameGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.example.with.substitutiongroup.SubstitutiongroupPackage#getCustinfo_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='name:group'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.example.with.substitutiongroup.Custinfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Custinfo
