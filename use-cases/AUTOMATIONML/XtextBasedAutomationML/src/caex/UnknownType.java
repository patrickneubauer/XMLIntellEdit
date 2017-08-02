/**
 */
package caex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.UnknownType#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getUnknownType()
 * @model
 * @generated
 */
public interface UnknownType extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines informative requirements as a constraint for an attribute value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute.
	 * @see #setRequirements(String)
	 * @see caex.CaexPackage#getUnknownType_Requirements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequirements();

	/**
	 * Sets the value of the '{@link caex.UnknownType#getRequirements <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' attribute.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(String value);

} // UnknownType
