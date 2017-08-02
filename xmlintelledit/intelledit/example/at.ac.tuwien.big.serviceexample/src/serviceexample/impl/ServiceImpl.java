/**
 */
package serviceexample.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import serviceexample.Cluster;
import serviceexample.Service;
import serviceexample.ServiceType;
import serviceexample.ServiceexamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link serviceexample.impl.ServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link serviceexample.impl.ServiceImpl#getDesignSpeed <em>Design Speed</em>}</li>
 *   <li>{@link serviceexample.impl.ServiceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedThingImpl implements Service {
	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected Cluster providedBy;

	/**
	 * The default value of the '{@link #getDesignSpeed() <em>Design Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DESIGN_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignSpeed() <em>Design Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger designSpeed = DESIGN_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceType TYPE_EDEFAULT = ServiceType.BESTEFFORT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ServiceType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceexamplePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getProvidedBy() {
		if (providedBy != null && providedBy.eIsProxy()) {
			InternalEObject oldProvidedBy = (InternalEObject)providedBy;
			providedBy = (Cluster)eResolveProxy(oldProvidedBy);
			if (providedBy != oldProvidedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceexamplePackage.SERVICE__PROVIDED_BY, oldProvidedBy, providedBy));
			}
		}
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedBy(Cluster newProvidedBy) {
		Cluster oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceexamplePackage.SERVICE__PROVIDED_BY, oldProvidedBy, providedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDesignSpeed() {
		return designSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignSpeed(BigInteger newDesignSpeed) {
		BigInteger oldDesignSpeed = designSpeed;
		designSpeed = newDesignSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceexamplePackage.SERVICE__DESIGN_SPEED, oldDesignSpeed, designSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ServiceType newType) {
		ServiceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceexamplePackage.SERVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceexamplePackage.SERVICE__PROVIDED_BY:
				if (resolve) return getProvidedBy();
				return basicGetProvidedBy();
			case ServiceexamplePackage.SERVICE__DESIGN_SPEED:
				return getDesignSpeed();
			case ServiceexamplePackage.SERVICE__TYPE:
				return getType();
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
			case ServiceexamplePackage.SERVICE__PROVIDED_BY:
				setProvidedBy((Cluster)newValue);
				return;
			case ServiceexamplePackage.SERVICE__DESIGN_SPEED:
				setDesignSpeed((BigInteger)newValue);
				return;
			case ServiceexamplePackage.SERVICE__TYPE:
				setType((ServiceType)newValue);
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
			case ServiceexamplePackage.SERVICE__PROVIDED_BY:
				setProvidedBy((Cluster)null);
				return;
			case ServiceexamplePackage.SERVICE__DESIGN_SPEED:
				setDesignSpeed(DESIGN_SPEED_EDEFAULT);
				return;
			case ServiceexamplePackage.SERVICE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ServiceexamplePackage.SERVICE__PROVIDED_BY:
				return providedBy != null;
			case ServiceexamplePackage.SERVICE__DESIGN_SPEED:
				return DESIGN_SPEED_EDEFAULT == null ? designSpeed != null : !DESIGN_SPEED_EDEFAULT.equals(designSpeed);
			case ServiceexamplePackage.SERVICE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (designSpeed: ");
		result.append(designSpeed);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
