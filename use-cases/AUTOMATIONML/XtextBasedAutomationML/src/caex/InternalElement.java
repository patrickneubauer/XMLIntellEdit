/**
 */
package caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.InternalElement#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link caex.InternalElement#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getInternalElement()
 * @model
 * @generated
 */
public interface InternalElement extends SystemUnitClass {
	/**
	 * Returns the value of the '<em><b>Role Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes role requirements of an InternalElement. It allows the definition of a reference to a RoleClass and the specification of role requirements like required attributes and required interfaces. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Requirements</em>' containment reference.
	 * @see #setRoleRequirements(RoleRequirements)
	 * @see caex.CaexPackage#getInternalElement_RoleRequirements()
	 * @model containment="true"
	 * @generated
	 */
	RoleRequirements getRoleRequirements();

	/**
	 * Sets the value of the '{@link caex.InternalElement#getRoleRequirements <em>Role Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Requirements</em>' containment reference.
	 * @see #getRoleRequirements()
	 * @generated
	 */
	void setRoleRequirements(RoleRequirements value);

	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Host element for AttributeNameMapping and InterfaceNameMapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference.
	 * @see #setMappingObject(Mapping)
	 * @see caex.CaexPackage#getInternalElement_MappingObject()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMappingObject();

	/**
	 * Sets the value of the '{@link caex.InternalElement#getMappingObject <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Object</em>' containment reference.
	 * @see #getMappingObject()
	 * @generated
	 */
	void setMappingObject(Mapping value);

	/**
	 * Returns the value of the '<em><b>Ref Base System Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the reference of an InternalElement to a class or instance definition. References contain the full path information. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Base System Unit Path</em>' attribute.
	 * @see #setRefBaseSystemUnitPath(String)
	 * @see caex.CaexPackage#getInternalElement_RefBaseSystemUnitPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseSystemUnitPath();

	/**
	 * Sets the value of the '{@link caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base System Unit Path</em>' attribute.
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 */
	void setRefBaseSystemUnitPath(String value);

} // InternalElement
