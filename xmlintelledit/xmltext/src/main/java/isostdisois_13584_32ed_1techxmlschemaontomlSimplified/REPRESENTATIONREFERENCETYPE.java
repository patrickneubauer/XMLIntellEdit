/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REPRESENTATIONREFERENCETYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REPRESENTATIONREFERENCETYPE#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getREPRESENTATIONREFERENCETYPE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternClassRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternClassRef='(self.classRef=null) or self.classRef.matches(\'0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-REPRESENTATION_REFERENCE#1\')'"
 * @generated
 */
public interface REPRESENTATIONREFERENCETYPE extends ANYTYPE {
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getREPRESENTATIONREFERENCETYPE_ClassRef()
	 * @model
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REPRESENTATIONREFERENCETYPE#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

} // REPRESENTATIONREFERENCETYPE
