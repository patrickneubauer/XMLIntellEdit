/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.RelationshipOperationType;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.RelationshipOperationTypeImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link tosca.impl.RelationshipOperationTypeImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link tosca.impl.RelationshipOperationTypeImpl#getRelationshipRef <em>Relationship Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipOperationTypeImpl extends MinimalEObjectImpl.Container implements RelationshipOperationType {
	/**
	 * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipRef() <em>Relationship Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipRef() <em>Relationship Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipRef()
	 * @generated
	 * @ordered
	 */
	protected String relationshipRef = RELATIONSHIP_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipOperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceName(String newInterfaceName) {
		String oldInterfaceName = interfaceName;
		interfaceName = newInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME, oldInterfaceName, interfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipRef() {
		return relationshipRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipRef(String newRelationshipRef) {
		String oldRelationshipRef = relationshipRef;
		relationshipRef = newRelationshipRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF, oldRelationshipRef, relationshipRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME:
				return getInterfaceName();
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME:
				return getOperationName();
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF:
				return getRelationshipRef();
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
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME:
				setInterfaceName((String)newValue);
				return;
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF:
				setRelationshipRef((String)newValue);
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
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
				return;
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF:
				setRelationshipRef(RELATIONSHIP_REF_EDEFAULT);
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
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF:
				return RELATIONSHIP_REF_EDEFAULT == null ? relationshipRef != null : !RELATIONSHIP_REF_EDEFAULT.equals(relationshipRef);
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
		result.append(" (interfaceName: ");
		result.append(interfaceName);
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", relationshipRef: ");
		result.append(relationshipRef);
		result.append(')');
		return result.toString();
	}

} //RelationshipOperationTypeImpl
