package at.ac.tuwien.big.ecoretransform.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

import at.ac.tuwien.big.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.ecoretransform.SingleValueTransformation;
import at.ac.tuwien.big.ecoretransform.ValueTransformator;

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
	}
	
	private Map<Class<?>,EDataType> defaultDatatypes = new HashMap<Class<?>, EDataType>();
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
	
	public EDataType getStandardDatatypeOrNull(Class<?> cl) {
		return defaultDatatypes.get(cl);
	}
	
	public void addDatatype(EDataType type) {
		defaultDatatypes.put(type.getInstanceClass(), type);
	}
	
	public void addIdentity(Class... cls) {
		for (Class cl: cls) {
			addTransformator(cl, cl, IdentityValueTransformator.getInstance());
		}
	}
	
	public<T,U> void addTransformator(Class<T> xml, Class<U> ecore, ValueTransformator<T, U> transformator) {
		attributeTransformators.put(xml, new SingleValueTransformationImpl<T, U>(xml, ecore, transformator));
	}
	
	public<T> SingleValueTransformation<T, ?> getTransformatorOrNull(Class<T> xmlClass) {
		return (SingleValueTransformation)attributeTransformators.get(xmlClass);
	}
	
	public CollectionValueTransformation<?,?> getIdentityValueTransformation(EAttribute src, EAttribute target) {
		EDataType cf = src.getEAttributeType();
		Class<?> instanceClass = cf.getInstanceClass();
		SingleValueTransformation<?,?> svg = new SingleValueTransformationImpl(instanceClass, instanceClass, IdentityValueTransformator.getInstance());
		return svg.asCollectionTransformation();
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

}
