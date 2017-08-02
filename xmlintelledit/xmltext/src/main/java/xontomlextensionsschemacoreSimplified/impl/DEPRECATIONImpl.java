/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xontomlextensionsschemacoreSimplified.DEPRECATION;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEPRECATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl#getContext <em>Context</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.DEPRECATIONImpl#getRelType <em>Rel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DEPRECATIONImpl extends MinimalEObjectImpl.Container implements DEPRECATION {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected String entity = ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelType() <em>Rel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelType()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelType() <em>Rel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelType()
	 * @generated
	 * @ordered
	 */
	protected String relType = REL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEPRECATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.DEPRECATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(String newEntity) {
		String oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelType() {
		return relType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelType(String newRelType) {
		String oldRelType = relType;
		relType = newRelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__REL_TYPE, oldRelType, relType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__CONTEXT:
				return getContext();
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__ENTITY:
				return getEntity();
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__REL_TYPE:
				return getRelType();
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
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__CONTEXT:
				setContext((String)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__ENTITY:
				setEntity((String)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__REL_TYPE:
				setRelType((String)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__ENTITY:
				setEntity(ENTITY_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__REL_TYPE:
				setRelType(REL_TYPE_EDEFAULT);
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
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__ENTITY:
				return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION__REL_TYPE:
				return REL_TYPE_EDEFAULT == null ? relType != null : !REL_TYPE_EDEFAULT.equals(relType);
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
		result.append(" (context: ");
		result.append(context);
		result.append(", entity: ");
		result.append(entity);
		result.append(", relType: ");
		result.append(relType);
		result.append(')');
		return result.toString();
	}

} //DEPRECATIONImpl
