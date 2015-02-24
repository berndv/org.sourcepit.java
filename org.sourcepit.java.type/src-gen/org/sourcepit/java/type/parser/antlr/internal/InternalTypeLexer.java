
package org.sourcepit.java.type.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.eclipse.xtext.parser.antlr.Lexer;

@SuppressWarnings("all")
public class InternalTypeLexer extends Lexer {
   public static final int RULE_JAVALETTER = 56;
   public static final int RULE_CHARACTER = 15;
   public static final int RULE_SIGN = 47;
   public static final int RULE_BINARYDIGITS = 39;
   public static final int RULE_HEXSIGNIFICAND = 48;
   public static final int RULE_HEXINTEGERLITERAL = 8;
   public static final int RULE_UNDERSCORES = 27;
   public static final int RULE_NONZERODIGIT = 25;
   public static final int T__61 = 61;
   public static final int RULE_UNICODEESCAPE = 52;
   public static final int RULE_OCTALNUMERAL = 23;
   public static final int RULE_ZEROTOTHREE = 54;
   public static final int RULE_DIGIT = 28;
   public static final int T__66 = 66;
   public static final int RULE_ML_COMMENT = 58;
   public static final int T__67 = 67;
   public static final int RULE_BINARYDIGITORUNDERSCORE = 42;
   public static final int RULE_UNICODEMARKER = 55;
   public static final int T__68 = 68;
   public static final int T__69 = 69;
   public static final int RULE_FALSE = 14;
   public static final int T__62 = 62;
   public static final int T__63 = 63;
   public static final int T__64 = 64;
   public static final int T__65 = 65;
   public static final int RULE_BINARYEXPONENT = 49;
   public static final int RULE_DIGITSANDUNDERSCORES = 29;
   public static final int RULE_DECIMALFLOATINGPOINTLITERAL = 11;
   public static final int RULE_BINARYINTEGERLITERAL = 10;
   public static final int RULE_HEXADECIMALFLOATINGPOINTLITERAL = 12;
   public static final int RULE_HEXNUMERAL = 22;
   public static final int RULE_HEXDIGITS = 31;
   public static final int RULE_OCTALESCAPE = 53;
   public static final int RULE_FLOATINGPOINTTYPE = 19;
   public static final int RULE_EXPONENTINDICATOR = 45;
   public static final int T__91 = 91;
   public static final int T__100 = 100;
   public static final int T__92 = 92;
   public static final int T__93 = 93;
   public static final int T__102 = 102;
   public static final int T__94 = 94;
   public static final int T__101 = 101;
   public static final int RULE_JAVALETTERORDIGIT = 57;
   public static final int T__90 = 90;
   public static final int RULE_HEXDIGITORUNDERSCORE = 34;
   public static final int RULE_OCTALINTEGERLITERAL = 9;
   public static final int RULE_OCTALDIGITS = 35;
   public static final int T__99 = 99;
   public static final int RULE_DECIMALINTEGERLITERAL = 7;
   public static final int RULE_ESCAPESEQUENCE = 51;
   public static final int T__95 = 95;
   public static final int T__96 = 96;
   public static final int T__97 = 97;
   public static final int T__98 = 98;
   public static final int RULE_OCTALDIGITORUNDERSCORE = 38;
   public static final int RULE_HEXDIGIT = 32;
   public static final int RULE_DECIMALNUMERAL = 20;
   public static final int RULE_BINARYNUMERAL = 24;
   public static final int RULE_DIGITORUNDERSCORE = 30;
   public static final int RULE_HEXDIGITSANDUNDERSCORES = 33;
   public static final int RULE_INTEGERTYPESUFFIX = 21;
   public static final int T__70 = 70;
   public static final int T__71 = 71;
   public static final int T__72 = 72;
   public static final int RULE_IDENTIFIER = 6;
   public static final int RULE_STRING = 16;
   public static final int RULE_FLOATTYPESUFFIX = 44;
   public static final int RULE_NUMERICTYPE = 4;
   public static final int RULE_NULL = 17;
   public static final int RULE_DIGITS = 26;
   public static final int RULE_SL_COMMENT = 59;
   public static final int RULE_BOOLEANTYPE = 5;
   public static final int T__77 = 77;
   public static final int RULE_TRUE = 13;
   public static final int T__78 = 78;
   public static final int T__79 = 79;
   public static final int T__73 = 73;
   public static final int EOF = -1;
   public static final int T__74 = 74;
   public static final int T__75 = 75;
   public static final int T__76 = 76;
   public static final int T__80 = 80;
   public static final int T__81 = 81;
   public static final int T__82 = 82;
   public static final int T__83 = 83;
   public static final int RULE_WS = 60;
   public static final int RULE_OCTALDIGIT = 36;
   public static final int RULE_SIGNEDINTEGER = 46;
   public static final int RULE_BINARYEXPONENTINDICATOR = 50;
   public static final int RULE_OCTALDIGITSANDUNDERSCORES = 37;
   public static final int T__88 = 88;
   public static final int T__89 = 89;
   public static final int RULE_BINARYDIGITSANDUNDERSCORES = 41;
   public static final int T__84 = 84;
   public static final int T__104 = 104;
   public static final int T__85 = 85;
   public static final int T__103 = 103;
   public static final int RULE_BINARYDIGIT = 40;
   public static final int T__86 = 86;
   public static final int RULE_INTEGRALTYPE = 18;
   public static final int RULE_EXPONENTPART = 43;
   public static final int T__87 = 87;

   // delegates
   // delegators

   public InternalTypeLexer() {
      ;
   }

   public InternalTypeLexer(CharStream input) {
      this(input, new RecognizerSharedState());
   }

   public InternalTypeLexer(CharStream input, RecognizerSharedState state) {
      super(input, state);

   }

   public String getGrammarFileName() {
      return "../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g";
   }

   // $ANTLR start "T__61"
   public final void mT__61() throws RecognitionException {
      try {
         int _type = T__61;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:11:7: ( '.'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:11:9: '.'
         {
            match('.');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:12:7: ( '['
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:12:9: '['
         {
            match('[');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:13:7: ( ']'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:13:9: ']'
         {
            match(']');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:14:7: (
         // 'extends' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:14:9:
         // 'extends'
         {
            match("extends");


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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:15:7: ( '&'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:15:9: '&'
         {
            match('&');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:16:7: ( '<'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:16:9: '<'
         {
            match('<');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:17:7: ( '>'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:17:9: '>'
         {
            match('>');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:18:7: ( ','
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:18:9: ','
         {
            match(',');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:19:7: ( '?'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:19:9: '?'
         {
            match('?');

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:20:7: (
         // 'super' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:20:9:
         // 'super'
         {
            match("super");


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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:21:7: (
         // 'package' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:21:9:
         // 'package'
         {
            match("package");


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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:22:7: ( ';'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:22:9: ';'
         {
            match(';');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__72"

   // $ANTLR start "T__73"
   public final void mT__73() throws RecognitionException {
      try {
         int _type = T__73;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:23:7: (
         // 'import' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:23:9:
         // 'import'
         {
            match("import");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__73"

   // $ANTLR start "T__74"
   public final void mT__74() throws RecognitionException {
      try {
         int _type = T__74;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:24:7: ( '*'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:24:9: '*'
         {
            match('*');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__74"

   // $ANTLR start "T__75"
   public final void mT__75() throws RecognitionException {
      try {
         int _type = T__75;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:25:7: (
         // 'static' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:25:9:
         // 'static'
         {
            match("static");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__75"

   // $ANTLR start "T__76"
   public final void mT__76() throws RecognitionException {
      try {
         int _type = T__76;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:26:7: (
         // 'class' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:26:9:
         // 'class'
         {
            match("class");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__76"

   // $ANTLR start "T__77"
   public final void mT__77() throws RecognitionException {
      try {
         int _type = T__77;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:27:7: (
         // 'implements' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:27:9:
         // 'implements'
         {
            match("implements");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__77"

   // $ANTLR start "T__78"
   public final void mT__78() throws RecognitionException {
      try {
         int _type = T__78;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:28:7: ( '{'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:28:9: '{'
         {
            match('{');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__78"

   // $ANTLR start "T__79"
   public final void mT__79() throws RecognitionException {
      try {
         int _type = T__79;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:29:7: ( '}'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:29:9: '}'
         {
            match('}');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__79"

   // $ANTLR start "T__80"
   public final void mT__80() throws RecognitionException {
      try {
         int _type = T__80;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:30:7: ( '='
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:30:9: '='
         {
            match('=');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__80"

   // $ANTLR start "T__81"
   public final void mT__81() throws RecognitionException {
      try {
         int _type = T__81;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:31:7: (
         // 'void' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:31:9: 'void'
         {
            match("void");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__81"

   // $ANTLR start "T__82"
   public final void mT__82() throws RecognitionException {
      try {
         int _type = T__82;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:32:7: ( '('
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:32:9: '('
         {
            match('(');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__82"

   // $ANTLR start "T__83"
   public final void mT__83() throws RecognitionException {
      try {
         int _type = T__83;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:33:7: ( ')'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:33:9: ')'
         {
            match(')');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__83"

   // $ANTLR start "T__84"
   public final void mT__84() throws RecognitionException {
      try {
         int _type = T__84;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:34:7: (
         // '...' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:34:9: '...'
         {
            match("...");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__84"

   // $ANTLR start "T__85"
   public final void mT__85() throws RecognitionException {
      try {
         int _type = T__85;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:35:7: (
         // 'this' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:35:9: 'this'
         {
            match("this");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__85"

   // $ANTLR start "T__86"
   public final void mT__86() throws RecognitionException {
      try {
         int _type = T__86;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:36:7: (
         // 'throws' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:36:9:
         // 'throws'
         {
            match("throws");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__86"

   // $ANTLR start "T__87"
   public final void mT__87() throws RecognitionException {
      try {
         int _type = T__87;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:37:7: (
         // 'enum' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:37:9: 'enum'
         {
            match("enum");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__87"

   // $ANTLR start "T__88"
   public final void mT__88() throws RecognitionException {
      try {
         int _type = T__88;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:38:7: (
         // 'interface' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:38:9:
         // 'interface'
         {
            match("interface");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__88"

   // $ANTLR start "T__89"
   public final void mT__89() throws RecognitionException {
      try {
         int _type = T__89;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:39:7: ( '@'
         // )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:39:9: '@'
         {
            match('@');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__89"

   // $ANTLR start "T__90"
   public final void mT__90() throws RecognitionException {
      try {
         int _type = T__90;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:40:7: (
         // 'default' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:40:9:
         // 'default'
         {
            match("default");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__90"

   // $ANTLR start "T__91"
   public final void mT__91() throws RecognitionException {
      try {
         int _type = T__91;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:41:7: (
         // 'block' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:41:9:
         // 'block'
         {
            match("block");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__91"

   // $ANTLR start "T__92"
   public final void mT__92() throws RecognitionException {
      try {
         int _type = T__92;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:42:7: (
         // 'argumentList' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:42:9:
         // 'argumentList'
         {
            match("argumentList");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__92"

   // $ANTLR start "T__93"
   public final void mT__93() throws RecognitionException {
      try {
         int _type = T__93;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:43:7: (
         // 'expression' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:43:9:
         // 'expression'
         {
            match("expression");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__93"

   // $ANTLR start "T__94"
   public final void mT__94() throws RecognitionException {
      try {
         int _type = T__94;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:44:7: (
         // 'conditionalExpression' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:44:9:
         // 'conditionalExpression'
         {
            match("conditionalExpression");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__94"

   // $ANTLR start "T__95"
   public final void mT__95() throws RecognitionException {
      try {
         int _type = T__95;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:45:7: (
         // 'public' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:45:9:
         // 'public'
         {
            match("public");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__95"

   // $ANTLR start "T__96"
   public final void mT__96() throws RecognitionException {
      try {
         int _type = T__96;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:46:7: (
         // 'protected' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:46:9:
         // 'protected'
         {
            match("protected");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__96"

   // $ANTLR start "T__97"
   public final void mT__97() throws RecognitionException {
      try {
         int _type = T__97;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:47:7: (
         // 'private' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:47:9:
         // 'private'
         {
            match("private");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__97"

   // $ANTLR start "T__98"
   public final void mT__98() throws RecognitionException {
      try {
         int _type = T__98;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:48:7: (
         // 'abstract' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:48:9:
         // 'abstract'
         {
            match("abstract");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__98"

   // $ANTLR start "T__99"
   public final void mT__99() throws RecognitionException {
      try {
         int _type = T__99;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:49:7: (
         // 'final' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:49:9:
         // 'final'
         {
            match("final");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__99"

   // $ANTLR start "T__100"
   public final void mT__100() throws RecognitionException {
      try {
         int _type = T__100;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:50:8: (
         // 'strictfp' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:50:10:
         // 'strictfp'
         {
            match("strictfp");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__100"

   // $ANTLR start "T__101"
   public final void mT__101() throws RecognitionException {
      try {
         int _type = T__101;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:51:8: (
         // 'transient' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:51:10:
         // 'transient'
         {
            match("transient");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__101"

   // $ANTLR start "T__102"
   public final void mT__102() throws RecognitionException {
      try {
         int _type = T__102;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:52:8: (
         // 'volatile' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:52:10:
         // 'volatile'
         {
            match("volatile");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__102"

   // $ANTLR start "T__103"
   public final void mT__103() throws RecognitionException {
      try {
         int _type = T__103;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:53:8: (
         // 'synchronized' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:53:10:
         // 'synchronized'
         {
            match("synchronized");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__103"

   // $ANTLR start "T__104"
   public final void mT__104() throws RecognitionException {
      try {
         int _type = T__104;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:54:8: (
         // 'native' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:54:10:
         // 'native'
         {
            match("native");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "T__104"

   // $ANTLR start "RULE_BOOLEANTYPE"
   public final void mRULE_BOOLEANTYPE() throws RecognitionException {
      try {
         int _type = RULE_BOOLEANTYPE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8523:18: (
         // 'boolean' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8523:20:
         // 'boolean'
         {
            match("boolean");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_BOOLEANTYPE"

   // $ANTLR start "RULE_NUMERICTYPE"
   public final void mRULE_NUMERICTYPE() throws RecognitionException {
      try {
         int _type = RULE_NUMERICTYPE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8525:18: ( (
         // RULE_INTEGRALTYPE | RULE_FLOATINGPOINTTYPE ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8525:20: (
         // RULE_INTEGRALTYPE | RULE_FLOATINGPOINTTYPE )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8525:20:
            // ( RULE_INTEGRALTYPE | RULE_FLOATINGPOINTTYPE )
            int alt1 = 2;
            int LA1_0 = input.LA(1);

            if (((LA1_0 >= 'b' && LA1_0 <= 'c') || LA1_0 == 'i' || LA1_0 == 'l' || LA1_0 == 's')) {
               alt1 = 1;
            }
            else if ((LA1_0 == 'd' || LA1_0 == 'f')) {
               alt1 = 2;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 1, 0, input);

               throw nvae;
            }
            switch (alt1) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8525:21:
               // RULE_INTEGRALTYPE
               {
                  mRULE_INTEGRALTYPE();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8525:39:
               // RULE_FLOATINGPOINTTYPE
               {
                  mRULE_FLOATINGPOINTTYPE();

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

   // $ANTLR end "RULE_NUMERICTYPE"

   // $ANTLR start "RULE_INTEGRALTYPE"
   public final void mRULE_INTEGRALTYPE() throws RecognitionException {
      try {
         int _type = RULE_INTEGRALTYPE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:19: ( (
         // 'byte' | 'short' | 'int' | 'long' | 'char' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:21: (
         // 'byte' | 'short' | 'int' | 'long' | 'char' )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:21:
            // ( 'byte' | 'short' | 'int' | 'long' | 'char' )
            int alt2 = 5;
            switch (input.LA(1)) {
               case 'b' : {
                  alt2 = 1;
               }
                  break;
               case 's' : {
                  alt2 = 2;
               }
                  break;
               case 'i' : {
                  alt2 = 3;
               }
                  break;
               case 'l' : {
                  alt2 = 4;
               }
                  break;
               case 'c' : {
                  alt2 = 5;
               }
                  break;
               default :
                  NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

                  throw nvae;
            }

            switch (alt2) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:22:
               // 'byte'
               {
                  match("byte");


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:29:
               // 'short'
               {
                  match("short");


               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:37:
               // 'int'
               {
                  match("int");


               }
                  break;
               case 4 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:43:
               // 'long'
               {
                  match("long");


               }
                  break;
               case 5 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8527:50:
               // 'char'
               {
                  match("char");


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

   // $ANTLR end "RULE_INTEGRALTYPE"

   // $ANTLR start "RULE_FLOATINGPOINTTYPE"
   public final void mRULE_FLOATINGPOINTTYPE() throws RecognitionException {
      try {
         int _type = RULE_FLOATINGPOINTTYPE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8529:24: ( (
         // 'float' | 'double' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8529:26: (
         // 'float' | 'double' )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8529:26:
            // ( 'float' | 'double' )
            int alt3 = 2;
            int LA3_0 = input.LA(1);

            if ((LA3_0 == 'f')) {
               alt3 = 1;
            }
            else if ((LA3_0 == 'd')) {
               alt3 = 2;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

               throw nvae;
            }
            switch (alt3) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8529:27:
               // 'float'
               {
                  match("float");


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8529:35:
               // 'double'
               {
                  match("double");


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

   // $ANTLR end "RULE_FLOATINGPOINTTYPE"

   // $ANTLR start "RULE_DECIMALINTEGERLITERAL"
   public final void mRULE_DECIMALINTEGERLITERAL() throws RecognitionException {
      try {
         int _type = RULE_DECIMALINTEGERLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8531:28: (
         // RULE_DECIMALNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8531:30:
         // RULE_DECIMALNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_DECIMALNUMERAL();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8531:50:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt4 = 2;
            int LA4_0 = input.LA(1);

            if ((LA4_0 == 'L' || LA4_0 == 'l')) {
               alt4 = 1;
            }
            switch (alt4) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8531:50:
               // RULE_INTEGERTYPESUFFIX
               {
                  mRULE_INTEGERTYPESUFFIX();

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

   // $ANTLR end "RULE_DECIMALINTEGERLITERAL"

   // $ANTLR start "RULE_HEXINTEGERLITERAL"
   public final void mRULE_HEXINTEGERLITERAL() throws RecognitionException {
      try {
         int _type = RULE_HEXINTEGERLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8533:24: (
         // RULE_HEXNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8533:26:
         // RULE_HEXNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_HEXNUMERAL();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8533:42:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt5 = 2;
            int LA5_0 = input.LA(1);

            if ((LA5_0 == 'L' || LA5_0 == 'l')) {
               alt5 = 1;
            }
            switch (alt5) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8533:42:
               // RULE_INTEGERTYPESUFFIX
               {
                  mRULE_INTEGERTYPESUFFIX();

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

   // $ANTLR end "RULE_HEXINTEGERLITERAL"

   // $ANTLR start "RULE_OCTALINTEGERLITERAL"
   public final void mRULE_OCTALINTEGERLITERAL() throws RecognitionException {
      try {
         int _type = RULE_OCTALINTEGERLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8535:26: (
         // RULE_OCTALNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8535:28:
         // RULE_OCTALNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_OCTALNUMERAL();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8535:46:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt6 = 2;
            int LA6_0 = input.LA(1);

            if ((LA6_0 == 'L' || LA6_0 == 'l')) {
               alt6 = 1;
            }
            switch (alt6) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8535:46:
               // RULE_INTEGERTYPESUFFIX
               {
                  mRULE_INTEGERTYPESUFFIX();

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

   // $ANTLR end "RULE_OCTALINTEGERLITERAL"

   // $ANTLR start "RULE_BINARYINTEGERLITERAL"
   public final void mRULE_BINARYINTEGERLITERAL() throws RecognitionException {
      try {
         int _type = RULE_BINARYINTEGERLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8537:27: (
         // RULE_BINARYNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8537:29:
         // RULE_BINARYNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_BINARYNUMERAL();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8537:48:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt7 = 2;
            int LA7_0 = input.LA(1);

            if ((LA7_0 == 'L' || LA7_0 == 'l')) {
               alt7 = 1;
            }
            switch (alt7) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8537:48:
               // RULE_INTEGERTYPESUFFIX
               {
                  mRULE_INTEGERTYPESUFFIX();

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

   // $ANTLR end "RULE_BINARYINTEGERLITERAL"

   // $ANTLR start "RULE_INTEGERTYPESUFFIX"
   public final void mRULE_INTEGERTYPESUFFIX() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8539:33: ( (
         // 'l' | 'L' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8539:35: (
         // 'l' | 'L' )
         {
            if (input.LA(1) == 'L' || input.LA(1) == 'l') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_INTEGERTYPESUFFIX"

   // $ANTLR start "RULE_DECIMALNUMERAL"
   public final void mRULE_DECIMALNUMERAL() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:30: ( (
         // '0' | RULE_NONZERODIGIT ( RULE_DIGITS )? | RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:32: (
         // '0' | RULE_NONZERODIGIT ( RULE_DIGITS )? | RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:32:
            // ( '0' | RULE_NONZERODIGIT ( RULE_DIGITS )? | RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS )
            int alt9 = 3;
            int LA9_0 = input.LA(1);

            if ((LA9_0 == '0')) {
               alt9 = 1;
            }
            else if (((LA9_0 >= '1' && LA9_0 <= '9'))) {
               int LA9_2 = input.LA(2);

               if ((LA9_2 == '_')) {
                  alt9 = 3;
               }
               else {
                  alt9 = 2;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 9, 0, input);

               throw nvae;
            }
            switch (alt9) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:33:
               // '0'
               {
                  match('0');

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:37:
               // RULE_NONZERODIGIT ( RULE_DIGITS )?
               {
                  mRULE_NONZERODIGIT();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:55:
                  // ( RULE_DIGITS )?
                  int alt8 = 2;
                  int LA8_0 = input.LA(1);

                  if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
                     alt8 = 1;
                  }
                  switch (alt8) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:55:
                     // RULE_DIGITS
                     {
                        mRULE_DIGITS();

                     }
                        break;

                  }


               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8541:68:
               // RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS
               {
                  mRULE_NONZERODIGIT();
                  mRULE_UNDERSCORES();
                  mRULE_DIGITS();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_DECIMALNUMERAL"

   // $ANTLR start "RULE_NONZERODIGIT"
   public final void mRULE_NONZERODIGIT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8543:28: (
         // '1' .. '9' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8543:30: '1'
         // .. '9'
         {
            matchRange('1', '9');

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_NONZERODIGIT"

   // $ANTLR start "RULE_DIGITS"
   public final void mRULE_DIGITS() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:22: ( (
         // RULE_DIGIT | RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:24: (
         // RULE_DIGIT | RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:24:
            // ( RULE_DIGIT | RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT )
            int alt11 = 2;
            int LA11_0 = input.LA(1);

            if (((LA11_0 >= '0' && LA11_0 <= '9'))) {
               int LA11_1 = input.LA(2);

               if (((LA11_1 >= '0' && LA11_1 <= '9') || LA11_1 == '_')) {
                  alt11 = 2;
               }
               else {
                  alt11 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 11, 0, input);

               throw nvae;
            }
            switch (alt11) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:25:
               // RULE_DIGIT
               {
                  mRULE_DIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:36:
               // RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT
               {
                  mRULE_DIGIT();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:47:
                  // ( RULE_DIGITSANDUNDERSCORES )?
                  int alt10 = 2;
                  int LA10_0 = input.LA(1);

                  if (((LA10_0 >= '0' && LA10_0 <= '9'))) {
                     int LA10_1 = input.LA(2);

                     if (((LA10_1 >= '0' && LA10_1 <= '9') || LA10_1 == '_')) {
                        alt10 = 1;
                     }
                  }
                  else if ((LA10_0 == '_')) {
                     alt10 = 1;
                  }
                  switch (alt10) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8545:47:
                     // RULE_DIGITSANDUNDERSCORES
                     {
                        mRULE_DIGITSANDUNDERSCORES();

                     }
                        break;

                  }

                  mRULE_DIGIT();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_DIGITS"

   // $ANTLR start "RULE_DIGIT"
   public final void mRULE_DIGIT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8547:21: ( (
         // '0' | RULE_NONZERODIGIT ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8547:23: (
         // '0' | RULE_NONZERODIGIT )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_DIGIT"

   // $ANTLR start "RULE_DIGITSANDUNDERSCORES"
   public final void mRULE_DIGITSANDUNDERSCORES() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8549:36: (
         // RULE_DIGITORUNDERSCORE ( RULE_DIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8549:38:
         // RULE_DIGITORUNDERSCORE ( RULE_DIGITORUNDERSCORE )*
         {
            mRULE_DIGITORUNDERSCORE();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8549:61:
            // ( RULE_DIGITORUNDERSCORE )*
            loop12 : do {
               int alt12 = 2;
               int LA12_0 = input.LA(1);

               if (((LA12_0 >= '0' && LA12_0 <= '9') || LA12_0 == '_')) {
                  alt12 = 1;
               }


               switch (alt12) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8549:61:
                  // RULE_DIGITORUNDERSCORE
                  {
                     mRULE_DIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop12;
               }
            }
            while (true);


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_DIGITSANDUNDERSCORES"

   // $ANTLR start "RULE_DIGITORUNDERSCORE"
   public final void mRULE_DIGITORUNDERSCORE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8551:33: ( (
         // RULE_DIGIT | '_' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8551:35: (
         // RULE_DIGIT | '_' )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || input.LA(1) == '_') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_DIGITORUNDERSCORE"

   // $ANTLR start "RULE_UNDERSCORES"
   public final void mRULE_UNDERSCORES() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8553:27: ( (
         // '_' )+ )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8553:29: (
         // '_' )+
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8553:29:
            // ( '_' )+
            int cnt13 = 0;
            loop13 : do {
               int alt13 = 2;
               int LA13_0 = input.LA(1);

               if ((LA13_0 == '_')) {
                  alt13 = 1;
               }


               switch (alt13) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8553:29:
                  // '_'
                  {
                     match('_');

                  }
                     break;

                  default :
                     if (cnt13 >= 1)
                        break loop13;
                     EarlyExitException eee = new EarlyExitException(13, input);
                     throw eee;
               }
               cnt13++;
            }
            while (true);


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_UNDERSCORES"

   // $ANTLR start "RULE_HEXNUMERAL"
   public final void mRULE_HEXNUMERAL() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8555:26: (
         // '0' ( 'x' | 'X' ) RULE_HEXDIGITS )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8555:28: '0'
         // ( 'x' | 'X' ) RULE_HEXDIGITS
         {
            match('0');
            if (input.LA(1) == 'X' || input.LA(1) == 'x') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }

            mRULE_HEXDIGITS();

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_HEXNUMERAL"

   // $ANTLR start "RULE_HEXDIGITS"
   public final void mRULE_HEXDIGITS() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:25: ( (
         // RULE_HEXDIGIT | RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:27: (
         // RULE_HEXDIGIT | RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:27:
            // ( RULE_HEXDIGIT | RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT )
            int alt15 = 2;
            int LA15_0 = input.LA(1);

            if (((LA15_0 >= '0' && LA15_0 <= '9') || (LA15_0 >= 'A' && LA15_0 <= 'F') || (LA15_0 >= 'a' && LA15_0 <= 'f'))) {
               int LA15_1 = input.LA(2);

               if (((LA15_1 >= '0' && LA15_1 <= '9') || (LA15_1 >= 'A' && LA15_1 <= 'F') || LA15_1 == '_' || (LA15_1 >= 'a' && LA15_1 <= 'f'))) {
                  alt15 = 2;
               }
               else {
                  alt15 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 15, 0, input);

               throw nvae;
            }
            switch (alt15) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:28:
               // RULE_HEXDIGIT
               {
                  mRULE_HEXDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:42:
               // RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT
               {
                  mRULE_HEXDIGIT();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:56:
                  // ( RULE_HEXDIGITSANDUNDERSCORES )?
                  int alt14 = 2;
                  int LA14_0 = input.LA(1);

                  if (((LA14_0 >= '0' && LA14_0 <= '9') || (LA14_0 >= 'A' && LA14_0 <= 'F') || (LA14_0 >= 'a' && LA14_0 <= 'f'))) {
                     int LA14_1 = input.LA(2);

                     if (((LA14_1 >= '0' && LA14_1 <= '9') || (LA14_1 >= 'A' && LA14_1 <= 'F') || LA14_1 == '_' || (LA14_1 >= 'a' && LA14_1 <= 'f'))) {
                        alt14 = 1;
                     }
                  }
                  else if ((LA14_0 == '_')) {
                     alt14 = 1;
                  }
                  switch (alt14) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8557:56:
                     // RULE_HEXDIGITSANDUNDERSCORES
                     {
                        mRULE_HEXDIGITSANDUNDERSCORES();

                     }
                        break;

                  }

                  mRULE_HEXDIGIT();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_HEXDIGITS"

   // $ANTLR start "RULE_HEXDIGIT"
   public final void mRULE_HEXDIGIT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8559:24: ( (
         // '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8559:26: (
         // '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F')
               || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_HEXDIGIT"

   // $ANTLR start "RULE_HEXDIGITSANDUNDERSCORES"
   public final void mRULE_HEXDIGITSANDUNDERSCORES() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8561:39: (
         // RULE_HEXDIGITORUNDERSCORE ( RULE_HEXDIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8561:41:
         // RULE_HEXDIGITORUNDERSCORE ( RULE_HEXDIGITORUNDERSCORE )*
         {
            mRULE_HEXDIGITORUNDERSCORE();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8561:67:
            // ( RULE_HEXDIGITORUNDERSCORE )*
            loop16 : do {
               int alt16 = 2;
               int LA16_0 = input.LA(1);

               if (((LA16_0 >= '0' && LA16_0 <= '9') || (LA16_0 >= 'A' && LA16_0 <= 'F') || LA16_0 == '_' || (LA16_0 >= 'a' && LA16_0 <= 'f'))) {
                  alt16 = 1;
               }


               switch (alt16) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8561:67:
                  // RULE_HEXDIGITORUNDERSCORE
                  {
                     mRULE_HEXDIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop16;
               }
            }
            while (true);


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_HEXDIGITSANDUNDERSCORES"

   // $ANTLR start "RULE_HEXDIGITORUNDERSCORE"
   public final void mRULE_HEXDIGITORUNDERSCORE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8563:36: ( (
         // RULE_HEXDIGIT | '_' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8563:38: (
         // RULE_HEXDIGIT | '_' )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F')
               || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_HEXDIGITORUNDERSCORE"

   // $ANTLR start "RULE_OCTALNUMERAL"
   public final void mRULE_OCTALNUMERAL() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8565:28: ( (
         // '0' RULE_OCTALDIGITS | '0' RULE_UNDERSCORES RULE_OCTALDIGITS ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8565:30: (
         // '0' RULE_OCTALDIGITS | '0' RULE_UNDERSCORES RULE_OCTALDIGITS )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8565:30:
            // ( '0' RULE_OCTALDIGITS | '0' RULE_UNDERSCORES RULE_OCTALDIGITS )
            int alt17 = 2;
            int LA17_0 = input.LA(1);

            if ((LA17_0 == '0')) {
               int LA17_1 = input.LA(2);

               if (((LA17_1 >= '0' && LA17_1 <= '7'))) {
                  alt17 = 1;
               }
               else if ((LA17_1 == '_')) {
                  alt17 = 2;
               }
               else {
                  NoViableAltException nvae = new NoViableAltException("", 17, 1, input);

                  throw nvae;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 17, 0, input);

               throw nvae;
            }
            switch (alt17) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8565:31:
               // '0' RULE_OCTALDIGITS
               {
                  match('0');
                  mRULE_OCTALDIGITS();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8565:52:
               // '0' RULE_UNDERSCORES RULE_OCTALDIGITS
               {
                  match('0');
                  mRULE_UNDERSCORES();
                  mRULE_OCTALDIGITS();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_OCTALNUMERAL"

   // $ANTLR start "RULE_OCTALDIGITS"
   public final void mRULE_OCTALDIGITS() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:27: ( (
         // RULE_OCTALDIGIT | RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:29: (
         // RULE_OCTALDIGIT | RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:29:
            // ( RULE_OCTALDIGIT | RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT )
            int alt19 = 2;
            int LA19_0 = input.LA(1);

            if (((LA19_0 >= '0' && LA19_0 <= '7'))) {
               int LA19_1 = input.LA(2);

               if (((LA19_1 >= '0' && LA19_1 <= '7') || LA19_1 == '_')) {
                  alt19 = 2;
               }
               else {
                  alt19 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 19, 0, input);

               throw nvae;
            }
            switch (alt19) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:30:
               // RULE_OCTALDIGIT
               {
                  mRULE_OCTALDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:46:
               // RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT
               {
                  mRULE_OCTALDIGIT();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:62:
                  // ( RULE_OCTALDIGITSANDUNDERSCORES )?
                  int alt18 = 2;
                  int LA18_0 = input.LA(1);

                  if (((LA18_0 >= '0' && LA18_0 <= '7'))) {
                     int LA18_1 = input.LA(2);

                     if (((LA18_1 >= '0' && LA18_1 <= '7') || LA18_1 == '_')) {
                        alt18 = 1;
                     }
                  }
                  else if ((LA18_0 == '_')) {
                     alt18 = 1;
                  }
                  switch (alt18) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8567:62:
                     // RULE_OCTALDIGITSANDUNDERSCORES
                     {
                        mRULE_OCTALDIGITSANDUNDERSCORES();

                     }
                        break;

                  }

                  mRULE_OCTALDIGIT();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_OCTALDIGITS"

   // $ANTLR start "RULE_OCTALDIGIT"
   public final void mRULE_OCTALDIGIT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8569:26: (
         // '0' .. '7' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8569:28: '0'
         // .. '7'
         {
            matchRange('0', '7');

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_OCTALDIGIT"

   // $ANTLR start "RULE_OCTALDIGITSANDUNDERSCORES"
   public final void mRULE_OCTALDIGITSANDUNDERSCORES() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8571:41: (
         // RULE_OCTALDIGITORUNDERSCORE ( RULE_OCTALDIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8571:43:
         // RULE_OCTALDIGITORUNDERSCORE ( RULE_OCTALDIGITORUNDERSCORE )*
         {
            mRULE_OCTALDIGITORUNDERSCORE();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8571:71:
            // ( RULE_OCTALDIGITORUNDERSCORE )*
            loop20 : do {
               int alt20 = 2;
               int LA20_0 = input.LA(1);

               if (((LA20_0 >= '0' && LA20_0 <= '7') || LA20_0 == '_')) {
                  alt20 = 1;
               }


               switch (alt20) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8571:71:
                  // RULE_OCTALDIGITORUNDERSCORE
                  {
                     mRULE_OCTALDIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop20;
               }
            }
            while (true);


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_OCTALDIGITSANDUNDERSCORES"

   // $ANTLR start "RULE_OCTALDIGITORUNDERSCORE"
   public final void mRULE_OCTALDIGITORUNDERSCORE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8573:38: ( (
         // RULE_OCTALDIGIT | '_' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8573:40: (
         // RULE_OCTALDIGIT | '_' )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '7') || input.LA(1) == '_') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_OCTALDIGITORUNDERSCORE"

   // $ANTLR start "RULE_BINARYNUMERAL"
   public final void mRULE_BINARYNUMERAL() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8575:29: (
         // '0' ( 'b' | 'B' ) RULE_BINARYDIGITS )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8575:31: '0'
         // ( 'b' | 'B' ) RULE_BINARYDIGITS
         {
            match('0');
            if (input.LA(1) == 'B' || input.LA(1) == 'b') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }

            mRULE_BINARYDIGITS();

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYNUMERAL"

   // $ANTLR start "RULE_BINARYDIGITS"
   public final void mRULE_BINARYDIGITS() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:28: ( (
         // RULE_BINARYDIGIT | RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:30: (
         // RULE_BINARYDIGIT | RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:30:
            // ( RULE_BINARYDIGIT | RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT )
            int alt22 = 2;
            int LA22_0 = input.LA(1);

            if (((LA22_0 >= '0' && LA22_0 <= '1'))) {
               int LA22_1 = input.LA(2);

               if (((LA22_1 >= '0' && LA22_1 <= '1') || LA22_1 == '_')) {
                  alt22 = 2;
               }
               else {
                  alt22 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 22, 0, input);

               throw nvae;
            }
            switch (alt22) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:31:
               // RULE_BINARYDIGIT
               {
                  mRULE_BINARYDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:48:
               // RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT
               {
                  mRULE_BINARYDIGIT();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:65:
                  // ( RULE_BINARYDIGITSANDUNDERSCORES )?
                  int alt21 = 2;
                  int LA21_0 = input.LA(1);

                  if (((LA21_0 >= '0' && LA21_0 <= '1'))) {
                     int LA21_1 = input.LA(2);

                     if (((LA21_1 >= '0' && LA21_1 <= '1') || LA21_1 == '_')) {
                        alt21 = 1;
                     }
                  }
                  else if ((LA21_0 == '_')) {
                     alt21 = 1;
                  }
                  switch (alt21) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8577:65:
                     // RULE_BINARYDIGITSANDUNDERSCORES
                     {
                        mRULE_BINARYDIGITSANDUNDERSCORES();

                     }
                        break;

                  }

                  mRULE_BINARYDIGIT();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYDIGITS"

   // $ANTLR start "RULE_BINARYDIGIT"
   public final void mRULE_BINARYDIGIT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8579:27: ( (
         // '0' | '1' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8579:29: (
         // '0' | '1' )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '1')) {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYDIGIT"

   // $ANTLR start "RULE_BINARYDIGITSANDUNDERSCORES"
   public final void mRULE_BINARYDIGITSANDUNDERSCORES() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8581:42: (
         // RULE_BINARYDIGITORUNDERSCORE ( RULE_BINARYDIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8581:44:
         // RULE_BINARYDIGITORUNDERSCORE ( RULE_BINARYDIGITORUNDERSCORE )*
         {
            mRULE_BINARYDIGITORUNDERSCORE();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8581:73:
            // ( RULE_BINARYDIGITORUNDERSCORE )*
            loop23 : do {
               int alt23 = 2;
               int LA23_0 = input.LA(1);

               if (((LA23_0 >= '0' && LA23_0 <= '1') || LA23_0 == '_')) {
                  alt23 = 1;
               }


               switch (alt23) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8581:73:
                  // RULE_BINARYDIGITORUNDERSCORE
                  {
                     mRULE_BINARYDIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop23;
               }
            }
            while (true);


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYDIGITSANDUNDERSCORES"

   // $ANTLR start "RULE_BINARYDIGITORUNDERSCORE"
   public final void mRULE_BINARYDIGITORUNDERSCORE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8583:39: ( (
         // RULE_BINARYDIGIT | '_' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8583:41: (
         // RULE_BINARYDIGIT | '_' )
         {
            if ((input.LA(1) >= '0' && input.LA(1) <= '1') || input.LA(1) == '_') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYDIGITORUNDERSCORE"

   // $ANTLR start "RULE_DECIMALFLOATINGPOINTLITERAL"
   public final void mRULE_DECIMALFLOATINGPOINTLITERAL() throws RecognitionException {
      try {
         int _type = RULE_DECIMALFLOATINGPOINTLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:34: ( (
         // RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS (
         // RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )? |
         // RULE_DIGITS RULE_FLOATTYPESUFFIX ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:36: (
         // RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS (
         // RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )? |
         // RULE_DIGITS RULE_FLOATTYPESUFFIX )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:36:
            // ( RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS (
            // RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )?
            // | RULE_DIGITS RULE_FLOATTYPESUFFIX )
            int alt30 = 4;
            alt30 = dfa30.predict(input);
            switch (alt30) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:37:
               // RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )?
               {
                  mRULE_DIGITS();
                  match('.');
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:53:
                  // ( RULE_DIGITS )?
                  int alt24 = 2;
                  int LA24_0 = input.LA(1);

                  if (((LA24_0 >= '0' && LA24_0 <= '9'))) {
                     alt24 = 1;
                  }
                  switch (alt24) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:53:
                     // RULE_DIGITS
                     {
                        mRULE_DIGITS();

                     }
                        break;

                  }

                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:66:
                  // ( RULE_EXPONENTPART )?
                  int alt25 = 2;
                  int LA25_0 = input.LA(1);

                  if ((LA25_0 == 'E' || LA25_0 == 'e')) {
                     alt25 = 1;
                  }
                  switch (alt25) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:66:
                     // RULE_EXPONENTPART
                     {
                        mRULE_EXPONENTPART();

                     }
                        break;

                  }

                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:85:
                  // ( RULE_FLOATTYPESUFFIX )?
                  int alt26 = 2;
                  int LA26_0 = input.LA(1);

                  if ((LA26_0 == 'D' || LA26_0 == 'F' || LA26_0 == 'd' || LA26_0 == 'f')) {
                     alt26 = 1;
                  }
                  switch (alt26) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:85:
                     // RULE_FLOATTYPESUFFIX
                     {
                        mRULE_FLOATTYPESUFFIX();

                     }
                        break;

                  }


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:107:
               // '.' RULE_DIGITS ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )?
               {
                  match('.');
                  mRULE_DIGITS();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:123:
                  // ( RULE_EXPONENTPART )?
                  int alt27 = 2;
                  int LA27_0 = input.LA(1);

                  if ((LA27_0 == 'E' || LA27_0 == 'e')) {
                     alt27 = 1;
                  }
                  switch (alt27) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:123:
                     // RULE_EXPONENTPART
                     {
                        mRULE_EXPONENTPART();

                     }
                        break;

                  }

                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:142:
                  // ( RULE_FLOATTYPESUFFIX )?
                  int alt28 = 2;
                  int LA28_0 = input.LA(1);

                  if ((LA28_0 == 'D' || LA28_0 == 'F' || LA28_0 == 'd' || LA28_0 == 'f')) {
                     alt28 = 1;
                  }
                  switch (alt28) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:142:
                     // RULE_FLOATTYPESUFFIX
                     {
                        mRULE_FLOATTYPESUFFIX();

                     }
                        break;

                  }


               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:164:
               // RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )?
               {
                  mRULE_DIGITS();
                  mRULE_EXPONENTPART();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:194:
                  // ( RULE_FLOATTYPESUFFIX )?
                  int alt29 = 2;
                  int LA29_0 = input.LA(1);

                  if ((LA29_0 == 'D' || LA29_0 == 'F' || LA29_0 == 'd' || LA29_0 == 'f')) {
                     alt29 = 1;
                  }
                  switch (alt29) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:194:
                     // RULE_FLOATTYPESUFFIX
                     {
                        mRULE_FLOATTYPESUFFIX();

                     }
                        break;

                  }


               }
                  break;
               case 4 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8585:216:
               // RULE_DIGITS RULE_FLOATTYPESUFFIX
               {
                  mRULE_DIGITS();
                  mRULE_FLOATTYPESUFFIX();

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

   // $ANTLR end "RULE_DECIMALFLOATINGPOINTLITERAL"

   // $ANTLR start "RULE_EXPONENTPART"
   public final void mRULE_EXPONENTPART() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8587:28: (
         // RULE_EXPONENTINDICATOR RULE_SIGNEDINTEGER )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8587:30:
         // RULE_EXPONENTINDICATOR RULE_SIGNEDINTEGER
         {
            mRULE_EXPONENTINDICATOR();
            mRULE_SIGNEDINTEGER();

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_EXPONENTPART"

   // $ANTLR start "RULE_EXPONENTINDICATOR"
   public final void mRULE_EXPONENTINDICATOR() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8589:33: ( (
         // 'e' | 'E' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8589:35: (
         // 'e' | 'E' )
         {
            if (input.LA(1) == 'E' || input.LA(1) == 'e') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_EXPONENTINDICATOR"

   // $ANTLR start "RULE_SIGNEDINTEGER"
   public final void mRULE_SIGNEDINTEGER() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8591:29: ( (
         // RULE_SIGN )? RULE_DIGITS )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8591:31: (
         // RULE_SIGN )? RULE_DIGITS
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8591:31:
            // ( RULE_SIGN )?
            int alt31 = 2;
            int LA31_0 = input.LA(1);

            if ((LA31_0 == '+' || LA31_0 == '-')) {
               alt31 = 1;
            }
            switch (alt31) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8591:31:
               // RULE_SIGN
               {
                  mRULE_SIGN();

               }
                  break;

            }

            mRULE_DIGITS();

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_SIGNEDINTEGER"

   // $ANTLR start "RULE_SIGN"
   public final void mRULE_SIGN() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8593:20: ( (
         // '+' | '-' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8593:22: (
         // '+' | '-' )
         {
            if (input.LA(1) == '+' || input.LA(1) == '-') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_SIGN"

   // $ANTLR start "RULE_FLOATTYPESUFFIX"
   public final void mRULE_FLOATTYPESUFFIX() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8595:31: ( (
         // 'f' | 'F' | 'd' | 'D' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8595:33: (
         // 'f' | 'F' | 'd' | 'D' )
         {
            if (input.LA(1) == 'D' || input.LA(1) == 'F' || input.LA(1) == 'd' || input.LA(1) == 'f') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_FLOATTYPESUFFIX"

   // $ANTLR start "RULE_HEXADECIMALFLOATINGPOINTLITERAL"
   public final void mRULE_HEXADECIMALFLOATINGPOINTLITERAL() throws RecognitionException {
      try {
         int _type = RULE_HEXADECIMALFLOATINGPOINTLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8597:38: (
         // RULE_HEXSIGNIFICAND RULE_BINARYEXPONENT ( RULE_FLOATTYPESUFFIX )? )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8597:40:
         // RULE_HEXSIGNIFICAND RULE_BINARYEXPONENT ( RULE_FLOATTYPESUFFIX )?
         {
            mRULE_HEXSIGNIFICAND();
            mRULE_BINARYEXPONENT();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8597:80:
            // ( RULE_FLOATTYPESUFFIX )?
            int alt32 = 2;
            int LA32_0 = input.LA(1);

            if ((LA32_0 == 'D' || LA32_0 == 'F' || LA32_0 == 'd' || LA32_0 == 'f')) {
               alt32 = 1;
            }
            switch (alt32) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8597:80:
               // RULE_FLOATTYPESUFFIX
               {
                  mRULE_FLOATTYPESUFFIX();

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

   // $ANTLR end "RULE_HEXADECIMALFLOATINGPOINTLITERAL"

   // $ANTLR start "RULE_HEXSIGNIFICAND"
   public final void mRULE_HEXSIGNIFICAND() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:30: ( (
         // RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:32: (
         // RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:32:
            // ( RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ )
            int alt36 = 2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:33:
               // RULE_HEXNUMERAL ( '.' )?
               {
                  mRULE_HEXNUMERAL();
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:49:
                  // ( '.' )?
                  int alt33 = 2;
                  int LA33_0 = input.LA(1);

                  if ((LA33_0 == '.')) {
                     alt33 = 1;
                  }
                  switch (alt33) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:49:
                     // '.'
                     {
                        match('.');

                     }
                        break;

                  }


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:54:
               // '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+
               {
                  match('0');
                  if (input.LA(1) == 'X' || input.LA(1) == 'x') {
                     input.consume();

                  }
                  else {
                     MismatchedSetException mse = new MismatchedSetException(null, input);
                     recover(mse);
                     throw mse;
                  }

                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:68:
                  // ( RULE_HEXDIGIT )*
                  loop34 : do {
                     int alt34 = 2;
                     int LA34_0 = input.LA(1);

                     if (((LA34_0 >= '0' && LA34_0 <= '9') || (LA34_0 >= 'A' && LA34_0 <= 'F') || (LA34_0 >= 'a' && LA34_0 <= 'f'))) {
                        alt34 = 1;
                     }


                     switch (alt34) {
                        case 1 :
                        // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:68:
                        // RULE_HEXDIGIT
                        {
                           mRULE_HEXDIGIT();

                        }
                           break;

                        default :
                           break loop34;
                     }
                  }
                  while (true);

                  match('.');
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:87:
                  // ( RULE_HEXDIGIT )+
                  int cnt35 = 0;
                  loop35 : do {
                     int alt35 = 2;
                     int LA35_0 = input.LA(1);

                     if (((LA35_0 >= '0' && LA35_0 <= '9') || (LA35_0 >= 'A' && LA35_0 <= 'F') || (LA35_0 >= 'a' && LA35_0 <= 'f'))) {
                        alt35 = 1;
                     }


                     switch (alt35) {
                        case 1 :
                        // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8599:87:
                        // RULE_HEXDIGIT
                        {
                           mRULE_HEXDIGIT();

                        }
                           break;

                        default :
                           if (cnt35 >= 1)
                              break loop35;
                           EarlyExitException eee = new EarlyExitException(35, input);
                           throw eee;
                     }
                     cnt35++;
                  }
                  while (true);


               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_HEXSIGNIFICAND"

   // $ANTLR start "RULE_BINARYEXPONENT"
   public final void mRULE_BINARYEXPONENT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8601:30: (
         // RULE_BINARYEXPONENTINDICATOR RULE_SIGNEDINTEGER )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8601:32:
         // RULE_BINARYEXPONENTINDICATOR RULE_SIGNEDINTEGER
         {
            mRULE_BINARYEXPONENTINDICATOR();
            mRULE_SIGNEDINTEGER();

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYEXPONENT"

   // $ANTLR start "RULE_BINARYEXPONENTINDICATOR"
   public final void mRULE_BINARYEXPONENTINDICATOR() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8603:39: ( (
         // 'p' | 'P' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8603:41: (
         // 'p' | 'P' )
         {
            if (input.LA(1) == 'P' || input.LA(1) == 'p') {
               input.consume();

            }
            else {
               MismatchedSetException mse = new MismatchedSetException(null, input);
               recover(mse);
               throw mse;
            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_BINARYEXPONENTINDICATOR"

   // $ANTLR start "RULE_TRUE"
   public final void mRULE_TRUE() throws RecognitionException {
      try {
         int _type = RULE_TRUE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8605:11: (
         // 'true' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8605:13:
         // 'true'
         {
            match("true");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_TRUE"

   // $ANTLR start "RULE_FALSE"
   public final void mRULE_FALSE() throws RecognitionException {
      try {
         int _type = RULE_FALSE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8607:12: (
         // 'false' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8607:14:
         // 'false'
         {
            match("false");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_FALSE"

   // $ANTLR start "RULE_CHARACTER"
   public final void mRULE_CHARACTER() throws RecognitionException {
      try {
         int _type = RULE_CHARACTER;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8609:16: (
         // '\\'' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\'' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8609:18:
         // '\\'' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\''
         {
            match('\'');
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8609:23:
            // ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) )
            int alt37 = 2;
            int LA37_0 = input.LA(1);

            if ((LA37_0 == '\\')) {
               alt37 = 1;
            }
            else if (((LA37_0 >= '\u0000' && LA37_0 <= '&') || (LA37_0 >= '(' && LA37_0 <= '[') || (LA37_0 >= ']' && LA37_0 <= '\uFFFF'))) {
               alt37 = 2;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 37, 0, input);

               throw nvae;
            }
            switch (alt37) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8609:24:
               // RULE_ESCAPESEQUENCE
               {
                  mRULE_ESCAPESEQUENCE();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8609:44:
               // ~ ( ( '\\'' | '\\\\' ) )
               {
                  if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '[')
                     || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                     input.consume();

                  }
                  else {
                     MismatchedSetException mse = new MismatchedSetException(null, input);
                     recover(mse);
                     throw mse;
                  }


               }
                  break;

            }

            match('\'');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_CHARACTER"

   // $ANTLR start "RULE_STRING"
   public final void mRULE_STRING() throws RecognitionException {
      try {
         int _type = RULE_STRING;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8611:13: (
         // '\"' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8611:15:
         // '\"' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
         {
            match('\"');
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8611:19:
            // ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )*
            loop38 : do {
               int alt38 = 3;
               int LA38_0 = input.LA(1);

               if ((LA38_0 == '\\')) {
                  alt38 = 1;
               }
               else if (((LA38_0 >= '\u0000' && LA38_0 <= '!') || (LA38_0 >= '#' && LA38_0 <= '[') || (LA38_0 >= ']' && LA38_0 <= '\uFFFF'))) {
                  alt38 = 2;
               }


               switch (alt38) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8611:20:
                  // RULE_ESCAPESEQUENCE
                  {
                     mRULE_ESCAPESEQUENCE();

                  }
                     break;
                  case 2 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8611:40:
                  // ~ ( ( '\\\\' | '\"' ) )
                  {
                     if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '[')
                        || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                        input.consume();

                     }
                     else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                     }


                  }
                     break;

                  default :
                     break loop38;
               }
            }
            while (true);

            match('\"');

         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_STRING"

   // $ANTLR start "RULE_ESCAPESEQUENCE"
   public final void mRULE_ESCAPESEQUENCE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8613:30: ( (
         // '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODEESCAPE | RULE_OCTALESCAPE ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8613:32: (
         // '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODEESCAPE | RULE_OCTALESCAPE )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8613:32:
            // ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODEESCAPE | RULE_OCTALESCAPE
            // )
            int alt39 = 3;
            int LA39_0 = input.LA(1);

            if ((LA39_0 == '\\')) {
               switch (input.LA(2)) {
                  case '\"' :
                  case '\'' :
                  case '\\' :
                  case 'b' :
                  case 'f' :
                  case 'n' :
                  case 'r' :
                  case 't' : {
                     alt39 = 1;
                  }
                     break;
                  case 'u' : {
                     alt39 = 2;
                  }
                     break;
                  case '0' :
                  case '1' :
                  case '2' :
                  case '3' :
                  case '4' :
                  case '5' :
                  case '6' :
                  case '7' : {
                     alt39 = 3;
                  }
                     break;
                  default :
                     NoViableAltException nvae = new NoViableAltException("", 39, 1, input);

                     throw nvae;
               }

            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 39, 0, input);

               throw nvae;
            }
            switch (alt39) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8613:33:
               // '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
               {
                  match('\\');
                  if (input.LA(1) == '\"' || input.LA(1) == '\'' || input.LA(1) == '\\' || input.LA(1) == 'b'
                     || input.LA(1) == 'f' || input.LA(1) == 'n' || input.LA(1) == 'r' || input.LA(1) == 't') {
                     input.consume();

                  }
                  else {
                     MismatchedSetException mse = new MismatchedSetException(null, input);
                     recover(mse);
                     throw mse;
                  }


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8613:74:
               // RULE_UNICODEESCAPE
               {
                  mRULE_UNICODEESCAPE();

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8613:93:
               // RULE_OCTALESCAPE
               {
                  mRULE_OCTALESCAPE();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_ESCAPESEQUENCE"

   // $ANTLR start "RULE_OCTALESCAPE"
   public final void mRULE_OCTALESCAPE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8615:27: ( (
         // '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\'
         // RULE_OCTALDIGIT ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8615:29: (
         // '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\'
         // RULE_OCTALDIGIT )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8615:29:
            // ( '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT |
            // '\\\\' RULE_OCTALDIGIT )
            int alt40 = 3;
            int LA40_0 = input.LA(1);

            if ((LA40_0 == '\\')) {
               int LA40_1 = input.LA(2);

               if (((LA40_1 >= '0' && LA40_1 <= '3'))) {
                  int LA40_2 = input.LA(3);

                  if (((LA40_2 >= '0' && LA40_2 <= '7'))) {
                     int LA40_5 = input.LA(4);

                     if (((LA40_5 >= '0' && LA40_5 <= '7'))) {
                        alt40 = 1;
                     }
                     else {
                        alt40 = 2;
                     }
                  }
                  else {
                     alt40 = 3;
                  }
               }
               else if (((LA40_1 >= '4' && LA40_1 <= '7'))) {
                  int LA40_3 = input.LA(3);

                  if (((LA40_3 >= '0' && LA40_3 <= '7'))) {
                     alt40 = 2;
                  }
                  else {
                     alt40 = 3;
                  }
               }
               else {
                  NoViableAltException nvae = new NoViableAltException("", 40, 1, input);

                  throw nvae;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 40, 0, input);

               throw nvae;
            }
            switch (alt40) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8615:30:
               // '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT
               {
                  match('\\');
                  mRULE_ZEROTOTHREE();
                  mRULE_OCTALDIGIT();
                  mRULE_OCTALDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8615:84:
               // '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT
               {
                  match('\\');
                  mRULE_OCTALDIGIT();
                  mRULE_OCTALDIGIT();

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8615:121:
               // '\\\\' RULE_OCTALDIGIT
               {
                  match('\\');
                  mRULE_OCTALDIGIT();

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_OCTALESCAPE"

   // $ANTLR start "RULE_ZEROTOTHREE"
   public final void mRULE_ZEROTOTHREE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8617:27: (
         // '0' .. '3' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8617:29: '0'
         // .. '3'
         {
            matchRange('0', '3');

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_ZEROTOTHREE"

   // $ANTLR start "RULE_UNICODEESCAPE"
   public final void mRULE_UNICODEESCAPE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8619:29: (
         // '\\\\' RULE_UNICODEMARKER RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8619:31:
         // '\\\\' RULE_UNICODEMARKER RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT
         {
            match('\\');
            mRULE_UNICODEMARKER();
            mRULE_HEXDIGIT();
            mRULE_HEXDIGIT();
            mRULE_HEXDIGIT();
            mRULE_HEXDIGIT();

         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_UNICODEESCAPE"

   // $ANTLR start "RULE_UNICODEMARKER"
   public final void mRULE_UNICODEMARKER() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8621:29: (
         // 'u' ( 'u' )* )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8621:31: 'u'
         // ( 'u' )*
         {
            match('u');
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8621:35:
            // ( 'u' )*
            loop41 : do {
               int alt41 = 2;
               int LA41_0 = input.LA(1);

               if ((LA41_0 == 'u')) {
                  alt41 = 1;
               }


               switch (alt41) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8621:35:
                  // 'u'
                  {
                     match('u');

                  }
                     break;

                  default :
                     break loop41;
               }
            }
            while (true);


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_UNICODEMARKER"

   // $ANTLR start "RULE_NULL"
   public final void mRULE_NULL() throws RecognitionException {
      try {
         int _type = RULE_NULL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8623:11: (
         // 'null' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8623:13:
         // 'null'
         {
            match("null");


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_NULL"

   // $ANTLR start "RULE_IDENTIFIER"
   public final void mRULE_IDENTIFIER() throws RecognitionException {
      try {
         int _type = RULE_IDENTIFIER;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8625:17: (
         // RULE_JAVALETTER ( RULE_JAVALETTERORDIGIT )* )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8625:19:
         // RULE_JAVALETTER ( RULE_JAVALETTERORDIGIT )*
         {
            mRULE_JAVALETTER();
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8625:35:
            // ( RULE_JAVALETTERORDIGIT )*
            loop42 : do {
               int alt42 = 2;
               int LA42_0 = input.LA(1);

               if (((LA42_0 >= '\u0000' && LA42_0 <= '\b') || (LA42_0 >= '\u000E' && LA42_0 <= '\u001B')
                  || LA42_0 == '$' || (LA42_0 >= '0' && LA42_0 <= '9') || (LA42_0 >= 'A' && LA42_0 <= 'Z')
                  || LA42_0 == '_' || (LA42_0 >= 'a' && LA42_0 <= 'z') || (LA42_0 >= '\u007F' && LA42_0 <= '\u009F')
                  || (LA42_0 >= '\u00A2' && LA42_0 <= '\u00A5') || LA42_0 == '\u00AA' || LA42_0 == '\u00AD'
                  || LA42_0 == '\u00B5' || LA42_0 == '\u00BA' || (LA42_0 >= '\u00C0' && LA42_0 <= '\u00D6')
                  || (LA42_0 >= '\u00D8' && LA42_0 <= '\u00F6') || (LA42_0 >= '\u00F8' && LA42_0 <= '\u0236')
                  || (LA42_0 >= '\u0250' && LA42_0 <= '\u02C1') || (LA42_0 >= '\u02C6' && LA42_0 <= '\u02D1')
                  || (LA42_0 >= '\u02E0' && LA42_0 <= '\u02E4') || LA42_0 == '\u02EE'
                  || (LA42_0 >= '\u0300' && LA42_0 <= '\u0357') || (LA42_0 >= '\u035D' && LA42_0 <= '\u036F')
                  || LA42_0 == '\u037A' || LA42_0 == '\u0386' || (LA42_0 >= '\u0388' && LA42_0 <= '\u038A')
                  || LA42_0 == '\u038C' || (LA42_0 >= '\u038E' && LA42_0 <= '\u03A1')
                  || (LA42_0 >= '\u03A3' && LA42_0 <= '\u03CE') || (LA42_0 >= '\u03D0' && LA42_0 <= '\u03F5')
                  || (LA42_0 >= '\u03F7' && LA42_0 <= '\u03FB') || (LA42_0 >= '\u0400' && LA42_0 <= '\u0481')
                  || (LA42_0 >= '\u0483' && LA42_0 <= '\u0486') || (LA42_0 >= '\u048A' && LA42_0 <= '\u04CE')
                  || (LA42_0 >= '\u04D0' && LA42_0 <= '\u04F5') || (LA42_0 >= '\u04F8' && LA42_0 <= '\u04F9')
                  || (LA42_0 >= '\u0500' && LA42_0 <= '\u050F') || (LA42_0 >= '\u0531' && LA42_0 <= '\u0556')
                  || LA42_0 == '\u0559' || (LA42_0 >= '\u0561' && LA42_0 <= '\u0587')
                  || (LA42_0 >= '\u0591' && LA42_0 <= '\u05A1') || (LA42_0 >= '\u05A3' && LA42_0 <= '\u05B9')
                  || (LA42_0 >= '\u05BB' && LA42_0 <= '\u05BD') || LA42_0 == '\u05BF'
                  || (LA42_0 >= '\u05C1' && LA42_0 <= '\u05C2') || LA42_0 == '\u05C4'
                  || (LA42_0 >= '\u05D0' && LA42_0 <= '\u05EA') || (LA42_0 >= '\u05F0' && LA42_0 <= '\u05F2')
                  || (LA42_0 >= '\u0600' && LA42_0 <= '\u0603') || (LA42_0 >= '\u0610' && LA42_0 <= '\u0615')
                  || (LA42_0 >= '\u0621' && LA42_0 <= '\u063A') || (LA42_0 >= '\u0640' && LA42_0 <= '\u0658')
                  || (LA42_0 >= '\u0660' && LA42_0 <= '\u0669') || (LA42_0 >= '\u066E' && LA42_0 <= '\u06D3')
                  || (LA42_0 >= '\u06D5' && LA42_0 <= '\u06DD') || (LA42_0 >= '\u06DF' && LA42_0 <= '\u06E8')
                  || (LA42_0 >= '\u06EA' && LA42_0 <= '\u06FC') || LA42_0 == '\u06FF'
                  || (LA42_0 >= '\u070F' && LA42_0 <= '\u074A') || (LA42_0 >= '\u074D' && LA42_0 <= '\u074F')
                  || (LA42_0 >= '\u0780' && LA42_0 <= '\u07B1') || (LA42_0 >= '\u0901' && LA42_0 <= '\u0939')
                  || (LA42_0 >= '\u093C' && LA42_0 <= '\u094D') || (LA42_0 >= '\u0950' && LA42_0 <= '\u0954')
                  || (LA42_0 >= '\u0958' && LA42_0 <= '\u0963') || (LA42_0 >= '\u0966' && LA42_0 <= '\u096F')
                  || (LA42_0 >= '\u0981' && LA42_0 <= '\u0983') || (LA42_0 >= '\u0985' && LA42_0 <= '\u098C')
                  || (LA42_0 >= '\u098F' && LA42_0 <= '\u0990') || (LA42_0 >= '\u0993' && LA42_0 <= '\u09A8')
                  || (LA42_0 >= '\u09AA' && LA42_0 <= '\u09B0') || LA42_0 == '\u09B2'
                  || (LA42_0 >= '\u09B6' && LA42_0 <= '\u09B9') || (LA42_0 >= '\u09BC' && LA42_0 <= '\u09C4')
                  || (LA42_0 >= '\u09C7' && LA42_0 <= '\u09C8') || (LA42_0 >= '\u09CB' && LA42_0 <= '\u09CD')
                  || LA42_0 == '\u09D7' || (LA42_0 >= '\u09DC' && LA42_0 <= '\u09DD')
                  || (LA42_0 >= '\u09DF' && LA42_0 <= '\u09E3') || (LA42_0 >= '\u09E6' && LA42_0 <= '\u09F3')
                  || (LA42_0 >= '\u0A01' && LA42_0 <= '\u0A03') || (LA42_0 >= '\u0A05' && LA42_0 <= '\u0A0A')
                  || (LA42_0 >= '\u0A0F' && LA42_0 <= '\u0A10') || (LA42_0 >= '\u0A13' && LA42_0 <= '\u0A28')
                  || (LA42_0 >= '\u0A2A' && LA42_0 <= '\u0A30') || (LA42_0 >= '\u0A32' && LA42_0 <= '\u0A33')
                  || (LA42_0 >= '\u0A35' && LA42_0 <= '\u0A36') || (LA42_0 >= '\u0A38' && LA42_0 <= '\u0A39')
                  || LA42_0 == '\u0A3C' || (LA42_0 >= '\u0A3E' && LA42_0 <= '\u0A42')
                  || (LA42_0 >= '\u0A47' && LA42_0 <= '\u0A48') || (LA42_0 >= '\u0A4B' && LA42_0 <= '\u0A4D')
                  || (LA42_0 >= '\u0A59' && LA42_0 <= '\u0A5C') || LA42_0 == '\u0A5E'
                  || (LA42_0 >= '\u0A66' && LA42_0 <= '\u0A74') || (LA42_0 >= '\u0A81' && LA42_0 <= '\u0A83')
                  || (LA42_0 >= '\u0A85' && LA42_0 <= '\u0A8D') || (LA42_0 >= '\u0A8F' && LA42_0 <= '\u0A91')
                  || (LA42_0 >= '\u0A93' && LA42_0 <= '\u0AA8') || (LA42_0 >= '\u0AAA' && LA42_0 <= '\u0AB0')
                  || (LA42_0 >= '\u0AB2' && LA42_0 <= '\u0AB3') || (LA42_0 >= '\u0AB5' && LA42_0 <= '\u0AB9')
                  || (LA42_0 >= '\u0ABC' && LA42_0 <= '\u0AC5') || (LA42_0 >= '\u0AC7' && LA42_0 <= '\u0AC9')
                  || (LA42_0 >= '\u0ACB' && LA42_0 <= '\u0ACD') || LA42_0 == '\u0AD0'
                  || (LA42_0 >= '\u0AE0' && LA42_0 <= '\u0AE3') || (LA42_0 >= '\u0AE6' && LA42_0 <= '\u0AEF')
                  || LA42_0 == '\u0AF1' || (LA42_0 >= '\u0B01' && LA42_0 <= '\u0B03')
                  || (LA42_0 >= '\u0B05' && LA42_0 <= '\u0B0C') || (LA42_0 >= '\u0B0F' && LA42_0 <= '\u0B10')
                  || (LA42_0 >= '\u0B13' && LA42_0 <= '\u0B28') || (LA42_0 >= '\u0B2A' && LA42_0 <= '\u0B30')
                  || (LA42_0 >= '\u0B32' && LA42_0 <= '\u0B33') || (LA42_0 >= '\u0B35' && LA42_0 <= '\u0B39')
                  || (LA42_0 >= '\u0B3C' && LA42_0 <= '\u0B43') || (LA42_0 >= '\u0B47' && LA42_0 <= '\u0B48')
                  || (LA42_0 >= '\u0B4B' && LA42_0 <= '\u0B4D') || (LA42_0 >= '\u0B56' && LA42_0 <= '\u0B57')
                  || (LA42_0 >= '\u0B5C' && LA42_0 <= '\u0B5D') || (LA42_0 >= '\u0B5F' && LA42_0 <= '\u0B61')
                  || (LA42_0 >= '\u0B66' && LA42_0 <= '\u0B6F') || LA42_0 == '\u0B71'
                  || (LA42_0 >= '\u0B82' && LA42_0 <= '\u0B83') || (LA42_0 >= '\u0B85' && LA42_0 <= '\u0B8A')
                  || (LA42_0 >= '\u0B8E' && LA42_0 <= '\u0B90') || (LA42_0 >= '\u0B92' && LA42_0 <= '\u0B95')
                  || (LA42_0 >= '\u0B99' && LA42_0 <= '\u0B9A') || LA42_0 == '\u0B9C'
                  || (LA42_0 >= '\u0B9E' && LA42_0 <= '\u0B9F') || (LA42_0 >= '\u0BA3' && LA42_0 <= '\u0BA4')
                  || (LA42_0 >= '\u0BA8' && LA42_0 <= '\u0BAA') || (LA42_0 >= '\u0BAE' && LA42_0 <= '\u0BB5')
                  || (LA42_0 >= '\u0BB7' && LA42_0 <= '\u0BB9') || (LA42_0 >= '\u0BBE' && LA42_0 <= '\u0BC2')
                  || (LA42_0 >= '\u0BC6' && LA42_0 <= '\u0BC8') || (LA42_0 >= '\u0BCA' && LA42_0 <= '\u0BCD')
                  || LA42_0 == '\u0BD7' || (LA42_0 >= '\u0BE7' && LA42_0 <= '\u0BEF') || LA42_0 == '\u0BF9'
                  || (LA42_0 >= '\u0C01' && LA42_0 <= '\u0C03') || (LA42_0 >= '\u0C05' && LA42_0 <= '\u0C0C')
                  || (LA42_0 >= '\u0C0E' && LA42_0 <= '\u0C10') || (LA42_0 >= '\u0C12' && LA42_0 <= '\u0C28')
                  || (LA42_0 >= '\u0C2A' && LA42_0 <= '\u0C33') || (LA42_0 >= '\u0C35' && LA42_0 <= '\u0C39')
                  || (LA42_0 >= '\u0C3E' && LA42_0 <= '\u0C44') || (LA42_0 >= '\u0C46' && LA42_0 <= '\u0C48')
                  || (LA42_0 >= '\u0C4A' && LA42_0 <= '\u0C4D') || (LA42_0 >= '\u0C55' && LA42_0 <= '\u0C56')
                  || (LA42_0 >= '\u0C60' && LA42_0 <= '\u0C61') || (LA42_0 >= '\u0C66' && LA42_0 <= '\u0C6F')
                  || (LA42_0 >= '\u0C82' && LA42_0 <= '\u0C83') || (LA42_0 >= '\u0C85' && LA42_0 <= '\u0C8C')
                  || (LA42_0 >= '\u0C8E' && LA42_0 <= '\u0C90') || (LA42_0 >= '\u0C92' && LA42_0 <= '\u0CA8')
                  || (LA42_0 >= '\u0CAA' && LA42_0 <= '\u0CB3') || (LA42_0 >= '\u0CB5' && LA42_0 <= '\u0CB9')
                  || (LA42_0 >= '\u0CBC' && LA42_0 <= '\u0CC4') || (LA42_0 >= '\u0CC6' && LA42_0 <= '\u0CC8')
                  || (LA42_0 >= '\u0CCA' && LA42_0 <= '\u0CCD') || (LA42_0 >= '\u0CD5' && LA42_0 <= '\u0CD6')
                  || LA42_0 == '\u0CDE' || (LA42_0 >= '\u0CE0' && LA42_0 <= '\u0CE1')
                  || (LA42_0 >= '\u0CE6' && LA42_0 <= '\u0CEF') || (LA42_0 >= '\u0D02' && LA42_0 <= '\u0D03')
                  || (LA42_0 >= '\u0D05' && LA42_0 <= '\u0D0C') || (LA42_0 >= '\u0D0E' && LA42_0 <= '\u0D10')
                  || (LA42_0 >= '\u0D12' && LA42_0 <= '\u0D28') || (LA42_0 >= '\u0D2A' && LA42_0 <= '\u0D39')
                  || (LA42_0 >= '\u0D3E' && LA42_0 <= '\u0D43') || (LA42_0 >= '\u0D46' && LA42_0 <= '\u0D48')
                  || (LA42_0 >= '\u0D4A' && LA42_0 <= '\u0D4D') || LA42_0 == '\u0D57'
                  || (LA42_0 >= '\u0D60' && LA42_0 <= '\u0D61') || (LA42_0 >= '\u0D66' && LA42_0 <= '\u0D6F')
                  || (LA42_0 >= '\u0D82' && LA42_0 <= '\u0D83') || (LA42_0 >= '\u0D85' && LA42_0 <= '\u0D96')
                  || (LA42_0 >= '\u0D9A' && LA42_0 <= '\u0DB1') || (LA42_0 >= '\u0DB3' && LA42_0 <= '\u0DBB')
                  || LA42_0 == '\u0DBD' || (LA42_0 >= '\u0DC0' && LA42_0 <= '\u0DC6') || LA42_0 == '\u0DCA'
                  || (LA42_0 >= '\u0DCF' && LA42_0 <= '\u0DD4') || LA42_0 == '\u0DD6'
                  || (LA42_0 >= '\u0DD8' && LA42_0 <= '\u0DDF') || (LA42_0 >= '\u0DF2' && LA42_0 <= '\u0DF3')
                  || (LA42_0 >= '\u0E01' && LA42_0 <= '\u0E3A') || (LA42_0 >= '\u0E3F' && LA42_0 <= '\u0E4E')
                  || (LA42_0 >= '\u0E50' && LA42_0 <= '\u0E59') || (LA42_0 >= '\u0E81' && LA42_0 <= '\u0E82')
                  || LA42_0 == '\u0E84' || (LA42_0 >= '\u0E87' && LA42_0 <= '\u0E88') || LA42_0 == '\u0E8A'
                  || LA42_0 == '\u0E8D' || (LA42_0 >= '\u0E94' && LA42_0 <= '\u0E97')
                  || (LA42_0 >= '\u0E99' && LA42_0 <= '\u0E9F') || (LA42_0 >= '\u0EA1' && LA42_0 <= '\u0EA3')
                  || LA42_0 == '\u0EA5' || LA42_0 == '\u0EA7' || (LA42_0 >= '\u0EAA' && LA42_0 <= '\u0EAB')
                  || (LA42_0 >= '\u0EAD' && LA42_0 <= '\u0EB9') || (LA42_0 >= '\u0EBB' && LA42_0 <= '\u0EBD')
                  || (LA42_0 >= '\u0EC0' && LA42_0 <= '\u0EC4') || LA42_0 == '\u0EC6'
                  || (LA42_0 >= '\u0EC8' && LA42_0 <= '\u0ECD') || (LA42_0 >= '\u0ED0' && LA42_0 <= '\u0ED9')
                  || (LA42_0 >= '\u0EDC' && LA42_0 <= '\u0EDD') || LA42_0 == '\u0F00'
                  || (LA42_0 >= '\u0F18' && LA42_0 <= '\u0F19') || (LA42_0 >= '\u0F20' && LA42_0 <= '\u0F29')
                  || LA42_0 == '\u0F35' || LA42_0 == '\u0F37' || LA42_0 == '\u0F39'
                  || (LA42_0 >= '\u0F3E' && LA42_0 <= '\u0F47') || (LA42_0 >= '\u0F49' && LA42_0 <= '\u0F6A')
                  || (LA42_0 >= '\u0F71' && LA42_0 <= '\u0F84') || (LA42_0 >= '\u0F86' && LA42_0 <= '\u0F8B')
                  || (LA42_0 >= '\u0F90' && LA42_0 <= '\u0F97') || (LA42_0 >= '\u0F99' && LA42_0 <= '\u0FBC')
                  || LA42_0 == '\u0FC6' || (LA42_0 >= '\u1000' && LA42_0 <= '\u1021')
                  || (LA42_0 >= '\u1023' && LA42_0 <= '\u1027') || (LA42_0 >= '\u1029' && LA42_0 <= '\u102A')
                  || (LA42_0 >= '\u102C' && LA42_0 <= '\u1032') || (LA42_0 >= '\u1036' && LA42_0 <= '\u1039')
                  || (LA42_0 >= '\u1040' && LA42_0 <= '\u1049') || (LA42_0 >= '\u1050' && LA42_0 <= '\u1059')
                  || (LA42_0 >= '\u10A0' && LA42_0 <= '\u10C5') || (LA42_0 >= '\u10D0' && LA42_0 <= '\u10F8')
                  || (LA42_0 >= '\u1100' && LA42_0 <= '\u1159') || (LA42_0 >= '\u115F' && LA42_0 <= '\u11A2')
                  || (LA42_0 >= '\u11A8' && LA42_0 <= '\u11F9') || (LA42_0 >= '\u1200' && LA42_0 <= '\u1206')
                  || (LA42_0 >= '\u1208' && LA42_0 <= '\u1246') || LA42_0 == '\u1248'
                  || (LA42_0 >= '\u124A' && LA42_0 <= '\u124D') || (LA42_0 >= '\u1250' && LA42_0 <= '\u1256')
                  || LA42_0 == '\u1258' || (LA42_0 >= '\u125A' && LA42_0 <= '\u125D')
                  || (LA42_0 >= '\u1260' && LA42_0 <= '\u1286') || LA42_0 == '\u1288'
                  || (LA42_0 >= '\u128A' && LA42_0 <= '\u128D') || (LA42_0 >= '\u1290' && LA42_0 <= '\u12AE')
                  || LA42_0 == '\u12B0' || (LA42_0 >= '\u12B2' && LA42_0 <= '\u12B5')
                  || (LA42_0 >= '\u12B8' && LA42_0 <= '\u12BE') || LA42_0 == '\u12C0'
                  || (LA42_0 >= '\u12C2' && LA42_0 <= '\u12C5') || (LA42_0 >= '\u12C8' && LA42_0 <= '\u12CE')
                  || (LA42_0 >= '\u12D0' && LA42_0 <= '\u12D6') || (LA42_0 >= '\u12D8' && LA42_0 <= '\u12EE')
                  || (LA42_0 >= '\u12F0' && LA42_0 <= '\u130E') || LA42_0 == '\u1310'
                  || (LA42_0 >= '\u1312' && LA42_0 <= '\u1315') || (LA42_0 >= '\u1318' && LA42_0 <= '\u131E')
                  || (LA42_0 >= '\u1320' && LA42_0 <= '\u1346') || (LA42_0 >= '\u1348' && LA42_0 <= '\u135A')
                  || (LA42_0 >= '\u1369' && LA42_0 <= '\u1371') || (LA42_0 >= '\u13A0' && LA42_0 <= '\u13F4')
                  || (LA42_0 >= '\u1401' && LA42_0 <= '\u166C') || (LA42_0 >= '\u166F' && LA42_0 <= '\u1676')
                  || (LA42_0 >= '\u1681' && LA42_0 <= '\u169A') || (LA42_0 >= '\u16A0' && LA42_0 <= '\u16EA')
                  || (LA42_0 >= '\u16EE' && LA42_0 <= '\u16F0') || (LA42_0 >= '\u1700' && LA42_0 <= '\u170C')
                  || (LA42_0 >= '\u170E' && LA42_0 <= '\u1714') || (LA42_0 >= '\u1720' && LA42_0 <= '\u1734')
                  || (LA42_0 >= '\u1740' && LA42_0 <= '\u1753') || (LA42_0 >= '\u1760' && LA42_0 <= '\u176C')
                  || (LA42_0 >= '\u176E' && LA42_0 <= '\u1770') || (LA42_0 >= '\u1772' && LA42_0 <= '\u1773')
                  || (LA42_0 >= '\u1780' && LA42_0 <= '\u17D3') || LA42_0 == '\u17D7'
                  || (LA42_0 >= '\u17DB' && LA42_0 <= '\u17DD') || (LA42_0 >= '\u17E0' && LA42_0 <= '\u17E9')
                  || (LA42_0 >= '\u180B' && LA42_0 <= '\u180D') || (LA42_0 >= '\u1810' && LA42_0 <= '\u1819')
                  || (LA42_0 >= '\u1820' && LA42_0 <= '\u1877') || (LA42_0 >= '\u1880' && LA42_0 <= '\u18A9')
                  || (LA42_0 >= '\u1900' && LA42_0 <= '\u191C') || (LA42_0 >= '\u1920' && LA42_0 <= '\u192B')
                  || (LA42_0 >= '\u1930' && LA42_0 <= '\u193B') || (LA42_0 >= '\u1946' && LA42_0 <= '\u196D')
                  || (LA42_0 >= '\u1970' && LA42_0 <= '\u1974') || (LA42_0 >= '\u1D00' && LA42_0 <= '\u1D6B')
                  || (LA42_0 >= '\u1E00' && LA42_0 <= '\u1E9B') || (LA42_0 >= '\u1EA0' && LA42_0 <= '\u1EF9')
                  || (LA42_0 >= '\u1F00' && LA42_0 <= '\u1F15') || (LA42_0 >= '\u1F18' && LA42_0 <= '\u1F1D')
                  || (LA42_0 >= '\u1F20' && LA42_0 <= '\u1F45') || (LA42_0 >= '\u1F48' && LA42_0 <= '\u1F4D')
                  || (LA42_0 >= '\u1F50' && LA42_0 <= '\u1F57') || LA42_0 == '\u1F59' || LA42_0 == '\u1F5B'
                  || LA42_0 == '\u1F5D' || (LA42_0 >= '\u1F5F' && LA42_0 <= '\u1F7D')
                  || (LA42_0 >= '\u1F80' && LA42_0 <= '\u1FB4') || (LA42_0 >= '\u1FB6' && LA42_0 <= '\u1FBC')
                  || LA42_0 == '\u1FBE' || (LA42_0 >= '\u1FC2' && LA42_0 <= '\u1FC4')
                  || (LA42_0 >= '\u1FC6' && LA42_0 <= '\u1FCC') || (LA42_0 >= '\u1FD0' && LA42_0 <= '\u1FD3')
                  || (LA42_0 >= '\u1FD6' && LA42_0 <= '\u1FDB') || (LA42_0 >= '\u1FE0' && LA42_0 <= '\u1FEC')
                  || (LA42_0 >= '\u1FF2' && LA42_0 <= '\u1FF4') || (LA42_0 >= '\u1FF6' && LA42_0 <= '\u1FFC')
                  || (LA42_0 >= '\u200C' && LA42_0 <= '\u200F') || (LA42_0 >= '\u202A' && LA42_0 <= '\u202E')
                  || (LA42_0 >= '\u203F' && LA42_0 <= '\u2040') || LA42_0 == '\u2054'
                  || (LA42_0 >= '\u2060' && LA42_0 <= '\u2063') || (LA42_0 >= '\u206A' && LA42_0 <= '\u206F')
                  || LA42_0 == '\u2071' || LA42_0 == '\u207F' || (LA42_0 >= '\u20A0' && LA42_0 <= '\u20B1')
                  || (LA42_0 >= '\u20D0' && LA42_0 <= '\u20DC') || LA42_0 == '\u20E1'
                  || (LA42_0 >= '\u20E5' && LA42_0 <= '\u20EA') || LA42_0 == '\u2102' || LA42_0 == '\u2107'
                  || (LA42_0 >= '\u210A' && LA42_0 <= '\u2113') || LA42_0 == '\u2115'
                  || (LA42_0 >= '\u2119' && LA42_0 <= '\u211D') || LA42_0 == '\u2124' || LA42_0 == '\u2126'
                  || LA42_0 == '\u2128' || (LA42_0 >= '\u212A' && LA42_0 <= '\u212D')
                  || (LA42_0 >= '\u212F' && LA42_0 <= '\u2131') || (LA42_0 >= '\u2133' && LA42_0 <= '\u2139')
                  || (LA42_0 >= '\u213D' && LA42_0 <= '\u213F') || (LA42_0 >= '\u2145' && LA42_0 <= '\u2149')
                  || (LA42_0 >= '\u2160' && LA42_0 <= '\u2183') || (LA42_0 >= '\u3005' && LA42_0 <= '\u3007')
                  || (LA42_0 >= '\u3021' && LA42_0 <= '\u302F') || (LA42_0 >= '\u3031' && LA42_0 <= '\u3035')
                  || (LA42_0 >= '\u3038' && LA42_0 <= '\u303C') || (LA42_0 >= '\u3041' && LA42_0 <= '\u3096')
                  || (LA42_0 >= '\u3099' && LA42_0 <= '\u309A') || (LA42_0 >= '\u309D' && LA42_0 <= '\u309F')
                  || (LA42_0 >= '\u30A1' && LA42_0 <= '\u30FF') || (LA42_0 >= '\u3105' && LA42_0 <= '\u312C')
                  || (LA42_0 >= '\u3131' && LA42_0 <= '\u318E') || (LA42_0 >= '\u31A0' && LA42_0 <= '\u31B7')
                  || (LA42_0 >= '\u31F0' && LA42_0 <= '\u31FF') || (LA42_0 >= '\u3400' && LA42_0 <= '\u4DB5')
                  || (LA42_0 >= '\u4E00' && LA42_0 <= '\u9FA5') || (LA42_0 >= '\uA000' && LA42_0 <= '\uA48C')
                  || (LA42_0 >= '\uAC00' && LA42_0 <= '\uD7A3') || (LA42_0 >= '\uD800' && LA42_0 <= '\uDBFF')
                  || (LA42_0 >= '\uF900' && LA42_0 <= '\uFA2D') || (LA42_0 >= '\uFA30' && LA42_0 <= '\uFA6A')
                  || (LA42_0 >= '\uFB00' && LA42_0 <= '\uFB06') || (LA42_0 >= '\uFB13' && LA42_0 <= '\uFB17')
                  || (LA42_0 >= '\uFB1D' && LA42_0 <= '\uFB28') || (LA42_0 >= '\uFB2A' && LA42_0 <= '\uFB36')
                  || (LA42_0 >= '\uFB38' && LA42_0 <= '\uFB3C') || LA42_0 == '\uFB3E'
                  || (LA42_0 >= '\uFB40' && LA42_0 <= '\uFB41') || (LA42_0 >= '\uFB43' && LA42_0 <= '\uFB44')
                  || (LA42_0 >= '\uFB46' && LA42_0 <= '\uFBB1') || (LA42_0 >= '\uFBD3' && LA42_0 <= '\uFD3D')
                  || (LA42_0 >= '\uFD50' && LA42_0 <= '\uFD8F') || (LA42_0 >= '\uFD92' && LA42_0 <= '\uFDC7')
                  || (LA42_0 >= '\uFDF0' && LA42_0 <= '\uFDFC') || (LA42_0 >= '\uFE00' && LA42_0 <= '\uFE0F')
                  || (LA42_0 >= '\uFE20' && LA42_0 <= '\uFE23') || (LA42_0 >= '\uFE33' && LA42_0 <= '\uFE34')
                  || (LA42_0 >= '\uFE4D' && LA42_0 <= '\uFE4F') || LA42_0 == '\uFE69'
                  || (LA42_0 >= '\uFE70' && LA42_0 <= '\uFE74') || (LA42_0 >= '\uFE76' && LA42_0 <= '\uFEFC')
                  || LA42_0 == '\uFEFF' || LA42_0 == '\uFF04' || (LA42_0 >= '\uFF10' && LA42_0 <= '\uFF19')
                  || (LA42_0 >= '\uFF21' && LA42_0 <= '\uFF3A') || LA42_0 == '\uFF3F'
                  || (LA42_0 >= '\uFF41' && LA42_0 <= '\uFF5A') || (LA42_0 >= '\uFF65' && LA42_0 <= '\uFFBE')
                  || (LA42_0 >= '\uFFC2' && LA42_0 <= '\uFFC7') || (LA42_0 >= '\uFFCA' && LA42_0 <= '\uFFCF')
                  || (LA42_0 >= '\uFFD2' && LA42_0 <= '\uFFD7') || (LA42_0 >= '\uFFDA' && LA42_0 <= '\uFFDC')
                  || (LA42_0 >= '\uFFE0' && LA42_0 <= '\uFFE1') || (LA42_0 >= '\uFFE5' && LA42_0 <= '\uFFE6') || (LA42_0 >= '\uFFF9' && LA42_0 <= '\uFFFB'))) {
                  alt42 = 1;
               }


               switch (alt42) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8625:35:
                  // RULE_JAVALETTERORDIGIT
                  {
                     mRULE_JAVALETTERORDIGIT();

                  }
                     break;

                  default :
                     break loop42;
               }
            }
            while (true);


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_IDENTIFIER"

   // $ANTLR start "RULE_JAVALETTER"
   public final void mRULE_JAVALETTER() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:26: ( (
         // '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0'
         // .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' ..
         // '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C'
         // | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' |
         // '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' |
         // '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0' ..
         // '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u064A' | '\\u066E' ..
         // '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u06EE' .. '\\u06EF' | '\\u06FA'
         // .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' | '\\u074D' .. '\\u074F' | '\\u0780' ..
         // '\\u07A5' | '\\u07B1' | '\\u0904' .. '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0985'
         // .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' |
         // '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' ..
         // '\\u09F3' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' ..
         // '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' ..
         // '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93'
         // .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' |
         // '\\u0AD0' | '\\u0AE0' .. '\\u0AE1' | '\\u0AF1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13'
         // .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' |
         // '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E'
         // .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' |
         // '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' |
         // '\\u0BF9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' ..
         // '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' ..
         // '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE'
         // | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' |
         // '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' |
         // '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' ..
         // '\\u0E33' | '\\u0E3F' .. '\\u0E46' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A'
         // | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' |
         // '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0'
         // .. '\\u0EC4' | '\\u0EC6' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F40' .. '\\u0F47' | '\\u0F49' ..
         // '\\u0F6A' | '\\u0F88' .. '\\u0F8B' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' ..
         // '\\u102A' | '\\u1050' .. '\\u1055' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F8' | '\\u1100' ..
         // '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' .. '\\u1206' | '\\u1208' ..
         // '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D'
         // | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' .. '\\u12AE' | '\\u12B0' |
         // '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' .. '\\u12C5' | '\\u12C8' ..
         // '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' | '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312'
         // .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' .. '\\u1346' | '\\u1348' .. '\\u135A' | '\\u13A0' ..
         // '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' ..
         // '\\u16EA' | '\\u16EE' .. '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' ..
         // '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' ..
         // '\\u17B3' | '\\u17D7' | '\\u17DB' .. '\\u17DC' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u1900'
         // .. '\\u191C' | '\\u1950' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' .. '\\u1D6B' | '\\u1E00' ..
         // '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' ..
         // '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F'
         // .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' |
         // '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' |
         // '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2071' | '\\u207F'
         // | '\\u20A0' .. '\\u20B1' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' ..
         // '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133'
         // .. '\\u2139' | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' ..
         // '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' ..
         // '\\u3096' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' ..
         // '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' ..
         // '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' ..
         // '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' | '\\uFB2A'
         // .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' .. '\\uFB44' |
         // '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' |
         // '\\uFDF0' .. '\\uFDFC' | '\\uFE33' .. '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' ..
         // '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF04' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A'
         // | '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' |
         // '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' | '\\uD800' .. '\\uDBFF' '\\uDC00'
         // .. '\\uDFFF' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:28: (
         // '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0'
         // .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' ..
         // '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C'
         // | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' |
         // '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' |
         // '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0' ..
         // '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u064A' | '\\u066E' ..
         // '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u06EE' .. '\\u06EF' | '\\u06FA'
         // .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' | '\\u074D' .. '\\u074F' | '\\u0780' ..
         // '\\u07A5' | '\\u07B1' | '\\u0904' .. '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0985'
         // .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' |
         // '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' ..
         // '\\u09F3' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' ..
         // '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' ..
         // '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93'
         // .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' |
         // '\\u0AD0' | '\\u0AE0' .. '\\u0AE1' | '\\u0AF1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13'
         // .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' |
         // '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E'
         // .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' |
         // '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' |
         // '\\u0BF9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' ..
         // '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' ..
         // '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE'
         // | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' |
         // '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' |
         // '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' ..
         // '\\u0E33' | '\\u0E3F' .. '\\u0E46' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A'
         // | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' |
         // '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0'
         // .. '\\u0EC4' | '\\u0EC6' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F40' .. '\\u0F47' | '\\u0F49' ..
         // '\\u0F6A' | '\\u0F88' .. '\\u0F8B' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' ..
         // '\\u102A' | '\\u1050' .. '\\u1055' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F8' | '\\u1100' ..
         // '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' .. '\\u1206' | '\\u1208' ..
         // '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D'
         // | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' .. '\\u12AE' | '\\u12B0' |
         // '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' .. '\\u12C5' | '\\u12C8' ..
         // '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' | '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312'
         // .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' .. '\\u1346' | '\\u1348' .. '\\u135A' | '\\u13A0' ..
         // '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' ..
         // '\\u16EA' | '\\u16EE' .. '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' ..
         // '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' ..
         // '\\u17B3' | '\\u17D7' | '\\u17DB' .. '\\u17DC' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u1900'
         // .. '\\u191C' | '\\u1950' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' .. '\\u1D6B' | '\\u1E00' ..
         // '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' ..
         // '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F'
         // .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' |
         // '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' |
         // '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2071' | '\\u207F'
         // | '\\u20A0' .. '\\u20B1' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' ..
         // '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133'
         // .. '\\u2139' | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' ..
         // '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' ..
         // '\\u3096' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' ..
         // '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' ..
         // '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' ..
         // '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' | '\\uFB2A'
         // .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' .. '\\uFB44' |
         // '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' |
         // '\\uFDF0' .. '\\uFDFC' | '\\uFE33' .. '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' ..
         // '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF04' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A'
         // | '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' |
         // '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' | '\\uD800' .. '\\uDBFF' '\\uDC00'
         // .. '\\uDFFF' )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:28:
            // ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' |
            // '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' |
            // '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' ..
            // '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' |
            // '\\u03F7' .. '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' |
            // '\\u04F8' .. '\\u04F9' | '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' ..
            // '\\u0587' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' ..
            // '\\u064A' | '\\u066E' .. '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' |
            // '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' |
            // '\\u074D' .. '\\u074F' | '\\u0780' .. '\\u07A5' | '\\u07B1' | '\\u0904' .. '\\u0939' | '\\u093D' |
            // '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' ..
            // '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09DC' ..
            // '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F3' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' ..
            // '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' ..
            // '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' |
            // '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' |
            // '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE1' |
            // '\\u0AF1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' ..
            // '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' |
            // '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' |
            // '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' ..
            // '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0BF9' |
            // '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' |
            // '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' |
            // '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE' |
            // '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' |
            // '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' |
            // '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' ..
            // '\\u0E33' | '\\u0E3F' .. '\\u0E46' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' |
            // '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' |
            // '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' |
            // '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F40' ..
            // '\\u0F47' | '\\u0F49' .. '\\u0F6A' | '\\u0F88' .. '\\u0F8B' | '\\u1000' .. '\\u1021' | '\\u1023' ..
            // '\\u1027' | '\\u1029' .. '\\u102A' | '\\u1050' .. '\\u1055' | '\\u10A0' .. '\\u10C5' | '\\u10D0' ..
            // '\\u10F8' | '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' ..
            // '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' |
            // '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' .. '\\u128D' |
            // '\\u1290' .. '\\u12AE' | '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' |
            // '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' |
            // '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' ..
            // '\\u1346' | '\\u1348' .. '\\u135A' | '\\u13A0' .. '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' ..
            // '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' .. '\\u16F0' | '\\u1700' ..
            // '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' .. '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' ..
            // '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' .. '\\u17B3' | '\\u17D7' | '\\u17DB' .. '\\u17DC' |
            // '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u1900' .. '\\u191C' | '\\u1950' .. '\\u196D' |
            // '\\u1970' .. '\\u1974' | '\\u1D00' .. '\\u1D6B' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' |
            // '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' |
            // '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' ..
            // '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' |
            // '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' |
            // '\\u1FF6' .. '\\u1FFC' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2071' | '\\u207F' | '\\u20A0' ..
            // '\\u20B1' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211D' |
            // '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133' ..
            // '\\u2139' | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' ..
            // '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' ..
            // '\\u3096' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' ..
            // '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' ..
            // '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' ..
            // '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' |
            // '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' ..
            // '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' ..
            // '\\uFDC7' | '\\uFDF0' .. '\\uFDFC' | '\\uFE33' .. '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' |
            // '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF04' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' |
            // '\\uFF41' .. '\\uFF5A' | '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' |
            // '\\uFFD2' .. '\\uFFD7' | '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' |
            // '\\uD800' .. '\\uDBFF' '\\uDC00' .. '\\uDFFF' )
            int alt43 = 294;
            int LA43_0 = input.LA(1);

            if ((LA43_0 == '$')) {
               alt43 = 1;
            }
            else if (((LA43_0 >= 'A' && LA43_0 <= 'Z'))) {
               alt43 = 2;
            }
            else if ((LA43_0 == '_')) {
               alt43 = 3;
            }
            else if (((LA43_0 >= 'a' && LA43_0 <= 'z'))) {
               alt43 = 4;
            }
            else if (((LA43_0 >= '\u00A2' && LA43_0 <= '\u00A5'))) {
               alt43 = 5;
            }
            else if ((LA43_0 == '\u00AA')) {
               alt43 = 6;
            }
            else if ((LA43_0 == '\u00B5')) {
               alt43 = 7;
            }
            else if ((LA43_0 == '\u00BA')) {
               alt43 = 8;
            }
            else if (((LA43_0 >= '\u00C0' && LA43_0 <= '\u00D6'))) {
               alt43 = 9;
            }
            else if (((LA43_0 >= '\u00D8' && LA43_0 <= '\u00F6'))) {
               alt43 = 10;
            }
            else if (((LA43_0 >= '\u00F8' && LA43_0 <= '\u0236'))) {
               alt43 = 11;
            }
            else if (((LA43_0 >= '\u0250' && LA43_0 <= '\u02C1'))) {
               alt43 = 12;
            }
            else if (((LA43_0 >= '\u02C6' && LA43_0 <= '\u02D1'))) {
               alt43 = 13;
            }
            else if (((LA43_0 >= '\u02E0' && LA43_0 <= '\u02E4'))) {
               alt43 = 14;
            }
            else if ((LA43_0 == '\u02EE')) {
               alt43 = 15;
            }
            else if ((LA43_0 == '\u037A')) {
               alt43 = 16;
            }
            else if ((LA43_0 == '\u0386')) {
               alt43 = 17;
            }
            else if (((LA43_0 >= '\u0388' && LA43_0 <= '\u038A'))) {
               alt43 = 18;
            }
            else if ((LA43_0 == '\u038C')) {
               alt43 = 19;
            }
            else if (((LA43_0 >= '\u038E' && LA43_0 <= '\u03A1'))) {
               alt43 = 20;
            }
            else if (((LA43_0 >= '\u03A3' && LA43_0 <= '\u03CE'))) {
               alt43 = 21;
            }
            else if (((LA43_0 >= '\u03D0' && LA43_0 <= '\u03F5'))) {
               alt43 = 22;
            }
            else if (((LA43_0 >= '\u03F7' && LA43_0 <= '\u03FB'))) {
               alt43 = 23;
            }
            else if (((LA43_0 >= '\u0400' && LA43_0 <= '\u0481'))) {
               alt43 = 24;
            }
            else if (((LA43_0 >= '\u048A' && LA43_0 <= '\u04CE'))) {
               alt43 = 25;
            }
            else if (((LA43_0 >= '\u04D0' && LA43_0 <= '\u04F5'))) {
               alt43 = 26;
            }
            else if (((LA43_0 >= '\u04F8' && LA43_0 <= '\u04F9'))) {
               alt43 = 27;
            }
            else if (((LA43_0 >= '\u0500' && LA43_0 <= '\u050F'))) {
               alt43 = 28;
            }
            else if (((LA43_0 >= '\u0531' && LA43_0 <= '\u0556'))) {
               alt43 = 29;
            }
            else if ((LA43_0 == '\u0559')) {
               alt43 = 30;
            }
            else if (((LA43_0 >= '\u0561' && LA43_0 <= '\u0587'))) {
               alt43 = 31;
            }
            else if (((LA43_0 >= '\u05D0' && LA43_0 <= '\u05EA'))) {
               alt43 = 32;
            }
            else if (((LA43_0 >= '\u05F0' && LA43_0 <= '\u05F2'))) {
               alt43 = 33;
            }
            else if (((LA43_0 >= '\u0621' && LA43_0 <= '\u063A'))) {
               alt43 = 34;
            }
            else if (((LA43_0 >= '\u0640' && LA43_0 <= '\u064A'))) {
               alt43 = 35;
            }
            else if (((LA43_0 >= '\u066E' && LA43_0 <= '\u066F'))) {
               alt43 = 36;
            }
            else if (((LA43_0 >= '\u0671' && LA43_0 <= '\u06D3'))) {
               alt43 = 37;
            }
            else if ((LA43_0 == '\u06D5')) {
               alt43 = 38;
            }
            else if (((LA43_0 >= '\u06E5' && LA43_0 <= '\u06E6'))) {
               alt43 = 39;
            }
            else if (((LA43_0 >= '\u06EE' && LA43_0 <= '\u06EF'))) {
               alt43 = 40;
            }
            else if (((LA43_0 >= '\u06FA' && LA43_0 <= '\u06FC'))) {
               alt43 = 41;
            }
            else if ((LA43_0 == '\u06FF')) {
               alt43 = 42;
            }
            else if ((LA43_0 == '\u0710')) {
               alt43 = 43;
            }
            else if (((LA43_0 >= '\u0712' && LA43_0 <= '\u072F'))) {
               alt43 = 44;
            }
            else if (((LA43_0 >= '\u074D' && LA43_0 <= '\u074F'))) {
               alt43 = 45;
            }
            else if (((LA43_0 >= '\u0780' && LA43_0 <= '\u07A5'))) {
               alt43 = 46;
            }
            else if ((LA43_0 == '\u07B1')) {
               alt43 = 47;
            }
            else if (((LA43_0 >= '\u0904' && LA43_0 <= '\u0939'))) {
               alt43 = 48;
            }
            else if ((LA43_0 == '\u093D')) {
               alt43 = 49;
            }
            else if ((LA43_0 == '\u0950')) {
               alt43 = 50;
            }
            else if (((LA43_0 >= '\u0958' && LA43_0 <= '\u0961'))) {
               alt43 = 51;
            }
            else if (((LA43_0 >= '\u0985' && LA43_0 <= '\u098C'))) {
               alt43 = 52;
            }
            else if (((LA43_0 >= '\u098F' && LA43_0 <= '\u0990'))) {
               alt43 = 53;
            }
            else if (((LA43_0 >= '\u0993' && LA43_0 <= '\u09A8'))) {
               alt43 = 54;
            }
            else if (((LA43_0 >= '\u09AA' && LA43_0 <= '\u09B0'))) {
               alt43 = 55;
            }
            else if ((LA43_0 == '\u09B2')) {
               alt43 = 56;
            }
            else if (((LA43_0 >= '\u09B6' && LA43_0 <= '\u09B9'))) {
               alt43 = 57;
            }
            else if ((LA43_0 == '\u09BD')) {
               alt43 = 58;
            }
            else if (((LA43_0 >= '\u09DC' && LA43_0 <= '\u09DD'))) {
               alt43 = 59;
            }
            else if (((LA43_0 >= '\u09DF' && LA43_0 <= '\u09E1'))) {
               alt43 = 60;
            }
            else if (((LA43_0 >= '\u09F0' && LA43_0 <= '\u09F3'))) {
               alt43 = 61;
            }
            else if (((LA43_0 >= '\u0A05' && LA43_0 <= '\u0A0A'))) {
               alt43 = 62;
            }
            else if (((LA43_0 >= '\u0A0F' && LA43_0 <= '\u0A10'))) {
               alt43 = 63;
            }
            else if (((LA43_0 >= '\u0A13' && LA43_0 <= '\u0A28'))) {
               alt43 = 64;
            }
            else if (((LA43_0 >= '\u0A2A' && LA43_0 <= '\u0A30'))) {
               alt43 = 65;
            }
            else if (((LA43_0 >= '\u0A32' && LA43_0 <= '\u0A33'))) {
               alt43 = 66;
            }
            else if (((LA43_0 >= '\u0A35' && LA43_0 <= '\u0A36'))) {
               alt43 = 67;
            }
            else if (((LA43_0 >= '\u0A38' && LA43_0 <= '\u0A39'))) {
               alt43 = 68;
            }
            else if (((LA43_0 >= '\u0A59' && LA43_0 <= '\u0A5C'))) {
               alt43 = 69;
            }
            else if ((LA43_0 == '\u0A5E')) {
               alt43 = 70;
            }
            else if (((LA43_0 >= '\u0A72' && LA43_0 <= '\u0A74'))) {
               alt43 = 71;
            }
            else if (((LA43_0 >= '\u0A85' && LA43_0 <= '\u0A8D'))) {
               alt43 = 72;
            }
            else if (((LA43_0 >= '\u0A8F' && LA43_0 <= '\u0A91'))) {
               alt43 = 73;
            }
            else if (((LA43_0 >= '\u0A93' && LA43_0 <= '\u0AA8'))) {
               alt43 = 74;
            }
            else if (((LA43_0 >= '\u0AAA' && LA43_0 <= '\u0AB0'))) {
               alt43 = 75;
            }
            else if (((LA43_0 >= '\u0AB2' && LA43_0 <= '\u0AB3'))) {
               alt43 = 76;
            }
            else if (((LA43_0 >= '\u0AB5' && LA43_0 <= '\u0AB9'))) {
               alt43 = 77;
            }
            else if ((LA43_0 == '\u0ABD')) {
               alt43 = 78;
            }
            else if ((LA43_0 == '\u0AD0')) {
               alt43 = 79;
            }
            else if (((LA43_0 >= '\u0AE0' && LA43_0 <= '\u0AE1'))) {
               alt43 = 80;
            }
            else if ((LA43_0 == '\u0AF1')) {
               alt43 = 81;
            }
            else if (((LA43_0 >= '\u0B05' && LA43_0 <= '\u0B0C'))) {
               alt43 = 82;
            }
            else if (((LA43_0 >= '\u0B0F' && LA43_0 <= '\u0B10'))) {
               alt43 = 83;
            }
            else if (((LA43_0 >= '\u0B13' && LA43_0 <= '\u0B28'))) {
               alt43 = 84;
            }
            else if (((LA43_0 >= '\u0B2A' && LA43_0 <= '\u0B30'))) {
               alt43 = 85;
            }
            else if (((LA43_0 >= '\u0B32' && LA43_0 <= '\u0B33'))) {
               alt43 = 86;
            }
            else if (((LA43_0 >= '\u0B35' && LA43_0 <= '\u0B39'))) {
               alt43 = 87;
            }
            else if ((LA43_0 == '\u0B3D')) {
               alt43 = 88;
            }
            else if (((LA43_0 >= '\u0B5C' && LA43_0 <= '\u0B5D'))) {
               alt43 = 89;
            }
            else if (((LA43_0 >= '\u0B5F' && LA43_0 <= '\u0B61'))) {
               alt43 = 90;
            }
            else if ((LA43_0 == '\u0B71')) {
               alt43 = 91;
            }
            else if ((LA43_0 == '\u0B83')) {
               alt43 = 92;
            }
            else if (((LA43_0 >= '\u0B85' && LA43_0 <= '\u0B8A'))) {
               alt43 = 93;
            }
            else if (((LA43_0 >= '\u0B8E' && LA43_0 <= '\u0B90'))) {
               alt43 = 94;
            }
            else if (((LA43_0 >= '\u0B92' && LA43_0 <= '\u0B95'))) {
               alt43 = 95;
            }
            else if (((LA43_0 >= '\u0B99' && LA43_0 <= '\u0B9A'))) {
               alt43 = 96;
            }
            else if ((LA43_0 == '\u0B9C')) {
               alt43 = 97;
            }
            else if (((LA43_0 >= '\u0B9E' && LA43_0 <= '\u0B9F'))) {
               alt43 = 98;
            }
            else if (((LA43_0 >= '\u0BA3' && LA43_0 <= '\u0BA4'))) {
               alt43 = 99;
            }
            else if (((LA43_0 >= '\u0BA8' && LA43_0 <= '\u0BAA'))) {
               alt43 = 100;
            }
            else if (((LA43_0 >= '\u0BAE' && LA43_0 <= '\u0BB5'))) {
               alt43 = 101;
            }
            else if (((LA43_0 >= '\u0BB7' && LA43_0 <= '\u0BB9'))) {
               alt43 = 102;
            }
            else if ((LA43_0 == '\u0BF9')) {
               alt43 = 103;
            }
            else if (((LA43_0 >= '\u0C05' && LA43_0 <= '\u0C0C'))) {
               alt43 = 104;
            }
            else if (((LA43_0 >= '\u0C0E' && LA43_0 <= '\u0C10'))) {
               alt43 = 105;
            }
            else if (((LA43_0 >= '\u0C12' && LA43_0 <= '\u0C28'))) {
               alt43 = 106;
            }
            else if (((LA43_0 >= '\u0C2A' && LA43_0 <= '\u0C33'))) {
               alt43 = 107;
            }
            else if (((LA43_0 >= '\u0C35' && LA43_0 <= '\u0C39'))) {
               alt43 = 108;
            }
            else if (((LA43_0 >= '\u0C60' && LA43_0 <= '\u0C61'))) {
               alt43 = 109;
            }
            else if (((LA43_0 >= '\u0C85' && LA43_0 <= '\u0C8C'))) {
               alt43 = 110;
            }
            else if (((LA43_0 >= '\u0C8E' && LA43_0 <= '\u0C90'))) {
               alt43 = 111;
            }
            else if (((LA43_0 >= '\u0C92' && LA43_0 <= '\u0CA8'))) {
               alt43 = 112;
            }
            else if (((LA43_0 >= '\u0CAA' && LA43_0 <= '\u0CB3'))) {
               alt43 = 113;
            }
            else if (((LA43_0 >= '\u0CB5' && LA43_0 <= '\u0CB9'))) {
               alt43 = 114;
            }
            else if ((LA43_0 == '\u0CBD')) {
               alt43 = 115;
            }
            else if ((LA43_0 == '\u0CDE')) {
               alt43 = 116;
            }
            else if (((LA43_0 >= '\u0CE0' && LA43_0 <= '\u0CE1'))) {
               alt43 = 117;
            }
            else if (((LA43_0 >= '\u0D05' && LA43_0 <= '\u0D0C'))) {
               alt43 = 118;
            }
            else if (((LA43_0 >= '\u0D0E' && LA43_0 <= '\u0D10'))) {
               alt43 = 119;
            }
            else if (((LA43_0 >= '\u0D12' && LA43_0 <= '\u0D28'))) {
               alt43 = 120;
            }
            else if (((LA43_0 >= '\u0D2A' && LA43_0 <= '\u0D39'))) {
               alt43 = 121;
            }
            else if (((LA43_0 >= '\u0D60' && LA43_0 <= '\u0D61'))) {
               alt43 = 122;
            }
            else if (((LA43_0 >= '\u0D85' && LA43_0 <= '\u0D96'))) {
               alt43 = 123;
            }
            else if (((LA43_0 >= '\u0D9A' && LA43_0 <= '\u0DB1'))) {
               alt43 = 124;
            }
            else if (((LA43_0 >= '\u0DB3' && LA43_0 <= '\u0DBB'))) {
               alt43 = 125;
            }
            else if ((LA43_0 == '\u0DBD')) {
               alt43 = 126;
            }
            else if (((LA43_0 >= '\u0DC0' && LA43_0 <= '\u0DC6'))) {
               alt43 = 127;
            }
            else if (((LA43_0 >= '\u0E01' && LA43_0 <= '\u0E30'))) {
               alt43 = 128;
            }
            else if (((LA43_0 >= '\u0E32' && LA43_0 <= '\u0E33'))) {
               alt43 = 129;
            }
            else if (((LA43_0 >= '\u0E3F' && LA43_0 <= '\u0E46'))) {
               alt43 = 130;
            }
            else if (((LA43_0 >= '\u0E81' && LA43_0 <= '\u0E82'))) {
               alt43 = 131;
            }
            else if ((LA43_0 == '\u0E84')) {
               alt43 = 132;
            }
            else if (((LA43_0 >= '\u0E87' && LA43_0 <= '\u0E88'))) {
               alt43 = 133;
            }
            else if ((LA43_0 == '\u0E8A')) {
               alt43 = 134;
            }
            else if ((LA43_0 == '\u0E8D')) {
               alt43 = 135;
            }
            else if (((LA43_0 >= '\u0E94' && LA43_0 <= '\u0E97'))) {
               alt43 = 136;
            }
            else if (((LA43_0 >= '\u0E99' && LA43_0 <= '\u0E9F'))) {
               alt43 = 137;
            }
            else if (((LA43_0 >= '\u0EA1' && LA43_0 <= '\u0EA3'))) {
               alt43 = 138;
            }
            else if ((LA43_0 == '\u0EA5')) {
               alt43 = 139;
            }
            else if ((LA43_0 == '\u0EA7')) {
               alt43 = 140;
            }
            else if (((LA43_0 >= '\u0EAA' && LA43_0 <= '\u0EAB'))) {
               alt43 = 141;
            }
            else if (((LA43_0 >= '\u0EAD' && LA43_0 <= '\u0EB0'))) {
               alt43 = 142;
            }
            else if (((LA43_0 >= '\u0EB2' && LA43_0 <= '\u0EB3'))) {
               alt43 = 143;
            }
            else if ((LA43_0 == '\u0EBD')) {
               alt43 = 144;
            }
            else if (((LA43_0 >= '\u0EC0' && LA43_0 <= '\u0EC4'))) {
               alt43 = 145;
            }
            else if ((LA43_0 == '\u0EC6')) {
               alt43 = 146;
            }
            else if (((LA43_0 >= '\u0EDC' && LA43_0 <= '\u0EDD'))) {
               alt43 = 147;
            }
            else if ((LA43_0 == '\u0F00')) {
               alt43 = 148;
            }
            else if (((LA43_0 >= '\u0F40' && LA43_0 <= '\u0F47'))) {
               alt43 = 149;
            }
            else if (((LA43_0 >= '\u0F49' && LA43_0 <= '\u0F6A'))) {
               alt43 = 150;
            }
            else if (((LA43_0 >= '\u0F88' && LA43_0 <= '\u0F8B'))) {
               alt43 = 151;
            }
            else if (((LA43_0 >= '\u1000' && LA43_0 <= '\u1021'))) {
               alt43 = 152;
            }
            else if (((LA43_0 >= '\u1023' && LA43_0 <= '\u1027'))) {
               alt43 = 153;
            }
            else if (((LA43_0 >= '\u1029' && LA43_0 <= '\u102A'))) {
               alt43 = 154;
            }
            else if (((LA43_0 >= '\u1050' && LA43_0 <= '\u1055'))) {
               alt43 = 155;
            }
            else if (((LA43_0 >= '\u10A0' && LA43_0 <= '\u10C5'))) {
               alt43 = 156;
            }
            else if (((LA43_0 >= '\u10D0' && LA43_0 <= '\u10F8'))) {
               alt43 = 157;
            }
            else if (((LA43_0 >= '\u1100' && LA43_0 <= '\u1159'))) {
               alt43 = 158;
            }
            else if (((LA43_0 >= '\u115F' && LA43_0 <= '\u11A2'))) {
               alt43 = 159;
            }
            else if (((LA43_0 >= '\u11A8' && LA43_0 <= '\u11F9'))) {
               alt43 = 160;
            }
            else if (((LA43_0 >= '\u1200' && LA43_0 <= '\u1206'))) {
               alt43 = 161;
            }
            else if (((LA43_0 >= '\u1208' && LA43_0 <= '\u1246'))) {
               alt43 = 162;
            }
            else if ((LA43_0 == '\u1248')) {
               alt43 = 163;
            }
            else if (((LA43_0 >= '\u124A' && LA43_0 <= '\u124D'))) {
               alt43 = 164;
            }
            else if (((LA43_0 >= '\u1250' && LA43_0 <= '\u1256'))) {
               alt43 = 165;
            }
            else if ((LA43_0 == '\u1258')) {
               alt43 = 166;
            }
            else if (((LA43_0 >= '\u125A' && LA43_0 <= '\u125D'))) {
               alt43 = 167;
            }
            else if (((LA43_0 >= '\u1260' && LA43_0 <= '\u1286'))) {
               alt43 = 168;
            }
            else if ((LA43_0 == '\u1288')) {
               alt43 = 169;
            }
            else if (((LA43_0 >= '\u128A' && LA43_0 <= '\u128D'))) {
               alt43 = 170;
            }
            else if (((LA43_0 >= '\u1290' && LA43_0 <= '\u12AE'))) {
               alt43 = 171;
            }
            else if ((LA43_0 == '\u12B0')) {
               alt43 = 172;
            }
            else if (((LA43_0 >= '\u12B2' && LA43_0 <= '\u12B5'))) {
               alt43 = 173;
            }
            else if (((LA43_0 >= '\u12B8' && LA43_0 <= '\u12BE'))) {
               alt43 = 174;
            }
            else if ((LA43_0 == '\u12C0')) {
               alt43 = 175;
            }
            else if (((LA43_0 >= '\u12C2' && LA43_0 <= '\u12C5'))) {
               alt43 = 176;
            }
            else if (((LA43_0 >= '\u12C8' && LA43_0 <= '\u12CE'))) {
               alt43 = 177;
            }
            else if (((LA43_0 >= '\u12D0' && LA43_0 <= '\u12D6'))) {
               alt43 = 178;
            }
            else if (((LA43_0 >= '\u12D8' && LA43_0 <= '\u12EE'))) {
               alt43 = 179;
            }
            else if (((LA43_0 >= '\u12F0' && LA43_0 <= '\u130E'))) {
               alt43 = 180;
            }
            else if ((LA43_0 == '\u1310')) {
               alt43 = 181;
            }
            else if (((LA43_0 >= '\u1312' && LA43_0 <= '\u1315'))) {
               alt43 = 182;
            }
            else if (((LA43_0 >= '\u1318' && LA43_0 <= '\u131E'))) {
               alt43 = 183;
            }
            else if (((LA43_0 >= '\u1320' && LA43_0 <= '\u1346'))) {
               alt43 = 184;
            }
            else if (((LA43_0 >= '\u1348' && LA43_0 <= '\u135A'))) {
               alt43 = 185;
            }
            else if (((LA43_0 >= '\u13A0' && LA43_0 <= '\u13F4'))) {
               alt43 = 186;
            }
            else if (((LA43_0 >= '\u1401' && LA43_0 <= '\u166C'))) {
               alt43 = 187;
            }
            else if (((LA43_0 >= '\u166F' && LA43_0 <= '\u1676'))) {
               alt43 = 188;
            }
            else if (((LA43_0 >= '\u1681' && LA43_0 <= '\u169A'))) {
               alt43 = 189;
            }
            else if (((LA43_0 >= '\u16A0' && LA43_0 <= '\u16EA'))) {
               alt43 = 190;
            }
            else if (((LA43_0 >= '\u16EE' && LA43_0 <= '\u16F0'))) {
               alt43 = 191;
            }
            else if (((LA43_0 >= '\u1700' && LA43_0 <= '\u170C'))) {
               alt43 = 192;
            }
            else if (((LA43_0 >= '\u170E' && LA43_0 <= '\u1711'))) {
               alt43 = 193;
            }
            else if (((LA43_0 >= '\u1720' && LA43_0 <= '\u1731'))) {
               alt43 = 194;
            }
            else if (((LA43_0 >= '\u1740' && LA43_0 <= '\u1751'))) {
               alt43 = 195;
            }
            else if (((LA43_0 >= '\u1760' && LA43_0 <= '\u176C'))) {
               alt43 = 196;
            }
            else if (((LA43_0 >= '\u176E' && LA43_0 <= '\u1770'))) {
               alt43 = 197;
            }
            else if (((LA43_0 >= '\u1780' && LA43_0 <= '\u17B3'))) {
               alt43 = 198;
            }
            else if ((LA43_0 == '\u17D7')) {
               alt43 = 199;
            }
            else if (((LA43_0 >= '\u17DB' && LA43_0 <= '\u17DC'))) {
               alt43 = 200;
            }
            else if (((LA43_0 >= '\u1820' && LA43_0 <= '\u1877'))) {
               alt43 = 201;
            }
            else if (((LA43_0 >= '\u1880' && LA43_0 <= '\u18A8'))) {
               alt43 = 202;
            }
            else if (((LA43_0 >= '\u1900' && LA43_0 <= '\u191C'))) {
               alt43 = 203;
            }
            else if (((LA43_0 >= '\u1950' && LA43_0 <= '\u196D'))) {
               alt43 = 204;
            }
            else if (((LA43_0 >= '\u1970' && LA43_0 <= '\u1974'))) {
               alt43 = 205;
            }
            else if (((LA43_0 >= '\u1D00' && LA43_0 <= '\u1D6B'))) {
               alt43 = 206;
            }
            else if (((LA43_0 >= '\u1E00' && LA43_0 <= '\u1E9B'))) {
               alt43 = 207;
            }
            else if (((LA43_0 >= '\u1EA0' && LA43_0 <= '\u1EF9'))) {
               alt43 = 208;
            }
            else if (((LA43_0 >= '\u1F00' && LA43_0 <= '\u1F15'))) {
               alt43 = 209;
            }
            else if (((LA43_0 >= '\u1F18' && LA43_0 <= '\u1F1D'))) {
               alt43 = 210;
            }
            else if (((LA43_0 >= '\u1F20' && LA43_0 <= '\u1F45'))) {
               alt43 = 211;
            }
            else if (((LA43_0 >= '\u1F48' && LA43_0 <= '\u1F4D'))) {
               alt43 = 212;
            }
            else if (((LA43_0 >= '\u1F50' && LA43_0 <= '\u1F57'))) {
               alt43 = 213;
            }
            else if ((LA43_0 == '\u1F59')) {
               alt43 = 214;
            }
            else if ((LA43_0 == '\u1F5B')) {
               alt43 = 215;
            }
            else if ((LA43_0 == '\u1F5D')) {
               alt43 = 216;
            }
            else if (((LA43_0 >= '\u1F5F' && LA43_0 <= '\u1F7D'))) {
               alt43 = 217;
            }
            else if (((LA43_0 >= '\u1F80' && LA43_0 <= '\u1FB4'))) {
               alt43 = 218;
            }
            else if (((LA43_0 >= '\u1FB6' && LA43_0 <= '\u1FBC'))) {
               alt43 = 219;
            }
            else if ((LA43_0 == '\u1FBE')) {
               alt43 = 220;
            }
            else if (((LA43_0 >= '\u1FC2' && LA43_0 <= '\u1FC4'))) {
               alt43 = 221;
            }
            else if (((LA43_0 >= '\u1FC6' && LA43_0 <= '\u1FCC'))) {
               alt43 = 222;
            }
            else if (((LA43_0 >= '\u1FD0' && LA43_0 <= '\u1FD3'))) {
               alt43 = 223;
            }
            else if (((LA43_0 >= '\u1FD6' && LA43_0 <= '\u1FDB'))) {
               alt43 = 224;
            }
            else if (((LA43_0 >= '\u1FE0' && LA43_0 <= '\u1FEC'))) {
               alt43 = 225;
            }
            else if (((LA43_0 >= '\u1FF2' && LA43_0 <= '\u1FF4'))) {
               alt43 = 226;
            }
            else if (((LA43_0 >= '\u1FF6' && LA43_0 <= '\u1FFC'))) {
               alt43 = 227;
            }
            else if (((LA43_0 >= '\u203F' && LA43_0 <= '\u2040'))) {
               alt43 = 228;
            }
            else if ((LA43_0 == '\u2054')) {
               alt43 = 229;
            }
            else if ((LA43_0 == '\u2071')) {
               alt43 = 230;
            }
            else if ((LA43_0 == '\u207F')) {
               alt43 = 231;
            }
            else if (((LA43_0 >= '\u20A0' && LA43_0 <= '\u20B1'))) {
               alt43 = 232;
            }
            else if ((LA43_0 == '\u2102')) {
               alt43 = 233;
            }
            else if ((LA43_0 == '\u2107')) {
               alt43 = 234;
            }
            else if (((LA43_0 >= '\u210A' && LA43_0 <= '\u2113'))) {
               alt43 = 235;
            }
            else if ((LA43_0 == '\u2115')) {
               alt43 = 236;
            }
            else if (((LA43_0 >= '\u2119' && LA43_0 <= '\u211D'))) {
               alt43 = 237;
            }
            else if ((LA43_0 == '\u2124')) {
               alt43 = 238;
            }
            else if ((LA43_0 == '\u2126')) {
               alt43 = 239;
            }
            else if ((LA43_0 == '\u2128')) {
               alt43 = 240;
            }
            else if (((LA43_0 >= '\u212A' && LA43_0 <= '\u212D'))) {
               alt43 = 241;
            }
            else if (((LA43_0 >= '\u212F' && LA43_0 <= '\u2131'))) {
               alt43 = 242;
            }
            else if (((LA43_0 >= '\u2133' && LA43_0 <= '\u2139'))) {
               alt43 = 243;
            }
            else if (((LA43_0 >= '\u213D' && LA43_0 <= '\u213F'))) {
               alt43 = 244;
            }
            else if (((LA43_0 >= '\u2145' && LA43_0 <= '\u2149'))) {
               alt43 = 245;
            }
            else if (((LA43_0 >= '\u2160' && LA43_0 <= '\u2183'))) {
               alt43 = 246;
            }
            else if (((LA43_0 >= '\u3005' && LA43_0 <= '\u3007'))) {
               alt43 = 247;
            }
            else if (((LA43_0 >= '\u3021' && LA43_0 <= '\u3029'))) {
               alt43 = 248;
            }
            else if (((LA43_0 >= '\u3031' && LA43_0 <= '\u3035'))) {
               alt43 = 249;
            }
            else if (((LA43_0 >= '\u3038' && LA43_0 <= '\u303C'))) {
               alt43 = 250;
            }
            else if (((LA43_0 >= '\u3041' && LA43_0 <= '\u3096'))) {
               alt43 = 251;
            }
            else if (((LA43_0 >= '\u309D' && LA43_0 <= '\u309F'))) {
               alt43 = 252;
            }
            else if (((LA43_0 >= '\u30A1' && LA43_0 <= '\u30FF'))) {
               alt43 = 253;
            }
            else if (((LA43_0 >= '\u3105' && LA43_0 <= '\u312C'))) {
               alt43 = 254;
            }
            else if (((LA43_0 >= '\u3131' && LA43_0 <= '\u318E'))) {
               alt43 = 255;
            }
            else if (((LA43_0 >= '\u31A0' && LA43_0 <= '\u31B7'))) {
               alt43 = 256;
            }
            else if (((LA43_0 >= '\u31F0' && LA43_0 <= '\u31FF'))) {
               alt43 = 257;
            }
            else if (((LA43_0 >= '\u3400' && LA43_0 <= '\u4DB5'))) {
               alt43 = 258;
            }
            else if (((LA43_0 >= '\u4E00' && LA43_0 <= '\u9FA5'))) {
               alt43 = 259;
            }
            else if (((LA43_0 >= '\uA000' && LA43_0 <= '\uA48C'))) {
               alt43 = 260;
            }
            else if (((LA43_0 >= '\uAC00' && LA43_0 <= '\uD7A3'))) {
               alt43 = 261;
            }
            else if (((LA43_0 >= '\uF900' && LA43_0 <= '\uFA2D'))) {
               alt43 = 262;
            }
            else if (((LA43_0 >= '\uFA30' && LA43_0 <= '\uFA6A'))) {
               alt43 = 263;
            }
            else if (((LA43_0 >= '\uFB00' && LA43_0 <= '\uFB06'))) {
               alt43 = 264;
            }
            else if (((LA43_0 >= '\uFB13' && LA43_0 <= '\uFB17'))) {
               alt43 = 265;
            }
            else if ((LA43_0 == '\uFB1D')) {
               alt43 = 266;
            }
            else if (((LA43_0 >= '\uFB1F' && LA43_0 <= '\uFB28'))) {
               alt43 = 267;
            }
            else if (((LA43_0 >= '\uFB2A' && LA43_0 <= '\uFB36'))) {
               alt43 = 268;
            }
            else if (((LA43_0 >= '\uFB38' && LA43_0 <= '\uFB3C'))) {
               alt43 = 269;
            }
            else if ((LA43_0 == '\uFB3E')) {
               alt43 = 270;
            }
            else if (((LA43_0 >= '\uFB40' && LA43_0 <= '\uFB41'))) {
               alt43 = 271;
            }
            else if (((LA43_0 >= '\uFB43' && LA43_0 <= '\uFB44'))) {
               alt43 = 272;
            }
            else if (((LA43_0 >= '\uFB46' && LA43_0 <= '\uFBB1'))) {
               alt43 = 273;
            }
            else if (((LA43_0 >= '\uFBD3' && LA43_0 <= '\uFD3D'))) {
               alt43 = 274;
            }
            else if (((LA43_0 >= '\uFD50' && LA43_0 <= '\uFD8F'))) {
               alt43 = 275;
            }
            else if (((LA43_0 >= '\uFD92' && LA43_0 <= '\uFDC7'))) {
               alt43 = 276;
            }
            else if (((LA43_0 >= '\uFDF0' && LA43_0 <= '\uFDFC'))) {
               alt43 = 277;
            }
            else if (((LA43_0 >= '\uFE33' && LA43_0 <= '\uFE34'))) {
               alt43 = 278;
            }
            else if (((LA43_0 >= '\uFE4D' && LA43_0 <= '\uFE4F'))) {
               alt43 = 279;
            }
            else if ((LA43_0 == '\uFE69')) {
               alt43 = 280;
            }
            else if (((LA43_0 >= '\uFE70' && LA43_0 <= '\uFE74'))) {
               alt43 = 281;
            }
            else if (((LA43_0 >= '\uFE76' && LA43_0 <= '\uFEFC'))) {
               alt43 = 282;
            }
            else if ((LA43_0 == '\uFF04')) {
               alt43 = 283;
            }
            else if (((LA43_0 >= '\uFF21' && LA43_0 <= '\uFF3A'))) {
               alt43 = 284;
            }
            else if ((LA43_0 == '\uFF3F')) {
               alt43 = 285;
            }
            else if (((LA43_0 >= '\uFF41' && LA43_0 <= '\uFF5A'))) {
               alt43 = 286;
            }
            else if (((LA43_0 >= '\uFF65' && LA43_0 <= '\uFFBE'))) {
               alt43 = 287;
            }
            else if (((LA43_0 >= '\uFFC2' && LA43_0 <= '\uFFC7'))) {
               alt43 = 288;
            }
            else if (((LA43_0 >= '\uFFCA' && LA43_0 <= '\uFFCF'))) {
               alt43 = 289;
            }
            else if (((LA43_0 >= '\uFFD2' && LA43_0 <= '\uFFD7'))) {
               alt43 = 290;
            }
            else if (((LA43_0 >= '\uFFDA' && LA43_0 <= '\uFFDC'))) {
               alt43 = 291;
            }
            else if (((LA43_0 >= '\uFFE0' && LA43_0 <= '\uFFE1'))) {
               alt43 = 292;
            }
            else if (((LA43_0 >= '\uFFE5' && LA43_0 <= '\uFFE6'))) {
               alt43 = 293;
            }
            else if (((LA43_0 >= '\uD800' && LA43_0 <= '\uDBFF'))) {
               alt43 = 294;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 43, 0, input);

               throw nvae;
            }
            switch (alt43) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:29:
               // '$'
               {
                  match('$');

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:33:
               // 'A' .. 'Z'
               {
                  matchRange('A', 'Z');

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:42:
               // '_'
               {
                  match('_');

               }
                  break;
               case 4 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:46:
               // 'a' .. 'z'
               {
                  matchRange('a', 'z');

               }
                  break;
               case 5 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:55:
               // '\\u00A2' .. '\\u00A5'
               {
                  matchRange('\u00A2', '\u00A5');

               }
                  break;
               case 6 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:74:
               // '\\u00AA'
               {
                  match('\u00AA');

               }
                  break;
               case 7 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:83:
               // '\\u00B5'
               {
                  match('\u00B5');

               }
                  break;
               case 8 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:92:
               // '\\u00BA'
               {
                  match('\u00BA');

               }
                  break;
               case 9 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:101:
               // '\\u00C0' .. '\\u00D6'
               {
                  matchRange('\u00C0', '\u00D6');

               }
                  break;
               case 10 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:120:
               // '\\u00D8' .. '\\u00F6'
               {
                  matchRange('\u00D8', '\u00F6');

               }
                  break;
               case 11 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:139:
               // '\\u00F8' .. '\\u0236'
               {
                  matchRange('\u00F8', '\u0236');

               }
                  break;
               case 12 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:158:
               // '\\u0250' .. '\\u02C1'
               {
                  matchRange('\u0250', '\u02C1');

               }
                  break;
               case 13 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:177:
               // '\\u02C6' .. '\\u02D1'
               {
                  matchRange('\u02C6', '\u02D1');

               }
                  break;
               case 14 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:196:
               // '\\u02E0' .. '\\u02E4'
               {
                  matchRange('\u02E0', '\u02E4');

               }
                  break;
               case 15 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:215:
               // '\\u02EE'
               {
                  match('\u02EE');

               }
                  break;
               case 16 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:224:
               // '\\u037A'
               {
                  match('\u037A');

               }
                  break;
               case 17 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:233:
               // '\\u0386'
               {
                  match('\u0386');

               }
                  break;
               case 18 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:242:
               // '\\u0388' .. '\\u038A'
               {
                  matchRange('\u0388', '\u038A');

               }
                  break;
               case 19 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:261:
               // '\\u038C'
               {
                  match('\u038C');

               }
                  break;
               case 20 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:270:
               // '\\u038E' .. '\\u03A1'
               {
                  matchRange('\u038E', '\u03A1');

               }
                  break;
               case 21 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:289:
               // '\\u03A3' .. '\\u03CE'
               {
                  matchRange('\u03A3', '\u03CE');

               }
                  break;
               case 22 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:308:
               // '\\u03D0' .. '\\u03F5'
               {
                  matchRange('\u03D0', '\u03F5');

               }
                  break;
               case 23 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:327:
               // '\\u03F7' .. '\\u03FB'
               {
                  matchRange('\u03F7', '\u03FB');

               }
                  break;
               case 24 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:346:
               // '\\u0400' .. '\\u0481'
               {
                  matchRange('\u0400', '\u0481');

               }
                  break;
               case 25 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:365:
               // '\\u048A' .. '\\u04CE'
               {
                  matchRange('\u048A', '\u04CE');

               }
                  break;
               case 26 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:384:
               // '\\u04D0' .. '\\u04F5'
               {
                  matchRange('\u04D0', '\u04F5');

               }
                  break;
               case 27 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:403:
               // '\\u04F8' .. '\\u04F9'
               {
                  matchRange('\u04F8', '\u04F9');

               }
                  break;
               case 28 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:422:
               // '\\u0500' .. '\\u050F'
               {
                  matchRange('\u0500', '\u050F');

               }
                  break;
               case 29 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:441:
               // '\\u0531' .. '\\u0556'
               {
                  matchRange('\u0531', '\u0556');

               }
                  break;
               case 30 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:460:
               // '\\u0559'
               {
                  match('\u0559');

               }
                  break;
               case 31 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:469:
               // '\\u0561' .. '\\u0587'
               {
                  matchRange('\u0561', '\u0587');

               }
                  break;
               case 32 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:488:
               // '\\u05D0' .. '\\u05EA'
               {
                  matchRange('\u05D0', '\u05EA');

               }
                  break;
               case 33 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:507:
               // '\\u05F0' .. '\\u05F2'
               {
                  matchRange('\u05F0', '\u05F2');

               }
                  break;
               case 34 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:526:
               // '\\u0621' .. '\\u063A'
               {
                  matchRange('\u0621', '\u063A');

               }
                  break;
               case 35 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:545:
               // '\\u0640' .. '\\u064A'
               {
                  matchRange('\u0640', '\u064A');

               }
                  break;
               case 36 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:564:
               // '\\u066E' .. '\\u066F'
               {
                  matchRange('\u066E', '\u066F');

               }
                  break;
               case 37 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:583:
               // '\\u0671' .. '\\u06D3'
               {
                  matchRange('\u0671', '\u06D3');

               }
                  break;
               case 38 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:602:
               // '\\u06D5'
               {
                  match('\u06D5');

               }
                  break;
               case 39 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:611:
               // '\\u06E5' .. '\\u06E6'
               {
                  matchRange('\u06E5', '\u06E6');

               }
                  break;
               case 40 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:630:
               // '\\u06EE' .. '\\u06EF'
               {
                  matchRange('\u06EE', '\u06EF');

               }
                  break;
               case 41 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:649:
               // '\\u06FA' .. '\\u06FC'
               {
                  matchRange('\u06FA', '\u06FC');

               }
                  break;
               case 42 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:668:
               // '\\u06FF'
               {
                  match('\u06FF');

               }
                  break;
               case 43 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:677:
               // '\\u0710'
               {
                  match('\u0710');

               }
                  break;
               case 44 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:686:
               // '\\u0712' .. '\\u072F'
               {
                  matchRange('\u0712', '\u072F');

               }
                  break;
               case 45 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:705:
               // '\\u074D' .. '\\u074F'
               {
                  matchRange('\u074D', '\u074F');

               }
                  break;
               case 46 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:724:
               // '\\u0780' .. '\\u07A5'
               {
                  matchRange('\u0780', '\u07A5');

               }
                  break;
               case 47 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:743:
               // '\\u07B1'
               {
                  match('\u07B1');

               }
                  break;
               case 48 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:752:
               // '\\u0904' .. '\\u0939'
               {
                  matchRange('\u0904', '\u0939');

               }
                  break;
               case 49 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:771:
               // '\\u093D'
               {
                  match('\u093D');

               }
                  break;
               case 50 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:780:
               // '\\u0950'
               {
                  match('\u0950');

               }
                  break;
               case 51 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:789:
               // '\\u0958' .. '\\u0961'
               {
                  matchRange('\u0958', '\u0961');

               }
                  break;
               case 52 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:808:
               // '\\u0985' .. '\\u098C'
               {
                  matchRange('\u0985', '\u098C');

               }
                  break;
               case 53 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:827:
               // '\\u098F' .. '\\u0990'
               {
                  matchRange('\u098F', '\u0990');

               }
                  break;
               case 54 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:846:
               // '\\u0993' .. '\\u09A8'
               {
                  matchRange('\u0993', '\u09A8');

               }
                  break;
               case 55 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:865:
               // '\\u09AA' .. '\\u09B0'
               {
                  matchRange('\u09AA', '\u09B0');

               }
                  break;
               case 56 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:884:
               // '\\u09B2'
               {
                  match('\u09B2');

               }
                  break;
               case 57 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:893:
               // '\\u09B6' .. '\\u09B9'
               {
                  matchRange('\u09B6', '\u09B9');

               }
                  break;
               case 58 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:912:
               // '\\u09BD'
               {
                  match('\u09BD');

               }
                  break;
               case 59 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:921:
               // '\\u09DC' .. '\\u09DD'
               {
                  matchRange('\u09DC', '\u09DD');

               }
                  break;
               case 60 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:940:
               // '\\u09DF' .. '\\u09E1'
               {
                  matchRange('\u09DF', '\u09E1');

               }
                  break;
               case 61 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:959:
               // '\\u09F0' .. '\\u09F3'
               {
                  matchRange('\u09F0', '\u09F3');

               }
                  break;
               case 62 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:978:
               // '\\u0A05' .. '\\u0A0A'
               {
                  matchRange('\u0A05', '\u0A0A');

               }
                  break;
               case 63 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:997:
               // '\\u0A0F' .. '\\u0A10'
               {
                  matchRange('\u0A0F', '\u0A10');

               }
                  break;
               case 64 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1016:
               // '\\u0A13' .. '\\u0A28'
               {
                  matchRange('\u0A13', '\u0A28');

               }
                  break;
               case 65 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1035:
               // '\\u0A2A' .. '\\u0A30'
               {
                  matchRange('\u0A2A', '\u0A30');

               }
                  break;
               case 66 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1054:
               // '\\u0A32' .. '\\u0A33'
               {
                  matchRange('\u0A32', '\u0A33');

               }
                  break;
               case 67 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1073:
               // '\\u0A35' .. '\\u0A36'
               {
                  matchRange('\u0A35', '\u0A36');

               }
                  break;
               case 68 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1092:
               // '\\u0A38' .. '\\u0A39'
               {
                  matchRange('\u0A38', '\u0A39');

               }
                  break;
               case 69 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1111:
               // '\\u0A59' .. '\\u0A5C'
               {
                  matchRange('\u0A59', '\u0A5C');

               }
                  break;
               case 70 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1130:
               // '\\u0A5E'
               {
                  match('\u0A5E');

               }
                  break;
               case 71 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1139:
               // '\\u0A72' .. '\\u0A74'
               {
                  matchRange('\u0A72', '\u0A74');

               }
                  break;
               case 72 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1158:
               // '\\u0A85' .. '\\u0A8D'
               {
                  matchRange('\u0A85', '\u0A8D');

               }
                  break;
               case 73 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1177:
               // '\\u0A8F' .. '\\u0A91'
               {
                  matchRange('\u0A8F', '\u0A91');

               }
                  break;
               case 74 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1196:
               // '\\u0A93' .. '\\u0AA8'
               {
                  matchRange('\u0A93', '\u0AA8');

               }
                  break;
               case 75 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1215:
               // '\\u0AAA' .. '\\u0AB0'
               {
                  matchRange('\u0AAA', '\u0AB0');

               }
                  break;
               case 76 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1234:
               // '\\u0AB2' .. '\\u0AB3'
               {
                  matchRange('\u0AB2', '\u0AB3');

               }
                  break;
               case 77 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1253:
               // '\\u0AB5' .. '\\u0AB9'
               {
                  matchRange('\u0AB5', '\u0AB9');

               }
                  break;
               case 78 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1272:
               // '\\u0ABD'
               {
                  match('\u0ABD');

               }
                  break;
               case 79 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1281:
               // '\\u0AD0'
               {
                  match('\u0AD0');

               }
                  break;
               case 80 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1290:
               // '\\u0AE0' .. '\\u0AE1'
               {
                  matchRange('\u0AE0', '\u0AE1');

               }
                  break;
               case 81 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1309:
               // '\\u0AF1'
               {
                  match('\u0AF1');

               }
                  break;
               case 82 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1318:
               // '\\u0B05' .. '\\u0B0C'
               {
                  matchRange('\u0B05', '\u0B0C');

               }
                  break;
               case 83 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1337:
               // '\\u0B0F' .. '\\u0B10'
               {
                  matchRange('\u0B0F', '\u0B10');

               }
                  break;
               case 84 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1356:
               // '\\u0B13' .. '\\u0B28'
               {
                  matchRange('\u0B13', '\u0B28');

               }
                  break;
               case 85 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1375:
               // '\\u0B2A' .. '\\u0B30'
               {
                  matchRange('\u0B2A', '\u0B30');

               }
                  break;
               case 86 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1394:
               // '\\u0B32' .. '\\u0B33'
               {
                  matchRange('\u0B32', '\u0B33');

               }
                  break;
               case 87 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1413:
               // '\\u0B35' .. '\\u0B39'
               {
                  matchRange('\u0B35', '\u0B39');

               }
                  break;
               case 88 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1432:
               // '\\u0B3D'
               {
                  match('\u0B3D');

               }
                  break;
               case 89 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1441:
               // '\\u0B5C' .. '\\u0B5D'
               {
                  matchRange('\u0B5C', '\u0B5D');

               }
                  break;
               case 90 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1460:
               // '\\u0B5F' .. '\\u0B61'
               {
                  matchRange('\u0B5F', '\u0B61');

               }
                  break;
               case 91 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1479:
               // '\\u0B71'
               {
                  match('\u0B71');

               }
                  break;
               case 92 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1488:
               // '\\u0B83'
               {
                  match('\u0B83');

               }
                  break;
               case 93 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1497:
               // '\\u0B85' .. '\\u0B8A'
               {
                  matchRange('\u0B85', '\u0B8A');

               }
                  break;
               case 94 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1516:
               // '\\u0B8E' .. '\\u0B90'
               {
                  matchRange('\u0B8E', '\u0B90');

               }
                  break;
               case 95 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1535:
               // '\\u0B92' .. '\\u0B95'
               {
                  matchRange('\u0B92', '\u0B95');

               }
                  break;
               case 96 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1554:
               // '\\u0B99' .. '\\u0B9A'
               {
                  matchRange('\u0B99', '\u0B9A');

               }
                  break;
               case 97 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1573:
               // '\\u0B9C'
               {
                  match('\u0B9C');

               }
                  break;
               case 98 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1582:
               // '\\u0B9E' .. '\\u0B9F'
               {
                  matchRange('\u0B9E', '\u0B9F');

               }
                  break;
               case 99 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1601:
               // '\\u0BA3' .. '\\u0BA4'
               {
                  matchRange('\u0BA3', '\u0BA4');

               }
                  break;
               case 100 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1620:
               // '\\u0BA8' .. '\\u0BAA'
               {
                  matchRange('\u0BA8', '\u0BAA');

               }
                  break;
               case 101 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1639:
               // '\\u0BAE' .. '\\u0BB5'
               {
                  matchRange('\u0BAE', '\u0BB5');

               }
                  break;
               case 102 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1658:
               // '\\u0BB7' .. '\\u0BB9'
               {
                  matchRange('\u0BB7', '\u0BB9');

               }
                  break;
               case 103 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1677:
               // '\\u0BF9'
               {
                  match('\u0BF9');

               }
                  break;
               case 104 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1686:
               // '\\u0C05' .. '\\u0C0C'
               {
                  matchRange('\u0C05', '\u0C0C');

               }
                  break;
               case 105 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1705:
               // '\\u0C0E' .. '\\u0C10'
               {
                  matchRange('\u0C0E', '\u0C10');

               }
                  break;
               case 106 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1724:
               // '\\u0C12' .. '\\u0C28'
               {
                  matchRange('\u0C12', '\u0C28');

               }
                  break;
               case 107 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1743:
               // '\\u0C2A' .. '\\u0C33'
               {
                  matchRange('\u0C2A', '\u0C33');

               }
                  break;
               case 108 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1762:
               // '\\u0C35' .. '\\u0C39'
               {
                  matchRange('\u0C35', '\u0C39');

               }
                  break;
               case 109 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1781:
               // '\\u0C60' .. '\\u0C61'
               {
                  matchRange('\u0C60', '\u0C61');

               }
                  break;
               case 110 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1800:
               // '\\u0C85' .. '\\u0C8C'
               {
                  matchRange('\u0C85', '\u0C8C');

               }
                  break;
               case 111 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1819:
               // '\\u0C8E' .. '\\u0C90'
               {
                  matchRange('\u0C8E', '\u0C90');

               }
                  break;
               case 112 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1838:
               // '\\u0C92' .. '\\u0CA8'
               {
                  matchRange('\u0C92', '\u0CA8');

               }
                  break;
               case 113 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1857:
               // '\\u0CAA' .. '\\u0CB3'
               {
                  matchRange('\u0CAA', '\u0CB3');

               }
                  break;
               case 114 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1876:
               // '\\u0CB5' .. '\\u0CB9'
               {
                  matchRange('\u0CB5', '\u0CB9');

               }
                  break;
               case 115 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1895:
               // '\\u0CBD'
               {
                  match('\u0CBD');

               }
                  break;
               case 116 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1904:
               // '\\u0CDE'
               {
                  match('\u0CDE');

               }
                  break;
               case 117 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1913:
               // '\\u0CE0' .. '\\u0CE1'
               {
                  matchRange('\u0CE0', '\u0CE1');

               }
                  break;
               case 118 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1932:
               // '\\u0D05' .. '\\u0D0C'
               {
                  matchRange('\u0D05', '\u0D0C');

               }
                  break;
               case 119 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1951:
               // '\\u0D0E' .. '\\u0D10'
               {
                  matchRange('\u0D0E', '\u0D10');

               }
                  break;
               case 120 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1970:
               // '\\u0D12' .. '\\u0D28'
               {
                  matchRange('\u0D12', '\u0D28');

               }
                  break;
               case 121 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:1989:
               // '\\u0D2A' .. '\\u0D39'
               {
                  matchRange('\u0D2A', '\u0D39');

               }
                  break;
               case 122 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2008:
               // '\\u0D60' .. '\\u0D61'
               {
                  matchRange('\u0D60', '\u0D61');

               }
                  break;
               case 123 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2027:
               // '\\u0D85' .. '\\u0D96'
               {
                  matchRange('\u0D85', '\u0D96');

               }
                  break;
               case 124 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2046:
               // '\\u0D9A' .. '\\u0DB1'
               {
                  matchRange('\u0D9A', '\u0DB1');

               }
                  break;
               case 125 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2065:
               // '\\u0DB3' .. '\\u0DBB'
               {
                  matchRange('\u0DB3', '\u0DBB');

               }
                  break;
               case 126 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2084:
               // '\\u0DBD'
               {
                  match('\u0DBD');

               }
                  break;
               case 127 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2093:
               // '\\u0DC0' .. '\\u0DC6'
               {
                  matchRange('\u0DC0', '\u0DC6');

               }
                  break;
               case 128 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2112:
               // '\\u0E01' .. '\\u0E30'
               {
                  matchRange('\u0E01', '\u0E30');

               }
                  break;
               case 129 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2131:
               // '\\u0E32' .. '\\u0E33'
               {
                  matchRange('\u0E32', '\u0E33');

               }
                  break;
               case 130 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2150:
               // '\\u0E3F' .. '\\u0E46'
               {
                  matchRange('\u0E3F', '\u0E46');

               }
                  break;
               case 131 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2169:
               // '\\u0E81' .. '\\u0E82'
               {
                  matchRange('\u0E81', '\u0E82');

               }
                  break;
               case 132 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2188:
               // '\\u0E84'
               {
                  match('\u0E84');

               }
                  break;
               case 133 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2197:
               // '\\u0E87' .. '\\u0E88'
               {
                  matchRange('\u0E87', '\u0E88');

               }
                  break;
               case 134 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2216:
               // '\\u0E8A'
               {
                  match('\u0E8A');

               }
                  break;
               case 135 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2225:
               // '\\u0E8D'
               {
                  match('\u0E8D');

               }
                  break;
               case 136 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2234:
               // '\\u0E94' .. '\\u0E97'
               {
                  matchRange('\u0E94', '\u0E97');

               }
                  break;
               case 137 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2253:
               // '\\u0E99' .. '\\u0E9F'
               {
                  matchRange('\u0E99', '\u0E9F');

               }
                  break;
               case 138 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2272:
               // '\\u0EA1' .. '\\u0EA3'
               {
                  matchRange('\u0EA1', '\u0EA3');

               }
                  break;
               case 139 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2291:
               // '\\u0EA5'
               {
                  match('\u0EA5');

               }
                  break;
               case 140 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2300:
               // '\\u0EA7'
               {
                  match('\u0EA7');

               }
                  break;
               case 141 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2309:
               // '\\u0EAA' .. '\\u0EAB'
               {
                  matchRange('\u0EAA', '\u0EAB');

               }
                  break;
               case 142 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2328:
               // '\\u0EAD' .. '\\u0EB0'
               {
                  matchRange('\u0EAD', '\u0EB0');

               }
                  break;
               case 143 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2347:
               // '\\u0EB2' .. '\\u0EB3'
               {
                  matchRange('\u0EB2', '\u0EB3');

               }
                  break;
               case 144 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2366:
               // '\\u0EBD'
               {
                  match('\u0EBD');

               }
                  break;
               case 145 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2375:
               // '\\u0EC0' .. '\\u0EC4'
               {
                  matchRange('\u0EC0', '\u0EC4');

               }
                  break;
               case 146 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2394:
               // '\\u0EC6'
               {
                  match('\u0EC6');

               }
                  break;
               case 147 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2403:
               // '\\u0EDC' .. '\\u0EDD'
               {
                  matchRange('\u0EDC', '\u0EDD');

               }
                  break;
               case 148 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2422:
               // '\\u0F00'
               {
                  match('\u0F00');

               }
                  break;
               case 149 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2431:
               // '\\u0F40' .. '\\u0F47'
               {
                  matchRange('\u0F40', '\u0F47');

               }
                  break;
               case 150 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2450:
               // '\\u0F49' .. '\\u0F6A'
               {
                  matchRange('\u0F49', '\u0F6A');

               }
                  break;
               case 151 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2469:
               // '\\u0F88' .. '\\u0F8B'
               {
                  matchRange('\u0F88', '\u0F8B');

               }
                  break;
               case 152 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2488:
               // '\\u1000' .. '\\u1021'
               {
                  matchRange('\u1000', '\u1021');

               }
                  break;
               case 153 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2507:
               // '\\u1023' .. '\\u1027'
               {
                  matchRange('\u1023', '\u1027');

               }
                  break;
               case 154 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2526:
               // '\\u1029' .. '\\u102A'
               {
                  matchRange('\u1029', '\u102A');

               }
                  break;
               case 155 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2545:
               // '\\u1050' .. '\\u1055'
               {
                  matchRange('\u1050', '\u1055');

               }
                  break;
               case 156 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2564:
               // '\\u10A0' .. '\\u10C5'
               {
                  matchRange('\u10A0', '\u10C5');

               }
                  break;
               case 157 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2583:
               // '\\u10D0' .. '\\u10F8'
               {
                  matchRange('\u10D0', '\u10F8');

               }
                  break;
               case 158 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2602:
               // '\\u1100' .. '\\u1159'
               {
                  matchRange('\u1100', '\u1159');

               }
                  break;
               case 159 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2621:
               // '\\u115F' .. '\\u11A2'
               {
                  matchRange('\u115F', '\u11A2');

               }
                  break;
               case 160 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2640:
               // '\\u11A8' .. '\\u11F9'
               {
                  matchRange('\u11A8', '\u11F9');

               }
                  break;
               case 161 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2659:
               // '\\u1200' .. '\\u1206'
               {
                  matchRange('\u1200', '\u1206');

               }
                  break;
               case 162 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2678:
               // '\\u1208' .. '\\u1246'
               {
                  matchRange('\u1208', '\u1246');

               }
                  break;
               case 163 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2697:
               // '\\u1248'
               {
                  match('\u1248');

               }
                  break;
               case 164 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2706:
               // '\\u124A' .. '\\u124D'
               {
                  matchRange('\u124A', '\u124D');

               }
                  break;
               case 165 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2725:
               // '\\u1250' .. '\\u1256'
               {
                  matchRange('\u1250', '\u1256');

               }
                  break;
               case 166 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2744:
               // '\\u1258'
               {
                  match('\u1258');

               }
                  break;
               case 167 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2753:
               // '\\u125A' .. '\\u125D'
               {
                  matchRange('\u125A', '\u125D');

               }
                  break;
               case 168 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2772:
               // '\\u1260' .. '\\u1286'
               {
                  matchRange('\u1260', '\u1286');

               }
                  break;
               case 169 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2791:
               // '\\u1288'
               {
                  match('\u1288');

               }
                  break;
               case 170 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2800:
               // '\\u128A' .. '\\u128D'
               {
                  matchRange('\u128A', '\u128D');

               }
                  break;
               case 171 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2819:
               // '\\u1290' .. '\\u12AE'
               {
                  matchRange('\u1290', '\u12AE');

               }
                  break;
               case 172 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2838:
               // '\\u12B0'
               {
                  match('\u12B0');

               }
                  break;
               case 173 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2847:
               // '\\u12B2' .. '\\u12B5'
               {
                  matchRange('\u12B2', '\u12B5');

               }
                  break;
               case 174 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2866:
               // '\\u12B8' .. '\\u12BE'
               {
                  matchRange('\u12B8', '\u12BE');

               }
                  break;
               case 175 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2885:
               // '\\u12C0'
               {
                  match('\u12C0');

               }
                  break;
               case 176 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2894:
               // '\\u12C2' .. '\\u12C5'
               {
                  matchRange('\u12C2', '\u12C5');

               }
                  break;
               case 177 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2913:
               // '\\u12C8' .. '\\u12CE'
               {
                  matchRange('\u12C8', '\u12CE');

               }
                  break;
               case 178 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2932:
               // '\\u12D0' .. '\\u12D6'
               {
                  matchRange('\u12D0', '\u12D6');

               }
                  break;
               case 179 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2951:
               // '\\u12D8' .. '\\u12EE'
               {
                  matchRange('\u12D8', '\u12EE');

               }
                  break;
               case 180 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2970:
               // '\\u12F0' .. '\\u130E'
               {
                  matchRange('\u12F0', '\u130E');

               }
                  break;
               case 181 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2989:
               // '\\u1310'
               {
                  match('\u1310');

               }
                  break;
               case 182 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:2998:
               // '\\u1312' .. '\\u1315'
               {
                  matchRange('\u1312', '\u1315');

               }
                  break;
               case 183 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3017:
               // '\\u1318' .. '\\u131E'
               {
                  matchRange('\u1318', '\u131E');

               }
                  break;
               case 184 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3036:
               // '\\u1320' .. '\\u1346'
               {
                  matchRange('\u1320', '\u1346');

               }
                  break;
               case 185 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3055:
               // '\\u1348' .. '\\u135A'
               {
                  matchRange('\u1348', '\u135A');

               }
                  break;
               case 186 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3074:
               // '\\u13A0' .. '\\u13F4'
               {
                  matchRange('\u13A0', '\u13F4');

               }
                  break;
               case 187 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3093:
               // '\\u1401' .. '\\u166C'
               {
                  matchRange('\u1401', '\u166C');

               }
                  break;
               case 188 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3112:
               // '\\u166F' .. '\\u1676'
               {
                  matchRange('\u166F', '\u1676');

               }
                  break;
               case 189 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3131:
               // '\\u1681' .. '\\u169A'
               {
                  matchRange('\u1681', '\u169A');

               }
                  break;
               case 190 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3150:
               // '\\u16A0' .. '\\u16EA'
               {
                  matchRange('\u16A0', '\u16EA');

               }
                  break;
               case 191 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3169:
               // '\\u16EE' .. '\\u16F0'
               {
                  matchRange('\u16EE', '\u16F0');

               }
                  break;
               case 192 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3188:
               // '\\u1700' .. '\\u170C'
               {
                  matchRange('\u1700', '\u170C');

               }
                  break;
               case 193 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3207:
               // '\\u170E' .. '\\u1711'
               {
                  matchRange('\u170E', '\u1711');

               }
                  break;
               case 194 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3226:
               // '\\u1720' .. '\\u1731'
               {
                  matchRange('\u1720', '\u1731');

               }
                  break;
               case 195 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3245:
               // '\\u1740' .. '\\u1751'
               {
                  matchRange('\u1740', '\u1751');

               }
                  break;
               case 196 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3264:
               // '\\u1760' .. '\\u176C'
               {
                  matchRange('\u1760', '\u176C');

               }
                  break;
               case 197 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3283:
               // '\\u176E' .. '\\u1770'
               {
                  matchRange('\u176E', '\u1770');

               }
                  break;
               case 198 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3302:
               // '\\u1780' .. '\\u17B3'
               {
                  matchRange('\u1780', '\u17B3');

               }
                  break;
               case 199 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3321:
               // '\\u17D7'
               {
                  match('\u17D7');

               }
                  break;
               case 200 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3330:
               // '\\u17DB' .. '\\u17DC'
               {
                  matchRange('\u17DB', '\u17DC');

               }
                  break;
               case 201 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3349:
               // '\\u1820' .. '\\u1877'
               {
                  matchRange('\u1820', '\u1877');

               }
                  break;
               case 202 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3368:
               // '\\u1880' .. '\\u18A8'
               {
                  matchRange('\u1880', '\u18A8');

               }
                  break;
               case 203 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3387:
               // '\\u1900' .. '\\u191C'
               {
                  matchRange('\u1900', '\u191C');

               }
                  break;
               case 204 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3406:
               // '\\u1950' .. '\\u196D'
               {
                  matchRange('\u1950', '\u196D');

               }
                  break;
               case 205 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3425:
               // '\\u1970' .. '\\u1974'
               {
                  matchRange('\u1970', '\u1974');

               }
                  break;
               case 206 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3444:
               // '\\u1D00' .. '\\u1D6B'
               {
                  matchRange('\u1D00', '\u1D6B');

               }
                  break;
               case 207 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3463:
               // '\\u1E00' .. '\\u1E9B'
               {
                  matchRange('\u1E00', '\u1E9B');

               }
                  break;
               case 208 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3482:
               // '\\u1EA0' .. '\\u1EF9'
               {
                  matchRange('\u1EA0', '\u1EF9');

               }
                  break;
               case 209 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3501:
               // '\\u1F00' .. '\\u1F15'
               {
                  matchRange('\u1F00', '\u1F15');

               }
                  break;
               case 210 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3520:
               // '\\u1F18' .. '\\u1F1D'
               {
                  matchRange('\u1F18', '\u1F1D');

               }
                  break;
               case 211 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3539:
               // '\\u1F20' .. '\\u1F45'
               {
                  matchRange('\u1F20', '\u1F45');

               }
                  break;
               case 212 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3558:
               // '\\u1F48' .. '\\u1F4D'
               {
                  matchRange('\u1F48', '\u1F4D');

               }
                  break;
               case 213 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3577:
               // '\\u1F50' .. '\\u1F57'
               {
                  matchRange('\u1F50', '\u1F57');

               }
                  break;
               case 214 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3596:
               // '\\u1F59'
               {
                  match('\u1F59');

               }
                  break;
               case 215 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3605:
               // '\\u1F5B'
               {
                  match('\u1F5B');

               }
                  break;
               case 216 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3614:
               // '\\u1F5D'
               {
                  match('\u1F5D');

               }
                  break;
               case 217 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3623:
               // '\\u1F5F' .. '\\u1F7D'
               {
                  matchRange('\u1F5F', '\u1F7D');

               }
                  break;
               case 218 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3642:
               // '\\u1F80' .. '\\u1FB4'
               {
                  matchRange('\u1F80', '\u1FB4');

               }
                  break;
               case 219 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3661:
               // '\\u1FB6' .. '\\u1FBC'
               {
                  matchRange('\u1FB6', '\u1FBC');

               }
                  break;
               case 220 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3680:
               // '\\u1FBE'
               {
                  match('\u1FBE');

               }
                  break;
               case 221 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3689:
               // '\\u1FC2' .. '\\u1FC4'
               {
                  matchRange('\u1FC2', '\u1FC4');

               }
                  break;
               case 222 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3708:
               // '\\u1FC6' .. '\\u1FCC'
               {
                  matchRange('\u1FC6', '\u1FCC');

               }
                  break;
               case 223 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3727:
               // '\\u1FD0' .. '\\u1FD3'
               {
                  matchRange('\u1FD0', '\u1FD3');

               }
                  break;
               case 224 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3746:
               // '\\u1FD6' .. '\\u1FDB'
               {
                  matchRange('\u1FD6', '\u1FDB');

               }
                  break;
               case 225 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3765:
               // '\\u1FE0' .. '\\u1FEC'
               {
                  matchRange('\u1FE0', '\u1FEC');

               }
                  break;
               case 226 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3784:
               // '\\u1FF2' .. '\\u1FF4'
               {
                  matchRange('\u1FF2', '\u1FF4');

               }
                  break;
               case 227 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3803:
               // '\\u1FF6' .. '\\u1FFC'
               {
                  matchRange('\u1FF6', '\u1FFC');

               }
                  break;
               case 228 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3822:
               // '\\u203F' .. '\\u2040'
               {
                  matchRange('\u203F', '\u2040');

               }
                  break;
               case 229 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3841:
               // '\\u2054'
               {
                  match('\u2054');

               }
                  break;
               case 230 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3850:
               // '\\u2071'
               {
                  match('\u2071');

               }
                  break;
               case 231 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3859:
               // '\\u207F'
               {
                  match('\u207F');

               }
                  break;
               case 232 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3868:
               // '\\u20A0' .. '\\u20B1'
               {
                  matchRange('\u20A0', '\u20B1');

               }
                  break;
               case 233 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3887:
               // '\\u2102'
               {
                  match('\u2102');

               }
                  break;
               case 234 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3896:
               // '\\u2107'
               {
                  match('\u2107');

               }
                  break;
               case 235 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3905:
               // '\\u210A' .. '\\u2113'
               {
                  matchRange('\u210A', '\u2113');

               }
                  break;
               case 236 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3924:
               // '\\u2115'
               {
                  match('\u2115');

               }
                  break;
               case 237 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3933:
               // '\\u2119' .. '\\u211D'
               {
                  matchRange('\u2119', '\u211D');

               }
                  break;
               case 238 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3952:
               // '\\u2124'
               {
                  match('\u2124');

               }
                  break;
               case 239 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3961:
               // '\\u2126'
               {
                  match('\u2126');

               }
                  break;
               case 240 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3970:
               // '\\u2128'
               {
                  match('\u2128');

               }
                  break;
               case 241 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3979:
               // '\\u212A' .. '\\u212D'
               {
                  matchRange('\u212A', '\u212D');

               }
                  break;
               case 242 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:3998:
               // '\\u212F' .. '\\u2131'
               {
                  matchRange('\u212F', '\u2131');

               }
                  break;
               case 243 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4017:
               // '\\u2133' .. '\\u2139'
               {
                  matchRange('\u2133', '\u2139');

               }
                  break;
               case 244 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4036:
               // '\\u213D' .. '\\u213F'
               {
                  matchRange('\u213D', '\u213F');

               }
                  break;
               case 245 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4055:
               // '\\u2145' .. '\\u2149'
               {
                  matchRange('\u2145', '\u2149');

               }
                  break;
               case 246 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4074:
               // '\\u2160' .. '\\u2183'
               {
                  matchRange('\u2160', '\u2183');

               }
                  break;
               case 247 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4093:
               // '\\u3005' .. '\\u3007'
               {
                  matchRange('\u3005', '\u3007');

               }
                  break;
               case 248 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4112:
               // '\\u3021' .. '\\u3029'
               {
                  matchRange('\u3021', '\u3029');

               }
                  break;
               case 249 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4131:
               // '\\u3031' .. '\\u3035'
               {
                  matchRange('\u3031', '\u3035');

               }
                  break;
               case 250 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4150:
               // '\\u3038' .. '\\u303C'
               {
                  matchRange('\u3038', '\u303C');

               }
                  break;
               case 251 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4169:
               // '\\u3041' .. '\\u3096'
               {
                  matchRange('\u3041', '\u3096');

               }
                  break;
               case 252 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4188:
               // '\\u309D' .. '\\u309F'
               {
                  matchRange('\u309D', '\u309F');

               }
                  break;
               case 253 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4207:
               // '\\u30A1' .. '\\u30FF'
               {
                  matchRange('\u30A1', '\u30FF');

               }
                  break;
               case 254 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4226:
               // '\\u3105' .. '\\u312C'
               {
                  matchRange('\u3105', '\u312C');

               }
                  break;
               case 255 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4245:
               // '\\u3131' .. '\\u318E'
               {
                  matchRange('\u3131', '\u318E');

               }
                  break;
               case 256 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4264:
               // '\\u31A0' .. '\\u31B7'
               {
                  matchRange('\u31A0', '\u31B7');

               }
                  break;
               case 257 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4283:
               // '\\u31F0' .. '\\u31FF'
               {
                  matchRange('\u31F0', '\u31FF');

               }
                  break;
               case 258 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4302:
               // '\\u3400' .. '\\u4DB5'
               {
                  matchRange('\u3400', '\u4DB5');

               }
                  break;
               case 259 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4321:
               // '\\u4E00' .. '\\u9FA5'
               {
                  matchRange('\u4E00', '\u9FA5');

               }
                  break;
               case 260 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4340:
               // '\\uA000' .. '\\uA48C'
               {
                  matchRange('\uA000', '\uA48C');

               }
                  break;
               case 261 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4359:
               // '\\uAC00' .. '\\uD7A3'
               {
                  matchRange('\uAC00', '\uD7A3');

               }
                  break;
               case 262 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4378:
               // '\\uF900' .. '\\uFA2D'
               {
                  matchRange('\uF900', '\uFA2D');

               }
                  break;
               case 263 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4397:
               // '\\uFA30' .. '\\uFA6A'
               {
                  matchRange('\uFA30', '\uFA6A');

               }
                  break;
               case 264 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4416:
               // '\\uFB00' .. '\\uFB06'
               {
                  matchRange('\uFB00', '\uFB06');

               }
                  break;
               case 265 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4435:
               // '\\uFB13' .. '\\uFB17'
               {
                  matchRange('\uFB13', '\uFB17');

               }
                  break;
               case 266 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4454:
               // '\\uFB1D'
               {
                  match('\uFB1D');

               }
                  break;
               case 267 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4463:
               // '\\uFB1F' .. '\\uFB28'
               {
                  matchRange('\uFB1F', '\uFB28');

               }
                  break;
               case 268 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4482:
               // '\\uFB2A' .. '\\uFB36'
               {
                  matchRange('\uFB2A', '\uFB36');

               }
                  break;
               case 269 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4501:
               // '\\uFB38' .. '\\uFB3C'
               {
                  matchRange('\uFB38', '\uFB3C');

               }
                  break;
               case 270 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4520:
               // '\\uFB3E'
               {
                  match('\uFB3E');

               }
                  break;
               case 271 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4529:
               // '\\uFB40' .. '\\uFB41'
               {
                  matchRange('\uFB40', '\uFB41');

               }
                  break;
               case 272 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4548:
               // '\\uFB43' .. '\\uFB44'
               {
                  matchRange('\uFB43', '\uFB44');

               }
                  break;
               case 273 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4567:
               // '\\uFB46' .. '\\uFBB1'
               {
                  matchRange('\uFB46', '\uFBB1');

               }
                  break;
               case 274 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4586:
               // '\\uFBD3' .. '\\uFD3D'
               {
                  matchRange('\uFBD3', '\uFD3D');

               }
                  break;
               case 275 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4605:
               // '\\uFD50' .. '\\uFD8F'
               {
                  matchRange('\uFD50', '\uFD8F');

               }
                  break;
               case 276 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4624:
               // '\\uFD92' .. '\\uFDC7'
               {
                  matchRange('\uFD92', '\uFDC7');

               }
                  break;
               case 277 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4643:
               // '\\uFDF0' .. '\\uFDFC'
               {
                  matchRange('\uFDF0', '\uFDFC');

               }
                  break;
               case 278 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4662:
               // '\\uFE33' .. '\\uFE34'
               {
                  matchRange('\uFE33', '\uFE34');

               }
                  break;
               case 279 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4681:
               // '\\uFE4D' .. '\\uFE4F'
               {
                  matchRange('\uFE4D', '\uFE4F');

               }
                  break;
               case 280 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4700:
               // '\\uFE69'
               {
                  match('\uFE69');

               }
                  break;
               case 281 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4709:
               // '\\uFE70' .. '\\uFE74'
               {
                  matchRange('\uFE70', '\uFE74');

               }
                  break;
               case 282 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4728:
               // '\\uFE76' .. '\\uFEFC'
               {
                  matchRange('\uFE76', '\uFEFC');

               }
                  break;
               case 283 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4747:
               // '\\uFF04'
               {
                  match('\uFF04');

               }
                  break;
               case 284 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4756:
               // '\\uFF21' .. '\\uFF3A'
               {
                  matchRange('\uFF21', '\uFF3A');

               }
                  break;
               case 285 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4775:
               // '\\uFF3F'
               {
                  match('\uFF3F');

               }
                  break;
               case 286 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4784:
               // '\\uFF41' .. '\\uFF5A'
               {
                  matchRange('\uFF41', '\uFF5A');

               }
                  break;
               case 287 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4803:
               // '\\uFF65' .. '\\uFFBE'
               {
                  matchRange('\uFF65', '\uFFBE');

               }
                  break;
               case 288 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4822:
               // '\\uFFC2' .. '\\uFFC7'
               {
                  matchRange('\uFFC2', '\uFFC7');

               }
                  break;
               case 289 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4841:
               // '\\uFFCA' .. '\\uFFCF'
               {
                  matchRange('\uFFCA', '\uFFCF');

               }
                  break;
               case 290 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4860:
               // '\\uFFD2' .. '\\uFFD7'
               {
                  matchRange('\uFFD2', '\uFFD7');

               }
                  break;
               case 291 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4879:
               // '\\uFFDA' .. '\\uFFDC'
               {
                  matchRange('\uFFDA', '\uFFDC');

               }
                  break;
               case 292 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4898:
               // '\\uFFE0' .. '\\uFFE1'
               {
                  matchRange('\uFFE0', '\uFFE1');

               }
                  break;
               case 293 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4917:
               // '\\uFFE5' .. '\\uFFE6'
               {
                  matchRange('\uFFE5', '\uFFE6');

               }
                  break;
               case 294 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8627:4936:
               // '\\uD800' .. '\\uDBFF' '\\uDC00' .. '\\uDFFF'
               {
                  matchRange('\uD800', '\uDBFF');
                  matchRange('\uDC00', '\uDFFF');

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_JAVALETTER"

   // $ANTLR start "RULE_JAVALETTERORDIGIT"
   public final void mRULE_JAVALETTERORDIGIT() throws RecognitionException {
      try {
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:33: ( (
         // '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '$' | '0' .. '9' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u007F'
         // .. '\\u009F' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00AD' | '\\u00B5' | '\\u00BA' | '\\u00C0' ..
         // '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' ..
         // '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u0300' .. '\\u0357' | '\\u035D' .. '\\u036F' | '\\u037A'
         // | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' |
         // '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u0483' .. '\\u0486' |
         // '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0500' .. '\\u050F' |
         // '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u0591' .. '\\u05A1' | '\\u05A3' ..
         // '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u05D0' .. '\\u05EA'
         // | '\\u05F0' .. '\\u05F2' | '\\u0600' .. '\\u0603' | '\\u0610' .. '\\u0615' | '\\u0621' .. '\\u063A' |
         // '\\u0640' .. '\\u0658' | '\\u0660' .. '\\u0669' | '\\u066E' .. '\\u06D3' | '\\u06D5' .. '\\u06DD' |
         // '\\u06DF' .. '\\u06E8' | '\\u06EA' .. '\\u06FC' | '\\u06FF' | '\\u070F' .. '\\u074A' | '\\u074D' ..
         // '\\u074F' | '\\u0780' .. '\\u07B1' | '\\u0901' .. '\\u0939' | '\\u093C' .. '\\u094D' | '\\u0950' ..
         // '\\u0954' | '\\u0958' .. '\\u0963' | '\\u0966' .. '\\u096F' | '\\u0981' .. '\\u0983' | '\\u0985' ..
         // '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6'
         // .. '\\u09B9' | '\\u09BC' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' |
         // '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E3' | '\\u09E6' .. '\\u09F3' | '\\u0A01' .. '\\u0A03' |
         // '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' |
         // '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A3C' | '\\u0A3E' ..
         // '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A66'
         // .. '\\u0A74' | '\\u0A81' .. '\\u0A83' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' ..
         // '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABC' ..
         // '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE3' | '\\u0AE6'
         // .. '\\u0AEF' | '\\u0AF1' | '\\u0B01' .. '\\u0B03' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' |
         // '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' |
         // '\\u0B3C' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' |
         // '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B66' .. '\\u0B6F' | '\\u0B71' | '\\u0B82' ..
         // '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' ..
         // '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE'
         // .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' ..
         // '\\u0BCD' | '\\u0BD7' | '\\u0BE7' .. '\\u0BEF' | '\\u0BF9' | '\\u0C01' .. '\\u0C03' | '\\u0C05' .. '\\u0C0C'
         // | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' |
         // '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' |
         // '\\u0C60' .. '\\u0C61' | '\\u0C66' .. '\\u0C6F' | '\\u0C82' .. '\\u0C83' | '\\u0C85' .. '\\u0C8C' |
         // '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' |
         // '\\u0CBC' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' |
         // '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0CE6' .. '\\u0CEF' | '\\u0D02' .. '\\u0D03' | '\\u0D05' ..
         // '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D3E' ..
         // '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0D60' .. '\\u0D61' | '\\u0D66'
         // .. '\\u0D6F' | '\\u0D82' .. '\\u0D83' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' | '\\u0DB3' ..
         // '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0DCA' | '\\u0DCF' .. '\\u0DD4' | '\\u0DD6' | '\\u0DD8'
         // .. '\\u0DDF' | '\\u0DF2' .. '\\u0DF3' | '\\u0E01' .. '\\u0E3A' | '\\u0E3F' .. '\\u0E4E' | '\\u0E50' ..
         // '\\u0E59' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94'
         // .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' ..
         // '\\u0EAB' | '\\u0EAD' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EC8'
         // .. '\\u0ECD' | '\\u0ED0' .. '\\u0ED9' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F18' .. '\\u0F19' |
         // '\\u0F20' .. '\\u0F29' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' .. '\\u0F47' | '\\u0F49' .. '\\u0F6A'
         // | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' |
         // '\\u0FC6' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102A' | '\\u102C' ..
         // '\\u1032' | '\\u1036' .. '\\u1039' | '\\u1040' .. '\\u1049' | '\\u1050' .. '\\u1059' | '\\u10A0' ..
         // '\\u10C5' | '\\u10D0' .. '\\u10F8' | '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' ..
         // '\\u11F9' | '\\u1200' .. '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250'
         // .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' ..
         // '\\u128D' | '\\u1290' .. '\\u12AE' | '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0'
         // | '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' |
         // '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' ..
         // '\\u1346' | '\\u1348' .. '\\u135A' | '\\u1369' .. '\\u1371' | '\\u13A0' .. '\\u13F4' | '\\u1401' ..
         // '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' ..
         // '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1714' | '\\u1720' .. '\\u1734' | '\\u1740' ..
         // '\\u1753' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1772' .. '\\u1773' | '\\u1780' ..
         // '\\u17D3' | '\\u17D7' | '\\u17DB' .. '\\u17DD' | '\\u17E0' .. '\\u17E9' | '\\u180B' .. '\\u180D' | '\\u1810'
         // .. '\\u1819' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A9' | '\\u1900' .. '\\u191C' | '\\u1920' ..
         // '\\u192B' | '\\u1930' .. '\\u193B' | '\\u1946' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' ..
         // '\\u1D6B' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' ..
         // '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B'
         // | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' |
         // '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' |
         // '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u200C' .. '\\u200F' |
         // '\\u202A' .. '\\u202E' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2060' .. '\\u2063' | '\\u206A' ..
         // '\\u206F' | '\\u2071' | '\\u207F' | '\\u20A0' .. '\\u20B1' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5'
         // .. '\\u20EA' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211D' |
         // '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133' .. '\\u2139'
         // | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' .. '\\u3007' |
         // '\\u3021' .. '\\u302F' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' .. '\\u3096' |
         // '\\u3099' .. '\\u309A' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' |
         // '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' |
         // '\\u4E00' .. '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' |
         // '\\uFA30' .. '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' .. '\\uFB28' |
         // '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' ..
         // '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' ..
         // '\\uFDC7' | '\\uFDF0' .. '\\uFDFC' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE23' | '\\uFE33' ..
         // '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFEFF'
         // | '\\uFF04' | '\\uFF10' .. '\\uFF19' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A' |
         // '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' |
         // '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' | '\\uFFF9' .. '\\uFFFB' |
         // '\\uD800' .. '\\uDBFF' '\\uDC00' .. '\\uDFFF' ) )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:35: (
         // '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '$' | '0' .. '9' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u007F'
         // .. '\\u009F' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00AD' | '\\u00B5' | '\\u00BA' | '\\u00C0' ..
         // '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' ..
         // '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u0300' .. '\\u0357' | '\\u035D' .. '\\u036F' | '\\u037A'
         // | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' |
         // '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u0483' .. '\\u0486' |
         // '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0500' .. '\\u050F' |
         // '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u0591' .. '\\u05A1' | '\\u05A3' ..
         // '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u05D0' .. '\\u05EA'
         // | '\\u05F0' .. '\\u05F2' | '\\u0600' .. '\\u0603' | '\\u0610' .. '\\u0615' | '\\u0621' .. '\\u063A' |
         // '\\u0640' .. '\\u0658' | '\\u0660' .. '\\u0669' | '\\u066E' .. '\\u06D3' | '\\u06D5' .. '\\u06DD' |
         // '\\u06DF' .. '\\u06E8' | '\\u06EA' .. '\\u06FC' | '\\u06FF' | '\\u070F' .. '\\u074A' | '\\u074D' ..
         // '\\u074F' | '\\u0780' .. '\\u07B1' | '\\u0901' .. '\\u0939' | '\\u093C' .. '\\u094D' | '\\u0950' ..
         // '\\u0954' | '\\u0958' .. '\\u0963' | '\\u0966' .. '\\u096F' | '\\u0981' .. '\\u0983' | '\\u0985' ..
         // '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6'
         // .. '\\u09B9' | '\\u09BC' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' |
         // '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E3' | '\\u09E6' .. '\\u09F3' | '\\u0A01' .. '\\u0A03' |
         // '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' |
         // '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A3C' | '\\u0A3E' ..
         // '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A66'
         // .. '\\u0A74' | '\\u0A81' .. '\\u0A83' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' ..
         // '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABC' ..
         // '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE3' | '\\u0AE6'
         // .. '\\u0AEF' | '\\u0AF1' | '\\u0B01' .. '\\u0B03' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' |
         // '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' |
         // '\\u0B3C' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' |
         // '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B66' .. '\\u0B6F' | '\\u0B71' | '\\u0B82' ..
         // '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' ..
         // '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE'
         // .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' ..
         // '\\u0BCD' | '\\u0BD7' | '\\u0BE7' .. '\\u0BEF' | '\\u0BF9' | '\\u0C01' .. '\\u0C03' | '\\u0C05' .. '\\u0C0C'
         // | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' |
         // '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' |
         // '\\u0C60' .. '\\u0C61' | '\\u0C66' .. '\\u0C6F' | '\\u0C82' .. '\\u0C83' | '\\u0C85' .. '\\u0C8C' |
         // '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' |
         // '\\u0CBC' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' |
         // '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0CE6' .. '\\u0CEF' | '\\u0D02' .. '\\u0D03' | '\\u0D05' ..
         // '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D3E' ..
         // '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0D60' .. '\\u0D61' | '\\u0D66'
         // .. '\\u0D6F' | '\\u0D82' .. '\\u0D83' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' | '\\u0DB3' ..
         // '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0DCA' | '\\u0DCF' .. '\\u0DD4' | '\\u0DD6' | '\\u0DD8'
         // .. '\\u0DDF' | '\\u0DF2' .. '\\u0DF3' | '\\u0E01' .. '\\u0E3A' | '\\u0E3F' .. '\\u0E4E' | '\\u0E50' ..
         // '\\u0E59' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94'
         // .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' ..
         // '\\u0EAB' | '\\u0EAD' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EC8'
         // .. '\\u0ECD' | '\\u0ED0' .. '\\u0ED9' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F18' .. '\\u0F19' |
         // '\\u0F20' .. '\\u0F29' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' .. '\\u0F47' | '\\u0F49' .. '\\u0F6A'
         // | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F8B' | '\\u0F90' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' |
         // '\\u0FC6' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102A' | '\\u102C' ..
         // '\\u1032' | '\\u1036' .. '\\u1039' | '\\u1040' .. '\\u1049' | '\\u1050' .. '\\u1059' | '\\u10A0' ..
         // '\\u10C5' | '\\u10D0' .. '\\u10F8' | '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' ..
         // '\\u11F9' | '\\u1200' .. '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250'
         // .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' ..
         // '\\u128D' | '\\u1290' .. '\\u12AE' | '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0'
         // | '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' |
         // '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' ..
         // '\\u1346' | '\\u1348' .. '\\u135A' | '\\u1369' .. '\\u1371' | '\\u13A0' .. '\\u13F4' | '\\u1401' ..
         // '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' ..
         // '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1714' | '\\u1720' .. '\\u1734' | '\\u1740' ..
         // '\\u1753' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1772' .. '\\u1773' | '\\u1780' ..
         // '\\u17D3' | '\\u17D7' | '\\u17DB' .. '\\u17DD' | '\\u17E0' .. '\\u17E9' | '\\u180B' .. '\\u180D' | '\\u1810'
         // .. '\\u1819' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A9' | '\\u1900' .. '\\u191C' | '\\u1920' ..
         // '\\u192B' | '\\u1930' .. '\\u193B' | '\\u1946' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' ..
         // '\\u1D6B' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' ..
         // '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B'
         // | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' |
         // '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' |
         // '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u200C' .. '\\u200F' |
         // '\\u202A' .. '\\u202E' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2060' .. '\\u2063' | '\\u206A' ..
         // '\\u206F' | '\\u2071' | '\\u207F' | '\\u20A0' .. '\\u20B1' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5'
         // .. '\\u20EA' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211D' |
         // '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133' .. '\\u2139'
         // | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' .. '\\u3007' |
         // '\\u3021' .. '\\u302F' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' .. '\\u3096' |
         // '\\u3099' .. '\\u309A' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' |
         // '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' |
         // '\\u4E00' .. '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' |
         // '\\uFA30' .. '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' .. '\\uFB28' |
         // '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' ..
         // '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' ..
         // '\\uFDC7' | '\\uFDF0' .. '\\uFDFC' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE23' | '\\uFE33' ..
         // '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFEFF'
         // | '\\uFF04' | '\\uFF10' .. '\\uFF19' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A' |
         // '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' |
         // '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' | '\\uFFF9' .. '\\uFFFB' |
         // '\\uD800' .. '\\uDBFF' '\\uDC00' .. '\\uDFFF' )
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:35:
            // ( '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '$' | '0' .. '9' | 'A' .. 'Z' | '_' | 'a' .. 'z' |
            // '\\u007F' .. '\\u009F' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00AD' | '\\u00B5' | '\\u00BA' |
            // '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' |
            // '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u0300' .. '\\u0357' | '\\u035D' ..
            // '\\u036F' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' |
            // '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' | '\\u0400' .. '\\u0481' |
            // '\\u0483' .. '\\u0486' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' |
            // '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u0591' ..
            // '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' |
            // '\\u05C4' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0600' .. '\\u0603' | '\\u0610' ..
            // '\\u0615' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u0658' | '\\u0660' .. '\\u0669' | '\\u066E' ..
            // '\\u06D3' | '\\u06D5' .. '\\u06DD' | '\\u06DF' .. '\\u06E8' | '\\u06EA' .. '\\u06FC' | '\\u06FF' |
            // '\\u070F' .. '\\u074A' | '\\u074D' .. '\\u074F' | '\\u0780' .. '\\u07B1' | '\\u0901' .. '\\u0939' |
            // '\\u093C' .. '\\u094D' | '\\u0950' .. '\\u0954' | '\\u0958' .. '\\u0963' | '\\u0966' .. '\\u096F' |
            // '\\u0981' .. '\\u0983' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' |
            // '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09BC' .. '\\u09C4' | '\\u09C7' ..
            // '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E3' |
            // '\\u09E6' .. '\\u09F3' | '\\u0A01' .. '\\u0A03' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' |
            // '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' |
            // '\\u0A38' .. '\\u0A39' | '\\u0A3C' | '\\u0A3E' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' ..
            // '\\u0A4D' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A66' .. '\\u0A74' | '\\u0A81' .. '\\u0A83' |
            // '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' |
            // '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABC' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' |
            // '\\u0ACB' .. '\\u0ACD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE3' | '\\u0AE6' .. '\\u0AEF' | '\\u0AF1' |
            // '\\u0B01' .. '\\u0B03' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' |
            // '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3C' .. '\\u0B43' |
            // '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B5C' .. '\\u0B5D' |
            // '\\u0B5F' .. '\\u0B61' | '\\u0B66' .. '\\u0B6F' | '\\u0B71' | '\\u0B82' .. '\\u0B83' | '\\u0B85' ..
            // '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' |
            // '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' |
            // '\\u0BB7' .. '\\u0BB9' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' |
            // '\\u0BD7' | '\\u0BE7' .. '\\u0BEF' | '\\u0BF9' | '\\u0C01' .. '\\u0C03' | '\\u0C05' .. '\\u0C0C' |
            // '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' |
            // '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' |
            // '\\u0C60' .. '\\u0C61' | '\\u0C66' .. '\\u0C6F' | '\\u0C82' .. '\\u0C83' | '\\u0C85' .. '\\u0C8C' |
            // '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' |
            // '\\u0CBC' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' |
            // '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0CE6' .. '\\u0CEF' | '\\u0D02' .. '\\u0D03' | '\\u0D05' ..
            // '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D3E' ..
            // '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0D60' .. '\\u0D61' |
            // '\\u0D66' .. '\\u0D6F' | '\\u0D82' .. '\\u0D83' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' |
            // '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0DCA' | '\\u0DCF' .. '\\u0DD4' |
            // '\\u0DD6' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' .. '\\u0DF3' | '\\u0E01' .. '\\u0E3A' | '\\u0E3F' ..
            // '\\u0E4E' | '\\u0E50' .. '\\u0E59' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' |
            // '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' |
            // '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBD' |
            // '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EC8' .. '\\u0ECD' | '\\u0ED0' .. '\\u0ED9' | '\\u0EDC' ..
            // '\\u0EDD' | '\\u0F00' | '\\u0F18' .. '\\u0F19' | '\\u0F20' .. '\\u0F29' | '\\u0F35' | '\\u0F37' |
            // '\\u0F39' | '\\u0F3E' .. '\\u0F47' | '\\u0F49' .. '\\u0F6A' | '\\u0F71' .. '\\u0F84' | '\\u0F86' ..
            // '\\u0F8B' | '\\u0F90' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' | '\\u0FC6' | '\\u1000' .. '\\u1021' |
            // '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102A' | '\\u102C' .. '\\u1032' | '\\u1036' .. '\\u1039' |
            // '\\u1040' .. '\\u1049' | '\\u1050' .. '\\u1059' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F8' |
            // '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' .. '\\u1206' |
            // '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' |
            // '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' ..
            // '\\u12AE' | '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' ..
            // '\\u12C5' | '\\u12C8' .. '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' | '\\u12F0' ..
            // '\\u130E' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' .. '\\u1346' |
            // '\\u1348' .. '\\u135A' | '\\u1369' .. '\\u1371' | '\\u13A0' .. '\\u13F4' | '\\u1401' .. '\\u166C' |
            // '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' .. '\\u16F0' |
            // '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1714' | '\\u1720' .. '\\u1734' | '\\u1740' .. '\\u1753' |
            // '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1772' .. '\\u1773' | '\\u1780' .. '\\u17D3' |
            // '\\u17D7' | '\\u17DB' .. '\\u17DD' | '\\u17E0' .. '\\u17E9' | '\\u180B' .. '\\u180D' | '\\u1810' ..
            // '\\u1819' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A9' | '\\u1900' .. '\\u191C' | '\\u1920' ..
            // '\\u192B' | '\\u1930' .. '\\u193B' | '\\u1946' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' ..
            // '\\u1D6B' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' ..
            // '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' |
            // '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' |
            // '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' ..
            // '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u200C' ..
            // '\\u200F' | '\\u202A' .. '\\u202E' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2060' .. '\\u2063' |
            // '\\u206A' .. '\\u206F' | '\\u2071' | '\\u207F' | '\\u20A0' .. '\\u20B1' | '\\u20D0' .. '\\u20DC' |
            // '\\u20E1' | '\\u20E5' .. '\\u20EA' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' |
            // '\\u2119' .. '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' ..
            // '\\u2131' | '\\u2133' .. '\\u2139' | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' ..
            // '\\u2183' | '\\u3005' .. '\\u3007' | '\\u3021' .. '\\u302F' | '\\u3031' .. '\\u3035' | '\\u3038' ..
            // '\\u303C' | '\\u3041' .. '\\u3096' | '\\u3099' .. '\\u309A' | '\\u309D' .. '\\u309F' | '\\u30A1' ..
            // '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' ..
            // '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' .. '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' ..
            // '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' .. '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' ..
            // '\\uFB17' | '\\uFB1D' .. '\\uFB28' | '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' |
            // '\\uFB40' .. '\\uFB41' | '\\uFB43' .. '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' |
            // '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' | '\\uFDF0' .. '\\uFDFC' | '\\uFE00' .. '\\uFE0F' |
            // '\\uFE20' .. '\\uFE23' | '\\uFE33' .. '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' ..
            // '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFEFF' | '\\uFF04' | '\\uFF10' .. '\\uFF19' | '\\uFF21' ..
            // '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A' | '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' |
            // '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' | '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' |
            // '\\uFFE5' .. '\\uFFE6' | '\\uFFF9' .. '\\uFFFB' | '\\uD800' .. '\\uDBFF' '\\uDC00' .. '\\uDFFF' )
            int alt44 = 386;
            int LA44_0 = input.LA(1);

            if (((LA44_0 >= '\u0000' && LA44_0 <= '\b'))) {
               alt44 = 1;
            }
            else if (((LA44_0 >= '\u000E' && LA44_0 <= '\u001B'))) {
               alt44 = 2;
            }
            else if ((LA44_0 == '$')) {
               alt44 = 3;
            }
            else if (((LA44_0 >= '0' && LA44_0 <= '9'))) {
               alt44 = 4;
            }
            else if (((LA44_0 >= 'A' && LA44_0 <= 'Z'))) {
               alt44 = 5;
            }
            else if ((LA44_0 == '_')) {
               alt44 = 6;
            }
            else if (((LA44_0 >= 'a' && LA44_0 <= 'z'))) {
               alt44 = 7;
            }
            else if (((LA44_0 >= '\u007F' && LA44_0 <= '\u009F'))) {
               alt44 = 8;
            }
            else if (((LA44_0 >= '\u00A2' && LA44_0 <= '\u00A5'))) {
               alt44 = 9;
            }
            else if ((LA44_0 == '\u00AA')) {
               alt44 = 10;
            }
            else if ((LA44_0 == '\u00AD')) {
               alt44 = 11;
            }
            else if ((LA44_0 == '\u00B5')) {
               alt44 = 12;
            }
            else if ((LA44_0 == '\u00BA')) {
               alt44 = 13;
            }
            else if (((LA44_0 >= '\u00C0' && LA44_0 <= '\u00D6'))) {
               alt44 = 14;
            }
            else if (((LA44_0 >= '\u00D8' && LA44_0 <= '\u00F6'))) {
               alt44 = 15;
            }
            else if (((LA44_0 >= '\u00F8' && LA44_0 <= '\u0236'))) {
               alt44 = 16;
            }
            else if (((LA44_0 >= '\u0250' && LA44_0 <= '\u02C1'))) {
               alt44 = 17;
            }
            else if (((LA44_0 >= '\u02C6' && LA44_0 <= '\u02D1'))) {
               alt44 = 18;
            }
            else if (((LA44_0 >= '\u02E0' && LA44_0 <= '\u02E4'))) {
               alt44 = 19;
            }
            else if ((LA44_0 == '\u02EE')) {
               alt44 = 20;
            }
            else if (((LA44_0 >= '\u0300' && LA44_0 <= '\u0357'))) {
               alt44 = 21;
            }
            else if (((LA44_0 >= '\u035D' && LA44_0 <= '\u036F'))) {
               alt44 = 22;
            }
            else if ((LA44_0 == '\u037A')) {
               alt44 = 23;
            }
            else if ((LA44_0 == '\u0386')) {
               alt44 = 24;
            }
            else if (((LA44_0 >= '\u0388' && LA44_0 <= '\u038A'))) {
               alt44 = 25;
            }
            else if ((LA44_0 == '\u038C')) {
               alt44 = 26;
            }
            else if (((LA44_0 >= '\u038E' && LA44_0 <= '\u03A1'))) {
               alt44 = 27;
            }
            else if (((LA44_0 >= '\u03A3' && LA44_0 <= '\u03CE'))) {
               alt44 = 28;
            }
            else if (((LA44_0 >= '\u03D0' && LA44_0 <= '\u03F5'))) {
               alt44 = 29;
            }
            else if (((LA44_0 >= '\u03F7' && LA44_0 <= '\u03FB'))) {
               alt44 = 30;
            }
            else if (((LA44_0 >= '\u0400' && LA44_0 <= '\u0481'))) {
               alt44 = 31;
            }
            else if (((LA44_0 >= '\u0483' && LA44_0 <= '\u0486'))) {
               alt44 = 32;
            }
            else if (((LA44_0 >= '\u048A' && LA44_0 <= '\u04CE'))) {
               alt44 = 33;
            }
            else if (((LA44_0 >= '\u04D0' && LA44_0 <= '\u04F5'))) {
               alt44 = 34;
            }
            else if (((LA44_0 >= '\u04F8' && LA44_0 <= '\u04F9'))) {
               alt44 = 35;
            }
            else if (((LA44_0 >= '\u0500' && LA44_0 <= '\u050F'))) {
               alt44 = 36;
            }
            else if (((LA44_0 >= '\u0531' && LA44_0 <= '\u0556'))) {
               alt44 = 37;
            }
            else if ((LA44_0 == '\u0559')) {
               alt44 = 38;
            }
            else if (((LA44_0 >= '\u0561' && LA44_0 <= '\u0587'))) {
               alt44 = 39;
            }
            else if (((LA44_0 >= '\u0591' && LA44_0 <= '\u05A1'))) {
               alt44 = 40;
            }
            else if (((LA44_0 >= '\u05A3' && LA44_0 <= '\u05B9'))) {
               alt44 = 41;
            }
            else if (((LA44_0 >= '\u05BB' && LA44_0 <= '\u05BD'))) {
               alt44 = 42;
            }
            else if ((LA44_0 == '\u05BF')) {
               alt44 = 43;
            }
            else if (((LA44_0 >= '\u05C1' && LA44_0 <= '\u05C2'))) {
               alt44 = 44;
            }
            else if ((LA44_0 == '\u05C4')) {
               alt44 = 45;
            }
            else if (((LA44_0 >= '\u05D0' && LA44_0 <= '\u05EA'))) {
               alt44 = 46;
            }
            else if (((LA44_0 >= '\u05F0' && LA44_0 <= '\u05F2'))) {
               alt44 = 47;
            }
            else if (((LA44_0 >= '\u0600' && LA44_0 <= '\u0603'))) {
               alt44 = 48;
            }
            else if (((LA44_0 >= '\u0610' && LA44_0 <= '\u0615'))) {
               alt44 = 49;
            }
            else if (((LA44_0 >= '\u0621' && LA44_0 <= '\u063A'))) {
               alt44 = 50;
            }
            else if (((LA44_0 >= '\u0640' && LA44_0 <= '\u0658'))) {
               alt44 = 51;
            }
            else if (((LA44_0 >= '\u0660' && LA44_0 <= '\u0669'))) {
               alt44 = 52;
            }
            else if (((LA44_0 >= '\u066E' && LA44_0 <= '\u06D3'))) {
               alt44 = 53;
            }
            else if (((LA44_0 >= '\u06D5' && LA44_0 <= '\u06DD'))) {
               alt44 = 54;
            }
            else if (((LA44_0 >= '\u06DF' && LA44_0 <= '\u06E8'))) {
               alt44 = 55;
            }
            else if (((LA44_0 >= '\u06EA' && LA44_0 <= '\u06FC'))) {
               alt44 = 56;
            }
            else if ((LA44_0 == '\u06FF')) {
               alt44 = 57;
            }
            else if (((LA44_0 >= '\u070F' && LA44_0 <= '\u074A'))) {
               alt44 = 58;
            }
            else if (((LA44_0 >= '\u074D' && LA44_0 <= '\u074F'))) {
               alt44 = 59;
            }
            else if (((LA44_0 >= '\u0780' && LA44_0 <= '\u07B1'))) {
               alt44 = 60;
            }
            else if (((LA44_0 >= '\u0901' && LA44_0 <= '\u0939'))) {
               alt44 = 61;
            }
            else if (((LA44_0 >= '\u093C' && LA44_0 <= '\u094D'))) {
               alt44 = 62;
            }
            else if (((LA44_0 >= '\u0950' && LA44_0 <= '\u0954'))) {
               alt44 = 63;
            }
            else if (((LA44_0 >= '\u0958' && LA44_0 <= '\u0963'))) {
               alt44 = 64;
            }
            else if (((LA44_0 >= '\u0966' && LA44_0 <= '\u096F'))) {
               alt44 = 65;
            }
            else if (((LA44_0 >= '\u0981' && LA44_0 <= '\u0983'))) {
               alt44 = 66;
            }
            else if (((LA44_0 >= '\u0985' && LA44_0 <= '\u098C'))) {
               alt44 = 67;
            }
            else if (((LA44_0 >= '\u098F' && LA44_0 <= '\u0990'))) {
               alt44 = 68;
            }
            else if (((LA44_0 >= '\u0993' && LA44_0 <= '\u09A8'))) {
               alt44 = 69;
            }
            else if (((LA44_0 >= '\u09AA' && LA44_0 <= '\u09B0'))) {
               alt44 = 70;
            }
            else if ((LA44_0 == '\u09B2')) {
               alt44 = 71;
            }
            else if (((LA44_0 >= '\u09B6' && LA44_0 <= '\u09B9'))) {
               alt44 = 72;
            }
            else if (((LA44_0 >= '\u09BC' && LA44_0 <= '\u09C4'))) {
               alt44 = 73;
            }
            else if (((LA44_0 >= '\u09C7' && LA44_0 <= '\u09C8'))) {
               alt44 = 74;
            }
            else if (((LA44_0 >= '\u09CB' && LA44_0 <= '\u09CD'))) {
               alt44 = 75;
            }
            else if ((LA44_0 == '\u09D7')) {
               alt44 = 76;
            }
            else if (((LA44_0 >= '\u09DC' && LA44_0 <= '\u09DD'))) {
               alt44 = 77;
            }
            else if (((LA44_0 >= '\u09DF' && LA44_0 <= '\u09E3'))) {
               alt44 = 78;
            }
            else if (((LA44_0 >= '\u09E6' && LA44_0 <= '\u09F3'))) {
               alt44 = 79;
            }
            else if (((LA44_0 >= '\u0A01' && LA44_0 <= '\u0A03'))) {
               alt44 = 80;
            }
            else if (((LA44_0 >= '\u0A05' && LA44_0 <= '\u0A0A'))) {
               alt44 = 81;
            }
            else if (((LA44_0 >= '\u0A0F' && LA44_0 <= '\u0A10'))) {
               alt44 = 82;
            }
            else if (((LA44_0 >= '\u0A13' && LA44_0 <= '\u0A28'))) {
               alt44 = 83;
            }
            else if (((LA44_0 >= '\u0A2A' && LA44_0 <= '\u0A30'))) {
               alt44 = 84;
            }
            else if (((LA44_0 >= '\u0A32' && LA44_0 <= '\u0A33'))) {
               alt44 = 85;
            }
            else if (((LA44_0 >= '\u0A35' && LA44_0 <= '\u0A36'))) {
               alt44 = 86;
            }
            else if (((LA44_0 >= '\u0A38' && LA44_0 <= '\u0A39'))) {
               alt44 = 87;
            }
            else if ((LA44_0 == '\u0A3C')) {
               alt44 = 88;
            }
            else if (((LA44_0 >= '\u0A3E' && LA44_0 <= '\u0A42'))) {
               alt44 = 89;
            }
            else if (((LA44_0 >= '\u0A47' && LA44_0 <= '\u0A48'))) {
               alt44 = 90;
            }
            else if (((LA44_0 >= '\u0A4B' && LA44_0 <= '\u0A4D'))) {
               alt44 = 91;
            }
            else if (((LA44_0 >= '\u0A59' && LA44_0 <= '\u0A5C'))) {
               alt44 = 92;
            }
            else if ((LA44_0 == '\u0A5E')) {
               alt44 = 93;
            }
            else if (((LA44_0 >= '\u0A66' && LA44_0 <= '\u0A74'))) {
               alt44 = 94;
            }
            else if (((LA44_0 >= '\u0A81' && LA44_0 <= '\u0A83'))) {
               alt44 = 95;
            }
            else if (((LA44_0 >= '\u0A85' && LA44_0 <= '\u0A8D'))) {
               alt44 = 96;
            }
            else if (((LA44_0 >= '\u0A8F' && LA44_0 <= '\u0A91'))) {
               alt44 = 97;
            }
            else if (((LA44_0 >= '\u0A93' && LA44_0 <= '\u0AA8'))) {
               alt44 = 98;
            }
            else if (((LA44_0 >= '\u0AAA' && LA44_0 <= '\u0AB0'))) {
               alt44 = 99;
            }
            else if (((LA44_0 >= '\u0AB2' && LA44_0 <= '\u0AB3'))) {
               alt44 = 100;
            }
            else if (((LA44_0 >= '\u0AB5' && LA44_0 <= '\u0AB9'))) {
               alt44 = 101;
            }
            else if (((LA44_0 >= '\u0ABC' && LA44_0 <= '\u0AC5'))) {
               alt44 = 102;
            }
            else if (((LA44_0 >= '\u0AC7' && LA44_0 <= '\u0AC9'))) {
               alt44 = 103;
            }
            else if (((LA44_0 >= '\u0ACB' && LA44_0 <= '\u0ACD'))) {
               alt44 = 104;
            }
            else if ((LA44_0 == '\u0AD0')) {
               alt44 = 105;
            }
            else if (((LA44_0 >= '\u0AE0' && LA44_0 <= '\u0AE3'))) {
               alt44 = 106;
            }
            else if (((LA44_0 >= '\u0AE6' && LA44_0 <= '\u0AEF'))) {
               alt44 = 107;
            }
            else if ((LA44_0 == '\u0AF1')) {
               alt44 = 108;
            }
            else if (((LA44_0 >= '\u0B01' && LA44_0 <= '\u0B03'))) {
               alt44 = 109;
            }
            else if (((LA44_0 >= '\u0B05' && LA44_0 <= '\u0B0C'))) {
               alt44 = 110;
            }
            else if (((LA44_0 >= '\u0B0F' && LA44_0 <= '\u0B10'))) {
               alt44 = 111;
            }
            else if (((LA44_0 >= '\u0B13' && LA44_0 <= '\u0B28'))) {
               alt44 = 112;
            }
            else if (((LA44_0 >= '\u0B2A' && LA44_0 <= '\u0B30'))) {
               alt44 = 113;
            }
            else if (((LA44_0 >= '\u0B32' && LA44_0 <= '\u0B33'))) {
               alt44 = 114;
            }
            else if (((LA44_0 >= '\u0B35' && LA44_0 <= '\u0B39'))) {
               alt44 = 115;
            }
            else if (((LA44_0 >= '\u0B3C' && LA44_0 <= '\u0B43'))) {
               alt44 = 116;
            }
            else if (((LA44_0 >= '\u0B47' && LA44_0 <= '\u0B48'))) {
               alt44 = 117;
            }
            else if (((LA44_0 >= '\u0B4B' && LA44_0 <= '\u0B4D'))) {
               alt44 = 118;
            }
            else if (((LA44_0 >= '\u0B56' && LA44_0 <= '\u0B57'))) {
               alt44 = 119;
            }
            else if (((LA44_0 >= '\u0B5C' && LA44_0 <= '\u0B5D'))) {
               alt44 = 120;
            }
            else if (((LA44_0 >= '\u0B5F' && LA44_0 <= '\u0B61'))) {
               alt44 = 121;
            }
            else if (((LA44_0 >= '\u0B66' && LA44_0 <= '\u0B6F'))) {
               alt44 = 122;
            }
            else if ((LA44_0 == '\u0B71')) {
               alt44 = 123;
            }
            else if (((LA44_0 >= '\u0B82' && LA44_0 <= '\u0B83'))) {
               alt44 = 124;
            }
            else if (((LA44_0 >= '\u0B85' && LA44_0 <= '\u0B8A'))) {
               alt44 = 125;
            }
            else if (((LA44_0 >= '\u0B8E' && LA44_0 <= '\u0B90'))) {
               alt44 = 126;
            }
            else if (((LA44_0 >= '\u0B92' && LA44_0 <= '\u0B95'))) {
               alt44 = 127;
            }
            else if (((LA44_0 >= '\u0B99' && LA44_0 <= '\u0B9A'))) {
               alt44 = 128;
            }
            else if ((LA44_0 == '\u0B9C')) {
               alt44 = 129;
            }
            else if (((LA44_0 >= '\u0B9E' && LA44_0 <= '\u0B9F'))) {
               alt44 = 130;
            }
            else if (((LA44_0 >= '\u0BA3' && LA44_0 <= '\u0BA4'))) {
               alt44 = 131;
            }
            else if (((LA44_0 >= '\u0BA8' && LA44_0 <= '\u0BAA'))) {
               alt44 = 132;
            }
            else if (((LA44_0 >= '\u0BAE' && LA44_0 <= '\u0BB5'))) {
               alt44 = 133;
            }
            else if (((LA44_0 >= '\u0BB7' && LA44_0 <= '\u0BB9'))) {
               alt44 = 134;
            }
            else if (((LA44_0 >= '\u0BBE' && LA44_0 <= '\u0BC2'))) {
               alt44 = 135;
            }
            else if (((LA44_0 >= '\u0BC6' && LA44_0 <= '\u0BC8'))) {
               alt44 = 136;
            }
            else if (((LA44_0 >= '\u0BCA' && LA44_0 <= '\u0BCD'))) {
               alt44 = 137;
            }
            else if ((LA44_0 == '\u0BD7')) {
               alt44 = 138;
            }
            else if (((LA44_0 >= '\u0BE7' && LA44_0 <= '\u0BEF'))) {
               alt44 = 139;
            }
            else if ((LA44_0 == '\u0BF9')) {
               alt44 = 140;
            }
            else if (((LA44_0 >= '\u0C01' && LA44_0 <= '\u0C03'))) {
               alt44 = 141;
            }
            else if (((LA44_0 >= '\u0C05' && LA44_0 <= '\u0C0C'))) {
               alt44 = 142;
            }
            else if (((LA44_0 >= '\u0C0E' && LA44_0 <= '\u0C10'))) {
               alt44 = 143;
            }
            else if (((LA44_0 >= '\u0C12' && LA44_0 <= '\u0C28'))) {
               alt44 = 144;
            }
            else if (((LA44_0 >= '\u0C2A' && LA44_0 <= '\u0C33'))) {
               alt44 = 145;
            }
            else if (((LA44_0 >= '\u0C35' && LA44_0 <= '\u0C39'))) {
               alt44 = 146;
            }
            else if (((LA44_0 >= '\u0C3E' && LA44_0 <= '\u0C44'))) {
               alt44 = 147;
            }
            else if (((LA44_0 >= '\u0C46' && LA44_0 <= '\u0C48'))) {
               alt44 = 148;
            }
            else if (((LA44_0 >= '\u0C4A' && LA44_0 <= '\u0C4D'))) {
               alt44 = 149;
            }
            else if (((LA44_0 >= '\u0C55' && LA44_0 <= '\u0C56'))) {
               alt44 = 150;
            }
            else if (((LA44_0 >= '\u0C60' && LA44_0 <= '\u0C61'))) {
               alt44 = 151;
            }
            else if (((LA44_0 >= '\u0C66' && LA44_0 <= '\u0C6F'))) {
               alt44 = 152;
            }
            else if (((LA44_0 >= '\u0C82' && LA44_0 <= '\u0C83'))) {
               alt44 = 153;
            }
            else if (((LA44_0 >= '\u0C85' && LA44_0 <= '\u0C8C'))) {
               alt44 = 154;
            }
            else if (((LA44_0 >= '\u0C8E' && LA44_0 <= '\u0C90'))) {
               alt44 = 155;
            }
            else if (((LA44_0 >= '\u0C92' && LA44_0 <= '\u0CA8'))) {
               alt44 = 156;
            }
            else if (((LA44_0 >= '\u0CAA' && LA44_0 <= '\u0CB3'))) {
               alt44 = 157;
            }
            else if (((LA44_0 >= '\u0CB5' && LA44_0 <= '\u0CB9'))) {
               alt44 = 158;
            }
            else if (((LA44_0 >= '\u0CBC' && LA44_0 <= '\u0CC4'))) {
               alt44 = 159;
            }
            else if (((LA44_0 >= '\u0CC6' && LA44_0 <= '\u0CC8'))) {
               alt44 = 160;
            }
            else if (((LA44_0 >= '\u0CCA' && LA44_0 <= '\u0CCD'))) {
               alt44 = 161;
            }
            else if (((LA44_0 >= '\u0CD5' && LA44_0 <= '\u0CD6'))) {
               alt44 = 162;
            }
            else if ((LA44_0 == '\u0CDE')) {
               alt44 = 163;
            }
            else if (((LA44_0 >= '\u0CE0' && LA44_0 <= '\u0CE1'))) {
               alt44 = 164;
            }
            else if (((LA44_0 >= '\u0CE6' && LA44_0 <= '\u0CEF'))) {
               alt44 = 165;
            }
            else if (((LA44_0 >= '\u0D02' && LA44_0 <= '\u0D03'))) {
               alt44 = 166;
            }
            else if (((LA44_0 >= '\u0D05' && LA44_0 <= '\u0D0C'))) {
               alt44 = 167;
            }
            else if (((LA44_0 >= '\u0D0E' && LA44_0 <= '\u0D10'))) {
               alt44 = 168;
            }
            else if (((LA44_0 >= '\u0D12' && LA44_0 <= '\u0D28'))) {
               alt44 = 169;
            }
            else if (((LA44_0 >= '\u0D2A' && LA44_0 <= '\u0D39'))) {
               alt44 = 170;
            }
            else if (((LA44_0 >= '\u0D3E' && LA44_0 <= '\u0D43'))) {
               alt44 = 171;
            }
            else if (((LA44_0 >= '\u0D46' && LA44_0 <= '\u0D48'))) {
               alt44 = 172;
            }
            else if (((LA44_0 >= '\u0D4A' && LA44_0 <= '\u0D4D'))) {
               alt44 = 173;
            }
            else if ((LA44_0 == '\u0D57')) {
               alt44 = 174;
            }
            else if (((LA44_0 >= '\u0D60' && LA44_0 <= '\u0D61'))) {
               alt44 = 175;
            }
            else if (((LA44_0 >= '\u0D66' && LA44_0 <= '\u0D6F'))) {
               alt44 = 176;
            }
            else if (((LA44_0 >= '\u0D82' && LA44_0 <= '\u0D83'))) {
               alt44 = 177;
            }
            else if (((LA44_0 >= '\u0D85' && LA44_0 <= '\u0D96'))) {
               alt44 = 178;
            }
            else if (((LA44_0 >= '\u0D9A' && LA44_0 <= '\u0DB1'))) {
               alt44 = 179;
            }
            else if (((LA44_0 >= '\u0DB3' && LA44_0 <= '\u0DBB'))) {
               alt44 = 180;
            }
            else if ((LA44_0 == '\u0DBD')) {
               alt44 = 181;
            }
            else if (((LA44_0 >= '\u0DC0' && LA44_0 <= '\u0DC6'))) {
               alt44 = 182;
            }
            else if ((LA44_0 == '\u0DCA')) {
               alt44 = 183;
            }
            else if (((LA44_0 >= '\u0DCF' && LA44_0 <= '\u0DD4'))) {
               alt44 = 184;
            }
            else if ((LA44_0 == '\u0DD6')) {
               alt44 = 185;
            }
            else if (((LA44_0 >= '\u0DD8' && LA44_0 <= '\u0DDF'))) {
               alt44 = 186;
            }
            else if (((LA44_0 >= '\u0DF2' && LA44_0 <= '\u0DF3'))) {
               alt44 = 187;
            }
            else if (((LA44_0 >= '\u0E01' && LA44_0 <= '\u0E3A'))) {
               alt44 = 188;
            }
            else if (((LA44_0 >= '\u0E3F' && LA44_0 <= '\u0E4E'))) {
               alt44 = 189;
            }
            else if (((LA44_0 >= '\u0E50' && LA44_0 <= '\u0E59'))) {
               alt44 = 190;
            }
            else if (((LA44_0 >= '\u0E81' && LA44_0 <= '\u0E82'))) {
               alt44 = 191;
            }
            else if ((LA44_0 == '\u0E84')) {
               alt44 = 192;
            }
            else if (((LA44_0 >= '\u0E87' && LA44_0 <= '\u0E88'))) {
               alt44 = 193;
            }
            else if ((LA44_0 == '\u0E8A')) {
               alt44 = 194;
            }
            else if ((LA44_0 == '\u0E8D')) {
               alt44 = 195;
            }
            else if (((LA44_0 >= '\u0E94' && LA44_0 <= '\u0E97'))) {
               alt44 = 196;
            }
            else if (((LA44_0 >= '\u0E99' && LA44_0 <= '\u0E9F'))) {
               alt44 = 197;
            }
            else if (((LA44_0 >= '\u0EA1' && LA44_0 <= '\u0EA3'))) {
               alt44 = 198;
            }
            else if ((LA44_0 == '\u0EA5')) {
               alt44 = 199;
            }
            else if ((LA44_0 == '\u0EA7')) {
               alt44 = 200;
            }
            else if (((LA44_0 >= '\u0EAA' && LA44_0 <= '\u0EAB'))) {
               alt44 = 201;
            }
            else if (((LA44_0 >= '\u0EAD' && LA44_0 <= '\u0EB9'))) {
               alt44 = 202;
            }
            else if (((LA44_0 >= '\u0EBB' && LA44_0 <= '\u0EBD'))) {
               alt44 = 203;
            }
            else if (((LA44_0 >= '\u0EC0' && LA44_0 <= '\u0EC4'))) {
               alt44 = 204;
            }
            else if ((LA44_0 == '\u0EC6')) {
               alt44 = 205;
            }
            else if (((LA44_0 >= '\u0EC8' && LA44_0 <= '\u0ECD'))) {
               alt44 = 206;
            }
            else if (((LA44_0 >= '\u0ED0' && LA44_0 <= '\u0ED9'))) {
               alt44 = 207;
            }
            else if (((LA44_0 >= '\u0EDC' && LA44_0 <= '\u0EDD'))) {
               alt44 = 208;
            }
            else if ((LA44_0 == '\u0F00')) {
               alt44 = 209;
            }
            else if (((LA44_0 >= '\u0F18' && LA44_0 <= '\u0F19'))) {
               alt44 = 210;
            }
            else if (((LA44_0 >= '\u0F20' && LA44_0 <= '\u0F29'))) {
               alt44 = 211;
            }
            else if ((LA44_0 == '\u0F35')) {
               alt44 = 212;
            }
            else if ((LA44_0 == '\u0F37')) {
               alt44 = 213;
            }
            else if ((LA44_0 == '\u0F39')) {
               alt44 = 214;
            }
            else if (((LA44_0 >= '\u0F3E' && LA44_0 <= '\u0F47'))) {
               alt44 = 215;
            }
            else if (((LA44_0 >= '\u0F49' && LA44_0 <= '\u0F6A'))) {
               alt44 = 216;
            }
            else if (((LA44_0 >= '\u0F71' && LA44_0 <= '\u0F84'))) {
               alt44 = 217;
            }
            else if (((LA44_0 >= '\u0F86' && LA44_0 <= '\u0F8B'))) {
               alt44 = 218;
            }
            else if (((LA44_0 >= '\u0F90' && LA44_0 <= '\u0F97'))) {
               alt44 = 219;
            }
            else if (((LA44_0 >= '\u0F99' && LA44_0 <= '\u0FBC'))) {
               alt44 = 220;
            }
            else if ((LA44_0 == '\u0FC6')) {
               alt44 = 221;
            }
            else if (((LA44_0 >= '\u1000' && LA44_0 <= '\u1021'))) {
               alt44 = 222;
            }
            else if (((LA44_0 >= '\u1023' && LA44_0 <= '\u1027'))) {
               alt44 = 223;
            }
            else if (((LA44_0 >= '\u1029' && LA44_0 <= '\u102A'))) {
               alt44 = 224;
            }
            else if (((LA44_0 >= '\u102C' && LA44_0 <= '\u1032'))) {
               alt44 = 225;
            }
            else if (((LA44_0 >= '\u1036' && LA44_0 <= '\u1039'))) {
               alt44 = 226;
            }
            else if (((LA44_0 >= '\u1040' && LA44_0 <= '\u1049'))) {
               alt44 = 227;
            }
            else if (((LA44_0 >= '\u1050' && LA44_0 <= '\u1059'))) {
               alt44 = 228;
            }
            else if (((LA44_0 >= '\u10A0' && LA44_0 <= '\u10C5'))) {
               alt44 = 229;
            }
            else if (((LA44_0 >= '\u10D0' && LA44_0 <= '\u10F8'))) {
               alt44 = 230;
            }
            else if (((LA44_0 >= '\u1100' && LA44_0 <= '\u1159'))) {
               alt44 = 231;
            }
            else if (((LA44_0 >= '\u115F' && LA44_0 <= '\u11A2'))) {
               alt44 = 232;
            }
            else if (((LA44_0 >= '\u11A8' && LA44_0 <= '\u11F9'))) {
               alt44 = 233;
            }
            else if (((LA44_0 >= '\u1200' && LA44_0 <= '\u1206'))) {
               alt44 = 234;
            }
            else if (((LA44_0 >= '\u1208' && LA44_0 <= '\u1246'))) {
               alt44 = 235;
            }
            else if ((LA44_0 == '\u1248')) {
               alt44 = 236;
            }
            else if (((LA44_0 >= '\u124A' && LA44_0 <= '\u124D'))) {
               alt44 = 237;
            }
            else if (((LA44_0 >= '\u1250' && LA44_0 <= '\u1256'))) {
               alt44 = 238;
            }
            else if ((LA44_0 == '\u1258')) {
               alt44 = 239;
            }
            else if (((LA44_0 >= '\u125A' && LA44_0 <= '\u125D'))) {
               alt44 = 240;
            }
            else if (((LA44_0 >= '\u1260' && LA44_0 <= '\u1286'))) {
               alt44 = 241;
            }
            else if ((LA44_0 == '\u1288')) {
               alt44 = 242;
            }
            else if (((LA44_0 >= '\u128A' && LA44_0 <= '\u128D'))) {
               alt44 = 243;
            }
            else if (((LA44_0 >= '\u1290' && LA44_0 <= '\u12AE'))) {
               alt44 = 244;
            }
            else if ((LA44_0 == '\u12B0')) {
               alt44 = 245;
            }
            else if (((LA44_0 >= '\u12B2' && LA44_0 <= '\u12B5'))) {
               alt44 = 246;
            }
            else if (((LA44_0 >= '\u12B8' && LA44_0 <= '\u12BE'))) {
               alt44 = 247;
            }
            else if ((LA44_0 == '\u12C0')) {
               alt44 = 248;
            }
            else if (((LA44_0 >= '\u12C2' && LA44_0 <= '\u12C5'))) {
               alt44 = 249;
            }
            else if (((LA44_0 >= '\u12C8' && LA44_0 <= '\u12CE'))) {
               alt44 = 250;
            }
            else if (((LA44_0 >= '\u12D0' && LA44_0 <= '\u12D6'))) {
               alt44 = 251;
            }
            else if (((LA44_0 >= '\u12D8' && LA44_0 <= '\u12EE'))) {
               alt44 = 252;
            }
            else if (((LA44_0 >= '\u12F0' && LA44_0 <= '\u130E'))) {
               alt44 = 253;
            }
            else if ((LA44_0 == '\u1310')) {
               alt44 = 254;
            }
            else if (((LA44_0 >= '\u1312' && LA44_0 <= '\u1315'))) {
               alt44 = 255;
            }
            else if (((LA44_0 >= '\u1318' && LA44_0 <= '\u131E'))) {
               alt44 = 256;
            }
            else if (((LA44_0 >= '\u1320' && LA44_0 <= '\u1346'))) {
               alt44 = 257;
            }
            else if (((LA44_0 >= '\u1348' && LA44_0 <= '\u135A'))) {
               alt44 = 258;
            }
            else if (((LA44_0 >= '\u1369' && LA44_0 <= '\u1371'))) {
               alt44 = 259;
            }
            else if (((LA44_0 >= '\u13A0' && LA44_0 <= '\u13F4'))) {
               alt44 = 260;
            }
            else if (((LA44_0 >= '\u1401' && LA44_0 <= '\u166C'))) {
               alt44 = 261;
            }
            else if (((LA44_0 >= '\u166F' && LA44_0 <= '\u1676'))) {
               alt44 = 262;
            }
            else if (((LA44_0 >= '\u1681' && LA44_0 <= '\u169A'))) {
               alt44 = 263;
            }
            else if (((LA44_0 >= '\u16A0' && LA44_0 <= '\u16EA'))) {
               alt44 = 264;
            }
            else if (((LA44_0 >= '\u16EE' && LA44_0 <= '\u16F0'))) {
               alt44 = 265;
            }
            else if (((LA44_0 >= '\u1700' && LA44_0 <= '\u170C'))) {
               alt44 = 266;
            }
            else if (((LA44_0 >= '\u170E' && LA44_0 <= '\u1714'))) {
               alt44 = 267;
            }
            else if (((LA44_0 >= '\u1720' && LA44_0 <= '\u1734'))) {
               alt44 = 268;
            }
            else if (((LA44_0 >= '\u1740' && LA44_0 <= '\u1753'))) {
               alt44 = 269;
            }
            else if (((LA44_0 >= '\u1760' && LA44_0 <= '\u176C'))) {
               alt44 = 270;
            }
            else if (((LA44_0 >= '\u176E' && LA44_0 <= '\u1770'))) {
               alt44 = 271;
            }
            else if (((LA44_0 >= '\u1772' && LA44_0 <= '\u1773'))) {
               alt44 = 272;
            }
            else if (((LA44_0 >= '\u1780' && LA44_0 <= '\u17D3'))) {
               alt44 = 273;
            }
            else if ((LA44_0 == '\u17D7')) {
               alt44 = 274;
            }
            else if (((LA44_0 >= '\u17DB' && LA44_0 <= '\u17DD'))) {
               alt44 = 275;
            }
            else if (((LA44_0 >= '\u17E0' && LA44_0 <= '\u17E9'))) {
               alt44 = 276;
            }
            else if (((LA44_0 >= '\u180B' && LA44_0 <= '\u180D'))) {
               alt44 = 277;
            }
            else if (((LA44_0 >= '\u1810' && LA44_0 <= '\u1819'))) {
               alt44 = 278;
            }
            else if (((LA44_0 >= '\u1820' && LA44_0 <= '\u1877'))) {
               alt44 = 279;
            }
            else if (((LA44_0 >= '\u1880' && LA44_0 <= '\u18A9'))) {
               alt44 = 280;
            }
            else if (((LA44_0 >= '\u1900' && LA44_0 <= '\u191C'))) {
               alt44 = 281;
            }
            else if (((LA44_0 >= '\u1920' && LA44_0 <= '\u192B'))) {
               alt44 = 282;
            }
            else if (((LA44_0 >= '\u1930' && LA44_0 <= '\u193B'))) {
               alt44 = 283;
            }
            else if (((LA44_0 >= '\u1946' && LA44_0 <= '\u196D'))) {
               alt44 = 284;
            }
            else if (((LA44_0 >= '\u1970' && LA44_0 <= '\u1974'))) {
               alt44 = 285;
            }
            else if (((LA44_0 >= '\u1D00' && LA44_0 <= '\u1D6B'))) {
               alt44 = 286;
            }
            else if (((LA44_0 >= '\u1E00' && LA44_0 <= '\u1E9B'))) {
               alt44 = 287;
            }
            else if (((LA44_0 >= '\u1EA0' && LA44_0 <= '\u1EF9'))) {
               alt44 = 288;
            }
            else if (((LA44_0 >= '\u1F00' && LA44_0 <= '\u1F15'))) {
               alt44 = 289;
            }
            else if (((LA44_0 >= '\u1F18' && LA44_0 <= '\u1F1D'))) {
               alt44 = 290;
            }
            else if (((LA44_0 >= '\u1F20' && LA44_0 <= '\u1F45'))) {
               alt44 = 291;
            }
            else if (((LA44_0 >= '\u1F48' && LA44_0 <= '\u1F4D'))) {
               alt44 = 292;
            }
            else if (((LA44_0 >= '\u1F50' && LA44_0 <= '\u1F57'))) {
               alt44 = 293;
            }
            else if ((LA44_0 == '\u1F59')) {
               alt44 = 294;
            }
            else if ((LA44_0 == '\u1F5B')) {
               alt44 = 295;
            }
            else if ((LA44_0 == '\u1F5D')) {
               alt44 = 296;
            }
            else if (((LA44_0 >= '\u1F5F' && LA44_0 <= '\u1F7D'))) {
               alt44 = 297;
            }
            else if (((LA44_0 >= '\u1F80' && LA44_0 <= '\u1FB4'))) {
               alt44 = 298;
            }
            else if (((LA44_0 >= '\u1FB6' && LA44_0 <= '\u1FBC'))) {
               alt44 = 299;
            }
            else if ((LA44_0 == '\u1FBE')) {
               alt44 = 300;
            }
            else if (((LA44_0 >= '\u1FC2' && LA44_0 <= '\u1FC4'))) {
               alt44 = 301;
            }
            else if (((LA44_0 >= '\u1FC6' && LA44_0 <= '\u1FCC'))) {
               alt44 = 302;
            }
            else if (((LA44_0 >= '\u1FD0' && LA44_0 <= '\u1FD3'))) {
               alt44 = 303;
            }
            else if (((LA44_0 >= '\u1FD6' && LA44_0 <= '\u1FDB'))) {
               alt44 = 304;
            }
            else if (((LA44_0 >= '\u1FE0' && LA44_0 <= '\u1FEC'))) {
               alt44 = 305;
            }
            else if (((LA44_0 >= '\u1FF2' && LA44_0 <= '\u1FF4'))) {
               alt44 = 306;
            }
            else if (((LA44_0 >= '\u1FF6' && LA44_0 <= '\u1FFC'))) {
               alt44 = 307;
            }
            else if (((LA44_0 >= '\u200C' && LA44_0 <= '\u200F'))) {
               alt44 = 308;
            }
            else if (((LA44_0 >= '\u202A' && LA44_0 <= '\u202E'))) {
               alt44 = 309;
            }
            else if (((LA44_0 >= '\u203F' && LA44_0 <= '\u2040'))) {
               alt44 = 310;
            }
            else if ((LA44_0 == '\u2054')) {
               alt44 = 311;
            }
            else if (((LA44_0 >= '\u2060' && LA44_0 <= '\u2063'))) {
               alt44 = 312;
            }
            else if (((LA44_0 >= '\u206A' && LA44_0 <= '\u206F'))) {
               alt44 = 313;
            }
            else if ((LA44_0 == '\u2071')) {
               alt44 = 314;
            }
            else if ((LA44_0 == '\u207F')) {
               alt44 = 315;
            }
            else if (((LA44_0 >= '\u20A0' && LA44_0 <= '\u20B1'))) {
               alt44 = 316;
            }
            else if (((LA44_0 >= '\u20D0' && LA44_0 <= '\u20DC'))) {
               alt44 = 317;
            }
            else if ((LA44_0 == '\u20E1')) {
               alt44 = 318;
            }
            else if (((LA44_0 >= '\u20E5' && LA44_0 <= '\u20EA'))) {
               alt44 = 319;
            }
            else if ((LA44_0 == '\u2102')) {
               alt44 = 320;
            }
            else if ((LA44_0 == '\u2107')) {
               alt44 = 321;
            }
            else if (((LA44_0 >= '\u210A' && LA44_0 <= '\u2113'))) {
               alt44 = 322;
            }
            else if ((LA44_0 == '\u2115')) {
               alt44 = 323;
            }
            else if (((LA44_0 >= '\u2119' && LA44_0 <= '\u211D'))) {
               alt44 = 324;
            }
            else if ((LA44_0 == '\u2124')) {
               alt44 = 325;
            }
            else if ((LA44_0 == '\u2126')) {
               alt44 = 326;
            }
            else if ((LA44_0 == '\u2128')) {
               alt44 = 327;
            }
            else if (((LA44_0 >= '\u212A' && LA44_0 <= '\u212D'))) {
               alt44 = 328;
            }
            else if (((LA44_0 >= '\u212F' && LA44_0 <= '\u2131'))) {
               alt44 = 329;
            }
            else if (((LA44_0 >= '\u2133' && LA44_0 <= '\u2139'))) {
               alt44 = 330;
            }
            else if (((LA44_0 >= '\u213D' && LA44_0 <= '\u213F'))) {
               alt44 = 331;
            }
            else if (((LA44_0 >= '\u2145' && LA44_0 <= '\u2149'))) {
               alt44 = 332;
            }
            else if (((LA44_0 >= '\u2160' && LA44_0 <= '\u2183'))) {
               alt44 = 333;
            }
            else if (((LA44_0 >= '\u3005' && LA44_0 <= '\u3007'))) {
               alt44 = 334;
            }
            else if (((LA44_0 >= '\u3021' && LA44_0 <= '\u302F'))) {
               alt44 = 335;
            }
            else if (((LA44_0 >= '\u3031' && LA44_0 <= '\u3035'))) {
               alt44 = 336;
            }
            else if (((LA44_0 >= '\u3038' && LA44_0 <= '\u303C'))) {
               alt44 = 337;
            }
            else if (((LA44_0 >= '\u3041' && LA44_0 <= '\u3096'))) {
               alt44 = 338;
            }
            else if (((LA44_0 >= '\u3099' && LA44_0 <= '\u309A'))) {
               alt44 = 339;
            }
            else if (((LA44_0 >= '\u309D' && LA44_0 <= '\u309F'))) {
               alt44 = 340;
            }
            else if (((LA44_0 >= '\u30A1' && LA44_0 <= '\u30FF'))) {
               alt44 = 341;
            }
            else if (((LA44_0 >= '\u3105' && LA44_0 <= '\u312C'))) {
               alt44 = 342;
            }
            else if (((LA44_0 >= '\u3131' && LA44_0 <= '\u318E'))) {
               alt44 = 343;
            }
            else if (((LA44_0 >= '\u31A0' && LA44_0 <= '\u31B7'))) {
               alt44 = 344;
            }
            else if (((LA44_0 >= '\u31F0' && LA44_0 <= '\u31FF'))) {
               alt44 = 345;
            }
            else if (((LA44_0 >= '\u3400' && LA44_0 <= '\u4DB5'))) {
               alt44 = 346;
            }
            else if (((LA44_0 >= '\u4E00' && LA44_0 <= '\u9FA5'))) {
               alt44 = 347;
            }
            else if (((LA44_0 >= '\uA000' && LA44_0 <= '\uA48C'))) {
               alt44 = 348;
            }
            else if (((LA44_0 >= '\uAC00' && LA44_0 <= '\uD7A3'))) {
               alt44 = 349;
            }
            else if (((LA44_0 >= '\uF900' && LA44_0 <= '\uFA2D'))) {
               alt44 = 350;
            }
            else if (((LA44_0 >= '\uFA30' && LA44_0 <= '\uFA6A'))) {
               alt44 = 351;
            }
            else if (((LA44_0 >= '\uFB00' && LA44_0 <= '\uFB06'))) {
               alt44 = 352;
            }
            else if (((LA44_0 >= '\uFB13' && LA44_0 <= '\uFB17'))) {
               alt44 = 353;
            }
            else if (((LA44_0 >= '\uFB1D' && LA44_0 <= '\uFB28'))) {
               alt44 = 354;
            }
            else if (((LA44_0 >= '\uFB2A' && LA44_0 <= '\uFB36'))) {
               alt44 = 355;
            }
            else if (((LA44_0 >= '\uFB38' && LA44_0 <= '\uFB3C'))) {
               alt44 = 356;
            }
            else if ((LA44_0 == '\uFB3E')) {
               alt44 = 357;
            }
            else if (((LA44_0 >= '\uFB40' && LA44_0 <= '\uFB41'))) {
               alt44 = 358;
            }
            else if (((LA44_0 >= '\uFB43' && LA44_0 <= '\uFB44'))) {
               alt44 = 359;
            }
            else if (((LA44_0 >= '\uFB46' && LA44_0 <= '\uFBB1'))) {
               alt44 = 360;
            }
            else if (((LA44_0 >= '\uFBD3' && LA44_0 <= '\uFD3D'))) {
               alt44 = 361;
            }
            else if (((LA44_0 >= '\uFD50' && LA44_0 <= '\uFD8F'))) {
               alt44 = 362;
            }
            else if (((LA44_0 >= '\uFD92' && LA44_0 <= '\uFDC7'))) {
               alt44 = 363;
            }
            else if (((LA44_0 >= '\uFDF0' && LA44_0 <= '\uFDFC'))) {
               alt44 = 364;
            }
            else if (((LA44_0 >= '\uFE00' && LA44_0 <= '\uFE0F'))) {
               alt44 = 365;
            }
            else if (((LA44_0 >= '\uFE20' && LA44_0 <= '\uFE23'))) {
               alt44 = 366;
            }
            else if (((LA44_0 >= '\uFE33' && LA44_0 <= '\uFE34'))) {
               alt44 = 367;
            }
            else if (((LA44_0 >= '\uFE4D' && LA44_0 <= '\uFE4F'))) {
               alt44 = 368;
            }
            else if ((LA44_0 == '\uFE69')) {
               alt44 = 369;
            }
            else if (((LA44_0 >= '\uFE70' && LA44_0 <= '\uFE74'))) {
               alt44 = 370;
            }
            else if (((LA44_0 >= '\uFE76' && LA44_0 <= '\uFEFC'))) {
               alt44 = 371;
            }
            else if ((LA44_0 == '\uFEFF')) {
               alt44 = 372;
            }
            else if ((LA44_0 == '\uFF04')) {
               alt44 = 373;
            }
            else if (((LA44_0 >= '\uFF10' && LA44_0 <= '\uFF19'))) {
               alt44 = 374;
            }
            else if (((LA44_0 >= '\uFF21' && LA44_0 <= '\uFF3A'))) {
               alt44 = 375;
            }
            else if ((LA44_0 == '\uFF3F')) {
               alt44 = 376;
            }
            else if (((LA44_0 >= '\uFF41' && LA44_0 <= '\uFF5A'))) {
               alt44 = 377;
            }
            else if (((LA44_0 >= '\uFF65' && LA44_0 <= '\uFFBE'))) {
               alt44 = 378;
            }
            else if (((LA44_0 >= '\uFFC2' && LA44_0 <= '\uFFC7'))) {
               alt44 = 379;
            }
            else if (((LA44_0 >= '\uFFCA' && LA44_0 <= '\uFFCF'))) {
               alt44 = 380;
            }
            else if (((LA44_0 >= '\uFFD2' && LA44_0 <= '\uFFD7'))) {
               alt44 = 381;
            }
            else if (((LA44_0 >= '\uFFDA' && LA44_0 <= '\uFFDC'))) {
               alt44 = 382;
            }
            else if (((LA44_0 >= '\uFFE0' && LA44_0 <= '\uFFE1'))) {
               alt44 = 383;
            }
            else if (((LA44_0 >= '\uFFE5' && LA44_0 <= '\uFFE6'))) {
               alt44 = 384;
            }
            else if (((LA44_0 >= '\uFFF9' && LA44_0 <= '\uFFFB'))) {
               alt44 = 385;
            }
            else if (((LA44_0 >= '\uD800' && LA44_0 <= '\uDBFF'))) {
               alt44 = 386;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 44, 0, input);

               throw nvae;
            }
            switch (alt44) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:36:
               // '\\u0000' .. '\\b'
               {
                  matchRange('\u0000', '\b');

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:51:
               // '\\u000E' .. '\\u001B'
               {
                  matchRange('\u000E', '\u001B');

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:70:
               // '$'
               {
                  match('$');

               }
                  break;
               case 4 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:74:
               // '0' .. '9'
               {
                  matchRange('0', '9');

               }
                  break;
               case 5 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:83:
               // 'A' .. 'Z'
               {
                  matchRange('A', 'Z');

               }
                  break;
               case 6 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:92:
               // '_'
               {
                  match('_');

               }
                  break;
               case 7 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:96:
               // 'a' .. 'z'
               {
                  matchRange('a', 'z');

               }
                  break;
               case 8 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:105:
               // '\\u007F' .. '\\u009F'
               {
                  matchRange('\u007F', '\u009F');

               }
                  break;
               case 9 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:124:
               // '\\u00A2' .. '\\u00A5'
               {
                  matchRange('\u00A2', '\u00A5');

               }
                  break;
               case 10 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:143:
               // '\\u00AA'
               {
                  match('\u00AA');

               }
                  break;
               case 11 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:152:
               // '\\u00AD'
               {
                  match('\u00AD');

               }
                  break;
               case 12 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:161:
               // '\\u00B5'
               {
                  match('\u00B5');

               }
                  break;
               case 13 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:170:
               // '\\u00BA'
               {
                  match('\u00BA');

               }
                  break;
               case 14 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:179:
               // '\\u00C0' .. '\\u00D6'
               {
                  matchRange('\u00C0', '\u00D6');

               }
                  break;
               case 15 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:198:
               // '\\u00D8' .. '\\u00F6'
               {
                  matchRange('\u00D8', '\u00F6');

               }
                  break;
               case 16 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:217:
               // '\\u00F8' .. '\\u0236'
               {
                  matchRange('\u00F8', '\u0236');

               }
                  break;
               case 17 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:236:
               // '\\u0250' .. '\\u02C1'
               {
                  matchRange('\u0250', '\u02C1');

               }
                  break;
               case 18 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:255:
               // '\\u02C6' .. '\\u02D1'
               {
                  matchRange('\u02C6', '\u02D1');

               }
                  break;
               case 19 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:274:
               // '\\u02E0' .. '\\u02E4'
               {
                  matchRange('\u02E0', '\u02E4');

               }
                  break;
               case 20 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:293:
               // '\\u02EE'
               {
                  match('\u02EE');

               }
                  break;
               case 21 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:302:
               // '\\u0300' .. '\\u0357'
               {
                  matchRange('\u0300', '\u0357');

               }
                  break;
               case 22 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:321:
               // '\\u035D' .. '\\u036F'
               {
                  matchRange('\u035D', '\u036F');

               }
                  break;
               case 23 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:340:
               // '\\u037A'
               {
                  match('\u037A');

               }
                  break;
               case 24 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:349:
               // '\\u0386'
               {
                  match('\u0386');

               }
                  break;
               case 25 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:358:
               // '\\u0388' .. '\\u038A'
               {
                  matchRange('\u0388', '\u038A');

               }
                  break;
               case 26 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:377:
               // '\\u038C'
               {
                  match('\u038C');

               }
                  break;
               case 27 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:386:
               // '\\u038E' .. '\\u03A1'
               {
                  matchRange('\u038E', '\u03A1');

               }
                  break;
               case 28 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:405:
               // '\\u03A3' .. '\\u03CE'
               {
                  matchRange('\u03A3', '\u03CE');

               }
                  break;
               case 29 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:424:
               // '\\u03D0' .. '\\u03F5'
               {
                  matchRange('\u03D0', '\u03F5');

               }
                  break;
               case 30 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:443:
               // '\\u03F7' .. '\\u03FB'
               {
                  matchRange('\u03F7', '\u03FB');

               }
                  break;
               case 31 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:462:
               // '\\u0400' .. '\\u0481'
               {
                  matchRange('\u0400', '\u0481');

               }
                  break;
               case 32 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:481:
               // '\\u0483' .. '\\u0486'
               {
                  matchRange('\u0483', '\u0486');

               }
                  break;
               case 33 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:500:
               // '\\u048A' .. '\\u04CE'
               {
                  matchRange('\u048A', '\u04CE');

               }
                  break;
               case 34 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:519:
               // '\\u04D0' .. '\\u04F5'
               {
                  matchRange('\u04D0', '\u04F5');

               }
                  break;
               case 35 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:538:
               // '\\u04F8' .. '\\u04F9'
               {
                  matchRange('\u04F8', '\u04F9');

               }
                  break;
               case 36 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:557:
               // '\\u0500' .. '\\u050F'
               {
                  matchRange('\u0500', '\u050F');

               }
                  break;
               case 37 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:576:
               // '\\u0531' .. '\\u0556'
               {
                  matchRange('\u0531', '\u0556');

               }
                  break;
               case 38 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:595:
               // '\\u0559'
               {
                  match('\u0559');

               }
                  break;
               case 39 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:604:
               // '\\u0561' .. '\\u0587'
               {
                  matchRange('\u0561', '\u0587');

               }
                  break;
               case 40 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:623:
               // '\\u0591' .. '\\u05A1'
               {
                  matchRange('\u0591', '\u05A1');

               }
                  break;
               case 41 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:642:
               // '\\u05A3' .. '\\u05B9'
               {
                  matchRange('\u05A3', '\u05B9');

               }
                  break;
               case 42 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:661:
               // '\\u05BB' .. '\\u05BD'
               {
                  matchRange('\u05BB', '\u05BD');

               }
                  break;
               case 43 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:680:
               // '\\u05BF'
               {
                  match('\u05BF');

               }
                  break;
               case 44 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:689:
               // '\\u05C1' .. '\\u05C2'
               {
                  matchRange('\u05C1', '\u05C2');

               }
                  break;
               case 45 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:708:
               // '\\u05C4'
               {
                  match('\u05C4');

               }
                  break;
               case 46 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:717:
               // '\\u05D0' .. '\\u05EA'
               {
                  matchRange('\u05D0', '\u05EA');

               }
                  break;
               case 47 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:736:
               // '\\u05F0' .. '\\u05F2'
               {
                  matchRange('\u05F0', '\u05F2');

               }
                  break;
               case 48 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:755:
               // '\\u0600' .. '\\u0603'
               {
                  matchRange('\u0600', '\u0603');

               }
                  break;
               case 49 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:774:
               // '\\u0610' .. '\\u0615'
               {
                  matchRange('\u0610', '\u0615');

               }
                  break;
               case 50 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:793:
               // '\\u0621' .. '\\u063A'
               {
                  matchRange('\u0621', '\u063A');

               }
                  break;
               case 51 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:812:
               // '\\u0640' .. '\\u0658'
               {
                  matchRange('\u0640', '\u0658');

               }
                  break;
               case 52 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:831:
               // '\\u0660' .. '\\u0669'
               {
                  matchRange('\u0660', '\u0669');

               }
                  break;
               case 53 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:850:
               // '\\u066E' .. '\\u06D3'
               {
                  matchRange('\u066E', '\u06D3');

               }
                  break;
               case 54 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:869:
               // '\\u06D5' .. '\\u06DD'
               {
                  matchRange('\u06D5', '\u06DD');

               }
                  break;
               case 55 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:888:
               // '\\u06DF' .. '\\u06E8'
               {
                  matchRange('\u06DF', '\u06E8');

               }
                  break;
               case 56 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:907:
               // '\\u06EA' .. '\\u06FC'
               {
                  matchRange('\u06EA', '\u06FC');

               }
                  break;
               case 57 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:926:
               // '\\u06FF'
               {
                  match('\u06FF');

               }
                  break;
               case 58 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:935:
               // '\\u070F' .. '\\u074A'
               {
                  matchRange('\u070F', '\u074A');

               }
                  break;
               case 59 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:954:
               // '\\u074D' .. '\\u074F'
               {
                  matchRange('\u074D', '\u074F');

               }
                  break;
               case 60 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:973:
               // '\\u0780' .. '\\u07B1'
               {
                  matchRange('\u0780', '\u07B1');

               }
                  break;
               case 61 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:992:
               // '\\u0901' .. '\\u0939'
               {
                  matchRange('\u0901', '\u0939');

               }
                  break;
               case 62 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1011:
               // '\\u093C' .. '\\u094D'
               {
                  matchRange('\u093C', '\u094D');

               }
                  break;
               case 63 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1030:
               // '\\u0950' .. '\\u0954'
               {
                  matchRange('\u0950', '\u0954');

               }
                  break;
               case 64 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1049:
               // '\\u0958' .. '\\u0963'
               {
                  matchRange('\u0958', '\u0963');

               }
                  break;
               case 65 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1068:
               // '\\u0966' .. '\\u096F'
               {
                  matchRange('\u0966', '\u096F');

               }
                  break;
               case 66 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1087:
               // '\\u0981' .. '\\u0983'
               {
                  matchRange('\u0981', '\u0983');

               }
                  break;
               case 67 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1106:
               // '\\u0985' .. '\\u098C'
               {
                  matchRange('\u0985', '\u098C');

               }
                  break;
               case 68 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1125:
               // '\\u098F' .. '\\u0990'
               {
                  matchRange('\u098F', '\u0990');

               }
                  break;
               case 69 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1144:
               // '\\u0993' .. '\\u09A8'
               {
                  matchRange('\u0993', '\u09A8');

               }
                  break;
               case 70 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1163:
               // '\\u09AA' .. '\\u09B0'
               {
                  matchRange('\u09AA', '\u09B0');

               }
                  break;
               case 71 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1182:
               // '\\u09B2'
               {
                  match('\u09B2');

               }
                  break;
               case 72 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1191:
               // '\\u09B6' .. '\\u09B9'
               {
                  matchRange('\u09B6', '\u09B9');

               }
                  break;
               case 73 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1210:
               // '\\u09BC' .. '\\u09C4'
               {
                  matchRange('\u09BC', '\u09C4');

               }
                  break;
               case 74 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1229:
               // '\\u09C7' .. '\\u09C8'
               {
                  matchRange('\u09C7', '\u09C8');

               }
                  break;
               case 75 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1248:
               // '\\u09CB' .. '\\u09CD'
               {
                  matchRange('\u09CB', '\u09CD');

               }
                  break;
               case 76 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1267:
               // '\\u09D7'
               {
                  match('\u09D7');

               }
                  break;
               case 77 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1276:
               // '\\u09DC' .. '\\u09DD'
               {
                  matchRange('\u09DC', '\u09DD');

               }
                  break;
               case 78 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1295:
               // '\\u09DF' .. '\\u09E3'
               {
                  matchRange('\u09DF', '\u09E3');

               }
                  break;
               case 79 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1314:
               // '\\u09E6' .. '\\u09F3'
               {
                  matchRange('\u09E6', '\u09F3');

               }
                  break;
               case 80 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1333:
               // '\\u0A01' .. '\\u0A03'
               {
                  matchRange('\u0A01', '\u0A03');

               }
                  break;
               case 81 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1352:
               // '\\u0A05' .. '\\u0A0A'
               {
                  matchRange('\u0A05', '\u0A0A');

               }
                  break;
               case 82 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1371:
               // '\\u0A0F' .. '\\u0A10'
               {
                  matchRange('\u0A0F', '\u0A10');

               }
                  break;
               case 83 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1390:
               // '\\u0A13' .. '\\u0A28'
               {
                  matchRange('\u0A13', '\u0A28');

               }
                  break;
               case 84 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1409:
               // '\\u0A2A' .. '\\u0A30'
               {
                  matchRange('\u0A2A', '\u0A30');

               }
                  break;
               case 85 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1428:
               // '\\u0A32' .. '\\u0A33'
               {
                  matchRange('\u0A32', '\u0A33');

               }
                  break;
               case 86 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1447:
               // '\\u0A35' .. '\\u0A36'
               {
                  matchRange('\u0A35', '\u0A36');

               }
                  break;
               case 87 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1466:
               // '\\u0A38' .. '\\u0A39'
               {
                  matchRange('\u0A38', '\u0A39');

               }
                  break;
               case 88 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1485:
               // '\\u0A3C'
               {
                  match('\u0A3C');

               }
                  break;
               case 89 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1494:
               // '\\u0A3E' .. '\\u0A42'
               {
                  matchRange('\u0A3E', '\u0A42');

               }
                  break;
               case 90 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1513:
               // '\\u0A47' .. '\\u0A48'
               {
                  matchRange('\u0A47', '\u0A48');

               }
                  break;
               case 91 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1532:
               // '\\u0A4B' .. '\\u0A4D'
               {
                  matchRange('\u0A4B', '\u0A4D');

               }
                  break;
               case 92 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1551:
               // '\\u0A59' .. '\\u0A5C'
               {
                  matchRange('\u0A59', '\u0A5C');

               }
                  break;
               case 93 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1570:
               // '\\u0A5E'
               {
                  match('\u0A5E');

               }
                  break;
               case 94 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1579:
               // '\\u0A66' .. '\\u0A74'
               {
                  matchRange('\u0A66', '\u0A74');

               }
                  break;
               case 95 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1598:
               // '\\u0A81' .. '\\u0A83'
               {
                  matchRange('\u0A81', '\u0A83');

               }
                  break;
               case 96 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1617:
               // '\\u0A85' .. '\\u0A8D'
               {
                  matchRange('\u0A85', '\u0A8D');

               }
                  break;
               case 97 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1636:
               // '\\u0A8F' .. '\\u0A91'
               {
                  matchRange('\u0A8F', '\u0A91');

               }
                  break;
               case 98 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1655:
               // '\\u0A93' .. '\\u0AA8'
               {
                  matchRange('\u0A93', '\u0AA8');

               }
                  break;
               case 99 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1674:
               // '\\u0AAA' .. '\\u0AB0'
               {
                  matchRange('\u0AAA', '\u0AB0');

               }
                  break;
               case 100 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1693:
               // '\\u0AB2' .. '\\u0AB3'
               {
                  matchRange('\u0AB2', '\u0AB3');

               }
                  break;
               case 101 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1712:
               // '\\u0AB5' .. '\\u0AB9'
               {
                  matchRange('\u0AB5', '\u0AB9');

               }
                  break;
               case 102 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1731:
               // '\\u0ABC' .. '\\u0AC5'
               {
                  matchRange('\u0ABC', '\u0AC5');

               }
                  break;
               case 103 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1750:
               // '\\u0AC7' .. '\\u0AC9'
               {
                  matchRange('\u0AC7', '\u0AC9');

               }
                  break;
               case 104 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1769:
               // '\\u0ACB' .. '\\u0ACD'
               {
                  matchRange('\u0ACB', '\u0ACD');

               }
                  break;
               case 105 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1788:
               // '\\u0AD0'
               {
                  match('\u0AD0');

               }
                  break;
               case 106 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1797:
               // '\\u0AE0' .. '\\u0AE3'
               {
                  matchRange('\u0AE0', '\u0AE3');

               }
                  break;
               case 107 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1816:
               // '\\u0AE6' .. '\\u0AEF'
               {
                  matchRange('\u0AE6', '\u0AEF');

               }
                  break;
               case 108 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1835:
               // '\\u0AF1'
               {
                  match('\u0AF1');

               }
                  break;
               case 109 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1844:
               // '\\u0B01' .. '\\u0B03'
               {
                  matchRange('\u0B01', '\u0B03');

               }
                  break;
               case 110 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1863:
               // '\\u0B05' .. '\\u0B0C'
               {
                  matchRange('\u0B05', '\u0B0C');

               }
                  break;
               case 111 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1882:
               // '\\u0B0F' .. '\\u0B10'
               {
                  matchRange('\u0B0F', '\u0B10');

               }
                  break;
               case 112 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1901:
               // '\\u0B13' .. '\\u0B28'
               {
                  matchRange('\u0B13', '\u0B28');

               }
                  break;
               case 113 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1920:
               // '\\u0B2A' .. '\\u0B30'
               {
                  matchRange('\u0B2A', '\u0B30');

               }
                  break;
               case 114 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1939:
               // '\\u0B32' .. '\\u0B33'
               {
                  matchRange('\u0B32', '\u0B33');

               }
                  break;
               case 115 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1958:
               // '\\u0B35' .. '\\u0B39'
               {
                  matchRange('\u0B35', '\u0B39');

               }
                  break;
               case 116 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1977:
               // '\\u0B3C' .. '\\u0B43'
               {
                  matchRange('\u0B3C', '\u0B43');

               }
                  break;
               case 117 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:1996:
               // '\\u0B47' .. '\\u0B48'
               {
                  matchRange('\u0B47', '\u0B48');

               }
                  break;
               case 118 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2015:
               // '\\u0B4B' .. '\\u0B4D'
               {
                  matchRange('\u0B4B', '\u0B4D');

               }
                  break;
               case 119 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2034:
               // '\\u0B56' .. '\\u0B57'
               {
                  matchRange('\u0B56', '\u0B57');

               }
                  break;
               case 120 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2053:
               // '\\u0B5C' .. '\\u0B5D'
               {
                  matchRange('\u0B5C', '\u0B5D');

               }
                  break;
               case 121 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2072:
               // '\\u0B5F' .. '\\u0B61'
               {
                  matchRange('\u0B5F', '\u0B61');

               }
                  break;
               case 122 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2091:
               // '\\u0B66' .. '\\u0B6F'
               {
                  matchRange('\u0B66', '\u0B6F');

               }
                  break;
               case 123 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2110:
               // '\\u0B71'
               {
                  match('\u0B71');

               }
                  break;
               case 124 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2119:
               // '\\u0B82' .. '\\u0B83'
               {
                  matchRange('\u0B82', '\u0B83');

               }
                  break;
               case 125 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2138:
               // '\\u0B85' .. '\\u0B8A'
               {
                  matchRange('\u0B85', '\u0B8A');

               }
                  break;
               case 126 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2157:
               // '\\u0B8E' .. '\\u0B90'
               {
                  matchRange('\u0B8E', '\u0B90');

               }
                  break;
               case 127 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2176:
               // '\\u0B92' .. '\\u0B95'
               {
                  matchRange('\u0B92', '\u0B95');

               }
                  break;
               case 128 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2195:
               // '\\u0B99' .. '\\u0B9A'
               {
                  matchRange('\u0B99', '\u0B9A');

               }
                  break;
               case 129 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2214:
               // '\\u0B9C'
               {
                  match('\u0B9C');

               }
                  break;
               case 130 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2223:
               // '\\u0B9E' .. '\\u0B9F'
               {
                  matchRange('\u0B9E', '\u0B9F');

               }
                  break;
               case 131 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2242:
               // '\\u0BA3' .. '\\u0BA4'
               {
                  matchRange('\u0BA3', '\u0BA4');

               }
                  break;
               case 132 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2261:
               // '\\u0BA8' .. '\\u0BAA'
               {
                  matchRange('\u0BA8', '\u0BAA');

               }
                  break;
               case 133 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2280:
               // '\\u0BAE' .. '\\u0BB5'
               {
                  matchRange('\u0BAE', '\u0BB5');

               }
                  break;
               case 134 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2299:
               // '\\u0BB7' .. '\\u0BB9'
               {
                  matchRange('\u0BB7', '\u0BB9');

               }
                  break;
               case 135 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2318:
               // '\\u0BBE' .. '\\u0BC2'
               {
                  matchRange('\u0BBE', '\u0BC2');

               }
                  break;
               case 136 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2337:
               // '\\u0BC6' .. '\\u0BC8'
               {
                  matchRange('\u0BC6', '\u0BC8');

               }
                  break;
               case 137 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2356:
               // '\\u0BCA' .. '\\u0BCD'
               {
                  matchRange('\u0BCA', '\u0BCD');

               }
                  break;
               case 138 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2375:
               // '\\u0BD7'
               {
                  match('\u0BD7');

               }
                  break;
               case 139 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2384:
               // '\\u0BE7' .. '\\u0BEF'
               {
                  matchRange('\u0BE7', '\u0BEF');

               }
                  break;
               case 140 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2403:
               // '\\u0BF9'
               {
                  match('\u0BF9');

               }
                  break;
               case 141 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2412:
               // '\\u0C01' .. '\\u0C03'
               {
                  matchRange('\u0C01', '\u0C03');

               }
                  break;
               case 142 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2431:
               // '\\u0C05' .. '\\u0C0C'
               {
                  matchRange('\u0C05', '\u0C0C');

               }
                  break;
               case 143 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2450:
               // '\\u0C0E' .. '\\u0C10'
               {
                  matchRange('\u0C0E', '\u0C10');

               }
                  break;
               case 144 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2469:
               // '\\u0C12' .. '\\u0C28'
               {
                  matchRange('\u0C12', '\u0C28');

               }
                  break;
               case 145 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2488:
               // '\\u0C2A' .. '\\u0C33'
               {
                  matchRange('\u0C2A', '\u0C33');

               }
                  break;
               case 146 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2507:
               // '\\u0C35' .. '\\u0C39'
               {
                  matchRange('\u0C35', '\u0C39');

               }
                  break;
               case 147 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2526:
               // '\\u0C3E' .. '\\u0C44'
               {
                  matchRange('\u0C3E', '\u0C44');

               }
                  break;
               case 148 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2545:
               // '\\u0C46' .. '\\u0C48'
               {
                  matchRange('\u0C46', '\u0C48');

               }
                  break;
               case 149 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2564:
               // '\\u0C4A' .. '\\u0C4D'
               {
                  matchRange('\u0C4A', '\u0C4D');

               }
                  break;
               case 150 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2583:
               // '\\u0C55' .. '\\u0C56'
               {
                  matchRange('\u0C55', '\u0C56');

               }
                  break;
               case 151 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2602:
               // '\\u0C60' .. '\\u0C61'
               {
                  matchRange('\u0C60', '\u0C61');

               }
                  break;
               case 152 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2621:
               // '\\u0C66' .. '\\u0C6F'
               {
                  matchRange('\u0C66', '\u0C6F');

               }
                  break;
               case 153 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2640:
               // '\\u0C82' .. '\\u0C83'
               {
                  matchRange('\u0C82', '\u0C83');

               }
                  break;
               case 154 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2659:
               // '\\u0C85' .. '\\u0C8C'
               {
                  matchRange('\u0C85', '\u0C8C');

               }
                  break;
               case 155 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2678:
               // '\\u0C8E' .. '\\u0C90'
               {
                  matchRange('\u0C8E', '\u0C90');

               }
                  break;
               case 156 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2697:
               // '\\u0C92' .. '\\u0CA8'
               {
                  matchRange('\u0C92', '\u0CA8');

               }
                  break;
               case 157 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2716:
               // '\\u0CAA' .. '\\u0CB3'
               {
                  matchRange('\u0CAA', '\u0CB3');

               }
                  break;
               case 158 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2735:
               // '\\u0CB5' .. '\\u0CB9'
               {
                  matchRange('\u0CB5', '\u0CB9');

               }
                  break;
               case 159 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2754:
               // '\\u0CBC' .. '\\u0CC4'
               {
                  matchRange('\u0CBC', '\u0CC4');

               }
                  break;
               case 160 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2773:
               // '\\u0CC6' .. '\\u0CC8'
               {
                  matchRange('\u0CC6', '\u0CC8');

               }
                  break;
               case 161 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2792:
               // '\\u0CCA' .. '\\u0CCD'
               {
                  matchRange('\u0CCA', '\u0CCD');

               }
                  break;
               case 162 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2811:
               // '\\u0CD5' .. '\\u0CD6'
               {
                  matchRange('\u0CD5', '\u0CD6');

               }
                  break;
               case 163 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2830:
               // '\\u0CDE'
               {
                  match('\u0CDE');

               }
                  break;
               case 164 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2839:
               // '\\u0CE0' .. '\\u0CE1'
               {
                  matchRange('\u0CE0', '\u0CE1');

               }
                  break;
               case 165 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2858:
               // '\\u0CE6' .. '\\u0CEF'
               {
                  matchRange('\u0CE6', '\u0CEF');

               }
                  break;
               case 166 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2877:
               // '\\u0D02' .. '\\u0D03'
               {
                  matchRange('\u0D02', '\u0D03');

               }
                  break;
               case 167 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2896:
               // '\\u0D05' .. '\\u0D0C'
               {
                  matchRange('\u0D05', '\u0D0C');

               }
                  break;
               case 168 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2915:
               // '\\u0D0E' .. '\\u0D10'
               {
                  matchRange('\u0D0E', '\u0D10');

               }
                  break;
               case 169 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2934:
               // '\\u0D12' .. '\\u0D28'
               {
                  matchRange('\u0D12', '\u0D28');

               }
                  break;
               case 170 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2953:
               // '\\u0D2A' .. '\\u0D39'
               {
                  matchRange('\u0D2A', '\u0D39');

               }
                  break;
               case 171 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2972:
               // '\\u0D3E' .. '\\u0D43'
               {
                  matchRange('\u0D3E', '\u0D43');

               }
                  break;
               case 172 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:2991:
               // '\\u0D46' .. '\\u0D48'
               {
                  matchRange('\u0D46', '\u0D48');

               }
                  break;
               case 173 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3010:
               // '\\u0D4A' .. '\\u0D4D'
               {
                  matchRange('\u0D4A', '\u0D4D');

               }
                  break;
               case 174 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3029:
               // '\\u0D57'
               {
                  match('\u0D57');

               }
                  break;
               case 175 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3038:
               // '\\u0D60' .. '\\u0D61'
               {
                  matchRange('\u0D60', '\u0D61');

               }
                  break;
               case 176 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3057:
               // '\\u0D66' .. '\\u0D6F'
               {
                  matchRange('\u0D66', '\u0D6F');

               }
                  break;
               case 177 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3076:
               // '\\u0D82' .. '\\u0D83'
               {
                  matchRange('\u0D82', '\u0D83');

               }
                  break;
               case 178 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3095:
               // '\\u0D85' .. '\\u0D96'
               {
                  matchRange('\u0D85', '\u0D96');

               }
                  break;
               case 179 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3114:
               // '\\u0D9A' .. '\\u0DB1'
               {
                  matchRange('\u0D9A', '\u0DB1');

               }
                  break;
               case 180 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3133:
               // '\\u0DB3' .. '\\u0DBB'
               {
                  matchRange('\u0DB3', '\u0DBB');

               }
                  break;
               case 181 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3152:
               // '\\u0DBD'
               {
                  match('\u0DBD');

               }
                  break;
               case 182 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3161:
               // '\\u0DC0' .. '\\u0DC6'
               {
                  matchRange('\u0DC0', '\u0DC6');

               }
                  break;
               case 183 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3180:
               // '\\u0DCA'
               {
                  match('\u0DCA');

               }
                  break;
               case 184 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3189:
               // '\\u0DCF' .. '\\u0DD4'
               {
                  matchRange('\u0DCF', '\u0DD4');

               }
                  break;
               case 185 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3208:
               // '\\u0DD6'
               {
                  match('\u0DD6');

               }
                  break;
               case 186 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3217:
               // '\\u0DD8' .. '\\u0DDF'
               {
                  matchRange('\u0DD8', '\u0DDF');

               }
                  break;
               case 187 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3236:
               // '\\u0DF2' .. '\\u0DF3'
               {
                  matchRange('\u0DF2', '\u0DF3');

               }
                  break;
               case 188 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3255:
               // '\\u0E01' .. '\\u0E3A'
               {
                  matchRange('\u0E01', '\u0E3A');

               }
                  break;
               case 189 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3274:
               // '\\u0E3F' .. '\\u0E4E'
               {
                  matchRange('\u0E3F', '\u0E4E');

               }
                  break;
               case 190 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3293:
               // '\\u0E50' .. '\\u0E59'
               {
                  matchRange('\u0E50', '\u0E59');

               }
                  break;
               case 191 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3312:
               // '\\u0E81' .. '\\u0E82'
               {
                  matchRange('\u0E81', '\u0E82');

               }
                  break;
               case 192 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3331:
               // '\\u0E84'
               {
                  match('\u0E84');

               }
                  break;
               case 193 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3340:
               // '\\u0E87' .. '\\u0E88'
               {
                  matchRange('\u0E87', '\u0E88');

               }
                  break;
               case 194 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3359:
               // '\\u0E8A'
               {
                  match('\u0E8A');

               }
                  break;
               case 195 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3368:
               // '\\u0E8D'
               {
                  match('\u0E8D');

               }
                  break;
               case 196 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3377:
               // '\\u0E94' .. '\\u0E97'
               {
                  matchRange('\u0E94', '\u0E97');

               }
                  break;
               case 197 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3396:
               // '\\u0E99' .. '\\u0E9F'
               {
                  matchRange('\u0E99', '\u0E9F');

               }
                  break;
               case 198 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3415:
               // '\\u0EA1' .. '\\u0EA3'
               {
                  matchRange('\u0EA1', '\u0EA3');

               }
                  break;
               case 199 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3434:
               // '\\u0EA5'
               {
                  match('\u0EA5');

               }
                  break;
               case 200 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3443:
               // '\\u0EA7'
               {
                  match('\u0EA7');

               }
                  break;
               case 201 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3452:
               // '\\u0EAA' .. '\\u0EAB'
               {
                  matchRange('\u0EAA', '\u0EAB');

               }
                  break;
               case 202 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3471:
               // '\\u0EAD' .. '\\u0EB9'
               {
                  matchRange('\u0EAD', '\u0EB9');

               }
                  break;
               case 203 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3490:
               // '\\u0EBB' .. '\\u0EBD'
               {
                  matchRange('\u0EBB', '\u0EBD');

               }
                  break;
               case 204 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3509:
               // '\\u0EC0' .. '\\u0EC4'
               {
                  matchRange('\u0EC0', '\u0EC4');

               }
                  break;
               case 205 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3528:
               // '\\u0EC6'
               {
                  match('\u0EC6');

               }
                  break;
               case 206 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3537:
               // '\\u0EC8' .. '\\u0ECD'
               {
                  matchRange('\u0EC8', '\u0ECD');

               }
                  break;
               case 207 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3556:
               // '\\u0ED0' .. '\\u0ED9'
               {
                  matchRange('\u0ED0', '\u0ED9');

               }
                  break;
               case 208 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3575:
               // '\\u0EDC' .. '\\u0EDD'
               {
                  matchRange('\u0EDC', '\u0EDD');

               }
                  break;
               case 209 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3594:
               // '\\u0F00'
               {
                  match('\u0F00');

               }
                  break;
               case 210 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3603:
               // '\\u0F18' .. '\\u0F19'
               {
                  matchRange('\u0F18', '\u0F19');

               }
                  break;
               case 211 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3622:
               // '\\u0F20' .. '\\u0F29'
               {
                  matchRange('\u0F20', '\u0F29');

               }
                  break;
               case 212 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3641:
               // '\\u0F35'
               {
                  match('\u0F35');

               }
                  break;
               case 213 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3650:
               // '\\u0F37'
               {
                  match('\u0F37');

               }
                  break;
               case 214 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3659:
               // '\\u0F39'
               {
                  match('\u0F39');

               }
                  break;
               case 215 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3668:
               // '\\u0F3E' .. '\\u0F47'
               {
                  matchRange('\u0F3E', '\u0F47');

               }
                  break;
               case 216 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3687:
               // '\\u0F49' .. '\\u0F6A'
               {
                  matchRange('\u0F49', '\u0F6A');

               }
                  break;
               case 217 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3706:
               // '\\u0F71' .. '\\u0F84'
               {
                  matchRange('\u0F71', '\u0F84');

               }
                  break;
               case 218 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3725:
               // '\\u0F86' .. '\\u0F8B'
               {
                  matchRange('\u0F86', '\u0F8B');

               }
                  break;
               case 219 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3744:
               // '\\u0F90' .. '\\u0F97'
               {
                  matchRange('\u0F90', '\u0F97');

               }
                  break;
               case 220 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3763:
               // '\\u0F99' .. '\\u0FBC'
               {
                  matchRange('\u0F99', '\u0FBC');

               }
                  break;
               case 221 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3782:
               // '\\u0FC6'
               {
                  match('\u0FC6');

               }
                  break;
               case 222 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3791:
               // '\\u1000' .. '\\u1021'
               {
                  matchRange('\u1000', '\u1021');

               }
                  break;
               case 223 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3810:
               // '\\u1023' .. '\\u1027'
               {
                  matchRange('\u1023', '\u1027');

               }
                  break;
               case 224 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3829:
               // '\\u1029' .. '\\u102A'
               {
                  matchRange('\u1029', '\u102A');

               }
                  break;
               case 225 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3848:
               // '\\u102C' .. '\\u1032'
               {
                  matchRange('\u102C', '\u1032');

               }
                  break;
               case 226 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3867:
               // '\\u1036' .. '\\u1039'
               {
                  matchRange('\u1036', '\u1039');

               }
                  break;
               case 227 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3886:
               // '\\u1040' .. '\\u1049'
               {
                  matchRange('\u1040', '\u1049');

               }
                  break;
               case 228 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3905:
               // '\\u1050' .. '\\u1059'
               {
                  matchRange('\u1050', '\u1059');

               }
                  break;
               case 229 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3924:
               // '\\u10A0' .. '\\u10C5'
               {
                  matchRange('\u10A0', '\u10C5');

               }
                  break;
               case 230 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3943:
               // '\\u10D0' .. '\\u10F8'
               {
                  matchRange('\u10D0', '\u10F8');

               }
                  break;
               case 231 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3962:
               // '\\u1100' .. '\\u1159'
               {
                  matchRange('\u1100', '\u1159');

               }
                  break;
               case 232 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:3981:
               // '\\u115F' .. '\\u11A2'
               {
                  matchRange('\u115F', '\u11A2');

               }
                  break;
               case 233 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4000:
               // '\\u11A8' .. '\\u11F9'
               {
                  matchRange('\u11A8', '\u11F9');

               }
                  break;
               case 234 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4019:
               // '\\u1200' .. '\\u1206'
               {
                  matchRange('\u1200', '\u1206');

               }
                  break;
               case 235 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4038:
               // '\\u1208' .. '\\u1246'
               {
                  matchRange('\u1208', '\u1246');

               }
                  break;
               case 236 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4057:
               // '\\u1248'
               {
                  match('\u1248');

               }
                  break;
               case 237 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4066:
               // '\\u124A' .. '\\u124D'
               {
                  matchRange('\u124A', '\u124D');

               }
                  break;
               case 238 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4085:
               // '\\u1250' .. '\\u1256'
               {
                  matchRange('\u1250', '\u1256');

               }
                  break;
               case 239 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4104:
               // '\\u1258'
               {
                  match('\u1258');

               }
                  break;
               case 240 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4113:
               // '\\u125A' .. '\\u125D'
               {
                  matchRange('\u125A', '\u125D');

               }
                  break;
               case 241 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4132:
               // '\\u1260' .. '\\u1286'
               {
                  matchRange('\u1260', '\u1286');

               }
                  break;
               case 242 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4151:
               // '\\u1288'
               {
                  match('\u1288');

               }
                  break;
               case 243 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4160:
               // '\\u128A' .. '\\u128D'
               {
                  matchRange('\u128A', '\u128D');

               }
                  break;
               case 244 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4179:
               // '\\u1290' .. '\\u12AE'
               {
                  matchRange('\u1290', '\u12AE');

               }
                  break;
               case 245 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4198:
               // '\\u12B0'
               {
                  match('\u12B0');

               }
                  break;
               case 246 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4207:
               // '\\u12B2' .. '\\u12B5'
               {
                  matchRange('\u12B2', '\u12B5');

               }
                  break;
               case 247 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4226:
               // '\\u12B8' .. '\\u12BE'
               {
                  matchRange('\u12B8', '\u12BE');

               }
                  break;
               case 248 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4245:
               // '\\u12C0'
               {
                  match('\u12C0');

               }
                  break;
               case 249 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4254:
               // '\\u12C2' .. '\\u12C5'
               {
                  matchRange('\u12C2', '\u12C5');

               }
                  break;
               case 250 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4273:
               // '\\u12C8' .. '\\u12CE'
               {
                  matchRange('\u12C8', '\u12CE');

               }
                  break;
               case 251 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4292:
               // '\\u12D0' .. '\\u12D6'
               {
                  matchRange('\u12D0', '\u12D6');

               }
                  break;
               case 252 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4311:
               // '\\u12D8' .. '\\u12EE'
               {
                  matchRange('\u12D8', '\u12EE');

               }
                  break;
               case 253 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4330:
               // '\\u12F0' .. '\\u130E'
               {
                  matchRange('\u12F0', '\u130E');

               }
                  break;
               case 254 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4349:
               // '\\u1310'
               {
                  match('\u1310');

               }
                  break;
               case 255 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4358:
               // '\\u1312' .. '\\u1315'
               {
                  matchRange('\u1312', '\u1315');

               }
                  break;
               case 256 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4377:
               // '\\u1318' .. '\\u131E'
               {
                  matchRange('\u1318', '\u131E');

               }
                  break;
               case 257 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4396:
               // '\\u1320' .. '\\u1346'
               {
                  matchRange('\u1320', '\u1346');

               }
                  break;
               case 258 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4415:
               // '\\u1348' .. '\\u135A'
               {
                  matchRange('\u1348', '\u135A');

               }
                  break;
               case 259 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4434:
               // '\\u1369' .. '\\u1371'
               {
                  matchRange('\u1369', '\u1371');

               }
                  break;
               case 260 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4453:
               // '\\u13A0' .. '\\u13F4'
               {
                  matchRange('\u13A0', '\u13F4');

               }
                  break;
               case 261 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4472:
               // '\\u1401' .. '\\u166C'
               {
                  matchRange('\u1401', '\u166C');

               }
                  break;
               case 262 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4491:
               // '\\u166F' .. '\\u1676'
               {
                  matchRange('\u166F', '\u1676');

               }
                  break;
               case 263 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4510:
               // '\\u1681' .. '\\u169A'
               {
                  matchRange('\u1681', '\u169A');

               }
                  break;
               case 264 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4529:
               // '\\u16A0' .. '\\u16EA'
               {
                  matchRange('\u16A0', '\u16EA');

               }
                  break;
               case 265 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4548:
               // '\\u16EE' .. '\\u16F0'
               {
                  matchRange('\u16EE', '\u16F0');

               }
                  break;
               case 266 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4567:
               // '\\u1700' .. '\\u170C'
               {
                  matchRange('\u1700', '\u170C');

               }
                  break;
               case 267 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4586:
               // '\\u170E' .. '\\u1714'
               {
                  matchRange('\u170E', '\u1714');

               }
                  break;
               case 268 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4605:
               // '\\u1720' .. '\\u1734'
               {
                  matchRange('\u1720', '\u1734');

               }
                  break;
               case 269 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4624:
               // '\\u1740' .. '\\u1753'
               {
                  matchRange('\u1740', '\u1753');

               }
                  break;
               case 270 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4643:
               // '\\u1760' .. '\\u176C'
               {
                  matchRange('\u1760', '\u176C');

               }
                  break;
               case 271 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4662:
               // '\\u176E' .. '\\u1770'
               {
                  matchRange('\u176E', '\u1770');

               }
                  break;
               case 272 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4681:
               // '\\u1772' .. '\\u1773'
               {
                  matchRange('\u1772', '\u1773');

               }
                  break;
               case 273 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4700:
               // '\\u1780' .. '\\u17D3'
               {
                  matchRange('\u1780', '\u17D3');

               }
                  break;
               case 274 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4719:
               // '\\u17D7'
               {
                  match('\u17D7');

               }
                  break;
               case 275 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4728:
               // '\\u17DB' .. '\\u17DD'
               {
                  matchRange('\u17DB', '\u17DD');

               }
                  break;
               case 276 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4747:
               // '\\u17E0' .. '\\u17E9'
               {
                  matchRange('\u17E0', '\u17E9');

               }
                  break;
               case 277 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4766:
               // '\\u180B' .. '\\u180D'
               {
                  matchRange('\u180B', '\u180D');

               }
                  break;
               case 278 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4785:
               // '\\u1810' .. '\\u1819'
               {
                  matchRange('\u1810', '\u1819');

               }
                  break;
               case 279 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4804:
               // '\\u1820' .. '\\u1877'
               {
                  matchRange('\u1820', '\u1877');

               }
                  break;
               case 280 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4823:
               // '\\u1880' .. '\\u18A9'
               {
                  matchRange('\u1880', '\u18A9');

               }
                  break;
               case 281 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4842:
               // '\\u1900' .. '\\u191C'
               {
                  matchRange('\u1900', '\u191C');

               }
                  break;
               case 282 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4861:
               // '\\u1920' .. '\\u192B'
               {
                  matchRange('\u1920', '\u192B');

               }
                  break;
               case 283 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4880:
               // '\\u1930' .. '\\u193B'
               {
                  matchRange('\u1930', '\u193B');

               }
                  break;
               case 284 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4899:
               // '\\u1946' .. '\\u196D'
               {
                  matchRange('\u1946', '\u196D');

               }
                  break;
               case 285 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4918:
               // '\\u1970' .. '\\u1974'
               {
                  matchRange('\u1970', '\u1974');

               }
                  break;
               case 286 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4937:
               // '\\u1D00' .. '\\u1D6B'
               {
                  matchRange('\u1D00', '\u1D6B');

               }
                  break;
               case 287 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4956:
               // '\\u1E00' .. '\\u1E9B'
               {
                  matchRange('\u1E00', '\u1E9B');

               }
                  break;
               case 288 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4975:
               // '\\u1EA0' .. '\\u1EF9'
               {
                  matchRange('\u1EA0', '\u1EF9');

               }
                  break;
               case 289 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:4994:
               // '\\u1F00' .. '\\u1F15'
               {
                  matchRange('\u1F00', '\u1F15');

               }
                  break;
               case 290 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5013:
               // '\\u1F18' .. '\\u1F1D'
               {
                  matchRange('\u1F18', '\u1F1D');

               }
                  break;
               case 291 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5032:
               // '\\u1F20' .. '\\u1F45'
               {
                  matchRange('\u1F20', '\u1F45');

               }
                  break;
               case 292 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5051:
               // '\\u1F48' .. '\\u1F4D'
               {
                  matchRange('\u1F48', '\u1F4D');

               }
                  break;
               case 293 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5070:
               // '\\u1F50' .. '\\u1F57'
               {
                  matchRange('\u1F50', '\u1F57');

               }
                  break;
               case 294 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5089:
               // '\\u1F59'
               {
                  match('\u1F59');

               }
                  break;
               case 295 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5098:
               // '\\u1F5B'
               {
                  match('\u1F5B');

               }
                  break;
               case 296 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5107:
               // '\\u1F5D'
               {
                  match('\u1F5D');

               }
                  break;
               case 297 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5116:
               // '\\u1F5F' .. '\\u1F7D'
               {
                  matchRange('\u1F5F', '\u1F7D');

               }
                  break;
               case 298 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5135:
               // '\\u1F80' .. '\\u1FB4'
               {
                  matchRange('\u1F80', '\u1FB4');

               }
                  break;
               case 299 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5154:
               // '\\u1FB6' .. '\\u1FBC'
               {
                  matchRange('\u1FB6', '\u1FBC');

               }
                  break;
               case 300 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5173:
               // '\\u1FBE'
               {
                  match('\u1FBE');

               }
                  break;
               case 301 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5182:
               // '\\u1FC2' .. '\\u1FC4'
               {
                  matchRange('\u1FC2', '\u1FC4');

               }
                  break;
               case 302 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5201:
               // '\\u1FC6' .. '\\u1FCC'
               {
                  matchRange('\u1FC6', '\u1FCC');

               }
                  break;
               case 303 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5220:
               // '\\u1FD0' .. '\\u1FD3'
               {
                  matchRange('\u1FD0', '\u1FD3');

               }
                  break;
               case 304 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5239:
               // '\\u1FD6' .. '\\u1FDB'
               {
                  matchRange('\u1FD6', '\u1FDB');

               }
                  break;
               case 305 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5258:
               // '\\u1FE0' .. '\\u1FEC'
               {
                  matchRange('\u1FE0', '\u1FEC');

               }
                  break;
               case 306 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5277:
               // '\\u1FF2' .. '\\u1FF4'
               {
                  matchRange('\u1FF2', '\u1FF4');

               }
                  break;
               case 307 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5296:
               // '\\u1FF6' .. '\\u1FFC'
               {
                  matchRange('\u1FF6', '\u1FFC');

               }
                  break;
               case 308 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5315:
               // '\\u200C' .. '\\u200F'
               {
                  matchRange('\u200C', '\u200F');

               }
                  break;
               case 309 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5334:
               // '\\u202A' .. '\\u202E'
               {
                  matchRange('\u202A', '\u202E');

               }
                  break;
               case 310 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5353:
               // '\\u203F' .. '\\u2040'
               {
                  matchRange('\u203F', '\u2040');

               }
                  break;
               case 311 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5372:
               // '\\u2054'
               {
                  match('\u2054');

               }
                  break;
               case 312 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5381:
               // '\\u2060' .. '\\u2063'
               {
                  matchRange('\u2060', '\u2063');

               }
                  break;
               case 313 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5400:
               // '\\u206A' .. '\\u206F'
               {
                  matchRange('\u206A', '\u206F');

               }
                  break;
               case 314 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5419:
               // '\\u2071'
               {
                  match('\u2071');

               }
                  break;
               case 315 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5428:
               // '\\u207F'
               {
                  match('\u207F');

               }
                  break;
               case 316 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5437:
               // '\\u20A0' .. '\\u20B1'
               {
                  matchRange('\u20A0', '\u20B1');

               }
                  break;
               case 317 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5456:
               // '\\u20D0' .. '\\u20DC'
               {
                  matchRange('\u20D0', '\u20DC');

               }
                  break;
               case 318 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5475:
               // '\\u20E1'
               {
                  match('\u20E1');

               }
                  break;
               case 319 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5484:
               // '\\u20E5' .. '\\u20EA'
               {
                  matchRange('\u20E5', '\u20EA');

               }
                  break;
               case 320 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5503:
               // '\\u2102'
               {
                  match('\u2102');

               }
                  break;
               case 321 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5512:
               // '\\u2107'
               {
                  match('\u2107');

               }
                  break;
               case 322 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5521:
               // '\\u210A' .. '\\u2113'
               {
                  matchRange('\u210A', '\u2113');

               }
                  break;
               case 323 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5540:
               // '\\u2115'
               {
                  match('\u2115');

               }
                  break;
               case 324 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5549:
               // '\\u2119' .. '\\u211D'
               {
                  matchRange('\u2119', '\u211D');

               }
                  break;
               case 325 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5568:
               // '\\u2124'
               {
                  match('\u2124');

               }
                  break;
               case 326 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5577:
               // '\\u2126'
               {
                  match('\u2126');

               }
                  break;
               case 327 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5586:
               // '\\u2128'
               {
                  match('\u2128');

               }
                  break;
               case 328 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5595:
               // '\\u212A' .. '\\u212D'
               {
                  matchRange('\u212A', '\u212D');

               }
                  break;
               case 329 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5614:
               // '\\u212F' .. '\\u2131'
               {
                  matchRange('\u212F', '\u2131');

               }
                  break;
               case 330 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5633:
               // '\\u2133' .. '\\u2139'
               {
                  matchRange('\u2133', '\u2139');

               }
                  break;
               case 331 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5652:
               // '\\u213D' .. '\\u213F'
               {
                  matchRange('\u213D', '\u213F');

               }
                  break;
               case 332 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5671:
               // '\\u2145' .. '\\u2149'
               {
                  matchRange('\u2145', '\u2149');

               }
                  break;
               case 333 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5690:
               // '\\u2160' .. '\\u2183'
               {
                  matchRange('\u2160', '\u2183');

               }
                  break;
               case 334 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5709:
               // '\\u3005' .. '\\u3007'
               {
                  matchRange('\u3005', '\u3007');

               }
                  break;
               case 335 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5728:
               // '\\u3021' .. '\\u302F'
               {
                  matchRange('\u3021', '\u302F');

               }
                  break;
               case 336 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5747:
               // '\\u3031' .. '\\u3035'
               {
                  matchRange('\u3031', '\u3035');

               }
                  break;
               case 337 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5766:
               // '\\u3038' .. '\\u303C'
               {
                  matchRange('\u3038', '\u303C');

               }
                  break;
               case 338 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5785:
               // '\\u3041' .. '\\u3096'
               {
                  matchRange('\u3041', '\u3096');

               }
                  break;
               case 339 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5804:
               // '\\u3099' .. '\\u309A'
               {
                  matchRange('\u3099', '\u309A');

               }
                  break;
               case 340 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5823:
               // '\\u309D' .. '\\u309F'
               {
                  matchRange('\u309D', '\u309F');

               }
                  break;
               case 341 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5842:
               // '\\u30A1' .. '\\u30FF'
               {
                  matchRange('\u30A1', '\u30FF');

               }
                  break;
               case 342 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5861:
               // '\\u3105' .. '\\u312C'
               {
                  matchRange('\u3105', '\u312C');

               }
                  break;
               case 343 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5880:
               // '\\u3131' .. '\\u318E'
               {
                  matchRange('\u3131', '\u318E');

               }
                  break;
               case 344 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5899:
               // '\\u31A0' .. '\\u31B7'
               {
                  matchRange('\u31A0', '\u31B7');

               }
                  break;
               case 345 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5918:
               // '\\u31F0' .. '\\u31FF'
               {
                  matchRange('\u31F0', '\u31FF');

               }
                  break;
               case 346 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5937:
               // '\\u3400' .. '\\u4DB5'
               {
                  matchRange('\u3400', '\u4DB5');

               }
                  break;
               case 347 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5956:
               // '\\u4E00' .. '\\u9FA5'
               {
                  matchRange('\u4E00', '\u9FA5');

               }
                  break;
               case 348 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5975:
               // '\\uA000' .. '\\uA48C'
               {
                  matchRange('\uA000', '\uA48C');

               }
                  break;
               case 349 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:5994:
               // '\\uAC00' .. '\\uD7A3'
               {
                  matchRange('\uAC00', '\uD7A3');

               }
                  break;
               case 350 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6013:
               // '\\uF900' .. '\\uFA2D'
               {
                  matchRange('\uF900', '\uFA2D');

               }
                  break;
               case 351 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6032:
               // '\\uFA30' .. '\\uFA6A'
               {
                  matchRange('\uFA30', '\uFA6A');

               }
                  break;
               case 352 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6051:
               // '\\uFB00' .. '\\uFB06'
               {
                  matchRange('\uFB00', '\uFB06');

               }
                  break;
               case 353 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6070:
               // '\\uFB13' .. '\\uFB17'
               {
                  matchRange('\uFB13', '\uFB17');

               }
                  break;
               case 354 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6089:
               // '\\uFB1D' .. '\\uFB28'
               {
                  matchRange('\uFB1D', '\uFB28');

               }
                  break;
               case 355 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6108:
               // '\\uFB2A' .. '\\uFB36'
               {
                  matchRange('\uFB2A', '\uFB36');

               }
                  break;
               case 356 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6127:
               // '\\uFB38' .. '\\uFB3C'
               {
                  matchRange('\uFB38', '\uFB3C');

               }
                  break;
               case 357 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6146:
               // '\\uFB3E'
               {
                  match('\uFB3E');

               }
                  break;
               case 358 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6155:
               // '\\uFB40' .. '\\uFB41'
               {
                  matchRange('\uFB40', '\uFB41');

               }
                  break;
               case 359 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6174:
               // '\\uFB43' .. '\\uFB44'
               {
                  matchRange('\uFB43', '\uFB44');

               }
                  break;
               case 360 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6193:
               // '\\uFB46' .. '\\uFBB1'
               {
                  matchRange('\uFB46', '\uFBB1');

               }
                  break;
               case 361 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6212:
               // '\\uFBD3' .. '\\uFD3D'
               {
                  matchRange('\uFBD3', '\uFD3D');

               }
                  break;
               case 362 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6231:
               // '\\uFD50' .. '\\uFD8F'
               {
                  matchRange('\uFD50', '\uFD8F');

               }
                  break;
               case 363 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6250:
               // '\\uFD92' .. '\\uFDC7'
               {
                  matchRange('\uFD92', '\uFDC7');

               }
                  break;
               case 364 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6269:
               // '\\uFDF0' .. '\\uFDFC'
               {
                  matchRange('\uFDF0', '\uFDFC');

               }
                  break;
               case 365 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6288:
               // '\\uFE00' .. '\\uFE0F'
               {
                  matchRange('\uFE00', '\uFE0F');

               }
                  break;
               case 366 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6307:
               // '\\uFE20' .. '\\uFE23'
               {
                  matchRange('\uFE20', '\uFE23');

               }
                  break;
               case 367 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6326:
               // '\\uFE33' .. '\\uFE34'
               {
                  matchRange('\uFE33', '\uFE34');

               }
                  break;
               case 368 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6345:
               // '\\uFE4D' .. '\\uFE4F'
               {
                  matchRange('\uFE4D', '\uFE4F');

               }
                  break;
               case 369 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6364:
               // '\\uFE69'
               {
                  match('\uFE69');

               }
                  break;
               case 370 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6373:
               // '\\uFE70' .. '\\uFE74'
               {
                  matchRange('\uFE70', '\uFE74');

               }
                  break;
               case 371 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6392:
               // '\\uFE76' .. '\\uFEFC'
               {
                  matchRange('\uFE76', '\uFEFC');

               }
                  break;
               case 372 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6411:
               // '\\uFEFF'
               {
                  match('\uFEFF');

               }
                  break;
               case 373 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6420:
               // '\\uFF04'
               {
                  match('\uFF04');

               }
                  break;
               case 374 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6429:
               // '\\uFF10' .. '\\uFF19'
               {
                  matchRange('\uFF10', '\uFF19');

               }
                  break;
               case 375 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6448:
               // '\\uFF21' .. '\\uFF3A'
               {
                  matchRange('\uFF21', '\uFF3A');

               }
                  break;
               case 376 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6467:
               // '\\uFF3F'
               {
                  match('\uFF3F');

               }
                  break;
               case 377 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6476:
               // '\\uFF41' .. '\\uFF5A'
               {
                  matchRange('\uFF41', '\uFF5A');

               }
                  break;
               case 378 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6495:
               // '\\uFF65' .. '\\uFFBE'
               {
                  matchRange('\uFF65', '\uFFBE');

               }
                  break;
               case 379 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6514:
               // '\\uFFC2' .. '\\uFFC7'
               {
                  matchRange('\uFFC2', '\uFFC7');

               }
                  break;
               case 380 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6533:
               // '\\uFFCA' .. '\\uFFCF'
               {
                  matchRange('\uFFCA', '\uFFCF');

               }
                  break;
               case 381 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6552:
               // '\\uFFD2' .. '\\uFFD7'
               {
                  matchRange('\uFFD2', '\uFFD7');

               }
                  break;
               case 382 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6571:
               // '\\uFFDA' .. '\\uFFDC'
               {
                  matchRange('\uFFDA', '\uFFDC');

               }
                  break;
               case 383 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6590:
               // '\\uFFE0' .. '\\uFFE1'
               {
                  matchRange('\uFFE0', '\uFFE1');

               }
                  break;
               case 384 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6609:
               // '\\uFFE5' .. '\\uFFE6'
               {
                  matchRange('\uFFE5', '\uFFE6');

               }
                  break;
               case 385 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6628:
               // '\\uFFF9' .. '\\uFFFB'
               {
                  matchRange('\uFFF9', '\uFFFB');

               }
                  break;
               case 386 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8629:6647:
               // '\\uD800' .. '\\uDBFF' '\\uDC00' .. '\\uDFFF'
               {
                  matchRange('\uD800', '\uDBFF');
                  matchRange('\uDC00', '\uDFFF');

               }
                  break;

            }


         }

      }
      finally {
      }
   }

   // $ANTLR end "RULE_JAVALETTERORDIGIT"

   // $ANTLR start "RULE_ML_COMMENT"
   public final void mRULE_ML_COMMENT() throws RecognitionException {
      try {
         int _type = RULE_ML_COMMENT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8631:17: (
         // '/*' ( options {greedy=false; } : . )* '*/' )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8631:19:
         // '/*' ( options {greedy=false; } : . )* '*/'
         {
            match("/*");

            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8631:24:
            // ( options {greedy=false; } : . )*
            loop45 : do {
               int alt45 = 2;
               int LA45_0 = input.LA(1);

               if ((LA45_0 == '*')) {
                  int LA45_1 = input.LA(2);

                  if ((LA45_1 == '/')) {
                     alt45 = 2;
                  }
                  else if (((LA45_1 >= '\u0000' && LA45_1 <= '.') || (LA45_1 >= '0' && LA45_1 <= '\uFFFF'))) {
                     alt45 = 1;
                  }


               }
               else if (((LA45_0 >= '\u0000' && LA45_0 <= ')') || (LA45_0 >= '+' && LA45_0 <= '\uFFFF'))) {
                  alt45 = 1;
               }


               switch (alt45) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8631:52:
                  // .
                  {
                     matchAny();

                  }
                     break;

                  default :
                     break loop45;
               }
            }
            while (true);

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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:17: (
         // '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:19:
         // '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
         {
            match("//");

            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:24:
            // (~ ( ( '\\n' | '\\r' ) ) )*
            loop46 : do {
               int alt46 = 2;
               int LA46_0 = input.LA(1);

               if (((LA46_0 >= '\u0000' && LA46_0 <= '\t') || (LA46_0 >= '\u000B' && LA46_0 <= '\f') || (LA46_0 >= '\u000E' && LA46_0 <= '\uFFFF'))) {
                  alt46 = 1;
               }


               switch (alt46) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:24:
                  // ~ ( ( '\\n' | '\\r' ) )
                  {
                     if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
                        || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                        || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                        input.consume();

                     }
                     else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                     }


                  }
                     break;

                  default :
                     break loop46;
               }
            }
            while (true);

            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:40:
            // ( ( '\\r' )? '\\n' )?
            int alt48 = 2;
            int LA48_0 = input.LA(1);

            if ((LA48_0 == '\n' || LA48_0 == '\r')) {
               alt48 = 1;
            }
            switch (alt48) {
               case 1 :
               // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:41:
               // ( '\\r' )? '\\n'
               {
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:41:
                  // ( '\\r' )?
                  int alt47 = 2;
                  int LA47_0 = input.LA(1);

                  if ((LA47_0 == '\r')) {
                     alt47 = 1;
                  }
                  switch (alt47) {
                     case 1 :
                     // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8633:41:
                     // '\\r'
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
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8635:9: ( (
         // ' ' | '\\t' | '\\r' | '\\n' )+ )
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8635:11: (
         // ' ' | '\\t' | '\\r' | '\\n' )+
         {
            // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:8635:11:
            // ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt49 = 0;
            loop49 : do {
               int alt49 = 2;
               int LA49_0 = input.LA(1);

               if (((LA49_0 >= '\t' && LA49_0 <= '\n') || LA49_0 == '\r' || LA49_0 == ' ')) {
                  alt49 = 1;
               }


               switch (alt49) {
                  case 1 :
                  // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:
                  {
                     if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
                        input.consume();

                     }
                     else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                     }


                  }
                     break;

                  default :
                     if (cnt49 >= 1)
                        break loop49;
                     EarlyExitException eee = new EarlyExitException(49, input);
                     throw eee;
               }
               cnt49++;
            }
            while (true);


         }

         state.type = _type;
         state.channel = _channel;
      }
      finally {
      }
   }

   // $ANTLR end "RULE_WS"

   public void mTokens() throws RecognitionException {
      // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:8: ( T__61 |
      // T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 |
      // T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 |
      // T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 |
      // T__103 | T__104 | RULE_BOOLEANTYPE | RULE_NUMERICTYPE | RULE_INTEGRALTYPE | RULE_FLOATINGPOINTTYPE |
      // RULE_DECIMALINTEGERLITERAL | RULE_HEXINTEGERLITERAL | RULE_OCTALINTEGERLITERAL | RULE_BINARYINTEGERLITERAL |
      // RULE_DECIMALFLOATINGPOINTLITERAL | RULE_HEXADECIMALFLOATINGPOINTLITERAL | RULE_TRUE | RULE_FALSE |
      // RULE_CHARACTER | RULE_STRING | RULE_NULL | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
      int alt50 = 63;
      alt50 = dfa50.predict(input);
      switch (alt50) {
         case 1 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:10: T__61
         {
            mT__61();

         }
            break;
         case 2 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:16: T__62
         {
            mT__62();

         }
            break;
         case 3 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:22: T__63
         {
            mT__63();

         }
            break;
         case 4 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:28: T__64
         {
            mT__64();

         }
            break;
         case 5 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:34: T__65
         {
            mT__65();

         }
            break;
         case 6 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:40: T__66
         {
            mT__66();

         }
            break;
         case 7 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:46: T__67
         {
            mT__67();

         }
            break;
         case 8 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:52: T__68
         {
            mT__68();

         }
            break;
         case 9 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:58: T__69
         {
            mT__69();

         }
            break;
         case 10 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:64: T__70
         {
            mT__70();

         }
            break;
         case 11 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:70: T__71
         {
            mT__71();

         }
            break;
         case 12 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:76: T__72
         {
            mT__72();

         }
            break;
         case 13 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:82: T__73
         {
            mT__73();

         }
            break;
         case 14 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:88: T__74
         {
            mT__74();

         }
            break;
         case 15 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:94: T__75
         {
            mT__75();

         }
            break;
         case 16 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:100: T__76
         {
            mT__76();

         }
            break;
         case 17 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:106: T__77
         {
            mT__77();

         }
            break;
         case 18 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:112: T__78
         {
            mT__78();

         }
            break;
         case 19 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:118: T__79
         {
            mT__79();

         }
            break;
         case 20 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:124: T__80
         {
            mT__80();

         }
            break;
         case 21 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:130: T__81
         {
            mT__81();

         }
            break;
         case 22 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:136: T__82
         {
            mT__82();

         }
            break;
         case 23 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:142: T__83
         {
            mT__83();

         }
            break;
         case 24 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:148: T__84
         {
            mT__84();

         }
            break;
         case 25 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:154: T__85
         {
            mT__85();

         }
            break;
         case 26 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:160: T__86
         {
            mT__86();

         }
            break;
         case 27 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:166: T__87
         {
            mT__87();

         }
            break;
         case 28 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:172: T__88
         {
            mT__88();

         }
            break;
         case 29 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:178: T__89
         {
            mT__89();

         }
            break;
         case 30 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:184: T__90
         {
            mT__90();

         }
            break;
         case 31 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:190: T__91
         {
            mT__91();

         }
            break;
         case 32 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:196: T__92
         {
            mT__92();

         }
            break;
         case 33 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:202: T__93
         {
            mT__93();

         }
            break;
         case 34 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:208: T__94
         {
            mT__94();

         }
            break;
         case 35 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:214: T__95
         {
            mT__95();

         }
            break;
         case 36 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:220: T__96
         {
            mT__96();

         }
            break;
         case 37 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:226: T__97
         {
            mT__97();

         }
            break;
         case 38 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:232: T__98
         {
            mT__98();

         }
            break;
         case 39 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:238: T__99
         {
            mT__99();

         }
            break;
         case 40 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:244:
         // T__100
         {
            mT__100();

         }
            break;
         case 41 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:251:
         // T__101
         {
            mT__101();

         }
            break;
         case 42 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:258:
         // T__102
         {
            mT__102();

         }
            break;
         case 43 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:265:
         // T__103
         {
            mT__103();

         }
            break;
         case 44 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:272:
         // T__104
         {
            mT__104();

         }
            break;
         case 45 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:279:
         // RULE_BOOLEANTYPE
         {
            mRULE_BOOLEANTYPE();

         }
            break;
         case 46 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:296:
         // RULE_NUMERICTYPE
         {
            mRULE_NUMERICTYPE();

         }
            break;
         case 47 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:313:
         // RULE_INTEGRALTYPE
         {
            mRULE_INTEGRALTYPE();

         }
            break;
         case 48 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:331:
         // RULE_FLOATINGPOINTTYPE
         {
            mRULE_FLOATINGPOINTTYPE();

         }
            break;
         case 49 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:354:
         // RULE_DECIMALINTEGERLITERAL
         {
            mRULE_DECIMALINTEGERLITERAL();

         }
            break;
         case 50 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:381:
         // RULE_HEXINTEGERLITERAL
         {
            mRULE_HEXINTEGERLITERAL();

         }
            break;
         case 51 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:404:
         // RULE_OCTALINTEGERLITERAL
         {
            mRULE_OCTALINTEGERLITERAL();

         }
            break;
         case 52 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:429:
         // RULE_BINARYINTEGERLITERAL
         {
            mRULE_BINARYINTEGERLITERAL();

         }
            break;
         case 53 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:455:
         // RULE_DECIMALFLOATINGPOINTLITERAL
         {
            mRULE_DECIMALFLOATINGPOINTLITERAL();

         }
            break;
         case 54 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:488:
         // RULE_HEXADECIMALFLOATINGPOINTLITERAL
         {
            mRULE_HEXADECIMALFLOATINGPOINTLITERAL();

         }
            break;
         case 55 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:525:
         // RULE_TRUE
         {
            mRULE_TRUE();

         }
            break;
         case 56 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:535:
         // RULE_FALSE
         {
            mRULE_FALSE();

         }
            break;
         case 57 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:546:
         // RULE_CHARACTER
         {
            mRULE_CHARACTER();

         }
            break;
         case 58 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:561:
         // RULE_STRING
         {
            mRULE_STRING();

         }
            break;
         case 59 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:573:
         // RULE_NULL
         {
            mRULE_NULL();

         }
            break;
         case 60 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:583:
         // RULE_IDENTIFIER
         {
            mRULE_IDENTIFIER();

         }
            break;
         case 61 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:599:
         // RULE_ML_COMMENT
         {
            mRULE_ML_COMMENT();

         }
            break;
         case 62 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:615:
         // RULE_SL_COMMENT
         {
            mRULE_SL_COMMENT();

         }
            break;
         case 63 :
         // ../org.sourcepit.java.type/src-gen/org/sourcepit/java/type/parser/antlr/internal/InternalType.g:1:631:
         // RULE_WS
         {
            mRULE_WS();

         }
            break;

      }

   }


   protected DFA30 dfa30 = new DFA30(this);
   protected DFA36 dfa36 = new DFA36(this);
   protected DFA50 dfa50 = new DFA50(this);
   static final String DFA30_eotS = "\12\uffff";
   static final String DFA30_eofS = "\12\uffff";
   static final String DFA30_minS = "\2\56\2\uffff\1\56\1\60\2\uffff\1\56\1\60";
   static final String DFA30_maxS = "\1\71\1\146\2\uffff\1\146\1\137\2\uffff\1\146\1\137";
   static final String DFA30_acceptS = "\2\uffff\1\2\1\4\2\uffff\1\1\1\3\2\uffff";
   static final String DFA30_specialS = "\12\uffff}>";
   static final String[] DFA30_transitionS = { "\1\2\1\uffff\12\1",
      "\1\6\1\uffff\12\4\12\uffff\1\3\1\7\1\3\30\uffff\1\5\4\uffff" + "\1\3\1\7\1\3", "", "",
      "\1\6\1\uffff\12\10\12\uffff\1\3\1\7\1\3\30\uffff\1\11\4\uffff" + "\1\3\1\7\1\3", "\12\10\45\uffff\1\11", "", "",
      "\1\6\1\uffff\12\10\12\uffff\1\3\1\7\1\3\30\uffff\1\11\4\uffff" + "\1\3\1\7\1\3", "\12\10\45\uffff\1\11" };

   static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
   static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
   static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
   static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
   static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
   static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
   static final short[][] DFA30_transition;

   static {
      int numStates = DFA30_transitionS.length;
      DFA30_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
      }
   }

   class DFA30 extends DFA {

      public DFA30(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 30;
         this.eot = DFA30_eot;
         this.eof = DFA30_eof;
         this.min = DFA30_min;
         this.max = DFA30_max;
         this.accept = DFA30_accept;
         this.special = DFA30_special;
         this.transition = DFA30_transition;
      }

      public String getDescription() {
         return "8585:36: ( RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_FLOATTYPESUFFIX )";
      }
   }

   static final String DFA36_eotS = "\3\uffff\1\5\2\uffff\3\5";
   static final String DFA36_eofS = "\11\uffff";
   static final String DFA36_minS = "\1\60\1\130\2\56\2\uffff\1\60\2\56";
   static final String DFA36_maxS = "\1\60\1\170\2\146\2\uffff\3\146";
   static final String DFA36_acceptS = "\4\uffff\1\2\1\1\3\uffff";
   static final String DFA36_specialS = "\11\uffff}>";
   static final String[] DFA36_transitionS = { "\1\1", "\1\2\37\uffff\1\2",
      "\1\4\1\uffff\12\3\7\uffff\6\3\32\uffff\6\3", "\1\6\1\uffff\12\7\7\uffff\6\7\32\uffff\6\7", "", "",
      "\12\4\7\uffff\6\4\32\uffff\6\4", "\1\6\1\uffff\12\10\7\uffff\6\10\32\uffff\6\10",
      "\1\6\1\uffff\12\10\7\uffff\6\10\32\uffff\6\10" };

   static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
   static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
   static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
   static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
   static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
   static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
   static final short[][] DFA36_transition;

   static {
      int numStates = DFA36_transitionS.length;
      DFA36_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
      }
   }

   class DFA36 extends DFA {

      public DFA36(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 36;
         this.eot = DFA36_eot;
         this.eof = DFA36_eof;
         this.min = DFA36_min;
         this.max = DFA36_max;
         this.accept = DFA36_accept;
         this.special = DFA36_special;
         this.transition = DFA36_transition;
      }

      public String getDescription() {
         return "8599:32: ( RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ )";
      }
   }

   static final String DFA50_eotS = "\u014a\uffff";
   static final String DFA50_eofS = "\u014a\uffff";
   static final String DFA50_minS = "\1\11\u0149\uffff";
   static final String DFA50_maxS = "\1\uffe6\u0149\uffff";
   static final String DFA50_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"
      + "\15\1\16\1\20\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\35\1\36\1\37"
      + "\1\40\1\47\1\54\1\56\2\61\1\71\1\72\1\74\u0125\uffff\1\75\1\77";
   static final String DFA50_specialS = "\u014a\uffff}>";
   static final String[] DFA50_transitionS = {
      "\2\u0149\2\uffff\1\u0149\22\uffff\1\u0149\1\uffff\1\41\1\uffff"
         + "\1\42\1\uffff\1\5\1\40\1\24\1\25\1\16\1\uffff\1\10\1\uffff\1"
         + "\1\1\u0148\1\36\11\37\1\uffff\1\14\1\6\1\22\1\7\1\11\1\27\32"
         + "\42\1\2\1\uffff\1\3\1\uffff\1\42\1\uffff\1\32\1\31\1\17\1\30"
         + "\1\4\1\33\2\42\1\15\2\42\1\35\1\42\1\34\1\42\1\13\2\42\1\12"
         + "\1\26\1\42\1\23\4\42\1\20\1\uffff\1\21\44\uffff\4\42\4\uffff"
         + "\1\42\12\uffff\1\42\4\uffff\1\42\5\uffff\27\42\1\uffff\37\42"
         + "\1\uffff\u013f\42\31\uffff\162\42\4\uffff\14\42\16\uffff\5\42"
         + "\11\uffff\1\42\u008b\uffff\1\42\13\uffff\1\42\1\uffff\3\42\1"
         + "\uffff\1\42\1\uffff\24\42\1\uffff\54\42\1\uffff\46\42\1\uffff"
         + "\5\42\4\uffff\u0082\42\10\uffff\105\42\1\uffff\46\42\2\uffff"
         + "\2\42\6\uffff\20\42\41\uffff\46\42\2\uffff\1\42\7\uffff\47\42"
         + "\110\uffff\33\42\5\uffff\3\42\56\uffff\32\42\5\uffff\13\42\43"
         + "\uffff\2\42\1\uffff\143\42\1\uffff\1\42\17\uffff\2\42\7\uffff"
         + "\2\42\12\uffff\3\42\2\uffff\1\42\20\uffff\1\42\1\uffff\36\42"
         + "\35\uffff\3\42\60\uffff\46\42\13\uffff\1\42\u0152\uffff\66\42"
         + "\3\uffff\1\42\22\uffff\1\42\7\uffff\12\42\43\uffff\10\42\2\uffff"
         + "\2\42\2\uffff\26\42\1\uffff\7\42\1\uffff\1\42\3\uffff\4\42\3"
         + "\uffff\1\42\36\uffff\2\42\1\uffff\3\42\16\uffff\4\42\21\uffff"
         + "\6\42\4\uffff\2\42\2\uffff\26\42\1\uffff\7\42\1\uffff\2\42\1"
         + "\uffff\2\42\1\uffff\2\42\37\uffff\4\42\1\uffff\1\42\23\uffff"
         + "\3\42\20\uffff\11\42\1\uffff\3\42\1\uffff\26\42\1\uffff\7\42"
         + "\1\uffff\2\42\1\uffff\5\42\3\uffff\1\42\22\uffff\1\42\17\uffff"
         + "\2\42\17\uffff\1\42\23\uffff\10\42\2\uffff\2\42\2\uffff\26\42"
         + "\1\uffff\7\42\1\uffff\2\42\1\uffff\5\42\3\uffff\1\42\36\uffff"
         + "\2\42\1\uffff\3\42\17\uffff\1\42\21\uffff\1\42\1\uffff\6\42"
         + "\3\uffff\3\42\1\uffff\4\42\3\uffff\2\42\1\uffff\1\42\1\uffff"
         + "\2\42\3\uffff\2\42\3\uffff\3\42\3\uffff\10\42\1\uffff\3\42\77"
         + "\uffff\1\42\13\uffff\10\42\1\uffff\3\42\1\uffff\27\42\1\uffff"
         + "\12\42\1\uffff\5\42\46\uffff\2\42\43\uffff\10\42\1\uffff\3\42"
         + "\1\uffff\27\42\1\uffff\12\42\1\uffff\5\42\3\uffff\1\42\40\uffff"
         + "\1\42\1\uffff\2\42\43\uffff\10\42\1\uffff\3\42\1\uffff\27\42"
         + "\1\uffff\20\42\46\uffff\2\42\43\uffff\22\42\3\uffff\30\42\1"
         + "\uffff\11\42\1\uffff\1\42\2\uffff\7\42\72\uffff\60\42\1\uffff"
         + "\2\42\13\uffff\10\42\72\uffff\2\42\1\uffff\1\42\2\uffff\2\42"
         + "\1\uffff\1\42\2\uffff\1\42\6\uffff\4\42\1\uffff\7\42\1\uffff"
         + "\3\42\1\uffff\1\42\1\uffff\1\42\2\uffff\2\42\1\uffff\4\42\1"
         + "\uffff\2\42\11\uffff\1\42\2\uffff\5\42\1\uffff\1\42\25\uffff"
         + "\2\42\42\uffff\1\42\77\uffff\10\42\1\uffff\42\42\35\uffff\4"
         + "\42\164\uffff\42\42\1\uffff\5\42\1\uffff\2\42\45\uffff\6\42"
         + "\112\uffff\46\42\12\uffff\51\42\7\uffff\132\42\5\uffff\104\42"
         + "\5\uffff\122\42\6\uffff\7\42\1\uffff\77\42\1\uffff\1\42\1\uffff"
         + "\4\42\2\uffff\7\42\1\uffff\1\42\1\uffff\4\42\2\uffff\47\42\1"
         + "\uffff\1\42\1\uffff\4\42\2\uffff\37\42\1\uffff\1\42\1\uffff"
         + "\4\42\2\uffff\7\42\1\uffff\1\42\1\uffff\4\42\2\uffff\7\42\1"
         + "\uffff\7\42\1\uffff\27\42\1\uffff\37\42\1\uffff\1\42\1\uffff"
         + "\4\42\2\uffff\7\42\1\uffff\47\42\1\uffff\23\42\105\uffff\125"
         + "\42\14\uffff\u026c\42\2\uffff\10\42\12\uffff\32\42\5\uffff\113"
         + "\42\3\uffff\3\42\17\uffff\15\42\1\uffff\4\42\16\uffff\22\42"
         + "\16\uffff\22\42\16\uffff\15\42\1\uffff\3\42\17\uffff\64\42\43"
         + "\uffff\1\42\3\uffff\2\42\103\uffff\130\42\10\uffff\51\42\127"
         + "\uffff\35\42\63\uffff\36\42\2\uffff\5\42\u038b\uffff\154\42"
         + "\u0094\uffff\u009c\42\4\uffff\132\42\6\uffff\26\42\2\uffff\6"
         + "\42\2\uffff\46\42\2\uffff\6\42\2\uffff\10\42\1\uffff\1\42\1"
         + "\uffff\1\42\1\uffff\1\42\1\uffff\37\42\2\uffff\65\42\1\uffff"
         + "\7\42\1\uffff\1\42\3\uffff\3\42\1\uffff\7\42\3\uffff\4\42\2"
         + "\uffff\6\42\4\uffff\15\42\5\uffff\3\42\1\uffff\7\42\102\uffff"
         + "\2\42\23\uffff\1\42\34\uffff\1\42\15\uffff\1\42\40\uffff\22"
         + "\42\120\uffff\1\42\4\uffff\1\42\2\uffff\12\42\1\uffff\1\42\3"
         + "\uffff\5\42\6\uffff\1\42\1\uffff\1\42\1\uffff\1\42\1\uffff\4"
         + "\42\1\uffff\3\42\1\uffff\7\42\3\uffff\3\42\5\uffff\5\42\26\uffff"
         + "\44\42\u0e81\uffff\3\42\31\uffff\11\42\7\uffff\5\42\2\uffff"
         + "\5\42\4\uffff\126\42\6\uffff\3\42\1\uffff\137\42\5\uffff\50"
         + "\42\4\uffff\136\42\21\uffff\30\42\70\uffff\20\42\u0200\uffff"
         + "\u19b6\42\112\uffff\u51a6\42\132\uffff\u048d\42\u0773\uffff"
         + "\u2ba4\42\134\uffff\u0400\42\u1d00\uffff\u012e\42\2\uffff\73"
         + "\42\u0095\uffff\7\42\14\uffff\5\42\5\uffff\1\42\1\uffff\12\42"
         + "\1\uffff\15\42\1\uffff\5\42\1\uffff\1\42\1\uffff\2\42\1\uffff"
         + "\2\42\1\uffff\154\42\41\uffff\u016b\42\22\uffff\100\42\2\uffff"
         + "\66\42\50\uffff\15\42\66\uffff\2\42\30\uffff\3\42\31\uffff\1"
         + "\42\6\uffff\5\42\1\uffff\u0087\42\7\uffff\1\42\34\uffff\32\42"
         + "\4\uffff\1\42\1\uffff\32\42\12\uffff\132\42\3\uffff\6\42\2\uffff"
         + "\6\42\2\uffff\6\42\2\uffff\3\42\3\uffff\2\42\3\uffff\2\42", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "" };

   static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
   static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
   static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
   static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
   static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
   static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
   static final short[][] DFA50_transition;

   static {
      int numStates = DFA50_transitionS.length;
      DFA50_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
      }
   }

   class DFA50 extends DFA {

      public DFA50(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 50;
         this.eot = DFA50_eot;
         this.eof = DFA50_eof;
         this.min = DFA50_min;
         this.max = DFA50_max;
         this.accept = DFA50_accept;
         this.special = DFA50_special;
         this.transition = DFA50_transition;
      }

      public String getDescription() {
         return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_BOOLEANTYPE | RULE_NUMERICTYPE | RULE_INTEGRALTYPE | RULE_FLOATINGPOINTTYPE | RULE_DECIMALINTEGERLITERAL | RULE_HEXINTEGERLITERAL | RULE_OCTALINTEGERLITERAL | RULE_BINARYINTEGERLITERAL | RULE_DECIMALFLOATINGPOINTLITERAL | RULE_HEXADECIMALFLOATINGPOINTLITERAL | RULE_TRUE | RULE_FALSE | RULE_CHARACTER | RULE_STRING | RULE_NULL | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
      }
   }


}