package org.xtext.example.pascal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'()'", "':'", "'return'", "';'", "'('", "')'", "'procedure'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Begin";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBegin"
    // InternalPascal.g:64:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalPascal.g:64:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalPascal.g:65:2: iv_ruleBegin= ruleBegin EOF
            {
             newCompositeNode(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBegin=ruleBegin();

            state._fsp--;

             current =iv_ruleBegin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalPascal.g:71:1: ruleBegin returns [EObject current=null] : (this_Function_0= ruleFunction | this_Procedure_1= ruleProcedure ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_Procedure_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( (this_Function_0= ruleFunction | this_Procedure_1= ruleProcedure ) )
            // InternalPascal.g:78:2: (this_Function_0= ruleFunction | this_Procedure_1= ruleProcedure )
            {
            // InternalPascal.g:78:2: (this_Function_0= ruleFunction | this_Procedure_1= ruleProcedure )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:79:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getBeginAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:88:3: this_Procedure_1= ruleProcedure
                    {

                    			newCompositeNode(grammarAccess.getBeginAccess().getProcedureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Procedure_1=ruleProcedure();

                    state._fsp--;


                    			current = this_Procedure_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleFunction"
    // InternalPascal.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalPascal.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalPascal.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalPascal.g:107:1: ruleFunction returns [EObject current=null] : ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) | (otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';' ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_name_20_0=null;
        Token otherlv_21=null;


        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) | (otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';' ) ) )
            // InternalPascal.g:114:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) | (otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';' ) )
            {
            // InternalPascal.g:114:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) | (otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==12) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==16) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:115:3: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
                    {
                    // InternalPascal.g:115:3: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
                    // InternalPascal.g:116:4: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ':' otherlv_4= 'return' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0_0());
                    			
                    // InternalPascal.g:120:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPascal.g:121:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPascal.g:121:5: (lv_name_1_0= RULE_ID )
                    // InternalPascal.g:122:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getColonKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getReturnKeyword_0_4());
                    			
                    // InternalPascal.g:150:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:151:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:151:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:152:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getSemicolonKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:174:3: (otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // InternalPascal.g:174:3: (otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';' )
                    // InternalPascal.g:175:4: otherlv_7= 'function' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ':' ruleType (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )* otherlv_17= ')' otherlv_18= ':' otherlv_19= 'return' ( (lv_name_20_0= RULE_ID ) ) otherlv_21= ';'
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getFunctionKeyword_1_0());
                    			
                    // InternalPascal.g:179:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalPascal.g:180:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalPascal.g:180:5: (lv_name_8_0= RULE_ID )
                    // InternalPascal.g:181:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalPascal.g:201:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalPascal.g:202:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalPascal.g:202:5: (lv_name_10_0= RULE_ID )
                    // InternalPascal.g:203:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_10_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getColonKeyword_1_4());
                    			

                    				newCompositeNode(grammarAccess.getFunctionAccess().getTypeParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_10);
                    ruleType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascal.g:230:4: (otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPascal.g:231:5: otherlv_13= ';' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ':' ruleType
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getSemicolonKeyword_1_6_0());
                    	    				
                    	    // InternalPascal.g:235:5: ( (lv_name_14_0= RULE_ID ) )
                    	    // InternalPascal.g:236:6: (lv_name_14_0= RULE_ID )
                    	    {
                    	    // InternalPascal.g:236:6: (lv_name_14_0= RULE_ID )
                    	    // InternalPascal.g:237:7: lv_name_14_0= RULE_ID
                    	    {
                    	    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(lv_name_14_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_6_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFunctionRule());
                    	    							}
                    	    							setWithLastConsumed(
                    	    								current,
                    	    								"name",
                    	    								lv_name_14_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getFunctionAccess().getColonKeyword_1_6_2());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFunctionAccess().getTypeParserRuleCall_1_6_3());
                    	    				
                    	    pushFollow(FOLLOW_10);
                    	    ruleType();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_7());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getFunctionAccess().getColonKeyword_1_8());
                    			
                    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getFunctionAccess().getReturnKeyword_1_9());
                    			
                    // InternalPascal.g:277:4: ( (lv_name_20_0= RULE_ID ) )
                    // InternalPascal.g:278:5: (lv_name_20_0= RULE_ID )
                    {
                    // InternalPascal.g:278:5: (lv_name_20_0= RULE_ID )
                    // InternalPascal.g:279:6: lv_name_20_0= RULE_ID
                    {
                    lv_name_20_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_20_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_10_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_20_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getFunctionAccess().getSemicolonKeyword_1_11());
                    			

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleProcedure"
    // InternalPascal.g:304:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalPascal.g:304:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalPascal.g:305:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalPascal.g:311:1: ruleProcedure returns [EObject current=null] : ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';' ) | (otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';' ) ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalPascal.g:317:2: ( ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';' ) | (otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';' ) ) )
            // InternalPascal.g:318:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';' ) | (otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';' ) )
            {
            // InternalPascal.g:318:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';' ) | (otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==12) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==16) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:319:3: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';' )
                    {
                    // InternalPascal.g:319:3: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';' )
                    // InternalPascal.g:320:4: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0_0());
                    			
                    // InternalPascal.g:324:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPascal.g:325:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPascal.g:325:5: (lv_name_1_0= RULE_ID )
                    // InternalPascal.g:326:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisRightParenthesisKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcedureAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:352:3: (otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';' )
                    {
                    // InternalPascal.g:352:3: (otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';' )
                    // InternalPascal.g:353:4: otherlv_4= 'procedure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ruleType (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )* otherlv_14= ')' otherlv_15= ';'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getProcedureKeyword_1_0());
                    			
                    // InternalPascal.g:357:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:358:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:358:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:359:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalPascal.g:379:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalPascal.g:380:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalPascal.g:380:5: (lv_name_7_0= RULE_ID )
                    // InternalPascal.g:381:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getProcedureAccess().getColonKeyword_1_4());
                    			

                    				newCompositeNode(grammarAccess.getProcedureAccess().getTypeParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_10);
                    ruleType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascal.g:408:4: (otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPascal.g:409:5: otherlv_10= ';' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ruleType
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getProcedureAccess().getSemicolonKeyword_1_6_0());
                    	    				
                    	    // InternalPascal.g:413:5: ( (lv_name_11_0= RULE_ID ) )
                    	    // InternalPascal.g:414:6: (lv_name_11_0= RULE_ID )
                    	    {
                    	    // InternalPascal.g:414:6: (lv_name_11_0= RULE_ID )
                    	    // InternalPascal.g:415:7: lv_name_11_0= RULE_ID
                    	    {
                    	    lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(lv_name_11_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_6_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProcedureRule());
                    	    							}
                    	    							setWithLastConsumed(
                    	    								current,
                    	    								"name",
                    	    								lv_name_11_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProcedureAccess().getColonKeyword_1_6_2());
                    	    				

                    	    					newCompositeNode(grammarAccess.getProcedureAccess().getTypeParserRuleCall_1_6_3());
                    	    				
                    	    pushFollow(FOLLOW_10);
                    	    ruleType();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcedureAccess().getRightParenthesisKeyword_1_7());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcedureAccess().getSemicolonKeyword_1_8());
                    			

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleType"
    // InternalPascal.g:456:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalPascal.g:456:44: (iv_ruleType= ruleType EOF )
            // InternalPascal.g:457:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPascal.g:463:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:469:2: (this_INT_0= RULE_INT )
            // InternalPascal.g:470:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getTypeAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});

}