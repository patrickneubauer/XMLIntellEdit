/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONPAPER;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONSCREEN;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CREATEICON;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXPLICITITEMCLASSEXTENSION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MESSAGE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPLICITITEMCLASSEXTENSION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITITEMCLASSEXTENSIONImpl#getAccessIcon <em>Access Icon</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITITEMCLASSEXTENSIONImpl#getContentMsg <em>Content Msg</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITITEMCLASSEXTENSIONImpl#getCreateIcon <em>Create Icon</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITITEMCLASSEXTENSIONImpl#getCreateMsg <em>Create Msg</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITITEMCLASSEXTENSIONImpl#getClassPresentationOnPaper <em>Class Presentation On Paper</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITITEMCLASSEXTENSIONImpl#getClassPresentationOnScreen <em>Class Presentation On Screen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPLICITITEMCLASSEXTENSIONImpl extends CLASSEXTENSIONImpl implements EXPLICITITEMCLASSEXTENSION {
	/**
	 * The cached value of the '{@link #getAccessIcon() <em>Access Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIcon()
	 * @generated
	 * @ordered
	 */
	protected ILLUSTRATION accessIcon;

	/**
	 * The cached value of the '{@link #getContentMsg() <em>Content Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGE contentMsg;

	/**
	 * The cached value of the '{@link #getCreateIcon() <em>Create Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateIcon()
	 * @generated
	 * @ordered
	 */
	protected CREATEICON createIcon;

	/**
	 * The cached value of the '{@link #getCreateMsg() <em>Create Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGE createMsg;

	/**
	 * The cached value of the '{@link #getClassPresentationOnPaper() <em>Class Presentation On Paper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPresentationOnPaper()
	 * @generated
	 * @ordered
	 */
	protected CLASSPRESENTATIONONPAPER classPresentationOnPaper;

	/**
	 * The cached value of the '{@link #getClassPresentationOnScreen() <em>Class Presentation On Screen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPresentationOnScreen()
	 * @generated
	 * @ordered
	 */
	protected CLASSPRESENTATIONONSCREEN classPresentationOnScreen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXPLICITITEMCLASSEXTENSIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.EXPLICITITEMCLASSEXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATION getAccessIcon() {
		return accessIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessIcon(ILLUSTRATION newAccessIcon, NotificationChain msgs) {
		ILLUSTRATION oldAccessIcon = accessIcon;
		accessIcon = newAccessIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON, oldAccessIcon, newAccessIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessIcon(ILLUSTRATION newAccessIcon) {
		if (newAccessIcon != accessIcon) {
			NotificationChain msgs = null;
			if (accessIcon != null)
				msgs = ((InternalEObject)accessIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON, null, msgs);
			if (newAccessIcon != null)
				msgs = ((InternalEObject)newAccessIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON, null, msgs);
			msgs = basicSetAccessIcon(newAccessIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON, newAccessIcon, newAccessIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE getContentMsg() {
		return contentMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentMsg(MESSAGE newContentMsg, NotificationChain msgs) {
		MESSAGE oldContentMsg = contentMsg;
		contentMsg = newContentMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG, oldContentMsg, newContentMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentMsg(MESSAGE newContentMsg) {
		if (newContentMsg != contentMsg) {
			NotificationChain msgs = null;
			if (contentMsg != null)
				msgs = ((InternalEObject)contentMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG, null, msgs);
			if (newContentMsg != null)
				msgs = ((InternalEObject)newContentMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG, null, msgs);
			msgs = basicSetContentMsg(newContentMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG, newContentMsg, newContentMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CREATEICON getCreateIcon() {
		return createIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateIcon(CREATEICON newCreateIcon, NotificationChain msgs) {
		CREATEICON oldCreateIcon = createIcon;
		createIcon = newCreateIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON, oldCreateIcon, newCreateIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateIcon(CREATEICON newCreateIcon) {
		if (newCreateIcon != createIcon) {
			NotificationChain msgs = null;
			if (createIcon != null)
				msgs = ((InternalEObject)createIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON, null, msgs);
			if (newCreateIcon != null)
				msgs = ((InternalEObject)newCreateIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON, null, msgs);
			msgs = basicSetCreateIcon(newCreateIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON, newCreateIcon, newCreateIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE getCreateMsg() {
		return createMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateMsg(MESSAGE newCreateMsg, NotificationChain msgs) {
		MESSAGE oldCreateMsg = createMsg;
		createMsg = newCreateMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG, oldCreateMsg, newCreateMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMsg(MESSAGE newCreateMsg) {
		if (newCreateMsg != createMsg) {
			NotificationChain msgs = null;
			if (createMsg != null)
				msgs = ((InternalEObject)createMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG, null, msgs);
			if (newCreateMsg != null)
				msgs = ((InternalEObject)newCreateMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG, null, msgs);
			msgs = basicSetCreateMsg(newCreateMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG, newCreateMsg, newCreateMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONPAPER getClassPresentationOnPaper() {
		return classPresentationOnPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassPresentationOnPaper(CLASSPRESENTATIONONPAPER newClassPresentationOnPaper, NotificationChain msgs) {
		CLASSPRESENTATIONONPAPER oldClassPresentationOnPaper = classPresentationOnPaper;
		classPresentationOnPaper = newClassPresentationOnPaper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER, oldClassPresentationOnPaper, newClassPresentationOnPaper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPresentationOnPaper(CLASSPRESENTATIONONPAPER newClassPresentationOnPaper) {
		if (newClassPresentationOnPaper != classPresentationOnPaper) {
			NotificationChain msgs = null;
			if (classPresentationOnPaper != null)
				msgs = ((InternalEObject)classPresentationOnPaper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER, null, msgs);
			if (newClassPresentationOnPaper != null)
				msgs = ((InternalEObject)newClassPresentationOnPaper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER, null, msgs);
			msgs = basicSetClassPresentationOnPaper(newClassPresentationOnPaper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER, newClassPresentationOnPaper, newClassPresentationOnPaper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONSCREEN getClassPresentationOnScreen() {
		return classPresentationOnScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassPresentationOnScreen(CLASSPRESENTATIONONSCREEN newClassPresentationOnScreen, NotificationChain msgs) {
		CLASSPRESENTATIONONSCREEN oldClassPresentationOnScreen = classPresentationOnScreen;
		classPresentationOnScreen = newClassPresentationOnScreen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN, oldClassPresentationOnScreen, newClassPresentationOnScreen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPresentationOnScreen(CLASSPRESENTATIONONSCREEN newClassPresentationOnScreen) {
		if (newClassPresentationOnScreen != classPresentationOnScreen) {
			NotificationChain msgs = null;
			if (classPresentationOnScreen != null)
				msgs = ((InternalEObject)classPresentationOnScreen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN, null, msgs);
			if (newClassPresentationOnScreen != null)
				msgs = ((InternalEObject)newClassPresentationOnScreen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN, null, msgs);
			msgs = basicSetClassPresentationOnScreen(newClassPresentationOnScreen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN, newClassPresentationOnScreen, newClassPresentationOnScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON:
				return basicSetAccessIcon(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG:
				return basicSetContentMsg(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON:
				return basicSetCreateIcon(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG:
				return basicSetCreateMsg(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER:
				return basicSetClassPresentationOnPaper(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN:
				return basicSetClassPresentationOnScreen(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON:
				return getAccessIcon();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG:
				return getContentMsg();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON:
				return getCreateIcon();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG:
				return getCreateMsg();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER:
				return getClassPresentationOnPaper();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN:
				return getClassPresentationOnScreen();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON:
				setAccessIcon((ILLUSTRATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG:
				setContentMsg((MESSAGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON:
				setCreateIcon((CREATEICON)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG:
				setCreateMsg((MESSAGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER:
				setClassPresentationOnPaper((CLASSPRESENTATIONONPAPER)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN:
				setClassPresentationOnScreen((CLASSPRESENTATIONONSCREEN)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON:
				setAccessIcon((ILLUSTRATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG:
				setContentMsg((MESSAGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON:
				setCreateIcon((CREATEICON)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG:
				setCreateMsg((MESSAGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER:
				setClassPresentationOnPaper((CLASSPRESENTATIONONPAPER)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN:
				setClassPresentationOnScreen((CLASSPRESENTATIONONSCREEN)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__ACCESS_ICON:
				return accessIcon != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CONTENT_MSG:
				return contentMsg != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_ICON:
				return createIcon != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CREATE_MSG:
				return createMsg != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_PAPER:
				return classPresentationOnPaper != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION__CLASS_PRESENTATION_ON_SCREEN:
				return classPresentationOnScreen != null;
		}
		return super.eIsSet(featureID);
	}

} //EXPLICITITEMCLASSEXTENSIONImpl
