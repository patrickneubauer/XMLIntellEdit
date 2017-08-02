/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xontomlextensionsschemacoreSimplified.EAREFERENCE;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EAREFERENCEImpl#getValue <em>Value</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EAREFERENCEImpl#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAREFERENCEImpl extends MinimalEObjectImpl.Container implements EAREFERENCE {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected String templateId = TEMPLATE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAREFERENCEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.EAREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateId(String newTemplateId) {
		String oldTemplateId = templateId;
		templateId = newTemplateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__TEMPLATE_ID, oldTemplateId, templateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__VALUE:
				return getValue();
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__TEMPLATE_ID:
				return getTemplateId();
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
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__VALUE:
				setValue((String)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__TEMPLATE_ID:
				setTemplateId((String)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__TEMPLATE_ID:
				setTemplateId(TEMPLATE_ID_EDEFAULT);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null ? templateId != null : !TEMPLATE_ID_EDEFAULT.equals(templateId);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", templateId: ");
		result.append(templateId);
		result.append(')');
		return result.toString();
	}

} //EAREFERENCEImpl
