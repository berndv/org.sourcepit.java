
package org.sourcepit.java.literals.ui.contentassist.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

@SuppressWarnings("all")
public class InternalLiteralsParser extends AbstractInternalContentAssistParser {
   public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>",
      "RULE_DECIMALINTEGERLITERAL", "RULE_HEXINTEGERLITERAL", "RULE_OCTALINTEGERLITERAL", "RULE_BINARYINTEGERLITERAL",
      "RULE_DECIMALFLOATINGPOINTLITERAL", "RULE_HEXADECIMALFLOATINGPOINTLITERAL", "RULE_TRUE", "RULE_FALSE",
      "RULE_IDENTIFIER", "RULE_CHARACTER", "RULE_STRING", "RULE_NULL", "RULE_DECIMALNUMERAL", "RULE_INTEGERTYPESUFFIX",
      "RULE_HEXNUMERAL", "RULE_OCTALNUMERAL", "RULE_BINARYNUMERAL", "RULE_NONZERODIGIT", "RULE_DIGITS",
      "RULE_UNDERSCORES", "RULE_DIGIT", "RULE_DIGITSANDUNDERSCORES", "RULE_DIGITORUNDERSCORE", "RULE_HEXDIGITS",
      "RULE_HEXDIGIT", "RULE_HEXDIGITSANDUNDERSCORES", "RULE_HEXDIGITORUNDERSCORE", "RULE_OCTALDIGITS",
      "RULE_OCTALDIGIT", "RULE_OCTALDIGITSANDUNDERSCORES", "RULE_OCTALDIGITORUNDERSCORE", "RULE_BINARYDIGITS",
      "RULE_BINARYDIGIT", "RULE_BINARYDIGITSANDUNDERSCORES", "RULE_BINARYDIGITORUNDERSCORE", "RULE_EXPONENTPART",
      "RULE_FLOATTYPESUFFIX", "RULE_EXPONENTINDICATOR", "RULE_SIGNEDINTEGER", "RULE_SIGN", "RULE_HEXSIGNIFICAND",
      "RULE_BINARYEXPONENT", "RULE_BINARYEXPONENTINDICATOR", "RULE_ESCAPESEQUENCE", "RULE_UNICODEESCAPE",
      "RULE_OCTALESCAPE", "RULE_ZEROTOTHREE", "RULE_UNICODEMARKER", "RULE_JAVALETTER", "RULE_JAVALETTERORDIGIT",
      "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'@'", "'public'" };
   public static final int RULE_JAVALETTER = 52;
   public static final int RULE_JAVALETTERORDIGIT = 53;
   public static final int RULE_CHARACTER = 13;
   public static final int RULE_HEXDIGITORUNDERSCORE = 30;
   public static final int RULE_SIGN = 43;
   public static final int RULE_BINARYDIGITS = 35;
   public static final int RULE_OCTALINTEGERLITERAL = 6;
   public static final int RULE_OCTALDIGITS = 31;
   public static final int RULE_HEXSIGNIFICAND = 44;
   public static final int RULE_DECIMALINTEGERLITERAL = 4;
   public static final int RULE_ESCAPESEQUENCE = 47;
   public static final int T__57 = 57;
   public static final int RULE_HEXINTEGERLITERAL = 5;
   public static final int T__58 = 58;
   public static final int RULE_UNDERSCORES = 23;
   public static final int RULE_NONZERODIGIT = 21;
   public static final int RULE_OCTALDIGITORUNDERSCORE = 34;
   public static final int RULE_HEXDIGIT = 28;
   public static final int RULE_UNICODEESCAPE = 48;
   public static final int RULE_OCTALNUMERAL = 19;
   public static final int RULE_ZEROTOTHREE = 50;
   public static final int RULE_DIGIT = 24;
   public static final int RULE_DECIMALNUMERAL = 16;
   public static final int RULE_BINARYNUMERAL = 20;
   public static final int RULE_DIGITORUNDERSCORE = 26;
   public static final int RULE_ML_COMMENT = 54;
   public static final int RULE_HEXDIGITSANDUNDERSCORES = 29;
   public static final int RULE_BINARYDIGITORUNDERSCORE = 38;
   public static final int RULE_UNICODEMARKER = 51;
   public static final int RULE_INTEGERTYPESUFFIX = 17;
   public static final int RULE_FALSE = 11;
   public static final int RULE_BINARYEXPONENT = 45;
   public static final int RULE_DIGITSANDUNDERSCORES = 25;
   public static final int RULE_IDENTIFIER = 12;
   public static final int RULE_DECIMALFLOATINGPOINTLITERAL = 8;
   public static final int RULE_STRING = 14;
   public static final int RULE_FLOATTYPESUFFIX = 40;
   public static final int RULE_BINARYINTEGERLITERAL = 7;
   public static final int RULE_NULL = 15;
   public static final int RULE_DIGITS = 22;
   public static final int RULE_SL_COMMENT = 55;
   public static final int RULE_HEXADECIMALFLOATINGPOINTLITERAL = 9;
   public static final int RULE_TRUE = 10;
   public static final int EOF = -1;
   public static final int RULE_HEXNUMERAL = 18;
   public static final int RULE_WS = 56;
   public static final int RULE_OCTALDIGIT = 32;
   public static final int RULE_SIGNEDINTEGER = 42;
   public static final int RULE_HEXDIGITS = 27;
   public static final int RULE_BINARYEXPONENTINDICATOR = 46;
   public static final int RULE_OCTALDIGITSANDUNDERSCORES = 33;
   public static final int RULE_OCTALESCAPE = 49;
   public static final int RULE_BINARYDIGITSANDUNDERSCORES = 37;
   public static final int RULE_EXPONENTINDICATOR = 41;
   public static final int RULE_BINARYDIGIT = 36;
   public static final int RULE_EXPONENTPART = 39;

   // delegates
   // delegators


   public InternalLiteralsParser(TokenStream input) {
      this(input, new RecognizerSharedState());
   }

   public InternalLiteralsParser(TokenStream input, RecognizerSharedState state) {
      super(input, state);

   }


   public String[] getTokenNames() {
      return InternalLiteralsParser.tokenNames;
   }

   public String getGrammarFileName() {
      return "../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g";
   }


   private LiteralsGrammarAccess grammarAccess;

   public void setGrammarAccess(LiteralsGrammarAccess grammarAccess) {
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


   // $ANTLR start "entryRuleFoo"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:60:1:
   // entryRuleFoo : ruleFoo EOF ;
   public final void entryRuleFoo() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:61:1:
         // ( ruleFoo EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:62:1:
         // ruleFoo EOF
         {
            before(grammarAccess.getFooRule());
            pushFollow(FOLLOW_ruleFoo_in_entryRuleFoo61);
            ruleFoo();

            state._fsp--;

            after(grammarAccess.getFooRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleFoo68);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleFoo"


   // $ANTLR start "ruleFoo"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:69:1:
   // ruleFoo : ( ( rule__Foo__Group__0 ) ) ;
   public final void ruleFoo() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:73:2:
         // ( ( ( rule__Foo__Group__0 ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:74:1:
         // ( ( rule__Foo__Group__0 ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:74:1:
            // ( ( rule__Foo__Group__0 ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:75:1:
            // ( rule__Foo__Group__0 )
            {
               before(grammarAccess.getFooAccess().getGroup());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:76:1:
               // ( rule__Foo__Group__0 )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:76:2:
               // rule__Foo__Group__0
               {
                  pushFollow(FOLLOW_rule__Foo__Group__0_in_ruleFoo94);
                  rule__Foo__Group__0();

                  state._fsp--;


               }

               after(grammarAccess.getFooAccess().getGroup());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleFoo"


   // $ANTLR start "entryRuleliteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:88:1:
   // entryRuleliteral : ruleliteral EOF ;
   public final void entryRuleliteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:89:1:
         // ( ruleliteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:90:1:
         // ruleliteral EOF
         {
            before(grammarAccess.getLiteralRule());
            pushFollow(FOLLOW_ruleliteral_in_entryRuleliteral121);
            ruleliteral();

            state._fsp--;

            after(grammarAccess.getLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleliteral128);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleliteral"


   // $ANTLR start "ruleliteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:97:1:
   // ruleliteral : ( ( rule__Literal__Alternatives ) ) ;
   public final void ruleliteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:101:2:
         // ( ( ( rule__Literal__Alternatives ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:102:1:
         // ( ( rule__Literal__Alternatives ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:102:1:
            // ( ( rule__Literal__Alternatives ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:103:1:
            // ( rule__Literal__Alternatives )
            {
               before(grammarAccess.getLiteralAccess().getAlternatives());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:104:1:
               // ( rule__Literal__Alternatives )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:104:2:
               // rule__Literal__Alternatives
               {
                  pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleliteral154);
                  rule__Literal__Alternatives();

                  state._fsp--;


               }

               after(grammarAccess.getLiteralAccess().getAlternatives());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleliteral"


   // $ANTLR start "entryRuleIntegerLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:116:1:
   // entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
   public final void entryRuleIntegerLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:117:1:
         // ( ruleIntegerLiteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:118:1:
         // ruleIntegerLiteral EOF
         {
            before(grammarAccess.getIntegerLiteralRule());
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral181);
            ruleIntegerLiteral();

            state._fsp--;

            after(grammarAccess.getIntegerLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleIntegerLiteral188);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleIntegerLiteral"


   // $ANTLR start "ruleIntegerLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:125:1:
   // ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
   public final void ruleIntegerLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:129:2:
         // ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:130:1:
         // ( ( rule__IntegerLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:130:1:
            // ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:131:1:
            // ( rule__IntegerLiteral__ValueAssignment )
            {
               before(grammarAccess.getIntegerLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:132:1:
               // ( rule__IntegerLiteral__ValueAssignment )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:132:2:
               // rule__IntegerLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral214);
                  rule__IntegerLiteral__ValueAssignment();

                  state._fsp--;


               }

               after(grammarAccess.getIntegerLiteralAccess().getValueAssignment());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleIntegerLiteral"


   // $ANTLR start "entryRuleFloatingPointLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:144:1:
   // entryRuleFloatingPointLiteral : ruleFloatingPointLiteral EOF ;
   public final void entryRuleFloatingPointLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:145:1:
         // ( ruleFloatingPointLiteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:146:1:
         // ruleFloatingPointLiteral EOF
         {
            before(grammarAccess.getFloatingPointLiteralRule());
            pushFollow(FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral241);
            ruleFloatingPointLiteral();

            state._fsp--;

            after(grammarAccess.getFloatingPointLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleFloatingPointLiteral248);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleFloatingPointLiteral"


   // $ANTLR start "ruleFloatingPointLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:153:1:
   // ruleFloatingPointLiteral : ( ( rule__FloatingPointLiteral__ValueAssignment ) ) ;
   public final void ruleFloatingPointLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:157:2:
         // ( ( ( rule__FloatingPointLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:158:1:
         // ( ( rule__FloatingPointLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:158:1:
            // ( ( rule__FloatingPointLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:159:1:
            // ( rule__FloatingPointLiteral__ValueAssignment )
            {
               before(grammarAccess.getFloatingPointLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:160:1:
               // ( rule__FloatingPointLiteral__ValueAssignment )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:160:2:
               // rule__FloatingPointLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__FloatingPointLiteral__ValueAssignment_in_ruleFloatingPointLiteral274);
                  rule__FloatingPointLiteral__ValueAssignment();

                  state._fsp--;


               }

               after(grammarAccess.getFloatingPointLiteralAccess().getValueAssignment());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleFloatingPointLiteral"


   // $ANTLR start "entryRuleBooleanLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:172:1:
   // entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
   public final void entryRuleBooleanLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:173:1:
         // ( ruleBooleanLiteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:174:1:
         // ruleBooleanLiteral EOF
         {
            before(grammarAccess.getBooleanLiteralRule());
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral301);
            ruleBooleanLiteral();

            state._fsp--;

            after(grammarAccess.getBooleanLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanLiteral308);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleBooleanLiteral"


   // $ANTLR start "ruleBooleanLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:181:1:
   // ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
   public final void ruleBooleanLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:185:2:
         // ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:186:1:
         // ( ( rule__BooleanLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:186:1:
            // ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:187:1:
            // ( rule__BooleanLiteral__ValueAssignment )
            {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:188:1:
               // ( rule__BooleanLiteral__ValueAssignment )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:188:2:
               // rule__BooleanLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral334);
                  rule__BooleanLiteral__ValueAssignment();

                  state._fsp--;


               }

               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleBooleanLiteral"


   // $ANTLR start "entryRuleCharacterLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:200:1:
   // entryRuleCharacterLiteral : ruleCharacterLiteral EOF ;
   public final void entryRuleCharacterLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:201:1:
         // ( ruleCharacterLiteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:202:1:
         // ruleCharacterLiteral EOF
         {
            before(grammarAccess.getCharacterLiteralRule());
            pushFollow(FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral361);
            ruleCharacterLiteral();

            state._fsp--;

            after(grammarAccess.getCharacterLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleCharacterLiteral368);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleCharacterLiteral"


   // $ANTLR start "ruleCharacterLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:209:1:
   // ruleCharacterLiteral : ( ( rule__CharacterLiteral__ValueAssignment ) ) ;
   public final void ruleCharacterLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:213:2:
         // ( ( ( rule__CharacterLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:214:1:
         // ( ( rule__CharacterLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:214:1:
            // ( ( rule__CharacterLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:215:1:
            // ( rule__CharacterLiteral__ValueAssignment )
            {
               before(grammarAccess.getCharacterLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:216:1:
               // ( rule__CharacterLiteral__ValueAssignment )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:216:2:
               // rule__CharacterLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__CharacterLiteral__ValueAssignment_in_ruleCharacterLiteral394);
                  rule__CharacterLiteral__ValueAssignment();

                  state._fsp--;


               }

               after(grammarAccess.getCharacterLiteralAccess().getValueAssignment());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleCharacterLiteral"


   // $ANTLR start "entryRuleStringLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:228:1:
   // entryRuleStringLiteral : ruleStringLiteral EOF ;
   public final void entryRuleStringLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:229:1:
         // ( ruleStringLiteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:230:1:
         // ruleStringLiteral EOF
         {
            before(grammarAccess.getStringLiteralRule());
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral421);
            ruleStringLiteral();

            state._fsp--;

            after(grammarAccess.getStringLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleStringLiteral428);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleStringLiteral"


   // $ANTLR start "ruleStringLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:237:1:
   // ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
   public final void ruleStringLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:241:2:
         // ( ( ( rule__StringLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:242:1:
         // ( ( rule__StringLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:242:1:
            // ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:243:1:
            // ( rule__StringLiteral__ValueAssignment )
            {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:244:1:
               // ( rule__StringLiteral__ValueAssignment )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:244:2:
               // rule__StringLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral454);
                  rule__StringLiteral__ValueAssignment();

                  state._fsp--;


               }

               after(grammarAccess.getStringLiteralAccess().getValueAssignment());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleStringLiteral"


   // $ANTLR start "entryRuleNullLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:256:1:
   // entryRuleNullLiteral : ruleNullLiteral EOF ;
   public final void entryRuleNullLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:257:1:
         // ( ruleNullLiteral EOF )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:258:1:
         // ruleNullLiteral EOF
         {
            before(grammarAccess.getNullLiteralRule());
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral481);
            ruleNullLiteral();

            state._fsp--;

            after(grammarAccess.getNullLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleNullLiteral488);

         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {
      }
      return;
   }

   // $ANTLR end "entryRuleNullLiteral"


   // $ANTLR start "ruleNullLiteral"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:265:1:
   // ruleNullLiteral : ( ( rule__NullLiteral__ValueAssignment ) ) ;
   public final void ruleNullLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:269:2:
         // ( ( ( rule__NullLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:270:1:
         // ( ( rule__NullLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:270:1:
            // ( ( rule__NullLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:271:1:
            // ( rule__NullLiteral__ValueAssignment )
            {
               before(grammarAccess.getNullLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:272:1:
               // ( rule__NullLiteral__ValueAssignment )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:272:2:
               // rule__NullLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__NullLiteral__ValueAssignment_in_ruleNullLiteral514);
                  rule__NullLiteral__ValueAssignment();

                  state._fsp--;


               }

               after(grammarAccess.getNullLiteralAccess().getValueAssignment());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "ruleNullLiteral"


   // $ANTLR start "rule__Literal__Alternatives"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:284:1:
   // rule__Literal__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleFloatingPointLiteral ) | ( ruleBooleanLiteral ) | (
   // ruleCharacterLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) );
   public final void rule__Literal__Alternatives() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:288:1:
         // ( ( ruleIntegerLiteral ) | ( ruleFloatingPointLiteral ) | ( ruleBooleanLiteral ) | ( ruleCharacterLiteral )
         // | ( ruleStringLiteral ) | ( ruleNullLiteral ) )
         int alt1 = 6;
         switch (input.LA(1)) {
            case RULE_DECIMALINTEGERLITERAL :
            case RULE_HEXINTEGERLITERAL :
            case RULE_OCTALINTEGERLITERAL :
            case RULE_BINARYINTEGERLITERAL : {
               alt1 = 1;
            }
               break;
            case RULE_DECIMALFLOATINGPOINTLITERAL :
            case RULE_HEXADECIMALFLOATINGPOINTLITERAL : {
               alt1 = 2;
            }
               break;
            case RULE_TRUE :
            case RULE_FALSE : {
               alt1 = 3;
            }
               break;
            case RULE_CHARACTER : {
               alt1 = 4;
            }
               break;
            case RULE_STRING : {
               alt1 = 5;
            }
               break;
            case RULE_NULL : {
               alt1 = 6;
            }
               break;
            default :
               NoViableAltException nvae = new NoViableAltException("", 1, 0, input);

               throw nvae;
         }

         switch (alt1) {
            case 1 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:289:1:
            // ( ruleIntegerLiteral )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:289:1:
               // ( ruleIntegerLiteral )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:290:1:
               // ruleIntegerLiteral
               {
                  before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());
                  pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives550);
                  ruleIntegerLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:295:6:
            // ( ruleFloatingPointLiteral )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:295:6:
               // ( ruleFloatingPointLiteral )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:296:1:
               // ruleFloatingPointLiteral
               {
                  before(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1());
                  pushFollow(FOLLOW_ruleFloatingPointLiteral_in_rule__Literal__Alternatives567);
                  ruleFloatingPointLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1());

               }


            }
               break;
            case 3 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:301:6:
            // ( ruleBooleanLiteral )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:301:6:
               // ( ruleBooleanLiteral )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:302:1:
               // ruleBooleanLiteral
               {
                  before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                  pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives584);
                  ruleBooleanLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());

               }


            }
               break;
            case 4 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:307:6:
            // ( ruleCharacterLiteral )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:307:6:
               // ( ruleCharacterLiteral )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:308:1:
               // ruleCharacterLiteral
               {
                  before(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3());
                  pushFollow(FOLLOW_ruleCharacterLiteral_in_rule__Literal__Alternatives601);
                  ruleCharacterLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3());

               }


            }
               break;
            case 5 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:313:6:
            // ( ruleStringLiteral )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:313:6:
               // ( ruleStringLiteral )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:314:1:
               // ruleStringLiteral
               {
                  before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());
                  pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives618);
                  ruleStringLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());

               }


            }
               break;
            case 6 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:319:6:
            // ( ruleNullLiteral )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:319:6:
               // ( ruleNullLiteral )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:320:1:
               // ruleNullLiteral
               {
                  before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5());
                  pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives635);
                  ruleNullLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5());

               }


            }
               break;

         }
      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Literal__Alternatives"


   // $ANTLR start "rule__IntegerLiteral__ValueAlternatives_0"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:330:1:
   // rule__IntegerLiteral__ValueAlternatives_0 : ( ( RULE_DECIMALINTEGERLITERAL ) | ( RULE_HEXINTEGERLITERAL ) | (
   // RULE_OCTALINTEGERLITERAL ) | ( RULE_BINARYINTEGERLITERAL ) );
   public final void rule__IntegerLiteral__ValueAlternatives_0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:334:1:
         // ( ( RULE_DECIMALINTEGERLITERAL ) | ( RULE_HEXINTEGERLITERAL ) | ( RULE_OCTALINTEGERLITERAL ) | (
         // RULE_BINARYINTEGERLITERAL ) )
         int alt2 = 4;
         switch (input.LA(1)) {
            case RULE_DECIMALINTEGERLITERAL : {
               alt2 = 1;
            }
               break;
            case RULE_HEXINTEGERLITERAL : {
               alt2 = 2;
            }
               break;
            case RULE_OCTALINTEGERLITERAL : {
               alt2 = 3;
            }
               break;
            case RULE_BINARYINTEGERLITERAL : {
               alt2 = 4;
            }
               break;
            default :
               NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

               throw nvae;
         }

         switch (alt2) {
            case 1 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:335:1:
            // ( RULE_DECIMALINTEGERLITERAL )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:335:1:
               // ( RULE_DECIMALINTEGERLITERAL )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:336:1:
               // RULE_DECIMALINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueDecimalIntegerLiteralTerminalRuleCall_0_0());
                  match(input, RULE_DECIMALINTEGERLITERAL,
                     FOLLOW_RULE_DECIMALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0667);
                  after(grammarAccess.getIntegerLiteralAccess().getValueDecimalIntegerLiteralTerminalRuleCall_0_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:341:6:
            // ( RULE_HEXINTEGERLITERAL )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:341:6:
               // ( RULE_HEXINTEGERLITERAL )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:342:1:
               // RULE_HEXINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueHexIntegerLiteralTerminalRuleCall_0_1());
                  match(input, RULE_HEXINTEGERLITERAL,
                     FOLLOW_RULE_HEXINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0684);
                  after(grammarAccess.getIntegerLiteralAccess().getValueHexIntegerLiteralTerminalRuleCall_0_1());

               }


            }
               break;
            case 3 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:347:6:
            // ( RULE_OCTALINTEGERLITERAL )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:347:6:
               // ( RULE_OCTALINTEGERLITERAL )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:348:1:
               // RULE_OCTALINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueOctalIntegerLiteralTerminalRuleCall_0_2());
                  match(input, RULE_OCTALINTEGERLITERAL,
                     FOLLOW_RULE_OCTALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0701);
                  after(grammarAccess.getIntegerLiteralAccess().getValueOctalIntegerLiteralTerminalRuleCall_0_2());

               }


            }
               break;
            case 4 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:353:6:
            // ( RULE_BINARYINTEGERLITERAL )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:353:6:
               // ( RULE_BINARYINTEGERLITERAL )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:354:1:
               // RULE_BINARYINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueBinaryIntegerLiteralTerminalRuleCall_0_3());
                  match(input, RULE_BINARYINTEGERLITERAL,
                     FOLLOW_RULE_BINARYINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0718);
                  after(grammarAccess.getIntegerLiteralAccess().getValueBinaryIntegerLiteralTerminalRuleCall_0_3());

               }


            }
               break;

         }
      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__IntegerLiteral__ValueAlternatives_0"


   // $ANTLR start "rule__FloatingPointLiteral__ValueAlternatives_0"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:364:1:
   // rule__FloatingPointLiteral__ValueAlternatives_0 : ( ( RULE_DECIMALFLOATINGPOINTLITERAL ) | (
   // RULE_HEXADECIMALFLOATINGPOINTLITERAL ) );
   public final void rule__FloatingPointLiteral__ValueAlternatives_0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:368:1:
         // ( ( RULE_DECIMALFLOATINGPOINTLITERAL ) | ( RULE_HEXADECIMALFLOATINGPOINTLITERAL ) )
         int alt3 = 2;
         int LA3_0 = input.LA(1);

         if ((LA3_0 == RULE_DECIMALFLOATINGPOINTLITERAL)) {
            alt3 = 1;
         }
         else if ((LA3_0 == RULE_HEXADECIMALFLOATINGPOINTLITERAL)) {
            alt3 = 2;
         }
         else {
            NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

            throw nvae;
         }
         switch (alt3) {
            case 1 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:369:1:
            // ( RULE_DECIMALFLOATINGPOINTLITERAL )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:369:1:
               // ( RULE_DECIMALFLOATINGPOINTLITERAL )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:370:1:
               // RULE_DECIMALFLOATINGPOINTLITERAL
               {
                  before(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0());
                  match(input, RULE_DECIMALFLOATINGPOINTLITERAL,
                     FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0750);
                  after(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:375:6:
            // ( RULE_HEXADECIMALFLOATINGPOINTLITERAL )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:375:6:
               // ( RULE_HEXADECIMALFLOATINGPOINTLITERAL )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:376:1:
               // RULE_HEXADECIMALFLOATINGPOINTLITERAL
               {
                  before(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1());
                  match(input, RULE_HEXADECIMALFLOATINGPOINTLITERAL,
                     FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0767);
                  after(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1());

               }


            }
               break;

         }
      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__FloatingPointLiteral__ValueAlternatives_0"


   // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_0"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:386:1:
   // rule__BooleanLiteral__ValueAlternatives_0 : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
   public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:390:1:
         // ( ( RULE_TRUE ) | ( RULE_FALSE ) )
         int alt4 = 2;
         int LA4_0 = input.LA(1);

         if ((LA4_0 == RULE_TRUE)) {
            alt4 = 1;
         }
         else if ((LA4_0 == RULE_FALSE)) {
            alt4 = 2;
         }
         else {
            NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

            throw nvae;
         }
         switch (alt4) {
            case 1 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:391:1:
            // ( RULE_TRUE )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:391:1:
               // ( RULE_TRUE )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:392:1:
               // RULE_TRUE
               {
                  before(grammarAccess.getBooleanLiteralAccess().getValueTRUETerminalRuleCall_0_0());
                  match(input, RULE_TRUE, FOLLOW_RULE_TRUE_in_rule__BooleanLiteral__ValueAlternatives_0799);
                  after(grammarAccess.getBooleanLiteralAccess().getValueTRUETerminalRuleCall_0_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:397:6:
            // ( RULE_FALSE )
            {
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:397:6:
               // ( RULE_FALSE )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:398:1:
               // RULE_FALSE
               {
                  before(grammarAccess.getBooleanLiteralAccess().getValueFALSETerminalRuleCall_0_1());
                  match(input, RULE_FALSE, FOLLOW_RULE_FALSE_in_rule__BooleanLiteral__ValueAlternatives_0816);
                  after(grammarAccess.getBooleanLiteralAccess().getValueFALSETerminalRuleCall_0_1());

               }


            }
               break;

         }
      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_0"


   // $ANTLR start "rule__Foo__Group__0"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:410:1:
   // rule__Foo__Group__0 : rule__Foo__Group__0__Impl rule__Foo__Group__1 ;
   public final void rule__Foo__Group__0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:414:1:
         // ( rule__Foo__Group__0__Impl rule__Foo__Group__1 )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:415:2:
         // rule__Foo__Group__0__Impl rule__Foo__Group__1
         {
            pushFollow(FOLLOW_rule__Foo__Group__0__Impl_in_rule__Foo__Group__0846);
            rule__Foo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Foo__Group__1_in_rule__Foo__Group__0849);
            rule__Foo__Group__1();

            state._fsp--;


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__0"


   // $ANTLR start "rule__Foo__Group__0__Impl"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:422:1:
   // rule__Foo__Group__0__Impl : ( '@' ) ;
   public final void rule__Foo__Group__0__Impl() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:426:1:
         // ( ( '@' ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:427:1:
         // ( '@' )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:427:1:
            // ( '@' )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:428:1:
            // '@'
            {
               before(grammarAccess.getFooAccess().getCommercialAtKeyword_0());
               match(input, 57, FOLLOW_57_in_rule__Foo__Group__0__Impl877);
               after(grammarAccess.getFooAccess().getCommercialAtKeyword_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__0__Impl"


   // $ANTLR start "rule__Foo__Group__1"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:441:1:
   // rule__Foo__Group__1 : rule__Foo__Group__1__Impl rule__Foo__Group__2 ;
   public final void rule__Foo__Group__1() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:445:1:
         // ( rule__Foo__Group__1__Impl rule__Foo__Group__2 )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:446:2:
         // rule__Foo__Group__1__Impl rule__Foo__Group__2
         {
            pushFollow(FOLLOW_rule__Foo__Group__1__Impl_in_rule__Foo__Group__1908);
            rule__Foo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Foo__Group__2_in_rule__Foo__Group__1911);
            rule__Foo__Group__2();

            state._fsp--;


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__1"


   // $ANTLR start "rule__Foo__Group__1__Impl"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:453:1:
   // rule__Foo__Group__1__Impl : ( ruleliteral ) ;
   public final void rule__Foo__Group__1__Impl() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:457:1:
         // ( ( ruleliteral ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:458:1:
         // ( ruleliteral )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:458:1:
            // ( ruleliteral )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:459:1:
            // ruleliteral
            {
               before(grammarAccess.getFooAccess().getLiteralParserRuleCall_1());
               pushFollow(FOLLOW_ruleliteral_in_rule__Foo__Group__1__Impl938);
               ruleliteral();

               state._fsp--;

               after(grammarAccess.getFooAccess().getLiteralParserRuleCall_1());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__1__Impl"


   // $ANTLR start "rule__Foo__Group__2"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:470:1:
   // rule__Foo__Group__2 : rule__Foo__Group__2__Impl rule__Foo__Group__3 ;
   public final void rule__Foo__Group__2() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:474:1:
         // ( rule__Foo__Group__2__Impl rule__Foo__Group__3 )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:475:2:
         // rule__Foo__Group__2__Impl rule__Foo__Group__3
         {
            pushFollow(FOLLOW_rule__Foo__Group__2__Impl_in_rule__Foo__Group__2967);
            rule__Foo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Foo__Group__3_in_rule__Foo__Group__2970);
            rule__Foo__Group__3();

            state._fsp--;


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__2"


   // $ANTLR start "rule__Foo__Group__2__Impl"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:482:1:
   // rule__Foo__Group__2__Impl : ( 'public' ) ;
   public final void rule__Foo__Group__2__Impl() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:486:1:
         // ( ( 'public' ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:487:1:
         // ( 'public' )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:487:1:
            // ( 'public' )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:488:1:
            // 'public'
            {
               before(grammarAccess.getFooAccess().getPublicKeyword_2());
               match(input, 58, FOLLOW_58_in_rule__Foo__Group__2__Impl998);
               after(grammarAccess.getFooAccess().getPublicKeyword_2());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__2__Impl"


   // $ANTLR start "rule__Foo__Group__3"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:501:1:
   // rule__Foo__Group__3 : rule__Foo__Group__3__Impl ;
   public final void rule__Foo__Group__3() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:505:1:
         // ( rule__Foo__Group__3__Impl )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:506:2:
         // rule__Foo__Group__3__Impl
         {
            pushFollow(FOLLOW_rule__Foo__Group__3__Impl_in_rule__Foo__Group__31029);
            rule__Foo__Group__3__Impl();

            state._fsp--;


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__3"


   // $ANTLR start "rule__Foo__Group__3__Impl"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:512:1:
   // rule__Foo__Group__3__Impl : ( RULE_IDENTIFIER ) ;
   public final void rule__Foo__Group__3__Impl() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:516:1:
         // ( ( RULE_IDENTIFIER ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:517:1:
         // ( RULE_IDENTIFIER )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:517:1:
            // ( RULE_IDENTIFIER )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:518:1:
            // RULE_IDENTIFIER
            {
               before(grammarAccess.getFooAccess().getIdentifierTerminalRuleCall_3());
               match(input, RULE_IDENTIFIER, FOLLOW_RULE_IDENTIFIER_in_rule__Foo__Group__3__Impl1056);
               after(grammarAccess.getFooAccess().getIdentifierTerminalRuleCall_3());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__Foo__Group__3__Impl"


   // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:538:1:
   // rule__IntegerLiteral__ValueAssignment : ( ( rule__IntegerLiteral__ValueAlternatives_0 ) ) ;
   public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:542:1:
         // ( ( ( rule__IntegerLiteral__ValueAlternatives_0 ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:543:1:
         // ( ( rule__IntegerLiteral__ValueAlternatives_0 ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:543:1:
            // ( ( rule__IntegerLiteral__ValueAlternatives_0 ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:544:1:
            // ( rule__IntegerLiteral__ValueAlternatives_0 )
            {
               before(grammarAccess.getIntegerLiteralAccess().getValueAlternatives_0());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:545:1:
               // ( rule__IntegerLiteral__ValueAlternatives_0 )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:545:2:
               // rule__IntegerLiteral__ValueAlternatives_0
               {
                  pushFollow(FOLLOW_rule__IntegerLiteral__ValueAlternatives_0_in_rule__IntegerLiteral__ValueAssignment1098);
                  rule__IntegerLiteral__ValueAlternatives_0();

                  state._fsp--;


               }

               after(grammarAccess.getIntegerLiteralAccess().getValueAlternatives_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


   // $ANTLR start "rule__FloatingPointLiteral__ValueAssignment"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:554:1:
   // rule__FloatingPointLiteral__ValueAssignment : ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) ) ;
   public final void rule__FloatingPointLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:558:1:
         // ( ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:559:1:
         // ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:559:1:
            // ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:560:1:
            // ( rule__FloatingPointLiteral__ValueAlternatives_0 )
            {
               before(grammarAccess.getFloatingPointLiteralAccess().getValueAlternatives_0());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:561:1:
               // ( rule__FloatingPointLiteral__ValueAlternatives_0 )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:561:2:
               // rule__FloatingPointLiteral__ValueAlternatives_0
               {
                  pushFollow(FOLLOW_rule__FloatingPointLiteral__ValueAlternatives_0_in_rule__FloatingPointLiteral__ValueAssignment1131);
                  rule__FloatingPointLiteral__ValueAlternatives_0();

                  state._fsp--;


               }

               after(grammarAccess.getFloatingPointLiteralAccess().getValueAlternatives_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__FloatingPointLiteral__ValueAssignment"


   // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:570:1:
   // rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
   public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:574:1:
         // ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:575:1:
         // ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:575:1:
            // ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:576:1:
            // ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0());
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:577:1:
               // ( rule__BooleanLiteral__ValueAlternatives_0 )
               // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:577:2:
               // rule__BooleanLiteral__ValueAlternatives_0
               {
                  pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment1164);
                  rule__BooleanLiteral__ValueAlternatives_0();

                  state._fsp--;


               }

               after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


   // $ANTLR start "rule__CharacterLiteral__ValueAssignment"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:586:1:
   // rule__CharacterLiteral__ValueAssignment : ( RULE_CHARACTER ) ;
   public final void rule__CharacterLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:590:1:
         // ( ( RULE_CHARACTER ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:591:1:
         // ( RULE_CHARACTER )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:591:1:
            // ( RULE_CHARACTER )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:592:1:
            // RULE_CHARACTER
            {
               before(grammarAccess.getCharacterLiteralAccess().getValueCHARACTERTerminalRuleCall_0());
               match(input, RULE_CHARACTER, FOLLOW_RULE_CHARACTER_in_rule__CharacterLiteral__ValueAssignment1197);
               after(grammarAccess.getCharacterLiteralAccess().getValueCHARACTERTerminalRuleCall_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__CharacterLiteral__ValueAssignment"


   // $ANTLR start "rule__StringLiteral__ValueAssignment"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:601:1:
   // rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
   public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:605:1:
         // ( ( RULE_STRING ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:606:1:
         // ( RULE_STRING )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:606:1:
            // ( RULE_STRING )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:607:1:
            // RULE_STRING
            {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
               match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment1228);
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__StringLiteral__ValueAssignment"


   // $ANTLR start "rule__NullLiteral__ValueAssignment"
   // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:616:1:
   // rule__NullLiteral__ValueAssignment : ( RULE_NULL ) ;
   public final void rule__NullLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:620:1:
         // ( ( RULE_NULL ) )
         // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:621:1:
         // ( RULE_NULL )
         {
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:621:1:
            // ( RULE_NULL )
            // ../org.sourcepit.java.literals.ui/src-gen/org/sourcepit/java/literals/ui/contentassist/antlr/internal/InternalLiterals.g:622:1:
            // RULE_NULL
            {
               before(grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0());
               match(input, RULE_NULL, FOLLOW_RULE_NULL_in_rule__NullLiteral__ValueAssignment1259);
               after(grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0());

            }


         }

      }
      catch (RecognitionException re) {
         reportError(re);
         recover(input, re);
      }
      finally {

         restoreStackSize(stackSize);

      }
      return;
   }

   // $ANTLR end "rule__NullLiteral__ValueAssignment"

   // Delegated rules


   public static final BitSet FOLLOW_ruleFoo_in_entryRuleFoo61 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleFoo68 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Foo__Group__0_in_ruleFoo94 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral121 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleliteral128 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleliteral154 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral181 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral188 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral214 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral241 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral248 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__FloatingPointLiteral__ValueAssignment_in_ruleFloatingPointLiteral274 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral301 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral308 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral334 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral361 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleCharacterLiteral368 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__CharacterLiteral__ValueAssignment_in_ruleCharacterLiteral394 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral421 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral428 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral454 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral481 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral488 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__NullLiteral__ValueAssignment_in_ruleNullLiteral514 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives550 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_rule__Literal__Alternatives567 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives584 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_rule__Literal__Alternatives601 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives618 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives635 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0667 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0684 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_OCTALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0701 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_BINARYINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0718 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0750 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0767 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_TRUE_in_rule__BooleanLiteral__ValueAlternatives_0799 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_FALSE_in_rule__BooleanLiteral__ValueAlternatives_0816 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Foo__Group__0__Impl_in_rule__Foo__Group__0846 = new BitSet(
      new long[] { 0x000000000000EFF0L });
   public static final BitSet FOLLOW_rule__Foo__Group__1_in_rule__Foo__Group__0849 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_57_in_rule__Foo__Group__0__Impl877 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Foo__Group__1__Impl_in_rule__Foo__Group__1908 = new BitSet(
      new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_rule__Foo__Group__2_in_rule__Foo__Group__1911 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleliteral_in_rule__Foo__Group__1__Impl938 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Foo__Group__2__Impl_in_rule__Foo__Group__2967 = new BitSet(
      new long[] { 0x0000000000001000L });
   public static final BitSet FOLLOW_rule__Foo__Group__3_in_rule__Foo__Group__2970 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_58_in_rule__Foo__Group__2__Impl998 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Foo__Group__3__Impl_in_rule__Foo__Group__31029 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Foo__Group__3__Impl1056 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAlternatives_0_in_rule__IntegerLiteral__ValueAssignment1098 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__FloatingPointLiteral__ValueAlternatives_0_in_rule__FloatingPointLiteral__ValueAssignment1131 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment1164 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_CHARACTER_in_rule__CharacterLiteral__ValueAssignment1197 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment1228 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_NULL_in_rule__NullLiteral__ValueAssignment1259 = new BitSet(
      new long[] { 0x0000000000000002L });

}