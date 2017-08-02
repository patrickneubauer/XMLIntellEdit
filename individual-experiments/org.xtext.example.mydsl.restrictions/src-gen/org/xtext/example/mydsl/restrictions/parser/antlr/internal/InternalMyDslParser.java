package org.xtext.example.mydsl.restrictions.parser.antlr.internal; 

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
import org.xtext.example.mydsl.restrictions.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrdersType'", "'{'", "'order'", "','", "'}'", "'OrderDetail'", "'customerAge'", "'customerContact1'", "'customerFirstName'", "'customerLastName'", "'customerNumber'", "'customerPassword'", "'customerUSState'", "'customerAddress'", "'RestrictedAddress'", "'street'", "'city'", "'ID'", "'A_K'", "'L_T'", "'U_Z'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleOrdersType returns [EObject current=null] : iv_ruleOrdersType= ruleOrdersType EOF ;
    public final EObject entryRuleOrdersType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdersType = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleOrdersType= ruleOrdersType EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleOrdersType= ruleOrdersType EOF
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
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:77:1: ruleOrdersType returns [EObject current=null] : (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order' otherlv_3= '{' ( (lv_order_4_0= ruleOrderDetail ) ) (otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleOrdersType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_order_4_0 = null;

        EObject lv_order_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:80:28: ( (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order' otherlv_3= '{' ( (lv_order_4_0= ruleOrderDetail ) ) (otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order' otherlv_3= '{' ( (lv_order_4_0= ruleOrderDetail ) ) (otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order' otherlv_3= '{' ( (lv_order_4_0= ruleOrderDetail ) ) (otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:81:3: otherlv_0= 'OrdersType' otherlv_1= '{' otherlv_2= 'order' otherlv_3= '{' ( (lv_order_4_0= ruleOrderDetail ) ) (otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOrdersType122); 

                	newLeafNode(otherlv_0, grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType134); 

                	newLeafNode(otherlv_1, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOrdersType146); 

                	newLeafNode(otherlv_2, grammarAccess.getOrdersTypeAccess().getOrderKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrdersType158); 

                	newLeafNode(otherlv_3, grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:97:1: ( (lv_order_4_0= ruleOrderDetail ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:98:1: (lv_order_4_0= ruleOrderDetail )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:98:1: (lv_order_4_0= ruleOrderDetail )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:99:3: lv_order_4_0= ruleOrderDetail
            {
             
            	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail_in_ruleOrdersType179);
            lv_order_4_0=ruleOrderDetail();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	        }
                   		add(
                   			current, 
                   			"order",
                    		lv_order_4_0, 
                    		"OrderDetail");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:115:2: (otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:115:4: otherlv_5= ',' ( (lv_order_6_0= ruleOrderDetail ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrdersType192); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:119:1: ( (lv_order_6_0= ruleOrderDetail ) )
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_order_6_0= ruleOrderDetail )
            	    {
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_order_6_0= ruleOrderDetail )
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:121:3: lv_order_6_0= ruleOrderDetail
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrdersTypeAccess().getOrderOrderDetailParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrderDetail_in_ruleOrdersType213);
            	    lv_order_6_0=ruleOrderDetail();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrdersTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"order",
            	            		lv_order_6_0, 
            	            		"OrderDetail");
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
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrdersType239); 

                	newLeafNode(otherlv_8, grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleOrderDetail"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:153:1: entryRuleOrderDetail returns [EObject current=null] : iv_ruleOrderDetail= ruleOrderDetail EOF ;
    public final EObject entryRuleOrderDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderDetail = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:154:2: (iv_ruleOrderDetail= ruleOrderDetail EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:155:2: iv_ruleOrderDetail= ruleOrderDetail EOF
            {
             newCompositeNode(grammarAccess.getOrderDetailRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail_in_entryRuleOrderDetail275);
            iv_ruleOrderDetail=ruleOrderDetail();

            state._fsp--;

             current =iv_ruleOrderDetail; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail285); 

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
    // $ANTLR end "entryRuleOrderDetail"


    // $ANTLR start "ruleOrderDetail"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:162:1: ruleOrderDetail returns [EObject current=null] : (otherlv_0= 'OrderDetail' ( (lv_orderID_1_0= ruleID0 ) ) otherlv_2= '{' (otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) ) )? (otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) ) )? (otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) ) )? (otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) ) )? (otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) ) )? (otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) ) )? (otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) ) )? otherlv_17= 'customerAddress' ( (lv_customerAddress_18_0= ruleRestrictedAddress ) ) otherlv_19= '}' ) ;
    public final EObject ruleOrderDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_orderID_1_0 = null;

        AntlrDatatypeRuleToken lv_customerAge_4_0 = null;

        AntlrDatatypeRuleToken lv_customerContact1_6_0 = null;

        AntlrDatatypeRuleToken lv_customerFirstName_8_0 = null;

        AntlrDatatypeRuleToken lv_customerLastName_10_0 = null;

        AntlrDatatypeRuleToken lv_customerNumber_12_0 = null;

        AntlrDatatypeRuleToken lv_customerPassword_14_0 = null;

        Enumerator lv_customerUSState_16_0 = null;

        EObject lv_customerAddress_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:165:28: ( (otherlv_0= 'OrderDetail' ( (lv_orderID_1_0= ruleID0 ) ) otherlv_2= '{' (otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) ) )? (otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) ) )? (otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) ) )? (otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) ) )? (otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) ) )? (otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) ) )? (otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) ) )? otherlv_17= 'customerAddress' ( (lv_customerAddress_18_0= ruleRestrictedAddress ) ) otherlv_19= '}' ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:166:1: (otherlv_0= 'OrderDetail' ( (lv_orderID_1_0= ruleID0 ) ) otherlv_2= '{' (otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) ) )? (otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) ) )? (otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) ) )? (otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) ) )? (otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) ) )? (otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) ) )? (otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) ) )? otherlv_17= 'customerAddress' ( (lv_customerAddress_18_0= ruleRestrictedAddress ) ) otherlv_19= '}' )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:166:1: (otherlv_0= 'OrderDetail' ( (lv_orderID_1_0= ruleID0 ) ) otherlv_2= '{' (otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) ) )? (otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) ) )? (otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) ) )? (otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) ) )? (otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) ) )? (otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) ) )? (otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) ) )? otherlv_17= 'customerAddress' ( (lv_customerAddress_18_0= ruleRestrictedAddress ) ) otherlv_19= '}' )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:166:3: otherlv_0= 'OrderDetail' ( (lv_orderID_1_0= ruleID0 ) ) otherlv_2= '{' (otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) ) )? (otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) ) )? (otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) ) )? (otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) ) )? (otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) ) )? (otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) ) )? (otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) ) )? otherlv_17= 'customerAddress' ( (lv_customerAddress_18_0= ruleRestrictedAddress ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOrderDetail322); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderDetailAccess().getOrderDetailKeyword_0());
                
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:170:1: ( (lv_orderID_1_0= ruleID0 ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_orderID_1_0= ruleID0 )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_orderID_1_0= ruleID0 )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:172:3: lv_orderID_1_0= ruleID0
            {
             
            	        newCompositeNode(grammarAccess.getOrderDetailAccess().getOrderIDID0ParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_ruleOrderDetail343);
            lv_orderID_1_0=ruleID0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
            	        }
                   		set(
                   			current, 
                   			"orderID",
                    		lv_orderID_1_0, 
                    		"ID0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrderDetail355); 

                	newLeafNode(otherlv_2, grammarAccess.getOrderDetailAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:192:1: (otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:192:3: otherlv_3= 'customerAge' ( (lv_customerAge_4_0= ruleCustomerAge ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOrderDetail368); 

                        	newLeafNode(otherlv_3, grammarAccess.getOrderDetailAccess().getCustomerAgeKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:196:1: ( (lv_customerAge_4_0= ruleCustomerAge ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_customerAge_4_0= ruleCustomerAge )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_customerAge_4_0= ruleCustomerAge )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:198:3: lv_customerAge_4_0= ruleCustomerAge
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerAgeCustomerAgeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerAge_in_ruleOrderDetail389);
                    lv_customerAge_4_0=ruleCustomerAge();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerAge",
                            		lv_customerAge_4_0, 
                            		"CustomerAge");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:214:4: (otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:214:6: otherlv_5= 'customerContact1' ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOrderDetail404); 

                        	newLeafNode(otherlv_5, grammarAccess.getOrderDetailAccess().getCustomerContact1Keyword_4_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:218:1: ( (lv_customerContact1_6_0= ruleCustomerContactNumber1 ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_customerContact1_6_0= ruleCustomerContactNumber1 )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_customerContact1_6_0= ruleCustomerContactNumber1 )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:220:3: lv_customerContact1_6_0= ruleCustomerContactNumber1
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerContact1CustomerContactNumber1ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerContactNumber1_in_ruleOrderDetail425);
                    lv_customerContact1_6_0=ruleCustomerContactNumber1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerContact1",
                            		lv_customerContact1_6_0, 
                            		"CustomerContactNumber1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:236:4: (otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:236:6: otherlv_7= 'customerFirstName' ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOrderDetail440); 

                        	newLeafNode(otherlv_7, grammarAccess.getOrderDetailAccess().getCustomerFirstNameKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:240:1: ( (lv_customerFirstName_8_0= ruleCustomerFirstName ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:241:1: (lv_customerFirstName_8_0= ruleCustomerFirstName )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:241:1: (lv_customerFirstName_8_0= ruleCustomerFirstName )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:242:3: lv_customerFirstName_8_0= ruleCustomerFirstName
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerFirstNameCustomerFirstNameParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerFirstName_in_ruleOrderDetail461);
                    lv_customerFirstName_8_0=ruleCustomerFirstName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerFirstName",
                            		lv_customerFirstName_8_0, 
                            		"CustomerFirstName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:258:4: (otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:258:6: otherlv_9= 'customerLastName' ( (lv_customerLastName_10_0= ruleCustomerLastName ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOrderDetail476); 

                        	newLeafNode(otherlv_9, grammarAccess.getOrderDetailAccess().getCustomerLastNameKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:262:1: ( (lv_customerLastName_10_0= ruleCustomerLastName ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:263:1: (lv_customerLastName_10_0= ruleCustomerLastName )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:263:1: (lv_customerLastName_10_0= ruleCustomerLastName )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:264:3: lv_customerLastName_10_0= ruleCustomerLastName
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerLastNameCustomerLastNameParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerLastName_in_ruleOrderDetail497);
                    lv_customerLastName_10_0=ruleCustomerLastName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerLastName",
                            		lv_customerLastName_10_0, 
                            		"CustomerLastName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:280:4: (otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:280:6: otherlv_11= 'customerNumber' ( (lv_customerNumber_12_0= ruleCustomerNumber ) )
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOrderDetail512); 

                        	newLeafNode(otherlv_11, grammarAccess.getOrderDetailAccess().getCustomerNumberKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:284:1: ( (lv_customerNumber_12_0= ruleCustomerNumber ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_customerNumber_12_0= ruleCustomerNumber )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_customerNumber_12_0= ruleCustomerNumber )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:286:3: lv_customerNumber_12_0= ruleCustomerNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerNumberCustomerNumberParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerNumber_in_ruleOrderDetail533);
                    lv_customerNumber_12_0=ruleCustomerNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerNumber",
                            		lv_customerNumber_12_0, 
                            		"CustomerNumber");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:302:4: (otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:302:6: otherlv_13= 'customerPassword' ( (lv_customerPassword_14_0= ruleCustomerPassword ) )
                    {
                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOrderDetail548); 

                        	newLeafNode(otherlv_13, grammarAccess.getOrderDetailAccess().getCustomerPasswordKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:306:1: ( (lv_customerPassword_14_0= ruleCustomerPassword ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_customerPassword_14_0= ruleCustomerPassword )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_customerPassword_14_0= ruleCustomerPassword )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:308:3: lv_customerPassword_14_0= ruleCustomerPassword
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerPasswordCustomerPasswordParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerPassword_in_ruleOrderDetail569);
                    lv_customerPassword_14_0=ruleCustomerPassword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerPassword",
                            		lv_customerPassword_14_0, 
                            		"CustomerPassword");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:324:4: (otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:324:6: otherlv_15= 'customerUSState' ( (lv_customerUSState_16_0= ruleUSState ) )
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOrderDetail584); 

                        	newLeafNode(otherlv_15, grammarAccess.getOrderDetailAccess().getCustomerUSStateKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:328:1: ( (lv_customerUSState_16_0= ruleUSState ) )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:329:1: (lv_customerUSState_16_0= ruleUSState )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:329:1: (lv_customerUSState_16_0= ruleUSState )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:330:3: lv_customerUSState_16_0= ruleUSState
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerUSStateUSStateEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUSState_in_ruleOrderDetail605);
                    lv_customerUSState_16_0=ruleUSState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
                    	        }
                           		set(
                           			current, 
                           			"customerUSState",
                            		lv_customerUSState_16_0, 
                            		"USState");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOrderDetail619); 

                	newLeafNode(otherlv_17, grammarAccess.getOrderDetailAccess().getCustomerAddressKeyword_10());
                
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:350:1: ( (lv_customerAddress_18_0= ruleRestrictedAddress ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:351:1: (lv_customerAddress_18_0= ruleRestrictedAddress )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:351:1: (lv_customerAddress_18_0= ruleRestrictedAddress )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:352:3: lv_customerAddress_18_0= ruleRestrictedAddress
            {
             
            	        newCompositeNode(grammarAccess.getOrderDetailAccess().getCustomerAddressRestrictedAddressParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedAddress_in_ruleOrderDetail640);
            lv_customerAddress_18_0=ruleRestrictedAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderDetailRule());
            	        }
                   		set(
                   			current, 
                   			"customerAddress",
                    		lv_customerAddress_18_0, 
                    		"RestrictedAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrderDetail652); 

                	newLeafNode(otherlv_19, grammarAccess.getOrderDetailAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleOrderDetail"


    // $ANTLR start "entryRuleRestrictedAddress"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:380:1: entryRuleRestrictedAddress returns [EObject current=null] : iv_ruleRestrictedAddress= ruleRestrictedAddress EOF ;
    public final EObject entryRuleRestrictedAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedAddress = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:381:2: (iv_ruleRestrictedAddress= ruleRestrictedAddress EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:382:2: iv_ruleRestrictedAddress= ruleRestrictedAddress EOF
            {
             newCompositeNode(grammarAccess.getRestrictedAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedAddress_in_entryRuleRestrictedAddress688);
            iv_ruleRestrictedAddress=ruleRestrictedAddress();

            state._fsp--;

             current =iv_ruleRestrictedAddress; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedAddress698); 

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
    // $ANTLR end "entryRuleRestrictedAddress"


    // $ANTLR start "ruleRestrictedAddress"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:389:1: ruleRestrictedAddress returns [EObject current=null] : (otherlv_0= 'RestrictedAddress' otherlv_1= '{' otherlv_2= 'street' otherlv_3= '{' ( (lv_street_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'city' ( (lv_city_9_0= ruleString0 ) ) otherlv_10= '}' ) ;
    public final EObject ruleRestrictedAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_street_4_0 = null;

        AntlrDatatypeRuleToken lv_street_6_0 = null;

        AntlrDatatypeRuleToken lv_city_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:392:28: ( (otherlv_0= 'RestrictedAddress' otherlv_1= '{' otherlv_2= 'street' otherlv_3= '{' ( (lv_street_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'city' ( (lv_city_9_0= ruleString0 ) ) otherlv_10= '}' ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:393:1: (otherlv_0= 'RestrictedAddress' otherlv_1= '{' otherlv_2= 'street' otherlv_3= '{' ( (lv_street_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'city' ( (lv_city_9_0= ruleString0 ) ) otherlv_10= '}' )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:393:1: (otherlv_0= 'RestrictedAddress' otherlv_1= '{' otherlv_2= 'street' otherlv_3= '{' ( (lv_street_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'city' ( (lv_city_9_0= ruleString0 ) ) otherlv_10= '}' )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:393:3: otherlv_0= 'RestrictedAddress' otherlv_1= '{' otherlv_2= 'street' otherlv_3= '{' ( (lv_street_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'city' ( (lv_city_9_0= ruleString0 ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRestrictedAddress735); 

                	newLeafNode(otherlv_0, grammarAccess.getRestrictedAddressAccess().getRestrictedAddressKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRestrictedAddress747); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRestrictedAddress759); 

                	newLeafNode(otherlv_2, grammarAccess.getRestrictedAddressAccess().getStreetKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRestrictedAddress771); 

                	newLeafNode(otherlv_3, grammarAccess.getRestrictedAddressAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:409:1: ( (lv_street_4_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_street_4_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_street_4_0= ruleString0 )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:411:3: lv_street_4_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleRestrictedAddress792);
            lv_street_4_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedAddressRule());
            	        }
                   		add(
                   			current, 
                   			"street",
                    		lv_street_4_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:427:2: (otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:427:4: otherlv_5= ',' ( (lv_street_6_0= ruleString0 ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRestrictedAddress805); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRestrictedAddressAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:431:1: ( (lv_street_6_0= ruleString0 ) )
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_street_6_0= ruleString0 )
            	    {
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_street_6_0= ruleString0 )
            	    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:433:3: lv_street_6_0= ruleString0
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictedAddressAccess().getStreetString0ParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleRestrictedAddress826);
            	    lv_street_6_0=ruleString0();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictedAddressRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"street",
            	            		lv_street_6_0, 
            	            		"String0");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRestrictedAddress840); 

                	newLeafNode(otherlv_7, grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRestrictedAddress852); 

                	newLeafNode(otherlv_8, grammarAccess.getRestrictedAddressAccess().getCityKeyword_7());
                
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:457:1: ( (lv_city_9_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_city_9_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_city_9_0= ruleString0 )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:459:3: lv_city_9_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedAddressAccess().getCityString0ParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleRestrictedAddress873);
            lv_city_9_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedAddressRule());
            	        }
                   		set(
                   			current, 
                   			"city",
                    		lv_city_9_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRestrictedAddress885); 

                	newLeafNode(otherlv_10, grammarAccess.getRestrictedAddressAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleRestrictedAddress"


    // $ANTLR start "entryRuleCustomerAge"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:487:1: entryRuleCustomerAge returns [String current=null] : iv_ruleCustomerAge= ruleCustomerAge EOF ;
    public final String entryRuleCustomerAge() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCustomerAge = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:488:2: (iv_ruleCustomerAge= ruleCustomerAge EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:489:2: iv_ruleCustomerAge= ruleCustomerAge EOF
            {
             newCompositeNode(grammarAccess.getCustomerAgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerAge_in_entryRuleCustomerAge922);
            iv_ruleCustomerAge=ruleCustomerAge();

            state._fsp--;

             current =iv_ruleCustomerAge.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerAge933); 

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
    // $ANTLR end "entryRuleCustomerAge"


    // $ANTLR start "ruleCustomerAge"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:496:1: ruleCustomerAge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleCustomerAge() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:499:28: (this_INT_0= RULE_INT )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:500:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCustomerAge972); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getCustomerAgeAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCustomerAge"


    // $ANTLR start "entryRuleCustomerContactNumber1"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:515:1: entryRuleCustomerContactNumber1 returns [String current=null] : iv_ruleCustomerContactNumber1= ruleCustomerContactNumber1 EOF ;
    public final String entryRuleCustomerContactNumber1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCustomerContactNumber1 = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:516:2: (iv_ruleCustomerContactNumber1= ruleCustomerContactNumber1 EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:517:2: iv_ruleCustomerContactNumber1= ruleCustomerContactNumber1 EOF
            {
             newCompositeNode(grammarAccess.getCustomerContactNumber1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerContactNumber1_in_entryRuleCustomerContactNumber11017);
            iv_ruleCustomerContactNumber1=ruleCustomerContactNumber1();

            state._fsp--;

             current =iv_ruleCustomerContactNumber1.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerContactNumber11028); 

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
    // $ANTLR end "entryRuleCustomerContactNumber1"


    // $ANTLR start "ruleCustomerContactNumber1"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:524:1: ruleCustomerContactNumber1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleCustomerContactNumber1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:527:28: (this_INT_0= RULE_INT )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:528:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCustomerContactNumber11067); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getCustomerContactNumber1Access().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCustomerContactNumber1"


    // $ANTLR start "entryRuleCustomerFirstName"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:543:1: entryRuleCustomerFirstName returns [String current=null] : iv_ruleCustomerFirstName= ruleCustomerFirstName EOF ;
    public final String entryRuleCustomerFirstName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCustomerFirstName = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:544:2: (iv_ruleCustomerFirstName= ruleCustomerFirstName EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:545:2: iv_ruleCustomerFirstName= ruleCustomerFirstName EOF
            {
             newCompositeNode(grammarAccess.getCustomerFirstNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerFirstName_in_entryRuleCustomerFirstName1112);
            iv_ruleCustomerFirstName=ruleCustomerFirstName();

            state._fsp--;

             current =iv_ruleCustomerFirstName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerFirstName1123); 

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
    // $ANTLR end "entryRuleCustomerFirstName"


    // $ANTLR start "ruleCustomerFirstName"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:552:1: ruleCustomerFirstName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCustomerFirstName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:555:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:556:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerFirstName1162); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getCustomerFirstNameAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCustomerFirstName"


    // $ANTLR start "entryRuleCustomerLastName"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:571:1: entryRuleCustomerLastName returns [String current=null] : iv_ruleCustomerLastName= ruleCustomerLastName EOF ;
    public final String entryRuleCustomerLastName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCustomerLastName = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:572:2: (iv_ruleCustomerLastName= ruleCustomerLastName EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:573:2: iv_ruleCustomerLastName= ruleCustomerLastName EOF
            {
             newCompositeNode(grammarAccess.getCustomerLastNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerLastName_in_entryRuleCustomerLastName1207);
            iv_ruleCustomerLastName=ruleCustomerLastName();

            state._fsp--;

             current =iv_ruleCustomerLastName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerLastName1218); 

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
    // $ANTLR end "entryRuleCustomerLastName"


    // $ANTLR start "ruleCustomerLastName"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:580:1: ruleCustomerLastName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCustomerLastName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:583:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:584:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerLastName1257); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getCustomerLastNameAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCustomerLastName"


    // $ANTLR start "entryRuleCustomerNumber"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:599:1: entryRuleCustomerNumber returns [String current=null] : iv_ruleCustomerNumber= ruleCustomerNumber EOF ;
    public final String entryRuleCustomerNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCustomerNumber = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:600:2: (iv_ruleCustomerNumber= ruleCustomerNumber EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:601:2: iv_ruleCustomerNumber= ruleCustomerNumber EOF
            {
             newCompositeNode(grammarAccess.getCustomerNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerNumber_in_entryRuleCustomerNumber1302);
            iv_ruleCustomerNumber=ruleCustomerNumber();

            state._fsp--;

             current =iv_ruleCustomerNumber.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerNumber1313); 

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
    // $ANTLR end "entryRuleCustomerNumber"


    // $ANTLR start "ruleCustomerNumber"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:608:1: ruleCustomerNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCustomerNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:611:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:612:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerNumber1352); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getCustomerNumberAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCustomerNumber"


    // $ANTLR start "entryRuleCustomerPassword"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:627:1: entryRuleCustomerPassword returns [String current=null] : iv_ruleCustomerPassword= ruleCustomerPassword EOF ;
    public final String entryRuleCustomerPassword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCustomerPassword = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:628:2: (iv_ruleCustomerPassword= ruleCustomerPassword EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:629:2: iv_ruleCustomerPassword= ruleCustomerPassword EOF
            {
             newCompositeNode(grammarAccess.getCustomerPasswordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerPassword_in_entryRuleCustomerPassword1397);
            iv_ruleCustomerPassword=ruleCustomerPassword();

            state._fsp--;

             current =iv_ruleCustomerPassword.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerPassword1408); 

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
    // $ANTLR end "entryRuleCustomerPassword"


    // $ANTLR start "ruleCustomerPassword"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:636:1: ruleCustomerPassword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCustomerPassword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:639:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:640:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerPassword1447); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getCustomerPasswordAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCustomerPassword"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:655:1: entryRuleID0 returns [String current=null] : iv_ruleID0= ruleID0 EOF ;
    public final String entryRuleID0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID0 = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:656:2: (iv_ruleID0= ruleID0 EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:657:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID01492);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID01503); 

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
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:664:1: ruleID0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ID' ;
    public final AntlrDatatypeRuleToken ruleID0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:667:28: (kw= 'ID' )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:669:2: kw= 'ID'
            {
            kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleID01540); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getID0Access().getIDKeyword()); 
                

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


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:682:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:683:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:684:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01580);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01591); 

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
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:691:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:694:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:695:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01630); 

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


    // $ANTLR start "ruleUSState"
    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:710:1: ruleUSState returns [Enumerator current=null] : ( (enumLiteral_0= 'A_K' ) | (enumLiteral_1= 'L_T' ) | (enumLiteral_2= 'U_Z' ) ) ;
    public final Enumerator ruleUSState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:712:28: ( ( (enumLiteral_0= 'A_K' ) | (enumLiteral_1= 'L_T' ) | (enumLiteral_2= 'U_Z' ) ) )
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:713:1: ( (enumLiteral_0= 'A_K' ) | (enumLiteral_1= 'L_T' ) | (enumLiteral_2= 'U_Z' ) )
            {
            // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:713:1: ( (enumLiteral_0= 'A_K' ) | (enumLiteral_1= 'L_T' ) | (enumLiteral_2= 'U_Z' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:713:2: (enumLiteral_0= 'A_K' )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:713:2: (enumLiteral_0= 'A_K' )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:713:4: enumLiteral_0= 'A_K'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleUSState1688); 

                            current = grammarAccess.getUSStateAccess().getA_KEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUSStateAccess().getA_KEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:719:6: (enumLiteral_1= 'L_T' )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:719:6: (enumLiteral_1= 'L_T' )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:719:8: enumLiteral_1= 'L_T'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUSState1705); 

                            current = grammarAccess.getUSStateAccess().getL_TEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUSStateAccess().getL_TEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:725:6: (enumLiteral_2= 'U_Z' )
                    {
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:725:6: (enumLiteral_2= 'U_Z' )
                    // ../org.xtext.example.mydsl.restrictions/src-gen/org/xtext/example/mydsl/restrictions/parser/antlr/internal/InternalMyDsl.g:725:8: enumLiteral_2= 'U_Z'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUSState1722); 

                            current = grammarAccess.getUSStateAccess().getU_ZEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUSStateAccess().getU_ZEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleUSState"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOrdersType_in_entryRuleOrdersType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdersType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleOrdersType122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleOrdersType146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrdersType158 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleOrderDetail_in_ruleOrdersType179 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrdersType192 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleOrderDetail_in_ruleOrdersType213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType227 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrdersType239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail_in_entryRuleOrderDetail275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleOrderDetail322 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleID0_in_ruleOrderDetail343 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrderDetail355 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_17_in_ruleOrderDetail368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCustomerAge_in_ruleOrderDetail389 = new BitSet(new long[]{0x0000000001FC0000L});
        public static final BitSet FOLLOW_18_in_ruleOrderDetail404 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCustomerContactNumber1_in_ruleOrderDetail425 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_19_in_ruleOrderDetail440 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCustomerFirstName_in_ruleOrderDetail461 = new BitSet(new long[]{0x0000000001F00000L});
        public static final BitSet FOLLOW_20_in_ruleOrderDetail476 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCustomerLastName_in_ruleOrderDetail497 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleOrderDetail512 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCustomerNumber_in_ruleOrderDetail533 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_22_in_ruleOrderDetail548 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCustomerPassword_in_ruleOrderDetail569 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleOrderDetail584 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_ruleUSState_in_ruleOrderDetail605 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleOrderDetail619 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleRestrictedAddress_in_ruleOrderDetail640 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrderDetail652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedAddress_in_entryRuleRestrictedAddress688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedAddress698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleRestrictedAddress735 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRestrictedAddress747 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleRestrictedAddress759 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRestrictedAddress771 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleString0_in_ruleRestrictedAddress792 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRestrictedAddress805 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleString0_in_ruleRestrictedAddress826 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRestrictedAddress840 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRestrictedAddress852 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleString0_in_ruleRestrictedAddress873 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRestrictedAddress885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerAge_in_entryRuleCustomerAge922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerAge933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCustomerAge972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerContactNumber1_in_entryRuleCustomerContactNumber11017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerContactNumber11028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCustomerContactNumber11067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerFirstName_in_entryRuleCustomerFirstName1112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerFirstName1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerFirstName1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerLastName_in_entryRuleCustomerLastName1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerLastName1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerLastName1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerNumber_in_entryRuleCustomerNumber1302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerNumber1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerNumber1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerPassword_in_entryRuleCustomerPassword1397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerPassword1408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerPassword1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID01492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID01503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleID01540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleUSState1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleUSState1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleUSState1722 = new BitSet(new long[]{0x0000000000000002L});
    }


}