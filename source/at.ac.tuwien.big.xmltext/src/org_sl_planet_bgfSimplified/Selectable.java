/**
 */
package org_sl_planet_bgfSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.Selectable#getSelector <em>Selector</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Selectable#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getSelectable()
 * @model
 * @generated
 */
public interface Selectable extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getSelectable_Selector()
	 * @model required="true"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Selectable#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

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
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getSelectable_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org_sl_planet_bgfSimplified.Selectable#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Selectable
