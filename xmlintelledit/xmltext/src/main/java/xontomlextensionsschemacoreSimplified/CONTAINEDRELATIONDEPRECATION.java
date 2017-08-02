/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTAINEDRELATIONDEPRECATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION#getDeprecations <em>Deprecations</em>}</li>
 * </ul>
 *
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getCONTAINEDRELATIONDEPRECATION()
 * @model
 * @generated
 */
public interface CONTAINEDRELATIONDEPRECATION extends EObject {
	/**
	 * Returns the value of the '<em><b>Deprecations</b></em>' containment reference list.
	 * The list contents are of type {@link xontomlextensionsschemacoreSimplified.DEPRECATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecations</em>' containment reference list.
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getCONTAINEDRELATIONDEPRECATION_Deprecations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DEPRECATION> getDeprecations();

} // CONTAINEDRELATIONDEPRECATION
