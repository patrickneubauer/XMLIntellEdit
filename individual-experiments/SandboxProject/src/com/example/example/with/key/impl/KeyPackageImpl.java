/**
 */
package com.example.example.with.key.impl;

import com.example.example.with.key.DocumentRoot;
import com.example.example.with.key.InfantType;
import com.example.example.with.key.KeyFactory;
import com.example.example.with.key.KeyPackage;
import com.example.example.with.key.PassengerType;
import com.example.example.with.key.PassengersType;

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
public class KeyPackageImpl extends EPackageImpl implements KeyPackage {
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
	private EClass infantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerTypeEClass = null;

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
	 * @see com.example.example.with.key.KeyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KeyPackageImpl() {
		super(eNS_URI, KeyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KeyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KeyPackage init() {
		if (isInited) return (KeyPackage)EPackage.Registry.INSTANCE.getEPackage(KeyPackage.eNS_URI);

		// Obtain or create and register package
		KeyPackageImpl theKeyPackage = (KeyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KeyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KeyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKeyPackage.createPackageContents();

		// Initialize created meta-data
		theKeyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKeyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KeyPackage.eNS_URI, theKeyPackage);
		return theKeyPackage;
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
	public EReference getDocumentRoot_Passengers() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfantType() {
		return infantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfantType_FullName() {
		return (EAttribute)infantTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfantType_AssociatedPassengerID() {
		return (EAttribute)infantTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfantType_ID() {
		return (EAttribute)infantTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfantType_SequenceNo() {
		return (EAttribute)infantTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengersType() {
		return passengersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengersType_Group() {
		return (EAttribute)passengersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengersType_Passenger() {
		return (EReference)passengersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengersType_Infant() {
		return (EReference)passengersTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerType() {
		return passengerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerType_FullName() {
		return (EAttribute)passengerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerType_AssociatedInfantID() {
		return (EAttribute)passengerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerType_ID() {
		return (EAttribute)passengerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerType_SequenceNo() {
		return (EAttribute)passengerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyFactory getKeyFactory() {
		return (KeyFactory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__PASSENGERS);

		infantTypeEClass = createEClass(INFANT_TYPE);
		createEAttribute(infantTypeEClass, INFANT_TYPE__FULL_NAME);
		createEAttribute(infantTypeEClass, INFANT_TYPE__ASSOCIATED_PASSENGER_ID);
		createEAttribute(infantTypeEClass, INFANT_TYPE__ID);
		createEAttribute(infantTypeEClass, INFANT_TYPE__SEQUENCE_NO);

		passengersTypeEClass = createEClass(PASSENGERS_TYPE);
		createEAttribute(passengersTypeEClass, PASSENGERS_TYPE__GROUP);
		createEReference(passengersTypeEClass, PASSENGERS_TYPE__PASSENGER);
		createEReference(passengersTypeEClass, PASSENGERS_TYPE__INFANT);

		passengerTypeEClass = createEClass(PASSENGER_TYPE);
		createEAttribute(passengerTypeEClass, PASSENGER_TYPE__FULL_NAME);
		createEAttribute(passengerTypeEClass, PASSENGER_TYPE__ASSOCIATED_INFANT_ID);
		createEAttribute(passengerTypeEClass, PASSENGER_TYPE__ID);
		createEAttribute(passengerTypeEClass, PASSENGER_TYPE__SEQUENCE_NO);
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
		initEReference(getDocumentRoot_Passengers(), this.getPassengersType(), null, "passengers", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(infantTypeEClass, InfantType.class, "InfantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfantType_FullName(), theXMLTypePackage.getString(), "fullName", null, 1, 1, InfantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfantType_AssociatedPassengerID(), theXMLTypePackage.getInt(), "associatedPassengerID", null, 1, 1, InfantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfantType_ID(), theXMLTypePackage.getInt(), "iD", null, 1, 1, InfantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfantType_SequenceNo(), theXMLTypePackage.getInt(), "sequenceNo", null, 1, 1, InfantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengersTypeEClass, PassengersType.class, "PassengersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengersType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PassengersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengersType_Passenger(), this.getPassengerType(), null, "passenger", null, 0, -1, PassengersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPassengersType_Infant(), this.getInfantType(), null, "infant", null, 0, -1, PassengersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(passengerTypeEClass, PassengerType.class, "PassengerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerType_FullName(), theXMLTypePackage.getString(), "fullName", null, 1, 1, PassengerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerType_AssociatedInfantID(), theXMLTypePackage.getInt(), "associatedInfantID", null, 0, 1, PassengerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerType_ID(), theXMLTypePackage.getInt(), "iD", null, 1, 1, PassengerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerType_SequenceNo(), theXMLTypePackage.getInt(), "sequenceNo", null, 1, 1, PassengerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDocumentRoot_Passengers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Passengers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (infantTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InfantType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInfantType_FullName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FullName"
		   });	
		addAnnotation
		  (getInfantType_AssociatedPassengerID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AssociatedPassengerID"
		   });	
		addAnnotation
		  (getInfantType_ID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ID"
		   });	
		addAnnotation
		  (getInfantType_SequenceNo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SequenceNo"
		   });	
		addAnnotation
		  (passengersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Passengers_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPassengersType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getPassengersType_Passenger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Passenger",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getPassengersType_Infant(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Infant",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (passengerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PassengerType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPassengerType_FullName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FullName"
		   });	
		addAnnotation
		  (getPassengerType_AssociatedInfantID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AssociatedInfantID"
		   });	
		addAnnotation
		  (getPassengerType_ID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ID"
		   });	
		addAnnotation
		  (getPassengerType_SequenceNo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SequenceNo"
		   });
	}

} //KeyPackageImpl
