package at.ac.tuwien.big.servicelang.ui.contentassist.antlr.internal; 

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
import at.ac.tuwien.big.servicelang.services.ServiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServiceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BESTEFFORT'", "'WEAKCONTRACT'", "'FAILSAFE'", "'IMPORTANT'", "'Container'", "'{'", "'}'", "'service'", "','", "'cluster'", "'Service'", "'designSpeed'", "'type'", "'providedBy'", "'Cluster'", "'services'", "'('", "')'", "'backup'", "'server'", "'-'", "'Server'", "'speed'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalServiceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalServiceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalServiceParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g"; }


     
     	private ServiceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ServiceGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleContainer"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:60:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:61:1: ( ruleContainer EOF )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:62:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer61);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer68); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:69:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:73:2: ( ( ( rule__Container__Group__0 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:74:1: ( ( rule__Container__Group__0 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:74:1: ( ( rule__Container__Group__0 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:75:1: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:76:1: ( rule__Container__Group__0 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:76:2: rule__Container__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__0_in_ruleContainer94);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleService"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:88:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:89:1: ( ruleService EOF )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:90:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService121);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService128); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:97:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:101:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:102:1: ( ( rule__Service__Group__0 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:102:1: ( ( rule__Service__Group__0 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:103:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:104:1: ( rule__Service__Group__0 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:104:2: rule__Service__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__0_in_ruleService154);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleCluster"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:116:1: entryRuleCluster : ruleCluster EOF ;
    public final void entryRuleCluster() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:117:1: ( ruleCluster EOF )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:118:1: ruleCluster EOF
            {
             before(grammarAccess.getClusterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_entryRuleCluster181);
            ruleCluster();

            state._fsp--;

             after(grammarAccess.getClusterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCluster188); 

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
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:125:1: ruleCluster : ( ( rule__Cluster__Group__0 ) ) ;
    public final void ruleCluster() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:129:2: ( ( ( rule__Cluster__Group__0 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:130:1: ( ( rule__Cluster__Group__0 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:130:1: ( ( rule__Cluster__Group__0 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:131:1: ( rule__Cluster__Group__0 )
            {
             before(grammarAccess.getClusterAccess().getGroup()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:132:1: ( rule__Cluster__Group__0 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:132:2: rule__Cluster__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__0_in_ruleCluster214);
            rule__Cluster__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleEString"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:145:1: ( ruleEString EOF )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:160:1: ( rule__EString__Alternatives )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBigInteger"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:172:1: entryRuleEBigInteger : ruleEBigInteger EOF ;
    public final void entryRuleEBigInteger() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:173:1: ( ruleEBigInteger EOF )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:174:1: ruleEBigInteger EOF
            {
             before(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger301);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getEBigIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigInteger308); 

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
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:181:1: ruleEBigInteger : ( ( rule__EBigInteger__Group__0 ) ) ;
    public final void ruleEBigInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:185:2: ( ( ( rule__EBigInteger__Group__0 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:186:1: ( ( rule__EBigInteger__Group__0 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:186:1: ( ( rule__EBigInteger__Group__0 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:187:1: ( rule__EBigInteger__Group__0 )
            {
             before(grammarAccess.getEBigIntegerAccess().getGroup()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:188:1: ( rule__EBigInteger__Group__0 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:188:2: rule__EBigInteger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__0_in_ruleEBigInteger334);
            rule__EBigInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBigIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRuleServer"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:200:1: entryRuleServer : ruleServer EOF ;
    public final void entryRuleServer() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:201:1: ( ruleServer EOF )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:202:1: ruleServer EOF
            {
             before(grammarAccess.getServerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServer_in_entryRuleServer361);
            ruleServer();

            state._fsp--;

             after(grammarAccess.getServerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServer368); 

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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:209:1: ruleServer : ( ( rule__Server__Group__0 ) ) ;
    public final void ruleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:213:2: ( ( ( rule__Server__Group__0 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:214:1: ( ( rule__Server__Group__0 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:214:1: ( ( rule__Server__Group__0 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:215:1: ( rule__Server__Group__0 )
            {
             before(grammarAccess.getServerAccess().getGroup()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:216:1: ( rule__Server__Group__0 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:216:2: rule__Server__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__0_in_ruleServer394);
            rule__Server__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "ruleServiceType"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:229:1: ruleServiceType : ( ( rule__ServiceType__Alternatives ) ) ;
    public final void ruleServiceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:233:1: ( ( ( rule__ServiceType__Alternatives ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:234:1: ( ( rule__ServiceType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:234:1: ( ( rule__ServiceType__Alternatives ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:235:1: ( rule__ServiceType__Alternatives )
            {
             before(grammarAccess.getServiceTypeAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:236:1: ( rule__ServiceType__Alternatives )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:236:2: rule__ServiceType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceType__Alternatives_in_ruleServiceType431);
            rule__ServiceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceType"


    // $ANTLR start "rule__EString__Alternatives"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:247:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:251:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:252:1: ( RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:252:1: ( RULE_STRING )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:253:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives466); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:258:6: ( RULE_ID )
                    {
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:258:6: ( RULE_ID )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:259:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives483); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ServiceType__Alternatives"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:269:1: rule__ServiceType__Alternatives : ( ( ( 'BESTEFFORT' ) ) | ( ( 'WEAKCONTRACT' ) ) | ( ( 'FAILSAFE' ) ) | ( ( 'IMPORTANT' ) ) );
    public final void rule__ServiceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:273:1: ( ( ( 'BESTEFFORT' ) ) | ( ( 'WEAKCONTRACT' ) ) | ( ( 'FAILSAFE' ) ) | ( ( 'IMPORTANT' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:274:1: ( ( 'BESTEFFORT' ) )
                    {
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:274:1: ( ( 'BESTEFFORT' ) )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:275:1: ( 'BESTEFFORT' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getBESTEFFORTEnumLiteralDeclaration_0()); 
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:276:1: ( 'BESTEFFORT' )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:276:3: 'BESTEFFORT'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__ServiceType__Alternatives516); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getBESTEFFORTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:281:6: ( ( 'WEAKCONTRACT' ) )
                    {
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:281:6: ( ( 'WEAKCONTRACT' ) )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:282:1: ( 'WEAKCONTRACT' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getWEAKCONTRACTEnumLiteralDeclaration_1()); 
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:283:1: ( 'WEAKCONTRACT' )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:283:3: 'WEAKCONTRACT'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__ServiceType__Alternatives537); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getWEAKCONTRACTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:288:6: ( ( 'FAILSAFE' ) )
                    {
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:288:6: ( ( 'FAILSAFE' ) )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:289:1: ( 'FAILSAFE' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getFAILSAFEEnumLiteralDeclaration_2()); 
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:290:1: ( 'FAILSAFE' )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:290:3: 'FAILSAFE'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ServiceType__Alternatives558); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getFAILSAFEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:295:6: ( ( 'IMPORTANT' ) )
                    {
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:295:6: ( ( 'IMPORTANT' ) )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:296:1: ( 'IMPORTANT' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getIMPORTANTEnumLiteralDeclaration_3()); 
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:297:1: ( 'IMPORTANT' )
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:297:3: 'IMPORTANT'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ServiceType__Alternatives579); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getIMPORTANTEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ServiceType__Alternatives"


    // $ANTLR start "rule__Container__Group__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:309:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:313:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:314:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__0612);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__1_in_rule__Container__Group__0615);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:321:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:325:1: ( ( () ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:326:1: ( () )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:326:1: ( () )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:327:1: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:328:1: ()
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:330:1: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:340:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:344:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:345:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__1673);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__2_in_rule__Container__Group__1676);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:352:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:356:1: ( ( 'Container' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:357:1: ( 'Container' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:357:1: ( 'Container' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:358:1: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Container__Group__1__Impl704); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:371:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:375:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:376:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__2735);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__3_in_rule__Container__Group__2738);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:383:1: rule__Container__Group__2__Impl : ( '{' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:387:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:388:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:388:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:389:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Container__Group__2__Impl766); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:402:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:406:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:407:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__3797);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__4_in_rule__Container__Group__3800);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:414:1: rule__Container__Group__3__Impl : ( ( rule__Container__Group_3__0 )? ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:418:1: ( ( ( rule__Container__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:419:1: ( ( rule__Container__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:419:1: ( ( rule__Container__Group_3__0 )? )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:420:1: ( rule__Container__Group_3__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_3()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:421:1: ( rule__Container__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:421:2: rule__Container__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__0_in_rule__Container__Group__3__Impl827);
                    rule__Container__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:431:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:435:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:436:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__4858);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__5_in_rule__Container__Group__4861);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:443:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )? ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:447:1: ( ( ( rule__Container__Group_4__0 )? ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:448:1: ( ( rule__Container__Group_4__0 )? )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:448:1: ( ( rule__Container__Group_4__0 )? )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:449:1: ( rule__Container__Group_4__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:450:1: ( rule__Container__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:450:2: rule__Container__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__0_in_rule__Container__Group__4__Impl888);
                    rule__Container__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:460:1: rule__Container__Group__5 : rule__Container__Group__5__Impl ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:464:1: ( rule__Container__Group__5__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:465:2: rule__Container__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__5919);
            rule__Container__Group__5__Impl();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:471:1: rule__Container__Group__5__Impl : ( '}' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:475:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:476:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:476:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:477:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Container__Group__5__Impl947); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group_3__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:502:1: rule__Container__Group_3__0 : rule__Container__Group_3__0__Impl rule__Container__Group_3__1 ;
    public final void rule__Container__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:506:1: ( rule__Container__Group_3__0__Impl rule__Container__Group_3__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:507:2: rule__Container__Group_3__0__Impl rule__Container__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__0__Impl_in_rule__Container__Group_3__0990);
            rule__Container__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__1_in_rule__Container__Group_3__0993);
            rule__Container__Group_3__1();

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
    // $ANTLR end "rule__Container__Group_3__0"


    // $ANTLR start "rule__Container__Group_3__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:514:1: rule__Container__Group_3__0__Impl : ( 'service' ) ;
    public final void rule__Container__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:518:1: ( ( 'service' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:519:1: ( 'service' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:519:1: ( 'service' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:520:1: 'service'
            {
             before(grammarAccess.getContainerAccess().getServiceKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Container__Group_3__0__Impl1021); 
             after(grammarAccess.getContainerAccess().getServiceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3__0__Impl"


    // $ANTLR start "rule__Container__Group_3__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:533:1: rule__Container__Group_3__1 : rule__Container__Group_3__1__Impl rule__Container__Group_3__2 ;
    public final void rule__Container__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:537:1: ( rule__Container__Group_3__1__Impl rule__Container__Group_3__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:538:2: rule__Container__Group_3__1__Impl rule__Container__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__1__Impl_in_rule__Container__Group_3__11052);
            rule__Container__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__2_in_rule__Container__Group_3__11055);
            rule__Container__Group_3__2();

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
    // $ANTLR end "rule__Container__Group_3__1"


    // $ANTLR start "rule__Container__Group_3__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:545:1: rule__Container__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Container__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:549:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:550:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:550:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:551:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Container__Group_3__1__Impl1083); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3__1__Impl"


    // $ANTLR start "rule__Container__Group_3__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:564:1: rule__Container__Group_3__2 : rule__Container__Group_3__2__Impl rule__Container__Group_3__3 ;
    public final void rule__Container__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:568:1: ( rule__Container__Group_3__2__Impl rule__Container__Group_3__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:569:2: rule__Container__Group_3__2__Impl rule__Container__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__2__Impl_in_rule__Container__Group_3__21114);
            rule__Container__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__3_in_rule__Container__Group_3__21117);
            rule__Container__Group_3__3();

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
    // $ANTLR end "rule__Container__Group_3__2"


    // $ANTLR start "rule__Container__Group_3__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:576:1: rule__Container__Group_3__2__Impl : ( ( rule__Container__ServiceAssignment_3_2 ) ) ;
    public final void rule__Container__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:580:1: ( ( ( rule__Container__ServiceAssignment_3_2 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:581:1: ( ( rule__Container__ServiceAssignment_3_2 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:581:1: ( ( rule__Container__ServiceAssignment_3_2 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:582:1: ( rule__Container__ServiceAssignment_3_2 )
            {
             before(grammarAccess.getContainerAccess().getServiceAssignment_3_2()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:583:1: ( rule__Container__ServiceAssignment_3_2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:583:2: rule__Container__ServiceAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__ServiceAssignment_3_2_in_rule__Container__Group_3__2__Impl1144);
            rule__Container__ServiceAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getServiceAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3__2__Impl"


    // $ANTLR start "rule__Container__Group_3__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:593:1: rule__Container__Group_3__3 : rule__Container__Group_3__3__Impl rule__Container__Group_3__4 ;
    public final void rule__Container__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:597:1: ( rule__Container__Group_3__3__Impl rule__Container__Group_3__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:598:2: rule__Container__Group_3__3__Impl rule__Container__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__3__Impl_in_rule__Container__Group_3__31174);
            rule__Container__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__4_in_rule__Container__Group_3__31177);
            rule__Container__Group_3__4();

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
    // $ANTLR end "rule__Container__Group_3__3"


    // $ANTLR start "rule__Container__Group_3__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:605:1: rule__Container__Group_3__3__Impl : ( ( rule__Container__Group_3_3__0 )* ) ;
    public final void rule__Container__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:609:1: ( ( ( rule__Container__Group_3_3__0 )* ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:610:1: ( ( rule__Container__Group_3_3__0 )* )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:610:1: ( ( rule__Container__Group_3_3__0 )* )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:611:1: ( rule__Container__Group_3_3__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_3_3()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:612:1: ( rule__Container__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:612:2: rule__Container__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3_3__0_in_rule__Container__Group_3__3__Impl1204);
            	    rule__Container__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3__3__Impl"


    // $ANTLR start "rule__Container__Group_3__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:622:1: rule__Container__Group_3__4 : rule__Container__Group_3__4__Impl ;
    public final void rule__Container__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:626:1: ( rule__Container__Group_3__4__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:627:2: rule__Container__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3__4__Impl_in_rule__Container__Group_3__41235);
            rule__Container__Group_3__4__Impl();

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
    // $ANTLR end "rule__Container__Group_3__4"


    // $ANTLR start "rule__Container__Group_3__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:633:1: rule__Container__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Container__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:637:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:638:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:638:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:639:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Container__Group_3__4__Impl1263); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3__4__Impl"


    // $ANTLR start "rule__Container__Group_3_3__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:662:1: rule__Container__Group_3_3__0 : rule__Container__Group_3_3__0__Impl rule__Container__Group_3_3__1 ;
    public final void rule__Container__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:666:1: ( rule__Container__Group_3_3__0__Impl rule__Container__Group_3_3__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:667:2: rule__Container__Group_3_3__0__Impl rule__Container__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3_3__0__Impl_in_rule__Container__Group_3_3__01304);
            rule__Container__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3_3__1_in_rule__Container__Group_3_3__01307);
            rule__Container__Group_3_3__1();

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
    // $ANTLR end "rule__Container__Group_3_3__0"


    // $ANTLR start "rule__Container__Group_3_3__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:674:1: rule__Container__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Container__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:678:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:679:1: ( ',' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:679:1: ( ',' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:680:1: ','
            {
             before(grammarAccess.getContainerAccess().getCommaKeyword_3_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Container__Group_3_3__0__Impl1335); 
             after(grammarAccess.getContainerAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3_3__0__Impl"


    // $ANTLR start "rule__Container__Group_3_3__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:693:1: rule__Container__Group_3_3__1 : rule__Container__Group_3_3__1__Impl ;
    public final void rule__Container__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:697:1: ( rule__Container__Group_3_3__1__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:698:2: rule__Container__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_3_3__1__Impl_in_rule__Container__Group_3_3__11366);
            rule__Container__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Container__Group_3_3__1"


    // $ANTLR start "rule__Container__Group_3_3__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:704:1: rule__Container__Group_3_3__1__Impl : ( ( rule__Container__ServiceAssignment_3_3_1 ) ) ;
    public final void rule__Container__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:708:1: ( ( ( rule__Container__ServiceAssignment_3_3_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:709:1: ( ( rule__Container__ServiceAssignment_3_3_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:709:1: ( ( rule__Container__ServiceAssignment_3_3_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:710:1: ( rule__Container__ServiceAssignment_3_3_1 )
            {
             before(grammarAccess.getContainerAccess().getServiceAssignment_3_3_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:711:1: ( rule__Container__ServiceAssignment_3_3_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:711:2: rule__Container__ServiceAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__ServiceAssignment_3_3_1_in_rule__Container__Group_3_3__1__Impl1393);
            rule__Container__ServiceAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getServiceAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_3_3__1__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:725:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:729:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:730:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__0__Impl_in_rule__Container__Group_4__01427);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__1_in_rule__Container__Group_4__01430);
            rule__Container__Group_4__1();

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
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:737:1: rule__Container__Group_4__0__Impl : ( 'cluster' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:741:1: ( ( 'cluster' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:742:1: ( 'cluster' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:742:1: ( 'cluster' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:743:1: 'cluster'
            {
             before(grammarAccess.getContainerAccess().getClusterKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Container__Group_4__0__Impl1458); 
             after(grammarAccess.getContainerAccess().getClusterKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:756:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl rule__Container__Group_4__2 ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:760:1: ( rule__Container__Group_4__1__Impl rule__Container__Group_4__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:761:2: rule__Container__Group_4__1__Impl rule__Container__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__1__Impl_in_rule__Container__Group_4__11489);
            rule__Container__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__2_in_rule__Container__Group_4__11492);
            rule__Container__Group_4__2();

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
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:768:1: rule__Container__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:772:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:773:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:773:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:774:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Container__Group_4__1__Impl1520); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__Container__Group_4__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:787:1: rule__Container__Group_4__2 : rule__Container__Group_4__2__Impl rule__Container__Group_4__3 ;
    public final void rule__Container__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:791:1: ( rule__Container__Group_4__2__Impl rule__Container__Group_4__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:792:2: rule__Container__Group_4__2__Impl rule__Container__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__2__Impl_in_rule__Container__Group_4__21551);
            rule__Container__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__3_in_rule__Container__Group_4__21554);
            rule__Container__Group_4__3();

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
    // $ANTLR end "rule__Container__Group_4__2"


    // $ANTLR start "rule__Container__Group_4__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:799:1: rule__Container__Group_4__2__Impl : ( ( rule__Container__ClusterAssignment_4_2 ) ) ;
    public final void rule__Container__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:803:1: ( ( ( rule__Container__ClusterAssignment_4_2 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:804:1: ( ( rule__Container__ClusterAssignment_4_2 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:804:1: ( ( rule__Container__ClusterAssignment_4_2 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:805:1: ( rule__Container__ClusterAssignment_4_2 )
            {
             before(grammarAccess.getContainerAccess().getClusterAssignment_4_2()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:806:1: ( rule__Container__ClusterAssignment_4_2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:806:2: rule__Container__ClusterAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__ClusterAssignment_4_2_in_rule__Container__Group_4__2__Impl1581);
            rule__Container__ClusterAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getClusterAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__2__Impl"


    // $ANTLR start "rule__Container__Group_4__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:816:1: rule__Container__Group_4__3 : rule__Container__Group_4__3__Impl rule__Container__Group_4__4 ;
    public final void rule__Container__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:820:1: ( rule__Container__Group_4__3__Impl rule__Container__Group_4__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:821:2: rule__Container__Group_4__3__Impl rule__Container__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__3__Impl_in_rule__Container__Group_4__31611);
            rule__Container__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__4_in_rule__Container__Group_4__31614);
            rule__Container__Group_4__4();

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
    // $ANTLR end "rule__Container__Group_4__3"


    // $ANTLR start "rule__Container__Group_4__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:828:1: rule__Container__Group_4__3__Impl : ( ( rule__Container__Group_4_3__0 )* ) ;
    public final void rule__Container__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:832:1: ( ( ( rule__Container__Group_4_3__0 )* ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:833:1: ( ( rule__Container__Group_4_3__0 )* )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:833:1: ( ( rule__Container__Group_4_3__0 )* )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:834:1: ( rule__Container__Group_4_3__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_4_3()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:835:1: ( rule__Container__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:835:2: rule__Container__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4_3__0_in_rule__Container__Group_4__3__Impl1641);
            	    rule__Container__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__3__Impl"


    // $ANTLR start "rule__Container__Group_4__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:845:1: rule__Container__Group_4__4 : rule__Container__Group_4__4__Impl ;
    public final void rule__Container__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:849:1: ( rule__Container__Group_4__4__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:850:2: rule__Container__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__4__Impl_in_rule__Container__Group_4__41672);
            rule__Container__Group_4__4__Impl();

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
    // $ANTLR end "rule__Container__Group_4__4"


    // $ANTLR start "rule__Container__Group_4__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:856:1: rule__Container__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Container__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:860:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:861:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:861:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:862:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Container__Group_4__4__Impl1700); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__4__Impl"


    // $ANTLR start "rule__Container__Group_4_3__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:885:1: rule__Container__Group_4_3__0 : rule__Container__Group_4_3__0__Impl rule__Container__Group_4_3__1 ;
    public final void rule__Container__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:889:1: ( rule__Container__Group_4_3__0__Impl rule__Container__Group_4_3__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:890:2: rule__Container__Group_4_3__0__Impl rule__Container__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4_3__0__Impl_in_rule__Container__Group_4_3__01741);
            rule__Container__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4_3__1_in_rule__Container__Group_4_3__01744);
            rule__Container__Group_4_3__1();

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
    // $ANTLR end "rule__Container__Group_4_3__0"


    // $ANTLR start "rule__Container__Group_4_3__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:897:1: rule__Container__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Container__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:901:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:902:1: ( ',' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:902:1: ( ',' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:903:1: ','
            {
             before(grammarAccess.getContainerAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Container__Group_4_3__0__Impl1772); 
             after(grammarAccess.getContainerAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4_3__0__Impl"


    // $ANTLR start "rule__Container__Group_4_3__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:916:1: rule__Container__Group_4_3__1 : rule__Container__Group_4_3__1__Impl ;
    public final void rule__Container__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:920:1: ( rule__Container__Group_4_3__1__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:921:2: rule__Container__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4_3__1__Impl_in_rule__Container__Group_4_3__11803);
            rule__Container__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Container__Group_4_3__1"


    // $ANTLR start "rule__Container__Group_4_3__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:927:1: rule__Container__Group_4_3__1__Impl : ( ( rule__Container__ClusterAssignment_4_3_1 ) ) ;
    public final void rule__Container__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:931:1: ( ( ( rule__Container__ClusterAssignment_4_3_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:932:1: ( ( rule__Container__ClusterAssignment_4_3_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:932:1: ( ( rule__Container__ClusterAssignment_4_3_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:933:1: ( rule__Container__ClusterAssignment_4_3_1 )
            {
             before(grammarAccess.getContainerAccess().getClusterAssignment_4_3_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:934:1: ( rule__Container__ClusterAssignment_4_3_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:934:2: rule__Container__ClusterAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__ClusterAssignment_4_3_1_in_rule__Container__Group_4_3__1__Impl1830);
            rule__Container__ClusterAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getClusterAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4_3__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:948:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:952:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:953:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__01864);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__1_in_rule__Service__Group__01867);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:960:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:964:1: ( ( 'Service' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:965:1: ( 'Service' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:965:1: ( 'Service' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:966:1: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Service__Group__0__Impl1895); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:979:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:983:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:984:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__11926);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__2_in_rule__Service__Group__11929);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:991:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:995:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:996:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:996:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:997:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:998:1: ( rule__Service__NameAssignment_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:998:2: rule__Service__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl1956);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1008:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1012:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1013:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__21986);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__3_in_rule__Service__Group__21989);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1020:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1024:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1025:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1025:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1026:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Service__Group__2__Impl2017); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1039:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1043:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1044:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32048);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32051);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1051:1: rule__Service__Group__3__Impl : ( 'designSpeed' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1055:1: ( ( 'designSpeed' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1056:1: ( 'designSpeed' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1056:1: ( 'designSpeed' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1057:1: 'designSpeed'
            {
             before(grammarAccess.getServiceAccess().getDesignSpeedKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Service__Group__3__Impl2079); 
             after(grammarAccess.getServiceAccess().getDesignSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1070:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1074:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1075:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42110);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__5_in_rule__Service__Group__42113);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1082:1: rule__Service__Group__4__Impl : ( ( rule__Service__DesignSpeedAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1086:1: ( ( ( rule__Service__DesignSpeedAssignment_4 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1087:1: ( ( rule__Service__DesignSpeedAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1087:1: ( ( rule__Service__DesignSpeedAssignment_4 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1088:1: ( rule__Service__DesignSpeedAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getDesignSpeedAssignment_4()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1089:1: ( rule__Service__DesignSpeedAssignment_4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1089:2: rule__Service__DesignSpeedAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__DesignSpeedAssignment_4_in_rule__Service__Group__4__Impl2140);
            rule__Service__DesignSpeedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getDesignSpeedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1099:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1103:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1104:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__52170);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__6_in_rule__Service__Group__52173);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1111:1: rule__Service__Group__5__Impl : ( 'type' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1115:1: ( ( 'type' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1116:1: ( 'type' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1116:1: ( 'type' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1117:1: 'type'
            {
             before(grammarAccess.getServiceAccess().getTypeKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Service__Group__5__Impl2201); 
             after(grammarAccess.getServiceAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1130:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1134:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1135:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__62232);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__7_in_rule__Service__Group__62235);
            rule__Service__Group__7();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1142:1: rule__Service__Group__6__Impl : ( ( rule__Service__TypeAssignment_6 ) ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1146:1: ( ( ( rule__Service__TypeAssignment_6 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1147:1: ( ( rule__Service__TypeAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1147:1: ( ( rule__Service__TypeAssignment_6 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1148:1: ( rule__Service__TypeAssignment_6 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_6()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1149:1: ( rule__Service__TypeAssignment_6 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1149:2: rule__Service__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__TypeAssignment_6_in_rule__Service__Group__6__Impl2262);
            rule__Service__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1159:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1163:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1164:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__7__Impl_in_rule__Service__Group__72292);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__8_in_rule__Service__Group__72295);
            rule__Service__Group__8();

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1171:1: rule__Service__Group__7__Impl : ( 'providedBy' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1175:1: ( ( 'providedBy' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1176:1: ( 'providedBy' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1176:1: ( 'providedBy' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1177:1: 'providedBy'
            {
             before(grammarAccess.getServiceAccess().getProvidedByKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Service__Group__7__Impl2323); 
             after(grammarAccess.getServiceAccess().getProvidedByKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1190:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1194:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1195:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__8__Impl_in_rule__Service__Group__82354);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__9_in_rule__Service__Group__82357);
            rule__Service__Group__9();

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1202:1: rule__Service__Group__8__Impl : ( ( rule__Service__ProvidedByAssignment_8 ) ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1206:1: ( ( ( rule__Service__ProvidedByAssignment_8 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1207:1: ( ( rule__Service__ProvidedByAssignment_8 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1207:1: ( ( rule__Service__ProvidedByAssignment_8 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1208:1: ( rule__Service__ProvidedByAssignment_8 )
            {
             before(grammarAccess.getServiceAccess().getProvidedByAssignment_8()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1209:1: ( rule__Service__ProvidedByAssignment_8 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1209:2: rule__Service__ProvidedByAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__ProvidedByAssignment_8_in_rule__Service__Group__8__Impl2384);
            rule__Service__ProvidedByAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getProvidedByAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1219:1: rule__Service__Group__9 : rule__Service__Group__9__Impl ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1223:1: ( rule__Service__Group__9__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1224:2: rule__Service__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Group__9__Impl_in_rule__Service__Group__92414);
            rule__Service__Group__9__Impl();

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
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1230:1: rule__Service__Group__9__Impl : ( '}' ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1234:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1235:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1235:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1236:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Service__Group__9__Impl2442); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Cluster__Group__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1269:1: rule__Cluster__Group__0 : rule__Cluster__Group__0__Impl rule__Cluster__Group__1 ;
    public final void rule__Cluster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1273:1: ( rule__Cluster__Group__0__Impl rule__Cluster__Group__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1274:2: rule__Cluster__Group__0__Impl rule__Cluster__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__0__Impl_in_rule__Cluster__Group__02493);
            rule__Cluster__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__1_in_rule__Cluster__Group__02496);
            rule__Cluster__Group__1();

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
    // $ANTLR end "rule__Cluster__Group__0"


    // $ANTLR start "rule__Cluster__Group__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1281:1: rule__Cluster__Group__0__Impl : ( 'Cluster' ) ;
    public final void rule__Cluster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1285:1: ( ( 'Cluster' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1286:1: ( 'Cluster' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1286:1: ( 'Cluster' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1287:1: 'Cluster'
            {
             before(grammarAccess.getClusterAccess().getClusterKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Cluster__Group__0__Impl2524); 
             after(grammarAccess.getClusterAccess().getClusterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__0__Impl"


    // $ANTLR start "rule__Cluster__Group__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1300:1: rule__Cluster__Group__1 : rule__Cluster__Group__1__Impl rule__Cluster__Group__2 ;
    public final void rule__Cluster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1304:1: ( rule__Cluster__Group__1__Impl rule__Cluster__Group__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1305:2: rule__Cluster__Group__1__Impl rule__Cluster__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__1__Impl_in_rule__Cluster__Group__12555);
            rule__Cluster__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__2_in_rule__Cluster__Group__12558);
            rule__Cluster__Group__2();

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
    // $ANTLR end "rule__Cluster__Group__1"


    // $ANTLR start "rule__Cluster__Group__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1312:1: rule__Cluster__Group__1__Impl : ( ( rule__Cluster__NameAssignment_1 ) ) ;
    public final void rule__Cluster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1316:1: ( ( ( rule__Cluster__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1317:1: ( ( rule__Cluster__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1317:1: ( ( rule__Cluster__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1318:1: ( rule__Cluster__NameAssignment_1 )
            {
             before(grammarAccess.getClusterAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1319:1: ( rule__Cluster__NameAssignment_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1319:2: rule__Cluster__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__NameAssignment_1_in_rule__Cluster__Group__1__Impl2585);
            rule__Cluster__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__1__Impl"


    // $ANTLR start "rule__Cluster__Group__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1329:1: rule__Cluster__Group__2 : rule__Cluster__Group__2__Impl rule__Cluster__Group__3 ;
    public final void rule__Cluster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1333:1: ( rule__Cluster__Group__2__Impl rule__Cluster__Group__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1334:2: rule__Cluster__Group__2__Impl rule__Cluster__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__2__Impl_in_rule__Cluster__Group__22615);
            rule__Cluster__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__3_in_rule__Cluster__Group__22618);
            rule__Cluster__Group__3();

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
    // $ANTLR end "rule__Cluster__Group__2"


    // $ANTLR start "rule__Cluster__Group__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1341:1: rule__Cluster__Group__2__Impl : ( '{' ) ;
    public final void rule__Cluster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1345:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1346:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1346:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1347:1: '{'
            {
             before(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Cluster__Group__2__Impl2646); 
             after(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__2__Impl"


    // $ANTLR start "rule__Cluster__Group__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1360:1: rule__Cluster__Group__3 : rule__Cluster__Group__3__Impl rule__Cluster__Group__4 ;
    public final void rule__Cluster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1364:1: ( rule__Cluster__Group__3__Impl rule__Cluster__Group__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1365:2: rule__Cluster__Group__3__Impl rule__Cluster__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__3__Impl_in_rule__Cluster__Group__32677);
            rule__Cluster__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__4_in_rule__Cluster__Group__32680);
            rule__Cluster__Group__4();

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
    // $ANTLR end "rule__Cluster__Group__3"


    // $ANTLR start "rule__Cluster__Group__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1372:1: rule__Cluster__Group__3__Impl : ( 'designSpeed' ) ;
    public final void rule__Cluster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1376:1: ( ( 'designSpeed' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1377:1: ( 'designSpeed' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1377:1: ( 'designSpeed' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1378:1: 'designSpeed'
            {
             before(grammarAccess.getClusterAccess().getDesignSpeedKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Cluster__Group__3__Impl2708); 
             after(grammarAccess.getClusterAccess().getDesignSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__3__Impl"


    // $ANTLR start "rule__Cluster__Group__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1391:1: rule__Cluster__Group__4 : rule__Cluster__Group__4__Impl rule__Cluster__Group__5 ;
    public final void rule__Cluster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1395:1: ( rule__Cluster__Group__4__Impl rule__Cluster__Group__5 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1396:2: rule__Cluster__Group__4__Impl rule__Cluster__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__4__Impl_in_rule__Cluster__Group__42739);
            rule__Cluster__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__5_in_rule__Cluster__Group__42742);
            rule__Cluster__Group__5();

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
    // $ANTLR end "rule__Cluster__Group__4"


    // $ANTLR start "rule__Cluster__Group__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1403:1: rule__Cluster__Group__4__Impl : ( ( rule__Cluster__DesignSpeedAssignment_4 ) ) ;
    public final void rule__Cluster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1407:1: ( ( ( rule__Cluster__DesignSpeedAssignment_4 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1408:1: ( ( rule__Cluster__DesignSpeedAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1408:1: ( ( rule__Cluster__DesignSpeedAssignment_4 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1409:1: ( rule__Cluster__DesignSpeedAssignment_4 )
            {
             before(grammarAccess.getClusterAccess().getDesignSpeedAssignment_4()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1410:1: ( rule__Cluster__DesignSpeedAssignment_4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1410:2: rule__Cluster__DesignSpeedAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__DesignSpeedAssignment_4_in_rule__Cluster__Group__4__Impl2769);
            rule__Cluster__DesignSpeedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getDesignSpeedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__4__Impl"


    // $ANTLR start "rule__Cluster__Group__5"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1420:1: rule__Cluster__Group__5 : rule__Cluster__Group__5__Impl rule__Cluster__Group__6 ;
    public final void rule__Cluster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1424:1: ( rule__Cluster__Group__5__Impl rule__Cluster__Group__6 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1425:2: rule__Cluster__Group__5__Impl rule__Cluster__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__5__Impl_in_rule__Cluster__Group__52799);
            rule__Cluster__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__6_in_rule__Cluster__Group__52802);
            rule__Cluster__Group__6();

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
    // $ANTLR end "rule__Cluster__Group__5"


    // $ANTLR start "rule__Cluster__Group__5__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1432:1: rule__Cluster__Group__5__Impl : ( 'services' ) ;
    public final void rule__Cluster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1436:1: ( ( 'services' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1437:1: ( 'services' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1437:1: ( 'services' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1438:1: 'services'
            {
             before(grammarAccess.getClusterAccess().getServicesKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Cluster__Group__5__Impl2830); 
             after(grammarAccess.getClusterAccess().getServicesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__5__Impl"


    // $ANTLR start "rule__Cluster__Group__6"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1451:1: rule__Cluster__Group__6 : rule__Cluster__Group__6__Impl rule__Cluster__Group__7 ;
    public final void rule__Cluster__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1455:1: ( rule__Cluster__Group__6__Impl rule__Cluster__Group__7 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1456:2: rule__Cluster__Group__6__Impl rule__Cluster__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__6__Impl_in_rule__Cluster__Group__62861);
            rule__Cluster__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__7_in_rule__Cluster__Group__62864);
            rule__Cluster__Group__7();

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
    // $ANTLR end "rule__Cluster__Group__6"


    // $ANTLR start "rule__Cluster__Group__6__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1463:1: rule__Cluster__Group__6__Impl : ( '(' ) ;
    public final void rule__Cluster__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1467:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1468:1: ( '(' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1468:1: ( '(' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1469:1: '('
            {
             before(grammarAccess.getClusterAccess().getLeftParenthesisKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Cluster__Group__6__Impl2892); 
             after(grammarAccess.getClusterAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__6__Impl"


    // $ANTLR start "rule__Cluster__Group__7"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1482:1: rule__Cluster__Group__7 : rule__Cluster__Group__7__Impl rule__Cluster__Group__8 ;
    public final void rule__Cluster__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1486:1: ( rule__Cluster__Group__7__Impl rule__Cluster__Group__8 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1487:2: rule__Cluster__Group__7__Impl rule__Cluster__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__7__Impl_in_rule__Cluster__Group__72923);
            rule__Cluster__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__8_in_rule__Cluster__Group__72926);
            rule__Cluster__Group__8();

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
    // $ANTLR end "rule__Cluster__Group__7"


    // $ANTLR start "rule__Cluster__Group__7__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1494:1: rule__Cluster__Group__7__Impl : ( ( rule__Cluster__ServicesAssignment_7 ) ) ;
    public final void rule__Cluster__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1498:1: ( ( ( rule__Cluster__ServicesAssignment_7 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1499:1: ( ( rule__Cluster__ServicesAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1499:1: ( ( rule__Cluster__ServicesAssignment_7 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1500:1: ( rule__Cluster__ServicesAssignment_7 )
            {
             before(grammarAccess.getClusterAccess().getServicesAssignment_7()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1501:1: ( rule__Cluster__ServicesAssignment_7 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1501:2: rule__Cluster__ServicesAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__ServicesAssignment_7_in_rule__Cluster__Group__7__Impl2953);
            rule__Cluster__ServicesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getServicesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__7__Impl"


    // $ANTLR start "rule__Cluster__Group__8"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1511:1: rule__Cluster__Group__8 : rule__Cluster__Group__8__Impl rule__Cluster__Group__9 ;
    public final void rule__Cluster__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1515:1: ( rule__Cluster__Group__8__Impl rule__Cluster__Group__9 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1516:2: rule__Cluster__Group__8__Impl rule__Cluster__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__8__Impl_in_rule__Cluster__Group__82983);
            rule__Cluster__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__9_in_rule__Cluster__Group__82986);
            rule__Cluster__Group__9();

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
    // $ANTLR end "rule__Cluster__Group__8"


    // $ANTLR start "rule__Cluster__Group__8__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1523:1: rule__Cluster__Group__8__Impl : ( ( rule__Cluster__Group_8__0 )* ) ;
    public final void rule__Cluster__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1527:1: ( ( ( rule__Cluster__Group_8__0 )* ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1528:1: ( ( rule__Cluster__Group_8__0 )* )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1528:1: ( ( rule__Cluster__Group_8__0 )* )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1529:1: ( rule__Cluster__Group_8__0 )*
            {
             before(grammarAccess.getClusterAccess().getGroup_8()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1530:1: ( rule__Cluster__Group_8__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1530:2: rule__Cluster__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_8__0_in_rule__Cluster__Group__8__Impl3013);
            	    rule__Cluster__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClusterAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__8__Impl"


    // $ANTLR start "rule__Cluster__Group__9"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1540:1: rule__Cluster__Group__9 : rule__Cluster__Group__9__Impl rule__Cluster__Group__10 ;
    public final void rule__Cluster__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1544:1: ( rule__Cluster__Group__9__Impl rule__Cluster__Group__10 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1545:2: rule__Cluster__Group__9__Impl rule__Cluster__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__9__Impl_in_rule__Cluster__Group__93044);
            rule__Cluster__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__10_in_rule__Cluster__Group__93047);
            rule__Cluster__Group__10();

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
    // $ANTLR end "rule__Cluster__Group__9"


    // $ANTLR start "rule__Cluster__Group__9__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1552:1: rule__Cluster__Group__9__Impl : ( ')' ) ;
    public final void rule__Cluster__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1556:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1557:1: ( ')' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1557:1: ( ')' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1558:1: ')'
            {
             before(grammarAccess.getClusterAccess().getRightParenthesisKeyword_9()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Cluster__Group__9__Impl3075); 
             after(grammarAccess.getClusterAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__9__Impl"


    // $ANTLR start "rule__Cluster__Group__10"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1571:1: rule__Cluster__Group__10 : rule__Cluster__Group__10__Impl rule__Cluster__Group__11 ;
    public final void rule__Cluster__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1575:1: ( rule__Cluster__Group__10__Impl rule__Cluster__Group__11 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1576:2: rule__Cluster__Group__10__Impl rule__Cluster__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__10__Impl_in_rule__Cluster__Group__103106);
            rule__Cluster__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__11_in_rule__Cluster__Group__103109);
            rule__Cluster__Group__11();

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
    // $ANTLR end "rule__Cluster__Group__10"


    // $ANTLR start "rule__Cluster__Group__10__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1583:1: rule__Cluster__Group__10__Impl : ( ( rule__Cluster__Group_10__0 )? ) ;
    public final void rule__Cluster__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1587:1: ( ( ( rule__Cluster__Group_10__0 )? ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1588:1: ( ( rule__Cluster__Group_10__0 )? )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1588:1: ( ( rule__Cluster__Group_10__0 )? )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1589:1: ( rule__Cluster__Group_10__0 )?
            {
             before(grammarAccess.getClusterAccess().getGroup_10()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1590:1: ( rule__Cluster__Group_10__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1590:2: rule__Cluster__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_10__0_in_rule__Cluster__Group__10__Impl3136);
                    rule__Cluster__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__10__Impl"


    // $ANTLR start "rule__Cluster__Group__11"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1600:1: rule__Cluster__Group__11 : rule__Cluster__Group__11__Impl rule__Cluster__Group__12 ;
    public final void rule__Cluster__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1604:1: ( rule__Cluster__Group__11__Impl rule__Cluster__Group__12 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1605:2: rule__Cluster__Group__11__Impl rule__Cluster__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__11__Impl_in_rule__Cluster__Group__113167);
            rule__Cluster__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__12_in_rule__Cluster__Group__113170);
            rule__Cluster__Group__12();

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
    // $ANTLR end "rule__Cluster__Group__11"


    // $ANTLR start "rule__Cluster__Group__11__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1612:1: rule__Cluster__Group__11__Impl : ( ( rule__Cluster__Group_11__0 )? ) ;
    public final void rule__Cluster__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1616:1: ( ( ( rule__Cluster__Group_11__0 )? ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1617:1: ( ( rule__Cluster__Group_11__0 )? )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1617:1: ( ( rule__Cluster__Group_11__0 )? )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1618:1: ( rule__Cluster__Group_11__0 )?
            {
             before(grammarAccess.getClusterAccess().getGroup_11()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1619:1: ( rule__Cluster__Group_11__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1619:2: rule__Cluster__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__0_in_rule__Cluster__Group__11__Impl3197);
                    rule__Cluster__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__11__Impl"


    // $ANTLR start "rule__Cluster__Group__12"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1629:1: rule__Cluster__Group__12 : rule__Cluster__Group__12__Impl ;
    public final void rule__Cluster__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1633:1: ( rule__Cluster__Group__12__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1634:2: rule__Cluster__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group__12__Impl_in_rule__Cluster__Group__123228);
            rule__Cluster__Group__12__Impl();

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
    // $ANTLR end "rule__Cluster__Group__12"


    // $ANTLR start "rule__Cluster__Group__12__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1640:1: rule__Cluster__Group__12__Impl : ( '}' ) ;
    public final void rule__Cluster__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1644:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1645:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1645:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1646:1: '}'
            {
             before(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Cluster__Group__12__Impl3256); 
             after(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__12__Impl"


    // $ANTLR start "rule__Cluster__Group_8__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1685:1: rule__Cluster__Group_8__0 : rule__Cluster__Group_8__0__Impl rule__Cluster__Group_8__1 ;
    public final void rule__Cluster__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1689:1: ( rule__Cluster__Group_8__0__Impl rule__Cluster__Group_8__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1690:2: rule__Cluster__Group_8__0__Impl rule__Cluster__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_8__0__Impl_in_rule__Cluster__Group_8__03313);
            rule__Cluster__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_8__1_in_rule__Cluster__Group_8__03316);
            rule__Cluster__Group_8__1();

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
    // $ANTLR end "rule__Cluster__Group_8__0"


    // $ANTLR start "rule__Cluster__Group_8__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1697:1: rule__Cluster__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Cluster__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1701:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1702:1: ( ',' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1702:1: ( ',' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1703:1: ','
            {
             before(grammarAccess.getClusterAccess().getCommaKeyword_8_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Cluster__Group_8__0__Impl3344); 
             after(grammarAccess.getClusterAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_8__0__Impl"


    // $ANTLR start "rule__Cluster__Group_8__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1716:1: rule__Cluster__Group_8__1 : rule__Cluster__Group_8__1__Impl ;
    public final void rule__Cluster__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1720:1: ( rule__Cluster__Group_8__1__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1721:2: rule__Cluster__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_8__1__Impl_in_rule__Cluster__Group_8__13375);
            rule__Cluster__Group_8__1__Impl();

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
    // $ANTLR end "rule__Cluster__Group_8__1"


    // $ANTLR start "rule__Cluster__Group_8__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1727:1: rule__Cluster__Group_8__1__Impl : ( ( rule__Cluster__ServicesAssignment_8_1 ) ) ;
    public final void rule__Cluster__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1731:1: ( ( ( rule__Cluster__ServicesAssignment_8_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1732:1: ( ( rule__Cluster__ServicesAssignment_8_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1732:1: ( ( rule__Cluster__ServicesAssignment_8_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1733:1: ( rule__Cluster__ServicesAssignment_8_1 )
            {
             before(grammarAccess.getClusterAccess().getServicesAssignment_8_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1734:1: ( rule__Cluster__ServicesAssignment_8_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1734:2: rule__Cluster__ServicesAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__ServicesAssignment_8_1_in_rule__Cluster__Group_8__1__Impl3402);
            rule__Cluster__ServicesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getServicesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_8__1__Impl"


    // $ANTLR start "rule__Cluster__Group_10__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1748:1: rule__Cluster__Group_10__0 : rule__Cluster__Group_10__0__Impl rule__Cluster__Group_10__1 ;
    public final void rule__Cluster__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1752:1: ( rule__Cluster__Group_10__0__Impl rule__Cluster__Group_10__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1753:2: rule__Cluster__Group_10__0__Impl rule__Cluster__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_10__0__Impl_in_rule__Cluster__Group_10__03436);
            rule__Cluster__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_10__1_in_rule__Cluster__Group_10__03439);
            rule__Cluster__Group_10__1();

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
    // $ANTLR end "rule__Cluster__Group_10__0"


    // $ANTLR start "rule__Cluster__Group_10__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1760:1: rule__Cluster__Group_10__0__Impl : ( 'backup' ) ;
    public final void rule__Cluster__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1764:1: ( ( 'backup' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1765:1: ( 'backup' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1765:1: ( 'backup' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1766:1: 'backup'
            {
             before(grammarAccess.getClusterAccess().getBackupKeyword_10_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Cluster__Group_10__0__Impl3467); 
             after(grammarAccess.getClusterAccess().getBackupKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_10__0__Impl"


    // $ANTLR start "rule__Cluster__Group_10__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1779:1: rule__Cluster__Group_10__1 : rule__Cluster__Group_10__1__Impl ;
    public final void rule__Cluster__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1783:1: ( rule__Cluster__Group_10__1__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1784:2: rule__Cluster__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_10__1__Impl_in_rule__Cluster__Group_10__13498);
            rule__Cluster__Group_10__1__Impl();

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
    // $ANTLR end "rule__Cluster__Group_10__1"


    // $ANTLR start "rule__Cluster__Group_10__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1790:1: rule__Cluster__Group_10__1__Impl : ( ( rule__Cluster__BackupAssignment_10_1 ) ) ;
    public final void rule__Cluster__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1794:1: ( ( ( rule__Cluster__BackupAssignment_10_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1795:1: ( ( rule__Cluster__BackupAssignment_10_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1795:1: ( ( rule__Cluster__BackupAssignment_10_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1796:1: ( rule__Cluster__BackupAssignment_10_1 )
            {
             before(grammarAccess.getClusterAccess().getBackupAssignment_10_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1797:1: ( rule__Cluster__BackupAssignment_10_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1797:2: rule__Cluster__BackupAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__BackupAssignment_10_1_in_rule__Cluster__Group_10__1__Impl3525);
            rule__Cluster__BackupAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getBackupAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_10__1__Impl"


    // $ANTLR start "rule__Cluster__Group_11__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1811:1: rule__Cluster__Group_11__0 : rule__Cluster__Group_11__0__Impl rule__Cluster__Group_11__1 ;
    public final void rule__Cluster__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1815:1: ( rule__Cluster__Group_11__0__Impl rule__Cluster__Group_11__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1816:2: rule__Cluster__Group_11__0__Impl rule__Cluster__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__0__Impl_in_rule__Cluster__Group_11__03559);
            rule__Cluster__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__1_in_rule__Cluster__Group_11__03562);
            rule__Cluster__Group_11__1();

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
    // $ANTLR end "rule__Cluster__Group_11__0"


    // $ANTLR start "rule__Cluster__Group_11__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1823:1: rule__Cluster__Group_11__0__Impl : ( 'server' ) ;
    public final void rule__Cluster__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1827:1: ( ( 'server' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1828:1: ( 'server' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1828:1: ( 'server' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1829:1: 'server'
            {
             before(grammarAccess.getClusterAccess().getServerKeyword_11_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Cluster__Group_11__0__Impl3590); 
             after(grammarAccess.getClusterAccess().getServerKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11__0__Impl"


    // $ANTLR start "rule__Cluster__Group_11__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1842:1: rule__Cluster__Group_11__1 : rule__Cluster__Group_11__1__Impl rule__Cluster__Group_11__2 ;
    public final void rule__Cluster__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1846:1: ( rule__Cluster__Group_11__1__Impl rule__Cluster__Group_11__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1847:2: rule__Cluster__Group_11__1__Impl rule__Cluster__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__1__Impl_in_rule__Cluster__Group_11__13621);
            rule__Cluster__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__2_in_rule__Cluster__Group_11__13624);
            rule__Cluster__Group_11__2();

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
    // $ANTLR end "rule__Cluster__Group_11__1"


    // $ANTLR start "rule__Cluster__Group_11__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1854:1: rule__Cluster__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Cluster__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1858:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1859:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1859:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1860:1: '{'
            {
             before(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Cluster__Group_11__1__Impl3652); 
             after(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11__1__Impl"


    // $ANTLR start "rule__Cluster__Group_11__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1873:1: rule__Cluster__Group_11__2 : rule__Cluster__Group_11__2__Impl rule__Cluster__Group_11__3 ;
    public final void rule__Cluster__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1877:1: ( rule__Cluster__Group_11__2__Impl rule__Cluster__Group_11__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1878:2: rule__Cluster__Group_11__2__Impl rule__Cluster__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__2__Impl_in_rule__Cluster__Group_11__23683);
            rule__Cluster__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__3_in_rule__Cluster__Group_11__23686);
            rule__Cluster__Group_11__3();

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
    // $ANTLR end "rule__Cluster__Group_11__2"


    // $ANTLR start "rule__Cluster__Group_11__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1885:1: rule__Cluster__Group_11__2__Impl : ( ( rule__Cluster__ServerAssignment_11_2 ) ) ;
    public final void rule__Cluster__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1889:1: ( ( ( rule__Cluster__ServerAssignment_11_2 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1890:1: ( ( rule__Cluster__ServerAssignment_11_2 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1890:1: ( ( rule__Cluster__ServerAssignment_11_2 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1891:1: ( rule__Cluster__ServerAssignment_11_2 )
            {
             before(grammarAccess.getClusterAccess().getServerAssignment_11_2()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1892:1: ( rule__Cluster__ServerAssignment_11_2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1892:2: rule__Cluster__ServerAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__ServerAssignment_11_2_in_rule__Cluster__Group_11__2__Impl3713);
            rule__Cluster__ServerAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getServerAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11__2__Impl"


    // $ANTLR start "rule__Cluster__Group_11__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1902:1: rule__Cluster__Group_11__3 : rule__Cluster__Group_11__3__Impl rule__Cluster__Group_11__4 ;
    public final void rule__Cluster__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1906:1: ( rule__Cluster__Group_11__3__Impl rule__Cluster__Group_11__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1907:2: rule__Cluster__Group_11__3__Impl rule__Cluster__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__3__Impl_in_rule__Cluster__Group_11__33743);
            rule__Cluster__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__4_in_rule__Cluster__Group_11__33746);
            rule__Cluster__Group_11__4();

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
    // $ANTLR end "rule__Cluster__Group_11__3"


    // $ANTLR start "rule__Cluster__Group_11__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1914:1: rule__Cluster__Group_11__3__Impl : ( ( rule__Cluster__Group_11_3__0 )* ) ;
    public final void rule__Cluster__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1918:1: ( ( ( rule__Cluster__Group_11_3__0 )* ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1919:1: ( ( rule__Cluster__Group_11_3__0 )* )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1919:1: ( ( rule__Cluster__Group_11_3__0 )* )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1920:1: ( rule__Cluster__Group_11_3__0 )*
            {
             before(grammarAccess.getClusterAccess().getGroup_11_3()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1921:1: ( rule__Cluster__Group_11_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1921:2: rule__Cluster__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11_3__0_in_rule__Cluster__Group_11__3__Impl3773);
            	    rule__Cluster__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClusterAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11__3__Impl"


    // $ANTLR start "rule__Cluster__Group_11__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1931:1: rule__Cluster__Group_11__4 : rule__Cluster__Group_11__4__Impl ;
    public final void rule__Cluster__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1935:1: ( rule__Cluster__Group_11__4__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1936:2: rule__Cluster__Group_11__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11__4__Impl_in_rule__Cluster__Group_11__43804);
            rule__Cluster__Group_11__4__Impl();

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
    // $ANTLR end "rule__Cluster__Group_11__4"


    // $ANTLR start "rule__Cluster__Group_11__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1942:1: rule__Cluster__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Cluster__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1946:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1947:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1947:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1948:1: '}'
            {
             before(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Cluster__Group_11__4__Impl3832); 
             after(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11__4__Impl"


    // $ANTLR start "rule__Cluster__Group_11_3__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1971:1: rule__Cluster__Group_11_3__0 : rule__Cluster__Group_11_3__0__Impl rule__Cluster__Group_11_3__1 ;
    public final void rule__Cluster__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1975:1: ( rule__Cluster__Group_11_3__0__Impl rule__Cluster__Group_11_3__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1976:2: rule__Cluster__Group_11_3__0__Impl rule__Cluster__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11_3__0__Impl_in_rule__Cluster__Group_11_3__03873);
            rule__Cluster__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11_3__1_in_rule__Cluster__Group_11_3__03876);
            rule__Cluster__Group_11_3__1();

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
    // $ANTLR end "rule__Cluster__Group_11_3__0"


    // $ANTLR start "rule__Cluster__Group_11_3__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1983:1: rule__Cluster__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Cluster__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1987:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1988:1: ( ',' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1988:1: ( ',' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:1989:1: ','
            {
             before(grammarAccess.getClusterAccess().getCommaKeyword_11_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Cluster__Group_11_3__0__Impl3904); 
             after(grammarAccess.getClusterAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11_3__0__Impl"


    // $ANTLR start "rule__Cluster__Group_11_3__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2002:1: rule__Cluster__Group_11_3__1 : rule__Cluster__Group_11_3__1__Impl ;
    public final void rule__Cluster__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2006:1: ( rule__Cluster__Group_11_3__1__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2007:2: rule__Cluster__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__Group_11_3__1__Impl_in_rule__Cluster__Group_11_3__13935);
            rule__Cluster__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__Cluster__Group_11_3__1"


    // $ANTLR start "rule__Cluster__Group_11_3__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2013:1: rule__Cluster__Group_11_3__1__Impl : ( ( rule__Cluster__ServerAssignment_11_3_1 ) ) ;
    public final void rule__Cluster__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2017:1: ( ( ( rule__Cluster__ServerAssignment_11_3_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2018:1: ( ( rule__Cluster__ServerAssignment_11_3_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2018:1: ( ( rule__Cluster__ServerAssignment_11_3_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2019:1: ( rule__Cluster__ServerAssignment_11_3_1 )
            {
             before(grammarAccess.getClusterAccess().getServerAssignment_11_3_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2020:1: ( rule__Cluster__ServerAssignment_11_3_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2020:2: rule__Cluster__ServerAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cluster__ServerAssignment_11_3_1_in_rule__Cluster__Group_11_3__1__Impl3962);
            rule__Cluster__ServerAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getServerAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group_11_3__1__Impl"


    // $ANTLR start "rule__EBigInteger__Group__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2034:1: rule__EBigInteger__Group__0 : rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 ;
    public final void rule__EBigInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2038:1: ( rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2039:2: rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__0__Impl_in_rule__EBigInteger__Group__03996);
            rule__EBigInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__1_in_rule__EBigInteger__Group__03999);
            rule__EBigInteger__Group__1();

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
    // $ANTLR end "rule__EBigInteger__Group__0"


    // $ANTLR start "rule__EBigInteger__Group__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2046:1: rule__EBigInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EBigInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2050:1: ( ( ( '-' )? ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2051:1: ( ( '-' )? )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2051:1: ( ( '-' )? )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2052:1: ( '-' )?
            {
             before(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2053:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2054:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EBigInteger__Group__0__Impl4028); 

                    }
                    break;

            }

             after(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__0__Impl"


    // $ANTLR start "rule__EBigInteger__Group__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2065:1: rule__EBigInteger__Group__1 : rule__EBigInteger__Group__1__Impl ;
    public final void rule__EBigInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2069:1: ( rule__EBigInteger__Group__1__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2070:2: rule__EBigInteger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__1__Impl_in_rule__EBigInteger__Group__14061);
            rule__EBigInteger__Group__1__Impl();

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
    // $ANTLR end "rule__EBigInteger__Group__1"


    // $ANTLR start "rule__EBigInteger__Group__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2076:1: rule__EBigInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EBigInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2080:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2081:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2081:1: ( RULE_INT )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2082:1: RULE_INT
            {
             before(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigInteger__Group__1__Impl4088); 
             after(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__1__Impl"


    // $ANTLR start "rule__Server__Group__0"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2097:1: rule__Server__Group__0 : rule__Server__Group__0__Impl rule__Server__Group__1 ;
    public final void rule__Server__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2101:1: ( rule__Server__Group__0__Impl rule__Server__Group__1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2102:2: rule__Server__Group__0__Impl rule__Server__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__0__Impl_in_rule__Server__Group__04121);
            rule__Server__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__1_in_rule__Server__Group__04124);
            rule__Server__Group__1();

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
    // $ANTLR end "rule__Server__Group__0"


    // $ANTLR start "rule__Server__Group__0__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2109:1: rule__Server__Group__0__Impl : ( 'Server' ) ;
    public final void rule__Server__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2113:1: ( ( 'Server' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2114:1: ( 'Server' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2114:1: ( 'Server' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2115:1: 'Server'
            {
             before(grammarAccess.getServerAccess().getServerKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Server__Group__0__Impl4152); 
             after(grammarAccess.getServerAccess().getServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__0__Impl"


    // $ANTLR start "rule__Server__Group__1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2128:1: rule__Server__Group__1 : rule__Server__Group__1__Impl rule__Server__Group__2 ;
    public final void rule__Server__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2132:1: ( rule__Server__Group__1__Impl rule__Server__Group__2 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2133:2: rule__Server__Group__1__Impl rule__Server__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__1__Impl_in_rule__Server__Group__14183);
            rule__Server__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__2_in_rule__Server__Group__14186);
            rule__Server__Group__2();

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
    // $ANTLR end "rule__Server__Group__1"


    // $ANTLR start "rule__Server__Group__1__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2140:1: rule__Server__Group__1__Impl : ( ( rule__Server__NameAssignment_1 ) ) ;
    public final void rule__Server__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2144:1: ( ( ( rule__Server__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2145:1: ( ( rule__Server__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2145:1: ( ( rule__Server__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2146:1: ( rule__Server__NameAssignment_1 )
            {
             before(grammarAccess.getServerAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2147:1: ( rule__Server__NameAssignment_1 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2147:2: rule__Server__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__NameAssignment_1_in_rule__Server__Group__1__Impl4213);
            rule__Server__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__1__Impl"


    // $ANTLR start "rule__Server__Group__2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2157:1: rule__Server__Group__2 : rule__Server__Group__2__Impl rule__Server__Group__3 ;
    public final void rule__Server__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2161:1: ( rule__Server__Group__2__Impl rule__Server__Group__3 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2162:2: rule__Server__Group__2__Impl rule__Server__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__2__Impl_in_rule__Server__Group__24243);
            rule__Server__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__3_in_rule__Server__Group__24246);
            rule__Server__Group__3();

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
    // $ANTLR end "rule__Server__Group__2"


    // $ANTLR start "rule__Server__Group__2__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2169:1: rule__Server__Group__2__Impl : ( '{' ) ;
    public final void rule__Server__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2173:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2174:1: ( '{' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2174:1: ( '{' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2175:1: '{'
            {
             before(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Server__Group__2__Impl4274); 
             after(grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__2__Impl"


    // $ANTLR start "rule__Server__Group__3"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2188:1: rule__Server__Group__3 : rule__Server__Group__3__Impl rule__Server__Group__4 ;
    public final void rule__Server__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2192:1: ( rule__Server__Group__3__Impl rule__Server__Group__4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2193:2: rule__Server__Group__3__Impl rule__Server__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__3__Impl_in_rule__Server__Group__34305);
            rule__Server__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__4_in_rule__Server__Group__34308);
            rule__Server__Group__4();

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
    // $ANTLR end "rule__Server__Group__3"


    // $ANTLR start "rule__Server__Group__3__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2200:1: rule__Server__Group__3__Impl : ( 'speed' ) ;
    public final void rule__Server__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2204:1: ( ( 'speed' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2205:1: ( 'speed' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2205:1: ( 'speed' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2206:1: 'speed'
            {
             before(grammarAccess.getServerAccess().getSpeedKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Server__Group__3__Impl4336); 
             after(grammarAccess.getServerAccess().getSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__3__Impl"


    // $ANTLR start "rule__Server__Group__4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2219:1: rule__Server__Group__4 : rule__Server__Group__4__Impl rule__Server__Group__5 ;
    public final void rule__Server__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2223:1: ( rule__Server__Group__4__Impl rule__Server__Group__5 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2224:2: rule__Server__Group__4__Impl rule__Server__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__4__Impl_in_rule__Server__Group__44367);
            rule__Server__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__5_in_rule__Server__Group__44370);
            rule__Server__Group__5();

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
    // $ANTLR end "rule__Server__Group__4"


    // $ANTLR start "rule__Server__Group__4__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2231:1: rule__Server__Group__4__Impl : ( ( rule__Server__SpeedAssignment_4 ) ) ;
    public final void rule__Server__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2235:1: ( ( ( rule__Server__SpeedAssignment_4 ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2236:1: ( ( rule__Server__SpeedAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2236:1: ( ( rule__Server__SpeedAssignment_4 ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2237:1: ( rule__Server__SpeedAssignment_4 )
            {
             before(grammarAccess.getServerAccess().getSpeedAssignment_4()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2238:1: ( rule__Server__SpeedAssignment_4 )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2238:2: rule__Server__SpeedAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__SpeedAssignment_4_in_rule__Server__Group__4__Impl4397);
            rule__Server__SpeedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getSpeedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__4__Impl"


    // $ANTLR start "rule__Server__Group__5"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2248:1: rule__Server__Group__5 : rule__Server__Group__5__Impl ;
    public final void rule__Server__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2252:1: ( rule__Server__Group__5__Impl )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2253:2: rule__Server__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Server__Group__5__Impl_in_rule__Server__Group__54427);
            rule__Server__Group__5__Impl();

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
    // $ANTLR end "rule__Server__Group__5"


    // $ANTLR start "rule__Server__Group__5__Impl"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2259:1: rule__Server__Group__5__Impl : ( '}' ) ;
    public final void rule__Server__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2263:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2264:1: ( '}' )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2264:1: ( '}' )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2265:1: '}'
            {
             before(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Server__Group__5__Impl4455); 
             after(grammarAccess.getServerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__5__Impl"


    // $ANTLR start "rule__Container__ServiceAssignment_3_2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2291:1: rule__Container__ServiceAssignment_3_2 : ( ruleService ) ;
    public final void rule__Container__ServiceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2295:1: ( ( ruleService ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2296:1: ( ruleService )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2296:1: ( ruleService )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2297:1: ruleService
            {
             before(grammarAccess.getContainerAccess().getServiceServiceParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_rule__Container__ServiceAssignment_3_24503);
            ruleService();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getServiceServiceParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ServiceAssignment_3_2"


    // $ANTLR start "rule__Container__ServiceAssignment_3_3_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2306:1: rule__Container__ServiceAssignment_3_3_1 : ( ruleService ) ;
    public final void rule__Container__ServiceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2310:1: ( ( ruleService ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2311:1: ( ruleService )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2311:1: ( ruleService )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2312:1: ruleService
            {
             before(grammarAccess.getContainerAccess().getServiceServiceParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_rule__Container__ServiceAssignment_3_3_14534);
            ruleService();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getServiceServiceParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ServiceAssignment_3_3_1"


    // $ANTLR start "rule__Container__ClusterAssignment_4_2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2321:1: rule__Container__ClusterAssignment_4_2 : ( ruleCluster ) ;
    public final void rule__Container__ClusterAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2325:1: ( ( ruleCluster ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2326:1: ( ruleCluster )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2326:1: ( ruleCluster )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2327:1: ruleCluster
            {
             before(grammarAccess.getContainerAccess().getClusterClusterParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_rule__Container__ClusterAssignment_4_24565);
            ruleCluster();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getClusterClusterParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ClusterAssignment_4_2"


    // $ANTLR start "rule__Container__ClusterAssignment_4_3_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2336:1: rule__Container__ClusterAssignment_4_3_1 : ( ruleCluster ) ;
    public final void rule__Container__ClusterAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2340:1: ( ( ruleCluster ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2341:1: ( ruleCluster )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2341:1: ( ruleCluster )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2342:1: ruleCluster
            {
             before(grammarAccess.getContainerAccess().getClusterClusterParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_rule__Container__ClusterAssignment_4_3_14596);
            ruleCluster();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getClusterClusterParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ClusterAssignment_4_3_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2351:1: rule__Service__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2355:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2356:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2356:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2357:1: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Service__NameAssignment_14627);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__DesignSpeedAssignment_4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2366:1: rule__Service__DesignSpeedAssignment_4 : ( ruleEBigInteger ) ;
    public final void rule__Service__DesignSpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2370:1: ( ( ruleEBigInteger ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2371:1: ( ruleEBigInteger )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2371:1: ( ruleEBigInteger )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2372:1: ruleEBigInteger
            {
             before(grammarAccess.getServiceAccess().getDesignSpeedEBigIntegerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_rule__Service__DesignSpeedAssignment_44658);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDesignSpeedEBigIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__DesignSpeedAssignment_4"


    // $ANTLR start "rule__Service__TypeAssignment_6"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2381:1: rule__Service__TypeAssignment_6 : ( ruleServiceType ) ;
    public final void rule__Service__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2385:1: ( ( ruleServiceType ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2386:1: ( ruleServiceType )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2386:1: ( ruleServiceType )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2387:1: ruleServiceType
            {
             before(grammarAccess.getServiceAccess().getTypeServiceTypeEnumRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceType_in_rule__Service__TypeAssignment_64689);
            ruleServiceType();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getTypeServiceTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__TypeAssignment_6"


    // $ANTLR start "rule__Service__ProvidedByAssignment_8"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2396:1: rule__Service__ProvidedByAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Service__ProvidedByAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2400:1: ( ( ( ruleEString ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2401:1: ( ( ruleEString ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2401:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2402:1: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getProvidedByClusterCrossReference_8_0()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2403:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2404:1: ruleEString
            {
             before(grammarAccess.getServiceAccess().getProvidedByClusterEStringParserRuleCall_8_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Service__ProvidedByAssignment_84724);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getProvidedByClusterEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getProvidedByClusterCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ProvidedByAssignment_8"


    // $ANTLR start "rule__Cluster__NameAssignment_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2415:1: rule__Cluster__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Cluster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2419:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2420:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2420:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2421:1: ruleEString
            {
             before(grammarAccess.getClusterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Cluster__NameAssignment_14759);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__NameAssignment_1"


    // $ANTLR start "rule__Cluster__DesignSpeedAssignment_4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2430:1: rule__Cluster__DesignSpeedAssignment_4 : ( ruleEBigInteger ) ;
    public final void rule__Cluster__DesignSpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2434:1: ( ( ruleEBigInteger ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2435:1: ( ruleEBigInteger )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2435:1: ( ruleEBigInteger )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2436:1: ruleEBigInteger
            {
             before(grammarAccess.getClusterAccess().getDesignSpeedEBigIntegerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_rule__Cluster__DesignSpeedAssignment_44790);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getDesignSpeedEBigIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__DesignSpeedAssignment_4"


    // $ANTLR start "rule__Cluster__ServicesAssignment_7"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2445:1: rule__Cluster__ServicesAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Cluster__ServicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2449:1: ( ( ( ruleEString ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2450:1: ( ( ruleEString ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2450:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2451:1: ( ruleEString )
            {
             before(grammarAccess.getClusterAccess().getServicesServiceCrossReference_7_0()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2452:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2453:1: ruleEString
            {
             before(grammarAccess.getClusterAccess().getServicesServiceEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Cluster__ServicesAssignment_74825);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getServicesServiceEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getClusterAccess().getServicesServiceCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__ServicesAssignment_7"


    // $ANTLR start "rule__Cluster__ServicesAssignment_8_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2464:1: rule__Cluster__ServicesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Cluster__ServicesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2468:1: ( ( ( ruleEString ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2469:1: ( ( ruleEString ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2469:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2470:1: ( ruleEString )
            {
             before(grammarAccess.getClusterAccess().getServicesServiceCrossReference_8_1_0()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2471:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2472:1: ruleEString
            {
             before(grammarAccess.getClusterAccess().getServicesServiceEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Cluster__ServicesAssignment_8_14864);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getServicesServiceEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getClusterAccess().getServicesServiceCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__ServicesAssignment_8_1"


    // $ANTLR start "rule__Cluster__BackupAssignment_10_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2483:1: rule__Cluster__BackupAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__Cluster__BackupAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2487:1: ( ( ( ruleEString ) ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2488:1: ( ( ruleEString ) )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2488:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2489:1: ( ruleEString )
            {
             before(grammarAccess.getClusterAccess().getBackupClusterCrossReference_10_1_0()); 
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2490:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2491:1: ruleEString
            {
             before(grammarAccess.getClusterAccess().getBackupClusterEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Cluster__BackupAssignment_10_14903);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getBackupClusterEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getClusterAccess().getBackupClusterCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__BackupAssignment_10_1"


    // $ANTLR start "rule__Cluster__ServerAssignment_11_2"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2502:1: rule__Cluster__ServerAssignment_11_2 : ( ruleServer ) ;
    public final void rule__Cluster__ServerAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2506:1: ( ( ruleServer ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2507:1: ( ruleServer )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2507:1: ( ruleServer )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2508:1: ruleServer
            {
             before(grammarAccess.getClusterAccess().getServerServerParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServer_in_rule__Cluster__ServerAssignment_11_24938);
            ruleServer();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getServerServerParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__ServerAssignment_11_2"


    // $ANTLR start "rule__Cluster__ServerAssignment_11_3_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2517:1: rule__Cluster__ServerAssignment_11_3_1 : ( ruleServer ) ;
    public final void rule__Cluster__ServerAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2521:1: ( ( ruleServer ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2522:1: ( ruleServer )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2522:1: ( ruleServer )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2523:1: ruleServer
            {
             before(grammarAccess.getClusterAccess().getServerServerParserRuleCall_11_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServer_in_rule__Cluster__ServerAssignment_11_3_14969);
            ruleServer();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getServerServerParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__ServerAssignment_11_3_1"


    // $ANTLR start "rule__Server__NameAssignment_1"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2532:1: rule__Server__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Server__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2536:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2537:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2537:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2538:1: ruleEString
            {
             before(grammarAccess.getServerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Server__NameAssignment_15000);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__NameAssignment_1"


    // $ANTLR start "rule__Server__SpeedAssignment_4"
    // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2547:1: rule__Server__SpeedAssignment_4 : ( ruleEBigInteger ) ;
    public final void rule__Server__SpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2551:1: ( ( ruleEBigInteger ) )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2552:1: ( ruleEBigInteger )
            {
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2552:1: ( ruleEBigInteger )
            // ../at.ac.tuwien.big.servicelang.ui/src-gen/at/ac/tuwien/big/servicelang/ui/contentassist/antlr/internal/InternalService.g:2553:1: ruleEBigInteger
            {
             before(grammarAccess.getServerAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_rule__Server__SpeedAssignment_45031);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getServerAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__SpeedAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__0_in_ruleContainer94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_entryRuleCluster181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCluster188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__0_in_ruleCluster214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigInteger308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__0_in_ruleEBigInteger334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServer_in_entryRuleServer361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServer368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__0_in_ruleServer394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceType__Alternatives_in_ruleServiceType431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__ServiceType__Alternatives516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ServiceType__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ServiceType__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ServiceType__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__0612 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__0615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__1673 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Container__Group__1__Impl704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__2735 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__2738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Container__Group__2__Impl766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__3797 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_rule__Container__Group__4_in_rule__Container__Group__3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3__0_in_rule__Container__Group__3__Impl827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__4858 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_rule__Container__Group__5_in_rule__Container__Group__4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__0_in_rule__Container__Group__4__Impl888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__5919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Container__Group__5__Impl947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3__0__Impl_in_rule__Container__Group_3__0990 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Container__Group_3__1_in_rule__Container__Group_3__0993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Container__Group_3__0__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3__1__Impl_in_rule__Container__Group_3__11052 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Container__Group_3__2_in_rule__Container__Group_3__11055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Container__Group_3__1__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3__2__Impl_in_rule__Container__Group_3__21114 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Container__Group_3__3_in_rule__Container__Group_3__21117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__ServiceAssignment_3_2_in_rule__Container__Group_3__2__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3__3__Impl_in_rule__Container__Group_3__31174 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Container__Group_3__4_in_rule__Container__Group_3__31177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3_3__0_in_rule__Container__Group_3__3__Impl1204 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Container__Group_3__4__Impl_in_rule__Container__Group_3__41235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Container__Group_3__4__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3_3__0__Impl_in_rule__Container__Group_3_3__01304 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Container__Group_3_3__1_in_rule__Container__Group_3_3__01307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Container__Group_3_3__0__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_3_3__1__Impl_in_rule__Container__Group_3_3__11366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__ServiceAssignment_3_3_1_in_rule__Container__Group_3_3__1__Impl1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__0__Impl_in_rule__Container__Group_4__01427 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Container__Group_4__1_in_rule__Container__Group_4__01430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Container__Group_4__0__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__1__Impl_in_rule__Container__Group_4__11489 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Container__Group_4__2_in_rule__Container__Group_4__11492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Container__Group_4__1__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__2__Impl_in_rule__Container__Group_4__21551 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Container__Group_4__3_in_rule__Container__Group_4__21554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__ClusterAssignment_4_2_in_rule__Container__Group_4__2__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__3__Impl_in_rule__Container__Group_4__31611 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Container__Group_4__4_in_rule__Container__Group_4__31614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4_3__0_in_rule__Container__Group_4__3__Impl1641 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__4__Impl_in_rule__Container__Group_4__41672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Container__Group_4__4__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4_3__0__Impl_in_rule__Container__Group_4_3__01741 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Container__Group_4_3__1_in_rule__Container__Group_4_3__01744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Container__Group_4_3__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4_3__1__Impl_in_rule__Container__Group_4_3__11803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__ClusterAssignment_4_3_1_in_rule__Container__Group_4_3__1__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__01864 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__01867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Service__Group__0__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__11926 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__11929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__21986 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__21989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Service__Group__2__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32048 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Service__Group__3__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42110 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__42113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__DesignSpeedAssignment_4_in_rule__Service__Group__4__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__52170 = new BitSet(new long[]{0x0000000000007800L});
        public static final BitSet FOLLOW_rule__Service__Group__6_in_rule__Service__Group__52173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Service__Group__5__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__62232 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Service__Group__7_in_rule__Service__Group__62235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__TypeAssignment_6_in_rule__Service__Group__6__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__7__Impl_in_rule__Service__Group__72292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Service__Group__8_in_rule__Service__Group__72295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Service__Group__7__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__8__Impl_in_rule__Service__Group__82354 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Service__Group__9_in_rule__Service__Group__82357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__ProvidedByAssignment_8_in_rule__Service__Group__8__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Group__9__Impl_in_rule__Service__Group__92414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Service__Group__9__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__0__Impl_in_rule__Cluster__Group__02493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Cluster__Group__1_in_rule__Cluster__Group__02496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Cluster__Group__0__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__1__Impl_in_rule__Cluster__Group__12555 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__2_in_rule__Cluster__Group__12558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__NameAssignment_1_in_rule__Cluster__Group__1__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__2__Impl_in_rule__Cluster__Group__22615 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__3_in_rule__Cluster__Group__22618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Cluster__Group__2__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__3__Impl_in_rule__Cluster__Group__32677 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__Cluster__Group__4_in_rule__Cluster__Group__32680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Cluster__Group__3__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__4__Impl_in_rule__Cluster__Group__42739 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__5_in_rule__Cluster__Group__42742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__DesignSpeedAssignment_4_in_rule__Cluster__Group__4__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__5__Impl_in_rule__Cluster__Group__52799 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__6_in_rule__Cluster__Group__52802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Cluster__Group__5__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__6__Impl_in_rule__Cluster__Group__62861 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Cluster__Group__7_in_rule__Cluster__Group__62864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Cluster__Group__6__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__7__Impl_in_rule__Cluster__Group__72923 = new BitSet(new long[]{0x0000000010080000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__8_in_rule__Cluster__Group__72926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__ServicesAssignment_7_in_rule__Cluster__Group__7__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__8__Impl_in_rule__Cluster__Group__82983 = new BitSet(new long[]{0x0000000010080000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__9_in_rule__Cluster__Group__82986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_8__0_in_rule__Cluster__Group__8__Impl3013 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__9__Impl_in_rule__Cluster__Group__93044 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__10_in_rule__Cluster__Group__93047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Cluster__Group__9__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__10__Impl_in_rule__Cluster__Group__103106 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__11_in_rule__Cluster__Group__103109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_10__0_in_rule__Cluster__Group__10__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__11__Impl_in_rule__Cluster__Group__113167 = new BitSet(new long[]{0x0000000060020000L});
        public static final BitSet FOLLOW_rule__Cluster__Group__12_in_rule__Cluster__Group__113170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__0_in_rule__Cluster__Group__11__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group__12__Impl_in_rule__Cluster__Group__123228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Cluster__Group__12__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_8__0__Impl_in_rule__Cluster__Group_8__03313 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Cluster__Group_8__1_in_rule__Cluster__Group_8__03316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Cluster__Group_8__0__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_8__1__Impl_in_rule__Cluster__Group_8__13375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__ServicesAssignment_8_1_in_rule__Cluster__Group_8__1__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_10__0__Impl_in_rule__Cluster__Group_10__03436 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Cluster__Group_10__1_in_rule__Cluster__Group_10__03439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Cluster__Group_10__0__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_10__1__Impl_in_rule__Cluster__Group_10__13498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__BackupAssignment_10_1_in_rule__Cluster__Group_10__1__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__0__Impl_in_rule__Cluster__Group_11__03559 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__1_in_rule__Cluster__Group_11__03562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Cluster__Group_11__0__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__1__Impl_in_rule__Cluster__Group_11__13621 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__2_in_rule__Cluster__Group_11__13624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Cluster__Group_11__1__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__2__Impl_in_rule__Cluster__Group_11__23683 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__3_in_rule__Cluster__Group_11__23686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__ServerAssignment_11_2_in_rule__Cluster__Group_11__2__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__3__Impl_in_rule__Cluster__Group_11__33743 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__4_in_rule__Cluster__Group_11__33746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11_3__0_in_rule__Cluster__Group_11__3__Impl3773 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11__4__Impl_in_rule__Cluster__Group_11__43804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Cluster__Group_11__4__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11_3__0__Impl_in_rule__Cluster__Group_11_3__03873 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11_3__1_in_rule__Cluster__Group_11_3__03876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Cluster__Group_11_3__0__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__Group_11_3__1__Impl_in_rule__Cluster__Group_11_3__13935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cluster__ServerAssignment_11_3_1_in_rule__Cluster__Group_11_3__1__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__0__Impl_in_rule__EBigInteger__Group__03996 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__1_in_rule__EBigInteger__Group__03999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EBigInteger__Group__0__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__1__Impl_in_rule__EBigInteger__Group__14061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigInteger__Group__1__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__0__Impl_in_rule__Server__Group__04121 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Server__Group__1_in_rule__Server__Group__04124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Server__Group__0__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__1__Impl_in_rule__Server__Group__14183 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Server__Group__2_in_rule__Server__Group__14186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__NameAssignment_1_in_rule__Server__Group__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__2__Impl_in_rule__Server__Group__24243 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Server__Group__3_in_rule__Server__Group__24246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Server__Group__2__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__3__Impl_in_rule__Server__Group__34305 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__Server__Group__4_in_rule__Server__Group__34308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Server__Group__3__Impl4336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__4__Impl_in_rule__Server__Group__44367 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Server__Group__5_in_rule__Server__Group__44370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__SpeedAssignment_4_in_rule__Server__Group__4__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Server__Group__5__Impl_in_rule__Server__Group__54427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Server__Group__5__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_rule__Container__ServiceAssignment_3_24503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_rule__Container__ServiceAssignment_3_3_14534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_rule__Container__ClusterAssignment_4_24565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_rule__Container__ClusterAssignment_4_3_14596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Service__NameAssignment_14627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_rule__Service__DesignSpeedAssignment_44658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceType_in_rule__Service__TypeAssignment_64689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Service__ProvidedByAssignment_84724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Cluster__NameAssignment_14759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_rule__Cluster__DesignSpeedAssignment_44790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Cluster__ServicesAssignment_74825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Cluster__ServicesAssignment_8_14864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Cluster__BackupAssignment_10_14903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServer_in_rule__Cluster__ServerAssignment_11_24938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServer_in_rule__Cluster__ServerAssignment_11_3_14969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Server__NameAssignment_15000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_rule__Server__SpeedAssignment_45031 = new BitSet(new long[]{0x0000000000000002L});
    }


}