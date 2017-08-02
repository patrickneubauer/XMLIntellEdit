package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import org.antlr.runtime.tree.CommonTree;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.ParseStateVisitor;

public class GreedyVisitor extends ParseStateVisitor {

	@Override
	public void visit(CommonTree tree, ParseStateManager manager) {
		throw new RuntimeException();
	}

}
