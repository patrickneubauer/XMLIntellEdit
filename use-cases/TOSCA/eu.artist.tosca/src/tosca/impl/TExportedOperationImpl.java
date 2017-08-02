/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.NodeOperationType;
import tosca.PlanType;
import tosca.RelationshipOperationType;
import tosca.TExportedOperation;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TExported Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TExportedOperationImpl#getNodeOperation <em>Node Operation</em>}</li>
 *   <li>{@link tosca.impl.TExportedOperationImpl#getRelationshipOperation <em>Relationship Operation</em>}</li>
 *   <li>{@link tosca.impl.TExportedOperationImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link tosca.impl.TExportedOperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TExportedOperationImpl extends MinimalEObjectImpl.Container implements TExportedOperation {
	/**
	 * The cached value of the '{@link #getNodeOperation() <em>Node Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeOperation()
	 * @generated
	 * @ordered
	 */
	protected NodeOperationType nodeOperation;

	/**
	 * The cached value of the '{@link #getRelationshipOperation() <em>Relationship Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipOperation()
	 * @generated
	 * @ordered
	 */
	protected RelationshipOperationType relationshipOperation;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected PlanType plan;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TExportedOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TEXPORTED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOperationType getNodeOperation() {
		return nodeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeOperation(NodeOperationType newNodeOperation, NotificationChain msgs) {
		NodeOperationType oldNodeOperation = nodeOperation;
		nodeOperation = newNodeOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION, oldNodeOperation, newNodeOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeOperation(NodeOperationType newNodeOperation) {
		if (newNodeOperation != nodeOperation) {
			NotificationChain msgs = null;
			if (nodeOperation != null)
				msgs = ((InternalEObject)nodeOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION, null, msgs);
			if (newNodeOperation != null)
				msgs = ((InternalEObject)newNodeOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION, null, msgs);
			msgs = basicSetNodeOperation(newNodeOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION, newNodeOperation, newNodeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipOperationType getRelationshipOperation() {
		return relationshipOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshipOperation(RelationshipOperationType newRelationshipOperation, NotificationChain msgs) {
		RelationshipOperationType oldRelationshipOperation = relationshipOperation;
		relationshipOperation = newRelationshipOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION, oldRelationshipOperation, newRelationshipOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipOperation(RelationshipOperationType newRelationshipOperation) {
		if (newRelationshipOperation != relationshipOperation) {
			NotificationChain msgs = null;
			if (relationshipOperation != null)
				msgs = ((InternalEObject)relationshipOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION, null, msgs);
			if (newRelationshipOperation != null)
				msgs = ((InternalEObject)newRelationshipOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION, null, msgs);
			msgs = basicSetRelationshipOperation(newRelationshipOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION, newRelationshipOperation, newRelationshipOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanType getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(PlanType newPlan, NotificationChain msgs) {
		PlanType oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(PlanType newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TEXPORTED_OPERATION__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TEXPORTED_OPERATION__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TEXPORTED_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION:
				return basicSetNodeOperation(null, msgs);
			case ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION:
				return basicSetRelationshipOperation(null, msgs);
			case ToscaPackage.TEXPORTED_OPERATION__PLAN:
				return basicSetPlan(null, msgs);
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
			case ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION:
				return getNodeOperation();
			case ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION:
				return getRelationshipOperation();
			case ToscaPackage.TEXPORTED_OPERATION__PLAN:
				return getPlan();
			case ToscaPackage.TEXPORTED_OPERATION__NAME:
				return getName();
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
			case ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION:
				setNodeOperation((NodeOperationType)newValue);
				return;
			case ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION:
				setRelationshipOperation((RelationshipOperationType)newValue);
				return;
			case ToscaPackage.TEXPORTED_OPERATION__PLAN:
				setPlan((PlanType)newValue);
				return;
			case ToscaPackage.TEXPORTED_OPERATION__NAME:
				setName((String)newValue);
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
			case ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION:
				setNodeOperation((NodeOperationType)null);
				return;
			case ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION:
				setRelationshipOperation((RelationshipOperationType)null);
				return;
			case ToscaPackage.TEXPORTED_OPERATION__PLAN:
				setPlan((PlanType)null);
				return;
			case ToscaPackage.TEXPORTED_OPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case ToscaPackage.TEXPORTED_OPERATION__NODE_OPERATION:
				return nodeOperation != null;
			case ToscaPackage.TEXPORTED_OPERATION__RELATIONSHIP_OPERATION:
				return relationshipOperation != null;
			case ToscaPackage.TEXPORTED_OPERATION__PLAN:
				return plan != null;
			case ToscaPackage.TEXPORTED_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TExportedOperationImpl
