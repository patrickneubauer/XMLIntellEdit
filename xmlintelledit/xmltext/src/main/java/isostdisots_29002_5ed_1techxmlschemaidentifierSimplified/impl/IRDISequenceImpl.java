/**
 */
package isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.IRDISequence;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IRDI Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.impl.IRDISequenceImpl#getIRDIs <em>IRD Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IRDISequenceImpl extends MinimalEObjectImpl.Container implements IRDISequence {
	/**
	 * The cached value of the '{@link #getIRDIs() <em>IRD Is</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRDIs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iRDIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IRDISequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.Literals.IRDI_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIRDIs() {
		if (iRDIs == null) {
			iRDIs = new EDataTypeEList<String>(String.class, this, Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE__IRD_IS);
		}
		return iRDIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE__IRD_IS:
				return getIRDIs();
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
			case Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE__IRD_IS:
				getIRDIs().clear();
				getIRDIs().addAll((Collection<? extends String>)newValue);
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
			case Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE__IRD_IS:
				getIRDIs().clear();
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
			case Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE__IRD_IS:
				return iRDIs != null && !iRDIs.isEmpty();
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
		result.append(" (iRDIs: ");
		result.append(iRDIs);
		result.append(')');
		return result.toString();
	}

} //IRDISequenceImpl
