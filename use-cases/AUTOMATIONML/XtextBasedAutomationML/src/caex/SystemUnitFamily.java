/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a hierarchical SystemUnitClass tree. The hierarchical structure of a SystemUnit library has organizational character only.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.SystemUnitFamily#getSystemUnitClass <em>System Unit Class</em>}</li>
 *   <li>{@link caex.SystemUnitFamily#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getSystemUnitFamily()
 * @model
 * @generated
 */
public interface SystemUnitFamily extends SystemUnitClass {
	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.SystemUnitFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element that allows definition of child SystemUnitClasses within the class hierarchy. The parent child relation between two SystemUnitClasses has no semantic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitFamily_SystemUnitClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitFamily> getSystemUnitClass();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the reference of a class to its base class. References contain the full path to the refered class object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #setRefBaseClassPath(String)
	 * @see caex.CaexPackage#getSystemUnitFamily_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link caex.SystemUnitFamily#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #getRefBaseClassPath()
	 * @generated
	 */
	void setRefBaseClassPath(String value);

} // SystemUnitFamily
