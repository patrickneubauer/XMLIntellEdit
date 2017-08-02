/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactoryImpl extends EFactoryImpl implements Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory init() {
		try {
			Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory = (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eNS_URI);
			if (theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory != null) {
				return theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactoryImpl() {
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT: return createInternationalText();
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING: return createLanguageString();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalText createInternationalText() {
		InternationalTextImpl internationalText = new InternationalTextImpl();
		return internationalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageString createLanguageString() {
		LanguageStringImpl languageString = new LanguageStringImpl();
		return languageString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage getIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage() {
		return (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage getPackage() {
		return Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eINSTANCE;
	}

} //Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactoryImpl
