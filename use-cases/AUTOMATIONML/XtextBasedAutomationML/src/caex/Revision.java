/**
 */
package caex;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.Revision#getRevisionDate <em>Revision Date</em>}</li>
 *   <li>{@link caex.Revision#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link caex.Revision#getNewVersion <em>New Version</em>}</li>
 *   <li>{@link caex.Revision#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link caex.Revision#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Date</em>' attribute.
	 * @see #setRevisionDate(XMLGregorianCalendar)
	 * @see caex.CaexPackage#getRevision_RevisionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 * @generated
	 */
	XMLGregorianCalendar getRevisionDate();

	/**
	 * Sets the value of the '{@link caex.Revision#getRevisionDate <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Date</em>' attribute.
	 * @see #getRevisionDate()
	 * @generated
	 */
	void setRevisionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version</em>' attribute.
	 * @see #setOldVersion(String)
	 * @see caex.CaexPackage#getRevision_OldVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOldVersion();

	/**
	 * Sets the value of the '{@link caex.Revision#getOldVersion <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Version</em>' attribute.
	 * @see #getOldVersion()
	 * @generated
	 */
	void setOldVersion(String value);

	/**
	 * Returns the value of the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Version</em>' attribute.
	 * @see #setNewVersion(String)
	 * @see caex.CaexPackage#getRevision_NewVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNewVersion();

	/**
	 * Sets the value of the '{@link caex.Revision#getNewVersion <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Version</em>' attribute.
	 * @see #getNewVersion()
	 * @generated
	 */
	void setNewVersion(String value);

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' attribute.
	 * @see #setAuthorName(String)
	 * @see caex.CaexPackage#getRevision_AuthorName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getAuthorName();

	/**
	 * Sets the value of the '{@link caex.Revision#getAuthorName <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name</em>' attribute.
	 * @see #getAuthorName()
	 * @generated
	 */
	void setAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see caex.CaexPackage#getRevision_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link caex.Revision#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Revision
