/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ItemReferenceValueImpl#getItemLocalRef <em>Item Local Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemReferenceValueImpl extends MinimalEObjectImpl.Container implements ItemReferenceValue {
	/**
	 * The cached value of the '{@link #getItemLocalRef() <em>Item Local Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemLocalRef()
	 * @generated
	 * @ordered
	 */
	protected Item itemLocalRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.ITEM_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItemLocalRef() {
		if (itemLocalRef != null && itemLocalRef.eIsProxy()) {
			InternalEObject oldItemLocalRef = (InternalEObject)itemLocalRef;
			itemLocalRef = (Item)eResolveProxy(oldItemLocalRef);
			if (itemLocalRef != oldItemLocalRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF, oldItemLocalRef, itemLocalRef));
			}
		}
		return itemLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItemLocalRef() {
		return itemLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemLocalRef(Item newItemLocalRef) {
		Item oldItemLocalRef = itemLocalRef;
		itemLocalRef = newItemLocalRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF, oldItemLocalRef, itemLocalRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF:
				if (resolve) return getItemLocalRef();
				return basicGetItemLocalRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF:
				setItemLocalRef((Item)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF:
				setItemLocalRef((Item)null);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF:
				return itemLocalRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemReferenceValueImpl
