/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYCLASSIFICATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION#getPropDef <em>Prop Def</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYCLASSIFICATION()
 * @model
 * @generated
 */
public interface PROPERTYCLASSIFICATION extends EObject {
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getPROPERTYCLASSIFICATION_PropDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PROPERTYREFERENCE getPropDef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION#getPropDef <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Def</em>' containment reference.
	 * @see #getPropDef()
	 * @generated
	 */
	void setPropDef(PROPERTYREFERENCE value);

} // PROPERTYCLASSIFICATION
