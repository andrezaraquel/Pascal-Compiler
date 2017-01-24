package org.xtext.example.pascal.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'()'", "':'", "'return'", "';'", "'('", "')'", "'procedure'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBegin"
    // InternalPascal.g:53:1: entryRuleBegin : ruleBegin EOF ;
    public final void entryRuleBegin() throws RecognitionException {
        try {
            // InternalPascal.g:54:1: ( ruleBegin EOF )
            // InternalPascal.g:55:1: ruleBegin EOF
            {
             before(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getBeginRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalPascal.g:62:1: ruleBegin : ( ( rule__Begin__Alternatives ) ) ;
    public final void ruleBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:66:2: ( ( ( rule__Begin__Alternatives ) ) )
            // InternalPascal.g:67:2: ( ( rule__Begin__Alternatives ) )
            {
            // InternalPascal.g:67:2: ( ( rule__Begin__Alternatives ) )
            // InternalPascal.g:68:3: ( rule__Begin__Alternatives )
            {
             before(grammarAccess.getBeginAccess().getAlternatives()); 
            // InternalPascal.g:69:3: ( rule__Begin__Alternatives )
            // InternalPascal.g:69:4: rule__Begin__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBeginAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleFunction"
    // InternalPascal.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( ruleFunction EOF )
            // InternalPascal.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalPascal.g:87:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Function__Alternatives ) ) )
            // InternalPascal.g:92:2: ( ( rule__Function__Alternatives ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Function__Alternatives ) )
            // InternalPascal.g:93:3: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // InternalPascal.g:94:3: ( rule__Function__Alternatives )
            // InternalPascal.g:94:4: rule__Function__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Function__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleProcedure"
    // InternalPascal.g:103:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( ruleProcedure EOF )
            // InternalPascal.g:105:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalPascal.g:112:1: ruleProcedure : ( ( rule__Procedure__Alternatives ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Procedure__Alternatives ) ) )
            // InternalPascal.g:117:2: ( ( rule__Procedure__Alternatives ) )
            {
            // InternalPascal.g:117:2: ( ( rule__Procedure__Alternatives ) )
            // InternalPascal.g:118:3: ( rule__Procedure__Alternatives )
            {
             before(grammarAccess.getProcedureAccess().getAlternatives()); 
            // InternalPascal.g:119:3: ( rule__Procedure__Alternatives )
            // InternalPascal.g:119:4: rule__Procedure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleType"
    // InternalPascal.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( ruleType EOF )
            // InternalPascal.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPascal.g:137:1: ruleType : ( RULE_INT ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( RULE_INT ) )
            // InternalPascal.g:142:2: ( RULE_INT )
            {
            // InternalPascal.g:142:2: ( RULE_INT )
            // InternalPascal.g:143:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Begin__Alternatives"
    // InternalPascal.g:152:1: rule__Begin__Alternatives : ( ( ruleFunction ) | ( ruleProcedure ) );
    public final void rule__Begin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:156:1: ( ( ruleFunction ) | ( ruleProcedure ) )
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
                    // InternalPascal.g:157:2: ( ruleFunction )
                    {
                    // InternalPascal.g:157:2: ( ruleFunction )
                    // InternalPascal.g:158:3: ruleFunction
                    {
                     before(grammarAccess.getBeginAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getBeginAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:163:2: ( ruleProcedure )
                    {
                    // InternalPascal.g:163:2: ( ruleProcedure )
                    // InternalPascal.g:164:3: ruleProcedure
                    {
                     before(grammarAccess.getBeginAccess().getProcedureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProcedure();

                    state._fsp--;

                     after(grammarAccess.getBeginAccess().getProcedureParserRuleCall_1()); 

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
    // $ANTLR end "rule__Begin__Alternatives"


    // $ANTLR start "rule__Function__Alternatives"
    // InternalPascal.g:173:1: rule__Function__Alternatives : ( ( ( rule__Function__Group_0__0 ) ) | ( ( rule__Function__Group_1__0 ) ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:177:1: ( ( ( rule__Function__Group_0__0 ) ) | ( ( rule__Function__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==12) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==16) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:178:2: ( ( rule__Function__Group_0__0 ) )
                    {
                    // InternalPascal.g:178:2: ( ( rule__Function__Group_0__0 ) )
                    // InternalPascal.g:179:3: ( rule__Function__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionAccess().getGroup_0()); 
                    // InternalPascal.g:180:3: ( rule__Function__Group_0__0 )
                    // InternalPascal.g:180:4: rule__Function__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:184:2: ( ( rule__Function__Group_1__0 ) )
                    {
                    // InternalPascal.g:184:2: ( ( rule__Function__Group_1__0 ) )
                    // InternalPascal.g:185:3: ( rule__Function__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionAccess().getGroup_1()); 
                    // InternalPascal.g:186:3: ( rule__Function__Group_1__0 )
                    // InternalPascal.g:186:4: rule__Function__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Function__Alternatives"


    // $ANTLR start "rule__Procedure__Alternatives"
    // InternalPascal.g:194:1: rule__Procedure__Alternatives : ( ( ( rule__Procedure__Group_0__0 ) ) | ( ( rule__Procedure__Group_1__0 ) ) );
    public final void rule__Procedure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:198:1: ( ( ( rule__Procedure__Group_0__0 ) ) | ( ( rule__Procedure__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==16) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==12) ) {
                        alt3=1;
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
                    // InternalPascal.g:199:2: ( ( rule__Procedure__Group_0__0 ) )
                    {
                    // InternalPascal.g:199:2: ( ( rule__Procedure__Group_0__0 ) )
                    // InternalPascal.g:200:3: ( rule__Procedure__Group_0__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_0()); 
                    // InternalPascal.g:201:3: ( rule__Procedure__Group_0__0 )
                    // InternalPascal.g:201:4: rule__Procedure__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:205:2: ( ( rule__Procedure__Group_1__0 ) )
                    {
                    // InternalPascal.g:205:2: ( ( rule__Procedure__Group_1__0 ) )
                    // InternalPascal.g:206:3: ( rule__Procedure__Group_1__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_1()); 
                    // InternalPascal.g:207:3: ( rule__Procedure__Group_1__0 )
                    // InternalPascal.g:207:4: rule__Procedure__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Procedure__Alternatives"


    // $ANTLR start "rule__Function__Group_0__0"
    // InternalPascal.g:215:1: rule__Function__Group_0__0 : rule__Function__Group_0__0__Impl rule__Function__Group_0__1 ;
    public final void rule__Function__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:219:1: ( rule__Function__Group_0__0__Impl rule__Function__Group_0__1 )
            // InternalPascal.g:220:2: rule__Function__Group_0__0__Impl rule__Function__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_0__1();

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
    // $ANTLR end "rule__Function__Group_0__0"


    // $ANTLR start "rule__Function__Group_0__0__Impl"
    // InternalPascal.g:227:1: rule__Function__Group_0__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:231:1: ( ( 'function' ) )
            // InternalPascal.g:232:1: ( 'function' )
            {
            // InternalPascal.g:232:1: ( 'function' )
            // InternalPascal.g:233:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0_0()); 

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
    // $ANTLR end "rule__Function__Group_0__0__Impl"


    // $ANTLR start "rule__Function__Group_0__1"
    // InternalPascal.g:242:1: rule__Function__Group_0__1 : rule__Function__Group_0__1__Impl rule__Function__Group_0__2 ;
    public final void rule__Function__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:246:1: ( rule__Function__Group_0__1__Impl rule__Function__Group_0__2 )
            // InternalPascal.g:247:2: rule__Function__Group_0__1__Impl rule__Function__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_0__2();

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
    // $ANTLR end "rule__Function__Group_0__1"


    // $ANTLR start "rule__Function__Group_0__1__Impl"
    // InternalPascal.g:254:1: rule__Function__Group_0__1__Impl : ( ( rule__Function__NameAssignment_0_1 ) ) ;
    public final void rule__Function__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:258:1: ( ( ( rule__Function__NameAssignment_0_1 ) ) )
            // InternalPascal.g:259:1: ( ( rule__Function__NameAssignment_0_1 ) )
            {
            // InternalPascal.g:259:1: ( ( rule__Function__NameAssignment_0_1 ) )
            // InternalPascal.g:260:2: ( rule__Function__NameAssignment_0_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0_1()); 
            // InternalPascal.g:261:2: ( rule__Function__NameAssignment_0_1 )
            // InternalPascal.g:261:3: rule__Function__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Function__Group_0__1__Impl"


    // $ANTLR start "rule__Function__Group_0__2"
    // InternalPascal.g:269:1: rule__Function__Group_0__2 : rule__Function__Group_0__2__Impl rule__Function__Group_0__3 ;
    public final void rule__Function__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:273:1: ( rule__Function__Group_0__2__Impl rule__Function__Group_0__3 )
            // InternalPascal.g:274:2: rule__Function__Group_0__2__Impl rule__Function__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_0__3();

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
    // $ANTLR end "rule__Function__Group_0__2"


    // $ANTLR start "rule__Function__Group_0__2__Impl"
    // InternalPascal.g:281:1: rule__Function__Group_0__2__Impl : ( '()' ) ;
    public final void rule__Function__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:285:1: ( ( '()' ) )
            // InternalPascal.g:286:1: ( '()' )
            {
            // InternalPascal.g:286:1: ( '()' )
            // InternalPascal.g:287:2: '()'
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Function__Group_0__2__Impl"


    // $ANTLR start "rule__Function__Group_0__3"
    // InternalPascal.g:296:1: rule__Function__Group_0__3 : rule__Function__Group_0__3__Impl rule__Function__Group_0__4 ;
    public final void rule__Function__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:300:1: ( rule__Function__Group_0__3__Impl rule__Function__Group_0__4 )
            // InternalPascal.g:301:2: rule__Function__Group_0__3__Impl rule__Function__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_0__4();

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
    // $ANTLR end "rule__Function__Group_0__3"


    // $ANTLR start "rule__Function__Group_0__3__Impl"
    // InternalPascal.g:308:1: rule__Function__Group_0__3__Impl : ( ':' ) ;
    public final void rule__Function__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:312:1: ( ( ':' ) )
            // InternalPascal.g:313:1: ( ':' )
            {
            // InternalPascal.g:313:1: ( ':' )
            // InternalPascal.g:314:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_0_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_0_3()); 

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
    // $ANTLR end "rule__Function__Group_0__3__Impl"


    // $ANTLR start "rule__Function__Group_0__4"
    // InternalPascal.g:323:1: rule__Function__Group_0__4 : rule__Function__Group_0__4__Impl rule__Function__Group_0__5 ;
    public final void rule__Function__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:327:1: ( rule__Function__Group_0__4__Impl rule__Function__Group_0__5 )
            // InternalPascal.g:328:2: rule__Function__Group_0__4__Impl rule__Function__Group_0__5
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_0__5();

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
    // $ANTLR end "rule__Function__Group_0__4"


    // $ANTLR start "rule__Function__Group_0__4__Impl"
    // InternalPascal.g:335:1: rule__Function__Group_0__4__Impl : ( 'return' ) ;
    public final void rule__Function__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:339:1: ( ( 'return' ) )
            // InternalPascal.g:340:1: ( 'return' )
            {
            // InternalPascal.g:340:1: ( 'return' )
            // InternalPascal.g:341:2: 'return'
            {
             before(grammarAccess.getFunctionAccess().getReturnKeyword_0_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getReturnKeyword_0_4()); 

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
    // $ANTLR end "rule__Function__Group_0__4__Impl"


    // $ANTLR start "rule__Function__Group_0__5"
    // InternalPascal.g:350:1: rule__Function__Group_0__5 : rule__Function__Group_0__5__Impl rule__Function__Group_0__6 ;
    public final void rule__Function__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:354:1: ( rule__Function__Group_0__5__Impl rule__Function__Group_0__6 )
            // InternalPascal.g:355:2: rule__Function__Group_0__5__Impl rule__Function__Group_0__6
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_0__6();

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
    // $ANTLR end "rule__Function__Group_0__5"


    // $ANTLR start "rule__Function__Group_0__5__Impl"
    // InternalPascal.g:362:1: rule__Function__Group_0__5__Impl : ( ( rule__Function__NameAssignment_0_5 ) ) ;
    public final void rule__Function__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:1: ( ( ( rule__Function__NameAssignment_0_5 ) ) )
            // InternalPascal.g:367:1: ( ( rule__Function__NameAssignment_0_5 ) )
            {
            // InternalPascal.g:367:1: ( ( rule__Function__NameAssignment_0_5 ) )
            // InternalPascal.g:368:2: ( rule__Function__NameAssignment_0_5 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0_5()); 
            // InternalPascal.g:369:2: ( rule__Function__NameAssignment_0_5 )
            // InternalPascal.g:369:3: rule__Function__NameAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_0_5()); 

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
    // $ANTLR end "rule__Function__Group_0__5__Impl"


    // $ANTLR start "rule__Function__Group_0__6"
    // InternalPascal.g:377:1: rule__Function__Group_0__6 : rule__Function__Group_0__6__Impl ;
    public final void rule__Function__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:381:1: ( rule__Function__Group_0__6__Impl )
            // InternalPascal.g:382:2: rule__Function__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_0__6__Impl();

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
    // $ANTLR end "rule__Function__Group_0__6"


    // $ANTLR start "rule__Function__Group_0__6__Impl"
    // InternalPascal.g:388:1: rule__Function__Group_0__6__Impl : ( ';' ) ;
    public final void rule__Function__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:392:1: ( ( ';' ) )
            // InternalPascal.g:393:1: ( ';' )
            {
            // InternalPascal.g:393:1: ( ';' )
            // InternalPascal.g:394:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_0_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSemicolonKeyword_0_6()); 

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
    // $ANTLR end "rule__Function__Group_0__6__Impl"


    // $ANTLR start "rule__Function__Group_1__0"
    // InternalPascal.g:404:1: rule__Function__Group_1__0 : rule__Function__Group_1__0__Impl rule__Function__Group_1__1 ;
    public final void rule__Function__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:408:1: ( rule__Function__Group_1__0__Impl rule__Function__Group_1__1 )
            // InternalPascal.g:409:2: rule__Function__Group_1__0__Impl rule__Function__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1();

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
    // $ANTLR end "rule__Function__Group_1__0"


    // $ANTLR start "rule__Function__Group_1__0__Impl"
    // InternalPascal.g:416:1: rule__Function__Group_1__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:420:1: ( ( 'function' ) )
            // InternalPascal.g:421:1: ( 'function' )
            {
            // InternalPascal.g:421:1: ( 'function' )
            // InternalPascal.g:422:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_1_0()); 

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
    // $ANTLR end "rule__Function__Group_1__0__Impl"


    // $ANTLR start "rule__Function__Group_1__1"
    // InternalPascal.g:431:1: rule__Function__Group_1__1 : rule__Function__Group_1__1__Impl rule__Function__Group_1__2 ;
    public final void rule__Function__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:435:1: ( rule__Function__Group_1__1__Impl rule__Function__Group_1__2 )
            // InternalPascal.g:436:2: rule__Function__Group_1__1__Impl rule__Function__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__2();

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
    // $ANTLR end "rule__Function__Group_1__1"


    // $ANTLR start "rule__Function__Group_1__1__Impl"
    // InternalPascal.g:443:1: rule__Function__Group_1__1__Impl : ( ( rule__Function__NameAssignment_1_1 ) ) ;
    public final void rule__Function__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:447:1: ( ( ( rule__Function__NameAssignment_1_1 ) ) )
            // InternalPascal.g:448:1: ( ( rule__Function__NameAssignment_1_1 ) )
            {
            // InternalPascal.g:448:1: ( ( rule__Function__NameAssignment_1_1 ) )
            // InternalPascal.g:449:2: ( rule__Function__NameAssignment_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1_1()); 
            // InternalPascal.g:450:2: ( rule__Function__NameAssignment_1_1 )
            // InternalPascal.g:450:3: rule__Function__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Function__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group_1__2"
    // InternalPascal.g:458:1: rule__Function__Group_1__2 : rule__Function__Group_1__2__Impl rule__Function__Group_1__3 ;
    public final void rule__Function__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:462:1: ( rule__Function__Group_1__2__Impl rule__Function__Group_1__3 )
            // InternalPascal.g:463:2: rule__Function__Group_1__2__Impl rule__Function__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__3();

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
    // $ANTLR end "rule__Function__Group_1__2"


    // $ANTLR start "rule__Function__Group_1__2__Impl"
    // InternalPascal.g:470:1: rule__Function__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Function__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:474:1: ( ( '(' ) )
            // InternalPascal.g:475:1: ( '(' )
            {
            // InternalPascal.g:475:1: ( '(' )
            // InternalPascal.g:476:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Function__Group_1__2__Impl"


    // $ANTLR start "rule__Function__Group_1__3"
    // InternalPascal.g:485:1: rule__Function__Group_1__3 : rule__Function__Group_1__3__Impl rule__Function__Group_1__4 ;
    public final void rule__Function__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:489:1: ( rule__Function__Group_1__3__Impl rule__Function__Group_1__4 )
            // InternalPascal.g:490:2: rule__Function__Group_1__3__Impl rule__Function__Group_1__4
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__4();

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
    // $ANTLR end "rule__Function__Group_1__3"


    // $ANTLR start "rule__Function__Group_1__3__Impl"
    // InternalPascal.g:497:1: rule__Function__Group_1__3__Impl : ( ( rule__Function__NameAssignment_1_3 ) ) ;
    public final void rule__Function__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:501:1: ( ( ( rule__Function__NameAssignment_1_3 ) ) )
            // InternalPascal.g:502:1: ( ( rule__Function__NameAssignment_1_3 ) )
            {
            // InternalPascal.g:502:1: ( ( rule__Function__NameAssignment_1_3 ) )
            // InternalPascal.g:503:2: ( rule__Function__NameAssignment_1_3 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1_3()); 
            // InternalPascal.g:504:2: ( rule__Function__NameAssignment_1_3 )
            // InternalPascal.g:504:3: rule__Function__NameAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1_3()); 

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
    // $ANTLR end "rule__Function__Group_1__3__Impl"


    // $ANTLR start "rule__Function__Group_1__4"
    // InternalPascal.g:512:1: rule__Function__Group_1__4 : rule__Function__Group_1__4__Impl rule__Function__Group_1__5 ;
    public final void rule__Function__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:516:1: ( rule__Function__Group_1__4__Impl rule__Function__Group_1__5 )
            // InternalPascal.g:517:2: rule__Function__Group_1__4__Impl rule__Function__Group_1__5
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__5();

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
    // $ANTLR end "rule__Function__Group_1__4"


    // $ANTLR start "rule__Function__Group_1__4__Impl"
    // InternalPascal.g:524:1: rule__Function__Group_1__4__Impl : ( ':' ) ;
    public final void rule__Function__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:528:1: ( ( ':' ) )
            // InternalPascal.g:529:1: ( ':' )
            {
            // InternalPascal.g:529:1: ( ':' )
            // InternalPascal.g:530:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_1_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_1_4()); 

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
    // $ANTLR end "rule__Function__Group_1__4__Impl"


    // $ANTLR start "rule__Function__Group_1__5"
    // InternalPascal.g:539:1: rule__Function__Group_1__5 : rule__Function__Group_1__5__Impl rule__Function__Group_1__6 ;
    public final void rule__Function__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:543:1: ( rule__Function__Group_1__5__Impl rule__Function__Group_1__6 )
            // InternalPascal.g:544:2: rule__Function__Group_1__5__Impl rule__Function__Group_1__6
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__6();

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
    // $ANTLR end "rule__Function__Group_1__5"


    // $ANTLR start "rule__Function__Group_1__5__Impl"
    // InternalPascal.g:551:1: rule__Function__Group_1__5__Impl : ( ruleType ) ;
    public final void rule__Function__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:555:1: ( ( ruleType ) )
            // InternalPascal.g:556:1: ( ruleType )
            {
            // InternalPascal.g:556:1: ( ruleType )
            // InternalPascal.g:557:2: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypeParserRuleCall_1_5()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypeParserRuleCall_1_5()); 

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
    // $ANTLR end "rule__Function__Group_1__5__Impl"


    // $ANTLR start "rule__Function__Group_1__6"
    // InternalPascal.g:566:1: rule__Function__Group_1__6 : rule__Function__Group_1__6__Impl rule__Function__Group_1__7 ;
    public final void rule__Function__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:570:1: ( rule__Function__Group_1__6__Impl rule__Function__Group_1__7 )
            // InternalPascal.g:571:2: rule__Function__Group_1__6__Impl rule__Function__Group_1__7
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__7();

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
    // $ANTLR end "rule__Function__Group_1__6"


    // $ANTLR start "rule__Function__Group_1__6__Impl"
    // InternalPascal.g:578:1: rule__Function__Group_1__6__Impl : ( ( rule__Function__Group_1_6__0 )* ) ;
    public final void rule__Function__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:582:1: ( ( ( rule__Function__Group_1_6__0 )* ) )
            // InternalPascal.g:583:1: ( ( rule__Function__Group_1_6__0 )* )
            {
            // InternalPascal.g:583:1: ( ( rule__Function__Group_1_6__0 )* )
            // InternalPascal.g:584:2: ( rule__Function__Group_1_6__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_1_6()); 
            // InternalPascal.g:585:2: ( rule__Function__Group_1_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:585:3: rule__Function__Group_1_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Function__Group_1_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_1_6()); 

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
    // $ANTLR end "rule__Function__Group_1__6__Impl"


    // $ANTLR start "rule__Function__Group_1__7"
    // InternalPascal.g:593:1: rule__Function__Group_1__7 : rule__Function__Group_1__7__Impl rule__Function__Group_1__8 ;
    public final void rule__Function__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:597:1: ( rule__Function__Group_1__7__Impl rule__Function__Group_1__8 )
            // InternalPascal.g:598:2: rule__Function__Group_1__7__Impl rule__Function__Group_1__8
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__8();

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
    // $ANTLR end "rule__Function__Group_1__7"


    // $ANTLR start "rule__Function__Group_1__7__Impl"
    // InternalPascal.g:605:1: rule__Function__Group_1__7__Impl : ( ')' ) ;
    public final void rule__Function__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:609:1: ( ( ')' ) )
            // InternalPascal.g:610:1: ( ')' )
            {
            // InternalPascal.g:610:1: ( ')' )
            // InternalPascal.g:611:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_7()); 

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
    // $ANTLR end "rule__Function__Group_1__7__Impl"


    // $ANTLR start "rule__Function__Group_1__8"
    // InternalPascal.g:620:1: rule__Function__Group_1__8 : rule__Function__Group_1__8__Impl rule__Function__Group_1__9 ;
    public final void rule__Function__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:624:1: ( rule__Function__Group_1__8__Impl rule__Function__Group_1__9 )
            // InternalPascal.g:625:2: rule__Function__Group_1__8__Impl rule__Function__Group_1__9
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__9();

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
    // $ANTLR end "rule__Function__Group_1__8"


    // $ANTLR start "rule__Function__Group_1__8__Impl"
    // InternalPascal.g:632:1: rule__Function__Group_1__8__Impl : ( ':' ) ;
    public final void rule__Function__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:636:1: ( ( ':' ) )
            // InternalPascal.g:637:1: ( ':' )
            {
            // InternalPascal.g:637:1: ( ':' )
            // InternalPascal.g:638:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_1_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_1_8()); 

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
    // $ANTLR end "rule__Function__Group_1__8__Impl"


    // $ANTLR start "rule__Function__Group_1__9"
    // InternalPascal.g:647:1: rule__Function__Group_1__9 : rule__Function__Group_1__9__Impl rule__Function__Group_1__10 ;
    public final void rule__Function__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:651:1: ( rule__Function__Group_1__9__Impl rule__Function__Group_1__10 )
            // InternalPascal.g:652:2: rule__Function__Group_1__9__Impl rule__Function__Group_1__10
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__10();

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
    // $ANTLR end "rule__Function__Group_1__9"


    // $ANTLR start "rule__Function__Group_1__9__Impl"
    // InternalPascal.g:659:1: rule__Function__Group_1__9__Impl : ( 'return' ) ;
    public final void rule__Function__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:663:1: ( ( 'return' ) )
            // InternalPascal.g:664:1: ( 'return' )
            {
            // InternalPascal.g:664:1: ( 'return' )
            // InternalPascal.g:665:2: 'return'
            {
             before(grammarAccess.getFunctionAccess().getReturnKeyword_1_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getReturnKeyword_1_9()); 

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
    // $ANTLR end "rule__Function__Group_1__9__Impl"


    // $ANTLR start "rule__Function__Group_1__10"
    // InternalPascal.g:674:1: rule__Function__Group_1__10 : rule__Function__Group_1__10__Impl rule__Function__Group_1__11 ;
    public final void rule__Function__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:678:1: ( rule__Function__Group_1__10__Impl rule__Function__Group_1__11 )
            // InternalPascal.g:679:2: rule__Function__Group_1__10__Impl rule__Function__Group_1__11
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group_1__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__11();

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
    // $ANTLR end "rule__Function__Group_1__10"


    // $ANTLR start "rule__Function__Group_1__10__Impl"
    // InternalPascal.g:686:1: rule__Function__Group_1__10__Impl : ( ( rule__Function__NameAssignment_1_10 ) ) ;
    public final void rule__Function__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:690:1: ( ( ( rule__Function__NameAssignment_1_10 ) ) )
            // InternalPascal.g:691:1: ( ( rule__Function__NameAssignment_1_10 ) )
            {
            // InternalPascal.g:691:1: ( ( rule__Function__NameAssignment_1_10 ) )
            // InternalPascal.g:692:2: ( rule__Function__NameAssignment_1_10 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1_10()); 
            // InternalPascal.g:693:2: ( rule__Function__NameAssignment_1_10 )
            // InternalPascal.g:693:3: rule__Function__NameAssignment_1_10
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1_10();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1_10()); 

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
    // $ANTLR end "rule__Function__Group_1__10__Impl"


    // $ANTLR start "rule__Function__Group_1__11"
    // InternalPascal.g:701:1: rule__Function__Group_1__11 : rule__Function__Group_1__11__Impl ;
    public final void rule__Function__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:705:1: ( rule__Function__Group_1__11__Impl )
            // InternalPascal.g:706:2: rule__Function__Group_1__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1__11__Impl();

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
    // $ANTLR end "rule__Function__Group_1__11"


    // $ANTLR start "rule__Function__Group_1__11__Impl"
    // InternalPascal.g:712:1: rule__Function__Group_1__11__Impl : ( ';' ) ;
    public final void rule__Function__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:716:1: ( ( ';' ) )
            // InternalPascal.g:717:1: ( ';' )
            {
            // InternalPascal.g:717:1: ( ';' )
            // InternalPascal.g:718:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_1_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSemicolonKeyword_1_11()); 

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
    // $ANTLR end "rule__Function__Group_1__11__Impl"


    // $ANTLR start "rule__Function__Group_1_6__0"
    // InternalPascal.g:728:1: rule__Function__Group_1_6__0 : rule__Function__Group_1_6__0__Impl rule__Function__Group_1_6__1 ;
    public final void rule__Function__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:732:1: ( rule__Function__Group_1_6__0__Impl rule__Function__Group_1_6__1 )
            // InternalPascal.g:733:2: rule__Function__Group_1_6__0__Impl rule__Function__Group_1_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1_6__1();

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
    // $ANTLR end "rule__Function__Group_1_6__0"


    // $ANTLR start "rule__Function__Group_1_6__0__Impl"
    // InternalPascal.g:740:1: rule__Function__Group_1_6__0__Impl : ( ';' ) ;
    public final void rule__Function__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:744:1: ( ( ';' ) )
            // InternalPascal.g:745:1: ( ';' )
            {
            // InternalPascal.g:745:1: ( ';' )
            // InternalPascal.g:746:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_1_6_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSemicolonKeyword_1_6_0()); 

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
    // $ANTLR end "rule__Function__Group_1_6__0__Impl"


    // $ANTLR start "rule__Function__Group_1_6__1"
    // InternalPascal.g:755:1: rule__Function__Group_1_6__1 : rule__Function__Group_1_6__1__Impl rule__Function__Group_1_6__2 ;
    public final void rule__Function__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:759:1: ( rule__Function__Group_1_6__1__Impl rule__Function__Group_1_6__2 )
            // InternalPascal.g:760:2: rule__Function__Group_1_6__1__Impl rule__Function__Group_1_6__2
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1_6__2();

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
    // $ANTLR end "rule__Function__Group_1_6__1"


    // $ANTLR start "rule__Function__Group_1_6__1__Impl"
    // InternalPascal.g:767:1: rule__Function__Group_1_6__1__Impl : ( ( rule__Function__NameAssignment_1_6_1 ) ) ;
    public final void rule__Function__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:771:1: ( ( ( rule__Function__NameAssignment_1_6_1 ) ) )
            // InternalPascal.g:772:1: ( ( rule__Function__NameAssignment_1_6_1 ) )
            {
            // InternalPascal.g:772:1: ( ( rule__Function__NameAssignment_1_6_1 ) )
            // InternalPascal.g:773:2: ( rule__Function__NameAssignment_1_6_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1_6_1()); 
            // InternalPascal.g:774:2: ( rule__Function__NameAssignment_1_6_1 )
            // InternalPascal.g:774:3: rule__Function__NameAssignment_1_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1_6_1()); 

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
    // $ANTLR end "rule__Function__Group_1_6__1__Impl"


    // $ANTLR start "rule__Function__Group_1_6__2"
    // InternalPascal.g:782:1: rule__Function__Group_1_6__2 : rule__Function__Group_1_6__2__Impl rule__Function__Group_1_6__3 ;
    public final void rule__Function__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:786:1: ( rule__Function__Group_1_6__2__Impl rule__Function__Group_1_6__3 )
            // InternalPascal.g:787:2: rule__Function__Group_1_6__2__Impl rule__Function__Group_1_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1_6__3();

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
    // $ANTLR end "rule__Function__Group_1_6__2"


    // $ANTLR start "rule__Function__Group_1_6__2__Impl"
    // InternalPascal.g:794:1: rule__Function__Group_1_6__2__Impl : ( ':' ) ;
    public final void rule__Function__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:798:1: ( ( ':' ) )
            // InternalPascal.g:799:1: ( ':' )
            {
            // InternalPascal.g:799:1: ( ':' )
            // InternalPascal.g:800:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_1_6_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_1_6_2()); 

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
    // $ANTLR end "rule__Function__Group_1_6__2__Impl"


    // $ANTLR start "rule__Function__Group_1_6__3"
    // InternalPascal.g:809:1: rule__Function__Group_1_6__3 : rule__Function__Group_1_6__3__Impl ;
    public final void rule__Function__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:813:1: ( rule__Function__Group_1_6__3__Impl )
            // InternalPascal.g:814:2: rule__Function__Group_1_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1_6__3__Impl();

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
    // $ANTLR end "rule__Function__Group_1_6__3"


    // $ANTLR start "rule__Function__Group_1_6__3__Impl"
    // InternalPascal.g:820:1: rule__Function__Group_1_6__3__Impl : ( ruleType ) ;
    public final void rule__Function__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:824:1: ( ( ruleType ) )
            // InternalPascal.g:825:1: ( ruleType )
            {
            // InternalPascal.g:825:1: ( ruleType )
            // InternalPascal.g:826:2: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypeParserRuleCall_1_6_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypeParserRuleCall_1_6_3()); 

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
    // $ANTLR end "rule__Function__Group_1_6__3__Impl"


    // $ANTLR start "rule__Procedure__Group_0__0"
    // InternalPascal.g:836:1: rule__Procedure__Group_0__0 : rule__Procedure__Group_0__0__Impl rule__Procedure__Group_0__1 ;
    public final void rule__Procedure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:840:1: ( rule__Procedure__Group_0__0__Impl rule__Procedure__Group_0__1 )
            // InternalPascal.g:841:2: rule__Procedure__Group_0__0__Impl rule__Procedure__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Procedure__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_0__1();

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
    // $ANTLR end "rule__Procedure__Group_0__0"


    // $ANTLR start "rule__Procedure__Group_0__0__Impl"
    // InternalPascal.g:848:1: rule__Procedure__Group_0__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:852:1: ( ( 'procedure' ) )
            // InternalPascal.g:853:1: ( 'procedure' )
            {
            // InternalPascal.g:853:1: ( 'procedure' )
            // InternalPascal.g:854:2: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0_0()); 

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
    // $ANTLR end "rule__Procedure__Group_0__0__Impl"


    // $ANTLR start "rule__Procedure__Group_0__1"
    // InternalPascal.g:863:1: rule__Procedure__Group_0__1 : rule__Procedure__Group_0__1__Impl rule__Procedure__Group_0__2 ;
    public final void rule__Procedure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:867:1: ( rule__Procedure__Group_0__1__Impl rule__Procedure__Group_0__2 )
            // InternalPascal.g:868:2: rule__Procedure__Group_0__1__Impl rule__Procedure__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Procedure__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_0__2();

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
    // $ANTLR end "rule__Procedure__Group_0__1"


    // $ANTLR start "rule__Procedure__Group_0__1__Impl"
    // InternalPascal.g:875:1: rule__Procedure__Group_0__1__Impl : ( ( rule__Procedure__NameAssignment_0_1 ) ) ;
    public final void rule__Procedure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:879:1: ( ( ( rule__Procedure__NameAssignment_0_1 ) ) )
            // InternalPascal.g:880:1: ( ( rule__Procedure__NameAssignment_0_1 ) )
            {
            // InternalPascal.g:880:1: ( ( rule__Procedure__NameAssignment_0_1 ) )
            // InternalPascal.g:881:2: ( rule__Procedure__NameAssignment_0_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_0_1()); 
            // InternalPascal.g:882:2: ( rule__Procedure__NameAssignment_0_1 )
            // InternalPascal.g:882:3: rule__Procedure__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Procedure__Group_0__1__Impl"


    // $ANTLR start "rule__Procedure__Group_0__2"
    // InternalPascal.g:890:1: rule__Procedure__Group_0__2 : rule__Procedure__Group_0__2__Impl rule__Procedure__Group_0__3 ;
    public final void rule__Procedure__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:894:1: ( rule__Procedure__Group_0__2__Impl rule__Procedure__Group_0__3 )
            // InternalPascal.g:895:2: rule__Procedure__Group_0__2__Impl rule__Procedure__Group_0__3
            {
            pushFollow(FOLLOW_7);
            rule__Procedure__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_0__3();

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
    // $ANTLR end "rule__Procedure__Group_0__2"


    // $ANTLR start "rule__Procedure__Group_0__2__Impl"
    // InternalPascal.g:902:1: rule__Procedure__Group_0__2__Impl : ( '()' ) ;
    public final void rule__Procedure__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:906:1: ( ( '()' ) )
            // InternalPascal.g:907:1: ( '()' )
            {
            // InternalPascal.g:907:1: ( '()' )
            // InternalPascal.g:908:2: '()'
            {
             before(grammarAccess.getProcedureAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getLeftParenthesisRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Procedure__Group_0__2__Impl"


    // $ANTLR start "rule__Procedure__Group_0__3"
    // InternalPascal.g:917:1: rule__Procedure__Group_0__3 : rule__Procedure__Group_0__3__Impl ;
    public final void rule__Procedure__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:921:1: ( rule__Procedure__Group_0__3__Impl )
            // InternalPascal.g:922:2: rule__Procedure__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_0__3__Impl();

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
    // $ANTLR end "rule__Procedure__Group_0__3"


    // $ANTLR start "rule__Procedure__Group_0__3__Impl"
    // InternalPascal.g:928:1: rule__Procedure__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Procedure__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:932:1: ( ( ';' ) )
            // InternalPascal.g:933:1: ( ';' )
            {
            // InternalPascal.g:933:1: ( ';' )
            // InternalPascal.g:934:2: ';'
            {
             before(grammarAccess.getProcedureAccess().getSemicolonKeyword_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getSemicolonKeyword_0_3()); 

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
    // $ANTLR end "rule__Procedure__Group_0__3__Impl"


    // $ANTLR start "rule__Procedure__Group_1__0"
    // InternalPascal.g:944:1: rule__Procedure__Group_1__0 : rule__Procedure__Group_1__0__Impl rule__Procedure__Group_1__1 ;
    public final void rule__Procedure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:948:1: ( rule__Procedure__Group_1__0__Impl rule__Procedure__Group_1__1 )
            // InternalPascal.g:949:2: rule__Procedure__Group_1__0__Impl rule__Procedure__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Procedure__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__1();

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
    // $ANTLR end "rule__Procedure__Group_1__0"


    // $ANTLR start "rule__Procedure__Group_1__0__Impl"
    // InternalPascal.g:956:1: rule__Procedure__Group_1__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:960:1: ( ( 'procedure' ) )
            // InternalPascal.g:961:1: ( 'procedure' )
            {
            // InternalPascal.g:961:1: ( 'procedure' )
            // InternalPascal.g:962:2: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_1_0()); 

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
    // $ANTLR end "rule__Procedure__Group_1__0__Impl"


    // $ANTLR start "rule__Procedure__Group_1__1"
    // InternalPascal.g:971:1: rule__Procedure__Group_1__1 : rule__Procedure__Group_1__1__Impl rule__Procedure__Group_1__2 ;
    public final void rule__Procedure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:975:1: ( rule__Procedure__Group_1__1__Impl rule__Procedure__Group_1__2 )
            // InternalPascal.g:976:2: rule__Procedure__Group_1__1__Impl rule__Procedure__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Procedure__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__2();

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
    // $ANTLR end "rule__Procedure__Group_1__1"


    // $ANTLR start "rule__Procedure__Group_1__1__Impl"
    // InternalPascal.g:983:1: rule__Procedure__Group_1__1__Impl : ( ( rule__Procedure__NameAssignment_1_1 ) ) ;
    public final void rule__Procedure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:987:1: ( ( ( rule__Procedure__NameAssignment_1_1 ) ) )
            // InternalPascal.g:988:1: ( ( rule__Procedure__NameAssignment_1_1 ) )
            {
            // InternalPascal.g:988:1: ( ( rule__Procedure__NameAssignment_1_1 ) )
            // InternalPascal.g:989:2: ( rule__Procedure__NameAssignment_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1_1()); 
            // InternalPascal.g:990:2: ( rule__Procedure__NameAssignment_1_1 )
            // InternalPascal.g:990:3: rule__Procedure__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Procedure__Group_1__1__Impl"


    // $ANTLR start "rule__Procedure__Group_1__2"
    // InternalPascal.g:998:1: rule__Procedure__Group_1__2 : rule__Procedure__Group_1__2__Impl rule__Procedure__Group_1__3 ;
    public final void rule__Procedure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1002:1: ( rule__Procedure__Group_1__2__Impl rule__Procedure__Group_1__3 )
            // InternalPascal.g:1003:2: rule__Procedure__Group_1__2__Impl rule__Procedure__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Procedure__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__3();

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
    // $ANTLR end "rule__Procedure__Group_1__2"


    // $ANTLR start "rule__Procedure__Group_1__2__Impl"
    // InternalPascal.g:1010:1: rule__Procedure__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Procedure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1014:1: ( ( '(' ) )
            // InternalPascal.g:1015:1: ( '(' )
            {
            // InternalPascal.g:1015:1: ( '(' )
            // InternalPascal.g:1016:2: '('
            {
             before(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Procedure__Group_1__2__Impl"


    // $ANTLR start "rule__Procedure__Group_1__3"
    // InternalPascal.g:1025:1: rule__Procedure__Group_1__3 : rule__Procedure__Group_1__3__Impl rule__Procedure__Group_1__4 ;
    public final void rule__Procedure__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1029:1: ( rule__Procedure__Group_1__3__Impl rule__Procedure__Group_1__4 )
            // InternalPascal.g:1030:2: rule__Procedure__Group_1__3__Impl rule__Procedure__Group_1__4
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__4();

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
    // $ANTLR end "rule__Procedure__Group_1__3"


    // $ANTLR start "rule__Procedure__Group_1__3__Impl"
    // InternalPascal.g:1037:1: rule__Procedure__Group_1__3__Impl : ( ( rule__Procedure__NameAssignment_1_3 ) ) ;
    public final void rule__Procedure__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1041:1: ( ( ( rule__Procedure__NameAssignment_1_3 ) ) )
            // InternalPascal.g:1042:1: ( ( rule__Procedure__NameAssignment_1_3 ) )
            {
            // InternalPascal.g:1042:1: ( ( rule__Procedure__NameAssignment_1_3 ) )
            // InternalPascal.g:1043:2: ( rule__Procedure__NameAssignment_1_3 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1_3()); 
            // InternalPascal.g:1044:2: ( rule__Procedure__NameAssignment_1_3 )
            // InternalPascal.g:1044:3: rule__Procedure__NameAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1_3()); 

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
    // $ANTLR end "rule__Procedure__Group_1__3__Impl"


    // $ANTLR start "rule__Procedure__Group_1__4"
    // InternalPascal.g:1052:1: rule__Procedure__Group_1__4 : rule__Procedure__Group_1__4__Impl rule__Procedure__Group_1__5 ;
    public final void rule__Procedure__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1056:1: ( rule__Procedure__Group_1__4__Impl rule__Procedure__Group_1__5 )
            // InternalPascal.g:1057:2: rule__Procedure__Group_1__4__Impl rule__Procedure__Group_1__5
            {
            pushFollow(FOLLOW_9);
            rule__Procedure__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__5();

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
    // $ANTLR end "rule__Procedure__Group_1__4"


    // $ANTLR start "rule__Procedure__Group_1__4__Impl"
    // InternalPascal.g:1064:1: rule__Procedure__Group_1__4__Impl : ( ':' ) ;
    public final void rule__Procedure__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1068:1: ( ( ':' ) )
            // InternalPascal.g:1069:1: ( ':' )
            {
            // InternalPascal.g:1069:1: ( ':' )
            // InternalPascal.g:1070:2: ':'
            {
             before(grammarAccess.getProcedureAccess().getColonKeyword_1_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getColonKeyword_1_4()); 

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
    // $ANTLR end "rule__Procedure__Group_1__4__Impl"


    // $ANTLR start "rule__Procedure__Group_1__5"
    // InternalPascal.g:1079:1: rule__Procedure__Group_1__5 : rule__Procedure__Group_1__5__Impl rule__Procedure__Group_1__6 ;
    public final void rule__Procedure__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1083:1: ( rule__Procedure__Group_1__5__Impl rule__Procedure__Group_1__6 )
            // InternalPascal.g:1084:2: rule__Procedure__Group_1__5__Impl rule__Procedure__Group_1__6
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__6();

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
    // $ANTLR end "rule__Procedure__Group_1__5"


    // $ANTLR start "rule__Procedure__Group_1__5__Impl"
    // InternalPascal.g:1091:1: rule__Procedure__Group_1__5__Impl : ( ruleType ) ;
    public final void rule__Procedure__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1095:1: ( ( ruleType ) )
            // InternalPascal.g:1096:1: ( ruleType )
            {
            // InternalPascal.g:1096:1: ( ruleType )
            // InternalPascal.g:1097:2: ruleType
            {
             before(grammarAccess.getProcedureAccess().getTypeParserRuleCall_1_5()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getTypeParserRuleCall_1_5()); 

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
    // $ANTLR end "rule__Procedure__Group_1__5__Impl"


    // $ANTLR start "rule__Procedure__Group_1__6"
    // InternalPascal.g:1106:1: rule__Procedure__Group_1__6 : rule__Procedure__Group_1__6__Impl rule__Procedure__Group_1__7 ;
    public final void rule__Procedure__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1110:1: ( rule__Procedure__Group_1__6__Impl rule__Procedure__Group_1__7 )
            // InternalPascal.g:1111:2: rule__Procedure__Group_1__6__Impl rule__Procedure__Group_1__7
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__7();

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
    // $ANTLR end "rule__Procedure__Group_1__6"


    // $ANTLR start "rule__Procedure__Group_1__6__Impl"
    // InternalPascal.g:1118:1: rule__Procedure__Group_1__6__Impl : ( ( rule__Procedure__Group_1_6__0 )* ) ;
    public final void rule__Procedure__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1122:1: ( ( ( rule__Procedure__Group_1_6__0 )* ) )
            // InternalPascal.g:1123:1: ( ( rule__Procedure__Group_1_6__0 )* )
            {
            // InternalPascal.g:1123:1: ( ( rule__Procedure__Group_1_6__0 )* )
            // InternalPascal.g:1124:2: ( rule__Procedure__Group_1_6__0 )*
            {
             before(grammarAccess.getProcedureAccess().getGroup_1_6()); 
            // InternalPascal.g:1125:2: ( rule__Procedure__Group_1_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascal.g:1125:3: rule__Procedure__Group_1_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Procedure__Group_1_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getGroup_1_6()); 

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
    // $ANTLR end "rule__Procedure__Group_1__6__Impl"


    // $ANTLR start "rule__Procedure__Group_1__7"
    // InternalPascal.g:1133:1: rule__Procedure__Group_1__7 : rule__Procedure__Group_1__7__Impl rule__Procedure__Group_1__8 ;
    public final void rule__Procedure__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1137:1: ( rule__Procedure__Group_1__7__Impl rule__Procedure__Group_1__8 )
            // InternalPascal.g:1138:2: rule__Procedure__Group_1__7__Impl rule__Procedure__Group_1__8
            {
            pushFollow(FOLLOW_7);
            rule__Procedure__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__8();

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
    // $ANTLR end "rule__Procedure__Group_1__7"


    // $ANTLR start "rule__Procedure__Group_1__7__Impl"
    // InternalPascal.g:1145:1: rule__Procedure__Group_1__7__Impl : ( ')' ) ;
    public final void rule__Procedure__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1149:1: ( ( ')' ) )
            // InternalPascal.g:1150:1: ( ')' )
            {
            // InternalPascal.g:1150:1: ( ')' )
            // InternalPascal.g:1151:2: ')'
            {
             before(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_1_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_1_7()); 

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
    // $ANTLR end "rule__Procedure__Group_1__7__Impl"


    // $ANTLR start "rule__Procedure__Group_1__8"
    // InternalPascal.g:1160:1: rule__Procedure__Group_1__8 : rule__Procedure__Group_1__8__Impl ;
    public final void rule__Procedure__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1164:1: ( rule__Procedure__Group_1__8__Impl )
            // InternalPascal.g:1165:2: rule__Procedure__Group_1__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1__8__Impl();

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
    // $ANTLR end "rule__Procedure__Group_1__8"


    // $ANTLR start "rule__Procedure__Group_1__8__Impl"
    // InternalPascal.g:1171:1: rule__Procedure__Group_1__8__Impl : ( ';' ) ;
    public final void rule__Procedure__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1175:1: ( ( ';' ) )
            // InternalPascal.g:1176:1: ( ';' )
            {
            // InternalPascal.g:1176:1: ( ';' )
            // InternalPascal.g:1177:2: ';'
            {
             before(grammarAccess.getProcedureAccess().getSemicolonKeyword_1_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getSemicolonKeyword_1_8()); 

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
    // $ANTLR end "rule__Procedure__Group_1__8__Impl"


    // $ANTLR start "rule__Procedure__Group_1_6__0"
    // InternalPascal.g:1187:1: rule__Procedure__Group_1_6__0 : rule__Procedure__Group_1_6__0__Impl rule__Procedure__Group_1_6__1 ;
    public final void rule__Procedure__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1191:1: ( rule__Procedure__Group_1_6__0__Impl rule__Procedure__Group_1_6__1 )
            // InternalPascal.g:1192:2: rule__Procedure__Group_1_6__0__Impl rule__Procedure__Group_1_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Procedure__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1_6__1();

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
    // $ANTLR end "rule__Procedure__Group_1_6__0"


    // $ANTLR start "rule__Procedure__Group_1_6__0__Impl"
    // InternalPascal.g:1199:1: rule__Procedure__Group_1_6__0__Impl : ( ';' ) ;
    public final void rule__Procedure__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1203:1: ( ( ';' ) )
            // InternalPascal.g:1204:1: ( ';' )
            {
            // InternalPascal.g:1204:1: ( ';' )
            // InternalPascal.g:1205:2: ';'
            {
             before(grammarAccess.getProcedureAccess().getSemicolonKeyword_1_6_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getSemicolonKeyword_1_6_0()); 

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
    // $ANTLR end "rule__Procedure__Group_1_6__0__Impl"


    // $ANTLR start "rule__Procedure__Group_1_6__1"
    // InternalPascal.g:1214:1: rule__Procedure__Group_1_6__1 : rule__Procedure__Group_1_6__1__Impl rule__Procedure__Group_1_6__2 ;
    public final void rule__Procedure__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1218:1: ( rule__Procedure__Group_1_6__1__Impl rule__Procedure__Group_1_6__2 )
            // InternalPascal.g:1219:2: rule__Procedure__Group_1_6__1__Impl rule__Procedure__Group_1_6__2
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1_6__2();

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
    // $ANTLR end "rule__Procedure__Group_1_6__1"


    // $ANTLR start "rule__Procedure__Group_1_6__1__Impl"
    // InternalPascal.g:1226:1: rule__Procedure__Group_1_6__1__Impl : ( ( rule__Procedure__NameAssignment_1_6_1 ) ) ;
    public final void rule__Procedure__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1230:1: ( ( ( rule__Procedure__NameAssignment_1_6_1 ) ) )
            // InternalPascal.g:1231:1: ( ( rule__Procedure__NameAssignment_1_6_1 ) )
            {
            // InternalPascal.g:1231:1: ( ( rule__Procedure__NameAssignment_1_6_1 ) )
            // InternalPascal.g:1232:2: ( rule__Procedure__NameAssignment_1_6_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1_6_1()); 
            // InternalPascal.g:1233:2: ( rule__Procedure__NameAssignment_1_6_1 )
            // InternalPascal.g:1233:3: rule__Procedure__NameAssignment_1_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1_6_1()); 

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
    // $ANTLR end "rule__Procedure__Group_1_6__1__Impl"


    // $ANTLR start "rule__Procedure__Group_1_6__2"
    // InternalPascal.g:1241:1: rule__Procedure__Group_1_6__2 : rule__Procedure__Group_1_6__2__Impl rule__Procedure__Group_1_6__3 ;
    public final void rule__Procedure__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1245:1: ( rule__Procedure__Group_1_6__2__Impl rule__Procedure__Group_1_6__3 )
            // InternalPascal.g:1246:2: rule__Procedure__Group_1_6__2__Impl rule__Procedure__Group_1_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Procedure__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1_6__3();

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
    // $ANTLR end "rule__Procedure__Group_1_6__2"


    // $ANTLR start "rule__Procedure__Group_1_6__2__Impl"
    // InternalPascal.g:1253:1: rule__Procedure__Group_1_6__2__Impl : ( ':' ) ;
    public final void rule__Procedure__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1257:1: ( ( ':' ) )
            // InternalPascal.g:1258:1: ( ':' )
            {
            // InternalPascal.g:1258:1: ( ':' )
            // InternalPascal.g:1259:2: ':'
            {
             before(grammarAccess.getProcedureAccess().getColonKeyword_1_6_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getColonKeyword_1_6_2()); 

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
    // $ANTLR end "rule__Procedure__Group_1_6__2__Impl"


    // $ANTLR start "rule__Procedure__Group_1_6__3"
    // InternalPascal.g:1268:1: rule__Procedure__Group_1_6__3 : rule__Procedure__Group_1_6__3__Impl ;
    public final void rule__Procedure__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1272:1: ( rule__Procedure__Group_1_6__3__Impl )
            // InternalPascal.g:1273:2: rule__Procedure__Group_1_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_1_6__3__Impl();

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
    // $ANTLR end "rule__Procedure__Group_1_6__3"


    // $ANTLR start "rule__Procedure__Group_1_6__3__Impl"
    // InternalPascal.g:1279:1: rule__Procedure__Group_1_6__3__Impl : ( ruleType ) ;
    public final void rule__Procedure__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1283:1: ( ( ruleType ) )
            // InternalPascal.g:1284:1: ( ruleType )
            {
            // InternalPascal.g:1284:1: ( ruleType )
            // InternalPascal.g:1285:2: ruleType
            {
             before(grammarAccess.getProcedureAccess().getTypeParserRuleCall_1_6_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getTypeParserRuleCall_1_6_3()); 

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
    // $ANTLR end "rule__Procedure__Group_1_6__3__Impl"


    // $ANTLR start "rule__Function__NameAssignment_0_1"
    // InternalPascal.g:1295:1: rule__Function__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1299:1: ( ( RULE_ID ) )
            // InternalPascal.g:1300:2: ( RULE_ID )
            {
            // InternalPascal.g:1300:2: ( RULE_ID )
            // InternalPascal.g:1301:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_0_1"


    // $ANTLR start "rule__Function__NameAssignment_0_5"
    // InternalPascal.g:1310:1: rule__Function__NameAssignment_0_5 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1314:1: ( ( RULE_ID ) )
            // InternalPascal.g:1315:2: ( RULE_ID )
            {
            // InternalPascal.g:1315:2: ( RULE_ID )
            // InternalPascal.g:1316:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_5_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_0_5"


    // $ANTLR start "rule__Function__NameAssignment_1_1"
    // InternalPascal.g:1325:1: rule__Function__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1329:1: ( ( RULE_ID ) )
            // InternalPascal.g:1330:2: ( RULE_ID )
            {
            // InternalPascal.g:1330:2: ( RULE_ID )
            // InternalPascal.g:1331:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1_1"


    // $ANTLR start "rule__Function__NameAssignment_1_3"
    // InternalPascal.g:1340:1: rule__Function__NameAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1344:1: ( ( RULE_ID ) )
            // InternalPascal.g:1345:2: ( RULE_ID )
            {
            // InternalPascal.g:1345:2: ( RULE_ID )
            // InternalPascal.g:1346:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1_3"


    // $ANTLR start "rule__Function__NameAssignment_1_6_1"
    // InternalPascal.g:1355:1: rule__Function__NameAssignment_1_6_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1359:1: ( ( RULE_ID ) )
            // InternalPascal.g:1360:2: ( RULE_ID )
            {
            // InternalPascal.g:1360:2: ( RULE_ID )
            // InternalPascal.g:1361:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_6_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1_6_1"


    // $ANTLR start "rule__Function__NameAssignment_1_10"
    // InternalPascal.g:1370:1: rule__Function__NameAssignment_1_10 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1374:1: ( ( RULE_ID ) )
            // InternalPascal.g:1375:2: ( RULE_ID )
            {
            // InternalPascal.g:1375:2: ( RULE_ID )
            // InternalPascal.g:1376:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_10_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_10_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1_10"


    // $ANTLR start "rule__Procedure__NameAssignment_0_1"
    // InternalPascal.g:1385:1: rule__Procedure__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1389:1: ( ( RULE_ID ) )
            // InternalPascal.g:1390:2: ( RULE_ID )
            {
            // InternalPascal.g:1390:2: ( RULE_ID )
            // InternalPascal.g:1391:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_0_1"


    // $ANTLR start "rule__Procedure__NameAssignment_1_1"
    // InternalPascal.g:1400:1: rule__Procedure__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1404:1: ( ( RULE_ID ) )
            // InternalPascal.g:1405:2: ( RULE_ID )
            {
            // InternalPascal.g:1405:2: ( RULE_ID )
            // InternalPascal.g:1406:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_1_1"


    // $ANTLR start "rule__Procedure__NameAssignment_1_3"
    // InternalPascal.g:1415:1: rule__Procedure__NameAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1419:1: ( ( RULE_ID ) )
            // InternalPascal.g:1420:2: ( RULE_ID )
            {
            // InternalPascal.g:1420:2: ( RULE_ID )
            // InternalPascal.g:1421:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_1_3"


    // $ANTLR start "rule__Procedure__NameAssignment_1_6_1"
    // InternalPascal.g:1430:1: rule__Procedure__NameAssignment_1_6_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1434:1: ( ( RULE_ID ) )
            // InternalPascal.g:1435:2: ( RULE_ID )
            {
            // InternalPascal.g:1435:2: ( RULE_ID )
            // InternalPascal.g:1436:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_6_1_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_1_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});

}