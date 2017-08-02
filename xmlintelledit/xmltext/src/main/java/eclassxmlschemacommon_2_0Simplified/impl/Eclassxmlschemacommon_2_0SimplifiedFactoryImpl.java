/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.CONTENTMODELType;
import eclassxmlschemacommon_2_0Simplified.Contact;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eclassxmlschemacommon_2_0SimplifiedFactoryImpl extends EFactoryImpl implements Eclassxmlschemacommon_2_0SimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Eclassxmlschemacommon_2_0SimplifiedFactory init() {
		try {
			Eclassxmlschemacommon_2_0SimplifiedFactory theEclassxmlschemacommon_2_0SimplifiedFactory = (Eclassxmlschemacommon_2_0SimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI);
			if (theEclassxmlschemacommon_2_0SimplifiedFactory != null) {
				return theEclassxmlschemacommon_2_0SimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Eclassxmlschemacommon_2_0SimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemacommon_2_0SimplifiedFactoryImpl() {
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH: return createADVANCEDPROPERTYPATH();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH: return createBASICPROPERTYPATH();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT: return createContact();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.IDENTIFICATION: return createIDENTIFICATION();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE: return createLOCALE();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALIZEDSTRING: return createLOCALIZEDSTRING();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.NUMERICVALUE: return createNUMERICVALUE();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PARTY: return createPARTY();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM: return createPROPERTYELM();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYPATH: return createPROPERTYPATH();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT: return createQUERYAMOUNT();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES: return createTargetValues();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TYPEDSTRING: return createTYPEDSTRING();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING: return createUNITMAPPING();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING: return createVALUEMAPPING();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEREF: return createVALUEREF();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTENTMODEL_TYPE:
				return createCONTENTMODELTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTENTMODEL_TYPE:
				return convertCONTENTMODELTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADVANCEDPROPERTYPATH createADVANCEDPROPERTYPATH() {
		ADVANCEDPROPERTYPATHImpl advancedpropertypath = new ADVANCEDPROPERTYPATHImpl();
		return advancedpropertypath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BASICPROPERTYPATH createBASICPROPERTYPATH() {
		BASICPROPERTYPATHImpl basicpropertypath = new BASICPROPERTYPATHImpl();
		return basicpropertypath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDENTIFICATION createIDENTIFICATION() {
		IDENTIFICATIONImpl identification = new IDENTIFICATIONImpl();
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOCALE createLOCALE() {
		LOCALEImpl locale = new LOCALEImpl();
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOCALIZEDSTRING createLOCALIZEDSTRING() {
		LOCALIZEDSTRINGImpl localizedstring = new LOCALIZEDSTRINGImpl();
		return localizedstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUMERICVALUE createNUMERICVALUE() {
		NUMERICVALUEImpl numericvalue = new NUMERICVALUEImpl();
		return numericvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARTY createPARTY() {
		PARTYImpl party = new PARTYImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYELM createPROPERTYELM() {
		PROPERTYELMImpl propertyelm = new PROPERTYELMImpl();
		return propertyelm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYPATH createPROPERTYPATH() {
		PROPERTYPATHImpl propertypath = new PROPERTYPATHImpl();
		return propertypath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUERYAMOUNT createQUERYAMOUNT() {
		QUERYAMOUNTImpl queryamount = new QUERYAMOUNTImpl();
		return queryamount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetValues createTargetValues() {
		TargetValuesImpl targetValues = new TargetValuesImpl();
		return targetValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEDSTRING createTYPEDSTRING() {
		TYPEDSTRINGImpl typedstring = new TYPEDSTRINGImpl();
		return typedstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNITMAPPING createUNITMAPPING() {
		UNITMAPPINGImpl unitmapping = new UNITMAPPINGImpl();
		return unitmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUEMAPPING createVALUEMAPPING() {
		VALUEMAPPINGImpl valuemapping = new VALUEMAPPINGImpl();
		return valuemapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUEREF createVALUEREF() {
		VALUEREFImpl valueref = new VALUEREFImpl();
		return valueref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTENTMODELType createCONTENTMODELTypeFromString(EDataType eDataType, String initialValue) {
		CONTENTMODELType result = CONTENTMODELType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCONTENTMODELTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemacommon_2_0SimplifiedPackage getEclassxmlschemacommon_2_0SimplifiedPackage() {
		return (Eclassxmlschemacommon_2_0SimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Eclassxmlschemacommon_2_0SimplifiedPackage getPackage() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE;
	}

} //Eclassxmlschemacommon_2_0SimplifiedFactoryImpl
