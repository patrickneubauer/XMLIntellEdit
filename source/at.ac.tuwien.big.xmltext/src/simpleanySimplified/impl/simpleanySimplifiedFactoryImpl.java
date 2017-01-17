/**
 */
package simpleanySimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleanySimplified.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class simpleanySimplifiedFactoryImpl extends EFactoryImpl implements simpleanySimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static simpleanySimplifiedFactory init() {
		try {
			simpleanySimplifiedFactory thesimpleanySimplifiedFactory = (simpleanySimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(simpleanySimplifiedPackage.eNS_URI);
			if (thesimpleanySimplifiedFactory != null) {
				return thesimpleanySimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new simpleanySimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simpleanySimplifiedFactoryImpl() {
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
			case simpleanySimplifiedPackage.BOOK: return createBook();
			case simpleanySimplifiedPackage.DESCRIPTION: return createDescription();
			case simpleanySimplifiedPackage.LIBRARY: return createLibrary();
			case simpleanySimplifiedPackage.MIXED_TEXT: return createMixedText();
			case simpleanySimplifiedPackage.MIXED_FEATURE: return createMixedFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedText createMixedText() {
		MixedTextImpl mixedText = new MixedTextImpl();
		return mixedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedFeature createMixedFeature() {
		MixedFeatureImpl mixedFeature = new MixedFeatureImpl();
		return mixedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simpleanySimplifiedPackage getsimpleanySimplifiedPackage() {
		return (simpleanySimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static simpleanySimplifiedPackage getPackage() {
		return simpleanySimplifiedPackage.eINSTANCE;
	}

} //simpleanySimplifiedFactoryImpl
