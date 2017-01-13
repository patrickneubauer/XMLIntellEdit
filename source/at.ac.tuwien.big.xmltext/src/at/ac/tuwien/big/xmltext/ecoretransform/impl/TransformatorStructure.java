package at.ac.tuwien.big.xmltext.ecoretransform.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.naming.event.ObjectChangeListener;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import at.ac.tuwien.big.xmltext.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.xmltext.ecoretransform.EAttributeTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.EReferenceTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.SingleObjectTransformation;
import at.ac.tuwien.big.xmltext.ecoretransform.SingleObjectTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.Transformator;
import at.ac.tuwien.big.xmltext.ecoretransform.ValueTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.CollectionValueTransformationImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.EAttributeTransformatorImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class TransformatorStructure {
	private Map<EAttribute, EAttributeTransformator> xmlToEcoreAttr = new HashMap<EAttribute, EAttributeTransformator>();
	private Map<EAttribute, EAttributeTransformator> ecoreToXmlAttr = new HashMap<EAttribute, EAttributeTransformator>();
	private TypeTransformatorStore store;
	private Map<EReference, EReferenceTransformator> xmlToEcoreRef = new HashMap<EReference, EReferenceTransformator>();
	private Map<EReference, EReferenceTransformator> ecoreToXmlRef = new HashMap<EReference, EReferenceTransformator>();
	private Map<String, EObject> fragmentToXmlObject = new HashMap<String, EObject>();
	
	private Map<EReference,EReference> xmlToEcoreReferences = new HashMap<EReference, EReference>();
	private Map<EAttribute,EAttribute> xmlToEcoreAttribute = new HashMap<>();
	private Map<EEnum,EEnum> copiedEEnums = new HashMap<EEnum, EEnum>();
	private Map<EEnumLiteral,EEnumLiteral> copiedEEnumLiterals = new HashMap<EEnumLiteral, EEnumLiteral>();
	private Map<EEnumLiteral,EEnumLiteral> backEEnumLiteral = new HashMap<EEnumLiteral, EEnumLiteral>();
	private Map<EClass, EClass> xmlToEcoreClasses = new HashMap<EClass, EClass>();
	private Map<EClass, EClass> ecoreToXmlClasses = new HashMap<EClass, EClass>();
	
	private Map<String,EObject> targetMap = new HashMap<String, EObject>();
	private Set<EObject> handledTargets = new HashSet<EObject>();
	
	public String getStoreName(EObject eobj) {
		if (eobj instanceof EClass) {
			return ((EClass) eobj).getName();
		} else if (eobj instanceof EEnum) {
			return ((EEnum)eobj).getName();
		} else if (eobj instanceof EStructuralFeature) {
			EStructuralFeature esf = (EStructuralFeature)eobj;
			return esf.getEContainingClass().getName()+"."+esf.getName();
		}
		return null;
	}
	
	
	public void readInBasicTarget(Resource targetRes) {
		for (EObject eobj: (Iterable<EObject>)()->targetRes.getAllContents()) {
			String storeName = getStoreName(eobj);
			if (storeName != null) {
				targetMap.put(storeName, eobj);
			}
		}
	}
	
	public EObject getIfExists(String targetName) {
		EObject ret = targetMap.get(targetName);
		if (ret != null) {
			handledTargets.add(ret);
		}
		return ret;
	}
	
	//1 to one correspondance
	public TransformatorStructure(Resource source, Resource target) {
		for (EObject eobj: (Iterable<EObject>)source.getAllContents()) {
			if (eobj instanceof EClass) {
				EClass cl = (EClass)eobj;
				EClass ecoreClass = (EClass)target.getEObject(source.getURIFragment(eobj));
				xmlToEcoreClasses.put(cl, ecoreClass);
				ecoreToXmlClasses.put(ecoreClass,cl);
				System.out.println("Associating "+ cl+ " to "+ecoreClass);
				//Not all, because then we would do something multiple times
				for (EAttribute eattr: cl.getEAttributes()) {
					EAttribute newA = (EAttribute)target.getEObject(source.getURIFragment(eattr));
					xmlToEcoreAttribute.put(eattr, newA);
				}
				for (EReference eattr: cl.getEReferences()) {
					EReference newRef = (EReference)target.getEObject(source.getURIFragment(eattr));
					xmlToEcoreReferences.put(eattr, newRef);
				}
				
			} else if (eobj instanceof EEnum) {
				EEnum eenum = (EEnum)eobj;
				copiedEEnums.put(eenum, (EEnum)target.getEObject(source.getURIFragment(eenum)));
				for (EEnumLiteral lit: eenum.getELiterals()) {
					EEnumLiteral back = (EEnumLiteral)target.getEObject(source.getURIFragment(lit));
					copiedEEnumLiterals.put(lit, back);
					backEEnumLiteral.put(back, lit);
				}
				//Ignore for now
			} else if (eobj instanceof EDataType) {
				//???
			} else if (eobj instanceof EAttribute) {
				//Have handled every important above?
			} else if (eobj instanceof EReference) {
				//Have handled every important above?
			}
		}
		//TODO: Für kopierte ist es gefährlich ... 
		for (Entry<EClass,EClass> entr: xmlToEcoreClasses.entrySet()) {
			if (!augmentEClassBasic(entr.getKey(), entr.getValue())) {
				//TODO: Das stimmt so nicht ...
				entr.setValue(null);
			}
		}
		for (Entry<EAttribute,EAttribute> entr: xmlToEcoreAttribute.entrySet()) {
			if (!augmentAttributeBasic(entr.getKey(), entr.getValue())) {
				entr.setValue(null);
			}
		}
		for (Entry<EReference,EReference> entr: xmlToEcoreReferences.entrySet()) {
			if (!augmentReferenceBasic(entr.getKey(), entr.getValue())) {
				entr.setValue(null);
			}
		}
	}
	
	
	public TransformatorStructure(TypeTransformatorStore store, ResourceSet resourceSet, File xmlEcore) {
		this.store = store;
		parseXmlEcore(resourceSet,xmlEcore);
	}
	

	private TransformatorStructure() {
		
	}
		
	public static TransformatorStructure withKnownResult(TypeTransformatorStore store, ResourceSet resourceSet,
			Resource xmlResource, Resource ecoreResource) {
		TransformatorStructure ret = new TransformatorStructure();
		ret.store = store;
		ret.xmlResource = ()->xmlResource.getAllContents();
		ret.ecoreResource = ecoreResource;
		ret.readInBasicTarget(ecoreResource);
		ret.parseXmlEcore(resourceSet, xmlResource.getURI(), ()->xmlResource.getAllContents(), false);
		return ret;
	}

	public static TransformatorStructure fromXmlEcore(TypeTransformatorStore store,
			ResourceSet resourceSet, Resource ecoreXmlResource, String targetFilename) {
		TransformatorStructure ret = new TransformatorStructure();
		ret.store = store;
		ret.xmlResource = ()->ecoreXmlResource.getAllContents();
		ret.parseXmlEcore(resourceSet,URI.createFileURI(targetFilename),ret.xmlResource, false);
		return ret;
	}
	
	public TransformatorStructure(TypeTransformatorStore store, ResourceSet resourceSet, Resource xmlResource) {
		this.store = store;
		this.xmlResource = ()->xmlResource.getAllContents();
		parseXmlEcore(resourceSet,URI.createURI(xmlResource.getURI()+"simplified"),this.xmlResource,false);
	}
	
	public TransformatorStructure(TypeTransformatorStore store, ResourceSet resourceSet, File xmlResourceFile, Iterable<EObject> xmlResource) {
		this.store = store;
		this.xmlResource = xmlResource;
		parseXmlEcore(resourceSet,URI.createFileURI(xmlResourceFile.getAbsolutePath()+".simple.ecore"),xmlResource,false);
	}
	
	private EAttribute commonIdAttribute = null;
	private EClass commonIdClass = null;
	
	public EAttribute getIdAttribute() {
		if (commonIdAttribute == null) {
			//calcId();
		}
		return commonIdAttribute;
	}

	public Resource getEcoreResource() {
		return ecoreResource;
	}
	
	private Resource ecoreResource;
	private Iterable<EObject> xmlResource;
	
	public EClass getEcoreEClass(EClass xml) {
		return xmlToEcoreClasses.get(xml);
	}
	
	public EClass getXmlEClass(EClass ecore) {
		return ecoreToXmlClasses.get(ecore);
	}
	
	public EAttributeTransformator getTransformatorForXml(EAttribute xml) {
		EAttributeTransformator trafo = xmlToEcoreAttr.get(xml);
		if (trafo == null) {
			String fragment = xml.eResource().getURIFragment(xml);
			EObject eobj = fragmentToXmlObject.get(fragment);
			EAttributeTransformator ftrafo = xmlToEcoreAttr.get(eobj);
			if (ftrafo == null) {
				System.err.println("No transformator for "+xml +" found, eobject: " +eobj+"!");
			} else {
				trafo = new EAttributeTransformatorImpl(xml, ftrafo.getEcore(), ftrafo.getTransformation());
			}
		}
		return trafo;
	}

	public EAttributeTransformator getTransformatorForEcore(EAttribute ecore) {
		return ecoreToXmlAttr.get(ecore);
	}
	

	public EReferenceTransformator getTransformatorForXml(EReference xml) {
		EReferenceTransformator trafo = xmlToEcoreRef.get(xml);
		if (trafo == null) {
			String fragment = xml.eResource().getURIFragment(xml);
			EObject eobj = fragmentToXmlObject.get(fragment);
			trafo = xmlToEcoreRef.get((EReference)eobj);
			if (trafo == null) {
				System.err.println("No transformator for "+xml +" found, eobject: " +eobj+"!");
			} else {
				trafo = new EReferenceTransformatorImpl(xml, trafo.getEcore(), trafo.getTransformation());
			}
		}
		return trafo;
	}
	
	

	public EReferenceTransformator getTransformatorForEcore(EReference ecore) {
		return ecoreToXmlRef.get(ecore);
	}
	
	private boolean addedAnyAnnotations = false;
	private EClass documentRootClassXml;
	private EClass rootClassXml;
	private EClass rootClassEcore;
	private EReference rootReferenceXml;
	

	public void parseXmlEcore(ResourceSet resourceSet, /*String xmlEcoreName, */URI targetEcoreUri, Iterable<EObject> xmlResource, boolean generateFile) {
		EPackage xmlEPkg = null;
		for (EObject eobj: xmlResource) {
			if (eobj instanceof EPackage) {
				xmlEPkg = (EPackage)eobj;
				resourceSet.getPackageRegistry().put(xmlEPkg.getNsURI(), eobj);
			}
		}
		EPackage epkg;
		if (this.ecoreResource == null) { 
			this.ecoreResource = new XMIResourceImpl(resourceSet.getURIConverter().normalize(targetEcoreUri));
			
			epkg = EcoreFactory.eINSTANCE.createEPackage();
			epkg.setNsURI("http://"+xmlEPkg.getNsURI()+"simplified");
			//epkg.setNsURI(xmlEPkg.getNsURI()+"-simplified");
			//String xmlEcoreShortName = xmlEcoreName.split("\\.", 2)[0];
			epkg.setName(xmlEPkg.getName()+"Simplified");
			epkg.setNsPrefix(xmlEPkg.getNsPrefix()+"s");
			ecoreResource.getContents().add(epkg);
		} else {
			epkg = (EPackage)ecoreResource.getContents().get(0);
		}

		List<EAttribute> eattrs = new ArrayList<>();
		List<EReference> erefs = new ArrayList<>();
		List<EClass> eclasses = new ArrayList<>();
		List<EEnum> eenums = new ArrayList<>();
		resourceSet.getPackageRegistry().put(epkg.getNsURI(), epkg);
		for (EObject eobj: xmlResource) {
			if (eobj.eResource() != null) {
				fragmentToXmlObject.put(eobj.eResource().getURIFragment(eobj),eobj);
			}
			if (eobj instanceof EClass) {
				EClass cl = (EClass)eobj;
				if (!cl.getName().equals("DocumentRoot")) {					
					EClass ecoreClass = generateShallowEClass(cl);
					eclasses.add(cl);
					xmlToEcoreClasses.put(cl, ecoreClass);
					ecoreToXmlClasses.put(ecoreClass,cl);
					System.out.println("Associating "+ cl+ " to "+ecoreClass);
					//Not all, because then we would do something multiple times
					for (EAttribute eattr: cl.getEAttributes()) {
						xmlToEcoreAttribute.put(eattr, generateShallowAttribute(cl, ecoreClass, eattr));
						eattrs.add(eattr);
					}
					for (EReference eattr: cl.getEReferences()) {
						xmlToEcoreReferences.put(eattr, generateShallowReference(cl, ecoreClass, eattr));
						erefs.add(eattr);
					}
					epkg.getEClassifiers().add(ecoreClass);
				} else {
					//Analyze subclass
					documentRootClassXml = cl;
					rootReferenceXml = TransformatorImpl.getRootFeature(cl);
					rootClassXml = rootReferenceXml.getEReferenceType();
				}
				
			} else if (eobj instanceof EEnum) {
				EEnum eenum = (EEnum)eobj;
				EEnum targetEEnum = generateEEnum((EEnum)eobj);
				epkg.getEClassifiers().add(targetEEnum);
				eenums.add(targetEEnum);
				//Ignore for now
			} else if (eobj instanceof EDataType) {
				//???
			} else if (eobj instanceof EAttribute) {
				//Have handled every important above?
			} else if (eobj instanceof EReference) {
				//Have handled every important above?
			}
		} 
		rootClassEcore =  xmlToEcoreClasses.get(rootClassXml);
		for (EClass key: eclasses) {
			if (!augmentEClass(key, xmlToEcoreClasses.get(key))) {
				//TODO: Das stimmt so nicht ...
				xmlToEcoreClasses.remove(key);
			}
		}
		for (EAttribute attr: eattrs) {
			if (!augmentAttribute(attr, xmlToEcoreAttribute.get(attr))) {
				xmlToEcoreAttribute.remove(attr);
			}
		}
		for (EReference key: erefs) {
			if (!augmentReference(key, xmlToEcoreReferences.get(key))) {
				xmlToEcoreReferences.remove(key);
			}
		}
		
		//Add OCL expressions
		for (EObject eobj: xmlResource) {
			parseExtendedMetadata(eobj);
		}
		
		if (addedAnyAnnotations) {
			EAnnotation annot = epkg.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore");
			if (annot == null) {
				annot = EcoreFactory.eINSTANCE.createEAnnotation();
				annot.setSource("http://www.eclipse.org/emf/2002/Ecore");
				epkg.getEAnnotations().add(annot);
			}
			annot.getDetails().put("invocationDelegates","http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			annot.getDetails().put("settingDelegates","http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			annot.getDetails().put("validationDelegates","http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		}
		if (generateFile) {
			try {
				this.ecoreResource.save(new FileOutputStream("testoutput.ecore"),null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void parseXmlEcore(ResourceSet resourceSet, File xmlEcore) {
		Resource.Factory.Registry reg = resourceSet.getResourceFactoryRegistry();		
		reg.getExtensionToFactoryMap().put(
				"xmi", 
				new XMIResourceFactoryImpl());
		reg.getExtensionToFactoryMap().put(
				"ecore", 
				new EcoreResourceFactoryImpl());
		
		//Register ecore file
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		Resource res = resourceSet.getResource(resourceSet.getURIConverter().normalize(URI.createFileURI(xmlEcore.getAbsolutePath())), true);
		this.xmlResource = ()->res.getAllContents();
		parseXmlEcore(resourceSet, URI.createFileURI(xmlEcore.getAbsolutePath()+".simple.ecore"),  xmlResource, true);
		
	}
	
	public void parseExtendedMetadata(EClass xml, EClass ecore) {
		
	}
	
	public String toFirstUpper(String str) {
		if (str.length() <= 1) {
			return str.toUpperCase();
		}
		return Character.toUpperCase(str.charAt(0))+str.substring(1);
	}
	
	
	public void parseExtendedMetadata(EAttribute xmlAttr, EAttribute ecoreAttr, EClass xmlClass, EClass ecoreClass) {
		if (ecoreAttr == null) {
			System.err.println("No attribute matching for "+xmlAttr);
			return;
		}
		EDataType dataType = xmlAttr.getEAttributeType();
		//Also parse that
		for (EAnnotation dataTypeAnnot: dataType.getEAnnotations()) {
			System.out.println("DataTypeAnnotation: "+dataTypeAnnot.getSource());
			if ("http:///org/eclipse/emf/ecore/util/ExtendedMetaData".equals(dataTypeAnnot.getSource())) {
				String pattern = dataTypeAnnot.getDetails().get("pattern");
				EAnnotation additonal = ecoreClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
				
				/*    <eAnnotations source="http://www.eclipse.org/emf/2002/Ecore">
      <details key="constraints" value="sameServics goodSpeed onlyOneImportant backupDifferent"/>
    </eAnnotations>
    <eAnnotations source="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot">
      <details key="sameServics" value="backup = null or backup.services->includesAll(services)"/>
      <details key="goodSpeed" value="designSpeed &lt;= server.speed->sum()"/>
      <details key="onlyOneImportant" value="services->select(s | s.type = ServiceType::IMPORTANT)->size() &lt;= 1"/>
      <details key="backupDifferent" value="backup &lt;> self"/>
    </eAnnotations>*/
				
				boolean needAdd = false;
				boolean needAdd2 = false;
				String curConstraints = "";
				if (additonal == null) {
					needAdd = true;
					additonal = EcoreFactory.eINSTANCE.createEAnnotation();
					additonal.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
				} 
				EAnnotation general = ecoreClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore");
				if (general != null) {
					curConstraints = general.getDetails().get("constraints");
					if (curConstraints == null) {
						curConstraints = "";
					}
				} else {
					needAdd2 = true;
					general = EcoreFactory.eINSTANCE.createEAnnotation();
					general.setSource("http://www.eclipse.org/emf/2002/Ecore");
				}
				String prepend = "self."+ecoreAttr.getName()+(MyEcoreUtil.isMany(ecoreAttr)?"->forAll(x | x":"");
				String postpend = MyEcoreUtil.isMany(ecoreAttr)?")":"";
				if (pattern != null) {
					String constraintName = "pattern"+toFirstUpper(ecoreAttr.getName());
					String constraintValue = null;
					constraintValue = ".matches('"+StringEscapeUtils.unescapeXml(pattern).replace("%20"," ").replace("\\", "\\\\").replace("'", "\\\"")+"')";
					additonal.getDetails().put(constraintName, prepend+constraintValue+postpend);
					curConstraints = curConstraints+ " "+constraintName;
					
				}
				String minLength = dataTypeAnnot.getDetails().get("minLength");
				if (minLength != null) {
					String constraintName = "minLength"+toFirstUpper(ecoreAttr.getName());
					String constraintValue = ".size() >= "+minLength;
					additonal.getDetails().put(constraintName, prepend+constraintValue+postpend);
					curConstraints = curConstraints+ " "+constraintName;
				}
				String maxLength = dataTypeAnnot.getDetails().get("maxLength");
				if (maxLength != null) {
					String constraintName = "maxLength"+toFirstUpper(ecoreAttr.getName());
					String constraintValue = ".size() <= "+maxLength;
					additonal.getDetails().put(constraintName, prepend+constraintValue+postpend);
					curConstraints = curConstraints+ " "+constraintName;
				}
				general.getDetails().put("constraints", curConstraints.trim());

				if (needAdd2 && !curConstraints.trim().isEmpty()) {
					ecoreClass.getEAnnotations().add(general);
				}
				if (needAdd && !additonal.getDetails().isEmpty()) {
					ecoreClass.getEAnnotations().add(additonal);
					addedAnyAnnotations = true;
				}
			}
		}
	}

	public void parseExtendedMetadata(EReference xmlAttr, EReference ecoreAttr, EClass xmlClass, EClass ecoreClass) {
		
	}

	public void parseExtendedMetadata(EEnum xmlEnum, EEnum ecoreEnum) {
		
	}

	public void parseExtendedMetadata(EObject eobj) {
		if (eobj instanceof EClass) {
			parseExtendedMetadata((EClass)eobj,(EClass)xmlToEcoreClasses.get(eobj));
		} else if (eobj instanceof EStructuralFeature) {
			EStructuralFeature esf = (EStructuralFeature)eobj;
			EClass srcCl = esf.getEContainingClass();
			EClass trgCl = xmlToEcoreClasses.get(srcCl);
			if (eobj instanceof EAttribute) {
				parseExtendedMetadata((EAttribute)eobj,
						(EAttribute)xmlToEcoreAttribute.get(eobj),srcCl,trgCl );	
			} else {
				parseExtendedMetadata((EReference)eobj,
						(EReference)xmlToEcoreReferences.get(eobj),srcCl,trgCl );
			}
		} else if (eobj instanceof EEnum) {
			parseExtendedMetadata((EEnum)eobj,this.copiedEEnums.get(eobj));
		} 
	}
	
	public SingleObjectTransformator matchingObjectTransformation = new SingleObjectTransformator() {
		
		@Override
		public EObject convertToXml(EObject eobject, Transformator transformator) {
			return transformator.eobject2xml(eobject);
		}
		
		@Override
		public EObject convertToEcore(EObject xml, Transformator transformator) {
			return transformator.xml2Eobject(xml);
		}
	};
	
	private void setSimple(EStructuralFeature xmlFeature, EStructuralFeature target) {
		

		target.setChangeable(true);
		target.setLowerBound(xmlFeature.getLowerBound());
		target.setUpperBound(xmlFeature.getUpperBound());
		target.setOrdered(xmlFeature.isOrdered());
		target.setTransient(false);
		target.setUnique(xmlFeature.isUnique());
		target.setVolatile(false);
		
	
		
	}
	
	public EEnum generateEEnum(EEnum from) {
		EEnum ret = copiedEEnums.get(from);
		if (ret != null) {
			return ret;
		}
		copiedEEnums.put(from, ret = EcoreFactory.eINSTANCE.createEEnum());
		ret.setName(from.getName());
		for (EEnumLiteral lit: from.getELiterals()) {
			EEnumLiteral target = copiedEEnumLiterals.get(lit);
			if (target == null) {
				copiedEEnumLiterals.put(lit, target = EcoreFactory.eINSTANCE.createEEnumLiteral());
				backEEnumLiteral.put(target, lit);
				target.setLiteral(lit.getLiteral());
				target.setName(lit.getName());
				target.setValue(lit.getValue());
			}
			ret.getELiterals().add(target);
		}
		return ret;			
	}
	
	private final ValueTransformator<EEnumLiteral,EEnumLiteral> eenumTransformator = 
			new ValueTransformator<EEnumLiteral,EEnumLiteral>() {

				@Override
				public EEnumLiteral convertToEcore(EEnumLiteral xml) {
					EEnumLiteral ret = copiedEEnumLiterals.get(xml);
					if (ret == null) {
						String fragment = xml.eResource().getURIFragment(xml);
						EObject eobj = fragmentToXmlObject.get(fragment);
						ret = copiedEEnumLiterals.get(eobj);
					}
					return ret;
				}

				@Override
				public EEnumLiteral convertToXml(EEnumLiteral eobject) {
					return backEEnumLiteral.get(eobject);
				}
		};
	

		
		public boolean augmentAttributeBasic(EAttribute xmlAttribute, EAttribute ecoreAttribute) {
			EClass contCl = xmlToEcoreClasses.get(xmlAttribute.getEContainingClass());
			if (contCl == null) {
				System.err.println("No matching source found for "+xmlAttribute);
				return false;
			}
			if (xmlAttribute.getEAttributeType() instanceof EEnum) {
				//Directly reuse that enum (is this supported in the grammar?)
				EEnum targetEEnum = copiedEEnums.get(xmlAttribute.getEAttributeType());
				if (targetEEnum == null) {
					System.err.println("I have not copied the eenum "+xmlAttribute.getEAttributeType());
					return false;
				} else {
					EAttributeTransformatorImpl tfi = new EAttributeTransformatorImpl(xmlAttribute, ecoreAttribute,
							new CollectionValueTransformationImpl(EEnumLiteral.class,
									EEnumLiteral.class, eenumTransformator));
					xmlToEcoreAttr.put(xmlAttribute, tfi);
					ecoreToXmlAttr.put(ecoreAttribute, tfi);
					return true;
				}
			}
			CollectionValueTransformation trafo = store.getIdentityValueTransformation(xmlAttribute, ecoreAttribute);
			EAttributeTransformatorImpl tfi = new EAttributeTransformatorImpl(xmlAttribute, ecoreAttribute, trafo);
			xmlToEcoreAttr.put(xmlAttribute, tfi);
			ecoreToXmlAttr.put(ecoreAttribute, tfi);
			return true;
		}
		
		
	public boolean augmentAttribute(EAttribute xmlAttribute, EAttribute ecoreAttribute) {
		if (handledTargets.contains(ecoreAttribute)) {
			return augmentAttributeBasic(xmlAttribute, ecoreAttribute);
		}
		EClass contCl = xmlToEcoreClasses.get(xmlAttribute.getEContainingClass());
		if (xmlAttribute.getName().contains("pages")) {
			System.out.println("Pages found!");
		}
		if (contCl == null) {
			System.err.println("No matching source found for "+xmlAttribute);
			return false;
		}
		if (xmlAttribute.getEAttributeType() instanceof EEnum) {
			//Directly reuse that enum (is this supported in the grammar?)
			EEnum targetEEnum = copiedEEnums.get(xmlAttribute.getEAttributeType());
			if (targetEEnum == null) {
				System.err.println("I have not copied the eenum "+xmlAttribute.getEAttributeType());
				return false;
			} else {
				ecoreAttribute.setEType(targetEEnum);
				contCl.getEStructuralFeatures().add(ecoreAttribute);
				EAttributeTransformatorImpl tfi = new EAttributeTransformatorImpl(xmlAttribute, ecoreAttribute,
						new CollectionValueTransformationImpl(EEnumLiteral.class,
								EEnumLiteral.class, eenumTransformator));
				xmlToEcoreAttr.put(xmlAttribute, tfi);
				ecoreToXmlAttr.put(ecoreAttribute, tfi);
				return true;
			}
		}
		CollectionValueTransformation trafo = store.getValueTransformationOrNull(xmlAttribute);
		if (trafo == null) {
			System.err.println("Cannot translate attribute "+xmlAttribute.getEContainingClass().getName()+"."+xmlAttribute.getName()+" of type "+xmlAttribute.getEAttributeType()+" (cannot find transformator)");
			return false;
		}
		
		EDataType dt = store.getStandardDatatypeOrNull(trafo.getEcoreClass());
		if (dt == null) {
			System.err.println("Cannot translate attribute "+xmlAttribute.getEContainingClass().getName()+"."+xmlAttribute.getName()+" of type "+xmlAttribute.getEAttributeType()+" (cannot transform datatype)");
			return false;
		}
		EAttributeTransformatorImpl tfi = new EAttributeTransformatorImpl(xmlAttribute, ecoreAttribute, trafo);
		xmlToEcoreAttr.put(xmlAttribute, tfi);
		ecoreToXmlAttr.put(ecoreAttribute, tfi);
		ecoreAttribute.setEType(dt);
		contCl.getEStructuralFeatures().add(ecoreAttribute);
		return true;
	}
	

	public boolean augmentReferenceBasic(EReference xmlReference, EReference ecoreReference) {
		EClass contCl = xmlToEcoreClasses.get(xmlReference.getEContainingClass());
		if (contCl == null) {
			System.err.println("No matching source found for "+xmlReference);
			return false;
		}
		EClass targetClass = xmlToEcoreClasses.get(xmlReference.getEReferenceType());
		if (targetClass == null) {
			System.err.println("No matching type found for "+xmlReference);
			return false;
		}
		EReferenceTransformatorImpl tfi = new EReferenceTransformatorImpl(xmlReference, ecoreReference,
				new SingleBasedCollectionObjectTransformation(new InformatedSingleObjectTransformation(xmlReference.getEReferenceType(),
						ecoreReference.getEReferenceType(), matchingObjectTransformation)));
		xmlToEcoreRef.put(xmlReference, tfi);
		ecoreToXmlRef.put(ecoreReference, tfi);
		contCl.getEStructuralFeatures().add(ecoreReference);
		return true;
	}
	
	public boolean augmentReference(EReference xmlReference, EReference ecoreReference) {
		if (handledTargets.contains(ecoreReference)) {
			return augmentReferenceBasic(xmlReference, ecoreReference);
		}
		EClass contCl = xmlToEcoreClasses.get(xmlReference.getEContainingClass());
		if (contCl == null) {
			System.err.println("No matching source found for "+xmlReference);
			return false;
		}
		EClass targetClass = xmlToEcoreClasses.get(xmlReference.getEReferenceType());
		if (targetClass == null) {
			System.err.println("No matching type found for "+xmlReference);
			return false;
		}
		ecoreReference.setEType(targetClass);
		EReferenceTransformatorImpl tfi = new EReferenceTransformatorImpl(xmlReference, ecoreReference,
				new SingleBasedCollectionObjectTransformation(new InformatedSingleObjectTransformation(xmlReference.getEReferenceType(),
						ecoreReference.getEReferenceType(), matchingObjectTransformation)));
		xmlToEcoreRef.put(xmlReference, tfi);
		ecoreToXmlRef.put(ecoreReference, tfi);
		contCl.getEStructuralFeatures().add(ecoreReference);
		return true;
	}
	
	public boolean augmentEClass(EClass xmlClass, EClass ecoreClass) {
		if (handledTargets.contains(ecoreClass)) {
			return augmentEClassBasic(xmlClass, ecoreClass);
		}
		for (EClass superType: xmlClass.getESuperTypes()) {
			EClass ecoreSup = xmlToEcoreClasses.get(superType);
			ecoreClass.getESuperTypes().add(ecoreSup);
		}
		//Ich glaube sonst ist nichts zu tun?
		return true;
	}
	
	public boolean augmentEClassBasic(EClass xmlClass, EClass ecoreReference) {
		return true;
	}
	
	public String getTargetName(EStructuralFeature xmlFeature){
		String targetName = xmlFeature.getName();
		if (xmlFeature.isMany() && !targetName.endsWith("s")) {
			targetName = targetName+"s";
		}
		return targetName;
	}
	
	public EAttribute generateShallowAttribute(EClass xmlClass, EClass ecoreClass, EAttribute xmlAttribute) {
		String featName = getTargetName(xmlAttribute);
		EAttribute target = (EAttribute)getIfExists(ecoreClass.getName()+"."+featName);
		if (target == null) {
			target = EcoreFactory.eINSTANCE.createEAttribute();
			target.setName(featName);
			setSimple(xmlAttribute, target);
			target.setID(xmlAttribute.isID());
		}
		return target;
	}
	
	public void fixOpposites() {
		//Don't fix it since it can't be handled by XText!
	}
	
	public EReference generateShallowReference(EClass xmlClass, EClass ecoreClass, EReference xmlReference) {
		String featName = getTargetName(xmlReference);
		EReference target = (EReference)getIfExists(ecoreClass.getName()+"."+featName);
		if (target == null) {
			target = EcoreFactory.eINSTANCE.createEReference();
			target.setName(featName);
			setSimple(xmlReference, target);
			target.setContainment(xmlReference.isContainment());
		}
		return target;
	}
	
	public EClass generateShallowEClass(EClass xmlClass) {
		String targetName = xmlClass.getName(); 
		if (targetName.endsWith("Type")) {
			targetName = targetName.substring(0,targetName.length()-"Type".length());
		}
		EClass target = (EClass)getIfExists(targetName);
		if (target == null) {
			target = EcoreFactory.eINSTANCE.createEClass();
			target.setName(targetName);
		}
		return target;
	}
	
	public static void main(String[] args) {
		TypeTransformatorStore store = new TypeTransformatorStore();
		ResourceSet basicSet = new ResourceSetImpl();
		TransformatorStructure structure = new TransformatorStructure(store, basicSet, new File("library3-base.ecore"));
		
		
	}

	public EObject getXmlEObject(String uriFragment) {
		return fragmentToXmlObject.get(uriFragment);
	}
	
	public EClass getDocumentRoot() {
		return documentRootClassXml;
	}

	public EClass getXmlRoot() {
		return rootClassXml;
	}
	
	public EReference getXmlRootReference() {
		return rootReferenceXml;
	}

	public EClass getEcoreRoot() {
		return rootClassEcore;
	}

}
