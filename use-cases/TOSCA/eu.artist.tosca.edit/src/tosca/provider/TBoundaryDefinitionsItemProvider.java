/**
 */
package tosca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tosca.TBoundaryDefinitions;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * This is the item provider adapter for a {@link tosca.TBoundaryDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TBoundaryDefinitionsItemProvider 
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
	public TBoundaryDefinitionsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTIES);
			childrenFeatures.add(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS);
			childrenFeatures.add(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__REQUIREMENTS);
			childrenFeatures.add(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__CAPABILITIES);
			childrenFeatures.add(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__POLICIES);
			childrenFeatures.add(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__INTERFACES);
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
	 * This returns TBoundaryDefinitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TBoundaryDefinitions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TBoundaryDefinitions_type");
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

		switch (notification.getFeatureID(TBoundaryDefinitions.class)) {
			case ToscaPackage.TBOUNDARY_DEFINITIONS__PROPERTIES:
			case ToscaPackage.TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS:
			case ToscaPackage.TBOUNDARY_DEFINITIONS__REQUIREMENTS:
			case ToscaPackage.TBOUNDARY_DEFINITIONS__CAPABILITIES:
			case ToscaPackage.TBOUNDARY_DEFINITIONS__POLICIES:
			case ToscaPackage.TBOUNDARY_DEFINITIONS__INTERFACES:
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
				(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTIES,
				 ToscaFactory.eINSTANCE.createPropertiesTypeWithPropertyMappings()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS,
				 ToscaFactory.eINSTANCE.createPropertyConstraintsType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__REQUIREMENTS,
				 ToscaFactory.eINSTANCE.createRequirementsType_TRequirementRef()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__CAPABILITIES,
				 ToscaFactory.eINSTANCE.createCapabilitiesType_CapabilityRef()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__POLICIES,
				 ToscaFactory.eINSTANCE.createPoliciesType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TBOUNDARY_DEFINITIONS__INTERFACES,
				 ToscaFactory.eINSTANCE.createInterfacesType_TExportedInterface()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TOSCAv1EditPlugin.INSTANCE;
	}

}
