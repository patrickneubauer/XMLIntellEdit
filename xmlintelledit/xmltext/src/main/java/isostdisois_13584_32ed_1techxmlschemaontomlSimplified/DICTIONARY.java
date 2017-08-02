/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DICTIONARY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getUpdateAgreement <em>Update Agreement</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getUpdates <em>Updates</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getReferencedDictionaries <em>Referenced Dictionaries</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedSuppliers <em>Contained Suppliers</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedDocuments <em>Contained Documents</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedDatatypes <em>Contained Datatypes</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY()
 * @model
 * @generated
 */
public interface DICTIONARY extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #setIsComplete(boolean)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_IsComplete()
	 * @model
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Agreement</em>' attribute.
	 * @see #setUpdateAgreement(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_UpdateAgreement()
	 * @model
	 * @generated
	 */
	String getUpdateAgreement();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getUpdateAgreement <em>Update Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Agreement</em>' attribute.
	 * @see #getUpdateAgreement()
	 * @generated
	 */
	void setUpdateAgreement(String value);

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference.
	 * @see #setUpdates(DICTIONARYREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_Updates()
	 * @model containment="true"
	 * @generated
	 */
	DICTIONARYREFERENCE getUpdates();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getUpdates <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updates</em>' containment reference.
	 * @see #getUpdates()
	 * @generated
	 */
	void setUpdates(DICTIONARYREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Referenced Dictionaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Dictionaries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Dictionaries</em>' containment reference.
	 * @see #setReferencedDictionaries(DICTIONARIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ReferencedDictionaries()
	 * @model containment="true"
	 * @generated
	 */
	DICTIONARIESREFERENCE getReferencedDictionaries();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getReferencedDictionaries <em>Referenced Dictionaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Dictionaries</em>' containment reference.
	 * @see #getReferencedDictionaries()
	 * @generated
	 */
	void setReferencedDictionaries(DICTIONARIESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #setResponsibleSupplier(SUPPLIERREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ResponsibleSupplier()
	 * @model containment="true"
	 * @generated
	 */
	SUPPLIERREFERENCE getResponsibleSupplier();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getResponsibleSupplier <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #getResponsibleSupplier()
	 * @generated
	 */
	void setResponsibleSupplier(SUPPLIERREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Contained Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Classes</em>' containment reference.
	 * @see #setContainedClasses(CONTAINEDCLASSES)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ContainedClasses()
	 * @model containment="true"
	 * @generated
	 */
	CONTAINEDCLASSES getContainedClasses();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedClasses <em>Contained Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Classes</em>' containment reference.
	 * @see #getContainedClasses()
	 * @generated
	 */
	void setContainedClasses(CONTAINEDCLASSES value);

	/**
	 * Returns the value of the '<em><b>APosteriori Semantic Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APosteriori Semantic Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APosteriori Semantic Relationships</em>' containment reference.
	 * @see #setAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPS)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_APosterioriSemanticRelationships()
	 * @model containment="true"
	 * @generated
	 */
	APOSTERIORISEMANTICRELATIONSHIPS getAPosterioriSemanticRelationships();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APosteriori Semantic Relationships</em>' containment reference.
	 * @see #getAPosterioriSemanticRelationships()
	 * @generated
	 */
	void setAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPS value);

	/**
	 * Returns the value of the '<em><b>Contained Suppliers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Suppliers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Suppliers</em>' containment reference.
	 * @see #setContainedSuppliers(CONTAINEDSUPPLIERS)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ContainedSuppliers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CONTAINEDSUPPLIERS getContainedSuppliers();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedSuppliers <em>Contained Suppliers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Suppliers</em>' containment reference.
	 * @see #getContainedSuppliers()
	 * @generated
	 */
	void setContainedSuppliers(CONTAINEDSUPPLIERS value);

	/**
	 * Returns the value of the '<em><b>Contained Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Properties</em>' containment reference.
	 * @see #setContainedProperties(CONTAINEDPROPERTIES)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ContainedProperties()
	 * @model containment="true"
	 * @generated
	 */
	CONTAINEDPROPERTIES getContainedProperties();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedProperties <em>Contained Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Properties</em>' containment reference.
	 * @see #getContainedProperties()
	 * @generated
	 */
	void setContainedProperties(CONTAINEDPROPERTIES value);

	/**
	 * Returns the value of the '<em><b>Contained Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Documents</em>' containment reference.
	 * @see #setContainedDocuments(CONTAINEDDOCUMENTS)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ContainedDocuments()
	 * @model containment="true"
	 * @generated
	 */
	CONTAINEDDOCUMENTS getContainedDocuments();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedDocuments <em>Contained Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Documents</em>' containment reference.
	 * @see #getContainedDocuments()
	 * @generated
	 */
	void setContainedDocuments(CONTAINEDDOCUMENTS value);

	/**
	 * Returns the value of the '<em><b>Contained Datatypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Datatypes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Datatypes</em>' containment reference.
	 * @see #setContainedDatatypes(CONTAINEDDATATYPES)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICTIONARY_ContainedDatatypes()
	 * @model containment="true"
	 * @generated
	 */
	CONTAINEDDATATYPES getContainedDatatypes();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY#getContainedDatatypes <em>Contained Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Datatypes</em>' containment reference.
	 * @see #getContainedDatatypes()
	 * @generated
	 */
	void setContainedDatatypes(CONTAINEDDATATYPES value);

} // DICTIONARY
