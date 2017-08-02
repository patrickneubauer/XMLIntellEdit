/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.impl.Eclassxmlschemacommon_2_0SimplifiedPackageImpl;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage;
import eclassxmlschemadictionary_2_0Simplified.impl.Eclassxmlschemadictionary_2_0SimplifiedPackageImpl;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl;
import xontomlextensionsschemacoreSimplified.EAENTITYTYPEType;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedFactory;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;
import xontomlextensionsschemacoreSimplified.util.XontomlextensionsschemacoreSimplifiedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XontomlextensionsschemacoreSimplifiedPackageImpl extends EPackageImpl implements XontomlextensionsschemacoreSimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedeainstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedeatemplatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedrelationdeprecationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eareferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eatemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eavaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityextendedattributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eaentitytypeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XontomlextensionsschemacoreSimplifiedPackageImpl() {
		super(eNS_URI, XontomlextensionsschemacoreSimplifiedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XontomlextensionsschemacoreSimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XontomlextensionsschemacoreSimplifiedPackage init() {
		if (isInited) return (XontomlextensionsschemacoreSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		XontomlextensionsschemacoreSimplifiedPackageImpl theXontomlextensionsschemacoreSimplifiedPackage = (XontomlextensionsschemacoreSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XontomlextensionsschemacoreSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XontomlextensionsschemacoreSimplifiedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Eclassxmlschemadictionary_2_0SimplifiedPackageImpl theEclassxmlschemadictionary_2_0SimplifiedPackage = (Eclassxmlschemadictionary_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemadictionary_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemadictionary_2_0SimplifiedPackage.eINSTANCE);
		Eclassxmlschemaheader_2_0SimplifiedPackageImpl theEclassxmlschemaheader_2_0SimplifiedPackage = (Eclassxmlschemaheader_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemaheader_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemaheader_2_0SimplifiedPackage.eINSTANCE);
		Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) instanceof Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) : Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE);
		Eclassxmlschemacommon_2_0SimplifiedPackageImpl theEclassxmlschemacommon_2_0SimplifiedPackage = (Eclassxmlschemacommon_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemacommon_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE);
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE);

		// Create package meta-data objects
		theXontomlextensionsschemacoreSimplifiedPackage.createPackageContents();
		theEclassxmlschemadictionary_2_0SimplifiedPackage.createPackageContents();
		theEclassxmlschemaheader_2_0SimplifiedPackage.createPackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.createPackageContents();
		theEclassxmlschemacommon_2_0SimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theXontomlextensionsschemacoreSimplifiedPackage.initializePackageContents();
		theEclassxmlschemadictionary_2_0SimplifiedPackage.initializePackageContents();
		theEclassxmlschemaheader_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.initializePackageContents();
		theEclassxmlschemacommon_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXontomlextensionsschemacoreSimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return XontomlextensionsschemacoreSimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXontomlextensionsschemacoreSimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI, theXontomlextensionsschemacoreSimplifiedPackage);
		return theXontomlextensionsschemacoreSimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDEAINSTANCES() {
		return containedeainstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDEAINSTANCES_EntityEas() {
		return (EReference)containedeainstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDEATEMPLATES() {
		return containedeatemplatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDEATEMPLATES_EaTemplates() {
		return (EReference)containedeatemplatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDRELATIONDEPRECATION() {
		return containedrelationdeprecationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDRELATIONDEPRECATION_Deprecations() {
		return (EReference)containedrelationdeprecationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEPRECATION() {
		return deprecationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEPRECATION_Context() {
		return (EAttribute)deprecationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEPRECATION_Entity() {
		return (EAttribute)deprecationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEPRECATION_RelType() {
		return (EAttribute)deprecationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAREFERENCE() {
		return eareferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAREFERENCE_Value() {
		return (EAttribute)eareferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAREFERENCE_TemplateId() {
		return (EAttribute)eareferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEATEMPLATE() {
		return eatemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATEMPLATE_TypeOfEntity() {
		return (EAttribute)eatemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATEMPLATE_Code() {
		return (EAttribute)eatemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATEMPLATE_Id() {
		return (EAttribute)eatemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEATEMPLATE_TypeOfValue() {
		return (EReference)eatemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEATEMPLATE_SourceLanguage() {
		return (EReference)eatemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEATEMPLATE_ShortName() {
		return (EReference)eatemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEATEMPLATE_PreferredName() {
		return (EReference)eatemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAVALUATION() {
		return eavaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAVALUATION_TemplateId() {
		return (EAttribute)eavaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENTITYEXTENDEDATTRIBUTES() {
		return entityextendedattributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENTITYEXTENDEDATTRIBUTES_EntityRef() {
		return (EAttribute)entityextendedattributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENTITYEXTENDEDATTRIBUTES_Eas() {
		return (EReference)entityextendedattributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXTENSIONS() {
		return extensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXTENSIONS_ContainedEaTemplates() {
		return (EReference)extensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXTENSIONS_ContainedEaInstances() {
		return (EReference)extensionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXTENSIONS_ContainedRelDeprecation() {
		return (EReference)extensionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEAENTITYTYPEType() {
		return eaentitytypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XontomlextensionsschemacoreSimplifiedFactory getXontomlextensionsschemacoreSimplifiedFactory() {
		return (XontomlextensionsschemacoreSimplifiedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containedeainstancesEClass = createEClass(CONTAINEDEAINSTANCES);
		createEReference(containedeainstancesEClass, CONTAINEDEAINSTANCES__ENTITY_EAS);

		containedeatemplatesEClass = createEClass(CONTAINEDEATEMPLATES);
		createEReference(containedeatemplatesEClass, CONTAINEDEATEMPLATES__EA_TEMPLATES);

		containedrelationdeprecationEClass = createEClass(CONTAINEDRELATIONDEPRECATION);
		createEReference(containedrelationdeprecationEClass, CONTAINEDRELATIONDEPRECATION__DEPRECATIONS);

		deprecationEClass = createEClass(DEPRECATION);
		createEAttribute(deprecationEClass, DEPRECATION__CONTEXT);
		createEAttribute(deprecationEClass, DEPRECATION__ENTITY);
		createEAttribute(deprecationEClass, DEPRECATION__REL_TYPE);

		eareferenceEClass = createEClass(EAREFERENCE);
		createEAttribute(eareferenceEClass, EAREFERENCE__VALUE);
		createEAttribute(eareferenceEClass, EAREFERENCE__TEMPLATE_ID);

		eatemplateEClass = createEClass(EATEMPLATE);
		createEAttribute(eatemplateEClass, EATEMPLATE__TYPE_OF_ENTITY);
		createEAttribute(eatemplateEClass, EATEMPLATE__CODE);
		createEAttribute(eatemplateEClass, EATEMPLATE__ID);
		createEReference(eatemplateEClass, EATEMPLATE__TYPE_OF_VALUE);
		createEReference(eatemplateEClass, EATEMPLATE__SOURCE_LANGUAGE);
		createEReference(eatemplateEClass, EATEMPLATE__SHORT_NAME);
		createEReference(eatemplateEClass, EATEMPLATE__PREFERRED_NAME);

		eavaluationEClass = createEClass(EAVALUATION);
		createEAttribute(eavaluationEClass, EAVALUATION__TEMPLATE_ID);

		entityextendedattributesEClass = createEClass(ENTITYEXTENDEDATTRIBUTES);
		createEAttribute(entityextendedattributesEClass, ENTITYEXTENDEDATTRIBUTES__ENTITY_REF);
		createEReference(entityextendedattributesEClass, ENTITYEXTENDEDATTRIBUTES__EAS);

		extensionsEClass = createEClass(EXTENSIONS);
		createEReference(extensionsEClass, EXTENSIONS__CONTAINED_EA_TEMPLATES);
		createEReference(extensionsEClass, EXTENSIONS__CONTAINED_EA_INSTANCES);
		createEReference(extensionsEClass, EXTENSIONS__CONTAINED_REL_DEPRECATION);

		// Create enums
		eaentitytypeTypeEEnum = createEEnum(EAENTITYTYPE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(containedeainstancesEClass, xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES.class, "CONTAINEDEAINSTANCES", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCONTAINEDEAINSTANCES_EntityEas(), this.getENTITYEXTENDEDATTRIBUTES(), null, "entityEas", null, 1, -1, xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedeatemplatesEClass, xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES.class, "CONTAINEDEATEMPLATES", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCONTAINEDEATEMPLATES_EaTemplates(), this.getEATEMPLATE(), null, "eaTemplates", null, 1, -1, xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedrelationdeprecationEClass, xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION.class, "CONTAINEDRELATIONDEPRECATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCONTAINEDRELATIONDEPRECATION_Deprecations(), this.getDEPRECATION(), null, "deprecations", null, 1, -1, xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deprecationEClass, xontomlextensionsschemacoreSimplified.DEPRECATION.class, "DEPRECATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEPRECATION_Context(), ecorePackage.getEString(), "context", null, 1, 1, xontomlextensionsschemacoreSimplified.DEPRECATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEPRECATION_Entity(), ecorePackage.getEString(), "entity", null, 0, 1, xontomlextensionsschemacoreSimplified.DEPRECATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEPRECATION_RelType(), ecorePackage.getEString(), "relType", null, 1, 1, xontomlextensionsschemacoreSimplified.DEPRECATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eareferenceEClass, xontomlextensionsschemacoreSimplified.EAREFERENCE.class, "EAREFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAREFERENCE_Value(), ecorePackage.getEString(), "value", null, 0, 1, xontomlextensionsschemacoreSimplified.EAREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAREFERENCE_TemplateId(), ecorePackage.getEString(), "templateId", null, 1, 1, xontomlextensionsschemacoreSimplified.EAREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eatemplateEClass, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, "EATEMPLATE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEATEMPLATE_TypeOfEntity(), this.getEAENTITYTYPEType(), "typeOfEntity", null, 1, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEATEMPLATE_Code(), ecorePackage.getEString(), "code", null, 0, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEATEMPLATE_Id(), ecorePackage.getEString(), "id", null, 1, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEATEMPLATE_TypeOfValue(), theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.getANYTYPE(), null, "typeOfValue", null, 1, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEATEMPLATE_SourceLanguage(), theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.getLANGUAGE(), null, "sourceLanguage", null, 1, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEATEMPLATE_ShortName(), theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.getSHORTNAME(), null, "shortName", null, 0, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEATEMPLATE_PreferredName(), theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.getPREFERREDNAME(), null, "preferredName", null, 0, 1, xontomlextensionsschemacoreSimplified.EATEMPLATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eavaluationEClass, xontomlextensionsschemacoreSimplified.EAVALUATION.class, "EAVALUATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAVALUATION_TemplateId(), ecorePackage.getEString(), "templateId", null, 1, 1, xontomlextensionsschemacoreSimplified.EAVALUATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityextendedattributesEClass, xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES.class, "ENTITYEXTENDEDATTRIBUTES", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENTITYEXTENDEDATTRIBUTES_EntityRef(), ecorePackage.getEString(), "entityRef", null, 1, 1, xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getENTITYEXTENDEDATTRIBUTES_Eas(), this.getEAVALUATION(), null, "eas", null, 1, -1, xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionsEClass, xontomlextensionsschemacoreSimplified.EXTENSIONS.class, "EXTENSIONS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEXTENSIONS_ContainedEaTemplates(), this.getCONTAINEDEATEMPLATES(), null, "containedEaTemplates", null, 0, 1, xontomlextensionsschemacoreSimplified.EXTENSIONS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEXTENSIONS_ContainedEaInstances(), this.getCONTAINEDEAINSTANCES(), null, "containedEaInstances", null, 0, 1, xontomlextensionsschemacoreSimplified.EXTENSIONS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEXTENSIONS_ContainedRelDeprecation(), this.getCONTAINEDRELATIONDEPRECATION(), null, "containedRelDeprecation", null, 0, 1, xontomlextensionsschemacoreSimplified.EXTENSIONS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eaentitytypeTypeEEnum, EAENTITYTYPEType.class, "EAENTITYTYPEType");
		addEEnumLiteral(eaentitytypeTypeEEnum, EAENTITYTYPEType._01);
		addEEnumLiteral(eaentitytypeTypeEEnum, EAENTITYTYPEType._02);
		addEEnumLiteral(eaentitytypeTypeEEnum, EAENTITYTYPEType._);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (deprecationEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternContext patternEntity"
		   });	
		addAnnotation
		  (eareferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "maxLengthTemplateId"
		   });	
		addAnnotation
		  (eatemplateEClass, 
		   source, 
		   new String[] {
			 "constraints", "maxLengthCode maxLengthId"
		   });	
		addAnnotation
		  (eavaluationEClass, 
		   source, 
		   new String[] {
			 "constraints", "maxLengthTemplateId"
		   });	
		addAnnotation
		  (entityextendedattributesEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternEntityRef"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (deprecationEClass, 
		   source, 
		   new String[] {
			 "patternContext", "self.context.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.context.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.context.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternEntity", "(self.entity=null) or self.entity.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.entity.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.entity.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (eareferenceEClass, 
		   source, 
		   new String[] {
			 "maxLengthTemplateId", "self.templateId.size() <= 100"
		   });	
		addAnnotation
		  (eatemplateEClass, 
		   source, 
		   new String[] {
			 "maxLengthCode", "(self.code = null) or self.code.size() <= 100",
			 "maxLengthId", "self.id.size() <= 100"
		   });	
		addAnnotation
		  (eavaluationEClass, 
		   source, 
		   new String[] {
			 "maxLengthTemplateId", "self.templateId.size() <= 100"
		   });	
		addAnnotation
		  (entityextendedattributesEClass, 
		   source, 
		   new String[] {
			 "patternEntityRef", "self.entityRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.entityRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.entityRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });
	}

} //XontomlextensionsschemacoreSimplifiedPackageImpl
