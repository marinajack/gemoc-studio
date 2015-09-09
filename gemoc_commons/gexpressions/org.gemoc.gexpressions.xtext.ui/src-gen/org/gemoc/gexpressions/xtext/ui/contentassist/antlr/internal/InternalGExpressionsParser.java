package org.gemoc.gexpressions.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.gemoc.gexpressions.xtext.services.GExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'xor'", "'or'", "'.'", "'->'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'", "';'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'('", "')'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalGExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g"; }


     
     	private GExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GExpressionsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGProgram"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:61:1: entryRuleGProgram : ruleGProgram EOF ;
    public final void entryRuleGProgram() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:62:1: ( ruleGProgram EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:63:1: ruleGProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramRule()); 
            }
            pushFollow(FOLLOW_ruleGProgram_in_entryRuleGProgram67);
            ruleGProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGProgram74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGProgram"


    // $ANTLR start "ruleGProgram"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:70:1: ruleGProgram : ( ( rule__GProgram__Group__0 ) ) ;
    public final void ruleGProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:74:2: ( ( ( rule__GProgram__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:75:1: ( ( rule__GProgram__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:75:1: ( ( rule__GProgram__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:76:1: ( rule__GProgram__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:77:1: ( rule__GProgram__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:77:2: rule__GProgram__Group__0
            {
            pushFollow(FOLLOW_rule__GProgram__Group__0_in_ruleGProgram100);
            rule__GProgram__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGProgram"


    // $ANTLR start "entryRuleGImportStatement"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:89:1: entryRuleGImportStatement : ruleGImportStatement EOF ;
    public final void entryRuleGImportStatement() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:90:1: ( ruleGImportStatement EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:91:1: ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement127);
            ruleGImportStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGImportStatement"


    // $ANTLR start "ruleGImportStatement"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:98:1: ruleGImportStatement : ( ( rule__GImportStatement__Group__0 ) ) ;
    public final void ruleGImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:102:2: ( ( ( rule__GImportStatement__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:103:1: ( ( rule__GImportStatement__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:103:1: ( ( rule__GImportStatement__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:104:1: ( rule__GImportStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:105:1: ( rule__GImportStatement__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:105:2: rule__GImportStatement__Group__0
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__0_in_ruleGImportStatement160);
            rule__GImportStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGImportStatement"


    // $ANTLR start "entryRuleGExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:117:1: entryRuleGExpression : ruleGExpression EOF ;
    public final void entryRuleGExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:118:1: ( ruleGExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:119:1: ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression187);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGExpression"


    // $ANTLR start "ruleGExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:126:1: ruleGExpression : ( ruleGOrExpression ) ;
    public final void ruleGExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:130:2: ( ( ruleGOrExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:131:1: ( ruleGOrExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:131:1: ( ruleGOrExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:132:1: ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression220);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGExpression"


    // $ANTLR start "entryRuleGOrExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:145:1: entryRuleGOrExpression : ruleGOrExpression EOF ;
    public final void entryRuleGOrExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:146:1: ( ruleGOrExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:147:1: ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression246);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGOrExpression"


    // $ANTLR start "ruleGOrExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:154:1: ruleGOrExpression : ( ( rule__GOrExpression__Group__0 ) ) ;
    public final void ruleGOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:158:2: ( ( ( rule__GOrExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:159:1: ( ( rule__GOrExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:159:1: ( ( rule__GOrExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:160:1: ( rule__GOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:161:1: ( rule__GOrExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:161:2: rule__GOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__0_in_ruleGOrExpression279);
            rule__GOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOrExpression"


    // $ANTLR start "entryRuleGXorExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:173:1: entryRuleGXorExpression : ruleGXorExpression EOF ;
    public final void entryRuleGXorExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:174:1: ( ruleGXorExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:175:1: ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression306);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression313); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGXorExpression"


    // $ANTLR start "ruleGXorExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:182:1: ruleGXorExpression : ( ( rule__GXorExpression__Group__0 ) ) ;
    public final void ruleGXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:186:2: ( ( ( rule__GXorExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:187:1: ( ( rule__GXorExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:187:1: ( ( rule__GXorExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:188:1: ( rule__GXorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:189:1: ( rule__GXorExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:189:2: rule__GXorExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__0_in_ruleGXorExpression339);
            rule__GXorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGXorExpression"


    // $ANTLR start "entryRuleGAndExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:201:1: entryRuleGAndExpression : ruleGAndExpression EOF ;
    public final void entryRuleGAndExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:202:1: ( ruleGAndExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:203:1: ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression366);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression373); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGAndExpression"


    // $ANTLR start "ruleGAndExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:210:1: ruleGAndExpression : ( ( rule__GAndExpression__Group__0 ) ) ;
    public final void ruleGAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:214:2: ( ( ( rule__GAndExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:215:1: ( ( rule__GAndExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:215:1: ( ( rule__GAndExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:216:1: ( rule__GAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:217:1: ( rule__GAndExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:217:2: rule__GAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__0_in_ruleGAndExpression399);
            rule__GAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:229:1: entryRuleGEqualityExpression : ruleGEqualityExpression EOF ;
    public final void entryRuleGEqualityExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:230:1: ( ruleGEqualityExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:231:1: ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression426);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEqualityExpression"


    // $ANTLR start "ruleGEqualityExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:238:1: ruleGEqualityExpression : ( ( rule__GEqualityExpression__Group__0 ) ) ;
    public final void ruleGEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:242:2: ( ( ( rule__GEqualityExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:243:1: ( ( rule__GEqualityExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:243:1: ( ( rule__GEqualityExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:244:1: ( rule__GEqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:245:1: ( rule__GEqualityExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:245:2: rule__GEqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__0_in_ruleGEqualityExpression459);
            rule__GEqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEqualityExpression"


    // $ANTLR start "entryRuleGRelationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:257:1: entryRuleGRelationExpression : ruleGRelationExpression EOF ;
    public final void entryRuleGRelationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:258:1: ( ruleGRelationExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:259:1: ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression486);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression493); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGRelationExpression"


    // $ANTLR start "ruleGRelationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:266:1: ruleGRelationExpression : ( ( rule__GRelationExpression__Group__0 ) ) ;
    public final void ruleGRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:270:2: ( ( ( rule__GRelationExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:271:1: ( ( rule__GRelationExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:271:1: ( ( rule__GRelationExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:272:1: ( rule__GRelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:273:1: ( rule__GRelationExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:273:2: rule__GRelationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__0_in_ruleGRelationExpression519);
            rule__GRelationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGRelationExpression"


    // $ANTLR start "entryRuleGAdditionExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:285:1: entryRuleGAdditionExpression : ruleGAdditionExpression EOF ;
    public final void entryRuleGAdditionExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:286:1: ( ruleGAdditionExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:287:1: ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression546);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression553); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGAdditionExpression"


    // $ANTLR start "ruleGAdditionExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:294:1: ruleGAdditionExpression : ( ( rule__GAdditionExpression__Group__0 ) ) ;
    public final void ruleGAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:298:2: ( ( ( rule__GAdditionExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:299:1: ( ( rule__GAdditionExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:299:1: ( ( rule__GAdditionExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:300:1: ( rule__GAdditionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:301:1: ( rule__GAdditionExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:301:2: rule__GAdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__0_in_ruleGAdditionExpression579);
            rule__GAdditionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAdditionExpression"


    // $ANTLR start "entryRuleGMultiplicationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:313:1: entryRuleGMultiplicationExpression : ruleGMultiplicationExpression EOF ;
    public final void entryRuleGMultiplicationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:314:1: ( ruleGMultiplicationExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:315:1: ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression606);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGMultiplicationExpression"


    // $ANTLR start "ruleGMultiplicationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:322:1: ruleGMultiplicationExpression : ( ( rule__GMultiplicationExpression__Group__0 ) ) ;
    public final void ruleGMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:326:2: ( ( ( rule__GMultiplicationExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:327:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:327:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:328:1: ( rule__GMultiplicationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:329:1: ( rule__GMultiplicationExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:329:2: rule__GMultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__0_in_ruleGMultiplicationExpression639);
            rule__GMultiplicationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMultiplicationExpression"


    // $ANTLR start "entryRuleGNegationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:341:1: entryRuleGNegationExpression : ruleGNegationExpression EOF ;
    public final void entryRuleGNegationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:342:1: ( ruleGNegationExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:343:1: ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression666);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression673); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNegationExpression"


    // $ANTLR start "ruleGNegationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:350:1: ruleGNegationExpression : ( ( rule__GNegationExpression__Alternatives ) ) ;
    public final void ruleGNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:354:2: ( ( ( rule__GNegationExpression__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:355:1: ( ( rule__GNegationExpression__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:355:1: ( ( rule__GNegationExpression__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:356:1: ( rule__GNegationExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:357:1: ( rule__GNegationExpression__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:357:2: rule__GNegationExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Alternatives_in_ruleGNegationExpression699);
            rule__GNegationExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNegationExpression"


    // $ANTLR start "entryRuleGNavigationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:369:1: entryRuleGNavigationExpression : ruleGNavigationExpression EOF ;
    public final void entryRuleGNavigationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:370:1: ( ruleGNavigationExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:371:1: ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression726);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression733); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNavigationExpression"


    // $ANTLR start "ruleGNavigationExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:378:1: ruleGNavigationExpression : ( ( rule__GNavigationExpression__Group__0 ) ) ;
    public final void ruleGNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:382:2: ( ( ( rule__GNavigationExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:383:1: ( ( rule__GNavigationExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:383:1: ( ( rule__GNavigationExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:384:1: ( rule__GNavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:385:1: ( rule__GNavigationExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:385:2: rule__GNavigationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__0_in_ruleGNavigationExpression759);
            rule__GNavigationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNavigationExpression"


    // $ANTLR start "entryRuleGReferenceExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:397:1: entryRuleGReferenceExpression : ruleGReferenceExpression EOF ;
    public final void entryRuleGReferenceExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:398:1: ( ruleGReferenceExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:399:1: ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression786);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression793); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGReferenceExpression"


    // $ANTLR start "ruleGReferenceExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:406:1: ruleGReferenceExpression : ( ( rule__GReferenceExpression__Alternatives ) ) ;
    public final void ruleGReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:410:2: ( ( ( rule__GReferenceExpression__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:411:1: ( ( rule__GReferenceExpression__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:411:1: ( ( rule__GReferenceExpression__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:412:1: ( rule__GReferenceExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:413:1: ( rule__GReferenceExpression__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:413:2: rule__GReferenceExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Alternatives_in_ruleGReferenceExpression819);
            rule__GReferenceExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGReferenceExpression"


    // $ANTLR start "entryRuleGPrimaryExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:425:1: entryRuleGPrimaryExpression : ruleGPrimaryExpression EOF ;
    public final void entryRuleGPrimaryExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:426:1: ( ruleGPrimaryExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:427:1: ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression846);
            ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression853); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGPrimaryExpression"


    // $ANTLR start "ruleGPrimaryExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:434:1: ruleGPrimaryExpression : ( ( rule__GPrimaryExpression__Alternatives ) ) ;
    public final void ruleGPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:438:2: ( ( ( rule__GPrimaryExpression__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:439:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:439:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:440:1: ( rule__GPrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:441:1: ( rule__GPrimaryExpression__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:441:2: rule__GPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GPrimaryExpression__Alternatives_in_ruleGPrimaryExpression879);
            rule__GPrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGPrimaryExpression"


    // $ANTLR start "entryRuleGStringExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:453:1: entryRuleGStringExpression : ruleGStringExpression EOF ;
    public final void entryRuleGStringExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:454:1: ( ruleGStringExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:455:1: ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression906);
            ruleGStringExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression913); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGStringExpression"


    // $ANTLR start "ruleGStringExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:462:1: ruleGStringExpression : ( ( rule__GStringExpression__Group__0 ) ) ;
    public final void ruleGStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:466:2: ( ( ( rule__GStringExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:467:1: ( ( rule__GStringExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:467:1: ( ( rule__GStringExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:468:1: ( rule__GStringExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:469:1: ( rule__GStringExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:469:2: rule__GStringExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__0_in_ruleGStringExpression939);
            rule__GStringExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGStringExpression"


    // $ANTLR start "entryRuleGBooleanExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:481:1: entryRuleGBooleanExpression : ruleGBooleanExpression EOF ;
    public final void entryRuleGBooleanExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:482:1: ( ruleGBooleanExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:483:1: ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression966);
            ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression973); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGBooleanExpression"


    // $ANTLR start "ruleGBooleanExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:490:1: ruleGBooleanExpression : ( ( rule__GBooleanExpression__Group__0 ) ) ;
    public final void ruleGBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:494:2: ( ( ( rule__GBooleanExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:495:1: ( ( rule__GBooleanExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:495:1: ( ( rule__GBooleanExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:496:1: ( rule__GBooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:497:1: ( rule__GBooleanExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:497:2: rule__GBooleanExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__0_in_ruleGBooleanExpression999);
            rule__GBooleanExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGBooleanExpression"


    // $ANTLR start "entryRuleGNumericExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:509:1: entryRuleGNumericExpression : ruleGNumericExpression EOF ;
    public final void entryRuleGNumericExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:510:1: ( ruleGNumericExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:511:1: ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression1026);
            ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression1033); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNumericExpression"


    // $ANTLR start "ruleGNumericExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:518:1: ruleGNumericExpression : ( ( rule__GNumericExpression__Alternatives ) ) ;
    public final void ruleGNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:522:2: ( ( ( rule__GNumericExpression__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:523:1: ( ( rule__GNumericExpression__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:523:1: ( ( rule__GNumericExpression__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:524:1: ( rule__GNumericExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:525:1: ( rule__GNumericExpression__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:525:2: rule__GNumericExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GNumericExpression__Alternatives_in_ruleGNumericExpression1059);
            rule__GNumericExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNumericExpression"


    // $ANTLR start "entryRuleGIntegerExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:537:1: entryRuleGIntegerExpression : ruleGIntegerExpression EOF ;
    public final void entryRuleGIntegerExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:538:1: ( ruleGIntegerExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:539:1: ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression1086);
            ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression1093); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGIntegerExpression"


    // $ANTLR start "ruleGIntegerExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:546:1: ruleGIntegerExpression : ( ( rule__GIntegerExpression__Group__0 ) ) ;
    public final void ruleGIntegerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:550:2: ( ( ( rule__GIntegerExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:551:1: ( ( rule__GIntegerExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:551:1: ( ( rule__GIntegerExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:552:1: ( rule__GIntegerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:553:1: ( rule__GIntegerExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:553:2: rule__GIntegerExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__0_in_ruleGIntegerExpression1119);
            rule__GIntegerExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIntegerExpression"


    // $ANTLR start "entryRuleGDoubleExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:565:1: entryRuleGDoubleExpression : ruleGDoubleExpression EOF ;
    public final void entryRuleGDoubleExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:566:1: ( ruleGDoubleExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:567:1: ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression1146);
            ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression1153); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGDoubleExpression"


    // $ANTLR start "ruleGDoubleExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:574:1: ruleGDoubleExpression : ( ( rule__GDoubleExpression__Group__0 ) ) ;
    public final void ruleGDoubleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:578:2: ( ( ( rule__GDoubleExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:579:1: ( ( rule__GDoubleExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:579:1: ( ( rule__GDoubleExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:580:1: ( rule__GDoubleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:581:1: ( rule__GDoubleExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:581:2: rule__GDoubleExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__0_in_ruleGDoubleExpression1179);
            rule__GDoubleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDoubleExpression"


    // $ANTLR start "entryRuleGEnumLiteralExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:593:1: entryRuleGEnumLiteralExpression : ruleGEnumLiteralExpression EOF ;
    public final void entryRuleGEnumLiteralExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:594:1: ( ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:595:1: ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression1206);
            ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression1213); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEnumLiteralExpression"


    // $ANTLR start "ruleGEnumLiteralExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:602:1: ruleGEnumLiteralExpression : ( ( rule__GEnumLiteralExpression__Group__0 ) ) ;
    public final void ruleGEnumLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:606:2: ( ( ( rule__GEnumLiteralExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:607:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:607:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:608:1: ( rule__GEnumLiteralExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:609:1: ( rule__GEnumLiteralExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:609:2: rule__GEnumLiteralExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__0_in_ruleGEnumLiteralExpression1239);
            rule__GEnumLiteralExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEnumLiteralExpression"


    // $ANTLR start "entryRuleGIfExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:621:1: entryRuleGIfExpression : ruleGIfExpression EOF ;
    public final void entryRuleGIfExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:622:1: ( ruleGIfExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:623:1: ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression1266);
            ruleGIfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression1273); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGIfExpression"


    // $ANTLR start "ruleGIfExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:630:1: ruleGIfExpression : ( ( rule__GIfExpression__Group__0 ) ) ;
    public final void ruleGIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:634:2: ( ( ( rule__GIfExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:635:1: ( ( rule__GIfExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:635:1: ( ( rule__GIfExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:636:1: ( rule__GIfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:637:1: ( rule__GIfExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:637:2: rule__GIfExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__0_in_ruleGIfExpression1299);
            rule__GIfExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIfExpression"


    // $ANTLR start "entryRuleGBraceExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:649:1: entryRuleGBraceExpression : ruleGBraceExpression EOF ;
    public final void entryRuleGBraceExpression() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:650:1: ( ruleGBraceExpression EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:651:1: ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression1326);
            ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression1333); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGBraceExpression"


    // $ANTLR start "ruleGBraceExpression"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:658:1: ruleGBraceExpression : ( ( rule__GBraceExpression__Group__0 ) ) ;
    public final void ruleGBraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:662:2: ( ( ( rule__GBraceExpression__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:663:1: ( ( rule__GBraceExpression__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:663:1: ( ( rule__GBraceExpression__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:664:1: ( rule__GBraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:665:1: ( rule__GBraceExpression__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:665:2: rule__GBraceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__0_in_ruleGBraceExpression1359);
            rule__GBraceExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGBraceExpression"


    // $ANTLR start "entryRuleNavigationOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:677:1: entryRuleNavigationOperator : ruleNavigationOperator EOF ;
    public final void entryRuleNavigationOperator() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:678:1: ( ruleNavigationOperator EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:679:1: ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator1386);
            ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator1393); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:686:1: ruleNavigationOperator : ( ( rule__NavigationOperator__Alternatives ) ) ;
    public final void ruleNavigationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:690:2: ( ( ( rule__NavigationOperator__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:691:1: ( ( rule__NavigationOperator__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:691:1: ( ( rule__NavigationOperator__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:692:1: ( rule__NavigationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:693:1: ( rule__NavigationOperator__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:693:2: rule__NavigationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__NavigationOperator__Alternatives_in_ruleNavigationOperator1419);
            rule__NavigationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:705:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:706:1: ( ruleQualifiedName EOF )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:707:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1446);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1453); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:714:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:718:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:719:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:719:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:720:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:721:1: ( rule__QualifiedName__Group__0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:721:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1479);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleGAndOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:734:1: ruleGAndOperator : ( ( 'and' ) ) ;
    public final void ruleGAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:738:1: ( ( ( 'and' ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:739:1: ( ( 'and' ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:739:1: ( ( 'and' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:740:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:741:1: ( 'and' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:741:3: 'and'
            {
            match(input,13,FOLLOW_13_in_ruleGAndOperator1517); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAndOperator"


    // $ANTLR start "ruleGXorOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:754:1: ruleGXorOperator : ( ( 'xor' ) ) ;
    public final void ruleGXorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:758:1: ( ( ( 'xor' ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:759:1: ( ( 'xor' ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:759:1: ( ( 'xor' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:760:1: ( 'xor' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:761:1: ( 'xor' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:761:3: 'xor'
            {
            match(input,14,FOLLOW_14_in_ruleGXorOperator1556); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGXorOperator"


    // $ANTLR start "ruleGOrOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:774:1: ruleGOrOperator : ( ( 'or' ) ) ;
    public final void ruleGOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:778:1: ( ( ( 'or' ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:779:1: ( ( 'or' ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:779:1: ( ( 'or' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:780:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:781:1: ( 'or' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:781:3: 'or'
            {
            match(input,15,FOLLOW_15_in_ruleGOrOperator1595); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOrOperator"


    // $ANTLR start "ruleGEqualityOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:794:1: ruleGEqualityOperator : ( ( rule__GEqualityOperator__Alternatives ) ) ;
    public final void ruleGEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:798:1: ( ( ( rule__GEqualityOperator__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:799:1: ( ( rule__GEqualityOperator__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:799:1: ( ( rule__GEqualityOperator__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:800:1: ( rule__GEqualityOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:801:1: ( rule__GEqualityOperator__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:801:2: rule__GEqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GEqualityOperator__Alternatives_in_ruleGEqualityOperator1633);
            rule__GEqualityOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEqualityOperator"


    // $ANTLR start "ruleGRelationOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:813:1: ruleGRelationOperator : ( ( rule__GRelationOperator__Alternatives ) ) ;
    public final void ruleGRelationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:817:1: ( ( ( rule__GRelationOperator__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:818:1: ( ( rule__GRelationOperator__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:818:1: ( ( rule__GRelationOperator__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:819:1: ( rule__GRelationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:820:1: ( rule__GRelationOperator__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:820:2: rule__GRelationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GRelationOperator__Alternatives_in_ruleGRelationOperator1669);
            rule__GRelationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGRelationOperator"


    // $ANTLR start "ruleGAdditionOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:832:1: ruleGAdditionOperator : ( ( rule__GAdditionOperator__Alternatives ) ) ;
    public final void ruleGAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:836:1: ( ( ( rule__GAdditionOperator__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:837:1: ( ( rule__GAdditionOperator__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:837:1: ( ( rule__GAdditionOperator__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:838:1: ( rule__GAdditionOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:839:1: ( rule__GAdditionOperator__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:839:2: rule__GAdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GAdditionOperator__Alternatives_in_ruleGAdditionOperator1705);
            rule__GAdditionOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAdditionOperator"


    // $ANTLR start "ruleGMultiplicationOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:851:1: ruleGMultiplicationOperator : ( ( rule__GMultiplicationOperator__Alternatives ) ) ;
    public final void ruleGMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:855:1: ( ( ( rule__GMultiplicationOperator__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:856:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:856:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:857:1: ( rule__GMultiplicationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:858:1: ( rule__GMultiplicationOperator__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:858:2: rule__GMultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GMultiplicationOperator__Alternatives_in_ruleGMultiplicationOperator1741);
            rule__GMultiplicationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMultiplicationOperator"


    // $ANTLR start "ruleGNegationOperator"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:870:1: ruleGNegationOperator : ( ( rule__GNegationOperator__Alternatives ) ) ;
    public final void ruleGNegationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:874:1: ( ( ( rule__GNegationOperator__Alternatives ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:875:1: ( ( rule__GNegationOperator__Alternatives ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:875:1: ( ( rule__GNegationOperator__Alternatives ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:876:1: ( rule__GNegationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:877:1: ( rule__GNegationOperator__Alternatives )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:877:2: rule__GNegationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GNegationOperator__Alternatives_in_ruleGNegationOperator1777);
            rule__GNegationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNegationOperator"


    // $ANTLR start "rule__GNegationExpression__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:888:1: rule__GNegationExpression__Alternatives : ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) );
    public final void rule__GNegationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:892:1: ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_DOUBLE)||(LA1_0>=32 && LA1_0<=33)||LA1_0==37) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=28 && LA1_0<=29)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:893:1: ( ruleGNavigationExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:893:1: ( ruleGNavigationExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:894:1: ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__Alternatives1812);
                    ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:899:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:899:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:900:1: ( rule__GNegationExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:901:1: ( rule__GNegationExpression__Group_1__0 )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:901:2: rule__GNegationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GNegationExpression__Group_1__0_in_rule__GNegationExpression__Alternatives1829);
                    rule__GNegationExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Alternatives"


    // $ANTLR start "rule__GReferenceExpression__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:910:1: rule__GReferenceExpression__Alternatives : ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) );
    public final void rule__GReferenceExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:914:1: ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_DOUBLE)||(LA2_0>=32 && LA2_0<=33)||LA2_0==37) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:915:1: ( ruleGPrimaryExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:915:1: ( ruleGPrimaryExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:916:1: ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_rule__GReferenceExpression__Alternatives1862);
                    ruleGPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:921:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:921:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:922:1: ( rule__GReferenceExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:923:1: ( rule__GReferenceExpression__Group_1__0 )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:923:2: rule__GReferenceExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__0_in_rule__GReferenceExpression__Alternatives1879);
                    rule__GReferenceExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Alternatives"


    // $ANTLR start "rule__GPrimaryExpression__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:932:1: rule__GPrimaryExpression__Alternatives : ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) );
    public final void rule__GPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:936:1: ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            case 37:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:937:1: ( ruleGStringExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:937:1: ( ruleGStringExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:938:1: ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_rule__GPrimaryExpression__Alternatives1912);
                    ruleGStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:943:6: ( ruleGBooleanExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:943:6: ( ruleGBooleanExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:944:1: ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_rule__GPrimaryExpression__Alternatives1929);
                    ruleGBooleanExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:949:6: ( ruleGNumericExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:949:6: ( ruleGNumericExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:950:1: ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_rule__GPrimaryExpression__Alternatives1946);
                    ruleGNumericExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:955:6: ( ruleGEnumLiteralExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:955:6: ( ruleGEnumLiteralExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:956:1: ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_rule__GPrimaryExpression__Alternatives1963);
                    ruleGEnumLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:961:6: ( ruleGIfExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:961:6: ( ruleGIfExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:962:1: ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_rule__GPrimaryExpression__Alternatives1980);
                    ruleGIfExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:967:6: ( ruleGBraceExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:967:6: ( ruleGBraceExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:968:1: ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_rule__GPrimaryExpression__Alternatives1997);
                    ruleGBraceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPrimaryExpression__Alternatives"


    // $ANTLR start "rule__GNumericExpression__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:978:1: rule__GNumericExpression__Alternatives : ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) );
    public final void rule__GNumericExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:982:1: ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_DOUBLE) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:983:1: ( ruleGIntegerExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:983:1: ( ruleGIntegerExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:984:1: ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_rule__GNumericExpression__Alternatives2029);
                    ruleGIntegerExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:989:6: ( ruleGDoubleExpression )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:989:6: ( ruleGDoubleExpression )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:990:1: ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_rule__GNumericExpression__Alternatives2046);
                    ruleGDoubleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNumericExpression__Alternatives"


    // $ANTLR start "rule__NavigationOperator__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1000:1: rule__NavigationOperator__Alternatives : ( ( '.' ) | ( '->' ) );
    public final void rule__NavigationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1004:1: ( ( '.' ) | ( '->' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1005:1: ( '.' )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1005:1: ( '.' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1006:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__NavigationOperator__Alternatives2079); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1013:6: ( '->' )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1013:6: ( '->' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1014:1: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__NavigationOperator__Alternatives2099); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationOperator__Alternatives"


    // $ANTLR start "rule__GEqualityOperator__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1026:1: rule__GEqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__GEqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1030:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1031:1: ( ( '=' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1031:1: ( ( '=' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1032:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1033:1: ( '=' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1033:3: '='
                    {
                    match(input,18,FOLLOW_18_in_rule__GEqualityOperator__Alternatives2134); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1038:6: ( ( '<>' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1038:6: ( ( '<>' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1039:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1040:1: ( '<>' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1040:3: '<>'
                    {
                    match(input,19,FOLLOW_19_in_rule__GEqualityOperator__Alternatives2155); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityOperator__Alternatives"


    // $ANTLR start "rule__GRelationOperator__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1050:1: rule__GRelationOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__GRelationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1054:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1055:1: ( ( '<' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1055:1: ( ( '<' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1056:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1057:1: ( '<' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1057:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__GRelationOperator__Alternatives2191); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1062:6: ( ( '>' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1062:6: ( ( '>' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1063:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1064:1: ( '>' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1064:3: '>'
                    {
                    match(input,21,FOLLOW_21_in_rule__GRelationOperator__Alternatives2212); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1069:6: ( ( '<=' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1069:6: ( ( '<=' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1070:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1071:1: ( '<=' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1071:3: '<='
                    {
                    match(input,22,FOLLOW_22_in_rule__GRelationOperator__Alternatives2233); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1076:6: ( ( '>=' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1076:6: ( ( '>=' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1077:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1078:1: ( '>=' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1078:3: '>='
                    {
                    match(input,23,FOLLOW_23_in_rule__GRelationOperator__Alternatives2254); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationOperator__Alternatives"


    // $ANTLR start "rule__GAdditionOperator__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1088:1: rule__GAdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GAdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1092:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1093:1: ( ( '+' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1093:1: ( ( '+' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1094:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1095:1: ( '+' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1095:3: '+'
                    {
                    match(input,24,FOLLOW_24_in_rule__GAdditionOperator__Alternatives2290); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1100:6: ( ( '-' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1100:6: ( ( '-' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1101:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1102:1: ( '-' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1102:3: '-'
                    {
                    match(input,25,FOLLOW_25_in_rule__GAdditionOperator__Alternatives2311); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionOperator__Alternatives"


    // $ANTLR start "rule__GMultiplicationOperator__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1112:1: rule__GMultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__GMultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1116:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1117:1: ( ( '*' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1117:1: ( ( '*' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1118:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1119:1: ( '*' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1119:3: '*'
                    {
                    match(input,26,FOLLOW_26_in_rule__GMultiplicationOperator__Alternatives2347); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1124:6: ( ( '/' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1124:6: ( ( '/' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1125:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1126:1: ( '/' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1126:3: '/'
                    {
                    match(input,27,FOLLOW_27_in_rule__GMultiplicationOperator__Alternatives2368); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationOperator__Alternatives"


    // $ANTLR start "rule__GNegationOperator__Alternatives"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1136:1: rule__GNegationOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '~' ) ) );
    public final void rule__GNegationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1140:1: ( ( ( 'not' ) ) | ( ( '~' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1141:1: ( ( 'not' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1141:1: ( ( 'not' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1142:1: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1143:1: ( 'not' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1143:3: 'not'
                    {
                    match(input,28,FOLLOW_28_in_rule__GNegationOperator__Alternatives2404); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1148:6: ( ( '~' ) )
                    {
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1148:6: ( ( '~' ) )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1149:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1150:1: ( '~' )
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1150:3: '~'
                    {
                    match(input,29,FOLLOW_29_in_rule__GNegationOperator__Alternatives2425); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationOperator__Alternatives"


    // $ANTLR start "rule__GProgram__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1162:1: rule__GProgram__Group__0 : rule__GProgram__Group__0__Impl rule__GProgram__Group__1 ;
    public final void rule__GProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1166:1: ( rule__GProgram__Group__0__Impl rule__GProgram__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1167:2: rule__GProgram__Group__0__Impl rule__GProgram__Group__1
            {
            pushFollow(FOLLOW_rule__GProgram__Group__0__Impl_in_rule__GProgram__Group__02458);
            rule__GProgram__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GProgram__Group__1_in_rule__GProgram__Group__02461);
            rule__GProgram__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group__0"


    // $ANTLR start "rule__GProgram__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1174:1: rule__GProgram__Group__0__Impl : ( ( rule__GProgram__ImportsAssignment_0 )* ) ;
    public final void rule__GProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1178:1: ( ( ( rule__GProgram__ImportsAssignment_0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1179:1: ( ( rule__GProgram__ImportsAssignment_0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1179:1: ( ( rule__GProgram__ImportsAssignment_0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1180:1: ( rule__GProgram__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getImportsAssignment_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1181:1: ( rule__GProgram__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1181:2: rule__GProgram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__GProgram__ImportsAssignment_0_in_rule__GProgram__Group__0__Impl2488);
            	    rule__GProgram__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group__0__Impl"


    // $ANTLR start "rule__GProgram__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1191:1: rule__GProgram__Group__1 : rule__GProgram__Group__1__Impl ;
    public final void rule__GProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1195:1: ( rule__GProgram__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1196:2: rule__GProgram__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GProgram__Group__1__Impl_in_rule__GProgram__Group__12519);
            rule__GProgram__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group__1"


    // $ANTLR start "rule__GProgram__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1202:1: rule__GProgram__Group__1__Impl : ( ( rule__GProgram__Group_1__0 )? ) ;
    public final void rule__GProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1206:1: ( ( ( rule__GProgram__Group_1__0 )? ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1207:1: ( ( rule__GProgram__Group_1__0 )? )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1207:1: ( ( rule__GProgram__Group_1__0 )? )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1208:1: ( rule__GProgram__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1209:1: ( rule__GProgram__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_DOUBLE)||(LA12_0>=28 && LA12_0<=29)||(LA12_0>=32 && LA12_0<=33)||LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1209:2: rule__GProgram__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GProgram__Group_1__0_in_rule__GProgram__Group__1__Impl2546);
                    rule__GProgram__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group__1__Impl"


    // $ANTLR start "rule__GProgram__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1223:1: rule__GProgram__Group_1__0 : rule__GProgram__Group_1__0__Impl rule__GProgram__Group_1__1 ;
    public final void rule__GProgram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1227:1: ( rule__GProgram__Group_1__0__Impl rule__GProgram__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1228:2: rule__GProgram__Group_1__0__Impl rule__GProgram__Group_1__1
            {
            pushFollow(FOLLOW_rule__GProgram__Group_1__0__Impl_in_rule__GProgram__Group_1__02581);
            rule__GProgram__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GProgram__Group_1__1_in_rule__GProgram__Group_1__02584);
            rule__GProgram__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1__0"


    // $ANTLR start "rule__GProgram__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1235:1: rule__GProgram__Group_1__0__Impl : ( ( rule__GProgram__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__GProgram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1239:1: ( ( ( rule__GProgram__ExpressionsAssignment_1_0 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1240:1: ( ( rule__GProgram__ExpressionsAssignment_1_0 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1240:1: ( ( rule__GProgram__ExpressionsAssignment_1_0 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1241:1: ( rule__GProgram__ExpressionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getExpressionsAssignment_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1242:1: ( rule__GProgram__ExpressionsAssignment_1_0 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1242:2: rule__GProgram__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__GProgram__ExpressionsAssignment_1_0_in_rule__GProgram__Group_1__0__Impl2611);
            rule__GProgram__ExpressionsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getExpressionsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1__0__Impl"


    // $ANTLR start "rule__GProgram__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1252:1: rule__GProgram__Group_1__1 : rule__GProgram__Group_1__1__Impl ;
    public final void rule__GProgram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1256:1: ( rule__GProgram__Group_1__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1257:2: rule__GProgram__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GProgram__Group_1__1__Impl_in_rule__GProgram__Group_1__12641);
            rule__GProgram__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1__1"


    // $ANTLR start "rule__GProgram__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1263:1: rule__GProgram__Group_1__1__Impl : ( ( rule__GProgram__Group_1_1__0 )* ) ;
    public final void rule__GProgram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1267:1: ( ( ( rule__GProgram__Group_1_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1268:1: ( ( rule__GProgram__Group_1_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1268:1: ( ( rule__GProgram__Group_1_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1269:1: ( rule__GProgram__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getGroup_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1270:1: ( rule__GProgram__Group_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_DOUBLE)||(LA13_0>=28 && LA13_0<=30)||(LA13_0>=32 && LA13_0<=33)||LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1270:2: rule__GProgram__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GProgram__Group_1_1__0_in_rule__GProgram__Group_1__1__Impl2668);
            	    rule__GProgram__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1__1__Impl"


    // $ANTLR start "rule__GProgram__Group_1_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1284:1: rule__GProgram__Group_1_1__0 : rule__GProgram__Group_1_1__0__Impl rule__GProgram__Group_1_1__1 ;
    public final void rule__GProgram__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1288:1: ( rule__GProgram__Group_1_1__0__Impl rule__GProgram__Group_1_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1289:2: rule__GProgram__Group_1_1__0__Impl rule__GProgram__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__GProgram__Group_1_1__0__Impl_in_rule__GProgram__Group_1_1__02703);
            rule__GProgram__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GProgram__Group_1_1__1_in_rule__GProgram__Group_1_1__02706);
            rule__GProgram__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1_1__0"


    // $ANTLR start "rule__GProgram__Group_1_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1296:1: rule__GProgram__Group_1_1__0__Impl : ( ( ';' )? ) ;
    public final void rule__GProgram__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1300:1: ( ( ( ';' )? ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1301:1: ( ( ';' )? )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1301:1: ( ( ';' )? )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1302:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getSemicolonKeyword_1_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1303:1: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1304:2: ';'
                    {
                    match(input,30,FOLLOW_30_in_rule__GProgram__Group_1_1__0__Impl2735); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getSemicolonKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1_1__0__Impl"


    // $ANTLR start "rule__GProgram__Group_1_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1315:1: rule__GProgram__Group_1_1__1 : rule__GProgram__Group_1_1__1__Impl ;
    public final void rule__GProgram__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1319:1: ( rule__GProgram__Group_1_1__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1320:2: rule__GProgram__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GProgram__Group_1_1__1__Impl_in_rule__GProgram__Group_1_1__12768);
            rule__GProgram__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1_1__1"


    // $ANTLR start "rule__GProgram__Group_1_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1326:1: rule__GProgram__Group_1_1__1__Impl : ( ( rule__GProgram__ExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__GProgram__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1330:1: ( ( ( rule__GProgram__ExpressionsAssignment_1_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1331:1: ( ( rule__GProgram__ExpressionsAssignment_1_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1331:1: ( ( rule__GProgram__ExpressionsAssignment_1_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1332:1: ( rule__GProgram__ExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getExpressionsAssignment_1_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1333:1: ( rule__GProgram__ExpressionsAssignment_1_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1333:2: rule__GProgram__ExpressionsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__GProgram__ExpressionsAssignment_1_1_1_in_rule__GProgram__Group_1_1__1__Impl2795);
            rule__GProgram__ExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__Group_1_1__1__Impl"


    // $ANTLR start "rule__GImportStatement__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1347:1: rule__GImportStatement__Group__0 : rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 ;
    public final void rule__GImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1351:1: ( rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1352:2: rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__0__Impl_in_rule__GImportStatement__Group__02829);
            rule__GImportStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GImportStatement__Group__1_in_rule__GImportStatement__Group__02832);
            rule__GImportStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__0"


    // $ANTLR start "rule__GImportStatement__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1359:1: rule__GImportStatement__Group__0__Impl : ( 'import' ) ;
    public final void rule__GImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1363:1: ( ( 'import' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1364:1: ( 'import' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1364:1: ( 'import' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1365:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GImportStatement__Group__0__Impl2860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__0__Impl"


    // $ANTLR start "rule__GImportStatement__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1378:1: rule__GImportStatement__Group__1 : rule__GImportStatement__Group__1__Impl ;
    public final void rule__GImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1382:1: ( rule__GImportStatement__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1383:2: rule__GImportStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__1__Impl_in_rule__GImportStatement__Group__12891);
            rule__GImportStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__1"


    // $ANTLR start "rule__GImportStatement__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1389:1: rule__GImportStatement__Group__1__Impl : ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) ;
    public final void rule__GImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1393:1: ( ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1394:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1394:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1395:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1396:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1396:2: rule__GImportStatement__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__GImportStatement__ImportURIAssignment_1_in_rule__GImportStatement__Group__1__Impl2918);
            rule__GImportStatement__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1410:1: rule__GOrExpression__Group__0 : rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 ;
    public final void rule__GOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1414:1: ( rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1415:2: rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__0__Impl_in_rule__GOrExpression__Group__02952);
            rule__GOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group__1_in_rule__GOrExpression__Group__02955);
            rule__GOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__0"


    // $ANTLR start "rule__GOrExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1422:1: rule__GOrExpression__Group__0__Impl : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1426:1: ( ( ruleGXorExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1427:1: ( ruleGXorExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1427:1: ( ruleGXorExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1428:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_rule__GOrExpression__Group__0__Impl2982);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__0__Impl"


    // $ANTLR start "rule__GOrExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1439:1: rule__GOrExpression__Group__1 : rule__GOrExpression__Group__1__Impl ;
    public final void rule__GOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1443:1: ( rule__GOrExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1444:2: rule__GOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__1__Impl_in_rule__GOrExpression__Group__13011);
            rule__GOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__1"


    // $ANTLR start "rule__GOrExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1450:1: rule__GOrExpression__Group__1__Impl : ( ( rule__GOrExpression__Group_1__0 )* ) ;
    public final void rule__GOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1454:1: ( ( ( rule__GOrExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1455:1: ( ( rule__GOrExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1455:1: ( ( rule__GOrExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1456:1: ( rule__GOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1457:1: ( rule__GOrExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1457:2: rule__GOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GOrExpression__Group_1__0_in_rule__GOrExpression__Group__1__Impl3038);
            	    rule__GOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1471:1: rule__GOrExpression__Group_1__0 : rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 ;
    public final void rule__GOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1475:1: ( rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1476:2: rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__0__Impl_in_rule__GOrExpression__Group_1__03073);
            rule__GOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__1_in_rule__GOrExpression__Group_1__03076);
            rule__GOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__0"


    // $ANTLR start "rule__GOrExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1483:1: rule__GOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1487:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1488:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1488:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1489:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1490:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1492:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1502:1: rule__GOrExpression__Group_1__1 : rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 ;
    public final void rule__GOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1506:1: ( rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1507:2: rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__1__Impl_in_rule__GOrExpression__Group_1__13134);
            rule__GOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__2_in_rule__GOrExpression__Group_1__13137);
            rule__GOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__1"


    // $ANTLR start "rule__GOrExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1514:1: rule__GOrExpression__Group_1__1__Impl : ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1518:1: ( ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1519:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1519:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1520:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1521:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1521:2: rule__GOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GOrExpression__OperatorAssignment_1_1_in_rule__GOrExpression__Group_1__1__Impl3164);
            rule__GOrExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1531:1: rule__GOrExpression__Group_1__2 : rule__GOrExpression__Group_1__2__Impl ;
    public final void rule__GOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1535:1: ( rule__GOrExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1536:2: rule__GOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__2__Impl_in_rule__GOrExpression__Group_1__23194);
            rule__GOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__2"


    // $ANTLR start "rule__GOrExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1542:1: rule__GOrExpression__Group_1__2__Impl : ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1546:1: ( ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1547:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1547:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1548:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1549:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1549:2: rule__GOrExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GOrExpression__RightOperandAssignment_1_2_in_rule__GOrExpression__Group_1__2__Impl3221);
            rule__GOrExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GXorExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1565:1: rule__GXorExpression__Group__0 : rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 ;
    public final void rule__GXorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1569:1: ( rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1570:2: rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__0__Impl_in_rule__GXorExpression__Group__03257);
            rule__GXorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group__1_in_rule__GXorExpression__Group__03260);
            rule__GXorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__0"


    // $ANTLR start "rule__GXorExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1577:1: rule__GXorExpression__Group__0__Impl : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1581:1: ( ( ruleGAndExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1582:1: ( ruleGAndExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1582:1: ( ruleGAndExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1583:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_rule__GXorExpression__Group__0__Impl3287);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__0__Impl"


    // $ANTLR start "rule__GXorExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1594:1: rule__GXorExpression__Group__1 : rule__GXorExpression__Group__1__Impl ;
    public final void rule__GXorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1598:1: ( rule__GXorExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1599:2: rule__GXorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__1__Impl_in_rule__GXorExpression__Group__13316);
            rule__GXorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__1"


    // $ANTLR start "rule__GXorExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1605:1: rule__GXorExpression__Group__1__Impl : ( ( rule__GXorExpression__Group_1__0 )* ) ;
    public final void rule__GXorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1609:1: ( ( ( rule__GXorExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1610:1: ( ( rule__GXorExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1610:1: ( ( rule__GXorExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1611:1: ( rule__GXorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1612:1: ( rule__GXorExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1612:2: rule__GXorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GXorExpression__Group_1__0_in_rule__GXorExpression__Group__1__Impl3343);
            	    rule__GXorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__1__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1626:1: rule__GXorExpression__Group_1__0 : rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 ;
    public final void rule__GXorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1630:1: ( rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1631:2: rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__0__Impl_in_rule__GXorExpression__Group_1__03378);
            rule__GXorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__1_in_rule__GXorExpression__Group_1__03381);
            rule__GXorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__0"


    // $ANTLR start "rule__GXorExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1638:1: rule__GXorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GXorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1642:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1643:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1643:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1644:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1645:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1647:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1657:1: rule__GXorExpression__Group_1__1 : rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 ;
    public final void rule__GXorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1661:1: ( rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1662:2: rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__1__Impl_in_rule__GXorExpression__Group_1__13439);
            rule__GXorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__2_in_rule__GXorExpression__Group_1__13442);
            rule__GXorExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__1"


    // $ANTLR start "rule__GXorExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1669:1: rule__GXorExpression__Group_1__1__Impl : ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GXorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1673:1: ( ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1674:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1674:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1675:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1676:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1676:2: rule__GXorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GXorExpression__OperatorAssignment_1_1_in_rule__GXorExpression__Group_1__1__Impl3469);
            rule__GXorExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1686:1: rule__GXorExpression__Group_1__2 : rule__GXorExpression__Group_1__2__Impl ;
    public final void rule__GXorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1690:1: ( rule__GXorExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1691:2: rule__GXorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__2__Impl_in_rule__GXorExpression__Group_1__23499);
            rule__GXorExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__2"


    // $ANTLR start "rule__GXorExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1697:1: rule__GXorExpression__Group_1__2__Impl : ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GXorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1701:1: ( ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1702:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1702:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1703:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1704:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1704:2: rule__GXorExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GXorExpression__RightOperandAssignment_1_2_in_rule__GXorExpression__Group_1__2__Impl3526);
            rule__GXorExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GAndExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1720:1: rule__GAndExpression__Group__0 : rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 ;
    public final void rule__GAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1724:1: ( rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1725:2: rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__0__Impl_in_rule__GAndExpression__Group__03562);
            rule__GAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group__1_in_rule__GAndExpression__Group__03565);
            rule__GAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__0"


    // $ANTLR start "rule__GAndExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1732:1: rule__GAndExpression__Group__0__Impl : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1736:1: ( ( ruleGEqualityExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1737:1: ( ruleGEqualityExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1737:1: ( ruleGEqualityExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1738:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__Group__0__Impl3592);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__0__Impl"


    // $ANTLR start "rule__GAndExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1749:1: rule__GAndExpression__Group__1 : rule__GAndExpression__Group__1__Impl ;
    public final void rule__GAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1753:1: ( rule__GAndExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1754:2: rule__GAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__1__Impl_in_rule__GAndExpression__Group__13621);
            rule__GAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__1"


    // $ANTLR start "rule__GAndExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1760:1: rule__GAndExpression__Group__1__Impl : ( ( rule__GAndExpression__Group_1__0 )* ) ;
    public final void rule__GAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1764:1: ( ( ( rule__GAndExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1765:1: ( ( rule__GAndExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1765:1: ( ( rule__GAndExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1766:1: ( rule__GAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1767:1: ( rule__GAndExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1767:2: rule__GAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GAndExpression__Group_1__0_in_rule__GAndExpression__Group__1__Impl3648);
            	    rule__GAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__1__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1781:1: rule__GAndExpression__Group_1__0 : rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 ;
    public final void rule__GAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1785:1: ( rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1786:2: rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__0__Impl_in_rule__GAndExpression__Group_1__03683);
            rule__GAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__1_in_rule__GAndExpression__Group_1__03686);
            rule__GAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__0"


    // $ANTLR start "rule__GAndExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1793:1: rule__GAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1797:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1798:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1798:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1799:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1800:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1802:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1812:1: rule__GAndExpression__Group_1__1 : rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 ;
    public final void rule__GAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1816:1: ( rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1817:2: rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__1__Impl_in_rule__GAndExpression__Group_1__13744);
            rule__GAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__2_in_rule__GAndExpression__Group_1__13747);
            rule__GAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__1"


    // $ANTLR start "rule__GAndExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1824:1: rule__GAndExpression__Group_1__1__Impl : ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1828:1: ( ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1829:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1829:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1830:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1831:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1831:2: rule__GAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GAndExpression__OperatorAssignment_1_1_in_rule__GAndExpression__Group_1__1__Impl3774);
            rule__GAndExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1841:1: rule__GAndExpression__Group_1__2 : rule__GAndExpression__Group_1__2__Impl ;
    public final void rule__GAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1845:1: ( rule__GAndExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1846:2: rule__GAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__2__Impl_in_rule__GAndExpression__Group_1__23804);
            rule__GAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__2"


    // $ANTLR start "rule__GAndExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1852:1: rule__GAndExpression__Group_1__2__Impl : ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1856:1: ( ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1857:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1857:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1858:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1859:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1859:2: rule__GAndExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GAndExpression__RightOperandAssignment_1_2_in_rule__GAndExpression__Group_1__2__Impl3831);
            rule__GAndExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1875:1: rule__GEqualityExpression__Group__0 : rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 ;
    public final void rule__GEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1879:1: ( rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1880:2: rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__0__Impl_in_rule__GEqualityExpression__Group__03867);
            rule__GEqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__1_in_rule__GEqualityExpression__Group__03870);
            rule__GEqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__0"


    // $ANTLR start "rule__GEqualityExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1887:1: rule__GEqualityExpression__Group__0__Impl : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1891:1: ( ( ruleGRelationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1892:1: ( ruleGRelationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1892:1: ( ruleGRelationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1893:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__Group__0__Impl3897);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1904:1: rule__GEqualityExpression__Group__1 : rule__GEqualityExpression__Group__1__Impl ;
    public final void rule__GEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1908:1: ( rule__GEqualityExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1909:2: rule__GEqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__1__Impl_in_rule__GEqualityExpression__Group__13926);
            rule__GEqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__1"


    // $ANTLR start "rule__GEqualityExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1915:1: rule__GEqualityExpression__Group__1__Impl : ( ( rule__GEqualityExpression__Group_1__0 )* ) ;
    public final void rule__GEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1919:1: ( ( ( rule__GEqualityExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1920:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1920:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1921:1: ( rule__GEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1922:1: ( rule__GEqualityExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=18 && LA18_0<=19)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1922:2: rule__GEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__0_in_rule__GEqualityExpression__Group__1__Impl3953);
            	    rule__GEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1936:1: rule__GEqualityExpression__Group_1__0 : rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 ;
    public final void rule__GEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1940:1: ( rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1941:2: rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__0__Impl_in_rule__GEqualityExpression__Group_1__03988);
            rule__GEqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__1_in_rule__GEqualityExpression__Group_1__03991);
            rule__GEqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__0"


    // $ANTLR start "rule__GEqualityExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1948:1: rule__GEqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1952:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1953:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1953:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1954:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1955:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1957:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1967:1: rule__GEqualityExpression__Group_1__1 : rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 ;
    public final void rule__GEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1971:1: ( rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1972:2: rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__1__Impl_in_rule__GEqualityExpression__Group_1__14049);
            rule__GEqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__2_in_rule__GEqualityExpression__Group_1__14052);
            rule__GEqualityExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__1"


    // $ANTLR start "rule__GEqualityExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1979:1: rule__GEqualityExpression__Group_1__1__Impl : ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1983:1: ( ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1984:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1984:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1985:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1986:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1986:2: rule__GEqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__OperatorAssignment_1_1_in_rule__GEqualityExpression__Group_1__1__Impl4079);
            rule__GEqualityExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:1996:1: rule__GEqualityExpression__Group_1__2 : rule__GEqualityExpression__Group_1__2__Impl ;
    public final void rule__GEqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2000:1: ( rule__GEqualityExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2001:2: rule__GEqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__2__Impl_in_rule__GEqualityExpression__Group_1__24109);
            rule__GEqualityExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__2"


    // $ANTLR start "rule__GEqualityExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2007:1: rule__GEqualityExpression__Group_1__2__Impl : ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GEqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2011:1: ( ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2012:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2012:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2013:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2014:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2014:2: rule__GEqualityExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__RightOperandAssignment_1_2_in_rule__GEqualityExpression__Group_1__2__Impl4136);
            rule__GEqualityExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GRelationExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2030:1: rule__GRelationExpression__Group__0 : rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 ;
    public final void rule__GRelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2034:1: ( rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2035:2: rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__0__Impl_in_rule__GRelationExpression__Group__04172);
            rule__GRelationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group__1_in_rule__GRelationExpression__Group__04175);
            rule__GRelationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__0"


    // $ANTLR start "rule__GRelationExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2042:1: rule__GRelationExpression__Group__0__Impl : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2046:1: ( ( ruleGAdditionExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2047:1: ( ruleGAdditionExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2047:1: ( ruleGAdditionExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2048:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__Group__0__Impl4202);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__0__Impl"


    // $ANTLR start "rule__GRelationExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2059:1: rule__GRelationExpression__Group__1 : rule__GRelationExpression__Group__1__Impl ;
    public final void rule__GRelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2063:1: ( rule__GRelationExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2064:2: rule__GRelationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__1__Impl_in_rule__GRelationExpression__Group__14231);
            rule__GRelationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__1"


    // $ANTLR start "rule__GRelationExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2070:1: rule__GRelationExpression__Group__1__Impl : ( ( rule__GRelationExpression__Group_1__0 )* ) ;
    public final void rule__GRelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2074:1: ( ( ( rule__GRelationExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2075:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2075:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2076:1: ( rule__GRelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2077:1: ( rule__GRelationExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=20 && LA19_0<=23)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2077:2: rule__GRelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GRelationExpression__Group_1__0_in_rule__GRelationExpression__Group__1__Impl4258);
            	    rule__GRelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__1__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2091:1: rule__GRelationExpression__Group_1__0 : rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 ;
    public final void rule__GRelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2095:1: ( rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2096:2: rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__0__Impl_in_rule__GRelationExpression__Group_1__04293);
            rule__GRelationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__1_in_rule__GRelationExpression__Group_1__04296);
            rule__GRelationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__0"


    // $ANTLR start "rule__GRelationExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2103:1: rule__GRelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GRelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2107:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2108:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2108:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2109:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2110:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2112:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2122:1: rule__GRelationExpression__Group_1__1 : rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 ;
    public final void rule__GRelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2126:1: ( rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2127:2: rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__1__Impl_in_rule__GRelationExpression__Group_1__14354);
            rule__GRelationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__2_in_rule__GRelationExpression__Group_1__14357);
            rule__GRelationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__1"


    // $ANTLR start "rule__GRelationExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2134:1: rule__GRelationExpression__Group_1__1__Impl : ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GRelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2138:1: ( ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2139:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2139:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2140:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2141:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2141:2: rule__GRelationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__OperatorAssignment_1_1_in_rule__GRelationExpression__Group_1__1__Impl4384);
            rule__GRelationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2151:1: rule__GRelationExpression__Group_1__2 : rule__GRelationExpression__Group_1__2__Impl ;
    public final void rule__GRelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2155:1: ( rule__GRelationExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2156:2: rule__GRelationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__2__Impl_in_rule__GRelationExpression__Group_1__24414);
            rule__GRelationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__2"


    // $ANTLR start "rule__GRelationExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2162:1: rule__GRelationExpression__Group_1__2__Impl : ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GRelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2166:1: ( ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2167:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2167:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2168:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2169:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2169:2: rule__GRelationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GRelationExpression__RightOperandAssignment_1_2_in_rule__GRelationExpression__Group_1__2__Impl4441);
            rule__GRelationExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2185:1: rule__GAdditionExpression__Group__0 : rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 ;
    public final void rule__GAdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2189:1: ( rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2190:2: rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__0__Impl_in_rule__GAdditionExpression__Group__04477);
            rule__GAdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__1_in_rule__GAdditionExpression__Group__04480);
            rule__GAdditionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__0"


    // $ANTLR start "rule__GAdditionExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2197:1: rule__GAdditionExpression__Group__0__Impl : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2201:1: ( ( ruleGMultiplicationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2202:1: ( ruleGMultiplicationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2202:1: ( ruleGMultiplicationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2203:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__Group__0__Impl4507);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2214:1: rule__GAdditionExpression__Group__1 : rule__GAdditionExpression__Group__1__Impl ;
    public final void rule__GAdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2218:1: ( rule__GAdditionExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2219:2: rule__GAdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__1__Impl_in_rule__GAdditionExpression__Group__14536);
            rule__GAdditionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__1"


    // $ANTLR start "rule__GAdditionExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2225:1: rule__GAdditionExpression__Group__1__Impl : ( ( rule__GAdditionExpression__Group_1__0 )* ) ;
    public final void rule__GAdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2229:1: ( ( ( rule__GAdditionExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2230:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2230:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2231:1: ( rule__GAdditionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2232:1: ( rule__GAdditionExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=24 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2232:2: rule__GAdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__0_in_rule__GAdditionExpression__Group__1__Impl4563);
            	    rule__GAdditionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2246:1: rule__GAdditionExpression__Group_1__0 : rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 ;
    public final void rule__GAdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2250:1: ( rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2251:2: rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__0__Impl_in_rule__GAdditionExpression__Group_1__04598);
            rule__GAdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__1_in_rule__GAdditionExpression__Group_1__04601);
            rule__GAdditionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__0"


    // $ANTLR start "rule__GAdditionExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2258:1: rule__GAdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2262:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2263:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2263:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2264:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2265:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2267:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2277:1: rule__GAdditionExpression__Group_1__1 : rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 ;
    public final void rule__GAdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2281:1: ( rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2282:2: rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__1__Impl_in_rule__GAdditionExpression__Group_1__14659);
            rule__GAdditionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__2_in_rule__GAdditionExpression__Group_1__14662);
            rule__GAdditionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__1"


    // $ANTLR start "rule__GAdditionExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2289:1: rule__GAdditionExpression__Group_1__1__Impl : ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2293:1: ( ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2294:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2294:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2295:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2296:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2296:2: rule__GAdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__OperatorAssignment_1_1_in_rule__GAdditionExpression__Group_1__1__Impl4689);
            rule__GAdditionExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2306:1: rule__GAdditionExpression__Group_1__2 : rule__GAdditionExpression__Group_1__2__Impl ;
    public final void rule__GAdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2310:1: ( rule__GAdditionExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2311:2: rule__GAdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__2__Impl_in_rule__GAdditionExpression__Group_1__24719);
            rule__GAdditionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__2"


    // $ANTLR start "rule__GAdditionExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2317:1: rule__GAdditionExpression__Group_1__2__Impl : ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2321:1: ( ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2322:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2322:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2323:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2324:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2324:2: rule__GAdditionExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__RightOperandAssignment_1_2_in_rule__GAdditionExpression__Group_1__2__Impl4746);
            rule__GAdditionExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2340:1: rule__GMultiplicationExpression__Group__0 : rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 ;
    public final void rule__GMultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2344:1: ( rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2345:2: rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__0__Impl_in_rule__GMultiplicationExpression__Group__04782);
            rule__GMultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__1_in_rule__GMultiplicationExpression__Group__04785);
            rule__GMultiplicationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__0"


    // $ANTLR start "rule__GMultiplicationExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2352:1: rule__GMultiplicationExpression__Group__0__Impl : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2356:1: ( ( ruleGNegationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2357:1: ( ruleGNegationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2357:1: ( ruleGNegationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2358:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__Group__0__Impl4812);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2369:1: rule__GMultiplicationExpression__Group__1 : rule__GMultiplicationExpression__Group__1__Impl ;
    public final void rule__GMultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2373:1: ( rule__GMultiplicationExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2374:2: rule__GMultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__1__Impl_in_rule__GMultiplicationExpression__Group__14841);
            rule__GMultiplicationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__1"


    // $ANTLR start "rule__GMultiplicationExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2380:1: rule__GMultiplicationExpression__Group__1__Impl : ( ( rule__GMultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__GMultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2384:1: ( ( ( rule__GMultiplicationExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2385:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2385:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2386:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2387:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=27)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2387:2: rule__GMultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__0_in_rule__GMultiplicationExpression__Group__1__Impl4868);
            	    rule__GMultiplicationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2401:1: rule__GMultiplicationExpression__Group_1__0 : rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 ;
    public final void rule__GMultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2405:1: ( rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2406:2: rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__0__Impl_in_rule__GMultiplicationExpression__Group_1__04903);
            rule__GMultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__1_in_rule__GMultiplicationExpression__Group_1__04906);
            rule__GMultiplicationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2413:1: rule__GMultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GMultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2417:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2418:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2418:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2419:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2420:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2422:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2432:1: rule__GMultiplicationExpression__Group_1__1 : rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 ;
    public final void rule__GMultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2436:1: ( rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2437:2: rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__1__Impl_in_rule__GMultiplicationExpression__Group_1__14964);
            rule__GMultiplicationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__2_in_rule__GMultiplicationExpression__Group_1__14967);
            rule__GMultiplicationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2444:1: rule__GMultiplicationExpression__Group_1__1__Impl : ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2448:1: ( ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2449:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2449:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2450:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2451:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2451:2: rule__GMultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__OperatorAssignment_1_1_in_rule__GMultiplicationExpression__Group_1__1__Impl4994);
            rule__GMultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2461:1: rule__GMultiplicationExpression__Group_1__2 : rule__GMultiplicationExpression__Group_1__2__Impl ;
    public final void rule__GMultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2465:1: ( rule__GMultiplicationExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2466:2: rule__GMultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__2__Impl_in_rule__GMultiplicationExpression__Group_1__25024);
            rule__GMultiplicationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2472:1: rule__GMultiplicationExpression__Group_1__2__Impl : ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2476:1: ( ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2477:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2477:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2478:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2479:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2479:2: rule__GMultiplicationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__RightOperandAssignment_1_2_in_rule__GMultiplicationExpression__Group_1__2__Impl5051);
            rule__GMultiplicationExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2495:1: rule__GNegationExpression__Group_1__0 : rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 ;
    public final void rule__GNegationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2499:1: ( rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2500:2: rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__0__Impl_in_rule__GNegationExpression__Group_1__05087);
            rule__GNegationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__1_in_rule__GNegationExpression__Group_1__05090);
            rule__GNegationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__0"


    // $ANTLR start "rule__GNegationExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2507:1: rule__GNegationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNegationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2511:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2512:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2512:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2513:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2514:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2516:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2526:1: rule__GNegationExpression__Group_1__1 : rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 ;
    public final void rule__GNegationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2530:1: ( rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2531:2: rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__1__Impl_in_rule__GNegationExpression__Group_1__15148);
            rule__GNegationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__2_in_rule__GNegationExpression__Group_1__15151);
            rule__GNegationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__1"


    // $ANTLR start "rule__GNegationExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2538:1: rule__GNegationExpression__Group_1__1__Impl : ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GNegationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2542:1: ( ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2543:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2543:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2544:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2545:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2545:2: rule__GNegationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GNegationExpression__OperatorAssignment_1_1_in_rule__GNegationExpression__Group_1__1__Impl5178);
            rule__GNegationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2555:1: rule__GNegationExpression__Group_1__2 : rule__GNegationExpression__Group_1__2__Impl ;
    public final void rule__GNegationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2559:1: ( rule__GNegationExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2560:2: rule__GNegationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__2__Impl_in_rule__GNegationExpression__Group_1__25208);
            rule__GNegationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__2"


    // $ANTLR start "rule__GNegationExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2566:1: rule__GNegationExpression__Group_1__2__Impl : ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__GNegationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2570:1: ( ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2571:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2571:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2572:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2573:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2573:2: rule__GNegationExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GNegationExpression__OperandAssignment_1_2_in_rule__GNegationExpression__Group_1__2__Impl5235);
            rule__GNegationExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2589:1: rule__GNavigationExpression__Group__0 : rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 ;
    public final void rule__GNavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2593:1: ( rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2594:2: rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__0__Impl_in_rule__GNavigationExpression__Group__05271);
            rule__GNavigationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__1_in_rule__GNavigationExpression__Group__05274);
            rule__GNavigationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__0"


    // $ANTLR start "rule__GNavigationExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2601:1: rule__GNavigationExpression__Group__0__Impl : ( ruleGReferenceExpression ) ;
    public final void rule__GNavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2605:1: ( ( ruleGReferenceExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2606:1: ( ruleGReferenceExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2606:1: ( ruleGReferenceExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2607:1: ruleGReferenceExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_rule__GNavigationExpression__Group__0__Impl5301);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__0__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2618:1: rule__GNavigationExpression__Group__1 : rule__GNavigationExpression__Group__1__Impl ;
    public final void rule__GNavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2622:1: ( rule__GNavigationExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2623:2: rule__GNavigationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__1__Impl_in_rule__GNavigationExpression__Group__15330);
            rule__GNavigationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__1"


    // $ANTLR start "rule__GNavigationExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2629:1: rule__GNavigationExpression__Group__1__Impl : ( ( rule__GNavigationExpression__Group_1__0 )* ) ;
    public final void rule__GNavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2633:1: ( ( ( rule__GNavigationExpression__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2634:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2634:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2635:1: ( rule__GNavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2636:1: ( rule__GNavigationExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=16 && LA22_0<=17)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2636:2: rule__GNavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__0_in_rule__GNavigationExpression__Group__1__Impl5357);
            	    rule__GNavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__1__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2650:1: rule__GNavigationExpression__Group_1__0 : rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 ;
    public final void rule__GNavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2654:1: ( rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2655:2: rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__0__Impl_in_rule__GNavigationExpression__Group_1__05392);
            rule__GNavigationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__1_in_rule__GNavigationExpression__Group_1__05395);
            rule__GNavigationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__0"


    // $ANTLR start "rule__GNavigationExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2662:1: rule__GNavigationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2666:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2667:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2667:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2668:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2669:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2671:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2681:1: rule__GNavigationExpression__Group_1__1 : rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 ;
    public final void rule__GNavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2685:1: ( rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2686:2: rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__1__Impl_in_rule__GNavigationExpression__Group_1__15453);
            rule__GNavigationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__2_in_rule__GNavigationExpression__Group_1__15456);
            rule__GNavigationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__1"


    // $ANTLR start "rule__GNavigationExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2693:1: rule__GNavigationExpression__Group_1__1__Impl : ( ruleNavigationOperator ) ;
    public final void rule__GNavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2697:1: ( ( ruleNavigationOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2698:1: ( ruleNavigationOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2698:1: ( ruleNavigationOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2699:1: ruleNavigationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_rule__GNavigationExpression__Group_1__1__Impl5483);
            ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2710:1: rule__GNavigationExpression__Group_1__2 : rule__GNavigationExpression__Group_1__2__Impl ;
    public final void rule__GNavigationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2714:1: ( rule__GNavigationExpression__Group_1__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2715:2: rule__GNavigationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__2__Impl_in_rule__GNavigationExpression__Group_1__25512);
            rule__GNavigationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__2"


    // $ANTLR start "rule__GNavigationExpression__Group_1__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2721:1: rule__GNavigationExpression__Group_1__2__Impl : ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) ) ;
    public final void rule__GNavigationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2725:1: ( ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2726:1: ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2726:1: ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2727:1: ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2728:1: ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2728:2: rule__GNavigationExpression__ReferencedEObjectAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__ReferencedEObjectAssignment_1_2_in_rule__GNavigationExpression__Group_1__2__Impl5539);
            rule__GNavigationExpression__ReferencedEObjectAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GReferenceExpression__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2744:1: rule__GReferenceExpression__Group_1__0 : rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 ;
    public final void rule__GReferenceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2748:1: ( rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2749:2: rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__0__Impl_in_rule__GReferenceExpression__Group_1__05575);
            rule__GReferenceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__1_in_rule__GReferenceExpression__Group_1__05578);
            rule__GReferenceExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__0"


    // $ANTLR start "rule__GReferenceExpression__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2756:1: rule__GReferenceExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GReferenceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2760:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2761:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2761:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2762:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2763:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2765:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GReferenceExpression__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2775:1: rule__GReferenceExpression__Group_1__1 : rule__GReferenceExpression__Group_1__1__Impl ;
    public final void rule__GReferenceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2779:1: ( rule__GReferenceExpression__Group_1__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2780:2: rule__GReferenceExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__1__Impl_in_rule__GReferenceExpression__Group_1__15636);
            rule__GReferenceExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__1"


    // $ANTLR start "rule__GReferenceExpression__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2786:1: rule__GReferenceExpression__Group_1__1__Impl : ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) ;
    public final void rule__GReferenceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2790:1: ( ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2791:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2791:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2792:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2793:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2793:2: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__ReferencedEObjectAssignment_1_1_in_rule__GReferenceExpression__Group_1__1__Impl5663);
            rule__GReferenceExpression__ReferencedEObjectAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GStringExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2807:1: rule__GStringExpression__Group__0 : rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 ;
    public final void rule__GStringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2811:1: ( rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2812:2: rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__0__Impl_in_rule__GStringExpression__Group__05697);
            rule__GStringExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GStringExpression__Group__1_in_rule__GStringExpression__Group__05700);
            rule__GStringExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__0"


    // $ANTLR start "rule__GStringExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2819:1: rule__GStringExpression__Group__0__Impl : ( () ) ;
    public final void rule__GStringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2823:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2824:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2824:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2825:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2826:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2828:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__0__Impl"


    // $ANTLR start "rule__GStringExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2838:1: rule__GStringExpression__Group__1 : rule__GStringExpression__Group__1__Impl ;
    public final void rule__GStringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2842:1: ( rule__GStringExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2843:2: rule__GStringExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__1__Impl_in_rule__GStringExpression__Group__15758);
            rule__GStringExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__1"


    // $ANTLR start "rule__GStringExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2849:1: rule__GStringExpression__Group__1__Impl : ( ( rule__GStringExpression__ValueAssignment_1 ) ) ;
    public final void rule__GStringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2853:1: ( ( ( rule__GStringExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2854:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2854:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2855:1: ( rule__GStringExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2856:1: ( rule__GStringExpression__ValueAssignment_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2856:2: rule__GStringExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GStringExpression__ValueAssignment_1_in_rule__GStringExpression__Group__1__Impl5785);
            rule__GStringExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__1__Impl"


    // $ANTLR start "rule__GBooleanExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2870:1: rule__GBooleanExpression__Group__0 : rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 ;
    public final void rule__GBooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2874:1: ( rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2875:2: rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__0__Impl_in_rule__GBooleanExpression__Group__05819);
            rule__GBooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__1_in_rule__GBooleanExpression__Group__05822);
            rule__GBooleanExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__0"


    // $ANTLR start "rule__GBooleanExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2882:1: rule__GBooleanExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2886:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2887:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2887:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2888:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2889:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2891:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__GBooleanExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2901:1: rule__GBooleanExpression__Group__1 : rule__GBooleanExpression__Group__1__Impl ;
    public final void rule__GBooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2905:1: ( rule__GBooleanExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2906:2: rule__GBooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__1__Impl_in_rule__GBooleanExpression__Group__15880);
            rule__GBooleanExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__1"


    // $ANTLR start "rule__GBooleanExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2912:1: rule__GBooleanExpression__Group__1__Impl : ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) ;
    public final void rule__GBooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2916:1: ( ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2917:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2917:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2918:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2919:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2919:2: rule__GBooleanExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__ValueAssignment_1_in_rule__GBooleanExpression__Group__1__Impl5907);
            rule__GBooleanExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__GIntegerExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2933:1: rule__GIntegerExpression__Group__0 : rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 ;
    public final void rule__GIntegerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2937:1: ( rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2938:2: rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__0__Impl_in_rule__GIntegerExpression__Group__05941);
            rule__GIntegerExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__1_in_rule__GIntegerExpression__Group__05944);
            rule__GIntegerExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__0"


    // $ANTLR start "rule__GIntegerExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2945:1: rule__GIntegerExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIntegerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2949:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2950:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2950:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2951:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2952:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2954:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__0__Impl"


    // $ANTLR start "rule__GIntegerExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2964:1: rule__GIntegerExpression__Group__1 : rule__GIntegerExpression__Group__1__Impl ;
    public final void rule__GIntegerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2968:1: ( rule__GIntegerExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2969:2: rule__GIntegerExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__1__Impl_in_rule__GIntegerExpression__Group__16002);
            rule__GIntegerExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__1"


    // $ANTLR start "rule__GIntegerExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2975:1: rule__GIntegerExpression__Group__1__Impl : ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) ;
    public final void rule__GIntegerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2979:1: ( ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2980:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2980:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2981:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2982:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2982:2: rule__GIntegerExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__ValueAssignment_1_in_rule__GIntegerExpression__Group__1__Impl6029);
            rule__GIntegerExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__1__Impl"


    // $ANTLR start "rule__GDoubleExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:2996:1: rule__GDoubleExpression__Group__0 : rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 ;
    public final void rule__GDoubleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3000:1: ( rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3001:2: rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__0__Impl_in_rule__GDoubleExpression__Group__06063);
            rule__GDoubleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__1_in_rule__GDoubleExpression__Group__06066);
            rule__GDoubleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__0"


    // $ANTLR start "rule__GDoubleExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3008:1: rule__GDoubleExpression__Group__0__Impl : ( () ) ;
    public final void rule__GDoubleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3012:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3013:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3013:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3014:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3015:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3017:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__0__Impl"


    // $ANTLR start "rule__GDoubleExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3027:1: rule__GDoubleExpression__Group__1 : rule__GDoubleExpression__Group__1__Impl ;
    public final void rule__GDoubleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3031:1: ( rule__GDoubleExpression__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3032:2: rule__GDoubleExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__1__Impl_in_rule__GDoubleExpression__Group__16124);
            rule__GDoubleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__1"


    // $ANTLR start "rule__GDoubleExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3038:1: rule__GDoubleExpression__Group__1__Impl : ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) ;
    public final void rule__GDoubleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3042:1: ( ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3043:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3043:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3044:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3045:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3045:2: rule__GDoubleExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__ValueAssignment_1_in_rule__GDoubleExpression__Group__1__Impl6151);
            rule__GDoubleExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__1__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3059:1: rule__GEnumLiteralExpression__Group__0 : rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 ;
    public final void rule__GEnumLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3063:1: ( rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3064:2: rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__0__Impl_in_rule__GEnumLiteralExpression__Group__06185);
            rule__GEnumLiteralExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__1_in_rule__GEnumLiteralExpression__Group__06188);
            rule__GEnumLiteralExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__0"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3071:1: rule__GEnumLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__GEnumLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3075:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3076:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3076:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3077:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3078:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3080:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3090:1: rule__GEnumLiteralExpression__Group__1 : rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 ;
    public final void rule__GEnumLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3094:1: ( rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3095:2: rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__1__Impl_in_rule__GEnumLiteralExpression__Group__16246);
            rule__GEnumLiteralExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__2_in_rule__GEnumLiteralExpression__Group__16249);
            rule__GEnumLiteralExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__1"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3102:1: rule__GEnumLiteralExpression__Group__1__Impl : ( '#' ) ;
    public final void rule__GEnumLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3106:1: ( ( '#' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3107:1: ( '#' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3107:1: ( '#' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3108:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__GEnumLiteralExpression__Group__1__Impl6277); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3121:1: rule__GEnumLiteralExpression__Group__2 : rule__GEnumLiteralExpression__Group__2__Impl ;
    public final void rule__GEnumLiteralExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3125:1: ( rule__GEnumLiteralExpression__Group__2__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3126:2: rule__GEnumLiteralExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__2__Impl_in_rule__GEnumLiteralExpression__Group__26308);
            rule__GEnumLiteralExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__2"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3132:1: rule__GEnumLiteralExpression__Group__2__Impl : ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) ;
    public final void rule__GEnumLiteralExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3136:1: ( ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3137:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3137:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3138:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3139:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3139:2: rule__GEnumLiteralExpression__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__ValueAssignment_2_in_rule__GEnumLiteralExpression__Group__2__Impl6335);
            rule__GEnumLiteralExpression__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__2__Impl"


    // $ANTLR start "rule__GIfExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3155:1: rule__GIfExpression__Group__0 : rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 ;
    public final void rule__GIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3159:1: ( rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3160:2: rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__0__Impl_in_rule__GIfExpression__Group__06371);
            rule__GIfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__1_in_rule__GIfExpression__Group__06374);
            rule__GIfExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__0"


    // $ANTLR start "rule__GIfExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3167:1: rule__GIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3171:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3172:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3172:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3173:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3174:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3176:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__0__Impl"


    // $ANTLR start "rule__GIfExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3186:1: rule__GIfExpression__Group__1 : rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 ;
    public final void rule__GIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3190:1: ( rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3191:2: rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__1__Impl_in_rule__GIfExpression__Group__16432);
            rule__GIfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__2_in_rule__GIfExpression__Group__16435);
            rule__GIfExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__1"


    // $ANTLR start "rule__GIfExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3198:1: rule__GIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__GIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3202:1: ( ( 'if' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3203:1: ( 'if' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3203:1: ( 'if' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3204:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__GIfExpression__Group__1__Impl6463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__1__Impl"


    // $ANTLR start "rule__GIfExpression__Group__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3217:1: rule__GIfExpression__Group__2 : rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 ;
    public final void rule__GIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3221:1: ( rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3222:2: rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__2__Impl_in_rule__GIfExpression__Group__26494);
            rule__GIfExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__3_in_rule__GIfExpression__Group__26497);
            rule__GIfExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__2"


    // $ANTLR start "rule__GIfExpression__Group__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3229:1: rule__GIfExpression__Group__2__Impl : ( ( rule__GIfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__GIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3233:1: ( ( ( rule__GIfExpression__ConditionAssignment_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3234:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3234:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3235:1: ( rule__GIfExpression__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3236:1: ( rule__GIfExpression__ConditionAssignment_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3236:2: rule__GIfExpression__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__GIfExpression__ConditionAssignment_2_in_rule__GIfExpression__Group__2__Impl6524);
            rule__GIfExpression__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__2__Impl"


    // $ANTLR start "rule__GIfExpression__Group__3"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3246:1: rule__GIfExpression__Group__3 : rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 ;
    public final void rule__GIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3250:1: ( rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3251:2: rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__3__Impl_in_rule__GIfExpression__Group__36554);
            rule__GIfExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__4_in_rule__GIfExpression__Group__36557);
            rule__GIfExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__3"


    // $ANTLR start "rule__GIfExpression__Group__3__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3258:1: rule__GIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__GIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3262:1: ( ( 'then' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3263:1: ( 'then' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3263:1: ( 'then' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3264:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__GIfExpression__Group__3__Impl6585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__3__Impl"


    // $ANTLR start "rule__GIfExpression__Group__4"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3277:1: rule__GIfExpression__Group__4 : rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 ;
    public final void rule__GIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3281:1: ( rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3282:2: rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__4__Impl_in_rule__GIfExpression__Group__46616);
            rule__GIfExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__5_in_rule__GIfExpression__Group__46619);
            rule__GIfExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__4"


    // $ANTLR start "rule__GIfExpression__Group__4__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3289:1: rule__GIfExpression__Group__4__Impl : ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__GIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3293:1: ( ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3294:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3294:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3295:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3296:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3296:2: rule__GIfExpression__ThenExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__GIfExpression__ThenExpressionAssignment_4_in_rule__GIfExpression__Group__4__Impl6646);
            rule__GIfExpression__ThenExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__4__Impl"


    // $ANTLR start "rule__GIfExpression__Group__5"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3306:1: rule__GIfExpression__Group__5 : rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 ;
    public final void rule__GIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3310:1: ( rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3311:2: rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__5__Impl_in_rule__GIfExpression__Group__56676);
            rule__GIfExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__6_in_rule__GIfExpression__Group__56679);
            rule__GIfExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__5"


    // $ANTLR start "rule__GIfExpression__Group__5__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3318:1: rule__GIfExpression__Group__5__Impl : ( 'else' ) ;
    public final void rule__GIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3322:1: ( ( 'else' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3323:1: ( 'else' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3323:1: ( 'else' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3324:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__GIfExpression__Group__5__Impl6707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__5__Impl"


    // $ANTLR start "rule__GIfExpression__Group__6"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3337:1: rule__GIfExpression__Group__6 : rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 ;
    public final void rule__GIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3341:1: ( rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3342:2: rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__6__Impl_in_rule__GIfExpression__Group__66738);
            rule__GIfExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__7_in_rule__GIfExpression__Group__66741);
            rule__GIfExpression__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__6"


    // $ANTLR start "rule__GIfExpression__Group__6__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3349:1: rule__GIfExpression__Group__6__Impl : ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) ;
    public final void rule__GIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3353:1: ( ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3354:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3354:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3355:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3356:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3356:2: rule__GIfExpression__ElseExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__GIfExpression__ElseExpressionAssignment_6_in_rule__GIfExpression__Group__6__Impl6768);
            rule__GIfExpression__ElseExpressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__6__Impl"


    // $ANTLR start "rule__GIfExpression__Group__7"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3366:1: rule__GIfExpression__Group__7 : rule__GIfExpression__Group__7__Impl ;
    public final void rule__GIfExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3370:1: ( rule__GIfExpression__Group__7__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3371:2: rule__GIfExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__7__Impl_in_rule__GIfExpression__Group__76798);
            rule__GIfExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__7"


    // $ANTLR start "rule__GIfExpression__Group__7__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3377:1: rule__GIfExpression__Group__7__Impl : ( 'endif' ) ;
    public final void rule__GIfExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3381:1: ( ( 'endif' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3382:1: ( 'endif' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3382:1: ( 'endif' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3383:1: 'endif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }
            match(input,36,FOLLOW_36_in_rule__GIfExpression__Group__7__Impl6826); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__7__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3412:1: rule__GBraceExpression__Group__0 : rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 ;
    public final void rule__GBraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3416:1: ( rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3417:2: rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__0__Impl_in_rule__GBraceExpression__Group__06873);
            rule__GBraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__1_in_rule__GBraceExpression__Group__06876);
            rule__GBraceExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__0"


    // $ANTLR start "rule__GBraceExpression__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3424:1: rule__GBraceExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3428:1: ( ( () ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3429:1: ( () )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3429:1: ( () )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3430:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3431:1: ()
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3433:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__0__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3443:1: rule__GBraceExpression__Group__1 : rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 ;
    public final void rule__GBraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3447:1: ( rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3448:2: rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__1__Impl_in_rule__GBraceExpression__Group__16934);
            rule__GBraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__2_in_rule__GBraceExpression__Group__16937);
            rule__GBraceExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__1"


    // $ANTLR start "rule__GBraceExpression__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3455:1: rule__GBraceExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__GBraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3459:1: ( ( '(' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3460:1: ( '(' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3460:1: ( '(' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3461:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__GBraceExpression__Group__1__Impl6965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__1__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3474:1: rule__GBraceExpression__Group__2 : rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 ;
    public final void rule__GBraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3478:1: ( rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3479:2: rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__2__Impl_in_rule__GBraceExpression__Group__26996);
            rule__GBraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__3_in_rule__GBraceExpression__Group__26999);
            rule__GBraceExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__2"


    // $ANTLR start "rule__GBraceExpression__Group__2__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3486:1: rule__GBraceExpression__Group__2__Impl : ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) ;
    public final void rule__GBraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3490:1: ( ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3491:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3491:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3492:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3493:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3493:2: rule__GBraceExpression__InnerExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__GBraceExpression__InnerExpressionAssignment_2_in_rule__GBraceExpression__Group__2__Impl7026);
            rule__GBraceExpression__InnerExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__2__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__3"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3503:1: rule__GBraceExpression__Group__3 : rule__GBraceExpression__Group__3__Impl ;
    public final void rule__GBraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3507:1: ( rule__GBraceExpression__Group__3__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3508:2: rule__GBraceExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__3__Impl_in_rule__GBraceExpression__Group__37056);
            rule__GBraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__3"


    // $ANTLR start "rule__GBraceExpression__Group__3__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3514:1: rule__GBraceExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__GBraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3518:1: ( ( ')' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3519:1: ( ')' )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3519:1: ( ')' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3520:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__GBraceExpression__Group__3__Impl7084); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3541:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3545:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3546:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07123);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07126);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3553:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3557:1: ( ( RULE_ID ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3558:1: ( RULE_ID )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3558:1: ( RULE_ID )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3559:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7153); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3570:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3574:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3575:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17182);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3581:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3585:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3586:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3586:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3587:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3588:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_ID) ) {
                        int LA23_3 = input.LA(3);

                        if ( (synpred29_InternalGExpressions()) ) {
                            alt23=1;
                        }


                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3588:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7209);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3602:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3606:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3607:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07244);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07247);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3614:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3618:1: ( ( ( '.' ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3619:1: ( ( '.' ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3619:1: ( ( '.' ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3620:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3621:1: ( '.' )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3622:2: '.'
            {
            match(input,16,FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl7276); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3633:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3637:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3638:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17308);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3644:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3648:1: ( ( RULE_ID ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3649:1: ( RULE_ID )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3649:1: ( RULE_ID )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3650:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7335); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__GProgram__ImportsAssignment_0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3666:1: rule__GProgram__ImportsAssignment_0 : ( ruleGImportStatement ) ;
    public final void rule__GProgram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3670:1: ( ( ruleGImportStatement ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3671:1: ( ruleGImportStatement )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3671:1: ( ruleGImportStatement )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3672:1: ruleGImportStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getImportsGImportStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_rule__GProgram__ImportsAssignment_07373);
            ruleGImportStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getImportsGImportStatementParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__ImportsAssignment_0"


    // $ANTLR start "rule__GProgram__ExpressionsAssignment_1_0"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3681:1: rule__GProgram__ExpressionsAssignment_1_0 : ( ruleGExpression ) ;
    public final void rule__GProgram__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3685:1: ( ( ruleGExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3686:1: ( ruleGExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3686:1: ( ruleGExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3687:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getExpressionsGExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GProgram__ExpressionsAssignment_1_07404);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getExpressionsGExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__ExpressionsAssignment_1_0"


    // $ANTLR start "rule__GProgram__ExpressionsAssignment_1_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3696:1: rule__GProgram__ExpressionsAssignment_1_1_1 : ( ruleGExpression ) ;
    public final void rule__GProgram__ExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3700:1: ( ( ruleGExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3701:1: ( ruleGExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3701:1: ( ruleGExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3702:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGProgramAccess().getExpressionsGExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GProgram__ExpressionsAssignment_1_1_17435);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGProgramAccess().getExpressionsGExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GProgram__ExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__GImportStatement__ImportURIAssignment_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3711:1: rule__GImportStatement__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GImportStatement__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3715:1: ( ( RULE_STRING ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3716:1: ( RULE_STRING )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3716:1: ( RULE_STRING )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3717:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GImportStatement__ImportURIAssignment_17466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__ImportURIAssignment_1"


    // $ANTLR start "rule__GOrExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3726:1: rule__GOrExpression__OperatorAssignment_1_1 : ( ruleGOrOperator ) ;
    public final void rule__GOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3730:1: ( ( ruleGOrOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3731:1: ( ruleGOrOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3731:1: ( ruleGOrOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3732:1: ruleGOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGOrOperator_in_rule__GOrExpression__OperatorAssignment_1_17497);
            ruleGOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GOrExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3741:1: rule__GOrExpression__RightOperandAssignment_1_2 : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3745:1: ( ( ruleGXorExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3746:1: ( ruleGXorExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3746:1: ( ruleGXorExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3747:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_rule__GOrExpression__RightOperandAssignment_1_27528);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GXorExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3756:1: rule__GXorExpression__OperatorAssignment_1_1 : ( ruleGXorOperator ) ;
    public final void rule__GXorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3760:1: ( ( ruleGXorOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3761:1: ( ruleGXorOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3761:1: ( ruleGXorOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3762:1: ruleGXorOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGXorOperator_in_rule__GXorExpression__OperatorAssignment_1_17559);
            ruleGXorOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GXorExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3771:1: rule__GXorExpression__RightOperandAssignment_1_2 : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3775:1: ( ( ruleGAndExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3776:1: ( ruleGAndExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3776:1: ( ruleGAndExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3777:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_rule__GXorExpression__RightOperandAssignment_1_27590);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GAndExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3786:1: rule__GAndExpression__OperatorAssignment_1_1 : ( ruleGAndOperator ) ;
    public final void rule__GAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3790:1: ( ( ruleGAndOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3791:1: ( ruleGAndOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3791:1: ( ruleGAndOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3792:1: ruleGAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGAndOperator_in_rule__GAndExpression__OperatorAssignment_1_17621);
            ruleGAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GAndExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3801:1: rule__GAndExpression__RightOperandAssignment_1_2 : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3805:1: ( ( ruleGEqualityExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3806:1: ( ruleGEqualityExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3806:1: ( ruleGEqualityExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3807:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__RightOperandAssignment_1_27652);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GEqualityExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3816:1: rule__GEqualityExpression__OperatorAssignment_1_1 : ( ruleGEqualityOperator ) ;
    public final void rule__GEqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3820:1: ( ( ruleGEqualityOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3821:1: ( ruleGEqualityOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3821:1: ( ruleGEqualityOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3822:1: ruleGEqualityOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityOperator_in_rule__GEqualityExpression__OperatorAssignment_1_17683);
            ruleGEqualityOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GEqualityExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3831:1: rule__GEqualityExpression__RightOperandAssignment_1_2 : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3835:1: ( ( ruleGRelationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3836:1: ( ruleGRelationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3836:1: ( ruleGRelationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3837:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__RightOperandAssignment_1_27714);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GRelationExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3846:1: rule__GRelationExpression__OperatorAssignment_1_1 : ( ruleGRelationOperator ) ;
    public final void rule__GRelationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3850:1: ( ( ruleGRelationOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3851:1: ( ruleGRelationOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3851:1: ( ruleGRelationOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3852:1: ruleGRelationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationOperator_in_rule__GRelationExpression__OperatorAssignment_1_17745);
            ruleGRelationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GRelationExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3861:1: rule__GRelationExpression__RightOperandAssignment_1_2 : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3865:1: ( ( ruleGAdditionExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3866:1: ( ruleGAdditionExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3866:1: ( ruleGAdditionExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3867:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__RightOperandAssignment_1_27776);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GAdditionExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3876:1: rule__GAdditionExpression__OperatorAssignment_1_1 : ( ruleGAdditionOperator ) ;
    public final void rule__GAdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3880:1: ( ( ruleGAdditionOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3881:1: ( ruleGAdditionOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3881:1: ( ruleGAdditionOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3882:1: ruleGAdditionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionOperator_in_rule__GAdditionExpression__OperatorAssignment_1_17807);
            ruleGAdditionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GAdditionExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3891:1: rule__GAdditionExpression__RightOperandAssignment_1_2 : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3895:1: ( ( ruleGMultiplicationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3896:1: ( ruleGMultiplicationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3896:1: ( ruleGMultiplicationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3897:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__RightOperandAssignment_1_27838);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GMultiplicationExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3906:1: rule__GMultiplicationExpression__OperatorAssignment_1_1 : ( ruleGMultiplicationOperator ) ;
    public final void rule__GMultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3910:1: ( ( ruleGMultiplicationOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3911:1: ( ruleGMultiplicationOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3911:1: ( ruleGMultiplicationOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3912:1: ruleGMultiplicationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationOperator_in_rule__GMultiplicationExpression__OperatorAssignment_1_17869);
            ruleGMultiplicationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GMultiplicationExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3921:1: rule__GMultiplicationExpression__RightOperandAssignment_1_2 : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3925:1: ( ( ruleGNegationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3926:1: ( ruleGNegationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3926:1: ( ruleGNegationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3927:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__RightOperandAssignment_1_27900);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GNegationExpression__OperatorAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3936:1: rule__GNegationExpression__OperatorAssignment_1_1 : ( ruleGNegationOperator ) ;
    public final void rule__GNegationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3940:1: ( ( ruleGNegationOperator ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3941:1: ( ruleGNegationOperator )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3941:1: ( ruleGNegationOperator )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3942:1: ruleGNegationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationOperator_in_rule__GNegationExpression__OperatorAssignment_1_17931);
            ruleGNegationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GNegationExpression__OperandAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3951:1: rule__GNegationExpression__OperandAssignment_1_2 : ( ruleGNavigationExpression ) ;
    public final void rule__GNegationExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3955:1: ( ( ruleGNavigationExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3956:1: ( ruleGNavigationExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3956:1: ( ruleGNavigationExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3957:1: ruleGNavigationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__OperandAssignment_1_27962);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3966:1: rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GNavigationExpression__ReferencedEObjectAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3970:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3971:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3971:1: ( ( RULE_ID ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3972:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3973:1: ( RULE_ID )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3974:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GNavigationExpression__ReferencedEObjectAssignment_1_27997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2"


    // $ANTLR start "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3985:1: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GReferenceExpression__ReferencedEObjectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3989:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3990:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3990:1: ( ( RULE_ID ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3991:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3992:1: ( RULE_ID )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3993:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GReferenceExpression__ReferencedEObjectAssignment_1_18036); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"


    // $ANTLR start "rule__GStringExpression__ValueAssignment_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4004:1: rule__GStringExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GStringExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4008:1: ( ( RULE_STRING ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4009:1: ( RULE_STRING )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4009:1: ( RULE_STRING )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4010:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GStringExpression__ValueAssignment_18071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__ValueAssignment_1"


    // $ANTLR start "rule__GBooleanExpression__ValueAssignment_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4019:1: rule__GBooleanExpression__ValueAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__GBooleanExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4023:1: ( ( RULE_BOOLEAN ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4024:1: ( RULE_BOOLEAN )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4024:1: ( RULE_BOOLEAN )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4025:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__GBooleanExpression__ValueAssignment_18102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__ValueAssignment_1"


    // $ANTLR start "rule__GIntegerExpression__ValueAssignment_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4034:1: rule__GIntegerExpression__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__GIntegerExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4038:1: ( ( RULE_INT ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4039:1: ( RULE_INT )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4039:1: ( RULE_INT )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4040:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GIntegerExpression__ValueAssignment_18133); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__ValueAssignment_1"


    // $ANTLR start "rule__GDoubleExpression__ValueAssignment_1"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4049:1: rule__GDoubleExpression__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__GDoubleExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4053:1: ( ( RULE_DOUBLE ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4054:1: ( RULE_DOUBLE )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4054:1: ( RULE_DOUBLE )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4055:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__GDoubleExpression__ValueAssignment_18164); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__ValueAssignment_1"


    // $ANTLR start "rule__GEnumLiteralExpression__ValueAssignment_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4064:1: rule__GEnumLiteralExpression__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GEnumLiteralExpression__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4068:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4069:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4069:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4070:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4071:1: ( ruleQualifiedName )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4072:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GEnumLiteralExpression__ValueAssignment_28199);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__ValueAssignment_2"


    // $ANTLR start "rule__GIfExpression__ConditionAssignment_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4083:1: rule__GIfExpression__ConditionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4087:1: ( ( ruleGExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4088:1: ( ruleGExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4088:1: ( ruleGExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4089:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ConditionAssignment_28234);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ConditionAssignment_2"


    // $ANTLR start "rule__GIfExpression__ThenExpressionAssignment_4"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4098:1: rule__GIfExpression__ThenExpressionAssignment_4 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4102:1: ( ( ruleGExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4103:1: ( ruleGExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4103:1: ( ruleGExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4104:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ThenExpressionAssignment_48265);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ThenExpressionAssignment_4"


    // $ANTLR start "rule__GIfExpression__ElseExpressionAssignment_6"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4113:1: rule__GIfExpression__ElseExpressionAssignment_6 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ElseExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4117:1: ( ( ruleGExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4118:1: ( ruleGExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4118:1: ( ruleGExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4119:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ElseExpressionAssignment_68296);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ElseExpressionAssignment_6"


    // $ANTLR start "rule__GBraceExpression__InnerExpressionAssignment_2"
    // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4128:1: rule__GBraceExpression__InnerExpressionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GBraceExpression__InnerExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4132:1: ( ( ruleGExpression ) )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4133:1: ( ruleGExpression )
            {
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4133:1: ( ruleGExpression )
            // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:4134:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GBraceExpression__InnerExpressionAssignment_28327);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__InnerExpressionAssignment_2"

    // $ANTLR start synpred29_InternalGExpressions
    public final void synpred29_InternalGExpressions_fragment() throws RecognitionException {   
        // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3588:2: ( rule__QualifiedName__Group_1__0 )
        // ../org.gemoc.gexpressions.xtext.ui/src-gen/org/gemoc/gexpressions/xtext/ui/contentassist/antlr/internal/InternalGExpressions.g:3588:2: rule__QualifiedName__Group_1__0
        {
        pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_synpred29_InternalGExpressions7209);
        rule__QualifiedName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalGExpressions

    // Delegated rules

    public final boolean synpred29_InternalGExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalGExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleGProgram_in_entryRuleGProgram67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGProgram74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group__0_in_ruleGProgram100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__0_in_ruleGImportStatement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__0_in_ruleGOrExpression279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__0_in_ruleGXorExpression339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__0_in_ruleGAndExpression399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__0_in_ruleGEqualityExpression459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__0_in_ruleGRelationExpression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__0_in_ruleGAdditionExpression579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__0_in_ruleGMultiplicationExpression639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Alternatives_in_ruleGNegationExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__0_in_ruleGNavigationExpression759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Alternatives_in_ruleGReferenceExpression819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GPrimaryExpression__Alternatives_in_ruleGPrimaryExpression879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__0_in_ruleGStringExpression939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__0_in_ruleGBooleanExpression999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNumericExpression__Alternatives_in_ruleGNumericExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__0_in_ruleGIntegerExpression1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__0_in_ruleGDoubleExpression1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__0_in_ruleGEnumLiteralExpression1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__0_in_ruleGIfExpression1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__0_in_ruleGBraceExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationOperator__Alternatives_in_ruleNavigationOperator1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGAndOperator1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGXorOperator1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGOrOperator1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityOperator__Alternatives_in_ruleGEqualityOperator1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationOperator__Alternatives_in_ruleGRelationOperator1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionOperator__Alternatives_in_ruleGAdditionOperator1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationOperator__Alternatives_in_ruleGMultiplicationOperator1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationOperator__Alternatives_in_ruleGNegationOperator1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__Alternatives1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__0_in_rule__GNegationExpression__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_rule__GReferenceExpression__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__0_in_rule__GReferenceExpression__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_rule__GPrimaryExpression__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_rule__GPrimaryExpression__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_rule__GPrimaryExpression__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_rule__GPrimaryExpression__Alternatives1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_rule__GPrimaryExpression__Alternatives1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_rule__GPrimaryExpression__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_rule__GNumericExpression__Alternatives2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_rule__GNumericExpression__Alternatives2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NavigationOperator__Alternatives2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NavigationOperator__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GEqualityOperator__Alternatives2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GEqualityOperator__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GRelationOperator__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GRelationOperator__Alternatives2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GRelationOperator__Alternatives2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GRelationOperator__Alternatives2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GAdditionOperator__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GAdditionOperator__Alternatives2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GMultiplicationOperator__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GMultiplicationOperator__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GNegationOperator__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GNegationOperator__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group__0__Impl_in_rule__GProgram__Group__02458 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GProgram__Group__1_in_rule__GProgram__Group__02461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__ImportsAssignment_0_in_rule__GProgram__Group__0__Impl2488 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group__1__Impl_in_rule__GProgram__Group__12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1__0_in_rule__GProgram__Group__1__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1__0__Impl_in_rule__GProgram__Group_1__02581 = new BitSet(new long[]{0x00000023700001F0L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1__1_in_rule__GProgram__Group_1__02584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__ExpressionsAssignment_1_0_in_rule__GProgram__Group_1__0__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1__1__Impl_in_rule__GProgram__Group_1__12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1_1__0_in_rule__GProgram__Group_1__1__Impl2668 = new BitSet(new long[]{0x00000023700001F2L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1_1__0__Impl_in_rule__GProgram__Group_1_1__02703 = new BitSet(new long[]{0x00000023700001F0L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1_1__1_in_rule__GProgram__Group_1_1__02706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GProgram__Group_1_1__0__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__Group_1_1__1__Impl_in_rule__GProgram__Group_1_1__12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GProgram__ExpressionsAssignment_1_1_1_in_rule__GProgram__Group_1_1__1__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__0__Impl_in_rule__GImportStatement__Group__02829 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__1_in_rule__GImportStatement__Group__02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GImportStatement__Group__0__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__1__Impl_in_rule__GImportStatement__Group__12891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__ImportURIAssignment_1_in_rule__GImportStatement__Group__1__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__0__Impl_in_rule__GOrExpression__Group__02952 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__1_in_rule__GOrExpression__Group__02955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_rule__GOrExpression__Group__0__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__1__Impl_in_rule__GOrExpression__Group__13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__0_in_rule__GOrExpression__Group__1__Impl3038 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__0__Impl_in_rule__GOrExpression__Group_1__03073 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__1_in_rule__GOrExpression__Group_1__03076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__1__Impl_in_rule__GOrExpression__Group_1__13134 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__2_in_rule__GOrExpression__Group_1__13137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__OperatorAssignment_1_1_in_rule__GOrExpression__Group_1__1__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__2__Impl_in_rule__GOrExpression__Group_1__23194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__RightOperandAssignment_1_2_in_rule__GOrExpression__Group_1__2__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__0__Impl_in_rule__GXorExpression__Group__03257 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__1_in_rule__GXorExpression__Group__03260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_rule__GXorExpression__Group__0__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__1__Impl_in_rule__GXorExpression__Group__13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__0_in_rule__GXorExpression__Group__1__Impl3343 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__0__Impl_in_rule__GXorExpression__Group_1__03378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__1_in_rule__GXorExpression__Group_1__03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__1__Impl_in_rule__GXorExpression__Group_1__13439 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__2_in_rule__GXorExpression__Group_1__13442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__OperatorAssignment_1_1_in_rule__GXorExpression__Group_1__1__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__2__Impl_in_rule__GXorExpression__Group_1__23499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__RightOperandAssignment_1_2_in_rule__GXorExpression__Group_1__2__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__0__Impl_in_rule__GAndExpression__Group__03562 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__1_in_rule__GAndExpression__Group__03565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__Group__0__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__1__Impl_in_rule__GAndExpression__Group__13621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__0_in_rule__GAndExpression__Group__1__Impl3648 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__0__Impl_in_rule__GAndExpression__Group_1__03683 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__1_in_rule__GAndExpression__Group_1__03686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__1__Impl_in_rule__GAndExpression__Group_1__13744 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__2_in_rule__GAndExpression__Group_1__13747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__OperatorAssignment_1_1_in_rule__GAndExpression__Group_1__1__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__2__Impl_in_rule__GAndExpression__Group_1__23804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__RightOperandAssignment_1_2_in_rule__GAndExpression__Group_1__2__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__0__Impl_in_rule__GEqualityExpression__Group__03867 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__1_in_rule__GEqualityExpression__Group__03870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__Group__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__1__Impl_in_rule__GEqualityExpression__Group__13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__0_in_rule__GEqualityExpression__Group__1__Impl3953 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__0__Impl_in_rule__GEqualityExpression__Group_1__03988 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__1_in_rule__GEqualityExpression__Group_1__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__1__Impl_in_rule__GEqualityExpression__Group_1__14049 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__2_in_rule__GEqualityExpression__Group_1__14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__OperatorAssignment_1_1_in_rule__GEqualityExpression__Group_1__1__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__2__Impl_in_rule__GEqualityExpression__Group_1__24109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__RightOperandAssignment_1_2_in_rule__GEqualityExpression__Group_1__2__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__0__Impl_in_rule__GRelationExpression__Group__04172 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__1_in_rule__GRelationExpression__Group__04175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__Group__0__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__1__Impl_in_rule__GRelationExpression__Group__14231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__0_in_rule__GRelationExpression__Group__1__Impl4258 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__0__Impl_in_rule__GRelationExpression__Group_1__04293 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__1_in_rule__GRelationExpression__Group_1__04296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__1__Impl_in_rule__GRelationExpression__Group_1__14354 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__2_in_rule__GRelationExpression__Group_1__14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__OperatorAssignment_1_1_in_rule__GRelationExpression__Group_1__1__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__2__Impl_in_rule__GRelationExpression__Group_1__24414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__RightOperandAssignment_1_2_in_rule__GRelationExpression__Group_1__2__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__0__Impl_in_rule__GAdditionExpression__Group__04477 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__1_in_rule__GAdditionExpression__Group__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__Group__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__1__Impl_in_rule__GAdditionExpression__Group__14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__0_in_rule__GAdditionExpression__Group__1__Impl4563 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__0__Impl_in_rule__GAdditionExpression__Group_1__04598 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__1_in_rule__GAdditionExpression__Group_1__04601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__1__Impl_in_rule__GAdditionExpression__Group_1__14659 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__2_in_rule__GAdditionExpression__Group_1__14662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__OperatorAssignment_1_1_in_rule__GAdditionExpression__Group_1__1__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__2__Impl_in_rule__GAdditionExpression__Group_1__24719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__RightOperandAssignment_1_2_in_rule__GAdditionExpression__Group_1__2__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__0__Impl_in_rule__GMultiplicationExpression__Group__04782 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__1_in_rule__GMultiplicationExpression__Group__04785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__Group__0__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__1__Impl_in_rule__GMultiplicationExpression__Group__14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__0_in_rule__GMultiplicationExpression__Group__1__Impl4868 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__0__Impl_in_rule__GMultiplicationExpression__Group_1__04903 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__1_in_rule__GMultiplicationExpression__Group_1__04906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__1__Impl_in_rule__GMultiplicationExpression__Group_1__14964 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__2_in_rule__GMultiplicationExpression__Group_1__14967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__OperatorAssignment_1_1_in_rule__GMultiplicationExpression__Group_1__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__2__Impl_in_rule__GMultiplicationExpression__Group_1__25024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__RightOperandAssignment_1_2_in_rule__GMultiplicationExpression__Group_1__2__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__0__Impl_in_rule__GNegationExpression__Group_1__05087 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__1_in_rule__GNegationExpression__Group_1__05090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__1__Impl_in_rule__GNegationExpression__Group_1__15148 = new BitSet(new long[]{0x00000023000001F0L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__2_in_rule__GNegationExpression__Group_1__15151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__OperatorAssignment_1_1_in_rule__GNegationExpression__Group_1__1__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__2__Impl_in_rule__GNegationExpression__Group_1__25208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__OperandAssignment_1_2_in_rule__GNegationExpression__Group_1__2__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__0__Impl_in_rule__GNavigationExpression__Group__05271 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__1_in_rule__GNavigationExpression__Group__05274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_rule__GNavigationExpression__Group__0__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__1__Impl_in_rule__GNavigationExpression__Group__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__0_in_rule__GNavigationExpression__Group__1__Impl5357 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__0__Impl_in_rule__GNavigationExpression__Group_1__05392 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__1_in_rule__GNavigationExpression__Group_1__05395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__1__Impl_in_rule__GNavigationExpression__Group_1__15453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__2_in_rule__GNavigationExpression__Group_1__15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_rule__GNavigationExpression__Group_1__1__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__2__Impl_in_rule__GNavigationExpression__Group_1__25512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__ReferencedEObjectAssignment_1_2_in_rule__GNavigationExpression__Group_1__2__Impl5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__0__Impl_in_rule__GReferenceExpression__Group_1__05575 = new BitSet(new long[]{0x00000023000001F0L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__1_in_rule__GReferenceExpression__Group_1__05578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__1__Impl_in_rule__GReferenceExpression__Group_1__15636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__ReferencedEObjectAssignment_1_1_in_rule__GReferenceExpression__Group_1__1__Impl5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__0__Impl_in_rule__GStringExpression__Group__05697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__1_in_rule__GStringExpression__Group__05700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__1__Impl_in_rule__GStringExpression__Group__15758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__ValueAssignment_1_in_rule__GStringExpression__Group__1__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__0__Impl_in_rule__GBooleanExpression__Group__05819 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__1_in_rule__GBooleanExpression__Group__05822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__1__Impl_in_rule__GBooleanExpression__Group__15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__ValueAssignment_1_in_rule__GBooleanExpression__Group__1__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__0__Impl_in_rule__GIntegerExpression__Group__05941 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__1_in_rule__GIntegerExpression__Group__05944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__1__Impl_in_rule__GIntegerExpression__Group__16002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__ValueAssignment_1_in_rule__GIntegerExpression__Group__1__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__0__Impl_in_rule__GDoubleExpression__Group__06063 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__1_in_rule__GDoubleExpression__Group__06066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__1__Impl_in_rule__GDoubleExpression__Group__16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__ValueAssignment_1_in_rule__GDoubleExpression__Group__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__0__Impl_in_rule__GEnumLiteralExpression__Group__06185 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__1_in_rule__GEnumLiteralExpression__Group__06188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__1__Impl_in_rule__GEnumLiteralExpression__Group__16246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__2_in_rule__GEnumLiteralExpression__Group__16249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__GEnumLiteralExpression__Group__1__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__2__Impl_in_rule__GEnumLiteralExpression__Group__26308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__ValueAssignment_2_in_rule__GEnumLiteralExpression__Group__2__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__0__Impl_in_rule__GIfExpression__Group__06371 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__1_in_rule__GIfExpression__Group__06374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__1__Impl_in_rule__GIfExpression__Group__16432 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__2_in_rule__GIfExpression__Group__16435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GIfExpression__Group__1__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__2__Impl_in_rule__GIfExpression__Group__26494 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__3_in_rule__GIfExpression__Group__26497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ConditionAssignment_2_in_rule__GIfExpression__Group__2__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__3__Impl_in_rule__GIfExpression__Group__36554 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__4_in_rule__GIfExpression__Group__36557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__GIfExpression__Group__3__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__4__Impl_in_rule__GIfExpression__Group__46616 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__5_in_rule__GIfExpression__Group__46619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ThenExpressionAssignment_4_in_rule__GIfExpression__Group__4__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__5__Impl_in_rule__GIfExpression__Group__56676 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__6_in_rule__GIfExpression__Group__56679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__GIfExpression__Group__5__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__6__Impl_in_rule__GIfExpression__Group__66738 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__7_in_rule__GIfExpression__Group__66741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ElseExpressionAssignment_6_in_rule__GIfExpression__Group__6__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__7__Impl_in_rule__GIfExpression__Group__76798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GIfExpression__Group__7__Impl6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__0__Impl_in_rule__GBraceExpression__Group__06873 = new BitSet(new long[]{0x00000023000001E0L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__1_in_rule__GBraceExpression__Group__06876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__1__Impl_in_rule__GBraceExpression__Group__16934 = new BitSet(new long[]{0x00000023300001F0L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__2_in_rule__GBraceExpression__Group__16937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GBraceExpression__Group__1__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__2__Impl_in_rule__GBraceExpression__Group__26996 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__3_in_rule__GBraceExpression__Group__26999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__InnerExpressionAssignment_2_in_rule__GBraceExpression__Group__2__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__3__Impl_in_rule__GBraceExpression__Group__37056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GBraceExpression__Group__3__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07123 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7209 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_rule__GProgram__ImportsAssignment_07373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GProgram__ExpressionsAssignment_1_07404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GProgram__ExpressionsAssignment_1_1_17435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GImportStatement__ImportURIAssignment_17466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_rule__GOrExpression__OperatorAssignment_1_17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_rule__GOrExpression__RightOperandAssignment_1_27528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_rule__GXorExpression__OperatorAssignment_1_17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_rule__GXorExpression__RightOperandAssignment_1_27590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_rule__GAndExpression__OperatorAssignment_1_17621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__RightOperandAssignment_1_27652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_rule__GEqualityExpression__OperatorAssignment_1_17683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__RightOperandAssignment_1_27714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_rule__GRelationExpression__OperatorAssignment_1_17745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__RightOperandAssignment_1_27776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_rule__GAdditionExpression__OperatorAssignment_1_17807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__RightOperandAssignment_1_27838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_rule__GMultiplicationExpression__OperatorAssignment_1_17869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__RightOperandAssignment_1_27900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_rule__GNegationExpression__OperatorAssignment_1_17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__OperandAssignment_1_27962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GNavigationExpression__ReferencedEObjectAssignment_1_27997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GReferenceExpression__ReferencedEObjectAssignment_1_18036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GStringExpression__ValueAssignment_18071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__GBooleanExpression__ValueAssignment_18102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GIntegerExpression__ValueAssignment_18133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__GDoubleExpression__ValueAssignment_18164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GEnumLiteralExpression__ValueAssignment_28199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ConditionAssignment_28234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ThenExpressionAssignment_48265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ElseExpressionAssignment_68296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GBraceExpression__InnerExpressionAssignment_28327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_synpred29_InternalGExpressions7209 = new BitSet(new long[]{0x0000000000000002L});

}