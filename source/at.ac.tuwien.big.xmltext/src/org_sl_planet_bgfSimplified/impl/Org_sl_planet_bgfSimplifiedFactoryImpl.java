/**
 */
package org_sl_planet_bgfSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org_sl_planet_bgfSimplified.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Org_sl_planet_bgfSimplifiedFactoryImpl extends EFactoryImpl implements Org_sl_planet_bgfSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Org_sl_planet_bgfSimplifiedFactory init() {
		try {
			Org_sl_planet_bgfSimplifiedFactory theOrg_sl_planet_bgfSimplifiedFactory = (Org_sl_planet_bgfSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Org_sl_planet_bgfSimplifiedPackage.eNS_URI);
			if (theOrg_sl_planet_bgfSimplifiedFactory != null) {
				return theOrg_sl_planet_bgfSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Org_sl_planet_bgfSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Org_sl_planet_bgfSimplifiedFactoryImpl() {
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
			case Org_sl_planet_bgfSimplifiedPackage.ALLOF: return createAllof();
			case Org_sl_planet_bgfSimplifiedPackage.ANY: return createAny();
			case Org_sl_planet_bgfSimplifiedPackage.CHOICE: return createChoice();
			case Org_sl_planet_bgfSimplifiedPackage.EMPTY: return createEmpty();
			case Org_sl_planet_bgfSimplifiedPackage.EPSILON: return createEpsilon();
			case Org_sl_planet_bgfSimplifiedPackage.EXPRESSION: return createExpression();
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR: return createGrammar();
			case Org_sl_planet_bgfSimplifiedPackage.MARKED: return createMarked();
			case Org_sl_planet_bgfSimplifiedPackage.NOT: return createNot();
			case Org_sl_planet_bgfSimplifiedPackage.OPTIONAL: return createOptional();
			case Org_sl_planet_bgfSimplifiedPackage.PLUS: return createPlus();
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION: return createProduction();
			case Org_sl_planet_bgfSimplifiedPackage.SELECTABLE: return createSelectable();
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS: return createSeplistplus();
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTSTAR: return createSepliststar();
			case Org_sl_planet_bgfSimplifiedPackage.SEQUENCE: return createSequence();
			case Org_sl_planet_bgfSimplifiedPackage.STAR: return createStar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Org_sl_planet_bgfSimplifiedPackage.VALUE:
				return createValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Org_sl_planet_bgfSimplifiedPackage.VALUE:
				return convertValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allof createAllof() {
		AllofImpl allof = new AllofImpl();
		return allof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epsilon createEpsilon() {
		EpsilonImpl epsilon = new EpsilonImpl();
		return epsilon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marked createMarked() {
		MarkedImpl marked = new MarkedImpl();
		return marked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Production createProduction() {
		ProductionImpl production = new ProductionImpl();
		return production;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selectable createSelectable() {
		SelectableImpl selectable = new SelectableImpl();
		return selectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seplistplus createSeplistplus() {
		SeplistplusImpl seplistplus = new SeplistplusImpl();
		return seplistplus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sepliststar createSepliststar() {
		SepliststarImpl sepliststar = new SepliststarImpl();
		return sepliststar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Star createStar() {
		StarImpl star = new StarImpl();
		return star;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValueFromString(EDataType eDataType, String initialValue) {
		Value result = Value.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Org_sl_planet_bgfSimplifiedPackage getOrg_sl_planet_bgfSimplifiedPackage() {
		return (Org_sl_planet_bgfSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Org_sl_planet_bgfSimplifiedPackage getPackage() {
		return Org_sl_planet_bgfSimplifiedPackage.eINSTANCE;
	}

} //Org_sl_planet_bgfSimplifiedFactoryImpl
