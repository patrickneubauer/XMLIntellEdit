/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassificationRefs <em>Classification Refs</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getDataSpecificationRef <em>Data Specification Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsGlobalId <em>Is Global Id</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsModel <em>Is Model</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getViewOf <em>View Of</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getReferences <em>References</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getPropertyValues <em>Property Values</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternClassificationRefs patternClassRef patternCreatedView patternDataSpecificationRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternClassificationRefs='self.classificationRefs-&gt;forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')) or self.classificationRefs-&gt;forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')) or self.classificationRefs-&gt;forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\'))' patternClassRef='self.classRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.classRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.classRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternCreatedView='(self.createdView=null) or self.createdView.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.createdView.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.createdView.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternDataSpecificationRef='(self.dataSpecificationRef=null) or self.dataSpecificationRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.dataSpecificationRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.dataSpecificationRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Refs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Refs</em>' attribute list.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_ClassificationRefs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getClassificationRefs();

	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' attribute.
	 * @see #setClassRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_ClassRef()
	 * @model required="true"
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

	/**
	 * Returns the value of the '<em><b>Created View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created View</em>' attribute.
	 * @see #setCreatedView(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_CreatedView()
	 * @model
	 * @generated
	 */
	String getCreatedView();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getCreatedView <em>Created View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created View</em>' attribute.
	 * @see #getCreatedView()
	 * @generated
	 */
	void setCreatedView(String value);

	/**
	 * Returns the value of the '<em><b>Data Specification Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Specification Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Specification Ref</em>' attribute.
	 * @see #setDataSpecificationRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_DataSpecificationRef()
	 * @model
	 * @generated
	 */
	String getDataSpecificationRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getDataSpecificationRef <em>Data Specification Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Specification Ref</em>' attribute.
	 * @see #getDataSpecificationRef()
	 * @generated
	 */
	void setDataSpecificationRef(String value);

	/**
	 * Returns the value of the '<em><b>Information Supplier Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Supplier Reference String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Supplier Reference String</em>' attribute.
	 * @see #setInformationSupplierReferenceString(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_InformationSupplierReferenceString()
	 * @model
	 * @generated
	 */
	String getInformationSupplierReferenceString();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Supplier Reference String</em>' attribute.
	 * @see #getInformationSupplierReferenceString()
	 * @generated
	 */
	void setInformationSupplierReferenceString(String value);

	/**
	 * Returns the value of the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent</em>' attribute.
	 * @see #setIsDependent(boolean)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_IsDependent()
	 * @model
	 * @generated
	 */
	boolean isIsDependent();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsDependent <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dependent</em>' attribute.
	 * @see #isIsDependent()
	 * @generated
	 */
	void setIsDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Global Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Global Id</em>' attribute.
	 * @see #setIsGlobalId(boolean)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_IsGlobalId()
	 * @model
	 * @generated
	 */
	boolean isIsGlobalId();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsGlobalId <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Global Id</em>' attribute.
	 * @see #isIsGlobalId()
	 * @generated
	 */
	void setIsGlobalId(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Model</em>' attribute.
	 * @see #setIsModel(boolean)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_IsModel()
	 * @model
	 * @generated
	 */
	boolean isIsModel();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsModel <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Model</em>' attribute.
	 * @see #isIsModel()
	 * @generated
	 */
	void setIsModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Proprietary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Proprietary</em>' attribute.
	 * @see #setIsProprietary(boolean)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_IsProprietary()
	 * @model
	 * @generated
	 */
	boolean isIsProprietary();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsProprietary <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Proprietary</em>' attribute.
	 * @see #isIsProprietary()
	 * @generated
	 */
	void setIsProprietary(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Id</em>' attribute.
	 * @see #setLocalId(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_LocalId()
	 * @model id="true"
	 * @generated
	 */
	String getLocalId();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(String value);

	/**
	 * Returns the value of the '<em><b>View Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Of</em>' reference.
	 * @see #setViewOf(Item)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_ViewOf()
	 * @model
	 * @generated
	 */
	Item getViewOf();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getViewOf <em>View Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Of</em>' reference.
	 * @see #getViewOf()
	 * @generated
	 */
	void setViewOf(Item value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference list.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getItem_PropertyValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyValue> getPropertyValues();

} // Item
