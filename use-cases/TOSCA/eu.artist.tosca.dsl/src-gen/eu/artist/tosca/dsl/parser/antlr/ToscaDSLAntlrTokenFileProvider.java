/*
* generated by Xtext
*/
package eu.artist.tosca.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ToscaDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("eu/artist/tosca/dsl/parser/antlr/internal/InternalToscaDSL.tokens");
	}
}
