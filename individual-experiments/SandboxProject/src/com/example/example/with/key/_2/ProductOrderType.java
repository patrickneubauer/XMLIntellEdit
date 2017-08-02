/**
 */
package com.example.example.with.key._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Order Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.ProductOrderType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.example.example.with.key._2.ProductOrderType#getColor <em>Color</em>}</li>
 *   <li>{@link com.example.example.with.key._2.ProductOrderType#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key._2._2Package#getProductOrderType()
 * @model extendedMetaData="name='ProductOrderType' kind='elementOnly'"
 * @generated
 */
public interface ProductOrderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see com.example.example.with.key._2._2Package#getProductOrderType_Quantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='quantity'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.ProductOrderType#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(ColorType)
	 * @see com.example.example.with.key._2._2Package#getProductOrderType_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color'"
	 * @generated
	 */
	ColorType getColor();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.ProductOrderType#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorType value);

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
	 * @see com.example.example.with.key._2._2Package#getProductOrderType_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='number'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.ProductOrderType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

} // ProductOrderType
