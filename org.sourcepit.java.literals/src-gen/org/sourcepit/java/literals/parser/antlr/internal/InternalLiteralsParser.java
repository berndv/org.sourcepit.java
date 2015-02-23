
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


   private LiteralsGrammarAccess grammarAccess;

   public InternalLiteralsParser(TokenStream input, LiteralsGrammarAccess grammarAccess) {
      this(input);
      this.grammarAccess = grammarAccess;
      registerRules(grammarAccess.getGrammar());
   }

   @Override
   protected String getFirstRuleName() {
      return "literal";
   }

   @Override
   protected LiteralsGrammarAccess getGrammarAccess() {
      return grammarAccess;
   }


   // $ANTLR start "entryRuleliteral"
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:67:1:
   // entryRuleliteral returns [EObject current=null] : iv_ruleliteral= ruleliteral EOF ;
   public final EObject entryRuleliteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleliteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:68:2:
         // (iv_ruleliteral= ruleliteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:69:2:
         // iv_ruleliteral= ruleliteral EOF
         {
            newCompositeNode(grammarAccess.getLiteralRule());
            pushFollow(FOLLOW_ruleliteral_in_entryRuleliteral75);
            iv_ruleliteral = ruleliteral();

            state._fsp--;

            current = iv_ruleliteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleliteral85);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:76:1:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:79:28:
         // ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatingPointLiteral_1= ruleFloatingPointLiteral |
         // this_BooleanLiteral_2= ruleBooleanLiteral | this_CharacterLiteral_3= ruleCharacterLiteral |
         // this_StringLiteral_4= ruleStringLiteral | this_NullLiteral_5= ruleNullLiteral ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:80:1:
         // (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatingPointLiteral_1= ruleFloatingPointLiteral |
         // this_BooleanLiteral_2= ruleBooleanLiteral | this_CharacterLiteral_3= ruleCharacterLiteral |
         // this_StringLiteral_4= ruleStringLiteral | this_NullLiteral_5= ruleNullLiteral )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:80:1:
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
                  NoViableAltException nvae = new NoViableAltException("", 1, 0, input);

                  throw nvae;
            }

            switch (alt1) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:81:5:
               // this_IntegerLiteral_0= ruleIntegerLiteral
               {

                  newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0());

                  pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleliteral132);
                  this_IntegerLiteral_0 = ruleIntegerLiteral();

                  state._fsp--;


                  current = this_IntegerLiteral_0;
                  afterParserOrEnumRuleCall();


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:91:5:
               // this_FloatingPointLiteral_1= ruleFloatingPointLiteral
               {

                  newCompositeNode(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1());

                  pushFollow(FOLLOW_ruleFloatingPointLiteral_in_ruleliteral159);
                  this_FloatingPointLiteral_1 = ruleFloatingPointLiteral();

                  state._fsp--;


                  current = this_FloatingPointLiteral_1;
                  afterParserOrEnumRuleCall();


               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:101:5:
               // this_BooleanLiteral_2= ruleBooleanLiteral
               {

                  newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());

                  pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleliteral186);
                  this_BooleanLiteral_2 = ruleBooleanLiteral();

                  state._fsp--;


                  current = this_BooleanLiteral_2;
                  afterParserOrEnumRuleCall();


               }
                  break;
               case 4 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:111:5:
               // this_CharacterLiteral_3= ruleCharacterLiteral
               {

                  newCompositeNode(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3());

                  pushFollow(FOLLOW_ruleCharacterLiteral_in_ruleliteral213);
                  this_CharacterLiteral_3 = ruleCharacterLiteral();

                  state._fsp--;


                  current = this_CharacterLiteral_3;
                  afterParserOrEnumRuleCall();


               }
                  break;
               case 5 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:121:5:
               // this_StringLiteral_4= ruleStringLiteral
               {

                  newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());

                  pushFollow(FOLLOW_ruleStringLiteral_in_ruleliteral240);
                  this_StringLiteral_4 = ruleStringLiteral();

                  state._fsp--;


                  current = this_StringLiteral_4;
                  afterParserOrEnumRuleCall();


               }
                  break;
               case 6 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:131:5:
               // this_NullLiteral_5= ruleNullLiteral
               {

                  newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5());

                  pushFollow(FOLLOW_ruleNullLiteral_in_ruleliteral267);
                  this_NullLiteral_5 = ruleNullLiteral();

                  state._fsp--;


                  current = this_NullLiteral_5;
                  afterParserOrEnumRuleCall();


               }
                  break;

            }


         }

         leaveRule();
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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:147:1:
   // entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
   public final EObject entryRuleIntegerLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleIntegerLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:148:2:
         // (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:149:2:
         // iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
         {
            newCompositeNode(grammarAccess.getIntegerLiteralRule());
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral302);
            iv_ruleIntegerLiteral = ruleIntegerLiteral();

            state._fsp--;

            current = iv_ruleIntegerLiteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleIntegerLiteral312);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:156:1:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:159:28:
         // ( ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
         // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:160:1:
         // ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
         // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:160:1:
            // ( ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
            // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:161:1:
            // ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
            // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:161:1:
               // ( (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
               // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL ) )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:162:1:
               // (lv_value_0_1= RULE_DECIMALINTEGERLITERAL | lv_value_0_2= RULE_HEXINTEGERLITERAL | lv_value_0_3=
               // RULE_OCTALINTEGERLITERAL | lv_value_0_4= RULE_BINARYINTEGERLITERAL )
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:162:1:
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
                        NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

                        throw nvae;
                  }

                  switch (alt2) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:163:3:
                     // lv_value_0_1= RULE_DECIMALINTEGERLITERAL
                     {
                        lv_value_0_1 = (Token) match(input, RULE_DECIMALINTEGERLITERAL,
                           FOLLOW_RULE_DECIMALINTEGERLITERAL_in_ruleIntegerLiteral355);

                        newLeafNode(lv_value_0_1, grammarAccess.getIntegerLiteralAccess()
                           .getValueDecimalIntegerLiteralTerminalRuleCall_0_0());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getIntegerLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_1, "DecimalIntegerLiteral");


                     }
                        break;
                     case 2 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:178:8:
                     // lv_value_0_2= RULE_HEXINTEGERLITERAL
                     {
                        lv_value_0_2 = (Token) match(input, RULE_HEXINTEGERLITERAL,
                           FOLLOW_RULE_HEXINTEGERLITERAL_in_ruleIntegerLiteral375);

                        newLeafNode(lv_value_0_2, grammarAccess.getIntegerLiteralAccess()
                           .getValueHexIntegerLiteralTerminalRuleCall_0_1());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getIntegerLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_2, "HexIntegerLiteral");


                     }
                        break;
                     case 3 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:193:8:
                     // lv_value_0_3= RULE_OCTALINTEGERLITERAL
                     {
                        lv_value_0_3 = (Token) match(input, RULE_OCTALINTEGERLITERAL,
                           FOLLOW_RULE_OCTALINTEGERLITERAL_in_ruleIntegerLiteral395);

                        newLeafNode(lv_value_0_3, grammarAccess.getIntegerLiteralAccess()
                           .getValueOctalIntegerLiteralTerminalRuleCall_0_2());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getIntegerLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_3, "OctalIntegerLiteral");


                     }
                        break;
                     case 4 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:208:8:
                     // lv_value_0_4= RULE_BINARYINTEGERLITERAL
                     {
                        lv_value_0_4 = (Token) match(input, RULE_BINARYINTEGERLITERAL,
                           FOLLOW_RULE_BINARYINTEGERLITERAL_in_ruleIntegerLiteral415);

                        newLeafNode(lv_value_0_4, grammarAccess.getIntegerLiteralAccess()
                           .getValueBinaryIntegerLiteralTerminalRuleCall_0_3());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getIntegerLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_4, "BinaryIntegerLiteral");


                     }
                        break;

                  }


               }


            }


         }

         leaveRule();
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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:234:1:
   // entryRuleFloatingPointLiteral returns [EObject current=null] : iv_ruleFloatingPointLiteral=
   // ruleFloatingPointLiteral EOF ;
   public final EObject entryRuleFloatingPointLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleFloatingPointLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:235:2:
         // (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:236:2:
         // iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
         {
            newCompositeNode(grammarAccess.getFloatingPointLiteralRule());
            pushFollow(FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral458);
            iv_ruleFloatingPointLiteral = ruleFloatingPointLiteral();

            state._fsp--;

            current = iv_ruleFloatingPointLiteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleFloatingPointLiteral468);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:243:1:
   // ruleFloatingPointLiteral returns [EObject current=null] : ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL |
   // lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL ) ) ) ;
   public final EObject ruleFloatingPointLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_1 = null;
      Token lv_value_0_2 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:246:28:
         // ( ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL )
         // ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:247:1:
         // ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL ) )
         // )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:247:1:
            // ( ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL
            // ) ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:248:1:
            // ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL )
            // )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:248:1:
               // ( (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL
               // ) )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:249:1:
               // (lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL | lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL )
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:249:1:
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
                     NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

                     throw nvae;
                  }
                  switch (alt3) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:250:3:
                     // lv_value_0_1= RULE_DECIMALFLOATINGPOINTLITERAL
                     {
                        lv_value_0_1 = (Token) match(input, RULE_DECIMALFLOATINGPOINTLITERAL,
                           FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral511);

                        newLeafNode(lv_value_0_1, grammarAccess.getFloatingPointLiteralAccess()
                           .getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getFloatingPointLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_1, "DecimalFloatingPointLiteral");


                     }
                        break;
                     case 2 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:265:8:
                     // lv_value_0_2= RULE_HEXADECIMALFLOATINGPOINTLITERAL
                     {
                        lv_value_0_2 = (Token) match(input, RULE_HEXADECIMALFLOATINGPOINTLITERAL,
                           FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral531);

                        newLeafNode(lv_value_0_2, grammarAccess.getFloatingPointLiteralAccess()
                           .getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getFloatingPointLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_2, "HexadecimalFloatingPointLiteral");


                     }
                        break;

                  }


               }


            }


         }

         leaveRule();
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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:291:1:
   // entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
   public final EObject entryRuleBooleanLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleBooleanLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:292:2:
         // (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:293:2:
         // iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
         {
            newCompositeNode(grammarAccess.getBooleanLiteralRule());
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral574);
            iv_ruleBooleanLiteral = ruleBooleanLiteral();

            state._fsp--;

            current = iv_ruleBooleanLiteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleBooleanLiteral584);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:300:1:
   // ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) )
   // ;
   public final EObject ruleBooleanLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_1 = null;
      Token lv_value_0_2 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:303:28:
         // ( ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:304:1:
         // ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:304:1:
            // ( ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:305:1:
            // ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:305:1:
               // ( (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE ) )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:306:1:
               // (lv_value_0_1= RULE_TRUE | lv_value_0_2= RULE_FALSE )
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:306:1:
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
                     NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

                     throw nvae;
                  }
                  switch (alt4) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:307:3:
                     // lv_value_0_1= RULE_TRUE
                     {
                        lv_value_0_1 = (Token) match(input, RULE_TRUE, FOLLOW_RULE_TRUE_in_ruleBooleanLiteral627);

                        newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess()
                           .getValueTRUETerminalRuleCall_0_0());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getBooleanLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_1, "TRUE");


                     }
                        break;
                     case 2 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:322:8:
                     // lv_value_0_2= RULE_FALSE
                     {
                        lv_value_0_2 = (Token) match(input, RULE_FALSE, FOLLOW_RULE_FALSE_in_ruleBooleanLiteral647);

                        newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess()
                           .getValueFALSETerminalRuleCall_0_1());


                        if (current == null) {
                           current = createModelElement(grammarAccess.getBooleanLiteralRule());
                        }
                        setWithLastConsumed(current, "value", lv_value_0_2, "FALSE");


                     }
                        break;

                  }


               }


            }


         }

         leaveRule();
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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:348:1:
   // entryRuleCharacterLiteral returns [EObject current=null] : iv_ruleCharacterLiteral= ruleCharacterLiteral EOF ;
   public final EObject entryRuleCharacterLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleCharacterLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:349:2:
         // (iv_ruleCharacterLiteral= ruleCharacterLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:350:2:
         // iv_ruleCharacterLiteral= ruleCharacterLiteral EOF
         {
            newCompositeNode(grammarAccess.getCharacterLiteralRule());
            pushFollow(FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral690);
            iv_ruleCharacterLiteral = ruleCharacterLiteral();

            state._fsp--;

            current = iv_ruleCharacterLiteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleCharacterLiteral700);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:357:1:
   // ruleCharacterLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
   public final EObject ruleCharacterLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_0 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:360:28:
         // ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:361:1:
         // ( (lv_value_0_0= RULE_CHARACTER ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:361:1:
            // ( (lv_value_0_0= RULE_CHARACTER ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:362:1:
            // (lv_value_0_0= RULE_CHARACTER )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:362:1:
               // (lv_value_0_0= RULE_CHARACTER )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:363:3:
               // lv_value_0_0= RULE_CHARACTER
               {
                  lv_value_0_0 = (Token) match(input, RULE_CHARACTER, FOLLOW_RULE_CHARACTER_in_ruleCharacterLiteral741);

                  newLeafNode(lv_value_0_0, grammarAccess.getCharacterLiteralAccess()
                     .getValueCHARACTERTerminalRuleCall_0());


                  if (current == null) {
                     current = createModelElement(grammarAccess.getCharacterLiteralRule());
                  }
                  setWithLastConsumed(current, "value", lv_value_0_0, "CHARACTER");


               }


            }


         }

         leaveRule();
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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:387:1:
   // entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
   public final EObject entryRuleStringLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleStringLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:388:2:
         // (iv_ruleStringLiteral= ruleStringLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:389:2:
         // iv_ruleStringLiteral= ruleStringLiteral EOF
         {
            newCompositeNode(grammarAccess.getStringLiteralRule());
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral781);
            iv_ruleStringLiteral = ruleStringLiteral();

            state._fsp--;

            current = iv_ruleStringLiteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleStringLiteral791);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:396:1:
   // ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
   public final EObject ruleStringLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_0 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:399:28:
         // ( ( (lv_value_0_0= RULE_STRING ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:400:1:
         // ( (lv_value_0_0= RULE_STRING ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:400:1:
            // ( (lv_value_0_0= RULE_STRING ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:401:1:
            // (lv_value_0_0= RULE_STRING )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:401:1:
               // (lv_value_0_0= RULE_STRING )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:402:3:
               // lv_value_0_0= RULE_STRING
               {
                  lv_value_0_0 = (Token) match(input, RULE_STRING, FOLLOW_RULE_STRING_in_ruleStringLiteral832);

                  newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());


                  if (current == null) {
                     current = createModelElement(grammarAccess.getStringLiteralRule());
                  }
                  setWithLastConsumed(current, "value", lv_value_0_0, "STRING");


               }


            }


         }

         leaveRule();
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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:426:1:
   // entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
   public final EObject entryRuleNullLiteral() throws RecognitionException {
      EObject current = null;

      EObject iv_ruleNullLiteral = null;


      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:427:2:
         // (iv_ruleNullLiteral= ruleNullLiteral EOF )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:428:2:
         // iv_ruleNullLiteral= ruleNullLiteral EOF
         {
            newCompositeNode(grammarAccess.getNullLiteralRule());
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral872);
            iv_ruleNullLiteral = ruleNullLiteral();

            state._fsp--;

            current = iv_ruleNullLiteral;
            match(input, EOF, FOLLOW_EOF_in_entryRuleNullLiteral882);

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
   // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:435:1:
   // ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
   public final EObject ruleNullLiteral() throws RecognitionException {
      EObject current = null;

      Token lv_value_0_0 = null;

      enterRule();

      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:438:28:
         // ( ( (lv_value_0_0= RULE_NULL ) ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:439:1:
         // ( (lv_value_0_0= RULE_NULL ) )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:439:1:
            // ( (lv_value_0_0= RULE_NULL ) )
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:440:1:
            // (lv_value_0_0= RULE_NULL )
            {
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:440:1:
               // (lv_value_0_0= RULE_NULL )
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:441:3:
               // lv_value_0_0= RULE_NULL
               {
                  lv_value_0_0 = (Token) match(input, RULE_NULL, FOLLOW_RULE_NULL_in_ruleNullLiteral923);

                  newLeafNode(lv_value_0_0, grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0());


                  if (current == null) {
                     current = createModelElement(grammarAccess.getNullLiteralRule());
                  }
                  setWithLastConsumed(current, "value", lv_value_0_0, "NULL");


               }


            }


         }

         leaveRule();
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


   public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral75 = new BitSet(new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleliteral85 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleliteral132 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleliteral159 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleliteral186 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_ruleliteral213 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_ruleliteral240 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_ruleliteral267 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral302 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral312 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALINTEGERLITERAL_in_ruleIntegerLiteral355 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXINTEGERLITERAL_in_ruleIntegerLiteral375 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_OCTALINTEGERLITERAL_in_ruleIntegerLiteral395 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_BINARYINTEGERLITERAL_in_ruleIntegerLiteral415 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral458 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral468 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_DECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral511 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_HEXADECIMALFLOATINGPOINTLITERAL_in_ruleFloatingPointLiteral531 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral574 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral584 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_TRUE_in_ruleBooleanLiteral627 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_FALSE_in_ruleBooleanLiteral647 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleCharacterLiteral_in_entryRuleCharacterLiteral690 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleCharacterLiteral700 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleCharacterLiteral741 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral781 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral791 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral832 = new BitSet(
      new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral872 = new BitSet(
      new long[] { 0x0000000000000000L });
   public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral882 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral923 = new BitSet(new long[] { 0x0000000000000002L });

}