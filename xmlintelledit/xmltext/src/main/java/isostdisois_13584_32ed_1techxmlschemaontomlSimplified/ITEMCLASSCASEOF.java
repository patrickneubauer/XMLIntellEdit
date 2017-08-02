/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITEMCLASSCASEOF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#isInstanceSharable <em>Instance Sharable</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getIsCaseOf <em>Is Case Of</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedProperties <em>Imported Properties</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedDocuments <em>Imported Documents</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedConstraints <em>Imported Constraints</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternCodedName maxLengthCodedName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternCodedName='(self.codedName=null) or self.codedName.matches(\'[^\\\\-]*\') or self.codedName.matches(\'[^\\\\s]*\')' maxLengthCodedName='(self.codedName = null) or self.codedName.size() &lt;= 35'"
 * @generated
 */
public interface ITEMCLASSCASEOF extends CLASS {
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_CodedName()
	 * @model
	 * @generated
	 */
	String getCodedName();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getCodedName <em>Coded Name</em>}' attribute.
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_InstanceSharable()
	 * @model
	 * @generated
	 */
	boolean isInstanceSharable();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#isInstanceSharable <em>Instance Sharable</em>}' attribute.
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_SimplifiedDrawing()
	 * @model containment="true"
	 * @generated
	 */
	GRAPHICS getSimplifiedDrawing();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getSimplifiedDrawing <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #getSimplifiedDrawing()
	 * @generated
	 */
	void setSimplifiedDrawing(GRAPHICS value);

	/**
	 * Returns the value of the '<em><b>Is Case Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Case Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Case Of</em>' containment reference.
	 * @see #setIsCaseOf(CLASSESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_IsCaseOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CLASSESREFERENCE getIsCaseOf();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getIsCaseOf <em>Is Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Case Of</em>' containment reference.
	 * @see #getIsCaseOf()
	 * @generated
	 */
	void setIsCaseOf(CLASSESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Imported Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Properties</em>' containment reference.
	 * @see #setImportedProperties(PROPERTIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_ImportedProperties()
	 * @model containment="true"
	 * @generated
	 */
	PROPERTIESREFERENCE getImportedProperties();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedProperties <em>Imported Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Properties</em>' containment reference.
	 * @see #getImportedProperties()
	 * @generated
	 */
	void setImportedProperties(PROPERTIESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Imported Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types</em>' containment reference.
	 * @see #setImportedTypes(DATATYPESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_ImportedTypes()
	 * @model containment="true"
	 * @generated
	 */
	DATATYPESREFERENCE getImportedTypes();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedTypes <em>Imported Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Types</em>' containment reference.
	 * @see #getImportedTypes()
	 * @generated
	 */
	void setImportedTypes(DATATYPESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Imported Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Documents</em>' containment reference.
	 * @see #setImportedDocuments(DOCUMENTSREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_ImportedDocuments()
	 * @model containment="true"
	 * @generated
	 */
	DOCUMENTSREFERENCE getImportedDocuments();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedDocuments <em>Imported Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Documents</em>' containment reference.
	 * @see #getImportedDocuments()
	 * @generated
	 */
	void setImportedDocuments(DOCUMENTSREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Imported Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Constraints</em>' containment reference.
	 * @see #setImportedConstraints(CONSTRAINTS)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getITEMCLASSCASEOF_ImportedConstraints()
	 * @model containment="true"
	 * @generated
	 */
	CONSTRAINTS getImportedConstraints();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF#getImportedConstraints <em>Imported Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Constraints</em>' containment reference.
	 * @see #getImportedConstraints()
	 * @generated
	 */
	void setImportedConstraints(CONSTRAINTS value);

} // ITEMCLASSCASEOF
