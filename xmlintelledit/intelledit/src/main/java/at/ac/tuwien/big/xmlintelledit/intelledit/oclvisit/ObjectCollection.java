package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public class ObjectCollection {
	
	private Set<Object> clazzes = new HashSet<>();
	private Map<EStructuralFeature, Map<EObject, Collection<FixAttempt>>> accessedPropertiesWithFixAttempts = new HashMap<>();
	
	public void addType(Object type) {
		clazzes.add(type);
	}
	
	public void addFeatureAccess(EObject obj, EStructuralFeature feat, Collection<FixAttempt> fixAttempts) {
		Map<EObject, Collection<FixAttempt>> eobj = accessedPropertiesWithFixAttempts.get(feat);
		if (eobj == null) {
			accessedPropertiesWithFixAttempts.put(feat, eobj = new HashMap<>());
		}
		Collection<FixAttempt> allAttemptsForThisProperty = eobj.get(obj);
		if (allAttemptsForThisProperty == null) {
			eobj.put(obj, allAttemptsForThisProperty = new HashSet<FixAttempt>());
		}
		if (fixAttempts != null) {
			allAttemptsForThisProperty.addAll(fixAttempts);
		}
	}
	
	public Collection<FixAttempt> getFixAttempts(EObject obj, EStructuralFeature feat) {
		Map<EObject, Collection<FixAttempt>> eobj = accessedPropertiesWithFixAttempts.get(feat);
		if (eobj == null) {
			return Collections.emptySet();
		}
		return eobj.getOrDefault(obj, Collections.emptySet());
	}
	
	public Map<EStructuralFeature, Collection<EObject>> getAccessedProperties() {
		Map<EStructuralFeature,Collection<EObject>> ret = new HashMap<EStructuralFeature, Collection<EObject>>();
		for (Entry<EStructuralFeature, Map<EObject, Collection<FixAttempt>>> entry: accessedPropertiesWithFixAttempts.entrySet()) {
			ret.put(entry.getKey(), entry.getValue().keySet());
		}
		return ret;
	}
	
	public Set<Object> getAccessedTypes() {
		return clazzes;
	}

}

