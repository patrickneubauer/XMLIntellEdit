/**
 */
package eclassxmlschemaheader_2_0Simplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedFactory;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.MESSAGE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eclassxmlschemaheader_2_0SimplifiedFactoryImpl extends EFactoryImpl implements Eclassxmlschemaheader_2_0SimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Eclassxmlschemaheader_2_0SimplifiedFactory init() {
		try {
			Eclassxmlschemaheader_2_0SimplifiedFactory theEclassxmlschemaheader_2_0SimplifiedFactory = (Eclassxmlschemaheader_2_0SimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI);
			if (theEclassxmlschemaheader_2_0SimplifiedFactory != null) {
				return theEclassxmlschemaheader_2_0SimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Eclassxmlschemaheader_2_0SimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemaheader_2_0SimplifiedFactoryImpl() {
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
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER: return createDOCUMENTHEADER();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE: return createMESSAGE();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTHEADER createDOCUMENTHEADER() {
		DOCUMENTHEADERImpl documentheader = new DOCUMENTHEADERImpl();
		return documentheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE createMESSAGE() {
		MESSAGEImpl message = new MESSAGEImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemaheader_2_0SimplifiedPackage getEclassxmlschemaheader_2_0SimplifiedPackage() {
		return (Eclassxmlschemaheader_2_0SimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Eclassxmlschemaheader_2_0SimplifiedPackage getPackage() {
		return Eclassxmlschemaheader_2_0SimplifiedPackage.eINSTANCE;
	}

} //Eclassxmlschemaheader_2_0SimplifiedFactoryImpl
