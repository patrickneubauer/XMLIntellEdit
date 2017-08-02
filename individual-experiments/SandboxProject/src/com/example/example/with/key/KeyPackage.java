/**
 */
package com.example.example.with.key;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.example.example.with.key.KeyFactory
 * @model kind="package"
 * @generated
 */
public interface KeyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "key";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-with-key";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "key";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeyPackage eINSTANCE = com.example.example.with.key.impl.KeyPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.example.with.key.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key.impl.DocumentRootImpl
	 * @see com.example.example.with.key.impl.KeyPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PASSENGERS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key.impl.InfantTypeImpl <em>Infant Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key.impl.InfantTypeImpl
	 * @see com.example.example.with.key.impl.KeyPackageImpl#getInfantType()
	 * @generated
	 */
	int INFANT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFANT_TYPE__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Associated Passenger ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFANT_TYPE__ASSOCIATED_PASSENGER_ID = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFANT_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFANT_TYPE__SEQUENCE_NO = 3;

	/**
	 * The number of structural features of the '<em>Infant Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFANT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Infant Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFANT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key.impl.PassengersTypeImpl <em>Passengers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key.impl.PassengersTypeImpl
	 * @see com.example.example.with.key.impl.KeyPackageImpl#getPassengersType()
	 * @generated
	 */
	int PASSENGERS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGERS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGERS_TYPE__PASSENGER = 1;

	/**
	 * The feature id for the '<em><b>Infant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGERS_TYPE__INFANT = 2;

	/**
	 * The number of structural features of the '<em>Passengers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGERS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Passengers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key.impl.PassengerTypeImpl <em>Passenger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key.impl.PassengerTypeImpl
	 * @see com.example.example.with.key.impl.KeyPackageImpl#getPassengerType()
	 * @generated
	 */
	int PASSENGER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_TYPE__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Associated Infant ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_TYPE__ASSOCIATED_INFANT_ID = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_TYPE__SEQUENCE_NO = 3;

	/**
	 * The number of structural features of the '<em>Passenger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Passenger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.example.example.with.key.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.example.example.with.key.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.key.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.example.example.with.key.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.example.example.with.key.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.example.example.with.key.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.example.example.with.key.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.example.example.with.key.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key.DocumentRoot#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passengers</em>'.
	 * @see com.example.example.with.key.DocumentRoot#getPassengers()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Passengers();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key.InfantType <em>Infant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infant Type</em>'.
	 * @see com.example.example.with.key.InfantType
	 * @generated
	 */
	EClass getInfantType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.InfantType#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see com.example.example.with.key.InfantType#getFullName()
	 * @see #getInfantType()
	 * @generated
	 */
	EAttribute getInfantType_FullName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.InfantType#getAssociatedPassengerID <em>Associated Passenger ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Passenger ID</em>'.
	 * @see com.example.example.with.key.InfantType#getAssociatedPassengerID()
	 * @see #getInfantType()
	 * @generated
	 */
	EAttribute getInfantType_AssociatedPassengerID();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.InfantType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.example.example.with.key.InfantType#getID()
	 * @see #getInfantType()
	 * @generated
	 */
	EAttribute getInfantType_ID();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.InfantType#getSequenceNo <em>Sequence No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence No</em>'.
	 * @see com.example.example.with.key.InfantType#getSequenceNo()
	 * @see #getInfantType()
	 * @generated
	 */
	EAttribute getInfantType_SequenceNo();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key.PassengersType <em>Passengers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passengers Type</em>'.
	 * @see com.example.example.with.key.PassengersType
	 * @generated
	 */
	EClass getPassengersType();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.key.PassengersType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.example.example.with.key.PassengersType#getGroup()
	 * @see #getPassengersType()
	 * @generated
	 */
	EAttribute getPassengersType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.with.key.PassengersType#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passenger</em>'.
	 * @see com.example.example.with.key.PassengersType#getPassenger()
	 * @see #getPassengersType()
	 * @generated
	 */
	EReference getPassengersType_Passenger();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.with.key.PassengersType#getInfant <em>Infant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infant</em>'.
	 * @see com.example.example.with.key.PassengersType#getInfant()
	 * @see #getPassengersType()
	 * @generated
	 */
	EReference getPassengersType_Infant();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key.PassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Type</em>'.
	 * @see com.example.example.with.key.PassengerType
	 * @generated
	 */
	EClass getPassengerType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.PassengerType#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see com.example.example.with.key.PassengerType#getFullName()
	 * @see #getPassengerType()
	 * @generated
	 */
	EAttribute getPassengerType_FullName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.PassengerType#getAssociatedInfantID <em>Associated Infant ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Infant ID</em>'.
	 * @see com.example.example.with.key.PassengerType#getAssociatedInfantID()
	 * @see #getPassengerType()
	 * @generated
	 */
	EAttribute getPassengerType_AssociatedInfantID();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.PassengerType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.example.example.with.key.PassengerType#getID()
	 * @see #getPassengerType()
	 * @generated
	 */
	EAttribute getPassengerType_ID();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key.PassengerType#getSequenceNo <em>Sequence No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence No</em>'.
	 * @see com.example.example.with.key.PassengerType#getSequenceNo()
	 * @see #getPassengerType()
	 * @generated
	 */
	EAttribute getPassengerType_SequenceNo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KeyFactory getKeyFactory();

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
		 * The meta object literal for the '{@link com.example.example.with.key.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key.impl.DocumentRootImpl
		 * @see com.example.example.with.key.impl.KeyPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PASSENGERS = eINSTANCE.getDocumentRoot_Passengers();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key.impl.InfantTypeImpl <em>Infant Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key.impl.InfantTypeImpl
		 * @see com.example.example.with.key.impl.KeyPackageImpl#getInfantType()
		 * @generated
		 */
		EClass INFANT_TYPE = eINSTANCE.getInfantType();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFANT_TYPE__FULL_NAME = eINSTANCE.getInfantType_FullName();

		/**
		 * The meta object literal for the '<em><b>Associated Passenger ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFANT_TYPE__ASSOCIATED_PASSENGER_ID = eINSTANCE.getInfantType_AssociatedPassengerID();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFANT_TYPE__ID = eINSTANCE.getInfantType_ID();

		/**
		 * The meta object literal for the '<em><b>Sequence No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFANT_TYPE__SEQUENCE_NO = eINSTANCE.getInfantType_SequenceNo();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key.impl.PassengersTypeImpl <em>Passengers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key.impl.PassengersTypeImpl
		 * @see com.example.example.with.key.impl.KeyPackageImpl#getPassengersType()
		 * @generated
		 */
		EClass PASSENGERS_TYPE = eINSTANCE.getPassengersType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGERS_TYPE__GROUP = eINSTANCE.getPassengersType_Group();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGERS_TYPE__PASSENGER = eINSTANCE.getPassengersType_Passenger();

		/**
		 * The meta object literal for the '<em><b>Infant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGERS_TYPE__INFANT = eINSTANCE.getPassengersType_Infant();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key.impl.PassengerTypeImpl <em>Passenger Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key.impl.PassengerTypeImpl
		 * @see com.example.example.with.key.impl.KeyPackageImpl#getPassengerType()
		 * @generated
		 */
		EClass PASSENGER_TYPE = eINSTANCE.getPassengerType();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_TYPE__FULL_NAME = eINSTANCE.getPassengerType_FullName();

		/**
		 * The meta object literal for the '<em><b>Associated Infant ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_TYPE__ASSOCIATED_INFANT_ID = eINSTANCE.getPassengerType_AssociatedInfantID();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_TYPE__ID = eINSTANCE.getPassengerType_ID();

		/**
		 * The meta object literal for the '<em><b>Sequence No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_TYPE__SEQUENCE_NO = eINSTANCE.getPassengerType_SequenceNo();

	}

} //KeyPackage
