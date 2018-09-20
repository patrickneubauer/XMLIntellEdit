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

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * This is the item provider adapter for a {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider 
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
	public ParameterItemProvider(AdapterFactory adapterFactory) {
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

			addContextPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addLimitToOptionsPropertyDescriptor(object);
			addAdvancedPropertyDescriptor(object);
			addVerifyPropertyDescriptor(object);
			addUnitLabelPropertyDescriptor(object);
			addGroupNamePropertyDescriptor(object);
			addMultiplePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPatternPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addRequired1PropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_context_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_context_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_required_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_default_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Parameter_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_label_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__LABEL,
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
				 getString("_UI_Parameter_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_description_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Limit To Options feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitToOptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_limitToOptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_limitToOptions_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__LIMIT_TO_OPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advanced feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_advanced_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_advanced_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__ADVANCED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Verify feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerifyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_verify_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_verify_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__VERIFY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_unitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_unitLabel_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__UNIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_groupName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_groupName_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__GROUP_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_multiple_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_multiple_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__MULTIPLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_name_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_pattern_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_readOnly_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequired1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_required1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_required1_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__REQUIRED1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_type_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_unit_feature", "_UI_Parameter_type"),
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__OPTIONS);
			childrenFeatures.add(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__FILTER);
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
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Parameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Parameter_type") :
			getString("_UI_Parameter_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter.class)) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__CONTEXT:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DEFAULT:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LABEL:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__DESCRIPTION:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__LIMIT_TO_OPTIONS:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__ADVANCED:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__VERIFY:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT_LABEL:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__GROUP_NAME:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__MULTIPLE:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__NAME:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__PATTERN:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__READ_ONLY:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__REQUIRED1:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__TYPE:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__OPTIONS:
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER__FILTER:
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
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__OPTIONS,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createOptionsType()));

		newChildDescriptors.add
			(createChildParameter
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.PARAMETER__FILTER,
				 org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE.createFilterType()));
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
