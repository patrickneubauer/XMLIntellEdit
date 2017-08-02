/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CATEGORIZATIONCLASS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CATEGORIZATIONCLASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CATEGORIZATIONCLASSImpl#getCategorizationClassSuperclasses <em>Categorization Class Superclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CATEGORIZATIONCLASSImpl extends CLASSImpl implements CATEGORIZATIONCLASS {
	/**
	 * The cached value of the '{@link #getCategorizationClassSuperclasses() <em>Categorization Class Superclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizationClassSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCE categorizationClassSuperclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CATEGORIZATIONCLASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CATEGORIZATIONCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCE getCategorizationClassSuperclasses() {
		return categorizationClassSuperclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorizationClassSuperclasses(CLASSESREFERENCE newCategorizationClassSuperclasses, NotificationChain msgs) {
		CLASSESREFERENCE oldCategorizationClassSuperclasses = categorizationClassSuperclasses;
		categorizationClassSuperclasses = newCategorizationClassSuperclasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES, oldCategorizationClassSuperclasses, newCategorizationClassSuperclasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorizationClassSuperclasses(CLASSESREFERENCE newCategorizationClassSuperclasses) {
		if (newCategorizationClassSuperclasses != categorizationClassSuperclasses) {
			NotificationChain msgs = null;
			if (categorizationClassSuperclasses != null)
				msgs = ((InternalEObject)categorizationClassSuperclasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES, null, msgs);
			if (newCategorizationClassSuperclasses != null)
				msgs = ((InternalEObject)newCategorizationClassSuperclasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES, null, msgs);
			msgs = basicSetCategorizationClassSuperclasses(newCategorizationClassSuperclasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES, newCategorizationClassSuperclasses, newCategorizationClassSuperclasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES:
				return basicSetCategorizationClassSuperclasses(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES:
				return getCategorizationClassSuperclasses();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES:
				setCategorizationClassSuperclasses((CLASSESREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES:
				setCategorizationClassSuperclasses((CLASSESREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS__CATEGORIZATION_CLASS_SUPERCLASSES:
				return categorizationClassSuperclasses != null;
		}
		return super.eIsSet(featureID);
	}

} //CATEGORIZATIONCLASSImpl
