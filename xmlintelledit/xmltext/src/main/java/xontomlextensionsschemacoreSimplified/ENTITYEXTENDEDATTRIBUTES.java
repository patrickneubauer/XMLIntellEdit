/**
 */
package xontomlextensionsschemacoreSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENTITYEXTENDEDATTRIBUTES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEntityRef <em>Entity Ref</em>}</li>
 *   <li>{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEas <em>Eas</em>}</li>
 * </ul>
 *
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getENTITYEXTENDEDATTRIBUTES()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternEntityRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternEntityRef='self.entityRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.entityRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.entityRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface ENTITYEXTENDEDATTRIBUTES extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Ref</em>' attribute.
	 * @see #setEntityRef(String)
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getENTITYEXTENDEDATTRIBUTES_EntityRef()
	 * @model required="true"
	 * @generated
	 */
	String getEntityRef();

	/**
	 * Sets the value of the '{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES#getEntityRef <em>Entity Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Ref</em>' attribute.
	 * @see #getEntityRef()
	 * @generated
	 */
	void setEntityRef(String value);

	/**
	 * Returns the value of the '<em><b>Eas</b></em>' containment reference list.
	 * The list contents are of type {@link xontomlextensionsschemacoreSimplified.EAVALUATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eas</em>' containment reference list.
	 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage#getENTITYEXTENDEDATTRIBUTES_Eas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EAVALUATION> getEas();

} // ENTITYEXTENDEDATTRIBUTES
