/**
 */
package serviceexample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceexample.Container#getService <em>Service</em>}</li>
 *   <li>{@link serviceexample.Container#getCluster <em>Cluster</em>}</li>
 * </ul>
 *
 * @see serviceexample.ServiceexamplePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link serviceexample.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see serviceexample.ServiceexamplePackage#getContainer_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' containment reference list.
	 * The list contents are of type {@link serviceexample.Cluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' containment reference list.
	 * @see serviceexample.ServiceexamplePackage#getContainer_Cluster()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cluster> getCluster();

} // Container
