/**
 */
package tosca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.ConstraintsType;
import tosca.TRequirementDefinition;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRequirement Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TRequirementDefinitionImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link tosca.impl.TRequirementDefinitionImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link tosca.impl.TRequirementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link tosca.impl.TRequirementDefinitionImpl#getRequirementType <em>Requirement Type</em>}</li>
 *   <li>{@link tosca.impl.TRequirementDefinitionImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRequirementDefinitionImpl extends TExtensibleElementsImpl implements TRequirementDefinition {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsType constraints;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * This is true if the Lower Bound attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerBoundESet;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementType() <em>Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementType()
	 * @generated
	 * @ordered
	 */
	protected static final QName REQUIREMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementType() <em>Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementType()
	 * @generated
	 * @ordered
	 */
	protected QName requirementType = REQUIREMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Object UPPER_BOUND_EDEFAULT = ToscaFactory.eINSTANCE.createFromString(ToscaPackage.eINSTANCE.getUpperBoundType1(), "1");

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Object upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * This is true if the Upper Bound attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upperBoundESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequirementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TREQUIREMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		ConstraintsType oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		boolean oldLowerBoundESet = lowerBoundESet;
		lowerBoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_DEFINITION__LOWER_BOUND, oldLowerBound, lowerBound, !oldLowerBoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerBound() {
		int oldLowerBound = lowerBound;
		boolean oldLowerBoundESet = lowerBoundESet;
		lowerBound = LOWER_BOUND_EDEFAULT;
		lowerBoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TREQUIREMENT_DEFINITION__LOWER_BOUND, oldLowerBound, LOWER_BOUND_EDEFAULT, oldLowerBoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerBound() {
		return lowerBoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getRequirementType() {
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementType(QName newRequirementType) {
		QName oldRequirementType = requirementType;
		requirementType = newRequirementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE, oldRequirementType, requirementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Object newUpperBound) {
		Object oldUpperBound = upperBound;
		upperBound = newUpperBound;
		boolean oldUpperBoundESet = upperBoundESet;
		upperBoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TREQUIREMENT_DEFINITION__UPPER_BOUND, oldUpperBound, upperBound, !oldUpperBoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperBound() {
		Object oldUpperBound = upperBound;
		boolean oldUpperBoundESet = upperBoundESet;
		upperBound = UPPER_BOUND_EDEFAULT;
		upperBoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TREQUIREMENT_DEFINITION__UPPER_BOUND, oldUpperBound, UPPER_BOUND_EDEFAULT, oldUpperBoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperBound() {
		return upperBoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
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
			case ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS:
				return getConstraints();
			case ToscaPackage.TREQUIREMENT_DEFINITION__LOWER_BOUND:
				return getLowerBound();
			case ToscaPackage.TREQUIREMENT_DEFINITION__NAME:
				return getName();
			case ToscaPackage.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE:
				return getRequirementType();
			case ToscaPackage.TREQUIREMENT_DEFINITION__UPPER_BOUND:
				return getUpperBound();
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
			case ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS:
				setConstraints((ConstraintsType)newValue);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE:
				setRequirementType((QName)newValue);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__UPPER_BOUND:
				setUpperBound(newValue);
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
			case ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS:
				setConstraints((ConstraintsType)null);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__LOWER_BOUND:
				unsetLowerBound();
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE:
				setRequirementType(REQUIREMENT_TYPE_EDEFAULT);
				return;
			case ToscaPackage.TREQUIREMENT_DEFINITION__UPPER_BOUND:
				unsetUpperBound();
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
			case ToscaPackage.TREQUIREMENT_DEFINITION__CONSTRAINTS:
				return constraints != null;
			case ToscaPackage.TREQUIREMENT_DEFINITION__LOWER_BOUND:
				return isSetLowerBound();
			case ToscaPackage.TREQUIREMENT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToscaPackage.TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE:
				return REQUIREMENT_TYPE_EDEFAULT == null ? requirementType != null : !REQUIREMENT_TYPE_EDEFAULT.equals(requirementType);
			case ToscaPackage.TREQUIREMENT_DEFINITION__UPPER_BOUND:
				return isSetUpperBound();
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
		result.append(" (lowerBound: ");
		if (lowerBoundESet) result.append(lowerBound); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", requirementType: ");
		result.append(requirementType);
		result.append(", upperBound: ");
		if (upperBoundESet) result.append(upperBound); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TRequirementDefinitionImpl
