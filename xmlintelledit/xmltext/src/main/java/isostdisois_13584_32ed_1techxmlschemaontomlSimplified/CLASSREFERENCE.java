/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSREFERENCE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternClassRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternClassRef='self.classRef.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.classRef.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.classRef.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\\\-([A-Z0-9_:\\\\.]{1,71})#[0-9]{1,9}\')'"
 * @generated
 */
public interface CLASSREFERENCE extends EObject {
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSREFERENCE_ClassRef()
	 * @model required="true"
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

} // CLASSREFERENCE
