/**
 */
package xontomlextensionsschemacoreSimplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES;
import xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES;
import xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION;
import xontomlextensionsschemacoreSimplified.DEPRECATION;
import xontomlextensionsschemacoreSimplified.EAREFERENCE;
import xontomlextensionsschemacoreSimplified.EATEMPLATE;
import xontomlextensionsschemacoreSimplified.EAVALUATION;
import xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage
 * @generated
 */
public class XontomlextensionsschemacoreSimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XontomlextensionsschemacoreSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XontomlextensionsschemacoreSimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE;
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
	protected XontomlextensionsschemacoreSimplifiedSwitch<Adapter> modelSwitch =
		new XontomlextensionsschemacoreSimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseCONTAINEDEAINSTANCES(CONTAINEDEAINSTANCES object) {
				return createCONTAINEDEAINSTANCESAdapter();
			}
			@Override
			public Adapter caseCONTAINEDEATEMPLATES(CONTAINEDEATEMPLATES object) {
				return createCONTAINEDEATEMPLATESAdapter();
			}
			@Override
			public Adapter caseCONTAINEDRELATIONDEPRECATION(CONTAINEDRELATIONDEPRECATION object) {
				return createCONTAINEDRELATIONDEPRECATIONAdapter();
			}
			@Override
			public Adapter caseDEPRECATION(DEPRECATION object) {
				return createDEPRECATIONAdapter();
			}
			@Override
			public Adapter caseEAREFERENCE(EAREFERENCE object) {
				return createEAREFERENCEAdapter();
			}
			@Override
			public Adapter caseEATEMPLATE(EATEMPLATE object) {
				return createEATEMPLATEAdapter();
			}
			@Override
			public Adapter caseEAVALUATION(EAVALUATION object) {
				return createEAVALUATIONAdapter();
			}
			@Override
			public Adapter caseENTITYEXTENDEDATTRIBUTES(ENTITYEXTENDEDATTRIBUTES object) {
				return createENTITYEXTENDEDATTRIBUTESAdapter();
			}
			@Override
			public Adapter caseEXTENSIONS(EXTENSIONS object) {
				return createEXTENSIONSAdapter();
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
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES <em>CONTAINEDEAINSTANCES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES
	 * @generated
	 */
	public Adapter createCONTAINEDEAINSTANCESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES <em>CONTAINEDEATEMPLATES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES
	 * @generated
	 */
	public Adapter createCONTAINEDEATEMPLATESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION <em>CONTAINEDRELATIONDEPRECATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION
	 * @generated
	 */
	public Adapter createCONTAINEDRELATIONDEPRECATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.DEPRECATION <em>DEPRECATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.DEPRECATION
	 * @generated
	 */
	public Adapter createDEPRECATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.EAREFERENCE <em>EAREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.EAREFERENCE
	 * @generated
	 */
	public Adapter createEAREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.EATEMPLATE <em>EATEMPLATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.EATEMPLATE
	 * @generated
	 */
	public Adapter createEATEMPLATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.EAVALUATION <em>EAVALUATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.EAVALUATION
	 * @generated
	 */
	public Adapter createEAVALUATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES <em>ENTITYEXTENDEDATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES
	 * @generated
	 */
	public Adapter createENTITYEXTENDEDATTRIBUTESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xontomlextensionsschemacoreSimplified.EXTENSIONS <em>EXTENSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xontomlextensionsschemacoreSimplified.EXTENSIONS
	 * @generated
	 */
	public Adapter createEXTENSIONSAdapter() {
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

} //XontomlextensionsschemacoreSimplifiedAdapterFactory
