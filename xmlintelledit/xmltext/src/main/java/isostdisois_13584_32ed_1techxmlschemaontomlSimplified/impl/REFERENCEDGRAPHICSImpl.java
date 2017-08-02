/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REFERENCEDGRAPHICS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REFERENCEDGRAPHICS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REFERENCEDGRAPHICSImpl#getGraphicsReference <em>Graphics Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REFERENCEDGRAPHICSImpl extends GRAPHICSImpl implements REFERENCEDGRAPHICS {
	/**
	 * The cached value of the '{@link #getGraphicsReference() <em>Graphics Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsReference()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTREFERENCE graphicsReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REFERENCEDGRAPHICSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REFERENCEDGRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTREFERENCE getGraphicsReference() {
		return graphicsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicsReference(DOCUMENTREFERENCE newGraphicsReference, NotificationChain msgs) {
		DOCUMENTREFERENCE oldGraphicsReference = graphicsReference;
		graphicsReference = newGraphicsReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE, oldGraphicsReference, newGraphicsReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicsReference(DOCUMENTREFERENCE newGraphicsReference) {
		if (newGraphicsReference != graphicsReference) {
			NotificationChain msgs = null;
			if (graphicsReference != null)
				msgs = ((InternalEObject)graphicsReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE, null, msgs);
			if (newGraphicsReference != null)
				msgs = ((InternalEObject)newGraphicsReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE, null, msgs);
			msgs = basicSetGraphicsReference(newGraphicsReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE, newGraphicsReference, newGraphicsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE:
				return basicSetGraphicsReference(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE:
				return getGraphicsReference();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE:
				setGraphicsReference((DOCUMENTREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE:
				setGraphicsReference((DOCUMENTREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS__GRAPHICS_REFERENCE:
				return graphicsReference != null;
		}
		return super.eIsSet(featureID);
	}

} //REFERENCEDGRAPHICSImpl
