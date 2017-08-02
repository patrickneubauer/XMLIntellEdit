/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xontomlextensionsschemacoreSimplified.EAVALUATION;
import xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENTITYEXTENDEDATTRIBUTES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.ENTITYEXTENDEDATTRIBUTESImpl#getEntityRef <em>Entity Ref</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.ENTITYEXTENDEDATTRIBUTESImpl#getEas <em>Eas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENTITYEXTENDEDATTRIBUTESImpl extends MinimalEObjectImpl.Container implements ENTITYEXTENDEDATTRIBUTES {
	/**
	 * The default value of the '{@link #getEntityRef() <em>Entity Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityRef() <em>Entity Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityRef()
	 * @generated
	 * @ordered
	 */
	protected String entityRef = ENTITY_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEas() <em>Eas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEas()
	 * @generated
	 * @ordered
	 */
	protected EList<EAVALUATION> eas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENTITYEXTENDEDATTRIBUTESImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.ENTITYEXTENDEDATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityRef() {
		return entityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityRef(String newEntityRef) {
		String oldEntityRef = entityRef;
		entityRef = newEntityRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__ENTITY_REF, oldEntityRef, entityRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAVALUATION> getEas() {
		if (eas == null) {
			eas = new EObjectContainmentEList<EAVALUATION>(EAVALUATION.class, this, XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__EAS);
		}
		return eas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__EAS:
				return ((InternalEList<?>)getEas()).basicRemove(otherEnd, msgs);
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
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__ENTITY_REF:
				return getEntityRef();
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__EAS:
				return getEas();
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
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__ENTITY_REF:
				setEntityRef((String)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__EAS:
				getEas().clear();
				getEas().addAll((Collection<? extends EAVALUATION>)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__ENTITY_REF:
				setEntityRef(ENTITY_REF_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__EAS:
				getEas().clear();
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
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__ENTITY_REF:
				return ENTITY_REF_EDEFAULT == null ? entityRef != null : !ENTITY_REF_EDEFAULT.equals(entityRef);
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES__EAS:
				return eas != null && !eas.isEmpty();
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
		result.append(" (entityRef: ");
		result.append(entityRef);
		result.append(')');
		return result.toString();
	}

} //ENTITYEXTENDEDATTRIBUTESImpl
