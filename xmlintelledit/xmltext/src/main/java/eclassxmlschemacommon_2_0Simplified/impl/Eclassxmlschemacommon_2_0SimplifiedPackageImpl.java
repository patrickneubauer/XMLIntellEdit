/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import eclassxmlschemacommon_2_0Simplified.CONTENTMODELType;
import eclassxmlschemacommon_2_0Simplified.Contact;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedFactory;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.TargetValues;
import eclassxmlschemacommon_2_0Simplified.util.Eclassxmlschemacommon_2_0SimplifiedValidator;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage;
import eclassxmlschemadictionary_2_0Simplified.impl.Eclassxmlschemadictionary_2_0SimplifiedPackageImpl;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;
import xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eclassxmlschemacommon_2_0SimplifiedPackageImpl extends EPackageImpl implements Eclassxmlschemacommon_2_0SimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedpropertypathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicpropertypathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyelmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertypathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryamountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitmappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuemappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuerefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentmodelTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Eclassxmlschemacommon_2_0SimplifiedPackageImpl() {
		super(eNS_URI, Eclassxmlschemacommon_2_0SimplifiedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Eclassxmlschemacommon_2_0SimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Eclassxmlschemacommon_2_0SimplifiedPackage init() {
		if (isInited) return (Eclassxmlschemacommon_2_0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		Eclassxmlschemacommon_2_0SimplifiedPackageImpl theEclassxmlschemacommon_2_0SimplifiedPackage = (Eclassxmlschemacommon_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Eclassxmlschemacommon_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Eclassxmlschemacommon_2_0SimplifiedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Eclassxmlschemadictionary_2_0SimplifiedPackageImpl theEclassxmlschemadictionary_2_0SimplifiedPackage = (Eclassxmlschemadictionary_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemadictionary_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemadictionary_2_0SimplifiedPackage.eINSTANCE);
		Eclassxmlschemaheader_2_0SimplifiedPackageImpl theEclassxmlschemaheader_2_0SimplifiedPackage = (Eclassxmlschemaheader_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemaheader_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemaheader_2_0SimplifiedPackage.eINSTANCE);
		Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) instanceof Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) : Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE);
		XontomlextensionsschemacoreSimplifiedPackageImpl theXontomlextensionsschemacoreSimplifiedPackage = (XontomlextensionsschemacoreSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI) instanceof XontomlextensionsschemacoreSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI) : XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE);
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE);

		// Create package meta-data objects
		theEclassxmlschemacommon_2_0SimplifiedPackage.createPackageContents();
		theEclassxmlschemadictionary_2_0SimplifiedPackage.createPackageContents();
		theEclassxmlschemaheader_2_0SimplifiedPackage.createPackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.createPackageContents();
		theXontomlextensionsschemacoreSimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theEclassxmlschemacommon_2_0SimplifiedPackage.initializePackageContents();
		theEclassxmlschemadictionary_2_0SimplifiedPackage.initializePackageContents();
		theEclassxmlschemaheader_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.initializePackageContents();
		theXontomlextensionsschemacoreSimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEclassxmlschemacommon_2_0SimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Eclassxmlschemacommon_2_0SimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEclassxmlschemacommon_2_0SimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI, theEclassxmlschemacommon_2_0SimplifiedPackage);
		return theEclassxmlschemacommon_2_0SimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADVANCEDPROPERTYPATH() {
		return advancedpropertypathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADVANCEDPROPERTYPATH_Ac() {
		return (EAttribute)advancedpropertypathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADVANCEDPROPERTYPATH_Aspect() {
		return (EAttribute)advancedpropertypathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADVANCEDPROPERTYPATH_Propertys() {
		return (EReference)advancedpropertypathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBASICPROPERTYPATH() {
		return basicpropertypathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBASICPROPERTYPATH_Ac() {
		return (EAttribute)basicpropertypathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBASICPROPERTYPATH_Aspect() {
		return (EAttribute)basicpropertypathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBASICPROPERTYPATH_PropRef() {
		return (EAttribute)basicpropertypathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Address() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_City() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Zip() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Country() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Phone() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Fax() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Email() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Url() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContact_Remarks() {
		return (EReference)contactEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContact_Others() {
		return (EReference)contactEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDENTIFICATION() {
		return identificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDENTIFICATION_Irdi() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDENTIFICATION_Identifier() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDENTIFICATION_Type() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLOCALE() {
		return localeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLOCALE_CountryRef() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLOCALE_LanguageRef() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLOCALIZEDSTRING() {
		return localizedstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLOCALIZEDSTRING_Value() {
		return (EAttribute)localizedstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLOCALIZEDSTRING_CountryCode() {
		return (EAttribute)localizedstringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLOCALIZEDSTRING_LanguageCode() {
		return (EAttribute)localizedstringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUMERICVALUE() {
		return numericvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPARTY() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARTY_Name() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARTY_Organisation() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPARTY_Identification() {
		return (EReference)partyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPARTY_Contact() {
		return (EReference)partyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYELM() {
		return propertyelmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYELM_OrdinalNumber() {
		return (EAttribute)propertyelmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYELM_Ref() {
		return (EAttribute)propertyelmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYELM_TargetClassRef() {
		return (EAttribute)propertyelmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYPATH() {
		return propertypathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYPATH_Ac() {
		return (EAttribute)propertypathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYPATH_Aspect() {
		return (EAttribute)propertypathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYPATH_Cc() {
		return (EAttribute)propertypathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYPATH_Propertys() {
		return (EReference)propertypathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQUERYAMOUNT() {
		return queryamountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQUERYAMOUNT_AlternativeUnit() {
		return (EAttribute)queryamountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQUERYAMOUNT_BaseUnit() {
		return (EAttribute)queryamountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetValues() {
		return targetValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetValues_TargetValue() {
		return (EReference)targetValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEDSTRING() {
		return typedstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEDSTRING_Type() {
		return (EAttribute)typedstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUNITMAPPING() {
		return unitmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUNITMAPPING_SourceUnit() {
		return (EAttribute)unitmappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUNITMAPPING_TargetUnit() {
		return (EAttribute)unitmappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUEMAPPING() {
		return valuemappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUEMAPPING_SourceValue() {
		return (EReference)valuemappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUEMAPPING_TargetValue() {
		return (EReference)valuemappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUEMAPPING_TargetValues() {
		return (EReference)valuemappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUEREF() {
		return valuerefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCONTENTMODELType() {
		return contentmodelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemacommon_2_0SimplifiedFactory getEclassxmlschemacommon_2_0SimplifiedFactory() {
		return (Eclassxmlschemacommon_2_0SimplifiedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		advancedpropertypathEClass = createEClass(ADVANCEDPROPERTYPATH);
		createEAttribute(advancedpropertypathEClass, ADVANCEDPROPERTYPATH__AC);
		createEAttribute(advancedpropertypathEClass, ADVANCEDPROPERTYPATH__ASPECT);
		createEReference(advancedpropertypathEClass, ADVANCEDPROPERTYPATH__PROPERTYS);

		basicpropertypathEClass = createEClass(BASICPROPERTYPATH);
		createEAttribute(basicpropertypathEClass, BASICPROPERTYPATH__AC);
		createEAttribute(basicpropertypathEClass, BASICPROPERTYPATH__ASPECT);
		createEAttribute(basicpropertypathEClass, BASICPROPERTYPATH__PROP_REF);

		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__ADDRESS);
		createEAttribute(contactEClass, CONTACT__CITY);
		createEAttribute(contactEClass, CONTACT__ZIP);
		createEAttribute(contactEClass, CONTACT__COUNTRY);
		createEAttribute(contactEClass, CONTACT__PHONE);
		createEAttribute(contactEClass, CONTACT__FAX);
		createEAttribute(contactEClass, CONTACT__EMAIL);
		createEAttribute(contactEClass, CONTACT__URL);
		createEReference(contactEClass, CONTACT__REMARKS);
		createEReference(contactEClass, CONTACT__OTHERS);

		identificationEClass = createEClass(IDENTIFICATION);
		createEAttribute(identificationEClass, IDENTIFICATION__IRDI);
		createEAttribute(identificationEClass, IDENTIFICATION__IDENTIFIER);
		createEAttribute(identificationEClass, IDENTIFICATION__TYPE);

		localeEClass = createEClass(LOCALE);
		createEAttribute(localeEClass, LOCALE__COUNTRY_REF);
		createEAttribute(localeEClass, LOCALE__LANGUAGE_REF);

		localizedstringEClass = createEClass(LOCALIZEDSTRING);
		createEAttribute(localizedstringEClass, LOCALIZEDSTRING__VALUE);
		createEAttribute(localizedstringEClass, LOCALIZEDSTRING__COUNTRY_CODE);
		createEAttribute(localizedstringEClass, LOCALIZEDSTRING__LANGUAGE_CODE);

		numericvalueEClass = createEClass(NUMERICVALUE);

		partyEClass = createEClass(PARTY);
		createEAttribute(partyEClass, PARTY__NAME);
		createEAttribute(partyEClass, PARTY__ORGANISATION);
		createEReference(partyEClass, PARTY__IDENTIFICATION);
		createEReference(partyEClass, PARTY__CONTACT);

		propertyelmEClass = createEClass(PROPERTYELM);
		createEAttribute(propertyelmEClass, PROPERTYELM__ORDINAL_NUMBER);
		createEAttribute(propertyelmEClass, PROPERTYELM__REF);
		createEAttribute(propertyelmEClass, PROPERTYELM__TARGET_CLASS_REF);

		propertypathEClass = createEClass(PROPERTYPATH);
		createEAttribute(propertypathEClass, PROPERTYPATH__AC);
		createEAttribute(propertypathEClass, PROPERTYPATH__ASPECT);
		createEAttribute(propertypathEClass, PROPERTYPATH__CC);
		createEReference(propertypathEClass, PROPERTYPATH__PROPERTYS);

		queryamountEClass = createEClass(QUERYAMOUNT);
		createEAttribute(queryamountEClass, QUERYAMOUNT__ALTERNATIVE_UNIT);
		createEAttribute(queryamountEClass, QUERYAMOUNT__BASE_UNIT);

		targetValuesEClass = createEClass(TARGET_VALUES);
		createEReference(targetValuesEClass, TARGET_VALUES__TARGET_VALUE);

		typedstringEClass = createEClass(TYPEDSTRING);
		createEAttribute(typedstringEClass, TYPEDSTRING__TYPE);

		unitmappingEClass = createEClass(UNITMAPPING);
		createEAttribute(unitmappingEClass, UNITMAPPING__SOURCE_UNIT);
		createEAttribute(unitmappingEClass, UNITMAPPING__TARGET_UNIT);

		valuemappingEClass = createEClass(VALUEMAPPING);
		createEReference(valuemappingEClass, VALUEMAPPING__SOURCE_VALUE);
		createEReference(valuemappingEClass, VALUEMAPPING__TARGET_VALUE);
		createEReference(valuemappingEClass, VALUEMAPPING__TARGET_VALUES);

		valuerefEClass = createEClass(VALUEREF);

		// Create enums
		contentmodelTypeEEnum = createEEnum(CONTENTMODEL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typedstringEClass.getESuperTypes().add(this.getLOCALIZEDSTRING());

		// Initialize classes, features, and operations; add parameters
		initEClass(advancedpropertypathEClass, eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH.class, "ADVANCEDPROPERTYPATH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADVANCEDPROPERTYPATH_Ac(), ecorePackage.getEString(), "ac", null, 1, 1, eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADVANCEDPROPERTYPATH_Aspect(), ecorePackage.getEString(), "aspect", null, 0, 1, eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADVANCEDPROPERTYPATH_Propertys(), this.getPROPERTYELM(), null, "propertys", null, 1, -1, eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicpropertypathEClass, eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH.class, "BASICPROPERTYPATH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBASICPROPERTYPATH_Ac(), ecorePackage.getEString(), "ac", null, 1, 1, eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBASICPROPERTYPATH_Aspect(), ecorePackage.getEString(), "aspect", null, 0, 1, eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBASICPROPERTYPATH_PropRef(), ecorePackage.getEString(), "propRef", null, 1, 1, eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_Address(), ecorePackage.getEString(), "address", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_City(), ecorePackage.getEString(), "city", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Zip(), ecorePackage.getEString(), "zip", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Country(), ecorePackage.getEString(), "country", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Fax(), ecorePackage.getEString(), "fax", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Email(), ecorePackage.getEString(), "email", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Url(), ecorePackage.getEString(), "url", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContact_Remarks(), this.getLOCALIZEDSTRING(), null, "remarks", null, 0, -1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContact_Others(), this.getTYPEDSTRING(), null, "others", null, 0, -1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationEClass, eclassxmlschemacommon_2_0Simplified.IDENTIFICATION.class, "IDENTIFICATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDENTIFICATION_Irdi(), ecorePackage.getEString(), "irdi", null, 0, 1, eclassxmlschemacommon_2_0Simplified.IDENTIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDENTIFICATION_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, eclassxmlschemacommon_2_0Simplified.IDENTIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDENTIFICATION_Type(), ecorePackage.getEString(), "type", null, 0, 1, eclassxmlschemacommon_2_0Simplified.IDENTIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localeEClass, eclassxmlschemacommon_2_0Simplified.LOCALE.class, "LOCALE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLOCALE_CountryRef(), ecorePackage.getEString(), "countryRef", null, 0, 1, eclassxmlschemacommon_2_0Simplified.LOCALE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLOCALE_LanguageRef(), ecorePackage.getEString(), "languageRef", null, 0, 1, eclassxmlschemacommon_2_0Simplified.LOCALE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizedstringEClass, eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING.class, "LOCALIZEDSTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLOCALIZEDSTRING_Value(), ecorePackage.getEString(), "value", null, 0, 1, eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLOCALIZEDSTRING_CountryCode(), ecorePackage.getEString(), "countryCode", null, 0, 1, eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLOCALIZEDSTRING_LanguageCode(), ecorePackage.getEString(), "languageCode", null, 1, 1, eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericvalueEClass, eclassxmlschemacommon_2_0Simplified.NUMERICVALUE.class, "NUMERICVALUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partyEClass, eclassxmlschemacommon_2_0Simplified.PARTY.class, "PARTY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPARTY_Name(), ecorePackage.getEString(), "name", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARTY_Organisation(), ecorePackage.getEString(), "organisation", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPARTY_Identification(), this.getIDENTIFICATION(), null, "identification", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPARTY_Contact(), this.getContact(), null, "contact", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PARTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyelmEClass, eclassxmlschemacommon_2_0Simplified.PROPERTYELM.class, "PROPERTYELM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPROPERTYELM_OrdinalNumber(), ecorePackage.getEInt(), "ordinalNumber", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PROPERTYELM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROPERTYELM_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, eclassxmlschemacommon_2_0Simplified.PROPERTYELM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROPERTYELM_TargetClassRef(), ecorePackage.getEString(), "targetClassRef", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PROPERTYELM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertypathEClass, eclassxmlschemacommon_2_0Simplified.PROPERTYPATH.class, "PROPERTYPATH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPROPERTYPATH_Ac(), ecorePackage.getEString(), "ac", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROPERTYPATH_Aspect(), ecorePackage.getEString(), "aspect", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROPERTYPATH_Cc(), ecorePackage.getEString(), "cc", null, 0, 1, eclassxmlschemacommon_2_0Simplified.PROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPROPERTYPATH_Propertys(), this.getPROPERTYELM(), null, "propertys", null, 1, -1, eclassxmlschemacommon_2_0Simplified.PROPERTYPATH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryamountEClass, eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT.class, "QUERYAMOUNT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQUERYAMOUNT_AlternativeUnit(), ecorePackage.getEString(), "alternativeUnit", null, 0, 1, eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQUERYAMOUNT_BaseUnit(), ecorePackage.getEString(), "baseUnit", null, 1, 1, eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetValuesEClass, TargetValues.class, "TargetValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetValues_TargetValue(), this.getVALUEREF(), null, "targetValue", null, 1, 1, TargetValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedstringEClass, eclassxmlschemacommon_2_0Simplified.TYPEDSTRING.class, "TYPEDSTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEDSTRING_Type(), ecorePackage.getEString(), "type", null, 0, 1, eclassxmlschemacommon_2_0Simplified.TYPEDSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitmappingEClass, eclassxmlschemacommon_2_0Simplified.UNITMAPPING.class, "UNITMAPPING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUNITMAPPING_SourceUnit(), ecorePackage.getEString(), "sourceUnit", null, 1, 1, eclassxmlschemacommon_2_0Simplified.UNITMAPPING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUNITMAPPING_TargetUnit(), ecorePackage.getEString(), "targetUnit", null, 1, 1, eclassxmlschemacommon_2_0Simplified.UNITMAPPING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuemappingEClass, eclassxmlschemacommon_2_0Simplified.VALUEMAPPING.class, "VALUEMAPPING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVALUEMAPPING_SourceValue(), this.getVALUEREF(), null, "sourceValue", null, 1, 1, eclassxmlschemacommon_2_0Simplified.VALUEMAPPING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUEMAPPING_TargetValue(), this.getVALUEREF(), null, "targetValue", null, 0, 1, eclassxmlschemacommon_2_0Simplified.VALUEMAPPING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUEMAPPING_TargetValues(), this.getTargetValues(), null, "targetValues", null, 0, 1, eclassxmlschemacommon_2_0Simplified.VALUEMAPPING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuerefEClass, eclassxmlschemacommon_2_0Simplified.VALUEREF.class, "VALUEREF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(contentmodelTypeEEnum, CONTENTMODELType.class, "CONTENTMODELType");
		addEEnumLiteral(contentmodelTypeEEnum, CONTENTMODELType.ADVANCED);
		addEEnumLiteral(contentmodelTypeEEnum, CONTENTMODELType.BASIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (advancedpropertypathEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternAc patternAspect"
		   });	
		addAnnotation
		  (basicpropertypathEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternAc patternAspect patternPropRef"
		   });	
		addAnnotation
		  (identificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternIrdi"
		   });	
		addAnnotation
		  (localeEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternCountryRef patternLanguageRef"
		   });	
		addAnnotation
		  (localizedstringEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternCountryCode patternLanguageCode"
		   });	
		addAnnotation
		  (propertyelmEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternRef patternTargetClassRef"
		   });	
		addAnnotation
		  (propertypathEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternAc patternAspect patternCc"
		   });	
		addAnnotation
		  (queryamountEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternAlternativeUnit patternBaseUnit"
		   });	
		addAnnotation
		  (unitmappingEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternSourceUnit patternTargetUnit"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (advancedpropertypathEClass, 
		   source, 
		   new String[] {
			 "patternAc", "self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternAspect", "(self.aspect=null) or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (basicpropertypathEClass, 
		   source, 
		   new String[] {
			 "patternAc", "self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternAspect", "(self.aspect=null) or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternPropRef", "self.propRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (identificationEClass, 
		   source, 
		   new String[] {
			 "patternIrdi", "(self.irdi=null) or self.irdi.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.irdi.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.irdi.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (localeEClass, 
		   source, 
		   new String[] {
			 "patternCountryRef", "(self.countryRef=null) or self.countryRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.countryRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.countryRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternLanguageRef", "(self.languageRef=null) or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (localizedstringEClass, 
		   source, 
		   new String[] {
			 "patternCountryCode", "(self.countryCode=null) or self.countryCode.matches(\'[A-z]*\')",
			 "patternLanguageCode", "self.languageCode.matches(\'[A-z]*\')"
		   });	
		addAnnotation
		  (propertyelmEClass, 
		   source, 
		   new String[] {
			 "patternRef", "self.ref.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ref.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ref.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternTargetClassRef", "(self.targetClassRef=null) or self.targetClassRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.targetClassRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.targetClassRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (propertypathEClass, 
		   source, 
		   new String[] {
			 "patternAc", "(self.ac=null) or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.ac.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternAspect", "(self.aspect=null) or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.aspect.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternCc", "(self.cc=null) or self.cc.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.cc.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.cc.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (queryamountEClass, 
		   source, 
		   new String[] {
			 "patternAlternativeUnit", "(self.alternativeUnit=null) or self.alternativeUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.alternativeUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.alternativeUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternBaseUnit", "self.baseUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.baseUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.baseUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (unitmappingEClass, 
		   source, 
		   new String[] {
			 "patternSourceUnit", "self.sourceUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.sourceUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.sourceUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternTargetUnit", "self.targetUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.targetUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.targetUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });
	}

} //Eclassxmlschemacommon_2_0SimplifiedPackageImpl
