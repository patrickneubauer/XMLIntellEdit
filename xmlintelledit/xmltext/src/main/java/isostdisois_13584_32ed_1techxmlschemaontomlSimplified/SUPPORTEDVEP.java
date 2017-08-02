/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUPPORTEDVEP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPORTEDVEP#getViewExchangeProtocolIdentifications <em>View Exchange Protocol Identifications</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSUPPORTEDVEP()
 * @model
 * @generated
 */
public interface SUPPORTEDVEP extends EObject {
	/**
	 * Returns the value of the '<em><b>View Exchange Protocol Identifications</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWEXCHANGEPROTOCOLIDENTIFICATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Exchange Protocol Identifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Exchange Protocol Identifications</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSUPPORTEDVEP_ViewExchangeProtocolIdentifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VIEWEXCHANGEPROTOCOLIDENTIFICATION> getViewExchangeProtocolIdentifications();

} // SUPPORTEDVEP
