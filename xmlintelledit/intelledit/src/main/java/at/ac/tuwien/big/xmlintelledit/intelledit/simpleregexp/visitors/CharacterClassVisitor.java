package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import org.antlr.runtime.tree.CommonTree;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.Edge;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.Node;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateVisitor;

public class CharacterClassVisitor extends ParseStateVisitor {

	@Override
	public void visit(CommonTree tree, ParseStateManager manager) {
		CharacterClassWrapper wrapper = new CharacterClassWrapper(tree);
		Node current = manager.getCurrentNode();
		Node endNode = manager.newNode(false);
		Edge edge = new Edge(endNode);
		edge.addAcceptable(wrapper.characters);
		current.addEdge(edge);
		manager.setCurrentNode(endNode);
	}

}
