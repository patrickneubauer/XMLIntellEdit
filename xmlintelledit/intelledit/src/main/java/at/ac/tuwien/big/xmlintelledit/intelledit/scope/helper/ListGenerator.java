package at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ac.tuwien.big.xtext.util.IteratorUtils;

public class ListGenerator {
	
	private static WeakHashMap<Resource, Map<EClass, Set<EClass>>> resourceToSubclassMap = new WeakHashMap<>();
	
	
	private static Map<EClass, Set<EClass>> getOrCreateMap(Resource res) {
		Map<EClass, Set<EClass>> ret = resourceToSubclassMap.get(res);
		if (ret == null) {
			ret = new HashMap<EClass, Set<EClass>>();
			TreeIterator<EObject> iter = EcoreUtil.getAllContents(res, true);
			while (iter.hasNext()) {
				EObject next = iter.next();
				if (next instanceof EClass) {
					EClass cl = (EClass)next;
					if (cl.isAbstract()) {
						continue;
					}
					for (EClass superClass: IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(),cl)) {
						Set<EClass> curSet = ret.get(superClass);
						if (curSet == null) {
							ret.put(superClass, curSet = new HashSet<EClass>());
						}
						curSet.add(cl);
					}
				}
			}
		}
		return ret;
		
	}
	
	private static Set<EClass> getOrCreateInstanciableClasses(Resource res, EClass topClass) {
		Map<EClass, Set<EClass>> map = getOrCreateMap(res);
		return map.getOrDefault(topClass, Collections.emptySet());
	}
	
	public static List<EClass> getInstanciableClasses(EClass topClass) {
		return new ArrayList<>(getOrCreateInstanciableClasses(topClass.eResource(),topClass));
	}
	
	public static List<Integer> getIntList(int from, int to) {
		List<Integer> ret = new ArrayList<Integer>(to-from+1);
		for (int i = from; i <= to; ++i) {
			ret.add(i);
		}
		return ret;
	}
	
	public static List<Long> getLongList(long from, long to) {
		List<Long> ret = new ArrayList<Long>((int)(to-from+1));
		for (long i = from; i <= to; ++i) {
			ret.add(i);
		}
		return ret;
	}

}
