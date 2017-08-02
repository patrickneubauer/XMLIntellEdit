/**
 */
package tosca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tosca.TNodeTemplate;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * This is the item provider adapter for a {@link tosca.TNodeTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TNodeTemplateItemProvider extends TEntityTemplateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTemplateItemProvider(AdapterFactory adapterFactory) {
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

			addMaxInstancesPropertyDescriptor(object);
			addMinInstancesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TNodeTemplate_maxInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTemplate_maxInstances_feature", "_UI_TNodeTemplate_type"),
				 ToscaPackage.Literals.TNODE_TEMPLATE__MAX_INSTANCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TNodeTemplate_minInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTemplate_minInstances_feature", "_UI_TNodeTemplate_type"),
				 ToscaPackage.Literals.TNODE_TEMPLATE__MIN_INSTANCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_TNodeTemplate_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTemplate_name_feature", "_UI_TNodeTemplate_type"),
				 ToscaPackage.Literals.TNODE_TEMPLATE__NAME,
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
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TEMPLATE__REQUIREMENTS);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TEMPLATE__CAPABILITIES);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TEMPLATE__POLICIES);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS);
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
	 * This returns TNodeTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TNodeTemplate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TNodeTemplate)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TNodeTemplate_type") :
			getString("_UI_TNodeTemplate_type") + " " + label;
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

		switch (notification.getFeatureID(TNodeTemplate.class)) {
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
			case ToscaPackage.TNODE_TEMPLATE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
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
				(ToscaPackage.Literals.TNODE_TEMPLATE__REQUIREMENTS,
				 ToscaFactory.eINSTANCE.createRequirementsType_TRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TEMPLATE__CAPABILITIES,
				 ToscaFactory.eINSTANCE.createCapabilitiesType_TCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TEMPLATE__POLICIES,
				 ToscaFactory.eINSTANCE.createPoliciesType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS,
				 ToscaFactory.eINSTANCE.createTDeploymentArtifacts()));
	}

}
