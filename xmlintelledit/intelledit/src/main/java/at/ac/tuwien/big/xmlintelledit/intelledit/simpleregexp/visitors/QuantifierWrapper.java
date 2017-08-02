package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.visitors;

import org.antlr.runtime.tree.CommonTree;

public class QuantifierWrapper {
	
	public boolean isGreedy = true;
	public int minValue = 1;
	public int maxValue = 1;
	
	public QuantifierWrapper() {
		
	}
	
	public QuantifierWrapper(CommonTree quantifier) {
		minValue = getInt((CommonTree)quantifier.getChild(0));
		maxValue = getInt((CommonTree)quantifier.getChild(1));
		if (quantifier.getChildCount() == 3 && "GREEDY".equals(quantifier.getChild(2).getText())) {
			isGreedy = true;
		}
	}

	
	public static int getInt(CommonTree numberTree) {
		return Integer.valueOf(numberTree.getToken().getText());
	}
	
}
