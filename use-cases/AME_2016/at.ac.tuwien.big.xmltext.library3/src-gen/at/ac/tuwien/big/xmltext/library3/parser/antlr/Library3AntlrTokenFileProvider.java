/*
 * generated by Xtext
 */
package at.ac.tuwien.big.xmltext.library3.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Library3AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.tokens");
	}
}
