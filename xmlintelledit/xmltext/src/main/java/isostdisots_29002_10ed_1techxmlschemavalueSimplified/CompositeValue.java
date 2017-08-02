/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getCompositeValue()
 * @model
 * @generated
 */
public interface CompositeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getCompositeValue_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // CompositeValue
