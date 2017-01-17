package at.ac.tuwien.big.xmltext.ecoretransform.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmltext.ecoretransform.EAttributeTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.EReferenceTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.Transformator;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class OneToOneTransformator implements Transformator {

	
	private Resource xml;
	private Resource ecore;
	private TransformatorStructure structure;
	
	public OneToOneTransformator(Resource source, Resource target) {
		this.xml = source;
		this.ecore = target;
		this.structure = new TransformatorStructure(source,target);
	}
	
	private Map<EObject,EObject> xmlToEcore = new HashMap<EObject, EObject>();
	private Map<EObject,EObject> ecoreToXml = new HashMap<EObject, EObject>();
	
	private Set<EObject> fullTransformed = new HashSet<>();
	
	public void clearCompleted() {
		fullTransformed.clear();
	}
	

	@Override
	public EObject xml2Eobject(EObject xmlObject) {
		if (xmlObject == null) {
			return null;
		}
		EObject ret = xmlToEcore.get(xmlObject);
		if (ret == null) {
			EClass targetClass = (EClass)ecore.getEObject(xml.getURIFragment(xmlObject));
			ret = MyEcoreUtil.createInstanceStatic(targetClass);
			xmlToEcore.put(xmlObject, ret);
			ecoreToXml.put(ret, xmlObject);
		}
		if (fullTransformed.add(ret)) {
			for (EAttribute attr: ret.eClass().getEAllAttributes()) {
				EAttribute srcAttr = (EAttribute)xml.getEObject(ecore.getURIFragment(attr));
				Collection c = MyEcoreUtil.getAsCollection(xmlObject, srcAttr);
				MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
			}
			for (EReference attr: ret.eClass().getEAllReferences()) {
				EReferenceTransformator tf = structure.getTransformatorForXml(attr);
				if (tf != null) {
					Collection c = MyEcoreUtil.getAsCollection(xmlObject, tf.getXml());
					c = tf.convertToEcore(c, this);
					MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
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
			ret = MyEcoreUtil.createInstanceStatic(retClass);
			ecoreToXml.put(eobject, ret);
			xmlToEcore.put(ret, eobject);
		}
		if (fullTransformed.add(ret)) {
			for (EAttribute attr: ret.eClass().getEAllAttributes()) {
				EAttributeTransformator tf = structure.getTransformatorForEcore(ret.eClass(),attr);
				if (tf != null) {
					Collection c = MyEcoreUtil.getAsCollection(eobject, tf.getEcore());
					c = tf.convertToXml(c);
					MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
				}
			}
			for (EReference attr: ret.eClass().getEAllReferences()) {
				EReferenceTransformator tf = structure.getTransformatorForEcore(attr);
				if (tf != null) {
					Collection c = MyEcoreUtil.getAsCollection(eobject, tf.getEcore());
					c = tf.convertToXml(c, this);
					MyEcoreUtil.setAsCollectionBasic(ret,attr,c);
				}
			}
		}
		return ret;
	}

	
}
