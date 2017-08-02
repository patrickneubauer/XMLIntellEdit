/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATIONTYPEType;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STANDARDSIZEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ILLUSTRATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ILLUSTRATIONImpl#getCode <em>Code</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ILLUSTRATIONImpl#getKindOfContent <em>Kind Of Content</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ILLUSTRATIONImpl#getStandardSize <em>Standard Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ILLUSTRATIONImpl extends EXTERNALRESOURCEImpl implements ILLUSTRATION {
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
	 * The default value of the '{@link #getKindOfContent() <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfContent()
	 * @generated
	 * @ordered
	 */
	protected static final ILLUSTRATIONTYPEType KIND_OF_CONTENT_EDEFAULT = ILLUSTRATIONTYPEType.SCHEMATICDRAWING;

	/**
	 * The cached value of the '{@link #getKindOfContent() <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfContent()
	 * @generated
	 * @ordered
	 */
	protected ILLUSTRATIONTYPEType kindOfContent = KIND_OF_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardSize() <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSize()
	 * @generated
	 * @ordered
	 */
	protected static final STANDARDSIZEType STANDARD_SIZE_EDEFAULT = STANDARDSIZEType.A6_ILLUSTRATION;

	/**
	 * The cached value of the '{@link #getStandardSize() <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSize()
	 * @generated
	 * @ordered
	 */
	protected STANDARDSIZEType standardSize = STANDARD_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ILLUSTRATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ILLUSTRATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONTYPEType getKindOfContent() {
		return kindOfContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfContent(ILLUSTRATIONTYPEType newKindOfContent) {
		ILLUSTRATIONTYPEType oldKindOfContent = kindOfContent;
		kindOfContent = newKindOfContent == null ? KIND_OF_CONTENT_EDEFAULT : newKindOfContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__KIND_OF_CONTENT, oldKindOfContent, kindOfContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STANDARDSIZEType getStandardSize() {
		return standardSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardSize(STANDARDSIZEType newStandardSize) {
		STANDARDSIZEType oldStandardSize = standardSize;
		standardSize = newStandardSize == null ? STANDARD_SIZE_EDEFAULT : newStandardSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__STANDARD_SIZE, oldStandardSize, standardSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__CODE:
				return getCode();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__KIND_OF_CONTENT:
				return getKindOfContent();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__STANDARD_SIZE:
				return getStandardSize();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__CODE:
				setCode((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__KIND_OF_CONTENT:
				setKindOfContent((ILLUSTRATIONTYPEType)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__STANDARD_SIZE:
				setStandardSize((STANDARDSIZEType)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__KIND_OF_CONTENT:
				setKindOfContent(KIND_OF_CONTENT_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__STANDARD_SIZE:
				setStandardSize(STANDARD_SIZE_EDEFAULT);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__KIND_OF_CONTENT:
				return kindOfContent != KIND_OF_CONTENT_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION__STANDARD_SIZE:
				return standardSize != STANDARD_SIZE_EDEFAULT;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", kindOfContent: ");
		result.append(kindOfContent);
		result.append(", standardSize: ");
		result.append(standardSize);
		result.append(')');
		return result.toString();
	}

} //ILLUSTRATIONImpl
