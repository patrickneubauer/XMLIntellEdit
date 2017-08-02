/**
 */
package com.example.example.with.key._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.ProductType#getNumber <em>Number</em>}</li>
 *   <li>{@link com.example.example.with.key._2.ProductType#getName <em>Name</em>}</li>
 *   <li>{@link com.example.example.with.key._2.ProductType#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key._2._2Package#getProductType()
 * @model extendedMetaData="name='ProductType' kind='elementOnly'"
 * @generated
 */
public interface ProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see com.example.example.with.key._2._2Package#getProductType_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='number'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.ProductType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

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
	 * @see com.example.example.with.key._2._2Package#getProductType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.ProductType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' containment reference.
	 * @see #setPrice(PriceType)
	 * @see com.example.example.with.key._2._2Package#getProductType_Price()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='price'"
	 * @generated
	 */
	PriceType getPrice();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.ProductType#getPrice <em>Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' containment reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(PriceType value);

} // ProductType
