/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getClassificationRefs <em>Classification Refs</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getDataSpecificationRef <em>Data Specification Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#isIsGlobalId <em>Is Global Id</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#isIsModel <em>Is Model</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getViewOf <em>View Of</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getReferences <em>References</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl#getPropertyValues <em>Property Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getClassificationRefs() <em>Classification Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classificationRefs;

	/**
	 * The default value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected String classRef = CLASS_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedView() <em>Created View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedView()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedView() <em>Created View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedView()
	 * @generated
	 * @ordered
	 */
	protected String createdView = CREATED_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSpecificationRef() <em>Data Specification Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecificationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SPECIFICATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSpecificationRef() <em>Data Specification Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecificationRef()
	 * @generated
	 * @ordered
	 */
	protected String dataSpecificationRef = DATA_SPECIFICATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformationSupplierReferenceString() <em>Information Supplier Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSupplierReferenceString()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationSupplierReferenceString() <em>Information Supplier Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSupplierReferenceString()
	 * @generated
	 * @ordered
	 */
	protected String informationSupplierReferenceString = INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isDependent = IS_DEPENDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsGlobalId() <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGlobalId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GLOBAL_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGlobalId() <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGlobalId()
	 * @generated
	 * @ordered
	 */
	protected boolean isGlobalId = IS_GLOBAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModel()
	 * @generated
	 * @ordered
	 */
	protected boolean isModel = IS_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsProprietary() <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProprietary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPRIETARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProprietary() <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProprietary()
	 * @generated
	 * @ordered
	 */
	protected boolean isProprietary = IS_PROPRIETARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected String localId = LOCAL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewOf() <em>View Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOf()
	 * @generated
	 * @ordered
	 */
	protected Item viewOf;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getPropertyValues() <em>Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValue> propertyValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassificationRefs() {
		if (classificationRefs == null) {
			classificationRefs = new EDataTypeEList<String>(String.class, this, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASSIFICATION_REFS);
		}
		return classificationRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRef(String newClassRef) {
		String oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedView() {
		return createdView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedView(String newCreatedView) {
		String oldCreatedView = createdView;
		createdView = newCreatedView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CREATED_VIEW, oldCreatedView, createdView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSpecificationRef() {
		return dataSpecificationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSpecificationRef(String newDataSpecificationRef) {
		String oldDataSpecificationRef = dataSpecificationRef;
		dataSpecificationRef = newDataSpecificationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__DATA_SPECIFICATION_REF, oldDataSpecificationRef, dataSpecificationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationSupplierReferenceString() {
		return informationSupplierReferenceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSupplierReferenceString(String newInformationSupplierReferenceString) {
		String oldInformationSupplierReferenceString = informationSupplierReferenceString;
		informationSupplierReferenceString = newInformationSupplierReferenceString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING, oldInformationSupplierReferenceString, informationSupplierReferenceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDependent() {
		return isDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDependent(boolean newIsDependent) {
		boolean oldIsDependent = isDependent;
		isDependent = newIsDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_DEPENDENT, oldIsDependent, isDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGlobalId() {
		return isGlobalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGlobalId(boolean newIsGlobalId) {
		boolean oldIsGlobalId = isGlobalId;
		isGlobalId = newIsGlobalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_GLOBAL_ID, oldIsGlobalId, isGlobalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModel() {
		return isModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModel(boolean newIsModel) {
		boolean oldIsModel = isModel;
		isModel = newIsModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_MODEL, oldIsModel, isModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProprietary() {
		return isProprietary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProprietary(boolean newIsProprietary) {
		boolean oldIsProprietary = isProprietary;
		isProprietary = newIsProprietary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_PROPRIETARY, oldIsProprietary, isProprietary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalId() {
		return localId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalId(String newLocalId) {
		String oldLocalId = localId;
		localId = newLocalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__LOCAL_ID, oldLocalId, localId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getViewOf() {
		if (viewOf != null && viewOf.eIsProxy()) {
			InternalEObject oldViewOf = (InternalEObject)viewOf;
			viewOf = (Item)eResolveProxy(oldViewOf);
			if (viewOf != oldViewOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__VIEW_OF, oldViewOf, viewOf));
			}
		}
		return viewOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetViewOf() {
		return viewOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewOf(Item newViewOf) {
		Item oldViewOf = viewOf;
		viewOf = newViewOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__VIEW_OF, oldViewOf, viewOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValue> getPropertyValues() {
		if (propertyValues == null) {
			propertyValues = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__PROPERTY_VALUES);
		}
		return propertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__PROPERTY_VALUES:
				return ((InternalEList<?>)getPropertyValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASSIFICATION_REFS:
				return getClassificationRefs();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASS_REF:
				return getClassRef();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CREATED_VIEW:
				return getCreatedView();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__DATA_SPECIFICATION_REF:
				return getDataSpecificationRef();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING:
				return getInformationSupplierReferenceString();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_DEPENDENT:
				return isIsDependent();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_GLOBAL_ID:
				return isIsGlobalId();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_MODEL:
				return isIsModel();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_PROPRIETARY:
				return isIsProprietary();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__LOCAL_ID:
				return getLocalId();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__VIEW_OF:
				if (resolve) return getViewOf();
				return basicGetViewOf();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__REFERENCES:
				return getReferences();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__PROPERTY_VALUES:
				return getPropertyValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASSIFICATION_REFS:
				getClassificationRefs().clear();
				getClassificationRefs().addAll((Collection<? extends String>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASS_REF:
				setClassRef((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CREATED_VIEW:
				setCreatedView((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__DATA_SPECIFICATION_REF:
				setDataSpecificationRef((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING:
				setInformationSupplierReferenceString((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_DEPENDENT:
				setIsDependent((Boolean)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_GLOBAL_ID:
				setIsGlobalId((Boolean)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_MODEL:
				setIsModel((Boolean)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_PROPRIETARY:
				setIsProprietary((Boolean)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__LOCAL_ID:
				setLocalId((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__VIEW_OF:
				setViewOf((Item)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__PROPERTY_VALUES:
				getPropertyValues().clear();
				getPropertyValues().addAll((Collection<? extends PropertyValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASSIFICATION_REFS:
				getClassificationRefs().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASS_REF:
				setClassRef(CLASS_REF_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CREATED_VIEW:
				setCreatedView(CREATED_VIEW_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__DATA_SPECIFICATION_REF:
				setDataSpecificationRef(DATA_SPECIFICATION_REF_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING:
				setInformationSupplierReferenceString(INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_DEPENDENT:
				setIsDependent(IS_DEPENDENT_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_GLOBAL_ID:
				setIsGlobalId(IS_GLOBAL_ID_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_MODEL:
				setIsModel(IS_MODEL_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_PROPRIETARY:
				setIsProprietary(IS_PROPRIETARY_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__VIEW_OF:
				setViewOf((Item)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__REFERENCES:
				getReferences().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__PROPERTY_VALUES:
				getPropertyValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASSIFICATION_REFS:
				return classificationRefs != null && !classificationRefs.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CLASS_REF:
				return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__CREATED_VIEW:
				return CREATED_VIEW_EDEFAULT == null ? createdView != null : !CREATED_VIEW_EDEFAULT.equals(createdView);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__DATA_SPECIFICATION_REF:
				return DATA_SPECIFICATION_REF_EDEFAULT == null ? dataSpecificationRef != null : !DATA_SPECIFICATION_REF_EDEFAULT.equals(dataSpecificationRef);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING:
				return INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT == null ? informationSupplierReferenceString != null : !INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT.equals(informationSupplierReferenceString);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_DEPENDENT:
				return isDependent != IS_DEPENDENT_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_GLOBAL_ID:
				return isGlobalId != IS_GLOBAL_ID_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_MODEL:
				return isModel != IS_MODEL_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__IS_PROPRIETARY:
				return isProprietary != IS_PROPRIETARY_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null ? localId != null : !LOCAL_ID_EDEFAULT.equals(localId);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__VIEW_OF:
				return viewOf != null;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__REFERENCES:
				return references != null && !references.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM__PROPERTY_VALUES:
				return propertyValues != null && !propertyValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classificationRefs: ");
		result.append(classificationRefs);
		result.append(", classRef: ");
		result.append(classRef);
		result.append(", createdView: ");
		result.append(createdView);
		result.append(", dataSpecificationRef: ");
		result.append(dataSpecificationRef);
		result.append(", informationSupplierReferenceString: ");
		result.append(informationSupplierReferenceString);
		result.append(", isDependent: ");
		result.append(isDependent);
		result.append(", isGlobalId: ");
		result.append(isGlobalId);
		result.append(", isModel: ");
		result.append(isModel);
		result.append(", isProprietary: ");
		result.append(isProprietary);
		result.append(", localId: ");
		result.append(localId);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
