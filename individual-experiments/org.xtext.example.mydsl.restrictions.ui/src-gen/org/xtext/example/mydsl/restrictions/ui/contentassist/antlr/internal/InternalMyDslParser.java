package org.xtext.example.mydsl.restrictions.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.restrictions.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ID'", "'A_K'", "'L_T'", "'U_Z'", "'OrdersType'", "'{'", "'order'", "'}'", "','", "'OrderDetail'", "'customerAddress'", "'customerAge'", "'customerContact1'", "'customerFirstName'", "'customerLastName'", "'customerNumber'", "'customerPassword'", "'customerUSState'", "'RestrictedAddress'", "'street'", "'city'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleOrdersType : ruleOrdersType EOF ;
    public final void entryRuleOrdersType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleOrdersType EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleOrdersType EOF
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleOrdersType : ( ( rule__OrdersType__Group__0 ) ) ;
    public final void ruleOrdersType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__OrdersType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__OrdersType__Group__0 )
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__OrdersType__Group__0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__OrdersType__Group__0
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


    // $ANTLR start "entryRuleOrderDetail"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleOrderDetail : ruleOrderDetail EOF ;
    public final void entryRuleOrderDetail() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleOrderDetail EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleOrderDetail EOF
            {
             before(grammarAccess.getOrderDetailRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail_in_entryRuleOrderDetail121);
            ruleOrderDetail();

            state._fsp--;

             after(grammarAccess.getOrderDetailRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail128); 

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
    // $ANTLR end "entryRuleOrderDetail"


    // $ANTLR start "ruleOrderDetail"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleOrderDetail : ( ( rule__OrderDetail__Group__0 ) ) ;
    public final void ruleOrderDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__OrderDetail__Group__0 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail__Group__0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__OrderDetail__Group__0 )
            {
             before(grammarAccess.getOrderDetailAccess().getGroup()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__OrderDetail__Group__0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__OrderDetail__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__0_in_ruleOrderDetail154);
            rule__OrderDetail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderDetail"


    // $ANTLR start "entryRuleRestrictedAddress"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleRestrictedAddress : ruleRestrictedAddress EOF ;
    public final void entryRuleRestrictedAddress() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleRestrictedAddress EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleRestrictedAddress EOF
            {
             before(grammarAccess.getRestrictedAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedAddress_in_entryRuleRestrictedAddress181);
            ruleRestrictedAddress();

            state._fsp--;

             after(grammarAccess.getRestrictedAddressRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedAddress188); 

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
    // $ANTLR end "entryRuleRestrictedAddress"


    // $ANTLR start "ruleRestrictedAddress"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleRestrictedAddress : ( ( rule__RestrictedAddress__Group__0 ) ) ;
    public final void ruleRestrictedAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__RestrictedAddress__Group__0 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__RestrictedAddress__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__RestrictedAddress__Group__0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__RestrictedAddress__Group__0 )
            {
             before(grammarAccess.getRestrictedAddressAccess().getGroup()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__RestrictedAddress__Group__0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__RestrictedAddress__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__0_in_ruleRestrictedAddress214);
            rule__RestrictedAddress__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedAddress"


    // $ANTLR start "entryRuleCustomerAge"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleCustomerAge : ruleCustomerAge EOF ;
    public final void entryRuleCustomerAge() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleCustomerAge EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleCustomerAge EOF
            {
             before(grammarAccess.getCustomerAgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerAge_in_entryRuleCustomerAge241);
            ruleCustomerAge();

            state._fsp--;

             after(grammarAccess.getCustomerAgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerAge248); 

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
    // $ANTLR end "entryRuleCustomerAge"


    // $ANTLR start "ruleCustomerAge"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleCustomerAge : ( RULE_INT ) ;
    public final void ruleCustomerAge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: RULE_INT
            {
             before(grammarAccess.getCustomerAgeAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCustomerAge274); 
             after(grammarAccess.getCustomerAgeAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerAge"


    // $ANTLR start "entryRuleCustomerContactNumber1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleCustomerContactNumber1 : ruleCustomerContactNumber1 EOF ;
    public final void entryRuleCustomerContactNumber1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleCustomerContactNumber1 EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleCustomerContactNumber1 EOF
            {
             before(grammarAccess.getCustomerContactNumber1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerContactNumber1_in_entryRuleCustomerContactNumber1300);
            ruleCustomerContactNumber1();

            state._fsp--;

             after(grammarAccess.getCustomerContactNumber1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerContactNumber1307); 

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
    // $ANTLR end "entryRuleCustomerContactNumber1"


    // $ANTLR start "ruleCustomerContactNumber1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleCustomerContactNumber1 : ( RULE_INT ) ;
    public final void ruleCustomerContactNumber1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: RULE_INT
            {
             before(grammarAccess.getCustomerContactNumber1Access().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCustomerContactNumber1333); 
             after(grammarAccess.getCustomerContactNumber1Access().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerContactNumber1"


    // $ANTLR start "entryRuleCustomerFirstName"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleCustomerFirstName : ruleCustomerFirstName EOF ;
    public final void entryRuleCustomerFirstName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleCustomerFirstName EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleCustomerFirstName EOF
            {
             before(grammarAccess.getCustomerFirstNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerFirstName_in_entryRuleCustomerFirstName359);
            ruleCustomerFirstName();

            state._fsp--;

             after(grammarAccess.getCustomerFirstNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerFirstName366); 

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
    // $ANTLR end "entryRuleCustomerFirstName"


    // $ANTLR start "ruleCustomerFirstName"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleCustomerFirstName : ( RULE_STRING ) ;
    public final void ruleCustomerFirstName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: RULE_STRING
            {
             before(grammarAccess.getCustomerFirstNameAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerFirstName392); 
             after(grammarAccess.getCustomerFirstNameAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerFirstName"


    // $ANTLR start "entryRuleCustomerLastName"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleCustomerLastName : ruleCustomerLastName EOF ;
    public final void entryRuleCustomerLastName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleCustomerLastName EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleCustomerLastName EOF
            {
             before(grammarAccess.getCustomerLastNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerLastName_in_entryRuleCustomerLastName418);
            ruleCustomerLastName();

            state._fsp--;

             after(grammarAccess.getCustomerLastNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerLastName425); 

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
    // $ANTLR end "entryRuleCustomerLastName"


    // $ANTLR start "ruleCustomerLastName"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleCustomerLastName : ( RULE_STRING ) ;
    public final void ruleCustomerLastName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: RULE_STRING
            {
             before(grammarAccess.getCustomerLastNameAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerLastName451); 
             after(grammarAccess.getCustomerLastNameAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerLastName"


    // $ANTLR start "entryRuleCustomerNumber"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleCustomerNumber : ruleCustomerNumber EOF ;
    public final void entryRuleCustomerNumber() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleCustomerNumber EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleCustomerNumber EOF
            {
             before(grammarAccess.getCustomerNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerNumber_in_entryRuleCustomerNumber477);
            ruleCustomerNumber();

            state._fsp--;

             after(grammarAccess.getCustomerNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerNumber484); 

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
    // $ANTLR end "entryRuleCustomerNumber"


    // $ANTLR start "ruleCustomerNumber"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleCustomerNumber : ( RULE_STRING ) ;
    public final void ruleCustomerNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: RULE_STRING
            {
             before(grammarAccess.getCustomerNumberAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerNumber510); 
             after(grammarAccess.getCustomerNumberAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerNumber"


    // $ANTLR start "entryRuleCustomerPassword"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleCustomerPassword : ruleCustomerPassword EOF ;
    public final void entryRuleCustomerPassword() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleCustomerPassword EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleCustomerPassword EOF
            {
             before(grammarAccess.getCustomerPasswordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerPassword_in_entryRuleCustomerPassword536);
            ruleCustomerPassword();

            state._fsp--;

             after(grammarAccess.getCustomerPasswordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerPassword543); 

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
    // $ANTLR end "entryRuleCustomerPassword"


    // $ANTLR start "ruleCustomerPassword"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleCustomerPassword : ( RULE_STRING ) ;
    public final void ruleCustomerPassword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: RULE_STRING
            {
             before(grammarAccess.getCustomerPasswordAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerPassword569); 
             after(grammarAccess.getCustomerPasswordAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerPassword"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleID0 EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0595);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0602); 

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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleID0 : ( 'ID' ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( 'ID' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( 'ID' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( 'ID' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: 'ID'
            {
             before(grammarAccess.getID0Access().getIDKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleID0629); 
             after(grammarAccess.getID0Access().getIDKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0657);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0664); 

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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:351:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:355:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0690); 
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


    // $ANTLR start "ruleUSState"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ruleUSState : ( ( rule__USState__Alternatives ) ) ;
    public final void ruleUSState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( ( ( rule__USState__Alternatives ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( ( rule__USState__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( ( rule__USState__Alternatives ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( rule__USState__Alternatives )
            {
             before(grammarAccess.getUSStateAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ( rule__USState__Alternatives )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:378:2: rule__USState__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__USState__Alternatives_in_ruleUSState726);
            rule__USState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUSStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUSState"


    // $ANTLR start "rule__USState__Alternatives"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: rule__USState__Alternatives : ( ( ( 'A_K' ) ) | ( ( 'L_T' ) ) | ( ( 'U_Z' ) ) );
    public final void rule__USState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( ( ( 'A_K' ) ) | ( ( 'L_T' ) ) | ( ( 'U_Z' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( ( 'A_K' ) )
                    {
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( ( 'A_K' ) )
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: ( 'A_K' )
                    {
                     before(grammarAccess.getUSStateAccess().getA_KEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: ( 'A_K' )
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:396:3: 'A_K'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__USState__Alternatives762); 

                    }

                     after(grammarAccess.getUSStateAccess().getA_KEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:401:6: ( ( 'L_T' ) )
                    {
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:401:6: ( ( 'L_T' ) )
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( 'L_T' )
                    {
                     before(grammarAccess.getUSStateAccess().getL_TEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( 'L_T' )
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:403:3: 'L_T'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__USState__Alternatives783); 

                    }

                     after(grammarAccess.getUSStateAccess().getL_TEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:408:6: ( ( 'U_Z' ) )
                    {
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:408:6: ( ( 'U_Z' ) )
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:409:1: ( 'U_Z' )
                    {
                     before(grammarAccess.getUSStateAccess().getU_ZEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( 'U_Z' )
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:410:3: 'U_Z'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__USState__Alternatives804); 

                    }

                     after(grammarAccess.getUSStateAccess().getU_ZEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__USState__Alternatives"


    // $ANTLR start "rule__OrdersType__Group__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:422:1: rule__OrdersType__Group__0 : rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 ;
    public final void rule__OrdersType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:427:2: rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0837);
            rule__OrdersType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0840);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: rule__OrdersType__Group__0__Impl : ( 'OrdersType' ) ;
    public final void rule__OrdersType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( 'OrdersType' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( 'OrdersType' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( 'OrdersType' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: 'OrdersType'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__0__Impl868); 
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: rule__OrdersType__Group__1 : rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 ;
    public final void rule__OrdersType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:458:2: rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1899);
            rule__OrdersType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1902);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: rule__OrdersType__Group__1__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( '{' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OrdersType__Group__1__Impl930); 
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: rule__OrdersType__Group__2 : rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 ;
    public final void rule__OrdersType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:489:2: rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2961);
            rule__OrdersType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2964);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: rule__OrdersType__Group__2__Impl : ( 'order' ) ;
    public final void rule__OrdersType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: ( ( 'order' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( 'order' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( 'order' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: 'order'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OrdersType__Group__2__Impl992); 
             after(grammarAccess.getOrdersTypeAccess().getOrderKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: rule__OrdersType__Group__3 : rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 ;
    public final void rule__OrdersType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ( rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:520:2: rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__31023);
            rule__OrdersType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__31026);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: rule__OrdersType__Group__3__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:531:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( '{' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OrdersType__Group__3__Impl1054); 
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: rule__OrdersType__Group__4 : rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 ;
    public final void rule__OrdersType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:551:2: rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__41085);
            rule__OrdersType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__41088);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: rule__OrdersType__Group__4__Impl : ( ( rule__OrdersType__OrderAssignment_4 ) ) ;
    public final void rule__OrdersType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:562:1: ( ( ( rule__OrdersType__OrderAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( ( rule__OrdersType__OrderAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( ( rule__OrdersType__OrderAssignment_4 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( rule__OrdersType__OrderAssignment_4 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderAssignment_4()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( rule__OrdersType__OrderAssignment_4 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:565:2: rule__OrdersType__OrderAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderAssignment_4_in_rule__OrdersType__Group__4__Impl1115);
            rule__OrdersType__OrderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: rule__OrdersType__Group__5 : rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 ;
    public final void rule__OrdersType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__51145);
            rule__OrdersType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__51148);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: rule__OrdersType__Group__5__Impl : ( ( rule__OrdersType__Group_5__0 )* ) ;
    public final void rule__OrdersType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( ( ( rule__OrdersType__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: ( ( rule__OrdersType__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: ( ( rule__OrdersType__Group_5__0 )* )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( rule__OrdersType__Group_5__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( rule__OrdersType__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:594:2: rule__OrdersType__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl1175);
            	    rule__OrdersType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: rule__OrdersType__Group__6 : rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 ;
    public final void rule__OrdersType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:609:2: rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__61206);
            rule__OrdersType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__61209);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: rule__OrdersType__Group__6__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( '}' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group__6__Impl1237); 
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: rule__OrdersType__Group__7 : rule__OrdersType__Group__7__Impl ;
    public final void rule__OrdersType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( rule__OrdersType__Group__7__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:640:2: rule__OrdersType__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__71268);
            rule__OrdersType__Group__7__Impl();

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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: rule__OrdersType__Group__7__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( '}' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group__7__Impl1296); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrdersType__Group_5__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: rule__OrdersType__Group_5__0 : rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 ;
    public final void rule__OrdersType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:686:2: rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__01343);
            rule__OrdersType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__01346);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: rule__OrdersType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ',' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrdersType__Group_5__0__Impl1374); 
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: rule__OrdersType__Group_5__1 : rule__OrdersType__Group_5__1__Impl ;
    public final void rule__OrdersType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( rule__OrdersType__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: rule__OrdersType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__11405);
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
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: rule__OrdersType__Group_5__1__Impl : ( ( rule__OrdersType__OrderAssignment_5_1 ) ) ;
    public final void rule__OrdersType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( ( ( rule__OrdersType__OrderAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( ( rule__OrdersType__OrderAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( ( rule__OrdersType__OrderAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( rule__OrdersType__OrderAssignment_5_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderAssignment_5_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( rule__OrdersType__OrderAssignment_5_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:730:2: rule__OrdersType__OrderAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderAssignment_5_1_in_rule__OrdersType__Group_5__1__Impl1432);
            rule__OrdersType__OrderAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrderDetail__Group__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: rule__OrderDetail__Group__0 : rule__OrderDetail__Group__0__Impl rule__OrderDetail__Group__1 ;
    public final void rule__OrderDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__OrderDetail__Group__0__Impl rule__OrderDetail__Group__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:749:2: rule__OrderDetail__Group__0__Impl rule__OrderDetail__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__0__Impl_in_rule__OrderDetail__Group__01466);
            rule__OrderDetail__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__1_in_rule__OrderDetail__Group__01469);
            rule__OrderDetail__Group__1();

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
    // $ANTLR end "rule__OrderDetail__Group__0"


    // $ANTLR start "rule__OrderDetail__Group__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: rule__OrderDetail__Group__0__Impl : ( 'OrderDetail' ) ;
    public final void rule__OrderDetail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( ( 'OrderDetail' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( 'OrderDetail' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( 'OrderDetail' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: 'OrderDetail'
            {
             before(grammarAccess.getOrderDetailAccess().getOrderDetailKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__OrderDetail__Group__0__Impl1497); 
             after(grammarAccess.getOrderDetailAccess().getOrderDetailKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: rule__OrderDetail__Group__1 : rule__OrderDetail__Group__1__Impl rule__OrderDetail__Group__2 ;
    public final void rule__OrderDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( rule__OrderDetail__Group__1__Impl rule__OrderDetail__Group__2 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:780:2: rule__OrderDetail__Group__1__Impl rule__OrderDetail__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__1__Impl_in_rule__OrderDetail__Group__11528);
            rule__OrderDetail__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__2_in_rule__OrderDetail__Group__11531);
            rule__OrderDetail__Group__2();

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
    // $ANTLR end "rule__OrderDetail__Group__1"


    // $ANTLR start "rule__OrderDetail__Group__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: rule__OrderDetail__Group__1__Impl : ( ( rule__OrderDetail__OrderIDAssignment_1 ) ) ;
    public final void rule__OrderDetail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( ( ( rule__OrderDetail__OrderIDAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ( ( rule__OrderDetail__OrderIDAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ( ( rule__OrderDetail__OrderIDAssignment_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( rule__OrderDetail__OrderIDAssignment_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getOrderIDAssignment_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( rule__OrderDetail__OrderIDAssignment_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:794:2: rule__OrderDetail__OrderIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__OrderIDAssignment_1_in_rule__OrderDetail__Group__1__Impl1558);
            rule__OrderDetail__OrderIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getOrderIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group__2"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: rule__OrderDetail__Group__2 : rule__OrderDetail__Group__2__Impl rule__OrderDetail__Group__3 ;
    public final void rule__OrderDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: ( rule__OrderDetail__Group__2__Impl rule__OrderDetail__Group__3 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:809:2: rule__OrderDetail__Group__2__Impl rule__OrderDetail__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__2__Impl_in_rule__OrderDetail__Group__21588);
            rule__OrderDetail__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__3_in_rule__OrderDetail__Group__21591);
            rule__OrderDetail__Group__3();

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
    // $ANTLR end "rule__OrderDetail__Group__2"


    // $ANTLR start "rule__OrderDetail__Group__2__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: rule__OrderDetail__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderDetail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( '{' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: '{'
            {
             before(grammarAccess.getOrderDetailAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OrderDetail__Group__2__Impl1619); 
             after(grammarAccess.getOrderDetailAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__2__Impl"


    // $ANTLR start "rule__OrderDetail__Group__3"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: rule__OrderDetail__Group__3 : rule__OrderDetail__Group__3__Impl rule__OrderDetail__Group__4 ;
    public final void rule__OrderDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( rule__OrderDetail__Group__3__Impl rule__OrderDetail__Group__4 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:840:2: rule__OrderDetail__Group__3__Impl rule__OrderDetail__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__3__Impl_in_rule__OrderDetail__Group__31650);
            rule__OrderDetail__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__4_in_rule__OrderDetail__Group__31653);
            rule__OrderDetail__Group__4();

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
    // $ANTLR end "rule__OrderDetail__Group__3"


    // $ANTLR start "rule__OrderDetail__Group__3__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: rule__OrderDetail__Group__3__Impl : ( ( rule__OrderDetail__Group_3__0 )? ) ;
    public final void rule__OrderDetail__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( ( ( rule__OrderDetail__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( ( rule__OrderDetail__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( ( rule__OrderDetail__Group_3__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( rule__OrderDetail__Group_3__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( rule__OrderDetail__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:854:2: rule__OrderDetail__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_3__0_in_rule__OrderDetail__Group__3__Impl1680);
                    rule__OrderDetail__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__3__Impl"


    // $ANTLR start "rule__OrderDetail__Group__4"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: rule__OrderDetail__Group__4 : rule__OrderDetail__Group__4__Impl rule__OrderDetail__Group__5 ;
    public final void rule__OrderDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( rule__OrderDetail__Group__4__Impl rule__OrderDetail__Group__5 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:869:2: rule__OrderDetail__Group__4__Impl rule__OrderDetail__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__4__Impl_in_rule__OrderDetail__Group__41711);
            rule__OrderDetail__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__5_in_rule__OrderDetail__Group__41714);
            rule__OrderDetail__Group__5();

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
    // $ANTLR end "rule__OrderDetail__Group__4"


    // $ANTLR start "rule__OrderDetail__Group__4__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: rule__OrderDetail__Group__4__Impl : ( ( rule__OrderDetail__Group_4__0 )? ) ;
    public final void rule__OrderDetail__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( ( rule__OrderDetail__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ( rule__OrderDetail__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ( rule__OrderDetail__Group_4__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( rule__OrderDetail__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( rule__OrderDetail__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:883:2: rule__OrderDetail__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_4__0_in_rule__OrderDetail__Group__4__Impl1741);
                    rule__OrderDetail__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__4__Impl"


    // $ANTLR start "rule__OrderDetail__Group__5"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: rule__OrderDetail__Group__5 : rule__OrderDetail__Group__5__Impl rule__OrderDetail__Group__6 ;
    public final void rule__OrderDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( rule__OrderDetail__Group__5__Impl rule__OrderDetail__Group__6 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:898:2: rule__OrderDetail__Group__5__Impl rule__OrderDetail__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__5__Impl_in_rule__OrderDetail__Group__51772);
            rule__OrderDetail__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__6_in_rule__OrderDetail__Group__51775);
            rule__OrderDetail__Group__6();

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
    // $ANTLR end "rule__OrderDetail__Group__5"


    // $ANTLR start "rule__OrderDetail__Group__5__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__OrderDetail__Group__5__Impl : ( ( rule__OrderDetail__Group_5__0 )? ) ;
    public final void rule__OrderDetail__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ( ( rule__OrderDetail__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ( rule__OrderDetail__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ( rule__OrderDetail__Group_5__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( rule__OrderDetail__Group_5__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( rule__OrderDetail__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:912:2: rule__OrderDetail__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_5__0_in_rule__OrderDetail__Group__5__Impl1802);
                    rule__OrderDetail__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__5__Impl"


    // $ANTLR start "rule__OrderDetail__Group__6"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: rule__OrderDetail__Group__6 : rule__OrderDetail__Group__6__Impl rule__OrderDetail__Group__7 ;
    public final void rule__OrderDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ( rule__OrderDetail__Group__6__Impl rule__OrderDetail__Group__7 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:927:2: rule__OrderDetail__Group__6__Impl rule__OrderDetail__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__6__Impl_in_rule__OrderDetail__Group__61833);
            rule__OrderDetail__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__7_in_rule__OrderDetail__Group__61836);
            rule__OrderDetail__Group__7();

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
    // $ANTLR end "rule__OrderDetail__Group__6"


    // $ANTLR start "rule__OrderDetail__Group__6__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: rule__OrderDetail__Group__6__Impl : ( ( rule__OrderDetail__Group_6__0 )? ) ;
    public final void rule__OrderDetail__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( ( ( rule__OrderDetail__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ( rule__OrderDetail__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ( rule__OrderDetail__Group_6__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__OrderDetail__Group_6__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__OrderDetail__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: rule__OrderDetail__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_6__0_in_rule__OrderDetail__Group__6__Impl1863);
                    rule__OrderDetail__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__6__Impl"


    // $ANTLR start "rule__OrderDetail__Group__7"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: rule__OrderDetail__Group__7 : rule__OrderDetail__Group__7__Impl rule__OrderDetail__Group__8 ;
    public final void rule__OrderDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__OrderDetail__Group__7__Impl rule__OrderDetail__Group__8 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:956:2: rule__OrderDetail__Group__7__Impl rule__OrderDetail__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__7__Impl_in_rule__OrderDetail__Group__71894);
            rule__OrderDetail__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__8_in_rule__OrderDetail__Group__71897);
            rule__OrderDetail__Group__8();

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
    // $ANTLR end "rule__OrderDetail__Group__7"


    // $ANTLR start "rule__OrderDetail__Group__7__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: rule__OrderDetail__Group__7__Impl : ( ( rule__OrderDetail__Group_7__0 )? ) ;
    public final void rule__OrderDetail__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( ( ( rule__OrderDetail__Group_7__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( ( rule__OrderDetail__Group_7__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( ( rule__OrderDetail__Group_7__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( rule__OrderDetail__Group_7__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_7()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( rule__OrderDetail__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:970:2: rule__OrderDetail__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_7__0_in_rule__OrderDetail__Group__7__Impl1924);
                    rule__OrderDetail__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__7__Impl"


    // $ANTLR start "rule__OrderDetail__Group__8"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: rule__OrderDetail__Group__8 : rule__OrderDetail__Group__8__Impl rule__OrderDetail__Group__9 ;
    public final void rule__OrderDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: ( rule__OrderDetail__Group__8__Impl rule__OrderDetail__Group__9 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:985:2: rule__OrderDetail__Group__8__Impl rule__OrderDetail__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__8__Impl_in_rule__OrderDetail__Group__81955);
            rule__OrderDetail__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__9_in_rule__OrderDetail__Group__81958);
            rule__OrderDetail__Group__9();

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
    // $ANTLR end "rule__OrderDetail__Group__8"


    // $ANTLR start "rule__OrderDetail__Group__8__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: rule__OrderDetail__Group__8__Impl : ( ( rule__OrderDetail__Group_8__0 )? ) ;
    public final void rule__OrderDetail__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( ( ( rule__OrderDetail__Group_8__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( rule__OrderDetail__Group_8__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( rule__OrderDetail__Group_8__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( rule__OrderDetail__Group_8__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_8()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__OrderDetail__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:999:2: rule__OrderDetail__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_8__0_in_rule__OrderDetail__Group__8__Impl1985);
                    rule__OrderDetail__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__8__Impl"


    // $ANTLR start "rule__OrderDetail__Group__9"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: rule__OrderDetail__Group__9 : rule__OrderDetail__Group__9__Impl rule__OrderDetail__Group__10 ;
    public final void rule__OrderDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( rule__OrderDetail__Group__9__Impl rule__OrderDetail__Group__10 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:2: rule__OrderDetail__Group__9__Impl rule__OrderDetail__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__9__Impl_in_rule__OrderDetail__Group__92016);
            rule__OrderDetail__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__10_in_rule__OrderDetail__Group__92019);
            rule__OrderDetail__Group__10();

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
    // $ANTLR end "rule__OrderDetail__Group__9"


    // $ANTLR start "rule__OrderDetail__Group__9__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: rule__OrderDetail__Group__9__Impl : ( ( rule__OrderDetail__Group_9__0 )? ) ;
    public final void rule__OrderDetail__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( ( ( rule__OrderDetail__Group_9__0 )? ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( rule__OrderDetail__Group_9__0 )? )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( rule__OrderDetail__Group_9__0 )? )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ( rule__OrderDetail__Group_9__0 )?
            {
             before(grammarAccess.getOrderDetailAccess().getGroup_9()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( rule__OrderDetail__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:2: rule__OrderDetail__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_9__0_in_rule__OrderDetail__Group__9__Impl2046);
                    rule__OrderDetail__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetailAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__9__Impl"


    // $ANTLR start "rule__OrderDetail__Group__10"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: rule__OrderDetail__Group__10 : rule__OrderDetail__Group__10__Impl rule__OrderDetail__Group__11 ;
    public final void rule__OrderDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( rule__OrderDetail__Group__10__Impl rule__OrderDetail__Group__11 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:2: rule__OrderDetail__Group__10__Impl rule__OrderDetail__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__10__Impl_in_rule__OrderDetail__Group__102077);
            rule__OrderDetail__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__11_in_rule__OrderDetail__Group__102080);
            rule__OrderDetail__Group__11();

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
    // $ANTLR end "rule__OrderDetail__Group__10"


    // $ANTLR start "rule__OrderDetail__Group__10__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: rule__OrderDetail__Group__10__Impl : ( 'customerAddress' ) ;
    public final void rule__OrderDetail__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( 'customerAddress' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( 'customerAddress' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( 'customerAddress' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: 'customerAddress'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerAddressKeyword_10()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OrderDetail__Group__10__Impl2108); 
             after(grammarAccess.getOrderDetailAccess().getCustomerAddressKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__10__Impl"


    // $ANTLR start "rule__OrderDetail__Group__11"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: rule__OrderDetail__Group__11 : rule__OrderDetail__Group__11__Impl rule__OrderDetail__Group__12 ;
    public final void rule__OrderDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( rule__OrderDetail__Group__11__Impl rule__OrderDetail__Group__12 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:2: rule__OrderDetail__Group__11__Impl rule__OrderDetail__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__11__Impl_in_rule__OrderDetail__Group__112139);
            rule__OrderDetail__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__12_in_rule__OrderDetail__Group__112142);
            rule__OrderDetail__Group__12();

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
    // $ANTLR end "rule__OrderDetail__Group__11"


    // $ANTLR start "rule__OrderDetail__Group__11__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: rule__OrderDetail__Group__11__Impl : ( ( rule__OrderDetail__CustomerAddressAssignment_11 ) ) ;
    public final void rule__OrderDetail__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( ( ( rule__OrderDetail__CustomerAddressAssignment_11 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( ( rule__OrderDetail__CustomerAddressAssignment_11 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( ( rule__OrderDetail__CustomerAddressAssignment_11 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( rule__OrderDetail__CustomerAddressAssignment_11 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerAddressAssignment_11()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( rule__OrderDetail__CustomerAddressAssignment_11 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:2: rule__OrderDetail__CustomerAddressAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerAddressAssignment_11_in_rule__OrderDetail__Group__11__Impl2169);
            rule__OrderDetail__CustomerAddressAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerAddressAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__11__Impl"


    // $ANTLR start "rule__OrderDetail__Group__12"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: rule__OrderDetail__Group__12 : rule__OrderDetail__Group__12__Impl ;
    public final void rule__OrderDetail__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ( rule__OrderDetail__Group__12__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:2: rule__OrderDetail__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group__12__Impl_in_rule__OrderDetail__Group__122199);
            rule__OrderDetail__Group__12__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group__12"


    // $ANTLR start "rule__OrderDetail__Group__12__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: rule__OrderDetail__Group__12__Impl : ( '}' ) ;
    public final void rule__OrderDetail__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( '}' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: '}'
            {
             before(grammarAccess.getOrderDetailAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrderDetail__Group__12__Impl2227); 
             after(grammarAccess.getOrderDetailAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group__12__Impl"


    // $ANTLR start "rule__OrderDetail__Group_3__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: rule__OrderDetail__Group_3__0 : rule__OrderDetail__Group_3__0__Impl rule__OrderDetail__Group_3__1 ;
    public final void rule__OrderDetail__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( rule__OrderDetail__Group_3__0__Impl rule__OrderDetail__Group_3__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:2: rule__OrderDetail__Group_3__0__Impl rule__OrderDetail__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_3__0__Impl_in_rule__OrderDetail__Group_3__02284);
            rule__OrderDetail__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_3__1_in_rule__OrderDetail__Group_3__02287);
            rule__OrderDetail__Group_3__1();

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
    // $ANTLR end "rule__OrderDetail__Group_3__0"


    // $ANTLR start "rule__OrderDetail__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: rule__OrderDetail__Group_3__0__Impl : ( 'customerAge' ) ;
    public final void rule__OrderDetail__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( ( 'customerAge' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( 'customerAge' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( 'customerAge' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: 'customerAge'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerAgeKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OrderDetail__Group_3__0__Impl2315); 
             after(grammarAccess.getOrderDetailAccess().getCustomerAgeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_3__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_3__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: rule__OrderDetail__Group_3__1 : rule__OrderDetail__Group_3__1__Impl ;
    public final void rule__OrderDetail__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( rule__OrderDetail__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:2: rule__OrderDetail__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_3__1__Impl_in_rule__OrderDetail__Group_3__12346);
            rule__OrderDetail__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_3__1"


    // $ANTLR start "rule__OrderDetail__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__OrderDetail__Group_3__1__Impl : ( ( rule__OrderDetail__CustomerAgeAssignment_3_1 ) ) ;
    public final void rule__OrderDetail__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( ( rule__OrderDetail__CustomerAgeAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__OrderDetail__CustomerAgeAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__OrderDetail__CustomerAgeAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__OrderDetail__CustomerAgeAssignment_3_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerAgeAssignment_3_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( rule__OrderDetail__CustomerAgeAssignment_3_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: rule__OrderDetail__CustomerAgeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerAgeAssignment_3_1_in_rule__OrderDetail__Group_3__1__Impl2373);
            rule__OrderDetail__CustomerAgeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerAgeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_3__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group_4__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: rule__OrderDetail__Group_4__0 : rule__OrderDetail__Group_4__0__Impl rule__OrderDetail__Group_4__1 ;
    public final void rule__OrderDetail__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( rule__OrderDetail__Group_4__0__Impl rule__OrderDetail__Group_4__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:2: rule__OrderDetail__Group_4__0__Impl rule__OrderDetail__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_4__0__Impl_in_rule__OrderDetail__Group_4__02407);
            rule__OrderDetail__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_4__1_in_rule__OrderDetail__Group_4__02410);
            rule__OrderDetail__Group_4__1();

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
    // $ANTLR end "rule__OrderDetail__Group_4__0"


    // $ANTLR start "rule__OrderDetail__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: rule__OrderDetail__Group_4__0__Impl : ( 'customerContact1' ) ;
    public final void rule__OrderDetail__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( ( 'customerContact1' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( 'customerContact1' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( 'customerContact1' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: 'customerContact1'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerContact1Keyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__OrderDetail__Group_4__0__Impl2438); 
             after(grammarAccess.getOrderDetailAccess().getCustomerContact1Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_4__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_4__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: rule__OrderDetail__Group_4__1 : rule__OrderDetail__Group_4__1__Impl ;
    public final void rule__OrderDetail__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( rule__OrderDetail__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:2: rule__OrderDetail__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_4__1__Impl_in_rule__OrderDetail__Group_4__12469);
            rule__OrderDetail__Group_4__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_4__1"


    // $ANTLR start "rule__OrderDetail__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: rule__OrderDetail__Group_4__1__Impl : ( ( rule__OrderDetail__CustomerContact1Assignment_4_1 ) ) ;
    public final void rule__OrderDetail__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( ( ( rule__OrderDetail__CustomerContact1Assignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( ( rule__OrderDetail__CustomerContact1Assignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( ( rule__OrderDetail__CustomerContact1Assignment_4_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( rule__OrderDetail__CustomerContact1Assignment_4_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerContact1Assignment_4_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( rule__OrderDetail__CustomerContact1Assignment_4_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:2: rule__OrderDetail__CustomerContact1Assignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerContact1Assignment_4_1_in_rule__OrderDetail__Group_4__1__Impl2496);
            rule__OrderDetail__CustomerContact1Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerContact1Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_4__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group_5__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: rule__OrderDetail__Group_5__0 : rule__OrderDetail__Group_5__0__Impl rule__OrderDetail__Group_5__1 ;
    public final void rule__OrderDetail__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( rule__OrderDetail__Group_5__0__Impl rule__OrderDetail__Group_5__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:2: rule__OrderDetail__Group_5__0__Impl rule__OrderDetail__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_5__0__Impl_in_rule__OrderDetail__Group_5__02530);
            rule__OrderDetail__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_5__1_in_rule__OrderDetail__Group_5__02533);
            rule__OrderDetail__Group_5__1();

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
    // $ANTLR end "rule__OrderDetail__Group_5__0"


    // $ANTLR start "rule__OrderDetail__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: rule__OrderDetail__Group_5__0__Impl : ( 'customerFirstName' ) ;
    public final void rule__OrderDetail__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: ( ( 'customerFirstName' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( 'customerFirstName' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( 'customerFirstName' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: 'customerFirstName'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerFirstNameKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__OrderDetail__Group_5__0__Impl2561); 
             after(grammarAccess.getOrderDetailAccess().getCustomerFirstNameKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_5__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_5__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: rule__OrderDetail__Group_5__1 : rule__OrderDetail__Group_5__1__Impl ;
    public final void rule__OrderDetail__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( rule__OrderDetail__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:2: rule__OrderDetail__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_5__1__Impl_in_rule__OrderDetail__Group_5__12592);
            rule__OrderDetail__Group_5__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_5__1"


    // $ANTLR start "rule__OrderDetail__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: rule__OrderDetail__Group_5__1__Impl : ( ( rule__OrderDetail__CustomerFirstNameAssignment_5_1 ) ) ;
    public final void rule__OrderDetail__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( ( ( rule__OrderDetail__CustomerFirstNameAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ( rule__OrderDetail__CustomerFirstNameAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ( rule__OrderDetail__CustomerFirstNameAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( rule__OrderDetail__CustomerFirstNameAssignment_5_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerFirstNameAssignment_5_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( rule__OrderDetail__CustomerFirstNameAssignment_5_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:2: rule__OrderDetail__CustomerFirstNameAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerFirstNameAssignment_5_1_in_rule__OrderDetail__Group_5__1__Impl2619);
            rule__OrderDetail__CustomerFirstNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerFirstNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_5__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group_6__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: rule__OrderDetail__Group_6__0 : rule__OrderDetail__Group_6__0__Impl rule__OrderDetail__Group_6__1 ;
    public final void rule__OrderDetail__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( rule__OrderDetail__Group_6__0__Impl rule__OrderDetail__Group_6__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:2: rule__OrderDetail__Group_6__0__Impl rule__OrderDetail__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_6__0__Impl_in_rule__OrderDetail__Group_6__02653);
            rule__OrderDetail__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_6__1_in_rule__OrderDetail__Group_6__02656);
            rule__OrderDetail__Group_6__1();

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
    // $ANTLR end "rule__OrderDetail__Group_6__0"


    // $ANTLR start "rule__OrderDetail__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:1: rule__OrderDetail__Group_6__0__Impl : ( 'customerLastName' ) ;
    public final void rule__OrderDetail__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( ( 'customerLastName' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( 'customerLastName' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( 'customerLastName' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: 'customerLastName'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerLastNameKeyword_6_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__OrderDetail__Group_6__0__Impl2684); 
             after(grammarAccess.getOrderDetailAccess().getCustomerLastNameKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_6__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_6__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: rule__OrderDetail__Group_6__1 : rule__OrderDetail__Group_6__1__Impl ;
    public final void rule__OrderDetail__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( rule__OrderDetail__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:2: rule__OrderDetail__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_6__1__Impl_in_rule__OrderDetail__Group_6__12715);
            rule__OrderDetail__Group_6__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_6__1"


    // $ANTLR start "rule__OrderDetail__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: rule__OrderDetail__Group_6__1__Impl : ( ( rule__OrderDetail__CustomerLastNameAssignment_6_1 ) ) ;
    public final void rule__OrderDetail__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( ( ( rule__OrderDetail__CustomerLastNameAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( rule__OrderDetail__CustomerLastNameAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( rule__OrderDetail__CustomerLastNameAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( rule__OrderDetail__CustomerLastNameAssignment_6_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerLastNameAssignment_6_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( rule__OrderDetail__CustomerLastNameAssignment_6_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:2: rule__OrderDetail__CustomerLastNameAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerLastNameAssignment_6_1_in_rule__OrderDetail__Group_6__1__Impl2742);
            rule__OrderDetail__CustomerLastNameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerLastNameAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_6__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group_7__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__OrderDetail__Group_7__0 : rule__OrderDetail__Group_7__0__Impl rule__OrderDetail__Group_7__1 ;
    public final void rule__OrderDetail__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( rule__OrderDetail__Group_7__0__Impl rule__OrderDetail__Group_7__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:2: rule__OrderDetail__Group_7__0__Impl rule__OrderDetail__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_7__0__Impl_in_rule__OrderDetail__Group_7__02776);
            rule__OrderDetail__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_7__1_in_rule__OrderDetail__Group_7__02779);
            rule__OrderDetail__Group_7__1();

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
    // $ANTLR end "rule__OrderDetail__Group_7__0"


    // $ANTLR start "rule__OrderDetail__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: rule__OrderDetail__Group_7__0__Impl : ( 'customerNumber' ) ;
    public final void rule__OrderDetail__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( ( 'customerNumber' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( 'customerNumber' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( 'customerNumber' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: 'customerNumber'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerNumberKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrderDetail__Group_7__0__Impl2807); 
             after(grammarAccess.getOrderDetailAccess().getCustomerNumberKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_7__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_7__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__OrderDetail__Group_7__1 : rule__OrderDetail__Group_7__1__Impl ;
    public final void rule__OrderDetail__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( rule__OrderDetail__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:2: rule__OrderDetail__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_7__1__Impl_in_rule__OrderDetail__Group_7__12838);
            rule__OrderDetail__Group_7__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_7__1"


    // $ANTLR start "rule__OrderDetail__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: rule__OrderDetail__Group_7__1__Impl : ( ( rule__OrderDetail__CustomerNumberAssignment_7_1 ) ) ;
    public final void rule__OrderDetail__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( ( rule__OrderDetail__CustomerNumberAssignment_7_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( ( rule__OrderDetail__CustomerNumberAssignment_7_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( ( rule__OrderDetail__CustomerNumberAssignment_7_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( rule__OrderDetail__CustomerNumberAssignment_7_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerNumberAssignment_7_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( rule__OrderDetail__CustomerNumberAssignment_7_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:2: rule__OrderDetail__CustomerNumberAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerNumberAssignment_7_1_in_rule__OrderDetail__Group_7__1__Impl2865);
            rule__OrderDetail__CustomerNumberAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerNumberAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_7__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group_8__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: rule__OrderDetail__Group_8__0 : rule__OrderDetail__Group_8__0__Impl rule__OrderDetail__Group_8__1 ;
    public final void rule__OrderDetail__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__OrderDetail__Group_8__0__Impl rule__OrderDetail__Group_8__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:2: rule__OrderDetail__Group_8__0__Impl rule__OrderDetail__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_8__0__Impl_in_rule__OrderDetail__Group_8__02899);
            rule__OrderDetail__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_8__1_in_rule__OrderDetail__Group_8__02902);
            rule__OrderDetail__Group_8__1();

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
    // $ANTLR end "rule__OrderDetail__Group_8__0"


    // $ANTLR start "rule__OrderDetail__Group_8__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: rule__OrderDetail__Group_8__0__Impl : ( 'customerPassword' ) ;
    public final void rule__OrderDetail__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( 'customerPassword' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( 'customerPassword' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( 'customerPassword' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: 'customerPassword'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerPasswordKeyword_8_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrderDetail__Group_8__0__Impl2930); 
             after(grammarAccess.getOrderDetailAccess().getCustomerPasswordKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_8__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_8__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__OrderDetail__Group_8__1 : rule__OrderDetail__Group_8__1__Impl ;
    public final void rule__OrderDetail__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__OrderDetail__Group_8__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__OrderDetail__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_8__1__Impl_in_rule__OrderDetail__Group_8__12961);
            rule__OrderDetail__Group_8__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_8__1"


    // $ANTLR start "rule__OrderDetail__Group_8__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: rule__OrderDetail__Group_8__1__Impl : ( ( rule__OrderDetail__CustomerPasswordAssignment_8_1 ) ) ;
    public final void rule__OrderDetail__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( ( ( rule__OrderDetail__CustomerPasswordAssignment_8_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ( rule__OrderDetail__CustomerPasswordAssignment_8_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ( rule__OrderDetail__CustomerPasswordAssignment_8_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( rule__OrderDetail__CustomerPasswordAssignment_8_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerPasswordAssignment_8_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( rule__OrderDetail__CustomerPasswordAssignment_8_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:2: rule__OrderDetail__CustomerPasswordAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerPasswordAssignment_8_1_in_rule__OrderDetail__Group_8__1__Impl2988);
            rule__OrderDetail__CustomerPasswordAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerPasswordAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_8__1__Impl"


    // $ANTLR start "rule__OrderDetail__Group_9__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: rule__OrderDetail__Group_9__0 : rule__OrderDetail__Group_9__0__Impl rule__OrderDetail__Group_9__1 ;
    public final void rule__OrderDetail__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( rule__OrderDetail__Group_9__0__Impl rule__OrderDetail__Group_9__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:2: rule__OrderDetail__Group_9__0__Impl rule__OrderDetail__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_9__0__Impl_in_rule__OrderDetail__Group_9__03022);
            rule__OrderDetail__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_9__1_in_rule__OrderDetail__Group_9__03025);
            rule__OrderDetail__Group_9__1();

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
    // $ANTLR end "rule__OrderDetail__Group_9__0"


    // $ANTLR start "rule__OrderDetail__Group_9__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: rule__OrderDetail__Group_9__0__Impl : ( 'customerUSState' ) ;
    public final void rule__OrderDetail__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( 'customerUSState' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( 'customerUSState' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( 'customerUSState' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: 'customerUSState'
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerUSStateKeyword_9_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OrderDetail__Group_9__0__Impl3053); 
             after(grammarAccess.getOrderDetailAccess().getCustomerUSStateKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_9__0__Impl"


    // $ANTLR start "rule__OrderDetail__Group_9__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: rule__OrderDetail__Group_9__1 : rule__OrderDetail__Group_9__1__Impl ;
    public final void rule__OrderDetail__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( rule__OrderDetail__Group_9__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:2: rule__OrderDetail__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__Group_9__1__Impl_in_rule__OrderDetail__Group_9__13084);
            rule__OrderDetail__Group_9__1__Impl();

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
    // $ANTLR end "rule__OrderDetail__Group_9__1"


    // $ANTLR start "rule__OrderDetail__Group_9__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: rule__OrderDetail__Group_9__1__Impl : ( ( rule__OrderDetail__CustomerUSStateAssignment_9_1 ) ) ;
    public final void rule__OrderDetail__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( ( ( rule__OrderDetail__CustomerUSStateAssignment_9_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( ( rule__OrderDetail__CustomerUSStateAssignment_9_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( ( rule__OrderDetail__CustomerUSStateAssignment_9_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: ( rule__OrderDetail__CustomerUSStateAssignment_9_1 )
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerUSStateAssignment_9_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( rule__OrderDetail__CustomerUSStateAssignment_9_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:2: rule__OrderDetail__CustomerUSStateAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail__CustomerUSStateAssignment_9_1_in_rule__OrderDetail__Group_9__1__Impl3111);
            rule__OrderDetail__CustomerUSStateAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetailAccess().getCustomerUSStateAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__Group_9__1__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: rule__RestrictedAddress__Group__0 : rule__RestrictedAddress__Group__0__Impl rule__RestrictedAddress__Group__1 ;
    public final void rule__RestrictedAddress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: ( rule__RestrictedAddress__Group__0__Impl rule__RestrictedAddress__Group__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:2: rule__RestrictedAddress__Group__0__Impl rule__RestrictedAddress__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__0__Impl_in_rule__RestrictedAddress__Group__03145);
            rule__RestrictedAddress__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__1_in_rule__RestrictedAddress__Group__03148);
            rule__RestrictedAddress__Group__1();

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
    // $ANTLR end "rule__RestrictedAddress__Group__0"


    // $ANTLR start "rule__RestrictedAddress__Group__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: rule__RestrictedAddress__Group__0__Impl : ( 'RestrictedAddress' ) ;
    public final void rule__RestrictedAddress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( ( 'RestrictedAddress' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( 'RestrictedAddress' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( 'RestrictedAddress' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: 'RestrictedAddress'
            {
             before(grammarAccess.getRestrictedAddressAccess().getRestrictedAddressKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RestrictedAddress__Group__0__Impl3176); 
             after(grammarAccess.getRestrictedAddressAccess().getRestrictedAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__0__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: rule__RestrictedAddress__Group__1 : rule__RestrictedAddress__Group__1__Impl rule__RestrictedAddress__Group__2 ;
    public final void rule__RestrictedAddress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( rule__RestrictedAddress__Group__1__Impl rule__RestrictedAddress__Group__2 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:2: rule__RestrictedAddress__Group__1__Impl rule__RestrictedAddress__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__1__Impl_in_rule__RestrictedAddress__Group__13207);
            rule__RestrictedAddress__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__2_in_rule__RestrictedAddress__Group__13210);
            rule__RestrictedAddress__Group__2();

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
    // $ANTLR end "rule__RestrictedAddress__Group__1"


    // $ANTLR start "rule__RestrictedAddress__Group__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__RestrictedAddress__Group__1__Impl : ( '{' ) ;
    public final void rule__RestrictedAddress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( '{' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: '{'
            {
             before(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RestrictedAddress__Group__1__Impl3238); 
             after(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__1__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__2"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: rule__RestrictedAddress__Group__2 : rule__RestrictedAddress__Group__2__Impl rule__RestrictedAddress__Group__3 ;
    public final void rule__RestrictedAddress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( rule__RestrictedAddress__Group__2__Impl rule__RestrictedAddress__Group__3 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:2: rule__RestrictedAddress__Group__2__Impl rule__RestrictedAddress__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__2__Impl_in_rule__RestrictedAddress__Group__23269);
            rule__RestrictedAddress__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__3_in_rule__RestrictedAddress__Group__23272);
            rule__RestrictedAddress__Group__3();

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
    // $ANTLR end "rule__RestrictedAddress__Group__2"


    // $ANTLR start "rule__RestrictedAddress__Group__2__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: rule__RestrictedAddress__Group__2__Impl : ( 'street' ) ;
    public final void rule__RestrictedAddress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( ( 'street' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( 'street' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( 'street' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: 'street'
            {
             before(grammarAccess.getRestrictedAddressAccess().getStreetKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RestrictedAddress__Group__2__Impl3300); 
             after(grammarAccess.getRestrictedAddressAccess().getStreetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__2__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__3"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: rule__RestrictedAddress__Group__3 : rule__RestrictedAddress__Group__3__Impl rule__RestrictedAddress__Group__4 ;
    public final void rule__RestrictedAddress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( rule__RestrictedAddress__Group__3__Impl rule__RestrictedAddress__Group__4 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:2: rule__RestrictedAddress__Group__3__Impl rule__RestrictedAddress__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__3__Impl_in_rule__RestrictedAddress__Group__33331);
            rule__RestrictedAddress__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__4_in_rule__RestrictedAddress__Group__33334);
            rule__RestrictedAddress__Group__4();

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
    // $ANTLR end "rule__RestrictedAddress__Group__3"


    // $ANTLR start "rule__RestrictedAddress__Group__3__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: rule__RestrictedAddress__Group__3__Impl : ( '{' ) ;
    public final void rule__RestrictedAddress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( '{' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: '{'
            {
             before(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RestrictedAddress__Group__3__Impl3362); 
             after(grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__3__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__4"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: rule__RestrictedAddress__Group__4 : rule__RestrictedAddress__Group__4__Impl rule__RestrictedAddress__Group__5 ;
    public final void rule__RestrictedAddress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( rule__RestrictedAddress__Group__4__Impl rule__RestrictedAddress__Group__5 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:2: rule__RestrictedAddress__Group__4__Impl rule__RestrictedAddress__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__4__Impl_in_rule__RestrictedAddress__Group__43393);
            rule__RestrictedAddress__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__5_in_rule__RestrictedAddress__Group__43396);
            rule__RestrictedAddress__Group__5();

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
    // $ANTLR end "rule__RestrictedAddress__Group__4"


    // $ANTLR start "rule__RestrictedAddress__Group__4__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: rule__RestrictedAddress__Group__4__Impl : ( ( rule__RestrictedAddress__StreetAssignment_4 ) ) ;
    public final void rule__RestrictedAddress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: ( ( ( rule__RestrictedAddress__StreetAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( rule__RestrictedAddress__StreetAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( rule__RestrictedAddress__StreetAssignment_4 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( rule__RestrictedAddress__StreetAssignment_4 )
            {
             before(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_4()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__RestrictedAddress__StreetAssignment_4 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:2: rule__RestrictedAddress__StreetAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__StreetAssignment_4_in_rule__RestrictedAddress__Group__4__Impl3423);
            rule__RestrictedAddress__StreetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__4__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__5"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: rule__RestrictedAddress__Group__5 : rule__RestrictedAddress__Group__5__Impl rule__RestrictedAddress__Group__6 ;
    public final void rule__RestrictedAddress__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__RestrictedAddress__Group__5__Impl rule__RestrictedAddress__Group__6 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:2: rule__RestrictedAddress__Group__5__Impl rule__RestrictedAddress__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__5__Impl_in_rule__RestrictedAddress__Group__53453);
            rule__RestrictedAddress__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__6_in_rule__RestrictedAddress__Group__53456);
            rule__RestrictedAddress__Group__6();

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
    // $ANTLR end "rule__RestrictedAddress__Group__5"


    // $ANTLR start "rule__RestrictedAddress__Group__5__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: rule__RestrictedAddress__Group__5__Impl : ( ( rule__RestrictedAddress__Group_5__0 )* ) ;
    public final void rule__RestrictedAddress__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: ( ( ( rule__RestrictedAddress__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( ( rule__RestrictedAddress__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( ( rule__RestrictedAddress__Group_5__0 )* )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( rule__RestrictedAddress__Group_5__0 )*
            {
             before(grammarAccess.getRestrictedAddressAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( rule__RestrictedAddress__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:2: rule__RestrictedAddress__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group_5__0_in_rule__RestrictedAddress__Group__5__Impl3483);
            	    rule__RestrictedAddress__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRestrictedAddressAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__5__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__6"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: rule__RestrictedAddress__Group__6 : rule__RestrictedAddress__Group__6__Impl rule__RestrictedAddress__Group__7 ;
    public final void rule__RestrictedAddress__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__RestrictedAddress__Group__6__Impl rule__RestrictedAddress__Group__7 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:2: rule__RestrictedAddress__Group__6__Impl rule__RestrictedAddress__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__6__Impl_in_rule__RestrictedAddress__Group__63514);
            rule__RestrictedAddress__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__7_in_rule__RestrictedAddress__Group__63517);
            rule__RestrictedAddress__Group__7();

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
    // $ANTLR end "rule__RestrictedAddress__Group__6"


    // $ANTLR start "rule__RestrictedAddress__Group__6__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:1: rule__RestrictedAddress__Group__6__Impl : ( '}' ) ;
    public final void rule__RestrictedAddress__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( '}' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: '}'
            {
             before(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RestrictedAddress__Group__6__Impl3545); 
             after(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__6__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__7"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: rule__RestrictedAddress__Group__7 : rule__RestrictedAddress__Group__7__Impl rule__RestrictedAddress__Group__8 ;
    public final void rule__RestrictedAddress__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( rule__RestrictedAddress__Group__7__Impl rule__RestrictedAddress__Group__8 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:2: rule__RestrictedAddress__Group__7__Impl rule__RestrictedAddress__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__7__Impl_in_rule__RestrictedAddress__Group__73576);
            rule__RestrictedAddress__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__8_in_rule__RestrictedAddress__Group__73579);
            rule__RestrictedAddress__Group__8();

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
    // $ANTLR end "rule__RestrictedAddress__Group__7"


    // $ANTLR start "rule__RestrictedAddress__Group__7__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: rule__RestrictedAddress__Group__7__Impl : ( 'city' ) ;
    public final void rule__RestrictedAddress__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( 'city' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( 'city' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( 'city' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: 'city'
            {
             before(grammarAccess.getRestrictedAddressAccess().getCityKeyword_7()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RestrictedAddress__Group__7__Impl3607); 
             after(grammarAccess.getRestrictedAddressAccess().getCityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__7__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__8"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: rule__RestrictedAddress__Group__8 : rule__RestrictedAddress__Group__8__Impl rule__RestrictedAddress__Group__9 ;
    public final void rule__RestrictedAddress__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: ( rule__RestrictedAddress__Group__8__Impl rule__RestrictedAddress__Group__9 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:2: rule__RestrictedAddress__Group__8__Impl rule__RestrictedAddress__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__8__Impl_in_rule__RestrictedAddress__Group__83638);
            rule__RestrictedAddress__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__9_in_rule__RestrictedAddress__Group__83641);
            rule__RestrictedAddress__Group__9();

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
    // $ANTLR end "rule__RestrictedAddress__Group__8"


    // $ANTLR start "rule__RestrictedAddress__Group__8__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__RestrictedAddress__Group__8__Impl : ( ( rule__RestrictedAddress__CityAssignment_8 ) ) ;
    public final void rule__RestrictedAddress__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( ( rule__RestrictedAddress__CityAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( rule__RestrictedAddress__CityAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( rule__RestrictedAddress__CityAssignment_8 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( rule__RestrictedAddress__CityAssignment_8 )
            {
             before(grammarAccess.getRestrictedAddressAccess().getCityAssignment_8()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( rule__RestrictedAddress__CityAssignment_8 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:2: rule__RestrictedAddress__CityAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__CityAssignment_8_in_rule__RestrictedAddress__Group__8__Impl3668);
            rule__RestrictedAddress__CityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedAddressAccess().getCityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__8__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group__9"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: rule__RestrictedAddress__Group__9 : rule__RestrictedAddress__Group__9__Impl ;
    public final void rule__RestrictedAddress__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( rule__RestrictedAddress__Group__9__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:2: rule__RestrictedAddress__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group__9__Impl_in_rule__RestrictedAddress__Group__93698);
            rule__RestrictedAddress__Group__9__Impl();

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
    // $ANTLR end "rule__RestrictedAddress__Group__9"


    // $ANTLR start "rule__RestrictedAddress__Group__9__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: rule__RestrictedAddress__Group__9__Impl : ( '}' ) ;
    public final void rule__RestrictedAddress__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: ( '}' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: '}'
            {
             before(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RestrictedAddress__Group__9__Impl3726); 
             after(grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group__9__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group_5__0"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: rule__RestrictedAddress__Group_5__0 : rule__RestrictedAddress__Group_5__0__Impl rule__RestrictedAddress__Group_5__1 ;
    public final void rule__RestrictedAddress__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( rule__RestrictedAddress__Group_5__0__Impl rule__RestrictedAddress__Group_5__1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:2: rule__RestrictedAddress__Group_5__0__Impl rule__RestrictedAddress__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group_5__0__Impl_in_rule__RestrictedAddress__Group_5__03777);
            rule__RestrictedAddress__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group_5__1_in_rule__RestrictedAddress__Group_5__03780);
            rule__RestrictedAddress__Group_5__1();

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
    // $ANTLR end "rule__RestrictedAddress__Group_5__0"


    // $ANTLR start "rule__RestrictedAddress__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: rule__RestrictedAddress__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RestrictedAddress__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( ',' )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ','
            {
             before(grammarAccess.getRestrictedAddressAccess().getCommaKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RestrictedAddress__Group_5__0__Impl3808); 
             after(grammarAccess.getRestrictedAddressAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group_5__0__Impl"


    // $ANTLR start "rule__RestrictedAddress__Group_5__1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: rule__RestrictedAddress__Group_5__1 : rule__RestrictedAddress__Group_5__1__Impl ;
    public final void rule__RestrictedAddress__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( rule__RestrictedAddress__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:2: rule__RestrictedAddress__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__Group_5__1__Impl_in_rule__RestrictedAddress__Group_5__13839);
            rule__RestrictedAddress__Group_5__1__Impl();

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
    // $ANTLR end "rule__RestrictedAddress__Group_5__1"


    // $ANTLR start "rule__RestrictedAddress__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: rule__RestrictedAddress__Group_5__1__Impl : ( ( rule__RestrictedAddress__StreetAssignment_5_1 ) ) ;
    public final void rule__RestrictedAddress__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( ( ( rule__RestrictedAddress__StreetAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( rule__RestrictedAddress__StreetAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( rule__RestrictedAddress__StreetAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( rule__RestrictedAddress__StreetAssignment_5_1 )
            {
             before(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_5_1()); 
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( rule__RestrictedAddress__StreetAssignment_5_1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:2: rule__RestrictedAddress__StreetAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedAddress__StreetAssignment_5_1_in_rule__RestrictedAddress__Group_5__1__Impl3866);
            rule__RestrictedAddress__StreetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedAddressAccess().getStreetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__Group_5__1__Impl"


    // $ANTLR start "rule__OrdersType__OrderAssignment_4"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: rule__OrdersType__OrderAssignment_4 : ( ruleOrderDetail ) ;
    public final void rule__OrdersType__OrderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( ( ruleOrderDetail ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( ruleOrderDetail )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( ruleOrderDetail )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ruleOrderDetail
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail_in_rule__OrdersType__OrderAssignment_43905);
            ruleOrderDetail();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__OrderAssignment_4"


    // $ANTLR start "rule__OrdersType__OrderAssignment_5_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: rule__OrdersType__OrderAssignment_5_1 : ( ruleOrderDetail ) ;
    public final void rule__OrdersType__OrderAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( ( ruleOrderDetail ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ( ruleOrderDetail )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ( ruleOrderDetail )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ruleOrderDetail
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail_in_rule__OrdersType__OrderAssignment_5_13936);
            ruleOrderDetail();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__OrderAssignment_5_1"


    // $ANTLR start "rule__OrderDetail__OrderIDAssignment_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: rule__OrderDetail__OrderIDAssignment_1 : ( ruleID0 ) ;
    public final void rule__OrderDetail__OrderIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ruleID0
            {
             before(grammarAccess.getOrderDetailAccess().getOrderIDID0ParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail__OrderIDAssignment_13967);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getOrderIDID0ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__OrderIDAssignment_1"


    // $ANTLR start "rule__OrderDetail__CustomerAgeAssignment_3_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: rule__OrderDetail__CustomerAgeAssignment_3_1 : ( ruleCustomerAge ) ;
    public final void rule__OrderDetail__CustomerAgeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( ( ruleCustomerAge ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( ruleCustomerAge )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( ruleCustomerAge )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: ruleCustomerAge
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerAgeCustomerAgeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerAge_in_rule__OrderDetail__CustomerAgeAssignment_3_13998);
            ruleCustomerAge();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerAgeCustomerAgeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerAgeAssignment_3_1"


    // $ANTLR start "rule__OrderDetail__CustomerContact1Assignment_4_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: rule__OrderDetail__CustomerContact1Assignment_4_1 : ( ruleCustomerContactNumber1 ) ;
    public final void rule__OrderDetail__CustomerContact1Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( ruleCustomerContactNumber1 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( ruleCustomerContactNumber1 )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( ruleCustomerContactNumber1 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ruleCustomerContactNumber1
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerContact1CustomerContactNumber1ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerContactNumber1_in_rule__OrderDetail__CustomerContact1Assignment_4_14029);
            ruleCustomerContactNumber1();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerContact1CustomerContactNumber1ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerContact1Assignment_4_1"


    // $ANTLR start "rule__OrderDetail__CustomerFirstNameAssignment_5_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: rule__OrderDetail__CustomerFirstNameAssignment_5_1 : ( ruleCustomerFirstName ) ;
    public final void rule__OrderDetail__CustomerFirstNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( ( ruleCustomerFirstName ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( ruleCustomerFirstName )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( ruleCustomerFirstName )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: ruleCustomerFirstName
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerFirstNameCustomerFirstNameParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerFirstName_in_rule__OrderDetail__CustomerFirstNameAssignment_5_14060);
            ruleCustomerFirstName();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerFirstNameCustomerFirstNameParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerFirstNameAssignment_5_1"


    // $ANTLR start "rule__OrderDetail__CustomerLastNameAssignment_6_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: rule__OrderDetail__CustomerLastNameAssignment_6_1 : ( ruleCustomerLastName ) ;
    public final void rule__OrderDetail__CustomerLastNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: ( ( ruleCustomerLastName ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( ruleCustomerLastName )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( ruleCustomerLastName )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ruleCustomerLastName
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerLastNameCustomerLastNameParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerLastName_in_rule__OrderDetail__CustomerLastNameAssignment_6_14091);
            ruleCustomerLastName();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerLastNameCustomerLastNameParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerLastNameAssignment_6_1"


    // $ANTLR start "rule__OrderDetail__CustomerNumberAssignment_7_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: rule__OrderDetail__CustomerNumberAssignment_7_1 : ( ruleCustomerNumber ) ;
    public final void rule__OrderDetail__CustomerNumberAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( ( ruleCustomerNumber ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( ruleCustomerNumber )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( ruleCustomerNumber )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: ruleCustomerNumber
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerNumberCustomerNumberParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerNumber_in_rule__OrderDetail__CustomerNumberAssignment_7_14122);
            ruleCustomerNumber();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerNumberCustomerNumberParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerNumberAssignment_7_1"


    // $ANTLR start "rule__OrderDetail__CustomerPasswordAssignment_8_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: rule__OrderDetail__CustomerPasswordAssignment_8_1 : ( ruleCustomerPassword ) ;
    public final void rule__OrderDetail__CustomerPasswordAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( ( ruleCustomerPassword ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ruleCustomerPassword )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ruleCustomerPassword )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ruleCustomerPassword
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerPasswordCustomerPasswordParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerPassword_in_rule__OrderDetail__CustomerPasswordAssignment_8_14153);
            ruleCustomerPassword();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerPasswordCustomerPasswordParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerPasswordAssignment_8_1"


    // $ANTLR start "rule__OrderDetail__CustomerUSStateAssignment_9_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: rule__OrderDetail__CustomerUSStateAssignment_9_1 : ( ruleUSState ) ;
    public final void rule__OrderDetail__CustomerUSStateAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( ( ruleUSState ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ruleUSState )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ruleUSState )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ruleUSState
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerUSStateUSStateEnumRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUSState_in_rule__OrderDetail__CustomerUSStateAssignment_9_14184);
            ruleUSState();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerUSStateUSStateEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerUSStateAssignment_9_1"


    // $ANTLR start "rule__OrderDetail__CustomerAddressAssignment_11"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: rule__OrderDetail__CustomerAddressAssignment_11 : ( ruleRestrictedAddress ) ;
    public final void rule__OrderDetail__CustomerAddressAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( ( ruleRestrictedAddress ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( ruleRestrictedAddress )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( ruleRestrictedAddress )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ruleRestrictedAddress
            {
             before(grammarAccess.getOrderDetailAccess().getCustomerAddressRestrictedAddressParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedAddress_in_rule__OrderDetail__CustomerAddressAssignment_114215);
            ruleRestrictedAddress();

            state._fsp--;

             after(grammarAccess.getOrderDetailAccess().getCustomerAddressRestrictedAddressParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail__CustomerAddressAssignment_11"


    // $ANTLR start "rule__RestrictedAddress__StreetAssignment_4"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: rule__RestrictedAddress__StreetAssignment_4 : ( ruleString0 ) ;
    public final void rule__RestrictedAddress__StreetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ruleString0
            {
             before(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__RestrictedAddress__StreetAssignment_44246);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__StreetAssignment_4"


    // $ANTLR start "rule__RestrictedAddress__StreetAssignment_5_1"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: rule__RestrictedAddress__StreetAssignment_5_1 : ( ruleString0 ) ;
    public final void rule__RestrictedAddress__StreetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ruleString0
            {
             before(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__RestrictedAddress__StreetAssignment_5_14277);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__StreetAssignment_5_1"


    // $ANTLR start "rule__RestrictedAddress__CityAssignment_8"
    // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: rule__RestrictedAddress__CityAssignment_8 : ( ruleString0 ) ;
    public final void rule__RestrictedAddress__CityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.restrictions.ui/src-gen/org/xtext/example/mydsl/restrictions/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: ruleString0
            {
             before(grammarAccess.getRestrictedAddressAccess().getCityString0ParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__RestrictedAddress__CityAssignment_84308);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getRestrictedAddressAccess().getCityString0ParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedAddress__CityAssignment_8"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOrdersType_in_entryRuleOrdersType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdersType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0_in_ruleOrdersType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail_in_entryRuleOrderDetail121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__0_in_ruleOrderDetail154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedAddress_in_entryRuleRestrictedAddress181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedAddress188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__0_in_ruleRestrictedAddress214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerAge_in_entryRuleCustomerAge241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerAge248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCustomerAge274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerContactNumber1_in_entryRuleCustomerContactNumber1300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerContactNumber1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCustomerContactNumber1333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerFirstName_in_entryRuleCustomerFirstName359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerFirstName366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerFirstName392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerLastName_in_entryRuleCustomerLastName418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerLastName425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerLastName451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerNumber_in_entryRuleCustomerNumber477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerNumber484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerNumber510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerPassword_in_entryRuleCustomerPassword536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerPassword543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerPassword569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleID0629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__USState__Alternatives_in_ruleUSState726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__USState__Alternatives762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__USState__Alternatives783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__USState__Alternatives804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0837 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__0__Impl868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1899 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OrdersType__Group__1__Impl930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2961 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OrdersType__Group__2__Impl992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__31023 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__31026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OrdersType__Group__3__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__41085 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__41088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderAssignment_4_in_rule__OrdersType__Group__4__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__51145 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__51148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl1175 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__61206 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__61209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group__6__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__71268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group__7__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__01343 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__01346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrdersType__Group_5__0__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__11405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderAssignment_5_1_in_rule__OrdersType__Group_5__1__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__0__Impl_in_rule__OrderDetail__Group__01466 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__1_in_rule__OrderDetail__Group__01469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__OrderDetail__Group__0__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__1__Impl_in_rule__OrderDetail__Group__11528 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__2_in_rule__OrderDetail__Group__11531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__OrderIDAssignment_1_in_rule__OrderDetail__Group__1__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__2__Impl_in_rule__OrderDetail__Group__21588 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__3_in_rule__OrderDetail__Group__21591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OrderDetail__Group__2__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__3__Impl_in_rule__OrderDetail__Group__31650 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__4_in_rule__OrderDetail__Group__31653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_3__0_in_rule__OrderDetail__Group__3__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__4__Impl_in_rule__OrderDetail__Group__41711 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__5_in_rule__OrderDetail__Group__41714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_4__0_in_rule__OrderDetail__Group__4__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__5__Impl_in_rule__OrderDetail__Group__51772 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__6_in_rule__OrderDetail__Group__51775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_5__0_in_rule__OrderDetail__Group__5__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__6__Impl_in_rule__OrderDetail__Group__61833 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__7_in_rule__OrderDetail__Group__61836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_6__0_in_rule__OrderDetail__Group__6__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__7__Impl_in_rule__OrderDetail__Group__71894 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__8_in_rule__OrderDetail__Group__71897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_7__0_in_rule__OrderDetail__Group__7__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__8__Impl_in_rule__OrderDetail__Group__81955 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__9_in_rule__OrderDetail__Group__81958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_8__0_in_rule__OrderDetail__Group__8__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__9__Impl_in_rule__OrderDetail__Group__92016 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__10_in_rule__OrderDetail__Group__92019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_9__0_in_rule__OrderDetail__Group__9__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__10__Impl_in_rule__OrderDetail__Group__102077 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__11_in_rule__OrderDetail__Group__102080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OrderDetail__Group__10__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__11__Impl_in_rule__OrderDetail__Group__112139 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__12_in_rule__OrderDetail__Group__112142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerAddressAssignment_11_in_rule__OrderDetail__Group__11__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group__12__Impl_in_rule__OrderDetail__Group__122199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrderDetail__Group__12__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_3__0__Impl_in_rule__OrderDetail__Group_3__02284 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_3__1_in_rule__OrderDetail__Group_3__02287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OrderDetail__Group_3__0__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_3__1__Impl_in_rule__OrderDetail__Group_3__12346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerAgeAssignment_3_1_in_rule__OrderDetail__Group_3__1__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_4__0__Impl_in_rule__OrderDetail__Group_4__02407 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_4__1_in_rule__OrderDetail__Group_4__02410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__OrderDetail__Group_4__0__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_4__1__Impl_in_rule__OrderDetail__Group_4__12469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerContact1Assignment_4_1_in_rule__OrderDetail__Group_4__1__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_5__0__Impl_in_rule__OrderDetail__Group_5__02530 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_5__1_in_rule__OrderDetail__Group_5__02533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__OrderDetail__Group_5__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_5__1__Impl_in_rule__OrderDetail__Group_5__12592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerFirstNameAssignment_5_1_in_rule__OrderDetail__Group_5__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_6__0__Impl_in_rule__OrderDetail__Group_6__02653 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_6__1_in_rule__OrderDetail__Group_6__02656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__OrderDetail__Group_6__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_6__1__Impl_in_rule__OrderDetail__Group_6__12715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerLastNameAssignment_6_1_in_rule__OrderDetail__Group_6__1__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_7__0__Impl_in_rule__OrderDetail__Group_7__02776 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_7__1_in_rule__OrderDetail__Group_7__02779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrderDetail__Group_7__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_7__1__Impl_in_rule__OrderDetail__Group_7__12838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerNumberAssignment_7_1_in_rule__OrderDetail__Group_7__1__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_8__0__Impl_in_rule__OrderDetail__Group_8__02899 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_8__1_in_rule__OrderDetail__Group_8__02902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrderDetail__Group_8__0__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_8__1__Impl_in_rule__OrderDetail__Group_8__12961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerPasswordAssignment_8_1_in_rule__OrderDetail__Group_8__1__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_9__0__Impl_in_rule__OrderDetail__Group_9__03022 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_9__1_in_rule__OrderDetail__Group_9__03025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OrderDetail__Group_9__0__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__Group_9__1__Impl_in_rule__OrderDetail__Group_9__13084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail__CustomerUSStateAssignment_9_1_in_rule__OrderDetail__Group_9__1__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__0__Impl_in_rule__RestrictedAddress__Group__03145 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__1_in_rule__RestrictedAddress__Group__03148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RestrictedAddress__Group__0__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__1__Impl_in_rule__RestrictedAddress__Group__13207 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__2_in_rule__RestrictedAddress__Group__13210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RestrictedAddress__Group__1__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__2__Impl_in_rule__RestrictedAddress__Group__23269 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__3_in_rule__RestrictedAddress__Group__23272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RestrictedAddress__Group__2__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__3__Impl_in_rule__RestrictedAddress__Group__33331 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__4_in_rule__RestrictedAddress__Group__33334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RestrictedAddress__Group__3__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__4__Impl_in_rule__RestrictedAddress__Group__43393 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__5_in_rule__RestrictedAddress__Group__43396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__StreetAssignment_4_in_rule__RestrictedAddress__Group__4__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__5__Impl_in_rule__RestrictedAddress__Group__53453 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__6_in_rule__RestrictedAddress__Group__53456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group_5__0_in_rule__RestrictedAddress__Group__5__Impl3483 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__6__Impl_in_rule__RestrictedAddress__Group__63514 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__7_in_rule__RestrictedAddress__Group__63517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RestrictedAddress__Group__6__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__7__Impl_in_rule__RestrictedAddress__Group__73576 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__8_in_rule__RestrictedAddress__Group__73579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RestrictedAddress__Group__7__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__8__Impl_in_rule__RestrictedAddress__Group__83638 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__9_in_rule__RestrictedAddress__Group__83641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__CityAssignment_8_in_rule__RestrictedAddress__Group__8__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group__9__Impl_in_rule__RestrictedAddress__Group__93698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RestrictedAddress__Group__9__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group_5__0__Impl_in_rule__RestrictedAddress__Group_5__03777 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group_5__1_in_rule__RestrictedAddress__Group_5__03780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RestrictedAddress__Group_5__0__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__Group_5__1__Impl_in_rule__RestrictedAddress__Group_5__13839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedAddress__StreetAssignment_5_1_in_rule__RestrictedAddress__Group_5__1__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail_in_rule__OrdersType__OrderAssignment_43905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail_in_rule__OrdersType__OrderAssignment_5_13936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail__OrderIDAssignment_13967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerAge_in_rule__OrderDetail__CustomerAgeAssignment_3_13998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerContactNumber1_in_rule__OrderDetail__CustomerContact1Assignment_4_14029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerFirstName_in_rule__OrderDetail__CustomerFirstNameAssignment_5_14060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerLastName_in_rule__OrderDetail__CustomerLastNameAssignment_6_14091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerNumber_in_rule__OrderDetail__CustomerNumberAssignment_7_14122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerPassword_in_rule__OrderDetail__CustomerPasswordAssignment_8_14153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUSState_in_rule__OrderDetail__CustomerUSStateAssignment_9_14184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedAddress_in_rule__OrderDetail__CustomerAddressAssignment_114215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__RestrictedAddress__StreetAssignment_44246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__RestrictedAddress__StreetAssignment_5_14277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__RestrictedAddress__CityAssignment_84308 = new BitSet(new long[]{0x0000000000000002L});
    }


}