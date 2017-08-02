/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITEMCLASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS#isInstanceSharable <em>Instance Sharable</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASS()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternCodedName maxLengthCodedName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternCodedName='(self.codedName=null) or self.codedName.matches(\'[^\\\\-]*\') or self.codedName.matches(\'[^\\\\s]*\')' maxLengthCodedName='(self.codedName = null) or self.codedName.size() &lt;= 35'"
 * @generated
 */
public interface ITEMCLASS extends CLASS {
	/**
	 * Returns the value of the '<em><b>Coded Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coded Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coded Name</em>' attribute.
	 * @see #setCodedName(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASS_CodedName()
	 * @model
	 * @generated
	 */
	String getCodedName();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS#getCodedName <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coded Name</em>' attribute.
	 * @see #getCodedName()
	 * @generated
	 */
	void setCodedName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Sharable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Sharable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Sharable</em>' attribute.
	 * @see #setInstanceSharable(boolean)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASS_InstanceSharable()
	 * @model
	 * @generated
	 */
	boolean isInstanceSharable();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS#isInstanceSharable <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Sharable</em>' attribute.
	 * @see #isInstanceSharable()
	 * @generated
	 */
	void setInstanceSharable(boolean value);

	/**
	 * Returns the value of the '<em><b>Simplified Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplified Drawing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #setSimplifiedDrawing(GRAPHICS)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASS_SimplifiedDrawing()
	 * @model containment="true"
	 * @generated
	 */
	GRAPHICS getSimplifiedDrawing();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS#getSimplifiedDrawing <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #getSimplifiedDrawing()
	 * @generated
	 */
	void setSimplifiedDrawing(GRAPHICS value);

} // ITEMCLASS
