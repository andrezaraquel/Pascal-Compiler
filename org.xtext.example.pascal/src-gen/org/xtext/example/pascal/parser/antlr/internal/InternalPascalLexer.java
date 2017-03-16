package org.xtext.example.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
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

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( '.' )
            // InternalPascal.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:12:7: ( 'program' )
            // InternalPascal.g:12:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( '(' )
            // InternalPascal.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:14:7: ( ')' )
            // InternalPascal.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:15:7: ( ';' )
            // InternalPascal.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:16:7: ( ',' )
            // InternalPascal.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:17:7: ( 'begin' )
            // InternalPascal.g:17:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:18:7: ( 'end' )
            // InternalPascal.g:18:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:19:7: ( ':' )
            // InternalPascal.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:20:7: ( 'goto' )
            // InternalPascal.g:20:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:21:7: ( ':=' )
            // InternalPascal.g:21:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:22:7: ( '=' )
            // InternalPascal.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:23:7: ( '<>' )
            // InternalPascal.g:23:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:24:7: ( '<' )
            // InternalPascal.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:25:7: ( '<=' )
            // InternalPascal.g:25:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:26:7: ( '>' )
            // InternalPascal.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:27:7: ( '>=' )
            // InternalPascal.g:27:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:28:7: ( 'in' )
            // InternalPascal.g:28:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:29:7: ( 'or' )
            // InternalPascal.g:29:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:30:7: ( '*' )
            // InternalPascal.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:31:7: ( '/' )
            // InternalPascal.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:32:7: ( 'div' )
            // InternalPascal.g:32:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:33:7: ( 'mod' )
            // InternalPascal.g:33:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:34:7: ( 'and' )
            // InternalPascal.g:34:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:35:7: ( 'nil' )
            // InternalPascal.g:35:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:36:7: ( 'not' )
            // InternalPascal.g:36:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:37:7: ( 'True' )
            // InternalPascal.g:37:9: 'True'
            {
            match("True"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:38:7: ( 'False' )
            // InternalPascal.g:38:9: 'False'
            {
            match("False"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:39:7: ( '[' )
            // InternalPascal.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:40:7: ( ']' )
            // InternalPascal.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:41:7: ( 'E' )
            // InternalPascal.g:41:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:42:7: ( 'e' )
            // InternalPascal.g:42:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:43:7: ( '^' )
            // InternalPascal.g:43:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:44:7: ( '+' )
            // InternalPascal.g:44:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:45:7: ( '-' )
            // InternalPascal.g:45:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:46:7: ( 'with' )
            // InternalPascal.g:46:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:47:7: ( 'do' )
            // InternalPascal.g:47:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:48:7: ( 'case' )
            // InternalPascal.g:48:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:49:7: ( 'of' )
            // InternalPascal.g:49:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:50:7: ( 'if' )
            // InternalPascal.g:50:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:51:7: ( 'then' )
            // InternalPascal.g:51:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:52:7: ( 'else' )
            // InternalPascal.g:52:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:53:7: ( 'for' )
            // InternalPascal.g:53:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:54:7: ( 'to' )
            // InternalPascal.g:54:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:55:7: ( 'downto' )
            // InternalPascal.g:55:9: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:56:7: ( 'repeat' )
            // InternalPascal.g:56:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:57:7: ( 'until' )
            // InternalPascal.g:57:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:58:7: ( 'while' )
            // InternalPascal.g:58:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:59:7: ( 'label' )
            // InternalPascal.g:59:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:60:7: ( 'const' )
            // InternalPascal.g:60:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:61:7: ( 'type' )
            // InternalPascal.g:61:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:62:7: ( 'packed' )
            // InternalPascal.g:62:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:63:7: ( 'file' )
            // InternalPascal.g:63:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:64:7: ( 'set' )
            // InternalPascal.g:64:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:65:7: ( 'record' )
            // InternalPascal.g:65:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:66:7: ( 'array' )
            // InternalPascal.g:66:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:67:7: ( '..' )
            // InternalPascal.g:67:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:68:7: ( 'var' )
            // InternalPascal.g:68:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:69:7: ( 'function' )
            // InternalPascal.g:69:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:70:7: ( 'procedure' )
            // InternalPascal.g:70:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:71:7: ( 'forward' )
            // InternalPascal.g:71:9: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "RULE_STRINGS"
    public final void mRULE_STRINGS() throws RecognitionException {
        try {
            int _type = RULE_STRINGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7422:14: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '^' | '?' | '.' | '/' | '\\\\' | '*' | '%' | '&' | '@' | '#' | '(' | ')' | '$' | '=' | '{' | '}' | '[' | ']' | ',' | '!' | '|' | '+' | '-' )* '\\'' )
            // InternalPascal.g:7422:16: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '^' | '?' | '.' | '/' | '\\\\' | '*' | '%' | '&' | '@' | '#' | '(' | ')' | '$' | '=' | '{' | '}' | '[' | ']' | ',' | '!' | '|' | '+' | '-' )* '\\''
            {
            match('\''); 
            // InternalPascal.g:7422:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '^' | '?' | '.' | '/' | '\\\\' | '*' | '%' | '&' | '@' | '#' | '(' | ')' | '$' | '=' | '{' | '}' | '[' | ']' | ',' | '!' | '|' | '+' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='9')||LA1_0=='='||(LA1_0>='?' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='}')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='}') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRINGS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7424:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:7424:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:7424:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:7424:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:7424:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7426:10: ( ( '0' .. '9' )+ )
            // InternalPascal.g:7426:12: ( '0' .. '9' )+
            {
            // InternalPascal.g:7426:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:7426:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7428:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:7428:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:7428:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:7428:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:7428:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPascal.g:7428:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:7428:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:7428:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:7428:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPascal.g:7428:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:7428:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7430:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:7430:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:7430:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:7430:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7432:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:7432:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:7432:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:7432:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalPascal.g:7432:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:7432:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:7432:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPascal.g:7432:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7434:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:7434:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:7434:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:7436:16: ( . )
            // InternalPascal.g:7436:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPascal.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | RULE_STRINGS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=69;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalPascal.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalPascal.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalPascal.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalPascal.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalPascal.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalPascal.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalPascal.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalPascal.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalPascal.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalPascal.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalPascal.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalPascal.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalPascal.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalPascal.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalPascal.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalPascal.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalPascal.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalPascal.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalPascal.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalPascal.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalPascal.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalPascal.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalPascal.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalPascal.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalPascal.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalPascal.g:1:376: RULE_STRINGS
                {
                mRULE_STRINGS(); 

                }
                break;
            case 63 :
                // InternalPascal.g:1:389: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 64 :
                // InternalPascal.g:1:397: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // InternalPascal.g:1:406: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // InternalPascal.g:1:418: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 67 :
                // InternalPascal.g:1:434: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // InternalPascal.g:1:450: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 69 :
                // InternalPascal.g:1:458: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\56\1\61\4\uffff\1\61\1\71\1\73\1\61\1\uffff\1\100\1\102\2\61\1\uffff\1\112\6\61\2\uffff\1\126\1\127\2\uffff\11\61\1\54\2\uffff\1\54\4\uffff\2\61\5\uffff\3\61\3\uffff\1\61\6\uffff\1\165\1\166\1\167\1\170\4\uffff\1\61\1\173\7\61\6\uffff\5\61\1\u0088\11\61\6\uffff\3\61\1\u009a\2\61\4\uffff\1\u009d\1\61\1\uffff\1\u009f\1\u00a0\1\61\1\u00a2\1\u00a3\7\61\1\uffff\1\61\1\u00ad\6\61\1\u00b4\1\u00b5\1\u0095\2\uffff\4\61\1\uffff\1\u00ba\1\u00bb\1\uffff\1\61\2\uffff\1\61\2\uffff\1\u00be\1\61\1\u00c0\1\61\1\u00c2\1\61\1\u00c4\1\u00c5\1\61\1\uffff\1\u00c7\5\61\2\uffff\3\61\1\u00d0\2\uffff\1\61\1\u00d2\1\uffff\1\u00d3\1\uffff\1\u00d4\1\uffff\1\u00d5\2\uffff\1\61\1\uffff\3\61\1\u00da\1\u00db\2\61\1\u00de\1\uffff\1\u00df\4\uffff\2\61\1\u00e2\1\u00e3\2\uffff\1\u00e4\1\61\2\uffff\1\u00e6\1\61\3\uffff\1\61\1\uffff\1\u00e9\1\u00ea\2\uffff";
    static final String DFA13_eofS =
        "\u00eb\uffff";
    static final String DFA13_minS =
        "\1\0\1\56\1\141\4\uffff\1\145\1\60\1\75\1\157\1\uffff\2\75\2\146\1\uffff\1\52\1\151\1\157\1\156\1\151\1\162\1\141\2\uffff\1\60\1\101\2\uffff\1\150\1\141\1\150\1\151\1\145\1\156\1\141\1\145\1\141\1\0\2\uffff\1\0\4\uffff\1\157\1\143\5\uffff\1\147\1\144\1\163\3\uffff\1\164\6\uffff\4\60\4\uffff\1\166\1\60\2\144\1\162\1\154\1\164\1\165\1\154\6\uffff\1\164\1\151\1\163\1\156\1\145\1\60\1\160\1\162\1\154\1\156\1\143\1\164\1\142\1\164\1\162\2\0\4\uffff\1\143\1\153\1\151\1\60\1\145\1\157\4\uffff\1\60\1\156\1\uffff\2\60\1\141\2\60\1\145\1\163\1\150\1\154\1\145\1\163\1\156\1\uffff\1\145\1\60\1\145\1\143\1\145\1\157\1\151\1\145\2\60\2\0\1\uffff\1\162\2\145\1\156\1\uffff\2\60\1\uffff\1\164\2\uffff\1\171\2\uffff\1\60\1\145\1\60\1\145\1\60\1\164\2\60\1\141\1\uffff\1\60\1\164\1\141\1\162\2\154\2\uffff\1\141\2\144\1\60\2\uffff\1\157\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1\162\1\uffff\1\151\1\164\1\144\2\60\1\155\1\165\1\60\1\uffff\1\60\4\uffff\1\144\1\157\2\60\2\uffff\1\60\1\162\2\uffff\1\60\1\156\3\uffff\1\145\1\uffff\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\56\1\162\4\uffff\1\145\1\172\1\75\1\157\1\uffff\1\76\1\75\1\156\1\162\1\uffff\1\57\2\157\1\162\1\157\1\162\1\141\2\uffff\2\172\2\uffff\1\151\1\157\1\171\1\165\1\145\1\156\1\141\1\145\1\141\1\uffff\2\uffff\1\uffff\4\uffff\1\157\1\143\5\uffff\1\147\1\144\1\163\3\uffff\1\164\6\uffff\4\172\4\uffff\1\166\1\172\2\144\1\162\1\154\1\164\1\165\1\154\6\uffff\1\164\1\151\1\163\1\156\1\145\1\172\1\160\1\162\1\154\1\156\1\160\1\164\1\142\1\164\1\162\2\uffff\4\uffff\1\147\1\153\1\151\1\172\1\145\1\157\4\uffff\1\172\1\156\1\uffff\2\172\1\141\2\172\1\145\1\163\1\150\1\154\1\145\1\163\1\156\1\uffff\1\145\1\172\1\145\1\143\1\145\1\157\1\151\1\145\2\172\2\uffff\1\uffff\1\162\2\145\1\156\1\uffff\2\172\1\uffff\1\164\2\uffff\1\171\2\uffff\1\172\1\145\1\172\1\145\1\172\1\164\2\172\1\141\1\uffff\1\172\1\164\1\141\1\162\2\154\2\uffff\1\141\2\144\1\172\2\uffff\1\157\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\162\1\uffff\1\151\1\164\1\144\2\172\1\155\1\165\1\172\1\uffff\1\172\4\uffff\1\144\1\157\2\172\2\uffff\1\172\1\162\2\uffff\1\172\1\156\3\uffff\1\145\1\uffff\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\4\uffff\1\14\4\uffff\1\24\7\uffff\1\35\1\36\2\uffff\1\42\1\43\12\uffff\1\77\1\100\1\uffff\1\104\1\105\1\71\1\1\2\uffff\1\77\1\3\1\4\1\5\1\6\3\uffff\1\40\1\13\1\11\1\uffff\1\14\1\15\1\17\1\16\1\21\1\20\4\uffff\1\24\1\102\1\103\1\25\11\uffff\1\35\1\36\1\37\1\41\1\42\1\43\21\uffff\1\76\1\101\1\100\1\104\6\uffff\1\22\1\50\1\23\1\47\2\uffff\1\45\14\uffff\1\54\14\uffff\1\76\4\uffff\1\10\2\uffff\1\26\1\uffff\1\27\1\30\1\uffff\1\31\1\32\11\uffff\1\53\6\uffff\1\66\1\72\4\uffff\1\52\1\12\2\uffff\1\33\1\uffff\1\44\1\uffff\1\46\1\uffff\1\51\1\63\1\uffff\1\65\10\uffff\1\7\1\uffff\1\70\1\34\1\60\1\62\4\uffff\1\57\1\61\2\uffff\1\64\1\55\2\uffff\1\56\1\67\1\2\1\uffff\1\75\2\uffff\1\73\1\74";
    static final String DFA13_specialS =
        "\1\0\46\uffff\1\2\2\uffff\1\4\76\uffff\1\1\1\6\50\uffff\1\3\1\5\126\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\52\4\54\1\47\1\3\1\4\1\20\1\34\1\6\1\35\1\1\1\21\12\51\1\11\1\5\1\14\1\13\1\15\2\54\4\50\1\32\1\27\15\50\1\26\6\50\1\30\1\54\1\31\1\33\1\50\1\54\1\24\1\7\1\37\1\22\1\10\1\41\1\12\1\50\1\16\2\50\1\44\1\23\1\25\1\17\1\2\1\50\1\42\1\45\1\40\1\43\1\46\1\36\3\50\uff85\54",
            "\1\55",
            "\1\60\20\uffff\1\57",
            "",
            "",
            "",
            "",
            "\1\66",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\70\1\61\1\67\14\61",
            "\1\72",
            "\1\74",
            "",
            "\1\77\1\76",
            "\1\101",
            "\1\104\7\uffff\1\103",
            "\1\106\13\uffff\1\105",
            "",
            "\1\110\4\uffff\1\111",
            "\1\113\5\uffff\1\114",
            "\1\115",
            "\1\116\3\uffff\1\117",
            "\1\120\5\uffff\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\133\1\132",
            "\1\134\15\uffff\1\135",
            "\1\136\6\uffff\1\137\11\uffff\1\140",
            "\1\142\5\uffff\1\141\5\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\41\154\1\152\1\154\4\152\1\153\22\152\3\154\1\152\1\154\35\152\1\151\3\152\1\154\35\152\uff82\154",
            "",
            "",
            "\0\154",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\171",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\172\3\61",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\14\uffff\1\u008d",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\41\154\1\u0094\1\154\4\u0094\1\u0093\22\u0094\3\154\1\u0094\1\154\41\u0094\1\154\35\u0094\uff82\154",
            "\41\154\1\152\1\154\4\152\1\153\22\152\3\154\1\152\1\154\35\152\1\151\3\152\1\154\35\152\uff82\154",
            "",
            "",
            "",
            "",
            "\1\u0097\3\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009e",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u00ac\3\61",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\0\154",
            "\41\154\1\152\1\154\4\152\1\153\22\152\3\154\1\152\1\154\35\152\1\151\3\152\1\154\35\152\uff82\154",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00bf",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c6",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00d1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00dc",
            "\1\u00dd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e5",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e7",
            "",
            "",
            "",
            "\1\u00e8",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | RULE_STRINGS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='.') ) {s = 1;}

                        else if ( (LA13_0=='p') ) {s = 2;}

                        else if ( (LA13_0=='(') ) {s = 3;}

                        else if ( (LA13_0==')') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0==',') ) {s = 6;}

                        else if ( (LA13_0=='b') ) {s = 7;}

                        else if ( (LA13_0=='e') ) {s = 8;}

                        else if ( (LA13_0==':') ) {s = 9;}

                        else if ( (LA13_0=='g') ) {s = 10;}

                        else if ( (LA13_0=='=') ) {s = 11;}

                        else if ( (LA13_0=='<') ) {s = 12;}

                        else if ( (LA13_0=='>') ) {s = 13;}

                        else if ( (LA13_0=='i') ) {s = 14;}

                        else if ( (LA13_0=='o') ) {s = 15;}

                        else if ( (LA13_0=='*') ) {s = 16;}

                        else if ( (LA13_0=='/') ) {s = 17;}

                        else if ( (LA13_0=='d') ) {s = 18;}

                        else if ( (LA13_0=='m') ) {s = 19;}

                        else if ( (LA13_0=='a') ) {s = 20;}

                        else if ( (LA13_0=='n') ) {s = 21;}

                        else if ( (LA13_0=='T') ) {s = 22;}

                        else if ( (LA13_0=='F') ) {s = 23;}

                        else if ( (LA13_0=='[') ) {s = 24;}

                        else if ( (LA13_0==']') ) {s = 25;}

                        else if ( (LA13_0=='E') ) {s = 26;}

                        else if ( (LA13_0=='^') ) {s = 27;}

                        else if ( (LA13_0=='+') ) {s = 28;}

                        else if ( (LA13_0=='-') ) {s = 29;}

                        else if ( (LA13_0=='w') ) {s = 30;}

                        else if ( (LA13_0=='c') ) {s = 31;}

                        else if ( (LA13_0=='t') ) {s = 32;}

                        else if ( (LA13_0=='f') ) {s = 33;}

                        else if ( (LA13_0=='r') ) {s = 34;}

                        else if ( (LA13_0=='u') ) {s = 35;}

                        else if ( (LA13_0=='l') ) {s = 36;}

                        else if ( (LA13_0=='s') ) {s = 37;}

                        else if ( (LA13_0=='v') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( ((LA13_0>='A' && LA13_0<='D')||(LA13_0>='G' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='q'||(LA13_0>='x' && LA13_0<='z')) ) {s = 40;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 41;}

                        else if ( (LA13_0=='\"') ) {s = 42;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 43;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_105 = input.LA(1);

                        s = -1;
                        if ( (LA13_105=='\'') ) {s = 147;}

                        else if ( (LA13_105=='!'||(LA13_105>='#' && LA13_105<='&')||(LA13_105>='(' && LA13_105<='9')||LA13_105=='='||(LA13_105>='?' && LA13_105<='_')||(LA13_105>='a' && LA13_105<='}')) ) {s = 148;}

                        else if ( ((LA13_105>='\u0000' && LA13_105<=' ')||LA13_105=='\"'||(LA13_105>=':' && LA13_105<='<')||LA13_105=='>'||LA13_105=='`'||(LA13_105>='~' && LA13_105<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( (LA13_39=='\\') ) {s = 105;}

                        else if ( (LA13_39=='!'||(LA13_39>='#' && LA13_39<='&')||(LA13_39>='(' && LA13_39<='9')||LA13_39=='='||(LA13_39>='?' && LA13_39<='[')||(LA13_39>=']' && LA13_39<='_')||(LA13_39>='a' && LA13_39<='}')) ) {s = 106;}

                        else if ( (LA13_39=='\'') ) {s = 107;}

                        else if ( ((LA13_39>='\u0000' && LA13_39<=' ')||LA13_39=='\"'||(LA13_39>=':' && LA13_39<='<')||LA13_39=='>'||LA13_39=='`'||(LA13_39>='~' && LA13_39<='\uFFFF')) ) {s = 108;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_147 = input.LA(1);

                        s = -1;
                        if ( ((LA13_147>='\u0000' && LA13_147<='\uFFFF')) ) {s = 108;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_42 = input.LA(1);

                        s = -1;
                        if ( ((LA13_42>='\u0000' && LA13_42<='\uFFFF')) ) {s = 108;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_148 = input.LA(1);

                        s = -1;
                        if ( (LA13_148=='\'') ) {s = 107;}

                        else if ( (LA13_148=='\\') ) {s = 105;}

                        else if ( (LA13_148=='!'||(LA13_148>='#' && LA13_148<='&')||(LA13_148>='(' && LA13_148<='9')||LA13_148=='='||(LA13_148>='?' && LA13_148<='[')||(LA13_148>=']' && LA13_148<='_')||(LA13_148>='a' && LA13_148<='}')) ) {s = 106;}

                        else if ( ((LA13_148>='\u0000' && LA13_148<=' ')||LA13_148=='\"'||(LA13_148>=':' && LA13_148<='<')||LA13_148=='>'||LA13_148=='`'||(LA13_148>='~' && LA13_148<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_106 = input.LA(1);

                        s = -1;
                        if ( (LA13_106=='\'') ) {s = 107;}

                        else if ( (LA13_106=='\\') ) {s = 105;}

                        else if ( (LA13_106=='!'||(LA13_106>='#' && LA13_106<='&')||(LA13_106>='(' && LA13_106<='9')||LA13_106=='='||(LA13_106>='?' && LA13_106<='[')||(LA13_106>=']' && LA13_106<='_')||(LA13_106>='a' && LA13_106<='}')) ) {s = 106;}

                        else if ( ((LA13_106>='\u0000' && LA13_106<=' ')||LA13_106=='\"'||(LA13_106>=':' && LA13_106<='<')||LA13_106=='>'||LA13_106=='`'||(LA13_106>='~' && LA13_106<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}