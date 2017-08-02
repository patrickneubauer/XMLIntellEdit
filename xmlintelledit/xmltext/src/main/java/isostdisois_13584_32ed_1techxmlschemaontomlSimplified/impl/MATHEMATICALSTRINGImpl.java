/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MATHEMATICALSTRING;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MATHEMATICALSTRING</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.MATHEMATICALSTRINGImpl#getTextRepresentation <em>Text Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MATHEMATICALSTRINGImpl extends MinimalEObjectImpl.Container implements MATHEMATICALSTRING {
	/**
	 * The default value of the '{@link #getTextRepresentation() <em>Text Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_REPRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextRepresentation() <em>Text Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRepresentation()
	 * @generated
	 * @ordered
	 */
	protected String textRepresentation = TEXT_REPRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MATHEMATICALSTRINGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.MATHEMATICALSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextRepresentation() {
		return textRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRepresentation(String newTextRepresentation) {
		String oldTextRepresentation = textRepresentation;
		textRepresentation = newTextRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING__TEXT_REPRESENTATION, oldTextRepresentation, textRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING__TEXT_REPRESENTATION:
				return getTextRepresentation();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING__TEXT_REPRESENTATION:
				setTextRepresentation((String)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING__TEXT_REPRESENTATION:
				setTextRepresentation(TEXT_REPRESENTATION_EDEFAULT);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING__TEXT_REPRESENTATION:
				return TEXT_REPRESENTATION_EDEFAULT == null ? textRepresentation != null : !TEXT_REPRESENTATION_EDEFAULT.equals(textRepresentation);
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
		result.append(" (textRepresentation: ");
		result.append(textRepresentation);
		result.append(')');
		return result.toString();
	}

} //MATHEMATICALSTRINGImpl
