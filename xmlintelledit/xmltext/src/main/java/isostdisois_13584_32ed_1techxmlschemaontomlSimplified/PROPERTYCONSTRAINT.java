/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCONSTRAINT#getConstrainedProperty <em>Constrained Property</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYCONSTRAINT()
 * @model
 * @generated
 */
public interface PROPERTYCONSTRAINT extends CONSTRAINT {
	/**
	 * Returns the value of the '<em><b>Constrained Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Property</em>' containment reference.
	 * @see #setConstrainedProperty(PROPERTYREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYCONSTRAINT_ConstrainedProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PROPERTYREFERENCE getConstrainedProperty();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCONSTRAINT#getConstrainedProperty <em>Constrained Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Property</em>' containment reference.
	 * @see #getConstrainedProperty()
	 * @generated
	 */
	void setConstrainedProperty(PROPERTYREFERENCE value);

} // PROPERTYCONSTRAINT
