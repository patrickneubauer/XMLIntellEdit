/**
 */
package org_sl_planet_bgfSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getValue <em>Value</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getAny <em>Any</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getSelectable <em>Selectable</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getMarked <em>Marked</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getChoice <em>Choice</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getAllof <em>Allof</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getNot <em>Not</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getOptional <em>Optional</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getPlus <em>Plus</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getStar <em>Star</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getSeplistplus <em>Seplistplus</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Expression#getSepliststar <em>Sepliststar</em>}</li>
 * </ul>
 *
 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org_sl_planet_bgfSimplified.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org_sl_planet_bgfSimplified.Value
	 * @see #setValue(Value)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org_sl_planet_bgfSimplified.Value
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' attribute.
	 * @see #setTerminal(String)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Terminal()
	 * @model
	 * @generated
	 */
	String getTerminal();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getTerminal <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' attribute.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(String value);

	/**
	 * Returns the value of the '<em><b>Nonterminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonterminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonterminal</em>' attribute.
	 * @see #setNonterminal(String)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Nonterminal()
	 * @model
	 * @generated
	 */
	String getNonterminal();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getNonterminal <em>Nonterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonterminal</em>' attribute.
	 * @see #getNonterminal()
	 * @generated
	 */
	void setNonterminal(String value);

	/**
	 * Returns the value of the '<em><b>Epsilon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epsilon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epsilon</em>' containment reference.
	 * @see #setEpsilon(Epsilon)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Epsilon()
	 * @model containment="true"
	 * @generated
	 */
	Epsilon getEpsilon();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getEpsilon <em>Epsilon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epsilon</em>' containment reference.
	 * @see #getEpsilon()
	 * @generated
	 */
	void setEpsilon(Epsilon value);

	/**
	 * Returns the value of the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' containment reference.
	 * @see #setEmpty(Empty)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Empty()
	 * @model containment="true"
	 * @generated
	 */
	Empty getEmpty();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getEmpty <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty</em>' containment reference.
	 * @see #getEmpty()
	 * @generated
	 */
	void setEmpty(Empty value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see #setAny(Any)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Any()
	 * @model containment="true"
	 * @generated
	 */
	Any getAny();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getAny <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any</em>' containment reference.
	 * @see #getAny()
	 * @generated
	 */
	void setAny(Any value);

	/**
	 * Returns the value of the '<em><b>Selectable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable</em>' containment reference.
	 * @see #setSelectable(Selectable)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Selectable()
	 * @model containment="true"
	 * @generated
	 */
	Selectable getSelectable();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getSelectable <em>Selectable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable</em>' containment reference.
	 * @see #getSelectable()
	 * @generated
	 */
	void setSelectable(Selectable value);

	/**
	 * Returns the value of the '<em><b>Marked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marked</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked</em>' containment reference.
	 * @see #setMarked(Marked)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Marked()
	 * @model containment="true"
	 * @generated
	 */
	Marked getMarked();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getMarked <em>Marked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marked</em>' containment reference.
	 * @see #getMarked()
	 * @generated
	 */
	void setMarked(Marked value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(Sequence)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	Sequence getSequence();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Sequence value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference.
	 * @see #setChoice(Choice)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Choice()
	 * @model containment="true"
	 * @generated
	 */
	Choice getChoice();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getChoice <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' containment reference.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(Choice value);

	/**
	 * Returns the value of the '<em><b>Allof</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allof</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allof</em>' containment reference.
	 * @see #setAllof(Allof)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Allof()
	 * @model containment="true"
	 * @generated
	 */
	Allof getAllof();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getAllof <em>Allof</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allof</em>' containment reference.
	 * @see #getAllof()
	 * @generated
	 */
	void setAllof(Allof value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Not)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Not()
	 * @model containment="true"
	 * @generated
	 */
	Not getNot();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Not value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' containment reference.
	 * @see #setOptional(Optional)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Optional()
	 * @model containment="true"
	 * @generated
	 */
	Optional getOptional();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getOptional <em>Optional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' containment reference.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(Optional value);

	/**
	 * Returns the value of the '<em><b>Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plus</em>' containment reference.
	 * @see #setPlus(Plus)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Plus()
	 * @model containment="true"
	 * @generated
	 */
	Plus getPlus();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getPlus <em>Plus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plus</em>' containment reference.
	 * @see #getPlus()
	 * @generated
	 */
	void setPlus(Plus value);

	/**
	 * Returns the value of the '<em><b>Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Star</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Star</em>' containment reference.
	 * @see #setStar(Star)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Star()
	 * @model containment="true"
	 * @generated
	 */
	Star getStar();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getStar <em>Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Star</em>' containment reference.
	 * @see #getStar()
	 * @generated
	 */
	void setStar(Star value);

	/**
	 * Returns the value of the '<em><b>Seplistplus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seplistplus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seplistplus</em>' containment reference.
	 * @see #setSeplistplus(Seplistplus)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Seplistplus()
	 * @model containment="true"
	 * @generated
	 */
	Seplistplus getSeplistplus();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getSeplistplus <em>Seplistplus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seplistplus</em>' containment reference.
	 * @see #getSeplistplus()
	 * @generated
	 */
	void setSeplistplus(Seplistplus value);

	/**
	 * Returns the value of the '<em><b>Sepliststar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sepliststar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sepliststar</em>' containment reference.
	 * @see #setSepliststar(Sepliststar)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getExpression_Sepliststar()
	 * @model containment="true"
	 * @generated
	 */
	Sepliststar getSepliststar();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Expression#getSepliststar <em>Sepliststar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sepliststar</em>' containment reference.
	 * @see #getSepliststar()
	 * @generated
	 */
	void setSepliststar(Sepliststar value);

} // Expression
