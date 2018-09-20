/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getLabel <em>Label</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getDescription <em>Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getCategory <em>Category</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getRepresentationProperty <em>Representation Property</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getExtensible <em>Extensible</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getId <em>Id</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#isListed <em>Listed</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getSupportedBridgeTypeRefs <em>Supported Bridge Type Refs</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannels <em>Channels</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannelGroups <em>Channel Groups</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescription <em>Config Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescriptionRef <em>Config Description Ref</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternExtensible patternId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternExtensible='(self.extensible=null) or self.extensible.matches(\'[A-Za-z0-9\\\\-_.]+(,( )?[A-Za-z0-9\\\\-_.]+)*\')' patternId='self.id.matches(\'[A-Za-z0-9\\\\-_]+\')'"
 * @generated
 */
public interface ThingType extends EObject {
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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getLabel <em>Label</em>}' attribute.
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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getDescription <em>Description</em>}' attribute.
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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Representation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Property</em>' attribute.
	 * @see #setRepresentationProperty(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_RepresentationProperty()
	 * @model
	 * @generated
	 */
	String getRepresentationProperty();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getRepresentationProperty <em>Representation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Property</em>' attribute.
	 * @see #getRepresentationProperty()
	 * @generated
	 */
	void setRepresentationProperty(String value);

	/**
	 * Returns the value of the '<em><b>Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensible</em>' attribute.
	 * @see #setExtensible(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Extensible()
	 * @model
	 * @generated
	 */
	String getExtensible();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getExtensible <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensible</em>' attribute.
	 * @see #getExtensible()
	 * @generated
	 */
	void setExtensible(String value);

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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Listed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listed</em>' attribute.
	 * @see #setListed(boolean)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Listed()
	 * @model
	 * @generated
	 */
	boolean isListed();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#isListed <em>Listed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listed</em>' attribute.
	 * @see #isListed()
	 * @generated
	 */
	void setListed(boolean value);

	/**
	 * Returns the value of the '<em><b>Supported Bridge Type Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Bridge Type Refs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Bridge Type Refs</em>' containment reference.
	 * @see #setSupportedBridgeTypeRefs(SupportedBridgeTypeRefs)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_SupportedBridgeTypeRefs()
	 * @model containment="true"
	 * @generated
	 */
	SupportedBridgeTypeRefs getSupportedBridgeTypeRefs();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getSupportedBridgeTypeRefs <em>Supported Bridge Type Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Bridge Type Refs</em>' containment reference.
	 * @see #getSupportedBridgeTypeRefs()
	 * @generated
	 */
	void setSupportedBridgeTypeRefs(SupportedBridgeTypeRefs value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference.
	 * @see #setChannels(Channels)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Channels()
	 * @model containment="true"
	 * @generated
	 */
	Channels getChannels();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannels <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels</em>' containment reference.
	 * @see #getChannels()
	 * @generated
	 */
	void setChannels(Channels value);

	/**
	 * Returns the value of the '<em><b>Channel Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Groups</em>' containment reference.
	 * @see #setChannelGroups(ChannelGroups)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_ChannelGroups()
	 * @model containment="true"
	 * @generated
	 */
	ChannelGroups getChannelGroups();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannelGroups <em>Channel Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Groups</em>' containment reference.
	 * @see #getChannelGroups()
	 * @generated
	 */
	void setChannelGroups(ChannelGroups value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_Properties()
	 * @model containment="true"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_ConfigDescription()
	 * @model containment="true"
	 * @generated
	 */
	ConfigDescription getConfigDescription();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescription <em>Config Description</em>}' containment reference.
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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingType_ConfigDescriptionRef()
	 * @model containment="true"
	 * @generated
	 */
	ConfigDescriptionRef getConfigDescriptionRef();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescriptionRef <em>Config Description Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Description Ref</em>' containment reference.
	 * @see #getConfigDescriptionRef()
	 * @generated
	 */
	void setConfigDescriptionRef(ConfigDescriptionRef value);

} // ThingType
