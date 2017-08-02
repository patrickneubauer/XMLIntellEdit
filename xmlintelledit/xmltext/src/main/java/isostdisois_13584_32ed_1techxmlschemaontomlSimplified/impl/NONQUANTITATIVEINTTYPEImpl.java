/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GRAPHICS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITSVALUES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONQUANTITATIVEINTTYPE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SOURCEDOCUMENT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TEXT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NONQUANTITATIVEINTTYPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.NONQUANTITATIVEINTTYPEImpl#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.NONQUANTITATIVEINTTYPEImpl#getItsValues <em>Its Values</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.NONQUANTITATIVEINTTYPEImpl#getSourceDocOfValueDomain <em>Source Doc Of Value Domain</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.NONQUANTITATIVEINTTYPEImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.NONQUANTITATIVEINTTYPEImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NONQUANTITATIVEINTTYPEImpl extends ANYTYPEImpl implements NONQUANTITATIVEINTTYPE {
	/**
	 * The default value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String valueFormat = VALUE_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItsValues() <em>Its Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsValues()
	 * @generated
	 * @ordered
	 */
	protected ITSVALUES itsValues;

	/**
	 * The cached value of the '{@link #getSourceDocOfValueDomain() <em>Source Doc Of Value Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocOfValueDomain()
	 * @generated
	 * @ordered
	 */
	protected SOURCEDOCUMENT sourceDocOfValueDomain;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected TEXT definition;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICS icon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NONQUANTITATIVEINTTYPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.NONQUANTITATIVEINTTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		String oldValueFormat = valueFormat;
		valueFormat = newValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSVALUES getItsValues() {
		return itsValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsValues(ITSVALUES newItsValues, NotificationChain msgs) {
		ITSVALUES oldItsValues = itsValues;
		itsValues = newItsValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES, oldItsValues, newItsValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsValues(ITSVALUES newItsValues) {
		if (newItsValues != itsValues) {
			NotificationChain msgs = null;
			if (itsValues != null)
				msgs = ((InternalEObject)itsValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES, null, msgs);
			if (newItsValues != null)
				msgs = ((InternalEObject)newItsValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES, null, msgs);
			msgs = basicSetItsValues(newItsValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES, newItsValues, newItsValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCEDOCUMENT getSourceDocOfValueDomain() {
		return sourceDocOfValueDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocOfValueDomain(SOURCEDOCUMENT newSourceDocOfValueDomain, NotificationChain msgs) {
		SOURCEDOCUMENT oldSourceDocOfValueDomain = sourceDocOfValueDomain;
		sourceDocOfValueDomain = newSourceDocOfValueDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN, oldSourceDocOfValueDomain, newSourceDocOfValueDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocOfValueDomain(SOURCEDOCUMENT newSourceDocOfValueDomain) {
		if (newSourceDocOfValueDomain != sourceDocOfValueDomain) {
			NotificationChain msgs = null;
			if (sourceDocOfValueDomain != null)
				msgs = ((InternalEObject)sourceDocOfValueDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN, null, msgs);
			if (newSourceDocOfValueDomain != null)
				msgs = ((InternalEObject)newSourceDocOfValueDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN, null, msgs);
			msgs = basicSetSourceDocOfValueDomain(newSourceDocOfValueDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN, newSourceDocOfValueDomain, newSourceDocOfValueDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(TEXT newDefinition, NotificationChain msgs) {
		TEXT oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(TEXT newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICS getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(GRAPHICS newIcon, NotificationChain msgs) {
		GRAPHICS oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(GRAPHICS newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES:
				return basicSetItsValues(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				return basicSetSourceDocOfValueDomain(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON:
				return basicSetIcon(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__VALUE_FORMAT:
				return getValueFormat();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES:
				return getItsValues();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				return getSourceDocOfValueDomain();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION:
				return getDefinition();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON:
				return getIcon();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__VALUE_FORMAT:
				setValueFormat((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES:
				setItsValues((ITSVALUES)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				setSourceDocOfValueDomain((SOURCEDOCUMENT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION:
				setDefinition((TEXT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON:
				setIcon((GRAPHICS)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES:
				setItsValues((ITSVALUES)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				setSourceDocOfValueDomain((SOURCEDOCUMENT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION:
				setDefinition((TEXT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON:
				setIcon((GRAPHICS)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ITS_VALUES:
				return itsValues != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				return sourceDocOfValueDomain != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__DEFINITION:
				return definition != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE__ICON:
				return icon != null;
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
		result.append(" (valueFormat: ");
		result.append(valueFormat);
		result.append(')');
		return result.toString();
	}

} //NONQUANTITATIVEINTTYPEImpl
