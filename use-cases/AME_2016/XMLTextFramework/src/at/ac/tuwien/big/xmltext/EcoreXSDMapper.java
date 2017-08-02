package at.ac.tuwien.big.xmltext;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xsd.ecore.MapBuilder.Mapper;

public class EcoreXSDMapper implements Mapper {
	
	private Map<EObject,Set<EObject>> ecoreToXSD = new HashMap<>();
	private Map<EObject, Set<EObject>> xsdToEcore = new HashMap<>();
	
	private EObject xsdRoot;
	private EObject ecoreRoot;
	private EPackage ecorePackage;
	

	public void setEcoreRoot(EObject root) {
		ecoreRoot = root;
	}
	
	public EObject getEcoreRoot() {
		return ecoreRoot;
	}
	
	public void setEcorePackage(EPackage ecoreEPackage) {
		this.ecorePackage = ecoreEPackage;
	}
	
	public EPackage getEcorePackage() {
		return ecorePackage;
	}
	
	public void setXSDRoot(EObject root) {
		xsdRoot = root;
	}
			
	public EObject getXSDRoot() {
		return xsdRoot;
	}
	
	@Override
	public EObject getRoot() {
		throw new RuntimeException();
	}

	public Set<EObject> getXSD(EObject ecoreElement) {
		return ecoreToXSD.getOrDefault(ecoreElement, Collections.emptySet());
	}
	
	public Set<EObject> getEcore(EObject xsd) {
		return xsdToEcore.getOrDefault(xsd, Collections.emptySet());
	}
	
	@Override
	public void addInput(EObject eObject) {
	}

	@Override
	public void addOutput(EObject eObject) {}

	@Override
	public void map(Collection<? extends EObject> inputs, Collection<? extends EObject> outputs) {
		for (EObject xsd: inputs) {
			xsdToEcore.putIfAbsent(xsd, new HashSet<EObject>());
			xsdToEcore.get(xsd).addAll(outputs);
		}
		for (EObject ecore: outputs) {
			ecoreToXSD.putIfAbsent(ecore, new HashSet<EObject>());
			ecoreToXSD.get(ecore).addAll(inputs);
		}
	}
}