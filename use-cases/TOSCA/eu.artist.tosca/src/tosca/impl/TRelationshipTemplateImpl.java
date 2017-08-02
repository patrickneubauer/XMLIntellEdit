/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.RelationshipConstraintsType;
import tosca.SourceElementType;
import tosca.TRelationshipTemplate;
import tosca.TargetElementType;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRelationship Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TRelationshipTemplateImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTemplateImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTemplateImpl#getRelationshipConstraints <em>Relationship Constraints</em>}</li>
 *   <li>{@link tosca.impl.TRelationshipTemplateImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRelationshipTemplateImpl extends TEntityTemplateImpl implements TRelationshipTemplate {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected SourceElementType sourceElement;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected TargetElementType targetElement;

	/**
	 * The cached value of the '{@link #getRelationshipConstraints() <em>Relationship Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipConstraints()
	 * @generated
	 * @ordered
	 */
	protected RelationshipConstraintsType relationshipConstraints;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRelationshipTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TRELATIONSHIP_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementType getSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceElement(SourceElementType newSourceElement, NotificationChain msgs) {
		SourceElementType oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT, oldSourceElement, newSourceElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(SourceElementType newSourceElement) {
		if (newSourceElement != sourceElement) {
			NotificationChain msgs = null;
			if (sourceElement != null)
				msgs = ((InternalEObject)sourceElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT, null, msgs);
			if (newSourceElement != null)
				msgs = ((InternalEObject)newSourceElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT, null, msgs);
			msgs = basicSetSourceElement(newSourceElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT, newSourceElement, newSourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementType getTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetElement(TargetElementType newTargetElement, NotificationChain msgs) {
		TargetElementType oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT, oldTargetElement, newTargetElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(TargetElementType newTargetElement) {
		if (newTargetElement != targetElement) {
			NotificationChain msgs = null;
			if (targetElement != null)
				msgs = ((InternalEObject)targetElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT, null, msgs);
			if (newTargetElement != null)
				msgs = ((InternalEObject)newTargetElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT, null, msgs);
			msgs = basicSetTargetElement(newTargetElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT, newTargetElement, newTargetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintsType getRelationshipConstraints() {
		return relationshipConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshipConstraints(RelationshipConstraintsType newRelationshipConstraints, NotificationChain msgs) {
		RelationshipConstraintsType oldRelationshipConstraints = relationshipConstraints;
		relationshipConstraints = newRelationshipConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS, oldRelationshipConstraints, newRelationshipConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipConstraints(RelationshipConstraintsType newRelationshipConstraints) {
		if (newRelationshipConstraints != relationshipConstraints) {
			NotificationChain msgs = null;
			if (relationshipConstraints != null)
				msgs = ((InternalEObject)relationshipConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS, null, msgs);
			if (newRelationshipConstraints != null)
				msgs = ((InternalEObject)newRelationshipConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS, null, msgs);
			msgs = basicSetRelationshipConstraints(newRelationshipConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS, newRelationshipConstraints, newRelationshipConstraints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TRELATIONSHIP_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT:
				return basicSetSourceElement(null, msgs);
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT:
				return basicSetTargetElement(null, msgs);
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS:
				return basicSetRelationshipConstraints(null, msgs);
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
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT:
				return getSourceElement();
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT:
				return getTargetElement();
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS:
				return getRelationshipConstraints();
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__NAME:
				return getName();
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
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT:
				setSourceElement((SourceElementType)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT:
				setTargetElement((TargetElementType)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS:
				setRelationshipConstraints((RelationshipConstraintsType)newValue);
				return;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__NAME:
				setName((String)newValue);
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
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT:
				setSourceElement((SourceElementType)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT:
				setTargetElement((TargetElementType)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS:
				setRelationshipConstraints((RelationshipConstraintsType)null);
				return;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
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
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT:
				return sourceElement != null;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT:
				return targetElement != null;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS:
				return relationshipConstraints != null;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TRelationshipTemplateImpl
