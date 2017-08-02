package at.ac.tuwien.big.xmltext.library3.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.xmltext.library3.services.Library3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibrary3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DATETIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "','", "'}'", "'Book'", "'title'", "'author'", "'pages'", "'isbn'", "'Customer'", "'firstName'", "'lastName'", "'borrowedBookId'", "'BookInfo'", "':'", "'='"
    };
    public static final int RULE_DATETIME=7;
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g"; }



     	private Library3GrammarAccess grammarAccess;
     	
        public InternalLibrary3Parser(TokenStream input, Library3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LibraryType";	
       	}
       	
       	@Override
       	protected Library3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLibraryType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:67:1: entryRuleLibraryType returns [EObject current=null] : iv_ruleLibraryType= ruleLibraryType EOF ;
    public final EObject entryRuleLibraryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryType = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:68:2: (iv_ruleLibraryType= ruleLibraryType EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:69:2: iv_ruleLibraryType= ruleLibraryType EOF
            {
             newCompositeNode(grammarAccess.getLibraryTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLibraryType_in_entryRuleLibraryType75);
            iv_ruleLibraryType=ruleLibraryType();

            state._fsp--;

             current =iv_ruleLibraryType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLibraryType85); 

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
    // $ANTLR end "entryRuleLibraryType"


    // $ANTLR start "ruleLibraryType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:76:1: ruleLibraryType returns [EObject current=null] : ( () otherlv_1= 'Library' otherlv_2= '{' ( ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )* )? ( ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleLibraryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_book_3_0 = null;

        EObject lv_book_5_0 = null;

        EObject lv_customer_6_0 = null;

        EObject lv_customer_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:79:28: ( ( () otherlv_1= 'Library' otherlv_2= '{' ( ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )* )? ( ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )* )? otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:80:1: ( () otherlv_1= 'Library' otherlv_2= '{' ( ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )* )? ( ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )* )? otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:80:1: ( () otherlv_1= 'Library' otherlv_2= '{' ( ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )* )? ( ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )* )? otherlv_9= '}' )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:80:2: () otherlv_1= 'Library' otherlv_2= '{' ( ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )* )? ( ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )* )? otherlv_9= '}'
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:80:2: ()
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLibraryTypeAccess().getLibraryTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibraryType131); 

                	newLeafNode(otherlv_1, grammarAccess.getLibraryTypeAccess().getLibraryKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLibraryType143); 

                	newLeafNode(otherlv_2, grammarAccess.getLibraryTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:94:1: ( ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:94:2: ( (lv_book_3_0= ruleBookType ) ) (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )*
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:94:2: ( (lv_book_3_0= ruleBookType ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:95:1: (lv_book_3_0= ruleBookType )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:95:1: (lv_book_3_0= ruleBookType )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:96:3: lv_book_3_0= ruleBookType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLibraryTypeAccess().getBookBookTypeParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBookType_in_ruleLibraryType165);
                    lv_book_3_0=ruleBookType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLibraryTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"book",
                            		lv_book_3_0, 
                            		"BookType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:112:2: (otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:112:4: otherlv_4= ',' ( (lv_book_5_0= ruleBookType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLibraryType178); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getLibraryTypeAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:116:1: ( (lv_book_5_0= ruleBookType ) )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:117:1: (lv_book_5_0= ruleBookType )
                    	    {
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:117:1: (lv_book_5_0= ruleBookType )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:118:3: lv_book_5_0= ruleBookType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLibraryTypeAccess().getBookBookTypeParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBookType_in_ruleLibraryType199);
                    	    lv_book_5_0=ruleBookType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLibraryTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"book",
                    	            		lv_book_5_0, 
                    	            		"BookType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:134:6: ( ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:134:7: ( (lv_customer_6_0= ruleCustomerType ) ) (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )*
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:134:7: ( (lv_customer_6_0= ruleCustomerType ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:135:1: (lv_customer_6_0= ruleCustomerType )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:135:1: (lv_customer_6_0= ruleCustomerType )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:136:3: lv_customer_6_0= ruleCustomerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_ruleLibraryType225);
                    lv_customer_6_0=ruleCustomerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLibraryTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"customer",
                            		lv_customer_6_0, 
                            		"CustomerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:152:2: (otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:152:4: otherlv_7= ',' ( (lv_customer_8_0= ruleCustomerType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLibraryType238); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getLibraryTypeAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:156:1: ( (lv_customer_8_0= ruleCustomerType ) )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:157:1: (lv_customer_8_0= ruleCustomerType )
                    	    {
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:157:1: (lv_customer_8_0= ruleCustomerType )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:158:3: lv_customer_8_0= ruleCustomerType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLibraryTypeAccess().getCustomerCustomerTypeParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_ruleLibraryType259);
                    	    lv_customer_8_0=ruleCustomerType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLibraryTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"customer",
                    	            		lv_customer_8_0, 
                    	            		"CustomerType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibraryType275); 

                	newLeafNode(otherlv_9, grammarAccess.getLibraryTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleLibraryType"


    // $ANTLR start "entryRuleBookType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:188:1: entryRuleBookType returns [EObject current=null] : iv_ruleBookType= ruleBookType EOF ;
    public final EObject entryRuleBookType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBookType = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:189:2: (iv_ruleBookType= ruleBookType EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:190:2: iv_ruleBookType= ruleBookType EOF
            {
             newCompositeNode(grammarAccess.getBookTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookType_in_entryRuleBookType313);
            iv_ruleBookType=ruleBookType();

            state._fsp--;

             current =iv_ruleBookType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBookType323); 

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
    // $ANTLR end "entryRuleBookType"


    // $ANTLR start "ruleBookType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:197:1: ruleBookType returns [EObject current=null] : (otherlv_0= 'Book' ( (lv_name_1_0= ruleID0 ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'author' ( (lv_author_6_0= ruleNameType ) ) otherlv_7= 'pages' ( (lv_pages_8_0= ruleInt0 ) ) otherlv_9= 'isbn' ( (lv_isbn_10_0= ruleIsbnType ) ) ( (lv_bookInfo_11_0= ruleBookInfoType ) )? otherlv_12= '}' ) ;
    public final EObject ruleBookType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_author_6_0 = null;

        AntlrDatatypeRuleToken lv_pages_8_0 = null;

        AntlrDatatypeRuleToken lv_isbn_10_0 = null;

        EObject lv_bookInfo_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:200:28: ( (otherlv_0= 'Book' ( (lv_name_1_0= ruleID0 ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'author' ( (lv_author_6_0= ruleNameType ) ) otherlv_7= 'pages' ( (lv_pages_8_0= ruleInt0 ) ) otherlv_9= 'isbn' ( (lv_isbn_10_0= ruleIsbnType ) ) ( (lv_bookInfo_11_0= ruleBookInfoType ) )? otherlv_12= '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:201:1: (otherlv_0= 'Book' ( (lv_name_1_0= ruleID0 ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'author' ( (lv_author_6_0= ruleNameType ) ) otherlv_7= 'pages' ( (lv_pages_8_0= ruleInt0 ) ) otherlv_9= 'isbn' ( (lv_isbn_10_0= ruleIsbnType ) ) ( (lv_bookInfo_11_0= ruleBookInfoType ) )? otherlv_12= '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:201:1: (otherlv_0= 'Book' ( (lv_name_1_0= ruleID0 ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'author' ( (lv_author_6_0= ruleNameType ) ) otherlv_7= 'pages' ( (lv_pages_8_0= ruleInt0 ) ) otherlv_9= 'isbn' ( (lv_isbn_10_0= ruleIsbnType ) ) ( (lv_bookInfo_11_0= ruleBookInfoType ) )? otherlv_12= '}' )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:201:3: otherlv_0= 'Book' ( (lv_name_1_0= ruleID0 ) ) otherlv_2= '{' otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'author' ( (lv_author_6_0= ruleNameType ) ) otherlv_7= 'pages' ( (lv_pages_8_0= ruleInt0 ) ) otherlv_9= 'isbn' ( (lv_isbn_10_0= ruleIsbnType ) ) ( (lv_bookInfo_11_0= ruleBookInfoType ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBookType360); 

                	newLeafNode(otherlv_0, grammarAccess.getBookTypeAccess().getBookKeyword_0());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:205:1: ( (lv_name_1_0= ruleID0 ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:206:1: (lv_name_1_0= ruleID0 )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:206:1: (lv_name_1_0= ruleID0 )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:207:3: lv_name_1_0= ruleID0
            {
             
            	        newCompositeNode(grammarAccess.getBookTypeAccess().getNameID0ParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_ruleBookType381);
            lv_name_1_0=ruleID0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBookType393); 

                	newLeafNode(otherlv_2, grammarAccess.getBookTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBookType405); 

                	newLeafNode(otherlv_3, grammarAccess.getBookTypeAccess().getTitleKeyword_3());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:231:1: ( (lv_title_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:232:1: (lv_title_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:232:1: (lv_title_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:233:3: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBookType422); 

            			newLeafNode(lv_title_4_0, grammarAccess.getBookTypeAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBookTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBookType439); 

                	newLeafNode(otherlv_5, grammarAccess.getBookTypeAccess().getAuthorKeyword_5());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:253:1: ( (lv_author_6_0= ruleNameType ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:254:1: (lv_author_6_0= ruleNameType )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:254:1: (lv_author_6_0= ruleNameType )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:255:3: lv_author_6_0= ruleNameType
            {
             
            	        newCompositeNode(grammarAccess.getBookTypeAccess().getAuthorNameTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNameType_in_ruleBookType460);
            lv_author_6_0=ruleNameType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookTypeRule());
            	        }
                   		set(
                   			current, 
                   			"author",
                    		lv_author_6_0, 
                    		"NameType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBookType472); 

                	newLeafNode(otherlv_7, grammarAccess.getBookTypeAccess().getPagesKeyword_7());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:275:1: ( (lv_pages_8_0= ruleInt0 ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:276:1: (lv_pages_8_0= ruleInt0 )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:276:1: (lv_pages_8_0= ruleInt0 )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:277:3: lv_pages_8_0= ruleInt0
            {
             
            	        newCompositeNode(grammarAccess.getBookTypeAccess().getPagesInt0ParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_ruleBookType493);
            lv_pages_8_0=ruleInt0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookTypeRule());
            	        }
                   		set(
                   			current, 
                   			"pages",
                    		lv_pages_8_0, 
                    		"Int0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBookType505); 

                	newLeafNode(otherlv_9, grammarAccess.getBookTypeAccess().getIsbnKeyword_9());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:297:1: ( (lv_isbn_10_0= ruleIsbnType ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:298:1: (lv_isbn_10_0= ruleIsbnType )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:298:1: (lv_isbn_10_0= ruleIsbnType )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:299:3: lv_isbn_10_0= ruleIsbnType
            {
             
            	        newCompositeNode(grammarAccess.getBookTypeAccess().getIsbnIsbnTypeParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIsbnType_in_ruleBookType526);
            lv_isbn_10_0=ruleIsbnType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookTypeRule());
            	        }
                   		set(
                   			current, 
                   			"isbn",
                    		lv_isbn_10_0, 
                    		"IsbnType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:315:2: ( (lv_bookInfo_11_0= ruleBookInfoType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:316:1: (lv_bookInfo_11_0= ruleBookInfoType )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:316:1: (lv_bookInfo_11_0= ruleBookInfoType )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:317:3: lv_bookInfo_11_0= ruleBookInfoType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBookTypeAccess().getBookInfoBookInfoTypeParserRuleCall_11_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBookInfoType_in_ruleBookType547);
                    lv_bookInfo_11_0=ruleBookInfoType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBookTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"bookInfo",
                            		lv_bookInfo_11_0, 
                            		"BookInfoType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBookType560); 

                	newLeafNode(otherlv_12, grammarAccess.getBookTypeAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleBookType"


    // $ANTLR start "entryRuleCustomerType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:345:1: entryRuleCustomerType returns [EObject current=null] : iv_ruleCustomerType= ruleCustomerType EOF ;
    public final EObject entryRuleCustomerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomerType = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:346:2: (iv_ruleCustomerType= ruleCustomerType EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:347:2: iv_ruleCustomerType= ruleCustomerType EOF
            {
             newCompositeNode(grammarAccess.getCustomerTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomerType_in_entryRuleCustomerType596);
            iv_ruleCustomerType=ruleCustomerType();

            state._fsp--;

             current =iv_ruleCustomerType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomerType606); 

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
    // $ANTLR end "entryRuleCustomerType"


    // $ANTLR start "ruleCustomerType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:354:1: ruleCustomerType returns [EObject current=null] : (otherlv_0= 'Customer' otherlv_1= '{' otherlv_2= 'firstName' ( (lv_firstName_3_0= RULE_STRING ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCustomerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_firstName_3_0=null;
        Token otherlv_4=null;
        Token lv_lastName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:357:28: ( (otherlv_0= 'Customer' otherlv_1= '{' otherlv_2= 'firstName' ( (lv_firstName_3_0= RULE_STRING ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) ) )? otherlv_8= '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:358:1: (otherlv_0= 'Customer' otherlv_1= '{' otherlv_2= 'firstName' ( (lv_firstName_3_0= RULE_STRING ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) ) )? otherlv_8= '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:358:1: (otherlv_0= 'Customer' otherlv_1= '{' otherlv_2= 'firstName' ( (lv_firstName_3_0= RULE_STRING ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) ) )? otherlv_8= '}' )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:358:3: otherlv_0= 'Customer' otherlv_1= '{' otherlv_2= 'firstName' ( (lv_firstName_3_0= RULE_STRING ) ) otherlv_4= 'lastName' ( (lv_lastName_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCustomerType643); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomerTypeAccess().getCustomerKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCustomerType655); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomerTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCustomerType667); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomerTypeAccess().getFirstNameKeyword_2());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:370:1: ( (lv_firstName_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:371:1: (lv_firstName_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:371:1: (lv_firstName_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:372:3: lv_firstName_3_0= RULE_STRING
            {
            lv_firstName_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerType684); 

            			newLeafNode(lv_firstName_3_0, grammarAccess.getCustomerTypeAccess().getFirstNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomerTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstName",
                    		lv_firstName_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCustomerType701); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomerTypeAccess().getLastNameKeyword_4());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:392:1: ( (lv_lastName_5_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:393:1: (lv_lastName_5_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:393:1: (lv_lastName_5_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:394:3: lv_lastName_5_0= RULE_STRING
            {
            lv_lastName_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomerType718); 

            			newLeafNode(lv_lastName_5_0, grammarAccess.getCustomerTypeAccess().getLastNameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomerTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lastName",
                    		lv_lastName_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:410:2: (otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:410:4: otherlv_6= 'borrowedBookId' ( ( ruleIDREF ) )
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCustomerType736); 

                        	newLeafNode(otherlv_6, grammarAccess.getCustomerTypeAccess().getBorrowedBookIdKeyword_6_0());
                        
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:414:1: ( ( ruleIDREF ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:415:1: ( ruleIDREF )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:415:1: ( ruleIDREF )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:416:3: ruleIDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomerTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCustomerTypeAccess().getBorrowedBookIdEObjectCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_ruleCustomerType759);
                    ruleIDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCustomerType773); 

                	newLeafNode(otherlv_8, grammarAccess.getCustomerTypeAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleCustomerType"


    // $ANTLR start "entryRuleID0"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:441:1: entryRuleID0 returns [String current=null] : iv_ruleID0= ruleID0 EOF ;
    public final String entryRuleID0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID0 = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:442:2: (iv_ruleID0= ruleID0 EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:443:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0810);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0821); 

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
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:450:1: ruleID0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleID0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:453:28: (this_ID_0= RULE_ID )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:454:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0860); 

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


    // $ANTLR start "entryRuleNameType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:469:1: entryRuleNameType returns [String current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final String entryRuleNameType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameType = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:470:2: (iv_ruleNameType= ruleNameType EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:471:2: iv_ruleNameType= ruleNameType EOF
            {
             newCompositeNode(grammarAccess.getNameTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNameType_in_entryRuleNameType905);
            iv_ruleNameType=ruleNameType();

            state._fsp--;

             current =iv_ruleNameType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameType916); 

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
    // $ANTLR end "entryRuleNameType"


    // $ANTLR start "ruleNameType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:478:1: ruleNameType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNameType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:481:28: (this_STRING_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:482:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNameType955); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getNameTypeAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNameType"


    // $ANTLR start "entryRuleInt0"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:497:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:498:2: (iv_ruleInt0= ruleInt0 EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:499:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt01000);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt01011); 

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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:506:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:509:28: (this_INT_0= RULE_INT )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:510:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInt01050); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getInt0Access().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleIsbnType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:525:1: entryRuleIsbnType returns [String current=null] : iv_ruleIsbnType= ruleIsbnType EOF ;
    public final String entryRuleIsbnType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsbnType = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:526:2: (iv_ruleIsbnType= ruleIsbnType EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:527:2: iv_ruleIsbnType= ruleIsbnType EOF
            {
             newCompositeNode(grammarAccess.getIsbnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsbnType_in_entryRuleIsbnType1095);
            iv_ruleIsbnType=ruleIsbnType();

            state._fsp--;

             current =iv_ruleIsbnType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsbnType1106); 

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
    // $ANTLR end "entryRuleIsbnType"


    // $ANTLR start "ruleIsbnType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:534:1: ruleIsbnType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleIsbnType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:537:28: (this_STRING_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:538:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIsbnType1145); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getIsbnTypeAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleIsbnType"


    // $ANTLR start "entryRuleBookInfoType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:553:1: entryRuleBookInfoType returns [EObject current=null] : iv_ruleBookInfoType= ruleBookInfoType EOF ;
    public final EObject entryRuleBookInfoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBookInfoType = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:554:2: (iv_ruleBookInfoType= ruleBookInfoType EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:555:2: iv_ruleBookInfoType= ruleBookInfoType EOF
            {
             newCompositeNode(grammarAccess.getBookInfoTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBookInfoType_in_entryRuleBookInfoType1189);
            iv_ruleBookInfoType=ruleBookInfoType();

            state._fsp--;

             current =iv_ruleBookInfoType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBookInfoType1199); 

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
    // $ANTLR end "entryRuleBookInfoType"


    // $ANTLR start "ruleBookInfoType"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:562:1: ruleBookInfoType returns [EObject current=null] : ( () otherlv_1= 'BookInfo' ( ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )* )? ) ;
    public final EObject ruleBookInfoType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_any_2_0 = null;

        EObject lv_any_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:565:28: ( ( () otherlv_1= 'BookInfo' ( ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )* )? ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:566:1: ( () otherlv_1= 'BookInfo' ( ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )* )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:566:1: ( () otherlv_1= 'BookInfo' ( ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )* )? )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:566:2: () otherlv_1= 'BookInfo' ( ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )* )?
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:566:2: ()
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:567:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBookInfoTypeAccess().getBookInfoTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBookInfoType1245); 

                	newLeafNode(otherlv_1, grammarAccess.getBookInfoTypeAccess().getBookInfoKeyword_1());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:576:1: ( ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:576:2: ( (lv_any_2_0= ruleAnyGenericElement ) ) (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )*
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:576:2: ( (lv_any_2_0= ruleAnyGenericElement ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:577:1: (lv_any_2_0= ruleAnyGenericElement )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:577:1: (lv_any_2_0= ruleAnyGenericElement )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:578:3: lv_any_2_0= ruleAnyGenericElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getBookInfoTypeAccess().getAnyAnyGenericElementParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleBookInfoType1267);
                    lv_any_2_0=ruleAnyGenericElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBookInfoTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"any",
                            		lv_any_2_0, 
                            		"AnyGenericElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:594:2: (otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:594:4: otherlv_3= ',' ( (lv_any_4_0= ruleAnyGenericElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBookInfoType1280); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getBookInfoTypeAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:598:1: ( (lv_any_4_0= ruleAnyGenericElement ) )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:599:1: (lv_any_4_0= ruleAnyGenericElement )
                    	    {
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:599:1: (lv_any_4_0= ruleAnyGenericElement )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:600:3: lv_any_4_0= ruleAnyGenericElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBookInfoTypeAccess().getAnyAnyGenericElementParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleBookInfoType1301);
                    	    lv_any_4_0=ruleAnyGenericElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBookInfoTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"any",
                    	            		lv_any_4_0, 
                    	            		"AnyGenericElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleBookInfoType"


    // $ANTLR start "entryRuleAnyGenericElement"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:624:1: entryRuleAnyGenericElement returns [EObject current=null] : iv_ruleAnyGenericElement= ruleAnyGenericElement EOF ;
    public final EObject entryRuleAnyGenericElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericElement = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:625:2: (iv_ruleAnyGenericElement= ruleAnyGenericElement EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:626:2: iv_ruleAnyGenericElement= ruleAnyGenericElement EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement1341);
            iv_ruleAnyGenericElement=ruleAnyGenericElement();

            state._fsp--;

             current =iv_ruleAnyGenericElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericElement1351); 

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
    // $ANTLR end "entryRuleAnyGenericElement"


    // $ANTLR start "ruleAnyGenericElement"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:633:1: ruleAnyGenericElement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_elemName_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) ) )? ( ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )* )? ( ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleAnyGenericElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_elemName_2_0=null;
        Token otherlv_3=null;
        Token lv_elemValue_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_anyGenericAttr_5_0 = null;

        EObject lv_anyGenericAttr_7_0 = null;

        EObject lv_anyGenericElement_8_0 = null;

        EObject lv_anyGenericElement_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:636:28: ( ( () otherlv_1= '{' ( (lv_elemName_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) ) )? ( ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )* )? ( ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )* )? otherlv_11= '}' ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:637:1: ( () otherlv_1= '{' ( (lv_elemName_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) ) )? ( ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )* )? ( ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )* )? otherlv_11= '}' )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:637:1: ( () otherlv_1= '{' ( (lv_elemName_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) ) )? ( ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )* )? ( ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )* )? otherlv_11= '}' )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:637:2: () otherlv_1= '{' ( (lv_elemName_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) ) )? ( ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )* )? ( ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )* )? otherlv_11= '}'
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:637:2: ()
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:638:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnyGenericElement1397); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_1());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:647:1: ( (lv_elemName_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_STRING||LA9_1==13||LA9_1==15||LA9_1==26) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:648:1: (lv_elemName_2_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:648:1: (lv_elemName_2_0= RULE_STRING )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:649:3: lv_elemName_2_0= RULE_STRING
                    {
                    lv_elemName_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericElement1414); 

                    			newLeafNode(lv_elemName_2_0, grammarAccess.getAnyGenericElementAccess().getElemNameSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elemName",
                            		lv_elemName_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:665:3: (otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:665:5: otherlv_3= ':' ( (lv_elemValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnyGenericElement1433); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnyGenericElementAccess().getColonKeyword_3_0());
                        
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:669:1: ( (lv_elemValue_4_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:670:1: (lv_elemValue_4_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:670:1: (lv_elemValue_4_0= RULE_STRING )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:671:3: lv_elemValue_4_0= RULE_STRING
                    {
                    lv_elemValue_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericElement1450); 

                    			newLeafNode(lv_elemValue_4_0, grammarAccess.getAnyGenericElementAccess().getElemValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elemValue",
                            		lv_elemValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:687:4: ( ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:687:5: ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) ) (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )*
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:687:5: ( (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:688:1: (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:688:1: (lv_anyGenericAttr_5_0= ruleAnyGenericAttribute )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:689:3: lv_anyGenericAttr_5_0= ruleAnyGenericAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement1479);
                    lv_anyGenericAttr_5_0=ruleAnyGenericAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		add(
                           			current, 
                           			"anyGenericAttr",
                            		lv_anyGenericAttr_5_0, 
                            		"AnyGenericAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:705:2: (otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:705:4: otherlv_6= ',' ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnyGenericElement1492); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAnyGenericElementAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:709:1: ( (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute ) )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:710:1: (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute )
                    	    {
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:710:1: (lv_anyGenericAttr_7_0= ruleAnyGenericAttribute )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:711:3: lv_anyGenericAttr_7_0= ruleAnyGenericAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement1513);
                    	    lv_anyGenericAttr_7_0=ruleAnyGenericAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"anyGenericAttr",
                    	            		lv_anyGenericAttr_7_0, 
                    	            		"AnyGenericAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:727:6: ( ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:727:7: ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) ) (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )*
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:727:7: ( (lv_anyGenericElement_8_0= ruleAnyGenericElement ) )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:728:1: (lv_anyGenericElement_8_0= ruleAnyGenericElement )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:728:1: (lv_anyGenericElement_8_0= ruleAnyGenericElement )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:729:3: lv_anyGenericElement_8_0= ruleAnyGenericElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAnyGenericElementParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1539);
                    lv_anyGenericElement_8_0=ruleAnyGenericElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		add(
                           			current, 
                           			"anyGenericElement",
                            		lv_anyGenericElement_8_0, 
                            		"AnyGenericElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:745:2: (otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:745:4: otherlv_9= ',' ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnyGenericElement1552); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAnyGenericElementAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:749:1: ( (lv_anyGenericElement_10_0= ruleAnyGenericElement ) )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:750:1: (lv_anyGenericElement_10_0= ruleAnyGenericElement )
                    	    {
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:750:1: (lv_anyGenericElement_10_0= ruleAnyGenericElement )
                    	    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:751:3: lv_anyGenericElement_10_0= ruleAnyGenericElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAnyGenericElementParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1573);
                    	    lv_anyGenericElement_10_0=ruleAnyGenericElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"anyGenericElement",
                    	            		lv_anyGenericElement_10_0, 
                    	            		"AnyGenericElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnyGenericElement1589); 

                	newLeafNode(otherlv_11, grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAnyGenericElement"


    // $ANTLR start "entryRuleAnyGenericAttribute"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:779:1: entryRuleAnyGenericAttribute returns [EObject current=null] : iv_ruleAnyGenericAttribute= ruleAnyGenericAttribute EOF ;
    public final EObject entryRuleAnyGenericAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericAttribute = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:780:2: (iv_ruleAnyGenericAttribute= ruleAnyGenericAttribute EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:781:2: iv_ruleAnyGenericAttribute= ruleAnyGenericAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute1625);
            iv_ruleAnyGenericAttribute=ruleAnyGenericAttribute();

            state._fsp--;

             current =iv_ruleAnyGenericAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericAttribute1635); 

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
    // $ANTLR end "entryRuleAnyGenericAttribute"


    // $ANTLR start "ruleAnyGenericAttribute"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:788:1: ruleAnyGenericAttribute returns [EObject current=null] : ( ( (lv_attrName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_attrValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnyGenericAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attrName_0_0=null;
        Token otherlv_1=null;
        Token lv_attrValue_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:791:28: ( ( ( (lv_attrName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_attrValue_2_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:792:1: ( ( (lv_attrName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_attrValue_2_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:792:1: ( ( (lv_attrName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_attrValue_2_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:792:2: ( (lv_attrName_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_attrValue_2_0= RULE_STRING ) )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:792:2: ( (lv_attrName_0_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:793:1: (lv_attrName_0_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:793:1: (lv_attrName_0_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:794:3: lv_attrName_0_0= RULE_STRING
            {
            lv_attrName_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1677); 

            			newLeafNode(lv_attrName_0_0, grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyGenericAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attrName",
                    		lv_attrName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnyGenericAttribute1694); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyGenericAttributeAccess().getEqualsSignKeyword_1());
                
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:814:1: ( (lv_attrValue_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:815:1: (lv_attrValue_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:815:1: (lv_attrValue_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:816:3: lv_attrValue_2_0= RULE_STRING
            {
            lv_attrValue_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1711); 

            			newLeafNode(lv_attrValue_2_0, grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyGenericAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attrValue",
                    		lv_attrValue_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleAnyGenericAttribute"


    // $ANTLR start "entryRuleAnyGenericText"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:840:1: entryRuleAnyGenericText returns [EObject current=null] : iv_ruleAnyGenericText= ruleAnyGenericText EOF ;
    public final EObject entryRuleAnyGenericText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericText = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:841:2: (iv_ruleAnyGenericText= ruleAnyGenericText EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:842:2: iv_ruleAnyGenericText= ruleAnyGenericText EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText1752);
            iv_ruleAnyGenericText=ruleAnyGenericText();

            state._fsp--;

             current =iv_ruleAnyGenericText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericText1762); 

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
    // $ANTLR end "entryRuleAnyGenericText"


    // $ANTLR start "ruleAnyGenericText"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:849:1: ruleAnyGenericText returns [EObject current=null] : ( () ( (lv_textValue_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleAnyGenericText() throws RecognitionException {
        EObject current = null;

        Token lv_textValue_1_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:852:28: ( ( () ( (lv_textValue_1_0= RULE_STRING ) )? ) )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:853:1: ( () ( (lv_textValue_1_0= RULE_STRING ) )? )
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:853:1: ( () ( (lv_textValue_1_0= RULE_STRING ) )? )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:853:2: () ( (lv_textValue_1_0= RULE_STRING ) )?
            {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:853:2: ()
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:854:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyGenericTextAccess().getAnyGenericTextAction_0(),
                        current);
                

            }

            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:859:2: ( (lv_textValue_1_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:860:1: (lv_textValue_1_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:860:1: (lv_textValue_1_0= RULE_STRING )
                    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:861:3: lv_textValue_1_0= RULE_STRING
                    {
                    lv_textValue_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericText1813); 

                    			newLeafNode(lv_textValue_1_0, grammarAccess.getAnyGenericTextAccess().getTextValueSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyGenericTextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"textValue",
                            		lv_textValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleAnyGenericText"


    // $ANTLR start "entryRuleIDREF"
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:887:1: entryRuleIDREF returns [String current=null] : iv_ruleIDREF= ruleIDREF EOF ;
    public final String entryRuleIDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDREF = null;


        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:888:2: (iv_ruleIDREF= ruleIDREF EOF )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:889:2: iv_ruleIDREF= ruleIDREF EOF
            {
             newCompositeNode(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF1858);
            iv_ruleIDREF=ruleIDREF();

            state._fsp--;

             current =iv_ruleIDREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF1869); 

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
    // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:896:1: ruleIDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:899:28: (this_ID_0= RULE_ID )
            // ../at.ac.tuwien.big.xmltext.library3/src-gen/at/ac/tuwien/big/xmltext/library3/parser/antlr/internal/InternalLibrary3.g:900:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIDREF1908); 

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
        public static final BitSet FOLLOW_ruleLibraryType_in_entryRuleLibraryType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLibraryType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleLibraryType131 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLibraryType143 = new BitSet(new long[]{0x0000000000218000L});
        public static final BitSet FOLLOW_ruleBookType_in_ruleLibraryType165 = new BitSet(new long[]{0x000000000020C000L});
        public static final BitSet FOLLOW_14_in_ruleLibraryType178 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleBookType_in_ruleLibraryType199 = new BitSet(new long[]{0x000000000020C000L});
        public static final BitSet FOLLOW_ruleCustomerType_in_ruleLibraryType225 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleLibraryType238 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleCustomerType_in_ruleLibraryType259 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleLibraryType275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookType_in_entryRuleBookType313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBookType323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleBookType360 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleID0_in_ruleBookType381 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleBookType393 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBookType405 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBookType422 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBookType439 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNameType_in_ruleBookType460 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBookType472 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleInt0_in_ruleBookType493 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleBookType505 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIsbnType_in_ruleBookType526 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_ruleBookInfoType_in_ruleBookType547 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBookType560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomerType_in_entryRuleCustomerType596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomerType606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCustomerType643 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCustomerType655 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCustomerType667 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerType684 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCustomerType701 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomerType718 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_24_in_ruleCustomerType736 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIDREF_in_ruleCustomerType759 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCustomerType773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameType_in_entryRuleNameType905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameType916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNameType955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt01000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt01011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInt01050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsbnType_in_entryRuleIsbnType1095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsbnType1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIsbnType1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBookInfoType_in_entryRuleBookInfoType1189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBookInfoType1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBookInfoType1245 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleBookInfoType1267 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleBookInfoType1280 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleBookInfoType1301 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement1341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericElement1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleAnyGenericElement1397 = new BitSet(new long[]{0x000000000400A010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericElement1414 = new BitSet(new long[]{0x000000000400A010L});
        public static final BitSet FOLLOW_26_in_ruleAnyGenericElement1433 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericElement1450 = new BitSet(new long[]{0x000000000000A010L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement1479 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_14_in_ruleAnyGenericElement1492 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement1513 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1539 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAnyGenericElement1552 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1573 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAnyGenericElement1589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute1625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericAttribute1635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1677 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAnyGenericAttribute1694 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText1752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericText1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericText1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF1858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIDREF1908 = new BitSet(new long[]{0x0000000000000002L});
    }


}