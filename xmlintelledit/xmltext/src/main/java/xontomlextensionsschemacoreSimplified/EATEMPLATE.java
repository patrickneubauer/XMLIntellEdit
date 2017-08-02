/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.ecore.EObject;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ANYTYPE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAME;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAME;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EATEMPLATE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfEntity <em>Type Of Entity</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getCode <em>Code</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getId <em>Id</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfValue <em>Type Of Value</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getShortName <em>Short Name</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getPreferredName <em>Preferred Name</em>}</li>
 * </ul>
 *
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthCode maxLengthId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthCode='(self.code = null) or self.code.size() &lt;= 100' maxLengthId='self.id.size() &lt;= 100'"
 * @generated
 */
public interface EATEMPLATE extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Of Entity</b></em>' attribute.
	 * The literals are from the enumeration {@link xontomlextensionsschemacoreSimplified.EAENTITYTYPEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Entity</em>' attribute.
	 * @see xontomlextensionsschemacoreSimplified.EAENTITYTYPEType
	 * @see #setTypeOfEntity(EAENTITYTYPEType)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_TypeOfEntity()
	 * @model required="true"
	 * @generated
	 */
	EAENTITYTYPEType getTypeOfEntity();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfEntity <em>Type Of Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Entity</em>' attribute.
	 * @see xontomlextensionsschemacoreSimplified.EAENTITYTYPEType
	 * @see #getTypeOfEntity()
	 * @generated
	 */
	void setTypeOfEntity(EAENTITYTYPEType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type Of Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Value</em>' containment reference.
	 * @see #setTypeOfValue(ANYTYPE)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_TypeOfValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ANYTYPE getTypeOfValue();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getTypeOfValue <em>Type Of Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Value</em>' containment reference.
	 * @see #getTypeOfValue()
	 * @generated
	 */
	void setTypeOfValue(ANYTYPE value);

	/**
	 * Returns the value of the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Language</em>' containment reference.
	 * @see #setSourceLanguage(LANGUAGE)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_SourceLanguage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LANGUAGE getSourceLanguage();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getSourceLanguage <em>Source Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Language</em>' containment reference.
	 * @see #getSourceLanguage()
	 * @generated
	 */
	void setSourceLanguage(LANGUAGE value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' containment reference.
	 * @see #setShortName(SHORTNAME)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_ShortName()
	 * @model containment="true"
	 * @generated
	 */
	SHORTNAME getShortName();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getShortName <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' containment reference.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(SHORTNAME value);

	/**
	 * Returns the value of the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Name</em>' containment reference.
	 * @see #setPreferredName(PREFERREDNAME)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEATEMPLATE_PreferredName()
	 * @model containment="true"
	 * @generated
	 */
	PREFERREDNAME getPreferredName();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE#getPreferredName <em>Preferred Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Name</em>' containment reference.
	 * @see #getPreferredName()
	 * @generated
	 */
	void setPreferredName(PREFERREDNAME value);

} // EATEMPLATE
