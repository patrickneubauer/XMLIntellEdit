package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.AlternativeVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.CharacterClassVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.ElementVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.GreedyVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.LiteralVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.NumberVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.OrVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.QuantifierVisitor;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors.RangeVisitor;

public abstract class ParseStateVisitor {
	private static Map<String,ParseStateVisitor> tokenTextToVisitor = new HashMap<>();
	static {
		addVisitor("OR", new OrVisitor());
		addVisitor("ALTERNATIVE", new AlternativeVisitor());
		addVisitor("ELEMENT", new ElementVisitor());
		addVisitor("CHARACTER_CLASS", new CharacterClassVisitor());
		addVisitor("RANGE", new RangeVisitor());
		addVisitor("LITERAL", new LiteralVisitor());
		addVisitor("QUANTIFIER", new QuantifierVisitor());
		addVisitor("NUMBER", new NumberVisitor());
		addVisitor("GREEDY", new GreedyVisitor());	
	}
	
	public static void addVisitor(String tokenText, ParseStateVisitor visitor) {
		tokenTextToVisitor.put(tokenText, visitor);
	}
	
	public ParseStateVisitor() {
		
	}
	
	public static void visit(Object obj, ParseStateManager manager) {
		if (obj instanceof CommonTree) {
			CommonTree ct = (CommonTree)obj;
			String cttext = ct.getToken().getText();
			ParseStateVisitor visitor = tokenTextToVisitor.get(cttext);
			if (visitor == null) {
				new Exception().printStackTrace();
				System.err.println("Could not parse token "+cttext+" - NOT IMPLEMENTED");
			} else {
				visitor.visit(ct, manager);
			}
		} else {
			new Exception().printStackTrace();
			System.err.println("Object not a commonTree: "+obj+"!");
		}
	}
	
	public abstract void visit(CommonTree tree, ParseStateManager manager);

}
