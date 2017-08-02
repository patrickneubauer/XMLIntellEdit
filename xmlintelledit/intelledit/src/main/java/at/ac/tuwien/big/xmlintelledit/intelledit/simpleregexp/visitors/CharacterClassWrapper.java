package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

public class CharacterClassWrapper {
	
	public Set<Character> characters = new HashSet<Character>();

	public CharacterClassWrapper(CommonTree tree) {
		for (Object child: tree.getChildren()) {
			CommonTree ct = (CommonTree)child;
			//Range or literal
			System.out.println("Token Text: "+ ct.getToken().getText());
			if ("LITERAL".equals(ct.getToken().getText())) {
				characters.add(RangeWrapper.getChar(ct));
			} else if ("RANGE".equals(ct.getToken().getText())) {
				characters.addAll(new RangeWrapper(ct).getCharSet());
			}
		}
		
	}
}
