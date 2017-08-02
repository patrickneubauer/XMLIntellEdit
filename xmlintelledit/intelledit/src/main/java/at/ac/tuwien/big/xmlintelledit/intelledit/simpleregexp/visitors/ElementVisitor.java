package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import org.antlr.runtime.tree.CommonTree;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.Node;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateVisitor;

public class ElementVisitor extends ParseStateVisitor {

	@Override
	public void visit(CommonTree tree, ParseStateManager manager) {
		boolean hasQuantifier = tree.getChildren().size()>=2;
		if (tree.getChildren().size() > 2 ) {
			new Exception().printStackTrace();
			System.err.println("Tree with more than 2 children!");
		} 
		if (tree.getChildren().isEmpty()) {
			System.err.println("Tree with no children!");
		}
		
		
		QuantifierWrapper wrapper = new QuantifierWrapper();
		
		if (hasQuantifier) {
			wrapper = new QuantifierWrapper((CommonTree)tree.getChild(1));
		}
		

		int minCount = wrapper.minValue;
		int maxCount = wrapper.maxValue;
		
		Node myNode = manager.getCurrentNode();
		Node targetEnd = manager.newNode(false);
		if (minCount == 0) {
			myNode.addDirectNeighbor(targetEnd);
		}
		Node previous = manager.getCurrentNode();
		for (int i = 0; i < minCount; ++i) {
			previous = manager.getCurrentNode();
			ParseStateVisitor.visit(tree.getChild(0), manager);
		}
		
		Node current = manager.getCurrentNode();
		current.addDirectNeighbor(targetEnd);
		if (maxCount == Integer.MAX_VALUE) {
			current.addDirectNeighbor(previous);
		} else {
			for (int i = minCount; i < maxCount; ++i) {
				visit((CommonTree)tree.getChild(0), manager);
				current = manager.getCurrentNode();
				current.addDirectNeighbor(targetEnd);	
			}
		}
		manager.setCurrentNode(targetEnd);
	}

}
