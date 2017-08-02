/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYVALUERECOMMENDEDPRESENTATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION#getPropDef <em>Prop Def</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYVALUERECOMMENDEDPRESENTATION()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthRecommendedPresentationFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthRecommendedPresentationFormat='self.recommendedPresentationFormat.size() &lt;= 80'"
 * @generated
 */
public interface PROPERTYVALUERECOMMENDEDPRESENTATION extends EObject {
	/**
	 * Returns the value of the '<em><b>Recommended Presentation Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Presentation Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Presentation Format</em>' attribute.
	 * @see #setRecommendedPresentationFormat(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYVALUERECOMMENDEDPRESENTATION_RecommendedPresentationFormat()
	 * @model required="true"
	 * @generated
	 */
	String getRecommendedPresentationFormat();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Presentation Format</em>' attribute.
	 * @see #getRecommendedPresentationFormat()
	 * @generated
	 */
	void setRecommendedPresentationFormat(String value);

	/**
	 * Returns the value of the '<em><b>Prop Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Def</em>' containment reference.
	 * @see #setPropDef(PROPERTYREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYVALUERECOMMENDEDPRESENTATION_PropDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PROPERTYREFERENCE getPropDef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION#getPropDef <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Def</em>' containment reference.
	 * @see #getPropDef()
	 * @generated
	 */
	void setPropDef(PROPERTYREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Recommended Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Presentation Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Presentation Unit</em>' containment reference.
	 * @see #setRecommendedPresentationUnit(UNIT)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYVALUERECOMMENDEDPRESENTATION_RecommendedPresentationUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UNIT getRecommendedPresentationUnit();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Presentation Unit</em>' containment reference.
	 * @see #getRecommendedPresentationUnit()
	 * @generated
	 */
	void setRecommendedPresentationUnit(UNIT value);

} // PROPERTYVALUERECOMMENDEDPRESENTATION
