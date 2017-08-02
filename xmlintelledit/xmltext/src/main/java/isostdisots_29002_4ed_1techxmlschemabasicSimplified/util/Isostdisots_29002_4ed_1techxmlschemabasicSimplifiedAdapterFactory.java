/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eINSTANCE;
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
	protected Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedSwitch<Adapter> modelSwitch =
		new Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseInternationalText(InternationalText object) {
				return createInternationalTextAdapter();
			}
			@Override
			public Adapter caseLanguageString(LanguageString object) {
				return createLanguageStringAdapter();
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
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText <em>International Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText
	 * @generated
	 */
	public Adapter createInternationalTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString <em>Language String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString
	 * @generated
	 */
	public Adapter createLanguageStringAdapter() {
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

} //Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedAdapterFactory
