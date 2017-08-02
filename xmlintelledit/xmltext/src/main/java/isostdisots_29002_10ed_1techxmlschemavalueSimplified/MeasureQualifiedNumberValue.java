/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Qualified Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue#getQualifiedValues <em>Qualified Values</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureQualifiedNumberValue()
 * @model
 * @generated
 */
public interface MeasureQualifiedNumberValue extends MeasureValue {
	/**
	 * Returns the value of the '<em><b>Qualified Values</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Values</em>' containment reference list.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureQualifiedNumberValue_QualifiedValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QualifiedValue> getQualifiedValues();

} // MeasureQualifiedNumberValue
