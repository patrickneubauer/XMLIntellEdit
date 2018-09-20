/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage
 * @generated
 */
public class org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedSwitch<Adapter> modelSwitch =
		new org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseConfigDescription(ConfigDescription object) {
				return createConfigDescriptionAdapter();
			}
			@Override
			public Adapter caseConfigDescriptionRef(ConfigDescriptionRef object) {
				return createConfigDescriptionRefAdapter();
			}
			@Override
			public Adapter caseConfigDescriptions(ConfigDescriptions object) {
				return createConfigDescriptionsAdapter();
			}
			@Override
			public Adapter caseCriteria(Criteria object) {
				return createCriteriaAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseOptions(Options object) {
				return createOptionsAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterGroup(ParameterGroup object) {
				return createParameterGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription <em>Config Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription
	 * @generated
	 */
	public Adapter createConfigDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef <em>Config Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef
	 * @generated
	 */
	public Adapter createConfigDescriptionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions <em>Config Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions
	 * @generated
	 */
	public Adapter createConfigDescriptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria
	 * @generated
	 */
	public Adapter createCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup
	 * @generated
	 */
	public Adapter createParameterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedAdapterFactory
