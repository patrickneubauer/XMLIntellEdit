/**
 */
package serviceexample;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceexample.Server#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see serviceexample.ServiceexamplePackage#getServer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='speedValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot speedValid='speed > 0 and speed <= 5'"
 * @generated
 */
public interface Server extends NamedThing {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(BigInteger)
	 * @see serviceexample.ServiceexamplePackage#getServer_Speed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getSpeed();

	/**
	 * Sets the value of the '{@link serviceexample.Server#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(BigInteger value);

} // Server
