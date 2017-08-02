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

import tosca.TPlan;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * This is the item provider adapter for a {@link tosca.TPlan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TPlanItemProvider extends TExtensibleElementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlanItemProvider(AdapterFactory adapterFactory) {
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
			addPlanLanguagePropertyDescriptor(object);
			addPlanTypePropertyDescriptor(object);
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
				 getString("_UI_TPlan_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TPlan_id_feature", "_UI_TPlan_type"),
				 ToscaPackage.Literals.TPLAN__ID,
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
				 getString("_UI_TPlan_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TPlan_name_feature", "_UI_TPlan_type"),
				 ToscaPackage.Literals.TPLAN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plan Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TPlan_planLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TPlan_planLanguage_feature", "_UI_TPlan_type"),
				 ToscaPackage.Literals.TPLAN__PLAN_LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plan Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TPlan_planType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TPlan_planType_feature", "_UI_TPlan_type"),
				 ToscaPackage.Literals.TPLAN__PLAN_TYPE,
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
			childrenFeatures.add(ToscaPackage.Literals.TPLAN__PRECONDITION);
			childrenFeatures.add(ToscaPackage.Literals.TPLAN__INPUT_PARAMETERS);
			childrenFeatures.add(ToscaPackage.Literals.TPLAN__OUTPUT_PARAMETERS);
			childrenFeatures.add(ToscaPackage.Literals.TPLAN__PLAN_MODEL);
			childrenFeatures.add(ToscaPackage.Literals.TPLAN__PLAN_MODEL_REFERENCE);
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
	 * This returns TPlan.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TPlan"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TPlan)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TPlan_type") :
			getString("_UI_TPlan_type") + " " + label;
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

		switch (notification.getFeatureID(TPlan.class)) {
			case ToscaPackage.TPLAN__ID:
			case ToscaPackage.TPLAN__NAME:
			case ToscaPackage.TPLAN__PLAN_LANGUAGE:
			case ToscaPackage.TPLAN__PLAN_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToscaPackage.TPLAN__PRECONDITION:
			case ToscaPackage.TPLAN__INPUT_PARAMETERS:
			case ToscaPackage.TPLAN__OUTPUT_PARAMETERS:
			case ToscaPackage.TPLAN__PLAN_MODEL:
			case ToscaPackage.TPLAN__PLAN_MODEL_REFERENCE:
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
				(ToscaPackage.Literals.TPLAN__PRECONDITION,
				 ToscaFactory.eINSTANCE.createTCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TPLAN__INPUT_PARAMETERS,
				 ToscaFactory.eINSTANCE.createInputParametersType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TPLAN__OUTPUT_PARAMETERS,
				 ToscaFactory.eINSTANCE.createOutputParametersType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TPLAN__PLAN_MODEL,
				 ToscaFactory.eINSTANCE.createPlanModelType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TPLAN__PLAN_MODEL_REFERENCE,
				 ToscaFactory.eINSTANCE.createPlanModelReferenceType()));
	}

}
