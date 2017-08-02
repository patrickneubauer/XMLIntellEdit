/**
 */
package isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.IRDISequence;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactoryImpl extends EFactoryImpl implements Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory init() {
		try {
			Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory = (Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.eNS_URI);
			if (theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory != null) {
				return theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactoryImpl() {
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
			case Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE: return createIRDISequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRDISequence createIRDISequence() {
		IRDISequenceImpl irdiSequence = new IRDISequenceImpl();
		return irdiSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage getIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage() {
		return (Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage getPackage() {
		return Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.eINSTANCE;
	}

} //Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactoryImpl
