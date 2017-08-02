/**
 */
package caex.impl;

import caex.AttributeNameMapping;
import caex.CaexPackage;
import caex.InterfaceNameMapping;
import caex.Mapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.MappingImpl#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link caex.impl.MappingImpl#getInterfaceNameMapping <em>Interface Name Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends CAEXBasicObjectImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getAttributeNameMapping() <em>Attribute Name Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNameMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeNameMapping> attributeNameMapping;

	/**
	 * The cached value of the '{@link #getInterfaceNameMapping() <em>Interface Name Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceNameMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceNameMapping> interfaceNameMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeNameMapping> getAttributeNameMapping() {
		if (attributeNameMapping == null) {
			attributeNameMapping = new EObjectContainmentEList<AttributeNameMapping>(AttributeNameMapping.class, this, CaexPackage.MAPPING__ATTRIBUTE_NAME_MAPPING);
		}
		return attributeNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceNameMapping> getInterfaceNameMapping() {
		if (interfaceNameMapping == null) {
			interfaceNameMapping = new EObjectContainmentEList<InterfaceNameMapping>(InterfaceNameMapping.class, this, CaexPackage.MAPPING__INTERFACE_NAME_MAPPING);
		}
		return interfaceNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaexPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return ((InternalEList<?>)getAttributeNameMapping()).basicRemove(otherEnd, msgs);
			case CaexPackage.MAPPING__INTERFACE_NAME_MAPPING:
				return ((InternalEList<?>)getInterfaceNameMapping()).basicRemove(otherEnd, msgs);
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
			case CaexPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return getAttributeNameMapping();
			case CaexPackage.MAPPING__INTERFACE_NAME_MAPPING:
				return getInterfaceNameMapping();
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
			case CaexPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				getAttributeNameMapping().clear();
				getAttributeNameMapping().addAll((Collection<? extends AttributeNameMapping>)newValue);
				return;
			case CaexPackage.MAPPING__INTERFACE_NAME_MAPPING:
				getInterfaceNameMapping().clear();
				getInterfaceNameMapping().addAll((Collection<? extends InterfaceNameMapping>)newValue);
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
			case CaexPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				getAttributeNameMapping().clear();
				return;
			case CaexPackage.MAPPING__INTERFACE_NAME_MAPPING:
				getInterfaceNameMapping().clear();
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
			case CaexPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return attributeNameMapping != null && !attributeNameMapping.isEmpty();
			case CaexPackage.MAPPING__INTERFACE_NAME_MAPPING:
				return interfaceNameMapping != null && !interfaceNameMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
