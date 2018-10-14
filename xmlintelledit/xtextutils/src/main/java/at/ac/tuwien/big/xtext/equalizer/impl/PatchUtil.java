package at.ac.tuwien.big.xtext.equalizer.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.AbstractEList;

import difflib.Chunk;
import difflib.Delta;
import difflib.DiffUtils;
import difflib.Patch;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class PatchUtil {


	/**Makes source equal to target*/
	public static<T> void applyPatch(List<T> source, List<? extends T> target) {
		if (source.size() == target.size()) {
			Iterator<T> firstIter = source.iterator();
			Iterator<? extends T> secondIter = target.iterator();
			boolean isEqual = true;
			while (firstIter.hasNext() && secondIter.hasNext()) {
				T first = firstIter.next();
				T second = secondIter.next();
				if (!Objects.equals(first, second))  {
					isEqual = false;
					break;
				}
			}
			if (isEqual){
				return;
			}
		}
		Patch patch = DiffUtils.diff(source, target);
		applyPatch(source, target, patch);
	}
	
	/**Makes source equal to target*/
	public static<T> void applyPatch(List<T> source, List<? extends T> target, Patch patch) {
		System.out.println("Patch between " + Arrays.toString(source.toArray())+" and " + Arrays.toString(target.toArray())+": "+patch);
		for (Delta delta: patch.getDeltas()) {
			System.out.println("Deltas: "+Arrays.toString(delta.getOriginal().getLines().toArray())+ " ==> "+Arrays.toString(delta.getRevised().getLines().toArray()));
		}
		for (Delta delta: patch.getDeltas()) {
			System.out.println("Delta: "+Arrays.toString(delta.getOriginal().getLines().toArray())+ " ==> "+Arrays.toString(delta.getRevised().getLines().toArray()));
			Chunk original = delta.getOriginal();
			Chunk revised = delta.getRevised();
			int newPos = revised.getPosition();			
			//Set the first elements
			int common = Math.min(original.size(),revised.size());
			for (int i = 0; i < common; ++i) {
				if (source instanceof AbstractEList) {
					((AbstractEList) source).setUnique(newPos+i, (T)revised.getLines().get(i));
				} else {
					source.set(newPos+i, (T)revised.getLines().get(i));
				}
				System.out.println("Set["+(newPos+i)+"] = "+revised.getLines().get(i));
			}
			//Remove all others - das passt vielleicht nicht!
			for (int i = common; i < original.size(); ++i) {
				source.remove(common+newPos);
				System.out.println("Remove["+(newPos+common)+"]");
			}
			for (int i = revised.size()-1; i >= common; --i) {
				//Irgendwie muss ich beim Listenadd so etwas haben
				//das die "richtige" Border nimmt
				System.out.println("Add to ["+(newPos+common)+"]: "+revised.getLines().get(i));
				if (source instanceof AbstractEList) {
					((AbstractEList) source).addUnique(newPos+common, (T)revised.getLines().get(i));
				} else {
					source.add(newPos+common, (T)revised.getLines().get(i));
				}
			}
		}
//		source = source; TODO: remove?
	}
	
	public static void main(String[] args) {
		List<String> str1 = new ArrayList<>(Arrays.asList("asdf","Delete","A1","A2","A3"));
		List<String> str2 = new ArrayList<>(Arrays.asList("asdf","A1","A5","A3","A4"));
		System.out.println("Before: \n"+str1+"\n"+str2);
		applyPatch(str1, str2);
		System.out.println(str1);
	}
}
