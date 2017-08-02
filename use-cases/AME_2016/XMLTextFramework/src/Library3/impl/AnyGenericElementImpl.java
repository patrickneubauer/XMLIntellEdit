/**
 */
package Library3.impl;

import Library3.AnyGenericAttribute;
import Library3.AnyGenericElement;
import Library3.Library3Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Generic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Library3.impl.AnyGenericElementImpl#getElemName <em>Elem Name</em>}</li>
 *   <li>{@link Library3.impl.AnyGenericElementImpl#getAnyGenericAttr <em>Any Generic Attr</em>}</li>
 *   <li>{@link Library3.impl.AnyGenericElementImpl#getElemValue <em>Elem Value</em>}</li>
 *   <li>{@link Library3.impl.AnyGenericElementImpl#getAnyGenericElement <em>Any Generic Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyGenericElementImpl extends AnyGenericConstructImpl implements AnyGenericElement {
	/**
	 * The default value of the '{@link #getElemName() <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElemName() <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemName()
	 * @generated
	 * @ordered
	 */
	protected String elemName = ELEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyGenericAttr() <em>Any Generic Attr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyGenericAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyGenericAttribute> anyGenericAttr;

	/**
	 * The default value of the '{@link #getElemValue() <em>Elem Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElemValue() <em>Elem Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemValue()
	 * @generated
	 * @ordered
	 */
	protected String elemValue = ELEM_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyGenericElement() <em>Any Generic Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyGenericElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyGenericElement> anyGenericElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyGenericElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Library3Package.Literals.ANY_GENERIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElemName() {
		return elemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemName(String newElemName) {
		String oldElemName = elemName;
		elemName = newElemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.ANY_GENERIC_ELEMENT__ELEM_NAME, oldElemName, elemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyGenericAttribute> getAnyGenericAttr() {
		if (anyGenericAttr == null) {
			anyGenericAttr = new EObjectContainmentEList<AnyGenericAttribute>(AnyGenericAttribute.class, this, Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR);
		}
		return anyGenericAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElemValue() {
		return elemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemValue(String newElemValue) {
		String oldElemValue = elemValue;
		elemValue = newElemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.ANY_GENERIC_ELEMENT__ELEM_VALUE, oldElemValue, elemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyGenericElement> getAnyGenericElement() {
		if (anyGenericElement == null) {
			anyGenericElement = new EObjectContainmentEList<AnyGenericElement>(AnyGenericElement.class, this, Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT);
		}
		return anyGenericElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				return ((InternalEList<?>)getAnyGenericAttr()).basicRemove(otherEnd, msgs);
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT:
				return ((InternalEList<?>)getAnyGenericElement()).basicRemove(otherEnd, msgs);
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
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_NAME:
				return getElemName();
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				return getAnyGenericAttr();
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				return getElemValue();
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT:
				return getAnyGenericElement();
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
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_NAME:
				setElemName((String)newValue);
				return;
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				getAnyGenericAttr().clear();
				getAnyGenericAttr().addAll((Collection<? extends AnyGenericAttribute>)newValue);
				return;
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				setElemValue((String)newValue);
				return;
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT:
				getAnyGenericElement().clear();
				getAnyGenericElement().addAll((Collection<? extends AnyGenericElement>)newValue);
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
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_NAME:
				setElemName(ELEM_NAME_EDEFAULT);
				return;
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				getAnyGenericAttr().clear();
				return;
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				setElemValue(ELEM_VALUE_EDEFAULT);
				return;
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT:
				getAnyGenericElement().clear();
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
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_NAME:
				return ELEM_NAME_EDEFAULT == null ? elemName != null : !ELEM_NAME_EDEFAULT.equals(elemName);
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				return anyGenericAttr != null && !anyGenericAttr.isEmpty();
			case Library3Package.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				return ELEM_VALUE_EDEFAULT == null ? elemValue != null : !ELEM_VALUE_EDEFAULT.equals(elemValue);
			case Library3Package.ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT:
				return anyGenericElement != null && !anyGenericElement.isEmpty();
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
		result.append(" (elemName: ");
		result.append(elemName);
		result.append(", elemValue: ");
		result.append(elemValue);
		result.append(')');
		return result.toString();
	}

} //AnyGenericElementImpl
