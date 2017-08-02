/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ANYTYPE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAME;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAME;
import xontomlextensionsschemacoreSimplified.EAENTITYTYPEType;
import xontomlextensionsschemacoreSimplified.EATEMPLATE;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EATEMPLATE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getTypeOfEntity <em>Type Of Entity</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getCode <em>Code</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getId <em>Id</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getTypeOfValue <em>Type Of Value</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EATEMPLATEImpl#getPreferredName <em>Preferred Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EATEMPLATEImpl extends MinimalEObjectImpl.Container implements EATEMPLATE {
	/**
	 * The default value of the '{@link #getTypeOfEntity() <em>Type Of Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfEntity()
	 * @generated
	 * @ordered
	 */
	protected static final EAENTITYTYPEType TYPE_OF_ENTITY_EDEFAULT = EAENTITYTYPEType._01;

	/**
	 * The cached value of the '{@link #getTypeOfEntity() <em>Type Of Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfEntity()
	 * @generated
	 * @ordered
	 */
	protected EAENTITYTYPEType typeOfEntity = TYPE_OF_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeOfValue() <em>Type Of Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfValue()
	 * @generated
	 * @ordered
	 */
	protected ANYTYPE typeOfValue;

	/**
	 * The cached value of the '{@link #getSourceLanguage() <em>Source Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGE sourceLanguage;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected SHORTNAME shortName;

	/**
	 * The cached value of the '{@link #getPreferredName() <em>Preferred Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredName()
	 * @generated
	 * @ordered
	 */
	protected PREFERREDNAME preferredName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EATEMPLATEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.EATEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAENTITYTYPEType getTypeOfEntity() {
		return typeOfEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfEntity(EAENTITYTYPEType newTypeOfEntity) {
		EAENTITYTYPEType oldTypeOfEntity = typeOfEntity;
		typeOfEntity = newTypeOfEntity == null ? TYPE_OF_ENTITY_EDEFAULT : newTypeOfEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_ENTITY, oldTypeOfEntity, typeOfEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPE getTypeOfValue() {
		return typeOfValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOfValue(ANYTYPE newTypeOfValue, NotificationChain msgs) {
		ANYTYPE oldTypeOfValue = typeOfValue;
		typeOfValue = newTypeOfValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE, oldTypeOfValue, newTypeOfValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfValue(ANYTYPE newTypeOfValue) {
		if (newTypeOfValue != typeOfValue) {
			NotificationChain msgs = null;
			if (typeOfValue != null)
				msgs = ((InternalEObject)typeOfValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE, null, msgs);
			if (newTypeOfValue != null)
				msgs = ((InternalEObject)newTypeOfValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE, null, msgs);
			msgs = basicSetTypeOfValue(newTypeOfValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE, newTypeOfValue, newTypeOfValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGE getSourceLanguage() {
		return sourceLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceLanguage(LANGUAGE newSourceLanguage, NotificationChain msgs) {
		LANGUAGE oldSourceLanguage = sourceLanguage;
		sourceLanguage = newSourceLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE, oldSourceLanguage, newSourceLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLanguage(LANGUAGE newSourceLanguage) {
		if (newSourceLanguage != sourceLanguage) {
			NotificationChain msgs = null;
			if (sourceLanguage != null)
				msgs = ((InternalEObject)sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE, null, msgs);
			if (newSourceLanguage != null)
				msgs = ((InternalEObject)newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE, null, msgs);
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE, newSourceLanguage, newSourceLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAME getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortName(SHORTNAME newShortName, NotificationChain msgs) {
		SHORTNAME oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME, oldShortName, newShortName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(SHORTNAME newShortName) {
		if (newShortName != shortName) {
			NotificationChain msgs = null;
			if (shortName != null)
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME, newShortName, newShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAME getPreferredName() {
		return preferredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredName(PREFERREDNAME newPreferredName, NotificationChain msgs) {
		PREFERREDNAME oldPreferredName = preferredName;
		preferredName = newPreferredName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME, oldPreferredName, newPreferredName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredName(PREFERREDNAME newPreferredName) {
		if (newPreferredName != preferredName) {
			NotificationChain msgs = null;
			if (preferredName != null)
				msgs = ((InternalEObject)preferredName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME, null, msgs);
			if (newPreferredName != null)
				msgs = ((InternalEObject)newPreferredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME, null, msgs);
			msgs = basicSetPreferredName(newPreferredName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME, newPreferredName, newPreferredName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE:
				return basicSetTypeOfValue(null, msgs);
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME:
				return basicSetPreferredName(null, msgs);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_ENTITY:
				return getTypeOfEntity();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__CODE:
				return getCode();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__ID:
				return getId();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE:
				return getTypeOfValue();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME:
				return getShortName();
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME:
				return getPreferredName();
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
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_ENTITY:
				setTypeOfEntity((EAENTITYTYPEType)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__CODE:
				setCode((String)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__ID:
				setId((String)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE:
				setTypeOfValue((ANYTYPE)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGE)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME:
				setShortName((SHORTNAME)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAME)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_ENTITY:
				setTypeOfEntity(TYPE_OF_ENTITY_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE:
				setTypeOfValue((ANYTYPE)null);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGE)null);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME:
				setShortName((SHORTNAME)null);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAME)null);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_ENTITY:
				return typeOfEntity != TYPE_OF_ENTITY_EDEFAULT;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__TYPE_OF_VALUE:
				return typeOfValue != null;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__SHORT_NAME:
				return shortName != null;
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE__PREFERRED_NAME:
				return preferredName != null;
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
		result.append(" (typeOfEntity: ");
		result.append(typeOfEntity);
		result.append(", code: ");
		result.append(code);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EATEMPLATEImpl
