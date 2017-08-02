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

import tosca.TNodeTypeImplementation;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * This is the item provider adapter for a {@link tosca.TNodeTypeImplementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TNodeTypeImplementationItemProvider extends TExtensibleElementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTypeImplementationItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodeTypePropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TNodeTypeImplementation_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTypeImplementation_abstract_feature", "_UI_TNodeTypeImplementation_type"),
				 ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TNodeTypeImplementation_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTypeImplementation_final_feature", "_UI_TNodeTypeImplementation_type"),
				 ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_TNodeTypeImplementation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTypeImplementation_name_feature", "_UI_TNodeTypeImplementation_type"),
				 ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TNodeTypeImplementation_nodeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTypeImplementation_nodeType_feature", "_UI_TNodeTypeImplementation_type"),
				 ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TNodeTypeImplementation_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TNodeTypeImplementation_targetNamespace_feature", "_UI_TNodeTypeImplementation_type"),
				 ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE,
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
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__TAGS);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS);
			childrenFeatures.add(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS);
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
	 * This returns TNodeTypeImplementation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TNodeTypeImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TNodeTypeImplementation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TNodeTypeImplementation_type") :
			getString("_UI_TNodeTypeImplementation_type") + " " + label;
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

		switch (notification.getFeatureID(TNodeTypeImplementation.class)) {
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NAME:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS:
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS:
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
				(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__TAGS,
				 ToscaFactory.eINSTANCE.createTTags()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM,
				 ToscaFactory.eINSTANCE.createDerivedFromType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES,
				 ToscaFactory.eINSTANCE.createTRequiredContainerFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS,
				 ToscaFactory.eINSTANCE.createTImplementationArtifacts()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS,
				 ToscaFactory.eINSTANCE.createTDeploymentArtifacts()));
	}

}
