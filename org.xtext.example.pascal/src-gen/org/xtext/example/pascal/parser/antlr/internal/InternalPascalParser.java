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
    // InternalPascal.g:113:1: ruleprogram returns [EObject current=null] : ( ( (lv_program_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_program_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:119:2: ( ( ( (lv_program_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:120:2: ( ( (lv_program_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:120:2: ( ( (lv_program_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:121:3: ( (lv_program_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:121:3: ( (lv_program_heading_0_0= ruleprogram_heading ) )
            // InternalPascal.g:122:4: (lv_program_heading_0_0= ruleprogram_heading )
            {
            // InternalPascal.g:122:4: (lv_program_heading_0_0= ruleprogram_heading )
            // InternalPascal.g:123:5: lv_program_heading_0_0= ruleprogram_heading
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getProgram_headingProgram_headingParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_program_heading_0_0=ruleprogram_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"program_heading",
              						lv_program_heading_0_0,
              						"org.xtext.example.pascal.Pascal.program_heading");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:140:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:141:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:141:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:142:5: lv_block_1_0= ruleblock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_1_0,
              						"org.xtext.example.pascal.Pascal.block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
              		
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
    // InternalPascal.g:167:1: entryRuleprogram_heading returns [EObject current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final EObject entryRuleprogram_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading = null;


        try {
            // InternalPascal.g:167:56: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // InternalPascal.g:168:2: iv_ruleprogram_heading= ruleprogram_heading EOF
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
    // InternalPascal.g:174:1: ruleprogram_heading returns [EObject current=null] : (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' ) ;
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
            // InternalPascal.g:180:2: ( (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // InternalPascal.g:181:2: (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // InternalPascal.g:181:2: (otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';' )
            // InternalPascal.g:182:3: otherlv_0= 'program' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_identifier_list_3_0= ruleidentifier_list ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgram_headingAccess().getProgramKeyword_0());
              		
            }
            // InternalPascal.g:186:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalPascal.g:187:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalPascal.g:187:4: (lv_identifier_1_0= RULE_ID )
            // InternalPascal.g:188:5: lv_identifier_1_0= RULE_ID
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
            // InternalPascal.g:208:3: ( (lv_identifier_list_3_0= ruleidentifier_list ) )
            // InternalPascal.g:209:4: (lv_identifier_list_3_0= ruleidentifier_list )
            {
            // InternalPascal.g:209:4: (lv_identifier_list_3_0= ruleidentifier_list )
            // InternalPascal.g:210:5: lv_identifier_list_3_0= ruleidentifier_list
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
    // InternalPascal.g:239:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:239:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:240:2: iv_ruleidentifier_list= ruleidentifier_list EOF
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
    // InternalPascal.g:246:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        Token otherlv_1=null;
        Token lv_identifier_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:252:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:253:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:253:2: ( ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:254:3: ( (lv_identifier_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:254:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:255:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:255:4: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:256:5: lv_identifier_0_0= RULE_ID
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

            // InternalPascal.g:272:3: (otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascal.g:273:4: otherlv_1= ',' ( (lv_identifier_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:277:4: ( (lv_identifier_2_0= RULE_ID ) )
            	    // InternalPascal.g:278:5: (lv_identifier_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:278:5: (lv_identifier_2_0= RULE_ID )
            	    // InternalPascal.g:279:6: lv_identifier_2_0= RULE_ID
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
            	    break loop1;
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
    // InternalPascal.g:300:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:300:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:301:2: iv_ruleblock= ruleblock EOF
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
    // InternalPascal.g:307:1: ruleblock returns [EObject current=null] : ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_part_0_0 = null;

        EObject lv_statement_part_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:313:2: ( ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) ) )
            // InternalPascal.g:314:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:314:2: ( ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) ) )
            // InternalPascal.g:315:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) ) ( (lv_statement_part_1_0= rulestatement_part ) )
            {
            // InternalPascal.g:315:3: ( (lv_declaration_part_0_0= ruledeclaration_part ) )
            // InternalPascal.g:316:4: (lv_declaration_part_0_0= ruledeclaration_part )
            {
            // InternalPascal.g:316:4: (lv_declaration_part_0_0= ruledeclaration_part )
            // InternalPascal.g:317:5: lv_declaration_part_0_0= ruledeclaration_part
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

            // InternalPascal.g:334:3: ( (lv_statement_part_1_0= rulestatement_part ) )
            // InternalPascal.g:335:4: (lv_statement_part_1_0= rulestatement_part )
            {
            // InternalPascal.g:335:4: (lv_statement_part_1_0= rulestatement_part )
            // InternalPascal.g:336:5: lv_statement_part_1_0= rulestatement_part
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
    // InternalPascal.g:357:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:357:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:358:2: iv_rulestatement_part= rulestatement_part EOF
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
    // InternalPascal.g:364:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:370:2: ( (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:371:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:371:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:372:3: otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:376:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:377:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:377:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:378:5: lv_statement_sequence_1_0= rulestatement_sequence
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
    // InternalPascal.g:403:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:403:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:404:2: iv_rulestatement_sequence= rulestatement_sequence EOF
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
    // InternalPascal.g:410:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statement_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:416:2: ( ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:417:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:417:2: ( ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )* )
            // InternalPascal.g:418:3: ( (lv_statement_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:418:3: ( (lv_statement_0_0= rulestatement ) )
            // InternalPascal.g:419:4: (lv_statement_0_0= rulestatement )
            {
            // InternalPascal.g:419:4: (lv_statement_0_0= rulestatement )
            // InternalPascal.g:420:5: lv_statement_0_0= rulestatement
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

            // InternalPascal.g:437:3: (otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:438:4: otherlv_1= ';' ( (lv_statement_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:442:4: ( (lv_statement_2_0= rulestatement ) )
            	    // InternalPascal.g:443:5: (lv_statement_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:443:5: (lv_statement_2_0= rulestatement )
            	    // InternalPascal.g:444:6: lv_statement_2_0= rulestatement
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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:466:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:466:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:467:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:473:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_statement_2_0 = null;

        EObject lv_structured_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:479:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:480:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:480:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:481:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:481:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||(LA3_0>=44 && LA3_0<=45)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:482:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:482:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:483:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:483:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:484:6: lv_label_0_0= rulelabel
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

            // InternalPascal.g:506:3: ( ( (lv_simple_statement_2_0= rulesimple_statement ) ) | ( (lv_structured_statement_3_0= rulestructured_statement ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||LA4_0==RULE_ID||LA4_0==15||LA4_0==18||LA4_0==20||LA4_0==52||LA4_0==57) ) {
                alt4=1;
            }
            else if ( (LA4_0==17||LA4_0==46||LA4_0==48||LA4_0==50||LA4_0==53||LA4_0==56||LA4_0==58) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:507:4: ( (lv_simple_statement_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:507:4: ( (lv_simple_statement_2_0= rulesimple_statement ) )
                    // InternalPascal.g:508:5: (lv_simple_statement_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:508:5: (lv_simple_statement_2_0= rulesimple_statement )
                    // InternalPascal.g:509:6: lv_simple_statement_2_0= rulesimple_statement
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
                    // InternalPascal.g:527:4: ( (lv_structured_statement_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:527:4: ( (lv_structured_statement_3_0= rulestructured_statement ) )
                    // InternalPascal.g:528:5: (lv_structured_statement_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:528:5: (lv_structured_statement_3_0= rulestructured_statement )
                    // InternalPascal.g:529:6: lv_structured_statement_3_0= rulestructured_statement
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
    // InternalPascal.g:551:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:551:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:552:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascal.g:558:1: rulesimple_statement returns [EObject current=null] : ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_statement_1_0 = null;

        EObject lv_procedure_statement_2_0 = null;

        EObject lv_goto_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:564:2: ( ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? ) )
            // InternalPascal.g:565:2: ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? )
            {
            // InternalPascal.g:565:2: ( () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )? )
            // InternalPascal.g:566:3: () ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )?
            {
            // InternalPascal.g:566:3: ()
            // InternalPascal.g:567:4: 
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

            // InternalPascal.g:576:3: ( ( (lv_assignment_statement_1_0= ruleassignment_statement ) ) | ( (lv_procedure_statement_2_0= ruleprocedure_statement ) ) | ( (lv_goto_statement_3_0= rulegoto_statement ) ) )?
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==13||LA5_1==15||LA5_1==18||LA5_1==52||LA5_1==57) ) {
                    alt5=2;
                }
                else if ( (LA5_1==11||LA5_1==21||LA5_1==37||LA5_1==43) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==20) ) {
                alt5=3;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:577:4: ( (lv_assignment_statement_1_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:577:4: ( (lv_assignment_statement_1_0= ruleassignment_statement ) )
                    // InternalPascal.g:578:5: (lv_assignment_statement_1_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:578:5: (lv_assignment_statement_1_0= ruleassignment_statement )
                    // InternalPascal.g:579:6: lv_assignment_statement_1_0= ruleassignment_statement
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
                    // InternalPascal.g:597:4: ( (lv_procedure_statement_2_0= ruleprocedure_statement ) )
                    {
                    // InternalPascal.g:597:4: ( (lv_procedure_statement_2_0= ruleprocedure_statement ) )
                    // InternalPascal.g:598:5: (lv_procedure_statement_2_0= ruleprocedure_statement )
                    {
                    // InternalPascal.g:598:5: (lv_procedure_statement_2_0= ruleprocedure_statement )
                    // InternalPascal.g:599:6: lv_procedure_statement_2_0= ruleprocedure_statement
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
                    // InternalPascal.g:617:4: ( (lv_goto_statement_3_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:617:4: ( (lv_goto_statement_3_0= rulegoto_statement ) )
                    // InternalPascal.g:618:5: (lv_goto_statement_3_0= rulegoto_statement )
                    {
                    // InternalPascal.g:618:5: (lv_goto_statement_3_0= rulegoto_statement )
                    // InternalPascal.g:619:6: lv_goto_statement_3_0= rulegoto_statement
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
    // InternalPascal.g:641:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:641:55: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:642:2: iv_rulegoto_statement= rulegoto_statement EOF
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
    // InternalPascal.g:648:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:654:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:655:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:655:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:656:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
              		
            }
            // InternalPascal.g:660:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:661:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:661:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:662:5: lv_label_1_0= rulelabel
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
    // InternalPascal.g:683:1: entryRuleprocedure_statement returns [EObject current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final EObject entryRuleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_statement = null;


        try {
            // InternalPascal.g:683:60: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascal.g:684:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
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
    // InternalPascal.g:690:1: ruleprocedure_statement returns [EObject current=null] : ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) ;
    public final EObject ruleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_identifier_0_0 = null;

        EObject lv_actual_parameter_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:696:2: ( ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) )
            // InternalPascal.g:697:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            {
            // InternalPascal.g:697:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            // InternalPascal.g:698:3: ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            {
            // InternalPascal.g:698:3: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:699:4: (lv_procedure_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:699:4: (lv_procedure_identifier_0_0= ruleidentifier )
            // InternalPascal.g:700:5: lv_procedure_identifier_0_0= ruleidentifier
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

            // InternalPascal.g:717:3: ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:718:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    {
                    // InternalPascal.g:718:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    // InternalPascal.g:719:5: lv_actual_parameter_list_1_0= ruleactual_parameter_list
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
    // InternalPascal.g:740:1: entryRuleactual_parameter_list returns [EObject current=null] : iv_ruleactual_parameter_list= ruleactual_parameter_list EOF ;
    public final EObject entryRuleactual_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter_list = null;


        try {
            // InternalPascal.g:740:62: (iv_ruleactual_parameter_list= ruleactual_parameter_list EOF )
            // InternalPascal.g:741:2: iv_ruleactual_parameter_list= ruleactual_parameter_list EOF
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
    // InternalPascal.g:747:1: ruleactual_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleactual_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actual_parameter_1_0 = null;

        EObject lv_actual_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:753:2: ( (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:754:2: (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:754:2: (otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')' )
            // InternalPascal.g:755:3: otherlv_0= '(' ( (lv_actual_parameter_1_0= ruleactual_parameter ) ) (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActual_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:759:3: ( (lv_actual_parameter_1_0= ruleactual_parameter ) )
            // InternalPascal.g:760:4: (lv_actual_parameter_1_0= ruleactual_parameter )
            {
            // InternalPascal.g:760:4: (lv_actual_parameter_1_0= ruleactual_parameter )
            // InternalPascal.g:761:5: lv_actual_parameter_1_0= ruleactual_parameter
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

            // InternalPascal.g:778:3: (otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:779:4: otherlv_2= ',' ( (lv_actual_parameter_3_0= ruleactual_parameter ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getActual_parameter_listAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:783:4: ( (lv_actual_parameter_3_0= ruleactual_parameter ) )
            	    // InternalPascal.g:784:5: (lv_actual_parameter_3_0= ruleactual_parameter )
            	    {
            	    // InternalPascal.g:784:5: (lv_actual_parameter_3_0= ruleactual_parameter )
            	    // InternalPascal.g:785:6: lv_actual_parameter_3_0= ruleactual_parameter
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
            	    break loop7;
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
    // InternalPascal.g:811:1: entryRuleactual_parameter returns [EObject current=null] : iv_ruleactual_parameter= ruleactual_parameter EOF ;
    public final EObject entryRuleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter = null;


        try {
            // InternalPascal.g:811:57: (iv_ruleactual_parameter= ruleactual_parameter EOF )
            // InternalPascal.g:812:2: iv_ruleactual_parameter= ruleactual_parameter EOF
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
    // InternalPascal.g:818:1: ruleactual_parameter returns [EObject current=null] : ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) ) ;
    public final EObject ruleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject lv_actual_value_0_0 = null;

        EObject lv_actual_variable_1_0 = null;

        EObject lv_actual_procedure_2_0 = null;

        EObject lv_actual_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:824:2: ( ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) ) )
            // InternalPascal.g:825:2: ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) )
            {
            // InternalPascal.g:825:2: ( ( (lv_actual_value_0_0= ruleactual_value ) ) | ( (lv_actual_variable_1_0= ruleactual_variable ) ) | ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) | ( (lv_actual_function_3_0= ruleactual_function ) ) )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==13||(LA8_0>=35 && LA8_0<=37)||LA8_0==39||(LA8_0>=44 && LA8_0<=45)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (synpred10_InternalPascal()) ) {
                    alt8=1;
                }
                else if ( (synpred11_InternalPascal()) ) {
                    alt8=2;
                }
                else if ( (synpred12_InternalPascal()) ) {
                    alt8=3;
                }
                else if ( (true) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:826:3: ( (lv_actual_value_0_0= ruleactual_value ) )
                    {
                    // InternalPascal.g:826:3: ( (lv_actual_value_0_0= ruleactual_value ) )
                    // InternalPascal.g:827:4: (lv_actual_value_0_0= ruleactual_value )
                    {
                    // InternalPascal.g:827:4: (lv_actual_value_0_0= ruleactual_value )
                    // InternalPascal.g:828:5: lv_actual_value_0_0= ruleactual_value
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
                    // InternalPascal.g:846:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
                    {
                    // InternalPascal.g:846:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
                    // InternalPascal.g:847:4: (lv_actual_variable_1_0= ruleactual_variable )
                    {
                    // InternalPascal.g:847:4: (lv_actual_variable_1_0= ruleactual_variable )
                    // InternalPascal.g:848:5: lv_actual_variable_1_0= ruleactual_variable
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
                    // InternalPascal.g:866:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
                    {
                    // InternalPascal.g:866:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
                    // InternalPascal.g:867:4: (lv_actual_procedure_2_0= ruleactual_procedure )
                    {
                    // InternalPascal.g:867:4: (lv_actual_procedure_2_0= ruleactual_procedure )
                    // InternalPascal.g:868:5: lv_actual_procedure_2_0= ruleactual_procedure
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
                    // InternalPascal.g:886:3: ( (lv_actual_function_3_0= ruleactual_function ) )
                    {
                    // InternalPascal.g:886:3: ( (lv_actual_function_3_0= ruleactual_function ) )
                    // InternalPascal.g:887:4: (lv_actual_function_3_0= ruleactual_function )
                    {
                    // InternalPascal.g:887:4: (lv_actual_function_3_0= ruleactual_function )
                    // InternalPascal.g:888:5: lv_actual_function_3_0= ruleactual_function
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
    // InternalPascal.g:909:1: entryRuleactual_function returns [EObject current=null] : iv_ruleactual_function= ruleactual_function EOF ;
    public final EObject entryRuleactual_function() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_function = null;


        try {
            // InternalPascal.g:909:56: (iv_ruleactual_function= ruleactual_function EOF )
            // InternalPascal.g:910:2: iv_ruleactual_function= ruleactual_function EOF
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
    // InternalPascal.g:916:1: ruleactual_function returns [EObject current=null] : ( (lv_function_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleactual_function() throws RecognitionException {
        EObject current = null;

        EObject lv_function_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:922:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:923:2: ( (lv_function_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:923:2: ( (lv_function_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:924:3: (lv_function_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:924:3: (lv_function_identifier_0_0= ruleidentifier )
            // InternalPascal.g:925:4: lv_function_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:945:1: entryRuleactual_procedure returns [EObject current=null] : iv_ruleactual_procedure= ruleactual_procedure EOF ;
    public final EObject entryRuleactual_procedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_procedure = null;


        try {
            // InternalPascal.g:945:57: (iv_ruleactual_procedure= ruleactual_procedure EOF )
            // InternalPascal.g:946:2: iv_ruleactual_procedure= ruleactual_procedure EOF
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
    // InternalPascal.g:952:1: ruleactual_procedure returns [EObject current=null] : ( (lv_procedure_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleactual_procedure() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:958:2: ( ( (lv_procedure_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:959:2: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:959:2: ( (lv_procedure_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:960:3: (lv_procedure_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:960:3: (lv_procedure_identifier_0_0= ruleidentifier )
            // InternalPascal.g:961:4: lv_procedure_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:981:1: entryRuleactual_variable returns [EObject current=null] : iv_ruleactual_variable= ruleactual_variable EOF ;
    public final EObject entryRuleactual_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_variable = null;


        try {
            // InternalPascal.g:981:56: (iv_ruleactual_variable= ruleactual_variable EOF )
            // InternalPascal.g:982:2: iv_ruleactual_variable= ruleactual_variable EOF
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
    // InternalPascal.g:988:1: ruleactual_variable returns [EObject current=null] : ( (lv_variable_0_0= rulevariable ) ) ;
    public final EObject ruleactual_variable() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:994:2: ( ( (lv_variable_0_0= rulevariable ) ) )
            // InternalPascal.g:995:2: ( (lv_variable_0_0= rulevariable ) )
            {
            // InternalPascal.g:995:2: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:996:3: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:996:3: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:997:4: lv_variable_0_0= rulevariable
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
    // InternalPascal.g:1017:1: entryRuleactual_value returns [EObject current=null] : iv_ruleactual_value= ruleactual_value EOF ;
    public final EObject entryRuleactual_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_value = null;


        try {
            // InternalPascal.g:1017:53: (iv_ruleactual_value= ruleactual_value EOF )
            // InternalPascal.g:1018:2: iv_ruleactual_value= ruleactual_value EOF
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
    // InternalPascal.g:1024:1: ruleactual_value returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleactual_value() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1030:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:1031:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:1031:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:1032:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:1032:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:1033:4: lv_expression_0_0= ruleexpression
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
    // InternalPascal.g:1053:1: entryRuleidentifier returns [EObject current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final EObject entryRuleidentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier = null;


        try {
            // InternalPascal.g:1053:51: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascal.g:1054:2: iv_ruleidentifier= ruleidentifier EOF
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
    // InternalPascal.g:1060:1: ruleidentifier returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleidentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1066:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalPascal.g:1067:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalPascal.g:1067:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalPascal.g:1068:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalPascal.g:1068:3: (lv_identifier_0_0= RULE_ID )
            // InternalPascal.g:1069:4: lv_identifier_0_0= RULE_ID
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
    // InternalPascal.g:1088:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:1088:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:1089:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascal.g:1095:1: ruleassignment_statement returns [EObject current=null] : ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_0_0 = null;

        EObject lv_function_identifier_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1101:2: ( ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:1102:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:1102:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:1103:3: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) ) otherlv_2= ':=' ( (lv_expression_3_0= ruleexpression ) )
            {
            // InternalPascal.g:1103:3: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred13_InternalPascal()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

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
                    // InternalPascal.g:1104:4: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1104:4: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1105:5: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1105:5: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1106:6: lv_variable_0_0= rulevariable
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
                    // InternalPascal.g:1124:4: ( (lv_function_identifier_1_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1124:4: ( (lv_function_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:1125:5: (lv_function_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:1125:5: (lv_function_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:1126:6: lv_function_identifier_1_0= ruleidentifier
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
            // InternalPascal.g:1148:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:1149:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:1149:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:1150:5: lv_expression_3_0= ruleexpression
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
    // InternalPascal.g:1171:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1171:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1172:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:1178:1: ruleexpression returns [EObject current=null] : ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_relational_operator_1_0 = null;

        EObject lv_simple_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1184:2: ( ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1185:2: ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1185:2: ( ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1186:3: ( (lv_simple_expression_0_0= rulesimple_expression ) ) ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1186:3: ( (lv_simple_expression_0_0= rulesimple_expression ) )
            // InternalPascal.g:1187:4: (lv_simple_expression_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1187:4: (lv_simple_expression_0_0= rulesimple_expression )
            // InternalPascal.g:1188:5: lv_simple_expression_0_0= rulesimple_expression
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

            // InternalPascal.g:1205:3: ( ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=22 && LA10_0<=28)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1206:4: ( (lv_relational_operator_1_0= rulerelational_operator ) ) ( (lv_simple_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1206:4: ( (lv_relational_operator_1_0= rulerelational_operator ) )
                    // InternalPascal.g:1207:5: (lv_relational_operator_1_0= rulerelational_operator )
                    {
                    // InternalPascal.g:1207:5: (lv_relational_operator_1_0= rulerelational_operator )
                    // InternalPascal.g:1208:6: lv_relational_operator_1_0= rulerelational_operator
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

                    // InternalPascal.g:1225:4: ( (lv_simple_expression_2_0= rulesimple_expression ) )
                    // InternalPascal.g:1226:5: (lv_simple_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1226:5: (lv_simple_expression_2_0= rulesimple_expression )
                    // InternalPascal.g:1227:6: lv_simple_expression_2_0= rulesimple_expression
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
    // InternalPascal.g:1249:1: entryRulerelational_operator returns [String current=null] : iv_rulerelational_operator= rulerelational_operator EOF ;
    public final String entryRulerelational_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_operator = null;


        try {
            // InternalPascal.g:1249:59: (iv_rulerelational_operator= rulerelational_operator EOF )
            // InternalPascal.g:1250:2: iv_rulerelational_operator= rulerelational_operator EOF
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
    // InternalPascal.g:1256:1: rulerelational_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken rulerelational_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1262:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' ) )
            // InternalPascal.g:1263:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            {
            // InternalPascal.g:1263:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= 'in' )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
                }
                break;
            case 28:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1264:3: kw= '='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1270:3: kw= '<>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1276:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1282:3: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1288:3: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1294:3: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelational_operatorAccess().getGreaterThanSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPascal.g:1300:3: kw= 'in'
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
    // InternalPascal.g:1309:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1309:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1310:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascal.g:1316:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ruleaddition_operator ( (lv_term_3_0= ruleterm ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_term_1_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1322:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ruleaddition_operator ( (lv_term_3_0= ruleterm ) ) )* ) )
            // InternalPascal.g:1323:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ruleaddition_operator ( (lv_term_3_0= ruleterm ) ) )* )
            {
            // InternalPascal.g:1323:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ruleaddition_operator ( (lv_term_3_0= ruleterm ) ) )* )
            // InternalPascal.g:1324:3: ( (lv_sign_0_0= rulesign ) )? ( (lv_term_1_0= ruleterm ) ) ( ruleaddition_operator ( (lv_term_3_0= ruleterm ) ) )*
            {
            // InternalPascal.g:1324:3: ( (lv_sign_0_0= rulesign ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred21_InternalPascal()) ) {
                    alt12=1;
                }
            }
            else if ( (LA12_0==45) ) {
                int LA12_2 = input.LA(2);

                if ( (synpred21_InternalPascal()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1325:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:1325:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:1326:5: lv_sign_0_0= rulesign
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

            // InternalPascal.g:1343:3: ( (lv_term_1_0= ruleterm ) )
            // InternalPascal.g:1344:4: (lv_term_1_0= ruleterm )
            {
            // InternalPascal.g:1344:4: (lv_term_1_0= ruleterm )
            // InternalPascal.g:1345:5: lv_term_1_0= ruleterm
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

            // InternalPascal.g:1362:3: ( ruleaddition_operator ( (lv_term_3_0= ruleterm ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29||(LA13_0>=44 && LA13_0<=45)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:1363:4: ruleaddition_operator ( (lv_term_3_0= ruleterm ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSimple_expressionAccess().getAddition_operatorParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    ruleaddition_operator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalPascal.g:1373:4: ( (lv_term_3_0= ruleterm ) )
            	    // InternalPascal.g:1374:5: (lv_term_3_0= ruleterm )
            	    {
            	    // InternalPascal.g:1374:5: (lv_term_3_0= ruleterm )
            	    // InternalPascal.g:1375:6: lv_term_3_0= ruleterm
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
            	    break loop13;
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
    // InternalPascal.g:1397:1: entryRuleaddition_operator returns [String current=null] : iv_ruleaddition_operator= ruleaddition_operator EOF ;
    public final String entryRuleaddition_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaddition_operator = null;


        try {
            // InternalPascal.g:1397:57: (iv_ruleaddition_operator= ruleaddition_operator EOF )
            // InternalPascal.g:1398:2: iv_ruleaddition_operator= ruleaddition_operator EOF
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
    // InternalPascal.g:1404:1: ruleaddition_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_sign_0= rulesign | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleaddition_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_sign_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1410:2: ( (this_sign_0= rulesign | kw= 'or' ) )
            // InternalPascal.g:1411:2: (this_sign_0= rulesign | kw= 'or' )
            {
            // InternalPascal.g:1411:2: (this_sign_0= rulesign | kw= 'or' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=44 && LA14_0<=45)) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1412:3: this_sign_0= rulesign
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
                    // InternalPascal.g:1423:3: kw= 'or'
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
    // InternalPascal.g:1432:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1432:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1433:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:1439:1: ruleterm returns [EObject current=null] : ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factor_0_0 = null;

        AntlrDatatypeRuleToken lv_multiplication_operator_1_0 = null;

        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1445:2: ( ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1446:2: ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1446:2: ( ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )* )
            // InternalPascal.g:1447:3: ( (lv_factor_0_0= rulefactor ) ) ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1447:3: ( (lv_factor_0_0= rulefactor ) )
            // InternalPascal.g:1448:4: (lv_factor_0_0= rulefactor )
            {
            // InternalPascal.g:1448:4: (lv_factor_0_0= rulefactor )
            // InternalPascal.g:1449:5: lv_factor_0_0= rulefactor
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

            // InternalPascal.g:1466:3: ( ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=34)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:1467:4: ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) ) ( (lv_factor_2_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1467:4: ( (lv_multiplication_operator_1_0= rulemultiplication_operator ) )
            	    // InternalPascal.g:1468:5: (lv_multiplication_operator_1_0= rulemultiplication_operator )
            	    {
            	    // InternalPascal.g:1468:5: (lv_multiplication_operator_1_0= rulemultiplication_operator )
            	    // InternalPascal.g:1469:6: lv_multiplication_operator_1_0= rulemultiplication_operator
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

            	    // InternalPascal.g:1486:4: ( (lv_factor_2_0= rulefactor ) )
            	    // InternalPascal.g:1487:5: (lv_factor_2_0= rulefactor )
            	    {
            	    // InternalPascal.g:1487:5: (lv_factor_2_0= rulefactor )
            	    // InternalPascal.g:1488:6: lv_factor_2_0= rulefactor
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
            	    break loop15;
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
    // InternalPascal.g:1510:1: entryRulemultiplication_operator returns [String current=null] : iv_rulemultiplication_operator= rulemultiplication_operator EOF ;
    public final String entryRulemultiplication_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplication_operator = null;


        try {
            // InternalPascal.g:1510:63: (iv_rulemultiplication_operator= rulemultiplication_operator EOF )
            // InternalPascal.g:1511:2: iv_rulemultiplication_operator= rulemultiplication_operator EOF
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
    // InternalPascal.g:1517:1: rulemultiplication_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken rulemultiplication_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1523:2: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' ) )
            // InternalPascal.g:1524:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            {
            // InternalPascal.g:1524:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
                }
                break;
            case 34:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1525:3: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1531:3: kw= '/'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1537:3: kw= 'div'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getDivKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1543:3: kw= 'mod'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMultiplication_operatorAccess().getModKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1549:3: kw= 'and'
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
    // InternalPascal.g:1558:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1558:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1559:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:1565:1: rulefactor returns [EObject current=null] : ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) ) ;
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
            // InternalPascal.g:1571:2: ( ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1572:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1572:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) )
            int alt17=9;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1573:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
                    {
                    // InternalPascal.g:1573:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
                    // InternalPascal.g:1574:4: () ( (lv_variable_1_0= rulevariable ) )
                    {
                    // InternalPascal.g:1574:4: ()
                    // InternalPascal.g:1575:5: 
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

                    // InternalPascal.g:1584:4: ( (lv_variable_1_0= rulevariable ) )
                    // InternalPascal.g:1585:5: (lv_variable_1_0= rulevariable )
                    {
                    // InternalPascal.g:1585:5: (lv_variable_1_0= rulevariable )
                    // InternalPascal.g:1586:6: lv_variable_1_0= rulevariable
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
                    // InternalPascal.g:1605:3: ( (lv_number_2_0= rulenumber ) )
                    {
                    // InternalPascal.g:1605:3: ( (lv_number_2_0= rulenumber ) )
                    // InternalPascal.g:1606:4: (lv_number_2_0= rulenumber )
                    {
                    // InternalPascal.g:1606:4: (lv_number_2_0= rulenumber )
                    // InternalPascal.g:1607:5: lv_number_2_0= rulenumber
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
                    // InternalPascal.g:1625:3: ( (lv_strings_3_0= rulestrings ) )
                    {
                    // InternalPascal.g:1625:3: ( (lv_strings_3_0= rulestrings ) )
                    // InternalPascal.g:1626:4: (lv_strings_3_0= rulestrings )
                    {
                    // InternalPascal.g:1626:4: (lv_strings_3_0= rulestrings )
                    // InternalPascal.g:1627:5: lv_strings_3_0= rulestrings
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
                    // InternalPascal.g:1645:3: ( (lv_set_4_0= ruleset ) )
                    {
                    // InternalPascal.g:1645:3: ( (lv_set_4_0= ruleset ) )
                    // InternalPascal.g:1646:4: (lv_set_4_0= ruleset )
                    {
                    // InternalPascal.g:1646:4: (lv_set_4_0= ruleset )
                    // InternalPascal.g:1647:5: lv_set_4_0= ruleset
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
                    // InternalPascal.g:1665:3: otherlv_5= 'nil'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getNilKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1670:3: ( (lv_identifier_6_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1670:3: ( (lv_identifier_6_0= ruleidentifier ) )
                    // InternalPascal.g:1671:4: (lv_identifier_6_0= ruleidentifier )
                    {
                    // InternalPascal.g:1671:4: (lv_identifier_6_0= ruleidentifier )
                    // InternalPascal.g:1672:5: lv_identifier_6_0= ruleidentifier
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
                    // InternalPascal.g:1690:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1690:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1691:4: (lv_function_designator_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1691:4: (lv_function_designator_7_0= rulefunction_designator )
                    // InternalPascal.g:1692:5: lv_function_designator_7_0= rulefunction_designator
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
                    // InternalPascal.g:1710:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1710:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1711:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalPascal.g:1715:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1716:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1716:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1717:6: lv_expression_9_0= ruleexpression
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
                    // InternalPascal.g:1740:3: (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1740:3: (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) )
                    // InternalPascal.g:1741:4: otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_8_0());
                      			
                    }
                    // InternalPascal.g:1745:4: ( (lv_factor_12_0= rulefactor ) )
                    // InternalPascal.g:1746:5: (lv_factor_12_0= rulefactor )
                    {
                    // InternalPascal.g:1746:5: (lv_factor_12_0= rulefactor )
                    // InternalPascal.g:1747:6: lv_factor_12_0= rulefactor
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
    // InternalPascal.g:1769:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1769:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1770:2: iv_rulefunction_designator= rulefunction_designator EOF
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
    // InternalPascal.g:1776:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject lv_function_identifier_0_0 = null;

        EObject lv_actual_parameter_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1782:2: ( ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? ) )
            // InternalPascal.g:1783:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            {
            // InternalPascal.g:1783:2: ( ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )? )
            // InternalPascal.g:1784:3: ( (lv_function_identifier_0_0= ruleidentifier ) ) ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            {
            // InternalPascal.g:1784:3: ( (lv_function_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:1785:4: (lv_function_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:1785:4: (lv_function_identifier_0_0= ruleidentifier )
            // InternalPascal.g:1786:5: lv_function_identifier_0_0= ruleidentifier
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

            // InternalPascal.g:1803:3: ( (lv_actual_parameter_list_1_0= ruleactual_parameter_list ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1804:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    {
                    // InternalPascal.g:1804:4: (lv_actual_parameter_list_1_0= ruleactual_parameter_list )
                    // InternalPascal.g:1805:5: lv_actual_parameter_list_1_0= ruleactual_parameter_list
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
    // InternalPascal.g:1826:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1826:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1827:2: iv_ruleset= ruleset EOF
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
    // InternalPascal.g:1833:1: ruleset returns [EObject current=null] : (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1839:2: ( (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' ) )
            // InternalPascal.g:1840:2: (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' )
            {
            // InternalPascal.g:1840:2: (otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']' )
            // InternalPascal.g:1841:3: otherlv_0= '[' ( (lv_element_list_1_0= ruleelement_list ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalPascal.g:1845:3: ( (lv_element_list_1_0= ruleelement_list ) )
            // InternalPascal.g:1846:4: (lv_element_list_1_0= ruleelement_list )
            {
            // InternalPascal.g:1846:4: (lv_element_list_1_0= ruleelement_list )
            // InternalPascal.g:1847:5: lv_element_list_1_0= ruleelement_list
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
    // InternalPascal.g:1872:1: entryRuleelement_list returns [EObject current=null] : iv_ruleelement_list= ruleelement_list EOF ;
    public final EObject entryRuleelement_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_list = null;


        try {
            // InternalPascal.g:1872:53: (iv_ruleelement_list= ruleelement_list EOF )
            // InternalPascal.g:1873:2: iv_ruleelement_list= ruleelement_list EOF
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
    // InternalPascal.g:1879:1: ruleelement_list returns [EObject current=null] : ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? ) ;
    public final EObject ruleelement_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1885:2: ( ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? ) )
            // InternalPascal.g:1886:2: ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? )
            {
            // InternalPascal.g:1886:2: ( () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )? )
            // InternalPascal.g:1887:3: () ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )?
            {
            // InternalPascal.g:1887:3: ()
            // InternalPascal.g:1888:4: 
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

            // InternalPascal.g:1897:3: ( ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==13||(LA20_0>=35 && LA20_0<=37)||LA20_0==39||(LA20_0>=44 && LA20_0<=45)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1898:4: ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )*
                    {
                    // InternalPascal.g:1898:4: ( (lv_expression_1_0= ruleexpression ) )
                    // InternalPascal.g:1899:5: (lv_expression_1_0= ruleexpression )
                    {
                    // InternalPascal.g:1899:5: (lv_expression_1_0= ruleexpression )
                    // InternalPascal.g:1900:6: lv_expression_1_0= ruleexpression
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

                    // InternalPascal.g:1917:4: (otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPascal.g:1918:5: otherlv_2= ',' ( (lv_expression_3_0= ruleexpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getElement_listAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalPascal.g:1922:5: ( (lv_expression_3_0= ruleexpression ) )
                    	    // InternalPascal.g:1923:6: (lv_expression_3_0= ruleexpression )
                    	    {
                    	    // InternalPascal.g:1923:6: (lv_expression_3_0= ruleexpression )
                    	    // InternalPascal.g:1924:7: lv_expression_3_0= ruleexpression
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
                    	    break loop19;
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
    // InternalPascal.g:1947:1: entryRulestrings returns [EObject current=null] : iv_rulestrings= rulestrings EOF ;
    public final EObject entryRulestrings() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestrings = null;


        try {
            // InternalPascal.g:1947:48: (iv_rulestrings= rulestrings EOF )
            // InternalPascal.g:1948:2: iv_rulestrings= rulestrings EOF
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
    // InternalPascal.g:1954:1: rulestrings returns [EObject current=null] : (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' ) ;
    public final EObject rulestrings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_string_character_1_0 = null;

        EObject lv_string_character_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1960:2: ( (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' ) )
            // InternalPascal.g:1961:2: (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' )
            {
            // InternalPascal.g:1961:2: (otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\'' )
            // InternalPascal.g:1962:3: otherlv_0= '\\'' ( (lv_string_character_1_0= rulestring_character ) ) ( (lv_string_character_2_0= rulestring_character ) )* otherlv_3= '\\''
            {
            otherlv_0=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringsAccess().getApostropheKeyword_0());
              		
            }
            // InternalPascal.g:1966:3: ( (lv_string_character_1_0= rulestring_character ) )
            // InternalPascal.g:1967:4: (lv_string_character_1_0= rulestring_character )
            {
            // InternalPascal.g:1967:4: (lv_string_character_1_0= rulestring_character )
            // InternalPascal.g:1968:5: lv_string_character_1_0= rulestring_character
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

            // InternalPascal.g:1985:3: ( (lv_string_character_2_0= rulestring_character ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40||LA21_0==70) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPascal.g:1986:4: (lv_string_character_2_0= rulestring_character )
            	    {
            	    // InternalPascal.g:1986:4: (lv_string_character_2_0= rulestring_character )
            	    // InternalPascal.g:1987:5: lv_string_character_2_0= rulestring_character
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
            	    break loop21;
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
    // InternalPascal.g:2012:1: entryRulestring_character returns [EObject current=null] : iv_rulestring_character= rulestring_character EOF ;
    public final EObject entryRulestring_character() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring_character = null;


        try {
            // InternalPascal.g:2012:57: (iv_rulestring_character= rulestring_character EOF )
            // InternalPascal.g:2013:2: iv_rulestring_character= rulestring_character EOF
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
    // InternalPascal.g:2019:1: rulestring_character returns [EObject current=null] : ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' ) ;
    public final EObject rulestring_character() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_any_character_except_quote_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2025:2: ( ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' ) )
            // InternalPascal.g:2026:2: ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' )
            {
            // InternalPascal.g:2026:2: ( ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) ) | otherlv_2= '\\'\\'' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==70) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2027:3: ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) )
                    {
                    // InternalPascal.g:2027:3: ( () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) ) )
                    // InternalPascal.g:2028:4: () ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) )
                    {
                    // InternalPascal.g:2028:4: ()
                    // InternalPascal.g:2029:5: 
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

                    // InternalPascal.g:2038:4: ( (lv_any_character_except_quote_1_0= ruleany_character_except_quote ) )
                    // InternalPascal.g:2039:5: (lv_any_character_except_quote_1_0= ruleany_character_except_quote )
                    {
                    // InternalPascal.g:2039:5: (lv_any_character_except_quote_1_0= ruleany_character_except_quote )
                    // InternalPascal.g:2040:6: lv_any_character_except_quote_1_0= ruleany_character_except_quote
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
                    // InternalPascal.g:2059:3: otherlv_2= '\\'\\''
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
    // InternalPascal.g:2067:1: entryRuleany_character_except_quote returns [EObject current=null] : iv_ruleany_character_except_quote= ruleany_character_except_quote EOF ;
    public final EObject entryRuleany_character_except_quote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_character_except_quote = null;


        try {
            // InternalPascal.g:2067:67: (iv_ruleany_character_except_quote= ruleany_character_except_quote EOF )
            // InternalPascal.g:2068:2: iv_ruleany_character_except_quote= ruleany_character_except_quote EOF
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
    // InternalPascal.g:2074:1: ruleany_character_except_quote returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject ruleany_character_except_quote() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2080:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:2081:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:2081:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:2082:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:2082:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:2083:4: lv_procedure_heading_0_0= ruleprocedure_heading
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
    // InternalPascal.g:2103:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2103:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2104:2: iv_rulenumber= rulenumber EOF
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
    // InternalPascal.g:2110:1: rulenumber returns [EObject current=null] : ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_integer_number_0_0 = null;

        EObject lv_real_number_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2116:2: ( ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) ) )
            // InternalPascal.g:2117:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) )
            {
            // InternalPascal.g:2117:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) | ( (lv_real_number_1_0= rulereal_number ) ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_INT) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==11||(LA23_3>=41 && LA23_3<=42)) ) {
                        alt23=2;
                    }
                    else if ( (LA23_3==EOF||(LA23_3>=14 && LA23_3<=16)||(LA23_3>=18 && LA23_3<=19)||(LA23_3>=22 && LA23_3<=34)||LA23_3==38||(LA23_3>=44 && LA23_3<=45)||LA23_3==47||LA23_3==49||(LA23_3>=51 && LA23_3<=52)||(LA23_3>=54 && LA23_3<=55)||LA23_3==57||LA23_3==67) ) {
                        alt23=1;
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
            case 45:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_INT) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==11||(LA23_3>=41 && LA23_3<=42)) ) {
                        alt23=2;
                    }
                    else if ( (LA23_3==EOF||(LA23_3>=14 && LA23_3<=16)||(LA23_3>=18 && LA23_3<=19)||(LA23_3>=22 && LA23_3<=34)||LA23_3==38||(LA23_3>=44 && LA23_3<=45)||LA23_3==47||LA23_3==49||(LA23_3>=51 && LA23_3<=52)||(LA23_3>=54 && LA23_3<=55)||LA23_3==57||LA23_3==67) ) {
                        alt23=1;
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

                if ( (LA23_3==11||(LA23_3>=41 && LA23_3<=42)) ) {
                    alt23=2;
                }
                else if ( (LA23_3==EOF||(LA23_3>=14 && LA23_3<=16)||(LA23_3>=18 && LA23_3<=19)||(LA23_3>=22 && LA23_3<=34)||LA23_3==38||(LA23_3>=44 && LA23_3<=45)||LA23_3==47||LA23_3==49||(LA23_3>=51 && LA23_3<=52)||(LA23_3>=54 && LA23_3<=55)||LA23_3==57||LA23_3==67) ) {
                    alt23=1;
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
                    // InternalPascal.g:2118:3: ( (lv_integer_number_0_0= ruleinteger_number ) )
                    {
                    // InternalPascal.g:2118:3: ( (lv_integer_number_0_0= ruleinteger_number ) )
                    // InternalPascal.g:2119:4: (lv_integer_number_0_0= ruleinteger_number )
                    {
                    // InternalPascal.g:2119:4: (lv_integer_number_0_0= ruleinteger_number )
                    // InternalPascal.g:2120:5: lv_integer_number_0_0= ruleinteger_number
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
                    // InternalPascal.g:2138:3: ( (lv_real_number_1_0= rulereal_number ) )
                    {
                    // InternalPascal.g:2138:3: ( (lv_real_number_1_0= rulereal_number ) )
                    // InternalPascal.g:2139:4: (lv_real_number_1_0= rulereal_number )
                    {
                    // InternalPascal.g:2139:4: (lv_real_number_1_0= rulereal_number )
                    // InternalPascal.g:2140:5: lv_real_number_1_0= rulereal_number
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
    // InternalPascal.g:2161:1: entryRulereal_number returns [EObject current=null] : iv_rulereal_number= rulereal_number EOF ;
    public final EObject entryRulereal_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_number = null;


        try {
            // InternalPascal.g:2161:52: (iv_rulereal_number= rulereal_number EOF )
            // InternalPascal.g:2162:2: iv_rulereal_number= rulereal_number EOF
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
    // InternalPascal.g:2168:1: rulereal_number returns [EObject current=null] : ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) ) ;
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
            // InternalPascal.g:2174:2: ( ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) ) )
            // InternalPascal.g:2175:2: ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) )
            {
            // InternalPascal.g:2175:2: ( ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? ) | ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) ) )
            int alt26=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INT) ) {
                    int LA26_3 = input.LA(3);

                    if ( ((LA26_3>=41 && LA26_3<=42)) ) {
                        alt26=2;
                    }
                    else if ( (LA26_3==11) ) {
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
            case 45:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_INT) ) {
                    int LA26_3 = input.LA(3);

                    if ( ((LA26_3>=41 && LA26_3<=42)) ) {
                        alt26=2;
                    }
                    else if ( (LA26_3==11) ) {
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

                if ( ((LA26_3>=41 && LA26_3<=42)) ) {
                    alt26=2;
                }
                else if ( (LA26_3==11) ) {
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
                    // InternalPascal.g:2176:3: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? )
                    {
                    // InternalPascal.g:2176:3: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )? )
                    // InternalPascal.g:2177:4: ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) otherlv_1= '.' ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )? ( (lv_scale_factor_3_0= rulescale_factor ) )?
                    {
                    // InternalPascal.g:2177:4: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
                    // InternalPascal.g:2178:5: (lv_digit_sequence_0_0= ruledigit_sequence )
                    {
                    // InternalPascal.g:2178:5: (lv_digit_sequence_0_0= ruledigit_sequence )
                    // InternalPascal.g:2179:6: lv_digit_sequence_0_0= ruledigit_sequence
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
                    // InternalPascal.g:2200:4: ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case 44:
                            {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==RULE_INT) ) {
                                int LA24_5 = input.LA(3);

                                if ( (synpred43_InternalPascal()) ) {
                                    alt24=1;
                                }
                            }
                            }
                            break;
                        case 45:
                            {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==RULE_INT) ) {
                                int LA24_5 = input.LA(3);

                                if ( (synpred43_InternalPascal()) ) {
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
                            // InternalPascal.g:2201:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
                            {
                            // InternalPascal.g:2201:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
                            // InternalPascal.g:2202:6: lv_digit_sequence2_2_0= ruledigit_sequence
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

                    // InternalPascal.g:2219:4: ( (lv_scale_factor_3_0= rulescale_factor ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=41 && LA25_0<=42)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalPascal.g:2220:5: (lv_scale_factor_3_0= rulescale_factor )
                            {
                            // InternalPascal.g:2220:5: (lv_scale_factor_3_0= rulescale_factor )
                            // InternalPascal.g:2221:6: lv_scale_factor_3_0= rulescale_factor
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
                    // InternalPascal.g:2240:3: ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) )
                    {
                    // InternalPascal.g:2240:3: ( ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) ) )
                    // InternalPascal.g:2241:4: ( (lv_digit_sequence_4_0= ruledigit_sequence ) ) ( (lv_scale_factor_5_0= rulescale_factor ) )
                    {
                    // InternalPascal.g:2241:4: ( (lv_digit_sequence_4_0= ruledigit_sequence ) )
                    // InternalPascal.g:2242:5: (lv_digit_sequence_4_0= ruledigit_sequence )
                    {
                    // InternalPascal.g:2242:5: (lv_digit_sequence_4_0= ruledigit_sequence )
                    // InternalPascal.g:2243:6: lv_digit_sequence_4_0= ruledigit_sequence
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

                    // InternalPascal.g:2260:4: ( (lv_scale_factor_5_0= rulescale_factor ) )
                    // InternalPascal.g:2261:5: (lv_scale_factor_5_0= rulescale_factor )
                    {
                    // InternalPascal.g:2261:5: (lv_scale_factor_5_0= rulescale_factor )
                    // InternalPascal.g:2262:6: lv_scale_factor_5_0= rulescale_factor
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
    // InternalPascal.g:2284:1: entryRulescale_factor returns [EObject current=null] : iv_rulescale_factor= rulescale_factor EOF ;
    public final EObject entryRulescale_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescale_factor = null;


        try {
            // InternalPascal.g:2284:53: (iv_rulescale_factor= rulescale_factor EOF )
            // InternalPascal.g:2285:2: iv_rulescale_factor= rulescale_factor EOF
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
    // InternalPascal.g:2291:1: rulescale_factor returns [EObject current=null] : ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) ;
    public final EObject rulescale_factor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sign_2_0 = null;

        EObject lv_digit_sequence_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2297:2: ( ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) )
            // InternalPascal.g:2298:2: ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            {
            // InternalPascal.g:2298:2: ( (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            // InternalPascal.g:2299:3: (otherlv_0= 'E' | otherlv_1= 'e' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            {
            // InternalPascal.g:2299:3: (otherlv_0= 'E' | otherlv_1= 'e' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
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
                    // InternalPascal.g:2300:4: otherlv_0= 'E'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getScale_factorAccess().getEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2305:4: otherlv_1= 'e'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getScale_factorAccess().getEKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:2310:3: ( (lv_sign_2_0= rulesign ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred47_InternalPascal()) ) {
                    alt28=1;
                }
            }
            else if ( (LA28_0==45) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred47_InternalPascal()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2311:4: (lv_sign_2_0= rulesign )
                    {
                    // InternalPascal.g:2311:4: (lv_sign_2_0= rulesign )
                    // InternalPascal.g:2312:5: lv_sign_2_0= rulesign
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

            // InternalPascal.g:2329:3: ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            // InternalPascal.g:2330:4: (lv_digit_sequence_3_0= ruledigit_sequence )
            {
            // InternalPascal.g:2330:4: (lv_digit_sequence_3_0= ruledigit_sequence )
            // InternalPascal.g:2331:5: lv_digit_sequence_3_0= ruledigit_sequence
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
    // InternalPascal.g:2352:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:2352:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:2353:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:2359:1: rulevariable returns [EObject current=null] : ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* ) ;
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
            // InternalPascal.g:2365:2: ( ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* ) )
            // InternalPascal.g:2366:2: ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* )
            {
            // InternalPascal.g:2366:2: ( ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )* )
            // InternalPascal.g:2367:3: ( (lv_entire_variable_0_0= ruleentire_variable ) ) (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )* (otherlv_6= '^' )* (otherlv_7= '^' )*
            {
            // InternalPascal.g:2367:3: ( (lv_entire_variable_0_0= ruleentire_variable ) )
            // InternalPascal.g:2368:4: (lv_entire_variable_0_0= ruleentire_variable )
            {
            // InternalPascal.g:2368:4: (lv_entire_variable_0_0= ruleentire_variable )
            // InternalPascal.g:2369:5: lv_entire_variable_0_0= ruleentire_variable
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

            // InternalPascal.g:2386:3: (otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2387:4: otherlv_1= '[' ( (lv_expression_list_2_0= ruleexpression_list ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2391:4: ( (lv_expression_list_2_0= ruleexpression_list ) )
            	    // InternalPascal.g:2392:5: (lv_expression_list_2_0= ruleexpression_list )
            	    {
            	    // InternalPascal.g:2392:5: (lv_expression_list_2_0= ruleexpression_list )
            	    // InternalPascal.g:2393:6: lv_expression_list_2_0= ruleexpression_list
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
            	    break loop29;
                }
            } while (true);

            // InternalPascal.g:2415:3: (otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==11) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2416:4: otherlv_4= '.' ( (lv_field_identifier_5_0= ruleidentifier ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2420:4: ( (lv_field_identifier_5_0= ruleidentifier ) )
            	    // InternalPascal.g:2421:5: (lv_field_identifier_5_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:2421:5: (lv_field_identifier_5_0= ruleidentifier )
            	    // InternalPascal.g:2422:6: lv_field_identifier_5_0= ruleidentifier
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
            	    break loop30;
                }
            } while (true);

            // InternalPascal.g:2440:3: (otherlv_6= '^' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    int LA31_1 = input.LA(2);

                    if ( (synpred50_InternalPascal()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2441:4: otherlv_6= '^'
            	    {
            	    otherlv_6=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalPascal.g:2446:3: (otherlv_7= '^' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:2447:4: otherlv_7= '^'
            	    {
            	    otherlv_7=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
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
    // InternalPascal.g:2456:1: entryRuleentire_variable returns [EObject current=null] : iv_ruleentire_variable= ruleentire_variable EOF ;
    public final EObject entryRuleentire_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentire_variable = null;


        try {
            // InternalPascal.g:2456:56: (iv_ruleentire_variable= ruleentire_variable EOF )
            // InternalPascal.g:2457:2: iv_ruleentire_variable= ruleentire_variable EOF
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
    // InternalPascal.g:2463:1: ruleentire_variable returns [EObject current=null] : ( (lv_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruleentire_variable() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2469:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:2470:2: ( (lv_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:2470:2: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:2471:3: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:2471:3: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:2472:4: lv_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:2492:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:2492:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:2493:2: iv_ruleexpression_list= ruleexpression_list EOF
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
    // InternalPascal.g:2499:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2505:2: ( ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:2506:2: ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:2506:2: ( ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:2507:3: ( (lv_expression_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:2507:3: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:2508:4: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:2508:4: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:2509:5: lv_expression_0_0= ruleexpression
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

            // InternalPascal.g:2526:3: (otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:2527:4: otherlv_1= ',' ( (lv_expression_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2531:4: ( (lv_expression_2_0= ruleexpression ) )
            	    // InternalPascal.g:2532:5: (lv_expression_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:2532:5: (lv_expression_2_0= ruleexpression )
            	    // InternalPascal.g:2533:6: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:2555:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:2555:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:2556:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:2562:1: rulelabel returns [EObject current=null] : ( (lv_integer_number_0_0= ruleinteger_number ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        EObject lv_integer_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2568:2: ( ( (lv_integer_number_0_0= ruleinteger_number ) ) )
            // InternalPascal.g:2569:2: ( (lv_integer_number_0_0= ruleinteger_number ) )
            {
            // InternalPascal.g:2569:2: ( (lv_integer_number_0_0= ruleinteger_number ) )
            // InternalPascal.g:2570:3: (lv_integer_number_0_0= ruleinteger_number )
            {
            // InternalPascal.g:2570:3: (lv_integer_number_0_0= ruleinteger_number )
            // InternalPascal.g:2571:4: lv_integer_number_0_0= ruleinteger_number
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
    // InternalPascal.g:2591:1: entryRuleinteger_number returns [EObject current=null] : iv_ruleinteger_number= ruleinteger_number EOF ;
    public final EObject entryRuleinteger_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_number = null;


        try {
            // InternalPascal.g:2591:55: (iv_ruleinteger_number= ruleinteger_number EOF )
            // InternalPascal.g:2592:2: iv_ruleinteger_number= ruleinteger_number EOF
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
    // InternalPascal.g:2598:1: ruleinteger_number returns [EObject current=null] : ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) ;
    public final EObject ruleinteger_number() throws RecognitionException {
        EObject current = null;

        EObject lv_digit_sequence_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2604:2: ( ( (lv_digit_sequence_0_0= ruledigit_sequence ) ) )
            // InternalPascal.g:2605:2: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
            {
            // InternalPascal.g:2605:2: ( (lv_digit_sequence_0_0= ruledigit_sequence ) )
            // InternalPascal.g:2606:3: (lv_digit_sequence_0_0= ruledigit_sequence )
            {
            // InternalPascal.g:2606:3: (lv_digit_sequence_0_0= ruledigit_sequence )
            // InternalPascal.g:2607:4: lv_digit_sequence_0_0= ruledigit_sequence
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
    // InternalPascal.g:2627:1: entryRuledigit_sequence returns [EObject current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final EObject entryRuledigit_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledigit_sequence = null;


        try {
            // InternalPascal.g:2627:55: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // InternalPascal.g:2628:2: iv_ruledigit_sequence= ruledigit_sequence EOF
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
    // InternalPascal.g:2634:1: ruledigit_sequence returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) ) ;
    public final EObject ruledigit_sequence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        AntlrDatatypeRuleToken lv_unsigned_digit_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2640:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) ) )
            // InternalPascal.g:2641:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) )
            {
            // InternalPascal.g:2641:2: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) ) )
            // InternalPascal.g:2642:3: ( (lv_sign_0_0= rulesign ) )? ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) )
            {
            // InternalPascal.g:2642:3: ( (lv_sign_0_0= rulesign ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=44 && LA34_0<=45)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:2643:4: (lv_sign_0_0= rulesign )
                    {
                    // InternalPascal.g:2643:4: (lv_sign_0_0= rulesign )
                    // InternalPascal.g:2644:5: lv_sign_0_0= rulesign
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

            // InternalPascal.g:2661:3: ( (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence ) )
            // InternalPascal.g:2662:4: (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence )
            {
            // InternalPascal.g:2662:4: (lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence )
            // InternalPascal.g:2663:5: lv_unsigned_digit_sequence_1_0= ruleunsigned_digit_sequence
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
    // InternalPascal.g:2684:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:2684:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:2685:2: iv_rulesign= rulesign EOF
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
    // InternalPascal.g:2691:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2697:2: ( (kw= '+' | kw= '-' ) )
            // InternalPascal.g:2698:2: (kw= '+' | kw= '-' )
            {
            // InternalPascal.g:2698:2: (kw= '+' | kw= '-' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
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
                    // InternalPascal.g:2699:3: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2705:3: kw= '-'
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
    // InternalPascal.g:2714:1: entryRuleunsigned_digit_sequence returns [String current=null] : iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF ;
    public final String entryRuleunsigned_digit_sequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_digit_sequence = null;


        try {
            // InternalPascal.g:2714:63: (iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF )
            // InternalPascal.g:2715:2: iv_ruleunsigned_digit_sequence= ruleunsigned_digit_sequence EOF
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
    // InternalPascal.g:2721:1: ruleunsigned_digit_sequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_digit_sequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2727:2: (this_INT_0= RULE_INT )
            // InternalPascal.g:2728:2: this_INT_0= RULE_INT
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
    // InternalPascal.g:2738:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2738:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2739:2: iv_rulestructured_statement= rulestructured_statement EOF
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
    // InternalPascal.g:2745:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_statement_0_0 = null;

        EObject lv_repetitive_statement_1_0 = null;

        EObject lv_conditional_statement_2_0 = null;

        EObject lv_with_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2751:2: ( ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) ) )
            // InternalPascal.g:2752:2: ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) )
            {
            // InternalPascal.g:2752:2: ( ( (lv_compound_statement_0_0= rulecompound_statement ) ) | ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_statement_2_0= ruleconditional_statement ) ) | ( (lv_with_statement_3_0= rulewith_statement ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt36=1;
                }
                break;
            case 53:
            case 56:
            case 58:
                {
                alt36=2;
                }
                break;
            case 48:
            case 50:
                {
                alt36=3;
                }
                break;
            case 46:
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
                    // InternalPascal.g:2753:3: ( (lv_compound_statement_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:2753:3: ( (lv_compound_statement_0_0= rulecompound_statement ) )
                    // InternalPascal.g:2754:4: (lv_compound_statement_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:2754:4: (lv_compound_statement_0_0= rulecompound_statement )
                    // InternalPascal.g:2755:5: lv_compound_statement_0_0= rulecompound_statement
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
                    // InternalPascal.g:2773:3: ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) )
                    {
                    // InternalPascal.g:2773:3: ( (lv_repetitive_statement_1_0= rulerepetitive_statement ) )
                    // InternalPascal.g:2774:4: (lv_repetitive_statement_1_0= rulerepetitive_statement )
                    {
                    // InternalPascal.g:2774:4: (lv_repetitive_statement_1_0= rulerepetitive_statement )
                    // InternalPascal.g:2775:5: lv_repetitive_statement_1_0= rulerepetitive_statement
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
                    // InternalPascal.g:2793:3: ( (lv_conditional_statement_2_0= ruleconditional_statement ) )
                    {
                    // InternalPascal.g:2793:3: ( (lv_conditional_statement_2_0= ruleconditional_statement ) )
                    // InternalPascal.g:2794:4: (lv_conditional_statement_2_0= ruleconditional_statement )
                    {
                    // InternalPascal.g:2794:4: (lv_conditional_statement_2_0= ruleconditional_statement )
                    // InternalPascal.g:2795:5: lv_conditional_statement_2_0= ruleconditional_statement
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
                    // InternalPascal.g:2813:3: ( (lv_with_statement_3_0= rulewith_statement ) )
                    {
                    // InternalPascal.g:2813:3: ( (lv_with_statement_3_0= rulewith_statement ) )
                    // InternalPascal.g:2814:4: (lv_with_statement_3_0= rulewith_statement )
                    {
                    // InternalPascal.g:2814:4: (lv_with_statement_3_0= rulewith_statement )
                    // InternalPascal.g:2815:5: lv_with_statement_3_0= rulewith_statement
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
    // InternalPascal.g:2836:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // InternalPascal.g:2836:55: (iv_rulewith_statement= rulewith_statement EOF )
            // InternalPascal.g:2837:2: iv_rulewith_statement= rulewith_statement EOF
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
    // InternalPascal.g:2843:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) ;
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
            // InternalPascal.g:2849:2: ( (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) )
            // InternalPascal.g:2850:2: (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            {
            // InternalPascal.g:2850:2: (otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            // InternalPascal.g:2851:3: otherlv_0= 'with' ( (lv_variable_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
              		
            }
            // InternalPascal.g:2855:3: ( (lv_variable_1_0= rulevariable ) )
            // InternalPascal.g:2856:4: (lv_variable_1_0= rulevariable )
            {
            // InternalPascal.g:2856:4: (lv_variable_1_0= rulevariable )
            // InternalPascal.g:2857:5: lv_variable_1_0= rulevariable
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

            // InternalPascal.g:2874:3: (otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:2875:4: otherlv_2= ',' ( (lv_variable_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2879:4: ( (lv_variable_3_0= rulevariable ) )
            	    // InternalPascal.g:2880:5: (lv_variable_3_0= rulevariable )
            	    {
            	    // InternalPascal.g:2880:5: (lv_variable_3_0= rulevariable )
            	    // InternalPascal.g:2881:6: lv_variable_3_0= rulevariable
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
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
              		
            }
            // InternalPascal.g:2903:3: ( (lv_statement_5_0= rulestatement ) )
            // InternalPascal.g:2904:4: (lv_statement_5_0= rulestatement )
            {
            // InternalPascal.g:2904:4: (lv_statement_5_0= rulestatement )
            // InternalPascal.g:2905:5: lv_statement_5_0= rulestatement
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
    // InternalPascal.g:2926:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascal.g:2926:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascal.g:2927:2: iv_ruleconditional_statement= ruleconditional_statement EOF
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
    // InternalPascal.g:2933:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_if_statement_0_0 = null;

        EObject lv_case_statement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2939:2: ( ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) ) )
            // InternalPascal.g:2940:2: ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) )
            {
            // InternalPascal.g:2940:2: ( ( (lv_if_statement_0_0= ruleif_statement ) ) | ( (lv_case_statement_1_0= rulecase_statement ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            else if ( (LA38_0==48) ) {
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
                    // InternalPascal.g:2941:3: ( (lv_if_statement_0_0= ruleif_statement ) )
                    {
                    // InternalPascal.g:2941:3: ( (lv_if_statement_0_0= ruleif_statement ) )
                    // InternalPascal.g:2942:4: (lv_if_statement_0_0= ruleif_statement )
                    {
                    // InternalPascal.g:2942:4: (lv_if_statement_0_0= ruleif_statement )
                    // InternalPascal.g:2943:5: lv_if_statement_0_0= ruleif_statement
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
                    // InternalPascal.g:2961:3: ( (lv_case_statement_1_0= rulecase_statement ) )
                    {
                    // InternalPascal.g:2961:3: ( (lv_case_statement_1_0= rulecase_statement ) )
                    // InternalPascal.g:2962:4: (lv_case_statement_1_0= rulecase_statement )
                    {
                    // InternalPascal.g:2962:4: (lv_case_statement_1_0= rulecase_statement )
                    // InternalPascal.g:2963:5: lv_case_statement_1_0= rulecase_statement
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
    // InternalPascal.g:2984:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalPascal.g:2984:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalPascal.g:2985:2: iv_rulecase_statement= rulecase_statement EOF
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
    // InternalPascal.g:2991:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) ;
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
            // InternalPascal.g:2997:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) )
            // InternalPascal.g:2998:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            {
            // InternalPascal.g:2998:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            // InternalPascal.g:2999:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_case_limb_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:3003:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3004:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3004:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3005:5: lv_expression_1_0= ruleexpression
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
            // InternalPascal.g:3026:3: ( (lv_case_limb_3_0= rulecase_limb ) )
            // InternalPascal.g:3027:4: (lv_case_limb_3_0= rulecase_limb )
            {
            // InternalPascal.g:3027:4: (lv_case_limb_3_0= rulecase_limb )
            // InternalPascal.g:3028:5: lv_case_limb_3_0= rulecase_limb
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

            // InternalPascal.g:3045:3: (otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==15) ) {
                    int LA39_1 = input.LA(2);

                    if ( ((LA39_1>=RULE_ID && LA39_1<=RULE_INT)||LA39_1==39||(LA39_1>=44 && LA39_1<=45)) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:3046:4: otherlv_4= ';' ( (lv_case_limb_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	      			
            	    }
            	    // InternalPascal.g:3050:4: ( (lv_case_limb_5_0= rulecase_limb ) )
            	    // InternalPascal.g:3051:5: (lv_case_limb_5_0= rulecase_limb )
            	    {
            	    // InternalPascal.g:3051:5: (lv_case_limb_5_0= rulecase_limb )
            	    // InternalPascal.g:3052:6: lv_case_limb_5_0= rulecase_limb
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
            	    break loop39;
                }
            } while (true);

            // InternalPascal.g:3070:3: (otherlv_6= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:3071:4: otherlv_6= ';'
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
    // InternalPascal.g:3084:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // InternalPascal.g:3084:50: (iv_rulecase_limb= rulecase_limb EOF )
            // InternalPascal.g:3085:2: iv_rulecase_limb= rulecase_limb EOF
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
    // InternalPascal.g:3091:1: rulecase_limb returns [EObject current=null] : ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_case_label_list_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3097:2: ( ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalPascal.g:3098:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:3098:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalPascal.g:3099:3: ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalPascal.g:3099:3: ( (lv_case_label_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:3100:4: (lv_case_label_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:3100:4: (lv_case_label_list_0_0= rulecase_label_list )
            // InternalPascal.g:3101:5: lv_case_label_list_0_0= rulecase_label_list
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
            // InternalPascal.g:3122:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalPascal.g:3123:4: (lv_statement_2_0= rulestatement )
            {
            // InternalPascal.g:3123:4: (lv_statement_2_0= rulestatement )
            // InternalPascal.g:3124:5: lv_statement_2_0= rulestatement
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
    // InternalPascal.g:3145:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalPascal.g:3145:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalPascal.g:3146:2: iv_rulecase_label_list= rulecase_label_list EOF
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
    // InternalPascal.g:3152:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3158:2: ( ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:3159:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:3159:2: ( ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:3160:3: ( (lv_constant_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:3160:3: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:3161:4: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:3161:4: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:3162:5: lv_constant_0_0= ruleconstant
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

            // InternalPascal.g:3179:3: (otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==16) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:3180:4: otherlv_1= ',' ( (lv_constant_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3184:4: ( (lv_constant_2_0= ruleconstant ) )
            	    // InternalPascal.g:3185:5: (lv_constant_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:3185:5: (lv_constant_2_0= ruleconstant )
            	    // InternalPascal.g:3186:6: lv_constant_2_0= ruleconstant
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
    // InternalPascal.g:3208:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalPascal.g:3208:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalPascal.g:3209:2: iv_ruleif_statement= ruleif_statement EOF
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
    // InternalPascal.g:3215:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? ) ;
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
            // InternalPascal.g:3221:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? ) )
            // InternalPascal.g:3222:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? )
            {
            // InternalPascal.g:3222:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )? )
            // InternalPascal.g:3223:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_statement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
              		
            }
            // InternalPascal.g:3227:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3228:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3228:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3229:5: lv_expression_1_0= ruleexpression
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
            // InternalPascal.g:3250:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:3251:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:3251:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:3252:5: lv_statement_3_0= rulestatement
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

            // InternalPascal.g:3269:3: (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred63_InternalPascal()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:3270:4: otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalPascal.g:3274:4: ( (lv_statement_5_0= rulestatement ) )
                    // InternalPascal.g:3275:5: (lv_statement_5_0= rulestatement )
                    {
                    // InternalPascal.g:3275:5: (lv_statement_5_0= rulestatement )
                    // InternalPascal.g:3276:6: lv_statement_5_0= rulestatement
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
    // InternalPascal.g:3298:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalPascal.g:3298:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalPascal.g:3299:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
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
    // InternalPascal.g:3305:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_while_statement_0_0 = null;

        EObject lv_repeat_statement_1_0 = null;

        EObject lv_for_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3311:2: ( ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) ) )
            // InternalPascal.g:3312:2: ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) )
            {
            // InternalPascal.g:3312:2: ( ( (lv_while_statement_0_0= rulewhile_statement ) ) | ( (lv_repeat_statement_1_0= rulerepeat_statement ) ) | ( (lv_for_statement_2_0= rulefor_statement ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt43=1;
                }
                break;
            case 56:
                {
                alt43=2;
                }
                break;
            case 53:
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
                    // InternalPascal.g:3313:3: ( (lv_while_statement_0_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:3313:3: ( (lv_while_statement_0_0= rulewhile_statement ) )
                    // InternalPascal.g:3314:4: (lv_while_statement_0_0= rulewhile_statement )
                    {
                    // InternalPascal.g:3314:4: (lv_while_statement_0_0= rulewhile_statement )
                    // InternalPascal.g:3315:5: lv_while_statement_0_0= rulewhile_statement
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
                    // InternalPascal.g:3333:3: ( (lv_repeat_statement_1_0= rulerepeat_statement ) )
                    {
                    // InternalPascal.g:3333:3: ( (lv_repeat_statement_1_0= rulerepeat_statement ) )
                    // InternalPascal.g:3334:4: (lv_repeat_statement_1_0= rulerepeat_statement )
                    {
                    // InternalPascal.g:3334:4: (lv_repeat_statement_1_0= rulerepeat_statement )
                    // InternalPascal.g:3335:5: lv_repeat_statement_1_0= rulerepeat_statement
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
                    // InternalPascal.g:3353:3: ( (lv_for_statement_2_0= rulefor_statement ) )
                    {
                    // InternalPascal.g:3353:3: ( (lv_for_statement_2_0= rulefor_statement ) )
                    // InternalPascal.g:3354:4: (lv_for_statement_2_0= rulefor_statement )
                    {
                    // InternalPascal.g:3354:4: (lv_for_statement_2_0= rulefor_statement )
                    // InternalPascal.g:3355:5: lv_for_statement_2_0= rulefor_statement
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
    // InternalPascal.g:3376:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalPascal.g:3376:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalPascal.g:3377:2: iv_rulefor_statement= rulefor_statement EOF
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
    // InternalPascal.g:3383:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) ;
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
            // InternalPascal.g:3389:2: ( (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) ) )
            // InternalPascal.g:3390:2: (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            {
            // InternalPascal.g:3390:2: (otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) ) )
            // InternalPascal.g:3391:3: otherlv_0= 'for' ( (lv_variable_identifier_1_0= ruleidentifier ) ) otherlv_2= ':=' ( (lv_initial_expression_3_0= ruleinitial_expression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_final_expression_6_0= rulefinal_expression ) ) otherlv_7= 'do' ( (lv_statement_8_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
              		
            }
            // InternalPascal.g:3395:3: ( (lv_variable_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3396:4: (lv_variable_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3396:4: (lv_variable_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3397:5: lv_variable_identifier_1_0= ruleidentifier
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
            // InternalPascal.g:3418:3: ( (lv_initial_expression_3_0= ruleinitial_expression ) )
            // InternalPascal.g:3419:4: (lv_initial_expression_3_0= ruleinitial_expression )
            {
            // InternalPascal.g:3419:4: (lv_initial_expression_3_0= ruleinitial_expression )
            // InternalPascal.g:3420:5: lv_initial_expression_3_0= ruleinitial_expression
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

            // InternalPascal.g:3437:3: (otherlv_4= 'to' | otherlv_5= 'downto' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            else if ( (LA44_0==55) ) {
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
                    // InternalPascal.g:3438:4: otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getToKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3443:4: otherlv_5= 'downto'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:3448:3: ( (lv_final_expression_6_0= rulefinal_expression ) )
            // InternalPascal.g:3449:4: (lv_final_expression_6_0= rulefinal_expression )
            {
            // InternalPascal.g:3449:4: (lv_final_expression_6_0= rulefinal_expression )
            // InternalPascal.g:3450:5: lv_final_expression_6_0= rulefinal_expression
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
            // InternalPascal.g:3471:3: ( (lv_statement_8_0= rulestatement ) )
            // InternalPascal.g:3472:4: (lv_statement_8_0= rulestatement )
            {
            // InternalPascal.g:3472:4: (lv_statement_8_0= rulestatement )
            // InternalPascal.g:3473:5: lv_statement_8_0= rulestatement
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
    // InternalPascal.g:3494:1: entryRulefinal_expression returns [EObject current=null] : iv_rulefinal_expression= rulefinal_expression EOF ;
    public final EObject entryRulefinal_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefinal_expression = null;


        try {
            // InternalPascal.g:3494:57: (iv_rulefinal_expression= rulefinal_expression EOF )
            // InternalPascal.g:3495:2: iv_rulefinal_expression= rulefinal_expression EOF
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
    // InternalPascal.g:3501:1: rulefinal_expression returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject rulefinal_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3507:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:3508:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:3508:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:3509:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:3509:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:3510:4: lv_expression_0_0= ruleexpression
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
    // InternalPascal.g:3530:1: entryRuleinitial_expression returns [EObject current=null] : iv_ruleinitial_expression= ruleinitial_expression EOF ;
    public final EObject entryRuleinitial_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitial_expression = null;


        try {
            // InternalPascal.g:3530:59: (iv_ruleinitial_expression= ruleinitial_expression EOF )
            // InternalPascal.g:3531:2: iv_ruleinitial_expression= ruleinitial_expression EOF
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
    // InternalPascal.g:3537:1: ruleinitial_expression returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleinitial_expression() throws RecognitionException {
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
    // InternalPascal.g:3566:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // InternalPascal.g:3566:57: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // InternalPascal.g:3567:2: iv_rulerepeat_statement= rulerepeat_statement EOF
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
    // InternalPascal.g:3573:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3579:2: ( (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:3580:2: (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:3580:2: (otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:3581:3: otherlv_0= 'repeat' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
              		
            }
            // InternalPascal.g:3585:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:3586:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:3586:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:3587:5: lv_statement_sequence_1_0= rulestatement_sequence
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
            // InternalPascal.g:3608:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:3609:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:3609:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:3610:5: lv_expression_3_0= ruleexpression
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
    // InternalPascal.g:3631:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:3631:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:3632:2: iv_rulewhile_statement= rulewhile_statement EOF
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
    // InternalPascal.g:3638:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3644:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalPascal.g:3645:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalPascal.g:3645:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalPascal.g:3646:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
              		
            }
            // InternalPascal.g:3650:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3651:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3651:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3652:5: lv_expression_1_0= ruleexpression
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
            // InternalPascal.g:3673:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:3674:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:3674:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:3675:5: lv_statement_3_0= rulestatement
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
    // InternalPascal.g:3696:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:3696:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:3697:2: iv_rulecompound_statement= rulecompound_statement EOF
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
    // InternalPascal.g:3703:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3709:2: ( (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:3710:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:3710:2: (otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:3711:3: otherlv_0= 'begin' ( (lv_statement_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:3715:3: ( (lv_statement_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:3716:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:3716:4: (lv_statement_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:3717:5: lv_statement_sequence_1_0= rulestatement_sequence
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
    // InternalPascal.g:3742:1: entryRuledeclaration_part returns [EObject current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final EObject entryRuledeclaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_part = null;


        try {
            // InternalPascal.g:3742:57: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // InternalPascal.g:3743:2: iv_ruledeclaration_part= ruledeclaration_part EOF
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
    // InternalPascal.g:3749:1: ruledeclaration_part returns [EObject current=null] : ( ( (lv_label_declaration_part_0_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_1_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_2_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_3_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';' )* ) ;
    public final EObject ruledeclaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_label_declaration_part_0_0 = null;

        EObject lv_constant_definition_part_1_0 = null;

        EObject lv_type_definition_part_2_0 = null;

        EObject lv_variable_declaration_part_3_0 = null;

        EObject lv_procedure_heading_4_0 = null;

        EObject lv_procedure_body_6_0 = null;

        EObject lv_procedure_heading_7_0 = null;

        EObject lv_directive_9_0 = null;

        EObject lv_procedure_identification_10_0 = null;

        EObject lv_procedure_body_12_0 = null;

        EObject lv_function_heading_13_0 = null;

        EObject lv_function_body_15_0 = null;

        EObject lv_function_heading_16_0 = null;

        EObject lv_directive_18_0 = null;

        EObject lv_function_identification_19_0 = null;

        EObject lv_function_body_21_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3755:2: ( ( ( (lv_label_declaration_part_0_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_1_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_2_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_3_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';' )* ) )
            // InternalPascal.g:3756:2: ( ( (lv_label_declaration_part_0_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_1_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_2_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_3_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';' )* )
            {
            // InternalPascal.g:3756:2: ( ( (lv_label_declaration_part_0_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_1_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_2_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_3_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';' )* )
            // InternalPascal.g:3757:3: ( (lv_label_declaration_part_0_0= rulelabel_declaration_part ) )? ( (lv_constant_definition_part_1_0= ruleconstant_definition_part ) )? ( (lv_type_definition_part_2_0= ruletype_definition_part ) )? ( (lv_variable_declaration_part_3_0= rulevariable_declaration_part ) )? ( ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';' )*
            {
            // InternalPascal.g:3757:3: ( (lv_label_declaration_part_0_0= rulelabel_declaration_part ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3758:4: (lv_label_declaration_part_0_0= rulelabel_declaration_part )
                    {
                    // InternalPascal.g:3758:4: (lv_label_declaration_part_0_0= rulelabel_declaration_part )
                    // InternalPascal.g:3759:5: lv_label_declaration_part_0_0= rulelabel_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declaration_partLabel_declaration_partParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
                    lv_label_declaration_part_0_0=rulelabel_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"label_declaration_part",
                      						lv_label_declaration_part_0_0,
                      						"org.xtext.example.pascal.Pascal.label_declaration_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3776:3: ( (lv_constant_definition_part_1_0= ruleconstant_definition_part ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:3777:4: (lv_constant_definition_part_1_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:3777:4: (lv_constant_definition_part_1_0= ruleconstant_definition_part )
                    // InternalPascal.g:3778:5: lv_constant_definition_part_1_0= ruleconstant_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_definition_partConstant_definition_partParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_42);
                    lv_constant_definition_part_1_0=ruleconstant_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"constant_definition_part",
                      						lv_constant_definition_part_1_0,
                      						"org.xtext.example.pascal.Pascal.constant_definition_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3795:3: ( (lv_type_definition_part_2_0= ruletype_definition_part ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:3796:4: (lv_type_definition_part_2_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:3796:4: (lv_type_definition_part_2_0= ruletype_definition_part )
                    // InternalPascal.g:3797:5: lv_type_definition_part_2_0= ruletype_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_definition_partType_definition_partParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_43);
                    lv_type_definition_part_2_0=ruletype_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"type_definition_part",
                      						lv_type_definition_part_2_0,
                      						"org.xtext.example.pascal.Pascal.type_definition_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3814:3: ( (lv_variable_declaration_part_3_0= rulevariable_declaration_part ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:3815:4: (lv_variable_declaration_part_3_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:3815:4: (lv_variable_declaration_part_3_0= rulevariable_declaration_part )
                    // InternalPascal.g:3816:5: lv_variable_declaration_part_3_0= rulevariable_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declaration_partVariable_declaration_partParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_variable_declaration_part_3_0=rulevariable_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                      					}
                      					set(
                      						current,
                      						"variable_declaration_part",
                      						lv_variable_declaration_part_3_0,
                      						"org.xtext.example.pascal.Pascal.variable_declaration_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3833:3: ( ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=69 && LA50_0<=70)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPascal.g:3834:4: ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) ) otherlv_22= ';'
            	    {
            	    // InternalPascal.g:3834:4: ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) | ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) | ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) | ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) | ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) | ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) ) )
            	    int alt49=6;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==70) ) {
            	        int LA49_1 = input.LA(2);

            	        if ( (synpred71_InternalPascal()) ) {
            	            alt49=1;
            	        }
            	        else if ( (synpred72_InternalPascal()) ) {
            	            alt49=2;
            	        }
            	        else if ( (synpred73_InternalPascal()) ) {
            	            alt49=3;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 49, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA49_0==69) ) {
            	        int LA49_2 = input.LA(2);

            	        if ( (synpred74_InternalPascal()) ) {
            	            alt49=4;
            	        }
            	        else if ( (synpred75_InternalPascal()) ) {
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
            	            // InternalPascal.g:3835:5: ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) )
            	            {
            	            // InternalPascal.g:3835:5: ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) )
            	            // InternalPascal.g:3836:6: ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) )
            	            {
            	            // InternalPascal.g:3836:6: ( (lv_procedure_heading_4_0= ruleprocedure_heading ) )
            	            // InternalPascal.g:3837:7: (lv_procedure_heading_4_0= ruleprocedure_heading )
            	            {
            	            // InternalPascal.g:3837:7: (lv_procedure_heading_4_0= ruleprocedure_heading )
            	            // InternalPascal.g:3838:8: lv_procedure_heading_4_0= ruleprocedure_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_4_0_0_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_heading_4_0=ruleprocedure_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_heading",
            	              									lv_procedure_heading_4_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_5=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_5, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_0_0_1());
            	              					
            	            }
            	            // InternalPascal.g:3859:6: ( (lv_procedure_body_6_0= ruleprocedure_body ) )
            	            // InternalPascal.g:3860:7: (lv_procedure_body_6_0= ruleprocedure_body )
            	            {
            	            // InternalPascal.g:3860:7: (lv_procedure_body_6_0= ruleprocedure_body )
            	            // InternalPascal.g:3861:8: lv_procedure_body_6_0= ruleprocedure_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_4_0_0_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_body_6_0=ruleprocedure_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_body",
            	              									lv_procedure_body_6_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:3880:5: ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) )
            	            {
            	            // InternalPascal.g:3880:5: ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) )
            	            // InternalPascal.g:3881:6: ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) )
            	            {
            	            // InternalPascal.g:3881:6: ( (lv_procedure_heading_7_0= ruleprocedure_heading ) )
            	            // InternalPascal.g:3882:7: (lv_procedure_heading_7_0= ruleprocedure_heading )
            	            {
            	            // InternalPascal.g:3882:7: (lv_procedure_heading_7_0= ruleprocedure_heading )
            	            // InternalPascal.g:3883:8: lv_procedure_heading_7_0= ruleprocedure_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_4_0_1_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_heading_7_0=ruleprocedure_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_heading",
            	              									lv_procedure_heading_7_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_8=(Token)match(input,15,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_0_1_1());
            	              					
            	            }
            	            // InternalPascal.g:3904:6: ( (lv_directive_9_0= ruledirective ) )
            	            // InternalPascal.g:3905:7: (lv_directive_9_0= ruledirective )
            	            {
            	            // InternalPascal.g:3905:7: (lv_directive_9_0= ruledirective )
            	            // InternalPascal.g:3906:8: lv_directive_9_0= ruledirective
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_4_0_1_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_directive_9_0=ruledirective();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"directive",
            	              									lv_directive_9_0,
            	              									"org.xtext.example.pascal.Pascal.directive");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:3925:5: ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) )
            	            {
            	            // InternalPascal.g:3925:5: ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) )
            	            // InternalPascal.g:3926:6: ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) )
            	            {
            	            // InternalPascal.g:3926:6: ( (lv_procedure_identification_10_0= ruleprocedure_identification ) )
            	            // InternalPascal.g:3927:7: (lv_procedure_identification_10_0= ruleprocedure_identification )
            	            {
            	            // InternalPascal.g:3927:7: (lv_procedure_identification_10_0= ruleprocedure_identification )
            	            // InternalPascal.g:3928:8: lv_procedure_identification_10_0= ruleprocedure_identification
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_identificationProcedure_identificationParserRuleCall_4_0_2_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_identification_10_0=ruleprocedure_identification();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_identification",
            	              									lv_procedure_identification_10_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_identification");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_11=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_11, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_0_2_1());
            	              					
            	            }
            	            // InternalPascal.g:3949:6: ( (lv_procedure_body_12_0= ruleprocedure_body ) )
            	            // InternalPascal.g:3950:7: (lv_procedure_body_12_0= ruleprocedure_body )
            	            {
            	            // InternalPascal.g:3950:7: (lv_procedure_body_12_0= ruleprocedure_body )
            	            // InternalPascal.g:3951:8: lv_procedure_body_12_0= ruleprocedure_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_4_0_2_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_procedure_body_12_0=ruleprocedure_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"procedure_body",
            	              									lv_procedure_body_12_0,
            	              									"org.xtext.example.pascal.Pascal.procedure_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:3970:5: ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) )
            	            {
            	            // InternalPascal.g:3970:5: ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) )
            	            // InternalPascal.g:3971:6: ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) )
            	            {
            	            // InternalPascal.g:3971:6: ( (lv_function_heading_13_0= rulefunction_heading ) )
            	            // InternalPascal.g:3972:7: (lv_function_heading_13_0= rulefunction_heading )
            	            {
            	            // InternalPascal.g:3972:7: (lv_function_heading_13_0= rulefunction_heading )
            	            // InternalPascal.g:3973:8: lv_function_heading_13_0= rulefunction_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_4_0_3_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_heading_13_0=rulefunction_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_heading",
            	              									lv_function_heading_13_0,
            	              									"org.xtext.example.pascal.Pascal.function_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_14=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_14, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_0_3_1());
            	              					
            	            }
            	            // InternalPascal.g:3994:6: ( (lv_function_body_15_0= rulefunction_body ) )
            	            // InternalPascal.g:3995:7: (lv_function_body_15_0= rulefunction_body )
            	            {
            	            // InternalPascal.g:3995:7: (lv_function_body_15_0= rulefunction_body )
            	            // InternalPascal.g:3996:8: lv_function_body_15_0= rulefunction_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_bodyFunction_bodyParserRuleCall_4_0_3_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_body_15_0=rulefunction_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_body",
            	              									lv_function_body_15_0,
            	              									"org.xtext.example.pascal.Pascal.function_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalPascal.g:4015:5: ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) )
            	            {
            	            // InternalPascal.g:4015:5: ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) )
            	            // InternalPascal.g:4016:6: ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) )
            	            {
            	            // InternalPascal.g:4016:6: ( (lv_function_heading_16_0= rulefunction_heading ) )
            	            // InternalPascal.g:4017:7: (lv_function_heading_16_0= rulefunction_heading )
            	            {
            	            // InternalPascal.g:4017:7: (lv_function_heading_16_0= rulefunction_heading )
            	            // InternalPascal.g:4018:8: lv_function_heading_16_0= rulefunction_heading
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_4_0_4_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_heading_16_0=rulefunction_heading();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_heading",
            	              									lv_function_heading_16_0,
            	              									"org.xtext.example.pascal.Pascal.function_heading");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_17=(Token)match(input,15,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_17, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_0_4_1());
            	              					
            	            }
            	            // InternalPascal.g:4039:6: ( (lv_directive_18_0= ruledirective ) )
            	            // InternalPascal.g:4040:7: (lv_directive_18_0= ruledirective )
            	            {
            	            // InternalPascal.g:4040:7: (lv_directive_18_0= ruledirective )
            	            // InternalPascal.g:4041:8: lv_directive_18_0= ruledirective
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_4_0_4_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_directive_18_0=ruledirective();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"directive",
            	              									lv_directive_18_0,
            	              									"org.xtext.example.pascal.Pascal.directive");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalPascal.g:4060:5: ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) )
            	            {
            	            // InternalPascal.g:4060:5: ( ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) ) )
            	            // InternalPascal.g:4061:6: ( (lv_function_identification_19_0= rulefunction_identification ) ) otherlv_20= ';' ( (lv_function_body_21_0= rulefunction_body ) )
            	            {
            	            // InternalPascal.g:4061:6: ( (lv_function_identification_19_0= rulefunction_identification ) )
            	            // InternalPascal.g:4062:7: (lv_function_identification_19_0= rulefunction_identification )
            	            {
            	            // InternalPascal.g:4062:7: (lv_function_identification_19_0= rulefunction_identification )
            	            // InternalPascal.g:4063:8: lv_function_identification_19_0= rulefunction_identification
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_identificationFunction_identificationParserRuleCall_4_0_5_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_identification_19_0=rulefunction_identification();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_identification",
            	              									lv_function_identification_19_0,
            	              									"org.xtext.example.pascal.Pascal.function_identification");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            otherlv_20=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_20, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_0_5_1());
            	              					
            	            }
            	            // InternalPascal.g:4084:6: ( (lv_function_body_21_0= rulefunction_body ) )
            	            // InternalPascal.g:4085:7: (lv_function_body_21_0= rulefunction_body )
            	            {
            	            // InternalPascal.g:4085:7: (lv_function_body_21_0= rulefunction_body )
            	            // InternalPascal.g:4086:8: lv_function_body_21_0= rulefunction_body
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_bodyFunction_bodyParserRuleCall_4_0_5_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_function_body_21_0=rulefunction_body();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
            	              								}
            	              								add(
            	              									current,
            	              									"function_body",
            	              									lv_function_body_21_0,
            	              									"org.xtext.example.pascal.Pascal.function_body");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,15,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_22, grammarAccess.getDeclaration_partAccess().getSemicolonKeyword_4_1());
            	      			
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
    // InternalPascal.g:4114:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:4114:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:4115:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
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
    // InternalPascal.g:4121:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_label_1_0 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4127:2: ( (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:4128:2: (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:4128:2: (otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:4129:3: otherlv_0= 'label' ( (lv_label_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
              		
            }
            // InternalPascal.g:4133:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:4134:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:4134:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:4135:5: lv_label_1_0= rulelabel
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

            // InternalPascal.g:4152:3: (otherlv_2= ',' ( (lv_label_3_0= rulelabel ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==16) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:4153:4: otherlv_2= ',' ( (lv_label_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:4157:4: ( (lv_label_3_0= rulelabel ) )
            	    // InternalPascal.g:4158:5: (lv_label_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:4158:5: (lv_label_3_0= rulelabel )
            	    // InternalPascal.g:4159:6: lv_label_3_0= rulelabel
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
            	    break loop51;
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
    // InternalPascal.g:4185:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:4185:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:4186:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
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
    // InternalPascal.g:4192:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constant_definition_1_0 = null;

        EObject lv_constant_definition_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4198:2: ( (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4199:2: (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4199:2: (otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4200:3: otherlv_0= 'const' ( (lv_constant_definition_1_0= ruleconstant_definition ) ) otherlv_2= ';' ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
              		
            }
            // InternalPascal.g:4204:3: ( (lv_constant_definition_1_0= ruleconstant_definition ) )
            // InternalPascal.g:4205:4: (lv_constant_definition_1_0= ruleconstant_definition )
            {
            // InternalPascal.g:4205:4: (lv_constant_definition_1_0= ruleconstant_definition )
            // InternalPascal.g:4206:5: lv_constant_definition_1_0= ruleconstant_definition
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
            // InternalPascal.g:4227:3: ( ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:4228:4: ( (lv_constant_definition_3_0= ruleconstant_definition ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4228:4: ( (lv_constant_definition_3_0= ruleconstant_definition ) )
            	    // InternalPascal.g:4229:5: (lv_constant_definition_3_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:4229:5: (lv_constant_definition_3_0= ruleconstant_definition )
            	    // InternalPascal.g:4230:6: lv_constant_definition_3_0= ruleconstant_definition
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
    // InternalPascal.g:4256:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:4256:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:4257:2: iv_ruleconstant_definition= ruleconstant_definition EOF
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
    // InternalPascal.g:4263:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4269:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:4270:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:4270:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            // InternalPascal.g:4271:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) )
            {
            // InternalPascal.g:4271:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4272:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4272:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4273:5: lv_identifier_0_0= ruleidentifier
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
            // InternalPascal.g:4294:3: ( (lv_constant_2_0= ruleconstant ) )
            // InternalPascal.g:4295:4: (lv_constant_2_0= ruleconstant )
            {
            // InternalPascal.g:4295:4: (lv_constant_2_0= ruleconstant )
            // InternalPascal.g:4296:5: lv_constant_2_0= ruleconstant
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
    // InternalPascal.g:4317:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:4317:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:4318:2: iv_ruleconstant= ruleconstant EOF
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
    // InternalPascal.g:4324:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_constant_identifier_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_strings_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4330:2: ( ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) ) )
            // InternalPascal.g:4331:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) )
            {
            // InternalPascal.g:4331:2: ( ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_strings_3_0= rulestrings ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||(LA55_0>=44 && LA55_0<=45)) ) {
                alt55=1;
            }
            else if ( (LA55_0==39) ) {
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
                    // InternalPascal.g:4332:3: ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:4332:3: ( ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:4333:4: ( (lv_sign_0_0= rulesign ) )? ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:4333:4: ( (lv_sign_0_0= rulesign ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==44) ) {
                        int LA53_1 = input.LA(2);

                        if ( (synpred79_InternalPascal()) ) {
                            alt53=1;
                        }
                    }
                    else if ( (LA53_0==45) ) {
                        int LA53_2 = input.LA(2);

                        if ( (synpred79_InternalPascal()) ) {
                            alt53=1;
                        }
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalPascal.g:4334:5: (lv_sign_0_0= rulesign )
                            {
                            // InternalPascal.g:4334:5: (lv_sign_0_0= rulesign )
                            // InternalPascal.g:4335:6: lv_sign_0_0= rulesign
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

                    // InternalPascal.g:4352:4: ( ( (lv_constant_identifier_1_0= ruleidentifier ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RULE_INT||(LA54_0>=44 && LA54_0<=45)) ) {
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
                            // InternalPascal.g:4353:5: ( (lv_constant_identifier_1_0= ruleidentifier ) )
                            {
                            // InternalPascal.g:4353:5: ( (lv_constant_identifier_1_0= ruleidentifier ) )
                            // InternalPascal.g:4354:6: (lv_constant_identifier_1_0= ruleidentifier )
                            {
                            // InternalPascal.g:4354:6: (lv_constant_identifier_1_0= ruleidentifier )
                            // InternalPascal.g:4355:7: lv_constant_identifier_1_0= ruleidentifier
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
                            // InternalPascal.g:4373:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:4373:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:4374:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:4374:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:4375:7: lv_number_2_0= rulenumber
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
                    // InternalPascal.g:4395:3: ( (lv_strings_3_0= rulestrings ) )
                    {
                    // InternalPascal.g:4395:3: ( (lv_strings_3_0= rulestrings ) )
                    // InternalPascal.g:4396:4: (lv_strings_3_0= rulestrings )
                    {
                    // InternalPascal.g:4396:4: (lv_strings_3_0= rulestrings )
                    // InternalPascal.g:4397:5: lv_strings_3_0= rulestrings
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
    // InternalPascal.g:4418:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:4418:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:4419:2: iv_ruletype_definition_part= ruletype_definition_part EOF
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
    // InternalPascal.g:4425:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_definition_1_0 = null;

        EObject lv_type_definition_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4431:2: ( (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4432:2: (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4432:2: (otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4433:3: otherlv_0= 'type' ( (lv_type_definition_1_0= ruletype_definition ) ) otherlv_2= ';' ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
              		
            }
            // InternalPascal.g:4437:3: ( (lv_type_definition_1_0= ruletype_definition ) )
            // InternalPascal.g:4438:4: (lv_type_definition_1_0= ruletype_definition )
            {
            // InternalPascal.g:4438:4: (lv_type_definition_1_0= ruletype_definition )
            // InternalPascal.g:4439:5: lv_type_definition_1_0= ruletype_definition
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
            // InternalPascal.g:4460:3: ( ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';' )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalPascal.g:4461:4: ( (lv_type_definition_3_0= ruletype_definition ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4461:4: ( (lv_type_definition_3_0= ruletype_definition ) )
            	    // InternalPascal.g:4462:5: (lv_type_definition_3_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:4462:5: (lv_type_definition_3_0= ruletype_definition )
            	    // InternalPascal.g:4463:6: lv_type_definition_3_0= ruletype_definition
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
    // InternalPascal.g:4489:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:4489:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:4490:2: iv_ruletype_definition= ruletype_definition EOF
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
    // InternalPascal.g:4496:1: ruletype_definition returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4502:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4503:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4503:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4504:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:4504:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4505:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4505:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4506:5: lv_identifier_0_0= ruleidentifier
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
            // InternalPascal.g:4527:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4528:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4528:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4529:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:4550:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:4550:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:4551:2: iv_ruletype= ruletype EOF
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
    // InternalPascal.g:4557:1: ruletype returns [EObject current=null] : ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_type_0_0 = null;

        EObject lv_structured_type_1_0 = null;

        EObject lv_pointer_type_2_0 = null;

        EObject lv_type_identifier_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4563:2: ( ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:4564:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:4564:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) | ( (lv_structured_type_1_0= rulestructured_type ) ) | ( (lv_pointer_type_2_0= rulepointer_type ) ) | ( (lv_type_identifier_3_0= ruletype_identifier ) ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 13:
            case 39:
            case 44:
            case 45:
                {
                alt57=1;
                }
                break;
            case RULE_ID:
                {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==67) ) {
                    alt57=1;
                }
                else if ( (LA57_2==EOF||(LA57_2>=14 && LA57_2<=15)||LA57_2==18) ) {
                    alt57=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

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
                alt57=2;
                }
                break;
            case 43:
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
                    // InternalPascal.g:4565:3: ( (lv_simple_type_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:4565:3: ( (lv_simple_type_0_0= rulesimple_type ) )
                    // InternalPascal.g:4566:4: (lv_simple_type_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:4566:4: (lv_simple_type_0_0= rulesimple_type )
                    // InternalPascal.g:4567:5: lv_simple_type_0_0= rulesimple_type
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
                    // InternalPascal.g:4585:3: ( (lv_structured_type_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:4585:3: ( (lv_structured_type_1_0= rulestructured_type ) )
                    // InternalPascal.g:4586:4: (lv_structured_type_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:4586:4: (lv_structured_type_1_0= rulestructured_type )
                    // InternalPascal.g:4587:5: lv_structured_type_1_0= rulestructured_type
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
                    // InternalPascal.g:4605:3: ( (lv_pointer_type_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:4605:3: ( (lv_pointer_type_2_0= rulepointer_type ) )
                    // InternalPascal.g:4606:4: (lv_pointer_type_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:4606:4: (lv_pointer_type_2_0= rulepointer_type )
                    // InternalPascal.g:4607:5: lv_pointer_type_2_0= rulepointer_type
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
                    // InternalPascal.g:4625:3: ( (lv_type_identifier_3_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:4625:3: ( (lv_type_identifier_3_0= ruletype_identifier ) )
                    // InternalPascal.g:4626:4: (lv_type_identifier_3_0= ruletype_identifier )
                    {
                    // InternalPascal.g:4626:4: (lv_type_identifier_3_0= ruletype_identifier )
                    // InternalPascal.g:4627:5: lv_type_identifier_3_0= ruletype_identifier
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
    // InternalPascal.g:4648:1: entryRuletype_identifier returns [EObject current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final EObject entryRuletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_identifier = null;


        try {
            // InternalPascal.g:4648:56: (iv_ruletype_identifier= ruletype_identifier EOF )
            // InternalPascal.g:4649:2: iv_ruletype_identifier= ruletype_identifier EOF
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
    // InternalPascal.g:4655:1: ruletype_identifier returns [EObject current=null] : ( (lv_identifier_0_0= ruleidentifier ) ) ;
    public final EObject ruletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4661:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) )
            // InternalPascal.g:4662:2: ( (lv_identifier_0_0= ruleidentifier ) )
            {
            // InternalPascal.g:4662:2: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4663:3: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4663:3: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4664:4: lv_identifier_0_0= ruleidentifier
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
    // InternalPascal.g:4684:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:4684:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:4685:2: iv_rulepointer_type= rulepointer_type EOF
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
    // InternalPascal.g:4691:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4697:2: ( (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:4698:2: (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:4698:2: (otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) ) )
            // InternalPascal.g:4699:3: otherlv_0= '^' ( (lv_type_identifier_1_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
              		
            }
            // InternalPascal.g:4703:3: ( (lv_type_identifier_1_0= ruletype_identifier ) )
            // InternalPascal.g:4704:4: (lv_type_identifier_1_0= ruletype_identifier )
            {
            // InternalPascal.g:4704:4: (lv_type_identifier_1_0= ruletype_identifier )
            // InternalPascal.g:4705:5: lv_type_identifier_1_0= ruletype_identifier
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
    // InternalPascal.g:4726:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:4726:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:4727:2: iv_rulestructured_type= rulestructured_type EOF
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
    // InternalPascal.g:4733:1: rulestructured_type returns [EObject current=null] : ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpacked_structured_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4739:2: ( ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:4740:2: ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:4740:2: ( (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:4741:3: (otherlv_0= 'packed' )? ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:4741:3: (otherlv_0= 'packed' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPascal.g:4742:4: otherlv_0= 'packed'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStructured_typeAccess().getPackedKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:4747:3: ( (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:4748:4: (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:4748:4: (lv_unpacked_structured_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:4749:5: lv_unpacked_structured_type_1_0= ruleunpacked_structured_type
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
    // InternalPascal.g:4770:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:4770:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:4771:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
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
    // InternalPascal.g:4777:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_type_0_0 = null;

        EObject lv_record_type_1_0 = null;

        EObject lv_set_type_2_0 = null;

        EObject lv_file_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4783:2: ( ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) ) )
            // InternalPascal.g:4784:2: ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) )
            {
            // InternalPascal.g:4784:2: ( ( (lv_array_type_0_0= rulearray_type ) ) | ( (lv_record_type_1_0= rulerecord_type ) ) | ( (lv_set_type_2_0= ruleset_type ) ) | ( (lv_file_type_3_0= rulefile_type ) ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt59=1;
                }
                break;
            case 65:
                {
                alt59=2;
                }
                break;
            case 64:
                {
                alt59=3;
                }
                break;
            case 63:
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
                    // InternalPascal.g:4785:3: ( (lv_array_type_0_0= rulearray_type ) )
                    {
                    // InternalPascal.g:4785:3: ( (lv_array_type_0_0= rulearray_type ) )
                    // InternalPascal.g:4786:4: (lv_array_type_0_0= rulearray_type )
                    {
                    // InternalPascal.g:4786:4: (lv_array_type_0_0= rulearray_type )
                    // InternalPascal.g:4787:5: lv_array_type_0_0= rulearray_type
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
                    // InternalPascal.g:4805:3: ( (lv_record_type_1_0= rulerecord_type ) )
                    {
                    // InternalPascal.g:4805:3: ( (lv_record_type_1_0= rulerecord_type ) )
                    // InternalPascal.g:4806:4: (lv_record_type_1_0= rulerecord_type )
                    {
                    // InternalPascal.g:4806:4: (lv_record_type_1_0= rulerecord_type )
                    // InternalPascal.g:4807:5: lv_record_type_1_0= rulerecord_type
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
                    // InternalPascal.g:4825:3: ( (lv_set_type_2_0= ruleset_type ) )
                    {
                    // InternalPascal.g:4825:3: ( (lv_set_type_2_0= ruleset_type ) )
                    // InternalPascal.g:4826:4: (lv_set_type_2_0= ruleset_type )
                    {
                    // InternalPascal.g:4826:4: (lv_set_type_2_0= ruleset_type )
                    // InternalPascal.g:4827:5: lv_set_type_2_0= ruleset_type
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
                    // InternalPascal.g:4845:3: ( (lv_file_type_3_0= rulefile_type ) )
                    {
                    // InternalPascal.g:4845:3: ( (lv_file_type_3_0= rulefile_type ) )
                    // InternalPascal.g:4846:4: (lv_file_type_3_0= rulefile_type )
                    {
                    // InternalPascal.g:4846:4: (lv_file_type_3_0= rulefile_type )
                    // InternalPascal.g:4847:5: lv_file_type_3_0= rulefile_type
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
    // InternalPascal.g:4868:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // InternalPascal.g:4868:50: (iv_rulefile_type= rulefile_type EOF )
            // InternalPascal.g:4869:2: iv_rulefile_type= rulefile_type EOF
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
    // InternalPascal.g:4875:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_file_component_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4881:2: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) ) )
            // InternalPascal.g:4882:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) )
            {
            // InternalPascal.g:4882:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) ) )
            // InternalPascal.g:4883:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_file_component_type_2_0= rulefile_component_type ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
              		
            }
            // InternalPascal.g:4891:3: ( (lv_file_component_type_2_0= rulefile_component_type ) )
            // InternalPascal.g:4892:4: (lv_file_component_type_2_0= rulefile_component_type )
            {
            // InternalPascal.g:4892:4: (lv_file_component_type_2_0= rulefile_component_type )
            // InternalPascal.g:4893:5: lv_file_component_type_2_0= rulefile_component_type
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
    // InternalPascal.g:4914:1: entryRulefile_component_type returns [EObject current=null] : iv_rulefile_component_type= rulefile_component_type EOF ;
    public final EObject entryRulefile_component_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_component_type = null;


        try {
            // InternalPascal.g:4914:60: (iv_rulefile_component_type= rulefile_component_type EOF )
            // InternalPascal.g:4915:2: iv_rulefile_component_type= rulefile_component_type EOF
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
    // InternalPascal.g:4921:1: rulefile_component_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject rulefile_component_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4927:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:4928:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:4928:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:4929:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:4929:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:4930:4: lv_type_0_0= ruletype
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
    // InternalPascal.g:4950:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:4950:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:4951:2: iv_ruleset_type= ruleset_type EOF
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
    // InternalPascal.g:4957:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_base_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4963:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) ) )
            // InternalPascal.g:4964:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) )
            {
            // InternalPascal.g:4964:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) ) )
            // InternalPascal.g:4965:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_base_type_2_0= rulebase_type ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
              		
            }
            // InternalPascal.g:4973:3: ( (lv_base_type_2_0= rulebase_type ) )
            // InternalPascal.g:4974:4: (lv_base_type_2_0= rulebase_type )
            {
            // InternalPascal.g:4974:4: (lv_base_type_2_0= rulebase_type )
            // InternalPascal.g:4975:5: lv_base_type_2_0= rulebase_type
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
    // InternalPascal.g:4996:1: entryRulebase_type returns [EObject current=null] : iv_rulebase_type= rulebase_type EOF ;
    public final EObject entryRulebase_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_type = null;


        try {
            // InternalPascal.g:4996:50: (iv_rulebase_type= rulebase_type EOF )
            // InternalPascal.g:4997:2: iv_rulebase_type= rulebase_type EOF
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
    // InternalPascal.g:5003:1: rulebase_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject rulebase_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5009:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:5010:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:5010:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:5011:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:5011:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:5012:4: lv_type_0_0= ruletype
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
    // InternalPascal.g:5032:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:5032:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:5033:2: iv_rulerecord_type= rulerecord_type EOF
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
    // InternalPascal.g:5039:1: rulerecord_type returns [EObject current=null] : (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_field_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5045:2: ( (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:5046:2: (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:5046:2: (otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end' )
            // InternalPascal.g:5047:3: otherlv_0= 'record' ( (lv_field_list_1_0= rulefield_list ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecord_typeAccess().getRecordKeyword_0());
              		
            }
            // InternalPascal.g:5051:3: ( (lv_field_list_1_0= rulefield_list ) )
            // InternalPascal.g:5052:4: (lv_field_list_1_0= rulefield_list )
            {
            // InternalPascal.g:5052:4: (lv_field_list_1_0= rulefield_list )
            // InternalPascal.g:5053:5: lv_field_list_1_0= rulefield_list
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
    // InternalPascal.g:5078:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:5078:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:5079:2: iv_rulefield_list= rulefield_list EOF
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
    // InternalPascal.g:5085:1: rulefield_list returns [EObject current=null] : ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fixed_part_1_0 = null;

        EObject lv_variant_part_3_0 = null;

        EObject lv_variant_part_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5091:2: ( ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? ) )
            // InternalPascal.g:5092:2: ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? )
            {
            // InternalPascal.g:5092:2: ( () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )? )
            // InternalPascal.g:5093:3: () ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )?
            {
            // InternalPascal.g:5093:3: ()
            // InternalPascal.g:5094:4: 
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

            // InternalPascal.g:5103:3: ( ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPascal.g:5104:4: ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) ) (otherlv_5= ';' )?
                    {
                    // InternalPascal.g:5104:4: ( ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? ) | ( (lv_variant_part_4_0= rulevariant_part ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ID) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==48) ) {
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
                            // InternalPascal.g:5105:5: ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? )
                            {
                            // InternalPascal.g:5105:5: ( ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )? )
                            // InternalPascal.g:5106:6: ( (lv_fixed_part_1_0= rulefixed_part ) ) (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )?
                            {
                            // InternalPascal.g:5106:6: ( (lv_fixed_part_1_0= rulefixed_part ) )
                            // InternalPascal.g:5107:7: (lv_fixed_part_1_0= rulefixed_part )
                            {
                            // InternalPascal.g:5107:7: (lv_fixed_part_1_0= rulefixed_part )
                            // InternalPascal.g:5108:8: lv_fixed_part_1_0= rulefixed_part
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

                            // InternalPascal.g:5125:6: (otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) ) )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==15) ) {
                                int LA60_1 = input.LA(2);

                                if ( (LA60_1==48) ) {
                                    alt60=1;
                                }
                            }
                            switch (alt60) {
                                case 1 :
                                    // InternalPascal.g:5126:7: otherlv_2= ';' ( (lv_variant_part_3_0= rulevariant_part ) )
                                    {
                                    otherlv_2=(Token)match(input,15,FOLLOW_53); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_2, grammarAccess.getField_listAccess().getSemicolonKeyword_1_0_0_1_0());
                                      						
                                    }
                                    // InternalPascal.g:5130:7: ( (lv_variant_part_3_0= rulevariant_part ) )
                                    // InternalPascal.g:5131:8: (lv_variant_part_3_0= rulevariant_part )
                                    {
                                    // InternalPascal.g:5131:8: (lv_variant_part_3_0= rulevariant_part )
                                    // InternalPascal.g:5132:9: lv_variant_part_3_0= rulevariant_part
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
                            // InternalPascal.g:5152:5: ( (lv_variant_part_4_0= rulevariant_part ) )
                            {
                            // InternalPascal.g:5152:5: ( (lv_variant_part_4_0= rulevariant_part ) )
                            // InternalPascal.g:5153:6: (lv_variant_part_4_0= rulevariant_part )
                            {
                            // InternalPascal.g:5153:6: (lv_variant_part_4_0= rulevariant_part )
                            // InternalPascal.g:5154:7: lv_variant_part_4_0= rulevariant_part
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

                    // InternalPascal.g:5172:4: (otherlv_5= ';' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==15) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalPascal.g:5173:5: otherlv_5= ';'
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
    // InternalPascal.g:5183:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalPascal.g:5183:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalPascal.g:5184:2: iv_rulefixed_part= rulefixed_part EOF
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
    // InternalPascal.g:5190:1: rulefixed_part returns [EObject current=null] : ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_record_section_0_0 = null;

        EObject lv_record_section_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5196:2: ( ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:5197:2: ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:5197:2: ( ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:5198:3: ( (lv_record_section_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:5198:3: ( (lv_record_section_0_0= rulerecord_section ) )
            // InternalPascal.g:5199:4: (lv_record_section_0_0= rulerecord_section )
            {
            // InternalPascal.g:5199:4: (lv_record_section_0_0= rulerecord_section )
            // InternalPascal.g:5200:5: lv_record_section_0_0= rulerecord_section
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

            // InternalPascal.g:5217:3: (otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==15) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==RULE_ID) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalPascal.g:5218:4: otherlv_1= ';' ( (lv_record_section_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:5222:4: ( (lv_record_section_2_0= rulerecord_section ) )
            	    // InternalPascal.g:5223:5: (lv_record_section_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:5223:5: (lv_record_section_2_0= rulerecord_section )
            	    // InternalPascal.g:5224:6: lv_record_section_2_0= rulerecord_section
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
    // InternalPascal.g:5246:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:5246:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:5247:2: iv_rulerecord_section= rulerecord_section EOF
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
    // InternalPascal.g:5253:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5259:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:5260:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:5260:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:5261:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:5261:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:5262:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:5262:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:5263:5: lv_identifier_list_0_0= ruleidentifier_list
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
            // InternalPascal.g:5284:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:5285:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:5285:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:5286:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:5307:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalPascal.g:5307:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalPascal.g:5308:2: iv_rulevariant_part= rulevariant_part EOF
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
    // InternalPascal.g:5314:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* ) ;
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
            // InternalPascal.g:5320:2: ( (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* ) )
            // InternalPascal.g:5321:2: (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:5321:2: (otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )* )
            // InternalPascal.g:5322:3: otherlv_0= 'case' ( (lv_tag_field_1_0= ruletag_field ) ) ( (lv_type_identifier_2_0= ruletype_identifier ) ) otherlv_3= 'of' ( (lv_variant_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:5326:3: ( (lv_tag_field_1_0= ruletag_field ) )
            // InternalPascal.g:5327:4: (lv_tag_field_1_0= ruletag_field )
            {
            // InternalPascal.g:5327:4: (lv_tag_field_1_0= ruletag_field )
            // InternalPascal.g:5328:5: lv_tag_field_1_0= ruletag_field
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

            // InternalPascal.g:5345:3: ( (lv_type_identifier_2_0= ruletype_identifier ) )
            // InternalPascal.g:5346:4: (lv_type_identifier_2_0= ruletype_identifier )
            {
            // InternalPascal.g:5346:4: (lv_type_identifier_2_0= ruletype_identifier )
            // InternalPascal.g:5347:5: lv_type_identifier_2_0= ruletype_identifier
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
            // InternalPascal.g:5368:3: ( (lv_variant_4_0= rulevariant ) )
            // InternalPascal.g:5369:4: (lv_variant_4_0= rulevariant )
            {
            // InternalPascal.g:5369:4: (lv_variant_4_0= rulevariant )
            // InternalPascal.g:5370:5: lv_variant_4_0= rulevariant
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

            // InternalPascal.g:5387:3: (otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==15) ) {
                    int LA65_1 = input.LA(2);

                    if ( ((LA65_1>=RULE_ID && LA65_1<=RULE_INT)||LA65_1==39||(LA65_1>=44 && LA65_1<=45)) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalPascal.g:5388:4: otherlv_5= ';' ( (lv_variant_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalPascal.g:5392:4: ( (lv_variant_6_0= rulevariant ) )
            	    // InternalPascal.g:5393:5: (lv_variant_6_0= rulevariant )
            	    {
            	    // InternalPascal.g:5393:5: (lv_variant_6_0= rulevariant )
            	    // InternalPascal.g:5394:6: lv_variant_6_0= rulevariant
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
    // InternalPascal.g:5416:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:5416:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:5417:2: iv_rulevariant= rulevariant EOF
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
    // InternalPascal.g:5423:1: rulevariant returns [EObject current=null] : ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_case_label_list_0_0 = null;

        EObject lv_field_list_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5429:2: ( ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' ) )
            // InternalPascal.g:5430:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' )
            {
            // InternalPascal.g:5430:2: ( ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')' )
            // InternalPascal.g:5431:3: ( (lv_case_label_list_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_field_list_3_0= rulefield_list ) ) otherlv_4= ')'
            {
            // InternalPascal.g:5431:3: ( (lv_case_label_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:5432:4: (lv_case_label_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:5432:4: (lv_case_label_list_0_0= rulecase_label_list )
            // InternalPascal.g:5433:5: lv_case_label_list_0_0= rulecase_label_list
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
            // InternalPascal.g:5458:3: ( (lv_field_list_3_0= rulefield_list ) )
            // InternalPascal.g:5459:4: (lv_field_list_3_0= rulefield_list )
            {
            // InternalPascal.g:5459:4: (lv_field_list_3_0= rulefield_list )
            // InternalPascal.g:5460:5: lv_field_list_3_0= rulefield_list
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
    // InternalPascal.g:5485:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalPascal.g:5485:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalPascal.g:5486:2: iv_ruletag_field= ruletag_field EOF
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
    // InternalPascal.g:5492:1: ruletag_field returns [EObject current=null] : ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5498:2: ( ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? ) )
            // InternalPascal.g:5499:2: ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? )
            {
            // InternalPascal.g:5499:2: ( () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )? )
            // InternalPascal.g:5500:3: () ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )?
            {
            // InternalPascal.g:5500:3: ()
            // InternalPascal.g:5501:4: 
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

            // InternalPascal.g:5510:3: ( ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==19) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalPascal.g:5511:4: ( (lv_identifier_1_0= ruleidentifier ) ) otherlv_2= ':'
                    {
                    // InternalPascal.g:5511:4: ( (lv_identifier_1_0= ruleidentifier ) )
                    // InternalPascal.g:5512:5: (lv_identifier_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:5512:5: (lv_identifier_1_0= ruleidentifier )
                    // InternalPascal.g:5513:6: lv_identifier_1_0= ruleidentifier
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
    // InternalPascal.g:5539:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascal.g:5539:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascal.g:5540:2: iv_rulearray_type= rulearray_type EOF
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
    // InternalPascal.g:5546:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) ) ;
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
            // InternalPascal.g:5552:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) ) )
            // InternalPascal.g:5553:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) )
            {
            // InternalPascal.g:5553:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) ) )
            // InternalPascal.g:5554:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_index_type_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_element_type_7_0= ruleelement_type ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPascal.g:5562:3: ( (lv_index_type_2_0= ruleindex_type ) )
            // InternalPascal.g:5563:4: (lv_index_type_2_0= ruleindex_type )
            {
            // InternalPascal.g:5563:4: (lv_index_type_2_0= ruleindex_type )
            // InternalPascal.g:5564:5: lv_index_type_2_0= ruleindex_type
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

            // InternalPascal.g:5581:3: (otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==16) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalPascal.g:5582:4: otherlv_3= ',' ( (lv_index_type_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPascal.g:5586:4: ( (lv_index_type_4_0= ruleindex_type ) )
            	    // InternalPascal.g:5587:5: (lv_index_type_4_0= ruleindex_type )
            	    {
            	    // InternalPascal.g:5587:5: (lv_index_type_4_0= ruleindex_type )
            	    // InternalPascal.g:5588:6: lv_index_type_4_0= ruleindex_type
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
            	    break loop67;
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
            // InternalPascal.g:5614:3: ( (lv_element_type_7_0= ruleelement_type ) )
            // InternalPascal.g:5615:4: (lv_element_type_7_0= ruleelement_type )
            {
            // InternalPascal.g:5615:4: (lv_element_type_7_0= ruleelement_type )
            // InternalPascal.g:5616:5: lv_element_type_7_0= ruleelement_type
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
    // InternalPascal.g:5637:1: entryRuleelement_type returns [EObject current=null] : iv_ruleelement_type= ruleelement_type EOF ;
    public final EObject entryRuleelement_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement_type = null;


        try {
            // InternalPascal.g:5637:53: (iv_ruleelement_type= ruleelement_type EOF )
            // InternalPascal.g:5638:2: iv_ruleelement_type= ruleelement_type EOF
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
    // InternalPascal.g:5644:1: ruleelement_type returns [EObject current=null] : ( (lv_type_0_0= ruletype ) ) ;
    public final EObject ruleelement_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5650:2: ( ( (lv_type_0_0= ruletype ) ) )
            // InternalPascal.g:5651:2: ( (lv_type_0_0= ruletype ) )
            {
            // InternalPascal.g:5651:2: ( (lv_type_0_0= ruletype ) )
            // InternalPascal.g:5652:3: (lv_type_0_0= ruletype )
            {
            // InternalPascal.g:5652:3: (lv_type_0_0= ruletype )
            // InternalPascal.g:5653:4: lv_type_0_0= ruletype
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
    // InternalPascal.g:5673:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalPascal.g:5673:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalPascal.g:5674:2: iv_ruleindex_type= ruleindex_type EOF
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
    // InternalPascal.g:5680:1: ruleindex_type returns [EObject current=null] : ( (lv_simple_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5686:2: ( ( (lv_simple_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:5687:2: ( (lv_simple_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:5687:2: ( (lv_simple_type_0_0= rulesimple_type ) )
            // InternalPascal.g:5688:3: (lv_simple_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:5688:3: (lv_simple_type_0_0= rulesimple_type )
            // InternalPascal.g:5689:4: lv_simple_type_0_0= rulesimple_type
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
    // InternalPascal.g:5709:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:5709:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:5710:2: iv_rulesimple_type= rulesimple_type EOF
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
    // InternalPascal.g:5716:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject lv_subrange_type_0_0 = null;

        EObject lv_enumerated_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5722:2: ( ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) ) )
            // InternalPascal.g:5723:2: ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) )
            {
            // InternalPascal.g:5723:2: ( ( (lv_subrange_type_0_0= rulesubrange_type ) ) | ( (lv_enumerated_type_1_0= ruleenumerated_type ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_INT)||LA68_0==39||(LA68_0>=44 && LA68_0<=45)) ) {
                alt68=1;
            }
            else if ( (LA68_0==13) ) {
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
                    // InternalPascal.g:5724:3: ( (lv_subrange_type_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:5724:3: ( (lv_subrange_type_0_0= rulesubrange_type ) )
                    // InternalPascal.g:5725:4: (lv_subrange_type_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:5725:4: (lv_subrange_type_0_0= rulesubrange_type )
                    // InternalPascal.g:5726:5: lv_subrange_type_0_0= rulesubrange_type
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
                    // InternalPascal.g:5744:3: ( (lv_enumerated_type_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:5744:3: ( (lv_enumerated_type_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:5745:4: (lv_enumerated_type_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:5745:4: (lv_enumerated_type_1_0= ruleenumerated_type )
                    // InternalPascal.g:5746:5: lv_enumerated_type_1_0= ruleenumerated_type
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
    // InternalPascal.g:5767:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:5767:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:5768:2: iv_ruleenumerated_type= ruleenumerated_type EOF
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
    // InternalPascal.g:5774:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_list_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5780:2: ( (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:5781:2: (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:5781:2: (otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:5782:3: otherlv_0= '(' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:5786:3: ( (lv_identifier_list_1_0= ruleidentifier_list ) )
            // InternalPascal.g:5787:4: (lv_identifier_list_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:5787:4: (lv_identifier_list_1_0= ruleidentifier_list )
            // InternalPascal.g:5788:5: lv_identifier_list_1_0= ruleidentifier_list
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
    // InternalPascal.g:5813:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascal.g:5813:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:5814:2: iv_rulesubrange_type= rulesubrange_type EOF
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
    // InternalPascal.g:5820:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lower_bound_0_0 = null;

        EObject lv_upper_bound_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5826:2: ( ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) ) )
            // InternalPascal.g:5827:2: ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) )
            {
            // InternalPascal.g:5827:2: ( ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) ) )
            // InternalPascal.g:5828:3: ( (lv_lower_bound_0_0= rulelower_bound ) ) otherlv_1= '..' ( (lv_upper_bound_2_0= ruleupper_bound ) )
            {
            // InternalPascal.g:5828:3: ( (lv_lower_bound_0_0= rulelower_bound ) )
            // InternalPascal.g:5829:4: (lv_lower_bound_0_0= rulelower_bound )
            {
            // InternalPascal.g:5829:4: (lv_lower_bound_0_0= rulelower_bound )
            // InternalPascal.g:5830:5: lv_lower_bound_0_0= rulelower_bound
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
            // InternalPascal.g:5851:3: ( (lv_upper_bound_2_0= ruleupper_bound ) )
            // InternalPascal.g:5852:4: (lv_upper_bound_2_0= ruleupper_bound )
            {
            // InternalPascal.g:5852:4: (lv_upper_bound_2_0= ruleupper_bound )
            // InternalPascal.g:5853:5: lv_upper_bound_2_0= ruleupper_bound
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
    // InternalPascal.g:5874:1: entryRulelower_bound returns [EObject current=null] : iv_rulelower_bound= rulelower_bound EOF ;
    public final EObject entryRulelower_bound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelower_bound = null;


        try {
            // InternalPascal.g:5874:52: (iv_rulelower_bound= rulelower_bound EOF )
            // InternalPascal.g:5875:2: iv_rulelower_bound= rulelower_bound EOF
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
    // InternalPascal.g:5881:1: rulelower_bound returns [EObject current=null] : ( (lv_constant_0_0= ruleconstant ) ) ;
    public final EObject rulelower_bound() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5887:2: ( ( (lv_constant_0_0= ruleconstant ) ) )
            // InternalPascal.g:5888:2: ( (lv_constant_0_0= ruleconstant ) )
            {
            // InternalPascal.g:5888:2: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:5889:3: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:5889:3: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:5890:4: lv_constant_0_0= ruleconstant
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
    // InternalPascal.g:5910:1: entryRuleupper_bound returns [EObject current=null] : iv_ruleupper_bound= ruleupper_bound EOF ;
    public final EObject entryRuleupper_bound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleupper_bound = null;


        try {
            // InternalPascal.g:5910:52: (iv_ruleupper_bound= ruleupper_bound EOF )
            // InternalPascal.g:5911:2: iv_ruleupper_bound= ruleupper_bound EOF
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
    // InternalPascal.g:5917:1: ruleupper_bound returns [EObject current=null] : ( (lv_constant_0_0= ruleconstant ) ) ;
    public final EObject ruleupper_bound() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5923:2: ( ( (lv_constant_0_0= ruleconstant ) ) )
            // InternalPascal.g:5924:2: ( (lv_constant_0_0= ruleconstant ) )
            {
            // InternalPascal.g:5924:2: ( (lv_constant_0_0= ruleconstant ) )
            // InternalPascal.g:5925:3: (lv_constant_0_0= ruleconstant )
            {
            // InternalPascal.g:5925:3: (lv_constant_0_0= ruleconstant )
            // InternalPascal.g:5926:4: lv_constant_0_0= ruleconstant
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
    // InternalPascal.g:5946:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:5946:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:5947:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
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
    // InternalPascal.g:5953:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_declaration_1_0 = null;

        EObject lv_variable_declaration_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5959:2: ( (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:5960:2: (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:5960:2: (otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )* )
            // InternalPascal.g:5961:3: otherlv_0= 'var' ( (lv_variable_declaration_1_0= rulevariable_declaration ) ) otherlv_2= ';' ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:5965:3: ( (lv_variable_declaration_1_0= rulevariable_declaration ) )
            // InternalPascal.g:5966:4: (lv_variable_declaration_1_0= rulevariable_declaration )
            {
            // InternalPascal.g:5966:4: (lv_variable_declaration_1_0= rulevariable_declaration )
            // InternalPascal.g:5967:5: lv_variable_declaration_1_0= rulevariable_declaration
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
            // InternalPascal.g:5988:3: ( ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';' )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalPascal.g:5989:4: ( (lv_variable_declaration_3_0= rulevariable_declaration ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:5989:4: ( (lv_variable_declaration_3_0= rulevariable_declaration ) )
            	    // InternalPascal.g:5990:5: (lv_variable_declaration_3_0= rulevariable_declaration )
            	    {
            	    // InternalPascal.g:5990:5: (lv_variable_declaration_3_0= rulevariable_declaration )
            	    // InternalPascal.g:5991:6: lv_variable_declaration_3_0= rulevariable_declaration
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
    // InternalPascal.g:6017:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // InternalPascal.g:6017:61: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // InternalPascal.g:6018:2: iv_rulevariable_declaration= rulevariable_declaration EOF
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
    // InternalPascal.g:6024:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6030:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:6031:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:6031:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:6032:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:6032:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:6033:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:6033:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:6034:5: lv_identifier_list_0_0= ruleidentifier_list
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
            // InternalPascal.g:6055:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:6056:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:6056:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:6057:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:6078:1: entryRulefunction_identification returns [EObject current=null] : iv_rulefunction_identification= rulefunction_identification EOF ;
    public final EObject entryRulefunction_identification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_identification = null;


        try {
            // InternalPascal.g:6078:64: (iv_rulefunction_identification= rulefunction_identification EOF )
            // InternalPascal.g:6079:2: iv_rulefunction_identification= rulefunction_identification EOF
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
    // InternalPascal.g:6085:1: rulefunction_identification returns [EObject current=null] : (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject rulefunction_identification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_function_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6091:2: ( (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:6092:2: (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:6092:2: (otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) ) )
            // InternalPascal.g:6093:3: otherlv_0= 'function' ( (lv_function_identifier_1_0= ruleidentifier ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_identificationAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:6097:3: ( (lv_function_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6098:4: (lv_function_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6098:4: (lv_function_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6099:5: lv_function_identifier_1_0= ruleidentifier
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
    // InternalPascal.g:6120:1: entryRulefunction_body returns [EObject current=null] : iv_rulefunction_body= rulefunction_body EOF ;
    public final EObject entryRulefunction_body() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_body = null;


        try {
            // InternalPascal.g:6120:54: (iv_rulefunction_body= rulefunction_body EOF )
            // InternalPascal.g:6121:2: iv_rulefunction_body= rulefunction_body EOF
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
    // InternalPascal.g:6127:1: rulefunction_body returns [EObject current=null] : ( (lv_block_0_0= ruleblock ) ) ;
    public final EObject rulefunction_body() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6133:2: ( ( (lv_block_0_0= ruleblock ) ) )
            // InternalPascal.g:6134:2: ( (lv_block_0_0= ruleblock ) )
            {
            // InternalPascal.g:6134:2: ( (lv_block_0_0= ruleblock ) )
            // InternalPascal.g:6135:3: (lv_block_0_0= ruleblock )
            {
            // InternalPascal.g:6135:3: (lv_block_0_0= ruleblock )
            // InternalPascal.g:6136:4: lv_block_0_0= ruleblock
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
    // InternalPascal.g:6156:1: entryRuleprocedure_identification returns [EObject current=null] : iv_ruleprocedure_identification= ruleprocedure_identification EOF ;
    public final EObject entryRuleprocedure_identification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_identification = null;


        try {
            // InternalPascal.g:6156:65: (iv_ruleprocedure_identification= ruleprocedure_identification EOF )
            // InternalPascal.g:6157:2: iv_ruleprocedure_identification= ruleprocedure_identification EOF
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
    // InternalPascal.g:6163:1: ruleprocedure_identification returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ) ;
    public final EObject ruleprocedure_identification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6169:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ) )
            // InternalPascal.g:6170:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) )
            {
            // InternalPascal.g:6170:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) )
            // InternalPascal.g:6171:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_identificationAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:6175:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6176:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6176:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6177:5: lv_identifier_1_0= ruleidentifier
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
    // InternalPascal.g:6198:1: entryRuledirective returns [EObject current=null] : iv_ruledirective= ruledirective EOF ;
    public final EObject entryRuledirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledirective = null;


        try {
            // InternalPascal.g:6198:50: (iv_ruledirective= ruledirective EOF )
            // InternalPascal.g:6199:2: iv_ruledirective= ruledirective EOF
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
    // InternalPascal.g:6205:1: ruledirective returns [EObject current=null] : ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) ) ;
    public final EObject ruledirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_compiler_defined_directives_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6211:2: ( ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) ) )
            // InternalPascal.g:6212:2: ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) )
            {
            // InternalPascal.g:6212:2: ( ( () otherlv_1= 'forward' ) | ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==71) ) {
                alt70=1;
            }
            else if ( (LA70_0==70) ) {
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
                    // InternalPascal.g:6213:3: ( () otherlv_1= 'forward' )
                    {
                    // InternalPascal.g:6213:3: ( () otherlv_1= 'forward' )
                    // InternalPascal.g:6214:4: () otherlv_1= 'forward'
                    {
                    // InternalPascal.g:6214:4: ()
                    // InternalPascal.g:6215:5: 
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
                    // InternalPascal.g:6230:3: ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) )
                    {
                    // InternalPascal.g:6230:3: ( (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives ) )
                    // InternalPascal.g:6231:4: (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives )
                    {
                    // InternalPascal.g:6231:4: (lv_compiler_defined_directives_2_0= rulecompiler_defined_directives )
                    // InternalPascal.g:6232:5: lv_compiler_defined_directives_2_0= rulecompiler_defined_directives
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
    // InternalPascal.g:6253:1: entryRulecompiler_defined_directives returns [EObject current=null] : iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF ;
    public final EObject entryRulecompiler_defined_directives() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompiler_defined_directives = null;


        try {
            // InternalPascal.g:6253:68: (iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF )
            // InternalPascal.g:6254:2: iv_rulecompiler_defined_directives= rulecompiler_defined_directives EOF
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
    // InternalPascal.g:6260:1: rulecompiler_defined_directives returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject rulecompiler_defined_directives() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6266:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:6267:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:6267:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:6268:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:6268:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:6269:4: lv_procedure_heading_0_0= ruleprocedure_heading
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
    // InternalPascal.g:6289:1: entryRuleprocedure_body returns [EObject current=null] : iv_ruleprocedure_body= ruleprocedure_body EOF ;
    public final EObject entryRuleprocedure_body() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_body = null;


        try {
            // InternalPascal.g:6289:55: (iv_ruleprocedure_body= ruleprocedure_body EOF )
            // InternalPascal.g:6290:2: iv_ruleprocedure_body= ruleprocedure_body EOF
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
    // InternalPascal.g:6296:1: ruleprocedure_body returns [EObject current=null] : ( (lv_block_0_0= ruleblock ) ) ;
    public final EObject ruleprocedure_body() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6302:2: ( ( (lv_block_0_0= ruleblock ) ) )
            // InternalPascal.g:6303:2: ( (lv_block_0_0= ruleblock ) )
            {
            // InternalPascal.g:6303:2: ( (lv_block_0_0= ruleblock ) )
            // InternalPascal.g:6304:3: (lv_block_0_0= ruleblock )
            {
            // InternalPascal.g:6304:3: (lv_block_0_0= ruleblock )
            // InternalPascal.g:6305:4: lv_block_0_0= ruleblock
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
    // InternalPascal.g:6325:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:6325:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:6326:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
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
    // InternalPascal.g:6332:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formal_parameter_list_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6338:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:6339:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:6339:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:6340:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:6344:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6345:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6345:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6346:5: lv_identifier_1_0= ruleidentifier
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

            // InternalPascal.g:6363:3: ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==13) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalPascal.g:6364:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:6364:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:6365:5: lv_formal_parameter_list_2_0= ruleformal_parameter_list
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
    // InternalPascal.g:6386:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:6386:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:6387:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
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
    // InternalPascal.g:6393:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formal_parameter_section_1_0 = null;

        EObject lv_formal_parameter_section_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6399:2: ( (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:6400:2: (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:6400:2: (otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:6401:3: otherlv_0= '(' ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:6405:3: ( (lv_formal_parameter_section_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:6406:4: (lv_formal_parameter_section_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:6406:4: (lv_formal_parameter_section_1_0= ruleformal_parameter_section )
            // InternalPascal.g:6407:5: lv_formal_parameter_section_1_0= ruleformal_parameter_section
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

            // InternalPascal.g:6424:3: (otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==15) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalPascal.g:6425:4: otherlv_2= ';' ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:6429:4: ( (lv_formal_parameter_section_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:6430:5: (lv_formal_parameter_section_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:6430:5: (lv_formal_parameter_section_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:6431:6: lv_formal_parameter_section_3_0= ruleformal_parameter_section
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
            	    break loop72;
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
    // InternalPascal.g:6457:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:6457:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:6458:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
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
    // InternalPascal.g:6464:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_parameter_section_0_0 = null;

        EObject lv_variable_parameter_section_1_0 = null;

        EObject lv_procedure_parameter_section_2_0 = null;

        EObject lv_function_parameter_section_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6470:2: ( ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) ) )
            // InternalPascal.g:6471:2: ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) )
            {
            // InternalPascal.g:6471:2: ( ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) ) | ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt73=1;
                }
                break;
            case 68:
                {
                alt73=2;
                }
                break;
            case 70:
                {
                alt73=3;
                }
                break;
            case 69:
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
                    // InternalPascal.g:6472:3: ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:6472:3: ( (lv_value_parameter_section_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:6473:4: (lv_value_parameter_section_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:6473:4: (lv_value_parameter_section_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:6474:5: lv_value_parameter_section_0_0= rulevalue_parameter_section
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
                    // InternalPascal.g:6492:3: ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:6492:3: ( (lv_variable_parameter_section_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:6493:4: (lv_variable_parameter_section_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:6493:4: (lv_variable_parameter_section_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:6494:5: lv_variable_parameter_section_1_0= rulevariable_parameter_section
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
                    // InternalPascal.g:6512:3: ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) )
                    {
                    // InternalPascal.g:6512:3: ( (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section ) )
                    // InternalPascal.g:6513:4: (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section )
                    {
                    // InternalPascal.g:6513:4: (lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section )
                    // InternalPascal.g:6514:5: lv_procedure_parameter_section_2_0= ruleprocedure_parameter_section
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
                    // InternalPascal.g:6532:3: ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) )
                    {
                    // InternalPascal.g:6532:3: ( (lv_function_parameter_section_3_0= rulefunction_parameter_section ) )
                    // InternalPascal.g:6533:4: (lv_function_parameter_section_3_0= rulefunction_parameter_section )
                    {
                    // InternalPascal.g:6533:4: (lv_function_parameter_section_3_0= rulefunction_parameter_section )
                    // InternalPascal.g:6534:5: lv_function_parameter_section_3_0= rulefunction_parameter_section
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
    // InternalPascal.g:6555:1: entryRulefunction_parameter_section returns [EObject current=null] : iv_rulefunction_parameter_section= rulefunction_parameter_section EOF ;
    public final EObject entryRulefunction_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_parameter_section = null;


        try {
            // InternalPascal.g:6555:67: (iv_rulefunction_parameter_section= rulefunction_parameter_section EOF )
            // InternalPascal.g:6556:2: iv_rulefunction_parameter_section= rulefunction_parameter_section EOF
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
    // InternalPascal.g:6562:1: rulefunction_parameter_section returns [EObject current=null] : ( (lv_function_heading_0_0= rulefunction_heading ) ) ;
    public final EObject rulefunction_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_function_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6568:2: ( ( (lv_function_heading_0_0= rulefunction_heading ) ) )
            // InternalPascal.g:6569:2: ( (lv_function_heading_0_0= rulefunction_heading ) )
            {
            // InternalPascal.g:6569:2: ( (lv_function_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:6570:3: (lv_function_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:6570:3: (lv_function_heading_0_0= rulefunction_heading )
            // InternalPascal.g:6571:4: lv_function_heading_0_0= rulefunction_heading
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
    // InternalPascal.g:6591:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:6591:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:6592:2: iv_rulefunction_heading= rulefunction_heading EOF
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
    // InternalPascal.g:6598:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formal_parameter_list_2_0 = null;

        EObject lv_result_type_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6604:2: ( (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) ) )
            // InternalPascal.g:6605:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) )
            {
            // InternalPascal.g:6605:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) ) )
            // InternalPascal.g:6606:3: otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_result_type_4_0= ruleresult_type ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:6610:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:6611:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:6611:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:6612:5: lv_identifier_1_0= ruleidentifier
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

            // InternalPascal.g:6629:3: ( (lv_formal_parameter_list_2_0= ruleformal_parameter_list ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==13) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalPascal.g:6630:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:6630:4: (lv_formal_parameter_list_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:6631:5: lv_formal_parameter_list_2_0= ruleformal_parameter_list
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
            // InternalPascal.g:6652:3: ( (lv_result_type_4_0= ruleresult_type ) )
            // InternalPascal.g:6653:4: (lv_result_type_4_0= ruleresult_type )
            {
            // InternalPascal.g:6653:4: (lv_result_type_4_0= ruleresult_type )
            // InternalPascal.g:6654:5: lv_result_type_4_0= ruleresult_type
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
    // InternalPascal.g:6675:1: entryRuleresult_type returns [EObject current=null] : iv_ruleresult_type= ruleresult_type EOF ;
    public final EObject entryRuleresult_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresult_type = null;


        try {
            // InternalPascal.g:6675:52: (iv_ruleresult_type= ruleresult_type EOF )
            // InternalPascal.g:6676:2: iv_ruleresult_type= ruleresult_type EOF
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
    // InternalPascal.g:6682:1: ruleresult_type returns [EObject current=null] : ( (lv_type_identifier_0_0= ruletype_identifier ) ) ;
    public final EObject ruleresult_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6688:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) )
            // InternalPascal.g:6689:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            {
            // InternalPascal.g:6689:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            // InternalPascal.g:6690:3: (lv_type_identifier_0_0= ruletype_identifier )
            {
            // InternalPascal.g:6690:3: (lv_type_identifier_0_0= ruletype_identifier )
            // InternalPascal.g:6691:4: lv_type_identifier_0_0= ruletype_identifier
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
    // InternalPascal.g:6711:1: entryRuleprocedure_parameter_section returns [EObject current=null] : iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF ;
    public final EObject entryRuleprocedure_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_parameter_section = null;


        try {
            // InternalPascal.g:6711:68: (iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF )
            // InternalPascal.g:6712:2: iv_ruleprocedure_parameter_section= ruleprocedure_parameter_section EOF
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
    // InternalPascal.g:6718:1: ruleprocedure_parameter_section returns [EObject current=null] : ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) ;
    public final EObject ruleprocedure_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_procedure_heading_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6724:2: ( ( (lv_procedure_heading_0_0= ruleprocedure_heading ) ) )
            // InternalPascal.g:6725:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            {
            // InternalPascal.g:6725:2: ( (lv_procedure_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:6726:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:6726:3: (lv_procedure_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:6727:4: lv_procedure_heading_0_0= ruleprocedure_heading
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
    // InternalPascal.g:6747:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:6747:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:6748:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
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
    // InternalPascal.g:6754:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifier_list_1_0 = null;

        EObject lv_parameter_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6760:2: ( (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:6761:2: (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:6761:2: (otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:6762:3: otherlv_0= 'var' ( (lv_identifier_list_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_parameter_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:6766:3: ( (lv_identifier_list_1_0= ruleidentifier_list ) )
            // InternalPascal.g:6767:4: (lv_identifier_list_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:6767:4: (lv_identifier_list_1_0= ruleidentifier_list )
            // InternalPascal.g:6768:5: lv_identifier_list_1_0= ruleidentifier_list
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
            // InternalPascal.g:6789:3: ( (lv_parameter_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:6790:4: (lv_parameter_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:6790:4: (lv_parameter_type_3_0= ruleparameter_type )
            // InternalPascal.g:6791:5: lv_parameter_type_3_0= ruleparameter_type
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
    // InternalPascal.g:6812:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:6812:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:6813:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
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
    // InternalPascal.g:6819:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifier_list_0_0 = null;

        EObject lv_parameter_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6825:2: ( ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:6826:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:6826:2: ( ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:6827:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_parameter_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:6827:3: ( (lv_identifier_list_0_0= ruleidentifier_list ) )
            // InternalPascal.g:6828:4: (lv_identifier_list_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:6828:4: (lv_identifier_list_0_0= ruleidentifier_list )
            // InternalPascal.g:6829:5: lv_identifier_list_0_0= ruleidentifier_list
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
            // InternalPascal.g:6850:3: ( (lv_parameter_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:6851:4: (lv_parameter_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:6851:4: (lv_parameter_type_2_0= ruleparameter_type )
            // InternalPascal.g:6852:5: lv_parameter_type_2_0= ruleparameter_type
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
    // InternalPascal.g:6873:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:6873:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:6874:2: iv_ruleparameter_type= ruleparameter_type EOF
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
    // InternalPascal.g:6880:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;

        EObject lv_conformant_array_schema_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6886:2: ( ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:6887:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) )
            {
            // InternalPascal.g:6887:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==62||LA75_0==66) ) {
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
                    // InternalPascal.g:6888:3: ( (lv_type_identifier_0_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:6888:3: ( (lv_type_identifier_0_0= ruletype_identifier ) )
                    // InternalPascal.g:6889:4: (lv_type_identifier_0_0= ruletype_identifier )
                    {
                    // InternalPascal.g:6889:4: (lv_type_identifier_0_0= ruletype_identifier )
                    // InternalPascal.g:6890:5: lv_type_identifier_0_0= ruletype_identifier
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
                    // InternalPascal.g:6908:3: ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:6908:3: ( (lv_conformant_array_schema_1_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:6909:4: (lv_conformant_array_schema_1_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:6909:4: (lv_conformant_array_schema_1_0= ruleconformant_array_schema )
                    // InternalPascal.g:6910:5: lv_conformant_array_schema_1_0= ruleconformant_array_schema
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
    // InternalPascal.g:6931:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalPascal.g:6931:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalPascal.g:6932:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
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
    // InternalPascal.g:6938:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_conformant_array_schema_0_0 = null;

        EObject lv_unpacked_conformant_array_schema_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:6944:2: ( ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalPascal.g:6945:2: ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalPascal.g:6945:2: ( ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==62) ) {
                alt76=1;
            }
            else if ( (LA76_0==66) ) {
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
                    // InternalPascal.g:6946:3: ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:6946:3: ( (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema ) )
                    // InternalPascal.g:6947:4: (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalPascal.g:6947:4: (lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema )
                    // InternalPascal.g:6948:5: lv_packed_conformant_array_schema_0_0= rulepacked_conformant_array_schema
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
                    // InternalPascal.g:6966:3: ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:6966:3: ( (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalPascal.g:6967:4: (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalPascal.g:6967:4: (lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema )
                    // InternalPascal.g:6968:5: lv_unpacked_conformant_array_schema_1_0= ruleunpacked_conformant_array_schema
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
    // InternalPascal.g:6989:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:6989:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:6990:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
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
    // InternalPascal.g:6996:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) ) ;
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
            // InternalPascal.g:7002:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) ) )
            // InternalPascal.g:7003:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) )
            {
            // InternalPascal.g:7003:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:7004:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bound_specification_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPascal.g:7012:3: ( (lv_bound_specification_2_0= rulebound_specification ) )
            // InternalPascal.g:7013:4: (lv_bound_specification_2_0= rulebound_specification )
            {
            // InternalPascal.g:7013:4: (lv_bound_specification_2_0= rulebound_specification )
            // InternalPascal.g:7014:5: lv_bound_specification_2_0= rulebound_specification
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

            // InternalPascal.g:7031:3: (otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==15) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalPascal.g:7032:4: otherlv_3= ';' ( (lv_bound_specification_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	      			
            	    }
            	    // InternalPascal.g:7036:4: ( (lv_bound_specification_4_0= rulebound_specification ) )
            	    // InternalPascal.g:7037:5: (lv_bound_specification_4_0= rulebound_specification )
            	    {
            	    // InternalPascal.g:7037:5: (lv_bound_specification_4_0= rulebound_specification )
            	    // InternalPascal.g:7038:6: lv_bound_specification_4_0= rulebound_specification
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
            	    break loop77;
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
            // InternalPascal.g:7064:3: ( ( (lv_type_identifier_7_0= ruletype_identifier ) ) | ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==62||LA78_0==66) ) {
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
                    // InternalPascal.g:7065:4: ( (lv_type_identifier_7_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:7065:4: ( (lv_type_identifier_7_0= ruletype_identifier ) )
                    // InternalPascal.g:7066:5: (lv_type_identifier_7_0= ruletype_identifier )
                    {
                    // InternalPascal.g:7066:5: (lv_type_identifier_7_0= ruletype_identifier )
                    // InternalPascal.g:7067:6: lv_type_identifier_7_0= ruletype_identifier
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
                    // InternalPascal.g:7085:4: ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:7085:4: ( (lv_conformant_array_schema_8_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:7086:5: (lv_conformant_array_schema_8_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:7086:5: (lv_conformant_array_schema_8_0= ruleconformant_array_schema )
                    // InternalPascal.g:7087:6: lv_conformant_array_schema_8_0= ruleconformant_array_schema
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
    // InternalPascal.g:7109:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalPascal.g:7109:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalPascal.g:7110:2: iv_rulebound_specification= rulebound_specification EOF
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
    // InternalPascal.g:7116:1: rulebound_specification returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_identifier2_2_0 = null;

        EObject lv_ordinal_type_identifier_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7122:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) ) )
            // InternalPascal.g:7123:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) )
            {
            // InternalPascal.g:7123:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) ) )
            // InternalPascal.g:7124:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '..' ( (lv_identifier2_2_0= ruleidentifier ) ) otherlv_3= ':' ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) )
            {
            // InternalPascal.g:7124:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:7125:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:7125:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:7126:5: lv_identifier_0_0= ruleidentifier
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
            // InternalPascal.g:7147:3: ( (lv_identifier2_2_0= ruleidentifier ) )
            // InternalPascal.g:7148:4: (lv_identifier2_2_0= ruleidentifier )
            {
            // InternalPascal.g:7148:4: (lv_identifier2_2_0= ruleidentifier )
            // InternalPascal.g:7149:5: lv_identifier2_2_0= ruleidentifier
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
            // InternalPascal.g:7170:3: ( (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier ) )
            // InternalPascal.g:7171:4: (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier )
            {
            // InternalPascal.g:7171:4: (lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier )
            // InternalPascal.g:7172:5: lv_ordinal_type_identifier_4_0= ruleordinal_type_identifier
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
    // InternalPascal.g:7193:1: entryRuleordinal_type_identifier returns [EObject current=null] : iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF ;
    public final EObject entryRuleordinal_type_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleordinal_type_identifier = null;


        try {
            // InternalPascal.g:7193:64: (iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF )
            // InternalPascal.g:7194:2: iv_ruleordinal_type_identifier= ruleordinal_type_identifier EOF
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
    // InternalPascal.g:7200:1: ruleordinal_type_identifier returns [EObject current=null] : ( (lv_type_identifier_0_0= ruletype_identifier ) ) ;
    public final EObject ruleordinal_type_identifier() throws RecognitionException {
        EObject current = null;

        EObject lv_type_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7206:2: ( ( (lv_type_identifier_0_0= ruletype_identifier ) ) )
            // InternalPascal.g:7207:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            {
            // InternalPascal.g:7207:2: ( (lv_type_identifier_0_0= ruletype_identifier ) )
            // InternalPascal.g:7208:3: (lv_type_identifier_0_0= ruletype_identifier )
            {
            // InternalPascal.g:7208:3: (lv_type_identifier_0_0= ruletype_identifier )
            // InternalPascal.g:7209:4: lv_type_identifier_0_0= ruletype_identifier
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
    // InternalPascal.g:7229:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:7229:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:7230:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
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
    // InternalPascal.g:7236:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) ) ;
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
            // InternalPascal.g:7242:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:7243:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:7243:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) ) )
            // InternalPascal.g:7244:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_specification_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_type_identifier_6_0= ruletype_identifier ) )
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
            // InternalPascal.g:7256:3: ( (lv_bound_specification_3_0= rulebound_specification ) )
            // InternalPascal.g:7257:4: (lv_bound_specification_3_0= rulebound_specification )
            {
            // InternalPascal.g:7257:4: (lv_bound_specification_3_0= rulebound_specification )
            // InternalPascal.g:7258:5: lv_bound_specification_3_0= rulebound_specification
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
            // InternalPascal.g:7283:3: ( (lv_type_identifier_6_0= ruletype_identifier ) )
            // InternalPascal.g:7284:4: (lv_type_identifier_6_0= ruletype_identifier )
            {
            // InternalPascal.g:7284:4: (lv_type_identifier_6_0= ruletype_identifier )
            // InternalPascal.g:7285:5: lv_type_identifier_6_0= ruletype_identifier
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
    // InternalPascal.g:7306:1: entryRuleoutput_value returns [EObject current=null] : iv_ruleoutput_value= ruleoutput_value EOF ;
    public final EObject entryRuleoutput_value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoutput_value = null;


        try {
            // InternalPascal.g:7306:53: (iv_ruleoutput_value= ruleoutput_value EOF )
            // InternalPascal.g:7307:2: iv_ruleoutput_value= ruleoutput_value EOF
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
    // InternalPascal.g:7313:1: ruleoutput_value returns [EObject current=null] : (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? ) ;
    public final EObject ruleoutput_value() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_expression_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:7319:2: ( (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? ) )
            // InternalPascal.g:7320:2: (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? )
            {
            // InternalPascal.g:7320:2: (this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )? )
            // InternalPascal.g:7321:3: this_expression_0= ruleexpression (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )?
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
            // InternalPascal.g:7332:3: (otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==15) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalPascal.g:7333:4: otherlv_1= ';' ( (lv_expression_2_0= ruleexpression ) ) (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )?
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOutput_valueAccess().getSemicolonKeyword_1_0());
                      			
                    }
                    // InternalPascal.g:7337:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:7338:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:7338:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:7339:6: lv_expression_2_0= ruleexpression
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

                    // InternalPascal.g:7356:4: (otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==19) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalPascal.g:7357:5: otherlv_3= ':' ( (lv_expression_4_0= ruleexpression ) )
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getOutput_valueAccess().getColonKeyword_1_2_0());
                              				
                            }
                            // InternalPascal.g:7361:5: ( (lv_expression_4_0= ruleexpression ) )
                            // InternalPascal.g:7362:6: (lv_expression_4_0= ruleexpression )
                            {
                            // InternalPascal.g:7362:6: (lv_expression_4_0= ruleexpression )
                            // InternalPascal.g:7363:7: lv_expression_4_0= ruleexpression
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

    // $ANTLR start synpred10_InternalPascal
    public final void synpred10_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_actual_value_0_0 = null;


        // InternalPascal.g:826:3: ( ( (lv_actual_value_0_0= ruleactual_value ) ) )
        // InternalPascal.g:826:3: ( (lv_actual_value_0_0= ruleactual_value ) )
        {
        // InternalPascal.g:826:3: ( (lv_actual_value_0_0= ruleactual_value ) )
        // InternalPascal.g:827:4: (lv_actual_value_0_0= ruleactual_value )
        {
        // InternalPascal.g:827:4: (lv_actual_value_0_0= ruleactual_value )
        // InternalPascal.g:828:5: lv_actual_value_0_0= ruleactual_value
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
    // $ANTLR end synpred10_InternalPascal

    // $ANTLR start synpred11_InternalPascal
    public final void synpred11_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_actual_variable_1_0 = null;


        // InternalPascal.g:846:3: ( ( (lv_actual_variable_1_0= ruleactual_variable ) ) )
        // InternalPascal.g:846:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
        {
        // InternalPascal.g:846:3: ( (lv_actual_variable_1_0= ruleactual_variable ) )
        // InternalPascal.g:847:4: (lv_actual_variable_1_0= ruleactual_variable )
        {
        // InternalPascal.g:847:4: (lv_actual_variable_1_0= ruleactual_variable )
        // InternalPascal.g:848:5: lv_actual_variable_1_0= ruleactual_variable
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
    // $ANTLR end synpred11_InternalPascal

    // $ANTLR start synpred12_InternalPascal
    public final void synpred12_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_actual_procedure_2_0 = null;


        // InternalPascal.g:866:3: ( ( (lv_actual_procedure_2_0= ruleactual_procedure ) ) )
        // InternalPascal.g:866:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
        {
        // InternalPascal.g:866:3: ( (lv_actual_procedure_2_0= ruleactual_procedure ) )
        // InternalPascal.g:867:4: (lv_actual_procedure_2_0= ruleactual_procedure )
        {
        // InternalPascal.g:867:4: (lv_actual_procedure_2_0= ruleactual_procedure )
        // InternalPascal.g:868:5: lv_actual_procedure_2_0= ruleactual_procedure
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
    // $ANTLR end synpred12_InternalPascal

    // $ANTLR start synpred13_InternalPascal
    public final void synpred13_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_variable_0_0 = null;


        // InternalPascal.g:1104:4: ( ( (lv_variable_0_0= rulevariable ) ) )
        // InternalPascal.g:1104:4: ( (lv_variable_0_0= rulevariable ) )
        {
        // InternalPascal.g:1104:4: ( (lv_variable_0_0= rulevariable ) )
        // InternalPascal.g:1105:5: (lv_variable_0_0= rulevariable )
        {
        // InternalPascal.g:1105:5: (lv_variable_0_0= rulevariable )
        // InternalPascal.g:1106:6: lv_variable_0_0= rulevariable
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
    // $ANTLR end synpred13_InternalPascal

    // $ANTLR start synpred21_InternalPascal
    public final void synpred21_InternalPascal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sign_0_0 = null;


        // InternalPascal.g:1325:4: ( (lv_sign_0_0= rulesign ) )
        // InternalPascal.g:1325:4: (lv_sign_0_0= rulesign )
        {
        // InternalPascal.g:1325:4: (lv_sign_0_0= rulesign )
        // InternalPascal.g:1326:5: lv_sign_0_0= rulesign
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
    // $ANTLR end synpred21_InternalPascal

    // $ANTLR start synpred29_InternalPascal
    public final void synpred29_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_variable_1_0 = null;


        // InternalPascal.g:1573:3: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) )
        // InternalPascal.g:1573:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
        {
        // InternalPascal.g:1573:3: ( () ( (lv_variable_1_0= rulevariable ) ) )
        // InternalPascal.g:1574:4: () ( (lv_variable_1_0= rulevariable ) )
        {
        // InternalPascal.g:1574:4: ()
        // InternalPascal.g:1575:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalPascal.g:1584:4: ( (lv_variable_1_0= rulevariable ) )
        // InternalPascal.g:1585:5: (lv_variable_1_0= rulevariable )
        {
        // InternalPascal.g:1585:5: (lv_variable_1_0= rulevariable )
        // InternalPascal.g:1586:6: lv_variable_1_0= rulevariable
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
    // $ANTLR end synpred29_InternalPascal

    // $ANTLR start synpred34_InternalPascal
    public final void synpred34_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_identifier_6_0 = null;


        // InternalPascal.g:1670:3: ( ( (lv_identifier_6_0= ruleidentifier ) ) )
        // InternalPascal.g:1670:3: ( (lv_identifier_6_0= ruleidentifier ) )
        {
        // InternalPascal.g:1670:3: ( (lv_identifier_6_0= ruleidentifier ) )
        // InternalPascal.g:1671:4: (lv_identifier_6_0= ruleidentifier )
        {
        // InternalPascal.g:1671:4: (lv_identifier_6_0= ruleidentifier )
        // InternalPascal.g:1672:5: lv_identifier_6_0= ruleidentifier
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
    // $ANTLR end synpred34_InternalPascal

    // $ANTLR start synpred35_InternalPascal
    public final void synpred35_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_function_designator_7_0 = null;


        // InternalPascal.g:1690:3: ( ( (lv_function_designator_7_0= rulefunction_designator ) ) )
        // InternalPascal.g:1690:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
        {
        // InternalPascal.g:1690:3: ( (lv_function_designator_7_0= rulefunction_designator ) )
        // InternalPascal.g:1691:4: (lv_function_designator_7_0= rulefunction_designator )
        {
        // InternalPascal.g:1691:4: (lv_function_designator_7_0= rulefunction_designator )
        // InternalPascal.g:1692:5: lv_function_designator_7_0= rulefunction_designator
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
    // $ANTLR end synpred35_InternalPascal

    // $ANTLR start synpred43_InternalPascal
    public final void synpred43_InternalPascal_fragment() throws RecognitionException {   
        EObject lv_digit_sequence2_2_0 = null;


        // InternalPascal.g:2201:5: ( (lv_digit_sequence2_2_0= ruledigit_sequence ) )
        // InternalPascal.g:2201:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
        {
        // InternalPascal.g:2201:5: (lv_digit_sequence2_2_0= ruledigit_sequence )
        // InternalPascal.g:2202:6: lv_digit_sequence2_2_0= ruledigit_sequence
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
    // $ANTLR end synpred43_InternalPascal

    // $ANTLR start synpred47_InternalPascal
    public final void synpred47_InternalPascal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sign_2_0 = null;


        // InternalPascal.g:2311:4: ( (lv_sign_2_0= rulesign ) )
        // InternalPascal.g:2311:4: (lv_sign_2_0= rulesign )
        {
        // InternalPascal.g:2311:4: (lv_sign_2_0= rulesign )
        // InternalPascal.g:2312:5: lv_sign_2_0= rulesign
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
    // $ANTLR end synpred47_InternalPascal

    // $ANTLR start synpred50_InternalPascal
    public final void synpred50_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_6=null;

        // InternalPascal.g:2441:4: (otherlv_6= '^' )
        // InternalPascal.g:2441:4: otherlv_6= '^'
        {
        otherlv_6=(Token)match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalPascal

    // $ANTLR start synpred63_InternalPascal
    public final void synpred63_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_statement_5_0 = null;


        // InternalPascal.g:3270:4: (otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) ) )
        // InternalPascal.g:3270:4: otherlv_4= 'else' ( (lv_statement_5_0= rulestatement ) )
        {
        otherlv_4=(Token)match(input,52,FOLLOW_10); if (state.failed) return ;
        // InternalPascal.g:3274:4: ( (lv_statement_5_0= rulestatement ) )
        // InternalPascal.g:3275:5: (lv_statement_5_0= rulestatement )
        {
        // InternalPascal.g:3275:5: (lv_statement_5_0= rulestatement )
        // InternalPascal.g:3276:6: lv_statement_5_0= rulestatement
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
    // $ANTLR end synpred63_InternalPascal

    // $ANTLR start synpred71_InternalPascal
    public final void synpred71_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_procedure_heading_4_0 = null;

        EObject lv_procedure_body_6_0 = null;


        // InternalPascal.g:3835:5: ( ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) ) )
        // InternalPascal.g:3835:5: ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) )
        {
        // InternalPascal.g:3835:5: ( ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) ) )
        // InternalPascal.g:3836:6: ( (lv_procedure_heading_4_0= ruleprocedure_heading ) ) otherlv_5= ';' ( (lv_procedure_body_6_0= ruleprocedure_body ) )
        {
        // InternalPascal.g:3836:6: ( (lv_procedure_heading_4_0= ruleprocedure_heading ) )
        // InternalPascal.g:3837:7: (lv_procedure_heading_4_0= ruleprocedure_heading )
        {
        // InternalPascal.g:3837:7: (lv_procedure_heading_4_0= ruleprocedure_heading )
        // InternalPascal.g:3838:8: lv_procedure_heading_4_0= ruleprocedure_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_4_0_0_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_procedure_heading_4_0=ruleprocedure_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,15,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3859:6: ( (lv_procedure_body_6_0= ruleprocedure_body ) )
        // InternalPascal.g:3860:7: (lv_procedure_body_6_0= ruleprocedure_body )
        {
        // InternalPascal.g:3860:7: (lv_procedure_body_6_0= ruleprocedure_body )
        // InternalPascal.g:3861:8: lv_procedure_body_6_0= ruleprocedure_body
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_4_0_0_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_procedure_body_6_0=ruleprocedure_body();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred71_InternalPascal

    // $ANTLR start synpred72_InternalPascal
    public final void synpred72_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        EObject lv_procedure_heading_7_0 = null;

        EObject lv_directive_9_0 = null;


        // InternalPascal.g:3880:5: ( ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) ) )
        // InternalPascal.g:3880:5: ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) )
        {
        // InternalPascal.g:3880:5: ( ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) ) )
        // InternalPascal.g:3881:6: ( (lv_procedure_heading_7_0= ruleprocedure_heading ) ) otherlv_8= ';' ( (lv_directive_9_0= ruledirective ) )
        {
        // InternalPascal.g:3881:6: ( (lv_procedure_heading_7_0= ruleprocedure_heading ) )
        // InternalPascal.g:3882:7: (lv_procedure_heading_7_0= ruleprocedure_heading )
        {
        // InternalPascal.g:3882:7: (lv_procedure_heading_7_0= ruleprocedure_heading )
        // InternalPascal.g:3883:8: lv_procedure_heading_7_0= ruleprocedure_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_headingProcedure_headingParserRuleCall_4_0_1_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_procedure_heading_7_0=ruleprocedure_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,15,FOLLOW_45); if (state.failed) return ;
        // InternalPascal.g:3904:6: ( (lv_directive_9_0= ruledirective ) )
        // InternalPascal.g:3905:7: (lv_directive_9_0= ruledirective )
        {
        // InternalPascal.g:3905:7: (lv_directive_9_0= ruledirective )
        // InternalPascal.g:3906:8: lv_directive_9_0= ruledirective
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_4_0_1_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_directive_9_0=ruledirective();

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
        Token otherlv_11=null;
        EObject lv_procedure_identification_10_0 = null;

        EObject lv_procedure_body_12_0 = null;


        // InternalPascal.g:3925:5: ( ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) ) )
        // InternalPascal.g:3925:5: ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) )
        {
        // InternalPascal.g:3925:5: ( ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) ) )
        // InternalPascal.g:3926:6: ( (lv_procedure_identification_10_0= ruleprocedure_identification ) ) otherlv_11= ';' ( (lv_procedure_body_12_0= ruleprocedure_body ) )
        {
        // InternalPascal.g:3926:6: ( (lv_procedure_identification_10_0= ruleprocedure_identification ) )
        // InternalPascal.g:3927:7: (lv_procedure_identification_10_0= ruleprocedure_identification )
        {
        // InternalPascal.g:3927:7: (lv_procedure_identification_10_0= ruleprocedure_identification )
        // InternalPascal.g:3928:8: lv_procedure_identification_10_0= ruleprocedure_identification
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_identificationProcedure_identificationParserRuleCall_4_0_2_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_procedure_identification_10_0=ruleprocedure_identification();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,15,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3949:6: ( (lv_procedure_body_12_0= ruleprocedure_body ) )
        // InternalPascal.g:3950:7: (lv_procedure_body_12_0= ruleprocedure_body )
        {
        // InternalPascal.g:3950:7: (lv_procedure_body_12_0= ruleprocedure_body )
        // InternalPascal.g:3951:8: lv_procedure_body_12_0= ruleprocedure_body
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getProcedure_bodyProcedure_bodyParserRuleCall_4_0_2_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_procedure_body_12_0=ruleprocedure_body();

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
        Token otherlv_14=null;
        EObject lv_function_heading_13_0 = null;

        EObject lv_function_body_15_0 = null;


        // InternalPascal.g:3970:5: ( ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) ) )
        // InternalPascal.g:3970:5: ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) )
        {
        // InternalPascal.g:3970:5: ( ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) ) )
        // InternalPascal.g:3971:6: ( (lv_function_heading_13_0= rulefunction_heading ) ) otherlv_14= ';' ( (lv_function_body_15_0= rulefunction_body ) )
        {
        // InternalPascal.g:3971:6: ( (lv_function_heading_13_0= rulefunction_heading ) )
        // InternalPascal.g:3972:7: (lv_function_heading_13_0= rulefunction_heading )
        {
        // InternalPascal.g:3972:7: (lv_function_heading_13_0= rulefunction_heading )
        // InternalPascal.g:3973:8: lv_function_heading_13_0= rulefunction_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_4_0_3_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_function_heading_13_0=rulefunction_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_14=(Token)match(input,15,FOLLOW_3); if (state.failed) return ;
        // InternalPascal.g:3994:6: ( (lv_function_body_15_0= rulefunction_body ) )
        // InternalPascal.g:3995:7: (lv_function_body_15_0= rulefunction_body )
        {
        // InternalPascal.g:3995:7: (lv_function_body_15_0= rulefunction_body )
        // InternalPascal.g:3996:8: lv_function_body_15_0= rulefunction_body
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_bodyFunction_bodyParserRuleCall_4_0_3_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_function_body_15_0=rulefunction_body();

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
        Token otherlv_17=null;
        EObject lv_function_heading_16_0 = null;

        EObject lv_directive_18_0 = null;


        // InternalPascal.g:4015:5: ( ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) ) )
        // InternalPascal.g:4015:5: ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) )
        {
        // InternalPascal.g:4015:5: ( ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) ) )
        // InternalPascal.g:4016:6: ( (lv_function_heading_16_0= rulefunction_heading ) ) otherlv_17= ';' ( (lv_directive_18_0= ruledirective ) )
        {
        // InternalPascal.g:4016:6: ( (lv_function_heading_16_0= rulefunction_heading ) )
        // InternalPascal.g:4017:7: (lv_function_heading_16_0= rulefunction_heading )
        {
        // InternalPascal.g:4017:7: (lv_function_heading_16_0= rulefunction_heading )
        // InternalPascal.g:4018:8: lv_function_heading_16_0= rulefunction_heading
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getFunction_headingFunction_headingParserRuleCall_4_0_4_0_0());
          							
        }
        pushFollow(FOLLOW_8);
        lv_function_heading_16_0=rulefunction_heading();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_17=(Token)match(input,15,FOLLOW_45); if (state.failed) return ;
        // InternalPascal.g:4039:6: ( (lv_directive_18_0= ruledirective ) )
        // InternalPascal.g:4040:7: (lv_directive_18_0= ruledirective )
        {
        // InternalPascal.g:4040:7: (lv_directive_18_0= ruledirective )
        // InternalPascal.g:4041:8: lv_directive_18_0= ruledirective
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDeclaration_partAccess().getDirectiveDirectiveParserRuleCall_4_0_4_2_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_directive_18_0=ruledirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred75_InternalPascal

    // $ANTLR start synpred79_InternalPascal
    public final void synpred79_InternalPascal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sign_0_0 = null;


        // InternalPascal.g:4334:5: ( (lv_sign_0_0= rulesign ) )
        // InternalPascal.g:4334:5: (lv_sign_0_0= rulesign )
        {
        // InternalPascal.g:4334:5: (lv_sign_0_0= rulesign )
        // InternalPascal.g:4335:6: lv_sign_0_0= rulesign
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
    // $ANTLR end synpred79_InternalPascal

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
    public final boolean synpred71_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalPascal_fragment(); // can never throw exception
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
    public final boolean synpred34_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalPascal_fragment(); // can never throw exception
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
    public final boolean synpred21_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalPascal_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalPascal_fragment(); // can never throw exception
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


    protected DFA17 dfa17 = new DFA17(this);
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1572:2: ( ( () ( (lv_variable_1_0= rulevariable ) ) ) | ( (lv_number_2_0= rulenumber ) ) | ( (lv_strings_3_0= rulestrings ) ) | ( (lv_set_4_0= ruleset ) ) | otherlv_5= 'nil' | ( (lv_identifier_6_0= ruleidentifier ) ) | ( (lv_function_designator_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_factor_12_0= rulefactor ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalPascal()) ) {s = 8;}

                        else if ( (synpred34_InternalPascal()) ) {s = 9;}

                        else if ( (synpred35_InternalPascal()) ) {s = 10;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
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