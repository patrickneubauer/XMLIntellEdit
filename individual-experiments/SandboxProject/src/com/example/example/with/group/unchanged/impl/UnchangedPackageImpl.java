/**
 */
package com.example.example.with.group.unchanged.impl;

import com.example.example.with.group.unchanged.DocumentRoot;
import com.example.example.with.group.unchanged.Element1;
import com.example.example.with.group.unchanged.Element2;
import com.example.example.with.group.unchanged.Element3;
import com.example.example.with.group.unchanged.RootElementType;
import com.example.example.with.group.unchanged.UnchangedFactory;
import com.example.example.with.group.unchanged.UnchangedPackage;

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
public class UnchangedPackageImpl extends EPackageImpl implements UnchangedPackage {
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
	private EClass element2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementTypeEClass = null;

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
	 * @see com.example.example.with.group.unchanged.UnchangedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnchangedPackageImpl() {
		super(eNS_URI, UnchangedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnchangedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnchangedPackage init() {
		if (isInited) return (UnchangedPackage)EPackage.Registry.INSTANCE.getEPackage(UnchangedPackage.eNS_URI);

		// Obtain or create and register package
		UnchangedPackageImpl theUnchangedPackage = (UnchangedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnchangedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnchangedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUnchangedPackage.createPackageContents();

		// Initialize created meta-data
		theUnchangedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnchangedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnchangedPackage.eNS_URI, theUnchangedPackage);
		return theUnchangedPackage;
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
	public EAttribute getElement1_Group() {
		return (EAttribute)element1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement1_RepeatableElement1() {
		return (EAttribute)element1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement1_RepeatableElement2() {
		return (EAttribute)element1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement1_RepeatableElement3() {
		return (EAttribute)element1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement2() {
		return element2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement2_ModelGroupElement1() {
		return (EAttribute)element2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement2_ModelGroupElement2() {
		return (EAttribute)element2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement2_ModelGroupElement3() {
		return (EAttribute)element2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement3() {
		return element3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement3_RepeatableElement1() {
		return (EAttribute)element3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement3_RepeatableElement2() {
		return (EAttribute)element3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement3_RepeatableElement3() {
		return (EAttribute)element3EClass.getEStructuralFeatures().get(2);
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
	public EReference getRootElementType_Element2() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_Element3() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnchangedFactory getUnchangedFactory() {
		return (UnchangedFactory)getEFactoryInstance();
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
		createEAttribute(element1EClass, ELEMENT1__GROUP);
		createEAttribute(element1EClass, ELEMENT1__REPEATABLE_ELEMENT1);
		createEAttribute(element1EClass, ELEMENT1__REPEATABLE_ELEMENT2);
		createEAttribute(element1EClass, ELEMENT1__REPEATABLE_ELEMENT3);

		element2EClass = createEClass(ELEMENT2);
		createEAttribute(element2EClass, ELEMENT2__MODEL_GROUP_ELEMENT1);
		createEAttribute(element2EClass, ELEMENT2__MODEL_GROUP_ELEMENT2);
		createEAttribute(element2EClass, ELEMENT2__MODEL_GROUP_ELEMENT3);

		element3EClass = createEClass(ELEMENT3);
		createEAttribute(element3EClass, ELEMENT3__REPEATABLE_ELEMENT1);
		createEAttribute(element3EClass, ELEMENT3__REPEATABLE_ELEMENT2);
		createEAttribute(element3EClass, ELEMENT3__REPEATABLE_ELEMENT3);

		rootElementTypeEClass = createEClass(ROOT_ELEMENT_TYPE);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ELEMENT1);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ELEMENT2);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ELEMENT3);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RootElement(), this.getRootElementType(), null, "rootElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(element1EClass, Element1.class, "Element1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Element1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement1_RepeatableElement1(), theXMLTypePackage.getString(), "repeatableElement1", null, 0, -1, Element1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement1_RepeatableElement2(), theXMLTypePackage.getString(), "repeatableElement2", null, 0, -1, Element1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement1_RepeatableElement3(), theXMLTypePackage.getString(), "repeatableElement3", null, 0, -1, Element1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(element2EClass, Element2.class, "Element2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement2_ModelGroupElement1(), theXMLTypePackage.getString(), "modelGroupElement1", null, 1, 3, Element2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement2_ModelGroupElement2(), theXMLTypePackage.getString(), "modelGroupElement2", null, 1, 1, Element2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement2_ModelGroupElement3(), theXMLTypePackage.getString(), "modelGroupElement3", null, 1, 1, Element2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element3EClass, Element3.class, "Element3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement3_RepeatableElement1(), theXMLTypePackage.getString(), "repeatableElement1", null, 0, 3, Element3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement3_RepeatableElement2(), theXMLTypePackage.getString(), "repeatableElement2", null, 0, 1, Element3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement3_RepeatableElement3(), theXMLTypePackage.getString(), "repeatableElement3", null, 0, 1, Element3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootElementTypeEClass, RootElementType.class, "RootElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootElementType_Element1(), this.getElement1(), null, "element1", null, 1, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_Element2(), this.getElement2(), null, "element2", null, 1, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootElementType_Element3(), this.getElement3(), null, "element3", null, 1, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getElement1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getElement1_RepeatableElement1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeatableElement1",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getElement1_RepeatableElement2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeatableElement2",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getElement1_RepeatableElement3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeatableElement3",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (element2EClass, 
		   source, 
		   new String[] {
			 "name", "Element2",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getElement2_ModelGroupElement1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modelGroupElement1"
		   });	
		addAnnotation
		  (getElement2_ModelGroupElement2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modelGroupElement2"
		   });	
		addAnnotation
		  (getElement2_ModelGroupElement3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modelGroupElement3"
		   });	
		addAnnotation
		  (element3EClass, 
		   source, 
		   new String[] {
			 "name", "Element3",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getElement3_RepeatableElement1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeatableElement1"
		   });	
		addAnnotation
		  (getElement3_RepeatableElement2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeatableElement2"
		   });	
		addAnnotation
		  (getElement3_RepeatableElement3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeatableElement3"
		   });	
		addAnnotation
		  (rootElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rootElement_._type",
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
		  (getRootElementType_Element2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "element2"
		   });	
		addAnnotation
		  (getRootElementType_Element3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "element3"
		   });
	}

} //UnchangedPackageImpl
