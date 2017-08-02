/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTAINEDEAINSTANCES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES#getEntityEas <em>Entity Eas</em>}</li>
 * </ul>
 *
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getCONTAINEDEAINSTANCES()
 * @model
 * @generated
 */
public interface CONTAINEDEAINSTANCES extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Eas</b></em>' containment reference list.
	 * The list contents are of type {@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Eas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Eas</em>' containment reference list.
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getCONTAINEDEAINSTANCES_EntityEas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ENTITYEXTENDEDATTRIBUTES> getEntityEas();

} // CONTAINEDEAINSTANCES
