package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.activation.UnsupportedDataTypeException;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.Enumerator;
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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.EAttributeTransformator;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.EReferenceTransformator;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.PartialObjectCopier;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.SingleObjectTransformator;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.Transformator;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.ValueTransformator;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class TransformatorStructure {
	private Map<EAttribute, EAttributeTransformator> xmlToEcoreAttr = new HashMap<EAttribute, EAttributeTransformator>();
	private Map<EAttribute, EAttributeTransformator> ecoreToXmlAttr = new HashMap<EAttribute, EAttributeTransformator>();
	private Map<EStructuralFeature, PartialObjectCopier> xmlToEcoreChanger = new HashMap<>();
	private Map<EStructuralFeature, PartialObjectCopier> ecoreToXmlChanger = new HashMap<>();
	private TypeTransformatorStore store;
	private Map<EReference, EReferenceTransformator> xmlToEcoreRef = new HashMap<EReference, EReferenceTransformator>();
	private Map<EReference, EReferenceTransformator> ecoreToXmlRef = new HashMap<EReference, EReferenceTransformator>();
	private Map<String, EObject> fragmentToXmlObject = new HashMap<String, EObject>();
	
	private Map<EReference,EReference> xmlToEcoreReferences = new HashMap<EReference, EReference>();
	private Map<EAttribute,EAttribute> xmlToEcoreAttribute = new HashMap<>();
	private Map<EEnum,EEnum> copiedEEnums = new HashMap<EEnum, EEnum>();
	private Map<EEnumLiteral,EEnumLiteral> copiedEEnumLiterals = new HashMap<EEnumLiteral, EEnumLiteral>();
	private Map<EEnumLiteral,EEnumLiteral> backEEnumLiteral = new HashMap<EEnumLiteral, EEnumLiteral>();
	private Map<String,EEnumLiteral> backEEnumLiteralStr = new HashMap<String, EEnumLiteral>();
	private Map<EClass, EClass> xmlToEcoreClasses = new HashMap<EClass, EClass>();
	private Map<EClass, EClass> ecoreToXmlClasses = new HashMap<EClass, EClass>();
	
	private Map<EStructuralFeature,EStructuralFeature> ecoreToXmlFeature = new HashMap<EStructuralFeature, EStructuralFeature>();
	
	private Map<String,EObject> targetMap = new HashMap<String, EObject>();
	private Set<EObject> handledTargets = new HashSet<EObject>();
	
	private Map<String,String> restrictedDatatypes = new HashMap<String,String>();
	
	


	public Map<String, String> getRestrictedDatatypes() {
		return restrictedDatatypes;
	}


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
					backEEnumLiteralStr.put(eenum.getName()+"."+lit.getLiteral(), lit);
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
		//TODO: Fï¿½r kopierte ist es gefï¿½hrlich ... 
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
	
	private EClass mixedData;
	private EClass mixedText;
	private EClass mixedFeature;
	private EClass mixedBaseClass;
	private EReference mixedBaseMixedAttr;
	private EAttribute mixedValueAttr;
	private EPackage ecorePackage;
	
	public void generateMixClasses() {
		if (mixedData == null) {
			mixedData = (EClass)getIfExists("MixedData");
			if (mixedData == null) {
				mixedData = EcoreFactory.eINSTANCE.createEClass();
				mixedData.setName("MixedData");
				mixedData.setAbstract(true);
				
				mixedValueAttr = EcoreFactory.eINSTANCE.createEAttribute();
				mixedValueAttr.setName("value");
				mixedValueAttr.setEType(EcorePackage.Literals.ESTRING);
				mixedValueAttr.setLowerBound(1);
				mixedValueAttr.setUpperBound(1);
				mixedData.getEStructuralFeatures().add(mixedValueAttr);
				ecorePackage.getEClassifiers().add(mixedData);
			} else {
				mixedValueAttr = (EAttribute)mixedData.getEStructuralFeature("value");
			}
			
			mixedText = (EClass)getIfExists("MixedText");
			if (mixedText == null) {
				mixedText = EcoreFactory.eINSTANCE.createEClass();
				mixedText.setName("MixedText");
				mixedText.getESuperTypes().add(mixedData);
				ecorePackage.getEClassifiers().add(mixedText);
			} 
			
			mixedFeature = (EClass)getIfExists("MixedFeature");
			if (mixedFeature == null) {
				mixedFeature = EcoreFactory.eINSTANCE.createEClass();
				mixedFeature.setName("MixedFeature");
				mixedFeature.getESuperTypes().add(mixedData);
				ecorePackage.getEClassifiers().add(mixedFeature);
			}
			
			
			mixedBaseClass = (EClass)getIfExists("MixedBaseClass");
			if (mixedBaseClass == null) {
				mixedBaseClass = EcoreFactory.eINSTANCE.createEClass();
				mixedBaseClass.setName("MixedBaseClass");
				mixedBaseClass.setAbstract(true);
				mixedBaseMixedAttr = EcoreFactory.eINSTANCE.createEReference();
				mixedBaseMixedAttr.setName("mixed");
				mixedBaseMixedAttr.setLowerBound(0);
				mixedBaseMixedAttr.setUpperBound(-1);
				mixedBaseMixedAttr.setContainment(true);
				mixedBaseMixedAttr.setEType(mixedData);
				mixedBaseClass.getEStructuralFeatures().add(mixedBaseMixedAttr);
				ecorePackage.getEClassifiers().add(mixedBaseClass);
			} else {
				mixedBaseMixedAttr = (EReference)mixedBaseClass.getEStructuralFeature("mixed");
			}
		}
	}
	
	public boolean isMixed(EStructuralFeature feat) {
		//TODO: ... faster
		if (!"mixed".equals(feat.getName())) {
			return false;
		}
		if ((feat.getEType() instanceof EClass && mixedData.isSuperTypeOf((EClass)feat.getEType())) || (feat.getEType() != null && "EFeatureMapEntry".equals(feat.getEType().getName()))) {
			return true;
		}
		return false;
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
		ret.ecoreResources.add(ecoreResource);
		ret.readInBasicTarget(ecoreResource);
		ret.parseXmlEcoreBasic(ecoreResource, resourceSet, xmlResource.getURI(), ()->xmlResource.getAllContents(), false);
		return ret;
	}

	public static TransformatorStructure fromXmlEcore(TypeTransformatorStore store,
			ResourceSet resourceSet, Resource ecoreXmlResource, String targetFilename) {
		TransformatorStructure ret = new TransformatorStructure();
		ret.store = store;
		ret.xmlResource = ()->ecoreXmlResource.getAllContents();
		ret.parseXmlEcore(null,resourceSet,targetFilename==null?null:URI.createFileURI(targetFilename),ret.xmlResource, false);
		return ret;
	}
	
	public static TransformatorStructure fromXmlEcores(TypeTransformatorStore store,
			ResourceSet resourceSet, List<Resource> ecoreXmlResources, String targetFilename) {
		TransformatorStructure ret = new TransformatorStructure();
		ret.store = store;
		int ind = 0;
		for (Resource ecoreXmlResource: ecoreXmlResources) {
			ret.xmlResource = ()->ecoreXmlResource.getAllContents();
			ret.parseXmlEcore(null,resourceSet,targetFilename==null?null:URI.createFileURI(targetFilename+(++ind)+".ecore"),ret.xmlResource, false);
			
		}
		return ret;
	}
	
	public TransformatorStructure(TypeTransformatorStore store, ResourceSet resourceSet, Resource xmlResource) {
		this.store = store;
		this.xmlResource = ()->xmlResource.getAllContents();
		parseXmlEcore(null,resourceSet,URI.createURI(xmlResource.getURI()+"simplified"),this.xmlResource,false);
	}
	
	public TransformatorStructure(TypeTransformatorStore store, ResourceSet resourceSet, File xmlResourceFile, Iterable<EObject> xmlResource) {
		this.store = store;
		this.xmlResource = xmlResource;
		parseXmlEcore(null,resourceSet,URI.createFileURI(xmlResourceFile.getAbsolutePath()+".simple.ecore"),xmlResource,false);
	}
	
	private EAttribute commonIdAttribute = null;
	private EClass commonIdClass = null;
	
	private Map<EClass, EAttribute> realId = new HashMap<EClass, EAttribute>();
	//private Map<EAttribute, EReference> attributeToReference = new HashMap<>();
	//private Map<EReference, EAttribute> referenceToAttribute = new HashMap<>();
	
	private void buildChangers() {
		for (Entry<EAttribute,EAttributeTransformator> entry: xmlToEcoreAttr.entrySet()) {
//			EAttribute attr = entry.getKey(); // TODO remove unused?
			EAttributeTransformator tf = entry.getValue();
			PartialObjectCopier poc = new PartialObjectCopier() {
				
				@Override
				public void copyFrom(TransformatorImpl trans, EObject xmlObject, EObject ret) {
					//Workaround -  remove if ressource is always correct
					try {
					if (xmlObject.eIsSet(tf.getXml())) {
						Collection c = MyEcoreUtil.getAsCollection(xmlObject, tf.getXml());
						c = tf.convertToEcore(c);
						MyEcoreUtil.setAsCollectionBasic(ret,tf.getEcore(),c);
					} else {
						ret.eUnset(tf.getEcore());
					}
					} catch (IllegalArgumentException e) {
						EStructuralFeature esf = xmlObject.eClass().getEStructuralFeature(tf.getXml().getName());
						System.err.println(e.getMessage()+" => replaced by " + esf);
						if (esf != null) {
							if (xmlObject.eIsSet(esf)) {
								Collection c = MyEcoreUtil.getAsCollection(xmlObject, esf);
								c = tf.convertToEcore(c);
								MyEcoreUtil.setAsCollectionBasic(ret,tf.getEcore(),c);
							} else {
								ret.eUnset(tf.getEcore());
							}
						}
					}
				}
			};
			xmlToEcoreChanger.put(tf.getXml(),poc);
			xmlToEcoreChanger.put(tf.getEcore(),poc);
		}
		
		for (Entry<EAttribute,EAttributeTransformator> entry: ecoreToXmlAttr.entrySet()) {
//			EAttribute attr = entry.getKey(); // TODO remove unused?
			EAttributeTransformator tf = entry.getValue();
			PartialObjectCopier poc = new PartialObjectCopier() {
				
				@Override
				public void copyFrom(TransformatorImpl trans, EObject eobject, EObject ret) {
					if (eobject.eIsSet(tf.getEcore())) {
//						String bla = attr.getName(); // TODO remove unused?
						Collection c = MyEcoreUtil.getAsCollection(eobject, tf.getEcore());
						c = tf.convertToXml(c);
						MyEcoreUtil.setAsCollectionBasic(ret,tf.getXml(),c);
					} else {
						ret.eUnset(tf.getXml());
					}
				}
			};
			ecoreToXmlChanger.put(tf.getXml(),poc);
			ecoreToXmlChanger.put(tf.getEcore(),poc);
		}
		
		for (Entry<EReference,EReferenceTransformator> entry: xmlToEcoreRef.entrySet()) {
//			EReference ref = entry.getKey(); // TODO remove unused?
			EReferenceTransformator tf = entry.getValue();
//			ResourceSet rs; // TODO remove unused?
			PartialObjectCopier poc = new PartialObjectCopier() {
				
							@Override
							public void copyFrom(TransformatorImpl trans, EObject xmlObject, EObject ret) {
								try {
									if (xmlObject.eIsSet(tf.getXml())) {
										Collection c = MyEcoreUtil.getAsCollection(xmlObject, tf.getXml());
										c = tf.convertToEcore(c, trans);
										MyEcoreUtil.setAsCollectionBasic(ret,tf.getEcore(),c);
									} else {
										ret.eUnset(tf.getEcore());
									}
								} catch (IllegalArgumentException e) {
									EStructuralFeature esf = xmlObject.eClass().getEStructuralFeature(tf.getXml().getName());
									System.err.println(e.getMessage()+" => replaced by " + esf);
									if (esf != null) {
										if (xmlObject.eIsSet(esf)) {
											Collection c = MyEcoreUtil.getAsCollection(xmlObject, esf);
											c = tf.convertToEcore(c, trans);
											MyEcoreUtil.setAsCollectionBasic(ret,tf.getEcore(),c);
										} else {
											ret.eUnset(tf.getEcore());
										}
									}
								}
							}
				};
			xmlToEcoreChanger.put(tf.getXml(),poc);
			xmlToEcoreChanger.put(tf.getEcore(),poc);
		}
		
		for (Entry<EReference,EReferenceTransformator> entry: ecoreToXmlRef.entrySet()) {
//			EReference ref = entry.getKey(); // TODO remove unused?
			EReferenceTransformator tf = entry.getValue();
			PartialObjectCopier poc = new PartialObjectCopier() {
				
							@Override
							public void copyFrom(TransformatorImpl trans, EObject eobject, EObject ret) {
								if (eobject.eIsSet(tf.getEcore())) {
									Collection c = MyEcoreUtil.getAsCollection(eobject, tf.getEcore());
									c = tf.convertToXml(c, trans);
									MyEcoreUtil.setAsCollectionBasic(ret,tf.getXml(),c);
								} else {
									ret.eUnset(tf.getXml());
								}
							}
				};
				ecoreToXmlChanger.put(tf.getXml(),poc);
				ecoreToXmlChanger.put(tf.getEcore(),poc);
		}
		
	}
	
	private void calcId() {
		//Baue ï¿½berklasse ï¿½ber alle IDs
		List<EClass> allIdClasses = new ArrayList<EClass>();
		for (EClass ecl: ecoreToXmlClasses.keySet()) {
			for (EAttribute attr: ecl.getEAttributes()) {
				if (attr.isID()) {
					allIdClasses.add(ecl);
				}
			}
		}
		Set<EClass> allIdClassesSet = new HashSet<EClass>(allIdClasses);
		if (allIdClasses.isEmpty()) {
			//Nothing to do
			return;
		}
		//If there is only one, just pick the first ID you find and you are done!
		if (allIdClassesSet.size() == 1) {
			commonIdClass = allIdClasses.get(0);
			commonIdAttribute = commonIdClass.getEIDAttribute();
		} else {
			//Check if there is a superclass which is a superclass of all id classes
			Set<EClass> superClasses = new HashSet<EClass>();
			EClass first = allIdClasses.get(0);
			superClasses.add(first);
			superClasses.addAll(first.getEAllSuperTypes());
			for (int i = 1; i < allIdClasses.size(); ++i) {
				EClass cl = allIdClasses.get(i);
				Set<EClass> subSuper = new HashSet<EClass>(cl.getEAllSuperTypes());
				subSuper.add(cl);
				superClasses.retainAll(subSuper);
			}
			//All of these classes are candidates, but there must exist no class which has an attribute added due to that fact
			for (EClass cl: ecoreToXmlClasses.keySet()) {
				if (allIdClassesSet.contains(cl)) {
					continue;
				}
				Set<EClass> superTypes = new HashSet<>(cl.getEAllSuperTypes());
				superTypes.retainAll(allIdClassesSet);
				if (!superTypes.isEmpty()) {
					continue;
				}
				superClasses.remove(cl);
				superClasses.removeAll(cl.getEAllSuperTypes());
			}
			boolean idAttributeExisted = false;
			//Now you can arbitrarily pick one of the remaining candidates to add the ID attribute
			if (!superClasses.isEmpty()) {
				commonIdClass = superClasses.iterator().next();
			} else {
				//Create
				
				commonIdClass = (EClass)getIfExists("CommonIdClass");
				if (commonIdClass == null) {
					commonIdClass = EcoreFactory.eINSTANCE.createEClass();
					commonIdClass.setAbstract(true);
					commonIdClass.setName("CommonIdClass");
					ecorePackage.getEClassifiers().add(commonIdClass);
				} else {
					idAttributeExisted = true;
				}
			}
			
			Object commonIdAttributeO = getIfExists("CommonIdClass.name");
			if (commonIdAttributeO instanceof EAttribute) {
				commonIdAttribute = (EAttribute)commonIdAttributeO;
			} else {
				commonIdAttribute =	EcoreFactory.eINSTANCE.createEAttribute();
			}
			commonIdAttribute.setName("name"); //Good to provide an xtext ID!
			commonIdAttribute.setUnique(true);
			commonIdAttribute.setID(true);
			commonIdAttribute.setLowerBound(1);
			commonIdAttribute.setUpperBound(1);
			commonIdAttribute.setEType(EcorePackage.Literals.ESTRING);
			if (!idAttributeExisted) {
				commonIdClass.getEStructuralFeatures().add(commonIdAttribute);
			}
			for (EClass cl: ecoreToXmlClasses.keySet()) {
				realId.put(cl, cl.getEIDAttribute());
			}
			if (!idAttributeExisted) {
				for (EClass cl: allIdClasses) {
					EAttribute id = cl.getEIDAttribute();
					if (cl != commonIdClass) {
						if (id != null && id.getEContainingClass() == cl) {
							cl.getEStructuralFeatures().remove(id);
						}
						if (!cl.getEAllSuperTypes().contains(commonIdClass)) { 
							cl.getESuperTypes().add(commonIdClass);
						}
					}
				}
			}
		}
		
		//Whenever you have an attribute which is an IDREF, replace it by a reference
		for (Entry<EAttribute,EAttributeTransformator> entry: xmlToEcoreAttr.entrySet())  {
			EAttribute attr = entry.getKey();
			String attrEType = (attr.getEType() != null)?attr.getEType().getName():"";
			if ("IDREF".equals(attrEType)) {
				EAttribute ecoreAttr = entry.getValue().getEcore();
				EObject erefO = getIfExists(getEcoreClassName(attr.getEContainingClass())+"."+getEcoreAttributeName(attr));
				EReference ref = null;
				boolean hadReference = false;
				if (erefO instanceof EReference) {
				 ref = (EReference)erefO;
				 hadReference = true;
				} else {
				 ref = EcoreFactory.eINSTANCE.createEReference();
				 setSimple(ecoreAttr, ref);
				 ref.setName(ecoreAttr.getName());
				 ref.setEType(commonIdClass);
				}
				EReference fref = ref;
				
				//attributeToReference.put(ecoreAttr, ref);
				//referenceToAttribute.put(ref, ecoreAttr);
				if (!hadReference && ecoreAttr.getEContainingClass() != null) {
					int idx = ecoreAttr.getEContainingClass().getEStructuralFeatures().indexOf(ecoreAttr);
					ecoreAttr.getEContainingClass().getEStructuralFeatures().add(idx,ref);
					ecoreAttr.getEContainingClass().getEStructuralFeatures().remove(ecoreAttr);
				}
				//Konvertiere jedes Objekt in seine ID
				PartialObjectCopier poc = new PartialObjectCopier() {
					
					@Override
					public void copyFrom(TransformatorImpl transformator, EObject from, EObject to) {
						Collection c = MyEcoreUtil.getAsCollection(from, fref);
						List<Object> targetIds = new ArrayList<Object>();
						for (Object o: c) {
							EObject eo = (EObject)o;
							EAttribute idAttr = null;
							if (eo != null && eo.eClass() != null && eo.eClass().getEIDAttribute() != null) {
								idAttr = eo.eClass().getEIDAttribute();
							}
							Collection ids = MyEcoreUtil.getAsCollection(eo, idAttr);
							targetIds.addAll(ids);
						}
						MyEcoreUtil.setAsCollectionBasic(to, attr, targetIds);
					}
				};
				ecoreToXmlChanger.put(ref,poc);
				ecoreToXmlChanger.put(attr,poc);
				ecoreToXmlFeature.put(ref, attr);
				poc = new PartialObjectCopier() {
					
					@Override
					public void copyFrom(TransformatorImpl transformator, EObject from, EObject to) {
						Collection c = MyEcoreUtil.getAsCollection(from, attr);
						List<EObject> targetObjects = new ArrayList<>();
						for (Object o: c) {
							EObject eo = transformator.getXmlObject(String.valueOf(o));
							if (eo != null) {
								targetObjects.add(transformator.xml2Eobject(eo));
							}
						}
						MyEcoreUtil.setAsCollectionBasic(to, fref, targetObjects);
					}
				};
				xmlToEcoreChanger.put(attr, poc);
				xmlToEcoreChanger.put(ref, poc);
			}
			if (attr.isID()) {
				//Konvertiere jedes Objekt in seine ID
				PartialObjectCopier poc = new PartialObjectCopier() {
					
					@Override
					public void copyFrom(TransformatorImpl transformator, EObject from, EObject to) {
						Collection c = MyEcoreUtil.getAsCollection(from, commonIdAttribute);
						MyEcoreUtil.setAsCollectionBasic(to, to.eClass().getEIDAttribute(), c);
					}
				};
				ecoreToXmlChanger.put(commonIdAttribute,poc);
				ecoreToXmlChanger.put(attr,poc);
				poc = new PartialObjectCopier() {
					
					@Override
					public void copyFrom(TransformatorImpl transformator, EObject from, EObject to) {
						Collection c = MyEcoreUtil.getAsCollection(from, from.eClass().getEIDAttribute());
						MyEcoreUtil.setAsCollectionBasic(to, commonIdAttribute, c);
					}
				};
				xmlToEcoreChanger.put(attr, poc);
				xmlToEcoreChanger.put(commonIdAttribute, poc);
			}
		}
	}
	
	public void augmentWithStandardDatatypes() {
		//Whenever you have an attribute which is an IDREF, replace it by a reference
		for (Entry<EAttribute,EAttributeTransformator> entry: xmlToEcoreAttr.entrySet())  {
			EAttribute attr = entry.getKey();
			String attrEType = (attr.getEType() != null)?attr.getEType().getName():"";
			EAttribute ecoreAttr = entry.getValue().getEcore();
			if (ecoreAttr != null) {
				String name = attr.getEAttributeType().getName();
				String instanceClassName = attr.getEAttributeType().getInstanceClassName();
				System.out.println("Have attribute with name "+name+ " of type "+attrEType+" with instance class "+instanceClassName);
				//TODO: Warum ist das so? Gibt es auch andere unterschiede?
				if ("AnyURI".equals(attrEType)) {
					attrEType = "URI";
				}
				if (store.isStandardDatatype(attrEType)) {
					EAnnotation annot = ecoreAttr.getEAnnotation("http://big.tuwien.ac.at/standardXMLDatatype");
					if (annot == null) {
						ecoreAttr.getEAnnotations().add(annot = EcoreFactory.eINSTANCE.createEAnnotation());
						annot.setSource("http://big.tuwien.ac.at/standardXMLDatatype");
					}
					annot.getDetails().put("type",attrEType);
				}
			}
		}
	}
	
	public EAttribute transformatorEcoreAttribute(EClass cl, EAttribute base)  {
		if (base == commonIdAttribute) {
			return realId.getOrDefault(cl,base);  
		}
		return base;
	}
	
	
	public EAttribute getIdAttribute() {
		if (commonIdAttribute == null) {
			calcId();
		}
		return commonIdAttribute;
	}

	
	private List<Resource> ecoreResources = new ArrayList<Resource>();
	private Iterable<EObject> xmlResource;
	
	public EClass getEcoreEClass(EClass xml) {
		return xmlToEcoreClasses.get(xml);
	}
	
	public EClass getXmlEClass(EClass ecore) {
		return ecoreToXmlClasses.get(ecore);
	}
	
	
	public PartialObjectCopier getChangerForXml(EStructuralFeature ecorefeat) {
		return ecoreToXmlChanger.get(ecorefeat);
	}
	
	
	public PartialObjectCopier getChangerForEcore(EStructuralFeature xmlfeat) {
		return xmlToEcoreChanger.get(xmlfeat);
	}
	
	private EAttributeTransformator getTransformatorForXml(EAttribute xml) {
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
		if (trafo.getEcore().isID() && trafo.getEcore() != commonIdAttribute) {
			EAttributeTransformator ftrafo = trafo;
			return new EAttributeTransformator() {
				
				@Override
				public EAttribute getXml() {
					return xml;
				}
				
				@Override
				public CollectionValueTransformation getTransformation() {
					return ftrafo.getTransformation();
				}
				
				@Override
				public EAttribute getEcore() {
					return commonIdAttribute;
				}
			};
		}
		return trafo;
	}

	private EAttributeTransformator getTransformatorForEcore(EClass eClass, EAttribute ecore) {
		return ecoreToXmlAttr.get(transformatorEcoreAttribute(eClass,ecore));
	}
	

	private EReferenceTransformator getTransformatorForXml(EReference xml) {
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
	
	

	private EReferenceTransformator getTransformatorForEcore(EReference ecore) {
		return ecoreToXmlRef.get(ecore);
	}
	
	private boolean addedAnyAnnotations = false;
	private EClass documentRootClassXml;
	private EClass rootClassXml;
	private EClass rootClassEcore;
	private EReference rootReferenceXml;
	
	
	public void parseXmlEcoreBasic(Resource localEcore, ResourceSet resourceSet, URI targetEcoreUri, Iterable<EObject> xmlResource, boolean generateFile) {
		EPackage xmlEPkg = null;
		for (EObject eobj: xmlResource) {
			if (eobj instanceof EPackage) {
				xmlEPkg = (EPackage)eobj;
				resourceSet.getPackageRegistry().put(xmlEPkg.getNsURI(), eobj);
			}
		}
		ecorePackage = (EPackage)localEcore.getContents().get(0);

		List<EAttribute> eattrs = new ArrayList<>();
		List<EReference> erefs = new ArrayList<>();
		List<EClass> eclasses = new ArrayList<>();
		List<EEnum> eenums = new ArrayList<>();
		resourceSet.getPackageRegistry().put(ecorePackage.getNsURI(), ecorePackage);
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
				} else {
					//Analyze subclass
					documentRootClassXml = cl;
					rootReferenceXml = TransformatorImpl.getRootFeature(cl);
					rootClassXml = rootReferenceXml.getEReferenceType();
				}
				
			} else if (eobj instanceof EEnum) {
//				EEnum eenum = (EEnum)eobj; // TODO remove unused?
				EEnum targetEEnum = generateEEnum((EEnum)eobj);
				eenums.add(targetEEnum);
				//Ignore for now
			} else if (eobj instanceof EDataType) {
				//??
			} else if (eobj instanceof EAttribute) {
				//Have handled every important above?
			} else if (eobj instanceof EReference) {
				//Have handled every important above?
			}
		} 
		rootClassEcore =  xmlToEcoreClasses.get(rootClassXml);
		for (EClass key: eclasses) {
			if (!augmentEClassBasic(key, xmlToEcoreClasses.get(key))) {
				//TODO: Das stimmt so nicht ...
				xmlToEcoreClasses.remove(key);
			}
		}
		for (EAttribute attr: eattrs) {
			if (!augmentAttributeBasic(attr, xmlToEcoreAttribute.get(attr))) {
				xmlToEcoreAttribute.remove(attr);
			}
		}
		for (EReference key: erefs) {
			if (!augmentReferenceBasic(key, xmlToEcoreReferences.get(key))) {
				xmlToEcoreReferences.remove(key);
			}
		}
		
		buildChangers();
		calcId();
		augmentWithStandardDatatypes();
		
		if (generateFile) {
			try {
				int ind = 0;
				for (Resource ecoreRes: ecoreResources) {
					ecoreRes.save(new FileOutputStream("testoutput"+(++ind)+".ecore"),null);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void parseXmlEcore(Resource localECoreResource, ResourceSet resourceSet, /*String xmlEcoreName, */URI targetEcoreUri, Iterable<EObject> xmlResource, boolean generateFile) {
		EPackage xmlEPkg = null;
		for (EObject eobj: xmlResource) {
			if (eobj instanceof EPackage) {
				xmlEPkg = (EPackage)eobj;
				resourceSet.getPackageRegistry().put(xmlEPkg.getNsURI(), eobj);
			}
		}
		if (xmlEPkg == null) {
			for (EObject eobj: xmlResource) {
				System.out.println("Found object: "+eobj);
			}	
		}
		if (localECoreResource == null) { 
			localECoreResource = targetEcoreUri==null?new XMIResourceImpl(): new XMIResourceImpl(
					resourceSet.getURIConverter().normalize(targetEcoreUri)
					);
			this.ecoreResources.add(localECoreResource);
			
			ecorePackage = EcoreFactory.eINSTANCE.createEPackage();
			ecorePackage.setNsURI(xmlEPkg.getNsURI()+"simplified");
			//epkg.setNsURI(xmlEPkg.getNsURI()+"-simplified");
			//String xmlEcoreShortName = xmlEcoreName.split("\\.", 2)[0];
			ecorePackage.setName((xmlEPkg.getName()+"Simplified").replace(".", ""));
			ecorePackage.setNsPrefix(xmlEPkg.getNsPrefix()+"s");
			localECoreResource.getContents().add(ecorePackage);
		} else {
			ecorePackage = (EPackage)localECoreResource.getContents().get(0);
		}

		List<EAttribute> eattrs = new ArrayList<>();
		List<EReference> erefs = new ArrayList<>();
		List<EClass> eclasses = new ArrayList<>();
		List<EEnum> eenums = new ArrayList<>();
		resourceSet.getPackageRegistry().put(ecorePackage.getNsURI(), ecorePackage);
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
					ecorePackage.getEClassifiers().add(ecoreClass);
				} else {
					//Analyze subclass
					
					if (rootReferenceXml == null) {
						rootReferenceXml = TransformatorImpl.getRootFeature(cl);
						if (rootReferenceXml != null) {
							rootClassXml = rootReferenceXml.getEReferenceType();
							documentRootClassXml = cl;
						}
					}
				}
				
			} else if (eobj instanceof EEnum) {
//				EEnum eenum = (EEnum)eobj; // TODO remove unused?
				EEnum targetEEnum = generateEEnum((EEnum)eobj);
				ecorePackage.getEClassifiers().add(targetEEnum);
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
			EAnnotation annot = ecorePackage.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore");
			if (annot == null) {
				annot = EcoreFactory.eINSTANCE.createEAnnotation();
				annot.setSource("http://www.eclipse.org/emf/2002/Ecore");
				ecorePackage.getEAnnotations().add(annot);
			}
			annot.getDetails().put("invocationDelegates","http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			annot.getDetails().put("settingDelegates","http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			annot.getDetails().put("validationDelegates","http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		}
		buildChangers();
		calcId();
		augmentWithStandardDatatypes();

		
		if (generateFile) {
			try {
				int ind = 0;
				for (Resource ecoreRes: ecoreResources) {
					ecoreRes.save(new FileOutputStream("testoutput"+(++ind)+".ecore"),null);
				}
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
		parseXmlEcore(null,resourceSet, URI.createFileURI(xmlEcore.getAbsolutePath()+".simple.ecore"),  xmlResource, true);
		
		
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
					// 162 occurrences in eclass case study, but where do they all come from? there are only 84 occurrences of restrictions, which are not enumerations or length, and 143 in total
					EAnnotation typeAnnotation = ((EClass) xmlAttr.eContainer()).getEAnnotations().get(0);					
					restrictedDatatypes.put(typeAnnotation.getDetails().get("name"), xmlAttr.getEAttributeType().getName()); 
					
					String constraintName = "pattern"+toFirstUpper(ecoreAttr.getName());
					String constraintValue = null;
					constraintValue = ".matches('"+StringEscapeUtils.unescapeXml(pattern).replace("%20"," ").replace("\\", "\\\\").replace("'", "\\\"")+"')";
					
					String[] baseConstraintValues = pattern.split("\\ ");
				    StringBuilder totalValue = new StringBuilder();
				    for (int bc = 0; bc < baseConstraintValues.length; ++bc) {
				    	if (bc > 0) {
				    		totalValue.append(" or ");
				    	}

				    	String spattern = baseConstraintValues[bc];
				      	constraintValue = ".matches('"+StringEscapeUtils.unescapeXml(spattern).replace("%20"," ").replace("\\", "\\\\").replace("'", "\\\"")+"')";
				      	String newValue = prepend+constraintValue+postpend;
				      	totalValue.append(newValue); 
				    }
				    String totalString = totalValue.toString();
				    if (xmlAttr.getLowerBound() == 0 && !xmlAttr.isMany() && baseConstraintValues.length > 0) {
				    	totalString = "("+prepend+"=null) or "+totalString;
				    }
				    additonal.getDetails().put(constraintName, totalString);
					curConstraints = curConstraints+ " "+constraintName;
					
				}
				String minLength = dataTypeAnnot.getDetails().get("minLength");
				if (minLength != null) {
					String constraintName = "minLength"+toFirstUpper(ecoreAttr.getName());
					String constraintValue = ".size() >= "+minLength;
					String prefix = (!xmlAttr.isMany()&&xmlAttr.getLowerBound()==0)?("("+prepend + " = null) or " + prepend):prepend;
					additonal.getDetails().put(constraintName, prefix+constraintValue+postpend);
					curConstraints = curConstraints+ " "+constraintName;
				}
				String maxLength = dataTypeAnnot.getDetails().get("maxLength");
				if (maxLength != null) {
					String constraintName = "maxLength"+toFirstUpper(ecoreAttr.getName());					
					String constraintValue = ".size() <= "+maxLength;
					String prefix = (!xmlAttr.isMany()&&xmlAttr.getLowerBound()==0)?("("+prepend + " = null) or " + prepend):prepend;
					additonal.getDetails().put(constraintName, prefix+constraintValue+postpend);
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
				backEEnumLiteralStr.put(from.getName()+"."+lit.getLiteral(), lit);
				target.setLiteral(lit.getLiteral());
				target.setName(lit.getName());
				target.setValue(lit.getValue());
			}
			ret.getELiterals().add(target);
		}
		return ret;			
	}
	
	public ValueTransformator<Object, Object> eenumTransformator(EEnum forEEnum) {
		return new ValueTransformator<Object,Object>() {

			@Override
			public Object convertToEcore(Object xml) {
				System.err.println("Convert to ecore needs to be reworked: was enumliteral->enumliteral, but appearanly others can be there too");
				Object ret = copiedEEnumLiterals.get(xml);
				if (ret == null && xml instanceof EEnumLiteral) {
					String fragment = ((EEnumLiteral)xml).eResource().getURIFragment((EEnumLiteral)xml);
					EObject eobj = fragmentToXmlObject.get(fragment);
					ret = copiedEEnumLiterals.get(eobj);
				} else {
//					ret = ret;//xml; //Try?? TODO remove no-effect statement?
				}
				return ret;
			}

			@Override
			public Object convertToXml(Object eobject) {
				Object ret = backEEnumLiteral.get(eobject);
				if (ret == null && eobject instanceof Enumerator) {
					Enumerator enumerator = (Enumerator)eobject;
					String totalStr = forEEnum.getName()+"."+enumerator.getLiteral();
					ret = backEEnumLiteralStr.get(totalStr);
				}
				return ret;
			}
		};
	}

		
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
									EEnumLiteral.class, eenumTransformator(targetEEnum)));
					xmlToEcoreAttr.put(xmlAttribute, tfi);
					ecoreToXmlAttr.put(ecoreAttribute, tfi);
					return true;
				}
			}
			CollectionValueTransformation trafo = store.getValueTransformationOrNull(xmlAttribute);
			if (trafo == null) {
				Boolean ret = checkMixedAttribute(contCl,xmlAttribute);
				if (ret != null) {
					return ret;
				}
				System.err.println("No transformation found for "+xmlAttribute);				
				return false;
			}
			EAttributeTransformatorImpl tfi = new EAttributeTransformatorImpl(xmlAttribute, ecoreAttribute, trafo);
			xmlToEcoreAttr.put(xmlAttribute, tfi);
			ecoreToXmlAttr.put(ecoreAttribute, tfi);
			return true;
		}
		
		
	//There is no need to be a 1:1 correspondance!
	public EStructuralFeature getXmlFeature(EStructuralFeature ecoreFeature) {
		//Check id
		if (java.util.Objects.equals(ecoreFeature,commonIdAttribute)) {
			ecoreFeature = realId.getOrDefault(ecoreFeature,(EAttribute)ecoreFeature);
		}
		//Check reference  - not necessary, I added it to ecoreToXmlFeature!
		return ecoreToXmlFeature.get(ecoreFeature);
	}
		
	public Object getXmlValue(EObject eobj, EStructuralFeature ecoreFeature, int index) {
		Collection col = MyEcoreUtil.getAsCollection(eobj, getXmlFeature(ecoreFeature));
		if (col instanceof List) {
			return ((List)col).get(index);
		} else {
			Object ret = null;
			Iterator iter = col.iterator();
			while (index >= 0) {
				if (iter.hasNext()) {
					ret = iter.next();
				} else {
					if (ecoreFeature instanceof EAttribute) {
						EDataType dt = ((EAttribute)ecoreFeature).getEAttributeType();
						ret = dt.getDefaultValue();
					} else {
						EReference ref = (EReference)ecoreFeature;
						ret = MyEcoreUtil.createInstanceStatic(ref.getEReferenceType());
					}
				}
				
				--index;
			}
			return ret;
		}
		
	}
	
	public Boolean checkMixedAttribute(EClass contCl, EAttribute xmlAttribute) {
		EDataType dt = xmlAttribute.getEAttributeType();
		if (dt != null && "EFeatureMapEntry".equals(dt.getName()) && "mixed".equals(xmlAttribute.getName())) {
			generateMixClasses();
			contCl.getESuperTypes().add(mixedBaseClass);
			PartialObjectCopier poc = new PartialObjectCopier() {
				
				@Override
				public void copyFrom(TransformatorImpl transformator, EObject from, EObject to) {
					//This must NOT refer to ecoreAttribute!! //TODO: Store in a map or something like that ...
					//Because there is only one target attribute
					EStructuralFeature ecoreAttribute = from.eClass().getEStructuralFeature("mixed");
					Collection c = MyEcoreUtil.getAsCollection(from, ecoreAttribute);
					Collection t = MyEcoreUtil.getAsCollection(to, mixedBaseMixedAttr);
					t.clear();
					for (Object o: c) {
						FeatureMap.Entry entry = (FeatureMap.Entry)o;
						EStructuralFeature esf = entry.getEStructuralFeature();
						if (esf.getEContainingClass().isSuperTypeOf(from.eClass())) {
							//It is a class attribute
							EObject feature = MyEcoreUtil.createInstanceStatic(mixedFeature);
							feature.eSet(mixedValueAttr, getTargetName(esf));
							t.add(feature);
						} else if ("text".equals(esf.getName())) { //TODO: Improve filtering
							//It is a string literal
							EObject feature = MyEcoreUtil.createInstanceStatic(mixedText);
							feature.eSet(mixedValueAttr, entry.getValue());
							t.add(feature);
						} else {
							//TODO: Implement me
							throw new RuntimeException(new UnsupportedDataTypeException("I currently only support text features and owned structural features in mixed content"));
						}							
					}
				}
			};
			//1. Add Object-Delta of this object (!) - this is automatically done by other methods
			//2. Add Feature-Map-Delta of this object, so this POC has to be executed last
			//Ist ok, da das Attribut bekannt ist, kann man es ja im transformer spï¿½ter ausfï¿½hren, muss nur
			//das letzte pro objekt sein!
			xmlToEcoreChanger.put(xmlAttribute, poc);
			xmlToEcoreChanger.put(mixedBaseMixedAttr, poc);
			
			PartialObjectCopier ecoreToXmlPoc = new PartialObjectCopier() {
				
				@Override
				public void copyFrom(TransformatorImpl transformator, EObject ecore, EObject xml) {
					//This must NOT use any of this attributes since it must be generic!
					Collection c = MyEcoreUtil.getAsCollection(ecore, mixedBaseMixedAttr);
					EStructuralFeature xmlFeature = xml.eClass().getEStructuralFeature("mixed");
					List t = new ArrayList<>();
					//TODO: Berï¿½cksichtige gleich, wenn das target eine Sequence ist ...
					Map<EStructuralFeature,Integer> usedIndices = new HashMap<EStructuralFeature, Integer>();
					for (Object o: c) {
						EObject eo = (EObject)o;
						if (mixedFeature.isSuperTypeOf(eo.eClass())) {
							EStructuralFeature ecorefeat = ecore.eClass().getEStructuralFeature((String)eo.eGet(mixedValueAttr));
							//Jetzt brauche ich aber den korrespondierenden Wert (und das korrespondierende Feature)
							//Wenn es eine Referenz ist, ist das vielleicht nicht gespeichert
							EStructuralFeature xmlFeat = getXmlFeature(ecorefeat);
							Integer index = usedIndices.getOrDefault(xmlFeat, 0);
							Object value = getXmlValue(xml, ecorefeat, index);
							FeatureMap.Entry entry = FeatureMapUtil.createEntry(xmlFeat, value);
							usedIndices.put(xmlFeat, index+1);
							t.add(entry);
						} else if (mixedText.isSuperTypeOf(eo.eClass())) {
							FeatureMap.Entry entry = FeatureMapUtil.createTextEntry((String)eo.eGet(mixedValueAttr));
							t.add(entry);
						}
					}
					//Add remaining features
					for (EStructuralFeature esf: xml.eClass().getEAllStructuralFeatures()) {
						if (isMixed(esf)) {continue;}
						Integer curIndex = usedIndices.getOrDefault(esf, 0);
						Collection col = MyEcoreUtil.getAsCollection(xml, esf);
						Iterator iter = col.iterator();
						int lind = 0;
						while (iter.hasNext() && lind < curIndex) {
							iter.next();
						}
						while(iter.hasNext()) {
							FeatureMap.Entry entry = FeatureMapUtil.createEntry(esf, iter.next());
							t.add(entry);
						}
					}
					MyEcoreUtil.setAsCollectionBasic(xml, xmlFeature, t);
				}
			}; 
			
			ecoreToXmlChanger.put(xmlAttribute, ecoreToXmlPoc);
			ecoreToXmlChanger.put(mixedBaseMixedAttr, ecoreToXmlPoc);
			
			return false; //Remove this attribute because it is replaced!
		}
		return null;
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
								EEnumLiteral.class, eenumTransformator(targetEEnum)));
				xmlToEcoreAttr.put(xmlAttribute, tfi);
				ecoreToXmlAttr.put(ecoreAttribute, tfi);
//				EObject eobj; // TODO remove unused?
				
				return true;
			}
		}
		CollectionValueTransformation trafo = store.getValueTransformationOrNull(xmlAttribute);
		if (trafo == null) {
			//Check special case: mixed + EFeatureMapEntry
			Boolean ret = checkMixedAttribute(contCl,xmlAttribute);
			if (ret != null) {
				return ret;
			}
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
			System.err.println("No matching type found for "+xmlReference.getEContainingClass().getName()+"."+xmlReference.getName()+" ("+xmlReference.getEReferenceType()+")");
			return false;
		}
		EReferenceTransformatorImpl tfi = new EReferenceTransformatorImpl(xmlReference, ecoreReference,
				new SingleBasedCollectionObjectTransformation(new InformatedSingleObjectTransformation(xmlReference.getEReferenceType(),
						ecoreReference.getEReferenceType(), matchingObjectTransformation)));
		xmlToEcoreRef.put(xmlReference, tfi);
		ecoreToXmlRef.put(ecoreReference, tfi);
		//contCl.getEStructuralFeatures().add(ecoreReference);
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
			System.err.println("No matching type found for "+xmlReference.getEContainingClass().getName()+"."+xmlReference.getName()+" ("+xmlReference.getEReferenceType()+")");
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
	
	public String getEcoreAttributeName(EStructuralFeature xmlFeature) {
		return getTargetName(xmlFeature);
	}
	
	
	
	
	public EAttribute generateShallowAttribute(EClass xmlClass, EClass ecoreClass, EAttribute xmlAttribute) {
		String featName = getTargetName(xmlAttribute);
		Object existing = getIfExists(ecoreClass.getName()+"."+featName);
		EAttribute target = (existing instanceof EAttribute)?((EAttribute)existing):null;
		if (target == null) {
			target = EcoreFactory.eINSTANCE.createEAttribute();
			target.setName(featName);
			setSimple(xmlAttribute, target);
			target.setID(xmlAttribute.isID());
		}
		ecoreToXmlFeature.put(target, xmlAttribute);
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
		ecoreToXmlFeature.put(target, xmlReference);
		return target;
	}
	
	public String getEcoreClassName(EClass xmlClass) {
		String targetName = xmlClass.getName(); 
		if (targetName.endsWith("Type")) {
			//targetName = targetName.substring(0,targetName.length()-"Type".length());
		}
		return targetName;
	}
	
	public EClass generateShallowEClass(EClass xmlClass) {
		String targetName = getEcoreClassName(xmlClass);
		EClass target = (EClass)getIfExists(targetName);
		if (target == null) {
			target = EcoreFactory.eINSTANCE.createEClass();
			target.setName(targetName);
		}
		return target;
	}
	
	// TODO move this to a test class
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


	public List<Resource> getEcoreResources() {
		return ecoreResources;
	}

}
