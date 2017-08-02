package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.WeakHashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ScopingResourceSetContainer {
	
	private static WeakHashMap<Resource, ResourceSet> localToGlobalResourceSet = new WeakHashMap<Resource, ResourceSet>();
	private static WeakHashMap<String, ResourceSet> urlToResourceSet = new WeakHashMap<String, ResourceSet>();
	
	public static void knowResourceSet(Resource res, ResourceSet fullSet) {
		{
			ResourceSet curSet = localToGlobalResourceSet.get(res);
			if (curSet == null || curSet.getResources().size() < fullSet.getResources().size()) {
				localToGlobalResourceSet.put(res, fullSet);
			}
		}
		{
			ResourceSet curSet = urlToResourceSet.get(res.getURI().toString());
			if (curSet == null || curSet.getResources().size() < fullSet.getResources().size()) {
				if( curSet != null) {
					System.out.println("");
				}
				urlToResourceSet.put(res.getURI().toString(), fullSet);
			}
		}
	}
	
	public static void knowGlobal(Resource res, ResourceSet fullResourceSet) {
		for (Resource r: fullResourceSet.getResources()) {
			knowResourceSet(r, fullResourceSet);
		}
		knowResourceSet(res, fullResourceSet);
	}
	
	public static ResourceSet getMoreCompleteResourceSet(Resource res) {
		ResourceSet backup = res.getResourceSet();
		backup = localToGlobalResourceSet.getOrDefault(res, backup);
		if (backup == res.getResourceSet())  {
			backup = urlToResourceSet.getOrDefault(res.getURI().toString(), backup);
			if (backup.getResources().size() == res.getResourceSet().getResources().size()) {
				return res.getResourceSet();
			}
			System.out.println("Can find more complete Resourceset with URL");
		}
		if (backup == res.getResourceSet() && backup.getResources().size() == 1)  {
			System.err.println("Could not find more complete resourceSet");
		}
		return backup;
	}

}
