package at.ac.tuwien.big.xtext.util.ui;

import java.util.ArrayList;
import java.util.List;


public class AnnotationTree<T> {
	
	private AnnotationTree<T> parent;
	
	private List<AnnotationTree<T>> childTrees = new ArrayList<>();
	private List<T> annotations = new ArrayList<T>();
	
	private int startOffset;
	private int endOffset;
	
	public boolean tryAdd(T annot, int startOffset, int endOffset) {
		if (startOffset < this.startOffset || endOffset > this.endOffset) {
			return false;
		}
		if (startOffset == this.startOffset && endOffset == this.endOffset) {
			annotations.add(annot);
			return true;
		}
		for (AnnotationTree<T> tree: childTrees) {
			if (tree.tryAdd(annot, startOffset, endOffset)) {
				return true;
			}
		}
		childTrees.add(new AnnotationTree<T>(this, annot, startOffset, endOffset));
		return true;
	}
	
	private boolean getMostSpecificAnnotations(int startOffset, int endOffset, List<T> list) {
		if (startOffset < this.startOffset || endOffset > this.endOffset) {
			return false;
		}
		boolean doOwn = false;
		for (AnnotationTree<T> sub: childTrees) {
			doOwn |= sub.getMostSpecificAnnotations(startOffset, endOffset, list);
		}
		if (!doOwn) {
			list.addAll(annotations);
		}
		return true;
	}
	
	public List<T> getMostSpecificAnnotations(int startOffset, int endOffset) {
		List<T> ret = new ArrayList<T>();
		getMostSpecificAnnotations(startOffset, endOffset, ret);
		return ret;
	}
	
	public AnnotationTree(AnnotationTree<T> parent, T t, int startOffset, int endOffset) {
		this.parent = parent;
		if (t != null) {
			annotations.add(t);
		}
		this.startOffset = startOffset;
		this.endOffset = endOffset;
	}
	
	public AnnotationTree<T> getParent() {
		return parent;
	}
	
	public List<AnnotationTree<T>> getChildTrees() {
		return childTrees;
	}
	
	public List<T> getTs() {
		return annotations;
	}

}
