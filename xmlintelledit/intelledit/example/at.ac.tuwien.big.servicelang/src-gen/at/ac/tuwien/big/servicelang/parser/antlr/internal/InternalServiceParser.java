package at.ac.tuwien.big.servicelang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.servicelang.services.ServiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServiceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Container'", "'{'", "'service'", "','", "'}'", "'cluster'", "'Service'", "'designSpeed'", "'type'", "'providedBy'", "'Cluster'", "'services'", "'('", "')'", "'backup'", "'server'", "'-'", "'Server'", "'speed'", "'BESTEFFORT'", "'WEAKCONTRACT'", "'FAILSAFE'", "'IMPORTANT'"
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g"; }



     	private ServiceGrammarAccess grammarAccess;
     	
        public InternalServiceParser(TokenStream input, ServiceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Container";	
       	}
       	
       	@Override
       	protected ServiceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleContainer"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:68:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:69:2: (iv_ruleContainer= ruleContainer EOF )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:70:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer75);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:77:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' otherlv_2= '{' (otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}' )? (otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_service_5_0 = null;

        EObject lv_service_7_0 = null;

        EObject lv_cluster_11_0 = null;

        EObject lv_cluster_13_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:80:28: ( ( () otherlv_1= 'Container' otherlv_2= '{' (otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}' )? (otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:81:1: ( () otherlv_1= 'Container' otherlv_2= '{' (otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}' )? (otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:81:1: ( () otherlv_1= 'Container' otherlv_2= '{' (otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}' )? (otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:81:2: () otherlv_1= 'Container' otherlv_2= '{' (otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}' )? (otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:81:2: ()
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContainerAccess().getContainerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContainer131); 

                	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContainer143); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:95:1: (otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:95:3: otherlv_3= 'service' otherlv_4= '{' ( (lv_service_5_0= ruleService ) ) (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContainer156); 

                        	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getServiceKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContainer168); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:103:1: ( (lv_service_5_0= ruleService ) )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:104:1: (lv_service_5_0= ruleService )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:104:1: (lv_service_5_0= ruleService )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:105:3: lv_service_5_0= ruleService
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getServiceServiceParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleService_in_ruleContainer189);
                    lv_service_5_0=ruleService();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"service",
                            		lv_service_5_0, 
                            		"Service");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:121:2: (otherlv_6= ',' ( (lv_service_7_0= ruleService ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:121:4: otherlv_6= ',' ( (lv_service_7_0= ruleService ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContainer202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:125:1: ( (lv_service_7_0= ruleService ) )
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:126:1: (lv_service_7_0= ruleService )
                    	    {
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:126:1: (lv_service_7_0= ruleService )
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:127:3: lv_service_7_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerAccess().getServiceServiceParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleService_in_ruleContainer223);
                    	    lv_service_7_0=ruleService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"service",
                    	            		lv_service_7_0, 
                    	            		"Service");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContainer237); 

                        	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:147:3: (otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:147:5: otherlv_9= 'cluster' otherlv_10= '{' ( (lv_cluster_11_0= ruleCluster ) ) (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContainer252); 

                        	newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getClusterKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContainer264); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:155:1: ( (lv_cluster_11_0= ruleCluster ) )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:156:1: (lv_cluster_11_0= ruleCluster )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:156:1: (lv_cluster_11_0= ruleCluster )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:157:3: lv_cluster_11_0= ruleCluster
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getClusterClusterParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleContainer285);
                    lv_cluster_11_0=ruleCluster();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"cluster",
                            		lv_cluster_11_0, 
                            		"Cluster");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:173:2: (otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:173:4: otherlv_12= ',' ( (lv_cluster_13_0= ruleCluster ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContainer298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:177:1: ( (lv_cluster_13_0= ruleCluster ) )
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:178:1: (lv_cluster_13_0= ruleCluster )
                    	    {
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:178:1: (lv_cluster_13_0= ruleCluster )
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:179:3: lv_cluster_13_0= ruleCluster
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerAccess().getClusterClusterParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleContainer319);
                    	    lv_cluster_13_0=ruleCluster();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cluster",
                    	            		lv_cluster_13_0, 
                    	            		"Cluster");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContainer333); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContainer347); 

                	newLeafNode(otherlv_15, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleService"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:211:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:212:2: (iv_ruleService= ruleService EOF )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:213:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService383);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:220:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleServiceType ) ) otherlv_7= 'providedBy' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_designSpeed_4_0 = null;

        Enumerator lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:223:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleServiceType ) ) otherlv_7= 'providedBy' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:224:1: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleServiceType ) ) otherlv_7= 'providedBy' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:224:1: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleServiceType ) ) otherlv_7= 'providedBy' ( ( ruleEString ) ) otherlv_9= '}' )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:224:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleServiceType ) ) otherlv_7= 'providedBy' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleService430); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:228:1: ( (lv_name_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:229:1: (lv_name_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:229:1: (lv_name_1_0= ruleEString )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:230:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleService451);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleService463); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleService475); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDesignSpeedKeyword_3());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:254:1: ( (lv_designSpeed_4_0= ruleEBigInteger ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:255:1: (lv_designSpeed_4_0= ruleEBigInteger )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:255:1: (lv_designSpeed_4_0= ruleEBigInteger )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:256:3: lv_designSpeed_4_0= ruleEBigInteger
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getDesignSpeedEBigIntegerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_ruleService496);
            lv_designSpeed_4_0=ruleEBigInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"designSpeed",
                    		lv_designSpeed_4_0, 
                    		"EBigInteger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleService508); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getTypeKeyword_5());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:276:1: ( (lv_type_6_0= ruleServiceType ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:277:1: (lv_type_6_0= ruleServiceType )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:277:1: (lv_type_6_0= ruleServiceType )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:278:3: lv_type_6_0= ruleServiceType
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getTypeServiceTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleServiceType_in_ruleService529);
            lv_type_6_0=ruleServiceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"ServiceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleService541); 

                	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getProvidedByKeyword_7());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:298:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:299:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:299:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:300:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getProvidedByClusterCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleService564);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleService576); 

                	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleCluster"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:325:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:326:2: (iv_ruleCluster= ruleCluster EOF )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:327:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_entryRuleCluster612);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCluster622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:334:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'Cluster' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'services' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'backup' ( ( ruleEString ) ) )? (otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_designSpeed_4_0 = null;

        EObject lv_server_15_0 = null;

        EObject lv_server_17_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:337:28: ( (otherlv_0= 'Cluster' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'services' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'backup' ( ( ruleEString ) ) )? (otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:338:1: (otherlv_0= 'Cluster' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'services' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'backup' ( ( ruleEString ) ) )? (otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:338:1: (otherlv_0= 'Cluster' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'services' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'backup' ( ( ruleEString ) ) )? (otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:338:3: otherlv_0= 'Cluster' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'designSpeed' ( (lv_designSpeed_4_0= ruleEBigInteger ) ) otherlv_5= 'services' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'backup' ( ( ruleEString ) ) )? (otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCluster659); 

                	newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getClusterKeyword_0());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:342:1: ( (lv_name_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:343:1: (lv_name_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:343:1: (lv_name_1_0= ruleEString )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:344:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getClusterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster680);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClusterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster692); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCluster704); 

                	newLeafNode(otherlv_3, grammarAccess.getClusterAccess().getDesignSpeedKeyword_3());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:368:1: ( (lv_designSpeed_4_0= ruleEBigInteger ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:369:1: (lv_designSpeed_4_0= ruleEBigInteger )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:369:1: (lv_designSpeed_4_0= ruleEBigInteger )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:370:3: lv_designSpeed_4_0= ruleEBigInteger
            {
             
            	        newCompositeNode(grammarAccess.getClusterAccess().getDesignSpeedEBigIntegerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_ruleCluster725);
            lv_designSpeed_4_0=ruleEBigInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClusterRule());
            	        }
                   		set(
                   			current, 
                   			"designSpeed",
                    		lv_designSpeed_4_0, 
                    		"EBigInteger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCluster737); 

                	newLeafNode(otherlv_5, grammarAccess.getClusterAccess().getServicesKeyword_5());
                
            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCluster749); 

                	newLeafNode(otherlv_6, grammarAccess.getClusterAccess().getLeftParenthesisKeyword_6());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:394:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:395:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:395:1: ( ruleEString )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:396:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClusterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClusterAccess().getServicesServiceCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster772);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:409:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:409:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCluster785); 

            	        	newLeafNode(otherlv_8, grammarAccess.getClusterAccess().getCommaKeyword_8_0());
            	        
            	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:413:1: ( ( ruleEString ) )
            	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:414:1: ( ruleEString )
            	    {
            	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:414:1: ( ruleEString )
            	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:415:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClusterRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getClusterAccess().getServicesServiceCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster808);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCluster822); 

                	newLeafNode(otherlv_10, grammarAccess.getClusterAccess().getRightParenthesisKeyword_9());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:432:1: (otherlv_11= 'backup' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:432:3: otherlv_11= 'backup' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCluster835); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusterAccess().getBackupKeyword_10_0());
                        
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:436:1: ( ( ruleEString ) )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:437:1: ( ruleEString )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:437:1: ( ruleEString )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:438:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getBackupClusterCrossReference_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster858);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:451:4: (otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:451:6: otherlv_13= 'server' otherlv_14= '{' ( (lv_server_15_0= ruleServer ) ) (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCluster873); 

                        	newLeafNode(otherlv_13, grammarAccess.getClusterAccess().getServerKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster885); 

                        	newLeafNode(otherlv_14, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:459:1: ( (lv_server_15_0= ruleServer ) )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:460:1: (lv_server_15_0= ruleServer )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:460:1: (lv_server_15_0= ruleServer )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:461:3: lv_server_15_0= ruleServer
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getServerServerParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleServer_in_ruleCluster906);
                    lv_server_15_0=ruleServer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		add(
                           			current, 
                           			"server",
                            		lv_server_15_0, 
                            		"Server");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:477:2: (otherlv_16= ',' ( (lv_server_17_0= ruleServer ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:477:4: otherlv_16= ',' ( (lv_server_17_0= ruleServer ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCluster919); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getClusterAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:481:1: ( (lv_server_17_0= ruleServer ) )
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:482:1: (lv_server_17_0= ruleServer )
                    	    {
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:482:1: (lv_server_17_0= ruleServer )
                    	    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:483:3: lv_server_17_0= ruleServer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getServerServerParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleServer_in_ruleCluster940);
                    	    lv_server_17_0=ruleServer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"server",
                    	            		lv_server_17_0, 
                    	            		"Server");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCluster954); 

                        	newLeafNode(otherlv_18, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCluster968); 

                	newLeafNode(otherlv_19, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleEString"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:515:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:516:2: (iv_ruleEString= ruleEString EOF )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:517:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1005);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:524:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:527:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:528:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:528:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:528:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1056); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:536:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1082); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBigInteger"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:551:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:552:2: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:553:2: iv_ruleEBigInteger= ruleEBigInteger EOF
            {
             newCompositeNode(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger1128);
            iv_ruleEBigInteger=ruleEBigInteger();

            state._fsp--;

             current =iv_ruleEBigInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigInteger1139); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:560:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:563:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:564:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:564:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:564:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:564:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:565:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEBigInteger1178); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigInteger1195); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRuleServer"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:585:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:586:2: (iv_ruleServer= ruleServer EOF )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:587:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServer_in_entryRuleServer1240);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServer1250); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:594:1: ruleServer returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:597:28: ( (otherlv_0= 'Server' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:598:1: (otherlv_0= 'Server' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:598:1: (otherlv_0= 'Server' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:598:3: otherlv_0= 'Server' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleServer1287); 

                	newLeafNode(otherlv_0, grammarAccess.getServerAccess().getServerKeyword_0());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:602:1: ( (lv_name_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:603:1: (lv_name_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:603:1: (lv_name_1_0= ruleEString )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:604:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getServerAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleServer1308);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleServer1320); 

                	newLeafNode(otherlv_2, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleServer1332); 

                	newLeafNode(otherlv_3, grammarAccess.getServerAccess().getSpeedKeyword_3());
                
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:628:1: ( (lv_speed_4_0= ruleEBigInteger ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:629:1: (lv_speed_4_0= ruleEBigInteger )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:629:1: (lv_speed_4_0= ruleEBigInteger )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:630:3: lv_speed_4_0= ruleEBigInteger
            {
             
            	        newCompositeNode(grammarAccess.getServerAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_ruleServer1353);
            lv_speed_4_0=ruleEBigInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServerRule());
            	        }
                   		set(
                   			current, 
                   			"speed",
                    		lv_speed_4_0, 
                    		"EBigInteger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleServer1365); 

                	newLeafNode(otherlv_5, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "ruleServiceType"
    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:658:1: ruleServiceType returns [Enumerator current=null] : ( (enumLiteral_0= 'BESTEFFORT' ) | (enumLiteral_1= 'WEAKCONTRACT' ) | (enumLiteral_2= 'FAILSAFE' ) | (enumLiteral_3= 'IMPORTANT' ) ) ;
    public final Enumerator ruleServiceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:660:28: ( ( (enumLiteral_0= 'BESTEFFORT' ) | (enumLiteral_1= 'WEAKCONTRACT' ) | (enumLiteral_2= 'FAILSAFE' ) | (enumLiteral_3= 'IMPORTANT' ) ) )
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:661:1: ( (enumLiteral_0= 'BESTEFFORT' ) | (enumLiteral_1= 'WEAKCONTRACT' ) | (enumLiteral_2= 'FAILSAFE' ) | (enumLiteral_3= 'IMPORTANT' ) )
            {
            // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:661:1: ( (enumLiteral_0= 'BESTEFFORT' ) | (enumLiteral_1= 'WEAKCONTRACT' ) | (enumLiteral_2= 'FAILSAFE' ) | (enumLiteral_3= 'IMPORTANT' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:661:2: (enumLiteral_0= 'BESTEFFORT' )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:661:2: (enumLiteral_0= 'BESTEFFORT' )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:661:4: enumLiteral_0= 'BESTEFFORT'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleServiceType1415); 

                            current = grammarAccess.getServiceTypeAccess().getBESTEFFORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getServiceTypeAccess().getBESTEFFORTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:667:6: (enumLiteral_1= 'WEAKCONTRACT' )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:667:6: (enumLiteral_1= 'WEAKCONTRACT' )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:667:8: enumLiteral_1= 'WEAKCONTRACT'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleServiceType1432); 

                            current = grammarAccess.getServiceTypeAccess().getWEAKCONTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getServiceTypeAccess().getWEAKCONTRACTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:673:6: (enumLiteral_2= 'FAILSAFE' )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:673:6: (enumLiteral_2= 'FAILSAFE' )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:673:8: enumLiteral_2= 'FAILSAFE'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleServiceType1449); 

                            current = grammarAccess.getServiceTypeAccess().getFAILSAFEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getServiceTypeAccess().getFAILSAFEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:679:6: (enumLiteral_3= 'IMPORTANT' )
                    {
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:679:6: (enumLiteral_3= 'IMPORTANT' )
                    // ../at.ac.tuwien.big.servicelang/src-gen/at/ac/tuwien/big/servicelang/parser/antlr/internal/InternalService.g:679:8: enumLiteral_3= 'IMPORTANT'
                    {
                    enumLiteral_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleServiceType1466); 

                            current = grammarAccess.getServiceTypeAccess().getIMPORTANTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getServiceTypeAccess().getIMPORTANTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleContainer131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContainer143 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleContainer156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContainer168 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleService_in_ruleContainer189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleContainer202 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleService_in_ruleContainer223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleContainer237 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleContainer252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContainer264 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleContainer285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleContainer298 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleContainer319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleContainer333 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleContainer347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleService430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleService451 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleService463 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleService475 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_ruleService496 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleService508 = new BitSet(new long[]{0x00000003C0000000L});
        public static final BitSet FOLLOW_ruleServiceType_in_ruleService529 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleService541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleService564 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleService576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_entryRuleCluster612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCluster622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCluster659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster680 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster692 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCluster704 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_ruleCluster725 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCluster737 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCluster749 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster772 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleCluster785 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster808 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_ruleCluster822 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleCluster835 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster858 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleCluster873 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster885 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleServer_in_ruleCluster906 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCluster919 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleServer_in_ruleCluster940 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCluster954 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCluster968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger1128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigInteger1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEBigInteger1178 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigInteger1195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServer_in_entryRuleServer1240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServer1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleServer1287 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleServer1308 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleServer1320 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleServer1332 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_ruleServer1353 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleServer1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleServiceType1415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleServiceType1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleServiceType1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleServiceType1466 = new BitSet(new long[]{0x0000000000000002L});
    }


}