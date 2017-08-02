/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSEXTENSION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getContentRevision <em>Content Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#isTableLike <em>Table Like</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getDictionaryDefinition <em>Dictionary Definition</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getRecommendedPresentation <em>Recommended Presentation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getClassification <em>Classification</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getInstanceIdentification <em>Instance Identification</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternContentVersion maxLengthContentVersion maxLengthContentRevision'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternContentVersion='(self.contentVersion=null) or self.contentVersion.matches(\'[0-9]+\')' maxLengthContentVersion='(self.contentVersion = null) or self.contentVersion.size() &lt;= 9' maxLengthContentRevision='(self.contentRevision = null) or self.contentRevision.size() &lt;= 3'"
 * @generated
 */
public interface CLASSEXTENSION extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Version</em>' attribute.
	 * @see #setContentVersion(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_ContentVersion()
	 * @model
	 * @generated
	 */
	String getContentVersion();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getContentVersion <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Version</em>' attribute.
	 * @see #getContentVersion()
	 * @generated
	 */
	void setContentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Content Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Revision</em>' attribute.
	 * @see #setContentRevision(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_ContentRevision()
	 * @model
	 * @generated
	 */
	String getContentRevision();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getContentRevision <em>Content Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Revision</em>' attribute.
	 * @see #getContentRevision()
	 * @generated
	 */
	void setContentRevision(String value);

	/**
	 * Returns the value of the '<em><b>Table Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Like</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Like</em>' attribute.
	 * @see #setTableLike(boolean)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_TableLike()
	 * @model required="true"
	 * @generated
	 */
	boolean isTableLike();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#isTableLike <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Like</em>' attribute.
	 * @see #isTableLike()
	 * @generated
	 */
	void setTableLike(boolean value);

	/**
	 * Returns the value of the '<em><b>Dictionary Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Definition</em>' containment reference.
	 * @see #setDictionaryDefinition(CLASSREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_DictionaryDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CLASSREFERENCE getDictionaryDefinition();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getDictionaryDefinition <em>Dictionary Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Definition</em>' containment reference.
	 * @see #getDictionaryDefinition()
	 * @generated
	 */
	void setDictionaryDefinition(CLASSREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Recommended Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Presentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Presentation</em>' containment reference.
	 * @see #setRecommendedPresentation(RECOMMENDEDPRESENTATION)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_RecommendedPresentation()
	 * @model containment="true"
	 * @generated
	 */
	RECOMMENDEDPRESENTATION getRecommendedPresentation();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getRecommendedPresentation <em>Recommended Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Presentation</em>' containment reference.
	 * @see #getRecommendedPresentation()
	 * @generated
	 */
	void setRecommendedPresentation(RECOMMENDEDPRESENTATION value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CLASSIFICATION)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_Classification()
	 * @model containment="true"
	 * @generated
	 */
	CLASSIFICATION getClassification();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CLASSIFICATION value);

	/**
	 * Returns the value of the '<em><b>Instance Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Identification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Identification</em>' containment reference.
	 * @see #setInstanceIdentification(PROPERTIESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_InstanceIdentification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PROPERTIESREFERENCE getInstanceIdentification();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getInstanceIdentification <em>Instance Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Identification</em>' containment reference.
	 * @see #getInstanceIdentification()
	 * @generated
	 */
	void setInstanceIdentification(PROPERTIESREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(Catalogue)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSEXTENSION_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Catalogue getPopulation();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(Catalogue value);

} // CLASSEXTENSION
