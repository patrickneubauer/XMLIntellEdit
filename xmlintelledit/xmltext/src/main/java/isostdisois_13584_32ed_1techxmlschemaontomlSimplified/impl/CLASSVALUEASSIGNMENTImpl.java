/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ASSIGNEDVALUE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSVALUEASSIGNMENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSVALUEASSIGNMENTImpl#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSVALUEASSIGNMENTImpl#getAssignedValue <em>Assigned Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSVALUEASSIGNMENTImpl extends MinimalEObjectImpl.Container implements CLASSVALUEASSIGNMENT {
	/**
	 * The cached value of the '{@link #getSuperClassDefinedProperty() <em>Super Class Defined Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassDefinedProperty()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCE superClassDefinedProperty;

	/**
	 * The cached value of the '{@link #getAssignedValue() <em>Assigned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedValue()
	 * @generated
	 * @ordered
	 */
	protected ASSIGNEDVALUE assignedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSVALUEASSIGNMENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSVALUEASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCE getSuperClassDefinedProperty() {
		return superClassDefinedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClassDefinedProperty(PROPERTYREFERENCE newSuperClassDefinedProperty, NotificationChain msgs) {
		PROPERTYREFERENCE oldSuperClassDefinedProperty = superClassDefinedProperty;
		superClassDefinedProperty = newSuperClassDefinedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY, oldSuperClassDefinedProperty, newSuperClassDefinedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClassDefinedProperty(PROPERTYREFERENCE newSuperClassDefinedProperty) {
		if (newSuperClassDefinedProperty != superClassDefinedProperty) {
			NotificationChain msgs = null;
			if (superClassDefinedProperty != null)
				msgs = ((InternalEObject)superClassDefinedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY, null, msgs);
			if (newSuperClassDefinedProperty != null)
				msgs = ((InternalEObject)newSuperClassDefinedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY, null, msgs);
			msgs = basicSetSuperClassDefinedProperty(newSuperClassDefinedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY, newSuperClassDefinedProperty, newSuperClassDefinedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASSIGNEDVALUE getAssignedValue() {
		return assignedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedValue(ASSIGNEDVALUE newAssignedValue, NotificationChain msgs) {
		ASSIGNEDVALUE oldAssignedValue = assignedValue;
		assignedValue = newAssignedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE, oldAssignedValue, newAssignedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedValue(ASSIGNEDVALUE newAssignedValue) {
		if (newAssignedValue != assignedValue) {
			NotificationChain msgs = null;
			if (assignedValue != null)
				msgs = ((InternalEObject)assignedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE, null, msgs);
			if (newAssignedValue != null)
				msgs = ((InternalEObject)newAssignedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE, null, msgs);
			msgs = basicSetAssignedValue(newAssignedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE, newAssignedValue, newAssignedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY:
				return basicSetSuperClassDefinedProperty(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE:
				return basicSetAssignedValue(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY:
				return getSuperClassDefinedProperty();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE:
				return getAssignedValue();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY:
				setSuperClassDefinedProperty((PROPERTYREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE:
				setAssignedValue((ASSIGNEDVALUE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY:
				setSuperClassDefinedProperty((PROPERTYREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE:
				setAssignedValue((ASSIGNEDVALUE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__SUPER_CLASS_DEFINED_PROPERTY:
				return superClassDefinedProperty != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT__ASSIGNED_VALUE:
				return assignedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //CLASSVALUEASSIGNMENTImpl
