/**
 */
package toscabasetypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import toscabasetypes.NumCpusType;
import toscabasetypes.TServerProperties;
import toscabasetypes.ToscabasetypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TServer Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link toscabasetypes.impl.TServerPropertiesImpl#getNumCpus <em>Num Cpus</em>}</li>
 *   <li>{@link toscabasetypes.impl.TServerPropertiesImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TServerPropertiesImpl extends MinimalEObjectImpl.Container implements TServerProperties {
	/**
	 * The default value of the '{@link #getNumCpus() <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCpus()
	 * @generated
	 * @ordered
	 */
	protected static final NumCpusType NUM_CPUS_EDEFAULT = NumCpusType._1;

	/**
	 * The cached value of the '{@link #getNumCpus() <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCpus()
	 * @generated
	 * @ordered
	 */
	protected NumCpusType numCpus = NUM_CPUS_EDEFAULT;

	/**
	 * This is true if the Num Cpus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numCpusESet;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * This is true if the Memory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TServerPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscabasetypesPackage.Literals.TSERVER_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumCpusType getNumCpus() {
		return numCpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCpus(NumCpusType newNumCpus) {
		NumCpusType oldNumCpus = numCpus;
		numCpus = newNumCpus == null ? NUM_CPUS_EDEFAULT : newNumCpus;
		boolean oldNumCpusESet = numCpusESet;
		numCpusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscabasetypesPackage.TSERVER_PROPERTIES__NUM_CPUS, oldNumCpus, numCpus, !oldNumCpusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumCpus() {
		NumCpusType oldNumCpus = numCpus;
		boolean oldNumCpusESet = numCpusESet;
		numCpus = NUM_CPUS_EDEFAULT;
		numCpusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscabasetypesPackage.TSERVER_PROPERTIES__NUM_CPUS, oldNumCpus, NUM_CPUS_EDEFAULT, oldNumCpusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumCpus() {
		return numCpusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		boolean oldMemoryESet = memoryESet;
		memoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscabasetypesPackage.TSERVER_PROPERTIES__MEMORY, oldMemory, memory, !oldMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemory() {
		int oldMemory = memory;
		boolean oldMemoryESet = memoryESet;
		memory = MEMORY_EDEFAULT;
		memoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscabasetypesPackage.TSERVER_PROPERTIES__MEMORY, oldMemory, MEMORY_EDEFAULT, oldMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemory() {
		return memoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscabasetypesPackage.TSERVER_PROPERTIES__NUM_CPUS:
				return getNumCpus();
			case ToscabasetypesPackage.TSERVER_PROPERTIES__MEMORY:
				return getMemory();
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
			case ToscabasetypesPackage.TSERVER_PROPERTIES__NUM_CPUS:
				setNumCpus((NumCpusType)newValue);
				return;
			case ToscabasetypesPackage.TSERVER_PROPERTIES__MEMORY:
				setMemory((Integer)newValue);
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
			case ToscabasetypesPackage.TSERVER_PROPERTIES__NUM_CPUS:
				unsetNumCpus();
				return;
			case ToscabasetypesPackage.TSERVER_PROPERTIES__MEMORY:
				unsetMemory();
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
			case ToscabasetypesPackage.TSERVER_PROPERTIES__NUM_CPUS:
				return isSetNumCpus();
			case ToscabasetypesPackage.TSERVER_PROPERTIES__MEMORY:
				return isSetMemory();
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
		result.append(" (numCpus: ");
		if (numCpusESet) result.append(numCpus); else result.append("<unset>");
		result.append(", memory: ");
		if (memoryESet) result.append(memory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TServerPropertiesImpl
