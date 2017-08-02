/**
 */
package Library3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Library3.BookInfoType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see Library3.Library3Package#getBookInfoType()
 * @model extendedMetaData="name='bookInfoType' kind='mixed'"
 * @generated
 */
public interface BookInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference list.
	 * The list contents are of type {@link Library3.AnyGenericElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference list.
	 * @see Library3.Library3Package#getBookInfoType_Any()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnyGenericElement> getAny();

} // BookInfoType
