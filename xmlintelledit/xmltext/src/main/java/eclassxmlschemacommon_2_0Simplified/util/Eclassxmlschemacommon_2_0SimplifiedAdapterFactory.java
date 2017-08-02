/**
 */
package eclassxmlschemacommon_2_0Simplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.Contact;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.LOCALE;
import eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING;
import eclassxmlschemacommon_2_0Simplified.NUMERICVALUE;
import eclassxmlschemacommon_2_0Simplified.PARTY;
import eclassxmlschemacommon_2_0Simplified.PROPERTYELM;
import eclassxmlschemacommon_2_0Simplified.PROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT;
import eclassxmlschemacommon_2_0Simplified.TYPEDSTRING;
import eclassxmlschemacommon_2_0Simplified.TargetValues;
import eclassxmlschemacommon_2_0Simplified.UNITMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEREF;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage
 * @generated
 */
public class Eclassxmlschemacommon_2_0SimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eclassxmlschemacommon_2_0SimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemacommon_2_0SimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Eclassxmlschemacommon_2_0SimplifiedSwitch<Adapter> modelSwitch =
		new Eclassxmlschemacommon_2_0SimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseADVANCEDPROPERTYPATH(ADVANCEDPROPERTYPATH object) {
				return createADVANCEDPROPERTYPATHAdapter();
			}
			@Override
			public Adapter caseBASICPROPERTYPATH(BASICPROPERTYPATH object) {
				return createBASICPROPERTYPATHAdapter();
			}
			@Override
			public Adapter caseContact(Contact object) {
				return createContactAdapter();
			}
			@Override
			public Adapter caseIDENTIFICATION(IDENTIFICATION object) {
				return createIDENTIFICATIONAdapter();
			}
			@Override
			public Adapter caseLOCALE(LOCALE object) {
				return createLOCALEAdapter();
			}
			@Override
			public Adapter caseLOCALIZEDSTRING(LOCALIZEDSTRING object) {
				return createLOCALIZEDSTRINGAdapter();
			}
			@Override
			public Adapter caseNUMERICVALUE(NUMERICVALUE object) {
				return createNUMERICVALUEAdapter();
			}
			@Override
			public Adapter casePARTY(PARTY object) {
				return createPARTYAdapter();
			}
			@Override
			public Adapter casePROPERTYELM(PROPERTYELM object) {
				return createPROPERTYELMAdapter();
			}
			@Override
			public Adapter casePROPERTYPATH(PROPERTYPATH object) {
				return createPROPERTYPATHAdapter();
			}
			@Override
			public Adapter caseQUERYAMOUNT(QUERYAMOUNT object) {
				return createQUERYAMOUNTAdapter();
			}
			@Override
			public Adapter caseTargetValues(TargetValues object) {
				return createTargetValuesAdapter();
			}
			@Override
			public Adapter caseTYPEDSTRING(TYPEDSTRING object) {
				return createTYPEDSTRINGAdapter();
			}
			@Override
			public Adapter caseUNITMAPPING(UNITMAPPING object) {
				return createUNITMAPPINGAdapter();
			}
			@Override
			public Adapter caseVALUEMAPPING(VALUEMAPPING object) {
				return createVALUEMAPPINGAdapter();
			}
			@Override
			public Adapter caseVALUEREF(VALUEREF object) {
				return createVALUEREFAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH <em>ADVANCEDPROPERTYPATH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH
	 * @generated
	 */
	public Adapter createADVANCEDPROPERTYPATHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH <em>BASICPROPERTYPATH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH
	 * @generated
	 */
	public Adapter createBASICPROPERTYPATHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.IDENTIFICATION <em>IDENTIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.IDENTIFICATION
	 * @generated
	 */
	public Adapter createIDENTIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.LOCALE <em>LOCALE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.LOCALE
	 * @generated
	 */
	public Adapter createLOCALEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING <em>LOCALIZEDSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING
	 * @generated
	 */
	public Adapter createLOCALIZEDSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.NUMERICVALUE <em>NUMERICVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.NUMERICVALUE
	 * @generated
	 */
	public Adapter createNUMERICVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.PARTY <em>PARTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.PARTY
	 * @generated
	 */
	public Adapter createPARTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.PROPERTYELM <em>PROPERTYELM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.PROPERTYELM
	 * @generated
	 */
	public Adapter createPROPERTYELMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.PROPERTYPATH <em>PROPERTYPATH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.PROPERTYPATH
	 * @generated
	 */
	public Adapter createPROPERTYPATHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT <em>QUERYAMOUNT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT
	 * @generated
	 */
	public Adapter createQUERYAMOUNTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.TargetValues <em>Target Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.TargetValues
	 * @generated
	 */
	public Adapter createTargetValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.TYPEDSTRING <em>TYPEDSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.TYPEDSTRING
	 * @generated
	 */
	public Adapter createTYPEDSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.UNITMAPPING <em>UNITMAPPING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.UNITMAPPING
	 * @generated
	 */
	public Adapter createUNITMAPPINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING <em>VALUEMAPPING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.VALUEMAPPING
	 * @generated
	 */
	public Adapter createVALUEMAPPINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemacommon_2_0Simplified.VALUEREF <em>VALUEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemacommon_2_0Simplified.VALUEREF
	 * @generated
	 */
	public Adapter createVALUEREFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Eclassxmlschemacommon_2_0SimplifiedAdapterFactory
