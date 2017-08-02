/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES;
import xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES;
import xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION;
import xontomlextensionsschemacoreSimplified.DEPRECATION;
import xontomlextensionsschemacoreSimplified.EAENTITYTYPEType;
import xontomlextensionsschemacoreSimplified.EAREFERENCE;
import xontomlextensionsschemacoreSimplified.EATEMPLATE;
import xontomlextensionsschemacoreSimplified.EAVALUATION;
import xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedFactory;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XontomlextensionsschemacoreSimplifiedFactoryImpl extends EFactoryImpl implements XontomlextensionsschemacoreSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XontomlextensionsschemacoreSimplifiedFactory init() {
		try {
			XontomlextensionsschemacoreSimplifiedFactory theXontomlextensionsschemacoreSimplifiedFactory = (XontomlextensionsschemacoreSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI);
			if (theXontomlextensionsschemacoreSimplifiedFactory != null) {
				return theXontomlextensionsschemacoreSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XontomlextensionsschemacoreSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XontomlextensionsschemacoreSimplifiedFactoryImpl() {
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES: return createCONTAINEDEAINSTANCES();
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES: return createCONTAINEDEATEMPLATES();
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION: return createCONTAINEDRELATIONDEPRECATION();
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION: return createDEPRECATION();
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE: return createEAREFERENCE();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE: return createEATEMPLATE();
			case XontomlextensionsschemacoreSimplifiedPackage.EAVALUATION: return createEAVALUATION();
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES: return createENTITYEXTENDEDATTRIBUTES();
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS: return createEXTENSIONS();
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
			case XontomlextensionsschemacoreSimplifiedPackage.EAENTITYTYPE_TYPE:
				return createEAENTITYTYPETypeFromString(eDataType, initialValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EAENTITYTYPE_TYPE:
				return convertEAENTITYTYPETypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDEAINSTANCES createCONTAINEDEAINSTANCES() {
		CONTAINEDEAINSTANCESImpl containedeainstances = new CONTAINEDEAINSTANCESImpl();
		return containedeainstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDEATEMPLATES createCONTAINEDEATEMPLATES() {
		CONTAINEDEATEMPLATESImpl containedeatemplates = new CONTAINEDEATEMPLATESImpl();
		return containedeatemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDRELATIONDEPRECATION createCONTAINEDRELATIONDEPRECATION() {
		CONTAINEDRELATIONDEPRECATIONImpl containedrelationdeprecation = new CONTAINEDRELATIONDEPRECATIONImpl();
		return containedrelationdeprecation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEPRECATION createDEPRECATION() {
		DEPRECATIONImpl deprecation = new DEPRECATIONImpl();
		return deprecation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAREFERENCE createEAREFERENCE() {
		EAREFERENCEImpl eareference = new EAREFERENCEImpl();
		return eareference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EATEMPLATE createEATEMPLATE() {
		EATEMPLATEImpl eatemplate = new EATEMPLATEImpl();
		return eatemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAVALUATION createEAVALUATION() {
		EAVALUATIONImpl eavaluation = new EAVALUATIONImpl();
		return eavaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENTITYEXTENDEDATTRIBUTES createENTITYEXTENDEDATTRIBUTES() {
		ENTITYEXTENDEDATTRIBUTESImpl entityextendedattributes = new ENTITYEXTENDEDATTRIBUTESImpl();
		return entityextendedattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTENSIONS createEXTENSIONS() {
		EXTENSIONSImpl extensions = new EXTENSIONSImpl();
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAENTITYTYPEType createEAENTITYTYPETypeFromString(EDataType eDataType, String initialValue) {
		EAENTITYTYPEType result = EAENTITYTYPEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEAENTITYTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XontomlextensionsschemacoreSimplifiedPackage getXontomlextensionsschemacoreSimplifiedPackage() {
		return (XontomlextensionsschemacoreSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XontomlextensionsschemacoreSimplifiedPackage getPackage() {
		return XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE;
	}

} //XontomlextensionsschemacoreSimplifiedFactoryImpl
