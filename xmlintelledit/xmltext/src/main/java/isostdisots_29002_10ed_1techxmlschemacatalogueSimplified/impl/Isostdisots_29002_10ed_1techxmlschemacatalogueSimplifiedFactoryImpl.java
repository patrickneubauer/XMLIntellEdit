/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactoryImpl extends EFactoryImpl implements Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory init() {
		try {
			Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI);
			if (theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory != null) {
				return theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.CATALOGUE: return createCatalogue();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM: return createItem();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE: return createPropertyValue();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValue createPropertyValue() {
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage getIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage() {
		return (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage getPackage() {
		return Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE;
	}

} //Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactoryImpl
