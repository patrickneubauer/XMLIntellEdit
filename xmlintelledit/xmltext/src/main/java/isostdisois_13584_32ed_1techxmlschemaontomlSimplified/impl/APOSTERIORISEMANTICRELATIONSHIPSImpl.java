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

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIP;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIPS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APOSTERIORISEMANTICRELATIONSHIPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.APOSTERIORISEMANTICRELATIONSHIPSImpl#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APOSTERIORISEMANTICRELATIONSHIPSImpl extends MinimalEObjectImpl.Container implements APOSTERIORISEMANTICRELATIONSHIPS {
	/**
	 * The cached value of the '{@link #getAPosterioriSemanticRelationships() <em>APosteriori Semantic Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPosterioriSemanticRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<APOSTERIORISEMANTICRELATIONSHIP> aPosterioriSemanticRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APOSTERIORISEMANTICRELATIONSHIPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.APOSTERIORISEMANTICRELATIONSHIPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APOSTERIORISEMANTICRELATIONSHIP> getAPosterioriSemanticRelationships() {
		if (aPosterioriSemanticRelationships == null) {
			aPosterioriSemanticRelationships = new EObjectContainmentEList<APOSTERIORISEMANTICRELATIONSHIP>(APOSTERIORISEMANTICRELATIONSHIP.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS__APOSTERIORI_SEMANTIC_RELATIONSHIPS);
		}
		return aPosterioriSemanticRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return ((InternalEList<?>)getAPosterioriSemanticRelationships()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return getAPosterioriSemanticRelationships();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				getAPosterioriSemanticRelationships().clear();
				getAPosterioriSemanticRelationships().addAll((Collection<? extends APOSTERIORISEMANTICRELATIONSHIP>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				getAPosterioriSemanticRelationships().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return aPosterioriSemanticRelationships != null && !aPosterioriSemanticRelationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APOSTERIORISEMANTICRELATIONSHIPSImpl
