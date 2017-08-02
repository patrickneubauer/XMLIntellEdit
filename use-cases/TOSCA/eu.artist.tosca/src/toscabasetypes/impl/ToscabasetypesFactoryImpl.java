/**
 */
package toscabasetypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import toscabasetypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscabasetypesFactoryImpl extends EFactoryImpl implements ToscabasetypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToscabasetypesFactory init() {
		try {
			ToscabasetypesFactory theToscabasetypesFactory = (ToscabasetypesFactory)EPackage.Registry.INSTANCE.getEFactory(ToscabasetypesPackage.eNS_URI);
			if (theToscabasetypesFactory != null) {
				return theToscabasetypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToscabasetypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesFactoryImpl() {
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
			case ToscabasetypesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ToscabasetypesPackage.TSERVER_PROPERTIES: return createTServerProperties();
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
			case ToscabasetypesPackage.NUM_CPUS_TYPE:
				return createNumCpusTypeFromString(eDataType, initialValue);
			case ToscabasetypesPackage.NUM_CPUS_TYPE_OBJECT:
				return createNumCpusTypeObjectFromString(eDataType, initialValue);
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
			case ToscabasetypesPackage.NUM_CPUS_TYPE:
				return convertNumCpusTypeToString(eDataType, instanceValue);
			case ToscabasetypesPackage.NUM_CPUS_TYPE_OBJECT:
				return convertNumCpusTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public TServerProperties createTServerProperties() {
		TServerPropertiesImpl tServerProperties = new TServerPropertiesImpl();
		return tServerProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumCpusType createNumCpusTypeFromString(EDataType eDataType, String initialValue) {
		NumCpusType result = NumCpusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumCpusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumCpusType createNumCpusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumCpusTypeFromString(ToscabasetypesPackage.Literals.NUM_CPUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumCpusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumCpusTypeToString(ToscabasetypesPackage.Literals.NUM_CPUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscabasetypesPackage getToscabasetypesPackage() {
		return (ToscabasetypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToscabasetypesPackage getPackage() {
		return ToscabasetypesPackage.eINSTANCE;
	}

} //ToscabasetypesFactoryImpl
