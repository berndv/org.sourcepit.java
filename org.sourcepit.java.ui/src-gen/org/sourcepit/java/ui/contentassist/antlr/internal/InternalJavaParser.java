
package org.sourcepit.java.ui.contentassist.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.sourcepit.java.services.JavaGrammarAccess;

@SuppressWarnings("all")
public class InternalJavaParser extends AbstractInternalContentAssistParser {
   public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>",
      "RULE_DECIMALINTEGERLITERAL", "RULE_HEXINTEGERLITERAL", "RULE_OCTALINTEGERLITERAL", "RULE_BINARYINTEGERLITERAL",
      "RULE_DECIMALFLOATINGPOINTLITERAL", "RULE_HEXADECIMALFLOATINGPOINTLITERAL", "RULE_TRUE", "RULE_FALSE",
      "RULE_CHARACTER", "RULE_STRING", "RULE_NULL", "RULE_DECIMALNUMERAL", "RULE_INTEGERTYPESUFFIX", "RULE_HEXNUMERAL",
      "RULE_OCTALNUMERAL", "RULE_BINARYNUMERAL", "RULE_NONZERODIGIT", "RULE_DIGITS", "RULE_UNDERSCORES", "RULE_DIGIT",
      "RULE_DIGITSANDUNDERSCORES", "RULE_DIGITORUNDERSCORE", "RULE_HEXDIGITS", "RULE_HEXDIGIT",
      "RULE_HEXDIGITSANDUNDERSCORES", "RULE_HEXDIGITORUNDERSCORE", "RULE_OCTALDIGITS", "RULE_OCTALDIGIT",
      "RULE_OCTALDIGITSANDUNDERSCORES", "RULE_OCTALDIGITORUNDERSCORE", "RULE_BINARYDIGITS", "RULE_BINARYDIGIT",
      "RULE_BINARYDIGITSANDUNDERSCORES", "RULE_BINARYDIGITORUNDERSCORE", "RULE_EXPONENTPART", "RULE_FLOATTYPESUFFIX",
      "RULE_EXPONENTINDICATOR", "RULE_SIGNEDINTEGER", "RULE_SIGN", "RULE_HEXSIGNIFICAND", "RULE_BINARYEXPONENT",
      "RULE_BINARYEXPONENTINDICATOR", "RULE_ESCAPESEQUENCE", "RULE_UNICODEESCAPE", "RULE_OCTALESCAPE",
      "RULE_ZEROTOTHREE", "RULE_UNICODEMARKER", "RULE_JAVALETTER", "RULE_JAVALETTERORDIGIT", "RULE_IDENTIFIER",
      "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS" };
   public static final int RULE_JAVALETTER = 51;
   public static final int RULE_JAVALETTERORDIGIT = 52;
   public static final int RULE_CHARACTER = 12;
   public static final int RULE_HEXDIGITORUNDERSCORE = 29;
   public static final int RULE_SIGN = 42;
   public static final int RULE_BINARYDIGITS = 34;
   public static final int RULE_OCTALINTEGERLITERAL = 6;
   public static final int RULE_OCTALDIGITS = 30;
   public static final int RULE_HEXSIGNIFICAND = 43;
   public static final int RULE_DECIMALINTEGERLITERAL = 4;
   public static final int RULE_ESCAPESEQUENCE = 46;
   public static final int RULE_HEXINTEGERLITERAL = 5;
   public static final int RULE_UNDERSCORES = 22;
   public static final int RULE_NONZERODIGIT = 20;
   public static final int RULE_OCTALDIGITORUNDERSCORE = 33;
   public static final int RULE_HEXDIGIT = 27;
   public static final int RULE_UNICODEESCAPE = 47;
   public static final int RULE_OCTALNUMERAL = 18;
   public static final int RULE_ZEROTOTHREE = 49;
   public static final int RULE_DIGIT = 23;
   public static final int RULE_DECIMALNUMERAL = 15;
   public static final int RULE_BINARYNUMERAL = 19;
   public static final int RULE_DIGITORUNDERSCORE = 25;
   public static final int RULE_ML_COMMENT = 54;
   public static final int RULE_HEXDIGITSANDUNDERSCORES = 28;
   public static final int RULE_BINARYDIGITORUNDERSCORE = 37;
   public static final int RULE_UNICODEMARKER = 50;
   public static final int RULE_INTEGERTYPESUFFIX = 16;
   public static final int RULE_FALSE = 11;
   public static final int RULE_BINARYEXPONENT = 44;
   public static final int RULE_DIGITSANDUNDERSCORES = 24;
   public static final int RULE_IDENTIFIER = 53;
   public static final int RULE_DECIMALFLOATINGPOINTLITERAL = 8;
   public static final int RULE_STRING = 13;
   public static final int RULE_FLOATTYPESUFFIX = 39;
   public static final int RULE_BINARYINTEGERLITERAL = 7;
   public static final int RULE_NULL = 14;
   public static final int RULE_DIGITS = 21;
   public static final int RULE_SL_COMMENT = 55;
   public static final int RULE_HEXADECIMALFLOATINGPOINTLITERAL = 9;
   public static final int RULE_TRUE = 10;
   public static final int EOF = -1;
   public static final int RULE_HEXNUMERAL = 17;
   public static final int RULE_WS = 56;
   public static final int RULE_OCTALDIGIT = 31;
   public static final int RULE_SIGNEDINTEGER = 41;
   public static final int RULE_HEXDIGITS = 26;
   public static final int RULE_BINARYEXPONENTINDICATOR = 45;
   public static final int RULE_OCTALDIGITSANDUNDERSCORES = 32;
   public static final int RULE_OCTALESCAPE = 48;
   public static final int RULE_BINARYDIGITSANDUNDERSCORES = 36;
   public static final int RULE_EXPONENTINDICATOR = 40;
   public static final int RULE_BINARYDIGIT = 35;
   public static final int RULE_EXPONENTPART = 38;

   // delegates
   // delegators


   public InternalJavaParser(TokenStream input) {
      this(input, new RecognizerSharedState());
   }

   public InternalJavaParser(TokenStream input, RecognizerSharedState state) {
      super(input, state);

   }


   public String[] getTokenNames() {
      return InternalJavaParser.tokenNames;
   }

   public String getGrammarFileName() {
      return "../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g";
   }


   private JavaGrammarAccess grammarAccess;

   public void setGrammarAccess(JavaGrammarAccess grammarAccess) {
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


   // $ANTLR start "entryRuleModel"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:60:1:
   // entryRuleModel : ruleModel EOF ;
   public final void entryRuleModel() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:61:1: (
         // ruleModel EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:62:1:
         // ruleModel EOF
         {
            before(grammarAccess.getModelRule());
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

            after(grammarAccess.getModelRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleModel68);

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

   // $ANTLR end "entryRuleModel"


   // $ANTLR start "ruleModel"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:69:1: ruleModel
   // : ( ( rule__Model__LiteralsAssignment )* ) ;
   public final void ruleModel() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:73:2: ( (
         // ( rule__Model__LiteralsAssignment )* ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:74:1: ( (
         // rule__Model__LiteralsAssignment )* )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:74:1:
            // ( ( rule__Model__LiteralsAssignment )* )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:75:1:
            // ( rule__Model__LiteralsAssignment )*
            {
               before(grammarAccess.getModelAccess().getLiteralsAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:76:1:
               // ( rule__Model__LiteralsAssignment )*
               loop1 : do {
                  int alt1 = 2;
                  int LA1_0 = input.LA(1);

                  if (((LA1_0 >= RULE_DECIMALINTEGERLITERAL && LA1_0 <= RULE_NULL))) {
                     alt1 = 1;
                  }


                  switch (alt1) {
                     case 1 :
                     // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:76:2:
                     // rule__Model__LiteralsAssignment
                     {
                        pushFollow(FOLLOW_rule__Model__LiteralsAssignment_in_ruleModel94);
                        rule__Model__LiteralsAssignment();

                        state._fsp--;


                     }
                        break;

                     default :
                        break loop1;
                  }
               }
               while (true);

               after(grammarAccess.getModelAccess().getLiteralsAssignment());

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

   // $ANTLR end "ruleModel"


   // $ANTLR start "entryRuleLiteral"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:88:1:
   // entryRuleLiteral : ruleLiteral EOF ;
   public final void entryRuleLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:89:1: (
         // ruleLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:90:1:
         // ruleLiteral EOF
         {
            before(grammarAccess.getLiteralRule());
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral122);
            ruleLiteral();

            state._fsp--;

            after(grammarAccess.getLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleLiteral129);

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

   // $ANTLR end "entryRuleLiteral"


   // $ANTLR start "ruleLiteral"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:97:1:
   // ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
   public final void ruleLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:101:2: (
         // ( ( rule__Literal__Alternatives ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:102:1: (
         // ( rule__Literal__Alternatives ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:102:1:
            // ( ( rule__Literal__Alternatives ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:103:1:
            // ( rule__Literal__Alternatives )
            {
               before(grammarAccess.getLiteralAccess().getAlternatives());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:104:1:
               // ( rule__Literal__Alternatives )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:104:2:
               // rule__Literal__Alternatives
               {
                  pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral155);
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

   // $ANTLR end "ruleLiteral"


   // $ANTLR start "entryRuleIntegerLiteral"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:116:1:
   // entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
   public final void entryRuleIntegerLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:117:1: (
         // ruleIntegerLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:118:1:
         // ruleIntegerLiteral EOF
         {
            before(grammarAccess.getIntegerLiteralRule());
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral182);
            ruleIntegerLiteral();

            state._fsp--;

            after(grammarAccess.getIntegerLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleIntegerLiteral189);

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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:125:1:
   // ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
   public final void ruleIntegerLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:129:2: (
         // ( ( rule__IntegerLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:130:1: (
         // ( rule__IntegerLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:130:1:
            // ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:131:1:
            // ( rule__IntegerLiteral__ValueAssignment )
            {
               before(grammarAccess.getIntegerLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:132:1:
               // ( rule__IntegerLiteral__ValueAssignment )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:132:2:
               // rule__IntegerLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral215);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:144:1:
   // entryRuleFloatingPointLiteral : ruleFloatingPointLiteral EOF ;
   public final void entryRuleFloatingPointLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:145:1: (
         // ruleFloatingPointLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:146:1:
         // ruleFloatingPointLiteral EOF
         {
            before(grammarAccess.getFloatingPointLiteralRule());
            pushFollow(FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral242);
            ruleFloatingPointLiteral();

            state._fsp--;

            after(grammarAccess.getFloatingPointLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleFloatingPointLiteral249);

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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:153:1:
   // ruleFloatingPointLiteral : ( ( rule__FloatingPointLiteral__ValueAssignment ) ) ;
   public final void ruleFloatingPointLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:157:2: (
         // ( ( rule__FloatingPointLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:158:1: (
         // ( rule__FloatingPointLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:158:1:
            // ( ( rule__FloatingPointLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:159:1:
            // ( rule__FloatingPointLiteral__ValueAssignment )
            {
               before(grammarAccess.getFloatingPointLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:160:1:
               // ( rule__FloatingPointLiteral__ValueAssignment )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:160:2:
               // rule__FloatingPointLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__FloatingPointLiteral__ValueAssignment_in_ruleFloatingPointLiteral275);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:172:1:
   // entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
   public final void entryRuleBooleanLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:173:1: (
         // ruleBooleanLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:174:1:
         // ruleBooleanLiteral EOF
         {
            before(grammarAccess.getBooleanLiteralRule());
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral302);
            ruleBooleanLiteral();

            state._fsp--;

            after(grammarAccess.getBooleanLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanLiteral309);

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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:181:1:
   // ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
   public final void ruleBooleanLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:185:2: (
         // ( ( rule__BooleanLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:186:1: (
         // ( rule__BooleanLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:186:1:
            // ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:187:1:
            // ( rule__BooleanLiteral__ValueAssignment )
            {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:188:1:
               // ( rule__BooleanLiteral__ValueAssignment )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:188:2:
               // rule__BooleanLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral335);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:200:1:
   // entryRuleCharacterLiteral : ruleCharacterLiteral EOF ;
   public final void entryRuleCharacterLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:201:1: (
         // ruleCharacterLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:202:1:
         // ruleCharacterLiteral EOF
         {
            before(grammarAccess.getCharacterLiteralRule());
            pushFollow(FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral362);
            ruleCharacterLiteral();

            state._fsp--;

            after(grammarAccess.getCharacterLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleCharacterLiteral369);

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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:209:1:
   // ruleCharacterLiteral : ( ( rule__CharacterLiteral__ValueAssignment ) ) ;
   public final void ruleCharacterLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:213:2: (
         // ( ( rule__CharacterLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:214:1: (
         // ( rule__CharacterLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:214:1:
            // ( ( rule__CharacterLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:215:1:
            // ( rule__CharacterLiteral__ValueAssignment )
            {
               before(grammarAccess.getCharacterLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:216:1:
               // ( rule__CharacterLiteral__ValueAssignment )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:216:2:
               // rule__CharacterLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__CharacterLiteral__ValueAssignment_in_ruleCharacterLiteral395);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:228:1:
   // entryRuleStringLiteral : ruleStringLiteral EOF ;
   public final void entryRuleStringLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:229:1: (
         // ruleStringLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:230:1:
         // ruleStringLiteral EOF
         {
            before(grammarAccess.getStringLiteralRule());
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral422);
            ruleStringLiteral();

            state._fsp--;

            after(grammarAccess.getStringLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleStringLiteral429);

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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:237:1:
   // ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
   public final void ruleStringLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:241:2: (
         // ( ( rule__StringLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:242:1: (
         // ( rule__StringLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:242:1:
            // ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:243:1:
            // ( rule__StringLiteral__ValueAssignment )
            {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:244:1:
               // ( rule__StringLiteral__ValueAssignment )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:244:2:
               // rule__StringLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral455);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:256:1:
   // entryRuleNullLiteral : ruleNullLiteral EOF ;
   public final void entryRuleNullLiteral() throws RecognitionException {
      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:257:1: (
         // ruleNullLiteral EOF )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:258:1:
         // ruleNullLiteral EOF
         {
            before(grammarAccess.getNullLiteralRule());
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral482);
            ruleNullLiteral();

            state._fsp--;

            after(grammarAccess.getNullLiteralRule());
            match(input, EOF, FOLLOW_EOF_in_entryRuleNullLiteral489);

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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:265:1:
   // ruleNullLiteral : ( ( rule__NullLiteral__ValueAssignment ) ) ;
   public final void ruleNullLiteral() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:269:2: (
         // ( ( rule__NullLiteral__ValueAssignment ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:270:1: (
         // ( rule__NullLiteral__ValueAssignment ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:270:1:
            // ( ( rule__NullLiteral__ValueAssignment ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:271:1:
            // ( rule__NullLiteral__ValueAssignment )
            {
               before(grammarAccess.getNullLiteralAccess().getValueAssignment());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:272:1:
               // ( rule__NullLiteral__ValueAssignment )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:272:2:
               // rule__NullLiteral__ValueAssignment
               {
                  pushFollow(FOLLOW_rule__NullLiteral__ValueAssignment_in_ruleNullLiteral515);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:284:1:
   // rule__Literal__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleFloatingPointLiteral ) | ( ruleBooleanLiteral ) | (
   // ruleCharacterLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) );
   public final void rule__Literal__Alternatives() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:288:1: (
         // ( ruleIntegerLiteral ) | ( ruleFloatingPointLiteral ) | ( ruleBooleanLiteral ) | ( ruleCharacterLiteral ) |
         // ( ruleStringLiteral ) | ( ruleNullLiteral ) )
         int alt2 = 6;
         switch (input.LA(1)) {
            case RULE_DECIMALINTEGERLITERAL :
            case RULE_HEXINTEGERLITERAL :
            case RULE_OCTALINTEGERLITERAL :
            case RULE_BINARYINTEGERLITERAL : {
               alt2 = 1;
            }
               break;
            case RULE_DECIMALFLOATINGPOINTLITERAL :
            case RULE_HEXADECIMALFLOATINGPOINTLITERAL : {
               alt2 = 2;
            }
               break;
            case RULE_TRUE :
            case RULE_FALSE : {
               alt2 = 3;
            }
               break;
            case RULE_CHARACTER : {
               alt2 = 4;
            }
               break;
            case RULE_STRING : {
               alt2 = 5;
            }
               break;
            case RULE_NULL : {
               alt2 = 6;
            }
               break;
            default :
               NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

               throw nvae;
         }

         switch (alt2) {
            case 1 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:289:1:
            // ( ruleIntegerLiteral )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:289:1:
               // ( ruleIntegerLiteral )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:290:1:
               // ruleIntegerLiteral
               {
                  before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());
                  pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives551);
                  ruleIntegerLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:295:6:
            // ( ruleFloatingPointLiteral )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:295:6:
               // ( ruleFloatingPointLiteral )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:296:1:
               // ruleFloatingPointLiteral
               {
                  before(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1());
                  pushFollow(FOLLOW_ruleFloatingPointLiteral_in_rule__Literal__Alternatives568);
                  ruleFloatingPointLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1());

               }


            }
               break;
            case 3 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:301:6:
            // ( ruleBooleanLiteral )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:301:6:
               // ( ruleBooleanLiteral )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:302:1:
               // ruleBooleanLiteral
               {
                  before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                  pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives585);
                  ruleBooleanLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());

               }


            }
               break;
            case 4 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:307:6:
            // ( ruleCharacterLiteral )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:307:6:
               // ( ruleCharacterLiteral )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:308:1:
               // ruleCharacterLiteral
               {
                  before(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3());
                  pushFollow(FOLLOW_ruleCharacterLiteral_in_rule__Literal__Alternatives602);
                  ruleCharacterLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3());

               }


            }
               break;
            case 5 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:313:6:
            // ( ruleStringLiteral )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:313:6:
               // ( ruleStringLiteral )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:314:1:
               // ruleStringLiteral
               {
                  before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());
                  pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives619);
                  ruleStringLiteral();

                  state._fsp--;

                  after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());

               }


            }
               break;
            case 6 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:319:6:
            // ( ruleNullLiteral )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:319:6:
               // ( ruleNullLiteral )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:320:1:
               // ruleNullLiteral
               {
                  before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5());
                  pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives636);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:330:1:
   // rule__IntegerLiteral__ValueAlternatives_0 : ( ( RULE_DECIMALINTEGERLITERAL ) | ( RULE_HEXINTEGERLITERAL ) | (
   // RULE_OCTALINTEGERLITERAL ) | ( RULE_BINARYINTEGERLITERAL ) );
   public final void rule__IntegerLiteral__ValueAlternatives_0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:334:1: (
         // ( RULE_DECIMALINTEGERLITERAL ) | ( RULE_HEXINTEGERLITERAL ) | ( RULE_OCTALINTEGERLITERAL ) | (
         // RULE_BINARYINTEGERLITERAL ) )
         int alt3 = 4;
         switch (input.LA(1)) {
            case RULE_DECIMALINTEGERLITERAL : {
               alt3 = 1;
            }
               break;
            case RULE_HEXINTEGERLITERAL : {
               alt3 = 2;
            }
               break;
            case RULE_OCTALINTEGERLITERAL : {
               alt3 = 3;
            }
               break;
            case RULE_BINARYINTEGERLITERAL : {
               alt3 = 4;
            }
               break;
            default :
               NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

               throw nvae;
         }

         switch (alt3) {
            case 1 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:335:1:
            // ( RULE_DECIMALINTEGERLITERAL )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:335:1:
               // ( RULE_DECIMALINTEGERLITERAL )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:336:1:
               // RULE_DECIMALINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueDecimalIntegerLiteralTerminalRuleCall_0_0());
                  match(input, RULE_DECIMALINTEGERLITERAL,
                     FOLLOW_RULE_DECIMALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0668);
                  after(grammarAccess.getIntegerLiteralAccess().getValueDecimalIntegerLiteralTerminalRuleCall_0_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:341:6:
            // ( RULE_HEXINTEGERLITERAL )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:341:6:
               // ( RULE_HEXINTEGERLITERAL )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:342:1:
               // RULE_HEXINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueHexIntegerLiteralTerminalRuleCall_0_1());
                  match(input, RULE_HEXINTEGERLITERAL,
                     FOLLOW_RULE_HEXINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0685);
                  after(grammarAccess.getIntegerLiteralAccess().getValueHexIntegerLiteralTerminalRuleCall_0_1());

               }


            }
               break;
            case 3 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:347:6:
            // ( RULE_OCTALINTEGERLITERAL )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:347:6:
               // ( RULE_OCTALINTEGERLITERAL )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:348:1:
               // RULE_OCTALINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueOctalIntegerLiteralTerminalRuleCall_0_2());
                  match(input, RULE_OCTALINTEGERLITERAL,
                     FOLLOW_RULE_OCTALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0702);
                  after(grammarAccess.getIntegerLiteralAccess().getValueOctalIntegerLiteralTerminalRuleCall_0_2());

               }


            }
               break;
            case 4 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:353:6:
            // ( RULE_BINARYINTEGERLITERAL )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:353:6:
               // ( RULE_BINARYINTEGERLITERAL )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:354:1:
               // RULE_BINARYINTEGERLITERAL
               {
                  before(grammarAccess.getIntegerLiteralAccess().getValueBinaryIntegerLiteralTerminalRuleCall_0_3());
                  match(input, RULE_BINARYINTEGERLITERAL,
                     FOLLOW_RULE_BINARYINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0719);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:364:1:
   // rule__FloatingPointLiteral__ValueAlternatives_0 : ( ( RULE_DECIMALFLOATINGPOINTLITERAL ) | (
   // RULE_HEXADECIMALFLOATINGPOINTLITERAL ) );
   public final void rule__FloatingPointLiteral__ValueAlternatives_0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:368:1: (
         // ( RULE_DECIMALFLOATINGPOINTLITERAL ) | ( RULE_HEXADECIMALFLOATINGPOINTLITERAL ) )
         int alt4 = 2;
         int LA4_0 = input.LA(1);

         if ((LA4_0 == RULE_DECIMALFLOATINGPOINTLITERAL)) {
            alt4 = 1;
         }
         else if ((LA4_0 == RULE_HEXADECIMALFLOATINGPOINTLITERAL)) {
            alt4 = 2;
         }
         else {
            NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

            throw nvae;
         }
         switch (alt4) {
            case 1 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:369:1:
            // ( RULE_DECIMALFLOATINGPOINTLITERAL )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:369:1:
               // ( RULE_DECIMALFLOATINGPOINTLITERAL )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:370:1:
               // RULE_DECIMALFLOATINGPOINTLITERAL
               {
                  before(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0());
                  match(input, RULE_DECIMALFLOATINGPOINTLITERAL,
                     FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0751);
                  after(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:375:6:
            // ( RULE_HEXADECIMALFLOATINGPOINTLITERAL )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:375:6:
               // ( RULE_HEXADECIMALFLOATINGPOINTLITERAL )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:376:1:
               // RULE_HEXADECIMALFLOATINGPOINTLITERAL
               {
                  before(grammarAccess.getFloatingPointLiteralAccess()
                     .getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1());
                  match(input, RULE_HEXADECIMALFLOATINGPOINTLITERAL,
                     FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0768);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:386:1:
   // rule__BooleanLiteral__ValueAlternatives_0 : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
   public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:390:1: (
         // ( RULE_TRUE ) | ( RULE_FALSE ) )
         int alt5 = 2;
         int LA5_0 = input.LA(1);

         if ((LA5_0 == RULE_TRUE)) {
            alt5 = 1;
         }
         else if ((LA5_0 == RULE_FALSE)) {
            alt5 = 2;
         }
         else {
            NoViableAltException nvae = new NoViableAltException("", 5, 0, input);

            throw nvae;
         }
         switch (alt5) {
            case 1 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:391:1:
            // ( RULE_TRUE )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:391:1:
               // ( RULE_TRUE )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:392:1:
               // RULE_TRUE
               {
                  before(grammarAccess.getBooleanLiteralAccess().getValueTRUETerminalRuleCall_0_0());
                  match(input, RULE_TRUE, FOLLOW_RULE_TRUE_in_rule__BooleanLiteral__ValueAlternatives_0800);
                  after(grammarAccess.getBooleanLiteralAccess().getValueTRUETerminalRuleCall_0_0());

               }


            }
               break;
            case 2 :
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:397:6:
            // ( RULE_FALSE )
            {
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:397:6:
               // ( RULE_FALSE )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:398:1:
               // RULE_FALSE
               {
                  before(grammarAccess.getBooleanLiteralAccess().getValueFALSETerminalRuleCall_0_1());
                  match(input, RULE_FALSE, FOLLOW_RULE_FALSE_in_rule__BooleanLiteral__ValueAlternatives_0817);
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


   // $ANTLR start "rule__Model__LiteralsAssignment"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:411:1:
   // rule__Model__LiteralsAssignment : ( ruleLiteral ) ;
   public final void rule__Model__LiteralsAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:415:1: (
         // ( ruleLiteral ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:416:1: (
         // ruleLiteral )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:416:1:
            // ( ruleLiteral )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:417:1:
            // ruleLiteral
            {
               before(grammarAccess.getModelAccess().getLiteralsLiteralParserRuleCall_0());
               pushFollow(FOLLOW_ruleLiteral_in_rule__Model__LiteralsAssignment852);
               ruleLiteral();

               state._fsp--;

               after(grammarAccess.getModelAccess().getLiteralsLiteralParserRuleCall_0());

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

   // $ANTLR end "rule__Model__LiteralsAssignment"


   // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:426:1:
   // rule__IntegerLiteral__ValueAssignment : ( ( rule__IntegerLiteral__ValueAlternatives_0 ) ) ;
   public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:430:1: (
         // ( ( rule__IntegerLiteral__ValueAlternatives_0 ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:431:1: (
         // ( rule__IntegerLiteral__ValueAlternatives_0 ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:431:1:
            // ( ( rule__IntegerLiteral__ValueAlternatives_0 ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:432:1:
            // ( rule__IntegerLiteral__ValueAlternatives_0 )
            {
               before(grammarAccess.getIntegerLiteralAccess().getValueAlternatives_0());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:433:1:
               // ( rule__IntegerLiteral__ValueAlternatives_0 )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:433:2:
               // rule__IntegerLiteral__ValueAlternatives_0
               {
                  pushFollow(FOLLOW_rule__IntegerLiteral__ValueAlternatives_0_in_rule__IntegerLiteral__ValueAssignment883);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:442:1:
   // rule__FloatingPointLiteral__ValueAssignment : ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) ) ;
   public final void rule__FloatingPointLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:446:1: (
         // ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:447:1: (
         // ( rule__FloatingPointLiteral__ValueAlternatives_0 ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:447:1:
            // ( ( rule__FloatingPointLiteral__ValueAlternatives_0 ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:448:1:
            // ( rule__FloatingPointLiteral__ValueAlternatives_0 )
            {
               before(grammarAccess.getFloatingPointLiteralAccess().getValueAlternatives_0());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:449:1:
               // ( rule__FloatingPointLiteral__ValueAlternatives_0 )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:449:2:
               // rule__FloatingPointLiteral__ValueAlternatives_0
               {
                  pushFollow(FOLLOW_rule__FloatingPointLiteral__ValueAlternatives_0_in_rule__FloatingPointLiteral__ValueAssignment916);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:458:1:
   // rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
   public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:462:1: (
         // ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:463:1: (
         // ( rule__BooleanLiteral__ValueAlternatives_0 ) )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:463:1:
            // ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:464:1:
            // ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0());
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:465:1:
               // ( rule__BooleanLiteral__ValueAlternatives_0 )
               // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:465:2:
               // rule__BooleanLiteral__ValueAlternatives_0
               {
                  pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment949);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:474:1:
   // rule__CharacterLiteral__ValueAssignment : ( RULE_CHARACTER ) ;
   public final void rule__CharacterLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:478:1: (
         // ( RULE_CHARACTER ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:479:1: (
         // RULE_CHARACTER )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:479:1:
            // ( RULE_CHARACTER )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:480:1:
            // RULE_CHARACTER
            {
               before(grammarAccess.getCharacterLiteralAccess().getValueCHARACTERTerminalRuleCall_0());
               match(input, RULE_CHARACTER, FOLLOW_RULE_CHARACTER_in_rule__CharacterLiteral__ValueAssignment982);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:489:1:
   // rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
   public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:493:1: (
         // ( RULE_STRING ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:494:1: (
         // RULE_STRING )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:494:1:
            // ( RULE_STRING )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:495:1:
            // RULE_STRING
            {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
               match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment1013);
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
   // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:504:1:
   // rule__NullLiteral__ValueAssignment : ( RULE_NULL ) ;
   public final void rule__NullLiteral__ValueAssignment() throws RecognitionException {

      int stackSize = keepStackSize();

      try {
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:508:1: (
         // ( RULE_NULL ) )
         // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:509:1: (
         // RULE_NULL )
         {
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:509:1:
            // ( RULE_NULL )
            // ../org.sourcepit.java.ui/src-gen/org/sourcepit/java/ui/contentassist/antlr/internal/InternalJava.g:510:1:
            // RULE_NULL
            {
               before(grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0());
               match(input, RULE_NULL, FOLLOW_RULE_NULL_in_rule__NullLiteral__ValueAssignment1044);
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


   public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Model__LiteralsAssignment_in_ruleModel94 = new BitSet(
      new long[] { 0x0000000000007FF2L });
   public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral122 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleLiteral129 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral155 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral182 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral189 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral215 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral242 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral249 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__FloatingPointLiteral__ValueAssignment_in_ruleFloatingPointLiteral275 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral302 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral309 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral335 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral362 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleCharacterLiteral369 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__CharacterLiteral__ValueAssignment_in_ruleCharacterLiteral395 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral422 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral429 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral455 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral482 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral489 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__NullLiteral__ValueAssignment_in_ruleNullLiteral515 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives551 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_rule__Literal__Alternatives568 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives585 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_rule__Literal__Alternatives602 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives619 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives636 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0668 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0685 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_OCTALINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0702 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_BINARYINTEGERLITERAL_in_rule__IntegerLiteral__ValueAlternatives_0719 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0751 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_rule__FloatingPointLiteral__ValueAlternatives_0768 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_TRUE_in_rule__BooleanLiteral__ValueAlternatives_0800 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_FALSE_in_rule__BooleanLiteral__ValueAlternatives_0817 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleLiteral_in_rule__Model__LiteralsAssignment852 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAlternatives_0_in_rule__IntegerLiteral__ValueAssignment883 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__FloatingPointLiteral__ValueAlternatives_0_in_rule__FloatingPointLiteral__ValueAssignment916 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment949 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_CHARACTER_in_rule__CharacterLiteral__ValueAssignment982 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment1013 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_NULL_in_rule__NullLiteral__ValueAssignment1044 = new BitSet(
      new long[] { 0x0000000000000002L });

}