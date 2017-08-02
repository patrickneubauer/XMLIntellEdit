package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.Maps;

@SuppressWarnings({"rawtypes"})
public class EClassStatsCalculator {
	
	private HashMap<EClass, EClassStats> stats = Maps.newHashMap();

	public Map<EClass, EClassStats> exec(Resource resource) {

		if (resource != null) {
			TreeIterator<EObject> allContents = resource.getAllContents();

			long count = 0;
			while (allContents.hasNext()) {
				count++;
				if (count % 10000 == 0) {
					return stats;
				}
				EObject next = allContents.next();

				updateStats(stats, next);
			}
		}

		return stats;
	}
	
	public Map<EClass, EClassStats> exec(List<Resource> resources) {

		if (resources != null) {
			TreeIterator<EObject> allContents = EcoreUtil.getAllContents(resources, true);//resource.getAllContents();

			long count = 0;
			while (allContents.hasNext()) {
				count++;
				if (count % 10000 == 0) {
					return stats;
				}
				EObject next = allContents.next();

				updateStats(stats, next);
			}
		}

		return stats;
	}

	private void updateStats(HashMap<EClass, EClassStats> stats, EObject object) {
		EClass c = object.eClass();

		EClassStats counter = null;

		if (!stats.containsKey(c)) {
			counter = new EClassStats(c);
			stats.put(c, counter);
		} else {
			counter = stats.get(c);
		}

		counter.increment();
	}
	
	private void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	
	public void printStats() {
		System.out.println("=============== START PRINTING STATISTICS ===============");
		printMap(stats);
		System.out.println("=============== FINISHED PRINTING STATISTICS ===============");
	}
}