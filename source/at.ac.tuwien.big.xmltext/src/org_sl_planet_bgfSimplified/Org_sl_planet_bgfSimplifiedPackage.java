/**
 */
package org_sl_planet_bgfSimplified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedFactory
 * @model kind="package"
 * @generated
 */
public interface Org_sl_planet_bgfSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org_sl_planet_bgfSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/Users/Robert/Documents/AME/xmltext/XMLIntellEdit/source/at.ac.tuwien.big.xmltext/bgf/bgf.xsdsimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bgfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Org_sl_planet_bgfSimplifiedPackage eINSTANCE = org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.AllofImpl <em>Allof</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.AllofImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getAllof()
	 * @generated
	 */
	int ALLOF = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOF__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Allof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.AnyImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 1;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.ChoiceImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.EmptyImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 3;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.EpsilonImpl <em>Epsilon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.EpsilonImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getEpsilon()
	 * @generated
	 */
	int EPSILON = 4;

	/**
	 * The number of structural features of the '<em>Epsilon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPSILON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Epsilon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPSILON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.ExpressionImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Nonterminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NONTERMINAL = 2;

	/**
	 * The feature id for the '<em><b>Epsilon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EPSILON = 3;

	/**
	 * The feature id for the '<em><b>Empty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EMPTY = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANY = 5;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SELECTABLE = 6;

	/**
	 * The feature id for the '<em><b>Marked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MARKED = 7;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CHOICE = 9;

	/**
	 * The feature id for the '<em><b>Allof</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ALLOF = 10;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NOT = 11;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPTIONAL = 12;

	/**
	 * The feature id for the '<em><b>Plus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__PLUS = 13;

	/**
	 * The feature id for the '<em><b>Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__STAR = 14;

	/**
	 * The feature id for the '<em><b>Seplistplus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SEPLISTPLUS = 15;

	/**
	 * The feature id for the '<em><b>Sepliststar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SEPLISTSTAR = 16;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.GrammarImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 6;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__ROOTS = 0;

	/**
	 * The feature id for the '<em><b>Productions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__PRODUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.MarkedImpl <em>Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.MarkedImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getMarked()
	 * @generated
	 */
	int MARKED = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.NotImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.OptionalImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.PlusImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.ProductionImpl <em>Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.ProductionImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getProduction()
	 * @generated
	 */
	int PRODUCTION = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Nonterminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__NONTERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.SelectableImpl <em>Selectable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.SelectableImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSelectable()
	 * @generated
	 */
	int SELECTABLE = 12;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Selectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.SeplistplusImpl <em>Seplistplus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.SeplistplusImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSeplistplus()
	 * @generated
	 */
	int SEPLISTPLUS = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTPLUS__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTPLUS__EXPRESSION1 = 1;

	/**
	 * The number of structural features of the '<em>Seplistplus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTPLUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Seplistplus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTPLUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.SepliststarImpl <em>Sepliststar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.SepliststarImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSepliststar()
	 * @generated
	 */
	int SEPLISTSTAR = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTSTAR__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTSTAR__EXPRESSION1 = 1;

	/**
	 * The number of structural features of the '<em>Sepliststar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTSTAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sepliststar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPLISTSTAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.SequenceImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.impl.StarImpl <em>Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.impl.StarImpl
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getStar()
	 * @generated
	 */
	int STAR = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_sl_planet_bgfSimplified.Value <em>Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_sl_planet_bgfSimplified.Value
	 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 17;


	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Allof <em>Allof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allof</em>'.
	 * @see org_sl_planet_bgfSimplified.Allof
	 * @generated
	 */
	EClass getAllof();

	/**
	 * Returns the meta object for the containment reference list '{@link org_sl_planet_bgfSimplified.Allof#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org_sl_planet_bgfSimplified.Allof#getExpressions()
	 * @see #getAllof()
	 * @generated
	 */
	EReference getAllof_Expressions();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see org_sl_planet_bgfSimplified.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see org_sl_planet_bgfSimplified.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link org_sl_planet_bgfSimplified.Choice#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org_sl_planet_bgfSimplified.Choice#getExpressions()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Expressions();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see org_sl_planet_bgfSimplified.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Epsilon <em>Epsilon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epsilon</em>'.
	 * @see org_sl_planet_bgfSimplified.Epsilon
	 * @generated
	 */
	EClass getEpsilon();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org_sl_planet_bgfSimplified.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_sl_planet_bgfSimplified.Expression#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getTerminal()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link org_sl_planet_bgfSimplified.Expression#getNonterminal <em>Nonterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonterminal</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getNonterminal()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Nonterminal();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getEpsilon <em>Epsilon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Epsilon</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getEpsilon()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Epsilon();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getEmpty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getEmpty()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Empty();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getAny()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getSelectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selectable</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getSelectable()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Selectable();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getMarked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marked</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getMarked()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Marked();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getSequence()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getChoice()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getAllof <em>Allof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allof</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getAllof()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Allof();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getNot()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Not();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getOptional()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getPlus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plus</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getPlus()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Plus();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getStar <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Star</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getStar()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Star();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getSeplistplus <em>Seplistplus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seplistplus</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getSeplistplus()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Seplistplus();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Expression#getSepliststar <em>Sepliststar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sepliststar</em>'.
	 * @see org_sl_planet_bgfSimplified.Expression#getSepliststar()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Sepliststar();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see org_sl_planet_bgfSimplified.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the attribute list '{@link org_sl_planet_bgfSimplified.Grammar#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roots</em>'.
	 * @see org_sl_planet_bgfSimplified.Grammar#getRoots()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Roots();

	/**
	 * Returns the meta object for the containment reference list '{@link org_sl_planet_bgfSimplified.Grammar#getProductions <em>Productions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productions</em>'.
	 * @see org_sl_planet_bgfSimplified.Grammar#getProductions()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Productions();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked</em>'.
	 * @see org_sl_planet_bgfSimplified.Marked
	 * @generated
	 */
	EClass getMarked();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Marked#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Marked#getExpression()
	 * @see #getMarked()
	 * @generated
	 */
	EReference getMarked_Expression();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org_sl_planet_bgfSimplified.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see org_sl_planet_bgfSimplified.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Optional#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Optional#getExpression()
	 * @see #getOptional()
	 * @generated
	 */
	EReference getOptional_Expression();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see org_sl_planet_bgfSimplified.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Plus#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Plus#getExpression()
	 * @see #getPlus()
	 * @generated
	 */
	EReference getPlus_Expression();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Production <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production</em>'.
	 * @see org_sl_planet_bgfSimplified.Production
	 * @generated
	 */
	EClass getProduction();

	/**
	 * Returns the meta object for the attribute '{@link org_sl_planet_bgfSimplified.Production#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_sl_planet_bgfSimplified.Production#getLabel()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_sl_planet_bgfSimplified.Production#getNonterminal <em>Nonterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonterminal</em>'.
	 * @see org_sl_planet_bgfSimplified.Production#getNonterminal()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_Nonterminal();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Production#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Production#getExpression()
	 * @see #getProduction()
	 * @generated
	 */
	EReference getProduction_Expression();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Selectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable</em>'.
	 * @see org_sl_planet_bgfSimplified.Selectable
	 * @generated
	 */
	EClass getSelectable();

	/**
	 * Returns the meta object for the attribute '{@link org_sl_planet_bgfSimplified.Selectable#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org_sl_planet_bgfSimplified.Selectable#getSelector()
	 * @see #getSelectable()
	 * @generated
	 */
	EAttribute getSelectable_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Selectable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Selectable#getExpression()
	 * @see #getSelectable()
	 * @generated
	 */
	EReference getSelectable_Expression();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Seplistplus <em>Seplistplus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seplistplus</em>'.
	 * @see org_sl_planet_bgfSimplified.Seplistplus
	 * @generated
	 */
	EClass getSeplistplus();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Seplistplus#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Seplistplus#getExpression()
	 * @see #getSeplistplus()
	 * @generated
	 */
	EReference getSeplistplus_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Seplistplus#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression1</em>'.
	 * @see org_sl_planet_bgfSimplified.Seplistplus#getExpression1()
	 * @see #getSeplistplus()
	 * @generated
	 */
	EReference getSeplistplus_Expression1();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Sepliststar <em>Sepliststar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sepliststar</em>'.
	 * @see org_sl_planet_bgfSimplified.Sepliststar
	 * @generated
	 */
	EClass getSepliststar();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Sepliststar#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Sepliststar#getExpression()
	 * @see #getSepliststar()
	 * @generated
	 */
	EReference getSepliststar_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Sepliststar#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression1</em>'.
	 * @see org_sl_planet_bgfSimplified.Sepliststar#getExpression1()
	 * @see #getSepliststar()
	 * @generated
	 */
	EReference getSepliststar_Expression1();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org_sl_planet_bgfSimplified.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org_sl_planet_bgfSimplified.Sequence#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org_sl_planet_bgfSimplified.Sequence#getExpressions()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Expressions();

	/**
	 * Returns the meta object for class '{@link org_sl_planet_bgfSimplified.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star</em>'.
	 * @see org_sl_planet_bgfSimplified.Star
	 * @generated
	 */
	EClass getStar();

	/**
	 * Returns the meta object for the containment reference '{@link org_sl_planet_bgfSimplified.Star#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org_sl_planet_bgfSimplified.Star#getExpression()
	 * @see #getStar()
	 * @generated
	 */
	EReference getStar_Expression();

	/**
	 * Returns the meta object for enum '{@link org_sl_planet_bgfSimplified.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value</em>'.
	 * @see org_sl_planet_bgfSimplified.Value
	 * @generated
	 */
	EEnum getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Org_sl_planet_bgfSimplifiedFactory getOrg_sl_planet_bgfSimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.AllofImpl <em>Allof</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.AllofImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getAllof()
		 * @generated
		 */
		EClass ALLOF = eINSTANCE.getAllof();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOF__EXPRESSIONS = eINSTANCE.getAllof_Expressions();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.AnyImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.ChoiceImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__EXPRESSIONS = eINSTANCE.getChoice_Expressions();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.EmptyImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.EpsilonImpl <em>Epsilon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.EpsilonImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getEpsilon()
		 * @generated
		 */
		EClass EPSILON = eINSTANCE.getEpsilon();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.ExpressionImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TERMINAL = eINSTANCE.getExpression_Terminal();

		/**
		 * The meta object literal for the '<em><b>Nonterminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NONTERMINAL = eINSTANCE.getExpression_Nonterminal();

		/**
		 * The meta object literal for the '<em><b>Epsilon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EPSILON = eINSTANCE.getExpression_Epsilon();

		/**
		 * The meta object literal for the '<em><b>Empty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EMPTY = eINSTANCE.getExpression_Empty();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ANY = eINSTANCE.getExpression_Any();

		/**
		 * The meta object literal for the '<em><b>Selectable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SELECTABLE = eINSTANCE.getExpression_Selectable();

		/**
		 * The meta object literal for the '<em><b>Marked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__MARKED = eINSTANCE.getExpression_Marked();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SEQUENCE = eINSTANCE.getExpression_Sequence();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__CHOICE = eINSTANCE.getExpression_Choice();

		/**
		 * The meta object literal for the '<em><b>Allof</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ALLOF = eINSTANCE.getExpression_Allof();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__NOT = eINSTANCE.getExpression_Not();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__OPTIONAL = eINSTANCE.getExpression_Optional();

		/**
		 * The meta object literal for the '<em><b>Plus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__PLUS = eINSTANCE.getExpression_Plus();

		/**
		 * The meta object literal for the '<em><b>Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__STAR = eINSTANCE.getExpression_Star();

		/**
		 * The meta object literal for the '<em><b>Seplistplus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SEPLISTPLUS = eINSTANCE.getExpression_Seplistplus();

		/**
		 * The meta object literal for the '<em><b>Sepliststar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SEPLISTSTAR = eINSTANCE.getExpression_Sepliststar();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.GrammarImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__ROOTS = eINSTANCE.getGrammar_Roots();

		/**
		 * The meta object literal for the '<em><b>Productions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__PRODUCTIONS = eINSTANCE.getGrammar_Productions();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.MarkedImpl <em>Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.MarkedImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getMarked()
		 * @generated
		 */
		EClass MARKED = eINSTANCE.getMarked();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKED__EXPRESSION = eINSTANCE.getMarked_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.NotImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.OptionalImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL__EXPRESSION = eINSTANCE.getOptional_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.PlusImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS__EXPRESSION = eINSTANCE.getPlus_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.ProductionImpl <em>Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.ProductionImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getProduction()
		 * @generated
		 */
		EClass PRODUCTION = eINSTANCE.getProduction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__LABEL = eINSTANCE.getProduction_Label();

		/**
		 * The meta object literal for the '<em><b>Nonterminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__NONTERMINAL = eINSTANCE.getProduction_Nonterminal();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION__EXPRESSION = eINSTANCE.getProduction_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.SelectableImpl <em>Selectable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.SelectableImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSelectable()
		 * @generated
		 */
		EClass SELECTABLE = eINSTANCE.getSelectable();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTABLE__SELECTOR = eINSTANCE.getSelectable_Selector();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTABLE__EXPRESSION = eINSTANCE.getSelectable_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.SeplistplusImpl <em>Seplistplus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.SeplistplusImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSeplistplus()
		 * @generated
		 */
		EClass SEPLISTPLUS = eINSTANCE.getSeplistplus();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPLISTPLUS__EXPRESSION = eINSTANCE.getSeplistplus_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPLISTPLUS__EXPRESSION1 = eINSTANCE.getSeplistplus_Expression1();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.SepliststarImpl <em>Sepliststar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.SepliststarImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSepliststar()
		 * @generated
		 */
		EClass SEPLISTSTAR = eINSTANCE.getSepliststar();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPLISTSTAR__EXPRESSION = eINSTANCE.getSepliststar_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPLISTSTAR__EXPRESSION1 = eINSTANCE.getSepliststar_Expression1();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.SequenceImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__EXPRESSIONS = eINSTANCE.getSequence_Expressions();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.impl.StarImpl <em>Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.impl.StarImpl
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getStar()
		 * @generated
		 */
		EClass STAR = eINSTANCE.getStar();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAR__EXPRESSION = eINSTANCE.getStar_Expression();

		/**
		 * The meta object literal for the '{@link org_sl_planet_bgfSimplified.Value <em>Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_sl_planet_bgfSimplified.Value
		 * @see org_sl_planet_bgfSimplified.impl.Org_sl_planet_bgfSimplifiedPackageImpl#getValue()
		 * @generated
		 */
		EEnum VALUE = eINSTANCE.getValue();

	}

} //Org_sl_planet_bgfSimplifiedPackage
