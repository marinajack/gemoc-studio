/*
* generated by Xtext
*/
package org.gemoc.gexpressions.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GExpressionsAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/gemoc/gexpressions/xtext/parser/antlr/internal/InternalGExpressions.tokens");
	}
}
