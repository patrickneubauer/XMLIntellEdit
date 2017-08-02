package org.xtext.example.mydsl.referencesuntyped.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.referencesuntyped.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrdersType'", "'{'", "'order1'", "'}'", "'order2'", "'orderReference1'", "'orderReference2'", "','", "'OrderDetail1'", "'customerAddress'", "'customerContact'", "'customerName'", "'OrderDetail2'", "'OrderRef1'", "'orderDetail1'", "'OrderRef2'", "'orderDetail2'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleOrdersType"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleOrdersType : ruleOrdersType EOF ;
    public final void entryRuleOrdersType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleOrdersType EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleOrdersType EOF
            {
             before(grammarAccess.getOrdersTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrdersType_in_entryRuleOrdersType61);
            ruleOrdersType();

            state._fsp--;

             after(grammarAccess.getOrdersTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrdersType68); 

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
    // $ANTLR end "entryRuleOrdersType"


    // $ANTLR start "ruleOrdersType"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleOrdersType : ( ( rule__OrdersType__Group__0 ) ) ;
    public final void ruleOrdersType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__OrdersType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__OrdersType__Group__0 )
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__OrdersType__Group__0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__OrdersType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__0_in_ruleOrdersType94);
            rule__OrdersType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleOrdersType"


    // $ANTLR start "entryRuleOrderDetail1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleOrderDetail1 : ruleOrderDetail1 EOF ;
    public final void entryRuleOrderDetail1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleOrderDetail1 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleOrderDetail1 EOF
            {
             before(grammarAccess.getOrderDetail1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_entryRuleOrderDetail1121);
            ruleOrderDetail1();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail1128); 

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
    // $ANTLR end "entryRuleOrderDetail1"


    // $ANTLR start "ruleOrderDetail1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleOrderDetail1 : ( ( rule__OrderDetail1__Group__0 ) ) ;
    public final void ruleOrderDetail1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__OrderDetail1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail1__Group__0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__OrderDetail1__Group__0 )
            {
             before(grammarAccess.getOrderDetail1Access().getGroup()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__OrderDetail1__Group__0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__OrderDetail1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__0_in_ruleOrderDetail1154);
            rule__OrderDetail1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getGroup()); 

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
    // $ANTLR end "ruleOrderDetail1"


    // $ANTLR start "entryRuleOrderDetail2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleOrderDetail2 : ruleOrderDetail2 EOF ;
    public final void entryRuleOrderDetail2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleOrderDetail2 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleOrderDetail2 EOF
            {
             before(grammarAccess.getOrderDetail2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_entryRuleOrderDetail2181);
            ruleOrderDetail2();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail2188); 

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
    // $ANTLR end "entryRuleOrderDetail2"


    // $ANTLR start "ruleOrderDetail2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleOrderDetail2 : ( ( rule__OrderDetail2__Group__0 ) ) ;
    public final void ruleOrderDetail2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__OrderDetail2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__OrderDetail2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__OrderDetail2__Group__0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__OrderDetail2__Group__0 )
            {
             before(grammarAccess.getOrderDetail2Access().getGroup()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__OrderDetail2__Group__0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__OrderDetail2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__0_in_ruleOrderDetail2214);
            rule__OrderDetail2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getGroup()); 

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
    // $ANTLR end "ruleOrderDetail2"


    // $ANTLR start "entryRuleOrderRef1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleOrderRef1 : ruleOrderRef1 EOF ;
    public final void entryRuleOrderRef1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleOrderRef1 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleOrderRef1 EOF
            {
             before(grammarAccess.getOrderRef1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_entryRuleOrderRef1241);
            ruleOrderRef1();

            state._fsp--;

             after(grammarAccess.getOrderRef1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderRef1248); 

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
    // $ANTLR end "entryRuleOrderRef1"


    // $ANTLR start "ruleOrderRef1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleOrderRef1 : ( ( rule__OrderRef1__Group__0 ) ) ;
    public final void ruleOrderRef1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__OrderRef1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__OrderRef1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__OrderRef1__Group__0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__OrderRef1__Group__0 )
            {
             before(grammarAccess.getOrderRef1Access().getGroup()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__OrderRef1__Group__0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__OrderRef1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__0_in_ruleOrderRef1274);
            rule__OrderRef1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef1Access().getGroup()); 

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
    // $ANTLR end "ruleOrderRef1"


    // $ANTLR start "entryRuleOrderRef2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleOrderRef2 : ruleOrderRef2 EOF ;
    public final void entryRuleOrderRef2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleOrderRef2 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleOrderRef2 EOF
            {
             before(grammarAccess.getOrderRef2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_entryRuleOrderRef2301);
            ruleOrderRef2();

            state._fsp--;

             after(grammarAccess.getOrderRef2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderRef2308); 

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
    // $ANTLR end "entryRuleOrderRef2"


    // $ANTLR start "ruleOrderRef2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleOrderRef2 : ( ( rule__OrderRef2__Group__0 ) ) ;
    public final void ruleOrderRef2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__OrderRef2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__OrderRef2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__OrderRef2__Group__0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__OrderRef2__Group__0 )
            {
             before(grammarAccess.getOrderRef2Access().getGroup()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__OrderRef2__Group__0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__OrderRef2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__0_in_ruleOrderRef2334);
            rule__OrderRef2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef2Access().getGroup()); 

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
    // $ANTLR end "ruleOrderRef2"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0361);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0368); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0394); 
             after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleID0 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0420);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0427); 

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
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleID0 : ( RULE_ID ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: RULE_ID
            {
             before(grammarAccess.getID0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0453); 
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


    // $ANTLR start "entryRuleIDREF"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: entryRuleIDREF : ruleIDREF EOF ;
    public final void entryRuleIDREF() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ( ruleIDREF EOF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: ruleIDREF EOF
            {
             before(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF481);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getIDREFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF488); 

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
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: ruleIDREF : ( RULE_ID ) ;
    public final void ruleIDREF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:271:2: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: RULE_ID
            {
             before(grammarAccess.getIDREFAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIDREF514); 
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


    // $ANTLR start "rule__OrdersType__Group__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: rule__OrdersType__Group__0 : rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 ;
    public final void rule__OrdersType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:293:2: rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0547);
            rule__OrdersType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0550);
            rule__OrdersType__Group__1();

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
    // $ANTLR end "rule__OrdersType__Group__0"


    // $ANTLR start "rule__OrdersType__Group__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: rule__OrdersType__Group__0__Impl : ( 'OrdersType' ) ;
    public final void rule__OrdersType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( 'OrdersType' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( 'OrdersType' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( 'OrdersType' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: 'OrdersType'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__OrdersType__Group__0__Impl578); 
             after(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); 

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
    // $ANTLR end "rule__OrdersType__Group__0__Impl"


    // $ANTLR start "rule__OrdersType__Group__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: rule__OrdersType__Group__1 : rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 ;
    public final void rule__OrdersType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:324:2: rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1609);
            rule__OrdersType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1612);
            rule__OrdersType__Group__2();

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
    // $ANTLR end "rule__OrdersType__Group__1"


    // $ANTLR start "rule__OrdersType__Group__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:331:1: rule__OrdersType__Group__1__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__1__Impl640); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__OrdersType__Group__1__Impl"


    // $ANTLR start "rule__OrdersType__Group__2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:350:1: rule__OrdersType__Group__2 : rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 ;
    public final void rule__OrdersType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:355:2: rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2671);
            rule__OrdersType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2674);
            rule__OrdersType__Group__3();

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
    // $ANTLR end "rule__OrdersType__Group__2"


    // $ANTLR start "rule__OrdersType__Group__2__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: rule__OrdersType__Group__2__Impl : ( 'order1' ) ;
    public final void rule__OrdersType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:366:1: ( ( 'order1' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: ( 'order1' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: ( 'order1' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: 'order1'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Keyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__2__Impl702); 
             after(grammarAccess.getOrdersTypeAccess().getOrder1Keyword_2()); 

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
    // $ANTLR end "rule__OrdersType__Group__2__Impl"


    // $ANTLR start "rule__OrdersType__Group__3"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:381:1: rule__OrdersType__Group__3 : rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 ;
    public final void rule__OrdersType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:386:2: rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__3733);
            rule__OrdersType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__3736);
            rule__OrdersType__Group__4();

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
    // $ANTLR end "rule__OrdersType__Group__3"


    // $ANTLR start "rule__OrdersType__Group__3__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: rule__OrdersType__Group__3__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__3__Impl764); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__OrdersType__Group__3__Impl"


    // $ANTLR start "rule__OrdersType__Group__4"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: rule__OrdersType__Group__4 : rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 ;
    public final void rule__OrdersType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:416:1: ( rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:417:2: rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__4795);
            rule__OrdersType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__4798);
            rule__OrdersType__Group__5();

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
    // $ANTLR end "rule__OrdersType__Group__4"


    // $ANTLR start "rule__OrdersType__Group__4__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: rule__OrdersType__Group__4__Impl : ( ( rule__OrdersType__Order1Assignment_4 ) ) ;
    public final void rule__OrdersType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ( ( rule__OrdersType__Order1Assignment_4 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ( ( rule__OrdersType__Order1Assignment_4 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ( ( rule__OrdersType__Order1Assignment_4 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( rule__OrdersType__Order1Assignment_4 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_4()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( rule__OrdersType__Order1Assignment_4 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:431:2: rule__OrdersType__Order1Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order1Assignment_4_in_rule__OrdersType__Group__4__Impl825);
            rule__OrdersType__Order1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_4()); 

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
    // $ANTLR end "rule__OrdersType__Group__4__Impl"


    // $ANTLR start "rule__OrdersType__Group__5"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: rule__OrdersType__Group__5 : rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 ;
    public final void rule__OrdersType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:445:1: ( rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:446:2: rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__5855);
            rule__OrdersType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__5858);
            rule__OrdersType__Group__6();

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
    // $ANTLR end "rule__OrdersType__Group__5"


    // $ANTLR start "rule__OrdersType__Group__5__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: rule__OrdersType__Group__5__Impl : ( ( rule__OrdersType__Group_5__0 )* ) ;
    public final void rule__OrdersType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( ( ( rule__OrdersType__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( ( rule__OrdersType__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( ( rule__OrdersType__Group_5__0 )* )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: ( rule__OrdersType__Group_5__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( rule__OrdersType__Group_5__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:460:2: rule__OrdersType__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl885);
            	    rule__OrdersType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__OrdersType__Group__5__Impl"


    // $ANTLR start "rule__OrdersType__Group__6"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: rule__OrdersType__Group__6 : rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 ;
    public final void rule__OrdersType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: ( rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:475:2: rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__6916);
            rule__OrdersType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__6919);
            rule__OrdersType__Group__7();

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
    // $ANTLR end "rule__OrdersType__Group__6"


    // $ANTLR start "rule__OrdersType__Group__6__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: rule__OrdersType__Group__6__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:486:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__6__Impl947); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__OrdersType__Group__6__Impl"


    // $ANTLR start "rule__OrdersType__Group__7"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: rule__OrdersType__Group__7 : rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8 ;
    public final void rule__OrdersType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: ( rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:506:2: rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__7978);
            rule__OrdersType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__8_in_rule__OrdersType__Group__7981);
            rule__OrdersType__Group__8();

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
    // $ANTLR end "rule__OrdersType__Group__7"


    // $ANTLR start "rule__OrdersType__Group__7__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:513:1: rule__OrdersType__Group__7__Impl : ( 'order2' ) ;
    public final void rule__OrdersType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ( ( 'order2' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ( 'order2' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ( 'order2' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: 'order2'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Keyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__7__Impl1009); 
             after(grammarAccess.getOrdersTypeAccess().getOrder2Keyword_7()); 

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
    // $ANTLR end "rule__OrdersType__Group__7__Impl"


    // $ANTLR start "rule__OrdersType__Group__8"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: rule__OrdersType__Group__8 : rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9 ;
    public final void rule__OrdersType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:537:2: rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__8__Impl_in_rule__OrdersType__Group__81040);
            rule__OrdersType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__9_in_rule__OrdersType__Group__81043);
            rule__OrdersType__Group__9();

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
    // $ANTLR end "rule__OrdersType__Group__8"


    // $ANTLR start "rule__OrdersType__Group__8__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:544:1: rule__OrdersType__Group__8__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__8__Impl1071); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__OrdersType__Group__8__Impl"


    // $ANTLR start "rule__OrdersType__Group__9"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: rule__OrdersType__Group__9 : rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10 ;
    public final void rule__OrdersType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:568:2: rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__9__Impl_in_rule__OrdersType__Group__91102);
            rule__OrdersType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__10_in_rule__OrdersType__Group__91105);
            rule__OrdersType__Group__10();

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
    // $ANTLR end "rule__OrdersType__Group__9"


    // $ANTLR start "rule__OrdersType__Group__9__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: rule__OrdersType__Group__9__Impl : ( ( rule__OrdersType__Order2Assignment_9 ) ) ;
    public final void rule__OrdersType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( ( rule__OrdersType__Order2Assignment_9 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ( rule__OrdersType__Order2Assignment_9 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ( rule__OrdersType__Order2Assignment_9 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__OrdersType__Order2Assignment_9 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_9()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( rule__OrdersType__Order2Assignment_9 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:582:2: rule__OrdersType__Order2Assignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order2Assignment_9_in_rule__OrdersType__Group__9__Impl1132);
            rule__OrdersType__Order2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_9()); 

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
    // $ANTLR end "rule__OrdersType__Group__9__Impl"


    // $ANTLR start "rule__OrdersType__Group__10"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__OrdersType__Group__10 : rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11 ;
    public final void rule__OrdersType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:597:2: rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__10__Impl_in_rule__OrdersType__Group__101162);
            rule__OrdersType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__11_in_rule__OrdersType__Group__101165);
            rule__OrdersType__Group__11();

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
    // $ANTLR end "rule__OrdersType__Group__10"


    // $ANTLR start "rule__OrdersType__Group__10__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: rule__OrdersType__Group__10__Impl : ( ( rule__OrdersType__Group_10__0 )* ) ;
    public final void rule__OrdersType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( ( rule__OrdersType__Group_10__0 )* ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( ( rule__OrdersType__Group_10__0 )* )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( ( rule__OrdersType__Group_10__0 )* )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__OrdersType__Group_10__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_10()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__OrdersType__Group_10__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:611:2: rule__OrdersType__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__0_in_rule__OrdersType__Group__10__Impl1192);
            	    rule__OrdersType__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__OrdersType__Group__10__Impl"


    // $ANTLR start "rule__OrdersType__Group__11"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: rule__OrdersType__Group__11 : rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12 ;
    public final void rule__OrdersType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:626:2: rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__11__Impl_in_rule__OrdersType__Group__111223);
            rule__OrdersType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__12_in_rule__OrdersType__Group__111226);
            rule__OrdersType__Group__12();

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
    // $ANTLR end "rule__OrdersType__Group__11"


    // $ANTLR start "rule__OrdersType__Group__11__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: rule__OrdersType__Group__11__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__11__Impl1254); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__OrdersType__Group__11__Impl"


    // $ANTLR start "rule__OrdersType__Group__12"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: rule__OrdersType__Group__12 : rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13 ;
    public final void rule__OrdersType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:657:2: rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__12__Impl_in_rule__OrdersType__Group__121285);
            rule__OrdersType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__13_in_rule__OrdersType__Group__121288);
            rule__OrdersType__Group__13();

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
    // $ANTLR end "rule__OrdersType__Group__12"


    // $ANTLR start "rule__OrdersType__Group__12__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: rule__OrdersType__Group__12__Impl : ( 'orderReference1' ) ;
    public final void rule__OrdersType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( 'orderReference1' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( 'orderReference1' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( 'orderReference1' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: 'orderReference1'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Keyword_12()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OrdersType__Group__12__Impl1316); 
             after(grammarAccess.getOrdersTypeAccess().getOrderReference1Keyword_12()); 

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
    // $ANTLR end "rule__OrdersType__Group__12__Impl"


    // $ANTLR start "rule__OrdersType__Group__13"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: rule__OrdersType__Group__13 : rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14 ;
    public final void rule__OrdersType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:688:2: rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__13__Impl_in_rule__OrdersType__Group__131347);
            rule__OrdersType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__14_in_rule__OrdersType__Group__131350);
            rule__OrdersType__Group__14();

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
    // $ANTLR end "rule__OrdersType__Group__13"


    // $ANTLR start "rule__OrdersType__Group__13__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: rule__OrdersType__Group__13__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__13__Impl1378); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__OrdersType__Group__13__Impl"


    // $ANTLR start "rule__OrdersType__Group__14"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: rule__OrdersType__Group__14 : rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15 ;
    public final void rule__OrdersType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:719:2: rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__14__Impl_in_rule__OrdersType__Group__141409);
            rule__OrdersType__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__15_in_rule__OrdersType__Group__141412);
            rule__OrdersType__Group__15();

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
    // $ANTLR end "rule__OrdersType__Group__14"


    // $ANTLR start "rule__OrdersType__Group__14__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: rule__OrdersType__Group__14__Impl : ( ( rule__OrdersType__OrderReference1Assignment_14 ) ) ;
    public final void rule__OrdersType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ( ( rule__OrdersType__OrderReference1Assignment_14 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( ( rule__OrdersType__OrderReference1Assignment_14 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( ( rule__OrdersType__OrderReference1Assignment_14 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( rule__OrdersType__OrderReference1Assignment_14 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_14()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( rule__OrdersType__OrderReference1Assignment_14 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:733:2: rule__OrdersType__OrderReference1Assignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference1Assignment_14_in_rule__OrdersType__Group__14__Impl1439);
            rule__OrdersType__OrderReference1Assignment_14();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_14()); 

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
    // $ANTLR end "rule__OrdersType__Group__14__Impl"


    // $ANTLR start "rule__OrdersType__Group__15"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: rule__OrdersType__Group__15 : rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16 ;
    public final void rule__OrdersType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:748:2: rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__15__Impl_in_rule__OrdersType__Group__151469);
            rule__OrdersType__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__16_in_rule__OrdersType__Group__151472);
            rule__OrdersType__Group__16();

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
    // $ANTLR end "rule__OrdersType__Group__15"


    // $ANTLR start "rule__OrdersType__Group__15__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: rule__OrdersType__Group__15__Impl : ( ( rule__OrdersType__Group_15__0 )* ) ;
    public final void rule__OrdersType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:759:1: ( ( ( rule__OrdersType__Group_15__0 )* ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( ( rule__OrdersType__Group_15__0 )* )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( ( rule__OrdersType__Group_15__0 )* )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( rule__OrdersType__Group_15__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_15()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( rule__OrdersType__Group_15__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:762:2: rule__OrdersType__Group_15__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__0_in_rule__OrdersType__Group__15__Impl1499);
            	    rule__OrdersType__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_15()); 

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
    // $ANTLR end "rule__OrdersType__Group__15__Impl"


    // $ANTLR start "rule__OrdersType__Group__16"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: rule__OrdersType__Group__16 : rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17 ;
    public final void rule__OrdersType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:777:2: rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__16__Impl_in_rule__OrdersType__Group__161530);
            rule__OrdersType__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__17_in_rule__OrdersType__Group__161533);
            rule__OrdersType__Group__17();

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
    // $ANTLR end "rule__OrdersType__Group__16"


    // $ANTLR start "rule__OrdersType__Group__16__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: rule__OrdersType__Group__16__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_16()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__16__Impl1561); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__OrdersType__Group__16__Impl"


    // $ANTLR start "rule__OrdersType__Group__17"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: rule__OrdersType__Group__17 : rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18 ;
    public final void rule__OrdersType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:808:2: rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__17__Impl_in_rule__OrdersType__Group__171592);
            rule__OrdersType__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__18_in_rule__OrdersType__Group__171595);
            rule__OrdersType__Group__18();

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
    // $ANTLR end "rule__OrdersType__Group__17"


    // $ANTLR start "rule__OrdersType__Group__17__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: rule__OrdersType__Group__17__Impl : ( 'orderReference2' ) ;
    public final void rule__OrdersType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( ( 'orderReference2' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( 'orderReference2' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( 'orderReference2' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: 'orderReference2'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Keyword_17()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OrdersType__Group__17__Impl1623); 
             after(grammarAccess.getOrdersTypeAccess().getOrderReference2Keyword_17()); 

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
    // $ANTLR end "rule__OrdersType__Group__17__Impl"


    // $ANTLR start "rule__OrdersType__Group__18"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: rule__OrdersType__Group__18 : rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19 ;
    public final void rule__OrdersType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:839:2: rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__18__Impl_in_rule__OrdersType__Group__181654);
            rule__OrdersType__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__19_in_rule__OrdersType__Group__181657);
            rule__OrdersType__Group__19();

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
    // $ANTLR end "rule__OrdersType__Group__18"


    // $ANTLR start "rule__OrdersType__Group__18__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: rule__OrdersType__Group__18__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__18__Impl1685); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__OrdersType__Group__18__Impl"


    // $ANTLR start "rule__OrdersType__Group__19"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: rule__OrdersType__Group__19 : rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20 ;
    public final void rule__OrdersType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:870:2: rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__19__Impl_in_rule__OrdersType__Group__191716);
            rule__OrdersType__Group__19__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__20_in_rule__OrdersType__Group__191719);
            rule__OrdersType__Group__20();

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
    // $ANTLR end "rule__OrdersType__Group__19"


    // $ANTLR start "rule__OrdersType__Group__19__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: rule__OrdersType__Group__19__Impl : ( ( rule__OrdersType__OrderReference2Assignment_19 ) ) ;
    public final void rule__OrdersType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ( ( rule__OrdersType__OrderReference2Assignment_19 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( ( rule__OrdersType__OrderReference2Assignment_19 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( ( rule__OrdersType__OrderReference2Assignment_19 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( rule__OrdersType__OrderReference2Assignment_19 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_19()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( rule__OrdersType__OrderReference2Assignment_19 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:884:2: rule__OrdersType__OrderReference2Assignment_19
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference2Assignment_19_in_rule__OrdersType__Group__19__Impl1746);
            rule__OrdersType__OrderReference2Assignment_19();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_19()); 

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
    // $ANTLR end "rule__OrdersType__Group__19__Impl"


    // $ANTLR start "rule__OrdersType__Group__20"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: rule__OrdersType__Group__20 : rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21 ;
    public final void rule__OrdersType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:899:2: rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__20__Impl_in_rule__OrdersType__Group__201776);
            rule__OrdersType__Group__20__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__21_in_rule__OrdersType__Group__201779);
            rule__OrdersType__Group__21();

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
    // $ANTLR end "rule__OrdersType__Group__20"


    // $ANTLR start "rule__OrdersType__Group__20__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: rule__OrdersType__Group__20__Impl : ( ( rule__OrdersType__Group_20__0 )* ) ;
    public final void rule__OrdersType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ( ( rule__OrdersType__Group_20__0 )* ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( ( rule__OrdersType__Group_20__0 )* )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( ( rule__OrdersType__Group_20__0 )* )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( rule__OrdersType__Group_20__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_20()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( rule__OrdersType__Group_20__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: rule__OrdersType__Group_20__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__0_in_rule__OrdersType__Group__20__Impl1806);
            	    rule__OrdersType__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_20()); 

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
    // $ANTLR end "rule__OrdersType__Group__20__Impl"


    // $ANTLR start "rule__OrdersType__Group__21"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: rule__OrdersType__Group__21 : rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22 ;
    public final void rule__OrdersType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:928:2: rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__21__Impl_in_rule__OrdersType__Group__211837);
            rule__OrdersType__Group__21__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__22_in_rule__OrdersType__Group__211840);
            rule__OrdersType__Group__22();

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
    // $ANTLR end "rule__OrdersType__Group__21"


    // $ANTLR start "rule__OrdersType__Group__21__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: rule__OrdersType__Group__21__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_21()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__21__Impl1868); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_21()); 

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
    // $ANTLR end "rule__OrdersType__Group__21__Impl"


    // $ANTLR start "rule__OrdersType__Group__22"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: rule__OrdersType__Group__22 : rule__OrdersType__Group__22__Impl ;
    public final void rule__OrdersType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( rule__OrdersType__Group__22__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:959:2: rule__OrdersType__Group__22__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__22__Impl_in_rule__OrdersType__Group__221899);
            rule__OrdersType__Group__22__Impl();

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
    // $ANTLR end "rule__OrdersType__Group__22"


    // $ANTLR start "rule__OrdersType__Group__22__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: rule__OrdersType__Group__22__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_22()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__22__Impl1927); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_22()); 

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
    // $ANTLR end "rule__OrdersType__Group__22__Impl"


    // $ANTLR start "rule__OrdersType__Group_5__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: rule__OrdersType__Group_5__0 : rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 ;
    public final void rule__OrdersType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:2: rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__02004);
            rule__OrdersType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__02007);
            rule__OrdersType__Group_5__1();

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
    // $ANTLR end "rule__OrdersType__Group_5__0"


    // $ANTLR start "rule__OrdersType__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: rule__OrdersType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( ',' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_5__0__Impl2035); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__OrdersType__Group_5__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_5__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: rule__OrdersType__Group_5__1 : rule__OrdersType__Group_5__1__Impl ;
    public final void rule__OrdersType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:1: ( rule__OrdersType__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:2: rule__OrdersType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__12066);
            rule__OrdersType__Group_5__1__Impl();

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
    // $ANTLR end "rule__OrdersType__Group_5__1"


    // $ANTLR start "rule__OrdersType__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: rule__OrdersType__Group_5__1__Impl : ( ( rule__OrdersType__Order1Assignment_5_1 ) ) ;
    public final void rule__OrdersType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( ( ( rule__OrdersType__Order1Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ( ( rule__OrdersType__Order1Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ( ( rule__OrdersType__Order1Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( rule__OrdersType__Order1Assignment_5_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_5_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( rule__OrdersType__Order1Assignment_5_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:2: rule__OrdersType__Order1Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order1Assignment_5_1_in_rule__OrdersType__Group_5__1__Impl2093);
            rule__OrdersType__Order1Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_5_1()); 

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
    // $ANTLR end "rule__OrdersType__Group_5__1__Impl"


    // $ANTLR start "rule__OrdersType__Group_10__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: rule__OrdersType__Group_10__0 : rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1 ;
    public final void rule__OrdersType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:2: rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__0__Impl_in_rule__OrdersType__Group_10__02127);
            rule__OrdersType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__1_in_rule__OrdersType__Group_10__02130);
            rule__OrdersType__Group_10__1();

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
    // $ANTLR end "rule__OrdersType__Group_10__0"


    // $ANTLR start "rule__OrdersType__Group_10__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: rule__OrdersType__Group_10__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( ',' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_10_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_10__0__Impl2158); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__OrdersType__Group_10__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_10__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__OrdersType__Group_10__1 : rule__OrdersType__Group_10__1__Impl ;
    public final void rule__OrdersType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__OrdersType__Group_10__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:2: rule__OrdersType__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__1__Impl_in_rule__OrdersType__Group_10__12189);
            rule__OrdersType__Group_10__1__Impl();

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
    // $ANTLR end "rule__OrdersType__Group_10__1"


    // $ANTLR start "rule__OrdersType__Group_10__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: rule__OrdersType__Group_10__1__Impl : ( ( rule__OrdersType__Order2Assignment_10_1 ) ) ;
    public final void rule__OrdersType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ( ( rule__OrdersType__Order2Assignment_10_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( rule__OrdersType__Order2Assignment_10_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( rule__OrdersType__Order2Assignment_10_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( rule__OrdersType__Order2Assignment_10_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_10_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( rule__OrdersType__Order2Assignment_10_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:2: rule__OrdersType__Order2Assignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order2Assignment_10_1_in_rule__OrdersType__Group_10__1__Impl2216);
            rule__OrdersType__Order2Assignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_10_1()); 

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
    // $ANTLR end "rule__OrdersType__Group_10__1__Impl"


    // $ANTLR start "rule__OrdersType__Group_15__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: rule__OrdersType__Group_15__0 : rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1 ;
    public final void rule__OrdersType__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:2: rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__0__Impl_in_rule__OrdersType__Group_15__02250);
            rule__OrdersType__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__1_in_rule__OrdersType__Group_15__02253);
            rule__OrdersType__Group_15__1();

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
    // $ANTLR end "rule__OrdersType__Group_15__0"


    // $ANTLR start "rule__OrdersType__Group_15__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: rule__OrdersType__Group_15__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( ',' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_15_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_15__0__Impl2281); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_15_0()); 

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
    // $ANTLR end "rule__OrdersType__Group_15__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_15__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: rule__OrdersType__Group_15__1 : rule__OrdersType__Group_15__1__Impl ;
    public final void rule__OrdersType__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__OrdersType__Group_15__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__OrdersType__Group_15__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__1__Impl_in_rule__OrdersType__Group_15__12312);
            rule__OrdersType__Group_15__1__Impl();

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
    // $ANTLR end "rule__OrdersType__Group_15__1"


    // $ANTLR start "rule__OrdersType__Group_15__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: rule__OrdersType__Group_15__1__Impl : ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) ) ;
    public final void rule__OrdersType__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( rule__OrdersType__OrderReference1Assignment_15_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_15_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( rule__OrdersType__OrderReference1Assignment_15_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:2: rule__OrdersType__OrderReference1Assignment_15_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference1Assignment_15_1_in_rule__OrdersType__Group_15__1__Impl2339);
            rule__OrdersType__OrderReference1Assignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_15_1()); 

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
    // $ANTLR end "rule__OrdersType__Group_15__1__Impl"


    // $ANTLR start "rule__OrdersType__Group_20__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: rule__OrdersType__Group_20__0 : rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1 ;
    public final void rule__OrdersType__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ( rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:2: rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__0__Impl_in_rule__OrdersType__Group_20__02373);
            rule__OrdersType__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__1_in_rule__OrdersType__Group_20__02376);
            rule__OrdersType__Group_20__1();

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
    // $ANTLR end "rule__OrdersType__Group_20__0"


    // $ANTLR start "rule__OrdersType__Group_20__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: rule__OrdersType__Group_20__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( ',' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_20_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_20__0__Impl2404); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_20_0()); 

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
    // $ANTLR end "rule__OrdersType__Group_20__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_20__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: rule__OrdersType__Group_20__1 : rule__OrdersType__Group_20__1__Impl ;
    public final void rule__OrdersType__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: ( rule__OrdersType__Group_20__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:2: rule__OrdersType__Group_20__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__1__Impl_in_rule__OrdersType__Group_20__12435);
            rule__OrdersType__Group_20__1__Impl();

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
    // $ANTLR end "rule__OrdersType__Group_20__1"


    // $ANTLR start "rule__OrdersType__Group_20__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: rule__OrdersType__Group_20__1__Impl : ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) ) ;
    public final void rule__OrdersType__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( rule__OrdersType__OrderReference2Assignment_20_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_20_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( rule__OrdersType__OrderReference2Assignment_20_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:2: rule__OrdersType__OrderReference2Assignment_20_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference2Assignment_20_1_in_rule__OrdersType__Group_20__1__Impl2462);
            rule__OrdersType__OrderReference2Assignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_20_1()); 

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
    // $ANTLR end "rule__OrdersType__Group_20__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: rule__OrderDetail1__Group__0 : rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1 ;
    public final void rule__OrderDetail1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:2: rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__0__Impl_in_rule__OrderDetail1__Group__02496);
            rule__OrderDetail1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__1_in_rule__OrderDetail1__Group__02499);
            rule__OrderDetail1__Group__1();

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
    // $ANTLR end "rule__OrderDetail1__Group__0"


    // $ANTLR start "rule__OrderDetail1__Group__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: rule__OrderDetail1__Group__0__Impl : ( () ) ;
    public final void rule__OrderDetail1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( ( () ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( () )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( () )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ()
            {
             before(grammarAccess.getOrderDetail1Access().getOrderDetail1Action_0()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ()
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: 
            {
            }

             after(grammarAccess.getOrderDetail1Access().getOrderDetail1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: rule__OrderDetail1__Group__1 : rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2 ;
    public final void rule__OrderDetail1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:2: rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__1__Impl_in_rule__OrderDetail1__Group__12557);
            rule__OrderDetail1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__2_in_rule__OrderDetail1__Group__12560);
            rule__OrderDetail1__Group__2();

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
    // $ANTLR end "rule__OrderDetail1__Group__1"


    // $ANTLR start "rule__OrderDetail1__Group__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__OrderDetail1__Group__1__Impl : ( 'OrderDetail1' ) ;
    public final void rule__OrderDetail1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ( 'OrderDetail1' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( 'OrderDetail1' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( 'OrderDetail1' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: 'OrderDetail1'
            {
             before(grammarAccess.getOrderDetail1Access().getOrderDetail1Keyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrderDetail1__Group__1__Impl2588); 
             after(grammarAccess.getOrderDetail1Access().getOrderDetail1Keyword_1()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: rule__OrderDetail1__Group__2 : rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3 ;
    public final void rule__OrderDetail1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:2: rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__2__Impl_in_rule__OrderDetail1__Group__22619);
            rule__OrderDetail1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__3_in_rule__OrderDetail1__Group__22622);
            rule__OrderDetail1__Group__3();

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
    // $ANTLR end "rule__OrderDetail1__Group__2"


    // $ANTLR start "rule__OrderDetail1__Group__2__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: rule__OrderDetail1__Group__2__Impl : ( ( rule__OrderDetail1__NameAssignment_2 ) ) ;
    public final void rule__OrderDetail1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( ( ( rule__OrderDetail1__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ( rule__OrderDetail1__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ( rule__OrderDetail1__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( rule__OrderDetail1__NameAssignment_2 )
            {
             before(grammarAccess.getOrderDetail1Access().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( rule__OrderDetail1__NameAssignment_2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:2: rule__OrderDetail1__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__NameAssignment_2_in_rule__OrderDetail1__Group__2__Impl2649);
            rule__OrderDetail1__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getNameAssignment_2()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__2__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__3"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: rule__OrderDetail1__Group__3 : rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4 ;
    public final void rule__OrderDetail1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: ( rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:2: rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__3__Impl_in_rule__OrderDetail1__Group__32679);
            rule__OrderDetail1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__4_in_rule__OrderDetail1__Group__32682);
            rule__OrderDetail1__Group__4();

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
    // $ANTLR end "rule__OrderDetail1__Group__3"


    // $ANTLR start "rule__OrderDetail1__Group__3__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: rule__OrderDetail1__Group__3__Impl : ( '{' ) ;
    public final void rule__OrderDetail1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: '{'
            {
             before(grammarAccess.getOrderDetail1Access().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderDetail1__Group__3__Impl2710); 
             after(grammarAccess.getOrderDetail1Access().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__3__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__4"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: rule__OrderDetail1__Group__4 : rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5 ;
    public final void rule__OrderDetail1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:2: rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__4__Impl_in_rule__OrderDetail1__Group__42741);
            rule__OrderDetail1__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__5_in_rule__OrderDetail1__Group__42744);
            rule__OrderDetail1__Group__5();

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
    // $ANTLR end "rule__OrderDetail1__Group__4"


    // $ANTLR start "rule__OrderDetail1__Group__4__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: rule__OrderDetail1__Group__4__Impl : ( ( rule__OrderDetail1__Group_4__0 )? ) ;
    public final void rule__OrderDetail1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ( ( ( rule__OrderDetail1__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( ( rule__OrderDetail1__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( ( rule__OrderDetail1__Group_4__0 )? )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( rule__OrderDetail1__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( rule__OrderDetail1__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:2: rule__OrderDetail1__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__0_in_rule__OrderDetail1__Group__4__Impl2771);
                    rule__OrderDetail1__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail1Access().getGroup_4()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__4__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__5"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: rule__OrderDetail1__Group__5 : rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6 ;
    public final void rule__OrderDetail1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:2: rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__5__Impl_in_rule__OrderDetail1__Group__52802);
            rule__OrderDetail1__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__6_in_rule__OrderDetail1__Group__52805);
            rule__OrderDetail1__Group__6();

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
    // $ANTLR end "rule__OrderDetail1__Group__5"


    // $ANTLR start "rule__OrderDetail1__Group__5__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: rule__OrderDetail1__Group__5__Impl : ( ( rule__OrderDetail1__Group_5__0 )? ) ;
    public final void rule__OrderDetail1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( ( ( rule__OrderDetail1__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( rule__OrderDetail1__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( rule__OrderDetail1__Group_5__0 )? )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( rule__OrderDetail1__Group_5__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( rule__OrderDetail1__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:2: rule__OrderDetail1__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__0_in_rule__OrderDetail1__Group__5__Impl2832);
                    rule__OrderDetail1__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail1Access().getGroup_5()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__5__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__6"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:1: rule__OrderDetail1__Group__6 : rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7 ;
    public final void rule__OrderDetail1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: ( rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:2: rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__6__Impl_in_rule__OrderDetail1__Group__62863);
            rule__OrderDetail1__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__7_in_rule__OrderDetail1__Group__62866);
            rule__OrderDetail1__Group__7();

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
    // $ANTLR end "rule__OrderDetail1__Group__6"


    // $ANTLR start "rule__OrderDetail1__Group__6__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: rule__OrderDetail1__Group__6__Impl : ( ( rule__OrderDetail1__Group_6__0 )? ) ;
    public final void rule__OrderDetail1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( ( ( rule__OrderDetail1__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: ( ( rule__OrderDetail1__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: ( ( rule__OrderDetail1__Group_6__0 )? )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: ( rule__OrderDetail1__Group_6__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_6()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( rule__OrderDetail1__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:2: rule__OrderDetail1__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__0_in_rule__OrderDetail1__Group__6__Impl2893);
                    rule__OrderDetail1__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail1Access().getGroup_6()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__6__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__7"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: rule__OrderDetail1__Group__7 : rule__OrderDetail1__Group__7__Impl ;
    public final void rule__OrderDetail1__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( rule__OrderDetail1__Group__7__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:2: rule__OrderDetail1__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__7__Impl_in_rule__OrderDetail1__Group__72924);
            rule__OrderDetail1__Group__7__Impl();

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
    // $ANTLR end "rule__OrderDetail1__Group__7"


    // $ANTLR start "rule__OrderDetail1__Group__7__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: rule__OrderDetail1__Group__7__Impl : ( '}' ) ;
    public final void rule__OrderDetail1__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: '}'
            {
             before(grammarAccess.getOrderDetail1Access().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderDetail1__Group__7__Impl2952); 
             after(grammarAccess.getOrderDetail1Access().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__OrderDetail1__Group__7__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_4__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: rule__OrderDetail1__Group_4__0 : rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1 ;
    public final void rule__OrderDetail1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:2: rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__0__Impl_in_rule__OrderDetail1__Group_4__02999);
            rule__OrderDetail1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__1_in_rule__OrderDetail1__Group_4__03002);
            rule__OrderDetail1__Group_4__1();

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
    // $ANTLR end "rule__OrderDetail1__Group_4__0"


    // $ANTLR start "rule__OrderDetail1__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: rule__OrderDetail1__Group_4__0__Impl : ( 'customerAddress' ) ;
    public final void rule__OrderDetail1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( ( 'customerAddress' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( 'customerAddress' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( 'customerAddress' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: 'customerAddress'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__OrderDetail1__Group_4__0__Impl3030); 
             after(grammarAccess.getOrderDetail1Access().getCustomerAddressKeyword_4_0()); 

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
    // $ANTLR end "rule__OrderDetail1__Group_4__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_4__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: rule__OrderDetail1__Group_4__1 : rule__OrderDetail1__Group_4__1__Impl ;
    public final void rule__OrderDetail1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: ( rule__OrderDetail1__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:2: rule__OrderDetail1__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__1__Impl_in_rule__OrderDetail1__Group_4__13061);
            rule__OrderDetail1__Group_4__1__Impl();

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
    // $ANTLR end "rule__OrderDetail1__Group_4__1"


    // $ANTLR start "rule__OrderDetail1__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: rule__OrderDetail1__Group_4__1__Impl : ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) ) ;
    public final void rule__OrderDetail1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: ( ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( rule__OrderDetail1__CustomerAddressAssignment_4_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressAssignment_4_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( rule__OrderDetail1__CustomerAddressAssignment_4_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:2: rule__OrderDetail1__CustomerAddressAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerAddressAssignment_4_1_in_rule__OrderDetail1__Group_4__1__Impl3088);
            rule__OrderDetail1__CustomerAddressAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getCustomerAddressAssignment_4_1()); 

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
    // $ANTLR end "rule__OrderDetail1__Group_4__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_5__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: rule__OrderDetail1__Group_5__0 : rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1 ;
    public final void rule__OrderDetail1__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:2: rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__0__Impl_in_rule__OrderDetail1__Group_5__03122);
            rule__OrderDetail1__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__1_in_rule__OrderDetail1__Group_5__03125);
            rule__OrderDetail1__Group_5__1();

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
    // $ANTLR end "rule__OrderDetail1__Group_5__0"


    // $ANTLR start "rule__OrderDetail1__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: rule__OrderDetail1__Group_5__0__Impl : ( 'customerContact' ) ;
    public final void rule__OrderDetail1__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( ( 'customerContact' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( 'customerContact' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( 'customerContact' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: 'customerContact'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OrderDetail1__Group_5__0__Impl3153); 
             after(grammarAccess.getOrderDetail1Access().getCustomerContactKeyword_5_0()); 

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
    // $ANTLR end "rule__OrderDetail1__Group_5__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_5__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: rule__OrderDetail1__Group_5__1 : rule__OrderDetail1__Group_5__1__Impl ;
    public final void rule__OrderDetail1__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rule__OrderDetail1__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:2: rule__OrderDetail1__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__1__Impl_in_rule__OrderDetail1__Group_5__13184);
            rule__OrderDetail1__Group_5__1__Impl();

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
    // $ANTLR end "rule__OrderDetail1__Group_5__1"


    // $ANTLR start "rule__OrderDetail1__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: rule__OrderDetail1__Group_5__1__Impl : ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) ) ;
    public final void rule__OrderDetail1__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( rule__OrderDetail1__CustomerContactAssignment_5_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactAssignment_5_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( rule__OrderDetail1__CustomerContactAssignment_5_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:2: rule__OrderDetail1__CustomerContactAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerContactAssignment_5_1_in_rule__OrderDetail1__Group_5__1__Impl3211);
            rule__OrderDetail1__CustomerContactAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getCustomerContactAssignment_5_1()); 

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
    // $ANTLR end "rule__OrderDetail1__Group_5__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_6__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: rule__OrderDetail1__Group_6__0 : rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1 ;
    public final void rule__OrderDetail1__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: ( rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:2: rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__0__Impl_in_rule__OrderDetail1__Group_6__03245);
            rule__OrderDetail1__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__1_in_rule__OrderDetail1__Group_6__03248);
            rule__OrderDetail1__Group_6__1();

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
    // $ANTLR end "rule__OrderDetail1__Group_6__0"


    // $ANTLR start "rule__OrderDetail1__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: rule__OrderDetail1__Group_6__0__Impl : ( 'customerName' ) ;
    public final void rule__OrderDetail1__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( ( 'customerName' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( 'customerName' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( 'customerName' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: 'customerName'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameKeyword_6_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OrderDetail1__Group_6__0__Impl3276); 
             after(grammarAccess.getOrderDetail1Access().getCustomerNameKeyword_6_0()); 

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
    // $ANTLR end "rule__OrderDetail1__Group_6__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_6__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: rule__OrderDetail1__Group_6__1 : rule__OrderDetail1__Group_6__1__Impl ;
    public final void rule__OrderDetail1__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( rule__OrderDetail1__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:2: rule__OrderDetail1__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__1__Impl_in_rule__OrderDetail1__Group_6__13307);
            rule__OrderDetail1__Group_6__1__Impl();

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
    // $ANTLR end "rule__OrderDetail1__Group_6__1"


    // $ANTLR start "rule__OrderDetail1__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: rule__OrderDetail1__Group_6__1__Impl : ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) ) ;
    public final void rule__OrderDetail1__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( rule__OrderDetail1__CustomerNameAssignment_6_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameAssignment_6_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( rule__OrderDetail1__CustomerNameAssignment_6_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:2: rule__OrderDetail1__CustomerNameAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerNameAssignment_6_1_in_rule__OrderDetail1__Group_6__1__Impl3334);
            rule__OrderDetail1__CustomerNameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getCustomerNameAssignment_6_1()); 

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
    // $ANTLR end "rule__OrderDetail1__Group_6__1__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: rule__OrderDetail2__Group__0 : rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1 ;
    public final void rule__OrderDetail2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:2: rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__0__Impl_in_rule__OrderDetail2__Group__03368);
            rule__OrderDetail2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__1_in_rule__OrderDetail2__Group__03371);
            rule__OrderDetail2__Group__1();

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
    // $ANTLR end "rule__OrderDetail2__Group__0"


    // $ANTLR start "rule__OrderDetail2__Group__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: rule__OrderDetail2__Group__0__Impl : ( () ) ;
    public final void rule__OrderDetail2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( ( () ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( () )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( () )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ()
            {
             before(grammarAccess.getOrderDetail2Access().getOrderDetail2Action_0()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ()
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: 
            {
            }

             after(grammarAccess.getOrderDetail2Access().getOrderDetail2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__0__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: rule__OrderDetail2__Group__1 : rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2 ;
    public final void rule__OrderDetail2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:2: rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__1__Impl_in_rule__OrderDetail2__Group__13429);
            rule__OrderDetail2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__2_in_rule__OrderDetail2__Group__13432);
            rule__OrderDetail2__Group__2();

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
    // $ANTLR end "rule__OrderDetail2__Group__1"


    // $ANTLR start "rule__OrderDetail2__Group__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: rule__OrderDetail2__Group__1__Impl : ( 'OrderDetail2' ) ;
    public final void rule__OrderDetail2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( ( 'OrderDetail2' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( 'OrderDetail2' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( 'OrderDetail2' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: 'OrderDetail2'
            {
             before(grammarAccess.getOrderDetail2Access().getOrderDetail2Keyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__OrderDetail2__Group__1__Impl3460); 
             after(grammarAccess.getOrderDetail2Access().getOrderDetail2Keyword_1()); 

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
    // $ANTLR end "rule__OrderDetail2__Group__1__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__OrderDetail2__Group__2 : rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3 ;
    public final void rule__OrderDetail2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:2: rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__2__Impl_in_rule__OrderDetail2__Group__23491);
            rule__OrderDetail2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__3_in_rule__OrderDetail2__Group__23494);
            rule__OrderDetail2__Group__3();

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
    // $ANTLR end "rule__OrderDetail2__Group__2"


    // $ANTLR start "rule__OrderDetail2__Group__2__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__OrderDetail2__Group__2__Impl : ( ( rule__OrderDetail2__NameAssignment_2 ) ) ;
    public final void rule__OrderDetail2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( ( ( rule__OrderDetail2__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( ( rule__OrderDetail2__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( ( rule__OrderDetail2__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: ( rule__OrderDetail2__NameAssignment_2 )
            {
             before(grammarAccess.getOrderDetail2Access().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( rule__OrderDetail2__NameAssignment_2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:2: rule__OrderDetail2__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__NameAssignment_2_in_rule__OrderDetail2__Group__2__Impl3521);
            rule__OrderDetail2__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getNameAssignment_2()); 

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
    // $ANTLR end "rule__OrderDetail2__Group__2__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__3"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: rule__OrderDetail2__Group__3 : rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4 ;
    public final void rule__OrderDetail2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1821:1: ( rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1822:2: rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__3__Impl_in_rule__OrderDetail2__Group__33551);
            rule__OrderDetail2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__4_in_rule__OrderDetail2__Group__33554);
            rule__OrderDetail2__Group__4();

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
    // $ANTLR end "rule__OrderDetail2__Group__3"


    // $ANTLR start "rule__OrderDetail2__Group__3__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: rule__OrderDetail2__Group__3__Impl : ( '{' ) ;
    public final void rule__OrderDetail2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: '{'
            {
             before(grammarAccess.getOrderDetail2Access().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderDetail2__Group__3__Impl3582); 
             after(grammarAccess.getOrderDetail2Access().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__OrderDetail2__Group__3__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__4"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: rule__OrderDetail2__Group__4 : rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5 ;
    public final void rule__OrderDetail2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: ( rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:2: rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__4__Impl_in_rule__OrderDetail2__Group__43613);
            rule__OrderDetail2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__5_in_rule__OrderDetail2__Group__43616);
            rule__OrderDetail2__Group__5();

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
    // $ANTLR end "rule__OrderDetail2__Group__4"


    // $ANTLR start "rule__OrderDetail2__Group__4__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__OrderDetail2__Group__4__Impl : ( ( rule__OrderDetail2__Group_4__0 )? ) ;
    public final void rule__OrderDetail2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( ( ( rule__OrderDetail2__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__OrderDetail2__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__OrderDetail2__Group_4__0 )? )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( rule__OrderDetail2__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetail2Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__OrderDetail2__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:2: rule__OrderDetail2__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__0_in_rule__OrderDetail2__Group__4__Impl3643);
                    rule__OrderDetail2__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail2Access().getGroup_4()); 

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
    // $ANTLR end "rule__OrderDetail2__Group__4__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__5"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: rule__OrderDetail2__Group__5 : rule__OrderDetail2__Group__5__Impl ;
    public final void rule__OrderDetail2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__OrderDetail2__Group__5__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__OrderDetail2__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__5__Impl_in_rule__OrderDetail2__Group__53674);
            rule__OrderDetail2__Group__5__Impl();

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
    // $ANTLR end "rule__OrderDetail2__Group__5"


    // $ANTLR start "rule__OrderDetail2__Group__5__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: rule__OrderDetail2__Group__5__Impl : ( '}' ) ;
    public final void rule__OrderDetail2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: '}'
            {
             before(grammarAccess.getOrderDetail2Access().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderDetail2__Group__5__Impl3702); 
             after(grammarAccess.getOrderDetail2Access().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__OrderDetail2__Group__5__Impl"


    // $ANTLR start "rule__OrderDetail2__Group_4__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: rule__OrderDetail2__Group_4__0 : rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1 ;
    public final void rule__OrderDetail2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:2: rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__0__Impl_in_rule__OrderDetail2__Group_4__03745);
            rule__OrderDetail2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__1_in_rule__OrderDetail2__Group_4__03748);
            rule__OrderDetail2__Group_4__1();

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
    // $ANTLR end "rule__OrderDetail2__Group_4__0"


    // $ANTLR start "rule__OrderDetail2__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: rule__OrderDetail2__Group_4__0__Impl : ( 'customerName' ) ;
    public final void rule__OrderDetail2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( ( 'customerName' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ( 'customerName' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ( 'customerName' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: 'customerName'
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OrderDetail2__Group_4__0__Impl3776); 
             after(grammarAccess.getOrderDetail2Access().getCustomerNameKeyword_4_0()); 

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
    // $ANTLR end "rule__OrderDetail2__Group_4__0__Impl"


    // $ANTLR start "rule__OrderDetail2__Group_4__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__OrderDetail2__Group_4__1 : rule__OrderDetail2__Group_4__1__Impl ;
    public final void rule__OrderDetail2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( rule__OrderDetail2__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:2: rule__OrderDetail2__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__1__Impl_in_rule__OrderDetail2__Group_4__13807);
            rule__OrderDetail2__Group_4__1__Impl();

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
    // $ANTLR end "rule__OrderDetail2__Group_4__1"


    // $ANTLR start "rule__OrderDetail2__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__OrderDetail2__Group_4__1__Impl : ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) ) ;
    public final void rule__OrderDetail2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( rule__OrderDetail2__CustomerNameAssignment_4_1 )
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameAssignment_4_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( rule__OrderDetail2__CustomerNameAssignment_4_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:2: rule__OrderDetail2__CustomerNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__CustomerNameAssignment_4_1_in_rule__OrderDetail2__Group_4__1__Impl3834);
            rule__OrderDetail2__CustomerNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getCustomerNameAssignment_4_1()); 

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
    // $ANTLR end "rule__OrderDetail2__Group_4__1__Impl"


    // $ANTLR start "rule__OrderRef1__Group__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: rule__OrderRef1__Group__0 : rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1 ;
    public final void rule__OrderRef1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:2: rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__0__Impl_in_rule__OrderRef1__Group__03868);
            rule__OrderRef1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__1_in_rule__OrderRef1__Group__03871);
            rule__OrderRef1__Group__1();

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
    // $ANTLR end "rule__OrderRef1__Group__0"


    // $ANTLR start "rule__OrderRef1__Group__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: rule__OrderRef1__Group__0__Impl : ( () ) ;
    public final void rule__OrderRef1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( ( () ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( () )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( () )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ()
            {
             before(grammarAccess.getOrderRef1Access().getOrderRef1Action_0()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ()
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: 
            {
            }

             after(grammarAccess.getOrderRef1Access().getOrderRef1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__0__Impl"


    // $ANTLR start "rule__OrderRef1__Group__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: rule__OrderRef1__Group__1 : rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2 ;
    public final void rule__OrderRef1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:2: rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__1__Impl_in_rule__OrderRef1__Group__13929);
            rule__OrderRef1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__2_in_rule__OrderRef1__Group__13932);
            rule__OrderRef1__Group__2();

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
    // $ANTLR end "rule__OrderRef1__Group__1"


    // $ANTLR start "rule__OrderRef1__Group__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: rule__OrderRef1__Group__1__Impl : ( 'OrderRef1' ) ;
    public final void rule__OrderRef1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( ( 'OrderRef1' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( 'OrderRef1' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( 'OrderRef1' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: 'OrderRef1'
            {
             before(grammarAccess.getOrderRef1Access().getOrderRef1Keyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__OrderRef1__Group__1__Impl3960); 
             after(grammarAccess.getOrderRef1Access().getOrderRef1Keyword_1()); 

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
    // $ANTLR end "rule__OrderRef1__Group__1__Impl"


    // $ANTLR start "rule__OrderRef1__Group__2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: rule__OrderRef1__Group__2 : rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3 ;
    public final void rule__OrderRef1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:2: rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__2__Impl_in_rule__OrderRef1__Group__23991);
            rule__OrderRef1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__3_in_rule__OrderRef1__Group__23994);
            rule__OrderRef1__Group__3();

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
    // $ANTLR end "rule__OrderRef1__Group__2"


    // $ANTLR start "rule__OrderRef1__Group__2__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: rule__OrderRef1__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderRef1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: '{'
            {
             before(grammarAccess.getOrderRef1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderRef1__Group__2__Impl4022); 
             after(grammarAccess.getOrderRef1Access().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__OrderRef1__Group__2__Impl"


    // $ANTLR start "rule__OrderRef1__Group__3"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: rule__OrderRef1__Group__3 : rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4 ;
    public final void rule__OrderRef1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:2: rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__3__Impl_in_rule__OrderRef1__Group__34053);
            rule__OrderRef1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__4_in_rule__OrderRef1__Group__34056);
            rule__OrderRef1__Group__4();

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
    // $ANTLR end "rule__OrderRef1__Group__3"


    // $ANTLR start "rule__OrderRef1__Group__3__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: rule__OrderRef1__Group__3__Impl : ( ( rule__OrderRef1__Group_3__0 )? ) ;
    public final void rule__OrderRef1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( ( ( rule__OrderRef1__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( ( rule__OrderRef1__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( ( rule__OrderRef1__Group_3__0 )? )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: ( rule__OrderRef1__Group_3__0 )?
            {
             before(grammarAccess.getOrderRef1Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( rule__OrderRef1__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:2: rule__OrderRef1__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__0_in_rule__OrderRef1__Group__3__Impl4083);
                    rule__OrderRef1__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderRef1Access().getGroup_3()); 

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
    // $ANTLR end "rule__OrderRef1__Group__3__Impl"


    // $ANTLR start "rule__OrderRef1__Group__4"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: rule__OrderRef1__Group__4 : rule__OrderRef1__Group__4__Impl ;
    public final void rule__OrderRef1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( rule__OrderRef1__Group__4__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:2: rule__OrderRef1__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__4__Impl_in_rule__OrderRef1__Group__44114);
            rule__OrderRef1__Group__4__Impl();

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
    // $ANTLR end "rule__OrderRef1__Group__4"


    // $ANTLR start "rule__OrderRef1__Group__4__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: rule__OrderRef1__Group__4__Impl : ( '}' ) ;
    public final void rule__OrderRef1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: '}'
            {
             before(grammarAccess.getOrderRef1Access().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderRef1__Group__4__Impl4142); 
             after(grammarAccess.getOrderRef1Access().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__OrderRef1__Group__4__Impl"


    // $ANTLR start "rule__OrderRef1__Group_3__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: rule__OrderRef1__Group_3__0 : rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1 ;
    public final void rule__OrderRef1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:2: rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__0__Impl_in_rule__OrderRef1__Group_3__04183);
            rule__OrderRef1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__1_in_rule__OrderRef1__Group_3__04186);
            rule__OrderRef1__Group_3__1();

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
    // $ANTLR end "rule__OrderRef1__Group_3__0"


    // $ANTLR start "rule__OrderRef1__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: rule__OrderRef1__Group_3__0__Impl : ( 'orderDetail1' ) ;
    public final void rule__OrderRef1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( ( 'orderDetail1' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( 'orderDetail1' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( 'orderDetail1' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: 'orderDetail1'
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1Keyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__OrderRef1__Group_3__0__Impl4214); 
             after(grammarAccess.getOrderRef1Access().getOrderDetail1Keyword_3_0()); 

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
    // $ANTLR end "rule__OrderRef1__Group_3__0__Impl"


    // $ANTLR start "rule__OrderRef1__Group_3__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: rule__OrderRef1__Group_3__1 : rule__OrderRef1__Group_3__1__Impl ;
    public final void rule__OrderRef1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( rule__OrderRef1__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:2: rule__OrderRef1__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__1__Impl_in_rule__OrderRef1__Group_3__14245);
            rule__OrderRef1__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrderRef1__Group_3__1"


    // $ANTLR start "rule__OrderRef1__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: rule__OrderRef1__Group_3__1__Impl : ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) ) ;
    public final void rule__OrderRef1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: ( ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( rule__OrderRef1__OrderDetail1Assignment_3_1 )
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1Assignment_3_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( rule__OrderRef1__OrderDetail1Assignment_3_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:2: rule__OrderRef1__OrderDetail1Assignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__OrderDetail1Assignment_3_1_in_rule__OrderRef1__Group_3__1__Impl4272);
            rule__OrderRef1__OrderDetail1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef1Access().getOrderDetail1Assignment_3_1()); 

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
    // $ANTLR end "rule__OrderRef1__Group_3__1__Impl"


    // $ANTLR start "rule__OrderRef2__Group__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: rule__OrderRef2__Group__0 : rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1 ;
    public final void rule__OrderRef2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ( rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:2: rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__0__Impl_in_rule__OrderRef2__Group__04306);
            rule__OrderRef2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__1_in_rule__OrderRef2__Group__04309);
            rule__OrderRef2__Group__1();

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
    // $ANTLR end "rule__OrderRef2__Group__0"


    // $ANTLR start "rule__OrderRef2__Group__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: rule__OrderRef2__Group__0__Impl : ( () ) ;
    public final void rule__OrderRef2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( ( () ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ( () )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ( () )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:1: ()
            {
             before(grammarAccess.getOrderRef2Access().getOrderRef2Action_0()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: ()
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: 
            {
            }

             after(grammarAccess.getOrderRef2Access().getOrderRef2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__0__Impl"


    // $ANTLR start "rule__OrderRef2__Group__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: rule__OrderRef2__Group__1 : rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2 ;
    public final void rule__OrderRef2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ( rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:2: rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__1__Impl_in_rule__OrderRef2__Group__14367);
            rule__OrderRef2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__2_in_rule__OrderRef2__Group__14370);
            rule__OrderRef2__Group__2();

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
    // $ANTLR end "rule__OrderRef2__Group__1"


    // $ANTLR start "rule__OrderRef2__Group__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: rule__OrderRef2__Group__1__Impl : ( 'OrderRef2' ) ;
    public final void rule__OrderRef2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( ( 'OrderRef2' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: ( 'OrderRef2' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: ( 'OrderRef2' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: 'OrderRef2'
            {
             before(grammarAccess.getOrderRef2Access().getOrderRef2Keyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrderRef2__Group__1__Impl4398); 
             after(grammarAccess.getOrderRef2Access().getOrderRef2Keyword_1()); 

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
    // $ANTLR end "rule__OrderRef2__Group__1__Impl"


    // $ANTLR start "rule__OrderRef2__Group__2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: rule__OrderRef2__Group__2 : rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3 ;
    public final void rule__OrderRef2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: ( rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:2: rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__2__Impl_in_rule__OrderRef2__Group__24429);
            rule__OrderRef2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__3_in_rule__OrderRef2__Group__24432);
            rule__OrderRef2__Group__3();

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
    // $ANTLR end "rule__OrderRef2__Group__2"


    // $ANTLR start "rule__OrderRef2__Group__2__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: rule__OrderRef2__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderRef2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: ( '{' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: '{'
            {
             before(grammarAccess.getOrderRef2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderRef2__Group__2__Impl4460); 
             after(grammarAccess.getOrderRef2Access().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__OrderRef2__Group__2__Impl"


    // $ANTLR start "rule__OrderRef2__Group__3"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: rule__OrderRef2__Group__3 : rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4 ;
    public final void rule__OrderRef2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ( rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:2: rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__3__Impl_in_rule__OrderRef2__Group__34491);
            rule__OrderRef2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__4_in_rule__OrderRef2__Group__34494);
            rule__OrderRef2__Group__4();

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
    // $ANTLR end "rule__OrderRef2__Group__3"


    // $ANTLR start "rule__OrderRef2__Group__3__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: rule__OrderRef2__Group__3__Impl : ( ( rule__OrderRef2__Group_3__0 )? ) ;
    public final void rule__OrderRef2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( ( ( rule__OrderRef2__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( ( rule__OrderRef2__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( ( rule__OrderRef2__Group_3__0 )? )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( rule__OrderRef2__Group_3__0 )?
            {
             before(grammarAccess.getOrderRef2Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( rule__OrderRef2__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:2: rule__OrderRef2__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__0_in_rule__OrderRef2__Group__3__Impl4521);
                    rule__OrderRef2__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderRef2Access().getGroup_3()); 

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
    // $ANTLR end "rule__OrderRef2__Group__3__Impl"


    // $ANTLR start "rule__OrderRef2__Group__4"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: rule__OrderRef2__Group__4 : rule__OrderRef2__Group__4__Impl ;
    public final void rule__OrderRef2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( rule__OrderRef2__Group__4__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:2: rule__OrderRef2__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__4__Impl_in_rule__OrderRef2__Group__44552);
            rule__OrderRef2__Group__4__Impl();

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
    // $ANTLR end "rule__OrderRef2__Group__4"


    // $ANTLR start "rule__OrderRef2__Group__4__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: rule__OrderRef2__Group__4__Impl : ( '}' ) ;
    public final void rule__OrderRef2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( '}' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: '}'
            {
             before(grammarAccess.getOrderRef2Access().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderRef2__Group__4__Impl4580); 
             after(grammarAccess.getOrderRef2Access().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__OrderRef2__Group__4__Impl"


    // $ANTLR start "rule__OrderRef2__Group_3__0"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: rule__OrderRef2__Group_3__0 : rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1 ;
    public final void rule__OrderRef2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:2: rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__0__Impl_in_rule__OrderRef2__Group_3__04621);
            rule__OrderRef2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__1_in_rule__OrderRef2__Group_3__04624);
            rule__OrderRef2__Group_3__1();

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
    // $ANTLR end "rule__OrderRef2__Group_3__0"


    // $ANTLR start "rule__OrderRef2__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: rule__OrderRef2__Group_3__0__Impl : ( 'orderDetail2' ) ;
    public final void rule__OrderRef2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ( 'orderDetail2' ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ( 'orderDetail2' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ( 'orderDetail2' )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: 'orderDetail2'
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2Keyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrderRef2__Group_3__0__Impl4652); 
             after(grammarAccess.getOrderRef2Access().getOrderDetail2Keyword_3_0()); 

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
    // $ANTLR end "rule__OrderRef2__Group_3__0__Impl"


    // $ANTLR start "rule__OrderRef2__Group_3__1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: rule__OrderRef2__Group_3__1 : rule__OrderRef2__Group_3__1__Impl ;
    public final void rule__OrderRef2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( rule__OrderRef2__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:2: rule__OrderRef2__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__1__Impl_in_rule__OrderRef2__Group_3__14683);
            rule__OrderRef2__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrderRef2__Group_3__1"


    // $ANTLR start "rule__OrderRef2__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: rule__OrderRef2__Group_3__1__Impl : ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) ) ;
    public final void rule__OrderRef2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( rule__OrderRef2__OrderDetail2Assignment_3_1 )
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2Assignment_3_1()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( rule__OrderRef2__OrderDetail2Assignment_3_1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:2: rule__OrderRef2__OrderDetail2Assignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__OrderDetail2Assignment_3_1_in_rule__OrderRef2__Group_3__1__Impl4710);
            rule__OrderRef2__OrderDetail2Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef2Access().getOrderDetail2Assignment_3_1()); 

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
    // $ANTLR end "rule__OrderRef2__Group_3__1__Impl"


    // $ANTLR start "rule__OrdersType__Order1Assignment_4"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: rule__OrdersType__Order1Assignment_4 : ( ruleOrderDetail1 ) ;
    public final void rule__OrdersType__Order1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( ( ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:1: ruleOrderDetail1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_44749);
            ruleOrderDetail1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__OrdersType__Order1Assignment_4"


    // $ANTLR start "rule__OrdersType__Order1Assignment_5_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: rule__OrdersType__Order1Assignment_5_1 : ( ruleOrderDetail1 ) ;
    public final void rule__OrdersType__Order1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( ( ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: ( ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: ( ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ruleOrderDetail1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_5_14780);
            ruleOrderDetail1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__OrdersType__Order1Assignment_5_1"


    // $ANTLR start "rule__OrdersType__Order2Assignment_9"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: rule__OrdersType__Order2Assignment_9 : ( ruleOrderDetail2 ) ;
    public final void rule__OrdersType__Order2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( ( ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: ruleOrderDetail2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_94811);
            ruleOrderDetail2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__OrdersType__Order2Assignment_9"


    // $ANTLR start "rule__OrdersType__Order2Assignment_10_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__OrdersType__Order2Assignment_10_1 : ( ruleOrderDetail2 ) ;
    public final void rule__OrdersType__Order2Assignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( ( ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ruleOrderDetail2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_10_14842);
            ruleOrderDetail2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__OrdersType__Order2Assignment_10_1"


    // $ANTLR start "rule__OrdersType__OrderReference1Assignment_14"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: rule__OrdersType__OrderReference1Assignment_14 : ( ruleOrderRef1 ) ;
    public final void rule__OrdersType__OrderReference1Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( ( ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( ruleOrderRef1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: ruleOrderRef1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_144873);
            ruleOrderRef1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__OrdersType__OrderReference1Assignment_14"


    // $ANTLR start "rule__OrdersType__OrderReference1Assignment_15_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: rule__OrdersType__OrderReference1Assignment_15_1 : ( ruleOrderRef1 ) ;
    public final void rule__OrdersType__OrderReference1Assignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( ( ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ( ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ( ruleOrderRef1 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: ruleOrderRef1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_15_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_15_14904);
            ruleOrderRef1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_15_1_0()); 

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
    // $ANTLR end "rule__OrdersType__OrderReference1Assignment_15_1"


    // $ANTLR start "rule__OrdersType__OrderReference2Assignment_19"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: rule__OrdersType__OrderReference2Assignment_19 : ( ruleOrderRef2 ) ;
    public final void rule__OrdersType__OrderReference2Assignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:1: ( ( ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: ( ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: ( ruleOrderRef2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: ruleOrderRef2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_19_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_194935);
            ruleOrderRef2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_19_0()); 

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
    // $ANTLR end "rule__OrdersType__OrderReference2Assignment_19"


    // $ANTLR start "rule__OrdersType__OrderReference2Assignment_20_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: rule__OrdersType__OrderReference2Assignment_20_1 : ( ruleOrderRef2 ) ;
    public final void rule__OrdersType__OrderReference2Assignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( ( ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: ( ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: ( ruleOrderRef2 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:1: ruleOrderRef2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_20_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_20_14966);
            ruleOrderRef2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_20_1_0()); 

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
    // $ANTLR end "rule__OrdersType__OrderReference2Assignment_20_1"


    // $ANTLR start "rule__OrderDetail1__NameAssignment_2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: rule__OrderDetail1__NameAssignment_2 : ( ruleID0 ) ;
    public final void rule__OrderDetail1__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:1: ruleID0
            {
             before(grammarAccess.getOrderDetail1Access().getNameID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail1__NameAssignment_24997);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getNameID0ParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OrderDetail1__NameAssignment_2"


    // $ANTLR start "rule__OrderDetail1__CustomerAddressAssignment_4_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: rule__OrderDetail1__CustomerAddressAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerAddressAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerAddressAssignment_4_15028);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getCustomerAddressString0ParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__OrderDetail1__CustomerAddressAssignment_4_1"


    // $ANTLR start "rule__OrderDetail1__CustomerContactAssignment_5_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: rule__OrderDetail1__CustomerContactAssignment_5_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerContactAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactString0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerContactAssignment_5_15059);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getCustomerContactString0ParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__OrderDetail1__CustomerContactAssignment_5_1"


    // $ANTLR start "rule__OrderDetail1__CustomerNameAssignment_6_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: rule__OrderDetail1__CustomerNameAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameString0ParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerNameAssignment_6_15090);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getCustomerNameString0ParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__OrderDetail1__CustomerNameAssignment_6_1"


    // $ANTLR start "rule__OrderDetail2__NameAssignment_2"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: rule__OrderDetail2__NameAssignment_2 : ( ruleID0 ) ;
    public final void rule__OrderDetail2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ruleID0
            {
             before(grammarAccess.getOrderDetail2Access().getNameID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail2__NameAssignment_25121);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Access().getNameID0ParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OrderDetail2__NameAssignment_2"


    // $ANTLR start "rule__OrderDetail2__CustomerNameAssignment_4_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: rule__OrderDetail2__CustomerNameAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail2__CustomerNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ruleString0
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail2__CustomerNameAssignment_4_15152);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Access().getCustomerNameString0ParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__OrderDetail2__CustomerNameAssignment_4_1"


    // $ANTLR start "rule__OrderRef1__OrderDetail1Assignment_3_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: rule__OrderRef1__OrderDetail1Assignment_3_1 : ( ( ruleIDREF ) ) ;
    public final void rule__OrderRef1__OrderDetail1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( ( ( ruleIDREF ) ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( ( ruleIDREF ) )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( ( ruleIDREF ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( ruleIDREF )
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1EObjectCrossReference_3_1_0()); 
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( ruleIDREF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ruleIDREF
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1EObjectIDREFParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_rule__OrderRef1__OrderDetail1Assignment_3_15187);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getOrderRef1Access().getOrderDetail1EObjectIDREFParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrderRef1Access().getOrderDetail1EObjectCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__OrderRef1__OrderDetail1Assignment_3_1"


    // $ANTLR start "rule__OrderRef2__OrderDetail2Assignment_3_1"
    // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: rule__OrderRef2__OrderDetail2Assignment_3_1 : ( ruleIDREF ) ;
    public final void rule__OrderRef2__OrderDetail2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ( ( ruleIDREF ) )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( ruleIDREF )
            {
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( ruleIDREF )
            // ../org.xtext.example.mydsl.referencesuntyped.ui/src-gen/org/xtext/example/mydsl/referencesuntyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ruleIDREF
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2IDREFParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_rule__OrderRef2__OrderDetail2Assignment_3_15222);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getOrderRef2Access().getOrderDetail2IDREFParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OrderRef2__OrderDetail2Assignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOrdersType_in_entryRuleOrdersType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdersType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0_in_ruleOrdersType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_entryRuleOrderDetail1121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__0_in_ruleOrderDetail1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_entryRuleOrderDetail2181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__0_in_ruleOrderDetail2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_entryRuleOrderRef1241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderRef1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__0_in_ruleOrderRef1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_entryRuleOrderRef2301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderRef2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__0_in_ruleOrderRef2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIDREF514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0547 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__OrdersType__Group__0__Impl578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1609 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__1__Impl640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2671 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__2__Impl702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__3733 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__3736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__3__Impl764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__4795 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order1Assignment_4_in_rule__OrdersType__Group__4__Impl825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__5855 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__5858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl885 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__6916 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__6__Impl947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__7978 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__8_in_rule__OrdersType__Group__7981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__7__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__8__Impl_in_rule__OrdersType__Group__81040 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__9_in_rule__OrdersType__Group__81043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__8__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__9__Impl_in_rule__OrdersType__Group__91102 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__10_in_rule__OrdersType__Group__91105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order2Assignment_9_in_rule__OrdersType__Group__9__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__10__Impl_in_rule__OrdersType__Group__101162 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__11_in_rule__OrdersType__Group__101165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__0_in_rule__OrdersType__Group__10__Impl1192 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__11__Impl_in_rule__OrdersType__Group__111223 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__12_in_rule__OrdersType__Group__111226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__11__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__12__Impl_in_rule__OrdersType__Group__121285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__13_in_rule__OrdersType__Group__121288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OrdersType__Group__12__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__13__Impl_in_rule__OrdersType__Group__131347 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__14_in_rule__OrdersType__Group__131350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__13__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__14__Impl_in_rule__OrdersType__Group__141409 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__15_in_rule__OrdersType__Group__141412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference1Assignment_14_in_rule__OrdersType__Group__14__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__15__Impl_in_rule__OrdersType__Group__151469 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__16_in_rule__OrdersType__Group__151472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__0_in_rule__OrdersType__Group__15__Impl1499 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__16__Impl_in_rule__OrdersType__Group__161530 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__17_in_rule__OrdersType__Group__161533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__16__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__17__Impl_in_rule__OrdersType__Group__171592 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__18_in_rule__OrdersType__Group__171595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OrdersType__Group__17__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__18__Impl_in_rule__OrdersType__Group__181654 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__19_in_rule__OrdersType__Group__181657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__18__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__19__Impl_in_rule__OrdersType__Group__191716 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__20_in_rule__OrdersType__Group__191719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference2Assignment_19_in_rule__OrdersType__Group__19__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__20__Impl_in_rule__OrdersType__Group__201776 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__21_in_rule__OrdersType__Group__201779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__0_in_rule__OrdersType__Group__20__Impl1806 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__21__Impl_in_rule__OrdersType__Group__211837 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__22_in_rule__OrdersType__Group__211840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__21__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__22__Impl_in_rule__OrdersType__Group__221899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__22__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__02004 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__02007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_5__0__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__12066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order1Assignment_5_1_in_rule__OrdersType__Group_5__1__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__0__Impl_in_rule__OrdersType__Group_10__02127 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__1_in_rule__OrdersType__Group_10__02130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_10__0__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__1__Impl_in_rule__OrdersType__Group_10__12189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order2Assignment_10_1_in_rule__OrdersType__Group_10__1__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__0__Impl_in_rule__OrdersType__Group_15__02250 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__1_in_rule__OrdersType__Group_15__02253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_15__0__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__1__Impl_in_rule__OrdersType__Group_15__12312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference1Assignment_15_1_in_rule__OrdersType__Group_15__1__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__0__Impl_in_rule__OrdersType__Group_20__02373 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__1_in_rule__OrdersType__Group_20__02376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_20__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__1__Impl_in_rule__OrdersType__Group_20__12435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference2Assignment_20_1_in_rule__OrdersType__Group_20__1__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__0__Impl_in_rule__OrderDetail1__Group__02496 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__1_in_rule__OrderDetail1__Group__02499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__1__Impl_in_rule__OrderDetail1__Group__12557 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__2_in_rule__OrderDetail1__Group__12560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrderDetail1__Group__1__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__2__Impl_in_rule__OrderDetail1__Group__22619 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__3_in_rule__OrderDetail1__Group__22622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__NameAssignment_2_in_rule__OrderDetail1__Group__2__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__3__Impl_in_rule__OrderDetail1__Group__32679 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__4_in_rule__OrderDetail1__Group__32682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderDetail1__Group__3__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__4__Impl_in_rule__OrderDetail1__Group__42741 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__5_in_rule__OrderDetail1__Group__42744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__0_in_rule__OrderDetail1__Group__4__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__5__Impl_in_rule__OrderDetail1__Group__52802 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__6_in_rule__OrderDetail1__Group__52805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__0_in_rule__OrderDetail1__Group__5__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__6__Impl_in_rule__OrderDetail1__Group__62863 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__7_in_rule__OrderDetail1__Group__62866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__0_in_rule__OrderDetail1__Group__6__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__7__Impl_in_rule__OrderDetail1__Group__72924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderDetail1__Group__7__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__0__Impl_in_rule__OrderDetail1__Group_4__02999 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__1_in_rule__OrderDetail1__Group_4__03002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__OrderDetail1__Group_4__0__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__1__Impl_in_rule__OrderDetail1__Group_4__13061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerAddressAssignment_4_1_in_rule__OrderDetail1__Group_4__1__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__0__Impl_in_rule__OrderDetail1__Group_5__03122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__1_in_rule__OrderDetail1__Group_5__03125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OrderDetail1__Group_5__0__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__1__Impl_in_rule__OrderDetail1__Group_5__13184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerContactAssignment_5_1_in_rule__OrderDetail1__Group_5__1__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__0__Impl_in_rule__OrderDetail1__Group_6__03245 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__1_in_rule__OrderDetail1__Group_6__03248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OrderDetail1__Group_6__0__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__1__Impl_in_rule__OrderDetail1__Group_6__13307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerNameAssignment_6_1_in_rule__OrderDetail1__Group_6__1__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__0__Impl_in_rule__OrderDetail2__Group__03368 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__1_in_rule__OrderDetail2__Group__03371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__1__Impl_in_rule__OrderDetail2__Group__13429 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__2_in_rule__OrderDetail2__Group__13432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__OrderDetail2__Group__1__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__2__Impl_in_rule__OrderDetail2__Group__23491 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__3_in_rule__OrderDetail2__Group__23494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__NameAssignment_2_in_rule__OrderDetail2__Group__2__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__3__Impl_in_rule__OrderDetail2__Group__33551 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__4_in_rule__OrderDetail2__Group__33554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderDetail2__Group__3__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__4__Impl_in_rule__OrderDetail2__Group__43613 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__5_in_rule__OrderDetail2__Group__43616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__0_in_rule__OrderDetail2__Group__4__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__5__Impl_in_rule__OrderDetail2__Group__53674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderDetail2__Group__5__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__0__Impl_in_rule__OrderDetail2__Group_4__03745 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__1_in_rule__OrderDetail2__Group_4__03748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OrderDetail2__Group_4__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__1__Impl_in_rule__OrderDetail2__Group_4__13807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__CustomerNameAssignment_4_1_in_rule__OrderDetail2__Group_4__1__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__0__Impl_in_rule__OrderRef1__Group__03868 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__1_in_rule__OrderRef1__Group__03871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__1__Impl_in_rule__OrderRef1__Group__13929 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__2_in_rule__OrderRef1__Group__13932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__OrderRef1__Group__1__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__2__Impl_in_rule__OrderRef1__Group__23991 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__3_in_rule__OrderRef1__Group__23994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderRef1__Group__2__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__3__Impl_in_rule__OrderRef1__Group__34053 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__4_in_rule__OrderRef1__Group__34056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__0_in_rule__OrderRef1__Group__3__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__4__Impl_in_rule__OrderRef1__Group__44114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderRef1__Group__4__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__0__Impl_in_rule__OrderRef1__Group_3__04183 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__1_in_rule__OrderRef1__Group_3__04186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__OrderRef1__Group_3__0__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__1__Impl_in_rule__OrderRef1__Group_3__14245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__OrderDetail1Assignment_3_1_in_rule__OrderRef1__Group_3__1__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__0__Impl_in_rule__OrderRef2__Group__04306 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__1_in_rule__OrderRef2__Group__04309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__1__Impl_in_rule__OrderRef2__Group__14367 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__2_in_rule__OrderRef2__Group__14370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrderRef2__Group__1__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__2__Impl_in_rule__OrderRef2__Group__24429 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__3_in_rule__OrderRef2__Group__24432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderRef2__Group__2__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__3__Impl_in_rule__OrderRef2__Group__34491 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__4_in_rule__OrderRef2__Group__34494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__0_in_rule__OrderRef2__Group__3__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__4__Impl_in_rule__OrderRef2__Group__44552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderRef2__Group__4__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__0__Impl_in_rule__OrderRef2__Group_3__04621 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__1_in_rule__OrderRef2__Group_3__04624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrderRef2__Group_3__0__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__1__Impl_in_rule__OrderRef2__Group_3__14683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__OrderDetail2Assignment_3_1_in_rule__OrderRef2__Group_3__1__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_44749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_5_14780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_94811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_10_14842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_144873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_15_14904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_194935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_20_14966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail1__NameAssignment_24997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerAddressAssignment_4_15028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerContactAssignment_5_15059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerNameAssignment_6_15090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail2__NameAssignment_25121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail2__CustomerNameAssignment_4_15152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_rule__OrderRef1__OrderDetail1Assignment_3_15187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_rule__OrderRef2__OrderDetail2Assignment_3_15222 = new BitSet(new long[]{0x0000000000000002L});
    }


}