/**
 */
package tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPolicy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TPolicyType#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link tosca.TPolicyType#getPolicyLanguage <em>Policy Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTPolicyType()
 * @model
 * @generated
 */
public interface TPolicyType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference.
	 * @see #setAppliesTo(TAppliesTo)
	 * @see tosca.ToscaPackage#getTPolicyType_AppliesTo()
	 * @model containment="true"
	 * @generated
	 */
	TAppliesTo getAppliesTo();

	/**
	 * Sets the value of the '{@link tosca.TPolicyType#getAppliesTo <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' containment reference.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(TAppliesTo value);

	/**
	 * Returns the value of the '<em><b>Policy Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Language</em>' attribute.
	 * @see #setPolicyLanguage(String)
	 * @see tosca.ToscaPackage#getTPolicyType_PolicyLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getPolicyLanguage();

	/**
	 * Sets the value of the '{@link tosca.TPolicyType#getPolicyLanguage <em>Policy Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Language</em>' attribute.
	 * @see #getPolicyLanguage()
	 * @generated
	 */
	void setPolicyLanguage(String value);

} // TPolicyType
