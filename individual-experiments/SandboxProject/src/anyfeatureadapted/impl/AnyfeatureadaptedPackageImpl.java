/**
 */
package anyfeatureadapted.impl;

import anyfeatureadapted.AnyGenericAttribute;
import anyfeatureadapted.AnyGenericConstruct;
import anyfeatureadapted.AnyGenericElement;
import anyfeatureadapted.AnyGenericText;
import anyfeatureadapted.AnyfeatureadaptedFactory;
import anyfeatureadapted.AnyfeatureadaptedPackage;
import anyfeatureadapted.DocumentRoot;
import anyfeatureadapted.Element1;
import anyfeatureadapted.Properties;
import anyfeatureadapted.RootElementType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnyfeatureadaptedPackageImpl extends EPackageImpl implements AnyfeatureadaptedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericTextEClass = null;

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
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnyfeatureadaptedPackageImpl() {
		super(eNS_URI, AnyfeatureadaptedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnyfeatureadaptedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnyfeatureadaptedPackage init() {
		if (isInited) return (AnyfeatureadaptedPackage)EPackage.Registry.INSTANCE.getEPackage(AnyfeatureadaptedPackage.eNS_URI);

		// Obtain or create and register package
		AnyfeatureadaptedPackageImpl theAnyfeatureadaptedPackage = (AnyfeatureadaptedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnyfeatureadaptedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnyfeatureadaptedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnyfeatureadaptedPackage.createPackageContents();

		// Initialize created meta-data
		theAnyfeatureadaptedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnyfeatureadaptedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnyfeatureadaptedPackage.eNS_URI, theAnyfeatureadaptedPackage);
		return theAnyfeatureadaptedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RootElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement1() {
		return element1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement1_City() {
		return (EAttribute)element1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement1_Street() {
		return (EAttribute)element1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_AnyGenericElem() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElementType() {
		return rootElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_Element1() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_Properties() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericConstruct() {
		return anyGenericConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericElement() {
		return anyGenericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericElement_ElemName() {
		return (EAttribute)anyGenericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyGenericElement_AnyGenericAttr() {
		return (EReference)anyGenericElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericElement_ElemValue() {
		return (EAttribute)anyGenericElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyGenericElement_ChildElem() {
		return (EReference)anyGenericElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericAttribute() {
		return anyGenericAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericAttribute_AttrName() {
		return (EAttribute)anyGenericAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericAttribute_AttrValue() {
		return (EAttribute)anyGenericAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericText() {
		return anyGenericTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericText_TextValue() {
		return (EAttribute)anyGenericTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyfeatureadaptedFactory getAnyfeatureadaptedFactory() {
		return (AnyfeatureadaptedFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT_ELEMENT);

		element1EClass = createEClass(ELEMENT1);
		createEAttribute(element1EClass, ELEMENT1__CITY);
		createEAttribute(element1EClass, ELEMENT1__STREET);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__ANY_GENERIC_ELEM);

		rootElementTypeEClass = createEClass(ROOT_ELEMENT_TYPE);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ELEMENT1);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__PROPERTIES);

		anyGenericConstructEClass = createEClass(ANY_GENERIC_CONSTRUCT);

		anyGenericElementEClass = createEClass(ANY_GENERIC_ELEMENT);
		createEAttribute(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ELEM_NAME);
		createEReference(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR);
		createEAttribute(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ELEM_VALUE);
		createEReference(anyGenericElementEClass, ANY_GENERIC_ELEMENT__CHILD_ELEM);

		anyGenericAttributeEClass = createEClass(ANY_GENERIC_ATTRIBUTE);
		createEAttribute(anyGenericAttributeEClass, ANY_GENERIC_ATTRIBUTE__ATTR_NAME);
		createEAttribute(anyGenericAttributeEClass, ANY_GENERIC_ATTRIBUTE__ATTR_VALUE);

		anyGenericTextEClass = createEClass(ANY_GENERIC_TEXT);
		createEAttribute(anyGenericTextEClass, ANY_GENERIC_TEXT__TEXT_VALUE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anyGenericElementEClass.getESuperTypes().add(this.getAnyGenericConstruct());
		anyGenericTextEClass.getESuperTypes().add(this.getAnyGenericConstruct());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RootElement(), this.getRootElementType(), null, "rootElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(element1EClass, Element1.class, "Element1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement1_City(), theXMLTypePackage.getString(), "city", null, 0, 1, Element1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement1_Street(), theXMLTypePackage.getString(), "street", null, 0, 1, Element1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_AnyGenericElem(), this.getAnyGenericConstruct(), null, "anyGenericElem", null, 1, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootElementTypeEClass, RootElementType.class, "RootElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootElementType_Element1(), this.getElement1(), null, "element1", null, 1, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_Properties(), this.getProperties(), null, "properties", null, 0, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyGenericConstructEClass, AnyGenericConstruct.class, "AnyGenericConstruct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyGenericElementEClass, AnyGenericElement.class, "AnyGenericElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyGenericElement_ElemName(), theXMLTypePackage.getString(), "elemName", null, 0, 1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyGenericElement_AnyGenericAttr(), this.getAnyGenericAttribute(), null, "anyGenericAttr", null, 0, -1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyGenericElement_ElemValue(), theXMLTypePackage.getString(), "elemValue", null, 0, 1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyGenericElement_ChildElem(), this.getAnyGenericElement(), null, "childElem", null, 0, -1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyGenericAttributeEClass, AnyGenericAttribute.class, "AnyGenericAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyGenericAttribute_AttrName(), theXMLTypePackage.getString(), "attrName", null, 1, 1, AnyGenericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyGenericAttribute_AttrValue(), theXMLTypePackage.getString(), "attrValue", null, 1, 1, AnyGenericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyGenericTextEClass, AnyGenericText.class, "AnyGenericText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyGenericText_TextValue(), theXMLTypePackage.getString(), "textValue", null, 0, 1, AnyGenericText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_RootElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rootElement",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (element1EClass, 
		   source, 
		   new String[] {
			 "name", "Element1",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getElement1_City(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "city"
		   });	
		addAnnotation
		  (getElement1_Street(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "street"
		   });	
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] {
			 "name", "Properties",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRootElementType_Element1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "element1"
		   });	
		addAnnotation
		  (getRootElementType_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties"
		   });
	}

} //AnyfeatureadaptedPackageImpl
