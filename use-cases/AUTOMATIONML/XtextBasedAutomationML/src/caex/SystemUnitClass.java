/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a SystemUnit class definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.SystemUnitClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.SystemUnitClass#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.SystemUnitClass#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link caex.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link caex.SystemUnitClass#getInternalLink <em>Internal Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getSystemUnitClass()
 * @model
 * @generated
 */
public interface SystemUnitClass extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the SystemUnitClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of an external interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitClass_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InternalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used in order to define nested objects inside of a SystemUnitClass or another InternalElement. Allows description of the internal structure of an CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitClass_InternalElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalElement> getInternalElement();

	/**
	 * Returns the value of the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.SupportedRoleClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the association to a RoleClass which this SystemUnitClass can play. A SystemUnitClass may reference multiple roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Role Class</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitClass_SupportedRoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedRoleClass> getSupportedRoleClass();

	/**
	 * Returns the value of the '<em><b>Internal Link</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used in order to define the relationships between internal interfaces of InternalElements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Link</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitClass_InternalLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalLink> getInternalLink();

} // SystemUnitClass
