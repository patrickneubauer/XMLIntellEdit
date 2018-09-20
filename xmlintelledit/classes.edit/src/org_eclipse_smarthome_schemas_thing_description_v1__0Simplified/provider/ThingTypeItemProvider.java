/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * This is the item provider adapter for a {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLabelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addRepresentationPropertyPropertyDescriptor(object);
			addExtensiblePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addListedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_label_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_description_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_category_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Representation Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentationPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_representationProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_representationProperty_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__REPRESENTATION_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extensible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_extensible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_extensible_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__EXTENSIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_id_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Listed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThingType_listed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThingType_listed_feature", "_UI_ThingType_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__LISTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CHANNELS);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CHANNEL_GROUPS);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__PROPERTIES);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CONFIG_DESCRIPTION);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CONFIG_DESCRIPTION_REF);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ThingType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ThingType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ThingType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ThingType_type") :
			getString("_UI_ThingType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ThingType.class)) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LABEL:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__DESCRIPTION:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CATEGORY:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__REPRESENTATION_PROPERTY:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__EXTENSIBLE:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__ID:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LISTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createSupportedBridgeTypeRefs()));

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CHANNELS,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createChannels()));

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CHANNEL_GROUPS,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createChannelGroups()));

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__PROPERTIES,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CONFIG_DESCRIPTION,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createConfigDescription()));

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE__CONFIG_DESCRIPTION_REF,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createConfigDescriptionRef()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedEditPlugin.INSTANCE;
	}

}
