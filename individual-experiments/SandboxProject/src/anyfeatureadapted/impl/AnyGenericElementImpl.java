/**
 */
package anyfeatureadapted.impl;

import anyfeatureadapted.AnyGenericAttribute;
import anyfeatureadapted.AnyGenericElement;
import anyfeatureadapted.AnyfeatureadaptedPackage;
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
 * <ul>
 *   <li>{@link anyfeatureadapted.impl.AnyGenericElementImpl#getElemName <em>Elem Name</em>}</li>
 *   <li>{@link anyfeatureadapted.impl.AnyGenericElementImpl#getAnyGenericAttr <em>Any Generic Attr</em>}</li>
 *   <li>{@link anyfeatureadapted.impl.AnyGenericElementImpl#getElemValue <em>Elem Value</em>}</li>
 *   <li>{@link anyfeatureadapted.impl.AnyGenericElementImpl#getChildElem <em>Child Elem</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getChildElem() <em>Child Elem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildElem()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyGenericElement> childElem;

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
		return AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_NAME, oldElemName, elemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyGenericAttribute> getAnyGenericAttr() {
		if (anyGenericAttr == null) {
			anyGenericAttr = new EObjectContainmentEList<AnyGenericAttribute>(AnyGenericAttribute.class, this, AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_VALUE, oldElemValue, elemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyGenericElement> getChildElem() {
		if (childElem == null) {
			childElem = new EObjectContainmentEList<AnyGenericElement>(AnyGenericElement.class, this, AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__CHILD_ELEM);
		}
		return childElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				return ((InternalEList<?>)getAnyGenericAttr()).basicRemove(otherEnd, msgs);
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__CHILD_ELEM:
				return ((InternalEList<?>)getChildElem()).basicRemove(otherEnd, msgs);
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
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_NAME:
				return getElemName();
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				return getAnyGenericAttr();
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				return getElemValue();
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__CHILD_ELEM:
				return getChildElem();
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
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_NAME:
				setElemName((String)newValue);
				return;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				getAnyGenericAttr().clear();
				getAnyGenericAttr().addAll((Collection<? extends AnyGenericAttribute>)newValue);
				return;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				setElemValue((String)newValue);
				return;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__CHILD_ELEM:
				getChildElem().clear();
				getChildElem().addAll((Collection<? extends AnyGenericElement>)newValue);
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
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_NAME:
				setElemName(ELEM_NAME_EDEFAULT);
				return;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				getAnyGenericAttr().clear();
				return;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				setElemValue(ELEM_VALUE_EDEFAULT);
				return;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__CHILD_ELEM:
				getChildElem().clear();
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
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_NAME:
				return ELEM_NAME_EDEFAULT == null ? elemName != null : !ELEM_NAME_EDEFAULT.equals(elemName);
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR:
				return anyGenericAttr != null && !anyGenericAttr.isEmpty();
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__ELEM_VALUE:
				return ELEM_VALUE_EDEFAULT == null ? elemValue != null : !ELEM_VALUE_EDEFAULT.equals(elemValue);
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT__CHILD_ELEM:
				return childElem != null && !childElem.isEmpty();
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
