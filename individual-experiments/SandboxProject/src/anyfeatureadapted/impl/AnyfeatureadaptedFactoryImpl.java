/**
 */
package anyfeatureadapted.impl;

import anyfeatureadapted.*;

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
public class AnyfeatureadaptedFactoryImpl extends EFactoryImpl implements AnyfeatureadaptedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnyfeatureadaptedFactory init() {
		try {
			AnyfeatureadaptedFactory theAnyfeatureadaptedFactory = (AnyfeatureadaptedFactory)EPackage.Registry.INSTANCE.getEFactory(AnyfeatureadaptedPackage.eNS_URI);
			if (theAnyfeatureadaptedFactory != null) {
				return theAnyfeatureadaptedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnyfeatureadaptedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyfeatureadaptedFactoryImpl() {
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
			case AnyfeatureadaptedPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AnyfeatureadaptedPackage.ELEMENT1: return createElement1();
			case AnyfeatureadaptedPackage.PROPERTIES: return createProperties();
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE: return createRootElementType();
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT: return createAnyGenericElement();
			case AnyfeatureadaptedPackage.ANY_GENERIC_ATTRIBUTE: return createAnyGenericAttribute();
			case AnyfeatureadaptedPackage.ANY_GENERIC_TEXT: return createAnyGenericText();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Element1 createElement1() {
		Element1Impl element1 = new Element1Impl();
		return element1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
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
	public AnyGenericElement createAnyGenericElement() {
		AnyGenericElementImpl anyGenericElement = new AnyGenericElementImpl();
		return anyGenericElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyGenericAttribute createAnyGenericAttribute() {
		AnyGenericAttributeImpl anyGenericAttribute = new AnyGenericAttributeImpl();
		return anyGenericAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyGenericText createAnyGenericText() {
		AnyGenericTextImpl anyGenericText = new AnyGenericTextImpl();
		return anyGenericText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyfeatureadaptedPackage getAnyfeatureadaptedPackage() {
		return (AnyfeatureadaptedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnyfeatureadaptedPackage getPackage() {
		return AnyfeatureadaptedPackage.eINSTANCE;
	}

} //AnyfeatureadaptedFactoryImpl
