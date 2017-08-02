/**
 */
package serviceexample;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link serviceexample.Service#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link serviceexample.Service#getDesignSpeed <em>Design Speed</em>}</li>
 *   <li>{@link serviceexample.Service#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see serviceexample.ServiceexamplePackage#getService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='speedFulfilled'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot speedFulfilled='type = ServiceType::BESTEFFORT or ( \n\t\t\tdesignSpeed <= providedBy.designSpeed and (if type = ServiceType::IMPORTANT then designSpeed <= providedBy.backup.designSpeed\n\t\t\t\telse type = ServiceType::WEAKCONTRACT or providedBy.backup <> null endif))'"
 * @generated
 */
public interface Service extends NamedThing {
	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By</em>' reference.
	 * @see #setProvidedBy(Cluster)
	 * @see serviceexample.ServiceexamplePackage#getService_ProvidedBy()
	 * @model required="true"
	 * @generated
	 */
	Cluster getProvidedBy();

	/**
	 * Sets the value of the '{@link serviceexample.Service#getProvidedBy <em>Provided By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided By</em>' reference.
	 * @see #getProvidedBy()
	 * @generated
	 */
	void setProvidedBy(Cluster value);

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
	 * @see serviceexample.ServiceexamplePackage#getService_DesignSpeed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getDesignSpeed();

	/**
	 * Sets the value of the '{@link serviceexample.Service#getDesignSpeed <em>Design Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Speed</em>' attribute.
	 * @see #getDesignSpeed()
	 * @generated
	 */
	void setDesignSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link serviceexample.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see serviceexample.ServiceType
	 * @see #setType(ServiceType)
	 * @see serviceexample.ServiceexamplePackage#getService_Type()
	 * @model required="true"
	 * @generated
	 */
	ServiceType getType();

	/**
	 * Sets the value of the '{@link serviceexample.Service#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see serviceexample.ServiceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ServiceType value);

} // Service
