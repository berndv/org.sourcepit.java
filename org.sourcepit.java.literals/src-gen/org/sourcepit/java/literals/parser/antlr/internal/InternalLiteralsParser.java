
package org.sourcepit.java.literals.parser.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

@SuppressWarnings("all")
public class InternalLiteralsParser extends AbstractInternalAntlrParser {
   public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER",
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
      "RULE_ZEROTOTHREE", "RULE_UNICODEMARKER", "RULE_JAVALETTER", "RULE_JAVALETTERORDIGIT", "RULE_ML_COMMENT",
      "RULE_SL_COMMENT", "RULE_WS", "'@'", "'public'" };
   public static final int RULE_JAVALETTER = 52;
   public static final int RULE_JAVALETTERORDIGIT = 53;
   public static final int RULE_CHARACTER = 13;
   public static final int RULE_HEXDIGITORUNDERSCORE = 30;
   public static final int RULE_SIGN = 43;
   public static final int RULE_BINARYDIGITS = 35;
   public static final int RULE_OCTALINTEGERLITERAL = 7;
   public static final int RULE_OCTALDIGITS = 31;
   public static final int RULE_HEXSIGNIFICAND = 44;
   public static final int RULE_DECIMALINTEGERLITERAL = 5;
   public static final int RULE_ESCAPESEQUENCE = 47;
   public static final int T__57 = 57;
   public static final int RULE_HEXINTEGERLITERAL = 6;
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
   public static final int RULE_FALSE = 12;
   public static final int RULE_BINARYEXPONENT = 45;
   public static final int RULE_DIGITSANDUNDERSCORES = 25;
   public static final int RULE_IDENTIFIER = 4;
   public static final int RULE_DECIMALFLOATINGPOINTLITERAL = 9;
   public static final int RULE_STRING = 14;
   public static final int RULE_FLOATTYPESUFFIX = 40;
   public static final int RULE_BINARYINTEGERLITERAL = 8;
   public static final int RULE_NULL = 15;
   public static final int RULE_DIGITS = 22;
   public static final int RULE_SL_COMMENT = 55;
   public static final int RULE_HEXADECIMALFLOATINGPOINTLITERAL = 10;
   public static final int RULE_TRUE = 11;
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
      return "../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g";
   }


   /*
    * This grammar contains a lot of empty actions to work around a bug in ANTLR.
    * Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

   private LiteralsGrammarAccess grammarAccess;

   public InternalLiteralsParser(TokenStream input, LiteralsGrammarAccess grammarAccess) {
      this(input);
      this.grammarAccess = grammarAccess;
      registerRules(grammarAccess.getGrammar());
   }

   @Override
   protected String getFirstRuleName() {
      return "Foo";
   }

   @Override
   protected LiteralsGrammarAccess getGrammarAccess() {
      return grammarAccess;
   }


   // $ANTLR start "entryRuleFoo"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:73:1:
   // entryRuleFoo returns [EObject current=null] : iv_ruleFoo= ruleFoo EOF ;
   public final EObject entryRuleFoo() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleFoo = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:74:2:
         // (iv_ruleFoo= ruleFoo EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:75:2:
         // iv_ruleFoo= ruleFoo EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getFooRule());
            }
            pushFollow(FOLLOW_ruleFoo_in_entryRuleFoo81);
            iv_ruleFoo = ruleFoo();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleFoo;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleFoo91);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleFoo"


   // $ANTLR start "ruleFoo"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:82:1:
   // ruleFoo returns [EObject current=null] : (otherlv_0= '@' this_literal_1= ruleliteral otherlv_2= 'public'
   // this_Identifier_3= RULE_IDENTIFIER ) ;
   public final EObject ruleFoo() throws RecognitionException {
      EObject current = null;

      Token otherlv_0 = null;
      Token otherlv_2 = null;
      Token this_Identifier_3 = null;
      EObject this_literal_1 = null;


      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:85:28:
         // ( (otherlv_0= '@' this_literal_1= ruleliteral otherlv_2= 'public' this_Identifier_3= RULE_IDENTIFIER ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:86:1:
         // (otherlv_0= '@' this_literal_1= ruleliteral otherlv_2= 'public' this_Identifier_3= RULE_IDENTIFIER )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:86:1:
            // (otherlv_0= '@' this_literal_1= ruleliteral otherlv_2= 'public' this_Identifier_3= RULE_IDENTIFIER )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:86:3:
            // otherlv_0= '@' this_literal_1= ruleliteral otherlv_2= 'public' this_Identifier_3= RULE_IDENTIFIER
            {
               otherlv_0 = (Token) match(input, 57, FOLLOW_57_in_ruleFoo128);
               if (state.failed)
                  return current;
               if (state.backtracking == 0) {

                  newLeafNode(otherlv_0, grammarAccess.getFooAccess().getCommercialAtKeyword_0());

               }
               if (state.backtracking == 0) {

                  /* */

               }
               if (state.backtracking == 0) {

                  newCompositeNode(grammarAccess.getFooAccess().getLiteralParserRuleCall_1());

               }
               pushFollow(FOLLOW_ruleliteral_in_ruleFoo153);
               this_literal_1 = ruleliteral();

               state._fsp--;
               if (state.failed)
                  return current;
               if (state.backtracking == 0) {

                  current = this_literal_1;
                  afterParserOrEnumRuleCall();

               }
               otherlv_2 = (Token) match(input, 58, FOLLOW_58_in_ruleFoo164);
               if (state.failed)
                  return current;
               if (state.backtracking == 0) {

                  newLeafNode(otherlv_2, grammarAccess.getFooAccess().getPublicKeyword_2());

               }
               this_Identifier_3 = (Token) match(input, RULE_IDENTIFIER, FOLLOW_RULE_IDENTIFIER_in_ruleFoo175);
               if (state.failed)
                  return current;
               if (state.backtracking == 0) {

                  newLeafNode(this_Identifier_3, grammarAccess.getFooAccess().getIdentifierTerminalRuleCall_3());

               }

            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleFoo"


   // $ANTLR start "entryRuleliteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:118:1:
   // entryRuleliteral returns [EObject current=null] : iv_ruleliteral= ruleliteral EOF ;
   public final EObject entryRuleliteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleliteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:119:2:
         // (iv_ruleliteral= ruleliteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:120:2:
         // iv_ruleliteral= ruleliteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getLiteralRule());
            }
            pushFollow(FOLLOW_ruleliteral_in_entryRuleliteral210);
            iv_ruleliteral = ruleliteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleliteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleliteral220);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleliteral"


   // $ANTLR start "ruleliteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:127:1:
   // ruleliteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral |
   // this_FloatingPointLiteral_1= ruleFloatingPointLiteral | this_BooleanLiteral_2= ruleBooleanLiteral |
   // this_CharacterLiteral_3= ruleCharacterLiteral | this_StringLiteral_4= ruleStringLiteral | this_NullLiteral_5=
   // ruleNullLiteral ) ;
   public final EObject ruleliteral() throws RecognitionException {
      EObject current = null;

      EObject this_IntegerLiteral_0 = null;

      EObject this_FloatingPointLiteral_1 = null;

      EObject this_BooleanLiteral_2 = null;

      EObject this_CharacterLiteral_3 = null;

      EObject this_StringLiteral_4 = null;

      EObject this_NullLiteral_5 = null;


      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:130:28:
         // ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatingPointLiteral_1= ruleFloatingPointLiteral |
         // this_BooleanLiteral_2= ruleBooleanLiteral | this_CharacterLiteral_3= ruleCharacterLiteral |
         // this_StringLiteral_4= ruleStringLiteral | this_NullLiteral_5= ruleNullLiteral ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:131:1:
         // (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatingPointLiteral_1= ruleFloatingPointLiteral |
         // this_BooleanLiteral_2= ruleBooleanLiteral | this_CharacterLiteral_3= ruleCharacterLiteral |
         // this_StringLiteral_4= ruleStringLiteral | this_NullLiteral_5= ruleNullLiteral )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:131:1:
            // (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatingPointLiteral_1= ruleFloatingPointLiteral |
            // this_BooleanLiteral_2= ruleBooleanLiteral | this_CharacterLiteral_3= ruleCharacterLiteral |
            // this_StringLiteral_4= ruleStringLiteral | this_NullLiteral_5= ruleNullLiteral )
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
                  if (state.backtracking > 0) {
                     state.failed = true;
                     return current;
                  }
                  NoViableAltException nvae = new NoViableAltException("", 1, 0, input);

                  throw nvae;
            }

            switch (alt1) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:132:2:
               // this_IntegerLiteral_0= ruleIntegerLiteral
               {
                  if (state.backtracking == 0) {

                     /* */

                  }
                  if (state.backtracking == 0) {

                     newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());

                  }
                  pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleliteral270);
                  this_IntegerLiteral_0 = ruleIntegerLiteral();

                  state._fsp--;
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     current = this_IntegerLiteral_0;
                     afterParserOrEnumRuleCall();

                  }

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:145:2:
               // this_FloatingPointLiteral_1= ruleFloatingPointLiteral
               {
                  if (state.backtracking == 0) {

                     /* */

                  }
                  if (state.backtracking == 0) {

                     newCompositeNode(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1());

                  }
                  pushFollow(FOLLOW_ruleFloatingPointLiteral_in_ruleliteral300);
                  this_FloatingPointLiteral_1 = ruleFloatingPointLiteral();

                  state._fsp--;
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     current = this_FloatingPointLiteral_1;
                     afterParserOrEnumRuleCall();

                  }

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:158:2:
               // this_BooleanLiteral_2= ruleBooleanLiteral
               {
                  if (state.backtracking == 0) {

                     /* */

                  }
                  if (state.backtracking == 0) {

                     newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());

                  }
                  pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleliteral330);
                  this_BooleanLiteral_2 = ruleBooleanLiteral();

                  state._fsp--;
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     current = this_BooleanLiteral_2;
                     afterParserOrEnumRuleCall();

                  }

               }
                  break;
               case 4 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:171:2:
               // this_CharacterLiteral_3= ruleCharacterLiteral
               {
                  if (state.backtracking == 0) {

                     /* */

                  }
                  if (state.backtracking == 0) {

                     newCompositeNode(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3());

                  }
                  pushFollow(FOLLOW_ruleCharacterLiteral_in_ruleliteral360);
                  this_CharacterLiteral_3 = ruleCharacterLiteral();

                  state._fsp--;
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     current = this_CharacterLiteral_3;
                     afterParserOrEnumRuleCall();

                  }

               }
                  break;
               case 5 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:184:2:
               // this_StringLiteral_4= ruleStringLiteral
               {
                  if (state.backtracking == 0) {

                     /* */

                  }
                  if (state.backtracking == 0) {

                     newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());

                  }
                  pushFollow(FOLLOW_ruleStringLiteral_in_ruleliteral390);
                  this_StringLiteral_4 = ruleStringLiteral();

                  state._fsp--;
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     current = this_StringLiteral_4;
                     afterParserOrEnumRuleCall();

                  }

               }
                  break;
               case 6 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:197:2:
               // this_NullLiteral_5= ruleNullLiteral
               {
                  if (state.backtracking == 0) {

                     /* */

                  }
                  if (state.backtracking == 0) {

                     newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5());

                  }
                  pushFollow(FOLLOW_ruleNullLiteral_in_ruleliteral420);
                  this_NullLiteral_5 = ruleNullLiteral();

                  state._fsp--;
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     current = this_NullLiteral_5;
                     afterParserOrEnumRuleCall();

                  }

               }
                  break;

            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleliteral"


   // $ANTLR start "entryRuleIntegerLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:216:1:
   // entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
   public final EObject entryRuleIntegerLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleIntegerLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:217:2:
         // (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:218:2:
         // iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule());
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral455);
            iv_ruleIntegerLiteral = ruleIntegerLiteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleIntegerLiteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleIntegerLiteral465);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleIntegerLiteral"


   // $ANTLR start "ruleIntegerLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:225:1:
   // ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2=
   // RULE_HEXINTEGERLITERAL | lv_value_0_3= RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) ) ;
   public final EObject ruleIntegerLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_1 = null;
      Token lv_value_0_2 = null;
      Token lv_value_0_3 = null;
      Token lv_value_0_4 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:228:28:
         // ( ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
         // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:229:1:
         // ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
         // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:229:1:
            // ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
            // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:230:1:
            // ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
            // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:230:1:
               // ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
               // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:231:1:
               // (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
               // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL )
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:231:1:
                  // (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
                  // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL )
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
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return current;
                        }
                        NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

                        throw nvae;
                  }

                  switch (alt2) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:232:3:
                     // lv_value_0_1= RULE_DECIMALINTEGERLITERAL
                     {
                        lv_value_0_1 = (Token) match(input, RULE_DECIMALINTEGERLITERAL,
                           FOLLOW_RULE_DECIMALINTEGERLITERAL_in_ruleIntegerLiteral508);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_1, grammarAccess.getIntegerLiteralAccess()
                              .getValueDecimalIntegerLiteralTerminalRuleCall_0_0());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getIntegerLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_1, "DecimalIntegerLiteral");

                        }

                     }
                        break;
                     case 2 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:247:8:
                     // lv_value_0_2= RULE_HEXINTEGERLITERAL
                     {
                        lv_value_0_2 = (Token) match(input, RULE_HEXINTEGERLITERAL,
                           FOLLOW_RULE_HEXINTEGERLITERAL_in_ruleIntegerLiteral528);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_2, grammarAccess.getIntegerLiteralAccess()
                              .getValueHexIntegerLiteralTerminalRuleCall_0_1());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getIntegerLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_2, "HexIntegerLiteral");

                        }

                     }
                        break;
                     case 3 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:262:8:
                     // lv_value_0_3= RULE_OCTALINTEGERLITERAL
                     {
                        lv_value_0_3 = (Token) match(input, RULE_OCTALINTEGERLITERAL,
                           FOLLOW_RULE_OCTALINTEGERLITERAL_in_ruleIntegerLiteral548);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_3, grammarAccess.getIntegerLiteralAccess()
                              .getValueOctalIntegerLiteralTerminalRuleCall_0_2());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getIntegerLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_3, "OctalIntegerLiteral");

                        }

                     }
                        break;
                     case 4 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:277:8:
                     // lv_value_0_4= RULE_BINARYINTEGERLITERAL
                     {
                        lv_value_0_4 = (Token) match(input, RULE_BINARYINTEGERLITERAL,
                           FOLLOW_RULE_BINARYINTEGERLITERAL_in_ruleIntegerLiteral568);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_4, grammarAccess.getIntegerLiteralAccess()
                              .getValueBinaryIntegerLiteralTerminalRuleCall_0_3());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getIntegerLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_4, "BinaryIntegerLiteral");

                        }

                     }
                        break;

                  }


               }


            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleIntegerLiteral"


   // $ANTLR start "entryRuleFloatingPointLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:303:1:
   // entryRuleFloatingPointLiteral returns [EObject current=null] : iv_ruleFloatingPointLiteral=
   // ruleFloatingPointLiteral EOF ;
   public final EObject entryRuleFloatingPointLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleFloatingPointLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:304:2:
         // (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:305:2:
         // iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getFloatingPointLiteralRule());
            }
            pushFollow(FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral611);
            iv_ruleFloatingPointLiteral = ruleFloatingPointLiteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleFloatingPointLiteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleFloatingPointLiteral621);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleFloatingPointLiteral"


   // $ANTLR start "ruleFloatingPointLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:312:1:
   // ruleFloatingPointLiteral returns [EObject current=null] : ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL |
   // lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL ) ) ) ;
   public final EObject ruleFloatingPointLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_1 = null;
      Token lv_value_0_2 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:315:28:
         // ( ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL )
         // ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:316:1:
         // ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL ) )
         // )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:316:1:
            // ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL
            // ) ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:317:1:
            // ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL )
            // )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:317:1:
               // ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL
               // ) )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:318:1:
               // (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL )
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:318:1:
                  // (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2=
                  // RULE_HEXADECIMALFLOATINGPOINTLITERAL )
                  int alt3 = 2;
                  int LA3_0 = input.LA(1);

                  if ((LA3_0 == RULE_DECIMALFLOATINGPOINTLITERAL)) {
                     alt3 = 1;
                  }
                  else if ((LA3_0 == RULE_HEXADECIMALFLOATINGPOINTLITERAL)) {
                     alt3 = 2;
                  }
                  else {
                     if (state.backtracking > 0) {
                        state.failed = true;
                        return current;
                     }
                     NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

                     throw nvae;
                  }
                  switch (alt3) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:319:3:
                     // lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL
                     {
                        lv_value_0_1 = (Token) match(input, RULE_DECIMALFLOATINGPOINTLITERAL,
                           FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral664);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_1, grammarAccess.getFloatingPointLiteralAccess()
                              .getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getFloatingPointLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_1, "DecimalFloatingPointLiteral");

                        }

                     }
                        break;
                     case 2 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:334:8:
                     // lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL
                     {
                        lv_value_0_2 = (Token) match(input, RULE_HEXADECIMALFLOATINGPOINTLITERAL,
                           FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral684);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_2, grammarAccess.getFloatingPointLiteralAccess()
                              .getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getFloatingPointLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_2, "HexadecimalFloatingPointLiteral");

                        }

                     }
                        break;

                  }


               }


            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleFloatingPointLiteral"


   // $ANTLR start "entryRuleBooleanLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:360:1:
   // entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
   public final EObject entryRuleBooleanLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleBooleanLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:361:2:
         // (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:362:2:
         // iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule());
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral727);
            iv_ruleBooleanLiteral = ruleBooleanLiteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleBooleanLiteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanLiteral737);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleBooleanLiteral"


   // $ANTLR start "ruleBooleanLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:369:1:
   // ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) )
   // ;
   public final EObject ruleBooleanLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_1 = null;
      Token lv_value_0_2 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:372:28:
         // ( ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:373:1:
         // ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:373:1:
            // ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:374:1:
            // ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:374:1:
               // ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:375:1:
               // (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE )
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:375:1:
                  // (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE )
                  int alt4 = 2;
                  int LA4_0 = input.LA(1);

                  if ((LA4_0 == RULE_TRUE)) {
                     alt4 = 1;
                  }
                  else if ((LA4_0 == RULE_FALSE)) {
                     alt4 = 2;
                  }
                  else {
                     if (state.backtracking > 0) {
                        state.failed = true;
                        return current;
                     }
                     NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

                     throw nvae;
                  }
                  switch (alt4) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:376:3:
                     // lv_value_0_1= RULE_TRUE
                     {
                        lv_value_0_1 = (Token) match(input, RULE_TRUE, FOLLOW_RULE_TRUE_in_ruleBooleanLiteral780);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess()
                              .getValueTRUETerminalRuleCall_0_0());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getBooleanLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_1, "TRUE");

                        }

                     }
                        break;
                     case 2 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:391:8:
                     // lv_value_0_2= RULE_FALSE
                     {
                        lv_value_0_2 = (Token) match(input, RULE_FALSE, FOLLOW_RULE_FALSE_in_ruleBooleanLiteral800);
                        if (state.failed)
                           return current;
                        if (state.backtracking == 0) {

                           newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess()
                              .getValueFALSETerminalRuleCall_0_1());

                        }
                        if (state.backtracking == 0) {

                           if (current == null) {
                              current = createModelElement(grammarAccess.getBooleanLiteralRule());
                           }
                           setWithLastConsumed(current, "value", lv_value_0_2, "FALSE");

                        }

                     }
                        break;

                  }


               }


            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleBooleanLiteral"


   // $ANTLR start "entryRuleCharacterLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:417:1:
   // entryRuleCharacterLiteral returns [EObject current=null] : iv_ruleCharacterLiteral= ruleCharacterLiteral EOF ;
   public final EObject entryRuleCharacterLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleCharacterLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:418:2:
         // (iv_ruleCharacterLiteral= ruleCharacterLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:419:2:
         // iv_ruleCharacterLiteral= ruleCharacterLiteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getCharacterLiteralRule());
            }
            pushFollow(FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral843);
            iv_ruleCharacterLiteral = ruleCharacterLiteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleCharacterLiteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleCharacterLiteral853);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleCharacterLiteral"


   // $ANTLR start "ruleCharacterLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:426:1:
   // ruleCharacterLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
   public final EObject ruleCharacterLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_0 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:429:28:
         // ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:430:1:
         // ( (lv_value_0_0= RULE_CHARACTER ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:430:1:
            // ( (lv_value_0_0= RULE_CHARACTER ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:431:1:
            // (lv_value_0_0= RULE_CHARACTER )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:431:1:
               // (lv_value_0_0= RULE_CHARACTER )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:432:3:
               // lv_value_0_0= RULE_CHARACTER
               {
                  lv_value_0_0 = (Token) match(input, RULE_CHARACTER, FOLLOW_RULE_CHARACTER_in_ruleCharacterLiteral894);
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     newLeafNode(lv_value_0_0, grammarAccess.getCharacterLiteralAccess()
                        .getValueCHARACTERTerminalRuleCall_0());

                  }
                  if (state.backtracking == 0) {

                     if (current == null) {
                        current = createModelElement(grammarAccess.getCharacterLiteralRule());
                     }
                     setWithLastConsumed(current, "value", lv_value_0_0, "CHARACTER");

                  }

               }


            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleCharacterLiteral"


   // $ANTLR start "entryRuleStringLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:456:1:
   // entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
   public final EObject entryRuleStringLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleStringLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:457:2:
         // (iv_ruleStringLiteral= ruleStringLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:458:2:
         // iv_ruleStringLiteral= ruleStringLiteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getStringLiteralRule());
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral934);
            iv_ruleStringLiteral = ruleStringLiteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleStringLiteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleStringLiteral944);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleStringLiteral"


   // $ANTLR start "ruleStringLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:465:1:
   // ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
   public final EObject ruleStringLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_0 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:468:28:
         // ( ( (lv_value_0_0= RULE_STRING ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:469:1:
         // ( (lv_value_0_0= RULE_STRING ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:469:1:
            // ( (lv_value_0_0= RULE_STRING ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:470:1:
            // (lv_value_0_0= RULE_STRING )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:470:1:
               // (lv_value_0_0= RULE_STRING )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:471:3:
               // lv_value_0_0= RULE_STRING
               {
                  lv_value_0_0 = (Token) match(input, RULE_STRING, FOLLOW_RULE_STRING_in_ruleStringLiteral985);
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess()
                        .getValueSTRINGTerminalRuleCall_0());

                  }
                  if (state.backtracking == 0) {

                     if (current == null) {
                        current = createModelElement(grammarAccess.getStringLiteralRule());
                     }
                     setWithLastConsumed(current, "value", lv_value_0_0, "STRING");

                  }

               }


            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleStringLiteral"


   // $ANTLR start "entryRuleNullLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:495:1:
   // entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
   public final EObject entryRuleNullLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleNullLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:496:2:
         // (iv_ruleNullLiteral= ruleNullLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:497:2:
         // iv_ruleNullLiteral= ruleNullLiteral EOF
         {
            if (state.backtracking == 0) {
               newCompositeNode(grammarAccess.getNullLiteralRule());
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1025);
            iv_ruleNullLiteral = ruleNullLiteral();

            state._fsp--;
            if (state.failed)
               return current;
            if (state.backtracking == 0) {
               current = iv_ruleNullLiteral;
            }
            match(input, EOF, FOLLOW_EOF_in_entryRuleNullLiteral1035);
            if (state.failed)
               return current;

         }

      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "entryRuleNullLiteral"


   // $ANTLR start "ruleNullLiteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:504:1:
   // ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
   public final EObject ruleNullLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_0 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:507:28:
         // ( ( (lv_value_0_0= RULE_NULL ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:508:1:
         // ( (lv_value_0_0= RULE_NULL ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:508:1:
            // ( (lv_value_0_0= RULE_NULL ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:509:1:
            // (lv_value_0_0= RULE_NULL )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:509:1:
               // (lv_value_0_0= RULE_NULL )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:510:3:
               // lv_value_0_0= RULE_NULL
               {
                  lv_value_0_0 = (Token) match(input, RULE_NULL, FOLLOW_RULE_NULL_in_ruleNullLiteral1076);
                  if (state.failed)
                     return current;
                  if (state.backtracking == 0) {

                     newLeafNode(lv_value_0_0, grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0());

                  }
                  if (state.backtracking == 0) {

                     if (current == null) {
                        current = createModelElement(grammarAccess.getNullLiteralRule());
                     }
                     setWithLastConsumed(current, "value", lv_value_0_0, "NULL");

                  }

               }


            }


         }

         if (state.backtracking == 0) {
            leaveRule();
         }
      }

      catch (RecognitionException re) {
         recover(input, re);
         appendSkippedTokens();
      }
      finally {
      }
      return current;
   }

   // $ANTLR end "ruleNullLiteral"

   // Delegated rules


   public static final BitSet FOLLOW_ruleFoo_in_entryRuleFoo81 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleFoo91 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_57_in_ruleFoo128 = new BitSet(new long[] { 0x000000000000FFE0L });
   public static final BitSet FOLLOW_ruleliteral_in_ruleFoo153 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_58_in_ruleFoo164 = new BitSet(new long[] { 0x0000000000000010L });
   public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleFoo175 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral210 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleliteral220 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleliteral270 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleliteral300 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleliteral330 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_ruleliteral360 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_ruleliteral390 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_ruleliteral420 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral455 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral465 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALINTEGERLITERAL_in_ruleIntegerLiteral508 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXINTEGERLITERAL_in_ruleIntegerLiteral528 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_OCTALINTEGERLITERAL_in_ruleIntegerLiteral548 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_BINARYINTEGERLITERAL_in_ruleIntegerLiteral568 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral611 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral621 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral664 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral684 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral727 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral737 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_TRUE_in_ruleBooleanLiteral780 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_FALSE_in_ruleBooleanLiteral800 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral843 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleCharacterLiteral853 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleCharacterLiteral894 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral934 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral944 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral985 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1025 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1035 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral1076 = new BitSet(new long[] { 0x0000000000000002L });

}