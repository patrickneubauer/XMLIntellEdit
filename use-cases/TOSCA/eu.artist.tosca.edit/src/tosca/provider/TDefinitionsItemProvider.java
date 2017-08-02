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

import tosca.TDefinitions;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * This is the item provider adapter for a {@link tosca.TDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDefinitionsItemProvider extends TExtensibleElementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitionsItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_TDefinitions_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_id_feature", "_UI_TDefinitions_type"),
				 ToscaPackage.Literals.TDEFINITIONS__ID,
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
				 getString("_UI_TDefinitions_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_name_feature", "_UI_TDefinitions_type"),
				 ToscaPackage.Literals.TDEFINITIONS__NAME,
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
				 getString("_UI_TDefinitions_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_targetNamespace_feature", "_UI_TDefinitions_type"),
				 ToscaPackage.Literals.TDEFINITIONS__TARGET_NAMESPACE,
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
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__EXTENSIONS);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__IMPORT);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__TYPES);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__GROUP);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__SERVICE_TEMPLATE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__REQUIREMENT_TYPE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__CAPABILITY_TYPE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TYPE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TEMPLATE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__POLICY_TYPE);
			childrenFeatures.add(ToscaPackage.Literals.TDEFINITIONS__POLICY_TEMPLATE);
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
	 * This returns TDefinitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TDefinitions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TDefinitions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TDefinitions_type") :
			getString("_UI_TDefinitions_type") + " " + label;
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

		switch (notification.getFeatureID(TDefinitions.class)) {
			case ToscaPackage.TDEFINITIONS__ID:
			case ToscaPackage.TDEFINITIONS__NAME:
			case ToscaPackage.TDEFINITIONS__TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToscaPackage.TDEFINITIONS__EXTENSIONS:
			case ToscaPackage.TDEFINITIONS__IMPORT:
			case ToscaPackage.TDEFINITIONS__TYPES:
			case ToscaPackage.TDEFINITIONS__GROUP:
			case ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE:
			case ToscaPackage.TDEFINITIONS__NODE_TYPE:
			case ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
			case ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE:
			case ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE:
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE:
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
			case ToscaPackage.TDEFINITIONS__POLICY_TYPE:
			case ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE:
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
				(ToscaPackage.Literals.TDEFINITIONS__EXTENSIONS,
				 ToscaFactory.eINSTANCE.createExtensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__IMPORT,
				 ToscaFactory.eINSTANCE.createTImport()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__TYPES,
				 ToscaFactory.eINSTANCE.createTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__SERVICE_TEMPLATE,
				 ToscaFactory.eINSTANCE.createTServiceTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE,
				 ToscaFactory.eINSTANCE.createTNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION,
				 ToscaFactory.eINSTANCE.createTNodeTypeImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE,
				 ToscaFactory.eINSTANCE.createTRelationshipType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION,
				 ToscaFactory.eINSTANCE.createTRelationshipTypeImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__REQUIREMENT_TYPE,
				 ToscaFactory.eINSTANCE.createTRequirementType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__CAPABILITY_TYPE,
				 ToscaFactory.eINSTANCE.createTCapabilityType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TYPE,
				 ToscaFactory.eINSTANCE.createTArtifactType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__ARTIFACT_TEMPLATE,
				 ToscaFactory.eINSTANCE.createTArtifactTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__POLICY_TYPE,
				 ToscaFactory.eINSTANCE.createTPolicyType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TDEFINITIONS__POLICY_TEMPLATE,
				 ToscaFactory.eINSTANCE.createTPolicyTemplate()));
	}

}
