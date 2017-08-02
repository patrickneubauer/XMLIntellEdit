/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GRAPHICS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITEMCLASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSImpl#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSImpl#isInstanceSharable <em>Instance Sharable</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSImpl#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ITEMCLASSImpl extends CLASSImpl implements ITEMCLASS {
	/**
	 * The default value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected String codedName = CODED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANCE_SHARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSharable = INSTANCE_SHARABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimplifiedDrawing() <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplifiedDrawing()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICS simplifiedDrawing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITEMCLASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ITEMCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodedName() {
		return codedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodedName(String newCodedName) {
		String oldCodedName = codedName;
		codedName = newCodedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__CODED_NAME, oldCodedName, codedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstanceSharable() {
		return instanceSharable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSharable(boolean newInstanceSharable) {
		boolean oldInstanceSharable = instanceSharable;
		instanceSharable = newInstanceSharable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__INSTANCE_SHARABLE, oldInstanceSharable, instanceSharable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICS getSimplifiedDrawing() {
		return simplifiedDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplifiedDrawing(GRAPHICS newSimplifiedDrawing, NotificationChain msgs) {
		GRAPHICS oldSimplifiedDrawing = simplifiedDrawing;
		simplifiedDrawing = newSimplifiedDrawing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING, oldSimplifiedDrawing, newSimplifiedDrawing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimplifiedDrawing(GRAPHICS newSimplifiedDrawing) {
		if (newSimplifiedDrawing != simplifiedDrawing) {
			NotificationChain msgs = null;
			if (simplifiedDrawing != null)
				msgs = ((InternalEObject)simplifiedDrawing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING, null, msgs);
			if (newSimplifiedDrawing != null)
				msgs = ((InternalEObject)newSimplifiedDrawing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING, null, msgs);
			msgs = basicSetSimplifiedDrawing(newSimplifiedDrawing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING, newSimplifiedDrawing, newSimplifiedDrawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING:
				return basicSetSimplifiedDrawing(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__CODED_NAME:
				return getCodedName();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__INSTANCE_SHARABLE:
				return isInstanceSharable();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING:
				return getSimplifiedDrawing();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__CODED_NAME:
				setCodedName((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__INSTANCE_SHARABLE:
				setInstanceSharable((Boolean)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICS)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__CODED_NAME:
				setCodedName(CODED_NAME_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__INSTANCE_SHARABLE:
				setInstanceSharable(INSTANCE_SHARABLE_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICS)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__CODED_NAME:
				return CODED_NAME_EDEFAULT == null ? codedName != null : !CODED_NAME_EDEFAULT.equals(codedName);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__INSTANCE_SHARABLE:
				return instanceSharable != INSTANCE_SHARABLE_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS__SIMPLIFIED_DRAWING:
				return simplifiedDrawing != null;
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
		result.append(" (codedName: ");
		result.append(codedName);
		result.append(", instanceSharable: ");
		result.append(instanceSharable);
		result.append(')');
		return result.toString();
	}

} //ITEMCLASSImpl
