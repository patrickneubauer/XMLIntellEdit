/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.SourceInterfacesType;
import tosca.TRelationshipType;
import tosca.TTopologyElementInstanceStates;
import tosca.TargetInterfacesType;
import tosca.ToscaPackage;
import tosca.ValidSourceType;
import tosca.ValidTargetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRelationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TRelationshipTypeImpl#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTypeImpl#getSourceInterfaces <em>Source Interfaces</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTypeImpl#getTargetInterfaces <em>Target Interfaces</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTypeImpl#getValidSource <em>Valid Source</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTypeImpl#getValidTarget <em>Valid Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRelationshipTypeImpl extends TEntityTypeImpl implements TRelationshipType {
	/**
	 * The cached value of the '{@link #getInstanceStates() <em>Instance States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceStates()
	 * @generated
	 * @ordered
	 */
	protected TTopologyElementInstanceStates instanceStates;

	/**
	 * The cached value of the '{@link #getSourceInterfaces() <em>Source Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected SourceInterfacesType sourceInterfaces;

	/**
	 * The cached value of the '{@link #getTargetInterfaces() <em>Target Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInterfaces()
	 * @generated
	 * @ordered
	 */
	protected TargetInterfacesType targetInterfaces;

	/**
	 * The cached value of the '{@link #getValidSource() <em>Valid Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidSource()
	 * @generated
	 * @ordered
	 */
	protected ValidSourceType validSource;

	/**
	 * The cached value of the '{@link #getValidTarget() <em>Valid Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTarget()
	 * @generated
	 * @ordered
	 */
	protected ValidTargetType validTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TRELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyElementInstanceStates getInstanceStates() {
		return instanceStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceStates(TTopologyElementInstanceStates newInstanceStates, NotificationChain msgs) {
		TTopologyElementInstanceStates oldInstanceStates = instanceStates;
		instanceStates = newInstanceStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES, oldInstanceStates, newInstanceStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceStates(TTopologyElementInstanceStates newInstanceStates) {
		if (newInstanceStates != instanceStates) {
			NotificationChain msgs = null;
			if (instanceStates != null)
				msgs = ((InternalEObject)instanceStates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES, null, msgs);
			if (newInstanceStates != null)
				msgs = ((InternalEObject)newInstanceStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES, null, msgs);
			msgs = basicSetInstanceStates(newInstanceStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES, newInstanceStates, newInstanceStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceInterfacesType getSourceInterfaces() {
		return sourceInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceInterfaces(SourceInterfacesType newSourceInterfaces, NotificationChain msgs) {
		SourceInterfacesType oldSourceInterfaces = sourceInterfaces;
		sourceInterfaces = newSourceInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES, oldSourceInterfaces, newSourceInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceInterfaces(SourceInterfacesType newSourceInterfaces) {
		if (newSourceInterfaces != sourceInterfaces) {
			NotificationChain msgs = null;
			if (sourceInterfaces != null)
				msgs = ((InternalEObject)sourceInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES, null, msgs);
			if (newSourceInterfaces != null)
				msgs = ((InternalEObject)newSourceInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES, null, msgs);
			msgs = basicSetSourceInterfaces(newSourceInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES, newSourceInterfaces, newSourceInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetInterfacesType getTargetInterfaces() {
		return targetInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetInterfaces(TargetInterfacesType newTargetInterfaces, NotificationChain msgs) {
		TargetInterfacesType oldTargetInterfaces = targetInterfaces;
		targetInterfaces = newTargetInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES, oldTargetInterfaces, newTargetInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInterfaces(TargetInterfacesType newTargetInterfaces) {
		if (newTargetInterfaces != targetInterfaces) {
			NotificationChain msgs = null;
			if (targetInterfaces != null)
				msgs = ((InternalEObject)targetInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES, null, msgs);
			if (newTargetInterfaces != null)
				msgs = ((InternalEObject)newTargetInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES, null, msgs);
			msgs = basicSetTargetInterfaces(newTargetInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES, newTargetInterfaces, newTargetInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidSourceType getValidSource() {
		return validSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidSource(ValidSourceType newValidSource, NotificationChain msgs) {
		ValidSourceType oldValidSource = validSource;
		validSource = newValidSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE, oldValidSource, newValidSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidSource(ValidSourceType newValidSource) {
		if (newValidSource != validSource) {
			NotificationChain msgs = null;
			if (validSource != null)
				msgs = ((InternalEObject)validSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE, null, msgs);
			if (newValidSource != null)
				msgs = ((InternalEObject)newValidSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE, null, msgs);
			msgs = basicSetValidSource(newValidSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE, newValidSource, newValidSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidTargetType getValidTarget() {
		return validTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTarget(ValidTargetType newValidTarget, NotificationChain msgs) {
		ValidTargetType oldValidTarget = validTarget;
		validTarget = newValidTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET, oldValidTarget, newValidTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTarget(ValidTargetType newValidTarget) {
		if (newValidTarget != validTarget) {
			NotificationChain msgs = null;
			if (validTarget != null)
				msgs = ((InternalEObject)validTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET, null, msgs);
			if (newValidTarget != null)
				msgs = ((InternalEObject)newValidTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET, null, msgs);
			msgs = basicSetValidTarget(newValidTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET, newValidTarget, newValidTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES:
				return basicSetInstanceStates(null, msgs);
			case ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES:
				return basicSetSourceInterfaces(null, msgs);
			case ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES:
				return basicSetTargetInterfaces(null, msgs);
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE:
				return basicSetValidSource(null, msgs);
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET:
				return basicSetValidTarget(null, msgs);
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
			case ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES:
				return getInstanceStates();
			case ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES:
				return getSourceInterfaces();
			case ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES:
				return getTargetInterfaces();
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE:
				return getValidSource();
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET:
				return getValidTarget();
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
			case ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES:
				setInstanceStates((TTopologyElementInstanceStates)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES:
				setSourceInterfaces((SourceInterfacesType)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES:
				setTargetInterfaces((TargetInterfacesType)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE:
				setValidSource((ValidSourceType)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET:
				setValidTarget((ValidTargetType)newValue);
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
			case ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES:
				setInstanceStates((TTopologyElementInstanceStates)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES:
				setSourceInterfaces((SourceInterfacesType)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES:
				setTargetInterfaces((TargetInterfacesType)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE:
				setValidSource((ValidSourceType)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET:
				setValidTarget((ValidTargetType)null);
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
			case ToscaPackage.TRELATIONSHIP_TYPE__INSTANCE_STATES:
				return instanceStates != null;
			case ToscaPackage.TRELATIONSHIP_TYPE__SOURCE_INTERFACES:
				return sourceInterfaces != null;
			case ToscaPackage.TRELATIONSHIP_TYPE__TARGET_INTERFACES:
				return targetInterfaces != null;
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_SOURCE:
				return validSource != null;
			case ToscaPackage.TRELATIONSHIP_TYPE__VALID_TARGET:
				return validTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //TRelationshipTypeImpl
