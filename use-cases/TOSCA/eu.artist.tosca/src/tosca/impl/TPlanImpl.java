/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.InputParametersType;
import tosca.OutputParametersType;
import tosca.PlanModelReferenceType;
import tosca.PlanModelType;
import tosca.TCondition;
import tosca.TPlan;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TPlanImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getPlanModel <em>Plan Model</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getPlanModelReference <em>Plan Model Reference</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getId <em>Id</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getPlanLanguage <em>Plan Language</em>}</li>
 *   <li>{@link tosca.impl.TPlanImpl#getPlanType <em>Plan Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPlanImpl extends TExtensibleElementsImpl implements TPlan {
	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected TCondition precondition;

	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected InputParametersType inputParameters;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected OutputParametersType outputParameters;

	/**
	 * The cached value of the '{@link #getPlanModel() <em>Plan Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanModel()
	 * @generated
	 * @ordered
	 */
	protected PlanModelType planModel;

	/**
	 * The cached value of the '{@link #getPlanModelReference() <em>Plan Model Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanModelReference()
	 * @generated
	 * @ordered
	 */
	protected PlanModelReferenceType planModelReference;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getPlanLanguage() <em>Plan Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanLanguage() <em>Plan Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanLanguage()
	 * @generated
	 * @ordered
	 */
	protected String planLanguage = PLAN_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanType() <em>Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanType()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanType() <em>Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanType()
	 * @generated
	 * @ordered
	 */
	protected String planType = PLAN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(TCondition newPrecondition, NotificationChain msgs) {
		TCondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(TCondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType getInputParameters() {
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputParameters(InputParametersType newInputParameters, NotificationChain msgs) {
		InputParametersType oldInputParameters = inputParameters;
		inputParameters = newInputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__INPUT_PARAMETERS, oldInputParameters, newInputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputParameters(InputParametersType newInputParameters) {
		if (newInputParameters != inputParameters) {
			NotificationChain msgs = null;
			if (inputParameters != null)
				msgs = ((InternalEObject)inputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__INPUT_PARAMETERS, null, msgs);
			if (newInputParameters != null)
				msgs = ((InternalEObject)newInputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__INPUT_PARAMETERS, null, msgs);
			msgs = basicSetInputParameters(newInputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__INPUT_PARAMETERS, newInputParameters, newInputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType getOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParameters(OutputParametersType newOutputParameters, NotificationChain msgs) {
		OutputParametersType oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(OutputParametersType newOutputParameters) {
		if (newOutputParameters != outputParameters) {
			NotificationChain msgs = null;
			if (outputParameters != null)
				msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__OUTPUT_PARAMETERS, null, msgs);
			if (newOutputParameters != null)
				msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__OUTPUT_PARAMETERS, null, msgs);
			msgs = basicSetOutputParameters(newOutputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelType getPlanModel() {
		return planModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanModel(PlanModelType newPlanModel, NotificationChain msgs) {
		PlanModelType oldPlanModel = planModel;
		planModel = newPlanModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PLAN_MODEL, oldPlanModel, newPlanModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanModel(PlanModelType newPlanModel) {
		if (newPlanModel != planModel) {
			NotificationChain msgs = null;
			if (planModel != null)
				msgs = ((InternalEObject)planModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__PLAN_MODEL, null, msgs);
			if (newPlanModel != null)
				msgs = ((InternalEObject)newPlanModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__PLAN_MODEL, null, msgs);
			msgs = basicSetPlanModel(newPlanModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PLAN_MODEL, newPlanModel, newPlanModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelReferenceType getPlanModelReference() {
		return planModelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanModelReference(PlanModelReferenceType newPlanModelReference, NotificationChain msgs) {
		PlanModelReferenceType oldPlanModelReference = planModelReference;
		planModelReference = newPlanModelReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE, oldPlanModelReference, newPlanModelReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanModelReference(PlanModelReferenceType newPlanModelReference) {
		if (newPlanModelReference != planModelReference) {
			NotificationChain msgs = null;
			if (planModelReference != null)
				msgs = ((InternalEObject)planModelReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE, null, msgs);
			if (newPlanModelReference != null)
				msgs = ((InternalEObject)newPlanModelReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE, null, msgs);
			msgs = basicSetPlanModelReference(newPlanModelReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE, newPlanModelReference, newPlanModelReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanLanguage() {
		return planLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanLanguage(String newPlanLanguage) {
		String oldPlanLanguage = planLanguage;
		planLanguage = newPlanLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PLAN_LANGUAGE, oldPlanLanguage, planLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanType() {
		return planType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanType(String newPlanType) {
		String oldPlanType = planType;
		planType = newPlanType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPLAN__PLAN_TYPE, oldPlanType, planType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TPLAN__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case ToscaPackage.TPLAN__INPUT_PARAMETERS:
				return basicSetInputParameters(null, msgs);
			case ToscaPackage.TPLAN__OUTPUT_PARAMETERS:
				return basicSetOutputParameters(null, msgs);
			case ToscaPackage.TPLAN__PLAN_MODEL:
				return basicSetPlanModel(null, msgs);
			case ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE:
				return basicSetPlanModelReference(null, msgs);
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
			case ToscaPackage.TPLAN__PRECONDITION:
				return getPrecondition();
			case ToscaPackage.TPLAN__INPUT_PARAMETERS:
				return getInputParameters();
			case ToscaPackage.TPLAN__OUTPUT_PARAMETERS:
				return getOutputParameters();
			case ToscaPackage.TPLAN__PLAN_MODEL:
				return getPlanModel();
			case ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE:
				return getPlanModelReference();
			case ToscaPackage.TPLAN__ID:
				return getId();
			case ToscaPackage.TPLAN__NAME:
				return getName();
			case ToscaPackage.TPLAN__PLAN_LANGUAGE:
				return getPlanLanguage();
			case ToscaPackage.TPLAN__PLAN_TYPE:
				return getPlanType();
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
			case ToscaPackage.TPLAN__PRECONDITION:
				setPrecondition((TCondition)newValue);
				return;
			case ToscaPackage.TPLAN__INPUT_PARAMETERS:
				setInputParameters((InputParametersType)newValue);
				return;
			case ToscaPackage.TPLAN__OUTPUT_PARAMETERS:
				setOutputParameters((OutputParametersType)newValue);
				return;
			case ToscaPackage.TPLAN__PLAN_MODEL:
				setPlanModel((PlanModelType)newValue);
				return;
			case ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE:
				setPlanModelReference((PlanModelReferenceType)newValue);
				return;
			case ToscaPackage.TPLAN__ID:
				setId((String)newValue);
				return;
			case ToscaPackage.TPLAN__NAME:
				setName((String)newValue);
				return;
			case ToscaPackage.TPLAN__PLAN_LANGUAGE:
				setPlanLanguage((String)newValue);
				return;
			case ToscaPackage.TPLAN__PLAN_TYPE:
				setPlanType((String)newValue);
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
			case ToscaPackage.TPLAN__PRECONDITION:
				setPrecondition((TCondition)null);
				return;
			case ToscaPackage.TPLAN__INPUT_PARAMETERS:
				setInputParameters((InputParametersType)null);
				return;
			case ToscaPackage.TPLAN__OUTPUT_PARAMETERS:
				setOutputParameters((OutputParametersType)null);
				return;
			case ToscaPackage.TPLAN__PLAN_MODEL:
				setPlanModel((PlanModelType)null);
				return;
			case ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE:
				setPlanModelReference((PlanModelReferenceType)null);
				return;
			case ToscaPackage.TPLAN__ID:
				setId(ID_EDEFAULT);
				return;
			case ToscaPackage.TPLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToscaPackage.TPLAN__PLAN_LANGUAGE:
				setPlanLanguage(PLAN_LANGUAGE_EDEFAULT);
				return;
			case ToscaPackage.TPLAN__PLAN_TYPE:
				setPlanType(PLAN_TYPE_EDEFAULT);
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
			case ToscaPackage.TPLAN__PRECONDITION:
				return precondition != null;
			case ToscaPackage.TPLAN__INPUT_PARAMETERS:
				return inputParameters != null;
			case ToscaPackage.TPLAN__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case ToscaPackage.TPLAN__PLAN_MODEL:
				return planModel != null;
			case ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE:
				return planModelReference != null;
			case ToscaPackage.TPLAN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ToscaPackage.TPLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToscaPackage.TPLAN__PLAN_LANGUAGE:
				return PLAN_LANGUAGE_EDEFAULT == null ? planLanguage != null : !PLAN_LANGUAGE_EDEFAULT.equals(planLanguage);
			case ToscaPackage.TPLAN__PLAN_TYPE:
				return PLAN_TYPE_EDEFAULT == null ? planType != null : !PLAN_TYPE_EDEFAULT.equals(planType);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", planLanguage: ");
		result.append(planLanguage);
		result.append(", planType: ");
		result.append(planType);
		result.append(')');
		return result.toString();
	}

} //TPlanImpl
