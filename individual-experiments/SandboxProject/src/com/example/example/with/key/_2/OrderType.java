/**
 */
package com.example.example.with.key._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.OrderType#getNumber <em>Number</em>}</li>
 *   <li>{@link com.example.example.with.key._2.OrderType#getItems <em>Items</em>}</li>
 *   <li>{@link com.example.example.with.key._2.OrderType#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key._2._2Package#getOrderType()
 * @model extendedMetaData="name='OrderType' kind='elementOnly'"
 * @generated
 */
public interface OrderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see com.example.example.with.key._2._2Package#getOrderType_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='number'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.OrderType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(ItemsType)
	 * @see com.example.example.with.key._2._2Package#getOrderType_Items()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='items'"
	 * @generated
	 */
	ItemsType getItems();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.OrderType#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(ItemsType value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference.
	 * @see #setProducts(ProductsType)
	 * @see com.example.example.with.key._2._2Package#getOrderType_Products()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='products'"
	 * @generated
	 */
	ProductsType getProducts();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.OrderType#getProducts <em>Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' containment reference.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(ProductsType value);

} // OrderType
