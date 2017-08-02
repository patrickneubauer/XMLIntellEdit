package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.CreateObjectChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.DeleteObjectChange;

public class EObjectChangeMap {
	private Map<EObject, Map<EStructuralFeature,List<BasicChange<?>>>> changeMap = new HashMap<EObject, Map<EStructuralFeature,List<BasicChange<?>>>>();
	
	public Map<EStructuralFeature, List<BasicChange<?>>> getMap(EObject forObj) {
		Map<EStructuralFeature, List<BasicChange<?>>> map = changeMap.get(forObj);
		if (map == null) {
			changeMap.put(forObj, map = new HashMap<>());
		}
		return map;
	}
	
	public List<BasicChange<?>> getPureObjectChanges(EObject forObj) {
		return getFeatureChanges(forObj,null);
	}
	
	public List<BasicChange<?>> getFeatureChanges(EObject forObj, EStructuralFeature forFeature) {
		Map<EStructuralFeature, List<BasicChange<?>>> map = getMap(forObj);
		List<BasicChange<?>> ret = map.get(forFeature);
		if (ret == null) {
			map.put(forFeature, ret = new ArrayList<BasicChange<?>>());
		}
		return ret;
	}
	
	public void clearChanges(EObject forObj) {
		changeMap.put(forObj, new HashMap<EStructuralFeature, List<BasicChange<?>>>());
	}
	
	public List<BasicChange<?>> getChangeList() {
		List<BasicChange<?>> deleteChanges = new ArrayList<BasicChange<?>>();
		List<BasicChange<?>> createChanges = new ArrayList<BasicChange<?>>();
		List<BasicChange<?>> attributeChanges = new ArrayList<BasicChange<?>>();
		List<EObject> eobjList = new ArrayList<EObject>(changeMap.keySet());
		eobjList.removeIf((x)->(x == null));
		Collections.sort(eobjList, new Comparator<EObject>() {

			@Override
			public int compare(EObject o1, EObject o2) {
				if (o1.eResource() != null && o2.eResource() != null) {
					return o1.eResource().getURIFragment(o1).compareTo(o2.eResource().getURIFragment(o2));
				}
				if (o1.eResource() == null) {
					return -1;
				}
				if (o2.eResource() == null) {
					return 1;
				}
				return 0;
			}
		});
		
		for (EObject eobj: eobjList) {
			Map<EStructuralFeature, List<BasicChange<?>>> eval = changeMap.get(eobj);
			List<EStructuralFeature> sorted = new ArrayList<EStructuralFeature>(eval.keySet());
			sorted.removeIf((x)->x == null);
			Collections.sort(sorted, new Comparator<EStructuralFeature>() {

				@Override
				public int compare(EStructuralFeature o1, EStructuralFeature o2) {
					if (o1.getName() == null) {
						return (o2.getName()==null)?0:-1;
					} else if (o2.getName() == null) {
						return 1;
					}
					return o1.getName().compareTo(o2.getName());
				}
			});
			for (EStructuralFeature esf: sorted) {
				for (BasicChange<?> bc: eval.get(esf)) {
					if (bc instanceof DeleteObjectChange) {
						deleteChanges.add(bc);
					} else if (bc instanceof CreateObjectChange) {
						createChanges.add(bc);
					} else {
						attributeChanges.add(bc);
					}
				}
			}
		}
		List<BasicChange<?>> ret = deleteChanges;
		ret.addAll(createChanges);
		ret.addAll(attributeChanges);
		return ret;
	}

}
