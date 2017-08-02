/**
 */
package Library3.util;

import Library3.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Library3.Library3Package
 * @generated
 */
public class Library3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Library3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Library3Package.eINSTANCE;
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
	protected Library3Switch<Adapter> modelSwitch =
		new Library3Switch<Adapter>() {
			@Override
			public Adapter caseBookInfoType(BookInfoType object) {
				return createBookInfoTypeAdapter();
			}
			@Override
			public Adapter caseBookType(BookType object) {
				return createBookTypeAdapter();
			}
			@Override
			public Adapter caseCustomerType(CustomerType object) {
				return createCustomerTypeAdapter();
			}
			@Override
			public Adapter caseLibraryType(LibraryType object) {
				return createLibraryTypeAdapter();
			}
			@Override
			public Adapter caseAnyGenericConstruct(AnyGenericConstruct object) {
				return createAnyGenericConstructAdapter();
			}
			@Override
			public Adapter caseAnyGenericElement(AnyGenericElement object) {
				return createAnyGenericElementAdapter();
			}
			@Override
			public Adapter caseAnyGenericAttribute(AnyGenericAttribute object) {
				return createAnyGenericAttributeAdapter();
			}
			@Override
			public Adapter caseAnyGenericText(AnyGenericText object) {
				return createAnyGenericTextAdapter();
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
	 * Creates a new adapter for an object of class '{@link Library3.BookInfoType <em>Book Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.BookInfoType
	 * @generated
	 */
	public Adapter createBookInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.BookType
	 * @generated
	 */
	public Adapter createBookTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.CustomerType
	 * @generated
	 */
	public Adapter createCustomerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.LibraryType
	 * @generated
	 */
	public Adapter createLibraryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.AnyGenericConstruct <em>Any Generic Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.AnyGenericConstruct
	 * @generated
	 */
	public Adapter createAnyGenericConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.AnyGenericElement <em>Any Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.AnyGenericElement
	 * @generated
	 */
	public Adapter createAnyGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.AnyGenericAttribute <em>Any Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.AnyGenericAttribute
	 * @generated
	 */
	public Adapter createAnyGenericAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Library3.AnyGenericText <em>Any Generic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Library3.AnyGenericText
	 * @generated
	 */
	public Adapter createAnyGenericTextAdapter() {
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

} //Library3AdapterFactory
