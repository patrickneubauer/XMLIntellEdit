/**
 */
package caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CAEX basis object derived from CAEXBasicObject, augmented by 
 * Name (required) and ID (optional).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.CAEXObject#getID <em>ID</em>}</li>
 *   <li>{@link caex.CAEXObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getCAEXObject()
 * @model
 * @generated
 */
public interface CAEXObject extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute that describes a unique identifier of the CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see caex.CaexPackage#getCAEXObject_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link caex.CAEXObject#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the name of the CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see caex.CaexPackage#getCAEXObject_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link caex.CAEXObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CAEXObject
