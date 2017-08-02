/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface XontomlextensionsschemacoreSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xontomlextensionsschemacoreSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:x-ontoml-extensions:schema:coresimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cores";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XontomlextensionsschemacoreSimplifiedPackage eINSTANCE = xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDEAINSTANCESImpl <em>CONTAINEDEAINSTANCES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.CONTAINEDEAINSTANCESImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getCONTAINEDEAINSTANCES()
	 * @generated
	 */
	int CONTAINEDEAINSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Entity Eas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDEAINSTANCES__ENTITY_EAS = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDEAINSTANCES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDEAINSTANCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDEAINSTANCES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDEAINSTANCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDEATEMPLATESImpl <em>CONTAINEDEATEMPLATES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.CONTAINEDEATEMPLATESImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getCONTAINEDEATEMPLATES()
	 * @generated
	 */
	int CONTAINEDEATEMPLATES = 1;

	/**
	 * The feature id for the '<em><b>Ea Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDEATEMPLATES__EA_TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDEATEMPLATES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDEATEMPLATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDEATEMPLATES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDEATEMPLATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDRELATIONDEPRECATIONImpl <em>CONTAINEDRELATIONDEPRECATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.CONTAINEDRELATIONDEPRECATIONImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getCONTAINEDRELATIONDEPRECATION()
	 * @generated
	 */
	int CONTAINEDRELATIONDEPRECATION = 2;

	/**
	 * The feature id for the '<em><b>Deprecations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDRELATIONDEPRECATION__DEPRECATIONS = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDRELATIONDEPRECATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDRELATIONDEPRECATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDRELATIONDEPRECATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDRELATIONDEPRECATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl <em>DEPRECATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getDEPRECATION()
	 * @generated
	 */
	int DEPRECATION = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATION__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATION__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Rel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATION__REL_TYPE = 2;

	/**
	 * The number of structural features of the '<em>DEPRECATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DEPRECATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.EAREFERENCEImpl <em>EAREFERENCE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.EAREFERENCEImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEAREFERENCE()
	 * @generated
	 */
	int EAREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAREFERENCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAREFERENCE__TEMPLATE_ID = 1;

	/**
	 * The number of structural features of the '<em>EAREFERENCE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EAREFERENCE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl <em>EATEMPLATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEATEMPLATE()
	 * @generated
	 */
	int EATEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Type Of Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__TYPE_OF_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__ID = 2;

	/**
	 * The feature id for the '<em><b>Type Of Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__TYPE_OF_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__SOURCE_LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__SHORT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE__PREFERRED_NAME = 6;

	/**
	 * The number of structural features of the '<em>EATEMPLATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>EATEMPLATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.EAVALUATIONImpl <em>EAVALUATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.EAVALUATIONImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEAVALUATION()
	 * @generated
	 */
	int EAVALUATION = 6;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAVALUATION__TEMPLATE_ID = 0;

	/**
	 * The number of structural features of the '<em>EAVALUATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAVALUATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EAVALUATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAVALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.ENTITYEXTENDEDATTRIBUTESImpl <em>ENTITYEXTENDEDATTRIBUTES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.ENTITYEXTENDEDATTRIBUTESImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getENTITYEXTENDEDATTRIBUTES()
	 * @generated
	 */
	int ENTITYEXTENDEDATTRIBUTES = 7;

	/**
	 * The feature id for the '<em><b>Entity Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYEXTENDEDATTRIBUTES__ENTITY_REF = 0;

	/**
	 * The feature id for the '<em><b>Eas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYEXTENDEDATTRIBUTES__EAS = 1;

	/**
	 * The number of structural features of the '<em>ENTITYEXTENDEDATTRIBUTES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYEXTENDEDATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ENTITYEXTENDEDATTRIBUTES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITYEXTENDEDATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl <em>EXTENSIONS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEXTENSIONS()
	 * @generated
	 */
	int EXTENSIONS = 8;

	/**
	 * The feature id for the '<em><b>Contained Ea Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__CONTAINED_EA_TEMPLATES = 0;

	/**
	 * The feature id for the '<em><b>Contained Ea Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__CONTAINED_EA_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Contained Rel Deprecation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__CONTAINED_REL_DEPRECATION = 2;

	/**
	 * The number of structural features of the '<em>EXTENSIONS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EXTENSIONS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xontomlextensionsschemacoreSimplified.EAENTITYTYPEType <em>EAENTITYTYPE Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xontomlextensionsschemacoreSimplified.EAENTITYTYPEType
	 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEAENTITYTYPEType()
	 * @generated
	 */
	int EAENTITYTYPE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES <em>CONTAINEDEAINSTANCES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDEAINSTANCES</em>'.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES
	 * @generated
	 */
	EClass getCONTAINEDEAINSTANCES();

	/**
	 * Returns the meta object for the containment reference list '{@link xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES#getEntityEas <em>Entity Eas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Eas</em>'.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES#getEntityEas()
	 * @see #getCONTAINEDEAINSTANCES()
	 * @generated
	 */
	EReference getCONTAINEDEAINSTANCES_EntityEas();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES <em>CONTAINEDEATEMPLATES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDEATEMPLATES</em>'.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES
	 * @generated
	 */
	EClass getCONTAINEDEATEMPLATES();

	/**
	 * Returns the meta object for the containment reference list '{@link xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES#getEaTemplates <em>Ea Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ea Templates</em>'.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES#getEaTemplates()
	 * @see #getCONTAINEDEATEMPLATES()
	 * @generated
	 */
	EReference getCONTAINEDEATEMPLATES_EaTemplates();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION <em>CONTAINEDRELATIONDEPRECATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDRELATIONDEPRECATION</em>'.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION
	 * @generated
	 */
	EClass getCONTAINEDRELATIONDEPRECATION();

	/**
	 * Returns the meta object for the containment reference list '{@link xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION#getDeprecations <em>Deprecations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deprecations</em>'.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION#getDeprecations()
	 * @see #getCONTAINEDRELATIONDEPRECATION()
	 * @generated
	 */
	EReference getCONTAINEDRELATIONDEPRECATION_Deprecations();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.DEPRECATION <em>DEPRECATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEPRECATION</em>'.
	 * @see xontomlextensionsschemacoreSimplified.DEPRECATION
	 * @generated
	 */
	EClass getDEPRECATION();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.DEPRECATION#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see xontomlextensionsschemacoreSimplified.DEPRECATION#getContext()
	 * @see #getDEPRECATION()
	 * @generated
	 */
	EAttribute getDEPRECATION_Context();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.DEPRECATION#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see xontomlextensionsschemacoreSimplified.DEPRECATION#getEntity()
	 * @see #getDEPRECATION()
	 * @generated
	 */
	EAttribute getDEPRECATION_Entity();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.DEPRECATION#getRelType <em>Rel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Type</em>'.
	 * @see xontomlextensionsschemacoreSimplified.DEPRECATION#getRelType()
	 * @see #getDEPRECATION()
	 * @generated
	 */
	EAttribute getDEPRECATION_RelType();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.EAREFERENCE <em>EAREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAREFERENCE</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EAREFERENCE
	 * @generated
	 */
	EClass getEAREFERENCE();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.EAREFERENCE#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EAREFERENCE#getValue()
	 * @see #getEAREFERENCE()
	 * @generated
	 */
	EAttribute getEAREFERENCE_Value();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.EAREFERENCE#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EAREFERENCE#getTemplateId()
	 * @see #getEAREFERENCE()
	 * @generated
	 */
	EAttribute getEAREFERENCE_TemplateId();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE <em>EATEMPLATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EATEMPLATE</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE
	 * @generated
	 */
	EClass getEATEMPLATE();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfEntity <em>Type Of Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Of Entity</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfEntity()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EAttribute getEATEMPLATE_TypeOfEntity();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getCode()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EAttribute getEATEMPLATE_Code();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getId()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EAttribute getEATEMPLATE_Id();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfValue <em>Type Of Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Of Value</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfValue()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EReference getEATEMPLATE_TypeOfValue();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getSourceLanguage()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EReference getEATEMPLATE_SourceLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getShortName()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EReference getEATEMPLATE_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE#getPreferredName()
	 * @see #getEATEMPLATE()
	 * @generated
	 */
	EReference getEATEMPLATE_PreferredName();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.EAVALUATION <em>EAVALUATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAVALUATION</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EAVALUATION
	 * @generated
	 */
	EClass getEAVALUATION();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.EAVALUATION#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EAVALUATION#getTemplateId()
	 * @see #getEAVALUATION()
	 * @generated
	 */
	EAttribute getEAVALUATION_TemplateId();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES <em>ENTITYEXTENDEDATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENTITYEXTENDEDATTRIBUTES</em>'.
	 * @see xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES
	 * @generated
	 */
	EClass getENTITYEXTENDEDATTRIBUTES();

	/**
	 * Returns the meta object for the attribute '{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEntityRef <em>Entity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Ref</em>'.
	 * @see xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEntityRef()
	 * @see #getENTITYEXTENDEDATTRIBUTES()
	 * @generated
	 */
	EAttribute getENTITYEXTENDEDATTRIBUTES_EntityRef();

	/**
	 * Returns the meta object for the containment reference list '{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEas <em>Eas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eas</em>'.
	 * @see xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEas()
	 * @see #getENTITYEXTENDEDATTRIBUTES()
	 * @generated
	 */
	EReference getENTITYEXTENDEDATTRIBUTES_Eas();

	/**
	 * Returns the meta object for class '{@link xontomlextensionsschemacoreSimplified.EXTENSIONS <em>EXTENSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXTENSIONS</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EXTENSIONS
	 * @generated
	 */
	EClass getEXTENSIONS();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EXTENSIONS#getContainedEaTemplates <em>Contained Ea Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Ea Templates</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EXTENSIONS#getContainedEaTemplates()
	 * @see #getEXTENSIONS()
	 * @generated
	 */
	EReference getEXTENSIONS_ContainedEaTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EXTENSIONS#getContainedEaInstances <em>Contained Ea Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Ea Instances</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EXTENSIONS#getContainedEaInstances()
	 * @see #getEXTENSIONS()
	 * @generated
	 */
	EReference getEXTENSIONS_ContainedEaInstances();

	/**
	 * Returns the meta object for the containment reference '{@link xontomlextensionsschemacoreSimplified.EXTENSIONS#getContainedRelDeprecation <em>Contained Rel Deprecation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Rel Deprecation</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EXTENSIONS#getContainedRelDeprecation()
	 * @see #getEXTENSIONS()
	 * @generated
	 */
	EReference getEXTENSIONS_ContainedRelDeprecation();

	/**
	 * Returns the meta object for enum '{@link xontomlextensionsschemacoreSimplified.EAENTITYTYPEType <em>EAENTITYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EAENTITYTYPE Type</em>'.
	 * @see xontomlextensionsschemacoreSimplified.EAENTITYTYPEType
	 * @generated
	 */
	EEnum getEAENTITYTYPEType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XontomlextensionsschemacoreSimplifiedFactory getXontomlextensionsschemacoreSimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDEAINSTANCESImpl <em>CONTAINEDEAINSTANCES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.CONTAINEDEAINSTANCESImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getCONTAINEDEAINSTANCES()
		 * @generated
		 */
		EClass CONTAINEDEAINSTANCES = eINSTANCE.getCONTAINEDEAINSTANCES();

		/**
		 * The meta object literal for the '<em><b>Entity Eas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINEDEAINSTANCES__ENTITY_EAS = eINSTANCE.getCONTAINEDEAINSTANCES_EntityEas();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDEATEMPLATESImpl <em>CONTAINEDEATEMPLATES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.CONTAINEDEATEMPLATESImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getCONTAINEDEATEMPLATES()
		 * @generated
		 */
		EClass CONTAINEDEATEMPLATES = eINSTANCE.getCONTAINEDEATEMPLATES();

		/**
		 * The meta object literal for the '<em><b>Ea Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINEDEATEMPLATES__EA_TEMPLATES = eINSTANCE.getCONTAINEDEATEMPLATES_EaTemplates();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDRELATIONDEPRECATIONImpl <em>CONTAINEDRELATIONDEPRECATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.CONTAINEDRELATIONDEPRECATIONImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getCONTAINEDRELATIONDEPRECATION()
		 * @generated
		 */
		EClass CONTAINEDRELATIONDEPRECATION = eINSTANCE.getCONTAINEDRELATIONDEPRECATION();

		/**
		 * The meta object literal for the '<em><b>Deprecations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINEDRELATIONDEPRECATION__DEPRECATIONS = eINSTANCE.getCONTAINEDRELATIONDEPRECATION_Deprecations();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl <em>DEPRECATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getDEPRECATION()
		 * @generated
		 */
		EClass DEPRECATION = eINSTANCE.getDEPRECATION();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPRECATION__CONTEXT = eINSTANCE.getDEPRECATION_Context();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPRECATION__ENTITY = eINSTANCE.getDEPRECATION_Entity();

		/**
		 * The meta object literal for the '<em><b>Rel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPRECATION__REL_TYPE = eINSTANCE.getDEPRECATION_RelType();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.EAREFERENCEImpl <em>EAREFERENCE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.EAREFERENCEImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEAREFERENCE()
		 * @generated
		 */
		EClass EAREFERENCE = eINSTANCE.getEAREFERENCE();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAREFERENCE__VALUE = eINSTANCE.getEAREFERENCE_Value();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAREFERENCE__TEMPLATE_ID = eINSTANCE.getEAREFERENCE_TemplateId();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl <em>EATEMPLATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEATEMPLATE()
		 * @generated
		 */
		EClass EATEMPLATE = eINSTANCE.getEATEMPLATE();

		/**
		 * The meta object literal for the '<em><b>Type Of Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATEMPLATE__TYPE_OF_ENTITY = eINSTANCE.getEATEMPLATE_TypeOfEntity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATEMPLATE__CODE = eINSTANCE.getEATEMPLATE_Code();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATEMPLATE__ID = eINSTANCE.getEATEMPLATE_Id();

		/**
		 * The meta object literal for the '<em><b>Type Of Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATEMPLATE__TYPE_OF_VALUE = eINSTANCE.getEATEMPLATE_TypeOfValue();

		/**
		 * The meta object literal for the '<em><b>Source Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATEMPLATE__SOURCE_LANGUAGE = eINSTANCE.getEATEMPLATE_SourceLanguage();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATEMPLATE__SHORT_NAME = eINSTANCE.getEATEMPLATE_ShortName();

		/**
		 * The meta object literal for the '<em><b>Preferred Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATEMPLATE__PREFERRED_NAME = eINSTANCE.getEATEMPLATE_PreferredName();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.EAVALUATIONImpl <em>EAVALUATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.EAVALUATIONImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEAVALUATION()
		 * @generated
		 */
		EClass EAVALUATION = eINSTANCE.getEAVALUATION();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAVALUATION__TEMPLATE_ID = eINSTANCE.getEAVALUATION_TemplateId();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.ENTITYEXTENDEDATTRIBUTESImpl <em>ENTITYEXTENDEDATTRIBUTES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.ENTITYEXTENDEDATTRIBUTESImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getENTITYEXTENDEDATTRIBUTES()
		 * @generated
		 */
		EClass ENTITYEXTENDEDATTRIBUTES = eINSTANCE.getENTITYEXTENDEDATTRIBUTES();

		/**
		 * The meta object literal for the '<em><b>Entity Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITYEXTENDEDATTRIBUTES__ENTITY_REF = eINSTANCE.getENTITYEXTENDEDATTRIBUTES_EntityRef();

		/**
		 * The meta object literal for the '<em><b>Eas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITYEXTENDEDATTRIBUTES__EAS = eINSTANCE.getENTITYEXTENDEDATTRIBUTES_Eas();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl <em>EXTENSIONS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEXTENSIONS()
		 * @generated
		 */
		EClass EXTENSIONS = eINSTANCE.getEXTENSIONS();

		/**
		 * The meta object literal for the '<em><b>Contained Ea Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS__CONTAINED_EA_TEMPLATES = eINSTANCE.getEXTENSIONS_ContainedEaTemplates();

		/**
		 * The meta object literal for the '<em><b>Contained Ea Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS__CONTAINED_EA_INSTANCES = eINSTANCE.getEXTENSIONS_ContainedEaInstances();

		/**
		 * The meta object literal for the '<em><b>Contained Rel Deprecation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS__CONTAINED_REL_DEPRECATION = eINSTANCE.getEXTENSIONS_ContainedRelDeprecation();

		/**
		 * The meta object literal for the '{@link xontomlextensionsschemacoreSimplified.EAENTITYTYPEType <em>EAENTITYTYPE Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xontomlextensionsschemacoreSimplified.EAENTITYTYPEType
		 * @see xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl#getEAENTITYTYPEType()
		 * @generated
		 */
		EEnum EAENTITYTYPE_TYPE = eINSTANCE.getEAENTITYTYPEType();

	}

} //XontomlextensionsschemacoreSimplifiedPackage
