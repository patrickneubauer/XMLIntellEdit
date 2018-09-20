/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isLimitToOptions <em>Limit To Options</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isAdvanced <em>Advanced</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isVerify <em>Verify</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getUnitLabel <em>Unit Label</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#isRequired1 <em>Required1</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isLimitToOptions() <em>Limit To Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitToOptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIMIT_TO_OPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLimitToOptions() <em>Limit To Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimitToOptions()
	 * @generated
	 * @ordered
	 */
	protected boolean limitToOptions = LIMIT_TO_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvanced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADVANCED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvanced()
	 * @generated
	 * @ordered
	 */
	protected boolean advanced = ADVANCED_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerify() <em>Verify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerify()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerify() <em>Verify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerify()
	 * @generated
	 * @ordered
	 */
	protected boolean verify = VERIFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitLabel() <em>Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitLabel() <em>Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected String unitLabel = UNIT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean multiple = MULTIPLE_EDEFAULT;

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
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired1() <em>Required1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired1() <em>Required1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired1()
	 * @generated
	 * @ordered
	 */
	protected boolean required1 = REQUIRED1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.TEXT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType UNIT_EDEFAULT = UnitType.A;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected OptionsType options;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLimitToOptions() {
		return limitToOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitToOptions(boolean newLimitToOptions) {
		boolean oldLimitToOptions = limitToOptions;
		limitToOptions = newLimitToOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LIMIT_TO_OPTIONS, oldLimitToOptions, limitToOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdvanced() {
		return advanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvanced(boolean newAdvanced) {
		boolean oldAdvanced = advanced;
		advanced = newAdvanced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__ADVANCED, oldAdvanced, advanced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerify() {
		return verify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerify(boolean newVerify) {
		boolean oldVerify = verify;
		verify = newVerify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__VERIFY, oldVerify, verify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitLabel() {
		return unitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitLabel(String newUnitLabel) {
		String oldUnitLabel = unitLabel;
		unitLabel = newUnitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT_LABEL, oldUnitLabel, unitLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		boolean oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__MULTIPLE, oldMultiple, multiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired1() {
		return required1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired1(boolean newRequired1) {
		boolean oldRequired1 = required1;
		required1 = newRequired1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED1, oldRequired1, required1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitType newUnit) {
		UnitType oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsType getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(OptionsType newOptions, NotificationChain msgs) {
		OptionsType oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(OptionsType newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		FilterType oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterType newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS:
				return basicSetOptions(null, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER:
				return basicSetFilter(null, msgs);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__CONTEXT:
				return getContext();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED:
				return isRequired();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DEFAULT:
				return getDefault();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LABEL:
				return getLabel();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LIMIT_TO_OPTIONS:
				return isLimitToOptions();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__ADVANCED:
				return isAdvanced();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__VERIFY:
				return isVerify();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT_LABEL:
				return getUnitLabel();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__GROUP_NAME:
				return getGroupName();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__MULTIPLE:
				return isMultiple();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__NAME:
				return getName();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__PATTERN:
				return getPattern();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__READ_ONLY:
				return isReadOnly();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED1:
				return isRequired1();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__TYPE:
				return getType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT:
				return getUnit();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS:
				return getOptions();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER:
				return getFilter();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__CONTEXT:
				setContext((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LABEL:
				setLabel((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LIMIT_TO_OPTIONS:
				setLimitToOptions((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__ADVANCED:
				setAdvanced((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__VERIFY:
				setVerify((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT_LABEL:
				setUnitLabel((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__MULTIPLE:
				setMultiple((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__PATTERN:
				setPattern((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED1:
				setRequired1((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__TYPE:
				setType((ParameterType)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT:
				setUnit((UnitType)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS:
				setOptions((OptionsType)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER:
				setFilter((FilterType)newValue);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LIMIT_TO_OPTIONS:
				setLimitToOptions(LIMIT_TO_OPTIONS_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__ADVANCED:
				setAdvanced(ADVANCED_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__VERIFY:
				setVerify(VERIFY_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT_LABEL:
				setUnitLabel(UNIT_LABEL_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED1:
				setRequired1(REQUIRED1_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS:
				setOptions((OptionsType)null);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER:
				setFilter((FilterType)null);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LIMIT_TO_OPTIONS:
				return limitToOptions != LIMIT_TO_OPTIONS_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__ADVANCED:
				return advanced != ADVANCED_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__VERIFY:
				return verify != VERIFY_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT_LABEL:
				return UNIT_LABEL_EDEFAULT == null ? unitLabel != null : !UNIT_LABEL_EDEFAULT.equals(unitLabel);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__MULTIPLE:
				return multiple != MULTIPLE_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED1:
				return required1 != REQUIRED1_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT:
				return unit != UNIT_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS:
				return options != null;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER:
				return filter != null;
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
		result.append(" (context: ");
		result.append(context);
		result.append(", required: ");
		result.append(required);
		result.append(", default: ");
		result.append(default_);
		result.append(", label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(", limitToOptions: ");
		result.append(limitToOptions);
		result.append(", advanced: ");
		result.append(advanced);
		result.append(", verify: ");
		result.append(verify);
		result.append(", unitLabel: ");
		result.append(unitLabel);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", multiple: ");
		result.append(multiple);
		result.append(", name: ");
		result.append(name);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", required1: ");
		result.append(required1);
		result.append(", type: ");
		result.append(type);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
