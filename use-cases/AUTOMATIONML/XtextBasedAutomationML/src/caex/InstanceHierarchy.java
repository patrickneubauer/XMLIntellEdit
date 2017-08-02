/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.InstanceHierarchy#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getInstanceHierarchy()
 * @model
 * @generated
 */
public interface InstanceHierarchy extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InternalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used in order to define nested objects inside of a SystemUnitClass or another InternalElement. Allows description of the internal structure of an CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see caex.CaexPackage#getInstanceHierarchy_InternalElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalElement> getInternalElement();

} // InstanceHierarchy
