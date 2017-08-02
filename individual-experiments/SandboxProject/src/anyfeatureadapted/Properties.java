/**
 */
package anyfeatureadapted;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link anyfeatureadapted.Properties#getAnyGenericElem <em>Any Generic Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getProperties()
 * @model extendedMetaData="name='Properties' kind='elementOnly'"
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Any Generic Elem</b></em>' containment reference list.
	 * The list contents are of type {@link anyfeatureadapted.AnyGenericConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Generic Elem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Generic Elem</em>' containment reference list.
	 * @see anyfeatureadapted.AnyfeatureadaptedPackage#getProperties_AnyGenericElem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnyGenericConstruct> getAnyGenericElem();

} // Properties
