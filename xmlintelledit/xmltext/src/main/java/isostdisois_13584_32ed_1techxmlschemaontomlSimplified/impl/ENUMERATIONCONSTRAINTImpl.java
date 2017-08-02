/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONQUANTITATIVEINTTYPE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBSET;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENUMERATIONCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ENUMERATIONCONSTRAINTImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ENUMERATIONCONSTRAINTImpl#getValueMeaning <em>Value Meaning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENUMERATIONCONSTRAINTImpl extends DOMAINCONSTRAINTImpl implements ENUMERATIONCONSTRAINT {
	/**
	 * The cached value of the '{@link #getSubset() <em>Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubset()
	 * @generated
	 * @ordered
	 */
	protected SUBSET subset;

	/**
	 * The cached value of the '{@link #getValueMeaning() <em>Value Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMeaning()
	 * @generated
	 * @ordered
	 */
	protected NONQUANTITATIVEINTTYPE valueMeaning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENUMERATIONCONSTRAINTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ENUMERATIONCONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBSET getSubset() {
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubset(SUBSET newSubset, NotificationChain msgs) {
		SUBSET oldSubset = subset;
		subset = newSubset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET, oldSubset, newSubset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubset(SUBSET newSubset) {
		if (newSubset != subset) {
			NotificationChain msgs = null;
			if (subset != null)
				msgs = ((InternalEObject)subset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET, null, msgs);
			if (newSubset != null)
				msgs = ((InternalEObject)newSubset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET, null, msgs);
			msgs = basicSetSubset(newSubset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET, newSubset, newSubset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONQUANTITATIVEINTTYPE getValueMeaning() {
		return valueMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMeaning(NONQUANTITATIVEINTTYPE newValueMeaning, NotificationChain msgs) {
		NONQUANTITATIVEINTTYPE oldValueMeaning = valueMeaning;
		valueMeaning = newValueMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING, oldValueMeaning, newValueMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMeaning(NONQUANTITATIVEINTTYPE newValueMeaning) {
		if (newValueMeaning != valueMeaning) {
			NotificationChain msgs = null;
			if (valueMeaning != null)
				msgs = ((InternalEObject)valueMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING, null, msgs);
			if (newValueMeaning != null)
				msgs = ((InternalEObject)newValueMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING, null, msgs);
			msgs = basicSetValueMeaning(newValueMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING, newValueMeaning, newValueMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET:
				return basicSetSubset(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING:
				return basicSetValueMeaning(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET:
				return getSubset();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING:
				return getValueMeaning();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET:
				setSubset((SUBSET)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING:
				setValueMeaning((NONQUANTITATIVEINTTYPE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET:
				setSubset((SUBSET)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING:
				setValueMeaning((NONQUANTITATIVEINTTYPE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__SUBSET:
				return subset != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT__VALUE_MEANING:
				return valueMeaning != null;
		}
		return super.eIsSet(featureID);
	}

} //ENUMERATIONCONSTRAINTImpl
