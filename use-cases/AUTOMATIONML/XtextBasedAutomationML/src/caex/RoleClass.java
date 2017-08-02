/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Shall be used for RoleClass definition, provides base structures for a role class definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.RoleClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.RoleClass#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getRoleClass()
 * @model
 * @generated
 */
public interface RoleClass extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the RoleClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.CaexPackage#getRoleClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link caex.ExternalInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of an external interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see caex.CaexPackage#getRoleClass_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the reference of a class to its base class. References contain the full path to the refered class object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #setRefBaseClassPath(String)
	 * @see caex.CaexPackage#getRoleClass_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link caex.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #getRefBaseClassPath()
	 * @generated
	 */
	void setRefBaseClassPath(String value);

} // RoleClass
