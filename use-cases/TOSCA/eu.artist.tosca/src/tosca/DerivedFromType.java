/**
 */
package tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived From Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.DerivedFromType#getDerivedFrom <em>Derived From</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getDerivedFromType()
 * @model
 * @generated
 */
public interface DerivedFromType extends EObject {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' attribute.
	 * @see #setDerivedFrom(QName)
	 * @see tosca.ToscaPackage#getDerivedFromType_DerivedFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 * @generated
	 */
	QName getDerivedFrom();

	/**
	 * Sets the value of the '{@link tosca.DerivedFromType#getDerivedFrom <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' attribute.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(QName value);

} // DerivedFromType
