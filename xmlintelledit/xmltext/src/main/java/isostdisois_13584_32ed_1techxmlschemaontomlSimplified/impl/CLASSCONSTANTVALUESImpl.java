/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSCONSTANTVALUES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSCONSTANTVALUES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSCONSTANTVALUESImpl#getClassValueAssignments <em>Class Value Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSCONSTANTVALUESImpl extends MinimalEObjectImpl.Container implements CLASSCONSTANTVALUES {
	/**
	 * The cached value of the '{@link #getClassValueAssignments() <em>Class Value Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<CLASSVALUEASSIGNMENT> classValueAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSCONSTANTVALUESImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSCONSTANTVALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLASSVALUEASSIGNMENT> getClassValueAssignments() {
		if (classValueAssignments == null) {
			classValueAssignments = new EObjectContainmentEList<CLASSVALUEASSIGNMENT>(CLASSVALUEASSIGNMENT.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES__CLASS_VALUE_ASSIGNMENTS);
		}
		return classValueAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES__CLASS_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getClassValueAssignments()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES__CLASS_VALUE_ASSIGNMENTS:
				return getClassValueAssignments();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES__CLASS_VALUE_ASSIGNMENTS:
				getClassValueAssignments().clear();
				getClassValueAssignments().addAll((Collection<? extends CLASSVALUEASSIGNMENT>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES__CLASS_VALUE_ASSIGNMENTS:
				getClassValueAssignments().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES__CLASS_VALUE_ASSIGNMENTS:
				return classValueAssignments != null && !classValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CLASSCONSTANTVALUESImpl
