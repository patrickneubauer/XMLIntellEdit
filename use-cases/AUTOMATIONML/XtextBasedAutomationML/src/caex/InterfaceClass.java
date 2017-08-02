/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Shall be used for InterfaceClass definition, provides base structures for an interface class definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.InterfaceClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getInterfaceClass()
 * @model
 * @generated
 */
public interface InterfaceClass extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the InterfaceClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.CaexPackage#getInterfaceClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the reference of a class to its base class. References contain the full path to the refered class object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #setRefBaseClassPath(String)
	 * @see caex.CaexPackage#getInterfaceClass_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link caex.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #getRefBaseClassPath()
	 * @generated
	 */
	void setRefBaseClassPath(String value);

} // InterfaceClass
