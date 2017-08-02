/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTAINEDEATEMPLATES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES#getEaTemplates <em>Ea Templates</em>}</li>
 * </ul>
 *
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getCONTAINEDEATEMPLATES()
 * @model
 * @generated
 */
public interface CONTAINEDEATEMPLATES extends EObject {
	/**
	 * Returns the value of the '<em><b>Ea Templates</b></em>' containment reference list.
	 * The list contents are of type {@link xontomlextensionsschemacoreSimplified.EATEMPLATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Templates</em>' containment reference list.
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getCONTAINEDEATEMPLATES_EaTemplates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EATEMPLATE> getEaTemplates();

} // CONTAINEDEATEMPLATES
