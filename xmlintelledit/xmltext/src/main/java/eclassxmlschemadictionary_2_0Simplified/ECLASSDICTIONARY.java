/**
 */
package eclassxmlschemadictionary_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

import eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ONTOML;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECLASSDICTIONARY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getHeader <em>Header</em>}</li>
 *   <li>{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getOntoml <em>Ontoml</em>}</li>
 *   <li>{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage#getECLASSDICTIONARY()
 * @model
 * @generated
 */
public interface ECLASSDICTIONARY extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(DOCUMENTHEADER)
	 * @see eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage#getECLASSDICTIONARY_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DOCUMENTHEADER getHeader();

	/**
	 * Sets the value of the '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(DOCUMENTHEADER value);

	/**
	 * Returns the value of the '<em><b>Ontoml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontoml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontoml</em>' containment reference.
	 * @see #setOntoml(ONTOML)
	 * @see eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage#getECLASSDICTIONARY_Ontoml()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ONTOML getOntoml();

	/**
	 * Sets the value of the '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getOntoml <em>Ontoml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontoml</em>' containment reference.
	 * @see #getOntoml()
	 * @generated
	 */
	void setOntoml(ONTOML value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(EXTENSIONS)
	 * @see eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage#getECLASSDICTIONARY_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EXTENSIONS getExtensions();

	/**
	 * Sets the value of the '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(EXTENSIONS value);

} // ECLASSDICTIONARY
