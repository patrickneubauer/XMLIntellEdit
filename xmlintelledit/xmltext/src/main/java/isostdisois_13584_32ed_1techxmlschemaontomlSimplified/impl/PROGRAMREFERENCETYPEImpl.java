/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROGRAMREFERENCETYPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROGRAMREFERENCETYPEImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROGRAMREFERENCETYPEImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROGRAMREFERENCETYPEImpl#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROGRAMREFERENCETYPEImpl#getInoutParameters <em>Inout Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROGRAMREFERENCETYPEImpl extends ANYTYPEImpl implements PROGRAMREFERENCETYPE {
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
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE inParameters;

	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE outParameters;

	/**
	 * The cached value of the '{@link #getInoutParameters() <em>Inout Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoutParameters()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE inoutParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROGRAMREFERENCETYPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROGRAMREFERENCETYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getInParameters() {
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInParameters(PROPERTIESREFERENCE newInParameters, NotificationChain msgs) {
		PROPERTIESREFERENCE oldInParameters = inParameters;
		inParameters = newInParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS, oldInParameters, newInParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInParameters(PROPERTIESREFERENCE newInParameters) {
		if (newInParameters != inParameters) {
			NotificationChain msgs = null;
			if (inParameters != null)
				msgs = ((InternalEObject)inParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS, null, msgs);
			if (newInParameters != null)
				msgs = ((InternalEObject)newInParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS, null, msgs);
			msgs = basicSetInParameters(newInParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS, newInParameters, newInParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getOutParameters() {
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutParameters(PROPERTIESREFERENCE newOutParameters, NotificationChain msgs) {
		PROPERTIESREFERENCE oldOutParameters = outParameters;
		outParameters = newOutParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS, oldOutParameters, newOutParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutParameters(PROPERTIESREFERENCE newOutParameters) {
		if (newOutParameters != outParameters) {
			NotificationChain msgs = null;
			if (outParameters != null)
				msgs = ((InternalEObject)outParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS, null, msgs);
			if (newOutParameters != null)
				msgs = ((InternalEObject)newOutParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS, null, msgs);
			msgs = basicSetOutParameters(newOutParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS, newOutParameters, newOutParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getInoutParameters() {
		return inoutParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInoutParameters(PROPERTIESREFERENCE newInoutParameters, NotificationChain msgs) {
		PROPERTIESREFERENCE oldInoutParameters = inoutParameters;
		inoutParameters = newInoutParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS, oldInoutParameters, newInoutParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInoutParameters(PROPERTIESREFERENCE newInoutParameters) {
		if (newInoutParameters != inoutParameters) {
			NotificationChain msgs = null;
			if (inoutParameters != null)
				msgs = ((InternalEObject)inoutParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS, null, msgs);
			if (newInoutParameters != null)
				msgs = ((InternalEObject)newInoutParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS, null, msgs);
			msgs = basicSetInoutParameters(newInoutParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS, newInoutParameters, newInoutParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS:
				return basicSetInParameters(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS:
				return basicSetOutParameters(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS:
				return basicSetInoutParameters(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__CLASS_REF:
				return getClassRef();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS:
				return getInParameters();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS:
				return getOutParameters();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS:
				return getInoutParameters();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__CLASS_REF:
				setClassRef((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS:
				setInParameters((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS:
				setOutParameters((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS:
				setInoutParameters((PROPERTIESREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__CLASS_REF:
				setClassRef(CLASS_REF_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS:
				setInParameters((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS:
				setOutParameters((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS:
				setInoutParameters((PROPERTIESREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__CLASS_REF:
				return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__IN_PARAMETERS:
				return inParameters != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__OUT_PARAMETERS:
				return outParameters != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE__INOUT_PARAMETERS:
				return inoutParameters != null;
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
		result.append(" (classRef: ");
		result.append(classRef);
		result.append(')');
		return result.toString();
	}

} //PROGRAMREFERENCETYPEImpl
