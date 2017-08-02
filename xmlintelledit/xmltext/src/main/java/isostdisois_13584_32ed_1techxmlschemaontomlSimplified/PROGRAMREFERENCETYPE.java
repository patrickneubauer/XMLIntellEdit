/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROGRAMREFERENCETYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getInoutParameters <em>Inout Parameters</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROGRAMREFERENCETYPE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternClassRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternClassRef='(self.classRef=null) or self.classRef.matches(\'0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-PROGRAM_REFERENCE#1\')'"
 * @generated
 */
public interface PROGRAMREFERENCETYPE extends ANYTYPE {
	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' attribute.
	 * @see #setClassRef(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROGRAMREFERENCETYPE_ClassRef()
	 * @model
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

	/**
	 * Returns the value of the '<em><b>In Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameters</em>' containment reference.
	 * @see #setInParameters(PROPERTIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROGRAMREFERENCETYPE_InParameters()
	 * @model containment="true"
	 * @generated
	 */
	PROPERTIESREFERENCE getInParameters();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getInParameters <em>In Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Parameters</em>' containment reference.
	 * @see #getInParameters()
	 * @generated
	 */
	void setInParameters(PROPERTIESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Out Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Parameters</em>' containment reference.
	 * @see #setOutParameters(PROPERTIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROGRAMREFERENCETYPE_OutParameters()
	 * @model containment="true"
	 * @generated
	 */
	PROPERTIESREFERENCE getOutParameters();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getOutParameters <em>Out Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Parameters</em>' containment reference.
	 * @see #getOutParameters()
	 * @generated
	 */
	void setOutParameters(PROPERTIESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Inout Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inout Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inout Parameters</em>' containment reference.
	 * @see #setInoutParameters(PROPERTIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROGRAMREFERENCETYPE_InoutParameters()
	 * @model containment="true"
	 * @generated
	 */
	PROPERTIESREFERENCE getInoutParameters();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE#getInoutParameters <em>Inout Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inout Parameters</em>' containment reference.
	 * @see #getInoutParameters()
	 * @generated
	 */
	void setInoutParameters(PROPERTIESREFERENCE value);

} // PROGRAMREFERENCETYPE
