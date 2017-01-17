/**
 */
package simpleanySimplified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleanySimplified.Description#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link simpleanySimplified.Description#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see simpleanySimplified.simpleanySimplifiedPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends MixedBaseClass {
	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see simpleanySimplified.simpleanySimplifiedPackage#getDescription_Keywords()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeywords();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link simpleanySimplified.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see simpleanySimplified.simpleanySimplifiedPackage#getDescription_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getDescriptions();

} // Description
