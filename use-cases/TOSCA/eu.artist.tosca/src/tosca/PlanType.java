/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.PlanType#getPlanRef <em>Plan Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getPlanType()
 * @model
 * @generated
 */
public interface PlanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Ref</em>' attribute.
	 * @see #setPlanRef(String)
	 * @see tosca.ToscaPackage#getPlanType_PlanRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getPlanRef();

	/**
	 * Sets the value of the '{@link tosca.PlanType#getPlanRef <em>Plan Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Ref</em>' attribute.
	 * @see #getPlanRef()
	 * @generated
	 */
	void setPlanRef(String value);

} // PlanType
