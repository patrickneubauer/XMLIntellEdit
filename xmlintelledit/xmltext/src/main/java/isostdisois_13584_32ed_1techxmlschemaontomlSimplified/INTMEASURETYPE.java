/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INTMEASURETYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getUnit <em>Unit</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getAlternativeUnits <em>Alternative Units</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getAlternativeUnitIds <em>Alternative Unit Ids</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTMEASURETYPE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthValueFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthValueFormat='(self.valueFormat = null) or self.valueFormat.size() &lt;= 80'"
 * @generated
 */
public interface INTMEASURETYPE extends ANYTYPE {
	/**
	 * Returns the value of the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Format</em>' attribute.
	 * @see #setValueFormat(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTMEASURETYPE_ValueFormat()
	 * @model
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(DICUNIT)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTMEASURETYPE_Unit()
	 * @model containment="true"
	 * @generated
	 */
	DICUNIT getUnit();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DICUNIT value);

	/**
	 * Returns the value of the '<em><b>Alternative Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Units</em>' containment reference.
	 * @see #setAlternativeUnits(ALTERNATIVEUNITS)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTMEASURETYPE_AlternativeUnits()
	 * @model containment="true"
	 * @generated
	 */
	ALTERNATIVEUNITS getAlternativeUnits();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getAlternativeUnits <em>Alternative Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Units</em>' containment reference.
	 * @see #getAlternativeUnits()
	 * @generated
	 */
	void setAlternativeUnits(ALTERNATIVEUNITS value);

	/**
	 * Returns the value of the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Id</em>' containment reference.
	 * @see #setUnitId(DICUNITREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTMEASURETYPE_UnitId()
	 * @model containment="true"
	 * @generated
	 */
	DICUNITREFERENCE getUnitId();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getUnitId <em>Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Id</em>' containment reference.
	 * @see #getUnitId()
	 * @generated
	 */
	void setUnitId(DICUNITREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Alternative Unit Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Unit Ids</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Unit Ids</em>' containment reference.
	 * @see #setAlternativeUnitIds(DICUNITSREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTMEASURETYPE_AlternativeUnitIds()
	 * @model containment="true"
	 * @generated
	 */
	DICUNITSREFERENCE getAlternativeUnitIds();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE#getAlternativeUnitIds <em>Alternative Unit Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Unit Ids</em>' containment reference.
	 * @see #getAlternativeUnitIds()
	 * @generated
	 */
	void setAlternativeUnitIds(DICUNITSREFERENCE value);

} // INTMEASURETYPE
