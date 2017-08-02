package at.ac.tuwien.big.xmltext.library3.ui.contentassist.antlr.internal; 

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
import at.ac.tuwien.big.xmltext.library3.services.Library3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibrary3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATETIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "','", "'Book'", "'title'", "'author'", "'pages'", "'isbn'", "'Customer'", "'firstName'", "'lastName'", "'borrowedBookId'", "'BookInfo'", "':'", "'='"
    };
    public static final int RULE_DATETIME=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLibrary3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLibrary3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLibrary3Parser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g"; }


     
     	private Library3GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Library3GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLibraryType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:60:1: entryRuleLibraryType : ruleLibraryType EOF ;
    public final void entryRuleLibraryType() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:61:1: ( ruleLibraryType EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:62:1: ruleLibraryType EOF
            {
             before(grammarAccess.getLibraryTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLibraryType_in_entryRuleLibraryType61);
            ruleLibraryType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLibraryType68); 

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
    // $ANTLR end "entryRuleLibraryType"


    // $ANTLR start "ruleLibraryType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:69:1: ruleLibraryType : ( ( rule__LibraryType__Group__0 ) ) ;
    public final void ruleLibraryType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:73:2: ( ( ( rule__LibraryType__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:74:1: ( ( rule__LibraryType__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:74:1: ( ( rule__LibraryType__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:75:1: ( rule__LibraryType__Group__0 )
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:76:1: ( rule__LibraryType__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:76:2: rule__LibraryType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__0_in_ruleLibraryType94);
            rule__LibraryType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleLibraryType"


    // $ANTLR start "entryRuleBookType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:90:1: entryRuleBookType : ruleBookType EOF ;
    public final void entryRuleBookType() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:91:1: ( ruleBookType EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:92:1: ruleBookType EOF
            {
             before(grammarAccess.getBookTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookType_in_entryRuleBookType123);
            ruleBookType();

            state._fsp--;

             after(grammarAccess.getBookTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBookType130); 

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
    // $ANTLR end "entryRuleBookType"


    // $ANTLR start "ruleBookType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:99:1: ruleBookType : ( ( rule__BookType__Group__0 ) ) ;
    public final void ruleBookType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:103:2: ( ( ( rule__BookType__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:104:1: ( ( rule__BookType__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:104:1: ( ( rule__BookType__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:105:1: ( rule__BookType__Group__0 )
            {
             before(grammarAccess.getBookTypeAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:106:1: ( rule__BookType__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:106:2: rule__BookType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__0_in_ruleBookType156);
            rule__BookType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleBookType"


    // $ANTLR start "entryRuleCustomerType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:118:1: entryRuleCustomerType : ruleCustomerType EOF ;
    public final void entryRuleCustomerType() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:119:1: ( ruleCustomerType EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:120:1: ruleCustomerType EOF
            {
             before(grammarAccess.getCustomerTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_entryRuleCustomerType183);
            ruleCustomerType();

            state._fsp--;

             after(grammarAccess.getCustomerTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerType190); 

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
    // $ANTLR end "entryRuleCustomerType"


    // $ANTLR start "ruleCustomerType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:127:1: ruleCustomerType : ( ( rule__CustomerType__Group__0 ) ) ;
    public final void ruleCustomerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:131:2: ( ( ( rule__CustomerType__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:132:1: ( ( rule__CustomerType__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:132:1: ( ( rule__CustomerType__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:133:1: ( rule__CustomerType__Group__0 )
            {
             before(grammarAccess.getCustomerTypeAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:134:1: ( rule__CustomerType__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:134:2: rule__CustomerType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__0_in_ruleCustomerType216);
            rule__CustomerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCustomerType"


    // $ANTLR start "entryRuleID0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:146:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:147:1: ( ruleID0 EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:148:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0243);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0250); 

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
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:155:1: ruleID0 : ( RULE_ID ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:159:2: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:160:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:160:1: ( RULE_ID )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:161:1: RULE_ID
            {
             before(grammarAccess.getID0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0276); 
             after(grammarAccess.getID0Access().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleNameType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:174:1: entryRuleNameType : ruleNameType EOF ;
    public final void entryRuleNameType() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:175:1: ( ruleNameType EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:176:1: ruleNameType EOF
            {
             before(grammarAccess.getNameTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNameType_in_entryRuleNameType302);
            ruleNameType();

            state._fsp--;

             after(grammarAccess.getNameTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameType309); 

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
    // $ANTLR end "entryRuleNameType"


    // $ANTLR start "ruleNameType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:183:1: ruleNameType : ( RULE_STRING ) ;
    public final void ruleNameType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:187:2: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:188:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:188:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:189:1: RULE_STRING
            {
             before(grammarAccess.getNameTypeAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNameType335); 
             after(grammarAccess.getNameTypeAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleNameType"


    // $ANTLR start "entryRuleInt0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:202:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:203:1: ( ruleInt0 EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:204:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt0361);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt0368); 

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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:211:1: ruleInt0 : ( RULE_INT ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:215:2: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:216:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:216:1: ( RULE_INT )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:217:1: RULE_INT
            {
             before(grammarAccess.getInt0Access().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInt0394); 
             after(grammarAccess.getInt0Access().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleIsbnType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:230:1: entryRuleIsbnType : ruleIsbnType EOF ;
    public final void entryRuleIsbnType() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:231:1: ( ruleIsbnType EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:232:1: ruleIsbnType EOF
            {
             before(grammarAccess.getIsbnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsbnType_in_entryRuleIsbnType420);
            ruleIsbnType();

            state._fsp--;

             after(grammarAccess.getIsbnTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsbnType427); 

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
    // $ANTLR end "entryRuleIsbnType"


    // $ANTLR start "ruleIsbnType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:239:1: ruleIsbnType : ( RULE_STRING ) ;
    public final void ruleIsbnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:243:2: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:244:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:244:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:245:1: RULE_STRING
            {
             before(grammarAccess.getIsbnTypeAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIsbnType453); 
             after(grammarAccess.getIsbnTypeAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleIsbnType"


    // $ANTLR start "entryRuleBookInfoType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:258:1: entryRuleBookInfoType : ruleBookInfoType EOF ;
    public final void entryRuleBookInfoType() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:259:1: ( ruleBookInfoType EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:260:1: ruleBookInfoType EOF
            {
             before(grammarAccess.getBookInfoTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookInfoType_in_entryRuleBookInfoType479);
            ruleBookInfoType();

            state._fsp--;

             after(grammarAccess.getBookInfoTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBookInfoType486); 

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
    // $ANTLR end "entryRuleBookInfoType"


    // $ANTLR start "ruleBookInfoType"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:267:1: ruleBookInfoType : ( ( rule__BookInfoType__Group__0 ) ) ;
    public final void ruleBookInfoType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:271:2: ( ( ( rule__BookInfoType__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:272:1: ( ( rule__BookInfoType__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:272:1: ( ( rule__BookInfoType__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:273:1: ( rule__BookInfoType__Group__0 )
            {
             before(grammarAccess.getBookInfoTypeAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:274:1: ( rule__BookInfoType__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:274:2: rule__BookInfoType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group__0_in_ruleBookInfoType512);
            rule__BookInfoType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookInfoTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleBookInfoType"


    // $ANTLR start "entryRuleAnyGenericElement"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:286:1: entryRuleAnyGenericElement : ruleAnyGenericElement EOF ;
    public final void entryRuleAnyGenericElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:287:1: ( ruleAnyGenericElement EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:288:1: ruleAnyGenericElement EOF
            {
             before(grammarAccess.getAnyGenericElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement539);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericElement546); 

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
    // $ANTLR end "entryRuleAnyGenericElement"


    // $ANTLR start "ruleAnyGenericElement"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:295:1: ruleAnyGenericElement : ( ( rule__AnyGenericElement__Group__0 ) ) ;
    public final void ruleAnyGenericElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:299:2: ( ( ( rule__AnyGenericElement__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:300:1: ( ( rule__AnyGenericElement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:300:1: ( ( rule__AnyGenericElement__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:301:1: ( rule__AnyGenericElement__Group__0 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:302:1: ( rule__AnyGenericElement__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:302:2: rule__AnyGenericElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__0_in_ruleAnyGenericElement572);
            rule__AnyGenericElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup()); 

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
    // $ANTLR end "ruleAnyGenericElement"


    // $ANTLR start "entryRuleAnyGenericAttribute"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:314:1: entryRuleAnyGenericAttribute : ruleAnyGenericAttribute EOF ;
    public final void entryRuleAnyGenericAttribute() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:315:1: ( ruleAnyGenericAttribute EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:316:1: ruleAnyGenericAttribute EOF
            {
             before(grammarAccess.getAnyGenericAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute599);
            ruleAnyGenericAttribute();

            state._fsp--;

             after(grammarAccess.getAnyGenericAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericAttribute606); 

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
    // $ANTLR end "entryRuleAnyGenericAttribute"


    // $ANTLR start "ruleAnyGenericAttribute"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:323:1: ruleAnyGenericAttribute : ( ( rule__AnyGenericAttribute__Group__0 ) ) ;
    public final void ruleAnyGenericAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:327:2: ( ( ( rule__AnyGenericAttribute__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:328:1: ( ( rule__AnyGenericAttribute__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:328:1: ( ( rule__AnyGenericAttribute__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:329:1: ( rule__AnyGenericAttribute__Group__0 )
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:330:1: ( rule__AnyGenericAttribute__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:330:2: rule__AnyGenericAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__0_in_ruleAnyGenericAttribute632);
            rule__AnyGenericAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAnyGenericAttribute"


    // $ANTLR start "entryRuleAnyGenericText"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:342:1: entryRuleAnyGenericText : ruleAnyGenericText EOF ;
    public final void entryRuleAnyGenericText() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:343:1: ( ruleAnyGenericText EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:344:1: ruleAnyGenericText EOF
            {
             before(grammarAccess.getAnyGenericTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText659);
            ruleAnyGenericText();

            state._fsp--;

             after(grammarAccess.getAnyGenericTextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericText666); 

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
    // $ANTLR end "entryRuleAnyGenericText"


    // $ANTLR start "ruleAnyGenericText"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:351:1: ruleAnyGenericText : ( ( rule__AnyGenericText__Group__0 ) ) ;
    public final void ruleAnyGenericText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:355:2: ( ( ( rule__AnyGenericText__Group__0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:356:1: ( ( rule__AnyGenericText__Group__0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:356:1: ( ( rule__AnyGenericText__Group__0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:357:1: ( rule__AnyGenericText__Group__0 )
            {
             before(grammarAccess.getAnyGenericTextAccess().getGroup()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:358:1: ( rule__AnyGenericText__Group__0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:358:2: rule__AnyGenericText__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__0_in_ruleAnyGenericText692);
            rule__AnyGenericText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericTextAccess().getGroup()); 

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
    // $ANTLR end "ruleAnyGenericText"


    // $ANTLR start "entryRuleIDREF"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:372:1: entryRuleIDREF : ruleIDREF EOF ;
    public final void entryRuleIDREF() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:373:1: ( ruleIDREF EOF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:374:1: ruleIDREF EOF
            {
             before(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF721);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getIDREFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF728); 

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
    // $ANTLR end "entryRuleIDREF"


    // $ANTLR start "ruleIDREF"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:381:1: ruleIDREF : ( RULE_ID ) ;
    public final void ruleIDREF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:385:2: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:386:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:386:1: ( RULE_ID )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:387:1: RULE_ID
            {
             before(grammarAccess.getIDREFAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIDREF754); 
             after(grammarAccess.getIDREFAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleIDREF"


    // $ANTLR start "rule__LibraryType__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:405:1: rule__LibraryType__Group__0 : rule__LibraryType__Group__0__Impl rule__LibraryType__Group__1 ;
    public final void rule__LibraryType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:409:1: ( rule__LibraryType__Group__0__Impl rule__LibraryType__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:410:2: rule__LibraryType__Group__0__Impl rule__LibraryType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__0__Impl_in_rule__LibraryType__Group__0790);
            rule__LibraryType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__1_in_rule__LibraryType__Group__0793);
            rule__LibraryType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group__0"


    // $ANTLR start "rule__LibraryType__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:417:1: rule__LibraryType__Group__0__Impl : ( () ) ;
    public final void rule__LibraryType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:421:1: ( ( () ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:422:1: ( () )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:422:1: ( () )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:423:1: ()
            {
             before(grammarAccess.getLibraryTypeAccess().getLibraryTypeAction_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:424:1: ()
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:426:1: 
            {
            }

             after(grammarAccess.getLibraryTypeAccess().getLibraryTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryType__Group__0__Impl"


    // $ANTLR start "rule__LibraryType__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:436:1: rule__LibraryType__Group__1 : rule__LibraryType__Group__1__Impl rule__LibraryType__Group__2 ;
    public final void rule__LibraryType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:440:1: ( rule__LibraryType__Group__1__Impl rule__LibraryType__Group__2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:441:2: rule__LibraryType__Group__1__Impl rule__LibraryType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__1__Impl_in_rule__LibraryType__Group__1851);
            rule__LibraryType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__2_in_rule__LibraryType__Group__1854);
            rule__LibraryType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group__1"


    // $ANTLR start "rule__LibraryType__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:448:1: rule__LibraryType__Group__1__Impl : ( 'Library' ) ;
    public final void rule__LibraryType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:452:1: ( ( 'Library' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:453:1: ( 'Library' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:453:1: ( 'Library' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:454:1: 'Library'
            {
             before(grammarAccess.getLibraryTypeAccess().getLibraryKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__LibraryType__Group__1__Impl882); 
             after(grammarAccess.getLibraryTypeAccess().getLibraryKeyword_1()); 

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
    // $ANTLR end "rule__LibraryType__Group__1__Impl"


    // $ANTLR start "rule__LibraryType__Group__2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:467:1: rule__LibraryType__Group__2 : rule__LibraryType__Group__2__Impl rule__LibraryType__Group__3 ;
    public final void rule__LibraryType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:471:1: ( rule__LibraryType__Group__2__Impl rule__LibraryType__Group__3 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:472:2: rule__LibraryType__Group__2__Impl rule__LibraryType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__2__Impl_in_rule__LibraryType__Group__2913);
            rule__LibraryType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__3_in_rule__LibraryType__Group__2916);
            rule__LibraryType__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group__2"


    // $ANTLR start "rule__LibraryType__Group__2__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:479:1: rule__LibraryType__Group__2__Impl : ( '{' ) ;
    public final void rule__LibraryType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:483:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:484:1: ( '{' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:484:1: ( '{' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:485:1: '{'
            {
             before(grammarAccess.getLibraryTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__LibraryType__Group__2__Impl944); 
             after(grammarAccess.getLibraryTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LibraryType__Group__2__Impl"


    // $ANTLR start "rule__LibraryType__Group__3"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:498:1: rule__LibraryType__Group__3 : rule__LibraryType__Group__3__Impl rule__LibraryType__Group__4 ;
    public final void rule__LibraryType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:502:1: ( rule__LibraryType__Group__3__Impl rule__LibraryType__Group__4 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:503:2: rule__LibraryType__Group__3__Impl rule__LibraryType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__3__Impl_in_rule__LibraryType__Group__3975);
            rule__LibraryType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__4_in_rule__LibraryType__Group__3978);
            rule__LibraryType__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group__3"


    // $ANTLR start "rule__LibraryType__Group__3__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:510:1: rule__LibraryType__Group__3__Impl : ( ( rule__LibraryType__Group_3__0 )? ) ;
    public final void rule__LibraryType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:514:1: ( ( ( rule__LibraryType__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:515:1: ( ( rule__LibraryType__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:515:1: ( ( rule__LibraryType__Group_3__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:516:1: ( rule__LibraryType__Group_3__0 )?
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup_3()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:517:1: ( rule__LibraryType__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:517:2: rule__LibraryType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__0_in_rule__LibraryType__Group__3__Impl1005);
                    rule__LibraryType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LibraryType__Group__3__Impl"


    // $ANTLR start "rule__LibraryType__Group__4"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:527:1: rule__LibraryType__Group__4 : rule__LibraryType__Group__4__Impl rule__LibraryType__Group__5 ;
    public final void rule__LibraryType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:531:1: ( rule__LibraryType__Group__4__Impl rule__LibraryType__Group__5 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:532:2: rule__LibraryType__Group__4__Impl rule__LibraryType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__4__Impl_in_rule__LibraryType__Group__41036);
            rule__LibraryType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__5_in_rule__LibraryType__Group__41039);
            rule__LibraryType__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group__4"


    // $ANTLR start "rule__LibraryType__Group__4__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:539:1: rule__LibraryType__Group__4__Impl : ( ( rule__LibraryType__Group_4__0 )? ) ;
    public final void rule__LibraryType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:543:1: ( ( ( rule__LibraryType__Group_4__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:544:1: ( ( rule__LibraryType__Group_4__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:544:1: ( ( rule__LibraryType__Group_4__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:545:1: ( rule__LibraryType__Group_4__0 )?
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:546:1: ( rule__LibraryType__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:546:2: rule__LibraryType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4__0_in_rule__LibraryType__Group__4__Impl1066);
                    rule__LibraryType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LibraryType__Group__4__Impl"


    // $ANTLR start "rule__LibraryType__Group__5"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:556:1: rule__LibraryType__Group__5 : rule__LibraryType__Group__5__Impl ;
    public final void rule__LibraryType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:560:1: ( rule__LibraryType__Group__5__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:561:2: rule__LibraryType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group__5__Impl_in_rule__LibraryType__Group__51097);
            rule__LibraryType__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group__5"


    // $ANTLR start "rule__LibraryType__Group__5__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:567:1: rule__LibraryType__Group__5__Impl : ( '}' ) ;
    public final void rule__LibraryType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:571:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:572:1: ( '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:572:1: ( '}' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:573:1: '}'
            {
             before(grammarAccess.getLibraryTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LibraryType__Group__5__Impl1125); 
             after(grammarAccess.getLibraryTypeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__LibraryType__Group__5__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:598:1: rule__LibraryType__Group_3__0 : rule__LibraryType__Group_3__0__Impl rule__LibraryType__Group_3__1 ;
    public final void rule__LibraryType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:602:1: ( rule__LibraryType__Group_3__0__Impl rule__LibraryType__Group_3__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:603:2: rule__LibraryType__Group_3__0__Impl rule__LibraryType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__0__Impl_in_rule__LibraryType__Group_3__01168);
            rule__LibraryType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__1_in_rule__LibraryType__Group_3__01171);
            rule__LibraryType__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_3__0"


    // $ANTLR start "rule__LibraryType__Group_3__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:610:1: rule__LibraryType__Group_3__0__Impl : ( ( rule__LibraryType__BookAssignment_3_0 ) ) ;
    public final void rule__LibraryType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:614:1: ( ( ( rule__LibraryType__BookAssignment_3_0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:615:1: ( ( rule__LibraryType__BookAssignment_3_0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:615:1: ( ( rule__LibraryType__BookAssignment_3_0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:616:1: ( rule__LibraryType__BookAssignment_3_0 )
            {
             before(grammarAccess.getLibraryTypeAccess().getBookAssignment_3_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:617:1: ( rule__LibraryType__BookAssignment_3_0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:617:2: rule__LibraryType__BookAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__BookAssignment_3_0_in_rule__LibraryType__Group_3__0__Impl1198);
            rule__LibraryType__BookAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getBookAssignment_3_0()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__0__Impl"


    // $ANTLR start "rule__LibraryType__Group_3__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:627:1: rule__LibraryType__Group_3__1 : rule__LibraryType__Group_3__1__Impl ;
    public final void rule__LibraryType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:631:1: ( rule__LibraryType__Group_3__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:632:2: rule__LibraryType__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3__1__Impl_in_rule__LibraryType__Group_3__11228);
            rule__LibraryType__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_3__1"


    // $ANTLR start "rule__LibraryType__Group_3__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:638:1: rule__LibraryType__Group_3__1__Impl : ( ( rule__LibraryType__Group_3_1__0 )* ) ;
    public final void rule__LibraryType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:642:1: ( ( ( rule__LibraryType__Group_3_1__0 )* ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:643:1: ( ( rule__LibraryType__Group_3_1__0 )* )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:643:1: ( ( rule__LibraryType__Group_3_1__0 )* )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:644:1: ( rule__LibraryType__Group_3_1__0 )*
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup_3_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:645:1: ( rule__LibraryType__Group_3_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:645:2: rule__LibraryType__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_1__0_in_rule__LibraryType__Group_3__1__Impl1255);
            	    rule__LibraryType__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLibraryTypeAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__LibraryType__Group_3__1__Impl"


    // $ANTLR start "rule__LibraryType__Group_3_1__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:659:1: rule__LibraryType__Group_3_1__0 : rule__LibraryType__Group_3_1__0__Impl rule__LibraryType__Group_3_1__1 ;
    public final void rule__LibraryType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:663:1: ( rule__LibraryType__Group_3_1__0__Impl rule__LibraryType__Group_3_1__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:664:2: rule__LibraryType__Group_3_1__0__Impl rule__LibraryType__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_1__0__Impl_in_rule__LibraryType__Group_3_1__01290);
            rule__LibraryType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_1__1_in_rule__LibraryType__Group_3_1__01293);
            rule__LibraryType__Group_3_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_3_1__0"


    // $ANTLR start "rule__LibraryType__Group_3_1__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:671:1: rule__LibraryType__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__LibraryType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:675:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:676:1: ( ',' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:676:1: ( ',' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:677:1: ','
            {
             before(grammarAccess.getLibraryTypeAccess().getCommaKeyword_3_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__LibraryType__Group_3_1__0__Impl1321); 
             after(grammarAccess.getLibraryTypeAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__LibraryType__Group_3_1__0__Impl"


    // $ANTLR start "rule__LibraryType__Group_3_1__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:690:1: rule__LibraryType__Group_3_1__1 : rule__LibraryType__Group_3_1__1__Impl ;
    public final void rule__LibraryType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:694:1: ( rule__LibraryType__Group_3_1__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:695:2: rule__LibraryType__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_3_1__1__Impl_in_rule__LibraryType__Group_3_1__11352);
            rule__LibraryType__Group_3_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_3_1__1"


    // $ANTLR start "rule__LibraryType__Group_3_1__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:701:1: rule__LibraryType__Group_3_1__1__Impl : ( ( rule__LibraryType__BookAssignment_3_1_1 ) ) ;
    public final void rule__LibraryType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:705:1: ( ( ( rule__LibraryType__BookAssignment_3_1_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:706:1: ( ( rule__LibraryType__BookAssignment_3_1_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:706:1: ( ( rule__LibraryType__BookAssignment_3_1_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:707:1: ( rule__LibraryType__BookAssignment_3_1_1 )
            {
             before(grammarAccess.getLibraryTypeAccess().getBookAssignment_3_1_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:708:1: ( rule__LibraryType__BookAssignment_3_1_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:708:2: rule__LibraryType__BookAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__BookAssignment_3_1_1_in_rule__LibraryType__Group_3_1__1__Impl1379);
            rule__LibraryType__BookAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getBookAssignment_3_1_1()); 

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
    // $ANTLR end "rule__LibraryType__Group_3_1__1__Impl"


    // $ANTLR start "rule__LibraryType__Group_4__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:722:1: rule__LibraryType__Group_4__0 : rule__LibraryType__Group_4__0__Impl rule__LibraryType__Group_4__1 ;
    public final void rule__LibraryType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:726:1: ( rule__LibraryType__Group_4__0__Impl rule__LibraryType__Group_4__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:727:2: rule__LibraryType__Group_4__0__Impl rule__LibraryType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4__0__Impl_in_rule__LibraryType__Group_4__01413);
            rule__LibraryType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4__1_in_rule__LibraryType__Group_4__01416);
            rule__LibraryType__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_4__0"


    // $ANTLR start "rule__LibraryType__Group_4__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:734:1: rule__LibraryType__Group_4__0__Impl : ( ( rule__LibraryType__CustomerAssignment_4_0 ) ) ;
    public final void rule__LibraryType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:738:1: ( ( ( rule__LibraryType__CustomerAssignment_4_0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:739:1: ( ( rule__LibraryType__CustomerAssignment_4_0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:739:1: ( ( rule__LibraryType__CustomerAssignment_4_0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:740:1: ( rule__LibraryType__CustomerAssignment_4_0 )
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_4_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:741:1: ( rule__LibraryType__CustomerAssignment_4_0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:741:2: rule__LibraryType__CustomerAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__CustomerAssignment_4_0_in_rule__LibraryType__Group_4__0__Impl1443);
            rule__LibraryType__CustomerAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_4_0()); 

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
    // $ANTLR end "rule__LibraryType__Group_4__0__Impl"


    // $ANTLR start "rule__LibraryType__Group_4__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:751:1: rule__LibraryType__Group_4__1 : rule__LibraryType__Group_4__1__Impl ;
    public final void rule__LibraryType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:755:1: ( rule__LibraryType__Group_4__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:756:2: rule__LibraryType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4__1__Impl_in_rule__LibraryType__Group_4__11473);
            rule__LibraryType__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_4__1"


    // $ANTLR start "rule__LibraryType__Group_4__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:762:1: rule__LibraryType__Group_4__1__Impl : ( ( rule__LibraryType__Group_4_1__0 )* ) ;
    public final void rule__LibraryType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:766:1: ( ( ( rule__LibraryType__Group_4_1__0 )* ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:767:1: ( ( rule__LibraryType__Group_4_1__0 )* )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:767:1: ( ( rule__LibraryType__Group_4_1__0 )* )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:768:1: ( rule__LibraryType__Group_4_1__0 )*
            {
             before(grammarAccess.getLibraryTypeAccess().getGroup_4_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:769:1: ( rule__LibraryType__Group_4_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:769:2: rule__LibraryType__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4_1__0_in_rule__LibraryType__Group_4__1__Impl1500);
            	    rule__LibraryType__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLibraryTypeAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__LibraryType__Group_4__1__Impl"


    // $ANTLR start "rule__LibraryType__Group_4_1__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:783:1: rule__LibraryType__Group_4_1__0 : rule__LibraryType__Group_4_1__0__Impl rule__LibraryType__Group_4_1__1 ;
    public final void rule__LibraryType__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:787:1: ( rule__LibraryType__Group_4_1__0__Impl rule__LibraryType__Group_4_1__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:788:2: rule__LibraryType__Group_4_1__0__Impl rule__LibraryType__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4_1__0__Impl_in_rule__LibraryType__Group_4_1__01535);
            rule__LibraryType__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4_1__1_in_rule__LibraryType__Group_4_1__01538);
            rule__LibraryType__Group_4_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_4_1__0"


    // $ANTLR start "rule__LibraryType__Group_4_1__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:795:1: rule__LibraryType__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__LibraryType__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:799:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:800:1: ( ',' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:800:1: ( ',' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:801:1: ','
            {
             before(grammarAccess.getLibraryTypeAccess().getCommaKeyword_4_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__LibraryType__Group_4_1__0__Impl1566); 
             after(grammarAccess.getLibraryTypeAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__LibraryType__Group_4_1__0__Impl"


    // $ANTLR start "rule__LibraryType__Group_4_1__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:814:1: rule__LibraryType__Group_4_1__1 : rule__LibraryType__Group_4_1__1__Impl ;
    public final void rule__LibraryType__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:818:1: ( rule__LibraryType__Group_4_1__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:819:2: rule__LibraryType__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__Group_4_1__1__Impl_in_rule__LibraryType__Group_4_1__11597);
            rule__LibraryType__Group_4_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__LibraryType__Group_4_1__1"


    // $ANTLR start "rule__LibraryType__Group_4_1__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:825:1: rule__LibraryType__Group_4_1__1__Impl : ( ( rule__LibraryType__CustomerAssignment_4_1_1 ) ) ;
    public final void rule__LibraryType__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:829:1: ( ( ( rule__LibraryType__CustomerAssignment_4_1_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:830:1: ( ( rule__LibraryType__CustomerAssignment_4_1_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:830:1: ( ( rule__LibraryType__CustomerAssignment_4_1_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:831:1: ( rule__LibraryType__CustomerAssignment_4_1_1 )
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_4_1_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:832:1: ( rule__LibraryType__CustomerAssignment_4_1_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:832:2: rule__LibraryType__CustomerAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LibraryType__CustomerAssignment_4_1_1_in_rule__LibraryType__Group_4_1__1__Impl1624);
            rule__LibraryType__CustomerAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTypeAccess().getCustomerAssignment_4_1_1()); 

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
    // $ANTLR end "rule__LibraryType__Group_4_1__1__Impl"


    // $ANTLR start "rule__BookType__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:846:1: rule__BookType__Group__0 : rule__BookType__Group__0__Impl rule__BookType__Group__1 ;
    public final void rule__BookType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:850:1: ( rule__BookType__Group__0__Impl rule__BookType__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:851:2: rule__BookType__Group__0__Impl rule__BookType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__0__Impl_in_rule__BookType__Group__01658);
            rule__BookType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__1_in_rule__BookType__Group__01661);
            rule__BookType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__0"


    // $ANTLR start "rule__BookType__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:858:1: rule__BookType__Group__0__Impl : ( 'Book' ) ;
    public final void rule__BookType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:862:1: ( ( 'Book' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:863:1: ( 'Book' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:863:1: ( 'Book' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:864:1: 'Book'
            {
             before(grammarAccess.getBookTypeAccess().getBookKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__BookType__Group__0__Impl1689); 
             after(grammarAccess.getBookTypeAccess().getBookKeyword_0()); 

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
    // $ANTLR end "rule__BookType__Group__0__Impl"


    // $ANTLR start "rule__BookType__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:877:1: rule__BookType__Group__1 : rule__BookType__Group__1__Impl rule__BookType__Group__2 ;
    public final void rule__BookType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:881:1: ( rule__BookType__Group__1__Impl rule__BookType__Group__2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:882:2: rule__BookType__Group__1__Impl rule__BookType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__1__Impl_in_rule__BookType__Group__11720);
            rule__BookType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__2_in_rule__BookType__Group__11723);
            rule__BookType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__1"


    // $ANTLR start "rule__BookType__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:889:1: rule__BookType__Group__1__Impl : ( ( rule__BookType__NameAssignment_1 ) ) ;
    public final void rule__BookType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:893:1: ( ( ( rule__BookType__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:894:1: ( ( rule__BookType__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:894:1: ( ( rule__BookType__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:895:1: ( rule__BookType__NameAssignment_1 )
            {
             before(grammarAccess.getBookTypeAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:896:1: ( rule__BookType__NameAssignment_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:896:2: rule__BookType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__NameAssignment_1_in_rule__BookType__Group__1__Impl1750);
            rule__BookType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BookType__Group__1__Impl"


    // $ANTLR start "rule__BookType__Group__2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:906:1: rule__BookType__Group__2 : rule__BookType__Group__2__Impl rule__BookType__Group__3 ;
    public final void rule__BookType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:910:1: ( rule__BookType__Group__2__Impl rule__BookType__Group__3 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:911:2: rule__BookType__Group__2__Impl rule__BookType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__2__Impl_in_rule__BookType__Group__21780);
            rule__BookType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__3_in_rule__BookType__Group__21783);
            rule__BookType__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__2"


    // $ANTLR start "rule__BookType__Group__2__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:918:1: rule__BookType__Group__2__Impl : ( '{' ) ;
    public final void rule__BookType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:922:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:923:1: ( '{' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:923:1: ( '{' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:924:1: '{'
            {
             before(grammarAccess.getBookTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BookType__Group__2__Impl1811); 
             after(grammarAccess.getBookTypeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BookType__Group__2__Impl"


    // $ANTLR start "rule__BookType__Group__3"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:937:1: rule__BookType__Group__3 : rule__BookType__Group__3__Impl rule__BookType__Group__4 ;
    public final void rule__BookType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:941:1: ( rule__BookType__Group__3__Impl rule__BookType__Group__4 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:942:2: rule__BookType__Group__3__Impl rule__BookType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__3__Impl_in_rule__BookType__Group__31842);
            rule__BookType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__4_in_rule__BookType__Group__31845);
            rule__BookType__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__3"


    // $ANTLR start "rule__BookType__Group__3__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:949:1: rule__BookType__Group__3__Impl : ( 'title' ) ;
    public final void rule__BookType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:953:1: ( ( 'title' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:954:1: ( 'title' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:954:1: ( 'title' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:955:1: 'title'
            {
             before(grammarAccess.getBookTypeAccess().getTitleKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__BookType__Group__3__Impl1873); 
             after(grammarAccess.getBookTypeAccess().getTitleKeyword_3()); 

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
    // $ANTLR end "rule__BookType__Group__3__Impl"


    // $ANTLR start "rule__BookType__Group__4"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:968:1: rule__BookType__Group__4 : rule__BookType__Group__4__Impl rule__BookType__Group__5 ;
    public final void rule__BookType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:972:1: ( rule__BookType__Group__4__Impl rule__BookType__Group__5 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:973:2: rule__BookType__Group__4__Impl rule__BookType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__4__Impl_in_rule__BookType__Group__41904);
            rule__BookType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__5_in_rule__BookType__Group__41907);
            rule__BookType__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__4"


    // $ANTLR start "rule__BookType__Group__4__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:980:1: rule__BookType__Group__4__Impl : ( ( rule__BookType__TitleAssignment_4 ) ) ;
    public final void rule__BookType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:984:1: ( ( ( rule__BookType__TitleAssignment_4 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:985:1: ( ( rule__BookType__TitleAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:985:1: ( ( rule__BookType__TitleAssignment_4 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:986:1: ( rule__BookType__TitleAssignment_4 )
            {
             before(grammarAccess.getBookTypeAccess().getTitleAssignment_4()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:987:1: ( rule__BookType__TitleAssignment_4 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:987:2: rule__BookType__TitleAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__TitleAssignment_4_in_rule__BookType__Group__4__Impl1934);
            rule__BookType__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBookTypeAccess().getTitleAssignment_4()); 

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
    // $ANTLR end "rule__BookType__Group__4__Impl"


    // $ANTLR start "rule__BookType__Group__5"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:997:1: rule__BookType__Group__5 : rule__BookType__Group__5__Impl rule__BookType__Group__6 ;
    public final void rule__BookType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1001:1: ( rule__BookType__Group__5__Impl rule__BookType__Group__6 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1002:2: rule__BookType__Group__5__Impl rule__BookType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__5__Impl_in_rule__BookType__Group__51964);
            rule__BookType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__6_in_rule__BookType__Group__51967);
            rule__BookType__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__5"


    // $ANTLR start "rule__BookType__Group__5__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1009:1: rule__BookType__Group__5__Impl : ( 'author' ) ;
    public final void rule__BookType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1013:1: ( ( 'author' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1014:1: ( 'author' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1014:1: ( 'author' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1015:1: 'author'
            {
             before(grammarAccess.getBookTypeAccess().getAuthorKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BookType__Group__5__Impl1995); 
             after(grammarAccess.getBookTypeAccess().getAuthorKeyword_5()); 

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
    // $ANTLR end "rule__BookType__Group__5__Impl"


    // $ANTLR start "rule__BookType__Group__6"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1028:1: rule__BookType__Group__6 : rule__BookType__Group__6__Impl rule__BookType__Group__7 ;
    public final void rule__BookType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1032:1: ( rule__BookType__Group__6__Impl rule__BookType__Group__7 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1033:2: rule__BookType__Group__6__Impl rule__BookType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__6__Impl_in_rule__BookType__Group__62026);
            rule__BookType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__7_in_rule__BookType__Group__62029);
            rule__BookType__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__6"


    // $ANTLR start "rule__BookType__Group__6__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1040:1: rule__BookType__Group__6__Impl : ( ( rule__BookType__AuthorAssignment_6 ) ) ;
    public final void rule__BookType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1044:1: ( ( ( rule__BookType__AuthorAssignment_6 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1045:1: ( ( rule__BookType__AuthorAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1045:1: ( ( rule__BookType__AuthorAssignment_6 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1046:1: ( rule__BookType__AuthorAssignment_6 )
            {
             before(grammarAccess.getBookTypeAccess().getAuthorAssignment_6()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1047:1: ( rule__BookType__AuthorAssignment_6 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1047:2: rule__BookType__AuthorAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__AuthorAssignment_6_in_rule__BookType__Group__6__Impl2056);
            rule__BookType__AuthorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBookTypeAccess().getAuthorAssignment_6()); 

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
    // $ANTLR end "rule__BookType__Group__6__Impl"


    // $ANTLR start "rule__BookType__Group__7"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1057:1: rule__BookType__Group__7 : rule__BookType__Group__7__Impl rule__BookType__Group__8 ;
    public final void rule__BookType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1061:1: ( rule__BookType__Group__7__Impl rule__BookType__Group__8 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1062:2: rule__BookType__Group__7__Impl rule__BookType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__7__Impl_in_rule__BookType__Group__72086);
            rule__BookType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__8_in_rule__BookType__Group__72089);
            rule__BookType__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__7"


    // $ANTLR start "rule__BookType__Group__7__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1069:1: rule__BookType__Group__7__Impl : ( 'pages' ) ;
    public final void rule__BookType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1073:1: ( ( 'pages' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1074:1: ( 'pages' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1074:1: ( 'pages' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1075:1: 'pages'
            {
             before(grammarAccess.getBookTypeAccess().getPagesKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BookType__Group__7__Impl2117); 
             after(grammarAccess.getBookTypeAccess().getPagesKeyword_7()); 

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
    // $ANTLR end "rule__BookType__Group__7__Impl"


    // $ANTLR start "rule__BookType__Group__8"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1088:1: rule__BookType__Group__8 : rule__BookType__Group__8__Impl rule__BookType__Group__9 ;
    public final void rule__BookType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1092:1: ( rule__BookType__Group__8__Impl rule__BookType__Group__9 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1093:2: rule__BookType__Group__8__Impl rule__BookType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__8__Impl_in_rule__BookType__Group__82148);
            rule__BookType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__9_in_rule__BookType__Group__82151);
            rule__BookType__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__8"


    // $ANTLR start "rule__BookType__Group__8__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1100:1: rule__BookType__Group__8__Impl : ( ( rule__BookType__PagesAssignment_8 ) ) ;
    public final void rule__BookType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1104:1: ( ( ( rule__BookType__PagesAssignment_8 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1105:1: ( ( rule__BookType__PagesAssignment_8 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1105:1: ( ( rule__BookType__PagesAssignment_8 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1106:1: ( rule__BookType__PagesAssignment_8 )
            {
             before(grammarAccess.getBookTypeAccess().getPagesAssignment_8()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1107:1: ( rule__BookType__PagesAssignment_8 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1107:2: rule__BookType__PagesAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__PagesAssignment_8_in_rule__BookType__Group__8__Impl2178);
            rule__BookType__PagesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBookTypeAccess().getPagesAssignment_8()); 

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
    // $ANTLR end "rule__BookType__Group__8__Impl"


    // $ANTLR start "rule__BookType__Group__9"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1117:1: rule__BookType__Group__9 : rule__BookType__Group__9__Impl rule__BookType__Group__10 ;
    public final void rule__BookType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1121:1: ( rule__BookType__Group__9__Impl rule__BookType__Group__10 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1122:2: rule__BookType__Group__9__Impl rule__BookType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__9__Impl_in_rule__BookType__Group__92208);
            rule__BookType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__10_in_rule__BookType__Group__92211);
            rule__BookType__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__9"


    // $ANTLR start "rule__BookType__Group__9__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1129:1: rule__BookType__Group__9__Impl : ( 'isbn' ) ;
    public final void rule__BookType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1133:1: ( ( 'isbn' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1134:1: ( 'isbn' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1134:1: ( 'isbn' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1135:1: 'isbn'
            {
             before(grammarAccess.getBookTypeAccess().getIsbnKeyword_9()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__BookType__Group__9__Impl2239); 
             after(grammarAccess.getBookTypeAccess().getIsbnKeyword_9()); 

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
    // $ANTLR end "rule__BookType__Group__9__Impl"


    // $ANTLR start "rule__BookType__Group__10"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1148:1: rule__BookType__Group__10 : rule__BookType__Group__10__Impl rule__BookType__Group__11 ;
    public final void rule__BookType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1152:1: ( rule__BookType__Group__10__Impl rule__BookType__Group__11 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1153:2: rule__BookType__Group__10__Impl rule__BookType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__10__Impl_in_rule__BookType__Group__102270);
            rule__BookType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__11_in_rule__BookType__Group__102273);
            rule__BookType__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__10"


    // $ANTLR start "rule__BookType__Group__10__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1160:1: rule__BookType__Group__10__Impl : ( ( rule__BookType__IsbnAssignment_10 ) ) ;
    public final void rule__BookType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1164:1: ( ( ( rule__BookType__IsbnAssignment_10 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1165:1: ( ( rule__BookType__IsbnAssignment_10 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1165:1: ( ( rule__BookType__IsbnAssignment_10 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1166:1: ( rule__BookType__IsbnAssignment_10 )
            {
             before(grammarAccess.getBookTypeAccess().getIsbnAssignment_10()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1167:1: ( rule__BookType__IsbnAssignment_10 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1167:2: rule__BookType__IsbnAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__IsbnAssignment_10_in_rule__BookType__Group__10__Impl2300);
            rule__BookType__IsbnAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getBookTypeAccess().getIsbnAssignment_10()); 

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
    // $ANTLR end "rule__BookType__Group__10__Impl"


    // $ANTLR start "rule__BookType__Group__11"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1177:1: rule__BookType__Group__11 : rule__BookType__Group__11__Impl rule__BookType__Group__12 ;
    public final void rule__BookType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1181:1: ( rule__BookType__Group__11__Impl rule__BookType__Group__12 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1182:2: rule__BookType__Group__11__Impl rule__BookType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__11__Impl_in_rule__BookType__Group__112330);
            rule__BookType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__12_in_rule__BookType__Group__112333);
            rule__BookType__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__11"


    // $ANTLR start "rule__BookType__Group__11__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1189:1: rule__BookType__Group__11__Impl : ( ( rule__BookType__BookInfoAssignment_11 )? ) ;
    public final void rule__BookType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1193:1: ( ( ( rule__BookType__BookInfoAssignment_11 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1194:1: ( ( rule__BookType__BookInfoAssignment_11 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1194:1: ( ( rule__BookType__BookInfoAssignment_11 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1195:1: ( rule__BookType__BookInfoAssignment_11 )?
            {
             before(grammarAccess.getBookTypeAccess().getBookInfoAssignment_11()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1196:1: ( rule__BookType__BookInfoAssignment_11 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1196:2: rule__BookType__BookInfoAssignment_11
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BookType__BookInfoAssignment_11_in_rule__BookType__Group__11__Impl2360);
                    rule__BookType__BookInfoAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBookTypeAccess().getBookInfoAssignment_11()); 

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
    // $ANTLR end "rule__BookType__Group__11__Impl"


    // $ANTLR start "rule__BookType__Group__12"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1206:1: rule__BookType__Group__12 : rule__BookType__Group__12__Impl ;
    public final void rule__BookType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1210:1: ( rule__BookType__Group__12__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1211:2: rule__BookType__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookType__Group__12__Impl_in_rule__BookType__Group__122391);
            rule__BookType__Group__12__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__BookType__Group__12"


    // $ANTLR start "rule__BookType__Group__12__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1217:1: rule__BookType__Group__12__Impl : ( '}' ) ;
    public final void rule__BookType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1221:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1222:1: ( '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1222:1: ( '}' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1223:1: '}'
            {
             before(grammarAccess.getBookTypeAccess().getRightCurlyBracketKeyword_12()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__BookType__Group__12__Impl2419); 
             after(grammarAccess.getBookTypeAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__BookType__Group__12__Impl"


    // $ANTLR start "rule__CustomerType__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1262:1: rule__CustomerType__Group__0 : rule__CustomerType__Group__0__Impl rule__CustomerType__Group__1 ;
    public final void rule__CustomerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1266:1: ( rule__CustomerType__Group__0__Impl rule__CustomerType__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1267:2: rule__CustomerType__Group__0__Impl rule__CustomerType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__0__Impl_in_rule__CustomerType__Group__02476);
            rule__CustomerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__1_in_rule__CustomerType__Group__02479);
            rule__CustomerType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__0"


    // $ANTLR start "rule__CustomerType__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1274:1: rule__CustomerType__Group__0__Impl : ( 'Customer' ) ;
    public final void rule__CustomerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1278:1: ( ( 'Customer' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1279:1: ( 'Customer' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1279:1: ( 'Customer' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1280:1: 'Customer'
            {
             before(grammarAccess.getCustomerTypeAccess().getCustomerKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__CustomerType__Group__0__Impl2507); 
             after(grammarAccess.getCustomerTypeAccess().getCustomerKeyword_0()); 

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
    // $ANTLR end "rule__CustomerType__Group__0__Impl"


    // $ANTLR start "rule__CustomerType__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1293:1: rule__CustomerType__Group__1 : rule__CustomerType__Group__1__Impl rule__CustomerType__Group__2 ;
    public final void rule__CustomerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1297:1: ( rule__CustomerType__Group__1__Impl rule__CustomerType__Group__2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1298:2: rule__CustomerType__Group__1__Impl rule__CustomerType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__1__Impl_in_rule__CustomerType__Group__12538);
            rule__CustomerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__2_in_rule__CustomerType__Group__12541);
            rule__CustomerType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__1"


    // $ANTLR start "rule__CustomerType__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1305:1: rule__CustomerType__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1309:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1310:1: ( '{' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1310:1: ( '{' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1311:1: '{'
            {
             before(grammarAccess.getCustomerTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__CustomerType__Group__1__Impl2569); 
             after(grammarAccess.getCustomerTypeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CustomerType__Group__1__Impl"


    // $ANTLR start "rule__CustomerType__Group__2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1324:1: rule__CustomerType__Group__2 : rule__CustomerType__Group__2__Impl rule__CustomerType__Group__3 ;
    public final void rule__CustomerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1328:1: ( rule__CustomerType__Group__2__Impl rule__CustomerType__Group__3 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1329:2: rule__CustomerType__Group__2__Impl rule__CustomerType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__2__Impl_in_rule__CustomerType__Group__22600);
            rule__CustomerType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__3_in_rule__CustomerType__Group__22603);
            rule__CustomerType__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__2"


    // $ANTLR start "rule__CustomerType__Group__2__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1336:1: rule__CustomerType__Group__2__Impl : ( 'firstName' ) ;
    public final void rule__CustomerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1340:1: ( ( 'firstName' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1341:1: ( 'firstName' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1341:1: ( 'firstName' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1342:1: 'firstName'
            {
             before(grammarAccess.getCustomerTypeAccess().getFirstNameKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CustomerType__Group__2__Impl2631); 
             after(grammarAccess.getCustomerTypeAccess().getFirstNameKeyword_2()); 

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
    // $ANTLR end "rule__CustomerType__Group__2__Impl"


    // $ANTLR start "rule__CustomerType__Group__3"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1355:1: rule__CustomerType__Group__3 : rule__CustomerType__Group__3__Impl rule__CustomerType__Group__4 ;
    public final void rule__CustomerType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1359:1: ( rule__CustomerType__Group__3__Impl rule__CustomerType__Group__4 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1360:2: rule__CustomerType__Group__3__Impl rule__CustomerType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__3__Impl_in_rule__CustomerType__Group__32662);
            rule__CustomerType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__4_in_rule__CustomerType__Group__32665);
            rule__CustomerType__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__3"


    // $ANTLR start "rule__CustomerType__Group__3__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1367:1: rule__CustomerType__Group__3__Impl : ( ( rule__CustomerType__FirstNameAssignment_3 ) ) ;
    public final void rule__CustomerType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1371:1: ( ( ( rule__CustomerType__FirstNameAssignment_3 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1372:1: ( ( rule__CustomerType__FirstNameAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1372:1: ( ( rule__CustomerType__FirstNameAssignment_3 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1373:1: ( rule__CustomerType__FirstNameAssignment_3 )
            {
             before(grammarAccess.getCustomerTypeAccess().getFirstNameAssignment_3()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1374:1: ( rule__CustomerType__FirstNameAssignment_3 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1374:2: rule__CustomerType__FirstNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__FirstNameAssignment_3_in_rule__CustomerType__Group__3__Impl2692);
            rule__CustomerType__FirstNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getFirstNameAssignment_3()); 

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
    // $ANTLR end "rule__CustomerType__Group__3__Impl"


    // $ANTLR start "rule__CustomerType__Group__4"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1384:1: rule__CustomerType__Group__4 : rule__CustomerType__Group__4__Impl rule__CustomerType__Group__5 ;
    public final void rule__CustomerType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1388:1: ( rule__CustomerType__Group__4__Impl rule__CustomerType__Group__5 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1389:2: rule__CustomerType__Group__4__Impl rule__CustomerType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__4__Impl_in_rule__CustomerType__Group__42722);
            rule__CustomerType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__5_in_rule__CustomerType__Group__42725);
            rule__CustomerType__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__4"


    // $ANTLR start "rule__CustomerType__Group__4__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1396:1: rule__CustomerType__Group__4__Impl : ( 'lastName' ) ;
    public final void rule__CustomerType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1400:1: ( ( 'lastName' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1401:1: ( 'lastName' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1401:1: ( 'lastName' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1402:1: 'lastName'
            {
             before(grammarAccess.getCustomerTypeAccess().getLastNameKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__CustomerType__Group__4__Impl2753); 
             after(grammarAccess.getCustomerTypeAccess().getLastNameKeyword_4()); 

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
    // $ANTLR end "rule__CustomerType__Group__4__Impl"


    // $ANTLR start "rule__CustomerType__Group__5"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1415:1: rule__CustomerType__Group__5 : rule__CustomerType__Group__5__Impl rule__CustomerType__Group__6 ;
    public final void rule__CustomerType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1419:1: ( rule__CustomerType__Group__5__Impl rule__CustomerType__Group__6 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1420:2: rule__CustomerType__Group__5__Impl rule__CustomerType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__5__Impl_in_rule__CustomerType__Group__52784);
            rule__CustomerType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__6_in_rule__CustomerType__Group__52787);
            rule__CustomerType__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__5"


    // $ANTLR start "rule__CustomerType__Group__5__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1427:1: rule__CustomerType__Group__5__Impl : ( ( rule__CustomerType__LastNameAssignment_5 ) ) ;
    public final void rule__CustomerType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1431:1: ( ( ( rule__CustomerType__LastNameAssignment_5 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1432:1: ( ( rule__CustomerType__LastNameAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1432:1: ( ( rule__CustomerType__LastNameAssignment_5 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1433:1: ( rule__CustomerType__LastNameAssignment_5 )
            {
             before(grammarAccess.getCustomerTypeAccess().getLastNameAssignment_5()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1434:1: ( rule__CustomerType__LastNameAssignment_5 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1434:2: rule__CustomerType__LastNameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__LastNameAssignment_5_in_rule__CustomerType__Group__5__Impl2814);
            rule__CustomerType__LastNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getLastNameAssignment_5()); 

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
    // $ANTLR end "rule__CustomerType__Group__5__Impl"


    // $ANTLR start "rule__CustomerType__Group__6"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1444:1: rule__CustomerType__Group__6 : rule__CustomerType__Group__6__Impl rule__CustomerType__Group__7 ;
    public final void rule__CustomerType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1448:1: ( rule__CustomerType__Group__6__Impl rule__CustomerType__Group__7 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1449:2: rule__CustomerType__Group__6__Impl rule__CustomerType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__6__Impl_in_rule__CustomerType__Group__62844);
            rule__CustomerType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__7_in_rule__CustomerType__Group__62847);
            rule__CustomerType__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__6"


    // $ANTLR start "rule__CustomerType__Group__6__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1456:1: rule__CustomerType__Group__6__Impl : ( ( rule__CustomerType__Group_6__0 )? ) ;
    public final void rule__CustomerType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1460:1: ( ( ( rule__CustomerType__Group_6__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1461:1: ( ( rule__CustomerType__Group_6__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1461:1: ( ( rule__CustomerType__Group_6__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1462:1: ( rule__CustomerType__Group_6__0 )?
            {
             before(grammarAccess.getCustomerTypeAccess().getGroup_6()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1463:1: ( rule__CustomerType__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1463:2: rule__CustomerType__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_6__0_in_rule__CustomerType__Group__6__Impl2874);
                    rule__CustomerType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerTypeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__CustomerType__Group__6__Impl"


    // $ANTLR start "rule__CustomerType__Group__7"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1473:1: rule__CustomerType__Group__7 : rule__CustomerType__Group__7__Impl ;
    public final void rule__CustomerType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1477:1: ( rule__CustomerType__Group__7__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1478:2: rule__CustomerType__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group__7__Impl_in_rule__CustomerType__Group__72905);
            rule__CustomerType__Group__7__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group__7"


    // $ANTLR start "rule__CustomerType__Group__7__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1484:1: rule__CustomerType__Group__7__Impl : ( '}' ) ;
    public final void rule__CustomerType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1488:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1489:1: ( '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1489:1: ( '}' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1490:1: '}'
            {
             before(grammarAccess.getCustomerTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__CustomerType__Group__7__Impl2933); 
             after(grammarAccess.getCustomerTypeAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__CustomerType__Group__7__Impl"


    // $ANTLR start "rule__CustomerType__Group_6__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1519:1: rule__CustomerType__Group_6__0 : rule__CustomerType__Group_6__0__Impl rule__CustomerType__Group_6__1 ;
    public final void rule__CustomerType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1523:1: ( rule__CustomerType__Group_6__0__Impl rule__CustomerType__Group_6__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1524:2: rule__CustomerType__Group_6__0__Impl rule__CustomerType__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_6__0__Impl_in_rule__CustomerType__Group_6__02980);
            rule__CustomerType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_6__1_in_rule__CustomerType__Group_6__02983);
            rule__CustomerType__Group_6__1();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group_6__0"


    // $ANTLR start "rule__CustomerType__Group_6__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1531:1: rule__CustomerType__Group_6__0__Impl : ( 'borrowedBookId' ) ;
    public final void rule__CustomerType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1535:1: ( ( 'borrowedBookId' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1536:1: ( 'borrowedBookId' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1536:1: ( 'borrowedBookId' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1537:1: 'borrowedBookId'
            {
             before(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdKeyword_6_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__CustomerType__Group_6__0__Impl3011); 
             after(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdKeyword_6_0()); 

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
    // $ANTLR end "rule__CustomerType__Group_6__0__Impl"


    // $ANTLR start "rule__CustomerType__Group_6__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1550:1: rule__CustomerType__Group_6__1 : rule__CustomerType__Group_6__1__Impl ;
    public final void rule__CustomerType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1554:1: ( rule__CustomerType__Group_6__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1555:2: rule__CustomerType__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__Group_6__1__Impl_in_rule__CustomerType__Group_6__13042);
            rule__CustomerType__Group_6__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__CustomerType__Group_6__1"


    // $ANTLR start "rule__CustomerType__Group_6__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1561:1: rule__CustomerType__Group_6__1__Impl : ( ( rule__CustomerType__BorrowedBookIdAssignment_6_1 ) ) ;
    public final void rule__CustomerType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1565:1: ( ( ( rule__CustomerType__BorrowedBookIdAssignment_6_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1566:1: ( ( rule__CustomerType__BorrowedBookIdAssignment_6_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1566:1: ( ( rule__CustomerType__BorrowedBookIdAssignment_6_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1567:1: ( rule__CustomerType__BorrowedBookIdAssignment_6_1 )
            {
             before(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdAssignment_6_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1568:1: ( rule__CustomerType__BorrowedBookIdAssignment_6_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1568:2: rule__CustomerType__BorrowedBookIdAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomerType__BorrowedBookIdAssignment_6_1_in_rule__CustomerType__Group_6__1__Impl3069);
            rule__CustomerType__BorrowedBookIdAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdAssignment_6_1()); 

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
    // $ANTLR end "rule__CustomerType__Group_6__1__Impl"


    // $ANTLR start "rule__BookInfoType__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1582:1: rule__BookInfoType__Group__0 : rule__BookInfoType__Group__0__Impl rule__BookInfoType__Group__1 ;
    public final void rule__BookInfoType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1586:1: ( rule__BookInfoType__Group__0__Impl rule__BookInfoType__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1587:2: rule__BookInfoType__Group__0__Impl rule__BookInfoType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group__0__Impl_in_rule__BookInfoType__Group__03103);
            rule__BookInfoType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group__1_in_rule__BookInfoType__Group__03106);
            rule__BookInfoType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group__0"


    // $ANTLR start "rule__BookInfoType__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1594:1: rule__BookInfoType__Group__0__Impl : ( () ) ;
    public final void rule__BookInfoType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1598:1: ( ( () ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1599:1: ( () )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1599:1: ( () )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1600:1: ()
            {
             before(grammarAccess.getBookInfoTypeAccess().getBookInfoTypeAction_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1601:1: ()
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1603:1: 
            {
            }

             after(grammarAccess.getBookInfoTypeAccess().getBookInfoTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BookInfoType__Group__0__Impl"


    // $ANTLR start "rule__BookInfoType__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1613:1: rule__BookInfoType__Group__1 : rule__BookInfoType__Group__1__Impl rule__BookInfoType__Group__2 ;
    public final void rule__BookInfoType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1617:1: ( rule__BookInfoType__Group__1__Impl rule__BookInfoType__Group__2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1618:2: rule__BookInfoType__Group__1__Impl rule__BookInfoType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group__1__Impl_in_rule__BookInfoType__Group__13164);
            rule__BookInfoType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group__2_in_rule__BookInfoType__Group__13167);
            rule__BookInfoType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group__1"


    // $ANTLR start "rule__BookInfoType__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1625:1: rule__BookInfoType__Group__1__Impl : ( 'BookInfo' ) ;
    public final void rule__BookInfoType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1629:1: ( ( 'BookInfo' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1630:1: ( 'BookInfo' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1630:1: ( 'BookInfo' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1631:1: 'BookInfo'
            {
             before(grammarAccess.getBookInfoTypeAccess().getBookInfoKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BookInfoType__Group__1__Impl3195); 
             after(grammarAccess.getBookInfoTypeAccess().getBookInfoKeyword_1()); 

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
    // $ANTLR end "rule__BookInfoType__Group__1__Impl"


    // $ANTLR start "rule__BookInfoType__Group__2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1644:1: rule__BookInfoType__Group__2 : rule__BookInfoType__Group__2__Impl ;
    public final void rule__BookInfoType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1648:1: ( rule__BookInfoType__Group__2__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1649:2: rule__BookInfoType__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group__2__Impl_in_rule__BookInfoType__Group__23226);
            rule__BookInfoType__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group__2"


    // $ANTLR start "rule__BookInfoType__Group__2__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1655:1: rule__BookInfoType__Group__2__Impl : ( ( rule__BookInfoType__Group_2__0 )? ) ;
    public final void rule__BookInfoType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1659:1: ( ( ( rule__BookInfoType__Group_2__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1660:1: ( ( rule__BookInfoType__Group_2__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1660:1: ( ( rule__BookInfoType__Group_2__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1661:1: ( rule__BookInfoType__Group_2__0 )?
            {
             before(grammarAccess.getBookInfoTypeAccess().getGroup_2()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1662:1: ( rule__BookInfoType__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1662:2: rule__BookInfoType__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2__0_in_rule__BookInfoType__Group__2__Impl3253);
                    rule__BookInfoType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBookInfoTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BookInfoType__Group__2__Impl"


    // $ANTLR start "rule__BookInfoType__Group_2__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1678:1: rule__BookInfoType__Group_2__0 : rule__BookInfoType__Group_2__0__Impl rule__BookInfoType__Group_2__1 ;
    public final void rule__BookInfoType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1682:1: ( rule__BookInfoType__Group_2__0__Impl rule__BookInfoType__Group_2__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1683:2: rule__BookInfoType__Group_2__0__Impl rule__BookInfoType__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2__0__Impl_in_rule__BookInfoType__Group_2__03290);
            rule__BookInfoType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2__1_in_rule__BookInfoType__Group_2__03293);
            rule__BookInfoType__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group_2__0"


    // $ANTLR start "rule__BookInfoType__Group_2__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1690:1: rule__BookInfoType__Group_2__0__Impl : ( ( rule__BookInfoType__AnyAssignment_2_0 ) ) ;
    public final void rule__BookInfoType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1694:1: ( ( ( rule__BookInfoType__AnyAssignment_2_0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1695:1: ( ( rule__BookInfoType__AnyAssignment_2_0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1695:1: ( ( rule__BookInfoType__AnyAssignment_2_0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1696:1: ( rule__BookInfoType__AnyAssignment_2_0 )
            {
             before(grammarAccess.getBookInfoTypeAccess().getAnyAssignment_2_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1697:1: ( rule__BookInfoType__AnyAssignment_2_0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1697:2: rule__BookInfoType__AnyAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__AnyAssignment_2_0_in_rule__BookInfoType__Group_2__0__Impl3320);
            rule__BookInfoType__AnyAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBookInfoTypeAccess().getAnyAssignment_2_0()); 

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
    // $ANTLR end "rule__BookInfoType__Group_2__0__Impl"


    // $ANTLR start "rule__BookInfoType__Group_2__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1707:1: rule__BookInfoType__Group_2__1 : rule__BookInfoType__Group_2__1__Impl ;
    public final void rule__BookInfoType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1711:1: ( rule__BookInfoType__Group_2__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1712:2: rule__BookInfoType__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2__1__Impl_in_rule__BookInfoType__Group_2__13350);
            rule__BookInfoType__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group_2__1"


    // $ANTLR start "rule__BookInfoType__Group_2__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1718:1: rule__BookInfoType__Group_2__1__Impl : ( ( rule__BookInfoType__Group_2_1__0 )* ) ;
    public final void rule__BookInfoType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1722:1: ( ( ( rule__BookInfoType__Group_2_1__0 )* ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1723:1: ( ( rule__BookInfoType__Group_2_1__0 )* )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1723:1: ( ( rule__BookInfoType__Group_2_1__0 )* )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1724:1: ( rule__BookInfoType__Group_2_1__0 )*
            {
             before(grammarAccess.getBookInfoTypeAccess().getGroup_2_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1725:1: ( rule__BookInfoType__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1725:2: rule__BookInfoType__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2_1__0_in_rule__BookInfoType__Group_2__1__Impl3377);
            	    rule__BookInfoType__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBookInfoTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__BookInfoType__Group_2__1__Impl"


    // $ANTLR start "rule__BookInfoType__Group_2_1__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1739:1: rule__BookInfoType__Group_2_1__0 : rule__BookInfoType__Group_2_1__0__Impl rule__BookInfoType__Group_2_1__1 ;
    public final void rule__BookInfoType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1743:1: ( rule__BookInfoType__Group_2_1__0__Impl rule__BookInfoType__Group_2_1__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1744:2: rule__BookInfoType__Group_2_1__0__Impl rule__BookInfoType__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2_1__0__Impl_in_rule__BookInfoType__Group_2_1__03412);
            rule__BookInfoType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2_1__1_in_rule__BookInfoType__Group_2_1__03415);
            rule__BookInfoType__Group_2_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group_2_1__0"


    // $ANTLR start "rule__BookInfoType__Group_2_1__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1751:1: rule__BookInfoType__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__BookInfoType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1755:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1756:1: ( ',' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1756:1: ( ',' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1757:1: ','
            {
             before(grammarAccess.getBookInfoTypeAccess().getCommaKeyword_2_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BookInfoType__Group_2_1__0__Impl3443); 
             after(grammarAccess.getBookInfoTypeAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__BookInfoType__Group_2_1__0__Impl"


    // $ANTLR start "rule__BookInfoType__Group_2_1__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1770:1: rule__BookInfoType__Group_2_1__1 : rule__BookInfoType__Group_2_1__1__Impl ;
    public final void rule__BookInfoType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1774:1: ( rule__BookInfoType__Group_2_1__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1775:2: rule__BookInfoType__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__Group_2_1__1__Impl_in_rule__BookInfoType__Group_2_1__13474);
            rule__BookInfoType__Group_2_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__BookInfoType__Group_2_1__1"


    // $ANTLR start "rule__BookInfoType__Group_2_1__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1781:1: rule__BookInfoType__Group_2_1__1__Impl : ( ( rule__BookInfoType__AnyAssignment_2_1_1 ) ) ;
    public final void rule__BookInfoType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1785:1: ( ( ( rule__BookInfoType__AnyAssignment_2_1_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1786:1: ( ( rule__BookInfoType__AnyAssignment_2_1_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1786:1: ( ( rule__BookInfoType__AnyAssignment_2_1_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1787:1: ( rule__BookInfoType__AnyAssignment_2_1_1 )
            {
             before(grammarAccess.getBookInfoTypeAccess().getAnyAssignment_2_1_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1788:1: ( rule__BookInfoType__AnyAssignment_2_1_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1788:2: rule__BookInfoType__AnyAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BookInfoType__AnyAssignment_2_1_1_in_rule__BookInfoType__Group_2_1__1__Impl3501);
            rule__BookInfoType__AnyAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBookInfoTypeAccess().getAnyAssignment_2_1_1()); 

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
    // $ANTLR end "rule__BookInfoType__Group_2_1__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1802:1: rule__AnyGenericElement__Group__0 : rule__AnyGenericElement__Group__0__Impl rule__AnyGenericElement__Group__1 ;
    public final void rule__AnyGenericElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1806:1: ( rule__AnyGenericElement__Group__0__Impl rule__AnyGenericElement__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1807:2: rule__AnyGenericElement__Group__0__Impl rule__AnyGenericElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__0__Impl_in_rule__AnyGenericElement__Group__03535);
            rule__AnyGenericElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__1_in_rule__AnyGenericElement__Group__03538);
            rule__AnyGenericElement__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__0"


    // $ANTLR start "rule__AnyGenericElement__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1814:1: rule__AnyGenericElement__Group__0__Impl : ( () ) ;
    public final void rule__AnyGenericElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1818:1: ( ( () ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1819:1: ( () )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1819:1: ( () )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1820:1: ()
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAction_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1821:1: ()
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1823:1: 
            {
            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1833:1: rule__AnyGenericElement__Group__1 : rule__AnyGenericElement__Group__1__Impl rule__AnyGenericElement__Group__2 ;
    public final void rule__AnyGenericElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1837:1: ( rule__AnyGenericElement__Group__1__Impl rule__AnyGenericElement__Group__2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1838:2: rule__AnyGenericElement__Group__1__Impl rule__AnyGenericElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__1__Impl_in_rule__AnyGenericElement__Group__13596);
            rule__AnyGenericElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__2_in_rule__AnyGenericElement__Group__13599);
            rule__AnyGenericElement__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__1"


    // $ANTLR start "rule__AnyGenericElement__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1845:1: rule__AnyGenericElement__Group__1__Impl : ( '{' ) ;
    public final void rule__AnyGenericElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1849:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1850:1: ( '{' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1850:1: ( '{' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1851:1: '{'
            {
             before(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AnyGenericElement__Group__1__Impl3627); 
             after(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1864:1: rule__AnyGenericElement__Group__2 : rule__AnyGenericElement__Group__2__Impl rule__AnyGenericElement__Group__3 ;
    public final void rule__AnyGenericElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1868:1: ( rule__AnyGenericElement__Group__2__Impl rule__AnyGenericElement__Group__3 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1869:2: rule__AnyGenericElement__Group__2__Impl rule__AnyGenericElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__2__Impl_in_rule__AnyGenericElement__Group__23658);
            rule__AnyGenericElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__3_in_rule__AnyGenericElement__Group__23661);
            rule__AnyGenericElement__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__2"


    // $ANTLR start "rule__AnyGenericElement__Group__2__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1876:1: rule__AnyGenericElement__Group__2__Impl : ( ( rule__AnyGenericElement__ElemNameAssignment_2 )? ) ;
    public final void rule__AnyGenericElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1880:1: ( ( ( rule__AnyGenericElement__ElemNameAssignment_2 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1881:1: ( ( rule__AnyGenericElement__ElemNameAssignment_2 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1881:1: ( ( rule__AnyGenericElement__ElemNameAssignment_2 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1882:1: ( rule__AnyGenericElement__ElemNameAssignment_2 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemNameAssignment_2()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1883:1: ( rule__AnyGenericElement__ElemNameAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_STRING||(LA9_1>=13 && LA9_1<=14)||LA9_1==26) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1883:2: rule__AnyGenericElement__ElemNameAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__ElemNameAssignment_2_in_rule__AnyGenericElement__Group__2__Impl3688);
                    rule__AnyGenericElement__ElemNameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getElemNameAssignment_2()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group__2__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__3"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1893:1: rule__AnyGenericElement__Group__3 : rule__AnyGenericElement__Group__3__Impl rule__AnyGenericElement__Group__4 ;
    public final void rule__AnyGenericElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1897:1: ( rule__AnyGenericElement__Group__3__Impl rule__AnyGenericElement__Group__4 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1898:2: rule__AnyGenericElement__Group__3__Impl rule__AnyGenericElement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__3__Impl_in_rule__AnyGenericElement__Group__33719);
            rule__AnyGenericElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__4_in_rule__AnyGenericElement__Group__33722);
            rule__AnyGenericElement__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__3"


    // $ANTLR start "rule__AnyGenericElement__Group__3__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1905:1: rule__AnyGenericElement__Group__3__Impl : ( ( rule__AnyGenericElement__Group_3__0 )? ) ;
    public final void rule__AnyGenericElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1909:1: ( ( ( rule__AnyGenericElement__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1910:1: ( ( rule__AnyGenericElement__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1910:1: ( ( rule__AnyGenericElement__Group_3__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1911:1: ( rule__AnyGenericElement__Group_3__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_3()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1912:1: ( rule__AnyGenericElement__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1912:2: rule__AnyGenericElement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__0_in_rule__AnyGenericElement__Group__3__Impl3749);
                    rule__AnyGenericElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group__3__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__4"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1922:1: rule__AnyGenericElement__Group__4 : rule__AnyGenericElement__Group__4__Impl rule__AnyGenericElement__Group__5 ;
    public final void rule__AnyGenericElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1926:1: ( rule__AnyGenericElement__Group__4__Impl rule__AnyGenericElement__Group__5 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1927:2: rule__AnyGenericElement__Group__4__Impl rule__AnyGenericElement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__4__Impl_in_rule__AnyGenericElement__Group__43780);
            rule__AnyGenericElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__5_in_rule__AnyGenericElement__Group__43783);
            rule__AnyGenericElement__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__4"


    // $ANTLR start "rule__AnyGenericElement__Group__4__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1934:1: rule__AnyGenericElement__Group__4__Impl : ( ( rule__AnyGenericElement__Group_4__0 )? ) ;
    public final void rule__AnyGenericElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1938:1: ( ( ( rule__AnyGenericElement__Group_4__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1939:1: ( ( rule__AnyGenericElement__Group_4__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1939:1: ( ( rule__AnyGenericElement__Group_4__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1940:1: ( rule__AnyGenericElement__Group_4__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1941:1: ( rule__AnyGenericElement__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1941:2: rule__AnyGenericElement__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__0_in_rule__AnyGenericElement__Group__4__Impl3810);
                    rule__AnyGenericElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group__4__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__5"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1951:1: rule__AnyGenericElement__Group__5 : rule__AnyGenericElement__Group__5__Impl rule__AnyGenericElement__Group__6 ;
    public final void rule__AnyGenericElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1955:1: ( rule__AnyGenericElement__Group__5__Impl rule__AnyGenericElement__Group__6 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1956:2: rule__AnyGenericElement__Group__5__Impl rule__AnyGenericElement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__5__Impl_in_rule__AnyGenericElement__Group__53841);
            rule__AnyGenericElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__6_in_rule__AnyGenericElement__Group__53844);
            rule__AnyGenericElement__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__5"


    // $ANTLR start "rule__AnyGenericElement__Group__5__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1963:1: rule__AnyGenericElement__Group__5__Impl : ( ( rule__AnyGenericElement__Group_5__0 )? ) ;
    public final void rule__AnyGenericElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1967:1: ( ( ( rule__AnyGenericElement__Group_5__0 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1968:1: ( ( rule__AnyGenericElement__Group_5__0 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1968:1: ( ( rule__AnyGenericElement__Group_5__0 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1969:1: ( rule__AnyGenericElement__Group_5__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_5()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1970:1: ( rule__AnyGenericElement__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1970:2: rule__AnyGenericElement__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__0_in_rule__AnyGenericElement__Group__5__Impl3871);
                    rule__AnyGenericElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group__5__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__6"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1980:1: rule__AnyGenericElement__Group__6 : rule__AnyGenericElement__Group__6__Impl ;
    public final void rule__AnyGenericElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1984:1: ( rule__AnyGenericElement__Group__6__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1985:2: rule__AnyGenericElement__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__6__Impl_in_rule__AnyGenericElement__Group__63902);
            rule__AnyGenericElement__Group__6__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group__6"


    // $ANTLR start "rule__AnyGenericElement__Group__6__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1991:1: rule__AnyGenericElement__Group__6__Impl : ( '}' ) ;
    public final void rule__AnyGenericElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1995:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1996:1: ( '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1996:1: ( '}' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:1997:1: '}'
            {
             before(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnyGenericElement__Group__6__Impl3930); 
             after(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group__6__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_3__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2024:1: rule__AnyGenericElement__Group_3__0 : rule__AnyGenericElement__Group_3__0__Impl rule__AnyGenericElement__Group_3__1 ;
    public final void rule__AnyGenericElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2028:1: ( rule__AnyGenericElement__Group_3__0__Impl rule__AnyGenericElement__Group_3__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2029:2: rule__AnyGenericElement__Group_3__0__Impl rule__AnyGenericElement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__0__Impl_in_rule__AnyGenericElement__Group_3__03975);
            rule__AnyGenericElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__1_in_rule__AnyGenericElement__Group_3__03978);
            rule__AnyGenericElement__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_3__0"


    // $ANTLR start "rule__AnyGenericElement__Group_3__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2036:1: rule__AnyGenericElement__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AnyGenericElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2040:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2041:1: ( ':' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2041:1: ( ':' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2042:1: ':'
            {
             before(grammarAccess.getAnyGenericElementAccess().getColonKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AnyGenericElement__Group_3__0__Impl4006); 
             after(grammarAccess.getAnyGenericElementAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_3__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_3__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2055:1: rule__AnyGenericElement__Group_3__1 : rule__AnyGenericElement__Group_3__1__Impl ;
    public final void rule__AnyGenericElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2059:1: ( rule__AnyGenericElement__Group_3__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2060:2: rule__AnyGenericElement__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__1__Impl_in_rule__AnyGenericElement__Group_3__14037);
            rule__AnyGenericElement__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_3__1"


    // $ANTLR start "rule__AnyGenericElement__Group_3__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2066:1: rule__AnyGenericElement__Group_3__1__Impl : ( ( rule__AnyGenericElement__ElemValueAssignment_3_1 ) ) ;
    public final void rule__AnyGenericElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2070:1: ( ( ( rule__AnyGenericElement__ElemValueAssignment_3_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2071:1: ( ( rule__AnyGenericElement__ElemValueAssignment_3_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2071:1: ( ( rule__AnyGenericElement__ElemValueAssignment_3_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2072:1: ( rule__AnyGenericElement__ElemValueAssignment_3_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemValueAssignment_3_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2073:1: ( rule__AnyGenericElement__ElemValueAssignment_3_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2073:2: rule__AnyGenericElement__ElemValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__ElemValueAssignment_3_1_in_rule__AnyGenericElement__Group_3__1__Impl4064);
            rule__AnyGenericElement__ElemValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getElemValueAssignment_3_1()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_3__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_4__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2087:1: rule__AnyGenericElement__Group_4__0 : rule__AnyGenericElement__Group_4__0__Impl rule__AnyGenericElement__Group_4__1 ;
    public final void rule__AnyGenericElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2091:1: ( rule__AnyGenericElement__Group_4__0__Impl rule__AnyGenericElement__Group_4__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2092:2: rule__AnyGenericElement__Group_4__0__Impl rule__AnyGenericElement__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__0__Impl_in_rule__AnyGenericElement__Group_4__04098);
            rule__AnyGenericElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__1_in_rule__AnyGenericElement__Group_4__04101);
            rule__AnyGenericElement__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_4__0"


    // $ANTLR start "rule__AnyGenericElement__Group_4__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2099:1: rule__AnyGenericElement__Group_4__0__Impl : ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 ) ) ;
    public final void rule__AnyGenericElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2103:1: ( ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2104:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2104:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2105:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_4_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2106:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2106:2: rule__AnyGenericElement__AnyGenericAttrAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_4_0_in_rule__AnyGenericElement__Group_4__0__Impl4128);
            rule__AnyGenericElement__AnyGenericAttrAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_4_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_4__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_4__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2116:1: rule__AnyGenericElement__Group_4__1 : rule__AnyGenericElement__Group_4__1__Impl ;
    public final void rule__AnyGenericElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2120:1: ( rule__AnyGenericElement__Group_4__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2121:2: rule__AnyGenericElement__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__1__Impl_in_rule__AnyGenericElement__Group_4__14158);
            rule__AnyGenericElement__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_4__1"


    // $ANTLR start "rule__AnyGenericElement__Group_4__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2127:1: rule__AnyGenericElement__Group_4__1__Impl : ( ( rule__AnyGenericElement__Group_4_1__0 )* ) ;
    public final void rule__AnyGenericElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2131:1: ( ( ( rule__AnyGenericElement__Group_4_1__0 )* ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2132:1: ( ( rule__AnyGenericElement__Group_4_1__0 )* )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2132:1: ( ( rule__AnyGenericElement__Group_4_1__0 )* )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2133:1: ( rule__AnyGenericElement__Group_4_1__0 )*
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_4_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2134:1: ( rule__AnyGenericElement__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2134:2: rule__AnyGenericElement__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4_1__0_in_rule__AnyGenericElement__Group_4__1__Impl4185);
            	    rule__AnyGenericElement__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAnyGenericElementAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_4__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_4_1__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2148:1: rule__AnyGenericElement__Group_4_1__0 : rule__AnyGenericElement__Group_4_1__0__Impl rule__AnyGenericElement__Group_4_1__1 ;
    public final void rule__AnyGenericElement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2152:1: ( rule__AnyGenericElement__Group_4_1__0__Impl rule__AnyGenericElement__Group_4_1__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2153:2: rule__AnyGenericElement__Group_4_1__0__Impl rule__AnyGenericElement__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4_1__0__Impl_in_rule__AnyGenericElement__Group_4_1__04220);
            rule__AnyGenericElement__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4_1__1_in_rule__AnyGenericElement__Group_4_1__04223);
            rule__AnyGenericElement__Group_4_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_4_1__0"


    // $ANTLR start "rule__AnyGenericElement__Group_4_1__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2160:1: rule__AnyGenericElement__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__AnyGenericElement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2164:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2165:1: ( ',' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2165:1: ( ',' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2166:1: ','
            {
             before(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_4_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__AnyGenericElement__Group_4_1__0__Impl4251); 
             after(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_4_1__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_4_1__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2179:1: rule__AnyGenericElement__Group_4_1__1 : rule__AnyGenericElement__Group_4_1__1__Impl ;
    public final void rule__AnyGenericElement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2183:1: ( rule__AnyGenericElement__Group_4_1__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2184:2: rule__AnyGenericElement__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4_1__1__Impl_in_rule__AnyGenericElement__Group_4_1__14282);
            rule__AnyGenericElement__Group_4_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_4_1__1"


    // $ANTLR start "rule__AnyGenericElement__Group_4_1__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2190:1: rule__AnyGenericElement__Group_4_1__1__Impl : ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 ) ) ;
    public final void rule__AnyGenericElement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2194:1: ( ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2195:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2195:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2196:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_4_1_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2197:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2197:2: rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1_in_rule__AnyGenericElement__Group_4_1__1__Impl4309);
            rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_4_1_1()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_4_1__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2211:1: rule__AnyGenericElement__Group_5__0 : rule__AnyGenericElement__Group_5__0__Impl rule__AnyGenericElement__Group_5__1 ;
    public final void rule__AnyGenericElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2215:1: ( rule__AnyGenericElement__Group_5__0__Impl rule__AnyGenericElement__Group_5__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2216:2: rule__AnyGenericElement__Group_5__0__Impl rule__AnyGenericElement__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__0__Impl_in_rule__AnyGenericElement__Group_5__04343);
            rule__AnyGenericElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__1_in_rule__AnyGenericElement__Group_5__04346);
            rule__AnyGenericElement__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_5__0"


    // $ANTLR start "rule__AnyGenericElement__Group_5__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2223:1: rule__AnyGenericElement__Group_5__0__Impl : ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_0 ) ) ;
    public final void rule__AnyGenericElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2227:1: ( ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2228:1: ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2228:1: ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2229:1: ( rule__AnyGenericElement__AnyGenericElementAssignment_5_0 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAssignment_5_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2230:1: ( rule__AnyGenericElement__AnyGenericElementAssignment_5_0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2230:2: rule__AnyGenericElement__AnyGenericElementAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__AnyGenericElementAssignment_5_0_in_rule__AnyGenericElement__Group_5__0__Impl4373);
            rule__AnyGenericElement__AnyGenericElementAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAssignment_5_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_5__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2240:1: rule__AnyGenericElement__Group_5__1 : rule__AnyGenericElement__Group_5__1__Impl ;
    public final void rule__AnyGenericElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2244:1: ( rule__AnyGenericElement__Group_5__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2245:2: rule__AnyGenericElement__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__1__Impl_in_rule__AnyGenericElement__Group_5__14403);
            rule__AnyGenericElement__Group_5__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_5__1"


    // $ANTLR start "rule__AnyGenericElement__Group_5__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2251:1: rule__AnyGenericElement__Group_5__1__Impl : ( ( rule__AnyGenericElement__Group_5_1__0 )* ) ;
    public final void rule__AnyGenericElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2255:1: ( ( ( rule__AnyGenericElement__Group_5_1__0 )* ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2256:1: ( ( rule__AnyGenericElement__Group_5_1__0 )* )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2256:1: ( ( rule__AnyGenericElement__Group_5_1__0 )* )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2257:1: ( rule__AnyGenericElement__Group_5_1__0 )*
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_5_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2258:1: ( rule__AnyGenericElement__Group_5_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2258:2: rule__AnyGenericElement__Group_5_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_1__0_in_rule__AnyGenericElement__Group_5__1__Impl4430);
            	    rule__AnyGenericElement__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAnyGenericElementAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_5__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5_1__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2272:1: rule__AnyGenericElement__Group_5_1__0 : rule__AnyGenericElement__Group_5_1__0__Impl rule__AnyGenericElement__Group_5_1__1 ;
    public final void rule__AnyGenericElement__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2276:1: ( rule__AnyGenericElement__Group_5_1__0__Impl rule__AnyGenericElement__Group_5_1__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2277:2: rule__AnyGenericElement__Group_5_1__0__Impl rule__AnyGenericElement__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_1__0__Impl_in_rule__AnyGenericElement__Group_5_1__04465);
            rule__AnyGenericElement__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_1__1_in_rule__AnyGenericElement__Group_5_1__04468);
            rule__AnyGenericElement__Group_5_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_5_1__0"


    // $ANTLR start "rule__AnyGenericElement__Group_5_1__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2284:1: rule__AnyGenericElement__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__AnyGenericElement__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2288:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2289:1: ( ',' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2289:1: ( ',' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2290:1: ','
            {
             before(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_5_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__AnyGenericElement__Group_5_1__0__Impl4496); 
             after(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_5_1__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5_1__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2303:1: rule__AnyGenericElement__Group_5_1__1 : rule__AnyGenericElement__Group_5_1__1__Impl ;
    public final void rule__AnyGenericElement__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2307:1: ( rule__AnyGenericElement__Group_5_1__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2308:2: rule__AnyGenericElement__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_1__1__Impl_in_rule__AnyGenericElement__Group_5_1__14527);
            rule__AnyGenericElement__Group_5_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericElement__Group_5_1__1"


    // $ANTLR start "rule__AnyGenericElement__Group_5_1__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2314:1: rule__AnyGenericElement__Group_5_1__1__Impl : ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 ) ) ;
    public final void rule__AnyGenericElement__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2318:1: ( ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2319:1: ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2319:1: ( ( rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2320:1: ( rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAssignment_5_1_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2321:1: ( rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2321:2: rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1_in_rule__AnyGenericElement__Group_5_1__1__Impl4554);
            rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAssignment_5_1_1()); 

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
    // $ANTLR end "rule__AnyGenericElement__Group_5_1__1__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2335:1: rule__AnyGenericAttribute__Group__0 : rule__AnyGenericAttribute__Group__0__Impl rule__AnyGenericAttribute__Group__1 ;
    public final void rule__AnyGenericAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2339:1: ( rule__AnyGenericAttribute__Group__0__Impl rule__AnyGenericAttribute__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2340:2: rule__AnyGenericAttribute__Group__0__Impl rule__AnyGenericAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__0__Impl_in_rule__AnyGenericAttribute__Group__04588);
            rule__AnyGenericAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__1_in_rule__AnyGenericAttribute__Group__04591);
            rule__AnyGenericAttribute__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericAttribute__Group__0"


    // $ANTLR start "rule__AnyGenericAttribute__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2347:1: rule__AnyGenericAttribute__Group__0__Impl : ( ( rule__AnyGenericAttribute__AttrNameAssignment_0 ) ) ;
    public final void rule__AnyGenericAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2351:1: ( ( ( rule__AnyGenericAttribute__AttrNameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2352:1: ( ( rule__AnyGenericAttribute__AttrNameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2352:1: ( ( rule__AnyGenericAttribute__AttrNameAssignment_0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2353:1: ( rule__AnyGenericAttribute__AttrNameAssignment_0 )
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrNameAssignment_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2354:1: ( rule__AnyGenericAttribute__AttrNameAssignment_0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2354:2: rule__AnyGenericAttribute__AttrNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__AttrNameAssignment_0_in_rule__AnyGenericAttribute__Group__0__Impl4618);
            rule__AnyGenericAttribute__AttrNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericAttributeAccess().getAttrNameAssignment_0()); 

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
    // $ANTLR end "rule__AnyGenericAttribute__Group__0__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2364:1: rule__AnyGenericAttribute__Group__1 : rule__AnyGenericAttribute__Group__1__Impl rule__AnyGenericAttribute__Group__2 ;
    public final void rule__AnyGenericAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2368:1: ( rule__AnyGenericAttribute__Group__1__Impl rule__AnyGenericAttribute__Group__2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2369:2: rule__AnyGenericAttribute__Group__1__Impl rule__AnyGenericAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__1__Impl_in_rule__AnyGenericAttribute__Group__14648);
            rule__AnyGenericAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__2_in_rule__AnyGenericAttribute__Group__14651);
            rule__AnyGenericAttribute__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericAttribute__Group__1"


    // $ANTLR start "rule__AnyGenericAttribute__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2376:1: rule__AnyGenericAttribute__Group__1__Impl : ( '=' ) ;
    public final void rule__AnyGenericAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2380:1: ( ( '=' ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2381:1: ( '=' )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2381:1: ( '=' )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2382:1: '='
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__AnyGenericAttribute__Group__1__Impl4679); 
             after(grammarAccess.getAnyGenericAttributeAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__AnyGenericAttribute__Group__1__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2395:1: rule__AnyGenericAttribute__Group__2 : rule__AnyGenericAttribute__Group__2__Impl ;
    public final void rule__AnyGenericAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2399:1: ( rule__AnyGenericAttribute__Group__2__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2400:2: rule__AnyGenericAttribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__2__Impl_in_rule__AnyGenericAttribute__Group__24710);
            rule__AnyGenericAttribute__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericAttribute__Group__2"


    // $ANTLR start "rule__AnyGenericAttribute__Group__2__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2406:1: rule__AnyGenericAttribute__Group__2__Impl : ( ( rule__AnyGenericAttribute__AttrValueAssignment_2 ) ) ;
    public final void rule__AnyGenericAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2410:1: ( ( ( rule__AnyGenericAttribute__AttrValueAssignment_2 ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2411:1: ( ( rule__AnyGenericAttribute__AttrValueAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2411:1: ( ( rule__AnyGenericAttribute__AttrValueAssignment_2 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2412:1: ( rule__AnyGenericAttribute__AttrValueAssignment_2 )
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrValueAssignment_2()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2413:1: ( rule__AnyGenericAttribute__AttrValueAssignment_2 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2413:2: rule__AnyGenericAttribute__AttrValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__AttrValueAssignment_2_in_rule__AnyGenericAttribute__Group__2__Impl4737);
            rule__AnyGenericAttribute__AttrValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericAttributeAccess().getAttrValueAssignment_2()); 

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
    // $ANTLR end "rule__AnyGenericAttribute__Group__2__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2429:1: rule__AnyGenericText__Group__0 : rule__AnyGenericText__Group__0__Impl rule__AnyGenericText__Group__1 ;
    public final void rule__AnyGenericText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2433:1: ( rule__AnyGenericText__Group__0__Impl rule__AnyGenericText__Group__1 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2434:2: rule__AnyGenericText__Group__0__Impl rule__AnyGenericText__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__0__Impl_in_rule__AnyGenericText__Group__04773);
            rule__AnyGenericText__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__1_in_rule__AnyGenericText__Group__04776);
            rule__AnyGenericText__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericText__Group__0"


    // $ANTLR start "rule__AnyGenericText__Group__0__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2441:1: rule__AnyGenericText__Group__0__Impl : ( () ) ;
    public final void rule__AnyGenericText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2445:1: ( ( () ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2446:1: ( () )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2446:1: ( () )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2447:1: ()
            {
             before(grammarAccess.getAnyGenericTextAccess().getAnyGenericTextAction_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2448:1: ()
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2450:1: 
            {
            }

             after(grammarAccess.getAnyGenericTextAccess().getAnyGenericTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__0__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2460:1: rule__AnyGenericText__Group__1 : rule__AnyGenericText__Group__1__Impl ;
    public final void rule__AnyGenericText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2464:1: ( rule__AnyGenericText__Group__1__Impl )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2465:2: rule__AnyGenericText__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__1__Impl_in_rule__AnyGenericText__Group__14834);
            rule__AnyGenericText__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AnyGenericText__Group__1"


    // $ANTLR start "rule__AnyGenericText__Group__1__Impl"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2471:1: rule__AnyGenericText__Group__1__Impl : ( ( rule__AnyGenericText__TextValueAssignment_1 )? ) ;
    public final void rule__AnyGenericText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2475:1: ( ( ( rule__AnyGenericText__TextValueAssignment_1 )? ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2476:1: ( ( rule__AnyGenericText__TextValueAssignment_1 )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2476:1: ( ( rule__AnyGenericText__TextValueAssignment_1 )? )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2477:1: ( rule__AnyGenericText__TextValueAssignment_1 )?
            {
             before(grammarAccess.getAnyGenericTextAccess().getTextValueAssignment_1()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2478:1: ( rule__AnyGenericText__TextValueAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2478:2: rule__AnyGenericText__TextValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__TextValueAssignment_1_in_rule__AnyGenericText__Group__1__Impl4861);
                    rule__AnyGenericText__TextValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericTextAccess().getTextValueAssignment_1()); 

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
    // $ANTLR end "rule__AnyGenericText__Group__1__Impl"


    // $ANTLR start "rule__LibraryType__BookAssignment_3_0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2493:1: rule__LibraryType__BookAssignment_3_0 : ( ruleBookType ) ;
    public final void rule__LibraryType__BookAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2497:1: ( ( ruleBookType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2498:1: ( ruleBookType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2498:1: ( ruleBookType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2499:1: ruleBookType
            {
             before(grammarAccess.getLibraryTypeAccess().getBookBookTypeParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookType_in_rule__LibraryType__BookAssignment_3_04901);
            ruleBookType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeAccess().getBookBookTypeParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__LibraryType__BookAssignment_3_0"


    // $ANTLR start "rule__LibraryType__BookAssignment_3_1_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2508:1: rule__LibraryType__BookAssignment_3_1_1 : ( ruleBookType ) ;
    public final void rule__LibraryType__BookAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2512:1: ( ( ruleBookType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2513:1: ( ruleBookType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2513:1: ( ruleBookType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2514:1: ruleBookType
            {
             before(grammarAccess.getLibraryTypeAccess().getBookBookTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookType_in_rule__LibraryType__BookAssignment_3_1_14932);
            ruleBookType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeAccess().getBookBookTypeParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__LibraryType__BookAssignment_3_1_1"


    // $ANTLR start "rule__LibraryType__CustomerAssignment_4_0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2523:1: rule__LibraryType__CustomerAssignment_4_0 : ( ruleCustomerType ) ;
    public final void rule__LibraryType__CustomerAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2527:1: ( ( ruleCustomerType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2528:1: ( ruleCustomerType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2528:1: ( ruleCustomerType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2529:1: ruleCustomerType
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_4_04963);
            ruleCustomerType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__LibraryType__CustomerAssignment_4_0"


    // $ANTLR start "rule__LibraryType__CustomerAssignment_4_1_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2538:1: rule__LibraryType__CustomerAssignment_4_1_1 : ( ruleCustomerType ) ;
    public final void rule__LibraryType__CustomerAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2542:1: ( ( ruleCustomerType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2543:1: ( ruleCustomerType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2543:1: ( ruleCustomerType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2544:1: ruleCustomerType
            {
             before(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_4_1_14994);
            ruleCustomerType();

            state._fsp--;

             after(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__LibraryType__CustomerAssignment_4_1_1"


    // $ANTLR start "rule__BookType__NameAssignment_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2553:1: rule__BookType__NameAssignment_1 : ( ruleID0 ) ;
    public final void rule__BookType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2557:1: ( ( ruleID0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2558:1: ( ruleID0 )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2558:1: ( ruleID0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2559:1: ruleID0
            {
             before(grammarAccess.getBookTypeAccess().getNameID0ParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__BookType__NameAssignment_15025);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getBookTypeAccess().getNameID0ParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BookType__NameAssignment_1"


    // $ANTLR start "rule__BookType__TitleAssignment_4"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2568:1: rule__BookType__TitleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__BookType__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2572:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2573:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2573:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2574:1: RULE_STRING
            {
             before(grammarAccess.getBookTypeAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__BookType__TitleAssignment_45056); 
             after(grammarAccess.getBookTypeAccess().getTitleSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__BookType__TitleAssignment_4"


    // $ANTLR start "rule__BookType__AuthorAssignment_6"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2583:1: rule__BookType__AuthorAssignment_6 : ( ruleNameType ) ;
    public final void rule__BookType__AuthorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2587:1: ( ( ruleNameType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2588:1: ( ruleNameType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2588:1: ( ruleNameType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2589:1: ruleNameType
            {
             before(grammarAccess.getBookTypeAccess().getAuthorNameTypeParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNameType_in_rule__BookType__AuthorAssignment_65087);
            ruleNameType();

            state._fsp--;

             after(grammarAccess.getBookTypeAccess().getAuthorNameTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__BookType__AuthorAssignment_6"


    // $ANTLR start "rule__BookType__PagesAssignment_8"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2598:1: rule__BookType__PagesAssignment_8 : ( ruleInt0 ) ;
    public final void rule__BookType__PagesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2602:1: ( ( ruleInt0 ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2603:1: ( ruleInt0 )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2603:1: ( ruleInt0 )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2604:1: ruleInt0
            {
             before(grammarAccess.getBookTypeAccess().getPagesInt0ParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rule__BookType__PagesAssignment_85118);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getBookTypeAccess().getPagesInt0ParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__BookType__PagesAssignment_8"


    // $ANTLR start "rule__BookType__IsbnAssignment_10"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2613:1: rule__BookType__IsbnAssignment_10 : ( ruleIsbnType ) ;
    public final void rule__BookType__IsbnAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2617:1: ( ( ruleIsbnType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2618:1: ( ruleIsbnType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2618:1: ( ruleIsbnType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2619:1: ruleIsbnType
            {
             before(grammarAccess.getBookTypeAccess().getIsbnIsbnTypeParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsbnType_in_rule__BookType__IsbnAssignment_105149);
            ruleIsbnType();

            state._fsp--;

             after(grammarAccess.getBookTypeAccess().getIsbnIsbnTypeParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__BookType__IsbnAssignment_10"


    // $ANTLR start "rule__BookType__BookInfoAssignment_11"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2628:1: rule__BookType__BookInfoAssignment_11 : ( ruleBookInfoType ) ;
    public final void rule__BookType__BookInfoAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2632:1: ( ( ruleBookInfoType ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2633:1: ( ruleBookInfoType )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2633:1: ( ruleBookInfoType )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2634:1: ruleBookInfoType
            {
             before(grammarAccess.getBookTypeAccess().getBookInfoBookInfoTypeParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookInfoType_in_rule__BookType__BookInfoAssignment_115180);
            ruleBookInfoType();

            state._fsp--;

             after(grammarAccess.getBookTypeAccess().getBookInfoBookInfoTypeParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__BookType__BookInfoAssignment_11"


    // $ANTLR start "rule__CustomerType__FirstNameAssignment_3"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2643:1: rule__CustomerType__FirstNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CustomerType__FirstNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2647:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2648:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2648:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2649:1: RULE_STRING
            {
             before(grammarAccess.getCustomerTypeAccess().getFirstNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__CustomerType__FirstNameAssignment_35211); 
             after(grammarAccess.getCustomerTypeAccess().getFirstNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__CustomerType__FirstNameAssignment_3"


    // $ANTLR start "rule__CustomerType__LastNameAssignment_5"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2658:1: rule__CustomerType__LastNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__CustomerType__LastNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2662:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2663:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2663:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2664:1: RULE_STRING
            {
             before(grammarAccess.getCustomerTypeAccess().getLastNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__CustomerType__LastNameAssignment_55242); 
             after(grammarAccess.getCustomerTypeAccess().getLastNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__CustomerType__LastNameAssignment_5"


    // $ANTLR start "rule__CustomerType__BorrowedBookIdAssignment_6_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2673:1: rule__CustomerType__BorrowedBookIdAssignment_6_1 : ( ( ruleIDREF ) ) ;
    public final void rule__CustomerType__BorrowedBookIdAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2677:1: ( ( ( ruleIDREF ) ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2678:1: ( ( ruleIDREF ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2678:1: ( ( ruleIDREF ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2679:1: ( ruleIDREF )
            {
             before(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdEObjectCrossReference_6_1_0()); 
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2680:1: ( ruleIDREF )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2681:1: ruleIDREF
            {
             before(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdEObjectIDREFParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_rule__CustomerType__BorrowedBookIdAssignment_6_15277);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdEObjectIDREFParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdEObjectCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__CustomerType__BorrowedBookIdAssignment_6_1"


    // $ANTLR start "rule__BookInfoType__AnyAssignment_2_0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2692:1: rule__BookInfoType__AnyAssignment_2_0 : ( ruleAnyGenericElement ) ;
    public final void rule__BookInfoType__AnyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2696:1: ( ( ruleAnyGenericElement ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2697:1: ( ruleAnyGenericElement )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2697:1: ( ruleAnyGenericElement )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2698:1: ruleAnyGenericElement
            {
             before(grammarAccess.getBookInfoTypeAccess().getAnyAnyGenericElementParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__BookInfoType__AnyAssignment_2_05312);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getBookInfoTypeAccess().getAnyAnyGenericElementParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__BookInfoType__AnyAssignment_2_0"


    // $ANTLR start "rule__BookInfoType__AnyAssignment_2_1_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2707:1: rule__BookInfoType__AnyAssignment_2_1_1 : ( ruleAnyGenericElement ) ;
    public final void rule__BookInfoType__AnyAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2711:1: ( ( ruleAnyGenericElement ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2712:1: ( ruleAnyGenericElement )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2712:1: ( ruleAnyGenericElement )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2713:1: ruleAnyGenericElement
            {
             before(grammarAccess.getBookInfoTypeAccess().getAnyAnyGenericElementParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__BookInfoType__AnyAssignment_2_1_15343);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getBookInfoTypeAccess().getAnyAnyGenericElementParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__BookInfoType__AnyAssignment_2_1_1"


    // $ANTLR start "rule__AnyGenericElement__ElemNameAssignment_2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2722:1: rule__AnyGenericElement__ElemNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AnyGenericElement__ElemNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2726:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2727:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2727:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2728:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemNameAssignment_25374); 
             after(grammarAccess.getAnyGenericElementAccess().getElemNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__ElemNameAssignment_2"


    // $ANTLR start "rule__AnyGenericElement__ElemValueAssignment_3_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2737:1: rule__AnyGenericElement__ElemValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AnyGenericElement__ElemValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2741:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2742:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2742:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2743:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemValueAssignment_3_15405); 
             after(grammarAccess.getAnyGenericElementAccess().getElemValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__ElemValueAssignment_3_1"


    // $ANTLR start "rule__AnyGenericElement__AnyGenericAttrAssignment_4_0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2752:1: rule__AnyGenericElement__AnyGenericAttrAssignment_4_0 : ( ruleAnyGenericAttribute ) ;
    public final void rule__AnyGenericElement__AnyGenericAttrAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2756:1: ( ( ruleAnyGenericAttribute ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2757:1: ( ruleAnyGenericAttribute )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2757:1: ( ruleAnyGenericAttribute )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2758:1: ruleAnyGenericAttribute
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_4_05436);
            ruleAnyGenericAttribute();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__AnyGenericAttrAssignment_4_0"


    // $ANTLR start "rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2767:1: rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1 : ( ruleAnyGenericAttribute ) ;
    public final void rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2771:1: ( ( ruleAnyGenericAttribute ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2772:1: ( ruleAnyGenericAttribute )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2772:1: ( ruleAnyGenericAttribute )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2773:1: ruleAnyGenericAttribute
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_15467);
            ruleAnyGenericAttribute();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1"


    // $ANTLR start "rule__AnyGenericElement__AnyGenericElementAssignment_5_0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2782:1: rule__AnyGenericElement__AnyGenericElementAssignment_5_0 : ( ruleAnyGenericElement ) ;
    public final void rule__AnyGenericElement__AnyGenericElementAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2786:1: ( ( ruleAnyGenericElement ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2787:1: ( ruleAnyGenericElement )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2787:1: ( ruleAnyGenericElement )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2788:1: ruleAnyGenericElement
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAnyGenericElementParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__AnyGenericElementAssignment_5_05498);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAnyGenericElementParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__AnyGenericElementAssignment_5_0"


    // $ANTLR start "rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2797:1: rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1 : ( ruleAnyGenericElement ) ;
    public final void rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2801:1: ( ( ruleAnyGenericElement ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2802:1: ( ruleAnyGenericElement )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2802:1: ( ruleAnyGenericElement )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2803:1: ruleAnyGenericElement
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAnyGenericElementParserRuleCall_5_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__AnyGenericElementAssignment_5_1_15529);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAnyGenericElementParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1"


    // $ANTLR start "rule__AnyGenericAttribute__AttrNameAssignment_0"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2812:1: rule__AnyGenericAttribute__AttrNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AnyGenericAttribute__AttrNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2816:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2817:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2817:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2818:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrNameAssignment_05560); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AnyGenericAttribute__AttrNameAssignment_0"


    // $ANTLR start "rule__AnyGenericAttribute__AttrValueAssignment_2"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2827:1: rule__AnyGenericAttribute__AttrValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AnyGenericAttribute__AttrValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2831:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2832:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2832:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2833:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrValueAssignment_25591); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__AnyGenericAttribute__AttrValueAssignment_2"


    // $ANTLR start "rule__AnyGenericText__TextValueAssignment_1"
    // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2842:1: rule__AnyGenericText__TextValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AnyGenericText__TextValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2846:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2847:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2847:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3.ui/src-gen/at/ac/tuwien/big/xmltext/library3/ui/contentassist/antlr/internal/InternalLibrary3.g:2848:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericTextAccess().getTextValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericText__TextValueAssignment_15622); 
             after(grammarAccess.getAnyGenericTextAccess().getTextValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnyGenericText__TextValueAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLibraryType_in_entryRuleLibraryType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLibraryType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__0_in_ruleLibraryType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookType_in_entryRuleBookType123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBookType130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__0_in_ruleBookType156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_entryRuleCustomerType183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerType190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__0_in_ruleCustomerType216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameType_in_entryRuleNameType302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameType309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNameType335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt0361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt0368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInt0394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsbnType_in_entryRuleIsbnType420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsbnType427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIsbnType453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookInfoType_in_entryRuleBookInfoType479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBookInfoType486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group__0_in_ruleBookInfoType512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericElement546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__0_in_ruleAnyGenericElement572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericAttribute606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__0_in_ruleAnyGenericAttribute632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericText666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__0_in_ruleAnyGenericText692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIDREF754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__0__Impl_in_rule__LibraryType__Group__0790 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__1_in_rule__LibraryType__Group__0793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__1__Impl_in_rule__LibraryType__Group__1851 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__2_in_rule__LibraryType__Group__1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LibraryType__Group__1__Impl882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__2__Impl_in_rule__LibraryType__Group__2913 = new BitSet(new long[]{0x0000000000214000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__3_in_rule__LibraryType__Group__2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LibraryType__Group__2__Impl944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__3__Impl_in_rule__LibraryType__Group__3975 = new BitSet(new long[]{0x0000000000214000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__4_in_rule__LibraryType__Group__3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__0_in_rule__LibraryType__Group__3__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__4__Impl_in_rule__LibraryType__Group__41036 = new BitSet(new long[]{0x0000000000214000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__5_in_rule__LibraryType__Group__41039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4__0_in_rule__LibraryType__Group__4__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group__5__Impl_in_rule__LibraryType__Group__51097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LibraryType__Group__5__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__0__Impl_in_rule__LibraryType__Group_3__01168 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__1_in_rule__LibraryType__Group_3__01171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__BookAssignment_3_0_in_rule__LibraryType__Group_3__0__Impl1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3__1__Impl_in_rule__LibraryType__Group_3__11228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_1__0_in_rule__LibraryType__Group_3__1__Impl1255 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_1__0__Impl_in_rule__LibraryType__Group_3_1__01290 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_1__1_in_rule__LibraryType__Group_3_1__01293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__LibraryType__Group_3_1__0__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_3_1__1__Impl_in_rule__LibraryType__Group_3_1__11352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__BookAssignment_3_1_1_in_rule__LibraryType__Group_3_1__1__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4__0__Impl_in_rule__LibraryType__Group_4__01413 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4__1_in_rule__LibraryType__Group_4__01416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__CustomerAssignment_4_0_in_rule__LibraryType__Group_4__0__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4__1__Impl_in_rule__LibraryType__Group_4__11473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4_1__0_in_rule__LibraryType__Group_4__1__Impl1500 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4_1__0__Impl_in_rule__LibraryType__Group_4_1__01535 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4_1__1_in_rule__LibraryType__Group_4_1__01538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__LibraryType__Group_4_1__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__Group_4_1__1__Impl_in_rule__LibraryType__Group_4_1__11597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LibraryType__CustomerAssignment_4_1_1_in_rule__LibraryType__Group_4_1__1__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__0__Impl_in_rule__BookType__Group__01658 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BookType__Group__1_in_rule__BookType__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BookType__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__1__Impl_in_rule__BookType__Group__11720 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BookType__Group__2_in_rule__BookType__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__NameAssignment_1_in_rule__BookType__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__2__Impl_in_rule__BookType__Group__21780 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__BookType__Group__3_in_rule__BookType__Group__21783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BookType__Group__2__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__3__Impl_in_rule__BookType__Group__31842 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BookType__Group__4_in_rule__BookType__Group__31845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BookType__Group__3__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__4__Impl_in_rule__BookType__Group__41904 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BookType__Group__5_in_rule__BookType__Group__41907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__TitleAssignment_4_in_rule__BookType__Group__4__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__5__Impl_in_rule__BookType__Group__51964 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BookType__Group__6_in_rule__BookType__Group__51967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BookType__Group__5__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__6__Impl_in_rule__BookType__Group__62026 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__BookType__Group__7_in_rule__BookType__Group__62029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__AuthorAssignment_6_in_rule__BookType__Group__6__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__7__Impl_in_rule__BookType__Group__72086 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__BookType__Group__8_in_rule__BookType__Group__72089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BookType__Group__7__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__8__Impl_in_rule__BookType__Group__82148 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__BookType__Group__9_in_rule__BookType__Group__82151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__PagesAssignment_8_in_rule__BookType__Group__8__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__9__Impl_in_rule__BookType__Group__92208 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BookType__Group__10_in_rule__BookType__Group__92211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BookType__Group__9__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__10__Impl_in_rule__BookType__Group__102270 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__BookType__Group__11_in_rule__BookType__Group__102273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__IsbnAssignment_10_in_rule__BookType__Group__10__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__11__Impl_in_rule__BookType__Group__112330 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__BookType__Group__12_in_rule__BookType__Group__112333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__BookInfoAssignment_11_in_rule__BookType__Group__11__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookType__Group__12__Impl_in_rule__BookType__Group__122391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BookType__Group__12__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__0__Impl_in_rule__CustomerType__Group__02476 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__1_in_rule__CustomerType__Group__02479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CustomerType__Group__0__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__1__Impl_in_rule__CustomerType__Group__12538 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__2_in_rule__CustomerType__Group__12541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CustomerType__Group__1__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__2__Impl_in_rule__CustomerType__Group__22600 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__3_in_rule__CustomerType__Group__22603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CustomerType__Group__2__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__3__Impl_in_rule__CustomerType__Group__32662 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__4_in_rule__CustomerType__Group__32665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__FirstNameAssignment_3_in_rule__CustomerType__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__4__Impl_in_rule__CustomerType__Group__42722 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__5_in_rule__CustomerType__Group__42725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CustomerType__Group__4__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__5__Impl_in_rule__CustomerType__Group__52784 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__6_in_rule__CustomerType__Group__52787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__LastNameAssignment_5_in_rule__CustomerType__Group__5__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__6__Impl_in_rule__CustomerType__Group__62844 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__7_in_rule__CustomerType__Group__62847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_6__0_in_rule__CustomerType__Group__6__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group__7__Impl_in_rule__CustomerType__Group__72905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CustomerType__Group__7__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_6__0__Impl_in_rule__CustomerType__Group_6__02980 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_6__1_in_rule__CustomerType__Group_6__02983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CustomerType__Group_6__0__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__Group_6__1__Impl_in_rule__CustomerType__Group_6__13042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomerType__BorrowedBookIdAssignment_6_1_in_rule__CustomerType__Group_6__1__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group__0__Impl_in_rule__BookInfoType__Group__03103 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group__1_in_rule__BookInfoType__Group__03106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group__1__Impl_in_rule__BookInfoType__Group__13164 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group__2_in_rule__BookInfoType__Group__13167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BookInfoType__Group__1__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group__2__Impl_in_rule__BookInfoType__Group__23226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2__0_in_rule__BookInfoType__Group__2__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2__0__Impl_in_rule__BookInfoType__Group_2__03290 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2__1_in_rule__BookInfoType__Group_2__03293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__AnyAssignment_2_0_in_rule__BookInfoType__Group_2__0__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2__1__Impl_in_rule__BookInfoType__Group_2__13350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2_1__0_in_rule__BookInfoType__Group_2__1__Impl3377 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2_1__0__Impl_in_rule__BookInfoType__Group_2_1__03412 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2_1__1_in_rule__BookInfoType__Group_2_1__03415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BookInfoType__Group_2_1__0__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__Group_2_1__1__Impl_in_rule__BookInfoType__Group_2_1__13474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BookInfoType__AnyAssignment_2_1_1_in_rule__BookInfoType__Group_2_1__1__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__0__Impl_in_rule__AnyGenericElement__Group__03535 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__1_in_rule__AnyGenericElement__Group__03538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__1__Impl_in_rule__AnyGenericElement__Group__13596 = new BitSet(new long[]{0x0000000004006020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__2_in_rule__AnyGenericElement__Group__13599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AnyGenericElement__Group__1__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__2__Impl_in_rule__AnyGenericElement__Group__23658 = new BitSet(new long[]{0x0000000004006020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__3_in_rule__AnyGenericElement__Group__23661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__ElemNameAssignment_2_in_rule__AnyGenericElement__Group__2__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__3__Impl_in_rule__AnyGenericElement__Group__33719 = new BitSet(new long[]{0x0000000004006020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__4_in_rule__AnyGenericElement__Group__33722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__0_in_rule__AnyGenericElement__Group__3__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__4__Impl_in_rule__AnyGenericElement__Group__43780 = new BitSet(new long[]{0x0000000004006020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__5_in_rule__AnyGenericElement__Group__43783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__0_in_rule__AnyGenericElement__Group__4__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__5__Impl_in_rule__AnyGenericElement__Group__53841 = new BitSet(new long[]{0x0000000004006020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__6_in_rule__AnyGenericElement__Group__53844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__0_in_rule__AnyGenericElement__Group__5__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__6__Impl_in_rule__AnyGenericElement__Group__63902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnyGenericElement__Group__6__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__0__Impl_in_rule__AnyGenericElement__Group_3__03975 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__1_in_rule__AnyGenericElement__Group_3__03978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AnyGenericElement__Group_3__0__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__1__Impl_in_rule__AnyGenericElement__Group_3__14037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__ElemValueAssignment_3_1_in_rule__AnyGenericElement__Group_3__1__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__0__Impl_in_rule__AnyGenericElement__Group_4__04098 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__1_in_rule__AnyGenericElement__Group_4__04101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_4_0_in_rule__AnyGenericElement__Group_4__0__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__1__Impl_in_rule__AnyGenericElement__Group_4__14158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4_1__0_in_rule__AnyGenericElement__Group_4__1__Impl4185 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4_1__0__Impl_in_rule__AnyGenericElement__Group_4_1__04220 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4_1__1_in_rule__AnyGenericElement__Group_4_1__04223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AnyGenericElement__Group_4_1__0__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4_1__1__Impl_in_rule__AnyGenericElement__Group_4_1__14282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_1_in_rule__AnyGenericElement__Group_4_1__1__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__0__Impl_in_rule__AnyGenericElement__Group_5__04343 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__1_in_rule__AnyGenericElement__Group_5__04346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__AnyGenericElementAssignment_5_0_in_rule__AnyGenericElement__Group_5__0__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__1__Impl_in_rule__AnyGenericElement__Group_5__14403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_1__0_in_rule__AnyGenericElement__Group_5__1__Impl4430 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_1__0__Impl_in_rule__AnyGenericElement__Group_5_1__04465 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_1__1_in_rule__AnyGenericElement__Group_5_1__04468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AnyGenericElement__Group_5_1__0__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_1__1__Impl_in_rule__AnyGenericElement__Group_5_1__14527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__AnyGenericElementAssignment_5_1_1_in_rule__AnyGenericElement__Group_5_1__1__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__0__Impl_in_rule__AnyGenericAttribute__Group__04588 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__1_in_rule__AnyGenericAttribute__Group__04591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__AttrNameAssignment_0_in_rule__AnyGenericAttribute__Group__0__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__1__Impl_in_rule__AnyGenericAttribute__Group__14648 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__2_in_rule__AnyGenericAttribute__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__AnyGenericAttribute__Group__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__2__Impl_in_rule__AnyGenericAttribute__Group__24710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__AttrValueAssignment_2_in_rule__AnyGenericAttribute__Group__2__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__0__Impl_in_rule__AnyGenericText__Group__04773 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__1_in_rule__AnyGenericText__Group__04776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__1__Impl_in_rule__AnyGenericText__Group__14834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__TextValueAssignment_1_in_rule__AnyGenericText__Group__1__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookType_in_rule__LibraryType__BookAssignment_3_04901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookType_in_rule__LibraryType__BookAssignment_3_1_14932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_4_04963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_rule__LibraryType__CustomerAssignment_4_1_14994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__BookType__NameAssignment_15025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__BookType__TitleAssignment_45056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameType_in_rule__BookType__AuthorAssignment_65087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_rule__BookType__PagesAssignment_85118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsbnType_in_rule__BookType__IsbnAssignment_105149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookInfoType_in_rule__BookType__BookInfoAssignment_115180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomerType__FirstNameAssignment_35211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomerType__LastNameAssignment_55242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_rule__CustomerType__BorrowedBookIdAssignment_6_15277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__BookInfoType__AnyAssignment_2_05312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__BookInfoType__AnyAssignment_2_1_15343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemNameAssignment_25374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemValueAssignment_3_15405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_4_05436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_4_1_15467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__AnyGenericElementAssignment_5_05498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__AnyGenericElementAssignment_5_1_15529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrNameAssignment_05560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrValueAssignment_25591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericText__TextValueAssignment_15622 = new BitSet(new long[]{0x0000000000000002L});
    }


}