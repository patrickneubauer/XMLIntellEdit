/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base element for AttributeNameMapping and InterfaceNameMapping.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link caex.Mapping#getInterfaceNameMapping <em>Interface Name Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link caex.AttributeNameMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the definition of the mapping between attribute names of corresponding RoleClasses and SystemUnitClasses. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Name Mapping</em>' containment reference list.
	 * @see caex.CaexPackage#getMapping_AttributeNameMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeNameMapping> getAttributeNameMapping();

	/**
	 * Returns the value of the '<em><b>Interface Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InterfaceNameMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping of interface names of corresponding RoleClasses and SystemUnitClasses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Name Mapping</em>' containment reference list.
	 * @see caex.CaexPackage#getMapping_InterfaceNameMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceNameMapping> getInterfaceNameMapping();

} // Mapping
