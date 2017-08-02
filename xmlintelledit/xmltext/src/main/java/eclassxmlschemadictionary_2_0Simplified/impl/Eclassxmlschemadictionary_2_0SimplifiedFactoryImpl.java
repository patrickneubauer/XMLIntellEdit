/**
 */
package eclassxmlschemadictionary_2_0Simplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedFactory;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eclassxmlschemadictionary_2_0SimplifiedFactoryImpl extends EFactoryImpl implements Eclassxmlschemadictionary_2_0SimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Eclassxmlschemadictionary_2_0SimplifiedFactory init() {
		try {
			Eclassxmlschemadictionary_2_0SimplifiedFactory theEclassxmlschemadictionary_2_0SimplifiedFactory = (Eclassxmlschemadictionary_2_0SimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI);
			if (theEclassxmlschemadictionary_2_0SimplifiedFactory != null) {
				return theEclassxmlschemadictionary_2_0SimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Eclassxmlschemadictionary_2_0SimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemadictionary_2_0SimplifiedFactoryImpl() {
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
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY: return createECLASSDICTIONARY();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECLASSDICTIONARY createECLASSDICTIONARY() {
		ECLASSDICTIONARYImpl eclassdictionary = new ECLASSDICTIONARYImpl();
		return eclassdictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemadictionary_2_0SimplifiedPackage getEclassxmlschemadictionary_2_0SimplifiedPackage() {
		return (Eclassxmlschemadictionary_2_0SimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Eclassxmlschemadictionary_2_0SimplifiedPackage getPackage() {
		return Eclassxmlschemadictionary_2_0SimplifiedPackage.eINSTANCE;
	}

} //Eclassxmlschemadictionary_2_0SimplifiedFactoryImpl
