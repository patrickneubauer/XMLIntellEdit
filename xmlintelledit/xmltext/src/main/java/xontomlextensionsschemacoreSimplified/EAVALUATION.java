/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAVALUATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.EAVALUATION#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEAVALUATION()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthTemplateId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthTemplateId='self.templateId.size() &lt;= 100'"
 * @generated
 */
public interface EAVALUATION extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' attribute.
	 * @see #setTemplateId(String)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getEAVALUATION_TemplateId()
	 * @model required="true"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.EAVALUATION#getTemplateId <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Id</em>' attribute.
	 * @see #getTemplateId()
	 * @generated
	 */
	void setTemplateId(String value);

} // EAVALUATION
