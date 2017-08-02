/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSEXTENSIONS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARY;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LIBRARY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.LIBRARYImpl#getContainedClassExtensions <em>Contained Class Extensions</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.LIBRARYImpl#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LIBRARYImpl extends MinimalEObjectImpl.Container implements LIBRARY {
	/**
	 * The cached value of the '{@link #getContainedClassExtensions() <em>Contained Class Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClassExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<CONTAINEDCLASSEXTENSIONS> containedClassExtensions;

	/**
	 * The cached value of the '{@link #getResponsibleSupplier() <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleSupplier()
	 * @generated
	 * @ordered
	 */
	protected SUPPLIERREFERENCE responsibleSupplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIBRARYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CONTAINEDCLASSEXTENSIONS> getContainedClassExtensions() {
		if (containedClassExtensions == null) {
			containedClassExtensions = new EObjectContainmentEList<CONTAINEDCLASSEXTENSIONS>(CONTAINEDCLASSEXTENSIONS.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__CONTAINED_CLASS_EXTENSIONS);
		}
		return containedClassExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCE getResponsibleSupplier() {
		return responsibleSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleSupplier(SUPPLIERREFERENCE newResponsibleSupplier, NotificationChain msgs) {
		SUPPLIERREFERENCE oldResponsibleSupplier = responsibleSupplier;
		responsibleSupplier = newResponsibleSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER, oldResponsibleSupplier, newResponsibleSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleSupplier(SUPPLIERREFERENCE newResponsibleSupplier) {
		if (newResponsibleSupplier != responsibleSupplier) {
			NotificationChain msgs = null;
			if (responsibleSupplier != null)
				msgs = ((InternalEObject)responsibleSupplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER, null, msgs);
			if (newResponsibleSupplier != null)
				msgs = ((InternalEObject)newResponsibleSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER, null, msgs);
			msgs = basicSetResponsibleSupplier(newResponsibleSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER, newResponsibleSupplier, newResponsibleSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__CONTAINED_CLASS_EXTENSIONS:
				return ((InternalEList<?>)getContainedClassExtensions()).basicRemove(otherEnd, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER:
				return basicSetResponsibleSupplier(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__CONTAINED_CLASS_EXTENSIONS:
				return getContainedClassExtensions();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER:
				return getResponsibleSupplier();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__CONTAINED_CLASS_EXTENSIONS:
				getContainedClassExtensions().clear();
				getContainedClassExtensions().addAll((Collection<? extends CONTAINEDCLASSEXTENSIONS>)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__CONTAINED_CLASS_EXTENSIONS:
				getContainedClassExtensions().clear();
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__CONTAINED_CLASS_EXTENSIONS:
				return containedClassExtensions != null && !containedClassExtensions.isEmpty();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY__RESPONSIBLE_SUPPLIER:
				return responsibleSupplier != null;
		}
		return super.eIsSet(featureID);
	}

} //LIBRARYImpl
