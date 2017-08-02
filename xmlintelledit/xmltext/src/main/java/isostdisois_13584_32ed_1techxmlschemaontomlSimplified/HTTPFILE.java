/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTPFILE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getHttpFile <em>Http File</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getFileName <em>File Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getDirName <em>Dir Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getHTTPFILE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternFileName maxLengthFileName patternDirName maxLengthDirName patternCountryCode patternLanguageCode minLengthLanguageCode maxLengthLanguageCode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternFileName='(self.fileName=null) or self.fileName.matches(\'[^\\\\s]*\')' maxLengthFileName='(self.fileName = null) or self.fileName.size() &lt;= 128' patternDirName='(self.dirName=null) or self.dirName.matches(\'[^\\\\s]*\')' maxLengthDirName='(self.dirName = null) or self.dirName.size() &lt;= 128' patternCountryCode='(self.countryCode=null) or self.countryCode.matches(\'[^\\\\-]*\') or self.countryCode.matches(\'[^\\\\s]*\')' patternLanguageCode='(self.languageCode=null) or self.languageCode.matches(\'[^\\\\-]*\') or self.languageCode.matches(\'[^\\\\s]*\')' minLengthLanguageCode='(self.languageCode = null) or self.languageCode.size() &gt;= 2' maxLengthLanguageCode='(self.languageCode = null) or self.languageCode.size() &lt;= 3'"
 * @generated
 */
public interface HTTPFILE extends EObject {
	/**
	 * Returns the value of the '<em><b>Http File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http File</em>' attribute.
	 * @see #setHttpFile(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getHTTPFILE_HttpFile()
	 * @model required="true"
	 *        annotation="http://big.tuwien.ac.at/standardXMLDatatype type='URI'"
	 * @generated
	 */
	String getHttpFile();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getHttpFile <em>Http File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http File</em>' attribute.
	 * @see #getHttpFile()
	 * @generated
	 */
	void setHttpFile(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getHTTPFILE_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Dir Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Name</em>' attribute.
	 * @see #setDirName(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getHTTPFILE_DirName()
	 * @model
	 * @generated
	 */
	String getDirName();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getDirName <em>Dir Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Name</em>' attribute.
	 * @see #getDirName()
	 * @generated
	 */
	void setDirName(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getHTTPFILE_CountryCode()
	 * @model
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' attribute.
	 * @see #setLanguageCode(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getHTTPFILE_LanguageCode()
	 * @model
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

} // HTTPFILE
