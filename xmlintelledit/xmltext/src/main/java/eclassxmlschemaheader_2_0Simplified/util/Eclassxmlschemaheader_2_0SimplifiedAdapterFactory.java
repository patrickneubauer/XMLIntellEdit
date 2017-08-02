/**
 */
package eclassxmlschemaheader_2_0Simplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.MESSAGE;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage
 * @generated
 */
public class Eclassxmlschemaheader_2_0SimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eclassxmlschemaheader_2_0SimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemaheader_2_0SimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Eclassxmlschemaheader_2_0SimplifiedPackage.eINSTANCE;
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
	protected Eclassxmlschemaheader_2_0SimplifiedSwitch<Adapter> modelSwitch =
		new Eclassxmlschemaheader_2_0SimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseDOCUMENTHEADER(DOCUMENTHEADER object) {
				return createDOCUMENTHEADERAdapter();
			}
			@Override
			public Adapter caseMESSAGE(MESSAGE object) {
				return createMESSAGEAdapter();
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
	 * Creates a new adapter for an object of class '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER <em>DOCUMENTHEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER
	 * @generated
	 */
	public Adapter createDOCUMENTHEADERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE <em>MESSAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclassxmlschemaheader_2_0Simplified.MESSAGE
	 * @generated
	 */
	public Adapter createMESSAGEAdapter() {
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

} //Eclassxmlschemaheader_2_0SimplifiedAdapterFactory
