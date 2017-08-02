/**
 */
package eclassxmlschemadictionary_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ONTOML;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECLASSDICTIONARY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl#getOntoml <em>Ontoml</em>}</li>
 *   <li>{@link eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECLASSDICTIONARYImpl extends MinimalEObjectImpl.Container implements ECLASSDICTIONARY {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTHEADER header;

	/**
	 * The cached value of the '{@link #getOntoml() <em>Ontoml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntoml()
	 * @generated
	 * @ordered
	 */
	protected ONTOML ontoml;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EXTENSIONS extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECLASSDICTIONARYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemadictionary_2_0SimplifiedPackage.Literals.ECLASSDICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTHEADER getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(DOCUMENTHEADER newHeader, NotificationChain msgs) {
		DOCUMENTHEADER oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(DOCUMENTHEADER newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONTOML getOntoml() {
		return ontoml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntoml(ONTOML newOntoml, NotificationChain msgs) {
		ONTOML oldOntoml = ontoml;
		ontoml = newOntoml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML, oldOntoml, newOntoml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntoml(ONTOML newOntoml) {
		if (newOntoml != ontoml) {
			NotificationChain msgs = null;
			if (ontoml != null)
				msgs = ((InternalEObject)ontoml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML, null, msgs);
			if (newOntoml != null)
				msgs = ((InternalEObject)newOntoml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML, null, msgs);
			msgs = basicSetOntoml(newOntoml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML, newOntoml, newOntoml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTENSIONS getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(EXTENSIONS newExtensions, NotificationChain msgs) {
		EXTENSIONS oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(EXTENSIONS newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER:
				return basicSetHeader(null, msgs);
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML:
				return basicSetOntoml(null, msgs);
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER:
				return getHeader();
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML:
				return getOntoml();
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS:
				return getExtensions();
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
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER:
				setHeader((DOCUMENTHEADER)newValue);
				return;
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML:
				setOntoml((ONTOML)newValue);
				return;
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS:
				setExtensions((EXTENSIONS)newValue);
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
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER:
				setHeader((DOCUMENTHEADER)null);
				return;
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML:
				setOntoml((ONTOML)null);
				return;
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS:
				setExtensions((EXTENSIONS)null);
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
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__HEADER:
				return header != null;
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__ONTOML:
				return ontoml != null;
			case Eclassxmlschemadictionary_2_0SimplifiedPackage.ECLASSDICTIONARY__EXTENSIONS:
				return extensions != null;
		}
		return super.eIsSet(featureID);
	}

} //ECLASSDICTIONARYImpl
