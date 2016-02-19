/*
 * generated by Xtext
 */
package org.gemoc.gexpressions.xtext.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.gemoc.gexpressions.xtext.services.GExpressionsGrammarAccess
import org.eclipse.xtext.Keyword

// import com.google.inject.Inject;
// import org.gemoc.gexpressions.xtext.services.GExpressionsGrammarAccess

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class GExpressionsFormatter extends AbstractDeclarativeFormatter {

	@Inject extension GExpressionsGrammarAccess ga
	
	override protected void configureFormatting(FormattingConfig cfg) {
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
		cfg.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		cfg.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		cfg.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		cfg.setAutoLinewrap(120);
		
		for (Keyword dot : ga.findKeywords(".")) {
			cfg.setNoSpace().before(dot);
			cfg.setNoSpace().after(dot);
		}
	}
}