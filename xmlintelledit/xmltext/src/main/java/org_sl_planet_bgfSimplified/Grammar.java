/**
 */
package org_sl_planet_bgfSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.Grammar#getRoots <em>Roots</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.Grammar#getProductions <em>Productions</em>}</li>
 * </ul>
 *
 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends EObject {
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' attribute list.
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getGrammar_Roots()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRoots();

	/**
	 * Returns the value of the '<em><b>Productions</b></em>' containment reference list.
	 * The list contents are of type {@link org_sl_planet_bgfSimplified.Production}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productions</em>' containment reference list.
	 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage#getGrammar_Productions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Production> getProductions();

} // Grammar
