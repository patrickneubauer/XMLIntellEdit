/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getKind <em>Kind</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getLabel <em>Label</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getDescription <em>Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getCategory <em>Category</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isAdvanced <em>Advanced</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getId <em>Id</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isSystem <em>System</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getTags <em>Tags</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getState <em>State</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getEvent <em>Event</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescription <em>Config Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescriptionRef <em>Config Description Ref</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternId='self.id.matches(\'[A-Za-z0-9\\\\-_]+\')'"
 * @generated
 */
public interface ChannelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_ItemType()
	 * @model
	 * @generated
	 */
	String getItemType();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advanced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advanced</em>' attribute.
	 * @see #setAdvanced(boolean)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Advanced()
	 * @model
	 * @generated
	 */
	boolean isAdvanced();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isAdvanced <em>Advanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advanced</em>' attribute.
	 * @see #isAdvanced()
	 * @generated
	 */
	void setAdvanced(boolean value);

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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(boolean)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_System()
	 * @model
	 * @generated
	 */
	boolean isSystem();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #isSystem()
	 * @generated
	 */
	void setSystem(boolean value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(Tags)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Tags()
	 * @model containment="true"
	 * @generated
	 */
	Tags getTags();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(Tags value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(State)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_State()
	 * @model containment="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_Event()
	 * @model containment="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Config Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Description</em>' containment reference.
	 * @see #setConfigDescription(ConfigDescription)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_ConfigDescription()
	 * @model containment="true"
	 * @generated
	 */
	ConfigDescription getConfigDescription();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescription <em>Config Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Description</em>' containment reference.
	 * @see #getConfigDescription()
	 * @generated
	 */
	void setConfigDescription(ConfigDescription value);

	/**
	 * Returns the value of the '<em><b>Config Description Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Description Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Description Ref</em>' containment reference.
	 * @see #setConfigDescriptionRef(ConfigDescriptionRef)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelType_ConfigDescriptionRef()
	 * @model containment="true"
	 * @generated
	 */
	ConfigDescriptionRef getConfigDescriptionRef();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescriptionRef <em>Config Description Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Description Ref</em>' containment reference.
	 * @see #getConfigDescriptionRef()
	 * @generated
	 */
	void setConfigDescriptionRef(ConfigDescriptionRef value);

} // ChannelType
