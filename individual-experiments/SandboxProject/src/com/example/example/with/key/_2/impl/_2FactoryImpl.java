/**
 */
package com.example.example.with.key._2.impl;

import com.example.example.with.key._2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2FactoryImpl extends EFactoryImpl implements _2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _2Factory init() {
		try {
			_2Factory the_2Factory = (_2Factory)EPackage.Registry.INSTANCE.getEFactory(_2Package.eNS_URI);
			if (the_2Factory != null) {
				return the_2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _2Package.COLOR_TYPE: return createColorType();
			case _2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _2Package.ITEMS_TYPE: return createItemsType();
			case _2Package.ORDER_TYPE: return createOrderType();
			case _2Package.PRICE_TYPE: return createPriceType();
			case _2Package.PRODUCT_ORDER_TYPE: return createProductOrderType();
			case _2Package.PRODUCTS_TYPE: return createProductsType();
			case _2Package.PRODUCT_TYPE: return createProductType();
			case _2Package.ROOT_ELEMENT_TYPE: return createRootElementType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorType createColorType() {
		ColorTypeImpl colorType = new ColorTypeImpl();
		return colorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemsType createItemsType() {
		ItemsTypeImpl itemsType = new ItemsTypeImpl();
		return itemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderType() {
		OrderTypeImpl orderType = new OrderTypeImpl();
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceType createPriceType() {
		PriceTypeImpl priceType = new PriceTypeImpl();
		return priceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOrderType createProductOrderType() {
		ProductOrderTypeImpl productOrderType = new ProductOrderTypeImpl();
		return productOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductsType createProductsType() {
		ProductsTypeImpl productsType = new ProductsTypeImpl();
		return productsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementType createRootElementType() {
		RootElementTypeImpl rootElementType = new RootElementTypeImpl();
		return rootElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2Package get_2Package() {
		return (_2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _2Package getPackage() {
		return _2Package.eINSTANCE;
	}

} //_2FactoryImpl
