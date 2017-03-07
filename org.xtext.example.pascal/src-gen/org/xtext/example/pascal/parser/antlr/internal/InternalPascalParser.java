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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'begin'", "'end'", "':'", "'goto'", "':='", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'in'", "'or'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'nil'", "'not'", "'['", "']'", "'\\''", "'\\'\\''", "'E'", "'e'", "'^'", "'+'", "'-'", "'with'", "'do'", "'case'", "'of'", "'if'", "'then'", "'else'", "'for'", "'to'", "'downto'", "'repeat'", "'until'", "'while'", "'label'", "'const'", "'type'", "'packed'", "'file'", "'set'", "'record'", "'array'", "'..'", "'var'", "'function'", "'procedure'", "'forward'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

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
    // InternalPascal.g:70:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalPascal.g:70:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalPascal.g:71:2: iv_ruleBegin= ruleBegin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeginRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBegin=ruleBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBegin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalPascal.g:77:1: ruleBegin returns [EObject current=null] : ( (lv_elements_0_0= ruleprogram ) ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:83:2: ( ( (lv_elements_0_0= ruleprogram ) ) )
            // InternalPascal.g:84:2: ( (lv_elements_0_0= ruleprogram ) )
            {
            // InternalPascal.g:84:2: ( (lv_elements_0_0= ruleprogram ) )
            // InternalPascal.g:85:3: (lv_elements_0_0= ruleprogram )
            {
            // InternalPascal.g:85:3: (lv_elements_0_0= ruleprogram )
            // InternalPascal.g:86:4: lv_elements_0_0= ruleprogram
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBeginAccess().getElementsProgramParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_elements_0_0=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBeginRule());
              				}
              				add(
              					current,
              					"elements",
              					lv_elements_0_0,
              					"org.xtext.example.pascal.Pascal.program");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:106:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:106:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:107:2: iv_ruleprogram= ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:113:1: ruleprogram returns [EObject current=null] : ( () ( ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )? ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_program_heading_1_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:119:2: ( ( () ( ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )? ) )
            // InternalPascal.g:120:2: ( () ( ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )? )
            {
            // InternalPascal.g:120:2: ( () ( ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )? )
            // InternalPascal.g:121:3: () ( ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )?
            {
            // InternalPascal.g:121:3: ()
            // InternalPascal.g:122:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProgramAccess().getProgramAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:131:3: ( ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:132:4: ( (lv_program_heading_1_0= ruleprogram_heading ) ) ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.'
                    {
                    // InternalPascal.g:132:4: ( (lv_program_heading_1_0= ruleprogram_heading ) )
                    // InternalPascal.g:133:5: (lv_program_heading_1_0= ruleprogram_heading )
                    {
                    // InternalPascal.g:133:5: (lv_program_heading_1_0= ruleprogram_heading )
                    // InternalPascal.g:134:6: lv_program_heading_1_0= ruleprogram_heading
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getProgram_headingProgram_headingParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_program_heading_1_0=ruleprogram_heading();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"program_heading",
                      							lv_program_heading_1_0,
                      							"org.xtext.example.pascal.Pascal.program_heading");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPascal.g:151:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:152:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:152:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:153:6: lv_block_2_0= ruleblock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_block_2_0=ruleblock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_2_0,
                      							"org.xtext.example.pascal.Pascal.block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getFullStopKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading"
    // InternalPascal.g:179:1: entryRuleprogram_heading returns [EObject current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final EObject entryRuleprogram_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading = null;


        try {
            // InternalPascal.g:179:56: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // InternalPascal.g:180:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgram_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram_heading; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprogram_heading"


    // $ANTLR start "ruleprogram_heading"
    // InternalPascal.g:186:1: ruleprogram_heading returns [EObject current=null] : (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject ruleprogram_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifier_list_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:192:2: ( (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // InternalPascal.g:193:2: (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // InternalPascal.g:193:2: (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' )
            // InternalPascal.g:194:3: otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgram_headingAccess().getProgramKeyword_0());
              		
            }
            // InternalPascal.g:198:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalPascal.g:199:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalPascal.g:199:4: (lv_identifier_1_0= RULE_ID )
            // InternalPascal.g:200:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_1_0, grammarAccess.getProgram_headingAccess().getIdentifierIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgram_headingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPascal.g:220:3: ( (lv_identifier_list_3_0= ruleidentifier_list ) )
            // InternalPascal.g:221:4: (lv_identifier_list_3_0= ruleidentifier_list )
            {
            // InternalPascal.g:221:4: (lv_identifier_list_3_0= ruleidentifier_list )
            // InternalPascal.g:222:5: lv_identifier_list_3_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifier_listIdentifier_listParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_identifier_list_3_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgram_headingRule());
              					}
              					set(
              						current,
              						"identifier_list",
              						lv_identifier_list_3_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getProgram_headingAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprogram_heading"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:251:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:251:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:252:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifier_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:258:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token lv_identifier_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:264:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:265:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:265:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:266:3: ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:266:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:267:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:267:4: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:268:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_0_0, grammarAccess.getIdentifier_listAccess().getIdentifierIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIdentifier_listRule());
              					}
              					addWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPascal.g:284:3: (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:285:4: otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:289:4: ( (lv_identifier_2_0= RULE_ID ) )
            	    // InternalPascal.g:290:5: (lv_identifier_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:290:5: (lv_identifier_2_0= RULE_ID )
            	    // InternalPascal.g:291:6: lv_identifier_2_0= RULE_ID
            	    {
            	    lv_identifier_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_identifier_2_0, grammarAccess.getIdentifier_listAccess().getIdentifierIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"identifier",
            	      							lv_identifier_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:312:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:312:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:313:2: iv_ruleblock= ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:319:1: ruleblock returns [EObject current=null] : ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_part_0_0 = null;

        EObject lv_statement_part_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:325:2: ( ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) )
            // InternalPascal.g:326:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:326:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            // InternalPascal.g:327:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) )
            {
            // InternalPascal.g:327:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) )
            // InternalPascal.g:328:4: (lv_declaration_part_0_0= ruledeclaration_part )
            {
            // InternalPascal.g:328:4: (lv_declaration_part_0_0= ruledeclaration_part )
            // InternalPascal.g:329:5: lv_declaration_part_0_0= ruledeclaration_part
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockAccess().getDeclaration_partDeclaration_partParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_declaration_part_0_0=ruledeclaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockRule());
              					}
              					set(
              						current,
              						"declaration_part",
              						lv_declaration_part_0_0,
              						"org.xtext.example.pascal.Pascal.declaration_part");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:346:3: ( (lv_statement_part_1_0= rulestatement_part ) )
            // InternalPascal.g:347:4: (lv_statement_part_1_0= rulestatement_part )
            {
            // InternalPascal.g:347:4: (lv_statement_part_1_0= rulestatement_part )
            // InternalPascal.g:348:5: lv_statement_part_1_0= rulestatement_part
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockAccess().getStatement_partStatement_partParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_part_1_0=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockRule());
              					}
              					set(
              						current,
              						"statement_part",
              						lv_statement_part_1_0,
              						"org.xtext.example.pascal.Pascal.statement_part");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:369:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:369:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:370:2: iv_rulestatement_part= rulestatement_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:376:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:382:2: ( (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:383:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:383:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:384:3: otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:388:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:389:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:389:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:390:5: lv_statement_sequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatement_partAccess().getStatement_sequenceStatement_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_statement_sequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStatement_partRule());
              					}
              					set(
              						current,
              						"statement_sequence",
              						lv_statement_sequence_1_0,
              						"org.xtext.example.pascal.Pascal.statement_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:415:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:415:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:416:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_sequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:422:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statement_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:428:2: ( ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:429:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:429:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            // InternalPascal.g:430:3: ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:430:3: ( (lv_statement_0_0= rulestatement ) )
            // InternalPascal.g:431:4: (lv_statement_0_0= rulestatement )
            {
            // InternalPascal.g:431:4: (lv_statement_0_0= rulestatement )
            // InternalPascal.g:432:5: lv_statement_0_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementStatementParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_statement_0_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
              					}
              					add(
              						current,
              						"statement",
              						lv_statement_0_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:449:3: (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:450:4: otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:454:4: ( (lv_statement_2_0= rulestatement ) )
            	    // InternalPascal.g:455:5: (lv_statement_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:455:5: (lv_statement_2_0= rulestatement )
            	    // InternalPascal.g:456:6: lv_statement_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementStatementParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_statement_2_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"statement",
            	      							lv_statement_2_0,
            	      							"org.xtext.example.pascal.Pascal.statement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:478:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:478:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:479:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:485:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_statement_2_0 = null;

        EObject lv_structured_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:491:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:492:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:492:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:493:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:493:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=44 && LA4_0<=45)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:494:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:494:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:495:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:495:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:496:6: lv_label_0_0= rulelabel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_label_0_0=rulelabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"label",
                      							lv_label_0_0,
                      							"org.xtext.example.pascal.Pascal.label");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:518:3: ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==RULE_ID||LA5_0==15||LA5_0==18||LA5_0==20||LA5_0==52||LA5_0==57) ) {
                alt5=1;
            }
            else if ( (LA5_0==17||LA5_0==46||LA5_0==48||LA5_0==50||LA5_0==53||LA5_0==56||LA5_0==58) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:519:4: ( (lv_simple_statement_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:519:4: ( (lv_simple_statement_2_0= rulesimple_statement ) )
                    // InternalPascal.g:520:5: (lv_simple_statement_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:520:5: (lv_simple_statement_2_0= rulesimple_statement )
                    // InternalPascal.g:521:6: lv_simple_statement_2_0= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getSimple_statementSimple_statementParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_simple_statement_2_0=rulesimple_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"simple_statement",
                      							lv_simple_statement_2_0,
                      							"org.xtext.example.pascal.Pascal.simple_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:539:4: ( (lv_structured_statement_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:539:4: ( (lv_structured_statement_3_0= rulestructured_statement ) )
                    // InternalPascal.g:540:5: (lv_structured_statement_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:540:5: (lv_structured_statement_3_0= rulestructured_statement )
                    // InternalPascal.g:541:6: lv_structured_statement_3_0= rulestructured_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getStructured_statementStructured_statementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_structured_statement_3_0=rulestructured_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"structured_statement",
                      							lv_structured_statement_3_0,
                      							"org.xtext.example.pascal.Pascal.structured_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:563:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:563:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:564:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:570:1: rulesimple_statement returns [EObject current=null] : ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_statement_1_0 = null;

        EObject lv_procedure_statement_2_0 = null;

        EObject lv_goto_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:576:2: ( ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? ) )
            // InternalPascal.g:577:2: ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? )
            {
            // InternalPascal.g:577:2: ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? )
            // InternalPascal.g:578:3: () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )?
            {
            // InternalPascal.g:578:3: ()
            // InternalPascal.g:579:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSimple_statementAccess().getSimple_statementAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:588:3: ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )?
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==11||LA6_1==21||LA6_1==37||LA6_1==43) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==13||LA6_1==15||LA6_1==18||LA6_1==52||LA6_1==57) ) {
                    alt6=2;
                }
            }
            else if ( (LA6_0==20) ) {
                alt6=3;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:589:4: ( (lv_assignment_statement_1_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:589:4: ( (lv_assignment_statement_1_0= ruleassignment_statement ) )
                    // InternalPascal.g:590:5: (lv_assignment_statement_1_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:590:5: (lv_assignment_statement_1_0= ruleassignment_statement )
                    // InternalPascal.g:591:6: lv_assignment_statement_1_0= ruleassignment_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignment_statementAssignment_statementParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_statement_1_0=ruleassignment_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      						}
                      						set(
                      							current,
                      							"assignment_statement",
                      							lv_assignment_statement_1_0,
                      							"org.xtext.example.pascal.Pascal.assignment_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:609:4: ( (lv_procedure_statement_2_0= ruleprocedure_statement ) )
                    {
                    // InternalPascal.g:609:4: ( (lv_procedure_statement_2_0= ruleprocedure_statement ) )
                    // InternalPascal.g:610:5: (lv_procedure_statement_2_0= ruleprocedure_statement )
                    {
                    // InternalPascal.g:610:5: (lv_procedure_statement_2_0= ruleprocedure_statement )
                    // InternalPascal.g:611:6: lv_procedure_statement_2_0= ruleprocedure_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimple_statementAccess().getProcedure_statementProcedure_statementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_procedure_statement_2_0=ruleprocedure_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      						}
                      						set(
                      							current,
                      							"procedure_statement",
                      							lv_procedure_statement_2_0,
                      							"org.xtext.example.pascal.Pascal.procedure_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:629:4: ( (lv_goto_statement_3_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:629:4: ( (lv_goto_statement_3_0= rulegoto_statement ) )
                    // InternalPascal.g:630:5: (lv_goto_statement_3_0= rulegoto_statement )
                    {
                    // InternalPascal.g:630:5: (lv_goto_statement_3_0= rulegoto_statement )
                    // InternalPascal.g:631:6: lv_goto_statement_3_0= rulegoto_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimple_statementAccess().getGoto_statementGoto_statementParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_goto_statement_3_0=rulegoto_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      						}
                      						set(
                      							current,
                      							"goto_statement",
                      							lv_goto_statement_3_0,
                      							"org.xtext.example.pascal.Pascal.goto_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:653:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:653:55: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:654:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoto_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulegoto_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // InternalPascal.g:660:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:666:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:667:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:667:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:668:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
              		
            }
            // InternalPascal.g:672:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:673:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:673:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:674:5: lv_label_1_0= rulelabel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_label_1_0=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGoto_statementRule());
              					}
              					set(
              						current,
              						"label",
              						lv_label_1_0,
              						"org.xtext.example.pascal.Pascal.label");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRuleprocedure_statement"
    // InternalPascal.g:695:1: entryRuleprocedure_statement returns [EObject current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final EObject entryRuleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_statement = null;


        try {
            // InternalPascal.g:695:60: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascal.g:696:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_statement=ruleprocedure_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprocedure_statement"


    // $ANTLR start "ruleprocedure_statement"
    // InternalPascal.g:702:1: ruleprocedure_statement returns [EObject current=null] : ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) ;
    public final EObject ruleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_identifier_0_0 = null;

        EObject lv_actual_parameter_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:708:2: ( ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) )
            // InternalPascal.g:709:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            {
            // InternalPascal.g:709:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            // InternalPascal.g:710:3: ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            {
            // InternalPascal.g:710:3: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:711:4: (lv_procedure_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:711:4: (lv_procedure_identifier_0_0= ruleidentifier )
            // InternalPascal.g:712:5: lv_procedure_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedure_statementAccess().getProcedure_identifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_procedure_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_statementRule());
              					}
              					set(
              						current,
              						"procedure_identifier",
              						lv_procedure_identifier_0_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:729:3: ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:730:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    {
                    // InternalPascal.g:730:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    // InternalPascal.g:731:5: lv_actual_parameter_list_1_0= ruleactual_parameter_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcedure_statementAccess().getActual_parameter_listActual_parameter_listParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_actual_parameter_list_1_0=ruleactual_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcedure_statementRule());
                      					}
                      					set(
                      						current,
                      						"actual_parameter_list",
                      						lv_actual_parameter_list_1_0,
                      						"org.xtext.example.pascal.Pascal.actual_parameter_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprocedure_statement"


    // $ANTLR start "entryRuleactual_parameter_list"
    // InternalPascal.g:752:1: entryRuleactual_parameter_list returns [EObject current=null] : iv_ruleactual_parameter_list= ruleactual_parameter_list EOF ;
    public final EObject entryRuleactual_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter_list = null;


        try {
            // InternalPascal.g:752:62: (iv_ruleactual_parameter_list= ruleactual_parameter_list EOF )
            // InternalPascal.g:753:2: iv_ruleactual_parameter_list= ruleactual_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActual_parameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleactual_parameter_list=ruleactual_parameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleactual_parameter_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleactual_parameter_list"


    // $ANTLR start "ruleactual_parameter_list"
    // InternalPascal.g:759:1: ruleactual_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleactual_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actual_parameter_1_0 = null;

        EObject lv_actual_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:765:2: ( (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:766:2: (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:766:2: (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' )
            // InternalPascal.g:767:3: otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActual_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:771:3: ( (lv_actual_parameter_1_0= ruleactual_parameter ) )
            // InternalPascal.g:772:4: (lv_actual_parameter_1_0= ruleactual_parameter )
            {
            // InternalPascal.g:772:4: (lv_actual_parameter_1_0= ruleactual_parameter )
            // InternalPascal.g:773:5: lv_actual_parameter_1_0= ruleactual_parameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActual_parameter_listAccess().getActual_parameterActual_parameterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_actual_parameter_1_0=ruleactual_parameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActual_parameter_listRule());
              					}
              					add(
              						current,
              						"actual_parameter",
              						lv_actual_parameter_1_0,
              						"org.xtext.example.pascal.Pascal.actual_parameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:790:3: (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:791:4: otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getActual_parameter_listAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:795:4: ( (lv_actual_parameter_3_0= ruleactual_parameter ) )
            	    // InternalPascal.g:796:5: (lv_actual_parameter_3_0= ruleactual_parameter )
            	    {
            	    // InternalPascal.g:796:5: (lv_actual_parameter_3_0= ruleactual_parameter )
            	    // InternalPascal.g:797:6: lv_actual_parameter_3_0= ruleactual_parameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getActual_parameter_listAccess().getActual_parameterActual_parameterParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_actual_parameter_3_0=ruleactual_parameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getActual_parameter_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actual_parameter",
            	      							lv_actual_parameter_3_0,
            	      							"org.xtext.example.pascal.Pascal.actual_parameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getActual_parameter_listAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleactual_parameter_list"


    // $ANTLR start "entryRuleactual_parameter"
    // InternalPascal.g:823:1: entryRuleactual_parameter returns [EObject current=null] : iv_ruleactual_parameter= ruleactual_parameter EOF ;
    public final EObject entryRuleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter = null;


        try {
            // InternalPascal.g:823:57: (iv_ruleactual_parameter= ruleactual_parameter EOF )
            // InternalPascal.g:824:2: iv_ruleactual_parameter= ruleactual_parameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActual_parameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleactual_parameter=ruleactual_parameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleactual_parameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleactual_parameter"


    // $ANTLR start "ruleactual_parameter"
    // InternalPascal.g:830:1: ruleactual_parameter returns [EObject current=null] : ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) ) ;
    public final EObject ruleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject lv_actual_value_0_0 = null;

        EObject lv_actual_variable_1_0 = null;

        EObject lv_actual_procedure_2_0 = null;

        EObject lv_actual_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:836:2: ( ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) ) )
            // InternalPascal.g:837:2: ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) )
            {
            // InternalPascal.g:837:2: ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==13||(LA9_0>=35 && LA9_0<=37)||LA9_0==39||(LA9_0>=44 && LA9_0<=45)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (synpred11_InternalPascal()) ) {
                    alt9=1;
                }
                else if ( (synpred12_InternalPascal()) ) {
                    alt9=2;
                }
                else if ( (synpred13_InternalPascal()) ) {
                    alt9=3;
                }
                else if ( (true) ) {
                    alt9=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:838:3: ( (lv_actual_value_0_0= ruleactual_value ) )
                    {
                    // InternalPascal.g:838:3: ( (lv_actual_value_0_0= ruleactual_value ) )
                    // InternalPascal.g:839:4: (lv_actual_value_0_0= ruleactual_value )
                    {
                    // InternalPascal.g:839:4: (lv_actual_value_0_0= ruleactual_value )
                    // InternalPascal.g:840:5: lv_actual_value_0_0= ruleactual_value
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_valueActual_valueParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_actual_value_0_0=ruleactual_value();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActual_parameterRule());
                      					}
                      					set(
                      						current,
                      						"actual_value",
                      						lv_actual_value_0_0,
                      						"org.xtext.example.pascal.Pascal.actual_value");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:858:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
                    {
                    // InternalPascal.g:858:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
                    // InternalPascal.g:859:4: (lv_actual_variable_1_0= ruleactual_variable )
                    {
                    // InternalPascal.g:859:4: (lv_actual_variable_1_0= ruleactual_variable )
                    // InternalPascal.g:860:5: lv_actual_variable_1_0= ruleactual_variable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_variableActual_variableParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_actual_variable_1_0=ruleactual_variable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActual_parameterRule());
                      					}
                      					set(
                      						current,
                      						"actual_variable",
                      						lv_actual_variable_1_0,
                      						"org.xtext.example.pascal.Pascal.actual_variable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:878:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
                    {
                    // InternalPascal.g:878:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
                    // InternalPascal.g:879:4: (lv_actual_procedure_2_0= ruleactual_procedure )
                    {
                    // InternalPascal.g:879:4: (lv_actual_procedure_2_0= ruleactual_procedure )
                    // InternalPascal.g:880:5: lv_actual_procedure_2_0= ruleactual_procedure
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_procedureActual_procedureParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_actual_procedure_2_0=ruleactual_procedure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActual_parameterRule());
                      					}
                      					set(
                      						current,
                      						"actual_procedure",
                      						lv_actual_procedure_2_0,
                      						"org.xtext.example.pascal.Pascal.actual_procedure");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:898:3: ( (lv_actual_function_3_0= ruleactual_function ) )
                    {
                    // InternalPascal.g:898:3: ( (lv_actual_function_3_0= ruleactual_function ) )
                    // InternalPascal.g:899:4: (lv_actual_function_3_0= ruleactual_function )
                    {
                    // InternalPascal.g:899:4: (lv_actual_function_3_0= ruleactual_function )
                    // InternalPascal.g:900:5: lv_actual_function_3_0= ruleactual_function
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_functionActual_functionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_actual_function_3_0=ruleactual_function();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActual_parameterRule());
                      					}
                      					set(
                      						current,
                      						"actual_function",
                      						lv_actual_function_3_0,
                      						"org.xtext.example.pascal.Pascal.actual_function");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleactual_parameter"


    // $ANTLR start "entryRuleactual_function"
    // InternalPascal.g:921:1: entryRuleactual_function returns [EObject current=null] : iv_ruleactual_function= ruleactual_function EOF ;
    public final EObject entryRuleactual_function() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_function = null;


        try {
            // InternalPascal.g:921:56: (iv_ruleactual_function= ruleactual_function EOF )
            // InternalPascal.g:922:2: iv_ruleactual_function= ruleactual_function EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActual_functionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleactual_function=ruleactual_function();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleactual_function; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleactual_function"


    // $ANTLR start "ruleactual_function"
    // InternalPascal.g:928:1: ruleactual_function returns [EObject current=null] : ( (lv_function_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleactual_function() throws RecognitionException {
        EObject current = null;

        EObject lv_function_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:934:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:935:2: ( (lv_function_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:935:2: ( (lv_function_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:936:3: (lv_function_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:936:3: (lv_function_identifier_0_0= ruleidentifier )
            // InternalPascal.g:937:4: lv_function_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getActual_functionAccess().getFunction_identifierIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_function_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getActual_functionRule());
              				}
              				set(
              					current,
              					"function_identifier",
              					lv_function_identifier_0_0,
              					"org.xtext.example.pascal.Pascal.identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleactual_function"


    // $ANTLR start "entryRuleactual_procedure"
    // InternalPascal.g:957:1: entryRuleactual_procedure returns [EObject current=null] : iv_ruleactual_procedure= ruleactual_procedure EOF ;
    public final EObject entryRuleactual_procedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_procedure = null;


        try {
            // InternalPascal.g:957:57: (iv_ruleactual_procedure= ruleactual_procedure EOF )
            // InternalPascal.g:958:2: iv_ruleactual_procedure= ruleactual_procedure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActual_procedureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleactual_procedure=ruleactual_procedure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleactual_procedure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleactual_procedure"


    // $ANTLR start "ruleactual_procedure"
    // InternalPascal.g:964:1: ruleactual_procedure returns [EObject current=null] : ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleactual_procedure() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:970:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:971:2: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:971:2: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:972:3: (lv_procedure_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:972:3: (lv_procedure_identifier_0_0= ruleidentifier )
            // InternalPascal.g:973:4: lv_procedure_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getActual_procedureAccess().getProcedure_identifierIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_procedure_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getActual_procedureRule());
              				}
              				set(
              					current,
              					"procedure_identifier",
              					lv_procedure_identifier_0_0,
              					"org.xtext.example.pascal.Pascal.identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleactual_procedure"


    // $ANTLR start "entryRuleactual_variable"
    // InternalPascal.g:993:1: entryRuleactual_variable returns [EObject current=null] : iv_ruleactual_variable= ruleactual_variable EOF ;
    public final EObject entryRuleactual_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_variable = null;


        try {
            // InternalPascal.g:993:56: (iv_ruleactual_variable= ruleactual_variable EOF )
            // InternalPascal.g:994:2: iv_ruleactual_variable= ruleactual_variable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActual_variableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleactual_variable=ruleactual_variable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleactual_variable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleactual_variable"


    // $ANTLR start "ruleactual_variable"
    // InternalPascal.g:1000:1: ruleactual_variable returns [EObject current=null] : ( (lv_variable_0_0= rulevariable ) ) ;
    public final EObject ruleactual_variable() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1006:2: ( ( (lv_variable_0_0= rulevariable ) ) )
            // InternalPascal.g:1007:2: ( (lv_variable_0_0= rulevariable ) )
            {
            // InternalPascal.g:1007:2: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:1008:3: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:1008:3: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:1009:4: lv_variable_0_0= rulevariable
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getActual_variableAccess().getVariableVariableParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_variable_0_0=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getActual_variableRule());
              				}
              				set(
              					current,
              					"variable",
              					lv_variable_0_0,
              					"org.xtext.example.pascal.Pascal.variable");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleactual_variable"


    // $ANTLR start "entryRuleactual_value"
    // InternalPascal.g:1029:1: entryRuleactual_value returns [EObject current=null] : iv_ruleactual_value= ruleactual_value EOF ;
    public final EObject entryRuleactual_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_value = null;


        try {
            // InternalPascal.g:1029:53: (iv_ruleactual_value= ruleactual_value EOF )
            // InternalPascal.g:1030:2: iv_ruleactual_value= ruleactual_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActual_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleactual_value=ruleactual_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleactual_value; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleactual_value"


    // $ANTLR start "ruleactual_value"
    // InternalPascal.g:1036:1: ruleactual_value returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleactual_value() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1042:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:1043:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:1043:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:1044:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:1044:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:1045:4: lv_expression_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getActual_valueAccess().getExpressionExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getActual_valueRule());
              				}
              				set(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.xtext.example.pascal.Pascal.expression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleactual_value"


    // $ANTLR start "entryRuleidentifier"
    // InternalPascal.g:1065:1: entryRuleidentifier returns [EObject current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final EObject entryRuleidentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier = null;


        try {
            // InternalPascal.g:1065:51: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascal.g:1066:2: iv_ruleidentifier= ruleidentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalPascal.g:1072:1: ruleidentifier returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleidentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1078:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalPascal.g:1079:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalPascal.g:1079:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:1080:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:1080:3: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:1081:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_identifier_0_0, grammarAccess.getIdentifierAccess().getIdentifierIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIdentifierRule());
              				}
              				setWithLastConsumed(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:1100:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:1100:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:1101:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:1107:1: ruleassignment_statement returns [EObject current=null] : ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_0_0 = null;

        EObject lv_function_identifier_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1113:2: ( ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:1114:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:1114:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:1115:3: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) )
            {
            // InternalPascal.g:1115:3: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred14_InternalPascal()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1116:4: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1116:4: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1117:5: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1117:5: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1118:6: lv_variable_0_0= rulevariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_0_0,
                      							"org.xtext.example.pascal.Pascal.variable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1136:4: ( (lv_function_identifier_1_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1136:4: ( (lv_function_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:1137:5: (lv_function_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:1137:5: (lv_function_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:1138:6: lv_function_identifier_1_0= ruleidentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignment_statementAccess().getFunction_identifierIdentifierParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_function_identifier_1_0=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
                      						}
                      						set(
                      							current,
                      							"function_identifier",
                      							lv_function_identifier_1_0,
                      							"org.xtext.example.pascal.Pascal.identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:1160:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:1161:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:1161:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:1162:5: lv_expression_3_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:1183:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1183:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1184:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:1190:1: ruleexpression returns [EObject current=null] : ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_relational_operator_1_0 = null;

        EObject lv_simple_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1196:2: ( ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1197:2: ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1197:2: ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1198:3: ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1198:3: ( (lv_simple_expression_0_0= rulesimple_expression ) )
            // InternalPascal.g:1199:4: (lv_simple_expression_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1199:4: (lv_simple_expression_0_0= rulesimple_expression )
            // InternalPascal.g:1200:5: lv_simple_expression_0_0= rulesimple_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionSimple_expressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_simple_expression_0_0=rulesimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					add(
              						current,
              						"simple_expression",
              						lv_simple_expression_0_0,
              						"org.xtext.example.pascal.Pascal.simple_expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1217:3: ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=28)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1218:4: ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1218:4: ( (lv_relational_operator_1_0= rulerelational_operator ) )
                    // InternalPascal.g:1219:5: (lv_relational_operator_1_0= rulerelational_operator )
                    {
                    // InternalPascal.g:1219:5: (lv_relational_operator_1_0= rulerelational_operator )
                    // InternalPascal.g:1220:6: lv_relational_operator_1_0= rulerelational_operator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getRelational_operatorRelational_operatorParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_relational_operator_1_0=rulerelational_operator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"relational_operator",
                      							lv_relational_operator_1_0,
                      							"org.xtext.example.pascal.Pascal.relational_operator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPascal.g:1237:4: ( (lv_simple_expression_2_0= rulesimple_expression ) )
                    // InternalPascal.g:1238:5: (lv_simple_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1238:5: (lv_simple_expression_2_0= rulesimple_expression )
                    // InternalPascal.g:1239:6: lv_simple_expression_2_0= rulesimple_expression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionSimple_expressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_simple_expression_2_0=rulesimple_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						add(
                      							current,
                      							"simple_expression",
                      							lv_simple_expression_2_0,
                      							"org.xtext.example.pascal.Pascal.simple_expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulerelational_operator"
    // InternalPascal.g:1261:1: entryRulerelational_operator returns [String current=null] : iv_rulerelational_operator= rulerelational_operator EOF ;
    public final String entryRulerelational_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_operator = null;


        try {
            // InternalPascal.g:1261:59: (iv_rulerelational_operator= rulerelational_operator EOF )
            // InternalPascal.g:1262:2: iv_rulerelational_operator= rulerelational_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelational_operatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerelational_operator=rulerelational_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelational_operator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerelational_operator"


    // $ANTLR start "rulerelational_operator"
    // InternalPascal.g:1268:1: rulerelational_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken rulerelational_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1274:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) )
            // InternalPascal.g:1275:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            {
            // InternalPascal.g:1275:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 27:
                {
                alt12=6;
                }
                break;
            case 28:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1276:3: kw= '='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1282:3: kw= '<>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1288:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1294:3: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1300:3: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1306:3: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getGreaterThanSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPascal.g:1312:3: kw= 'in'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getInKeyword_6());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerelational_operator"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:1321:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1321:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1322:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:1328:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_term_1_0 = null;

        AntlrDatatypeRuleToken lv_addition_operator_2_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1334:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* ) )
            // InternalPascal.g:1335:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* )
            {
            // InternalPascal.g:1335:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* )
            // InternalPascal.g:1336:3: ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )*
            {
            // InternalPascal.g:1336:3: ( (lv_sign_0_0= rulesign ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred22_InternalPascal()) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==45) ) {
                int LA13_2 = input.LA(2);

                if ( (synpred22_InternalPascal()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1337:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:1337:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:1338:5: lv_sign_0_0= rulesign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_expressionAccess().getSignSignParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_sign_0_0=rulesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
                      					}
                      					set(
                      						current,
                      						"sign",
                      						lv_sign_0_0,
                      						"org.xtext.example.pascal.Pascal.sign");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:1355:3: ( (lv_term_1_0= ruleterm ) )
            // InternalPascal.g:1356:4: (lv_term_1_0= ruleterm )
            {
            // InternalPascal.g:1356:4: (lv_term_1_0= ruleterm )
            // InternalPascal.g:1357:5: lv_term_1_0= ruleterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermTermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_term_1_0=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
              					}
              					add(
              						current,
              						"term",
              						lv_term_1_0,
              						"org.xtext.example.pascal.Pascal.term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1374:3: ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29||(LA14_0>=44 && LA14_0<=45)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1375:4: ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1375:4: ( (lv_addition_operator_2_0= ruleaddition_operator ) )
            	    // InternalPascal.g:1376:5: (lv_addition_operator_2_0= ruleaddition_operator )
            	    {
            	    // InternalPascal.g:1376:5: (lv_addition_operator_2_0= ruleaddition_operator )
            	    // InternalPascal.g:1377:6: lv_addition_operator_2_0= ruleaddition_operator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimple_expressionAccess().getAddition_operatorAddition_operatorParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_addition_operator_2_0=ruleaddition_operator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"addition_operator",
            	      							lv_addition_operator_2_0,
            	      							"org.xtext.example.pascal.Pascal.addition_operator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalPascal.g:1394:4: ( (lv_term_3_0= ruleterm ) )
            	    // InternalPascal.g:1395:5: (lv_term_3_0= ruleterm )
            	    {
            	    // InternalPascal.g:1395:5: (lv_term_3_0= ruleterm )
            	    // InternalPascal.g:1396:6: lv_term_3_0= ruleterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermTermParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_term_3_0=ruleterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"term",
            	      							lv_term_3_0,
            	      							"org.xtext.example.pascal.Pascal.term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleaddition_operator"
    // InternalPascal.g:1418:1: entryRuleaddition_operator returns [String current=null] : iv_ruleaddition_operator= ruleaddition_operator EOF ;
    public final String entryRuleaddition_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaddition_operator = null;


        try {
            // InternalPascal.g:1418:57: (iv_ruleaddition_operator= ruleaddition_operator EOF )
            // InternalPascal.g:1419:2: iv_ruleaddition_operator= ruleaddition_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddition_operatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleaddition_operator=ruleaddition_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaddition_operator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleaddition_operator"


    // $ANTLR start "ruleaddition_operator"
    // InternalPascal.g:1425:1: ruleaddition_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_sign_0= rulesign | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleaddition_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_sign_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1431:2: ( (this_sign_0= rulesign | kw= 'or' ) )
            // InternalPascal.g:1432:2: (this_sign_0= rulesign | kw= 'or' )
            {
            // InternalPascal.g:1432:2: (this_sign_0= rulesign | kw= 'or' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=44 && LA15_0<=45)) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1433:3: this_sign_0= rulesign
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAddition_operatorAccess().getSignParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_sign_0=rulesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_sign_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1444:3: kw= 'or'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAddition_operatorAccess().getOrKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleaddition_operator"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:1453:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1453:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1454:2: iv_ruleterm= ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:1460:1: ruleterm returns [EObject current=null] : ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factor_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplication_operator_1_0 = null;

        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1466:2: ( ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1467:2: ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1467:2: ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* )
            // InternalPascal.g:1468:3: ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1468:3: ( (lv_factor_0_0= rulefactor ) )
            // InternalPascal.g:1469:4: (lv_factor_0_0= rulefactor )
            {
            // InternalPascal.g:1469:4: (lv_factor_0_0= rulefactor )
            // InternalPascal.g:1470:5: lv_factor_0_0= rulefactor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getFactorFactorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_factor_0_0=rulefactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					add(
              						current,
              						"factor",
              						lv_factor_0_0,
              						"org.xtext.example.pascal.Pascal.factor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1487:3: ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1488:4: ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1488:4: ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) )
            	    // InternalPascal.g:1489:5: (lv_multiplication_operator_1_0= rulemultiplication_operator )
            	    {
            	    // InternalPascal.g:1489:5: (lv_multiplication_operator_1_0= rulemultiplication_operator )
            	    // InternalPascal.g:1490:6: lv_multiplication_operator_1_0= rulemultiplication_operator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermAccess().getMultiplication_operatorMultiplication_operatorParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_multiplication_operator_1_0=rulemultiplication_operator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"multiplication_operator",
            	      							lv_multiplication_operator_1_0,
            	      							"org.xtext.example.pascal.Pascal.multiplication_operator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalPascal.g:1507:4: ( (lv_factor_2_0= rulefactor ) )
            	    // InternalPascal.g:1508:5: (lv_factor_2_0= rulefactor )
            	    {
            	    // InternalPascal.g:1508:5: (lv_factor_2_0= rulefactor )
            	    // InternalPascal.g:1509:6: lv_factor_2_0= rulefactor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermAccess().getFactorFactorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_factor_2_0=rulefactor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"factor",
            	      							lv_factor_2_0,
            	      							"org.xtext.example.pascal.Pascal.factor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulemultiplication_operator"
    // InternalPascal.g:1531:1: entryRulemultiplication_operator returns [String current=null] : iv_rulemultiplication_operator= rulemultiplication_operator EOF ;
    public final String entryRulemultiplication_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplication_operator = null;


        try {
            // InternalPascal.g:1531:63: (iv_rulemultiplication_operator= rulemultiplication_operator EOF )
            // InternalPascal.g:1532:2: iv_rulemultiplication_operator= rulemultiplication_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplication_operatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemultiplication_operator=rulemultiplication_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplication_operator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulemultiplication_operator"


    // $ANTLR start "rulemultiplication_operator"
    // InternalPascal.g:1538:1: rulemultiplication_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken rulemultiplication_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1544:2: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) )
            // InternalPascal.g:1545:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            {
            // InternalPascal.g:1545:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case 33:
                {
                alt17=4;
                }
                break;
            case 34:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1546:3: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1552:3: kw= '/'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1558:3: kw= 'div'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getDivKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1564:3: kw= 'mod'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getModKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1570:3: kw= 'and'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getAndKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulemultiplication_operator"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:1579:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1579:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1580:2: iv_rulefactor= rulefactor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefactor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:1586:1: rulefactor returns [EObject current=null] : ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_strings_3_0 = null;

        EObject lv_set_4_0 = null;

        EObject lv_identifier_6_0 = null;

        EObject lv_function_designator_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_factor_12_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1592:2: ( ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1593:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1593:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1594:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
                    {
                    // InternalPascal.g:1594:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
                    // InternalPascal.g:1595:4: () ( (lv_variable_1_0= rulevariable ) )
                    {
                    // InternalPascal.g:1595:4: ()
                    // InternalPascal.g:1596:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFactorAccess().getFactorAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPascal.g:1605:4: ( (lv_variable_1_0= rulevariable ) )
                    // InternalPascal.g:1606:5: (lv_variable_1_0= rulevariable )
                    {
                    // InternalPascal.g:1606:5: (lv_variable_1_0= rulevariable )
                    // InternalPascal.g:1607:6: lv_variable_1_0= rulevariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_1_0,
                      							"org.xtext.example.pascal.Pascal.variable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1626:3: ( (lv_number_2_0= rulenumber ) )
                    {
                    // InternalPascal.g:1626:3: ( (lv_number_2_0= rulenumber ) )
                    // InternalPascal.g:1627:4: (lv_number_2_0= rulenumber )
                    {
                    // InternalPascal.g:1627:4: (lv_number_2_0= rulenumber )
                    // InternalPascal.g:1628:5: lv_number_2_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_number_2_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"number",
                      						lv_number_2_0,
                      						"org.xtext.example.pascal.Pascal.number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1646:3: ( (lv_strings_3_0= rulestrings ) )
                    {
                    // InternalPascal.g:1646:3: ( (lv_strings_3_0= rulestrings ) )
                    // InternalPascal.g:1647:4: (lv_strings_3_0= rulestrings )
                    {
                    // InternalPascal.g:1647:4: (lv_strings_3_0= rulestrings )
                    // InternalPascal.g:1648:5: lv_strings_3_0= rulestrings
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getStringsStringsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_strings_3_0=rulestrings();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"strings",
                      						lv_strings_3_0,
                      						"org.xtext.example.pascal.Pascal.strings");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1666:3: ( (lv_set_4_0= ruleset ) )
                    {
                    // InternalPascal.g:1666:3: ( (lv_set_4_0= ruleset ) )
                    // InternalPascal.g:1667:4: (lv_set_4_0= ruleset )
                    {
                    // InternalPascal.g:1667:4: (lv_set_4_0= ruleset )
                    // InternalPascal.g:1668:5: lv_set_4_0= ruleset
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_set_4_0=ruleset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"set",
                      						lv_set_4_0,
                      						"org.xtext.example.pascal.Pascal.set");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1686:3: otherlv_5= 'nil'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getNilKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1691:3: ( (lv_identifier_6_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1691:3: ( (lv_identifier_6_0= ruleidentifier ) )
                    // InternalPascal.g:1692:4: (lv_identifier_6_0= ruleidentifier )
                    {
                    // InternalPascal.g:1692:4: (lv_identifier_6_0= ruleidentifier )
                    // InternalPascal.g:1693:5: lv_identifier_6_0= ruleidentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getIdentifierIdentifierParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_identifier_6_0=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"identifier",
                      						lv_identifier_6_0,
                      						"org.xtext.example.pascal.Pascal.identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1711:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1711:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1712:4: (lv_function_designator_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1712:4: (lv_function_designator_7_0= rulefunction_designator )
                    // InternalPascal.g:1713:5: lv_function_designator_7_0= rulefunction_designator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorFunction_designatorParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_designator_7_0=rulefunction_designator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"function_designator",
                      						lv_function_designator_7_0,
                      						"org.xtext.example.pascal.Pascal.function_designator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1731:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1731:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1732:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalPascal.g:1736:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1737:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1737:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1738:6: lv_expression_9_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"org.xtext.example.pascal.Pascal.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1761:3: (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1761:3: (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) )
                    // InternalPascal.g:1762:4: otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_8_0());
                      			
                    }
                    // InternalPascal.g:1766:4: ( (lv_factor_12_0= rulefactor ) )
                    // InternalPascal.g:1767:5: (lv_factor_12_0= rulefactor )
                    {
                    // InternalPascal.g:1767:5: (lv_factor_12_0= rulefactor )
                    // InternalPascal.g:1768:6: lv_factor_12_0= rulefactor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_factor_12_0=rulefactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"factor",
                      							lv_factor_12_0,
                      							"org.xtext.example.pascal.Pascal.factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:1790:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1790:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1791:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_designator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:1797:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject lv_function_identifier_0_0 = null;

        EObject lv_actual_parameter_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1803:2: ( ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) )
            // InternalPascal.g:1804:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            {
            // InternalPascal.g:1804:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            // InternalPascal.g:1805:3: ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            {
            // InternalPascal.g:1805:3: ( (lv_function_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1806:4: (lv_function_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1806:4: (lv_function_identifier_0_0= ruleidentifier )
            // InternalPascal.g:1807:5: lv_function_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_designatorAccess().getFunction_identifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_function_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
              					}
              					set(
              						current,
              						"function_identifier",
              						lv_function_identifier_0_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1824:3: ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1825:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    {
                    // InternalPascal.g:1825:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    // InternalPascal.g:1826:5: lv_actual_parameter_list_1_0= ruleactual_parameter_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunction_designatorAccess().getActual_parameter_listActual_parameter_listParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_actual_parameter_list_1_0=ruleactual_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                      					}
                      					set(
                      						current,
                      						"actual_parameter_list",
                      						lv_actual_parameter_list_1_0,
                      						"org.xtext.example.pascal.Pascal.actual_parameter_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:1847:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1847:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1848:2: iv_ruleset= ruleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleset; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:1854:1: ruleset returns [EObject current=null] : (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1860:2: ( (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' ) )
            // InternalPascal.g:1861:2: (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' )
            {
            // InternalPascal.g:1861:2: (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' )
            // InternalPascal.g:1862:3: otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalPascal.g:1866:3: ( (lv_element_list_1_0= ruleelement_list ) )
            // InternalPascal.g:1867:4: (lv_element_list_1_0= ruleelement_list )
            {
            // InternalPascal.g:1867:4: (lv_element_list_1_0= ruleelement_list )
            // InternalPascal.g:1868:5: lv_element_list_1_0= ruleelement_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetAccess().getElement_listElement_listParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_element_list_1_0=ruleelement_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetRule());
              					}
              					set(
              						current,
              						"element_list",
              						lv_element_list_1_0,
              						"org.xtext.example.pascal.Pascal.element_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRuleelement_list"
    // InternalPascal.g:1893:1: entryRuleelement_list returns [EObject current=null] : iv_ruleelement_list= ruleelement_list EOF ;
    public final EObject entryRuleelement_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_list = null;


        try {
            // InternalPascal.g:1893:53: (iv_ruleelement_list= ruleelement_list EOF )
            // InternalPascal.g:1894:2: iv_ruleelement_list= ruleelement_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElement_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleelement_list=ruleelement_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleelement_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleelement_list"


    // $ANTLR start "ruleelement_list"
    // InternalPascal.g:1900:1: ruleelement_list returns [EObject current=null] : ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? ) ;
    public final EObject ruleelement_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1906:2: ( ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? ) )
            // InternalPascal.g:1907:2: ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? )
            {
            // InternalPascal.g:1907:2: ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? )
            // InternalPascal.g:1908:3: () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )?
            {
            // InternalPascal.g:1908:3: ()
            // InternalPascal.g:1909:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElement_listAccess().getElement_listAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:1918:3: ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==13||(LA21_0>=35 && LA21_0<=37)||LA21_0==39||(LA21_0>=44 && LA21_0<=45)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1919:4: ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )*
                    {
                    // InternalPascal.g:1919:4: ( (lv_expression_1_0= ruleexpression ) )
                    // InternalPascal.g:1920:5: (lv_expression_1_0= ruleexpression )
                    {
                    // InternalPascal.g:1920:5: (lv_expression_1_0= ruleexpression )
                    // InternalPascal.g:1921:6: lv_expression_1_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElement_listAccess().getExpressionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_expression_1_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getElement_listRule());
                      						}
                      						add(
                      							current,
                      							"expression",
                      							lv_expression_1_0,
                      							"org.xtext.example.pascal.Pascal.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPascal.g:1938:4: (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalPascal.g:1939:5: otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getElement_listAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPascal.g:1943:5: ( (lv_expression_3_0= ruleexpression ) )
                    	    // InternalPascal.g:1944:6: (lv_expression_3_0= ruleexpression )
                    	    {
                    	    // InternalPascal.g:1944:6: (lv_expression_3_0= ruleexpression )
                    	    // InternalPascal.g:1945:7: lv_expression_3_0= ruleexpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getElement_listAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_expression_3_0=ruleexpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getElement_listRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"expression",
                    	      								lv_expression_3_0,
                    	      								"org.xtext.example.pascal.Pascal.expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleelement_list"


    // $ANTLR start "entryRulestrings"
    // InternalPascal.g:1968:1: entryRulestrings returns [EObject current=null] : iv_rulestrings= rulestrings EOF ;
    public final EObject entryRulestrings() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestrings = null;


        try {
            // InternalPascal.g:1968:48: (iv_rulestrings= rulestrings EOF )
            // InternalPascal.g:1969:2: iv_rulestrings= rulestrings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestrings=rulestrings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestrings; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestrings"


    // $ANTLR start "rulestrings"
    // InternalPascal.g:1975:1: rulestrings returns [EObject current=null] : (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' ) ;
    public final EObject rulestrings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_string_character_1_0 = null;

        EObject lv_string_character_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1981:2: ( (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' ) )
            // InternalPascal.g:1982:2: (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' )
            {
            // InternalPascal.g:1982:2: (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' )
            // InternalPascal.g:1983:3: otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\''
            {
            otherlv_0=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringsAccess().getApostropheKeyword_0());
              		
            }
            // InternalPascal.g:1987:3: ( (lv_string_character_1_0= rulestring_character ) )
            // InternalPascal.g:1988:4: (lv_string_character_1_0= rulestring_character )
            {
            // InternalPascal.g:1988:4: (lv_string_character_1_0= rulestring_character )
            // InternalPascal.g:1989:5: lv_string_character_1_0= rulestring_character
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringsAccess().getString_characterString_characterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_string_character_1_0=rulestring_character();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringsRule());
              					}
              					add(
              						current,
              						"string_character",
              						lv_string_character_1_0,
              						"org.xtext.example.pascal.Pascal.string_character");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:2006:3: ( (lv_string_character_2_0= rulestring_character ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40||LA22_0==70) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:2007:4: (lv_string_character_2_0= rulestring_character )
            	    {
            	    // InternalPascal.g:2007:4: (lv_string_character_2_0= rulestring_character )
            	    // InternalPascal.g:2008:5: lv_string_character_2_0= rulestring_character
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStringsAccess().getString_characterString_characterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_string_character_2_0=rulestring_character();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStringsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"string_character",
            	      						lv_string_character_2_0,
            	      						"org.xtext.example.pascal.Pascal.string_character");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStringsAccess().getApostropheKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestrings"


    // $ANTLR start "entryRulestring_character"
    // InternalPascal.g:2033:1: entryRulestring_character returns [EObject current=null] : iv_rulestring_character= rulestring_character EOF ;
    public final EObject entryRulestring_character() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring_character = null;


        try {
            // InternalPascal.g:2033:57: (iv_rulestring_character= rulestring_character EOF )
            // InternalPascal.g:2034:2: iv_rulestring_character= rulestring_character EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString_characterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestring_character=rulestring_character();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestring_character; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestring_character"


    // $ANTLR start "rulestring_character"
    // InternalPascal.g:2040:1: rulestring_character returns [EObject current=null] : ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' ) ;
    public final EObject rulestring_character() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_any_character_except_quote_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2046:2: ( ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' ) )
            // InternalPascal.g:2047:2: ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' )
            {
            // InternalPascal.g:2047:2: ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==70) ) {
                alt23=1;
            }
            else if ( (LA23_0==40) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2048:3: ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) )
                    {
                    // InternalPascal.g:2048:3: ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) )
                    // InternalPascal.g:2049:4: () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) )
                    {
                    // InternalPascal.g:2049:4: ()
                    // InternalPascal.g:2050:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getString_characterAccess().getString_characterAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPascal.g:2059:4: ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) )
                    // InternalPascal.g:2060:5: (lv_any_character_except_quote_1_0= ruleany_character_except_quote )
                    {
                    // InternalPascal.g:2060:5: (lv_any_character_except_quote_1_0= ruleany_character_except_quote )
                    // InternalPascal.g:2061:6: lv_any_character_except_quote_1_0= ruleany_character_except_quote
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getString_characterAccess().getAny_character_except_quoteAny_character_except_quoteParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_any_character_except_quote_1_0=ruleany_character_except_quote();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getString_characterRule());
                      						}
                      						set(
                      							current,
                      							"any_character_except_quote",
                      							lv_any_character_except_quote_1_0,
                      							"org.xtext.example.pascal.Pascal.any_character_except_quote");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2080:3: otherlv_2= '\\'\\''
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getString_characterAccess().getApostropheApostropheKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestring_character"


    // $ANTLR start "entryRuleany_character_except_quote"
    // InternalPascal.g:2088:1: entryRuleany_character_except_quote returns [EObject current=null] : iv_ruleany_character_except_quote= ruleany_character_except_quote EOF ;
    public final EObject entryRuleany_character_except_quote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_character_except_quote = null;


        try {
            // InternalPascal.g:2088:67: (iv_ruleany_character_except_quote= ruleany_character_except_quote EOF )
            // InternalPascal.g:2089:2: iv_ruleany_character_except_quote= ruleany_character_except_quote EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAny_character_except_quoteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleany_character_except_quote=ruleany_character_except_quote();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleany_character_except_quote; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleany_character_except_quote"


    // $ANTLR start "ruleany_character_except_quote"
    // InternalPascal.g:2095:1: ruleany_character_except_quote returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject ruleany_character_except_quote() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2101:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:2102:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:2102:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:2103:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:2103:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:2104:4: lv_procedure_heading_0_0= ruleprocedure_heading
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAny_character_except_quoteAccess().getProcedure_headingProcedure_headingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_procedure_heading_0_0=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAny_character_except_quoteRule());
              				}
              				set(
              					current,
              					"procedure_heading",
              					lv_procedure_heading_0_0,
              					"org.xtext.example.pascal.Pascal.procedure_heading");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleany_character_except_quote"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:2124:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2124:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2125:2: iv_rulenumber= rulenumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:2131:1: rulenumber returns [EObject current=null] : ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_integer_number_0_0 = null;

        EObject lv_real_number_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2137:2: ( ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) ) )
            // InternalPascal.g:2138:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) )
            {
            // InternalPascal.g:2138:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) )
            int alt24=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_INT) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==11||(LA24_3>=41 && LA24_3<=42)) ) {
                        alt24=2;
                    }
                    else if ( (LA24_3==EOF||(LA24_3>=14 && LA24_3<=16)||(LA24_3>=18 && LA24_3<=19)||(LA24_3>=22 && LA24_3<=34)||LA24_3==38||(LA24_3>=44 && LA24_3<=45)||LA24_3==47||LA24_3==49||(LA24_3>=51 && LA24_3<=52)||(LA24_3>=54 && LA24_3<=55)||LA24_3==57||LA24_3==67) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==RULE_INT) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==11||(LA24_3>=41 && LA24_3<=42)) ) {
                        alt24=2;
                    }
                    else if ( (LA24_3==EOF||(LA24_3>=14 && LA24_3<=16)||(LA24_3>=18 && LA24_3<=19)||(LA24_3>=22 && LA24_3<=34)||LA24_3==38||(LA24_3>=44 && LA24_3<=45)||LA24_3==47||LA24_3==49||(LA24_3>=51 && LA24_3<=52)||(LA24_3>=54 && LA24_3<=55)||LA24_3==57||LA24_3==67) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==11||(LA24_3>=41 && LA24_3<=42)) ) {
                    alt24=2;
                }
                else if ( (LA24_3==EOF||(LA24_3>=14 && LA24_3<=16)||(LA24_3>=18 && LA24_3<=19)||(LA24_3>=22 && LA24_3<=34)||LA24_3==38||(LA24_3>=44 && LA24_3<=45)||LA24_3==47||LA24_3==49||(LA24_3>=51 && LA24_3<=52)||(LA24_3>=54 && LA24_3<=55)||LA24_3==57||LA24_3==67) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2139:3: ( (lv_integer_number_0_0= ruleinteger_number ) )
                    {
                    // InternalPascal.g:2139:3: ( (lv_integer_number_0_0= ruleinteger_number ) )
                    // InternalPascal.g:2140:4: (lv_integer_number_0_0= ruleinteger_number )
                    {
                    // InternalPascal.g:2140:4: (lv_integer_number_0_0= ruleinteger_number )
                    // InternalPascal.g:2141:5: lv_integer_number_0_0= ruleinteger_number
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumberAccess().getInteger_numberInteger_numberParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_integer_number_0_0=ruleinteger_number();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumberRule());
                      					}
                      					set(
                      						current,
                      						"integer_number",
                      						lv_integer_number_0_0,
                      						"org.xtext.example.pascal.Pascal.integer_number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2159:3: ( (lv_real_number_1_0= rulereal_number ) )
                    {
                    // InternalPascal.g:2159:3: ( (lv_real_number_1_0= rulereal_number ) )
                    // InternalPascal.g:2160:4: (lv_real_number_1_0= rulereal_number )
                    {
                    // InternalPascal.g:2160:4: (lv_real_number_1_0= rulereal_number )
                    // InternalPascal.g:2161:5: lv_real_number_1_0= rulereal_number
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumberAccess().getReal_numberReal_numberParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_real_number_1_0=rulereal_number();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumberRule());
                      					}
                      					set(
                      						current,
                      						"real_number",
                      						lv_real_number_1_0,
                      						"org.xtext.example.pascal.Pascal.real_number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRulereal_number"
    // InternalPascal.g:2182:1: entryRulereal_number returns [EObject current=null] : iv_rulereal_number= rulereal_number EOF ;
    public final EObject entryRulereal_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_number = null;


        try {
            // InternalPascal.g:2182:52: (iv_rulereal_number= rulereal_number EOF )
            // InternalPascal.g:2183:2: iv_rulereal_number= rulereal_number EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReal_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulereal_number=rulereal_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereal_number; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulereal_number"


    // $ANTLR start "rulereal_number"
    // InternalPascal.g:2189:1: rulereal_number returns [EObject current=null] : ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) ) ;
    public final EObject rulereal_number() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_digit_sequence_0_0 = null;

        EObject lv_digit_sequence2_2_0 = null;

        EObject lv_scale_factor_3_0 = null;

        EObject lv_digit_sequence_4_0 = null;

        EObject lv_scale_factor_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2195:2: ( ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) ) )
            // InternalPascal.g:2196:2: ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) )
            {
            // InternalPascal.g:2196:2: ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_INT) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==11) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_3>=41 && LA27_3<=42)) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_INT) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==11) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_3>=41 && LA27_3<=42)) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==11) ) {
                    alt27=1;
                }
                else if ( ((LA27_3>=41 && LA27_3<=42)) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2197:3: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? )
                    {
                    // InternalPascal.g:2197:3: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? )
                    // InternalPascal.g:2198:4: ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )?
                    {
                    // InternalPascal.g:2198:4: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
                    // InternalPascal.g:2199:5: (lv_digit_sequence_0_0= ruledigit_sequence )
                    {
                    // InternalPascal.g:2199:5: (lv_digit_sequence_0_0= ruledigit_sequence )
                    // InternalPascal.g:2200:6: lv_digit_sequence_0_0= ruledigit_sequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceDigit_sequenceParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_digit_sequence_0_0=ruledigit_sequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReal_numberRule());
                      						}
                      						set(
                      							current,
                      							"digit_sequence",
                      							lv_digit_sequence_0_0,
                      							"org.xtext.example.pascal.Pascal.digit_sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReal_numberAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalPascal.g:2221:4: ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )?
                    int alt25=2;
                    switch ( input.LA(1) ) {
                        case 44:
                            {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1==RULE_INT) ) {
                                int LA25_5 = input.LA(3);

                                if ( (synpred44_InternalPascal()) ) {
                                    alt25=1;
                                }
                            }
                            }
                            break;
                        case 45:
                            {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==RULE_INT) ) {
                                int LA25_5 = input.LA(3);

                                if ( (synpred44_InternalPascal()) ) {
                                    alt25=1;
                                }
                            }
                            }
                            break;
                        case RULE_INT:
                            {
                            alt25=1;
                            }
                            break;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalPascal.g:2222:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
                            {
                            // InternalPascal.g:2222:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
                            // InternalPascal.g:2223:6: lv_digit_sequence2_2_0= ruledigit_sequence
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequence2Digit_sequenceParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FOLLOW_27);
                            lv_digit_sequence2_2_0=ruledigit_sequence();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getReal_numberRule());
                              						}
                              						set(
                              							current,
                              							"digit_sequence2",
                              							lv_digit_sequence2_2_0,
                              							"org.xtext.example.pascal.Pascal.digit_sequence");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPascal.g:2240:4: ( (lv_scale_factor_3_0= rulescale_factor ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalPascal.g:2241:5: (lv_scale_factor_3_0= rulescale_factor )
                            {
                            // InternalPascal.g:2241:5: (lv_scale_factor_3_0= rulescale_factor )
                            // InternalPascal.g:2242:6: lv_scale_factor_3_0= rulescale_factor
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getReal_numberAccess().getScale_factorScale_factorParserRuleCall_0_3_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_scale_factor_3_0=rulescale_factor();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getReal_numberRule());
                              						}
                              						set(
                              							current,
                              							"scale_factor",
                              							lv_scale_factor_3_0,
                              							"org.xtext.example.pascal.Pascal.scale_factor");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2261:3: ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) )
                    {
                    // InternalPascal.g:2261:3: ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) )
                    // InternalPascal.g:2262:4: ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) )
                    {
                    // InternalPascal.g:2262:4: ( (lv_digit_sequence_4_0= ruledigit_sequence ) )
                    // InternalPascal.g:2263:5: (lv_digit_sequence_4_0= ruledigit_sequence )
                    {
                    // InternalPascal.g:2263:5: (lv_digit_sequence_4_0= ruledigit_sequence )
                    // InternalPascal.g:2264:6: lv_digit_sequence_4_0= ruledigit_sequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceDigit_sequenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_digit_sequence_4_0=ruledigit_sequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReal_numberRule());
                      						}
                      						set(
                      							current,
                      							"digit_sequence",
                      							lv_digit_sequence_4_0,
                      							"org.xtext.example.pascal.Pascal.digit_sequence");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPascal.g:2281:4: ( (lv_scale_factor_5_0= rulescale_factor ) )
                    // InternalPascal.g:2282:5: (lv_scale_factor_5_0= rulescale_factor )
                    {
                    // InternalPascal.g:2282:5: (lv_scale_factor_5_0= rulescale_factor )
                    // InternalPascal.g:2283:6: lv_scale_factor_5_0= rulescale_factor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReal_numberAccess().getScale_factorScale_factorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_scale_factor_5_0=rulescale_factor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReal_numberRule());
                      						}
                      						set(
                      							current,
                      							"scale_factor",
                      							lv_scale_factor_5_0,
                      							"org.xtext.example.pascal.Pascal.scale_factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulereal_number"


    // $ANTLR start "entryRulescale_factor"
    // InternalPascal.g:2305:1: entryRulescale_factor returns [EObject current=null] : iv_rulescale_factor= rulescale_factor EOF ;
    public final EObject entryRulescale_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescale_factor = null;


        try {
            // InternalPascal.g:2305:53: (iv_rulescale_factor= rulescale_factor EOF )
            // InternalPascal.g:2306:2: iv_rulescale_factor= rulescale_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScale_factorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulescale_factor=rulescale_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulescale_factor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulescale_factor"


    // $ANTLR start "rulescale_factor"
    // InternalPascal.g:2312:1: rulescale_factor returns [EObject current=null] : ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) ;
    public final EObject rulescale_factor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sign_2_0 = null;

        EObject lv_digit_sequence_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2318:2: ( ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) )
            // InternalPascal.g:2319:2: ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            {
            // InternalPascal.g:2319:2: ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            // InternalPascal.g:2320:3: (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            {
            // InternalPascal.g:2320:3: (otherlv_0= 'E' | otherlv_1= 'e' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            else if ( (LA28_0==42) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2321:4: otherlv_0= 'E'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getScale_factorAccess().getEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2326:4: otherlv_1= 'e'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getScale_factorAccess().getEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:2331:3: ( (lv_sign_2_0= rulesign ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred48_InternalPascal()) ) {
                    alt29=1;
                }
            }
            else if ( (LA29_0==45) ) {
                int LA29_2 = input.LA(2);

                if ( (synpred48_InternalPascal()) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2332:4: (lv_sign_2_0= rulesign )
                    {
                    // InternalPascal.g:2332:4: (lv_sign_2_0= rulesign )
                    // InternalPascal.g:2333:5: lv_sign_2_0= rulesign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScale_factorAccess().getSignSignParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_sign_2_0=rulesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScale_factorRule());
                      					}
                      					set(
                      						current,
                      						"sign",
                      						lv_sign_2_0,
                      						"org.xtext.example.pascal.Pascal.sign");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:2350:3: ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            // InternalPascal.g:2351:4: (lv_digit_sequence_3_0= ruledigit_sequence )
            {
            // InternalPascal.g:2351:4: (lv_digit_sequence_3_0= ruledigit_sequence )
            // InternalPascal.g:2352:5: lv_digit_sequence_3_0= ruledigit_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScale_factorAccess().getDigit_sequenceDigit_sequenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_digit_sequence_3_0=ruledigit_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScale_factorRule());
              					}
              					set(
              						current,
              						"digit_sequence",
              						lv_digit_sequence_3_0,
              						"org.xtext.example.pascal.Pascal.digit_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulescale_factor"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:2373:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:2373:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:2374:2: iv_rulevariable= rulevariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:2380:1: rulevariable returns [EObject current=null] : ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_entire_variable_0_0 = null;

        EObject lv_expression_list_2_0 = null;

        EObject lv_field_identifier_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2386:2: ( ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* ) )
            // InternalPascal.g:2387:2: ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* )
            {
            // InternalPascal.g:2387:2: ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* )
            // InternalPascal.g:2388:3: ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )*
            {
            // InternalPascal.g:2388:3: ( (lv_entire_variable_0_0= ruleentire_variable ) )
            // InternalPascal.g:2389:4: (lv_entire_variable_0_0= ruleentire_variable )
            {
            // InternalPascal.g:2389:4: (lv_entire_variable_0_0= ruleentire_variable )
            // InternalPascal.g:2390:5: lv_entire_variable_0_0= ruleentire_variable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getEntire_variableEntire_variableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_entire_variable_0_0=ruleentire_variable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableRule());
              					}
              					set(
              						current,
              						"entire_variable",
              						lv_entire_variable_0_0,
              						"org.xtext.example.pascal.Pascal.entire_variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:2407:3: (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2408:4: otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2412:4: ( (lv_expression_list_2_0= ruleexpression_list ) )
            	    // InternalPascal.g:2413:5: (lv_expression_list_2_0= ruleexpression_list )
            	    {
            	    // InternalPascal.g:2413:5: (lv_expression_list_2_0= ruleexpression_list )
            	    // InternalPascal.g:2414:6: lv_expression_list_2_0= ruleexpression_list
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariableAccess().getExpression_listExpression_listParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_expression_list_2_0=ruleexpression_list();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariableRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expression_list",
            	      							lv_expression_list_2_0,
            	      							"org.xtext.example.pascal.Pascal.expression_list");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,38,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalPascal.g:2436:3: (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==11) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2437:4: otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2441:4: ( (lv_field_identifier_5_0= ruleidentifier ) )
            	    // InternalPascal.g:2442:5: (lv_field_identifier_5_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:2442:5: (lv_field_identifier_5_0= ruleidentifier )
            	    // InternalPascal.g:2443:6: lv_field_identifier_5_0= ruleidentifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariableAccess().getField_identifierIdentifierParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_field_identifier_5_0=ruleidentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariableRule());
            	      						}
            	      						add(
            	      							current,
            	      							"field_identifier",
            	      							lv_field_identifier_5_0,
            	      							"org.xtext.example.pascal.Pascal.identifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalPascal.g:2461:3: (otherlv_6= '^' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    int LA32_1 = input.LA(2);

                    if ( (synpred51_InternalPascal()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:2462:4: otherlv_6= '^'
            	    {
            	    otherlv_6=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalPascal.g:2467:3: (otherlv_7= '^' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:2468:4: otherlv_7= '^'
            	    {
            	    otherlv_7=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleentire_variable"
    // InternalPascal.g:2477:1: entryRuleentire_variable returns [EObject current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final EObject entryRuleentire_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentire_variable = null;


        try {
            // InternalPascal.g:2477:56: (iv_ruleentire_variable= ruleentire_variable EOF )
            // InternalPascal.g:2478:2: iv_ruleentire_variable= ruleentire_variable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntire_variableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleentire_variable=ruleentire_variable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleentire_variable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleentire_variable"


    // $ANTLR start "ruleentire_variable"
    // InternalPascal.g:2484:1: ruleentire_variable returns [EObject current=null] : ( (lv_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleentire_variable() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2490:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:2491:2: ( (lv_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:2491:2: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:2492:3: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:2492:3: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:2493:4: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEntire_variableAccess().getIdentifierIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEntire_variableRule());
              				}
              				set(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.xtext.example.pascal.Pascal.identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleentire_variable"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:2513:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:2513:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:2514:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:2520:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2526:2: ( ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:2527:2: ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:2527:2: ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:2528:3: ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:2528:3: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:2529:4: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:2529:4: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:2530:5: lv_expression_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_expression_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpression_listRule());
              					}
              					add(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:2547:3: (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==16) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPascal.g:2548:4: otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2552:4: ( (lv_expression_2_0= ruleexpression ) )
            	    // InternalPascal.g:2553:5: (lv_expression_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:2553:5: (lv_expression_2_0= ruleexpression )
            	    // InternalPascal.g:2554:6: lv_expression_2_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_expression_2_0=ruleexpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expression",
            	      							lv_expression_2_0,
            	      							"org.xtext.example.pascal.Pascal.expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:2576:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:2576:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:2577:2: iv_rulelabel= rulelabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:2583:1: rulelabel returns [EObject current=null] : ( (lv_integer_number_0_0= ruleinteger_number ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        EObject lv_integer_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2589:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) )
            // InternalPascal.g:2590:2: ( (lv_integer_number_0_0= ruleinteger_number ) )
            {
            // InternalPascal.g:2590:2: ( (lv_integer_number_0_0= ruleinteger_number ) )
            // InternalPascal.g:2591:3: (lv_integer_number_0_0= ruleinteger_number )
            {
            // InternalPascal.g:2591:3: (lv_integer_number_0_0= ruleinteger_number )
            // InternalPascal.g:2592:4: lv_integer_number_0_0= ruleinteger_number
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLabelAccess().getInteger_numberInteger_numberParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_integer_number_0_0=ruleinteger_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getLabelRule());
              				}
              				set(
              					current,
              					"integer_number",
              					lv_integer_number_0_0,
              					"org.xtext.example.pascal.Pascal.integer_number");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRuleinteger_number"
    // InternalPascal.g:2612:1: entryRuleinteger_number returns [EObject current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final EObject entryRuleinteger_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_number = null;


        try {
            // InternalPascal.g:2612:55: (iv_ruleinteger_number= ruleinteger_number EOF )
            // InternalPascal.g:2613:2: iv_ruleinteger_number= ruleinteger_number EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteger_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinteger_number=ruleinteger_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinteger_number; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleinteger_number"


    // $ANTLR start "ruleinteger_number"
    // InternalPascal.g:2619:1: ruleinteger_number returns [EObject current=null] : ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) ;
    public final EObject ruleinteger_number() throws RecognitionException {
        EObject current = null;

        EObject lv_digit_sequence_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2625:2: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) )
            // InternalPascal.g:2626:2: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
            {
            // InternalPascal.g:2626:2: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
            // InternalPascal.g:2627:3: (lv_digit_sequence_0_0= ruledigit_sequence )
            {
            // InternalPascal.g:2627:3: (lv_digit_sequence_0_0= ruledigit_sequence )
            // InternalPascal.g:2628:4: lv_digit_sequence_0_0= ruledigit_sequence
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInteger_numberAccess().getDigit_sequenceDigit_sequenceParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_digit_sequence_0_0=ruledigit_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getInteger_numberRule());
              				}
              				set(
              					current,
              					"digit_sequence",
              					lv_digit_sequence_0_0,
              					"org.xtext.example.pascal.Pascal.digit_sequence");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleinteger_number"


    // $ANTLR start "entryRuledigit_sequence"
    // InternalPascal.g:2648:1: entryRuledigit_sequence returns [EObject current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final EObject entryRuledigit_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledigit_sequence = null;


        try {
            // InternalPascal.g:2648:55: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // InternalPascal.g:2649:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledigit_sequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuledigit_sequence"


    // $ANTLR start "ruledigit_sequence"
    // InternalPascal.g:2655:1: ruledigit_sequence returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) ) ;
    public final EObject ruledigit_sequence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        AntlrDatatypeRuleToken lv_unsigned_digit_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2661:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) ) )
            // InternalPascal.g:2662:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) )
            {
            // InternalPascal.g:2662:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) )
            // InternalPascal.g:2663:3: ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) )
            {
            // InternalPascal.g:2663:3: ( (lv_sign_0_0= rulesign ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=44 && LA35_0<=45)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:2664:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:2664:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:2665:5: lv_sign_0_0= rulesign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDigit_sequenceAccess().getSignSignParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_sign_0_0=rulesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDigit_sequenceRule());
                      					}
                      					set(
                      						current,
                      						"sign",
                      						lv_sign_0_0,
                      						"org.xtext.example.pascal.Pascal.sign");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:2682:3: ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) )
            // InternalPascal.g:2683:4: (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence )
            {
            // InternalPascal.g:2683:4: (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence )
            // InternalPascal.g:2684:5: lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDigit_sequenceAccess().getUnsigned_digit_sequenceUnsigned_digit_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_unsigned_digit_sequence_1_0=ruleunsigned_digit_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDigit_sequenceRule());
              					}
              					set(
              						current,
              						"unsigned_digit_sequence",
              						lv_unsigned_digit_sequence_1_0,
              						"org.xtext.example.pascal.Pascal.unsigned_digit_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruledigit_sequence"


    // $ANTLR start "entryRulesign"
    // InternalPascal.g:2705:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:2705:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:2706:2: iv_rulesign= rulesign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesign=rulesign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // InternalPascal.g:2712:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2718:2: ( (kw= '+' | kw= '-' ) )
            // InternalPascal.g:2719:2: (kw= '+' | kw= '-' )
            {
            // InternalPascal.g:2719:2: (kw= '+' | kw= '-' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            else if ( (LA36_0==45) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:2720:3: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2726:3: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRuleunsigned_digit_sequence"
    // InternalPascal.g:2735:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // InternalPascal.g:2735:63: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // InternalPascal.g:2736:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsigned_digit_sequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_digit_sequence=ruleunsigned_digit_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunsigned_digit_sequence.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunsigned_digit_sequence"


    // $ANTLR start "ruleunsigned_digit_sequence"
    // InternalPascal.g:2742:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2748:2: (this_INT_0= RULE_INT )
            // InternalPascal.g:2749:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getUnsigned_digit_sequenceAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleunsigned_digit_sequence"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:2759:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2759:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2760:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructured_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructured_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:2766:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_statement_0_0 = null;

        EObject lv_repetitive_statement_1_0 = null;

        EObject lv_conditional_statement_2_0 = null;

        EObject lv_with_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2772:2: ( ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) ) )
            // InternalPascal.g:2773:2: ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) )
            {
            // InternalPascal.g:2773:2: ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt37=1;
                }
                break;
            case 53:
            case 56:
            case 58:
                {
                alt37=2;
                }
                break;
            case 48:
            case 50:
                {
                alt37=3;
                }
                break;
            case 46:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalPascal.g:2774:3: ( (lv_compound_statement_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:2774:3: ( (lv_compound_statement_0_0= rulecompound_statement ) )
                    // InternalPascal.g:2775:4: (lv_compound_statement_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:2775:4: (lv_compound_statement_0_0= rulecompound_statement )
                    // InternalPascal.g:2776:5: lv_compound_statement_0_0= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompound_statementCompound_statementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_compound_statement_0_0=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                      					}
                      					set(
                      						current,
                      						"compound_statement",
                      						lv_compound_statement_0_0,
                      						"org.xtext.example.pascal.Pascal.compound_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2794:3: ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) )
                    {
                    // InternalPascal.g:2794:3: ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) )
                    // InternalPascal.g:2795:4: (lv_repetitive_statement_1_0= rulerepetitive_statement )
                    {
                    // InternalPascal.g:2795:4: (lv_repetitive_statement_1_0= rulerepetitive_statement )
                    // InternalPascal.g:2796:5: lv_repetitive_statement_1_0= rulerepetitive_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitive_statementRepetitive_statementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_repetitive_statement_1_0=rulerepetitive_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                      					}
                      					set(
                      						current,
                      						"repetitive_statement",
                      						lv_repetitive_statement_1_0,
                      						"org.xtext.example.pascal.Pascal.repetitive_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2814:3: ( (lv_conditional_statement_2_0= ruleconditional_statement ) )
                    {
                    // InternalPascal.g:2814:3: ( (lv_conditional_statement_2_0= ruleconditional_statement ) )
                    // InternalPascal.g:2815:4: (lv_conditional_statement_2_0= ruleconditional_statement )
                    {
                    // InternalPascal.g:2815:4: (lv_conditional_statement_2_0= ruleconditional_statement )
                    // InternalPascal.g:2816:5: lv_conditional_statement_2_0= ruleconditional_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructured_statementAccess().getConditional_statementConditional_statementParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_conditional_statement_2_0=ruleconditional_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                      					}
                      					set(
                      						current,
                      						"conditional_statement",
                      						lv_conditional_statement_2_0,
                      						"org.xtext.example.pascal.Pascal.conditional_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2834:3: ( (lv_with_statement_3_0= rulewith_statement ) )
                    {
                    // InternalPascal.g:2834:3: ( (lv_with_statement_3_0= rulewith_statement ) )
                    // InternalPascal.g:2835:4: (lv_with_statement_3_0= rulewith_statement )
                    {
                    // InternalPascal.g:2835:4: (lv_with_statement_3_0= rulewith_statement )
                    // InternalPascal.g:2836:5: lv_with_statement_3_0= rulewith_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructured_statementAccess().getWith_statementWith_statementParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_with_statement_3_0=rulewith_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                      					}
                      					set(
                      						current,
                      						"with_statement",
                      						lv_with_statement_3_0,
                      						"org.xtext.example.pascal.Pascal.with_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulewith_statement"
    // InternalPascal.g:2857:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // InternalPascal.g:2857:55: (iv_rulewith_statement= rulewith_statement EOF )
            // InternalPascal.g:2858:2: iv_rulewith_statement= rulewith_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWith_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewith_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // InternalPascal.g:2864:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2870:2: ( (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) )
            // InternalPascal.g:2871:2: (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            {
            // InternalPascal.g:2871:2: (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            // InternalPascal.g:2872:3: otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
              		
            }
            // InternalPascal.g:2876:3: ( (lv_variable_1_0= rulevariable ) )
            // InternalPascal.g:2877:4: (lv_variable_1_0= rulevariable )
            {
            // InternalPascal.g:2877:4: (lv_variable_1_0= rulevariable )
            // InternalPascal.g:2878:5: lv_variable_1_0= rulevariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWith_statementAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_variable_1_0=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWith_statementRule());
              					}
              					add(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.xtext.example.pascal.Pascal.variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:2895:3: (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==16) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascal.g:2896:4: otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2900:4: ( (lv_variable_3_0= rulevariable ) )
            	    // InternalPascal.g:2901:5: (lv_variable_3_0= rulevariable )
            	    {
            	    // InternalPascal.g:2901:5: (lv_variable_3_0= rulevariable )
            	    // InternalPascal.g:2902:6: lv_variable_3_0= rulevariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWith_statementAccess().getVariableVariableParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_variable_3_0=rulevariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"org.xtext.example.pascal.Pascal.variable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
              		
            }
            // InternalPascal.g:2924:3: ( (lv_statement_5_0= rulestatement ) )
            // InternalPascal.g:2925:4: (lv_statement_5_0= rulestatement )
            {
            // InternalPascal.g:2925:4: (lv_statement_5_0= rulestatement )
            // InternalPascal.g:2926:5: lv_statement_5_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_5_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWith_statementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_5_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascal.g:2947:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascal.g:2947:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascal.g:2948:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditional_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconditional_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascal.g:2954:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_if_statement_0_0 = null;

        EObject lv_case_statement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2960:2: ( ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) ) )
            // InternalPascal.g:2961:2: ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) )
            {
            // InternalPascal.g:2961:2: ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            else if ( (LA39_0==48) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:2962:3: ( (lv_if_statement_0_0= ruleif_statement ) )
                    {
                    // InternalPascal.g:2962:3: ( (lv_if_statement_0_0= ruleif_statement ) )
                    // InternalPascal.g:2963:4: (lv_if_statement_0_0= ruleif_statement )
                    {
                    // InternalPascal.g:2963:4: (lv_if_statement_0_0= ruleif_statement )
                    // InternalPascal.g:2964:5: lv_if_statement_0_0= ruleif_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditional_statementAccess().getIf_statementIf_statementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_if_statement_0_0=ruleif_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                      					}
                      					set(
                      						current,
                      						"if_statement",
                      						lv_if_statement_0_0,
                      						"org.xtext.example.pascal.Pascal.if_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2982:3: ( (lv_case_statement_1_0= rulecase_statement ) )
                    {
                    // InternalPascal.g:2982:3: ( (lv_case_statement_1_0= rulecase_statement ) )
                    // InternalPascal.g:2983:4: (lv_case_statement_1_0= rulecase_statement )
                    {
                    // InternalPascal.g:2983:4: (lv_case_statement_1_0= rulecase_statement )
                    // InternalPascal.g:2984:5: lv_case_statement_1_0= rulecase_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditional_statementAccess().getCase_statementCase_statementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_case_statement_1_0=rulecase_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                      					}
                      					set(
                      						current,
                      						"case_statement",
                      						lv_case_statement_1_0,
                      						"org.xtext.example.pascal.Pascal.case_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRulecase_statement"
    // InternalPascal.g:3005:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalPascal.g:3005:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalPascal.g:3006:2: iv_rulecase_statement= rulecase_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // InternalPascal.g:3012:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_expression_1_0 = null;

        EObject lv_case_limb_3_0 = null;

        EObject lv_case_limb_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3018:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) )
            // InternalPascal.g:3019:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            {
            // InternalPascal.g:3019:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            // InternalPascal.g:3020:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:3024:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3025:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3025:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3026:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCase_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
              		
            }
            // InternalPascal.g:3047:3: ( (lv_case_limb_3_0= rulecase_limb ) )
            // InternalPascal.g:3048:4: (lv_case_limb_3_0= rulecase_limb )
            {
            // InternalPascal.g:3048:4: (lv_case_limb_3_0= rulecase_limb )
            // InternalPascal.g:3049:5: lv_case_limb_3_0= rulecase_limb
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbCase_limbParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_case_limb_3_0=rulecase_limb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCase_statementRule());
              					}
              					add(
              						current,
              						"case_limb",
              						lv_case_limb_3_0,
              						"org.xtext.example.pascal.Pascal.case_limb");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3066:3: (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==15) ) {
                    int LA40_1 = input.LA(2);

                    if ( ((LA40_1>=RULE_ID && LA40_1<=RULE_INT)||LA40_1==39||(LA40_1>=44 && LA40_1<=45)) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:3067:4: otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	      			
            	    }
            	    // InternalPascal.g:3071:4: ( (lv_case_limb_5_0= rulecase_limb ) )
            	    // InternalPascal.g:3072:5: (lv_case_limb_5_0= rulecase_limb )
            	    {
            	    // InternalPascal.g:3072:5: (lv_case_limb_5_0= rulecase_limb )
            	    // InternalPascal.g:3073:6: lv_case_limb_5_0= rulecase_limb
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbCase_limbParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_case_limb_5_0=rulecase_limb();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"case_limb",
            	      							lv_case_limb_5_0,
            	      							"org.xtext.example.pascal.Pascal.case_limb");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalPascal.g:3091:3: (otherlv_6= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:3092:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // InternalPascal.g:3105:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // InternalPascal.g:3105:50: (iv_rulecase_limb= rulecase_limb EOF )
            // InternalPascal.g:3106:2: iv_rulecase_limb= rulecase_limb EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_limbRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_limb; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // InternalPascal.g:3112:1: rulecase_limb returns [EObject current=null] : ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_case_label_list_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3118:2: ( ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalPascal.g:3119:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:3119:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalPascal.g:3120:3: ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalPascal.g:3120:3: ( (lv_case_label_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:3121:4: (lv_case_label_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:3121:4: (lv_case_label_list_0_0= rulecase_label_list )
            // InternalPascal.g:3122:5: lv_case_label_list_0_0= rulecase_label_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_limbAccess().getCase_label_listCase_label_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_case_label_list_0_0=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCase_limbRule());
              					}
              					set(
              						current,
              						"case_label_list",
              						lv_case_label_list_0_0,
              						"org.xtext.example.pascal.Pascal.case_label_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:3143:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalPascal.g:3144:4: (lv_statement_2_0= rulestatement )
            {
            // InternalPascal.g:3144:4: (lv_statement_2_0= rulestatement )
            // InternalPascal.g:3145:5: lv_statement_2_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_2_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCase_limbRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_2_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // InternalPascal.g:3166:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalPascal.g:3166:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalPascal.g:3167:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_label_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_label_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // InternalPascal.g:3173:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3179:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:3180:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:3180:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:3181:3: ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:3181:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:3182:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:3182:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:3183:5: lv_constant_0_0= ruleconstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantConstantParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_constant_0_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCase_label_listRule());
              					}
              					add(
              						current,
              						"constant",
              						lv_constant_0_0,
              						"org.xtext.example.pascal.Pascal.constant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3200:3: (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3201:4: otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3205:4: ( (lv_constant_2_0= ruleconstant ) )
            	    // InternalPascal.g:3206:5: (lv_constant_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:3206:5: (lv_constant_2_0= ruleconstant )
            	    // InternalPascal.g:3207:6: lv_constant_2_0= ruleconstant
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantConstantParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_constant_2_0=ruleconstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constant",
            	      							lv_constant_2_0,
            	      							"org.xtext.example.pascal.Pascal.constant");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuleif_statement"
    // InternalPascal.g:3229:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalPascal.g:3229:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalPascal.g:3230:2: iv_ruleif_statement= ruleif_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleif_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // InternalPascal.g:3236:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3242:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? ) )
            // InternalPascal.g:3243:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? )
            {
            // InternalPascal.g:3243:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? )
            // InternalPascal.g:3244:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
              		
            }
            // InternalPascal.g:3248:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3249:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3249:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3250:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIf_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
              		
            }
            // InternalPascal.g:3271:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:3272:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:3272:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:3273:5: lv_statement_3_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIf_statementAccess().getStatementStatementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_statement_3_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIf_statementRule());
              					}
              					add(
              						current,
              						"statement",
              						lv_statement_3_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3290:3: (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred64_InternalPascal()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3291:4: otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalPascal.g:3295:4: ( (lv_statement_5_0= rulestatement ) )
                    // InternalPascal.g:3296:5: (lv_statement_5_0= rulestatement )
                    {
                    // InternalPascal.g:3296:5: (lv_statement_5_0= rulestatement )
                    // InternalPascal.g:3297:6: lv_statement_5_0= rulestatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIf_statementAccess().getStatementStatementParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_statement_5_0=rulestatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIf_statementRule());
                      						}
                      						add(
                      							current,
                      							"statement",
                      							lv_statement_5_0,
                      							"org.xtext.example.pascal.Pascal.statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // InternalPascal.g:3319:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalPascal.g:3319:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalPascal.g:3320:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerepetitive_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // InternalPascal.g:3326:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_while_statement_0_0 = null;

        EObject lv_repeat_statement_1_0 = null;

        EObject lv_for_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3332:2: ( ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) ) )
            // InternalPascal.g:3333:2: ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) )
            {
            // InternalPascal.g:3333:2: ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt44=1;
                }
                break;
            case 56:
                {
                alt44=2;
                }
                break;
            case 53:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalPascal.g:3334:3: ( (lv_while_statement_0_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:3334:3: ( (lv_while_statement_0_0= rulewhile_statement ) )
                    // InternalPascal.g:3335:4: (lv_while_statement_0_0= rulewhile_statement )
                    {
                    // InternalPascal.g:3335:4: (lv_while_statement_0_0= rulewhile_statement )
                    // InternalPascal.g:3336:5: lv_while_statement_0_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhile_statementWhile_statementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_while_statement_0_0=rulewhile_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                      					}
                      					set(
                      						current,
                      						"while_statement",
                      						lv_while_statement_0_0,
                      						"org.xtext.example.pascal.Pascal.while_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3354:3: ( (lv_repeat_statement_1_0= rulerepeat_statement ) )
                    {
                    // InternalPascal.g:3354:3: ( (lv_repeat_statement_1_0= rulerepeat_statement ) )
                    // InternalPascal.g:3355:4: (lv_repeat_statement_1_0= rulerepeat_statement )
                    {
                    // InternalPascal.g:3355:4: (lv_repeat_statement_1_0= rulerepeat_statement )
                    // InternalPascal.g:3356:5: lv_repeat_statement_1_0= rulerepeat_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeat_statementRepeat_statementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_repeat_statement_1_0=rulerepeat_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                      					}
                      					set(
                      						current,
                      						"repeat_statement",
                      						lv_repeat_statement_1_0,
                      						"org.xtext.example.pascal.Pascal.repeat_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3374:3: ( (lv_for_statement_2_0= rulefor_statement ) )
                    {
                    // InternalPascal.g:3374:3: ( (lv_for_statement_2_0= rulefor_statement ) )
                    // InternalPascal.g:3375:4: (lv_for_statement_2_0= rulefor_statement )
                    {
                    // InternalPascal.g:3375:4: (lv_for_statement_2_0= rulefor_statement )
                    // InternalPascal.g:3376:5: lv_for_statement_2_0= rulefor_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getFor_statementFor_statementParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_for_statement_2_0=rulefor_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                      					}
                      					set(
                      						current,
                      						"for_statement",
                      						lv_for_statement_2_0,
                      						"org.xtext.example.pascal.Pascal.for_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulefor_statement"
    // InternalPascal.g:3397:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalPascal.g:3397:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalPascal.g:3398:2: iv_rulefor_statement= rulefor_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefor_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // InternalPascal.g:3404:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_identifier_1_0 = null;

        EObject lv_initial_expression_3_0 = null;

        EObject lv_final_expression_6_0 = null;

        EObject lv_statement_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3410:2: ( (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) )
            // InternalPascal.g:3411:2: (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            {
            // InternalPascal.g:3411:2: (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            // InternalPascal.g:3412:3: otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
              		
            }
            // InternalPascal.g:3416:3: ( (lv_variable_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3417:4: (lv_variable_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3417:4: (lv_variable_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3418:5: lv_variable_identifier_1_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFor_statementAccess().getVariable_identifierIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_variable_identifier_1_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFor_statementRule());
              					}
              					set(
              						current,
              						"variable_identifier",
              						lv_variable_identifier_1_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalPascal.g:3439:3: ( (lv_initial_expression_3_0= ruleinitial_expression ) )
            // InternalPascal.g:3440:4: (lv_initial_expression_3_0= ruleinitial_expression )
            {
            // InternalPascal.g:3440:4: (lv_initial_expression_3_0= ruleinitial_expression )
            // InternalPascal.g:3441:5: lv_initial_expression_3_0= ruleinitial_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFor_statementAccess().getInitial_expressionInitial_expressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_initial_expression_3_0=ruleinitial_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFor_statementRule());
              					}
              					set(
              						current,
              						"initial_expression",
              						lv_initial_expression_3_0,
              						"org.xtext.example.pascal.Pascal.initial_expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3458:3: (otherlv_4= 'to' | otherlv_5= 'downto' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            else if ( (LA45_0==55) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3459:4: otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getToKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3464:4: otherlv_5= 'downto'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:3469:3: ( (lv_final_expression_6_0= rulefinal_expression ) )
            // InternalPascal.g:3470:4: (lv_final_expression_6_0= rulefinal_expression )
            {
            // InternalPascal.g:3470:4: (lv_final_expression_6_0= rulefinal_expression )
            // InternalPascal.g:3471:5: lv_final_expression_6_0= rulefinal_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFor_statementAccess().getFinal_expressionFinal_expressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_final_expression_6_0=rulefinal_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFor_statementRule());
              					}
              					set(
              						current,
              						"final_expression",
              						lv_final_expression_6_0,
              						"org.xtext.example.pascal.Pascal.final_expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getDoKeyword_6());
              		
            }
            // InternalPascal.g:3492:3: ( (lv_statement_8_0= rulestatement ) )
            // InternalPascal.g:3493:4: (lv_statement_8_0= rulestatement )
            {
            // InternalPascal.g:3493:4: (lv_statement_8_0= rulestatement )
            // InternalPascal.g:3494:5: lv_statement_8_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_8_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFor_statementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_8_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRulefinal_expression"
    // InternalPascal.g:3515:1: entryRulefinal_expression returns [EObject current=null] : iv_rulefinal_expression= rulefinal_expression EOF ;
    public final EObject entryRulefinal_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefinal_expression = null;


        try {
            // InternalPascal.g:3515:57: (iv_rulefinal_expression= rulefinal_expression EOF )
            // InternalPascal.g:3516:2: iv_rulefinal_expression= rulefinal_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinal_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefinal_expression=rulefinal_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefinal_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefinal_expression"


    // $ANTLR start "rulefinal_expression"
    // InternalPascal.g:3522:1: rulefinal_expression returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject rulefinal_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3528:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:3529:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:3529:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:3530:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:3530:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:3531:4: lv_expression_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFinal_expressionAccess().getExpressionExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFinal_expressionRule());
              				}
              				set(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.xtext.example.pascal.Pascal.expression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefinal_expression"


    // $ANTLR start "entryRuleinitial_expression"
    // InternalPascal.g:3551:1: entryRuleinitial_expression returns [EObject current=null] : iv_ruleinitial_expression= ruleinitial_expression EOF ;
    public final EObject entryRuleinitial_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitial_expression = null;


        try {
            // InternalPascal.g:3551:59: (iv_ruleinitial_expression= ruleinitial_expression EOF )
            // InternalPascal.g:3552:2: iv_ruleinitial_expression= ruleinitial_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitial_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinitial_expression=ruleinitial_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinitial_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleinitial_expression"


    // $ANTLR start "ruleinitial_expression"
    // InternalPascal.g:3558:1: ruleinitial_expression returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleinitial_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3564:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:3565:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:3565:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:3566:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:3566:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:3567:4: lv_expression_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInitial_expressionAccess().getExpressionExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getInitial_expressionRule());
              				}
              				set(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.xtext.example.pascal.Pascal.expression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleinitial_expression"


    // $ANTLR start "entryRulerepeat_statement"
    // InternalPascal.g:3587:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // InternalPascal.g:3587:57: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // InternalPascal.g:3588:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerepeat_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // InternalPascal.g:3594:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3600:2: ( (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:3601:2: (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:3601:2: (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:3602:3: otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
              		
            }
            // InternalPascal.g:3606:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:3607:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:3607:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:3608:5: lv_statement_sequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeat_statementAccess().getStatement_sequenceStatement_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_statement_sequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
              					}
              					set(
              						current,
              						"statement_sequence",
              						lv_statement_sequence_1_0,
              						"org.xtext.example.pascal.Pascal.statement_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
              		
            }
            // InternalPascal.g:3629:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:3630:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:3630:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:3631:5: lv_expression_3_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulewhile_statement"
    // InternalPascal.g:3652:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:3652:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:3653:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // InternalPascal.g:3659:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3665:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalPascal.g:3666:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalPascal.g:3666:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalPascal.g:3667:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
              		
            }
            // InternalPascal.g:3671:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3672:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3672:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3673:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
              		
            }
            // InternalPascal.g:3694:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:3695:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:3695:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:3696:5: lv_statement_3_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_3_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:3717:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:3717:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:3718:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:3724:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3730:2: ( (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:3731:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:3731:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:3732:3: otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:3736:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:3737:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:3737:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:3738:5: lv_statement_sequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompound_statementAccess().getStatement_sequenceStatement_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_statement_sequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
              					}
              					set(
              						current,
              						"statement_sequence",
              						lv_statement_sequence_1_0,
              						"org.xtext.example.pascal.Pascal.statement_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRuledeclaration_part"
    // InternalPascal.g:3763:1: entryRuledeclaration_part returns [EObject current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final EObject entryRuledeclaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_part = null;


        try {
            // InternalPascal.g:3763:57: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // InternalPascal.g:3764:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledeclaration_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuledeclaration_part"


    // $ANTLR start "ruledeclaration_part"
    // InternalPascal.g:3770:1: ruledeclaration_part returns [EObject current=null] : ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* ) ;
    public final EObject ruledeclaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_label_declaration_part_1_0 = null;

        EObject lv_constant_definition_part_2_0 = null;

        EObject lv_type_definition_part_3_0 = null;

        EObject lv_variable_declaration_part_4_0 = null;

        EObject lv_procedure_heading_5_0 = null;

        EObject lv_procedure_body_7_0 = null;

        EObject lv_procedure_heading_8_0 = null;

        EObject lv_directive_10_0 = null;

        EObject lv_procedure_identification_11_0 = null;

        EObject lv_procedure_body_13_0 = null;

        EObject lv_function_heading_14_0 = null;

        EObject lv_function_body_16_0 = null;

        EObject lv_function_heading_17_0 = null;

        EObject lv_directive_19_0 = null;

        EObject lv_function_identification_20_0 = null;

        EObject lv_function_body_22_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3776:2: ( ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* ) )
            // InternalPascal.g:3777:2: ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* )
            {
            // InternalPascal.g:3777:2: ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* )
            // InternalPascal.g:3778:3: () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )*
            {
            // InternalPascal.g:3778:3: ()
            // InternalPascal.g:3779:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeclaration_partAccess().getDeclaration_partAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:3788:3: ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:3789:4: (lv_label_declaration_part_1_0= rulelabel_declaration_part )
                    {
                    // InternalPascal.g:3789:4: (lv_label_declaration_part_1_0= rulelabel_declaration_part )
                    // InternalPascal.g:3790:5: lv_label_declaration_part_1_0= rulelabel_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partLabel_declaration_partParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
                    lv_label_declaration_part_1_0=rulelabel_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"label_declaration_part",
                      						lv_label_declaration_part_1_0,
                      						"org.xtext.example.pascal.Pascal.label_declaration_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3807:3: ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:3808:4: (lv_constant_definition_part_2_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:3808:4: (lv_constant_definition_part_2_0= ruleconstant_definition_part )
                    // InternalPascal.g:3809:5: lv_constant_definition_part_2_0= ruleconstant_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partConstant_definition_partParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_42);
                    lv_constant_definition_part_2_0=ruleconstant_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"constant_definition_part",
                      						lv_constant_definition_part_2_0,
                      						"org.xtext.example.pascal.Pascal.constant_definition_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3826:3: ( (lv_type_definition_part_3_0= ruletype_definition_part ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==61) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:3827:4: (lv_type_definition_part_3_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:3827:4: (lv_type_definition_part_3_0= ruletype_definition_part )
                    // InternalPascal.g:3828:5: lv_type_definition_part_3_0= ruletype_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partType_definition_partParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_43);
                    lv_type_definition_part_3_0=ruletype_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"type_definition_part",
                      						lv_type_definition_part_3_0,
                      						"org.xtext.example.pascal.Pascal.type_definition_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3845:3: ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==68) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:3846:4: (lv_variable_declaration_part_4_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:3846:4: (lv_variable_declaration_part_4_0= rulevariable_declaration_part )
                    // InternalPascal.g:3847:5: lv_variable_declaration_part_4_0= rulevariable_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partVariable_declaration_partParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_variable_declaration_part_4_0=rulevariable_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"variable_declaration_part",
                      						lv_variable_declaration_part_4_0,
                      						"org.xtext.example.pascal.Pascal.variable_declaration_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3864:3: ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=69 && LA51_0<=70)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:3865:4: ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';'
            	    {
            	    // InternalPascal.g:3865:4: ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) )
            	    int alt50=6;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==70) ) {
            	        int LA50_1 = input.LA(2);

            	        if ( (synpred72_InternalPascal()) ) {
            	            alt50=1;
            	        }
            	        else if ( (synpred73_InternalPascal()) ) {
            	            alt50=2;
            	        }
            	        else if ( (synpred74_InternalPascal()) ) {
            	            alt50=3;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 50, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA50_0==69) ) {
            	        int LA50_2 = input.LA(2);

            	        if ( (synpred75_InternalPascal()) ) {
            	            alt50=4;
            	        }
            	        else if ( (synpred76_InternalPascal()) ) {
            	            alt50=5;
            	        }
            	        else if ( (true) ) {
            	            alt50=6;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 50, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalPascal.g:3866:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
            	            {
            	            // InternalPascal.g:3866:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
            	            // InternalPascal.g:3867:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) )
            	            {
            	            // InternalPascal.g:3867:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) )
            	            // InternalPascal.g:3868:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
            	            {
            	            // InternalPascal.g:3868:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
            	            // InternalPascal.g:3869:8: lv_procedure_heading_5_0= ruleprocedure_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_5_0_0_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_heading_5_0=ruleprocedure_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_heading",
            	              									lv_procedure_heading_5_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_6=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_0_1());
            	              					
            	            }
            	            // InternalPascal.g:3890:6: ( (lv_procedure_body_7_0= ruleprocedure_body ) )
            	            // InternalPascal.g:3891:7: (lv_procedure_body_7_0= ruleprocedure_body )
            	            {
            	            // InternalPascal.g:3891:7: (lv_procedure_body_7_0= ruleprocedure_body )
            	            // InternalPascal.g:3892:8: lv_procedure_body_7_0= ruleprocedure_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_5_0_0_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_body_7_0=ruleprocedure_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_body",
            	              									lv_procedure_body_7_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:3911:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
            	            {
            	            // InternalPascal.g:3911:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
            	            // InternalPascal.g:3912:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) )
            	            {
            	            // InternalPascal.g:3912:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) )
            	            // InternalPascal.g:3913:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
            	            {
            	            // InternalPascal.g:3913:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
            	            // InternalPascal.g:3914:8: lv_procedure_heading_8_0= ruleprocedure_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_5_0_1_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_heading_8_0=ruleprocedure_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_heading",
            	              									lv_procedure_heading_8_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_9=(Token)match(input,15,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_9, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_1_1());
            	              					
            	            }
            	            // InternalPascal.g:3935:6: ( (lv_directive_10_0= ruledirective ) )
            	            // InternalPascal.g:3936:7: (lv_directive_10_0= ruledirective )
            	            {
            	            // InternalPascal.g:3936:7: (lv_directive_10_0= ruledirective )
            	            // InternalPascal.g:3937:8: lv_directive_10_0= ruledirective
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_5_0_1_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_directive_10_0=ruledirective();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"directive",
            	              									lv_directive_10_0,
            	              									"org.xtext.example.pascal.Pascal.directive");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:3956:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
            	            {
            	            // InternalPascal.g:3956:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
            	            // InternalPascal.g:3957:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) )
            	            {
            	            // InternalPascal.g:3957:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) )
            	            // InternalPascal.g:3958:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
            	            {
            	            // InternalPascal.g:3958:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
            	            // InternalPascal.g:3959:8: lv_procedure_identification_11_0= ruleprocedure_identification
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_identificationProcedure_identificationParserRuleCall_5_0_2_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_identification_11_0=ruleprocedure_identification();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_identification",
            	              									lv_procedure_identification_11_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_identification");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_12=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_12, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_2_1());
            	              					
            	            }
            	            // InternalPascal.g:3980:6: ( (lv_procedure_body_13_0= ruleprocedure_body ) )
            	            // InternalPascal.g:3981:7: (lv_procedure_body_13_0= ruleprocedure_body )
            	            {
            	            // InternalPascal.g:3981:7: (lv_procedure_body_13_0= ruleprocedure_body )
            	            // InternalPascal.g:3982:8: lv_procedure_body_13_0= ruleprocedure_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_5_0_2_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_body_13_0=ruleprocedure_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_body",
            	              									lv_procedure_body_13_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:4001:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
            	            {
            	            // InternalPascal.g:4001:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
            	            // InternalPascal.g:4002:6: ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) )
            	            {
            	            // InternalPascal.g:4002:6: ( (lv_function_heading_14_0= rulefunction_heading ) )
            	            // InternalPascal.g:4003:7: (lv_function_heading_14_0= rulefunction_heading )
            	            {
            	            // InternalPascal.g:4003:7: (lv_function_heading_14_0= rulefunction_heading )
            	            // InternalPascal.g:4004:8: lv_function_heading_14_0= rulefunction_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_5_0_3_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_heading_14_0=rulefunction_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_heading",
            	              									lv_function_heading_14_0,
            	              									"org.xtext.example.pascal.Pascal.function_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_15=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_15, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_3_1());
            	              					
            	            }
            	            // InternalPascal.g:4025:6: ( (lv_function_body_16_0= rulefunction_body ) )
            	            // InternalPascal.g:4026:7: (lv_function_body_16_0= rulefunction_body )
            	            {
            	            // InternalPascal.g:4026:7: (lv_function_body_16_0= rulefunction_body )
            	            // InternalPascal.g:4027:8: lv_function_body_16_0= rulefunction_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_bodyFunction_bodyParserRuleCall_5_0_3_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_body_16_0=rulefunction_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_body",
            	              									lv_function_body_16_0,
            	              									"org.xtext.example.pascal.Pascal.function_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalPascal.g:4046:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
            	            {
            	            // InternalPascal.g:4046:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
            	            // InternalPascal.g:4047:6: ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) )
            	            {
            	            // InternalPascal.g:4047:6: ( (lv_function_heading_17_0= rulefunction_heading ) )
            	            // InternalPascal.g:4048:7: (lv_function_heading_17_0= rulefunction_heading )
            	            {
            	            // InternalPascal.g:4048:7: (lv_function_heading_17_0= rulefunction_heading )
            	            // InternalPascal.g:4049:8: lv_function_heading_17_0= rulefunction_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_5_0_4_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_heading_17_0=rulefunction_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_heading",
            	              									lv_function_heading_17_0,
            	              									"org.xtext.example.pascal.Pascal.function_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_18=(Token)match(input,15,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_18, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_4_1());
            	              					
            	            }
            	            // InternalPascal.g:4070:6: ( (lv_directive_19_0= ruledirective ) )
            	            // InternalPascal.g:4071:7: (lv_directive_19_0= ruledirective )
            	            {
            	            // InternalPascal.g:4071:7: (lv_directive_19_0= ruledirective )
            	            // InternalPascal.g:4072:8: lv_directive_19_0= ruledirective
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_5_0_4_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_directive_19_0=ruledirective();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"directive",
            	              									lv_directive_19_0,
            	              									"org.xtext.example.pascal.Pascal.directive");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalPascal.g:4091:5: ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) )
            	            {
            	            // InternalPascal.g:4091:5: ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) )
            	            // InternalPascal.g:4092:6: ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) )
            	            {
            	            // InternalPascal.g:4092:6: ( (lv_function_identification_20_0= rulefunction_identification ) )
            	            // InternalPascal.g:4093:7: (lv_function_identification_20_0= rulefunction_identification )
            	            {
            	            // InternalPascal.g:4093:7: (lv_function_identification_20_0= rulefunction_identification )
            	            // InternalPascal.g:4094:8: lv_function_identification_20_0= rulefunction_identification
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_identificationFunction_identificationParserRuleCall_5_0_5_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_identification_20_0=rulefunction_identification();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_identification",
            	              									lv_function_identification_20_0,
            	              									"org.xtext.example.pascal.Pascal.function_identification");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_21=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_21, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_5_1());
            	              					
            	            }
            	            // InternalPascal.g:4115:6: ( (lv_function_body_22_0= rulefunction_body ) )
            	            // InternalPascal.g:4116:7: (lv_function_body_22_0= rulefunction_body )
            	            {
            	            // InternalPascal.g:4116:7: (lv_function_body_22_0= rulefunction_body )
            	            // InternalPascal.g:4117:8: lv_function_body_22_0= rulefunction_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_bodyFunction_bodyParserRuleCall_5_0_5_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_body_22_0=rulefunction_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_body",
            	              									lv_function_body_22_0,
            	              									"org.xtext.example.pascal.Pascal.function_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_23=(Token)match(input,15,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_23, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // InternalPascal.g:4145:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:4145:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:4146:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabel_declaration_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // InternalPascal.g:4152:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_label_1_0 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4158:2: ( (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:4159:2: (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:4159:2: (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:4160:3: otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
              		
            }
            // InternalPascal.g:4164:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:4165:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:4165:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:4166:5: lv_label_1_0= rulelabel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelLabelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_label_1_0=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
              					}
              					add(
              						current,
              						"label",
              						lv_label_1_0,
              						"org.xtext.example.pascal.Pascal.label");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:4183:3: (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==16) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:4184:4: otherlv_2= ',' ( (lv_label_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:4188:4: ( (lv_label_3_0= rulelabel ) )
            	    // InternalPascal.g:4189:5: (lv_label_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:4189:5: (lv_label_3_0= rulelabel )
            	    // InternalPascal.g:4190:6: lv_label_3_0= rulelabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelLabelParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_label_3_0=rulelabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"label",
            	      							lv_label_3_0,
            	      							"org.xtext.example.pascal.Pascal.label");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:4216:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:4216:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:4217:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_definition_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:4223:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constant_definition_1_0 = null;

        EObject lv_constant_definition_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4229:2: ( (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4230:2: (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4230:2: (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4231:3: otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
              		
            }
            // InternalPascal.g:4235:3: ( (lv_constant_definition_1_0= ruleconstant_definition ) )
            // InternalPascal.g:4236:4: (lv_constant_definition_1_0= ruleconstant_definition )
            {
            // InternalPascal.g:4236:4: (lv_constant_definition_1_0= ruleconstant_definition )
            // InternalPascal.g:4237:5: lv_constant_definition_1_0= ruleconstant_definition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionConstant_definitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_constant_definition_1_0=ruleconstant_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
              					}
              					add(
              						current,
              						"constant_definition",
              						lv_constant_definition_1_0,
              						"org.xtext.example.pascal.Pascal.constant_definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:4258:3: ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:4259:4: ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4259:4: ( (lv_constant_definition_3_0= ruleconstant_definition ) )
            	    // InternalPascal.g:4260:5: (lv_constant_definition_3_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:4260:5: (lv_constant_definition_3_0= ruleconstant_definition )
            	    // InternalPascal.g:4261:6: lv_constant_definition_3_0= ruleconstant_definition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstant_definitionConstant_definitionParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_constant_definition_3_0=ruleconstant_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constant_definition",
            	      							lv_constant_definition_3_0,
            	      							"org.xtext.example.pascal.Pascal.constant_definition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:4287:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:4287:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:4288:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_definition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:4294:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4300:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:4301:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:4301:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            // InternalPascal.g:4302:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) )
            {
            // InternalPascal.g:4302:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4303:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4303:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4304:5: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstant_definitionAccess().getIdentifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
              					}
              					set(
              						current,
              						"identifier",
              						lv_identifier_0_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:4325:3: ( (lv_constant_2_0= ruleconstant ) )
            // InternalPascal.g:4326:4: (lv_constant_2_0= ruleconstant )
            {
            // InternalPascal.g:4326:4: (lv_constant_2_0= ruleconstant )
            // InternalPascal.g:4327:5: lv_constant_2_0= ruleconstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantConstantParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constant_2_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
              					}
              					set(
              						current,
              						"constant",
              						lv_constant_2_0,
              						"org.xtext.example.pascal.Pascal.constant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:4348:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:4348:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:4349:2: iv_ruleconstant= ruleconstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:4355:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_constant_identifier_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_strings_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4361:2: ( ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) ) )
            // InternalPascal.g:4362:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) )
            {
            // InternalPascal.g:4362:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_INT)||(LA56_0>=44 && LA56_0<=45)) ) {
                alt56=1;
            }
            else if ( (LA56_0==39) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalPascal.g:4363:3: ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:4363:3: ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:4364:4: ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:4364:4: ( (lv_sign_0_0= rulesign ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==44) ) {
                        int LA54_1 = input.LA(2);

                        if ( (synpred80_InternalPascal()) ) {
                            alt54=1;
                        }
                    }
                    else if ( (LA54_0==45) ) {
                        int LA54_2 = input.LA(2);

                        if ( (synpred80_InternalPascal()) ) {
                            alt54=1;
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalPascal.g:4365:5: (lv_sign_0_0= rulesign )
                            {
                            // InternalPascal.g:4365:5: (lv_sign_0_0= rulesign )
                            // InternalPascal.g:4366:6: lv_sign_0_0= rulesign
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getConstantAccess().getSignSignParserRuleCall_0_0_0());
                              					
                            }
                            pushFollow(FOLLOW_49);
                            lv_sign_0_0=rulesign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getConstantRule());
                              						}
                              						set(
                              							current,
                              							"sign",
                              							lv_sign_0_0,
                              							"org.xtext.example.pascal.Pascal.sign");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPascal.g:4383:4: ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_ID) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_INT||(LA55_0>=44 && LA55_0<=45)) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalPascal.g:4384:5: ( (lv_constant_identifier_1_0= ruleidentifier ) )
                            {
                            // InternalPascal.g:4384:5: ( (lv_constant_identifier_1_0= ruleidentifier ) )
                            // InternalPascal.g:4385:6: (lv_constant_identifier_1_0= ruleidentifier )
                            {
                            // InternalPascal.g:4385:6: (lv_constant_identifier_1_0= ruleidentifier )
                            // InternalPascal.g:4386:7: lv_constant_identifier_1_0= ruleidentifier
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConstantAccess().getConstant_identifierIdentifierParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_constant_identifier_1_0=ruleidentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConstantRule());
                              							}
                              							set(
                              								current,
                              								"constant_identifier",
                              								lv_constant_identifier_1_0,
                              								"org.xtext.example.pascal.Pascal.identifier");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:4404:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:4404:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:4405:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:4405:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:4406:7: lv_number_2_0= rulenumber
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConstantRule());
                              							}
                              							set(
                              								current,
                              								"number",
                              								lv_number_2_0,
                              								"org.xtext.example.pascal.Pascal.number");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4426:3: ( (lv_strings_3_0= rulestrings ) )
                    {
                    // InternalPascal.g:4426:3: ( (lv_strings_3_0= rulestrings ) )
                    // InternalPascal.g:4427:4: (lv_strings_3_0= rulestrings )
                    {
                    // InternalPascal.g:4427:4: (lv_strings_3_0= rulestrings )
                    // InternalPascal.g:4428:5: lv_strings_3_0= rulestrings
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConstantAccess().getStringsStringsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_strings_3_0=rulestrings();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConstantRule());
                      					}
                      					set(
                      						current,
                      						"strings",
                      						lv_strings_3_0,
                      						"org.xtext.example.pascal.Pascal.strings");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:4449:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:4449:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:4450:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_definition_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_definition_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:4456:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_definition_1_0 = null;

        EObject lv_type_definition_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4462:2: ( (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4463:2: (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4463:2: (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4464:3: otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
              		
            }
            // InternalPascal.g:4468:3: ( (lv_type_definition_1_0= ruletype_definition ) )
            // InternalPascal.g:4469:4: (lv_type_definition_1_0= ruletype_definition )
            {
            // InternalPascal.g:4469:4: (lv_type_definition_1_0= ruletype_definition )
            // InternalPascal.g:4470:5: lv_type_definition_1_0= ruletype_definition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionType_definitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_type_definition_1_0=ruletype_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getType_definition_partRule());
              					}
              					add(
              						current,
              						"type_definition",
              						lv_type_definition_1_0,
              						"org.xtext.example.pascal.Pascal.type_definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:4491:3: ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalPascal.g:4492:4: ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4492:4: ( (lv_type_definition_3_0= ruletype_definition ) )
            	    // InternalPascal.g:4493:5: (lv_type_definition_3_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:4493:5: (lv_type_definition_3_0= ruletype_definition )
            	    // InternalPascal.g:4494:6: lv_type_definition_3_0= ruletype_definition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getType_definition_partAccess().getType_definitionType_definitionParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_type_definition_3_0=ruletype_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"type_definition",
            	      							lv_type_definition_3_0,
            	      							"org.xtext.example.pascal.Pascal.type_definition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:4520:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:4520:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:4521:2: iv_ruletype_definition= ruletype_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_definition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:4527:1: ruletype_definition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4533:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4534:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4534:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4535:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:4535:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4536:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4536:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4537:5: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getType_definitionAccess().getIdentifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getType_definitionRule());
              					}
              					set(
              						current,
              						"identifier",
              						lv_identifier_0_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:4558:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4559:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4559:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4560:5: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getType_definitionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:4581:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:4581:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:4582:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:4588:1: ruletype returns [EObject current=null] : ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_type_0_0 = null;

        EObject lv_structured_type_1_0 = null;

        EObject lv_pointer_type_2_0 = null;

        EObject lv_type_identifier_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4594:2: ( ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:4595:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:4595:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 13:
            case 39:
            case 44:
            case 45:
                {
                alt58=1;
                }
                break;
            case RULE_ID:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==67) ) {
                    alt58=1;
                }
                else if ( (LA58_2==EOF||(LA58_2>=14 && LA58_2<=15)||LA58_2==18) ) {
                    alt58=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt58=2;
                }
                break;
            case 43:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalPascal.g:4596:3: ( (lv_simple_type_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:4596:3: ( (lv_simple_type_0_0= rulesimple_type ) )
                    // InternalPascal.g:4597:4: (lv_simple_type_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:4597:4: (lv_simple_type_0_0= rulesimple_type )
                    // InternalPascal.g:4598:5: lv_simple_type_0_0= rulesimple_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getSimple_typeSimple_typeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_simple_type_0_0=rulesimple_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"simple_type",
                      						lv_simple_type_0_0,
                      						"org.xtext.example.pascal.Pascal.simple_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4616:3: ( (lv_structured_type_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:4616:3: ( (lv_structured_type_1_0= rulestructured_type ) )
                    // InternalPascal.g:4617:4: (lv_structured_type_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:4617:4: (lv_structured_type_1_0= rulestructured_type )
                    // InternalPascal.g:4618:5: lv_structured_type_1_0= rulestructured_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getStructured_typeStructured_typeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_structured_type_1_0=rulestructured_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"structured_type",
                      						lv_structured_type_1_0,
                      						"org.xtext.example.pascal.Pascal.structured_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4636:3: ( (lv_pointer_type_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:4636:3: ( (lv_pointer_type_2_0= rulepointer_type ) )
                    // InternalPascal.g:4637:4: (lv_pointer_type_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:4637:4: (lv_pointer_type_2_0= rulepointer_type )
                    // InternalPascal.g:4638:5: lv_pointer_type_2_0= rulepointer_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getPointer_typePointer_typeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_pointer_type_2_0=rulepointer_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"pointer_type",
                      						lv_pointer_type_2_0,
                      						"org.xtext.example.pascal.Pascal.pointer_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4656:3: ( (lv_type_identifier_3_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:4656:3: ( (lv_type_identifier_3_0= ruletype_identifier ) )
                    // InternalPascal.g:4657:4: (lv_type_identifier_3_0= ruletype_identifier )
                    {
                    // InternalPascal.g:4657:4: (lv_type_identifier_3_0= ruletype_identifier )
                    // InternalPascal.g:4658:5: lv_type_identifier_3_0= ruletype_identifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getType_identifierType_identifierParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_identifier_3_0=ruletype_identifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"type_identifier",
                      						lv_type_identifier_3_0,
                      						"org.xtext.example.pascal.Pascal.type_identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuletype_identifier"
    // InternalPascal.g:4679:1: entryRuletype_identifier returns [EObject current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final EObject entryRuletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_identifier = null;


        try {
            // InternalPascal.g:4679:56: (iv_ruletype_identifier= ruletype_identifier EOF )
            // InternalPascal.g:4680:2: iv_ruletype_identifier= ruletype_identifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_identifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_identifier=ruletype_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_identifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletype_identifier"


    // $ANTLR start "ruletype_identifier"
    // InternalPascal.g:4686:1: ruletype_identifier returns [EObject current=null] : ( (lv_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4692:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:4693:2: ( (lv_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:4693:2: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4694:3: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4694:3: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4695:4: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getType_identifierAccess().getIdentifierIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getType_identifierRule());
              				}
              				set(
              					current,
              					"identifier",
              					lv_identifier_0_0,
              					"org.xtext.example.pascal.Pascal.identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletype_identifier"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:4715:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:4715:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:4716:2: iv_rulepointer_type= rulepointer_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointer_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepointer_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:4722:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4728:2: ( (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:4729:2: (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:4729:2: (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) )
            // InternalPascal.g:4730:3: otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
              		
            }
            // InternalPascal.g:4734:3: ( (lv_type_identifier_1_0= ruletype_identifier ) )
            // InternalPascal.g:4735:4: (lv_type_identifier_1_0= ruletype_identifier )
            {
            // InternalPascal.g:4735:4: (lv_type_identifier_1_0= ruletype_identifier )
            // InternalPascal.g:4736:5: lv_type_identifier_1_0= ruletype_identifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPointer_typeAccess().getType_identifierType_identifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_identifier_1_0=ruletype_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPointer_typeRule());
              					}
              					set(
              						current,
              						"type_identifier",
              						lv_type_identifier_1_0,
              						"org.xtext.example.pascal.Pascal.type_identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:4757:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:4757:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:4758:2: iv_rulestructured_type= rulestructured_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructured_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructured_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:4764:1: rulestructured_type returns [EObject current=null] : ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpacked_structured_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4770:2: ( ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:4771:2: ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:4771:2: ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:4772:3: (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:4772:3: (otherlv_0= 'packed' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==62) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPascal.g:4773:4: otherlv_0= 'packed'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:4778:3: ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:4779:4: (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:4779:4: (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:4780:5: lv_unpacked_structured_type_1_0= ruleunpacked_structured_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpacked_structured_typeUnpacked_structured_typeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_unpacked_structured_type_1_0=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStructured_typeRule());
              					}
              					set(
              						current,
              						"unpacked_structured_type",
              						lv_unpacked_structured_type_1_0,
              						"org.xtext.example.pascal.Pascal.unpacked_structured_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:4801:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:4801:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:4802:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunpacked_structured_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:4808:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_type_0_0 = null;

        EObject lv_record_type_1_0 = null;

        EObject lv_set_type_2_0 = null;

        EObject lv_file_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4814:2: ( ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) ) )
            // InternalPascal.g:4815:2: ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) )
            {
            // InternalPascal.g:4815:2: ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt60=1;
                }
                break;
            case 65:
                {
                alt60=2;
                }
                break;
            case 64:
                {
                alt60=3;
                }
                break;
            case 63:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalPascal.g:4816:3: ( (lv_array_type_0_0= rulearray_type ) )
                    {
                    // InternalPascal.g:4816:3: ( (lv_array_type_0_0= rulearray_type ) )
                    // InternalPascal.g:4817:4: (lv_array_type_0_0= rulearray_type )
                    {
                    // InternalPascal.g:4817:4: (lv_array_type_0_0= rulearray_type )
                    // InternalPascal.g:4818:5: lv_array_type_0_0= rulearray_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArray_typeArray_typeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_array_type_0_0=rulearray_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      					}
                      					set(
                      						current,
                      						"array_type",
                      						lv_array_type_0_0,
                      						"org.xtext.example.pascal.Pascal.array_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4836:3: ( (lv_record_type_1_0= rulerecord_type ) )
                    {
                    // InternalPascal.g:4836:3: ( (lv_record_type_1_0= rulerecord_type ) )
                    // InternalPascal.g:4837:4: (lv_record_type_1_0= rulerecord_type )
                    {
                    // InternalPascal.g:4837:4: (lv_record_type_1_0= rulerecord_type )
                    // InternalPascal.g:4838:5: lv_record_type_1_0= rulerecord_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecord_typeRecord_typeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_record_type_1_0=rulerecord_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      					}
                      					set(
                      						current,
                      						"record_type",
                      						lv_record_type_1_0,
                      						"org.xtext.example.pascal.Pascal.record_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4856:3: ( (lv_set_type_2_0= ruleset_type ) )
                    {
                    // InternalPascal.g:4856:3: ( (lv_set_type_2_0= ruleset_type ) )
                    // InternalPascal.g:4857:4: (lv_set_type_2_0= ruleset_type )
                    {
                    // InternalPascal.g:4857:4: (lv_set_type_2_0= ruleset_type )
                    // InternalPascal.g:4858:5: lv_set_type_2_0= ruleset_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSet_typeSet_typeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_set_type_2_0=ruleset_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      					}
                      					set(
                      						current,
                      						"set_type",
                      						lv_set_type_2_0,
                      						"org.xtext.example.pascal.Pascal.set_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4876:3: ( (lv_file_type_3_0= rulefile_type ) )
                    {
                    // InternalPascal.g:4876:3: ( (lv_file_type_3_0= rulefile_type ) )
                    // InternalPascal.g:4877:4: (lv_file_type_3_0= rulefile_type )
                    {
                    // InternalPascal.g:4877:4: (lv_file_type_3_0= rulefile_type )
                    // InternalPascal.g:4878:5: lv_file_type_3_0= rulefile_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFile_typeFile_typeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_file_type_3_0=rulefile_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                      					}
                      					set(
                      						current,
                      						"file_type",
                      						lv_file_type_3_0,
                      						"org.xtext.example.pascal.Pascal.file_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulefile_type"
    // InternalPascal.g:4899:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // InternalPascal.g:4899:50: (iv_rulefile_type= rulefile_type EOF )
            // InternalPascal.g:4900:2: iv_rulefile_type= rulefile_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFile_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefile_type=rulefile_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefile_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // InternalPascal.g:4906:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_file_component_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4912:2: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) ) )
            // InternalPascal.g:4913:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) )
            {
            // InternalPascal.g:4913:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) )
            // InternalPascal.g:4914:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
              		
            }
            // InternalPascal.g:4922:3: ( (lv_file_component_type_2_0= rulefile_component_type ) )
            // InternalPascal.g:4923:4: (lv_file_component_type_2_0= rulefile_component_type )
            {
            // InternalPascal.g:4923:4: (lv_file_component_type_2_0= rulefile_component_type )
            // InternalPascal.g:4924:5: lv_file_component_type_2_0= rulefile_component_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFile_typeAccess().getFile_component_typeFile_component_typeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_file_component_type_2_0=rulefile_component_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFile_typeRule());
              					}
              					set(
              						current,
              						"file_component_type",
              						lv_file_component_type_2_0,
              						"org.xtext.example.pascal.Pascal.file_component_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulefile_component_type"
    // InternalPascal.g:4945:1: entryRulefile_component_type returns [EObject current=null] : iv_rulefile_component_type= rulefile_component_type EOF ;
    public final EObject entryRulefile_component_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_component_type = null;


        try {
            // InternalPascal.g:4945:60: (iv_rulefile_component_type= rulefile_component_type EOF )
            // InternalPascal.g:4946:2: iv_rulefile_component_type= rulefile_component_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFile_component_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefile_component_type=rulefile_component_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefile_component_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefile_component_type"


    // $ANTLR start "rulefile_component_type"
    // InternalPascal.g:4952:1: rulefile_component_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject rulefile_component_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4958:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:4959:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:4959:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:4960:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:4960:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:4961:4: lv_type_0_0= ruletype
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFile_component_typeAccess().getTypeTypeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFile_component_typeRule());
              				}
              				set(
              					current,
              					"type",
              					lv_type_0_0,
              					"org.xtext.example.pascal.Pascal.type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefile_component_type"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:4981:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:4981:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:4982:2: iv_ruleset_type= ruleset_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSet_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleset_type=ruleset_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleset_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:4988:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_base_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4994:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) ) )
            // InternalPascal.g:4995:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) )
            {
            // InternalPascal.g:4995:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) )
            // InternalPascal.g:4996:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
              		
            }
            // InternalPascal.g:5004:3: ( (lv_base_type_2_0= rulebase_type ) )
            // InternalPascal.g:5005:4: (lv_base_type_2_0= rulebase_type )
            {
            // InternalPascal.g:5005:4: (lv_base_type_2_0= rulebase_type )
            // InternalPascal.g:5006:5: lv_base_type_2_0= rulebase_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSet_typeAccess().getBase_typeBase_typeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_base_type_2_0=rulebase_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSet_typeRule());
              					}
              					set(
              						current,
              						"base_type",
              						lv_base_type_2_0,
              						"org.xtext.example.pascal.Pascal.base_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulebase_type"
    // InternalPascal.g:5027:1: entryRulebase_type returns [EObject current=null] : iv_rulebase_type= rulebase_type EOF ;
    public final EObject entryRulebase_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_type = null;


        try {
            // InternalPascal.g:5027:50: (iv_rulebase_type= rulebase_type EOF )
            // InternalPascal.g:5028:2: iv_rulebase_type= rulebase_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBase_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebase_type=rulebase_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebase_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulebase_type"


    // $ANTLR start "rulebase_type"
    // InternalPascal.g:5034:1: rulebase_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject rulebase_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5040:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:5041:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:5041:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:5042:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:5042:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:5043:4: lv_type_0_0= ruletype
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBase_typeAccess().getTypeTypeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBase_typeRule());
              				}
              				set(
              					current,
              					"type",
              					lv_type_0_0,
              					"org.xtext.example.pascal.Pascal.type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulebase_type"


    // $ANTLR start "entryRulerecord_type"
    // InternalPascal.g:5063:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:5063:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:5064:2: iv_rulerecord_type= rulerecord_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecord_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecord_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // InternalPascal.g:5070:1: rulerecord_type returns [EObject current=null] : (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_field_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5076:2: ( (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:5077:2: (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:5077:2: (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' )
            // InternalPascal.g:5078:3: otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecord_typeAccess().getRecordKeyword_0());
              		
            }
            // InternalPascal.g:5082:3: ( (lv_field_list_1_0= rulefield_list ) )
            // InternalPascal.g:5083:4: (lv_field_list_1_0= rulefield_list )
            {
            // InternalPascal.g:5083:4: (lv_field_list_1_0= rulefield_list )
            // InternalPascal.g:5084:5: lv_field_list_1_0= rulefield_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRecord_typeAccess().getField_listField_listParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_field_list_1_0=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRecord_typeRule());
              					}
              					set(
              						current,
              						"field_list",
              						lv_field_list_1_0,
              						"org.xtext.example.pascal.Pascal.field_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRecord_typeAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRulefield_list"
    // InternalPascal.g:5109:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:5109:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:5110:2: iv_rulefield_list= rulefield_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefield_list=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // InternalPascal.g:5116:1: rulefield_list returns [EObject current=null] : ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fixed_part_1_0 = null;

        EObject lv_variant_part_3_0 = null;

        EObject lv_variant_part_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5122:2: ( ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? ) )
            // InternalPascal.g:5123:2: ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? )
            {
            // InternalPascal.g:5123:2: ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? )
            // InternalPascal.g:5124:3: () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )?
            {
            // InternalPascal.g:5124:3: ()
            // InternalPascal.g:5125:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getField_listAccess().getField_listAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:5134:3: ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||LA64_0==48) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPascal.g:5135:4: ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )?
                    {
                    // InternalPascal.g:5135:4: ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_ID) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==48) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalPascal.g:5136:5: ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? )
                            {
                            // InternalPascal.g:5136:5: ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? )
                            // InternalPascal.g:5137:6: ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )?
                            {
                            // InternalPascal.g:5137:6: ( (lv_fixed_part_1_0= rulefixed_part ) )
                            // InternalPascal.g:5138:7: (lv_fixed_part_1_0= rulefixed_part )
                            {
                            // InternalPascal.g:5138:7: (lv_fixed_part_1_0= rulefixed_part )
                            // InternalPascal.g:5139:8: lv_fixed_part_1_0= rulefixed_part
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getField_listAccess().getFixed_partFixed_partParserRuleCall_1_0_0_0_0());
                              							
                            }
                            pushFollow(FOLLOW_12);
                            lv_fixed_part_1_0=rulefixed_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getField_listRule());
                              								}
                              								set(
                              									current,
                              									"fixed_part",
                              									lv_fixed_part_1_0,
                              									"org.xtext.example.pascal.Pascal.fixed_part");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalPascal.g:5156:6: (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==15) ) {
                                int LA61_1 = input.LA(2);

                                if ( (LA61_1==48) ) {
                                    alt61=1;
                                }
                            }
                            switch (alt61) {
                                case 1 :
                                    // InternalPascal.g:5157:7: otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) )
                                    {
                                    otherlv_2=(Token)match(input,15,FOLLOW_53); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_2, grammarAccess.getField_listAccess().getSemicolonKeyword_1_0_0_1_0());
                                      						
                                    }
                                    // InternalPascal.g:5161:7: ( (lv_variant_part_3_0= rulevariant_part ) )
                                    // InternalPascal.g:5162:8: (lv_variant_part_3_0= rulevariant_part )
                                    {
                                    // InternalPascal.g:5162:8: (lv_variant_part_3_0= rulevariant_part )
                                    // InternalPascal.g:5163:9: lv_variant_part_3_0= rulevariant_part
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getField_listAccess().getVariant_partVariant_partParserRuleCall_1_0_0_1_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_12);
                                    lv_variant_part_3_0=rulevariant_part();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getField_listRule());
                                      									}
                                      									set(
                                      										current,
                                      										"variant_part",
                                      										lv_variant_part_3_0,
                                      										"org.xtext.example.pascal.Pascal.variant_part");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:5183:5: ( (lv_variant_part_4_0= rulevariant_part ) )
                            {
                            // InternalPascal.g:5183:5: ( (lv_variant_part_4_0= rulevariant_part ) )
                            // InternalPascal.g:5184:6: (lv_variant_part_4_0= rulevariant_part )
                            {
                            // InternalPascal.g:5184:6: (lv_variant_part_4_0= rulevariant_part )
                            // InternalPascal.g:5185:7: lv_variant_part_4_0= rulevariant_part
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getField_listAccess().getVariant_partVariant_partParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_variant_part_4_0=rulevariant_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getField_listRule());
                              							}
                              							set(
                              								current,
                              								"variant_part",
                              								lv_variant_part_4_0,
                              								"org.xtext.example.pascal.Pascal.variant_part");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalPascal.g:5203:4: (otherlv_5= ';' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==15) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalPascal.g:5204:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getField_listAccess().getSemicolonKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // InternalPascal.g:5214:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalPascal.g:5214:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalPascal.g:5215:2: iv_rulefixed_part= rulefixed_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixed_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefixed_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // InternalPascal.g:5221:1: rulefixed_part returns [EObject current=null] : ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_record_section_0_0 = null;

        EObject lv_record_section_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5227:2: ( ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:5228:2: ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:5228:2: ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:5229:3: ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:5229:3: ( (lv_record_section_0_0= rulerecord_section ) )
            // InternalPascal.g:5230:4: (lv_record_section_0_0= rulerecord_section )
            {
            // InternalPascal.g:5230:4: (lv_record_section_0_0= rulerecord_section )
            // InternalPascal.g:5231:5: lv_record_section_0_0= rulerecord_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionRecord_sectionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_record_section_0_0=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFixed_partRule());
              					}
              					add(
              						current,
              						"record_section",
              						lv_record_section_0_0,
              						"org.xtext.example.pascal.Pascal.record_section");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:5248:3: (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==15) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==RULE_ID) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalPascal.g:5249:4: otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:5253:4: ( (lv_record_section_2_0= rulerecord_section ) )
            	    // InternalPascal.g:5254:5: (lv_record_section_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:5254:5: (lv_record_section_2_0= rulerecord_section )
            	    // InternalPascal.g:5255:6: lv_record_section_2_0= rulerecord_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFixed_partAccess().getRecord_sectionRecord_sectionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_record_section_2_0=rulerecord_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"record_section",
            	      							lv_record_section_2_0,
            	      							"org.xtext.example.pascal.Pascal.record_section");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:5277:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:5277:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:5278:2: iv_rulerecord_section= rulerecord_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecord_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // InternalPascal.g:5284:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5290:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:5291:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:5291:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:5292:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:5292:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:5293:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:5293:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:5294:5: lv_identifier_list_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifier_listIdentifier_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_identifier_list_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
              					}
              					set(
              						current,
              						"identifier_list",
              						lv_identifier_list_0_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:5315:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:5316:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:5316:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:5317:5: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // InternalPascal.g:5338:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalPascal.g:5338:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalPascal.g:5339:2: iv_rulevariant_part= rulevariant_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariant_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariant_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // InternalPascal.g:5345:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_field_1_0 = null;

        EObject lv_type_identifier_2_0 = null;

        EObject lv_variant_4_0 = null;

        EObject lv_variant_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5351:2: ( (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* ) )
            // InternalPascal.g:5352:2: (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:5352:2: (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* )
            // InternalPascal.g:5353:3: otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:5357:3: ( (lv_tag_field_1_0= ruletag_field ) )
            // InternalPascal.g:5358:4: (lv_tag_field_1_0= ruletag_field )
            {
            // InternalPascal.g:5358:4: (lv_tag_field_1_0= ruletag_field )
            // InternalPascal.g:5359:5: lv_tag_field_1_0= ruletag_field
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariant_partAccess().getTag_fieldTag_fieldParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_tag_field_1_0=ruletag_field();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariant_partRule());
              					}
              					set(
              						current,
              						"tag_field",
              						lv_tag_field_1_0,
              						"org.xtext.example.pascal.Pascal.tag_field");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:5376:3: ( (lv_type_identifier_2_0= ruletype_identifier ) )
            // InternalPascal.g:5377:4: (lv_type_identifier_2_0= ruletype_identifier )
            {
            // InternalPascal.g:5377:4: (lv_type_identifier_2_0= ruletype_identifier )
            // InternalPascal.g:5378:5: lv_type_identifier_2_0= ruletype_identifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariant_partAccess().getType_identifierType_identifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_type_identifier_2_0=ruletype_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariant_partRule());
              					}
              					set(
              						current,
              						"type_identifier",
              						lv_type_identifier_2_0,
              						"org.xtext.example.pascal.Pascal.type_identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
              		
            }
            // InternalPascal.g:5399:3: ( (lv_variant_4_0= rulevariant ) )
            // InternalPascal.g:5400:4: (lv_variant_4_0= rulevariant )
            {
            // InternalPascal.g:5400:4: (lv_variant_4_0= rulevariant )
            // InternalPascal.g:5401:5: lv_variant_4_0= rulevariant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariant_partAccess().getVariantVariantParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_variant_4_0=rulevariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariant_partRule());
              					}
              					add(
              						current,
              						"variant",
              						lv_variant_4_0,
              						"org.xtext.example.pascal.Pascal.variant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:5418:3: (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==15) ) {
                    int LA66_1 = input.LA(2);

                    if ( ((LA66_1>=RULE_ID && LA66_1<=RULE_INT)||LA66_1==39||(LA66_1>=44 && LA66_1<=45)) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // InternalPascal.g:5419:4: otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalPascal.g:5423:4: ( (lv_variant_6_0= rulevariant ) )
            	    // InternalPascal.g:5424:5: (lv_variant_6_0= rulevariant )
            	    {
            	    // InternalPascal.g:5424:5: (lv_variant_6_0= rulevariant )
            	    // InternalPascal.g:5425:6: lv_variant_6_0= rulevariant
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariant_partAccess().getVariantVariantParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_variant_6_0=rulevariant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variant",
            	      							lv_variant_6_0,
            	      							"org.xtext.example.pascal.Pascal.variant");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:5447:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:5447:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:5448:2: iv_rulevariant= rulevariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:5454:1: rulevariant returns [EObject current=null] : ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_case_label_list_0_0 = null;

        EObject lv_field_list_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5460:2: ( ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' ) )
            // InternalPascal.g:5461:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' )
            {
            // InternalPascal.g:5461:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' )
            // InternalPascal.g:5462:3: ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')'
            {
            // InternalPascal.g:5462:3: ( (lv_case_label_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:5463:4: (lv_case_label_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:5463:4: (lv_case_label_list_0_0= rulecase_label_list )
            // InternalPascal.g:5464:5: lv_case_label_list_0_0= rulecase_label_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariantAccess().getCase_label_listCase_label_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_case_label_list_0_0=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariantRule());
              					}
              					set(
              						current,
              						"case_label_list",
              						lv_case_label_list_0_0,
              						"org.xtext.example.pascal.Pascal.case_label_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,13,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPascal.g:5489:3: ( (lv_field_list_3_0= rulefield_list ) )
            // InternalPascal.g:5490:4: (lv_field_list_3_0= rulefield_list )
            {
            // InternalPascal.g:5490:4: (lv_field_list_3_0= rulefield_list )
            // InternalPascal.g:5491:5: lv_field_list_3_0= rulefield_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariantAccess().getField_listField_listParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_field_list_3_0=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariantRule());
              					}
              					set(
              						current,
              						"field_list",
              						lv_field_list_3_0,
              						"org.xtext.example.pascal.Pascal.field_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRuletag_field"
    // InternalPascal.g:5516:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalPascal.g:5516:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalPascal.g:5517:2: iv_ruletag_field= ruletag_field EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTag_fieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletag_field=ruletag_field();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletag_field; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // InternalPascal.g:5523:1: ruletag_field returns [EObject current=null] : ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5529:2: ( ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? ) )
            // InternalPascal.g:5530:2: ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? )
            {
            // InternalPascal.g:5530:2: ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? )
            // InternalPascal.g:5531:3: () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )?
            {
            // InternalPascal.g:5531:3: ()
            // InternalPascal.g:5532:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTag_fieldAccess().getTag_fieldAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:5541:3: ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==19) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalPascal.g:5542:4: ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':'
                    {
                    // InternalPascal.g:5542:4: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:5543:5: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:5543:5: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:5544:6: lv_identifier_1_0= ruleidentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTag_fieldAccess().getIdentifierIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_identifier_1_0=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTag_fieldRule());
                      						}
                      						set(
                      							current,
                      							"identifier",
                      							lv_identifier_1_0,
                      							"org.xtext.example.pascal.Pascal.identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTag_fieldAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulearray_type"
    // InternalPascal.g:5570:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascal.g:5570:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascal.g:5571:2: iv_rulearray_type= rulearray_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearray_type=rulearray_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearray_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascal.g:5577:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_index_type_2_0 = null;

        EObject lv_index_type_4_0 = null;

        EObject lv_element_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5583:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) ) )
            // InternalPascal.g:5584:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) )
            {
            // InternalPascal.g:5584:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) )
            // InternalPascal.g:5585:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPascal.g:5593:3: ( (lv_index_type_2_0= ruleindex_type ) )
            // InternalPascal.g:5594:4: (lv_index_type_2_0= ruleindex_type )
            {
            // InternalPascal.g:5594:4: (lv_index_type_2_0= ruleindex_type )
            // InternalPascal.g:5595:5: lv_index_type_2_0= ruleindex_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeIndex_typeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_57);
            lv_index_type_2_0=ruleindex_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArray_typeRule());
              					}
              					add(
              						current,
              						"index_type",
              						lv_index_type_2_0,
              						"org.xtext.example.pascal.Pascal.index_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:5612:3: (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==16) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalPascal.g:5613:4: otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPascal.g:5617:4: ( (lv_index_type_4_0= ruleindex_type ) )
            	    // InternalPascal.g:5618:5: (lv_index_type_4_0= ruleindex_type )
            	    {
            	    // InternalPascal.g:5618:5: (lv_index_type_4_0= ruleindex_type )
            	    // InternalPascal.g:5619:6: lv_index_type_4_0= ruleindex_type
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeIndex_typeParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_index_type_4_0=ruleindex_type();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"index_type",
            	      							lv_index_type_4_0,
            	      							"org.xtext.example.pascal.Pascal.index_type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_5=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
              		
            }
            // InternalPascal.g:5645:3: ( (lv_element_type_7_0= ruleelement_type ) )
            // InternalPascal.g:5646:4: (lv_element_type_7_0= ruleelement_type )
            {
            // InternalPascal.g:5646:4: (lv_element_type_7_0= ruleelement_type )
            // InternalPascal.g:5647:5: lv_element_type_7_0= ruleelement_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArray_typeAccess().getElement_typeElement_typeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_element_type_7_0=ruleelement_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArray_typeRule());
              					}
              					set(
              						current,
              						"element_type",
              						lv_element_type_7_0,
              						"org.xtext.example.pascal.Pascal.element_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuleelement_type"
    // InternalPascal.g:5668:1: entryRuleelement_type returns [EObject current=null] : iv_ruleelement_type= ruleelement_type EOF ;
    public final EObject entryRuleelement_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_type = null;


        try {
            // InternalPascal.g:5668:53: (iv_ruleelement_type= ruleelement_type EOF )
            // InternalPascal.g:5669:2: iv_ruleelement_type= ruleelement_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElement_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleelement_type=ruleelement_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleelement_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleelement_type"


    // $ANTLR start "ruleelement_type"
    // InternalPascal.g:5675:1: ruleelement_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject ruleelement_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5681:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:5682:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:5682:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:5683:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:5683:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:5684:4: lv_type_0_0= ruletype
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElement_typeAccess().getTypeTypeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getElement_typeRule());
              				}
              				set(
              					current,
              					"type",
              					lv_type_0_0,
              					"org.xtext.example.pascal.Pascal.type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleelement_type"


    // $ANTLR start "entryRuleindex_type"
    // InternalPascal.g:5704:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalPascal.g:5704:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalPascal.g:5705:2: iv_ruleindex_type= ruleindex_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndex_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleindex_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalPascal.g:5711:1: ruleindex_type returns [EObject current=null] : ( (lv_simple_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5717:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:5718:2: ( (lv_simple_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:5718:2: ( (lv_simple_type_0_0= rulesimple_type ) )
            // InternalPascal.g:5719:3: (lv_simple_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:5719:3: (lv_simple_type_0_0= rulesimple_type )
            // InternalPascal.g:5720:4: lv_simple_type_0_0= rulesimple_type
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIndex_typeAccess().getSimple_typeSimple_typeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_simple_type_0_0=rulesimple_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIndex_typeRule());
              				}
              				set(
              					current,
              					"simple_type",
              					lv_simple_type_0_0,
              					"org.xtext.example.pascal.Pascal.simple_type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:5740:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:5740:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:5741:2: iv_rulesimple_type= rulesimple_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:5747:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject lv_subrange_type_0_0 = null;

        EObject lv_enumerated_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5753:2: ( ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) ) )
            // InternalPascal.g:5754:2: ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) )
            {
            // InternalPascal.g:5754:2: ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_INT)||LA69_0==39||(LA69_0>=44 && LA69_0<=45)) ) {
                alt69=1;
            }
            else if ( (LA69_0==13) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalPascal.g:5755:3: ( (lv_subrange_type_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:5755:3: ( (lv_subrange_type_0_0= rulesubrange_type ) )
                    // InternalPascal.g:5756:4: (lv_subrange_type_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:5756:4: (lv_subrange_type_0_0= rulesubrange_type )
                    // InternalPascal.g:5757:5: lv_subrange_type_0_0= rulesubrange_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrange_typeSubrange_typeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_subrange_type_0_0=rulesubrange_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                      					}
                      					set(
                      						current,
                      						"subrange_type",
                      						lv_subrange_type_0_0,
                      						"org.xtext.example.pascal.Pascal.subrange_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5775:3: ( (lv_enumerated_type_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:5775:3: ( (lv_enumerated_type_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:5776:4: (lv_enumerated_type_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:5776:4: (lv_enumerated_type_1_0= ruleenumerated_type )
                    // InternalPascal.g:5777:5: lv_enumerated_type_1_0= ruleenumerated_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumerated_typeEnumerated_typeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_enumerated_type_1_0=ruleenumerated_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                      					}
                      					set(
                      						current,
                      						"enumerated_type",
                      						lv_enumerated_type_1_0,
                      						"org.xtext.example.pascal.Pascal.enumerated_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:5798:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:5798:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:5799:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenumerated_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:5805:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5811:2: ( (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:5812:2: (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:5812:2: (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:5813:3: otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:5817:3: ( (lv_identifier_list_1_0= ruleidentifier_list ) )
            // InternalPascal.g:5818:4: (lv_identifier_list_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:5818:4: (lv_identifier_list_1_0= ruleidentifier_list )
            // InternalPascal.g:5819:5: lv_identifier_list_1_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifier_listIdentifier_listParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_identifier_list_1_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
              					}
              					set(
              						current,
              						"identifier_list",
              						lv_identifier_list_1_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:5844:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascal.g:5844:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:5845:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesubrange_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:5851:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lower_bound_0_0 = null;

        EObject lv_upper_bound_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5857:2: ( ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) ) )
            // InternalPascal.g:5858:2: ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) )
            {
            // InternalPascal.g:5858:2: ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) )
            // InternalPascal.g:5859:3: ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) )
            {
            // InternalPascal.g:5859:3: ( (lv_lower_bound_0_0= rulelower_bound ) )
            // InternalPascal.g:5860:4: (lv_lower_bound_0_0= rulelower_bound )
            {
            // InternalPascal.g:5860:4: (lv_lower_bound_0_0= rulelower_bound )
            // InternalPascal.g:5861:5: lv_lower_bound_0_0= rulelower_bound
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubrange_typeAccess().getLower_boundLower_boundParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_lower_bound_0_0=rulelower_bound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
              					}
              					set(
              						current,
              						"lower_bound",
              						lv_lower_bound_0_0,
              						"org.xtext.example.pascal.Pascal.lower_bound");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalPascal.g:5882:3: ( (lv_upper_bound_2_0= ruleupper_bound ) )
            // InternalPascal.g:5883:4: (lv_upper_bound_2_0= ruleupper_bound )
            {
            // InternalPascal.g:5883:4: (lv_upper_bound_2_0= ruleupper_bound )
            // InternalPascal.g:5884:5: lv_upper_bound_2_0= ruleupper_bound
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubrange_typeAccess().getUpper_boundUpper_boundParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_upper_bound_2_0=ruleupper_bound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
              					}
              					set(
              						current,
              						"upper_bound",
              						lv_upper_bound_2_0,
              						"org.xtext.example.pascal.Pascal.upper_bound");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRulelower_bound"
    // InternalPascal.g:5905:1: entryRulelower_bound returns [EObject current=null] : iv_rulelower_bound= rulelower_bound EOF ;
    public final EObject entryRulelower_bound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelower_bound = null;


        try {
            // InternalPascal.g:5905:52: (iv_rulelower_bound= rulelower_bound EOF )
            // InternalPascal.g:5906:2: iv_rulelower_bound= rulelower_bound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLower_boundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelower_bound=rulelower_bound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelower_bound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulelower_bound"


    // $ANTLR start "rulelower_bound"
    // InternalPascal.g:5912:1: rulelower_bound returns [EObject current=null] : ( (lv_constant_0_0= ruleconstant ) ) ;
    public final EObject rulelower_bound() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5918:2: ( ( (lv_constant_0_0= ruleconstant ) ) )
            // InternalPascal.g:5919:2: ( (lv_constant_0_0= ruleconstant ) )
            {
            // InternalPascal.g:5919:2: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:5920:3: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:5920:3: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:5921:4: lv_constant_0_0= ruleconstant
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLower_boundAccess().getConstantConstantParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_constant_0_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getLower_boundRule());
              				}
              				set(
              					current,
              					"constant",
              					lv_constant_0_0,
              					"org.xtext.example.pascal.Pascal.constant");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulelower_bound"


    // $ANTLR start "entryRuleupper_bound"
    // InternalPascal.g:5941:1: entryRuleupper_bound returns [EObject current=null] : iv_ruleupper_bound= ruleupper_bound EOF ;
    public final EObject entryRuleupper_bound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleupper_bound = null;


        try {
            // InternalPascal.g:5941:52: (iv_ruleupper_bound= ruleupper_bound EOF )
            // InternalPascal.g:5942:2: iv_ruleupper_bound= ruleupper_bound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpper_boundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleupper_bound=ruleupper_bound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleupper_bound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleupper_bound"


    // $ANTLR start "ruleupper_bound"
    // InternalPascal.g:5948:1: ruleupper_bound returns [EObject current=null] : ( (lv_constant_0_0= ruleconstant ) ) ;
    public final EObject ruleupper_bound() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5954:2: ( ( (lv_constant_0_0= ruleconstant ) ) )
            // InternalPascal.g:5955:2: ( (lv_constant_0_0= ruleconstant ) )
            {
            // InternalPascal.g:5955:2: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:5956:3: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:5956:3: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:5957:4: lv_constant_0_0= ruleconstant
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getUpper_boundAccess().getConstantConstantParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_constant_0_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getUpper_boundRule());
              				}
              				set(
              					current,
              					"constant",
              					lv_constant_0_0,
              					"org.xtext.example.pascal.Pascal.constant");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleupper_bound"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:5977:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:5977:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:5978:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:5984:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_declaration_1_0 = null;

        EObject lv_variable_declaration_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5990:2: ( (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:5991:2: (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:5991:2: (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* )
            // InternalPascal.g:5992:3: otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:5996:3: ( (lv_variable_declaration_1_0= rulevariable_declaration ) )
            // InternalPascal.g:5997:4: (lv_variable_declaration_1_0= rulevariable_declaration )
            {
            // InternalPascal.g:5997:4: (lv_variable_declaration_1_0= rulevariable_declaration )
            // InternalPascal.g:5998:5: lv_variable_declaration_1_0= rulevariable_declaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationVariable_declarationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_variable_declaration_1_0=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
              					}
              					add(
              						current,
              						"variable_declaration",
              						lv_variable_declaration_1_0,
              						"org.xtext.example.pascal.Pascal.variable_declaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:6019:3: ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalPascal.g:6020:4: ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:6020:4: ( (lv_variable_declaration_3_0= rulevariable_declaration ) )
            	    // InternalPascal.g:6021:5: (lv_variable_declaration_3_0= rulevariable_declaration )
            	    {
            	    // InternalPascal.g:6021:5: (lv_variable_declaration_3_0= rulevariable_declaration )
            	    // InternalPascal.g:6022:6: lv_variable_declaration_3_0= rulevariable_declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariable_declarationVariable_declarationParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_variable_declaration_3_0=rulevariable_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variable_declaration",
            	      							lv_variable_declaration_3_0,
            	      							"org.xtext.example.pascal.Pascal.variable_declaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,15,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_declaration"
    // InternalPascal.g:6048:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // InternalPascal.g:6048:61: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // InternalPascal.g:6049:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariable_declaration"


    // $ANTLR start "rulevariable_declaration"
    // InternalPascal.g:6055:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6061:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:6062:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:6062:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:6063:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:6063:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:6064:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:6064:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:6065:5: lv_identifier_list_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_declarationAccess().getIdentifier_listIdentifier_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_identifier_list_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              					}
              					set(
              						current,
              						"identifier_list",
              						lv_identifier_list_0_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariable_declarationAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:6086:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:6087:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:6087:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:6088:5: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRulefunction_identification"
    // InternalPascal.g:6109:1: entryRulefunction_identification returns [EObject current=null] : iv_rulefunction_identification= rulefunction_identification EOF ;
    public final EObject entryRulefunction_identification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_identification = null;


        try {
            // InternalPascal.g:6109:64: (iv_rulefunction_identification= rulefunction_identification EOF )
            // InternalPascal.g:6110:2: iv_rulefunction_identification= rulefunction_identification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_identificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_identification=rulefunction_identification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_identification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefunction_identification"


    // $ANTLR start "rulefunction_identification"
    // InternalPascal.g:6116:1: rulefunction_identification returns [EObject current=null] : (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject rulefunction_identification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_function_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6122:2: ( (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:6123:2: (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:6123:2: (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            // InternalPascal.g:6124:3: otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_identificationAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:6128:3: ( (lv_function_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6129:4: (lv_function_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6129:4: (lv_function_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6130:5: lv_function_identifier_1_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_identificationAccess().getFunction_identifierIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_function_identifier_1_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_identificationRule());
              					}
              					set(
              						current,
              						"function_identifier",
              						lv_function_identifier_1_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefunction_identification"


    // $ANTLR start "entryRulefunction_body"
    // InternalPascal.g:6151:1: entryRulefunction_body returns [EObject current=null] : iv_rulefunction_body= rulefunction_body EOF ;
    public final EObject entryRulefunction_body() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_body = null;


        try {
            // InternalPascal.g:6151:54: (iv_rulefunction_body= rulefunction_body EOF )
            // InternalPascal.g:6152:2: iv_rulefunction_body= rulefunction_body EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_bodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_body=rulefunction_body();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_body; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefunction_body"


    // $ANTLR start "rulefunction_body"
    // InternalPascal.g:6158:1: rulefunction_body returns [EObject current=null] : ( (lv_block_0_0= ruleblock ) ) ;
    public final EObject rulefunction_body() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6164:2: ( ( (lv_block_0_0= ruleblock ) ) )
            // InternalPascal.g:6165:2: ( (lv_block_0_0= ruleblock ) )
            {
            // InternalPascal.g:6165:2: ( (lv_block_0_0= ruleblock ) )
            // InternalPascal.g:6166:3: (lv_block_0_0= ruleblock )
            {
            // InternalPascal.g:6166:3: (lv_block_0_0= ruleblock )
            // InternalPascal.g:6167:4: lv_block_0_0= ruleblock
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunction_bodyAccess().getBlockBlockParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_block_0_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunction_bodyRule());
              				}
              				set(
              					current,
              					"block",
              					lv_block_0_0,
              					"org.xtext.example.pascal.Pascal.block");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefunction_body"


    // $ANTLR start "entryRuleprocedure_identification"
    // InternalPascal.g:6187:1: entryRuleprocedure_identification returns [EObject current=null] : iv_ruleprocedure_identification= ruleprocedure_identification EOF ;
    public final EObject entryRuleprocedure_identification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_identification = null;


        try {
            // InternalPascal.g:6187:65: (iv_ruleprocedure_identification= ruleprocedure_identification EOF )
            // InternalPascal.g:6188:2: iv_ruleprocedure_identification= ruleprocedure_identification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_identificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_identification=ruleprocedure_identification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_identification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprocedure_identification"


    // $ANTLR start "ruleprocedure_identification"
    // InternalPascal.g:6194:1: ruleprocedure_identification returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject ruleprocedure_identification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6200:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:6201:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:6201:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) )
            // InternalPascal.g:6202:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_identificationAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:6206:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6207:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6207:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6208:5: lv_identifier_1_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedure_identificationAccess().getIdentifierIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_identificationRule());
              					}
              					set(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprocedure_identification"


    // $ANTLR start "entryRuledirective"
    // InternalPascal.g:6229:1: entryRuledirective returns [EObject current=null] : iv_ruledirective= ruledirective EOF ;
    public final EObject entryRuledirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledirective = null;


        try {
            // InternalPascal.g:6229:50: (iv_ruledirective= ruledirective EOF )
            // InternalPascal.g:6230:2: iv_ruledirective= ruledirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledirective=ruledirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledirective; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuledirective"


    // $ANTLR start "ruledirective"
    // InternalPascal.g:6236:1: ruledirective returns [EObject current=null] : ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) ) ;
    public final EObject ruledirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_compiler_defined_directives_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6242:2: ( ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) ) )
            // InternalPascal.g:6243:2: ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) )
            {
            // InternalPascal.g:6243:2: ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            else if ( (LA71_0==70) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalPascal.g:6244:3: ( () otherlv_1= 'forward' )
                    {
                    // InternalPascal.g:6244:3: ( () otherlv_1= 'forward' )
                    // InternalPascal.g:6245:4: () otherlv_1= 'forward'
                    {
                    // InternalPascal.g:6245:4: ()
                    // InternalPascal.g:6246:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDirectiveAccess().getDirectiveAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDirectiveAccess().getForwardKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:6261:3: ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) )
                    {
                    // InternalPascal.g:6261:3: ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) )
                    // InternalPascal.g:6262:4: (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives )
                    {
                    // InternalPascal.g:6262:4: (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives )
                    // InternalPascal.g:6263:5: lv_compiler_defined_directives_2_0= rulecompiler_defined_directives
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDirectiveAccess().getCompiler_defined_directivesCompiler_defined_directivesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_compiler_defined_directives_2_0=rulecompiler_defined_directives();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      					}
                      					set(
                      						current,
                      						"compiler_defined_directives",
                      						lv_compiler_defined_directives_2_0,
                      						"org.xtext.example.pascal.Pascal.compiler_defined_directives");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruledirective"


    // $ANTLR start "entryRulecompiler_defined_directives"
    // InternalPascal.g:6284:1: entryRulecompiler_defined_directives returns [EObject current=null] : iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF ;
    public final EObject entryRulecompiler_defined_directives() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompiler_defined_directives = null;


        try {
            // InternalPascal.g:6284:68: (iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF )
            // InternalPascal.g:6285:2: iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompiler_defined_directivesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompiler_defined_directives=rulecompiler_defined_directives();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompiler_defined_directives; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulecompiler_defined_directives"


    // $ANTLR start "rulecompiler_defined_directives"
    // InternalPascal.g:6291:1: rulecompiler_defined_directives returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject rulecompiler_defined_directives() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6297:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:6298:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:6298:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:6299:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:6299:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:6300:4: lv_procedure_heading_0_0= ruleprocedure_heading
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getCompiler_defined_directivesAccess().getProcedure_headingProcedure_headingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_procedure_heading_0_0=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getCompiler_defined_directivesRule());
              				}
              				set(
              					current,
              					"procedure_heading",
              					lv_procedure_heading_0_0,
              					"org.xtext.example.pascal.Pascal.procedure_heading");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulecompiler_defined_directives"


    // $ANTLR start "entryRuleprocedure_body"
    // InternalPascal.g:6320:1: entryRuleprocedure_body returns [EObject current=null] : iv_ruleprocedure_body= ruleprocedure_body EOF ;
    public final EObject entryRuleprocedure_body() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_body = null;


        try {
            // InternalPascal.g:6320:55: (iv_ruleprocedure_body= ruleprocedure_body EOF )
            // InternalPascal.g:6321:2: iv_ruleprocedure_body= ruleprocedure_body EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_bodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_body=ruleprocedure_body();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_body; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprocedure_body"


    // $ANTLR start "ruleprocedure_body"
    // InternalPascal.g:6327:1: ruleprocedure_body returns [EObject current=null] : ( (lv_block_0_0= ruleblock ) ) ;
    public final EObject ruleprocedure_body() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6333:2: ( ( (lv_block_0_0= ruleblock ) ) )
            // InternalPascal.g:6334:2: ( (lv_block_0_0= ruleblock ) )
            {
            // InternalPascal.g:6334:2: ( (lv_block_0_0= ruleblock ) )
            // InternalPascal.g:6335:3: (lv_block_0_0= ruleblock )
            {
            // InternalPascal.g:6335:3: (lv_block_0_0= ruleblock )
            // InternalPascal.g:6336:4: lv_block_0_0= ruleblock
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getProcedure_bodyAccess().getBlockBlockParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_block_0_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getProcedure_bodyRule());
              				}
              				set(
              					current,
              					"block",
              					lv_block_0_0,
              					"org.xtext.example.pascal.Pascal.block");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprocedure_body"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:6356:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:6356:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:6357:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_heading; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:6363:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formal_parameter_list_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6369:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:6370:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:6370:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:6371:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:6375:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6376:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6376:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6377:5: lv_identifier_1_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedure_headingAccess().getIdentifierIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
              					}
              					set(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:6394:3: ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==13) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalPascal.g:6395:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:6395:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:6396:5: lv_formal_parameter_list_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcedure_headingAccess().getFormal_parameter_listFormal_parameter_listParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_formal_parameter_list_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                      					}
                      					set(
                      						current,
                      						"formal_parameter_list",
                      						lv_formal_parameter_list_2_0,
                      						"org.xtext.example.pascal.Pascal.formal_parameter_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:6417:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:6417:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:6418:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformal_parameter_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:6424:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formal_parameter_section_1_0 = null;

        EObject lv_formal_parameter_section_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6430:2: ( (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:6431:2: (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:6431:2: (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:6432:3: otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:6436:3: ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:6437:4: (lv_formal_parameter_section_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:6437:4: (lv_formal_parameter_section_1_0= ruleformal_parameter_section )
            // InternalPascal.g:6438:5: lv_formal_parameter_section_1_0= ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionFormal_parameter_sectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_formal_parameter_section_1_0=ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
              					}
              					add(
              						current,
              						"formal_parameter_section",
              						lv_formal_parameter_section_1_0,
              						"org.xtext.example.pascal.Pascal.formal_parameter_section");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:6455:3: (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==15) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalPascal.g:6456:4: otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:6460:4: ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:6461:5: (lv_formal_parameter_section_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:6461:5: (lv_formal_parameter_section_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:6462:6: lv_formal_parameter_section_3_0= ruleformal_parameter_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionFormal_parameter_sectionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_formal_parameter_section_3_0=ruleformal_parameter_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"formal_parameter_section",
            	      							lv_formal_parameter_section_3_0,
            	      							"org.xtext.example.pascal.Pascal.formal_parameter_section");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:6488:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:6488:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:6489:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformal_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:6495:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_parameter_section_0_0 = null;

        EObject lv_variable_parameter_section_1_0 = null;

        EObject lv_procedure_parameter_section_2_0 = null;

        EObject lv_function_parameter_section_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6501:2: ( ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) ) )
            // InternalPascal.g:6502:2: ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) )
            {
            // InternalPascal.g:6502:2: ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt74=1;
                }
                break;
            case 68:
                {
                alt74=2;
                }
                break;
            case 70:
                {
                alt74=3;
                }
                break;
            case 69:
                {
                alt74=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalPascal.g:6503:3: ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:6503:3: ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:6504:4: (lv_value_parameter_section_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:6504:4: (lv_value_parameter_section_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:6505:5: lv_value_parameter_section_0_0= rulevalue_parameter_section
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValue_parameter_sectionValue_parameter_sectionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_parameter_section_0_0=rulevalue_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"value_parameter_section",
                      						lv_value_parameter_section_0_0,
                      						"org.xtext.example.pascal.Pascal.value_parameter_section");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:6523:3: ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:6523:3: ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:6524:4: (lv_variable_parameter_section_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:6524:4: (lv_variable_parameter_section_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:6525:5: lv_variable_parameter_section_1_0= rulevariable_parameter_section
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariable_parameter_sectionVariable_parameter_sectionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_parameter_section_1_0=rulevariable_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"variable_parameter_section",
                      						lv_variable_parameter_section_1_0,
                      						"org.xtext.example.pascal.Pascal.variable_parameter_section");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:6543:3: ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) )
                    {
                    // InternalPascal.g:6543:3: ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) )
                    // InternalPascal.g:6544:4: (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section )
                    {
                    // InternalPascal.g:6544:4: (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section )
                    // InternalPascal.g:6545:5: lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedure_parameter_sectionProcedure_parameter_sectionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_procedure_parameter_section_2_0=ruleprocedure_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"procedure_parameter_section",
                      						lv_procedure_parameter_section_2_0,
                      						"org.xtext.example.pascal.Pascal.procedure_parameter_section");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:6563:3: ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) )
                    {
                    // InternalPascal.g:6563:3: ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) )
                    // InternalPascal.g:6564:4: (lv_function_parameter_section_3_0= rulefunction_parameter_section )
                    {
                    // InternalPascal.g:6564:4: (lv_function_parameter_section_3_0= rulefunction_parameter_section )
                    // InternalPascal.g:6565:5: lv_function_parameter_section_3_0= rulefunction_parameter_section
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunction_parameter_sectionFunction_parameter_sectionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_parameter_section_3_0=rulefunction_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"function_parameter_section",
                      						lv_function_parameter_section_3_0,
                      						"org.xtext.example.pascal.Pascal.function_parameter_section");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulefunction_parameter_section"
    // InternalPascal.g:6586:1: entryRulefunction_parameter_section returns [EObject current=null] : iv_rulefunction_parameter_section= rulefunction_parameter_section EOF ;
    public final EObject entryRulefunction_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_parameter_section = null;


        try {
            // InternalPascal.g:6586:67: (iv_rulefunction_parameter_section= rulefunction_parameter_section EOF )
            // InternalPascal.g:6587:2: iv_rulefunction_parameter_section= rulefunction_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_parameter_section=rulefunction_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefunction_parameter_section"


    // $ANTLR start "rulefunction_parameter_section"
    // InternalPascal.g:6593:1: rulefunction_parameter_section returns [EObject current=null] : ( (lv_function_heading_0_0= rulefunction_heading ) ) ;
    public final EObject rulefunction_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_function_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6599:2: ( ( (lv_function_heading_0_0= rulefunction_heading ) ) )
            // InternalPascal.g:6600:2: ( (lv_function_heading_0_0= rulefunction_heading ) )
            {
            // InternalPascal.g:6600:2: ( (lv_function_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:6601:3: (lv_function_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:6601:3: (lv_function_heading_0_0= rulefunction_heading )
            // InternalPascal.g:6602:4: lv_function_heading_0_0= rulefunction_heading
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunction_parameter_sectionAccess().getFunction_headingFunction_headingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_function_heading_0_0=rulefunction_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunction_parameter_sectionRule());
              				}
              				set(
              					current,
              					"function_heading",
              					lv_function_heading_0_0,
              					"org.xtext.example.pascal.Pascal.function_heading");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefunction_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:6622:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:6622:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:6623:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_heading; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:6629:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formal_parameter_list_2_0 = null;

        EObject lv_result_type_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6635:2: ( (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) ) )
            // InternalPascal.g:6636:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) )
            {
            // InternalPascal.g:6636:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) )
            // InternalPascal.g:6637:3: otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:6641:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6642:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6642:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6643:5: lv_identifier_1_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_headingAccess().getIdentifierIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
              					}
              					set(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:6660:3: ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==13) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalPascal.g:6661:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:6661:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:6662:5: lv_formal_parameter_list_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunction_headingAccess().getFormal_parameter_listFormal_parameter_listParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_formal_parameter_list_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                      					}
                      					set(
                      						current,
                      						"formal_parameter_list",
                      						lv_formal_parameter_list_2_0,
                      						"org.xtext.example.pascal.Pascal.formal_parameter_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
              		
            }
            // InternalPascal.g:6683:3: ( (lv_result_type_4_0= ruleresult_type ) )
            // InternalPascal.g:6684:4: (lv_result_type_4_0= ruleresult_type )
            {
            // InternalPascal.g:6684:4: (lv_result_type_4_0= ruleresult_type )
            // InternalPascal.g:6685:5: lv_result_type_4_0= ruleresult_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_headingAccess().getResult_typeResult_typeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_result_type_4_0=ruleresult_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
              					}
              					set(
              						current,
              						"result_type",
              						lv_result_type_4_0,
              						"org.xtext.example.pascal.Pascal.result_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRuleresult_type"
    // InternalPascal.g:6706:1: entryRuleresult_type returns [EObject current=null] : iv_ruleresult_type= ruleresult_type EOF ;
    public final EObject entryRuleresult_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresult_type = null;


        try {
            // InternalPascal.g:6706:52: (iv_ruleresult_type= ruleresult_type EOF )
            // InternalPascal.g:6707:2: iv_ruleresult_type= ruleresult_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResult_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleresult_type=ruleresult_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleresult_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleresult_type"


    // $ANTLR start "ruleresult_type"
    // InternalPascal.g:6713:1: ruleresult_type returns [EObject current=null] : ( (lv_type_identifier_0_0= ruletype_identifier ) ) ;
    public final EObject ruleresult_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6719:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) )
            // InternalPascal.g:6720:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            {
            // InternalPascal.g:6720:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            // InternalPascal.g:6721:3: (lv_type_identifier_0_0= ruletype_identifier )
            {
            // InternalPascal.g:6721:3: (lv_type_identifier_0_0= ruletype_identifier )
            // InternalPascal.g:6722:4: lv_type_identifier_0_0= ruletype_identifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getResult_typeAccess().getType_identifierType_identifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_type_identifier_0_0=ruletype_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getResult_typeRule());
              				}
              				set(
              					current,
              					"type_identifier",
              					lv_type_identifier_0_0,
              					"org.xtext.example.pascal.Pascal.type_identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleresult_type"


    // $ANTLR start "entryRuleprocedure_parameter_section"
    // InternalPascal.g:6742:1: entryRuleprocedure_parameter_section returns [EObject current=null] : iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF ;
    public final EObject entryRuleprocedure_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_parameter_section = null;


        try {
            // InternalPascal.g:6742:68: (iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF )
            // InternalPascal.g:6743:2: iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_parameter_section=ruleprocedure_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprocedure_parameter_section"


    // $ANTLR start "ruleprocedure_parameter_section"
    // InternalPascal.g:6749:1: ruleprocedure_parameter_section returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject ruleprocedure_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6755:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:6756:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:6756:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:6757:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:6757:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:6758:4: lv_procedure_heading_0_0= ruleprocedure_heading
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getProcedure_parameter_sectionAccess().getProcedure_headingProcedure_headingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_procedure_heading_0_0=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getProcedure_parameter_sectionRule());
              				}
              				set(
              					current,
              					"procedure_heading",
              					lv_procedure_heading_0_0,
              					"org.xtext.example.pascal.Pascal.procedure_heading");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleprocedure_parameter_section"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:6778:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:6778:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:6779:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:6785:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_list_1_0 = null;

        EObject lv_parameter_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6791:2: ( (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:6792:2: (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:6792:2: (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:6793:3: otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:6797:3: ( (lv_identifier_list_1_0= ruleidentifier_list ) )
            // InternalPascal.g:6798:4: (lv_identifier_list_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:6798:4: (lv_identifier_list_1_0= ruleidentifier_list )
            // InternalPascal.g:6799:5: lv_identifier_list_1_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifier_listIdentifier_listParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_identifier_list_1_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
              					}
              					set(
              						current,
              						"identifier_list",
              						lv_identifier_list_1_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
              		
            }
            // InternalPascal.g:6820:3: ( (lv_parameter_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:6821:4: (lv_parameter_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:6821:4: (lv_parameter_type_3_0= ruleparameter_type )
            // InternalPascal.g:6822:5: lv_parameter_type_3_0= ruleparameter_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getParameter_typeParameter_typeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_parameter_type_3_0=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
              					}
              					set(
              						current,
              						"parameter_type",
              						lv_parameter_type_3_0,
              						"org.xtext.example.pascal.Pascal.parameter_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:6843:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:6843:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:6844:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevalue_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:6850:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_parameter_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6856:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:6857:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:6857:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:6858:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:6858:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:6859:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:6859:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:6860:5: lv_identifier_list_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifier_listIdentifier_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_identifier_list_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
              					}
              					set(
              						current,
              						"identifier_list",
              						lv_identifier_list_0_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:6881:3: ( (lv_parameter_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:6882:4: (lv_parameter_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:6882:4: (lv_parameter_type_2_0= ruleparameter_type )
            // InternalPascal.g:6883:5: lv_parameter_type_2_0= ruleparameter_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getParameter_typeParameter_typeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_parameter_type_2_0=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
              					}
              					set(
              						current,
              						"parameter_type",
              						lv_parameter_type_2_0,
              						"org.xtext.example.pascal.Pascal.parameter_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:6904:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:6904:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:6905:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:6911:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;

        EObject lv_conformant_array_schema_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6917:2: ( ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:6918:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) )
            {
            // InternalPascal.g:6918:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==62||LA76_0==66) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalPascal.g:6919:3: ( (lv_type_identifier_0_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:6919:3: ( (lv_type_identifier_0_0= ruletype_identifier ) )
                    // InternalPascal.g:6920:4: (lv_type_identifier_0_0= ruletype_identifier )
                    {
                    // InternalPascal.g:6920:4: (lv_type_identifier_0_0= ruletype_identifier )
                    // InternalPascal.g:6921:5: lv_type_identifier_0_0= ruletype_identifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParameter_typeAccess().getType_identifierType_identifierParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_identifier_0_0=ruletype_identifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                      					}
                      					set(
                      						current,
                      						"type_identifier",
                      						lv_type_identifier_0_0,
                      						"org.xtext.example.pascal.Pascal.type_identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:6939:3: ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:6939:3: ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:6940:4: (lv_conformant_array_schema_1_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:6940:4: (lv_conformant_array_schema_1_0= ruleconformant_array_schema )
                    // InternalPascal.g:6941:5: lv_conformant_array_schema_1_0= ruleconformant_array_schema
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParameter_typeAccess().getConformant_array_schemaConformant_array_schemaParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_conformant_array_schema_1_0=ruleconformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                      					}
                      					set(
                      						current,
                      						"conformant_array_schema",
                      						lv_conformant_array_schema_1_0,
                      						"org.xtext.example.pascal.Pascal.conformant_array_schema");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // InternalPascal.g:6962:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalPascal.g:6962:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalPascal.g:6963:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconformant_array_schema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // InternalPascal.g:6969:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_conformant_array_schema_0_0 = null;

        EObject lv_unpacked_conformant_array_schema_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6975:2: ( ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalPascal.g:6976:2: ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalPascal.g:6976:2: ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            else if ( (LA77_0==66) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalPascal.g:6977:3: ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:6977:3: ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) )
                    // InternalPascal.g:6978:4: (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalPascal.g:6978:4: (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema )
                    // InternalPascal.g:6979:5: lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPacked_conformant_array_schemaPacked_conformant_array_schemaParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_packed_conformant_array_schema_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                      					}
                      					set(
                      						current,
                      						"packed_conformant_array_schema",
                      						lv_packed_conformant_array_schema_0_0,
                      						"org.xtext.example.pascal.Pascal.packed_conformant_array_schema");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:6997:3: ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:6997:3: ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalPascal.g:6998:4: (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalPascal.g:6998:4: (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema )
                    // InternalPascal.g:6999:5: lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpacked_conformant_array_schemaUnpacked_conformant_array_schemaParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_unpacked_conformant_array_schema_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                      					}
                      					set(
                      						current,
                      						"unpacked_conformant_array_schema",
                      						lv_unpacked_conformant_array_schema_1_0,
                      						"org.xtext.example.pascal.Pascal.unpacked_conformant_array_schema");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // InternalPascal.g:7020:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:7020:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:7021:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunpacked_conformant_array_schema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // InternalPascal.g:7027:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bound_specification_2_0 = null;

        EObject lv_bound_specification_4_0 = null;

        EObject lv_type_identifier_7_0 = null;

        EObject lv_conformant_array_schema_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7033:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) ) )
            // InternalPascal.g:7034:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) )
            {
            // InternalPascal.g:7034:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:7035:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPascal.g:7043:3: ( (lv_bound_specification_2_0= rulebound_specification ) )
            // InternalPascal.g:7044:4: (lv_bound_specification_2_0= rulebound_specification )
            {
            // InternalPascal.g:7044:4: (lv_bound_specification_2_0= rulebound_specification )
            // InternalPascal.g:7045:5: lv_bound_specification_2_0= rulebound_specification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationBound_specificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_bound_specification_2_0=rulebound_specification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
              					}
              					add(
              						current,
              						"bound_specification",
              						lv_bound_specification_2_0,
              						"org.xtext.example.pascal.Pascal.bound_specification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:7062:3: (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==15) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalPascal.g:7063:4: otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	      			
            	    }
            	    // InternalPascal.g:7067:4: ( (lv_bound_specification_4_0= rulebound_specification ) )
            	    // InternalPascal.g:7068:5: (lv_bound_specification_4_0= rulebound_specification )
            	    {
            	    // InternalPascal.g:7068:5: (lv_bound_specification_4_0= rulebound_specification )
            	    // InternalPascal.g:7069:6: lv_bound_specification_4_0= rulebound_specification
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationBound_specificationParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_bound_specification_4_0=rulebound_specification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	      						}
            	      						add(
            	      							current,
            	      							"bound_specification",
            	      							lv_bound_specification_4_0,
            	      							"org.xtext.example.pascal.Pascal.bound_specification");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_5=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
              		
            }
            // InternalPascal.g:7095:3: ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==62||LA79_0==66) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalPascal.g:7096:4: ( (lv_type_identifier_7_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:7096:4: ( (lv_type_identifier_7_0= ruletype_identifier ) )
                    // InternalPascal.g:7097:5: (lv_type_identifier_7_0= ruletype_identifier )
                    {
                    // InternalPascal.g:7097:5: (lv_type_identifier_7_0= ruletype_identifier )
                    // InternalPascal.g:7098:6: lv_type_identifier_7_0= ruletype_identifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getType_identifierType_identifierParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_identifier_7_0=ruletype_identifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
                      						}
                      						set(
                      							current,
                      							"type_identifier",
                      							lv_type_identifier_7_0,
                      							"org.xtext.example.pascal.Pascal.type_identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:7116:4: ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:7116:4: ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:7117:5: (lv_conformant_array_schema_8_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:7117:5: (lv_conformant_array_schema_8_0= ruleconformant_array_schema )
                    // InternalPascal.g:7118:6: lv_conformant_array_schema_8_0= ruleconformant_array_schema
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getConformant_array_schemaConformant_array_schemaParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_conformant_array_schema_8_0=ruleconformant_array_schema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
                      						}
                      						set(
                      							current,
                      							"conformant_array_schema",
                      							lv_conformant_array_schema_8_0,
                      							"org.xtext.example.pascal.Pascal.conformant_array_schema");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // InternalPascal.g:7140:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalPascal.g:7140:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalPascal.g:7141:2: iv_rulebound_specification= rulebound_specification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBound_specificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebound_specification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // InternalPascal.g:7147:1: rulebound_specification returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_identifier2_2_0 = null;

        EObject lv_ordinal_type_identifier_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7153:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) ) )
            // InternalPascal.g:7154:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) )
            {
            // InternalPascal.g:7154:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) )
            // InternalPascal.g:7155:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) )
            {
            // InternalPascal.g:7155:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:7156:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:7156:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:7157:5: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBound_specificationAccess().getIdentifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBound_specificationRule());
              					}
              					set(
              						current,
              						"identifier",
              						lv_identifier_0_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalPascal.g:7178:3: ( (lv_identifier2_2_0= ruleidentifier ) )
            // InternalPascal.g:7179:4: (lv_identifier2_2_0= ruleidentifier )
            {
            // InternalPascal.g:7179:4: (lv_identifier2_2_0= ruleidentifier )
            // InternalPascal.g:7180:5: lv_identifier2_2_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBound_specificationAccess().getIdentifier2IdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_identifier2_2_0=ruleidentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBound_specificationRule());
              					}
              					set(
              						current,
              						"identifier2",
              						lv_identifier2_2_0,
              						"org.xtext.example.pascal.Pascal.identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
              		
            }
            // InternalPascal.g:7201:3: ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) )
            // InternalPascal.g:7202:4: (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier )
            {
            // InternalPascal.g:7202:4: (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier )
            // InternalPascal.g:7203:5: lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBound_specificationAccess().getOrdinal_type_identifierOrdinal_type_identifierParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ordinal_type_identifier_4_0=ruleordinal_type_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBound_specificationRule());
              					}
              					set(
              						current,
              						"ordinal_type_identifier",
              						lv_ordinal_type_identifier_4_0,
              						"org.xtext.example.pascal.Pascal.ordinal_type_identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleordinal_type_identifier"
    // InternalPascal.g:7224:1: entryRuleordinal_type_identifier returns [EObject current=null] : iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF ;
    public final EObject entryRuleordinal_type_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleordinal_type_identifier = null;


        try {
            // InternalPascal.g:7224:64: (iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF )
            // InternalPascal.g:7225:2: iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdinal_type_identifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleordinal_type_identifier=ruleordinal_type_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleordinal_type_identifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleordinal_type_identifier"


    // $ANTLR start "ruleordinal_type_identifier"
    // InternalPascal.g:7231:1: ruleordinal_type_identifier returns [EObject current=null] : ( (lv_type_identifier_0_0= ruletype_identifier ) ) ;
    public final EObject ruleordinal_type_identifier() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7237:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) )
            // InternalPascal.g:7238:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            {
            // InternalPascal.g:7238:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            // InternalPascal.g:7239:3: (lv_type_identifier_0_0= ruletype_identifier )
            {
            // InternalPascal.g:7239:3: (lv_type_identifier_0_0= ruletype_identifier )
            // InternalPascal.g:7240:4: lv_type_identifier_0_0= ruletype_identifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOrdinal_type_identifierAccess().getType_identifierType_identifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_type_identifier_0_0=ruletype_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getOrdinal_type_identifierRule());
              				}
              				set(
              					current,
              					"type_identifier",
              					lv_type_identifier_0_0,
              					"org.xtext.example.pascal.Pascal.type_identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleordinal_type_identifier"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // InternalPascal.g:7260:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:7260:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:7261:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepacked_conformant_array_schema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // InternalPascal.g:7267:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_bound_specification_3_0 = null;

        EObject lv_type_identifier_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7273:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:7274:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:7274:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) )
            // InternalPascal.g:7275:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,66,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalPascal.g:7287:3: ( (lv_bound_specification_3_0= rulebound_specification ) )
            // InternalPascal.g:7288:4: (lv_bound_specification_3_0= rulebound_specification )
            {
            // InternalPascal.g:7288:4: (lv_bound_specification_3_0= rulebound_specification )
            // InternalPascal.g:7289:5: lv_bound_specification_3_0= rulebound_specification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBound_specificationBound_specificationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_bound_specification_3_0=rulebound_specification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
              					}
              					set(
              						current,
              						"bound_specification",
              						lv_bound_specification_3_0,
              						"org.xtext.example.pascal.Pascal.bound_specification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
              		
            }
            // InternalPascal.g:7314:3: ( (lv_type_identifier_6_0= ruletype_identifier ) )
            // InternalPascal.g:7315:4: (lv_type_identifier_6_0= ruletype_identifier )
            {
            // InternalPascal.g:7315:4: (lv_type_identifier_6_0= ruletype_identifier )
            // InternalPascal.g:7316:5: lv_type_identifier_6_0= ruletype_identifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getType_identifierType_identifierParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_identifier_6_0=ruletype_identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
              					}
              					set(
              						current,
              						"type_identifier",
              						lv_type_identifier_6_0,
              						"org.xtext.example.pascal.Pascal.type_identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRuleoutput_value"
    // InternalPascal.g:7337:1: entryRuleoutput_value returns [EObject current=null] : iv_ruleoutput_value= ruleoutput_value EOF ;
    public final EObject entryRuleoutput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_value = null;


        try {
            // InternalPascal.g:7337:53: (iv_ruleoutput_value= ruleoutput_value EOF )
            // InternalPascal.g:7338:2: iv_ruleoutput_value= ruleoutput_value EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutput_valueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoutput_value=ruleoutput_value();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoutput_value; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleoutput_value"


    // $ANTLR start "ruleoutput_value"
    // InternalPascal.g:7344:1: ruleoutput_value returns [EObject current=null] : (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? ) ;
    public final EObject ruleoutput_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_expression_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7350:2: ( (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? ) )
            // InternalPascal.g:7351:2: (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? )
            {
            // InternalPascal.g:7351:2: (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? )
            // InternalPascal.g:7352:3: this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOutput_valueAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_expression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPascal.g:7363:3: (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==15) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalPascal.g:7364:4: otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_1_0());
                      			
                    }
                    // InternalPascal.g:7368:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:7369:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:7369:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:7370:6: lv_expression_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOutput_valueAccess().getExpressionExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_expression_2_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                      						}
                      						add(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.xtext.example.pascal.Pascal.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPascal.g:7387:4: (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==19) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalPascal.g:7388:5: otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) )
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getOutput_valueAccess().getColonKeyword_1_2_0());
                              				
                            }
                            // InternalPascal.g:7392:5: ( (lv_expression_4_0= ruleexpression ) )
                            // InternalPascal.g:7393:6: (lv_expression_4_0= ruleexpression )
                            {
                            // InternalPascal.g:7393:6: (lv_expression_4_0= ruleexpression )
                            // InternalPascal.g:7394:7: lv_expression_4_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOutput_valueAccess().getExpressionExpressionParserRuleCall_1_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_4_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOutput_valueRule());
                              							}
                              							add(
                              								current,
                              								"expression",
                              								lv_expression_4_0,
                              								"org.xtext.example.pascal.Pascal.expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleoutput_value"

    // $ANTLR start synpred11_InternalPascal
    public final void synpred11_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_actual_value_0_0 = null;


        // InternalPascal.g:838:3: ( ( (lv_actual_value_0_0= ruleactual_value ) ) )
        // InternalPascal.g:838:3: ( (lv_actual_value_0_0= ruleactual_value ) )
        {
        // InternalPascal.g:838:3: ( (lv_actual_value_0_0= ruleactual_value ) )
        // InternalPascal.g:839:4: (lv_actual_value_0_0= ruleactual_value )
        {
        // InternalPascal.g:839:4: (lv_actual_value_0_0= ruleactual_value )
        // InternalPascal.g:840:5: lv_actual_value_0_0= ruleactual_value
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_valueActual_valueParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_actual_value_0_0=ruleactual_value();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalPascal

    // $ANTLR start synpred12_InternalPascal
    public final void synpred12_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_actual_variable_1_0 = null;


        // InternalPascal.g:858:3: ( ( (lv_actual_variable_1_0= ruleactual_variable ) ) )
        // InternalPascal.g:858:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
        {
        // InternalPascal.g:858:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
        // InternalPascal.g:859:4: (lv_actual_variable_1_0= ruleactual_variable )
        {
        // InternalPascal.g:859:4: (lv_actual_variable_1_0= ruleactual_variable )
        // InternalPascal.g:860:5: lv_actual_variable_1_0= ruleactual_variable
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_variableActual_variableParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_actual_variable_1_0=ruleactual_variable();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalPascal

    // $ANTLR start synpred13_InternalPascal
    public final void synpred13_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_actual_procedure_2_0 = null;


        // InternalPascal.g:878:3: ( ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) )
        // InternalPascal.g:878:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
        {
        // InternalPascal.g:878:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
        // InternalPascal.g:879:4: (lv_actual_procedure_2_0= ruleactual_procedure )
        {
        // InternalPascal.g:879:4: (lv_actual_procedure_2_0= ruleactual_procedure )
        // InternalPascal.g:880:5: lv_actual_procedure_2_0= ruleactual_procedure
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getActual_parameterAccess().getActual_procedureActual_procedureParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_actual_procedure_2_0=ruleactual_procedure();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalPascal

    // $ANTLR start synpred14_InternalPascal
    public final void synpred14_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_variable_0_0 = null;


        // InternalPascal.g:1116:4: ( ( (lv_variable_0_0= rulevariable ) ) )
        // InternalPascal.g:1116:4: ( (lv_variable_0_0= rulevariable ) )
        {
        // InternalPascal.g:1116:4: ( (lv_variable_0_0= rulevariable ) )
        // InternalPascal.g:1117:5: (lv_variable_0_0= rulevariable )
        {
        // InternalPascal.g:1117:5: (lv_variable_0_0= rulevariable )
        // InternalPascal.g:1118:6: lv_variable_0_0= rulevariable
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_variable_0_0=rulevariable();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalPascal

    // $ANTLR start synpred22_InternalPascal
    public final void synpred22_InternalPascal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sign_0_0 = null;


        // InternalPascal.g:1337:4: ( (lv_sign_0_0= rulesign ) )
        // InternalPascal.g:1337:4: (lv_sign_0_0= rulesign )
        {
        // InternalPascal.g:1337:4: (lv_sign_0_0= rulesign )
        // InternalPascal.g:1338:5: lv_sign_0_0= rulesign
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getSimple_expressionAccess().getSignSignParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_sign_0_0=rulesign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalPascal

    // $ANTLR start synpred30_InternalPascal
    public final void synpred30_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_variable_1_0 = null;


        // InternalPascal.g:1594:3: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) )
        // InternalPascal.g:1594:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
        {
        // InternalPascal.g:1594:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
        // InternalPascal.g:1595:4: () ( (lv_variable_1_0= rulevariable ) )
        {
        // InternalPascal.g:1595:4: ()
        // InternalPascal.g:1596:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPascal.g:1605:4: ( (lv_variable_1_0= rulevariable ) )
        // InternalPascal.g:1606:5: (lv_variable_1_0= rulevariable )
        {
        // InternalPascal.g:1606:5: (lv_variable_1_0= rulevariable )
        // InternalPascal.g:1607:6: lv_variable_1_0= rulevariable
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_variable_1_0=rulevariable();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalPascal

    // $ANTLR start synpred35_InternalPascal
    public final void synpred35_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_identifier_6_0 = null;


        // InternalPascal.g:1691:3: ( ( (lv_identifier_6_0= ruleidentifier ) ) )
        // InternalPascal.g:1691:3: ( (lv_identifier_6_0= ruleidentifier ) )
        {
        // InternalPascal.g:1691:3: ( (lv_identifier_6_0= ruleidentifier ) )
        // InternalPascal.g:1692:4: (lv_identifier_6_0= ruleidentifier )
        {
        // InternalPascal.g:1692:4: (lv_identifier_6_0= ruleidentifier )
        // InternalPascal.g:1693:5: lv_identifier_6_0= ruleidentifier
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFactorAccess().getIdentifierIdentifierParserRuleCall_5_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_identifier_6_0=ruleidentifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalPascal

    // $ANTLR start synpred36_InternalPascal
    public final void synpred36_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_function_designator_7_0 = null;


        // InternalPascal.g:1711:3: ( ( (lv_function_designator_7_0= rulefunction_designator ) ) )
        // InternalPascal.g:1711:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
        {
        // InternalPascal.g:1711:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
        // InternalPascal.g:1712:4: (lv_function_designator_7_0= rulefunction_designator )
        {
        // InternalPascal.g:1712:4: (lv_function_designator_7_0= rulefunction_designator )
        // InternalPascal.g:1713:5: lv_function_designator_7_0= rulefunction_designator
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorFunction_designatorParserRuleCall_6_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_function_designator_7_0=rulefunction_designator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalPascal

    // $ANTLR start synpred44_InternalPascal
    public final void synpred44_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_digit_sequence2_2_0 = null;


        // InternalPascal.g:2222:5: ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )
        // InternalPascal.g:2222:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
        {
        // InternalPascal.g:2222:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
        // InternalPascal.g:2223:6: lv_digit_sequence2_2_0= ruledigit_sequence
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequence2Digit_sequenceParserRuleCall_0_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_digit_sequence2_2_0=ruledigit_sequence();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred44_InternalPascal

    // $ANTLR start synpred48_InternalPascal
    public final void synpred48_InternalPascal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sign_2_0 = null;


        // InternalPascal.g:2332:4: ( (lv_sign_2_0= rulesign ) )
        // InternalPascal.g:2332:4: (lv_sign_2_0= rulesign )
        {
        // InternalPascal.g:2332:4: (lv_sign_2_0= rulesign )
        // InternalPascal.g:2333:5: lv_sign_2_0= rulesign
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getScale_factorAccess().getSignSignParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_sign_2_0=rulesign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred48_InternalPascal

    // $ANTLR start synpred51_InternalPascal
    public final void synpred51_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_6=null;

        // InternalPascal.g:2462:4: (otherlv_6= '^' )
        // InternalPascal.g:2462:4: otherlv_6= '^'
        {
        otherlv_6=(Token)match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalPascal

    // $ANTLR start synpred64_InternalPascal
    public final void synpred64_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statement_5_0 = null;


        // InternalPascal.g:3291:4: (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )
        // InternalPascal.g:3291:4: otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) )
        {
        otherlv_4=(Token)match(input,52,FOLLOW_10); if (state.failed) return ;
        // InternalPascal.g:3295:4: ( (lv_statement_5_0= rulestatement ) )
        // InternalPascal.g:3296:5: (lv_statement_5_0= rulestatement )
        {
        // InternalPascal.g:3296:5: (lv_statement_5_0= rulestatement )
        // InternalPascal.g:3297:6: lv_statement_5_0= rulestatement
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getIf_statementAccess().getStatementStatementParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_statement_5_0=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred64_InternalPascal

    // $ANTLR start synpred72_InternalPascal
    public final void synpred72_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_procedure_heading_5_0 = null;

        EObject lv_procedure_body_7_0 = null;


        // InternalPascal.g:3866:5: ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) )
        // InternalPascal.g:3866:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
        {
        // InternalPascal.g:3866:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
        // InternalPascal.g:3867:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) )
        {
        // InternalPascal.g:3867:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) )
        // InternalPascal.g:3868:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
        {
        // InternalPascal.g:3868:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
        // InternalPascal.g:3869:8: lv_procedure_heading_5_0= ruleprocedure_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_5_0_0_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_procedure_heading_5_0=ruleprocedure_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,15,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3890:6: ( (lv_procedure_body_7_0= ruleprocedure_body ) )
        // InternalPascal.g:3891:7: (lv_procedure_body_7_0= ruleprocedure_body )
        {
        // InternalPascal.g:3891:7: (lv_procedure_body_7_0= ruleprocedure_body )
        // InternalPascal.g:3892:8: lv_procedure_body_7_0= ruleprocedure_body
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_5_0_0_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_procedure_body_7_0=ruleprocedure_body();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred72_InternalPascal

    // $ANTLR start synpred73_InternalPascal
    public final void synpred73_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_procedure_heading_8_0 = null;

        EObject lv_directive_10_0 = null;


        // InternalPascal.g:3911:5: ( ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) )
        // InternalPascal.g:3911:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
        {
        // InternalPascal.g:3911:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
        // InternalPascal.g:3912:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) )
        {
        // InternalPascal.g:3912:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) )
        // InternalPascal.g:3913:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
        {
        // InternalPascal.g:3913:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
        // InternalPascal.g:3914:8: lv_procedure_heading_8_0= ruleprocedure_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_5_0_1_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_procedure_heading_8_0=ruleprocedure_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,15,FOLLOW_45); if (state.failed) return ;
        // InternalPascal.g:3935:6: ( (lv_directive_10_0= ruledirective ) )
        // InternalPascal.g:3936:7: (lv_directive_10_0= ruledirective )
        {
        // InternalPascal.g:3936:7: (lv_directive_10_0= ruledirective )
        // InternalPascal.g:3937:8: lv_directive_10_0= ruledirective
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_5_0_1_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_directive_10_0=ruledirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred73_InternalPascal

    // $ANTLR start synpred74_InternalPascal
    public final void synpred74_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_procedure_identification_11_0 = null;

        EObject lv_procedure_body_13_0 = null;


        // InternalPascal.g:3956:5: ( ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) )
        // InternalPascal.g:3956:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
        {
        // InternalPascal.g:3956:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
        // InternalPascal.g:3957:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) )
        {
        // InternalPascal.g:3957:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) )
        // InternalPascal.g:3958:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
        {
        // InternalPascal.g:3958:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
        // InternalPascal.g:3959:8: lv_procedure_identification_11_0= ruleprocedure_identification
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_identificationProcedure_identificationParserRuleCall_5_0_2_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_procedure_identification_11_0=ruleprocedure_identification();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,15,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3980:6: ( (lv_procedure_body_13_0= ruleprocedure_body ) )
        // InternalPascal.g:3981:7: (lv_procedure_body_13_0= ruleprocedure_body )
        {
        // InternalPascal.g:3981:7: (lv_procedure_body_13_0= ruleprocedure_body )
        // InternalPascal.g:3982:8: lv_procedure_body_13_0= ruleprocedure_body
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_5_0_2_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_procedure_body_13_0=ruleprocedure_body();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred74_InternalPascal

    // $ANTLR start synpred75_InternalPascal
    public final void synpred75_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        EObject lv_function_heading_14_0 = null;

        EObject lv_function_body_16_0 = null;


        // InternalPascal.g:4001:5: ( ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) )
        // InternalPascal.g:4001:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
        {
        // InternalPascal.g:4001:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
        // InternalPascal.g:4002:6: ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) )
        {
        // InternalPascal.g:4002:6: ( (lv_function_heading_14_0= rulefunction_heading ) )
        // InternalPascal.g:4003:7: (lv_function_heading_14_0= rulefunction_heading )
        {
        // InternalPascal.g:4003:7: (lv_function_heading_14_0= rulefunction_heading )
        // InternalPascal.g:4004:8: lv_function_heading_14_0= rulefunction_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_5_0_3_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_function_heading_14_0=rulefunction_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,15,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:4025:6: ( (lv_function_body_16_0= rulefunction_body ) )
        // InternalPascal.g:4026:7: (lv_function_body_16_0= rulefunction_body )
        {
        // InternalPascal.g:4026:7: (lv_function_body_16_0= rulefunction_body )
        // InternalPascal.g:4027:8: lv_function_body_16_0= rulefunction_body
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_bodyFunction_bodyParserRuleCall_5_0_3_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_function_body_16_0=rulefunction_body();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred75_InternalPascal

    // $ANTLR start synpred76_InternalPascal
    public final void synpred76_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_18=null;
        EObject lv_function_heading_17_0 = null;

        EObject lv_directive_19_0 = null;


        // InternalPascal.g:4046:5: ( ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) )
        // InternalPascal.g:4046:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
        {
        // InternalPascal.g:4046:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
        // InternalPascal.g:4047:6: ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) )
        {
        // InternalPascal.g:4047:6: ( (lv_function_heading_17_0= rulefunction_heading ) )
        // InternalPascal.g:4048:7: (lv_function_heading_17_0= rulefunction_heading )
        {
        // InternalPascal.g:4048:7: (lv_function_heading_17_0= rulefunction_heading )
        // InternalPascal.g:4049:8: lv_function_heading_17_0= rulefunction_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_5_0_4_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_function_heading_17_0=rulefunction_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_18=(Token)match(input,15,FOLLOW_45); if (state.failed) return ;
        // InternalPascal.g:4070:6: ( (lv_directive_19_0= ruledirective ) )
        // InternalPascal.g:4071:7: (lv_directive_19_0= ruledirective )
        {
        // InternalPascal.g:4071:7: (lv_directive_19_0= ruledirective )
        // InternalPascal.g:4072:8: lv_directive_19_0= ruledirective
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_5_0_4_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_directive_19_0=ruledirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred76_InternalPascal

    // $ANTLR start synpred80_InternalPascal
    public final void synpred80_InternalPascal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sign_0_0 = null;


        // InternalPascal.g:4365:5: ( (lv_sign_0_0= rulesign ) )
        // InternalPascal.g:4365:5: (lv_sign_0_0= rulesign )
        {
        // InternalPascal.g:4365:5: (lv_sign_0_0= rulesign )
        // InternalPascal.g:4366:6: lv_sign_0_0= rulesign
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getConstantAccess().getSignSignParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_sign_0_0=rulesign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred80_InternalPascal

    // Delegated rules

    public final boolean synpred12_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\1\0\11\uffff";
    static final String dfa_3s = "\1\55\1\0\11\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\10\1\11\1\1\1\6\1\7";
    static final String dfa_5s = "\1\uffff\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\7\uffff\1\6\25\uffff\1\5\1\7\1\4\1\uffff\1\3\4\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1593:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalPascal()) ) {s = 8;}

                        else if ( (synpred35_InternalPascal()) ) {s = 9;}

                        else if ( (synpred36_InternalPascal()) ) {s = 10;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3800000000020000L,0x0000000000000070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0525700000120030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000030B800002030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001FC00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000300020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000030F800002030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000360000000022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000082000000802L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000802L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000308000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xC000388000002030L,0x0000000000000007L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000040010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000004010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000308000002030L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000070L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000080002L});

}