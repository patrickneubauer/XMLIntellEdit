/**
 */
package com.example.example.with.substitutiongroup.impl;

import com.example.example.with.substitutiongroup.Custinfo;
import com.example.example.with.substitutiongroup.DocumentRoot;
import com.example.example.with.substitutiongroup.SubstitutiongroupPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getKunde <em>Kunde</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.DocumentRootImpl#getNavn <em>Navn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNavn() <em>Navn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavn()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubstitutiongroupPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SubstitutiongroupPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SubstitutiongroupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SubstitutiongroupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custinfo getCustomer() {
		return (Custinfo)getMixed().get(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Custinfo newCustomer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__CUSTOMER, newCustomer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Custinfo newCustomer) {
		((FeatureMap.Internal)getMixed()).set(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__CUSTOMER, newCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custinfo getKunde() {
		return (Custinfo)getMixed().get(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__KUNDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKunde(Custinfo newKunde, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__KUNDE, newKunde, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKunde(Custinfo newKunde) {
		((FeatureMap.Internal)getMixed()).set(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__KUNDE, newKunde);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)getMixed().get(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavn() {
		return (String)getMixed().get(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__NAVN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavn(String newNavn) {
		((FeatureMap.Internal)getMixed()).set(SubstitutiongroupPackage.Literals.DOCUMENT_ROOT__NAVN, newNavn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubstitutiongroupPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SubstitutiongroupPackage.DOCUMENT_ROOT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case SubstitutiongroupPackage.DOCUMENT_ROOT__KUNDE:
				return basicSetKunde(null, msgs);
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
			case SubstitutiongroupPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__CUSTOMER:
				return getCustomer();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__KUNDE:
				return getKunde();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAVN:
				return getNavn();
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
			case SubstitutiongroupPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__CUSTOMER:
				setCustomer((Custinfo)newValue);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__KUNDE:
				setKunde((Custinfo)newValue);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAVN:
				setNavn((String)newValue);
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
			case SubstitutiongroupPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__CUSTOMER:
				setCustomer((Custinfo)null);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__KUNDE:
				setKunde((Custinfo)null);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAVN:
				setNavn(NAVN_EDEFAULT);
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
			case SubstitutiongroupPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SubstitutiongroupPackage.DOCUMENT_ROOT__CUSTOMER:
				return getCustomer() != null;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__KUNDE:
				return getKunde() != null;
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SubstitutiongroupPackage.DOCUMENT_ROOT__NAVN:
				return NAVN_EDEFAULT == null ? getNavn() != null : !NAVN_EDEFAULT.equals(getNavn());
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
