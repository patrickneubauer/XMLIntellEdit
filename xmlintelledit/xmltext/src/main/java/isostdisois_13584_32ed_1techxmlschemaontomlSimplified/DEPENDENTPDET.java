/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEPENDENTPDET</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DEPENDENTPDET#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDEPENDENTPDET()
 * @model
 * @generated
 */
public interface DEPENDENTPDET extends PROPERTY {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(PROPERTIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDEPENDENTPDET_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	PROPERTIESREFERENCE getDependsOn();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DEPENDENTPDET#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(PROPERTIESREFERENCE value);

} // DEPENDENTPDET
