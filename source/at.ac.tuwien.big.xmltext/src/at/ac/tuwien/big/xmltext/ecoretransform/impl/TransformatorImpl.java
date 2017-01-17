package at.ac.tuwien.big.xmltext.ecoretransform.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.rowset.spi.XmlReader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmltext.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.xmltext.ecoretransform.EAttributeTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.EReferenceTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.PartialObjectCopier;
import at.ac.tuwien.big.xmltext.ecoretransform.Transformator;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class TransformatorImpl implements Transformator {
	
	private TransformatorStructure structure;
	
	public TransformatorImpl(TransformatorStructure struct) {
		this.structure = struct;
	}
	
	private Map<EObject,EObject> xmlToEcore = new HashMap<EObject, EObject>();
	private Map<EObject,EObject> ecoreToXml = new HashMap<EObject, EObject>();
	private Map<Object,EObject> xmlObjectsById = new HashMap<>();
	
	public EObject getXmlObject(String id) {
		return xmlObjectsById.get(id);
	}
	
	private Resource ecore;
	private Resource xml;
	
	private Set<EObject> fullTransformed = new HashSet<>();
	
	public void clearCompleted() {
		fullTransformed.clear();
	}
	
	public static EReference getRootFeature(EClass documentRootClass) {
		for (EReference ref: documentRootClass.getEAllReferences()) {
			if (ref.getEType() instanceof EClass)  {
				EClass cl = (EClass)ref.getEType();
				if ("java.util.Map$Entry".equals(cl.getInstanceClassName())) {
					continue;
				}
				return ref;
			}
		}
		return null;
	}

	public void xmlToEcore(Resource xml, Resource ecore) {
		this.ecore = ecore;
		this.xml = xml;
		Collection<EObject> eobjs = xml.getContents();
		for (EObject eobj: (Iterable<EObject>)()->xml.getAllContents()) {
			if (eobj.eClass() != null) {
				EClass cl = eobj.eClass();
				EAttribute idAttr = cl.getEIDAttribute();
				if (idAttr != null) {
					for (Object o: MyEcoreUtil.getAsCollection(eobj, idAttr)) {
						xmlObjectsById.put(o, eobj);
					}
				}
			}
		}
		ecore.getContents().clear();
		for (EObject eobj: eobjs) {
			if ("DocumentRoot".equals(eobj.eClass().getName())) {
				//Must be a classifier
				EReference ref = getRootFeature(eobj.eClass());
				if (ref != null) {
						//ok
					Collection c = MyEcoreUtil.getAsCollection(eobj, ref);
					for (Object o: c) {
						ecore.getContents().add(xml2Eobject((EObject)o));
					}
				}
			} else {
				ecore.getContents().add(xml2Eobject(eobj));
			}
		}
	}
	
	public void ecoreToXml(Resource ecore, Resource xml) {
		this.ecore = ecore;
		this.xml = xml;
		Collection<EObject> eobjs = ecore.getContents();
		Collection<EObject> eobjs2 = xml.getContents();
		EObject root = null;
		EReference rootFeature = null;
		for (EObject eobj2: eobjs2) {
			if ("DocumentRoot".equals(eobj2.eClass().getName())) {
				root = eobj2;
				rootFeature = getRootFeature(eobj2.eClass());
			}
		}
		List<EObject> transformed = new ArrayList<>();
		for (EObject eobj: eobjs) {
			transformed.add(eobject2xml(eobj));
		}
		if (rootFeature != null) {	
			MyEcoreUtil.setAsCollectionBasic(root, rootFeature, transformed);
		} else {
			xml.getContents().clear();
			xml.getContents().addAll(transformed);
		}
	}

	@Override
	public EObject xml2Eobject(EObject xmlObject) {
		if (xmlObject == null) {
			return null;
		}
		EClass corrClass = xmlObject.eClass();
		EClass retClass = structure.getEcoreEClass(corrClass);
		if (retClass == null) {
			//Try to find resource with same URI
			String fragment = xmlObject.eClass().eResource().getURIFragment(corrClass);
			corrClass = (EClass)structure.getXmlEObject(fragment);
			retClass = structure.getEcoreEClass(corrClass);
			if (retClass == null) {
				System.err.println("Cannot transform "+xmlObject+" - no retclass found!");
			} else {
				System.err.println("Wrong resource for "+xmlObject+" "+xmlObject.eClass().eResource() + " VS "+corrClass.eResource());
			}
		}
		EObject ret = xmlToEcore.get(xmlObject);
		if (ret == null) {
			ret = MyEcoreUtil.createInstanceStatic(retClass);
			xmlToEcore.put(xmlObject, ret);
			ecoreToXml.put(ret, xmlObject);
		}
		if (fullTransformed.add(ret)) {
			List<EStructuralFeature> defer = new ArrayList<EStructuralFeature>();
			for (EStructuralFeature attr: ret.eClass().getEAllStructuralFeatures()) {
				if (structure.isMixed(attr)) {
					defer.add(attr);
					continue;
				}
				PartialObjectCopier changer  = structure.getChangerForEcore(attr);
				if (changer != null) {
					changer.copyFrom(this, xmlObject, ret);
				}
			}
			for (EStructuralFeature attr: defer) {
				PartialObjectCopier changer  = structure.getChangerForEcore(attr);
				if (changer != null) {
					changer.copyFrom(this, xmlObject, ret);
				}
			}
			/*
			for (EAttribute attr: ret.eClass().getEAllAttributes()) {
				EAttributeTransformator tf = structure.getTransformatorForEcore(ret.eClass(),attr);
				if (tf != null) {
					if (xmlObject.eIsSet(tf.getXml())) {
						Collection c = MyEcoreUtil.getAsCollection(xmlObject, tf.getXml());
						c = tf.convertToEcore(c);
						MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
					} else {
						ret.eUnset(tf.getEcore());
					}
				}
			}
			for (EReference attr: ret.eClass().getEAllReferences()) {
				EReferenceTransformator tf = structure.getTransformatorForEcore(attr);
				if (tf != null) {
					if (xmlObject.eIsSet(tf.getXml())) {
						Collection c = MyEcoreUtil.getAsCollection(xmlObject, tf.getXml());
						c = tf.convertToEcore(c, this);
						MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
					} else {
						ret.eUnset(tf.getEcore());
					}
				}
			}*/
		}
		return ret;
	}

	@Override
	public EObject eobject2xml(EObject eobject) {
		if (eobject == null) {
			return null;
		}
		EClass retClass = structure.getXmlEClass(eobject.eClass());
		if (retClass == null) {
			EClass cl = eobject.eClass();
			
			System.err.println("Cannot transform "+eobject+" - no retclass found!");
		}
		EObject ret = ecoreToXml.get(eobject);
		if (ret == null) {
			ret = MyEcoreUtil.createInstanceStatic(retClass);
			ecoreToXml.put(eobject, ret);
			xmlToEcore.put(ret, eobject);
		}
		if (fullTransformed.add(ret)) {
			List<EStructuralFeature> defer = new ArrayList<EStructuralFeature>();
			for (EStructuralFeature attr: ret.eClass().getEStructuralFeatures()) {
				if (structure.isMixed(attr)) {
					defer.add(attr);
					continue;
				}
				PartialObjectCopier changer = structure.getChangerForXml(attr);
				if (changer != null) {
					changer.copyFrom(this, eobject, ret);
				}
			}
			for (EStructuralFeature attr: defer) {
				PartialObjectCopier changer = structure.getChangerForXml(attr);
				if (changer != null) {
					changer.copyFrom(this, eobject, ret);
				}
			}	
			/**/
		}
		return ret;
	}

	public Resource getEcoreResource() {
		return ecore;
	}
	
	public Resource getXmlResource() {
		return xml;
	}
	
	public List<EObject> getEcoreContents() {
		return ecore.getContents();
	}

	public void xmlToEcore() {
		xmlToEcore(getXmlResource(), getEcoreResource());
	}

	public void ecoreToXml() {
		ecoreToXml(getEcoreResource(), getXmlResource());
	}


}
