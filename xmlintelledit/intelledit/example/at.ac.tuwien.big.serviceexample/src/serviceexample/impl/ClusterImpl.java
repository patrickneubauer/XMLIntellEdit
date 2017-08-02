/**
 */
package serviceexample.impl;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceexample.Cluster;
import serviceexample.Server;
import serviceexample.Service;
import serviceexample.ServiceexamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link serviceexample.impl.ClusterImpl#getServices <em>Services</em>}</li>
 *   <li>{@link serviceexample.impl.ClusterImpl#getBackup <em>Backup</em>}</li>
 *   <li>{@link serviceexample.impl.ClusterImpl#getDesignSpeed <em>Design Speed</em>}</li>
 *   <li>{@link serviceexample.impl.ClusterImpl#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends NamedThingImpl implements Cluster {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;
	
	

	/**
	 * The cached value of the '{@link #getBackup() <em>Backup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup()
	 * @generated
	 * @ordered
	 */
	protected Cluster backup;

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
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceexamplePackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<Service>(Service.class, this, ServiceexamplePackage.CLUSTER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getBackup() {
		if (backup != null && backup.eIsProxy()) {
			InternalEObject oldBackup = (InternalEObject)backup;
			backup = (Cluster)eResolveProxy(oldBackup);
			if (backup != oldBackup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceexamplePackage.CLUSTER__BACKUP, oldBackup, backup));
			}
		}
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetBackup() {
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackup(Cluster newBackup) {
		Cluster oldBackup = backup;
		backup = newBackup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceexamplePackage.CLUSTER__BACKUP, oldBackup, backup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceexamplePackage.CLUSTER__DESIGN_SPEED, oldDesignSpeed, designSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectContainmentEList<Server>(Server.class, this, ServiceexamplePackage.CLUSTER__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServiceexamplePackage.CLUSTER__SERVER:
				return ((InternalEList<?>)getServer()).basicRemove(otherEnd, msgs);
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
			case ServiceexamplePackage.CLUSTER__SERVICES:
				return getServices();
			case ServiceexamplePackage.CLUSTER__BACKUP:
				if (resolve) return getBackup();
				return basicGetBackup();
			case ServiceexamplePackage.CLUSTER__DESIGN_SPEED:
				return getDesignSpeed();
			case ServiceexamplePackage.CLUSTER__SERVER:
				return getServer();
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
			case ServiceexamplePackage.CLUSTER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ServiceexamplePackage.CLUSTER__BACKUP:
				setBackup((Cluster)newValue);
				return;
			case ServiceexamplePackage.CLUSTER__DESIGN_SPEED:
				setDesignSpeed((BigInteger)newValue);
				return;
			case ServiceexamplePackage.CLUSTER__SERVER:
				getServer().clear();
				getServer().addAll((Collection<? extends Server>)newValue);
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
			case ServiceexamplePackage.CLUSTER__SERVICES:
				getServices().clear();
				return;
			case ServiceexamplePackage.CLUSTER__BACKUP:
				setBackup((Cluster)null);
				return;
			case ServiceexamplePackage.CLUSTER__DESIGN_SPEED:
				setDesignSpeed(DESIGN_SPEED_EDEFAULT);
				return;
			case ServiceexamplePackage.CLUSTER__SERVER:
				getServer().clear();
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
			case ServiceexamplePackage.CLUSTER__SERVICES:
				return services != null && !services.isEmpty();
			case ServiceexamplePackage.CLUSTER__BACKUP:
				return backup != null;
			case ServiceexamplePackage.CLUSTER__DESIGN_SPEED:
				return DESIGN_SPEED_EDEFAULT == null ? designSpeed != null : !DESIGN_SPEED_EDEFAULT.equals(designSpeed);
			case ServiceexamplePackage.CLUSTER__SERVER:
				return server != null && !server.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ClusterImpl
