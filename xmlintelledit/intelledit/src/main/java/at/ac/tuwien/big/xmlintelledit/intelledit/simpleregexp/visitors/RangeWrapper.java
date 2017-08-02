package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

public class RangeWrapper {

	public char start;
	public char end;
	
	public static char getChar(CommonTree literal) {
		return literal.getToken().getText().charAt(0);
	}
	
	public RangeWrapper(CommonTree range) {
		start = getChar((CommonTree)range.getChild(0));
		end = getChar((CommonTree)range.getChild(1));
	}
	
	public Set<Character> getCharSet() {
		HashSet<Character> ret = new HashSet<Character>();
		for (char c = start; c <= end; ++c) {
			ret.add(c);
		}
		return ret;
	}
}
