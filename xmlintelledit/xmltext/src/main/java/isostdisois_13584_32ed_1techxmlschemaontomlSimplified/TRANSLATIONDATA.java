/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRANSLATIONDATA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getTranslationRevision <em>Translation Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getLanguage <em>Language</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getResponsibleTranslator <em>Responsible Translator</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATIONDATA()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthTranslationRevision'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthTranslationRevision='self.translationRevision.size() &lt;= 3'"
 * @generated
 */
public interface TRANSLATIONDATA extends EObject {
	/**
	 * Returns the value of the '<em><b>Translation Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Revision</em>' attribute.
	 * @see #setTranslationRevision(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATIONDATA_TranslationRevision()
	 * @model required="true"
	 * @generated
	 */
	String getTranslationRevision();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getTranslationRevision <em>Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Revision</em>' attribute.
	 * @see #getTranslationRevision()
	 * @generated
	 */
	void setTranslationRevision(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Current Translation Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Current Translation Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Current Translation Revision</em>' attribute.
	 * @see #setDateOfCurrentTranslationRevision(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATIONDATA_DateOfCurrentTranslationRevision()
	 * @model
	 * @generated
	 */
	String getDateOfCurrentTranslationRevision();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Current Translation Revision</em>' attribute.
	 * @see #getDateOfCurrentTranslationRevision()
	 * @generated
	 */
	void setDateOfCurrentTranslationRevision(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LANGUAGE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATIONDATA_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LANGUAGE getLanguage();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LANGUAGE value);

	/**
	 * Returns the value of the '<em><b>Responsible Translator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Translator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Translator</em>' containment reference.
	 * @see #setResponsibleTranslator(SUPPLIERREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATIONDATA_ResponsibleTranslator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SUPPLIERREFERENCE getResponsibleTranslator();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA#getResponsibleTranslator <em>Responsible Translator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Translator</em>' containment reference.
	 * @see #getResponsibleTranslator()
	 * @generated
	 */
	void setResponsibleTranslator(SUPPLIERREFERENCE value);

} // TRANSLATIONDATA
