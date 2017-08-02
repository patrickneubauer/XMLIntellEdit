/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONINSTANTIABLEFUNCTIONALVIEWCLASS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NONINSTANTIABLEFUNCTIONALVIEWCLASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.NONINSTANTIABLEFUNCTIONALVIEWCLASSImpl#getViewControlVariables <em>View Control Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NONINSTANTIABLEFUNCTIONALVIEWCLASSImpl extends CLASSImpl implements NONINSTANTIABLEFUNCTIONALVIEWCLASS {
	/**
	 * The cached value of the '{@link #getViewControlVariables() <em>View Control Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewControlVariables()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE viewControlVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NONINSTANTIABLEFUNCTIONALVIEWCLASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.NONINSTANTIABLEFUNCTIONALVIEWCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getViewControlVariables() {
		return viewControlVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewControlVariables(PROPERTIESREFERENCE newViewControlVariables, NotificationChain msgs) {
		PROPERTIESREFERENCE oldViewControlVariables = viewControlVariables;
		viewControlVariables = newViewControlVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES, oldViewControlVariables, newViewControlVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewControlVariables(PROPERTIESREFERENCE newViewControlVariables) {
		if (newViewControlVariables != viewControlVariables) {
			NotificationChain msgs = null;
			if (viewControlVariables != null)
				msgs = ((InternalEObject)viewControlVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES, null, msgs);
			if (newViewControlVariables != null)
				msgs = ((InternalEObject)newViewControlVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES, null, msgs);
			msgs = basicSetViewControlVariables(newViewControlVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES, newViewControlVariables, newViewControlVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES:
				return basicSetViewControlVariables(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES:
				return getViewControlVariables();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES:
				setViewControlVariables((PROPERTIESREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES:
				setViewControlVariables((PROPERTIESREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS__VIEW_CONTROL_VARIABLES:
				return viewControlVariables != null;
		}
		return super.eIsSet(featureID);
	}

} //NONINSTANTIABLEFUNCTIONALVIEWCLASSImpl
