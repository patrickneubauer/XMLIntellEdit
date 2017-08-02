/**
 */
package serviceexample;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceexample.Cluster#getServices <em>Services</em>}</li>
 *   <li>{@link serviceexample.Cluster#getBackup <em>Backup</em>}</li>
 *   <li>{@link serviceexample.Cluster#getDesignSpeed <em>Design Speed</em>}</li>
 *   <li>{@link serviceexample.Cluster#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see serviceexample.ServiceexamplePackage#getCluster()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameServics goodSpeed onlyOneImportant backupDifferent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sameServics='backup = null or backup.services->includesAll(services)' goodSpeed='designSpeed <= server.speed->sum()' onlyOneImportant='services->select(s | s.type = ServiceType::IMPORTANT)->size() <= 1' backupDifferent='backup <> self'"
 * @generated
 */
public interface Cluster extends NamedThing {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link serviceexample.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see serviceexample.ServiceexamplePackage#getCluster_Services()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Backup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup</em>' reference.
	 * @see #setBackup(Cluster)
	 * @see serviceexample.ServiceexamplePackage#getCluster_Backup()
	 * @model
	 * @generated
	 */
	Cluster getBackup();

	/**
	 * Sets the value of the '{@link serviceexample.Cluster#getBackup <em>Backup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup</em>' reference.
	 * @see #getBackup()
	 * @generated
	 */
	void setBackup(Cluster value);

	/**
	 * Returns the value of the '<em><b>Design Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Speed</em>' attribute.
	 * @see #setDesignSpeed(BigInteger)
	 * @see serviceexample.ServiceexamplePackage#getCluster_DesignSpeed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getDesignSpeed();

	/**
	 * Sets the value of the '{@link serviceexample.Cluster#getDesignSpeed <em>Design Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Speed</em>' attribute.
	 * @see #getDesignSpeed()
	 * @generated
	 */
	void setDesignSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference list.
	 * The list contents are of type {@link serviceexample.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference list.
	 * @see serviceexample.ServiceexamplePackage#getCluster_Server()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServer();

} // Cluster
