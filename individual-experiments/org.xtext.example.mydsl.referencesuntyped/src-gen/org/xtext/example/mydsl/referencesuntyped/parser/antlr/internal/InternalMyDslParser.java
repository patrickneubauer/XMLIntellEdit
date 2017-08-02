package org.xtext.example.mydsl.referencesuntyped.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.referencesuntyped.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrdersType'", "'{'", "'order1'", "','", "'}'", "'order2'", "'orderReference1'", "'orderReference2'", "'OrderDetail1'", "'customerAddress'", "'customerContact'", "'customerName'", "'OrderDetail2'", "'OrderRef1'", "'orderDetail1'", "'OrderRef2'", "'orderDetail2'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "OrdersType";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleOrdersType"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleOrdersType returns [EObject current=null] : iv_ruleOrdersType= ruleOrdersType EOF ;
    public final EObject entryRuleOrdersType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdersType = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleOrdersType= ruleOrdersType EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleOrdersType= ruleOrdersType EOF
            {
             newCompositeNode(grammarAccess.getOrdersTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrdersType_in_entryRuleOrdersType75);
            iv_ruleOrdersType=ruleOrdersType();

            state._fsp--;

             current =iv_ruleOrdersType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrdersType85); 

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
    // $ANTLR end "entryRuleOrdersType"


    // $ANTLR start "ruleOrdersType"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:76:1: ruleOrdersType returns [EObject current=null] : (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order1' otherlv_3= '{' ( (lv_order1_4_0= ruleOrderDetail1 ) ) (otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) ) )* otherlv_7= '}' otherlv_8= 'order2' otherlv_9= '{' ( (lv_order2_10_0= ruleOrderDetail2 ) ) (otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) ) )* otherlv_13= '}' otherlv_14= 'orderReference1' otherlv_15= '{' ( (lv_orderReference1_16_0= ruleOrderRef1 ) ) (otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) ) )* otherlv_19= '}' otherlv_20= 'orderReference2' otherlv_21= '{' ( (lv_orderReference2_22_0= ruleOrderRef2 ) ) (otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) ) )* otherlv_25= '}' otherlv_26= '}' ) ;
    public final EObject ruleOrdersType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_order1_4_0 = null;

        EObject lv_order1_6_0 = null;

        EObject lv_order2_10_0 = null;

        EObject lv_order2_12_0 = null;

        EObject lv_orderReference1_16_0 = null;

        EObject lv_orderReference1_18_0 = null;

        EObject lv_orderReference2_22_0 = null;

        EObject lv_orderReference2_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order1' otherlv_3= '{' ( (lv_order1_4_0= ruleOrderDetail1 ) ) (otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) ) )* otherlv_7= '}' otherlv_8= 'order2' otherlv_9= '{' ( (lv_order2_10_0= ruleOrderDetail2 ) ) (otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) ) )* otherlv_13= '}' otherlv_14= 'orderReference1' otherlv_15= '{' ( (lv_orderReference1_16_0= ruleOrderRef1 ) ) (otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) ) )* otherlv_19= '}' otherlv_20= 'orderReference2' otherlv_21= '{' ( (lv_orderReference2_22_0= ruleOrderRef2 ) ) (otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) ) )* otherlv_25= '}' otherlv_26= '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order1' otherlv_3= '{' ( (lv_order1_4_0= ruleOrderDetail1 ) ) (otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) ) )* otherlv_7= '}' otherlv_8= 'order2' otherlv_9= '{' ( (lv_order2_10_0= ruleOrderDetail2 ) ) (otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) ) )* otherlv_13= '}' otherlv_14= 'orderReference1' otherlv_15= '{' ( (lv_orderReference1_16_0= ruleOrderRef1 ) ) (otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) ) )* otherlv_19= '}' otherlv_20= 'orderReference2' otherlv_21= '{' ( (lv_orderReference2_22_0= ruleOrderRef2 ) ) (otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) ) )* otherlv_25= '}' otherlv_26= '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order1' otherlv_3= '{' ( (lv_order1_4_0= ruleOrderDetail1 ) ) (otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) ) )* otherlv_7= '}' otherlv_8= 'order2' otherlv_9= '{' ( (lv_order2_10_0= ruleOrderDetail2 ) ) (otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) ) )* otherlv_13= '}' otherlv_14= 'orderReference1' otherlv_15= '{' ( (lv_orderReference1_16_0= ruleOrderRef1 ) ) (otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) ) )* otherlv_19= '}' otherlv_20= 'orderReference2' otherlv_21= '{' ( (lv_orderReference2_22_0= ruleOrderRef2 ) ) (otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) ) )* otherlv_25= '}' otherlv_26= '}' )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order1' otherlv_3= '{' ( (lv_order1_4_0= ruleOrderDetail1 ) ) (otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) ) )* otherlv_7= '}' otherlv_8= 'order2' otherlv_9= '{' ( (lv_order2_10_0= ruleOrderDetail2 ) ) (otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) ) )* otherlv_13= '}' otherlv_14= 'orderReference1' otherlv_15= '{' ( (lv_orderReference1_16_0= ruleOrderRef1 ) ) (otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) ) )* otherlv_19= '}' otherlv_20= 'orderReference2' otherlv_21= '{' ( (lv_orderReference2_22_0= ruleOrderRef2 ) ) (otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) ) )* otherlv_25= '}' otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOrdersType122); 

                	newLeafNode(otherlv_0, grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType134); 

                	newLeafNode(otherlv_1, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOrdersType146); 

                	newLeafNode(otherlv_2, grammarAccess.getOrdersTypeAccess().getOrder1Keyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType158); 

                	newLeafNode(otherlv_3, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:96:1: ( (lv_order1_4_0= ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:97:1: (lv_order1_4_0= ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:97:1: (lv_order1_4_0= ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:98:3: lv_order1_4_0= ruleOrderDetail1
            {
             
            	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_ruleOrdersType179);
            lv_order1_4_0=ruleOrderDetail1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	        }
                   		add(
                   			current, 
                   			"order1",
                    		lv_order1_4_0, 
                    		"OrderDetail1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:114:2: (otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:114:4: otherlv_5= ',' ( (lv_order1_6_0= ruleOrderDetail1 ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrdersType192); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:118:1: ( (lv_order1_6_0= ruleOrderDetail1 ) )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:119:1: (lv_order1_6_0= ruleOrderDetail1 )
            	    {
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:119:1: (lv_order1_6_0= ruleOrderDetail1 )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:120:3: lv_order1_6_0= ruleOrderDetail1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_ruleOrdersType213);
            	    lv_order1_6_0=ruleOrderDetail1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"order1",
            	            		lv_order1_6_0, 
            	            		"OrderDetail1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrdersType227); 

                	newLeafNode(otherlv_7, grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOrdersType239); 

                	newLeafNode(otherlv_8, grammarAccess.getOrdersTypeAccess().getOrder2Keyword_7());
                
            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType251); 

                	newLeafNode(otherlv_9, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:148:1: ( (lv_order2_10_0= ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:149:1: (lv_order2_10_0= ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:149:1: (lv_order2_10_0= ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:150:3: lv_order2_10_0= ruleOrderDetail2
            {
             
            	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_ruleOrdersType272);
            lv_order2_10_0=ruleOrderDetail2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	        }
                   		add(
                   			current, 
                   			"order2",
                    		lv_order2_10_0, 
                    		"OrderDetail2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:166:2: (otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:166:4: otherlv_11= ',' ( (lv_order2_12_0= ruleOrderDetail2 ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrdersType285); 

            	        	newLeafNode(otherlv_11, grammarAccess.getOrdersTypeAccess().getCommaKeyword_10_0());
            	        
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:170:1: ( (lv_order2_12_0= ruleOrderDetail2 ) )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_order2_12_0= ruleOrderDetail2 )
            	    {
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_order2_12_0= ruleOrderDetail2 )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:172:3: lv_order2_12_0= ruleOrderDetail2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_ruleOrdersType306);
            	    lv_order2_12_0=ruleOrderDetail2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"order2",
            	            		lv_order2_12_0, 
            	            		"OrderDetail2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrdersType320); 

                	newLeafNode(otherlv_13, grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOrdersType332); 

                	newLeafNode(otherlv_14, grammarAccess.getOrdersTypeAccess().getOrderReference1Keyword_12());
                
            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType344); 

                	newLeafNode(otherlv_15, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_13());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:200:1: ( (lv_orderReference1_16_0= ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:201:1: (lv_orderReference1_16_0= ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:201:1: (lv_orderReference1_16_0= ruleOrderRef1 )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:202:3: lv_orderReference1_16_0= ruleOrderRef1
            {
             
            	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_ruleOrdersType365);
            lv_orderReference1_16_0=ruleOrderRef1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	        }
                   		add(
                   			current, 
                   			"orderReference1",
                    		lv_orderReference1_16_0, 
                    		"OrderRef1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:218:2: (otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:218:4: otherlv_17= ',' ( (lv_orderReference1_18_0= ruleOrderRef1 ) )
            	    {
            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrdersType378); 

            	        	newLeafNode(otherlv_17, grammarAccess.getOrdersTypeAccess().getCommaKeyword_15_0());
            	        
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:222:1: ( (lv_orderReference1_18_0= ruleOrderRef1 ) )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:223:1: (lv_orderReference1_18_0= ruleOrderRef1 )
            	    {
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:223:1: (lv_orderReference1_18_0= ruleOrderRef1 )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:224:3: lv_orderReference1_18_0= ruleOrderRef1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_ruleOrdersType399);
            	    lv_orderReference1_18_0=ruleOrderRef1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orderReference1",
            	            		lv_orderReference1_18_0, 
            	            		"OrderRef1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrdersType413); 

                	newLeafNode(otherlv_19, grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_16());
                
            otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrdersType425); 

                	newLeafNode(otherlv_20, grammarAccess.getOrdersTypeAccess().getOrderReference2Keyword_17());
                
            otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType437); 

                	newLeafNode(otherlv_21, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_18());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:252:1: ( (lv_orderReference2_22_0= ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:253:1: (lv_orderReference2_22_0= ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:253:1: (lv_orderReference2_22_0= ruleOrderRef2 )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:254:3: lv_orderReference2_22_0= ruleOrderRef2
            {
             
            	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_19_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_ruleOrdersType458);
            lv_orderReference2_22_0=ruleOrderRef2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	        }
                   		add(
                   			current, 
                   			"orderReference2",
                    		lv_orderReference2_22_0, 
                    		"OrderRef2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:270:2: (otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:270:4: otherlv_23= ',' ( (lv_orderReference2_24_0= ruleOrderRef2 ) )
            	    {
            	    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrdersType471); 

            	        	newLeafNode(otherlv_23, grammarAccess.getOrdersTypeAccess().getCommaKeyword_20_0());
            	        
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:274:1: ( (lv_orderReference2_24_0= ruleOrderRef2 ) )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_orderReference2_24_0= ruleOrderRef2 )
            	    {
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_orderReference2_24_0= ruleOrderRef2 )
            	    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:276:3: lv_orderReference2_24_0= ruleOrderRef2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_20_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_ruleOrdersType492);
            	    lv_orderReference2_24_0=ruleOrderRef2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orderReference2",
            	            		lv_orderReference2_24_0, 
            	            		"OrderRef2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_25=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrdersType506); 

                	newLeafNode(otherlv_25, grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_21());
                
            otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrdersType518); 

                	newLeafNode(otherlv_26, grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_22());
                

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
    // $ANTLR end "ruleOrdersType"


    // $ANTLR start "entryRuleOrderDetail1"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:308:1: entryRuleOrderDetail1 returns [EObject current=null] : iv_ruleOrderDetail1= ruleOrderDetail1 EOF ;
    public final EObject entryRuleOrderDetail1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderDetail1 = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:309:2: (iv_ruleOrderDetail1= ruleOrderDetail1 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:310:2: iv_ruleOrderDetail1= ruleOrderDetail1 EOF
            {
             newCompositeNode(grammarAccess.getOrderDetail1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_entryRuleOrderDetail1554);
            iv_ruleOrderDetail1=ruleOrderDetail1();

            state._fsp--;

             current =iv_ruleOrderDetail1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail1564); 

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
    // $ANTLR end "entryRuleOrderDetail1"


    // $ANTLR start "ruleOrderDetail1"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:317:1: ruleOrderDetail1 returns [EObject current=null] : ( () otherlv_1= 'OrderDetail1' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) ) )? (otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) ) )? (otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleOrderDetail1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_customerAddress_5_0 = null;

        AntlrDatatypeRuleToken lv_customerContact_7_0 = null;

        AntlrDatatypeRuleToken lv_customerName_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:320:28: ( ( () otherlv_1= 'OrderDetail1' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) ) )? (otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) ) )? (otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:321:1: ( () otherlv_1= 'OrderDetail1' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) ) )? (otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) ) )? (otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:321:1: ( () otherlv_1= 'OrderDetail1' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) ) )? (otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) ) )? (otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) ) )? otherlv_10= '}' )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:321:2: () otherlv_1= 'OrderDetail1' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) ) )? (otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) ) )? (otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:321:2: ()
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:322:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderDetail1Access().getOrderDetail1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOrderDetail1610); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderDetail1Access().getOrderDetail1Keyword_1());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:331:1: ( (lv_name_2_0= ruleID0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:332:1: (lv_name_2_0= ruleID0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:332:1: (lv_name_2_0= ruleID0 )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:333:3: lv_name_2_0= ruleID0
            {
             
            	        newCompositeNode(grammarAccess.getOrderDetail1Access().getNameID0ParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_ruleOrderDetail1631);
            lv_name_2_0=ruleID0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderDetail1Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrderDetail1643); 

                	newLeafNode(otherlv_3, grammarAccess.getOrderDetail1Access().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:353:1: (otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:353:3: otherlv_4= 'customerAddress' ( (lv_customerAddress_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOrderDetail1656); 

                        	newLeafNode(otherlv_4, grammarAccess.getOrderDetail1Access().getCustomerAddressKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:357:1: ( (lv_customerAddress_5_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:358:1: (lv_customerAddress_5_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:358:1: (lv_customerAddress_5_0= ruleString0 )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:359:3: lv_customerAddress_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetail1Access().getCustomerAddressString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOrderDetail1677);
                    lv_customerAddress_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetail1Rule());
                    	        }
                           		set(
                           			current, 
                           			"customerAddress",
                            		lv_customerAddress_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:375:4: (otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:375:6: otherlv_6= 'customerContact' ( (lv_customerContact_7_0= ruleString0 ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOrderDetail1692); 

                        	newLeafNode(otherlv_6, grammarAccess.getOrderDetail1Access().getCustomerContactKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:379:1: ( (lv_customerContact_7_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:380:1: (lv_customerContact_7_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:380:1: (lv_customerContact_7_0= ruleString0 )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:381:3: lv_customerContact_7_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetail1Access().getCustomerContactString0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOrderDetail1713);
                    lv_customerContact_7_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetail1Rule());
                    	        }
                           		set(
                           			current, 
                           			"customerContact",
                            		lv_customerContact_7_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:397:4: (otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:397:6: otherlv_8= 'customerName' ( (lv_customerName_9_0= ruleString0 ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOrderDetail1728); 

                        	newLeafNode(otherlv_8, grammarAccess.getOrderDetail1Access().getCustomerNameKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:401:1: ( (lv_customerName_9_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:402:1: (lv_customerName_9_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:402:1: (lv_customerName_9_0= ruleString0 )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:403:3: lv_customerName_9_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetail1Access().getCustomerNameString0ParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOrderDetail1749);
                    lv_customerName_9_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetail1Rule());
                    	        }
                           		set(
                           			current, 
                           			"customerName",
                            		lv_customerName_9_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrderDetail1763); 

                	newLeafNode(otherlv_10, grammarAccess.getOrderDetail1Access().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOrderDetail1"


    // $ANTLR start "entryRuleOrderDetail2"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:431:1: entryRuleOrderDetail2 returns [EObject current=null] : iv_ruleOrderDetail2= ruleOrderDetail2 EOF ;
    public final EObject entryRuleOrderDetail2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderDetail2 = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:432:2: (iv_ruleOrderDetail2= ruleOrderDetail2 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:433:2: iv_ruleOrderDetail2= ruleOrderDetail2 EOF
            {
             newCompositeNode(grammarAccess.getOrderDetail2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_entryRuleOrderDetail2799);
            iv_ruleOrderDetail2=ruleOrderDetail2();

            state._fsp--;

             current =iv_ruleOrderDetail2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail2809); 

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
    // $ANTLR end "entryRuleOrderDetail2"


    // $ANTLR start "ruleOrderDetail2"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:440:1: ruleOrderDetail2 returns [EObject current=null] : ( () otherlv_1= 'OrderDetail2' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleOrderDetail2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_customerName_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:443:28: ( ( () otherlv_1= 'OrderDetail2' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:444:1: ( () otherlv_1= 'OrderDetail2' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:444:1: ( () otherlv_1= 'OrderDetail2' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:444:2: () otherlv_1= 'OrderDetail2' ( (lv_name_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:444:2: ()
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:445:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderDetail2Access().getOrderDetail2Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOrderDetail2855); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderDetail2Access().getOrderDetail2Keyword_1());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:454:1: ( (lv_name_2_0= ruleID0 ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:455:1: (lv_name_2_0= ruleID0 )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:455:1: (lv_name_2_0= ruleID0 )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:456:3: lv_name_2_0= ruleID0
            {
             
            	        newCompositeNode(grammarAccess.getOrderDetail2Access().getNameID0ParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_ruleOrderDetail2876);
            lv_name_2_0=ruleID0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderDetail2Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrderDetail2888); 

                	newLeafNode(otherlv_3, grammarAccess.getOrderDetail2Access().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:476:1: (otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:476:3: otherlv_4= 'customerName' ( (lv_customerName_5_0= ruleString0 ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOrderDetail2901); 

                        	newLeafNode(otherlv_4, grammarAccess.getOrderDetail2Access().getCustomerNameKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:480:1: ( (lv_customerName_5_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_customerName_5_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_customerName_5_0= ruleString0 )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:482:3: lv_customerName_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetail2Access().getCustomerNameString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOrderDetail2922);
                    lv_customerName_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetail2Rule());
                    	        }
                           		set(
                           			current, 
                           			"customerName",
                            		lv_customerName_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrderDetail2936); 

                	newLeafNode(otherlv_6, grammarAccess.getOrderDetail2Access().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleOrderDetail2"


    // $ANTLR start "entryRuleOrderRef1"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:510:1: entryRuleOrderRef1 returns [EObject current=null] : iv_ruleOrderRef1= ruleOrderRef1 EOF ;
    public final EObject entryRuleOrderRef1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderRef1 = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:511:2: (iv_ruleOrderRef1= ruleOrderRef1 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:512:2: iv_ruleOrderRef1= ruleOrderRef1 EOF
            {
             newCompositeNode(grammarAccess.getOrderRef1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_entryRuleOrderRef1972);
            iv_ruleOrderRef1=ruleOrderRef1();

            state._fsp--;

             current =iv_ruleOrderRef1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderRef1982); 

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
    // $ANTLR end "entryRuleOrderRef1"


    // $ANTLR start "ruleOrderRef1"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:519:1: ruleOrderRef1 returns [EObject current=null] : ( () otherlv_1= 'OrderRef1' otherlv_2= '{' (otherlv_3= 'orderDetail1' ( ( ruleIDREF ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleOrderRef1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:522:28: ( ( () otherlv_1= 'OrderRef1' otherlv_2= '{' (otherlv_3= 'orderDetail1' ( ( ruleIDREF ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:523:1: ( () otherlv_1= 'OrderRef1' otherlv_2= '{' (otherlv_3= 'orderDetail1' ( ( ruleIDREF ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:523:1: ( () otherlv_1= 'OrderRef1' otherlv_2= '{' (otherlv_3= 'orderDetail1' ( ( ruleIDREF ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:523:2: () otherlv_1= 'OrderRef1' otherlv_2= '{' (otherlv_3= 'orderDetail1' ( ( ruleIDREF ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:523:2: ()
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:524:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderRef1Access().getOrderRef1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOrderRef11028); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderRef1Access().getOrderRef1Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrderRef11040); 

                	newLeafNode(otherlv_2, grammarAccess.getOrderRef1Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:537:1: (otherlv_3= 'orderDetail1' ( ( ruleIDREF ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:537:3: otherlv_3= 'orderDetail1' ( ( ruleIDREF ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOrderRef11053); 

                        	newLeafNode(otherlv_3, grammarAccess.getOrderRef1Access().getOrderDetail1Keyword_3_0());
                        
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:541:1: ( ( ruleIDREF ) )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:542:1: ( ruleIDREF )
                    {
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:542:1: ( ruleIDREF )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:543:3: ruleIDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderRef1Rule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOrderRef1Access().getOrderDetail1EObjectCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_ruleOrderRef11076);
                    ruleIDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrderRef11090); 

                	newLeafNode(otherlv_5, grammarAccess.getOrderRef1Access().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleOrderRef1"


    // $ANTLR start "entryRuleOrderRef2"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:568:1: entryRuleOrderRef2 returns [EObject current=null] : iv_ruleOrderRef2= ruleOrderRef2 EOF ;
    public final EObject entryRuleOrderRef2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderRef2 = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:569:2: (iv_ruleOrderRef2= ruleOrderRef2 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:570:2: iv_ruleOrderRef2= ruleOrderRef2 EOF
            {
             newCompositeNode(grammarAccess.getOrderRef2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_entryRuleOrderRef21126);
            iv_ruleOrderRef2=ruleOrderRef2();

            state._fsp--;

             current =iv_ruleOrderRef2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderRef21136); 

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
    // $ANTLR end "entryRuleOrderRef2"


    // $ANTLR start "ruleOrderRef2"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:577:1: ruleOrderRef2 returns [EObject current=null] : ( () otherlv_1= 'OrderRef2' otherlv_2= '{' (otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleOrderRef2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_orderDetail2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:580:28: ( ( () otherlv_1= 'OrderRef2' otherlv_2= '{' (otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:581:1: ( () otherlv_1= 'OrderRef2' otherlv_2= '{' (otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:581:1: ( () otherlv_1= 'OrderRef2' otherlv_2= '{' (otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:581:2: () otherlv_1= 'OrderRef2' otherlv_2= '{' (otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:581:2: ()
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:582:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderRef2Access().getOrderRef2Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOrderRef21182); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderRef2Access().getOrderRef2Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrderRef21194); 

                	newLeafNode(otherlv_2, grammarAccess.getOrderRef2Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:595:1: (otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:595:3: otherlv_3= 'orderDetail2' ( (lv_orderDetail2_4_0= ruleIDREF ) )
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrderRef21207); 

                        	newLeafNode(otherlv_3, grammarAccess.getOrderRef2Access().getOrderDetail2Keyword_3_0());
                        
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:599:1: ( (lv_orderDetail2_4_0= ruleIDREF ) )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:600:1: (lv_orderDetail2_4_0= ruleIDREF )
                    {
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:600:1: (lv_orderDetail2_4_0= ruleIDREF )
                    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:601:3: lv_orderDetail2_4_0= ruleIDREF
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderRef2Access().getOrderDetail2IDREFParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_ruleOrderRef21228);
                    lv_orderDetail2_4_0=ruleIDREF();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderRef2Rule());
                    	        }
                           		set(
                           			current, 
                           			"orderDetail2",
                            		lv_orderDetail2_4_0, 
                            		"IDREF");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrderRef21242); 

                	newLeafNode(otherlv_5, grammarAccess.getOrderRef2Access().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleOrderRef2"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:629:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:630:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:631:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01279);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01290); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:638:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:641:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:642:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01329); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:657:1: entryRuleID0 returns [String current=null] : iv_ruleID0= ruleID0 EOF ;
    public final String entryRuleID0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID0 = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:658:2: (iv_ruleID0= ruleID0 EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:659:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID01374);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID01385); 

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
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:666:1: ruleID0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleID0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:669:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:670:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID01424); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getID0Access().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleIDREF"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:687:1: entryRuleIDREF returns [String current=null] : iv_ruleIDREF= ruleIDREF EOF ;
    public final String entryRuleIDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDREF = null;


        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:688:2: (iv_ruleIDREF= ruleIDREF EOF )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:689:2: iv_ruleIDREF= ruleIDREF EOF
            {
             newCompositeNode(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF1471);
            iv_ruleIDREF=ruleIDREF();

            state._fsp--;

             current =iv_ruleIDREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF1482); 

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
    // $ANTLR end "entryRuleIDREF"


    // $ANTLR start "ruleIDREF"
    // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:696:1: ruleIDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:699:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.mydsl.referencesuntyped/src-gen/org/xtext/example/mydsl/referencesuntyped/parser/antlr/internal/InternalMyDsl.g:700:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIDREF1521); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getIDREFAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleIDREF"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOrdersType_in_entryRuleOrdersType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdersType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleOrdersType122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleOrdersType146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType158 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_ruleOrdersType179 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrdersType192 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_ruleOrdersType213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType227 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOrdersType239 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType251 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_ruleOrdersType272 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrdersType285 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_ruleOrdersType306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType320 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOrdersType332 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType344 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_ruleOrdersType365 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrdersType378 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_ruleOrdersType399 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType413 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOrdersType425 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType437 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_ruleOrdersType458 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrdersType471 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_ruleOrdersType492 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType506 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_entryRuleOrderDetail1554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleOrderDetail1610 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleID0_in_ruleOrderDetail1631 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrderDetail1643 = new BitSet(new long[]{0x0000000000708000L});
        public static final BitSet FOLLOW_20_in_ruleOrderDetail1656 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOrderDetail1677 = new BitSet(new long[]{0x0000000000608000L});
        public static final BitSet FOLLOW_21_in_ruleOrderDetail1692 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOrderDetail1713 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_22_in_ruleOrderDetail1728 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOrderDetail1749 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrderDetail1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_entryRuleOrderDetail2799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail2809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleOrderDetail2855 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleID0_in_ruleOrderDetail2876 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrderDetail2888 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_22_in_ruleOrderDetail2901 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOrderDetail2922 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrderDetail2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_entryRuleOrderRef1972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderRef1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleOrderRef11028 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrderRef11040 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleOrderRef11053 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIDREF_in_ruleOrderRef11076 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrderRef11090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_entryRuleOrderRef21126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderRef21136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleOrderRef21182 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrderRef21194 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleOrderRef21207 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIDREF_in_ruleOrderRef21228 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrderRef21242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID01374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID01385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID01424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF1471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIDREF1521 = new BitSet(new long[]{0x0000000000000002L});
    }


}