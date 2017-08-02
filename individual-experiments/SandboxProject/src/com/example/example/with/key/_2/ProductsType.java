/**
 */
package com.example.example.with.key._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Products Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.ProductsType#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key._2._2Package#getProductsType()
 * @model extendedMetaData="name='ProductsType' kind='elementOnly'"
 * @generated
 */
public interface ProductsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.with.key._2.ProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see com.example.example.with.key._2._2Package#getProductsType_Product()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='product'"
	 * @generated
	 */
	EList<ProductType> getProduct();

} // ProductsType
