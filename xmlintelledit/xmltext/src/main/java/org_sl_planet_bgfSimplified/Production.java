/**
 */
package org_sl_planet_bgfSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.Production#getLabel <em>Label</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Production#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Production#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getProduction()
 * @model
 * @generated
 */
public interface Production extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getProduction_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Production#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getProduction_Nonterminal()
	 * @model required="true"
	 * @generated
	 */
	String getNonterminal();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Production#getNonterminal <em>Nonterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonterminal</em>' attribute.
	 * @see #getNonterminal()
	 * @generated
	 */
	void setNonterminal(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getProduction_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Production#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Production
