package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.Node;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateVisitor;

public class OrVisitor extends ParseStateVisitor {

	@Override
	public void visit(CommonTree tree, ParseStateManager manager) {
		boolean isFinal = false; //TODO: Woher bekomme ich das?
		
		Node current = manager.getCurrentNode();
		List subElements = tree.getChildren();
		Node end = manager.newNode(isFinal);
		for (Object child: subElements) {
			Node start = manager.newNode(false);
			current.addDirectNeighbor(start);
			manager.setCurrentNode(start);
			ParseStateVisitor.visit(child, manager);
			Node childEnd = manager.getCurrentNode();
			childEnd.addDirectNeighbor(end);		
		}
		manager.setCurrentNode(end);
	}

}
