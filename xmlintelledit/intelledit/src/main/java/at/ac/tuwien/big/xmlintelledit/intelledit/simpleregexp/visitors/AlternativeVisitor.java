package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.Node;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateVisitor;

public class AlternativeVisitor extends ParseStateVisitor {

	@Override
	public void visit(CommonTree tree, ParseStateManager manager) {
		boolean isFinal = false; //TODO: Woher bekomme ich das?
		
		Node end = manager.getCurrentNode();
		List subElements = tree.getChildren();
		for (Object child: subElements) {
			Node start = manager.newNode(false);
			end.addDirectNeighbor(start);	
			manager.setCurrentNode(start);
			ParseStateVisitor.visit(child, manager);
			end = manager.getCurrentNode();				
		}
		manager.setCurrentNode(end);
	}

}
