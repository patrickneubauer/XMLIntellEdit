package at.ac.tuwien.big.xmlintelledit.xmltext;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

@SuppressWarnings({"rawtypes", "unused"})
public class ConstraintEvalUtil {

	public static void countDirectObject(EObject eobj, Map<EClass,Integer> directInstances,
				Map<EClass,Integer> indirectInstances, Map<EStructuralFeature,Integer> setCount,
				Map<EStructuralFeature,Integer> numValueCount) {
		if (eobj == null || eobj.eClass() == null) {return;}
		EClass cl = eobj.eClass();
		directInstances.put(cl, directInstances.getOrDefault(cl, 0)+1);
		indirectInstances.put(cl, indirectInstances.getOrDefault(cl, 0)+1);
		for (EClass supcl: cl.getEAllSuperTypes()) {
			indirectInstances.put(supcl, indirectInstances.getOrDefault(supcl, 0)+1);	
		}
		for (EStructuralFeature feat: cl.getEAllStructuralFeatures()) {
			if (eobj.eIsSet(feat)) {
				setCount.put(feat, setCount.getOrDefault(feat,0)+1);
			}
			Object o = eobj.eGet(feat);
			if (FeatureMapUtil.isMany(eobj, feat)) {
				if (o instanceof Collection) {
					numValueCount.put(feat, numValueCount.getOrDefault(feat, 0)+((Collection)o).size());
				}
			} else {
				if (o != null) {
					numValueCount.put(feat, numValueCount.getOrDefault(feat, 0)+1);
				}
			}
		}
	}
	
	public static void countEObjects(Iterator<EObject> eobjs, Map<EClass,Integer> directInstances,
				Map<EClass,Integer> indirectInstances, Map<EStructuralFeature,Integer> setCount,
				Map<EStructuralFeature,Integer> numValueCount) {
		while (eobjs.hasNext()) {
			countDirectObject(eobjs.next(), directInstances, indirectInstances, setCount, numValueCount);
		}
	}
	
	public static PropertyCount countResource(Resource r) {
		return new PropertyCount(r);
	}
	
	public static class PropertyCount {
		public int dataProperty;
		public int objectProperty;
		public int dataPropertyNum;
		public int objectPropertyNum;
		public final Map<EStructuralFeature,Integer> setCount = new HashMap<>();
		public final Map<EStructuralFeature,Integer> numValueCount = new HashMap<>();
		public final Map<EClass,Integer> directInstances = new HashMap<>();
		public final Map<EClass,Integer> indirectInstances = new HashMap<>();
		
		public PropertyCount(Resource r) {
			countEObjects(r.getAllContents(), directInstances, indirectInstances, setCount, numValueCount);
			for (Entry<EStructuralFeature,Integer> entry: numValueCount.entrySet()) {
				if (entry.getKey() instanceof EReference) {
					objectPropertyNum+= entry.getValue();
				} else {
					dataPropertyNum+= entry.getValue();
				}
			}
			for (Entry<EStructuralFeature,Integer> entry: setCount.entrySet()) {
				if (entry.getKey() instanceof EReference) {
					objectProperty+= entry.getValue();
				} else {
					dataProperty+= entry.getValue();
				}
			}
		}
		
		private void printMap(StringBuilder builder, Map<? extends ENamedElement,?> map) {
			TreeMap<ENamedElement,Object> tmap = new TreeMap<>(new Comparator<ENamedElement>() {

				@Override
				public int compare(ENamedElement o1, ENamedElement o2) {
					if (o1 == null) {
						return o2==null?0:-1;
					} else if (o2 == null) {
						return 1;
					}
					if (o1.getName() == null) {
						return o2.getName() == null?0:-1;
					} else if (o2.getName() == null) {
						return 1;
					}
					return o1.getName().compareTo(o2.getName());
				}
			});
			tmap.putAll(map);
			for (Entry<ENamedElement,Object> entr: tmap.entrySet()) {
				ENamedElement key = entr.getKey();
				builder.append((key==null)?null:entr.getKey().getName()+": "+entr.getValue()+"\n");
			}
		}
		
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(""+dataProperty+" Data Properties with "+dataPropertyNum+" values, "+objectProperty+" Object Properties with "+objectPropertyNum+" values\n");
			builder.append("Direct Instances:\n");
			printMap(builder,directInstances);
			builder.append("\nIndirect Instances:\n");
			printMap(builder,indirectInstances);
			builder.append("\nProperty Set Count:\n");
			printMap(builder,setCount);
			builder.append("\nProperty Num Value Count:\n");
			printMap(builder,numValueCount);
			return builder.toString();
		}
	}
	
	
	
	public static int getNumberOfConstraintInstances(Resource r) {
		int ret = 0;
		for (EObject eobj: r.getContents()) {
			ret+= getNumberOfConstraintInstances(eobj);
		}
		return ret;
	}
	
	public static int getObjectNum2(Resource r) {
		Set<EObject> ret = new HashSet<EObject>();
		for (EObject eobj: (Iterable<EObject>)()->r.getAllContents()) {
			ret.add(eobj);
		}
		return ret.size();
	}
	
	public static int getObjectNum(Resource r) {
		int ret = r.getContents().size();
		for (EObject eobj: r.getContents()) {
			ret+= getObjectNum(eobj);
		}
		return ret;
	}
	
	public static int getObjectNum(EObject root) {
		int ret = 0;
		for (EObject eobj: (Iterable<EObject>)()->root.eAllContents()) {
			++ret;
		}
		return ret;
	}
	
	
	public static int getDirectNumberOfConstraintInstances(EClass cl) {
		int constraintNr = 0;
		//Copied code
		for (EAnnotation eann : cl.getEAnnotations()) {
			if (eann.getSource() == null) {
				continue;
			}
			if (!eann.getSource().startsWith("http://www.eclipse.org/emf/2002/Ecore/OCL")) {
				// Not an OCL expression
				continue;
			}
			String constraintName = null;
			String oclExpr = null;
			for (Entry<String, String> entry : eann.getDetails().entrySet()) {
				constraintName = entry.getKey();
				oclExpr = entry.getValue();
				// System.out.println("Constraint "+ constraintName+" for "
				// + eclass.getName()+": "+oclExpr);
				//System.out.println("For "+cl.getName()+": "+constraintName+" = "+oclExpr);
				++constraintNr;
			}
		}
		return constraintNr;
	}
	
	public static int getNumberOfConstraintInstances(EClass cl) {
		//System.out.println("----");
		int ret = getDirectNumberOfConstraintInstances(cl);
		//Die werden alle ausgewertet, sehr einfach
		for (EClass scl: cl.getEAllSuperTypes()) {
			ret+= getDirectNumberOfConstraintInstances(scl);
		}
		return ret;
	}
	
	public static int getDirectNumberOfConstraintInstances(EObject eobj) {
		return (eobj==null||eobj.eClass()==null)?0:getNumberOfConstraintInstances(eobj.eClass());
	}
	
	public static int getNumberOfConstraintInstances(EObject root) {
		int ret = getDirectNumberOfConstraintInstances(root);
		for (EObject eobj: (Iterable<EObject>)()->root.eAllContents()) {
			int add = getDirectNumberOfConstraintInstances(eobj);;
			ret+= add;
		}
		return ret;
	}
	
}
