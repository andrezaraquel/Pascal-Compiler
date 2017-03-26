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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRINGS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'begin'", "'end'", "':'", "'goto'", "':='", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'in'", "'or'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'nil'", "'not'", "'True'", "'False'", "'['", "']'", "'E'", "'e'", "'^'", "'+'", "'-'", "'with'", "'do'", "'case'", "'of'", "'if'", "'then'", "'else'", "'for'", "'to'", "'downto'", "'repeat'", "'until'", "'while'", "'label'", "'const'", "'type'", "'packed'", "'file'", "'set'", "'record'", "'array'", "'..'", "'var'", "'function'", "'procedure'", "'forward'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_STRINGS=5;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

            if ( (LA1_0==13) ) {
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

                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:285:4: otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
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


    // $ANTLR start "entryRuleprocedure_block"
    // InternalPascal.g:312:1: entryRuleprocedure_block returns [EObject current=null] : iv_ruleprocedure_block= ruleprocedure_block EOF ;
    public final EObject entryRuleprocedure_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_block = null;


        try {
            // InternalPascal.g:312:56: (iv_ruleprocedure_block= ruleprocedure_block EOF )
            // InternalPascal.g:313:2: iv_ruleprocedure_block= ruleprocedure_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_block=ruleprocedure_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_block; 
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
    // $ANTLR end "entryRuleprocedure_block"


    // $ANTLR start "ruleprocedure_block"
    // InternalPascal.g:319:1: ruleprocedure_block returns [EObject current=null] : ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleprocedure_block() throws RecognitionException {
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

              					newCompositeNode(grammarAccess.getProcedure_blockAccess().getDeclaration_partDeclaration_partParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_declaration_part_0_0=ruledeclaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_blockRule());
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

              					newCompositeNode(grammarAccess.getProcedure_blockAccess().getStatement_partStatement_partParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_part_1_0=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_blockRule());
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
    // $ANTLR end "ruleprocedure_block"


    // $ANTLR start "entryRulefunction_block"
    // InternalPascal.g:369:1: entryRulefunction_block returns [EObject current=null] : iv_rulefunction_block= rulefunction_block EOF ;
    public final EObject entryRulefunction_block() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_block = null;


        try {
            // InternalPascal.g:369:55: (iv_rulefunction_block= rulefunction_block EOF )
            // InternalPascal.g:370:2: iv_rulefunction_block= rulefunction_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_block=rulefunction_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_block; 
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
    // $ANTLR end "entryRulefunction_block"


    // $ANTLR start "rulefunction_block"
    // InternalPascal.g:376:1: rulefunction_block returns [EObject current=null] : ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) ;
    public final EObject rulefunction_block() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_part_0_0 = null;

        EObject lv_statement_part_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:382:2: ( ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) )
            // InternalPascal.g:383:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:383:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            // InternalPascal.g:384:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) )
            {
            // InternalPascal.g:384:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) )
            // InternalPascal.g:385:4: (lv_declaration_part_0_0= ruledeclaration_part )
            {
            // InternalPascal.g:385:4: (lv_declaration_part_0_0= ruledeclaration_part )
            // InternalPascal.g:386:5: lv_declaration_part_0_0= ruledeclaration_part
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_blockAccess().getDeclaration_partDeclaration_partParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_declaration_part_0_0=ruledeclaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_blockRule());
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

            // InternalPascal.g:403:3: ( (lv_statement_part_1_0= rulestatement_part ) )
            // InternalPascal.g:404:4: (lv_statement_part_1_0= rulestatement_part )
            {
            // InternalPascal.g:404:4: (lv_statement_part_1_0= rulestatement_part )
            // InternalPascal.g:405:5: lv_statement_part_1_0= rulestatement_part
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_blockAccess().getStatement_partStatement_partParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_part_1_0=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_blockRule());
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
    // $ANTLR end "rulefunction_block"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:426:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:426:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:427:2: iv_ruleblock= ruleblock EOF
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
    // InternalPascal.g:433:1: ruleblock returns [EObject current=null] : ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_part_0_0 = null;

        EObject lv_statement_part_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:439:2: ( ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) )
            // InternalPascal.g:440:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:440:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            // InternalPascal.g:441:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) )
            {
            // InternalPascal.g:441:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) )
            // InternalPascal.g:442:4: (lv_declaration_part_0_0= ruledeclaration_part )
            {
            // InternalPascal.g:442:4: (lv_declaration_part_0_0= ruledeclaration_part )
            // InternalPascal.g:443:5: lv_declaration_part_0_0= ruledeclaration_part
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

            // InternalPascal.g:460:3: ( (lv_statement_part_1_0= rulestatement_part ) )
            // InternalPascal.g:461:4: (lv_statement_part_1_0= rulestatement_part )
            {
            // InternalPascal.g:461:4: (lv_statement_part_1_0= rulestatement_part )
            // InternalPascal.g:462:5: lv_statement_part_1_0= rulestatement_part
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
    // InternalPascal.g:483:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:483:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:484:2: iv_rulestatement_part= rulestatement_part EOF
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
    // InternalPascal.g:490:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:496:2: ( (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:497:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:497:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:498:3: otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:502:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:503:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:503:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:504:5: lv_statement_sequence_1_0= rulestatement_sequence
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

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:529:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:529:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:530:2: iv_rulestatement_sequence= rulestatement_sequence EOF
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
    // InternalPascal.g:536:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statement_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:542:2: ( ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:543:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:543:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            // InternalPascal.g:544:3: ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:544:3: ( (lv_statement_0_0= rulestatement ) )
            // InternalPascal.g:545:4: (lv_statement_0_0= rulestatement )
            {
            // InternalPascal.g:545:4: (lv_statement_0_0= rulestatement )
            // InternalPascal.g:546:5: lv_statement_0_0= rulestatement
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

            // InternalPascal.g:563:3: (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:564:4: otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:568:4: ( (lv_statement_2_0= rulestatement ) )
            	    // InternalPascal.g:569:5: (lv_statement_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:569:5: (lv_statement_2_0= rulestatement )
            	    // InternalPascal.g:570:6: lv_statement_2_0= rulestatement
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
    // InternalPascal.g:592:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:592:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:593:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:599:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_statement_2_0 = null;

        EObject lv_structured_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:605:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:606:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:606:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:607:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:607:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||(LA4_0>=45 && LA4_0<=46)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:608:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:608:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:609:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:609:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:610:6: lv_label_0_0= rulelabel
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

                    otherlv_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:632:3: ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==RULE_ID||LA5_0==16||LA5_0==19||LA5_0==21||LA5_0==53||LA5_0==58) ) {
                alt5=1;
            }
            else if ( (LA5_0==18||LA5_0==47||LA5_0==49||LA5_0==51||LA5_0==54||LA5_0==57||LA5_0==59) ) {
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
                    // InternalPascal.g:633:4: ( (lv_simple_statement_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:633:4: ( (lv_simple_statement_2_0= rulesimple_statement ) )
                    // InternalPascal.g:634:5: (lv_simple_statement_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:634:5: (lv_simple_statement_2_0= rulesimple_statement )
                    // InternalPascal.g:635:6: lv_simple_statement_2_0= rulesimple_statement
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
                    // InternalPascal.g:653:4: ( (lv_structured_statement_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:653:4: ( (lv_structured_statement_3_0= rulestructured_statement ) )
                    // InternalPascal.g:654:5: (lv_structured_statement_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:654:5: (lv_structured_statement_3_0= rulestructured_statement )
                    // InternalPascal.g:655:6: lv_structured_statement_3_0= rulestructured_statement
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
    // InternalPascal.g:677:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:677:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:678:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascal.g:684:1: rulesimple_statement returns [EObject current=null] : ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_statement_1_0 = null;

        EObject lv_procedure_statement_2_0 = null;

        EObject lv_goto_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:690:2: ( ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? ) )
            // InternalPascal.g:691:2: ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? )
            {
            // InternalPascal.g:691:2: ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? )
            // InternalPascal.g:692:3: () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )?
            {
            // InternalPascal.g:692:3: ()
            // InternalPascal.g:693:4: 
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

            // InternalPascal.g:702:3: ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )?
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==14||LA6_1==16||LA6_1==19||LA6_1==53||LA6_1==58) ) {
                    alt6=2;
                }
                else if ( (LA6_1==12||LA6_1==22||LA6_1==40||LA6_1==44) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==21) ) {
                alt6=3;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:703:4: ( (lv_assignment_statement_1_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:703:4: ( (lv_assignment_statement_1_0= ruleassignment_statement ) )
                    // InternalPascal.g:704:5: (lv_assignment_statement_1_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:704:5: (lv_assignment_statement_1_0= ruleassignment_statement )
                    // InternalPascal.g:705:6: lv_assignment_statement_1_0= ruleassignment_statement
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
                    // InternalPascal.g:723:4: ( (lv_procedure_statement_2_0= ruleprocedure_statement ) )
                    {
                    // InternalPascal.g:723:4: ( (lv_procedure_statement_2_0= ruleprocedure_statement ) )
                    // InternalPascal.g:724:5: (lv_procedure_statement_2_0= ruleprocedure_statement )
                    {
                    // InternalPascal.g:724:5: (lv_procedure_statement_2_0= ruleprocedure_statement )
                    // InternalPascal.g:725:6: lv_procedure_statement_2_0= ruleprocedure_statement
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
                    // InternalPascal.g:743:4: ( (lv_goto_statement_3_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:743:4: ( (lv_goto_statement_3_0= rulegoto_statement ) )
                    // InternalPascal.g:744:5: (lv_goto_statement_3_0= rulegoto_statement )
                    {
                    // InternalPascal.g:744:5: (lv_goto_statement_3_0= rulegoto_statement )
                    // InternalPascal.g:745:6: lv_goto_statement_3_0= rulegoto_statement
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
    // InternalPascal.g:767:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:767:55: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:768:2: iv_rulegoto_statement= rulegoto_statement EOF
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
    // InternalPascal.g:774:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:780:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:781:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:781:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:782:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
              		
            }
            // InternalPascal.g:786:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:787:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:787:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:788:5: lv_label_1_0= rulelabel
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
    // InternalPascal.g:809:1: entryRuleprocedure_statement returns [EObject current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final EObject entryRuleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_statement = null;


        try {
            // InternalPascal.g:809:60: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascal.g:810:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
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
    // InternalPascal.g:816:1: ruleprocedure_statement returns [EObject current=null] : ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) ;
    public final EObject ruleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_identifier_0_0 = null;

        EObject lv_actual_parameter_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:822:2: ( ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) )
            // InternalPascal.g:823:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            {
            // InternalPascal.g:823:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            // InternalPascal.g:824:3: ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            {
            // InternalPascal.g:824:3: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:825:4: (lv_procedure_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:825:4: (lv_procedure_identifier_0_0= ruleidentifier )
            // InternalPascal.g:826:5: lv_procedure_identifier_0_0= ruleidentifier
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

            // InternalPascal.g:843:3: ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:844:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    {
                    // InternalPascal.g:844:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    // InternalPascal.g:845:5: lv_actual_parameter_list_1_0= ruleactual_parameter_list
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
    // InternalPascal.g:866:1: entryRuleactual_parameter_list returns [EObject current=null] : iv_ruleactual_parameter_list= ruleactual_parameter_list EOF ;
    public final EObject entryRuleactual_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter_list = null;


        try {
            // InternalPascal.g:866:62: (iv_ruleactual_parameter_list= ruleactual_parameter_list EOF )
            // InternalPascal.g:867:2: iv_ruleactual_parameter_list= ruleactual_parameter_list EOF
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
    // InternalPascal.g:873:1: ruleactual_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleactual_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actual_parameter_1_0 = null;

        EObject lv_actual_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:879:2: ( (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:880:2: (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:880:2: (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' )
            // InternalPascal.g:881:3: otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActual_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:885:3: ( (lv_actual_parameter_1_0= ruleactual_parameter ) )
            // InternalPascal.g:886:4: (lv_actual_parameter_1_0= ruleactual_parameter )
            {
            // InternalPascal.g:886:4: (lv_actual_parameter_1_0= ruleactual_parameter )
            // InternalPascal.g:887:5: lv_actual_parameter_1_0= ruleactual_parameter
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

            // InternalPascal.g:904:3: (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:905:4: otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getActual_parameter_listAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:909:4: ( (lv_actual_parameter_3_0= ruleactual_parameter ) )
            	    // InternalPascal.g:910:5: (lv_actual_parameter_3_0= ruleactual_parameter )
            	    {
            	    // InternalPascal.g:910:5: (lv_actual_parameter_3_0= ruleactual_parameter )
            	    // InternalPascal.g:911:6: lv_actual_parameter_3_0= ruleactual_parameter
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:937:1: entryRuleactual_parameter returns [EObject current=null] : iv_ruleactual_parameter= ruleactual_parameter EOF ;
    public final EObject entryRuleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter = null;


        try {
            // InternalPascal.g:937:57: (iv_ruleactual_parameter= ruleactual_parameter EOF )
            // InternalPascal.g:938:2: iv_ruleactual_parameter= ruleactual_parameter EOF
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
    // InternalPascal.g:944:1: ruleactual_parameter returns [EObject current=null] : ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) ) ;
    public final EObject ruleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject lv_actual_value_0_0 = null;

        EObject lv_actual_variable_1_0 = null;

        EObject lv_actual_procedure_2_0 = null;

        EObject lv_actual_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:950:2: ( ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) ) )
            // InternalPascal.g:951:2: ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) )
            {
            // InternalPascal.g:951:2: ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRINGS && LA9_0<=RULE_INT)||LA9_0==14||(LA9_0>=36 && LA9_0<=40)||(LA9_0>=45 && LA9_0<=46)) ) {
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
                    // InternalPascal.g:952:3: ( (lv_actual_value_0_0= ruleactual_value ) )
                    {
                    // InternalPascal.g:952:3: ( (lv_actual_value_0_0= ruleactual_value ) )
                    // InternalPascal.g:953:4: (lv_actual_value_0_0= ruleactual_value )
                    {
                    // InternalPascal.g:953:4: (lv_actual_value_0_0= ruleactual_value )
                    // InternalPascal.g:954:5: lv_actual_value_0_0= ruleactual_value
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
                    // InternalPascal.g:972:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
                    {
                    // InternalPascal.g:972:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
                    // InternalPascal.g:973:4: (lv_actual_variable_1_0= ruleactual_variable )
                    {
                    // InternalPascal.g:973:4: (lv_actual_variable_1_0= ruleactual_variable )
                    // InternalPascal.g:974:5: lv_actual_variable_1_0= ruleactual_variable
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
                    // InternalPascal.g:992:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
                    {
                    // InternalPascal.g:992:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
                    // InternalPascal.g:993:4: (lv_actual_procedure_2_0= ruleactual_procedure )
                    {
                    // InternalPascal.g:993:4: (lv_actual_procedure_2_0= ruleactual_procedure )
                    // InternalPascal.g:994:5: lv_actual_procedure_2_0= ruleactual_procedure
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
                    // InternalPascal.g:1012:3: ( (lv_actual_function_3_0= ruleactual_function ) )
                    {
                    // InternalPascal.g:1012:3: ( (lv_actual_function_3_0= ruleactual_function ) )
                    // InternalPascal.g:1013:4: (lv_actual_function_3_0= ruleactual_function )
                    {
                    // InternalPascal.g:1013:4: (lv_actual_function_3_0= ruleactual_function )
                    // InternalPascal.g:1014:5: lv_actual_function_3_0= ruleactual_function
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
    // InternalPascal.g:1035:1: entryRuleactual_function returns [EObject current=null] : iv_ruleactual_function= ruleactual_function EOF ;
    public final EObject entryRuleactual_function() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_function = null;


        try {
            // InternalPascal.g:1035:56: (iv_ruleactual_function= ruleactual_function EOF )
            // InternalPascal.g:1036:2: iv_ruleactual_function= ruleactual_function EOF
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
    // InternalPascal.g:1042:1: ruleactual_function returns [EObject current=null] : ( (lv_function_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleactual_function() throws RecognitionException {
        EObject current = null;

        EObject lv_function_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1048:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:1049:2: ( (lv_function_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:1049:2: ( (lv_function_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1050:3: (lv_function_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1050:3: (lv_function_identifier_0_0= ruleidentifier )
            // InternalPascal.g:1051:4: lv_function_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:1071:1: entryRuleactual_procedure returns [EObject current=null] : iv_ruleactual_procedure= ruleactual_procedure EOF ;
    public final EObject entryRuleactual_procedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_procedure = null;


        try {
            // InternalPascal.g:1071:57: (iv_ruleactual_procedure= ruleactual_procedure EOF )
            // InternalPascal.g:1072:2: iv_ruleactual_procedure= ruleactual_procedure EOF
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
    // InternalPascal.g:1078:1: ruleactual_procedure returns [EObject current=null] : ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleactual_procedure() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1084:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:1085:2: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:1085:2: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1086:3: (lv_procedure_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1086:3: (lv_procedure_identifier_0_0= ruleidentifier )
            // InternalPascal.g:1087:4: lv_procedure_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:1107:1: entryRuleactual_variable returns [EObject current=null] : iv_ruleactual_variable= ruleactual_variable EOF ;
    public final EObject entryRuleactual_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_variable = null;


        try {
            // InternalPascal.g:1107:56: (iv_ruleactual_variable= ruleactual_variable EOF )
            // InternalPascal.g:1108:2: iv_ruleactual_variable= ruleactual_variable EOF
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
    // InternalPascal.g:1114:1: ruleactual_variable returns [EObject current=null] : ( (lv_variable_0_0= rulevariable ) ) ;
    public final EObject ruleactual_variable() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1120:2: ( ( (lv_variable_0_0= rulevariable ) ) )
            // InternalPascal.g:1121:2: ( (lv_variable_0_0= rulevariable ) )
            {
            // InternalPascal.g:1121:2: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:1122:3: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:1122:3: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:1123:4: lv_variable_0_0= rulevariable
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
    // InternalPascal.g:1143:1: entryRuleactual_value returns [EObject current=null] : iv_ruleactual_value= ruleactual_value EOF ;
    public final EObject entryRuleactual_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_value = null;


        try {
            // InternalPascal.g:1143:53: (iv_ruleactual_value= ruleactual_value EOF )
            // InternalPascal.g:1144:2: iv_ruleactual_value= ruleactual_value EOF
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
    // InternalPascal.g:1150:1: ruleactual_value returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleactual_value() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1156:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:1157:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:1157:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:1158:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:1158:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:1159:4: lv_expression_0_0= ruleexpression
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
    // InternalPascal.g:1179:1: entryRuleidentifier returns [EObject current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final EObject entryRuleidentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier = null;


        try {
            // InternalPascal.g:1179:51: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascal.g:1180:2: iv_ruleidentifier= ruleidentifier EOF
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
    // InternalPascal.g:1186:1: ruleidentifier returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleidentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1192:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalPascal.g:1193:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalPascal.g:1193:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:1194:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:1194:3: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:1195:4: lv_identifier_0_0= RULE_ID
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
    // InternalPascal.g:1214:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:1214:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:1215:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascal.g:1221:1: ruleassignment_statement returns [EObject current=null] : ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_0_0 = null;

        EObject lv_function_identifier_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1227:2: ( ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:1228:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:1228:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:1229:3: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) )
            {
            // InternalPascal.g:1229:3: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) )
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
                    // InternalPascal.g:1230:4: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1230:4: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1231:5: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1231:5: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1232:6: lv_variable_0_0= rulevariable
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
                    // InternalPascal.g:1250:4: ( (lv_function_identifier_1_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1250:4: ( (lv_function_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:1251:5: (lv_function_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:1251:5: (lv_function_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:1252:6: lv_function_identifier_1_0= ruleidentifier
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

            otherlv_2=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:1274:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:1275:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:1275:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:1276:5: lv_expression_3_0= ruleexpression
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
    // InternalPascal.g:1297:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1297:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1298:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:1304:1: ruleexpression returns [EObject current=null] : ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_relational_operator_1_0 = null;

        EObject lv_simple_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1310:2: ( ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1311:2: ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1311:2: ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1312:3: ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1312:3: ( (lv_simple_expression_0_0= rulesimple_expression ) )
            // InternalPascal.g:1313:4: (lv_simple_expression_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1313:4: (lv_simple_expression_0_0= rulesimple_expression )
            // InternalPascal.g:1314:5: lv_simple_expression_0_0= rulesimple_expression
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

            // InternalPascal.g:1331:3: ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=23 && LA11_0<=29)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1332:4: ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1332:4: ( (lv_relational_operator_1_0= rulerelational_operator ) )
                    // InternalPascal.g:1333:5: (lv_relational_operator_1_0= rulerelational_operator )
                    {
                    // InternalPascal.g:1333:5: (lv_relational_operator_1_0= rulerelational_operator )
                    // InternalPascal.g:1334:6: lv_relational_operator_1_0= rulerelational_operator
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

                    // InternalPascal.g:1351:4: ( (lv_simple_expression_2_0= rulesimple_expression ) )
                    // InternalPascal.g:1352:5: (lv_simple_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1352:5: (lv_simple_expression_2_0= rulesimple_expression )
                    // InternalPascal.g:1353:6: lv_simple_expression_2_0= rulesimple_expression
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
    // InternalPascal.g:1375:1: entryRulerelational_operator returns [String current=null] : iv_rulerelational_operator= rulerelational_operator EOF ;
    public final String entryRulerelational_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_operator = null;


        try {
            // InternalPascal.g:1375:59: (iv_rulerelational_operator= rulerelational_operator EOF )
            // InternalPascal.g:1376:2: iv_rulerelational_operator= rulerelational_operator EOF
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
    // InternalPascal.g:1382:1: rulerelational_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken rulerelational_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1388:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) )
            // InternalPascal.g:1389:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            {
            // InternalPascal.g:1389:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            case 27:
                {
                alt12=5;
                }
                break;
            case 28:
                {
                alt12=6;
                }
                break;
            case 29:
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
                    // InternalPascal.g:1390:3: kw= '='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1396:3: kw= '<>'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1402:3: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1408:3: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1414:3: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1420:3: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getGreaterThanSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPascal.g:1426:3: kw= 'in'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:1435:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1435:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1436:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascal.g:1442:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_term_1_0 = null;

        EObject lv_addition_operator_2_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1448:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* ) )
            // InternalPascal.g:1449:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* )
            {
            // InternalPascal.g:1449:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )* )
            // InternalPascal.g:1450:3: ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )*
            {
            // InternalPascal.g:1450:3: ( (lv_sign_0_0= rulesign ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred22_InternalPascal()) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==46) ) {
                int LA13_2 = input.LA(2);

                if ( (synpred22_InternalPascal()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1451:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:1451:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:1452:5: lv_sign_0_0= rulesign
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

            // InternalPascal.g:1469:3: ( (lv_term_1_0= ruleterm ) )
            // InternalPascal.g:1470:4: (lv_term_1_0= ruleterm )
            {
            // InternalPascal.g:1470:4: (lv_term_1_0= ruleterm )
            // InternalPascal.g:1471:5: lv_term_1_0= ruleterm
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

            // InternalPascal.g:1488:3: ( ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30||(LA14_0>=45 && LA14_0<=46)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1489:4: ( (lv_addition_operator_2_0= ruleaddition_operator ) ) ( (lv_term_3_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1489:4: ( (lv_addition_operator_2_0= ruleaddition_operator ) )
            	    // InternalPascal.g:1490:5: (lv_addition_operator_2_0= ruleaddition_operator )
            	    {
            	    // InternalPascal.g:1490:5: (lv_addition_operator_2_0= ruleaddition_operator )
            	    // InternalPascal.g:1491:6: lv_addition_operator_2_0= ruleaddition_operator
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

            	    // InternalPascal.g:1508:4: ( (lv_term_3_0= ruleterm ) )
            	    // InternalPascal.g:1509:5: (lv_term_3_0= ruleterm )
            	    {
            	    // InternalPascal.g:1509:5: (lv_term_3_0= ruleterm )
            	    // InternalPascal.g:1510:6: lv_term_3_0= ruleterm
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
    // InternalPascal.g:1532:1: entryRuleaddition_operator returns [EObject current=null] : iv_ruleaddition_operator= ruleaddition_operator EOF ;
    public final EObject entryRuleaddition_operator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaddition_operator = null;


        try {
            // InternalPascal.g:1532:58: (iv_ruleaddition_operator= ruleaddition_operator EOF )
            // InternalPascal.g:1533:2: iv_ruleaddition_operator= ruleaddition_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddition_operatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleaddition_operator=ruleaddition_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaddition_operator; 
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
    // InternalPascal.g:1539:1: ruleaddition_operator returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) ) | otherlv_1= 'or' ) ;
    public final EObject ruleaddition_operator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sign_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1545:2: ( ( ( (lv_sign_0_0= rulesign ) ) | otherlv_1= 'or' ) )
            // InternalPascal.g:1546:2: ( ( (lv_sign_0_0= rulesign ) ) | otherlv_1= 'or' )
            {
            // InternalPascal.g:1546:2: ( ( (lv_sign_0_0= rulesign ) ) | otherlv_1= 'or' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=45 && LA15_0<=46)) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
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
                    // InternalPascal.g:1547:3: ( (lv_sign_0_0= rulesign ) )
                    {
                    // InternalPascal.g:1547:3: ( (lv_sign_0_0= rulesign ) )
                    // InternalPascal.g:1548:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:1548:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:1549:5: lv_sign_0_0= rulesign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAddition_operatorAccess().getSignSignParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sign_0_0=rulesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAddition_operatorRule());
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


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1567:3: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_1, grammarAccess.getAddition_operatorAccess().getOrKeyword_1());
                      		
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
    // InternalPascal.g:1575:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1575:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1576:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:1582:1: ruleterm returns [EObject current=null] : ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factor_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplication_operator_1_0 = null;

        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1588:2: ( ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1589:2: ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1589:2: ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* )
            // InternalPascal.g:1590:3: ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1590:3: ( (lv_factor_0_0= rulefactor ) )
            // InternalPascal.g:1591:4: (lv_factor_0_0= rulefactor )
            {
            // InternalPascal.g:1591:4: (lv_factor_0_0= rulefactor )
            // InternalPascal.g:1592:5: lv_factor_0_0= rulefactor
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

            // InternalPascal.g:1609:3: ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1610:4: ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1610:4: ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) )
            	    // InternalPascal.g:1611:5: (lv_multiplication_operator_1_0= rulemultiplication_operator )
            	    {
            	    // InternalPascal.g:1611:5: (lv_multiplication_operator_1_0= rulemultiplication_operator )
            	    // InternalPascal.g:1612:6: lv_multiplication_operator_1_0= rulemultiplication_operator
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

            	    // InternalPascal.g:1629:4: ( (lv_factor_2_0= rulefactor ) )
            	    // InternalPascal.g:1630:5: (lv_factor_2_0= rulefactor )
            	    {
            	    // InternalPascal.g:1630:5: (lv_factor_2_0= rulefactor )
            	    // InternalPascal.g:1631:6: lv_factor_2_0= rulefactor
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
    // InternalPascal.g:1653:1: entryRulemultiplication_operator returns [String current=null] : iv_rulemultiplication_operator= rulemultiplication_operator EOF ;
    public final String entryRulemultiplication_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplication_operator = null;


        try {
            // InternalPascal.g:1653:63: (iv_rulemultiplication_operator= rulemultiplication_operator EOF )
            // InternalPascal.g:1654:2: iv_rulemultiplication_operator= rulemultiplication_operator EOF
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
    // InternalPascal.g:1660:1: rulemultiplication_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken rulemultiplication_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1666:2: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) )
            // InternalPascal.g:1667:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            {
            // InternalPascal.g:1667:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case 32:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            case 34:
                {
                alt17=4;
                }
                break;
            case 35:
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
                    // InternalPascal.g:1668:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1674:3: kw= '/'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1680:3: kw= 'div'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getDivKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1686:3: kw= 'mod'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getModKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1692:3: kw= 'and'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:1701:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1701:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1702:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:1708:1: rulefactor returns [EObject current=null] : ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_boolean_6_0= ruleboolean ) ) | ( (lv_identifier_7_0= ruleidentifier ) ) | ( (lv_function_designator_8_0= rulefunction_designator ) ) | (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' ) | (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_strings_3_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_variable_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_set_4_0 = null;

        AntlrDatatypeRuleToken lv_boolean_6_0 = null;

        EObject lv_identifier_7_0 = null;

        EObject lv_function_designator_8_0 = null;

        EObject lv_expression_10_0 = null;

        EObject lv_factor_13_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1714:2: ( ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_boolean_6_0= ruleboolean ) ) | ( (lv_identifier_7_0= ruleidentifier ) ) | ( (lv_function_designator_8_0= rulefunction_designator ) ) | (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' ) | (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1715:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_boolean_6_0= ruleboolean ) ) | ( (lv_identifier_7_0= ruleidentifier ) ) | ( (lv_function_designator_8_0= rulefunction_designator ) ) | (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' ) | (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1715:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_boolean_6_0= ruleboolean ) ) | ( (lv_identifier_7_0= ruleidentifier ) ) | ( (lv_function_designator_8_0= rulefunction_designator ) ) | (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' ) | (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) ) )
            int alt18=10;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1716:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
                    {
                    // InternalPascal.g:1716:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
                    // InternalPascal.g:1717:4: () ( (lv_variable_1_0= rulevariable ) )
                    {
                    // InternalPascal.g:1717:4: ()
                    // InternalPascal.g:1718:5: 
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

                    // InternalPascal.g:1727:4: ( (lv_variable_1_0= rulevariable ) )
                    // InternalPascal.g:1728:5: (lv_variable_1_0= rulevariable )
                    {
                    // InternalPascal.g:1728:5: (lv_variable_1_0= rulevariable )
                    // InternalPascal.g:1729:6: lv_variable_1_0= rulevariable
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
                    // InternalPascal.g:1748:3: ( (lv_number_2_0= rulenumber ) )
                    {
                    // InternalPascal.g:1748:3: ( (lv_number_2_0= rulenumber ) )
                    // InternalPascal.g:1749:4: (lv_number_2_0= rulenumber )
                    {
                    // InternalPascal.g:1749:4: (lv_number_2_0= rulenumber )
                    // InternalPascal.g:1750:5: lv_number_2_0= rulenumber
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
                    // InternalPascal.g:1768:3: ( (lv_strings_3_0= RULE_STRINGS ) )
                    {
                    // InternalPascal.g:1768:3: ( (lv_strings_3_0= RULE_STRINGS ) )
                    // InternalPascal.g:1769:4: (lv_strings_3_0= RULE_STRINGS )
                    {
                    // InternalPascal.g:1769:4: (lv_strings_3_0= RULE_STRINGS )
                    // InternalPascal.g:1770:5: lv_strings_3_0= RULE_STRINGS
                    {
                    lv_strings_3_0=(Token)match(input,RULE_STRINGS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_strings_3_0, grammarAccess.getFactorAccess().getStringsStringsTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"strings",
                      						lv_strings_3_0,
                      						"org.xtext.example.pascal.Pascal.strings");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1787:3: ( (lv_set_4_0= ruleset ) )
                    {
                    // InternalPascal.g:1787:3: ( (lv_set_4_0= ruleset ) )
                    // InternalPascal.g:1788:4: (lv_set_4_0= ruleset )
                    {
                    // InternalPascal.g:1788:4: (lv_set_4_0= ruleset )
                    // InternalPascal.g:1789:5: lv_set_4_0= ruleset
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
                    // InternalPascal.g:1807:3: otherlv_5= 'nil'
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getNilKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1812:3: ( (lv_boolean_6_0= ruleboolean ) )
                    {
                    // InternalPascal.g:1812:3: ( (lv_boolean_6_0= ruleboolean ) )
                    // InternalPascal.g:1813:4: (lv_boolean_6_0= ruleboolean )
                    {
                    // InternalPascal.g:1813:4: (lv_boolean_6_0= ruleboolean )
                    // InternalPascal.g:1814:5: lv_boolean_6_0= ruleboolean
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getBooleanBooleanParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_boolean_6_0=ruleboolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"boolean",
                      						lv_boolean_6_0,
                      						"org.xtext.example.pascal.Pascal.boolean");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1832:3: ( (lv_identifier_7_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1832:3: ( (lv_identifier_7_0= ruleidentifier ) )
                    // InternalPascal.g:1833:4: (lv_identifier_7_0= ruleidentifier )
                    {
                    // InternalPascal.g:1833:4: (lv_identifier_7_0= ruleidentifier )
                    // InternalPascal.g:1834:5: lv_identifier_7_0= ruleidentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getIdentifierIdentifierParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_identifier_7_0=ruleidentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"identifier",
                      						lv_identifier_7_0,
                      						"org.xtext.example.pascal.Pascal.identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1852:3: ( (lv_function_designator_8_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1852:3: ( (lv_function_designator_8_0= rulefunction_designator ) )
                    // InternalPascal.g:1853:4: (lv_function_designator_8_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1853:4: (lv_function_designator_8_0= rulefunction_designator )
                    // InternalPascal.g:1854:5: lv_function_designator_8_0= rulefunction_designator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorFunction_designatorParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_designator_8_0=rulefunction_designator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"function_designator",
                      						lv_function_designator_8_0,
                      						"org.xtext.example.pascal.Pascal.function_designator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1872:3: (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' )
                    {
                    // InternalPascal.g:1872:3: (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' )
                    // InternalPascal.g:1873:4: otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    // InternalPascal.g:1877:4: ( (lv_expression_10_0= ruleexpression ) )
                    // InternalPascal.g:1878:5: (lv_expression_10_0= ruleexpression )
                    {
                    // InternalPascal.g:1878:5: (lv_expression_10_0= ruleexpression )
                    // InternalPascal.g:1879:6: lv_expression_10_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_expression_10_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_10_0,
                      							"org.xtext.example.pascal.Pascal.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1902:3: (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1902:3: (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) )
                    // InternalPascal.g:1903:4: otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) )
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                      			
                    }
                    // InternalPascal.g:1907:4: ( (lv_factor_13_0= rulefactor ) )
                    // InternalPascal.g:1908:5: (lv_factor_13_0= rulefactor )
                    {
                    // InternalPascal.g:1908:5: (lv_factor_13_0= rulefactor )
                    // InternalPascal.g:1909:6: lv_factor_13_0= rulefactor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_factor_13_0=rulefactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"factor",
                      							lv_factor_13_0,
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


    // $ANTLR start "entryRuleboolean"
    // InternalPascal.g:1931:1: entryRuleboolean returns [String current=null] : iv_ruleboolean= ruleboolean EOF ;
    public final String entryRuleboolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean = null;


        try {
            // InternalPascal.g:1931:47: (iv_ruleboolean= ruleboolean EOF )
            // InternalPascal.g:1932:2: iv_ruleboolean= ruleboolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleboolean=ruleboolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolean.getText(); 
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
    // $ANTLR end "entryRuleboolean"


    // $ANTLR start "ruleboolean"
    // InternalPascal.g:1938:1: ruleboolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleboolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1944:2: ( (kw= 'True' | kw= 'False' ) )
            // InternalPascal.g:1945:2: (kw= 'True' | kw= 'False' )
            {
            // InternalPascal.g:1945:2: (kw= 'True' | kw= 'False' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1946:3: kw= 'True'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1952:3: kw= 'False'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
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
    // $ANTLR end "ruleboolean"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:1961:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1961:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1962:2: iv_rulefunction_designator= rulefunction_designator EOF
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
    // InternalPascal.g:1968:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject lv_function_identifier_0_0 = null;

        EObject lv_actual_parameter_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1974:2: ( ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) )
            // InternalPascal.g:1975:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            {
            // InternalPascal.g:1975:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            // InternalPascal.g:1976:3: ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            {
            // InternalPascal.g:1976:3: ( (lv_function_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1977:4: (lv_function_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1977:4: (lv_function_identifier_0_0= ruleidentifier )
            // InternalPascal.g:1978:5: lv_function_identifier_0_0= ruleidentifier
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

            // InternalPascal.g:1995:3: ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1996:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    {
                    // InternalPascal.g:1996:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    // InternalPascal.g:1997:5: lv_actual_parameter_list_1_0= ruleactual_parameter_list
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
    // InternalPascal.g:2018:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:2018:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:2019:2: iv_ruleset= ruleset EOF
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
    // InternalPascal.g:2025:1: ruleset returns [EObject current=null] : (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2031:2: ( (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' ) )
            // InternalPascal.g:2032:2: (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' )
            {
            // InternalPascal.g:2032:2: (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' )
            // InternalPascal.g:2033:3: otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalPascal.g:2037:3: ( (lv_element_list_1_0= ruleelement_list ) )
            // InternalPascal.g:2038:4: (lv_element_list_1_0= ruleelement_list )
            {
            // InternalPascal.g:2038:4: (lv_element_list_1_0= ruleelement_list )
            // InternalPascal.g:2039:5: lv_element_list_1_0= ruleelement_list
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

            otherlv_2=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:2064:1: entryRuleelement_list returns [EObject current=null] : iv_ruleelement_list= ruleelement_list EOF ;
    public final EObject entryRuleelement_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_list = null;


        try {
            // InternalPascal.g:2064:53: (iv_ruleelement_list= ruleelement_list EOF )
            // InternalPascal.g:2065:2: iv_ruleelement_list= ruleelement_list EOF
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
    // InternalPascal.g:2071:1: ruleelement_list returns [EObject current=null] : ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? ) ;
    public final EObject ruleelement_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2077:2: ( ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? ) )
            // InternalPascal.g:2078:2: ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? )
            {
            // InternalPascal.g:2078:2: ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? )
            // InternalPascal.g:2079:3: () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )?
            {
            // InternalPascal.g:2079:3: ()
            // InternalPascal.g:2080:4: 
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

            // InternalPascal.g:2089:3: ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==14||(LA22_0>=36 && LA22_0<=40)||(LA22_0>=45 && LA22_0<=46)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2090:4: ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )*
                    {
                    // InternalPascal.g:2090:4: ( (lv_expression_1_0= ruleexpression ) )
                    // InternalPascal.g:2091:5: (lv_expression_1_0= ruleexpression )
                    {
                    // InternalPascal.g:2091:5: (lv_expression_1_0= ruleexpression )
                    // InternalPascal.g:2092:6: lv_expression_1_0= ruleexpression
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

                    // InternalPascal.g:2109:4: (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPascal.g:2110:5: otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getElement_listAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPascal.g:2114:5: ( (lv_expression_3_0= ruleexpression ) )
                    	    // InternalPascal.g:2115:6: (lv_expression_3_0= ruleexpression )
                    	    {
                    	    // InternalPascal.g:2115:6: (lv_expression_3_0= ruleexpression )
                    	    // InternalPascal.g:2116:7: lv_expression_3_0= ruleexpression
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
                    	    break loop21;
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


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:2139:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2139:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2140:2: iv_rulenumber= rulenumber EOF
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
    // InternalPascal.g:2146:1: rulenumber returns [EObject current=null] : ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_integer_number_0_0 = null;

        EObject lv_real_number_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2152:2: ( ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) ) )
            // InternalPascal.g:2153:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) )
            {
            // InternalPascal.g:2153:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case 45:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_INT) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==EOF||(LA23_3>=15 && LA23_3<=17)||(LA23_3>=19 && LA23_3<=20)||(LA23_3>=23 && LA23_3<=35)||LA23_3==41||(LA23_3>=45 && LA23_3<=46)||LA23_3==48||LA23_3==50||(LA23_3>=52 && LA23_3<=53)||(LA23_3>=55 && LA23_3<=56)||LA23_3==58||LA23_3==68) ) {
                        alt23=1;
                    }
                    else if ( (LA23_3==12||(LA23_3>=42 && LA23_3<=43)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_INT) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==EOF||(LA23_3>=15 && LA23_3<=17)||(LA23_3>=19 && LA23_3<=20)||(LA23_3>=23 && LA23_3<=35)||LA23_3==41||(LA23_3>=45 && LA23_3<=46)||LA23_3==48||LA23_3==50||(LA23_3>=52 && LA23_3<=53)||(LA23_3>=55 && LA23_3<=56)||LA23_3==58||LA23_3==68) ) {
                        alt23=1;
                    }
                    else if ( (LA23_3==12||(LA23_3>=42 && LA23_3<=43)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==EOF||(LA23_3>=15 && LA23_3<=17)||(LA23_3>=19 && LA23_3<=20)||(LA23_3>=23 && LA23_3<=35)||LA23_3==41||(LA23_3>=45 && LA23_3<=46)||LA23_3==48||LA23_3==50||(LA23_3>=52 && LA23_3<=53)||(LA23_3>=55 && LA23_3<=56)||LA23_3==58||LA23_3==68) ) {
                    alt23=1;
                }
                else if ( (LA23_3==12||(LA23_3>=42 && LA23_3<=43)) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2154:3: ( (lv_integer_number_0_0= ruleinteger_number ) )
                    {
                    // InternalPascal.g:2154:3: ( (lv_integer_number_0_0= ruleinteger_number ) )
                    // InternalPascal.g:2155:4: (lv_integer_number_0_0= ruleinteger_number )
                    {
                    // InternalPascal.g:2155:4: (lv_integer_number_0_0= ruleinteger_number )
                    // InternalPascal.g:2156:5: lv_integer_number_0_0= ruleinteger_number
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
                    // InternalPascal.g:2174:3: ( (lv_real_number_1_0= rulereal_number ) )
                    {
                    // InternalPascal.g:2174:3: ( (lv_real_number_1_0= rulereal_number ) )
                    // InternalPascal.g:2175:4: (lv_real_number_1_0= rulereal_number )
                    {
                    // InternalPascal.g:2175:4: (lv_real_number_1_0= rulereal_number )
                    // InternalPascal.g:2176:5: lv_real_number_1_0= rulereal_number
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
    // InternalPascal.g:2197:1: entryRulereal_number returns [EObject current=null] : iv_rulereal_number= rulereal_number EOF ;
    public final EObject entryRulereal_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_number = null;


        try {
            // InternalPascal.g:2197:52: (iv_rulereal_number= rulereal_number EOF )
            // InternalPascal.g:2198:2: iv_rulereal_number= rulereal_number EOF
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
    // InternalPascal.g:2204:1: rulereal_number returns [EObject current=null] : ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) ) ;
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
            // InternalPascal.g:2210:2: ( ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) ) )
            // InternalPascal.g:2211:2: ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) )
            {
            // InternalPascal.g:2211:2: ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) )
            int alt26=2;
            switch ( input.LA(1) ) {
            case 45:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INT) ) {
                    int LA26_3 = input.LA(3);

                    if ( ((LA26_3>=42 && LA26_3<=43)) ) {
                        alt26=2;
                    }
                    else if ( (LA26_3==12) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_INT) ) {
                    int LA26_3 = input.LA(3);

                    if ( ((LA26_3>=42 && LA26_3<=43)) ) {
                        alt26=2;
                    }
                    else if ( (LA26_3==12) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA26_3 = input.LA(2);

                if ( ((LA26_3>=42 && LA26_3<=43)) ) {
                    alt26=2;
                }
                else if ( (LA26_3==12) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2212:3: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? )
                    {
                    // InternalPascal.g:2212:3: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? )
                    // InternalPascal.g:2213:4: ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )?
                    {
                    // InternalPascal.g:2213:4: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
                    // InternalPascal.g:2214:5: (lv_digit_sequence_0_0= ruledigit_sequence )
                    {
                    // InternalPascal.g:2214:5: (lv_digit_sequence_0_0= ruledigit_sequence )
                    // InternalPascal.g:2215:6: lv_digit_sequence_0_0= ruledigit_sequence
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

                    otherlv_1=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReal_numberAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalPascal.g:2236:4: ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case 45:
                            {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==RULE_INT) ) {
                                int LA24_5 = input.LA(3);

                                if ( (synpred44_InternalPascal()) ) {
                                    alt24=1;
                                }
                            }
                            }
                            break;
                        case 46:
                            {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==RULE_INT) ) {
                                int LA24_5 = input.LA(3);

                                if ( (synpred44_InternalPascal()) ) {
                                    alt24=1;
                                }
                            }
                            }
                            break;
                        case RULE_INT:
                            {
                            alt24=1;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalPascal.g:2237:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
                            {
                            // InternalPascal.g:2237:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
                            // InternalPascal.g:2238:6: lv_digit_sequence2_2_0= ruledigit_sequence
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequence2Digit_sequenceParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FOLLOW_25);
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

                    // InternalPascal.g:2255:4: ( (lv_scale_factor_3_0= rulescale_factor ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=42 && LA25_0<=43)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalPascal.g:2256:5: (lv_scale_factor_3_0= rulescale_factor )
                            {
                            // InternalPascal.g:2256:5: (lv_scale_factor_3_0= rulescale_factor )
                            // InternalPascal.g:2257:6: lv_scale_factor_3_0= rulescale_factor
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
                    // InternalPascal.g:2276:3: ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) )
                    {
                    // InternalPascal.g:2276:3: ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) )
                    // InternalPascal.g:2277:4: ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) )
                    {
                    // InternalPascal.g:2277:4: ( (lv_digit_sequence_4_0= ruledigit_sequence ) )
                    // InternalPascal.g:2278:5: (lv_digit_sequence_4_0= ruledigit_sequence )
                    {
                    // InternalPascal.g:2278:5: (lv_digit_sequence_4_0= ruledigit_sequence )
                    // InternalPascal.g:2279:6: lv_digit_sequence_4_0= ruledigit_sequence
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReal_numberAccess().getDigit_sequenceDigit_sequenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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

                    // InternalPascal.g:2296:4: ( (lv_scale_factor_5_0= rulescale_factor ) )
                    // InternalPascal.g:2297:5: (lv_scale_factor_5_0= rulescale_factor )
                    {
                    // InternalPascal.g:2297:5: (lv_scale_factor_5_0= rulescale_factor )
                    // InternalPascal.g:2298:6: lv_scale_factor_5_0= rulescale_factor
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
    // InternalPascal.g:2320:1: entryRulescale_factor returns [EObject current=null] : iv_rulescale_factor= rulescale_factor EOF ;
    public final EObject entryRulescale_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescale_factor = null;


        try {
            // InternalPascal.g:2320:53: (iv_rulescale_factor= rulescale_factor EOF )
            // InternalPascal.g:2321:2: iv_rulescale_factor= rulescale_factor EOF
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
    // InternalPascal.g:2327:1: rulescale_factor returns [EObject current=null] : ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) ;
    public final EObject rulescale_factor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sign_2_0 = null;

        EObject lv_digit_sequence_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2333:2: ( ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) )
            // InternalPascal.g:2334:2: ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            {
            // InternalPascal.g:2334:2: ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            // InternalPascal.g:2335:3: (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            {
            // InternalPascal.g:2335:3: (otherlv_0= 'E' | otherlv_1= 'e' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            else if ( (LA27_0==43) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2336:4: otherlv_0= 'E'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getScale_factorAccess().getEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2341:4: otherlv_1= 'e'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getScale_factorAccess().getEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:2346:3: ( (lv_sign_2_0= rulesign ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred48_InternalPascal()) ) {
                    alt28=1;
                }
            }
            else if ( (LA28_0==46) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred48_InternalPascal()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2347:4: (lv_sign_2_0= rulesign )
                    {
                    // InternalPascal.g:2347:4: (lv_sign_2_0= rulesign )
                    // InternalPascal.g:2348:5: lv_sign_2_0= rulesign
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

            // InternalPascal.g:2365:3: ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            // InternalPascal.g:2366:4: (lv_digit_sequence_3_0= ruledigit_sequence )
            {
            // InternalPascal.g:2366:4: (lv_digit_sequence_3_0= ruledigit_sequence )
            // InternalPascal.g:2367:5: lv_digit_sequence_3_0= ruledigit_sequence
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
    // InternalPascal.g:2388:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:2388:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:2389:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:2395:1: rulevariable returns [EObject current=null] : ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* ) ;
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
            // InternalPascal.g:2401:2: ( ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* ) )
            // InternalPascal.g:2402:2: ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* )
            {
            // InternalPascal.g:2402:2: ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* )
            // InternalPascal.g:2403:3: ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )*
            {
            // InternalPascal.g:2403:3: ( (lv_entire_variable_0_0= ruleentire_variable ) )
            // InternalPascal.g:2404:4: (lv_entire_variable_0_0= ruleentire_variable )
            {
            // InternalPascal.g:2404:4: (lv_entire_variable_0_0= ruleentire_variable )
            // InternalPascal.g:2405:5: lv_entire_variable_0_0= ruleentire_variable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getEntire_variableEntire_variableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            // InternalPascal.g:2422:3: (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2423:4: otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2427:4: ( (lv_expression_list_2_0= ruleexpression_list ) )
            	    // InternalPascal.g:2428:5: (lv_expression_list_2_0= ruleexpression_list )
            	    {
            	    // InternalPascal.g:2428:5: (lv_expression_list_2_0= ruleexpression_list )
            	    // InternalPascal.g:2429:6: lv_expression_list_2_0= ruleexpression_list
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

            	    otherlv_3=(Token)match(input,41,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalPascal.g:2451:3: (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==12) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2452:4: otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2456:4: ( (lv_field_identifier_5_0= ruleidentifier ) )
            	    // InternalPascal.g:2457:5: (lv_field_identifier_5_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:2457:5: (lv_field_identifier_5_0= ruleidentifier )
            	    // InternalPascal.g:2458:6: lv_field_identifier_5_0= ruleidentifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariableAccess().getField_identifierIdentifierParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop30;
                }
            } while (true);

            // InternalPascal.g:2476:3: (otherlv_6= '^' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    int LA31_1 = input.LA(2);

                    if ( (synpred51_InternalPascal()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2477:4: otherlv_6= '^'
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalPascal.g:2482:3: (otherlv_7= '^' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:2483:4: otherlv_7= '^'
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPascal.g:2492:1: entryRuleentire_variable returns [EObject current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final EObject entryRuleentire_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentire_variable = null;


        try {
            // InternalPascal.g:2492:56: (iv_ruleentire_variable= ruleentire_variable EOF )
            // InternalPascal.g:2493:2: iv_ruleentire_variable= ruleentire_variable EOF
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
    // InternalPascal.g:2499:1: ruleentire_variable returns [EObject current=null] : ( (lv_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleentire_variable() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2505:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:2506:2: ( (lv_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:2506:2: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:2507:3: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:2507:3: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:2508:4: lv_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:2528:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:2528:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:2529:2: iv_ruleexpression_list= ruleexpression_list EOF
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
    // InternalPascal.g:2535:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2541:2: ( ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:2542:2: ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:2542:2: ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:2543:3: ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:2543:3: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:2544:4: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:2544:4: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:2545:5: lv_expression_0_0= ruleexpression
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

            // InternalPascal.g:2562:3: (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:2563:4: otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2567:4: ( (lv_expression_2_0= ruleexpression ) )
            	    // InternalPascal.g:2568:5: (lv_expression_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:2568:5: (lv_expression_2_0= ruleexpression )
            	    // InternalPascal.g:2569:6: lv_expression_2_0= ruleexpression
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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:2591:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:2591:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:2592:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:2598:1: rulelabel returns [EObject current=null] : ( (lv_integer_number_0_0= ruleinteger_number ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        EObject lv_integer_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2604:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) )
            // InternalPascal.g:2605:2: ( (lv_integer_number_0_0= ruleinteger_number ) )
            {
            // InternalPascal.g:2605:2: ( (lv_integer_number_0_0= ruleinteger_number ) )
            // InternalPascal.g:2606:3: (lv_integer_number_0_0= ruleinteger_number )
            {
            // InternalPascal.g:2606:3: (lv_integer_number_0_0= ruleinteger_number )
            // InternalPascal.g:2607:4: lv_integer_number_0_0= ruleinteger_number
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
    // InternalPascal.g:2627:1: entryRuleinteger_number returns [EObject current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final EObject entryRuleinteger_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_number = null;


        try {
            // InternalPascal.g:2627:55: (iv_ruleinteger_number= ruleinteger_number EOF )
            // InternalPascal.g:2628:2: iv_ruleinteger_number= ruleinteger_number EOF
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
    // InternalPascal.g:2634:1: ruleinteger_number returns [EObject current=null] : ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) ;
    public final EObject ruleinteger_number() throws RecognitionException {
        EObject current = null;

        EObject lv_digit_sequence_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2640:2: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) )
            // InternalPascal.g:2641:2: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
            {
            // InternalPascal.g:2641:2: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
            // InternalPascal.g:2642:3: (lv_digit_sequence_0_0= ruledigit_sequence )
            {
            // InternalPascal.g:2642:3: (lv_digit_sequence_0_0= ruledigit_sequence )
            // InternalPascal.g:2643:4: lv_digit_sequence_0_0= ruledigit_sequence
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
    // InternalPascal.g:2663:1: entryRuledigit_sequence returns [EObject current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final EObject entryRuledigit_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledigit_sequence = null;


        try {
            // InternalPascal.g:2663:55: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // InternalPascal.g:2664:2: iv_ruledigit_sequence= ruledigit_sequence EOF
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
    // InternalPascal.g:2670:1: ruledigit_sequence returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) ) ;
    public final EObject ruledigit_sequence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        AntlrDatatypeRuleToken lv_unsigned_digit_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2676:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) ) )
            // InternalPascal.g:2677:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) )
            {
            // InternalPascal.g:2677:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) )
            // InternalPascal.g:2678:3: ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) )
            {
            // InternalPascal.g:2678:3: ( (lv_sign_0_0= rulesign ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=45 && LA34_0<=46)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:2679:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:2679:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:2680:5: lv_sign_0_0= rulesign
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

            // InternalPascal.g:2697:3: ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) )
            // InternalPascal.g:2698:4: (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence )
            {
            // InternalPascal.g:2698:4: (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence )
            // InternalPascal.g:2699:5: lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence
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
    // InternalPascal.g:2720:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:2720:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:2721:2: iv_rulesign= rulesign EOF
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
    // InternalPascal.g:2727:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2733:2: ( (kw= '+' | kw= '-' ) )
            // InternalPascal.g:2734:2: (kw= '+' | kw= '-' )
            {
            // InternalPascal.g:2734:2: (kw= '+' | kw= '-' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            else if ( (LA35_0==46) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:2735:3: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2741:3: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:2750:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // InternalPascal.g:2750:63: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // InternalPascal.g:2751:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
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
    // InternalPascal.g:2757:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2763:2: (this_INT_0= RULE_INT )
            // InternalPascal.g:2764:2: this_INT_0= RULE_INT
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
    // InternalPascal.g:2774:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2774:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2775:2: iv_rulestructured_statement= rulestructured_statement EOF
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
    // InternalPascal.g:2781:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_statement_0_0 = null;

        EObject lv_repetitive_statement_1_0 = null;

        EObject lv_conditional_statement_2_0 = null;

        EObject lv_with_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2787:2: ( ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) ) )
            // InternalPascal.g:2788:2: ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) )
            {
            // InternalPascal.g:2788:2: ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt36=1;
                }
                break;
            case 54:
            case 57:
            case 59:
                {
                alt36=2;
                }
                break;
            case 49:
            case 51:
                {
                alt36=3;
                }
                break;
            case 47:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalPascal.g:2789:3: ( (lv_compound_statement_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:2789:3: ( (lv_compound_statement_0_0= rulecompound_statement ) )
                    // InternalPascal.g:2790:4: (lv_compound_statement_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:2790:4: (lv_compound_statement_0_0= rulecompound_statement )
                    // InternalPascal.g:2791:5: lv_compound_statement_0_0= rulecompound_statement
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
                    // InternalPascal.g:2809:3: ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) )
                    {
                    // InternalPascal.g:2809:3: ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) )
                    // InternalPascal.g:2810:4: (lv_repetitive_statement_1_0= rulerepetitive_statement )
                    {
                    // InternalPascal.g:2810:4: (lv_repetitive_statement_1_0= rulerepetitive_statement )
                    // InternalPascal.g:2811:5: lv_repetitive_statement_1_0= rulerepetitive_statement
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
                    // InternalPascal.g:2829:3: ( (lv_conditional_statement_2_0= ruleconditional_statement ) )
                    {
                    // InternalPascal.g:2829:3: ( (lv_conditional_statement_2_0= ruleconditional_statement ) )
                    // InternalPascal.g:2830:4: (lv_conditional_statement_2_0= ruleconditional_statement )
                    {
                    // InternalPascal.g:2830:4: (lv_conditional_statement_2_0= ruleconditional_statement )
                    // InternalPascal.g:2831:5: lv_conditional_statement_2_0= ruleconditional_statement
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
                    // InternalPascal.g:2849:3: ( (lv_with_statement_3_0= rulewith_statement ) )
                    {
                    // InternalPascal.g:2849:3: ( (lv_with_statement_3_0= rulewith_statement ) )
                    // InternalPascal.g:2850:4: (lv_with_statement_3_0= rulewith_statement )
                    {
                    // InternalPascal.g:2850:4: (lv_with_statement_3_0= rulewith_statement )
                    // InternalPascal.g:2851:5: lv_with_statement_3_0= rulewith_statement
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
    // InternalPascal.g:2872:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // InternalPascal.g:2872:55: (iv_rulewith_statement= rulewith_statement EOF )
            // InternalPascal.g:2873:2: iv_rulewith_statement= rulewith_statement EOF
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
    // InternalPascal.g:2879:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) ;
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
            // InternalPascal.g:2885:2: ( (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) )
            // InternalPascal.g:2886:2: (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            {
            // InternalPascal.g:2886:2: (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            // InternalPascal.g:2887:3: otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
              		
            }
            // InternalPascal.g:2891:3: ( (lv_variable_1_0= rulevariable ) )
            // InternalPascal.g:2892:4: (lv_variable_1_0= rulevariable )
            {
            // InternalPascal.g:2892:4: (lv_variable_1_0= rulevariable )
            // InternalPascal.g:2893:5: lv_variable_1_0= rulevariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWith_statementAccess().getVariableVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            // InternalPascal.g:2910:3: (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==17) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:2911:4: otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2915:4: ( (lv_variable_3_0= rulevariable ) )
            	    // InternalPascal.g:2916:5: (lv_variable_3_0= rulevariable )
            	    {
            	    // InternalPascal.g:2916:5: (lv_variable_3_0= rulevariable )
            	    // InternalPascal.g:2917:6: lv_variable_3_0= rulevariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWith_statementAccess().getVariableVariableParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
              		
            }
            // InternalPascal.g:2939:3: ( (lv_statement_5_0= rulestatement ) )
            // InternalPascal.g:2940:4: (lv_statement_5_0= rulestatement )
            {
            // InternalPascal.g:2940:4: (lv_statement_5_0= rulestatement )
            // InternalPascal.g:2941:5: lv_statement_5_0= rulestatement
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
    // InternalPascal.g:2962:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascal.g:2962:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascal.g:2963:2: iv_ruleconditional_statement= ruleconditional_statement EOF
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
    // InternalPascal.g:2969:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_if_statement_0_0 = null;

        EObject lv_case_statement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2975:2: ( ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) ) )
            // InternalPascal.g:2976:2: ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) )
            {
            // InternalPascal.g:2976:2: ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            else if ( (LA38_0==49) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:2977:3: ( (lv_if_statement_0_0= ruleif_statement ) )
                    {
                    // InternalPascal.g:2977:3: ( (lv_if_statement_0_0= ruleif_statement ) )
                    // InternalPascal.g:2978:4: (lv_if_statement_0_0= ruleif_statement )
                    {
                    // InternalPascal.g:2978:4: (lv_if_statement_0_0= ruleif_statement )
                    // InternalPascal.g:2979:5: lv_if_statement_0_0= ruleif_statement
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
                    // InternalPascal.g:2997:3: ( (lv_case_statement_1_0= rulecase_statement ) )
                    {
                    // InternalPascal.g:2997:3: ( (lv_case_statement_1_0= rulecase_statement ) )
                    // InternalPascal.g:2998:4: (lv_case_statement_1_0= rulecase_statement )
                    {
                    // InternalPascal.g:2998:4: (lv_case_statement_1_0= rulecase_statement )
                    // InternalPascal.g:2999:5: lv_case_statement_1_0= rulecase_statement
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
    // InternalPascal.g:3020:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalPascal.g:3020:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalPascal.g:3021:2: iv_rulecase_statement= rulecase_statement EOF
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
    // InternalPascal.g:3027:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) ;
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
            // InternalPascal.g:3033:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) )
            // InternalPascal.g:3034:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            {
            // InternalPascal.g:3034:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            // InternalPascal.g:3035:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:3039:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3040:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3040:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3041:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,50,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
              		
            }
            // InternalPascal.g:3062:3: ( (lv_case_limb_3_0= rulecase_limb ) )
            // InternalPascal.g:3063:4: (lv_case_limb_3_0= rulecase_limb )
            {
            // InternalPascal.g:3063:4: (lv_case_limb_3_0= rulecase_limb )
            // InternalPascal.g:3064:5: lv_case_limb_3_0= rulecase_limb
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbCase_limbParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            // InternalPascal.g:3081:3: (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==16) ) {
                    int LA39_1 = input.LA(2);

                    if ( ((LA39_1>=RULE_ID && LA39_1<=RULE_INT)||(LA39_1>=45 && LA39_1<=46)) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:3082:4: otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	      			
            	    }
            	    // InternalPascal.g:3086:4: ( (lv_case_limb_5_0= rulecase_limb ) )
            	    // InternalPascal.g:3087:5: (lv_case_limb_5_0= rulecase_limb )
            	    {
            	    // InternalPascal.g:3087:5: (lv_case_limb_5_0= rulecase_limb )
            	    // InternalPascal.g:3088:6: lv_case_limb_5_0= rulecase_limb
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbCase_limbParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop39;
                }
            } while (true);

            // InternalPascal.g:3106:3: (otherlv_6= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:3107:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:3120:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // InternalPascal.g:3120:50: (iv_rulecase_limb= rulecase_limb EOF )
            // InternalPascal.g:3121:2: iv_rulecase_limb= rulecase_limb EOF
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
    // InternalPascal.g:3127:1: rulecase_limb returns [EObject current=null] : ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_case_label_list_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3133:2: ( ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalPascal.g:3134:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:3134:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalPascal.g:3135:3: ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalPascal.g:3135:3: ( (lv_case_label_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:3136:4: (lv_case_label_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:3136:4: (lv_case_label_list_0_0= rulecase_label_list )
            // InternalPascal.g:3137:5: lv_case_label_list_0_0= rulecase_label_list
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

            otherlv_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:3158:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalPascal.g:3159:4: (lv_statement_2_0= rulestatement )
            {
            // InternalPascal.g:3159:4: (lv_statement_2_0= rulestatement )
            // InternalPascal.g:3160:5: lv_statement_2_0= rulestatement
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
    // InternalPascal.g:3181:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalPascal.g:3181:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalPascal.g:3182:2: iv_rulecase_label_list= rulecase_label_list EOF
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
    // InternalPascal.g:3188:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3194:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:3195:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:3195:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:3196:3: ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:3196:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:3197:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:3197:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:3198:5: lv_constant_0_0= ruleconstant
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

            // InternalPascal.g:3215:3: (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:3216:4: otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3220:4: ( (lv_constant_2_0= ruleconstant ) )
            	    // InternalPascal.g:3221:5: (lv_constant_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:3221:5: (lv_constant_2_0= ruleconstant )
            	    // InternalPascal.g:3222:6: lv_constant_2_0= ruleconstant
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
            	    break loop41;
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
    // InternalPascal.g:3244:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalPascal.g:3244:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalPascal.g:3245:2: iv_ruleif_statement= ruleif_statement EOF
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
    // InternalPascal.g:3251:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? ) ;
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
            // InternalPascal.g:3257:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? ) )
            // InternalPascal.g:3258:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? )
            {
            // InternalPascal.g:3258:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? )
            // InternalPascal.g:3259:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
              		
            }
            // InternalPascal.g:3263:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3264:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3264:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3265:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,52,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
              		
            }
            // InternalPascal.g:3286:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:3287:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:3287:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:3288:5: lv_statement_3_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIf_statementAccess().getStatementStatementParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            // InternalPascal.g:3305:3: (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred64_InternalPascal()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:3306:4: otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalPascal.g:3310:4: ( (lv_statement_5_0= rulestatement ) )
                    // InternalPascal.g:3311:5: (lv_statement_5_0= rulestatement )
                    {
                    // InternalPascal.g:3311:5: (lv_statement_5_0= rulestatement )
                    // InternalPascal.g:3312:6: lv_statement_5_0= rulestatement
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
    // InternalPascal.g:3334:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalPascal.g:3334:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalPascal.g:3335:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
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
    // InternalPascal.g:3341:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_while_statement_0_0 = null;

        EObject lv_repeat_statement_1_0 = null;

        EObject lv_for_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3347:2: ( ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) ) )
            // InternalPascal.g:3348:2: ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) )
            {
            // InternalPascal.g:3348:2: ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt43=1;
                }
                break;
            case 57:
                {
                alt43=2;
                }
                break;
            case 54:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3349:3: ( (lv_while_statement_0_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:3349:3: ( (lv_while_statement_0_0= rulewhile_statement ) )
                    // InternalPascal.g:3350:4: (lv_while_statement_0_0= rulewhile_statement )
                    {
                    // InternalPascal.g:3350:4: (lv_while_statement_0_0= rulewhile_statement )
                    // InternalPascal.g:3351:5: lv_while_statement_0_0= rulewhile_statement
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
                    // InternalPascal.g:3369:3: ( (lv_repeat_statement_1_0= rulerepeat_statement ) )
                    {
                    // InternalPascal.g:3369:3: ( (lv_repeat_statement_1_0= rulerepeat_statement ) )
                    // InternalPascal.g:3370:4: (lv_repeat_statement_1_0= rulerepeat_statement )
                    {
                    // InternalPascal.g:3370:4: (lv_repeat_statement_1_0= rulerepeat_statement )
                    // InternalPascal.g:3371:5: lv_repeat_statement_1_0= rulerepeat_statement
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
                    // InternalPascal.g:3389:3: ( (lv_for_statement_2_0= rulefor_statement ) )
                    {
                    // InternalPascal.g:3389:3: ( (lv_for_statement_2_0= rulefor_statement ) )
                    // InternalPascal.g:3390:4: (lv_for_statement_2_0= rulefor_statement )
                    {
                    // InternalPascal.g:3390:4: (lv_for_statement_2_0= rulefor_statement )
                    // InternalPascal.g:3391:5: lv_for_statement_2_0= rulefor_statement
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
    // InternalPascal.g:3412:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalPascal.g:3412:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalPascal.g:3413:2: iv_rulefor_statement= rulefor_statement EOF
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
    // InternalPascal.g:3419:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) ;
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
            // InternalPascal.g:3425:2: ( (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) )
            // InternalPascal.g:3426:2: (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            {
            // InternalPascal.g:3426:2: (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            // InternalPascal.g:3427:3: otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
              		
            }
            // InternalPascal.g:3431:3: ( (lv_variable_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3432:4: (lv_variable_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3432:4: (lv_variable_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3433:5: lv_variable_identifier_1_0= ruleidentifier
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

            otherlv_2=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalPascal.g:3454:3: ( (lv_initial_expression_3_0= ruleinitial_expression ) )
            // InternalPascal.g:3455:4: (lv_initial_expression_3_0= ruleinitial_expression )
            {
            // InternalPascal.g:3455:4: (lv_initial_expression_3_0= ruleinitial_expression )
            // InternalPascal.g:3456:5: lv_initial_expression_3_0= ruleinitial_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFor_statementAccess().getInitial_expressionInitial_expressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_36);
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

            // InternalPascal.g:3473:3: (otherlv_4= 'to' | otherlv_5= 'downto' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            else if ( (LA44_0==56) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:3474:4: otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getToKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3479:4: otherlv_5= 'downto'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:3484:3: ( (lv_final_expression_6_0= rulefinal_expression ) )
            // InternalPascal.g:3485:4: (lv_final_expression_6_0= rulefinal_expression )
            {
            // InternalPascal.g:3485:4: (lv_final_expression_6_0= rulefinal_expression )
            // InternalPascal.g:3486:5: lv_final_expression_6_0= rulefinal_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFor_statementAccess().getFinal_expressionFinal_expressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            otherlv_7=(Token)match(input,48,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getDoKeyword_6());
              		
            }
            // InternalPascal.g:3507:3: ( (lv_statement_8_0= rulestatement ) )
            // InternalPascal.g:3508:4: (lv_statement_8_0= rulestatement )
            {
            // InternalPascal.g:3508:4: (lv_statement_8_0= rulestatement )
            // InternalPascal.g:3509:5: lv_statement_8_0= rulestatement
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
    // InternalPascal.g:3530:1: entryRulefinal_expression returns [EObject current=null] : iv_rulefinal_expression= rulefinal_expression EOF ;
    public final EObject entryRulefinal_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefinal_expression = null;


        try {
            // InternalPascal.g:3530:57: (iv_rulefinal_expression= rulefinal_expression EOF )
            // InternalPascal.g:3531:2: iv_rulefinal_expression= rulefinal_expression EOF
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
    // InternalPascal.g:3537:1: rulefinal_expression returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject rulefinal_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3543:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:3544:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:3544:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:3545:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:3545:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:3546:4: lv_expression_0_0= ruleexpression
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
    // InternalPascal.g:3566:1: entryRuleinitial_expression returns [EObject current=null] : iv_ruleinitial_expression= ruleinitial_expression EOF ;
    public final EObject entryRuleinitial_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitial_expression = null;


        try {
            // InternalPascal.g:3566:59: (iv_ruleinitial_expression= ruleinitial_expression EOF )
            // InternalPascal.g:3567:2: iv_ruleinitial_expression= ruleinitial_expression EOF
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
    // InternalPascal.g:3573:1: ruleinitial_expression returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleinitial_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3579:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:3580:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:3580:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:3581:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:3581:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:3582:4: lv_expression_0_0= ruleexpression
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
    // InternalPascal.g:3602:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // InternalPascal.g:3602:57: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // InternalPascal.g:3603:2: iv_rulerepeat_statement= rulerepeat_statement EOF
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
    // InternalPascal.g:3609:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3615:2: ( (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:3616:2: (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:3616:2: (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:3617:3: otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
              		
            }
            // InternalPascal.g:3621:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:3622:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:3622:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:3623:5: lv_statement_sequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeat_statementAccess().getStatement_sequenceStatement_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            otherlv_2=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
              		
            }
            // InternalPascal.g:3644:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:3645:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:3645:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:3646:5: lv_expression_3_0= ruleexpression
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
    // InternalPascal.g:3667:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:3667:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:3668:2: iv_rulewhile_statement= rulewhile_statement EOF
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
    // InternalPascal.g:3674:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3680:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalPascal.g:3681:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalPascal.g:3681:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalPascal.g:3682:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
              		
            }
            // InternalPascal.g:3686:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3687:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3687:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3688:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,48,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
              		
            }
            // InternalPascal.g:3709:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:3710:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:3710:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:3711:5: lv_statement_3_0= rulestatement
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
    // InternalPascal.g:3732:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:3732:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:3733:2: iv_rulecompound_statement= rulecompound_statement EOF
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
    // InternalPascal.g:3739:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3745:2: ( (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:3746:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:3746:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:3747:3: otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:3751:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:3752:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:3752:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:3753:5: lv_statement_sequence_1_0= rulestatement_sequence
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

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:3778:1: entryRuledeclaration_part returns [EObject current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final EObject entryRuledeclaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_part = null;


        try {
            // InternalPascal.g:3778:57: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // InternalPascal.g:3779:2: iv_ruledeclaration_part= ruledeclaration_part EOF
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
    // InternalPascal.g:3785:1: ruledeclaration_part returns [EObject current=null] : ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* ) ;
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
            // InternalPascal.g:3791:2: ( ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* ) )
            // InternalPascal.g:3792:2: ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* )
            {
            // InternalPascal.g:3792:2: ( () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )* )
            // InternalPascal.g:3793:3: () ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_3_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )*
            {
            // InternalPascal.g:3793:3: ()
            // InternalPascal.g:3794:4: 
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

            // InternalPascal.g:3803:3: ( (lv_label_declaration_part_1_0= rulelabel_declaration_part ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3804:4: (lv_label_declaration_part_1_0= rulelabel_declaration_part )
                    {
                    // InternalPascal.g:3804:4: (lv_label_declaration_part_1_0= rulelabel_declaration_part )
                    // InternalPascal.g:3805:5: lv_label_declaration_part_1_0= rulelabel_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partLabel_declaration_partParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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

            // InternalPascal.g:3822:3: ( (lv_constant_definition_part_2_0= ruleconstant_definition_part ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:3823:4: (lv_constant_definition_part_2_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:3823:4: (lv_constant_definition_part_2_0= ruleconstant_definition_part )
                    // InternalPascal.g:3824:5: lv_constant_definition_part_2_0= ruleconstant_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partConstant_definition_partParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
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

            // InternalPascal.g:3841:3: ( (lv_type_definition_part_3_0= ruletype_definition_part ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:3842:4: (lv_type_definition_part_3_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:3842:4: (lv_type_definition_part_3_0= ruletype_definition_part )
                    // InternalPascal.g:3843:5: lv_type_definition_part_3_0= ruletype_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partType_definition_partParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
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

            // InternalPascal.g:3860:3: ( (lv_variable_declaration_part_4_0= rulevariable_declaration_part ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:3861:4: (lv_variable_declaration_part_4_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:3861:4: (lv_variable_declaration_part_4_0= rulevariable_declaration_part )
                    // InternalPascal.g:3862:5: lv_variable_declaration_part_4_0= rulevariable_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partVariable_declaration_partParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_42);
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

            // InternalPascal.g:3879:3: ( ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=70 && LA50_0<=71)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPascal.g:3880:4: ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) ) otherlv_23= ';'
            	    {
            	    // InternalPascal.g:3880:4: ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) | ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) ) )
            	    int alt49=6;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==71) ) {
            	        int LA49_1 = input.LA(2);

            	        if ( (synpred72_InternalPascal()) ) {
            	            alt49=1;
            	        }
            	        else if ( (synpred73_InternalPascal()) ) {
            	            alt49=2;
            	        }
            	        else if ( (synpred74_InternalPascal()) ) {
            	            alt49=3;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 49, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA49_0==70) ) {
            	        int LA49_2 = input.LA(2);

            	        if ( (synpred75_InternalPascal()) ) {
            	            alt49=4;
            	        }
            	        else if ( (synpred76_InternalPascal()) ) {
            	            alt49=5;
            	        }
            	        else if ( (true) ) {
            	            alt49=6;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 49, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalPascal.g:3881:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
            	            {
            	            // InternalPascal.g:3881:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
            	            // InternalPascal.g:3882:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) )
            	            {
            	            // InternalPascal.g:3882:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) )
            	            // InternalPascal.g:3883:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
            	            {
            	            // InternalPascal.g:3883:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
            	            // InternalPascal.g:3884:8: lv_procedure_heading_5_0= ruleprocedure_heading
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

            	            otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_0_1());
            	              					
            	            }
            	            // InternalPascal.g:3905:6: ( (lv_procedure_body_7_0= ruleprocedure_body ) )
            	            // InternalPascal.g:3906:7: (lv_procedure_body_7_0= ruleprocedure_body )
            	            {
            	            // InternalPascal.g:3906:7: (lv_procedure_body_7_0= ruleprocedure_body )
            	            // InternalPascal.g:3907:8: lv_procedure_body_7_0= ruleprocedure_body
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
            	            // InternalPascal.g:3926:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
            	            {
            	            // InternalPascal.g:3926:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
            	            // InternalPascal.g:3927:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) )
            	            {
            	            // InternalPascal.g:3927:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) )
            	            // InternalPascal.g:3928:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
            	            {
            	            // InternalPascal.g:3928:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
            	            // InternalPascal.g:3929:8: lv_procedure_heading_8_0= ruleprocedure_heading
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

            	            otherlv_9=(Token)match(input,16,FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_9, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_1_1());
            	              					
            	            }
            	            // InternalPascal.g:3950:6: ( (lv_directive_10_0= ruledirective ) )
            	            // InternalPascal.g:3951:7: (lv_directive_10_0= ruledirective )
            	            {
            	            // InternalPascal.g:3951:7: (lv_directive_10_0= ruledirective )
            	            // InternalPascal.g:3952:8: lv_directive_10_0= ruledirective
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
            	            // InternalPascal.g:3971:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
            	            {
            	            // InternalPascal.g:3971:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
            	            // InternalPascal.g:3972:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) )
            	            {
            	            // InternalPascal.g:3972:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) )
            	            // InternalPascal.g:3973:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
            	            {
            	            // InternalPascal.g:3973:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
            	            // InternalPascal.g:3974:8: lv_procedure_identification_11_0= ruleprocedure_identification
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

            	            otherlv_12=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_12, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_2_1());
            	              					
            	            }
            	            // InternalPascal.g:3995:6: ( (lv_procedure_body_13_0= ruleprocedure_body ) )
            	            // InternalPascal.g:3996:7: (lv_procedure_body_13_0= ruleprocedure_body )
            	            {
            	            // InternalPascal.g:3996:7: (lv_procedure_body_13_0= ruleprocedure_body )
            	            // InternalPascal.g:3997:8: lv_procedure_body_13_0= ruleprocedure_body
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
            	            // InternalPascal.g:4016:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
            	            {
            	            // InternalPascal.g:4016:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
            	            // InternalPascal.g:4017:6: ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) )
            	            {
            	            // InternalPascal.g:4017:6: ( (lv_function_heading_14_0= rulefunction_heading ) )
            	            // InternalPascal.g:4018:7: (lv_function_heading_14_0= rulefunction_heading )
            	            {
            	            // InternalPascal.g:4018:7: (lv_function_heading_14_0= rulefunction_heading )
            	            // InternalPascal.g:4019:8: lv_function_heading_14_0= rulefunction_heading
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

            	            otherlv_15=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_15, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_3_1());
            	              					
            	            }
            	            // InternalPascal.g:4040:6: ( (lv_function_body_16_0= rulefunction_body ) )
            	            // InternalPascal.g:4041:7: (lv_function_body_16_0= rulefunction_body )
            	            {
            	            // InternalPascal.g:4041:7: (lv_function_body_16_0= rulefunction_body )
            	            // InternalPascal.g:4042:8: lv_function_body_16_0= rulefunction_body
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
            	            // InternalPascal.g:4061:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
            	            {
            	            // InternalPascal.g:4061:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
            	            // InternalPascal.g:4062:6: ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) )
            	            {
            	            // InternalPascal.g:4062:6: ( (lv_function_heading_17_0= rulefunction_heading ) )
            	            // InternalPascal.g:4063:7: (lv_function_heading_17_0= rulefunction_heading )
            	            {
            	            // InternalPascal.g:4063:7: (lv_function_heading_17_0= rulefunction_heading )
            	            // InternalPascal.g:4064:8: lv_function_heading_17_0= rulefunction_heading
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

            	            otherlv_18=(Token)match(input,16,FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_18, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_4_1());
            	              					
            	            }
            	            // InternalPascal.g:4085:6: ( (lv_directive_19_0= ruledirective ) )
            	            // InternalPascal.g:4086:7: (lv_directive_19_0= ruledirective )
            	            {
            	            // InternalPascal.g:4086:7: (lv_directive_19_0= ruledirective )
            	            // InternalPascal.g:4087:8: lv_directive_19_0= ruledirective
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
            	            // InternalPascal.g:4106:5: ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) )
            	            {
            	            // InternalPascal.g:4106:5: ( ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) ) )
            	            // InternalPascal.g:4107:6: ( (lv_function_identification_20_0= rulefunction_identification ) ) otherlv_21= ';' ( (lv_function_body_22_0= rulefunction_body ) )
            	            {
            	            // InternalPascal.g:4107:6: ( (lv_function_identification_20_0= rulefunction_identification ) )
            	            // InternalPascal.g:4108:7: (lv_function_identification_20_0= rulefunction_identification )
            	            {
            	            // InternalPascal.g:4108:7: (lv_function_identification_20_0= rulefunction_identification )
            	            // InternalPascal.g:4109:8: lv_function_identification_20_0= rulefunction_identification
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

            	            otherlv_21=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_21, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_0_5_1());
            	              					
            	            }
            	            // InternalPascal.g:4130:6: ( (lv_function_body_22_0= rulefunction_body ) )
            	            // InternalPascal.g:4131:7: (lv_function_body_22_0= rulefunction_body )
            	            {
            	            // InternalPascal.g:4131:7: (lv_function_body_22_0= rulefunction_body )
            	            // InternalPascal.g:4132:8: lv_function_body_22_0= rulefunction_body
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

            	    otherlv_23=(Token)match(input,16,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_23, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_5_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalPascal.g:4160:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:4160:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:4161:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
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
    // InternalPascal.g:4167:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_label_1_0 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4173:2: ( (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:4174:2: (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:4174:2: (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:4175:3: otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
              		
            }
            // InternalPascal.g:4179:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:4180:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:4180:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:4181:5: lv_label_1_0= rulelabel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelLabelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalPascal.g:4198:3: (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==17) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:4199:4: otherlv_2= ',' ( (lv_label_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:4203:4: ( (lv_label_3_0= rulelabel ) )
            	    // InternalPascal.g:4204:5: (lv_label_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:4204:5: (lv_label_3_0= rulelabel )
            	    // InternalPascal.g:4205:6: lv_label_3_0= rulelabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelLabelParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:4231:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:4231:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:4232:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
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
    // InternalPascal.g:4238:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constant_definition_1_0 = null;

        EObject lv_constant_definition_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4244:2: ( (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4245:2: (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4245:2: (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4246:3: otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
              		
            }
            // InternalPascal.g:4250:3: ( (lv_constant_definition_1_0= ruleconstant_definition ) )
            // InternalPascal.g:4251:4: (lv_constant_definition_1_0= ruleconstant_definition )
            {
            // InternalPascal.g:4251:4: (lv_constant_definition_1_0= ruleconstant_definition )
            // InternalPascal.g:4252:5: lv_constant_definition_1_0= ruleconstant_definition
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

            otherlv_2=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:4273:3: ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:4274:4: ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4274:4: ( (lv_constant_definition_3_0= ruleconstant_definition ) )
            	    // InternalPascal.g:4275:5: (lv_constant_definition_3_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:4275:5: (lv_constant_definition_3_0= ruleconstant_definition )
            	    // InternalPascal.g:4276:6: lv_constant_definition_3_0= ruleconstant_definition
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

            	    otherlv_4=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalPascal.g:4302:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:4302:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:4303:2: iv_ruleconstant_definition= ruleconstant_definition EOF
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
    // InternalPascal.g:4309:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4315:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:4316:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:4316:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            // InternalPascal.g:4317:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) )
            {
            // InternalPascal.g:4317:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4318:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4318:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4319:5: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstant_definitionAccess().getIdentifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            otherlv_1=(Token)match(input,23,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:4340:3: ( (lv_constant_2_0= ruleconstant ) )
            // InternalPascal.g:4341:4: (lv_constant_2_0= ruleconstant )
            {
            // InternalPascal.g:4341:4: (lv_constant_2_0= ruleconstant )
            // InternalPascal.g:4342:5: lv_constant_2_0= ruleconstant
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
    // InternalPascal.g:4363:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:4363:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:4364:2: iv_ruleconstant= ruleconstant EOF
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
    // InternalPascal.g:4370:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_strings_3_0=null;
        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_constant_identifier_1_0 = null;

        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4376:2: ( ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) ) )
            // InternalPascal.g:4377:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) )
            {
            // InternalPascal.g:4377:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==RULE_INT||(LA55_0>=45 && LA55_0<=46)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_STRINGS) ) {
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
                    // InternalPascal.g:4378:3: ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:4378:3: ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:4379:4: ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:4379:4: ( (lv_sign_0_0= rulesign ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==45) ) {
                        int LA53_1 = input.LA(2);

                        if ( (synpred80_InternalPascal()) ) {
                            alt53=1;
                        }
                    }
                    else if ( (LA53_0==46) ) {
                        int LA53_2 = input.LA(2);

                        if ( (synpred80_InternalPascal()) ) {
                            alt53=1;
                        }
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalPascal.g:4380:5: (lv_sign_0_0= rulesign )
                            {
                            // InternalPascal.g:4380:5: (lv_sign_0_0= rulesign )
                            // InternalPascal.g:4381:6: lv_sign_0_0= rulesign
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getConstantAccess().getSignSignParserRuleCall_0_0_0());
                              					
                            }
                            pushFollow(FOLLOW_47);
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

                    // InternalPascal.g:4398:4: ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RULE_INT||(LA54_0>=45 && LA54_0<=46)) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalPascal.g:4399:5: ( (lv_constant_identifier_1_0= ruleidentifier ) )
                            {
                            // InternalPascal.g:4399:5: ( (lv_constant_identifier_1_0= ruleidentifier ) )
                            // InternalPascal.g:4400:6: (lv_constant_identifier_1_0= ruleidentifier )
                            {
                            // InternalPascal.g:4400:6: (lv_constant_identifier_1_0= ruleidentifier )
                            // InternalPascal.g:4401:7: lv_constant_identifier_1_0= ruleidentifier
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
                            // InternalPascal.g:4419:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:4419:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:4420:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:4420:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:4421:7: lv_number_2_0= rulenumber
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
                    // InternalPascal.g:4441:3: ( (lv_strings_3_0= RULE_STRINGS ) )
                    {
                    // InternalPascal.g:4441:3: ( (lv_strings_3_0= RULE_STRINGS ) )
                    // InternalPascal.g:4442:4: (lv_strings_3_0= RULE_STRINGS )
                    {
                    // InternalPascal.g:4442:4: (lv_strings_3_0= RULE_STRINGS )
                    // InternalPascal.g:4443:5: lv_strings_3_0= RULE_STRINGS
                    {
                    lv_strings_3_0=(Token)match(input,RULE_STRINGS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_strings_3_0, grammarAccess.getConstantAccess().getStringsStringsTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstantRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"strings",
                      						lv_strings_3_0,
                      						"org.xtext.example.pascal.Pascal.strings");
                      				
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
    // InternalPascal.g:4463:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:4463:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:4464:2: iv_ruletype_definition_part= ruletype_definition_part EOF
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
    // InternalPascal.g:4470:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_definition_1_0 = null;

        EObject lv_type_definition_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4476:2: ( (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4477:2: (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4477:2: (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4478:3: otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
              		
            }
            // InternalPascal.g:4482:3: ( (lv_type_definition_1_0= ruletype_definition ) )
            // InternalPascal.g:4483:4: (lv_type_definition_1_0= ruletype_definition )
            {
            // InternalPascal.g:4483:4: (lv_type_definition_1_0= ruletype_definition )
            // InternalPascal.g:4484:5: lv_type_definition_1_0= ruletype_definition
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

            otherlv_2=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:4505:3: ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalPascal.g:4506:4: ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4506:4: ( (lv_type_definition_3_0= ruletype_definition ) )
            	    // InternalPascal.g:4507:5: (lv_type_definition_3_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:4507:5: (lv_type_definition_3_0= ruletype_definition )
            	    // InternalPascal.g:4508:6: lv_type_definition_3_0= ruletype_definition
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

            	    otherlv_4=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalPascal.g:4534:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:4534:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:4535:2: iv_ruletype_definition= ruletype_definition EOF
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
    // InternalPascal.g:4541:1: ruletype_definition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4547:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4548:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4548:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4549:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:4549:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4550:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4550:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4551:5: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getType_definitionAccess().getIdentifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            otherlv_1=(Token)match(input,23,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:4572:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4573:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4573:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4574:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:4595:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:4595:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:4596:2: iv_ruletype= ruletype EOF
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
    // InternalPascal.g:4602:1: ruletype returns [EObject current=null] : ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_type_0_0 = null;

        EObject lv_structured_type_1_0 = null;

        EObject lv_pointer_type_2_0 = null;

        EObject lv_type_identifier_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4608:2: ( ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:4609:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:4609:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case RULE_STRINGS:
            case RULE_INT:
            case 14:
            case 45:
            case 46:
                {
                alt57=1;
                }
                break;
            case RULE_ID:
                {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==EOF||(LA57_2>=15 && LA57_2<=16)||LA57_2==19) ) {
                    alt57=4;
                }
                else if ( (LA57_2==68) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt57=2;
                }
                break;
            case 44:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalPascal.g:4610:3: ( (lv_simple_type_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:4610:3: ( (lv_simple_type_0_0= rulesimple_type ) )
                    // InternalPascal.g:4611:4: (lv_simple_type_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:4611:4: (lv_simple_type_0_0= rulesimple_type )
                    // InternalPascal.g:4612:5: lv_simple_type_0_0= rulesimple_type
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
                    // InternalPascal.g:4630:3: ( (lv_structured_type_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:4630:3: ( (lv_structured_type_1_0= rulestructured_type ) )
                    // InternalPascal.g:4631:4: (lv_structured_type_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:4631:4: (lv_structured_type_1_0= rulestructured_type )
                    // InternalPascal.g:4632:5: lv_structured_type_1_0= rulestructured_type
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
                    // InternalPascal.g:4650:3: ( (lv_pointer_type_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:4650:3: ( (lv_pointer_type_2_0= rulepointer_type ) )
                    // InternalPascal.g:4651:4: (lv_pointer_type_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:4651:4: (lv_pointer_type_2_0= rulepointer_type )
                    // InternalPascal.g:4652:5: lv_pointer_type_2_0= rulepointer_type
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
                    // InternalPascal.g:4670:3: ( (lv_type_identifier_3_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:4670:3: ( (lv_type_identifier_3_0= ruletype_identifier ) )
                    // InternalPascal.g:4671:4: (lv_type_identifier_3_0= ruletype_identifier )
                    {
                    // InternalPascal.g:4671:4: (lv_type_identifier_3_0= ruletype_identifier )
                    // InternalPascal.g:4672:5: lv_type_identifier_3_0= ruletype_identifier
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
    // InternalPascal.g:4693:1: entryRuletype_identifier returns [EObject current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final EObject entryRuletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_identifier = null;


        try {
            // InternalPascal.g:4693:56: (iv_ruletype_identifier= ruletype_identifier EOF )
            // InternalPascal.g:4694:2: iv_ruletype_identifier= ruletype_identifier EOF
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
    // InternalPascal.g:4700:1: ruletype_identifier returns [EObject current=null] : ( (lv_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4706:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:4707:2: ( (lv_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:4707:2: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4708:3: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4708:3: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4709:4: lv_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:4729:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:4729:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:4730:2: iv_rulepointer_type= rulepointer_type EOF
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
    // InternalPascal.g:4736:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4742:2: ( (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:4743:2: (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:4743:2: (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) )
            // InternalPascal.g:4744:3: otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
              		
            }
            // InternalPascal.g:4748:3: ( (lv_type_identifier_1_0= ruletype_identifier ) )
            // InternalPascal.g:4749:4: (lv_type_identifier_1_0= ruletype_identifier )
            {
            // InternalPascal.g:4749:4: (lv_type_identifier_1_0= ruletype_identifier )
            // InternalPascal.g:4750:5: lv_type_identifier_1_0= ruletype_identifier
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
    // InternalPascal.g:4771:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:4771:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:4772:2: iv_rulestructured_type= rulestructured_type EOF
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
    // InternalPascal.g:4778:1: rulestructured_type returns [EObject current=null] : ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpacked_structured_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4784:2: ( ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:4785:2: ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:4785:2: ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:4786:3: (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:4786:3: (otherlv_0= 'packed' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==63) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPascal.g:4787:4: otherlv_0= 'packed'
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:4792:3: ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:4793:4: (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:4793:4: (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:4794:5: lv_unpacked_structured_type_1_0= ruleunpacked_structured_type
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
    // InternalPascal.g:4815:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:4815:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:4816:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
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
    // InternalPascal.g:4822:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_type_0_0 = null;

        EObject lv_record_type_1_0 = null;

        EObject lv_set_type_2_0 = null;

        EObject lv_file_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4828:2: ( ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) ) )
            // InternalPascal.g:4829:2: ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) )
            {
            // InternalPascal.g:4829:2: ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt59=1;
                }
                break;
            case 66:
                {
                alt59=2;
                }
                break;
            case 65:
                {
                alt59=3;
                }
                break;
            case 64:
                {
                alt59=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalPascal.g:4830:3: ( (lv_array_type_0_0= rulearray_type ) )
                    {
                    // InternalPascal.g:4830:3: ( (lv_array_type_0_0= rulearray_type ) )
                    // InternalPascal.g:4831:4: (lv_array_type_0_0= rulearray_type )
                    {
                    // InternalPascal.g:4831:4: (lv_array_type_0_0= rulearray_type )
                    // InternalPascal.g:4832:5: lv_array_type_0_0= rulearray_type
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
                    // InternalPascal.g:4850:3: ( (lv_record_type_1_0= rulerecord_type ) )
                    {
                    // InternalPascal.g:4850:3: ( (lv_record_type_1_0= rulerecord_type ) )
                    // InternalPascal.g:4851:4: (lv_record_type_1_0= rulerecord_type )
                    {
                    // InternalPascal.g:4851:4: (lv_record_type_1_0= rulerecord_type )
                    // InternalPascal.g:4852:5: lv_record_type_1_0= rulerecord_type
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
                    // InternalPascal.g:4870:3: ( (lv_set_type_2_0= ruleset_type ) )
                    {
                    // InternalPascal.g:4870:3: ( (lv_set_type_2_0= ruleset_type ) )
                    // InternalPascal.g:4871:4: (lv_set_type_2_0= ruleset_type )
                    {
                    // InternalPascal.g:4871:4: (lv_set_type_2_0= ruleset_type )
                    // InternalPascal.g:4872:5: lv_set_type_2_0= ruleset_type
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
                    // InternalPascal.g:4890:3: ( (lv_file_type_3_0= rulefile_type ) )
                    {
                    // InternalPascal.g:4890:3: ( (lv_file_type_3_0= rulefile_type ) )
                    // InternalPascal.g:4891:4: (lv_file_type_3_0= rulefile_type )
                    {
                    // InternalPascal.g:4891:4: (lv_file_type_3_0= rulefile_type )
                    // InternalPascal.g:4892:5: lv_file_type_3_0= rulefile_type
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
    // InternalPascal.g:4913:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // InternalPascal.g:4913:50: (iv_rulefile_type= rulefile_type EOF )
            // InternalPascal.g:4914:2: iv_rulefile_type= rulefile_type EOF
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
    // InternalPascal.g:4920:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_file_component_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4926:2: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) ) )
            // InternalPascal.g:4927:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) )
            {
            // InternalPascal.g:4927:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) )
            // InternalPascal.g:4928:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,50,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
              		
            }
            // InternalPascal.g:4936:3: ( (lv_file_component_type_2_0= rulefile_component_type ) )
            // InternalPascal.g:4937:4: (lv_file_component_type_2_0= rulefile_component_type )
            {
            // InternalPascal.g:4937:4: (lv_file_component_type_2_0= rulefile_component_type )
            // InternalPascal.g:4938:5: lv_file_component_type_2_0= rulefile_component_type
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
    // InternalPascal.g:4959:1: entryRulefile_component_type returns [EObject current=null] : iv_rulefile_component_type= rulefile_component_type EOF ;
    public final EObject entryRulefile_component_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_component_type = null;


        try {
            // InternalPascal.g:4959:60: (iv_rulefile_component_type= rulefile_component_type EOF )
            // InternalPascal.g:4960:2: iv_rulefile_component_type= rulefile_component_type EOF
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
    // InternalPascal.g:4966:1: rulefile_component_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject rulefile_component_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4972:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:4973:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:4973:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:4974:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:4974:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:4975:4: lv_type_0_0= ruletype
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
    // InternalPascal.g:4995:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:4995:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:4996:2: iv_ruleset_type= ruleset_type EOF
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
    // InternalPascal.g:5002:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_base_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5008:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) ) )
            // InternalPascal.g:5009:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) )
            {
            // InternalPascal.g:5009:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) )
            // InternalPascal.g:5010:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,50,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
              		
            }
            // InternalPascal.g:5018:3: ( (lv_base_type_2_0= rulebase_type ) )
            // InternalPascal.g:5019:4: (lv_base_type_2_0= rulebase_type )
            {
            // InternalPascal.g:5019:4: (lv_base_type_2_0= rulebase_type )
            // InternalPascal.g:5020:5: lv_base_type_2_0= rulebase_type
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
    // InternalPascal.g:5041:1: entryRulebase_type returns [EObject current=null] : iv_rulebase_type= rulebase_type EOF ;
    public final EObject entryRulebase_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_type = null;


        try {
            // InternalPascal.g:5041:50: (iv_rulebase_type= rulebase_type EOF )
            // InternalPascal.g:5042:2: iv_rulebase_type= rulebase_type EOF
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
    // InternalPascal.g:5048:1: rulebase_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject rulebase_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5054:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:5055:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:5055:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:5056:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:5056:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:5057:4: lv_type_0_0= ruletype
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
    // InternalPascal.g:5077:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:5077:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:5078:2: iv_rulerecord_type= rulerecord_type EOF
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
    // InternalPascal.g:5084:1: rulerecord_type returns [EObject current=null] : (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_field_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5090:2: ( (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:5091:2: (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:5091:2: (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' )
            // InternalPascal.g:5092:3: otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecord_typeAccess().getRecordKeyword_0());
              		
            }
            // InternalPascal.g:5096:3: ( (lv_field_list_1_0= rulefield_list ) )
            // InternalPascal.g:5097:4: (lv_field_list_1_0= rulefield_list )
            {
            // InternalPascal.g:5097:4: (lv_field_list_1_0= rulefield_list )
            // InternalPascal.g:5098:5: lv_field_list_1_0= rulefield_list
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

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:5123:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:5123:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:5124:2: iv_rulefield_list= rulefield_list EOF
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
    // InternalPascal.g:5130:1: rulefield_list returns [EObject current=null] : ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fixed_part_1_0 = null;

        EObject lv_variant_part_3_0 = null;

        EObject lv_variant_part_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5136:2: ( ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? ) )
            // InternalPascal.g:5137:2: ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? )
            {
            // InternalPascal.g:5137:2: ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? )
            // InternalPascal.g:5138:3: () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )?
            {
            // InternalPascal.g:5138:3: ()
            // InternalPascal.g:5139:4: 
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

            // InternalPascal.g:5148:3: ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||LA63_0==49) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPascal.g:5149:4: ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )?
                    {
                    // InternalPascal.g:5149:4: ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ID) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==49) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalPascal.g:5150:5: ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? )
                            {
                            // InternalPascal.g:5150:5: ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? )
                            // InternalPascal.g:5151:6: ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )?
                            {
                            // InternalPascal.g:5151:6: ( (lv_fixed_part_1_0= rulefixed_part ) )
                            // InternalPascal.g:5152:7: (lv_fixed_part_1_0= rulefixed_part )
                            {
                            // InternalPascal.g:5152:7: (lv_fixed_part_1_0= rulefixed_part )
                            // InternalPascal.g:5153:8: lv_fixed_part_1_0= rulefixed_part
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

                            // InternalPascal.g:5170:6: (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==16) ) {
                                int LA60_1 = input.LA(2);

                                if ( (LA60_1==49) ) {
                                    alt60=1;
                                }
                            }
                            switch (alt60) {
                                case 1 :
                                    // InternalPascal.g:5171:7: otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) )
                                    {
                                    otherlv_2=(Token)match(input,16,FOLLOW_51); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_2, grammarAccess.getField_listAccess().getSemicolonKeyword_1_0_0_1_0());
                                      						
                                    }
                                    // InternalPascal.g:5175:7: ( (lv_variant_part_3_0= rulevariant_part ) )
                                    // InternalPascal.g:5176:8: (lv_variant_part_3_0= rulevariant_part )
                                    {
                                    // InternalPascal.g:5176:8: (lv_variant_part_3_0= rulevariant_part )
                                    // InternalPascal.g:5177:9: lv_variant_part_3_0= rulevariant_part
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
                            // InternalPascal.g:5197:5: ( (lv_variant_part_4_0= rulevariant_part ) )
                            {
                            // InternalPascal.g:5197:5: ( (lv_variant_part_4_0= rulevariant_part ) )
                            // InternalPascal.g:5198:6: (lv_variant_part_4_0= rulevariant_part )
                            {
                            // InternalPascal.g:5198:6: (lv_variant_part_4_0= rulevariant_part )
                            // InternalPascal.g:5199:7: lv_variant_part_4_0= rulevariant_part
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

                    // InternalPascal.g:5217:4: (otherlv_5= ';' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==16) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalPascal.g:5218:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:5228:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalPascal.g:5228:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalPascal.g:5229:2: iv_rulefixed_part= rulefixed_part EOF
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
    // InternalPascal.g:5235:1: rulefixed_part returns [EObject current=null] : ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_record_section_0_0 = null;

        EObject lv_record_section_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5241:2: ( ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:5242:2: ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:5242:2: ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:5243:3: ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:5243:3: ( (lv_record_section_0_0= rulerecord_section ) )
            // InternalPascal.g:5244:4: (lv_record_section_0_0= rulerecord_section )
            {
            // InternalPascal.g:5244:4: (lv_record_section_0_0= rulerecord_section )
            // InternalPascal.g:5245:5: lv_record_section_0_0= rulerecord_section
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

            // InternalPascal.g:5262:3: (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==16) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==RULE_ID) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalPascal.g:5263:4: otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:5267:4: ( (lv_record_section_2_0= rulerecord_section ) )
            	    // InternalPascal.g:5268:5: (lv_record_section_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:5268:5: (lv_record_section_2_0= rulerecord_section )
            	    // InternalPascal.g:5269:6: lv_record_section_2_0= rulerecord_section
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
            	    break loop64;
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
    // InternalPascal.g:5291:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:5291:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:5292:2: iv_rulerecord_section= rulerecord_section EOF
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
    // InternalPascal.g:5298:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5304:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:5305:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:5305:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:5306:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:5306:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:5307:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:5307:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:5308:5: lv_identifier_list_0_0= ruleidentifier_list
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

            otherlv_1=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:5329:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:5330:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:5330:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:5331:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:5352:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalPascal.g:5352:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalPascal.g:5353:2: iv_rulevariant_part= rulevariant_part EOF
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
    // InternalPascal.g:5359:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* ) ;
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
            // InternalPascal.g:5365:2: ( (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* ) )
            // InternalPascal.g:5366:2: (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:5366:2: (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* )
            // InternalPascal.g:5367:3: otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:5371:3: ( (lv_tag_field_1_0= ruletag_field ) )
            // InternalPascal.g:5372:4: (lv_tag_field_1_0= ruletag_field )
            {
            // InternalPascal.g:5372:4: (lv_tag_field_1_0= ruletag_field )
            // InternalPascal.g:5373:5: lv_tag_field_1_0= ruletag_field
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariant_partAccess().getTag_fieldTag_fieldParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            // InternalPascal.g:5390:3: ( (lv_type_identifier_2_0= ruletype_identifier ) )
            // InternalPascal.g:5391:4: (lv_type_identifier_2_0= ruletype_identifier )
            {
            // InternalPascal.g:5391:4: (lv_type_identifier_2_0= ruletype_identifier )
            // InternalPascal.g:5392:5: lv_type_identifier_2_0= ruletype_identifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariant_partAccess().getType_identifierType_identifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_3=(Token)match(input,50,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
              		
            }
            // InternalPascal.g:5413:3: ( (lv_variant_4_0= rulevariant ) )
            // InternalPascal.g:5414:4: (lv_variant_4_0= rulevariant )
            {
            // InternalPascal.g:5414:4: (lv_variant_4_0= rulevariant )
            // InternalPascal.g:5415:5: lv_variant_4_0= rulevariant
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

            // InternalPascal.g:5432:3: (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==16) ) {
                    int LA65_1 = input.LA(2);

                    if ( ((LA65_1>=RULE_ID && LA65_1<=RULE_INT)||(LA65_1>=45 && LA65_1<=46)) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalPascal.g:5433:4: otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalPascal.g:5437:4: ( (lv_variant_6_0= rulevariant ) )
            	    // InternalPascal.g:5438:5: (lv_variant_6_0= rulevariant )
            	    {
            	    // InternalPascal.g:5438:5: (lv_variant_6_0= rulevariant )
            	    // InternalPascal.g:5439:6: lv_variant_6_0= rulevariant
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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:5461:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:5461:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:5462:2: iv_rulevariant= rulevariant EOF
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
    // InternalPascal.g:5468:1: rulevariant returns [EObject current=null] : ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_case_label_list_0_0 = null;

        EObject lv_field_list_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5474:2: ( ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' ) )
            // InternalPascal.g:5475:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' )
            {
            // InternalPascal.g:5475:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' )
            // InternalPascal.g:5476:3: ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')'
            {
            // InternalPascal.g:5476:3: ( (lv_case_label_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:5477:4: (lv_case_label_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:5477:4: (lv_case_label_list_0_0= rulecase_label_list )
            // InternalPascal.g:5478:5: lv_case_label_list_0_0= rulecase_label_list
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

            otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,14,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPascal.g:5503:3: ( (lv_field_list_3_0= rulefield_list ) )
            // InternalPascal.g:5504:4: (lv_field_list_3_0= rulefield_list )
            {
            // InternalPascal.g:5504:4: (lv_field_list_3_0= rulefield_list )
            // InternalPascal.g:5505:5: lv_field_list_3_0= rulefield_list
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:5530:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalPascal.g:5530:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalPascal.g:5531:2: iv_ruletag_field= ruletag_field EOF
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
    // InternalPascal.g:5537:1: ruletag_field returns [EObject current=null] : ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5543:2: ( ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? ) )
            // InternalPascal.g:5544:2: ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? )
            {
            // InternalPascal.g:5544:2: ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? )
            // InternalPascal.g:5545:3: () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )?
            {
            // InternalPascal.g:5545:3: ()
            // InternalPascal.g:5546:4: 
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

            // InternalPascal.g:5555:3: ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==20) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalPascal.g:5556:4: ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':'
                    {
                    // InternalPascal.g:5556:4: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:5557:5: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:5557:5: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:5558:6: lv_identifier_1_0= ruleidentifier
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

                    otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:5584:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascal.g:5584:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascal.g:5585:2: iv_rulearray_type= rulearray_type EOF
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
    // InternalPascal.g:5591:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) ) ;
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
            // InternalPascal.g:5597:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) ) )
            // InternalPascal.g:5598:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) )
            {
            // InternalPascal.g:5598:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) )
            // InternalPascal.g:5599:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,40,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPascal.g:5607:3: ( (lv_index_type_2_0= ruleindex_type ) )
            // InternalPascal.g:5608:4: (lv_index_type_2_0= ruleindex_type )
            {
            // InternalPascal.g:5608:4: (lv_index_type_2_0= ruleindex_type )
            // InternalPascal.g:5609:5: lv_index_type_2_0= ruleindex_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeIndex_typeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            // InternalPascal.g:5626:3: (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==17) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalPascal.g:5627:4: otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPascal.g:5631:4: ( (lv_index_type_4_0= ruleindex_type ) )
            	    // InternalPascal.g:5632:5: (lv_index_type_4_0= ruleindex_type )
            	    {
            	    // InternalPascal.g:5632:5: (lv_index_type_4_0= ruleindex_type )
            	    // InternalPascal.g:5633:6: lv_index_type_4_0= ruleindex_type
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArray_typeAccess().getIndex_typeIndex_typeParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,50,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
              		
            }
            // InternalPascal.g:5659:3: ( (lv_element_type_7_0= ruleelement_type ) )
            // InternalPascal.g:5660:4: (lv_element_type_7_0= ruleelement_type )
            {
            // InternalPascal.g:5660:4: (lv_element_type_7_0= ruleelement_type )
            // InternalPascal.g:5661:5: lv_element_type_7_0= ruleelement_type
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
    // InternalPascal.g:5682:1: entryRuleelement_type returns [EObject current=null] : iv_ruleelement_type= ruleelement_type EOF ;
    public final EObject entryRuleelement_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_type = null;


        try {
            // InternalPascal.g:5682:53: (iv_ruleelement_type= ruleelement_type EOF )
            // InternalPascal.g:5683:2: iv_ruleelement_type= ruleelement_type EOF
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
    // InternalPascal.g:5689:1: ruleelement_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject ruleelement_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5695:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:5696:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:5696:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:5697:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:5697:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:5698:4: lv_type_0_0= ruletype
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
    // InternalPascal.g:5718:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalPascal.g:5718:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalPascal.g:5719:2: iv_ruleindex_type= ruleindex_type EOF
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
    // InternalPascal.g:5725:1: ruleindex_type returns [EObject current=null] : ( (lv_simple_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5731:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:5732:2: ( (lv_simple_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:5732:2: ( (lv_simple_type_0_0= rulesimple_type ) )
            // InternalPascal.g:5733:3: (lv_simple_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:5733:3: (lv_simple_type_0_0= rulesimple_type )
            // InternalPascal.g:5734:4: lv_simple_type_0_0= rulesimple_type
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
    // InternalPascal.g:5754:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:5754:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:5755:2: iv_rulesimple_type= rulesimple_type EOF
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
    // InternalPascal.g:5761:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject lv_subrange_type_0_0 = null;

        EObject lv_enumerated_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5767:2: ( ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) ) )
            // InternalPascal.g:5768:2: ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) )
            {
            // InternalPascal.g:5768:2: ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_INT)||(LA68_0>=45 && LA68_0<=46)) ) {
                alt68=1;
            }
            else if ( (LA68_0==14) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalPascal.g:5769:3: ( (lv_subrange_type_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:5769:3: ( (lv_subrange_type_0_0= rulesubrange_type ) )
                    // InternalPascal.g:5770:4: (lv_subrange_type_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:5770:4: (lv_subrange_type_0_0= rulesubrange_type )
                    // InternalPascal.g:5771:5: lv_subrange_type_0_0= rulesubrange_type
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
                    // InternalPascal.g:5789:3: ( (lv_enumerated_type_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:5789:3: ( (lv_enumerated_type_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:5790:4: (lv_enumerated_type_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:5790:4: (lv_enumerated_type_1_0= ruleenumerated_type )
                    // InternalPascal.g:5791:5: lv_enumerated_type_1_0= ruleenumerated_type
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
    // InternalPascal.g:5812:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:5812:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:5813:2: iv_ruleenumerated_type= ruleenumerated_type EOF
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
    // InternalPascal.g:5819:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5825:2: ( (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:5826:2: (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:5826:2: (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:5827:3: otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:5831:3: ( (lv_identifier_list_1_0= ruleidentifier_list ) )
            // InternalPascal.g:5832:4: (lv_identifier_list_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:5832:4: (lv_identifier_list_1_0= ruleidentifier_list )
            // InternalPascal.g:5833:5: lv_identifier_list_1_0= ruleidentifier_list
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

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:5858:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascal.g:5858:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:5859:2: iv_rulesubrange_type= rulesubrange_type EOF
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
    // InternalPascal.g:5865:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lower_bound_0_0 = null;

        EObject lv_upper_bound_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5871:2: ( ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) ) )
            // InternalPascal.g:5872:2: ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) )
            {
            // InternalPascal.g:5872:2: ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) )
            // InternalPascal.g:5873:3: ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) )
            {
            // InternalPascal.g:5873:3: ( (lv_lower_bound_0_0= rulelower_bound ) )
            // InternalPascal.g:5874:4: (lv_lower_bound_0_0= rulelower_bound )
            {
            // InternalPascal.g:5874:4: (lv_lower_bound_0_0= rulelower_bound )
            // InternalPascal.g:5875:5: lv_lower_bound_0_0= rulelower_bound
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubrange_typeAccess().getLower_boundLower_boundParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_56);
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

            otherlv_1=(Token)match(input,68,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalPascal.g:5896:3: ( (lv_upper_bound_2_0= ruleupper_bound ) )
            // InternalPascal.g:5897:4: (lv_upper_bound_2_0= ruleupper_bound )
            {
            // InternalPascal.g:5897:4: (lv_upper_bound_2_0= ruleupper_bound )
            // InternalPascal.g:5898:5: lv_upper_bound_2_0= ruleupper_bound
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
    // InternalPascal.g:5919:1: entryRulelower_bound returns [EObject current=null] : iv_rulelower_bound= rulelower_bound EOF ;
    public final EObject entryRulelower_bound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelower_bound = null;


        try {
            // InternalPascal.g:5919:52: (iv_rulelower_bound= rulelower_bound EOF )
            // InternalPascal.g:5920:2: iv_rulelower_bound= rulelower_bound EOF
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
    // InternalPascal.g:5926:1: rulelower_bound returns [EObject current=null] : ( (lv_constant_0_0= ruleconstant ) ) ;
    public final EObject rulelower_bound() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5932:2: ( ( (lv_constant_0_0= ruleconstant ) ) )
            // InternalPascal.g:5933:2: ( (lv_constant_0_0= ruleconstant ) )
            {
            // InternalPascal.g:5933:2: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:5934:3: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:5934:3: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:5935:4: lv_constant_0_0= ruleconstant
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
    // InternalPascal.g:5955:1: entryRuleupper_bound returns [EObject current=null] : iv_ruleupper_bound= ruleupper_bound EOF ;
    public final EObject entryRuleupper_bound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleupper_bound = null;


        try {
            // InternalPascal.g:5955:52: (iv_ruleupper_bound= ruleupper_bound EOF )
            // InternalPascal.g:5956:2: iv_ruleupper_bound= ruleupper_bound EOF
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
    // InternalPascal.g:5962:1: ruleupper_bound returns [EObject current=null] : ( (lv_constant_0_0= ruleconstant ) ) ;
    public final EObject ruleupper_bound() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5968:2: ( ( (lv_constant_0_0= ruleconstant ) ) )
            // InternalPascal.g:5969:2: ( (lv_constant_0_0= ruleconstant ) )
            {
            // InternalPascal.g:5969:2: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:5970:3: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:5970:3: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:5971:4: lv_constant_0_0= ruleconstant
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
    // InternalPascal.g:5991:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:5991:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:5992:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
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
    // InternalPascal.g:5998:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_declaration_1_0 = null;

        EObject lv_variable_declaration_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6004:2: ( (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:6005:2: (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:6005:2: (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* )
            // InternalPascal.g:6006:3: otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:6010:3: ( (lv_variable_declaration_1_0= rulevariable_declaration ) )
            // InternalPascal.g:6011:4: (lv_variable_declaration_1_0= rulevariable_declaration )
            {
            // InternalPascal.g:6011:4: (lv_variable_declaration_1_0= rulevariable_declaration )
            // InternalPascal.g:6012:5: lv_variable_declaration_1_0= rulevariable_declaration
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

            otherlv_2=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:6033:3: ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalPascal.g:6034:4: ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:6034:4: ( (lv_variable_declaration_3_0= rulevariable_declaration ) )
            	    // InternalPascal.g:6035:5: (lv_variable_declaration_3_0= rulevariable_declaration )
            	    {
            	    // InternalPascal.g:6035:5: (lv_variable_declaration_3_0= rulevariable_declaration )
            	    // InternalPascal.g:6036:6: lv_variable_declaration_3_0= rulevariable_declaration
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

            	    otherlv_4=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // InternalPascal.g:6062:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // InternalPascal.g:6062:61: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // InternalPascal.g:6063:2: iv_rulevariable_declaration= rulevariable_declaration EOF
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
    // InternalPascal.g:6069:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6075:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:6076:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:6076:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:6077:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:6077:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:6078:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:6078:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:6079:5: lv_identifier_list_0_0= ruleidentifier_list
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

            otherlv_1=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariable_declarationAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:6100:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:6101:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:6101:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:6102:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:6123:1: entryRulefunction_identification returns [EObject current=null] : iv_rulefunction_identification= rulefunction_identification EOF ;
    public final EObject entryRulefunction_identification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_identification = null;


        try {
            // InternalPascal.g:6123:64: (iv_rulefunction_identification= rulefunction_identification EOF )
            // InternalPascal.g:6124:2: iv_rulefunction_identification= rulefunction_identification EOF
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
    // InternalPascal.g:6130:1: rulefunction_identification returns [EObject current=null] : (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject rulefunction_identification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_function_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6136:2: ( (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:6137:2: (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:6137:2: (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            // InternalPascal.g:6138:3: otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_identificationAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:6142:3: ( (lv_function_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6143:4: (lv_function_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6143:4: (lv_function_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6144:5: lv_function_identifier_1_0= ruleidentifier
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
    // InternalPascal.g:6165:1: entryRulefunction_body returns [EObject current=null] : iv_rulefunction_body= rulefunction_body EOF ;
    public final EObject entryRulefunction_body() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_body = null;


        try {
            // InternalPascal.g:6165:54: (iv_rulefunction_body= rulefunction_body EOF )
            // InternalPascal.g:6166:2: iv_rulefunction_body= rulefunction_body EOF
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
    // InternalPascal.g:6172:1: rulefunction_body returns [EObject current=null] : ( (lv_function_block_0_0= rulefunction_block ) ) ;
    public final EObject rulefunction_body() throws RecognitionException {
        EObject current = null;

        EObject lv_function_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6178:2: ( ( (lv_function_block_0_0= rulefunction_block ) ) )
            // InternalPascal.g:6179:2: ( (lv_function_block_0_0= rulefunction_block ) )
            {
            // InternalPascal.g:6179:2: ( (lv_function_block_0_0= rulefunction_block ) )
            // InternalPascal.g:6180:3: (lv_function_block_0_0= rulefunction_block )
            {
            // InternalPascal.g:6180:3: (lv_function_block_0_0= rulefunction_block )
            // InternalPascal.g:6181:4: lv_function_block_0_0= rulefunction_block
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunction_bodyAccess().getFunction_blockFunction_blockParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_function_block_0_0=rulefunction_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunction_bodyRule());
              				}
              				set(
              					current,
              					"function_block",
              					lv_function_block_0_0,
              					"org.xtext.example.pascal.Pascal.function_block");
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
    // InternalPascal.g:6201:1: entryRuleprocedure_identification returns [EObject current=null] : iv_ruleprocedure_identification= ruleprocedure_identification EOF ;
    public final EObject entryRuleprocedure_identification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_identification = null;


        try {
            // InternalPascal.g:6201:65: (iv_ruleprocedure_identification= ruleprocedure_identification EOF )
            // InternalPascal.g:6202:2: iv_ruleprocedure_identification= ruleprocedure_identification EOF
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
    // InternalPascal.g:6208:1: ruleprocedure_identification returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject ruleprocedure_identification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6214:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:6215:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:6215:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) )
            // InternalPascal.g:6216:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_identificationAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:6220:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6221:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6221:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6222:5: lv_identifier_1_0= ruleidentifier
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
    // InternalPascal.g:6243:1: entryRuledirective returns [EObject current=null] : iv_ruledirective= ruledirective EOF ;
    public final EObject entryRuledirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledirective = null;


        try {
            // InternalPascal.g:6243:50: (iv_ruledirective= ruledirective EOF )
            // InternalPascal.g:6244:2: iv_ruledirective= ruledirective EOF
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
    // InternalPascal.g:6250:1: ruledirective returns [EObject current=null] : ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) ) ;
    public final EObject ruledirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_compiler_defined_directives_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6256:2: ( ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) ) )
            // InternalPascal.g:6257:2: ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) )
            {
            // InternalPascal.g:6257:2: ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==72) ) {
                alt70=1;
            }
            else if ( (LA70_0==71) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalPascal.g:6258:3: ( () otherlv_1= 'forward' )
                    {
                    // InternalPascal.g:6258:3: ( () otherlv_1= 'forward' )
                    // InternalPascal.g:6259:4: () otherlv_1= 'forward'
                    {
                    // InternalPascal.g:6259:4: ()
                    // InternalPascal.g:6260:5: 
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

                    otherlv_1=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDirectiveAccess().getForwardKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:6275:3: ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) )
                    {
                    // InternalPascal.g:6275:3: ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) )
                    // InternalPascal.g:6276:4: (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives )
                    {
                    // InternalPascal.g:6276:4: (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives )
                    // InternalPascal.g:6277:5: lv_compiler_defined_directives_2_0= rulecompiler_defined_directives
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
    // InternalPascal.g:6298:1: entryRulecompiler_defined_directives returns [EObject current=null] : iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF ;
    public final EObject entryRulecompiler_defined_directives() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompiler_defined_directives = null;


        try {
            // InternalPascal.g:6298:68: (iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF )
            // InternalPascal.g:6299:2: iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF
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
    // InternalPascal.g:6305:1: rulecompiler_defined_directives returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject rulecompiler_defined_directives() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6311:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:6312:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:6312:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:6313:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:6313:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:6314:4: lv_procedure_heading_0_0= ruleprocedure_heading
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
    // InternalPascal.g:6334:1: entryRuleprocedure_body returns [EObject current=null] : iv_ruleprocedure_body= ruleprocedure_body EOF ;
    public final EObject entryRuleprocedure_body() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_body = null;


        try {
            // InternalPascal.g:6334:55: (iv_ruleprocedure_body= ruleprocedure_body EOF )
            // InternalPascal.g:6335:2: iv_ruleprocedure_body= ruleprocedure_body EOF
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
    // InternalPascal.g:6341:1: ruleprocedure_body returns [EObject current=null] : ( (lv_procedure_block_0_0= ruleprocedure_block ) ) ;
    public final EObject ruleprocedure_body() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6347:2: ( ( (lv_procedure_block_0_0= ruleprocedure_block ) ) )
            // InternalPascal.g:6348:2: ( (lv_procedure_block_0_0= ruleprocedure_block ) )
            {
            // InternalPascal.g:6348:2: ( (lv_procedure_block_0_0= ruleprocedure_block ) )
            // InternalPascal.g:6349:3: (lv_procedure_block_0_0= ruleprocedure_block )
            {
            // InternalPascal.g:6349:3: (lv_procedure_block_0_0= ruleprocedure_block )
            // InternalPascal.g:6350:4: lv_procedure_block_0_0= ruleprocedure_block
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getProcedure_bodyAccess().getProcedure_blockProcedure_blockParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_procedure_block_0_0=ruleprocedure_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getProcedure_bodyRule());
              				}
              				set(
              					current,
              					"procedure_block",
              					lv_procedure_block_0_0,
              					"org.xtext.example.pascal.Pascal.procedure_block");
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
    // InternalPascal.g:6370:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:6370:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:6371:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
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
    // InternalPascal.g:6377:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formal_parameter_list_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6383:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:6384:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:6384:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:6385:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:6389:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6390:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6390:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6391:5: lv_identifier_1_0= ruleidentifier
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

            // InternalPascal.g:6408:3: ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==14) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalPascal.g:6409:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:6409:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:6410:5: lv_formal_parameter_list_2_0= ruleformal_parameter_list
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
    // InternalPascal.g:6431:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:6431:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:6432:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
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
    // InternalPascal.g:6438:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formal_parameter_section_1_0 = null;

        EObject lv_formal_parameter_section_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6444:2: ( (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:6445:2: (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:6445:2: (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:6446:3: otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:6450:3: ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:6451:4: (lv_formal_parameter_section_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:6451:4: (lv_formal_parameter_section_1_0= ruleformal_parameter_section )
            // InternalPascal.g:6452:5: lv_formal_parameter_section_1_0= ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionFormal_parameter_sectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_58);
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

            // InternalPascal.g:6469:3: (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==16) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalPascal.g:6470:4: otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:6474:4: ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:6475:5: (lv_formal_parameter_section_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:6475:5: (lv_formal_parameter_section_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:6476:6: lv_formal_parameter_section_3_0= ruleformal_parameter_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionFormal_parameter_sectionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    break loop72;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:6502:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:6502:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:6503:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
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
    // InternalPascal.g:6509:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_parameter_section_0_0 = null;

        EObject lv_variable_parameter_section_1_0 = null;

        EObject lv_procedure_parameter_section_2_0 = null;

        EObject lv_function_parameter_section_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6515:2: ( ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) ) )
            // InternalPascal.g:6516:2: ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) )
            {
            // InternalPascal.g:6516:2: ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt73=1;
                }
                break;
            case 69:
                {
                alt73=2;
                }
                break;
            case 71:
                {
                alt73=3;
                }
                break;
            case 70:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalPascal.g:6517:3: ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:6517:3: ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:6518:4: (lv_value_parameter_section_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:6518:4: (lv_value_parameter_section_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:6519:5: lv_value_parameter_section_0_0= rulevalue_parameter_section
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
                    // InternalPascal.g:6537:3: ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:6537:3: ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:6538:4: (lv_variable_parameter_section_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:6538:4: (lv_variable_parameter_section_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:6539:5: lv_variable_parameter_section_1_0= rulevariable_parameter_section
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
                    // InternalPascal.g:6557:3: ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) )
                    {
                    // InternalPascal.g:6557:3: ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) )
                    // InternalPascal.g:6558:4: (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section )
                    {
                    // InternalPascal.g:6558:4: (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section )
                    // InternalPascal.g:6559:5: lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section
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
                    // InternalPascal.g:6577:3: ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) )
                    {
                    // InternalPascal.g:6577:3: ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) )
                    // InternalPascal.g:6578:4: (lv_function_parameter_section_3_0= rulefunction_parameter_section )
                    {
                    // InternalPascal.g:6578:4: (lv_function_parameter_section_3_0= rulefunction_parameter_section )
                    // InternalPascal.g:6579:5: lv_function_parameter_section_3_0= rulefunction_parameter_section
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
    // InternalPascal.g:6600:1: entryRulefunction_parameter_section returns [EObject current=null] : iv_rulefunction_parameter_section= rulefunction_parameter_section EOF ;
    public final EObject entryRulefunction_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_parameter_section = null;


        try {
            // InternalPascal.g:6600:67: (iv_rulefunction_parameter_section= rulefunction_parameter_section EOF )
            // InternalPascal.g:6601:2: iv_rulefunction_parameter_section= rulefunction_parameter_section EOF
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
    // InternalPascal.g:6607:1: rulefunction_parameter_section returns [EObject current=null] : ( (lv_function_heading_0_0= rulefunction_heading ) ) ;
    public final EObject rulefunction_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_function_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6613:2: ( ( (lv_function_heading_0_0= rulefunction_heading ) ) )
            // InternalPascal.g:6614:2: ( (lv_function_heading_0_0= rulefunction_heading ) )
            {
            // InternalPascal.g:6614:2: ( (lv_function_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:6615:3: (lv_function_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:6615:3: (lv_function_heading_0_0= rulefunction_heading )
            // InternalPascal.g:6616:4: lv_function_heading_0_0= rulefunction_heading
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
    // InternalPascal.g:6636:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:6636:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:6637:2: iv_rulefunction_heading= rulefunction_heading EOF
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
    // InternalPascal.g:6643:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formal_parameter_list_2_0 = null;

        EObject lv_result_type_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6649:2: ( (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) ) )
            // InternalPascal.g:6650:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) )
            {
            // InternalPascal.g:6650:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) )
            // InternalPascal.g:6651:3: otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:6655:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6656:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6656:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6657:5: lv_identifier_1_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_headingAccess().getIdentifierIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            // InternalPascal.g:6674:3: ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==14) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalPascal.g:6675:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:6675:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:6676:5: lv_formal_parameter_list_2_0= ruleformal_parameter_list
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

            otherlv_3=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
              		
            }
            // InternalPascal.g:6697:3: ( (lv_result_type_4_0= ruleresult_type ) )
            // InternalPascal.g:6698:4: (lv_result_type_4_0= ruleresult_type )
            {
            // InternalPascal.g:6698:4: (lv_result_type_4_0= ruleresult_type )
            // InternalPascal.g:6699:5: lv_result_type_4_0= ruleresult_type
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
    // InternalPascal.g:6720:1: entryRuleresult_type returns [EObject current=null] : iv_ruleresult_type= ruleresult_type EOF ;
    public final EObject entryRuleresult_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresult_type = null;


        try {
            // InternalPascal.g:6720:52: (iv_ruleresult_type= ruleresult_type EOF )
            // InternalPascal.g:6721:2: iv_ruleresult_type= ruleresult_type EOF
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
    // InternalPascal.g:6727:1: ruleresult_type returns [EObject current=null] : ( (lv_type_identifier_0_0= ruletype_identifier ) ) ;
    public final EObject ruleresult_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6733:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) )
            // InternalPascal.g:6734:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            {
            // InternalPascal.g:6734:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            // InternalPascal.g:6735:3: (lv_type_identifier_0_0= ruletype_identifier )
            {
            // InternalPascal.g:6735:3: (lv_type_identifier_0_0= ruletype_identifier )
            // InternalPascal.g:6736:4: lv_type_identifier_0_0= ruletype_identifier
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
    // InternalPascal.g:6756:1: entryRuleprocedure_parameter_section returns [EObject current=null] : iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF ;
    public final EObject entryRuleprocedure_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_parameter_section = null;


        try {
            // InternalPascal.g:6756:68: (iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF )
            // InternalPascal.g:6757:2: iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF
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
    // InternalPascal.g:6763:1: ruleprocedure_parameter_section returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject ruleprocedure_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6769:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:6770:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:6770:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:6771:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:6771:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:6772:4: lv_procedure_heading_0_0= ruleprocedure_heading
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
    // InternalPascal.g:6792:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:6792:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:6793:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
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
    // InternalPascal.g:6799:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_list_1_0 = null;

        EObject lv_parameter_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6805:2: ( (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:6806:2: (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:6806:2: (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:6807:3: otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:6811:3: ( (lv_identifier_list_1_0= ruleidentifier_list ) )
            // InternalPascal.g:6812:4: (lv_identifier_list_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:6812:4: (lv_identifier_list_1_0= ruleidentifier_list )
            // InternalPascal.g:6813:5: lv_identifier_list_1_0= ruleidentifier_list
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

            otherlv_2=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
              		
            }
            // InternalPascal.g:6834:3: ( (lv_parameter_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:6835:4: (lv_parameter_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:6835:4: (lv_parameter_type_3_0= ruleparameter_type )
            // InternalPascal.g:6836:5: lv_parameter_type_3_0= ruleparameter_type
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
    // InternalPascal.g:6857:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:6857:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:6858:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
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
    // InternalPascal.g:6864:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_parameter_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6870:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:6871:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:6871:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:6872:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:6872:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:6873:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:6873:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:6874:5: lv_identifier_list_0_0= ruleidentifier_list
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

            otherlv_1=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:6895:3: ( (lv_parameter_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:6896:4: (lv_parameter_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:6896:4: (lv_parameter_type_2_0= ruleparameter_type )
            // InternalPascal.g:6897:5: lv_parameter_type_2_0= ruleparameter_type
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
    // InternalPascal.g:6918:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:6918:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:6919:2: iv_ruleparameter_type= ruleparameter_type EOF
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
    // InternalPascal.g:6925:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;

        EObject lv_conformant_array_schema_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6931:2: ( ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:6932:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) )
            {
            // InternalPascal.g:6932:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==63||LA75_0==67) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalPascal.g:6933:3: ( (lv_type_identifier_0_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:6933:3: ( (lv_type_identifier_0_0= ruletype_identifier ) )
                    // InternalPascal.g:6934:4: (lv_type_identifier_0_0= ruletype_identifier )
                    {
                    // InternalPascal.g:6934:4: (lv_type_identifier_0_0= ruletype_identifier )
                    // InternalPascal.g:6935:5: lv_type_identifier_0_0= ruletype_identifier
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
                    // InternalPascal.g:6953:3: ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:6953:3: ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:6954:4: (lv_conformant_array_schema_1_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:6954:4: (lv_conformant_array_schema_1_0= ruleconformant_array_schema )
                    // InternalPascal.g:6955:5: lv_conformant_array_schema_1_0= ruleconformant_array_schema
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
    // InternalPascal.g:6976:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalPascal.g:6976:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalPascal.g:6977:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
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
    // InternalPascal.g:6983:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_conformant_array_schema_0_0 = null;

        EObject lv_unpacked_conformant_array_schema_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6989:2: ( ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalPascal.g:6990:2: ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalPascal.g:6990:2: ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==63) ) {
                alt76=1;
            }
            else if ( (LA76_0==67) ) {
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
                    // InternalPascal.g:6991:3: ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:6991:3: ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) )
                    // InternalPascal.g:6992:4: (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalPascal.g:6992:4: (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema )
                    // InternalPascal.g:6993:5: lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema
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
                    // InternalPascal.g:7011:3: ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:7011:3: ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalPascal.g:7012:4: (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalPascal.g:7012:4: (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema )
                    // InternalPascal.g:7013:5: lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema
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
    // InternalPascal.g:7034:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:7034:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:7035:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
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
    // InternalPascal.g:7041:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) ) ;
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
            // InternalPascal.g:7047:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) ) )
            // InternalPascal.g:7048:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) )
            {
            // InternalPascal.g:7048:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:7049:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPascal.g:7057:3: ( (lv_bound_specification_2_0= rulebound_specification ) )
            // InternalPascal.g:7058:4: (lv_bound_specification_2_0= rulebound_specification )
            {
            // InternalPascal.g:7058:4: (lv_bound_specification_2_0= rulebound_specification )
            // InternalPascal.g:7059:5: lv_bound_specification_2_0= rulebound_specification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationBound_specificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            // InternalPascal.g:7076:3: (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==16) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalPascal.g:7077:4: otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	      			
            	    }
            	    // InternalPascal.g:7081:4: ( (lv_bound_specification_4_0= rulebound_specification ) )
            	    // InternalPascal.g:7082:5: (lv_bound_specification_4_0= rulebound_specification )
            	    {
            	    // InternalPascal.g:7082:5: (lv_bound_specification_4_0= rulebound_specification )
            	    // InternalPascal.g:7083:6: lv_bound_specification_4_0= rulebound_specification
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBound_specificationBound_specificationParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
            	    break loop77;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,50,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
              		
            }
            // InternalPascal.g:7109:3: ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==63||LA78_0==67) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalPascal.g:7110:4: ( (lv_type_identifier_7_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:7110:4: ( (lv_type_identifier_7_0= ruletype_identifier ) )
                    // InternalPascal.g:7111:5: (lv_type_identifier_7_0= ruletype_identifier )
                    {
                    // InternalPascal.g:7111:5: (lv_type_identifier_7_0= ruletype_identifier )
                    // InternalPascal.g:7112:6: lv_type_identifier_7_0= ruletype_identifier
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
                    // InternalPascal.g:7130:4: ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:7130:4: ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:7131:5: (lv_conformant_array_schema_8_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:7131:5: (lv_conformant_array_schema_8_0= ruleconformant_array_schema )
                    // InternalPascal.g:7132:6: lv_conformant_array_schema_8_0= ruleconformant_array_schema
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
    // InternalPascal.g:7154:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalPascal.g:7154:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalPascal.g:7155:2: iv_rulebound_specification= rulebound_specification EOF
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
    // InternalPascal.g:7161:1: rulebound_specification returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_identifier2_2_0 = null;

        EObject lv_ordinal_type_identifier_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7167:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) ) )
            // InternalPascal.g:7168:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) )
            {
            // InternalPascal.g:7168:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) )
            // InternalPascal.g:7169:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) )
            {
            // InternalPascal.g:7169:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:7170:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:7170:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:7171:5: lv_identifier_0_0= ruleidentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBound_specificationAccess().getIdentifierIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_56);
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

            otherlv_1=(Token)match(input,68,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalPascal.g:7192:3: ( (lv_identifier2_2_0= ruleidentifier ) )
            // InternalPascal.g:7193:4: (lv_identifier2_2_0= ruleidentifier )
            {
            // InternalPascal.g:7193:4: (lv_identifier2_2_0= ruleidentifier )
            // InternalPascal.g:7194:5: lv_identifier2_2_0= ruleidentifier
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

            otherlv_3=(Token)match(input,20,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
              		
            }
            // InternalPascal.g:7215:3: ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) )
            // InternalPascal.g:7216:4: (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier )
            {
            // InternalPascal.g:7216:4: (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier )
            // InternalPascal.g:7217:5: lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier
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
    // InternalPascal.g:7238:1: entryRuleordinal_type_identifier returns [EObject current=null] : iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF ;
    public final EObject entryRuleordinal_type_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleordinal_type_identifier = null;


        try {
            // InternalPascal.g:7238:64: (iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF )
            // InternalPascal.g:7239:2: iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF
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
    // InternalPascal.g:7245:1: ruleordinal_type_identifier returns [EObject current=null] : ( (lv_type_identifier_0_0= ruletype_identifier ) ) ;
    public final EObject ruleordinal_type_identifier() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7251:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) )
            // InternalPascal.g:7252:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            {
            // InternalPascal.g:7252:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            // InternalPascal.g:7253:3: (lv_type_identifier_0_0= ruletype_identifier )
            {
            // InternalPascal.g:7253:3: (lv_type_identifier_0_0= ruletype_identifier )
            // InternalPascal.g:7254:4: lv_type_identifier_0_0= ruletype_identifier
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
    // InternalPascal.g:7274:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:7274:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:7275:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
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
    // InternalPascal.g:7281:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) ) ;
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
            // InternalPascal.g:7287:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:7288:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:7288:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) )
            // InternalPascal.g:7289:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,67,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalPascal.g:7301:3: ( (lv_bound_specification_3_0= rulebound_specification ) )
            // InternalPascal.g:7302:4: (lv_bound_specification_3_0= rulebound_specification )
            {
            // InternalPascal.g:7302:4: (lv_bound_specification_3_0= rulebound_specification )
            // InternalPascal.g:7303:5: lv_bound_specification_3_0= rulebound_specification
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

            otherlv_4=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,50,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
              		
            }
            // InternalPascal.g:7328:3: ( (lv_type_identifier_6_0= ruletype_identifier ) )
            // InternalPascal.g:7329:4: (lv_type_identifier_6_0= ruletype_identifier )
            {
            // InternalPascal.g:7329:4: (lv_type_identifier_6_0= ruletype_identifier )
            // InternalPascal.g:7330:5: lv_type_identifier_6_0= ruletype_identifier
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
    // InternalPascal.g:7351:1: entryRuleoutput_value returns [EObject current=null] : iv_ruleoutput_value= ruleoutput_value EOF ;
    public final EObject entryRuleoutput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_value = null;


        try {
            // InternalPascal.g:7351:53: (iv_ruleoutput_value= ruleoutput_value EOF )
            // InternalPascal.g:7352:2: iv_ruleoutput_value= ruleoutput_value EOF
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
    // InternalPascal.g:7358:1: ruleoutput_value returns [EObject current=null] : (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? ) ;
    public final EObject ruleoutput_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_expression_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7364:2: ( (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? ) )
            // InternalPascal.g:7365:2: (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? )
            {
            // InternalPascal.g:7365:2: (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? )
            // InternalPascal.g:7366:3: this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )?
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
            // InternalPascal.g:7377:3: (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==16) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalPascal.g:7378:4: otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_1_0());
                      			
                    }
                    // InternalPascal.g:7382:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:7383:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:7383:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:7384:6: lv_expression_2_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOutput_valueAccess().getExpressionExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
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

                    // InternalPascal.g:7401:4: (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==20) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalPascal.g:7402:5: otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) )
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getOutput_valueAccess().getColonKeyword_1_2_0());
                              				
                            }
                            // InternalPascal.g:7406:5: ( (lv_expression_4_0= ruleexpression ) )
                            // InternalPascal.g:7407:6: (lv_expression_4_0= ruleexpression )
                            {
                            // InternalPascal.g:7407:6: (lv_expression_4_0= ruleexpression )
                            // InternalPascal.g:7408:7: lv_expression_4_0= ruleexpression
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


        // InternalPascal.g:952:3: ( ( (lv_actual_value_0_0= ruleactual_value ) ) )
        // InternalPascal.g:952:3: ( (lv_actual_value_0_0= ruleactual_value ) )
        {
        // InternalPascal.g:952:3: ( (lv_actual_value_0_0= ruleactual_value ) )
        // InternalPascal.g:953:4: (lv_actual_value_0_0= ruleactual_value )
        {
        // InternalPascal.g:953:4: (lv_actual_value_0_0= ruleactual_value )
        // InternalPascal.g:954:5: lv_actual_value_0_0= ruleactual_value
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


        // InternalPascal.g:972:3: ( ( (lv_actual_variable_1_0= ruleactual_variable ) ) )
        // InternalPascal.g:972:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
        {
        // InternalPascal.g:972:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
        // InternalPascal.g:973:4: (lv_actual_variable_1_0= ruleactual_variable )
        {
        // InternalPascal.g:973:4: (lv_actual_variable_1_0= ruleactual_variable )
        // InternalPascal.g:974:5: lv_actual_variable_1_0= ruleactual_variable
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


        // InternalPascal.g:992:3: ( ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) )
        // InternalPascal.g:992:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
        {
        // InternalPascal.g:992:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
        // InternalPascal.g:993:4: (lv_actual_procedure_2_0= ruleactual_procedure )
        {
        // InternalPascal.g:993:4: (lv_actual_procedure_2_0= ruleactual_procedure )
        // InternalPascal.g:994:5: lv_actual_procedure_2_0= ruleactual_procedure
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


        // InternalPascal.g:1230:4: ( ( (lv_variable_0_0= rulevariable ) ) )
        // InternalPascal.g:1230:4: ( (lv_variable_0_0= rulevariable ) )
        {
        // InternalPascal.g:1230:4: ( (lv_variable_0_0= rulevariable ) )
        // InternalPascal.g:1231:5: (lv_variable_0_0= rulevariable )
        {
        // InternalPascal.g:1231:5: (lv_variable_0_0= rulevariable )
        // InternalPascal.g:1232:6: lv_variable_0_0= rulevariable
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


        // InternalPascal.g:1451:4: ( (lv_sign_0_0= rulesign ) )
        // InternalPascal.g:1451:4: (lv_sign_0_0= rulesign )
        {
        // InternalPascal.g:1451:4: (lv_sign_0_0= rulesign )
        // InternalPascal.g:1452:5: lv_sign_0_0= rulesign
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


        // InternalPascal.g:1716:3: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) )
        // InternalPascal.g:1716:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
        {
        // InternalPascal.g:1716:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
        // InternalPascal.g:1717:4: () ( (lv_variable_1_0= rulevariable ) )
        {
        // InternalPascal.g:1717:4: ()
        // InternalPascal.g:1718:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPascal.g:1727:4: ( (lv_variable_1_0= rulevariable ) )
        // InternalPascal.g:1728:5: (lv_variable_1_0= rulevariable )
        {
        // InternalPascal.g:1728:5: (lv_variable_1_0= rulevariable )
        // InternalPascal.g:1729:6: lv_variable_1_0= rulevariable
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

    // $ANTLR start synpred36_InternalPascal
    public final void synpred36_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_identifier_7_0 = null;


        // InternalPascal.g:1832:3: ( ( (lv_identifier_7_0= ruleidentifier ) ) )
        // InternalPascal.g:1832:3: ( (lv_identifier_7_0= ruleidentifier ) )
        {
        // InternalPascal.g:1832:3: ( (lv_identifier_7_0= ruleidentifier ) )
        // InternalPascal.g:1833:4: (lv_identifier_7_0= ruleidentifier )
        {
        // InternalPascal.g:1833:4: (lv_identifier_7_0= ruleidentifier )
        // InternalPascal.g:1834:5: lv_identifier_7_0= ruleidentifier
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFactorAccess().getIdentifierIdentifierParserRuleCall_6_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_identifier_7_0=ruleidentifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalPascal

    // $ANTLR start synpred37_InternalPascal
    public final void synpred37_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_function_designator_8_0 = null;


        // InternalPascal.g:1852:3: ( ( (lv_function_designator_8_0= rulefunction_designator ) ) )
        // InternalPascal.g:1852:3: ( (lv_function_designator_8_0= rulefunction_designator ) )
        {
        // InternalPascal.g:1852:3: ( (lv_function_designator_8_0= rulefunction_designator ) )
        // InternalPascal.g:1853:4: (lv_function_designator_8_0= rulefunction_designator )
        {
        // InternalPascal.g:1853:4: (lv_function_designator_8_0= rulefunction_designator )
        // InternalPascal.g:1854:5: lv_function_designator_8_0= rulefunction_designator
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFactorAccess().getFunction_designatorFunction_designatorParserRuleCall_7_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_function_designator_8_0=rulefunction_designator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalPascal

    // $ANTLR start synpred44_InternalPascal
    public final void synpred44_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_digit_sequence2_2_0 = null;


        // InternalPascal.g:2237:5: ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )
        // InternalPascal.g:2237:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
        {
        // InternalPascal.g:2237:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
        // InternalPascal.g:2238:6: lv_digit_sequence2_2_0= ruledigit_sequence
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


        // InternalPascal.g:2347:4: ( (lv_sign_2_0= rulesign ) )
        // InternalPascal.g:2347:4: (lv_sign_2_0= rulesign )
        {
        // InternalPascal.g:2347:4: (lv_sign_2_0= rulesign )
        // InternalPascal.g:2348:5: lv_sign_2_0= rulesign
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

        // InternalPascal.g:2477:4: (otherlv_6= '^' )
        // InternalPascal.g:2477:4: otherlv_6= '^'
        {
        otherlv_6=(Token)match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalPascal

    // $ANTLR start synpred64_InternalPascal
    public final void synpred64_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statement_5_0 = null;


        // InternalPascal.g:3306:4: (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )
        // InternalPascal.g:3306:4: otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) )
        {
        otherlv_4=(Token)match(input,53,FOLLOW_10); if (state.failed) return ;
        // InternalPascal.g:3310:4: ( (lv_statement_5_0= rulestatement ) )
        // InternalPascal.g:3311:5: (lv_statement_5_0= rulestatement )
        {
        // InternalPascal.g:3311:5: (lv_statement_5_0= rulestatement )
        // InternalPascal.g:3312:6: lv_statement_5_0= rulestatement
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


        // InternalPascal.g:3881:5: ( ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) ) )
        // InternalPascal.g:3881:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
        {
        // InternalPascal.g:3881:5: ( ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) ) )
        // InternalPascal.g:3882:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) ) otherlv_6= ';' ( (lv_procedure_body_7_0= ruleprocedure_body ) )
        {
        // InternalPascal.g:3882:6: ( (lv_procedure_heading_5_0= ruleprocedure_heading ) )
        // InternalPascal.g:3883:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
        {
        // InternalPascal.g:3883:7: (lv_procedure_heading_5_0= ruleprocedure_heading )
        // InternalPascal.g:3884:8: lv_procedure_heading_5_0= ruleprocedure_heading
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

        otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3905:6: ( (lv_procedure_body_7_0= ruleprocedure_body ) )
        // InternalPascal.g:3906:7: (lv_procedure_body_7_0= ruleprocedure_body )
        {
        // InternalPascal.g:3906:7: (lv_procedure_body_7_0= ruleprocedure_body )
        // InternalPascal.g:3907:8: lv_procedure_body_7_0= ruleprocedure_body
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


        // InternalPascal.g:3926:5: ( ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) ) )
        // InternalPascal.g:3926:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
        {
        // InternalPascal.g:3926:5: ( ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) ) )
        // InternalPascal.g:3927:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) ) otherlv_9= ';' ( (lv_directive_10_0= ruledirective ) )
        {
        // InternalPascal.g:3927:6: ( (lv_procedure_heading_8_0= ruleprocedure_heading ) )
        // InternalPascal.g:3928:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
        {
        // InternalPascal.g:3928:7: (lv_procedure_heading_8_0= ruleprocedure_heading )
        // InternalPascal.g:3929:8: lv_procedure_heading_8_0= ruleprocedure_heading
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

        otherlv_9=(Token)match(input,16,FOLLOW_43); if (state.failed) return ;
        // InternalPascal.g:3950:6: ( (lv_directive_10_0= ruledirective ) )
        // InternalPascal.g:3951:7: (lv_directive_10_0= ruledirective )
        {
        // InternalPascal.g:3951:7: (lv_directive_10_0= ruledirective )
        // InternalPascal.g:3952:8: lv_directive_10_0= ruledirective
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


        // InternalPascal.g:3971:5: ( ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) ) )
        // InternalPascal.g:3971:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
        {
        // InternalPascal.g:3971:5: ( ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) ) )
        // InternalPascal.g:3972:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) ) otherlv_12= ';' ( (lv_procedure_body_13_0= ruleprocedure_body ) )
        {
        // InternalPascal.g:3972:6: ( (lv_procedure_identification_11_0= ruleprocedure_identification ) )
        // InternalPascal.g:3973:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
        {
        // InternalPascal.g:3973:7: (lv_procedure_identification_11_0= ruleprocedure_identification )
        // InternalPascal.g:3974:8: lv_procedure_identification_11_0= ruleprocedure_identification
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

        otherlv_12=(Token)match(input,16,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3995:6: ( (lv_procedure_body_13_0= ruleprocedure_body ) )
        // InternalPascal.g:3996:7: (lv_procedure_body_13_0= ruleprocedure_body )
        {
        // InternalPascal.g:3996:7: (lv_procedure_body_13_0= ruleprocedure_body )
        // InternalPascal.g:3997:8: lv_procedure_body_13_0= ruleprocedure_body
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


        // InternalPascal.g:4016:5: ( ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) ) )
        // InternalPascal.g:4016:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
        {
        // InternalPascal.g:4016:5: ( ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) ) )
        // InternalPascal.g:4017:6: ( (lv_function_heading_14_0= rulefunction_heading ) ) otherlv_15= ';' ( (lv_function_body_16_0= rulefunction_body ) )
        {
        // InternalPascal.g:4017:6: ( (lv_function_heading_14_0= rulefunction_heading ) )
        // InternalPascal.g:4018:7: (lv_function_heading_14_0= rulefunction_heading )
        {
        // InternalPascal.g:4018:7: (lv_function_heading_14_0= rulefunction_heading )
        // InternalPascal.g:4019:8: lv_function_heading_14_0= rulefunction_heading
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

        otherlv_15=(Token)match(input,16,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:4040:6: ( (lv_function_body_16_0= rulefunction_body ) )
        // InternalPascal.g:4041:7: (lv_function_body_16_0= rulefunction_body )
        {
        // InternalPascal.g:4041:7: (lv_function_body_16_0= rulefunction_body )
        // InternalPascal.g:4042:8: lv_function_body_16_0= rulefunction_body
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


        // InternalPascal.g:4061:5: ( ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) ) )
        // InternalPascal.g:4061:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
        {
        // InternalPascal.g:4061:5: ( ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) ) )
        // InternalPascal.g:4062:6: ( (lv_function_heading_17_0= rulefunction_heading ) ) otherlv_18= ';' ( (lv_directive_19_0= ruledirective ) )
        {
        // InternalPascal.g:4062:6: ( (lv_function_heading_17_0= rulefunction_heading ) )
        // InternalPascal.g:4063:7: (lv_function_heading_17_0= rulefunction_heading )
        {
        // InternalPascal.g:4063:7: (lv_function_heading_17_0= rulefunction_heading )
        // InternalPascal.g:4064:8: lv_function_heading_17_0= rulefunction_heading
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

        otherlv_18=(Token)match(input,16,FOLLOW_43); if (state.failed) return ;
        // InternalPascal.g:4085:6: ( (lv_directive_19_0= ruledirective ) )
        // InternalPascal.g:4086:7: (lv_directive_19_0= ruledirective )
        {
        // InternalPascal.g:4086:7: (lv_directive_19_0= ruledirective )
        // InternalPascal.g:4087:8: lv_directive_19_0= ruledirective
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


        // InternalPascal.g:4380:5: ( (lv_sign_0_0= rulesign ) )
        // InternalPascal.g:4380:5: (lv_sign_0_0= rulesign )
        {
        // InternalPascal.g:4380:5: (lv_sign_0_0= rulesign )
        // InternalPascal.g:4381:6: lv_sign_0_0= rulesign
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
    public final boolean synpred37_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalPascal_fragment(); // can never throw exception
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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\0\12\uffff";
    static final String dfa_3s = "\1\56\1\0\12\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\11\1\12\1\1\1\7\1\10";
    static final String dfa_5s = "\1\uffff\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\2\7\uffff\1\7\25\uffff\1\5\1\10\2\6\1\4\4\uffff\2\2",
            "\1\uffff",
            "",
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
            return "1715:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= RULE_STRINGS ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_boolean_6_0= ruleboolean ) ) | ( (lv_identifier_7_0= ruleidentifier ) ) | ( (lv_function_designator_8_0= rulefunction_designator ) ) | (otherlv_9= '(' ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= ')' ) | (otherlv_12= 'not' ( (lv_factor_13_0= rulefactor ) ) ) )";
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
                        if ( (synpred30_InternalPascal()) ) {s = 9;}

                        else if ( (synpred36_InternalPascal()) ) {s = 10;}

                        else if ( (synpred37_InternalPascal()) ) {s = 11;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x7000000000040000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0A4AE00000240050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000600000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000061F000004070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003F800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000600040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000063F000004070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00006C0000000042L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000110000001002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000001002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x6000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000600000000050L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000700000004070L,0x000000000000000FL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000008010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000600000004070L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000E0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000100002L});

}