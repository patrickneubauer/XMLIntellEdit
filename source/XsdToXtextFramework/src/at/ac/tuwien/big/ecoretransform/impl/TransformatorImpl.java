package at.ac.tuwien.big.ecoretransform.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.rowset.spi.XmlReader;

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

import at.ac.tuwien.big.autoedit.ecore.util.MyEcoreUtil;
import at.ac.tuwien.big.autoedit.ecore.util.MyResource;
import at.ac.tuwien.big.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.ecoretransform.EAttributeTransformator;
import at.ac.tuwien.big.ecoretransform.EReferenceTransformator;
import at.ac.tuwien.big.ecoretransform.Transformator;

public class TransformatorImpl implements Transformator {
	
	private TransformatorStructure structure;
	
	public TransformatorImpl(TransformatorStructure struct) {
		this.structure = struct;
	}
	
	private Map<EObject,EObject> xmlToEcore = new HashMap<EObject, EObject>();
	private Map<EObject,EObject> ecoreToXml = new HashMap<EObject, EObject>();
	
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
		Collection<EObject> eobjs = xml.getContents();
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
			ret = structure.getMyEcore().createInstance(retClass);
			xmlToEcore.put(xmlObject, ret);
			ecoreToXml.put(ret, xmlObject);
		}
		if (fullTransformed.add(ret)) {
			for (EAttribute attr: ret.eClass().getEAllAttributes()) {
				EAttributeTransformator tf = structure.getTransformatorForEcore(attr);
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
			}
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
			System.err.println("Cannot transform "+eobject+" - no retclass found!");
		}
		EObject ret = ecoreToXml.get(eobject);
		if (ret == null) {
			ret = MyResource.createInstanceStatic(retClass);
			ecoreToXml.put(eobject, ret);
			xmlToEcore.put(ret, eobject);
		}
		if (fullTransformed.add(ret)) {
			for (EAttribute attr: ret.eClass().getEAllAttributes()) {
				EAttributeTransformator tf = structure.getTransformatorForXml(attr);
				if (tf != null) {
					if (eobject.eIsSet(tf.getEcore())) {
						Collection c = MyEcoreUtil.getAsCollection(eobject, tf.getEcore());
						c = tf.convertToXml(c);
						MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
					} else {
						ret.eUnset(tf.getXml());
					}
				}
			}
			for (EReference attr: ret.eClass().getEAllReferences()) {
				EReferenceTransformator tf = structure.getTransformatorForXml(attr);
				if (tf != null) {
					if (eobject.eIsSet(tf.getEcore())) {
						Collection c = MyEcoreUtil.getAsCollection(eobject, tf.getEcore());
						c = tf.convertToXml(c, this);
						MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
					} else {
						ret.eUnset(tf.getXml());
					}
				}
			}
		}
		return ret;
	}


}
