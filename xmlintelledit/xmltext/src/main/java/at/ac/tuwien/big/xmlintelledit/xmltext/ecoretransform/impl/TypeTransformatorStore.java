package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.SingleValueTransformation;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.ValueTransformator;
import dk.brics.automaton.Datatypes;

@SuppressWarnings({"rawtypes", "unchecked"})
public class TypeTransformatorStore {
	
	private Map<Class<?>, SingleValueTransformation<?, ?>> attributeTransformators = new HashMap<>();
	
	{
		//Default transformators
		//Identity
		addIdentity(Integer.class,String.class,Boolean.class,Character.class,Long.class,int.class,boolean.class,char.class,long.class);
		addTransformator(BigInteger.class,
				Long.class, new ValueTransformator<BigInteger, Long>() {

					@Override
					public Long convertToEcore(BigInteger eobject) {
						return eobject.longValue();
					}

					@Override
					public BigInteger convertToXml(Long xml) {
						return BigInteger.valueOf(xml);
					}
				});
		//TODO: Besser ...
		try {
		addTransformator(javax.xml.datatype.XMLGregorianCalendar.class,
				String.class, new ValueTransformator<javax.xml.datatype.XMLGregorianCalendar, String>() {

					@Override
					public String convertToEcore(XMLGregorianCalendar xml) {
						return xml.toXMLFormat();
					}

					@Override
					public XMLGregorianCalendar convertToXml(String eobject) {
						//TODO: Das stimmt so nicht ...
						return new XMLCalendar(eobject, XMLCalendar.DATETIME);
					}
				});
		} catch (Throwable t) {
			t.printStackTrace();
			System.err.println("Could not add calendar type: "+t.getMessage());
		}
	}
	
	private Map<Class<?>,EDataType> defaultDatatypes = new HashMap<>();
	{
		addDatatype(EcorePackage.Literals.EBIG_DECIMAL);
		addDatatype(EcorePackage.Literals.EBIG_INTEGER);
		addDatatype(EcorePackage.Literals.EBOOLEAN);
		addDatatype(EcorePackage.Literals.EBOOLEAN_OBJECT);
		addDatatype(EcorePackage.Literals.EBYTE);
		addDatatype(EcorePackage.Literals.ECHAR);
		addDatatype(EcorePackage.Literals.EDATE);
		addDatatype(EcorePackage.Literals.EDOUBLE);
		addDatatype(EcorePackage.Literals.EDOUBLE_OBJECT);
		addDatatype(EcorePackage.Literals.EFLOAT);
		addDatatype(EcorePackage.Literals.EINT);
		addDatatype(EcorePackage.Literals.EINTEGER_OBJECT);
		addDatatype(EcorePackage.Literals.ESHORT);
		addDatatype(EcorePackage.Literals.ESHORT_OBJECT);
		addDatatype(EcorePackage.Literals.ESTRING);
		addDatatype(EcorePackage.Literals.ECHARACTER_OBJECT);
	}
	
	public void addDatatype(EDataType type) {
		this.defaultDatatypes.put(type.getInstanceClass(), type);
	}
	
	public void addIdentity(Class... cls) {
		for (Class cl: cls) {
			addTransformator(cl, cl, IdentityValueTransformator.getInstance());
		}
	}
		
	public<T,U> void addTransformator(Class<T> xml, Class<U> ecore, ValueTransformator<T, U> transformator) {
		this.attributeTransformators.put(xml, new SingleValueTransformationImpl<>(xml, ecore, transformator));
	}
	
	public CollectionValueTransformation<?,?> getIdentityValueTransformation(EAttribute src, EAttribute target) {
		EDataType cf = src.getEAttributeType();
		Class<?> instanceClass = cf.getInstanceClass();
		SingleValueTransformation<?,?> svg = new SingleValueTransformationImpl(instanceClass, instanceClass, IdentityValueTransformator.getInstance());
		return svg.asCollectionTransformation();
	}
	
	public EDataType getStandardDatatypeOrNull(Class<?> cl) {
		return this.defaultDatatypes.get(cl);
	}
	
	public<T> SingleValueTransformation<T, ?> getTransformatorOrNull(Class<T> xmlClass) {
		return (SingleValueTransformation)this.attributeTransformators.get(xmlClass);
	}
	
	//If this returns null, simply do not provide a possibility to edit it ...
	public CollectionValueTransformation<?,?> getValueTransformationOrNull(EAttribute attr) {
		EDataType cf = attr.getEAttributeType();
		Class<?> instanceClass = cf.getInstanceClass();
		SingleValueTransformation<?,?> svg = getTransformatorOrNull(instanceClass);
		if (svg != null) {
			return svg.asCollectionTransformation();
		}
		return null;
	}

	public boolean isStandardDatatype(String name) {
		return Datatypes.isXMLName(name);
	}

}
