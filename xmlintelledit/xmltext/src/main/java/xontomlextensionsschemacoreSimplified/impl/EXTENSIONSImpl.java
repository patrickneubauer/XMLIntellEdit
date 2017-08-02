/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES;
import xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES;
import xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXTENSIONS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl#getContainedEaTemplates <em>Contained Ea Templates</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl#getContainedEaInstances <em>Contained Ea Instances</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.EXTENSIONSImpl#getContainedRelDeprecation <em>Contained Rel Deprecation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXTENSIONSImpl extends MinimalEObjectImpl.Container implements EXTENSIONS {
	/**
	 * The cached value of the '{@link #getContainedEaTemplates() <em>Contained Ea Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEaTemplates()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDEATEMPLATES containedEaTemplates;

	/**
	 * The cached value of the '{@link #getContainedEaInstances() <em>Contained Ea Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEaInstances()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDEAINSTANCES containedEaInstances;

	/**
	 * The cached value of the '{@link #getContainedRelDeprecation() <em>Contained Rel Deprecation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRelDeprecation()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDRELATIONDEPRECATION containedRelDeprecation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXTENSIONSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.EXTENSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDEATEMPLATES getContainedEaTemplates() {
		return containedEaTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedEaTemplates(CONTAINEDEATEMPLATES newContainedEaTemplates, NotificationChain msgs) {
		CONTAINEDEATEMPLATES oldContainedEaTemplates = containedEaTemplates;
		containedEaTemplates = newContainedEaTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES, oldContainedEaTemplates, newContainedEaTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedEaTemplates(CONTAINEDEATEMPLATES newContainedEaTemplates) {
		if (newContainedEaTemplates != containedEaTemplates) {
			NotificationChain msgs = null;
			if (containedEaTemplates != null)
				msgs = ((InternalEObject)containedEaTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES, null, msgs);
			if (newContainedEaTemplates != null)
				msgs = ((InternalEObject)newContainedEaTemplates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES, null, msgs);
			msgs = basicSetContainedEaTemplates(newContainedEaTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES, newContainedEaTemplates, newContainedEaTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDEAINSTANCES getContainedEaInstances() {
		return containedEaInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedEaInstances(CONTAINEDEAINSTANCES newContainedEaInstances, NotificationChain msgs) {
		CONTAINEDEAINSTANCES oldContainedEaInstances = containedEaInstances;
		containedEaInstances = newContainedEaInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES, oldContainedEaInstances, newContainedEaInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedEaInstances(CONTAINEDEAINSTANCES newContainedEaInstances) {
		if (newContainedEaInstances != containedEaInstances) {
			NotificationChain msgs = null;
			if (containedEaInstances != null)
				msgs = ((InternalEObject)containedEaInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES, null, msgs);
			if (newContainedEaInstances != null)
				msgs = ((InternalEObject)newContainedEaInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES, null, msgs);
			msgs = basicSetContainedEaInstances(newContainedEaInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES, newContainedEaInstances, newContainedEaInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDRELATIONDEPRECATION getContainedRelDeprecation() {
		return containedRelDeprecation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedRelDeprecation(CONTAINEDRELATIONDEPRECATION newContainedRelDeprecation, NotificationChain msgs) {
		CONTAINEDRELATIONDEPRECATION oldContainedRelDeprecation = containedRelDeprecation;
		containedRelDeprecation = newContainedRelDeprecation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION, oldContainedRelDeprecation, newContainedRelDeprecation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedRelDeprecation(CONTAINEDRELATIONDEPRECATION newContainedRelDeprecation) {
		if (newContainedRelDeprecation != containedRelDeprecation) {
			NotificationChain msgs = null;
			if (containedRelDeprecation != null)
				msgs = ((InternalEObject)containedRelDeprecation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION, null, msgs);
			if (newContainedRelDeprecation != null)
				msgs = ((InternalEObject)newContainedRelDeprecation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION, null, msgs);
			msgs = basicSetContainedRelDeprecation(newContainedRelDeprecation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION, newContainedRelDeprecation, newContainedRelDeprecation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES:
				return basicSetContainedEaTemplates(null, msgs);
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES:
				return basicSetContainedEaInstances(null, msgs);
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION:
				return basicSetContainedRelDeprecation(null, msgs);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES:
				return getContainedEaTemplates();
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES:
				return getContainedEaInstances();
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION:
				return getContainedRelDeprecation();
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
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES:
				setContainedEaTemplates((CONTAINEDEATEMPLATES)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES:
				setContainedEaInstances((CONTAINEDEAINSTANCES)newValue);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION:
				setContainedRelDeprecation((CONTAINEDRELATIONDEPRECATION)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES:
				setContainedEaTemplates((CONTAINEDEATEMPLATES)null);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES:
				setContainedEaInstances((CONTAINEDEAINSTANCES)null);
				return;
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION:
				setContainedRelDeprecation((CONTAINEDRELATIONDEPRECATION)null);
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
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_TEMPLATES:
				return containedEaTemplates != null;
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_EA_INSTANCES:
				return containedEaInstances != null;
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS__CONTAINED_REL_DEPRECATION:
				return containedRelDeprecation != null;
		}
		return super.eIsSet(featureID);
	}

} //EXTENSIONSImpl
