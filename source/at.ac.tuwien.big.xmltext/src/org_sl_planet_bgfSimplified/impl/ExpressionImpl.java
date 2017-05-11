/**
 */
package org_sl_planet_bgfSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org_sl_planet_bgfSimplified.Allof;
import org_sl_planet_bgfSimplified.Any;
import org_sl_planet_bgfSimplified.Choice;
import org_sl_planet_bgfSimplified.Empty;
import org_sl_planet_bgfSimplified.Epsilon;
import org_sl_planet_bgfSimplified.Expression;
import org_sl_planet_bgfSimplified.Marked;
import org_sl_planet_bgfSimplified.Not;
import org_sl_planet_bgfSimplified.Optional;
import org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage;
import org_sl_planet_bgfSimplified.Plus;
import org_sl_planet_bgfSimplified.Selectable;
import org_sl_planet_bgfSimplified.Seplistplus;
import org_sl_planet_bgfSimplified.Sepliststar;
import org_sl_planet_bgfSimplified.Sequence;
import org_sl_planet_bgfSimplified.Star;
import org_sl_planet_bgfSimplified.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getMarked <em>Marked</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getAllof <em>Allof</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getPlus <em>Plus</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getStar <em>Star</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getSeplistplus <em>Seplistplus</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl#getSepliststar <em>Sepliststar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Value VALUE_EDEFAULT = Value.INT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected String terminal = TERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonterminal() <em>Nonterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonterminal()
	 * @generated
	 * @ordered
	 */
	protected static final String NONTERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonterminal() <em>Nonterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonterminal()
	 * @generated
	 * @ordered
	 */
	protected String nonterminal = NONTERMINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEpsilon() <em>Epsilon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsilon()
	 * @generated
	 * @ordered
	 */
	protected Epsilon epsilon;

	/**
	 * The cached value of the '{@link #getEmpty() <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpty()
	 * @generated
	 * @ordered
	 */
	protected Empty empty;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected Any any;

	/**
	 * The cached value of the '{@link #getSelectable() <em>Selectable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectable()
	 * @generated
	 * @ordered
	 */
	protected Selectable selectable;

	/**
	 * The cached value of the '{@link #getMarked() <em>Marked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarked()
	 * @generated
	 * @ordered
	 */
	protected Marked marked;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence sequence;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected Choice choice;

	/**
	 * The cached value of the '{@link #getAllof() <em>Allof</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllof()
	 * @generated
	 * @ordered
	 */
	protected Allof allof;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected Not not;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected Optional optional;

	/**
	 * The cached value of the '{@link #getPlus() <em>Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlus()
	 * @generated
	 * @ordered
	 */
	protected Plus plus;

	/**
	 * The cached value of the '{@link #getStar() <em>Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStar()
	 * @generated
	 * @ordered
	 */
	protected Star star;

	/**
	 * The cached value of the '{@link #getSeplistplus() <em>Seplistplus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeplistplus()
	 * @generated
	 * @ordered
	 */
	protected Seplistplus seplistplus;

	/**
	 * The cached value of the '{@link #getSepliststar() <em>Sepliststar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSepliststar()
	 * @generated
	 * @ordered
	 */
	protected Sepliststar sepliststar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Org_sl_planet_bgfSimplifiedPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(String newTerminal) {
		String oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNonterminal() {
		return nonterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonterminal(String newNonterminal) {
		String oldNonterminal = nonterminal;
		nonterminal = newNonterminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NONTERMINAL, oldNonterminal, nonterminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epsilon getEpsilon() {
		return epsilon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpsilon(Epsilon newEpsilon, NotificationChain msgs) {
		Epsilon oldEpsilon = epsilon;
		epsilon = newEpsilon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON, oldEpsilon, newEpsilon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpsilon(Epsilon newEpsilon) {
		if (newEpsilon != epsilon) {
			NotificationChain msgs = null;
			if (epsilon != null)
				msgs = ((InternalEObject)epsilon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON, null, msgs);
			if (newEpsilon != null)
				msgs = ((InternalEObject)newEpsilon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON, null, msgs);
			msgs = basicSetEpsilon(newEpsilon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON, newEpsilon, newEpsilon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty getEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpty(Empty newEmpty, NotificationChain msgs) {
		Empty oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY, oldEmpty, newEmpty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(Empty newEmpty) {
		if (newEmpty != empty) {
			NotificationChain msgs = null;
			if (empty != null)
				msgs = ((InternalEObject)empty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY, null, msgs);
			if (newEmpty != null)
				msgs = ((InternalEObject)newEmpty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY, null, msgs);
			msgs = basicSetEmpty(newEmpty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY, newEmpty, newEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(Any newAny, NotificationChain msgs) {
		Any oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(Any newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selectable getSelectable() {
		return selectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectable(Selectable newSelectable, NotificationChain msgs) {
		Selectable oldSelectable = selectable;
		selectable = newSelectable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE, oldSelectable, newSelectable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectable(Selectable newSelectable) {
		if (newSelectable != selectable) {
			NotificationChain msgs = null;
			if (selectable != null)
				msgs = ((InternalEObject)selectable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE, null, msgs);
			if (newSelectable != null)
				msgs = ((InternalEObject)newSelectable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE, null, msgs);
			msgs = basicSetSelectable(newSelectable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE, newSelectable, newSelectable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marked getMarked() {
		return marked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarked(Marked newMarked, NotificationChain msgs) {
		Marked oldMarked = marked;
		marked = newMarked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED, oldMarked, newMarked);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarked(Marked newMarked) {
		if (newMarked != marked) {
			NotificationChain msgs = null;
			if (marked != null)
				msgs = ((InternalEObject)marked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED, null, msgs);
			if (newMarked != null)
				msgs = ((InternalEObject)newMarked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED, null, msgs);
			msgs = basicSetMarked(newMarked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED, newMarked, newMarked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(Sequence newSequence, NotificationChain msgs) {
		Sequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getChoice() {
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoice(Choice newChoice, NotificationChain msgs) {
		Choice oldChoice = choice;
		choice = newChoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE, oldChoice, newChoice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(Choice newChoice) {
		if (newChoice != choice) {
			NotificationChain msgs = null;
			if (choice != null)
				msgs = ((InternalEObject)choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE, null, msgs);
			if (newChoice != null)
				msgs = ((InternalEObject)newChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE, null, msgs);
			msgs = basicSetChoice(newChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE, newChoice, newChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allof getAllof() {
		return allof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllof(Allof newAllof, NotificationChain msgs) {
		Allof oldAllof = allof;
		allof = newAllof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF, oldAllof, newAllof);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllof(Allof newAllof) {
		if (newAllof != allof) {
			NotificationChain msgs = null;
			if (allof != null)
				msgs = ((InternalEObject)allof).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF, null, msgs);
			if (newAllof != null)
				msgs = ((InternalEObject)newAllof).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF, null, msgs);
			msgs = basicSetAllof(newAllof, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF, newAllof, newAllof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(Not newNot, NotificationChain msgs) {
		Not oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT, oldNot, newNot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(Not newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptional(Optional newOptional, NotificationChain msgs) {
		Optional oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL, oldOptional, newOptional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(Optional newOptional) {
		if (newOptional != optional) {
			NotificationChain msgs = null;
			if (optional != null)
				msgs = ((InternalEObject)optional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL, null, msgs);
			if (newOptional != null)
				msgs = ((InternalEObject)newOptional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL, null, msgs);
			msgs = basicSetOptional(newOptional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL, newOptional, newOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus getPlus() {
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlus(Plus newPlus, NotificationChain msgs) {
		Plus oldPlus = plus;
		plus = newPlus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS, oldPlus, newPlus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlus(Plus newPlus) {
		if (newPlus != plus) {
			NotificationChain msgs = null;
			if (plus != null)
				msgs = ((InternalEObject)plus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS, null, msgs);
			if (newPlus != null)
				msgs = ((InternalEObject)newPlus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS, null, msgs);
			msgs = basicSetPlus(newPlus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS, newPlus, newPlus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Star getStar() {
		return star;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStar(Star newStar, NotificationChain msgs) {
		Star oldStar = star;
		star = newStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR, oldStar, newStar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStar(Star newStar) {
		if (newStar != star) {
			NotificationChain msgs = null;
			if (star != null)
				msgs = ((InternalEObject)star).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR, null, msgs);
			if (newStar != null)
				msgs = ((InternalEObject)newStar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR, null, msgs);
			msgs = basicSetStar(newStar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR, newStar, newStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seplistplus getSeplistplus() {
		return seplistplus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeplistplus(Seplistplus newSeplistplus, NotificationChain msgs) {
		Seplistplus oldSeplistplus = seplistplus;
		seplistplus = newSeplistplus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS, oldSeplistplus, newSeplistplus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeplistplus(Seplistplus newSeplistplus) {
		if (newSeplistplus != seplistplus) {
			NotificationChain msgs = null;
			if (seplistplus != null)
				msgs = ((InternalEObject)seplistplus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS, null, msgs);
			if (newSeplistplus != null)
				msgs = ((InternalEObject)newSeplistplus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS, null, msgs);
			msgs = basicSetSeplistplus(newSeplistplus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS, newSeplistplus, newSeplistplus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sepliststar getSepliststar() {
		return sepliststar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSepliststar(Sepliststar newSepliststar, NotificationChain msgs) {
		Sepliststar oldSepliststar = sepliststar;
		sepliststar = newSepliststar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR, oldSepliststar, newSepliststar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSepliststar(Sepliststar newSepliststar) {
		if (newSepliststar != sepliststar) {
			NotificationChain msgs = null;
			if (sepliststar != null)
				msgs = ((InternalEObject)sepliststar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR, null, msgs);
			if (newSepliststar != null)
				msgs = ((InternalEObject)newSepliststar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR, null, msgs);
			msgs = basicSetSepliststar(newSepliststar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR, newSepliststar, newSepliststar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON:
				return basicSetEpsilon(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY:
				return basicSetEmpty(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY:
				return basicSetAny(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE:
				return basicSetSelectable(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED:
				return basicSetMarked(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE:
				return basicSetSequence(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE:
				return basicSetChoice(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF:
				return basicSetAllof(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT:
				return basicSetNot(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL:
				return basicSetOptional(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS:
				return basicSetPlus(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR:
				return basicSetStar(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS:
				return basicSetSeplistplus(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR:
				return basicSetSepliststar(null, msgs);
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
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__VALUE:
				return getValue();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__TERMINAL:
				return getTerminal();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NONTERMINAL:
				return getNonterminal();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON:
				return getEpsilon();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY:
				return getEmpty();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY:
				return getAny();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE:
				return getSelectable();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED:
				return getMarked();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE:
				return getSequence();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE:
				return getChoice();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF:
				return getAllof();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT:
				return getNot();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL:
				return getOptional();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS:
				return getPlus();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR:
				return getStar();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS:
				return getSeplistplus();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR:
				return getSepliststar();
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
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__VALUE:
				setValue((Value)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__TERMINAL:
				setTerminal((String)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NONTERMINAL:
				setNonterminal((String)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON:
				setEpsilon((Epsilon)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY:
				setEmpty((Empty)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY:
				setAny((Any)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE:
				setSelectable((Selectable)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED:
				setMarked((Marked)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE:
				setSequence((Sequence)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE:
				setChoice((Choice)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF:
				setAllof((Allof)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT:
				setNot((Not)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL:
				setOptional((Optional)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS:
				setPlus((Plus)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR:
				setStar((Star)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS:
				setSeplistplus((Seplistplus)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR:
				setSepliststar((Sepliststar)newValue);
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
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__TERMINAL:
				setTerminal(TERMINAL_EDEFAULT);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NONTERMINAL:
				setNonterminal(NONTERMINAL_EDEFAULT);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON:
				setEpsilon((Epsilon)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY:
				setEmpty((Empty)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY:
				setAny((Any)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE:
				setSelectable((Selectable)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED:
				setMarked((Marked)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE:
				setSequence((Sequence)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE:
				setChoice((Choice)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF:
				setAllof((Allof)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT:
				setNot((Not)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL:
				setOptional((Optional)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS:
				setPlus((Plus)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR:
				setStar((Star)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS:
				setSeplistplus((Seplistplus)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR:
				setSepliststar((Sepliststar)null);
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
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__VALUE:
				return value != VALUE_EDEFAULT;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__TERMINAL:
				return TERMINAL_EDEFAULT == null ? terminal != null : !TERMINAL_EDEFAULT.equals(terminal);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NONTERMINAL:
				return NONTERMINAL_EDEFAULT == null ? nonterminal != null : !NONTERMINAL_EDEFAULT.equals(nonterminal);
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EPSILON:
				return epsilon != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__EMPTY:
				return empty != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ANY:
				return any != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SELECTABLE:
				return selectable != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__MARKED:
				return marked != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEQUENCE:
				return sequence != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__CHOICE:
				return choice != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__ALLOF:
				return allof != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__NOT:
				return not != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__OPTIONAL:
				return optional != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__PLUS:
				return plus != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__STAR:
				return star != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTPLUS:
				return seplistplus != null;
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION__SEPLISTSTAR:
				return sepliststar != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", terminal: ");
		result.append(terminal);
		result.append(", nonterminal: ");
		result.append(nonterminal);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
