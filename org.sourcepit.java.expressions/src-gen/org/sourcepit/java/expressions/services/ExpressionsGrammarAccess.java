/*
 * generated by Xtext
 */

package org.sourcepit.java.expressions.services;

import java.util.List;

import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ExpressionsGrammarAccess extends AbstractGrammarElementFinder {


   public class ModelElements extends AbstractParserRuleElementFinder {
      private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
      private final Assignment cGreetingsAssignment = (Assignment) rule.eContents().get(1);
      private final RuleCall cGreetingsLiteralParserRuleCall_0 = (RuleCall) cGreetingsAssignment.eContents().get(0);

      // Model:
      // greetings+=literal*;
      public ParserRule getRule() {
         return rule;
      }

      // greetings+=literal*
      public Assignment getGreetingsAssignment() {
         return cGreetingsAssignment;
      }

      // literal
      public RuleCall getGreetingsLiteralParserRuleCall_0() {
         return cGreetingsLiteralParserRuleCall_0;
      }
   }


   private final ModelElements pModel;

   private final Grammar grammar;

   private final LiteralsGrammarAccess gaLiterals;

   @Inject
   public ExpressionsGrammarAccess(GrammarProvider grammarProvider, LiteralsGrammarAccess gaLiterals) {
      this.grammar = internalFindGrammar(grammarProvider);
      this.gaLiterals = gaLiterals;
      this.pModel = new ModelElements();
   }

   protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
      Grammar grammar = grammarProvider.getGrammar(this);
      while (grammar != null) {
         if ("org.sourcepit.java.expressions.Expressions".equals(grammar.getName())) {
            return grammar;
         }
         List<Grammar> grammars = grammar.getUsedGrammars();
         if (!grammars.isEmpty()) {
            grammar = grammars.iterator().next();
         }
         else {
            return null;
         }
      }
      return grammar;
   }


   public Grammar getGrammar() {
      return grammar;
   }


   public LiteralsGrammarAccess getLiteralsGrammarAccess() {
      return gaLiterals;
   }


   // Model:
   // greetings+=literal*;
   public ModelElements getModelAccess() {
      return pModel;
   }

   public ParserRule getModelRule() {
      return getModelAccess().getRule();
   }

   // / *
   // * Productions from §3 (Lexical Structure)
   // * / literal:
   // IntegerLiteral | FloatingPointLiteral | BooleanLiteral | CharacterLiteral | StringLiteral | NullLiteral;
   public LiteralsGrammarAccess.LiteralElements getLiteralAccess() {
      return gaLiterals.getLiteralAccess();
   }

   public ParserRule getLiteralRule() {
      return getLiteralAccess().getRule();
   }

   // / *
   // * 3.10.1. Integer Literals
   // * / IntegerLiteral:
   // value=(DecimalIntegerLiteral | HexIntegerLiteral | OctalIntegerLiteral | BinaryIntegerLiteral);
   public LiteralsGrammarAccess.IntegerLiteralElements getIntegerLiteralAccess() {
      return gaLiterals.getIntegerLiteralAccess();
   }

   public ParserRule getIntegerLiteralRule() {
      return getIntegerLiteralAccess().getRule();
   }

   // terminal DecimalIntegerLiteral:
   // DecimalNumeral IntegerTypeSuffix?;
   public TerminalRule getDecimalIntegerLiteralRule() {
      return gaLiterals.getDecimalIntegerLiteralRule();
   }

   // terminal HexIntegerLiteral:
   // HexNumeral IntegerTypeSuffix?;
   public TerminalRule getHexIntegerLiteralRule() {
      return gaLiterals.getHexIntegerLiteralRule();
   }

   // terminal OctalIntegerLiteral:
   // OctalNumeral IntegerTypeSuffix?;
   public TerminalRule getOctalIntegerLiteralRule() {
      return gaLiterals.getOctalIntegerLiteralRule();
   }

   // terminal BinaryIntegerLiteral:
   // BinaryNumeral IntegerTypeSuffix?;
   public TerminalRule getBinaryIntegerLiteralRule() {
      return gaLiterals.getBinaryIntegerLiteralRule();
   }

   // terminal fragment IntegerTypeSuffix:
   // "l" | "L";
   public TerminalRule getIntegerTypeSuffixRule() {
      return gaLiterals.getIntegerTypeSuffixRule();
   }

   // // Decimal
   // terminal fragment DecimalNumeral:
   // "0" | NonZeroDigit Digits? | NonZeroDigit Underscores Digits;
   public TerminalRule getDecimalNumeralRule() {
      return gaLiterals.getDecimalNumeralRule();
   }

   // terminal fragment NonZeroDigit:
   // "1".."9";
   public TerminalRule getNonZeroDigitRule() {
      return gaLiterals.getNonZeroDigitRule();
   }

   // terminal fragment Digits:
   // Digit | Digit DigitsAndUnderscores? Digit;
   public TerminalRule getDigitsRule() {
      return gaLiterals.getDigitsRule();
   }

   // terminal fragment Digit:
   // "0" | NonZeroDigit;
   public TerminalRule getDigitRule() {
      return gaLiterals.getDigitRule();
   }

   // terminal fragment DigitsAndUnderscores:
   // DigitOrUnderscore DigitOrUnderscore*;
   public TerminalRule getDigitsAndUnderscoresRule() {
      return gaLiterals.getDigitsAndUnderscoresRule();
   }

   // terminal fragment DigitOrUnderscore:
   // Digit | "_";
   public TerminalRule getDigitOrUnderscoreRule() {
      return gaLiterals.getDigitOrUnderscoreRule();
   }

   // terminal fragment Underscores:
   // "_"+;
   public TerminalRule getUnderscoresRule() {
      return gaLiterals.getUnderscoresRule();
   }

   // //Hexadecimal
   // terminal fragment HexNumeral:
   // "0" ("x" | "X") HexDigits;
   public TerminalRule getHexNumeralRule() {
      return gaLiterals.getHexNumeralRule();
   }

   // terminal fragment HexDigits:
   // HexDigit | HexDigit HexDigitsAndUnderscores? HexDigit;
   public TerminalRule getHexDigitsRule() {
      return gaLiterals.getHexDigitsRule();
   }

   // terminal fragment HexDigit:
   // "0".."9" | "a".."f" | "A".."F";
   public TerminalRule getHexDigitRule() {
      return gaLiterals.getHexDigitRule();
   }

   // terminal fragment HexDigitsAndUnderscores:
   // HexDigitOrUnderscore HexDigitOrUnderscore*;
   public TerminalRule getHexDigitsAndUnderscoresRule() {
      return gaLiterals.getHexDigitsAndUnderscoresRule();
   }

   // terminal fragment HexDigitOrUnderscore:
   // HexDigit | "_";
   public TerminalRule getHexDigitOrUnderscoreRule() {
      return gaLiterals.getHexDigitOrUnderscoreRule();
   }

   // //Octal
   // terminal fragment OctalNumeral:
   // "0" OctalDigits | "0" Underscores OctalDigits;
   public TerminalRule getOctalNumeralRule() {
      return gaLiterals.getOctalNumeralRule();
   }

   // terminal fragment OctalDigits:
   // OctalDigit | OctalDigit OctalDigitsAndUnderscores? OctalDigit;
   public TerminalRule getOctalDigitsRule() {
      return gaLiterals.getOctalDigitsRule();
   }

   // terminal fragment OctalDigit:
   // "0".."7";
   public TerminalRule getOctalDigitRule() {
      return gaLiterals.getOctalDigitRule();
   }

   // terminal fragment OctalDigitsAndUnderscores:
   // OctalDigitOrUnderscore OctalDigitOrUnderscore*;
   public TerminalRule getOctalDigitsAndUnderscoresRule() {
      return gaLiterals.getOctalDigitsAndUnderscoresRule();
   }

   // terminal fragment OctalDigitOrUnderscore:
   // OctalDigit | "_";
   public TerminalRule getOctalDigitOrUnderscoreRule() {
      return gaLiterals.getOctalDigitOrUnderscoreRule();
   }

   // // Binary
   // terminal fragment BinaryNumeral:
   // "0" ("b" | "B") BinaryDigits;
   public TerminalRule getBinaryNumeralRule() {
      return gaLiterals.getBinaryNumeralRule();
   }

   // terminal fragment BinaryDigits:
   // BinaryDigit | BinaryDigit BinaryDigitsAndUnderscores? BinaryDigit;
   public TerminalRule getBinaryDigitsRule() {
      return gaLiterals.getBinaryDigitsRule();
   }

   // terminal fragment BinaryDigit:
   // "0" | "1";
   public TerminalRule getBinaryDigitRule() {
      return gaLiterals.getBinaryDigitRule();
   }

   // terminal fragment BinaryDigitsAndUnderscores:
   // BinaryDigitOrUnderscore BinaryDigitOrUnderscore*;
   public TerminalRule getBinaryDigitsAndUnderscoresRule() {
      return gaLiterals.getBinaryDigitsAndUnderscoresRule();
   }

   // terminal fragment BinaryDigitOrUnderscore:
   // BinaryDigit | "_";
   public TerminalRule getBinaryDigitOrUnderscoreRule() {
      return gaLiterals.getBinaryDigitOrUnderscoreRule();
   }

   // / *
   // * 3.10.2. Floating-Point Literals
   // * / FloatingPointLiteral:
   // value=(DecimalFloatingPointLiteral | HexadecimalFloatingPointLiteral);
   public LiteralsGrammarAccess.FloatingPointLiteralElements getFloatingPointLiteralAccess() {
      return gaLiterals.getFloatingPointLiteralAccess();
   }

   public ParserRule getFloatingPointLiteralRule() {
      return getFloatingPointLiteralAccess().getRule();
   }

   // terminal DecimalFloatingPointLiteral:
   // Digits "." Digits? ExponentPart? FloatTypeSuffix? | "." Digits ExponentPart? FloatTypeSuffix? | Digits
   // ExponentPart
   // FloatTypeSuffix? | Digits FloatTypeSuffix;
   public TerminalRule getDecimalFloatingPointLiteralRule() {
      return gaLiterals.getDecimalFloatingPointLiteralRule();
   }

   // terminal fragment ExponentPart:
   // ExponentIndicator SignedInteger;
   public TerminalRule getExponentPartRule() {
      return gaLiterals.getExponentPartRule();
   }

   // terminal fragment ExponentIndicator:
   // "e" | "E";
   public TerminalRule getExponentIndicatorRule() {
      return gaLiterals.getExponentIndicatorRule();
   }

   // terminal fragment SignedInteger:
   // SIGN? Digits;
   public TerminalRule getSignedIntegerRule() {
      return gaLiterals.getSignedIntegerRule();
   }

   // terminal fragment SIGN:
   // "+" | "-";
   public TerminalRule getSIGNRule() {
      return gaLiterals.getSIGNRule();
   }

   // terminal fragment FloatTypeSuffix:
   // "f" | "F" | "d" | "D";
   public TerminalRule getFloatTypeSuffixRule() {
      return gaLiterals.getFloatTypeSuffixRule();
   }

   // terminal HexadecimalFloatingPointLiteral:
   // HexSignificand BinaryExponent FloatTypeSuffix?;
   public TerminalRule getHexadecimalFloatingPointLiteralRule() {
      return gaLiterals.getHexadecimalFloatingPointLiteralRule();
   }

   // terminal fragment HexSignificand:
   // HexNumeral "."? | "0" ("x" | "X") HexDigit* "." HexDigit+;
   public TerminalRule getHexSignificandRule() {
      return gaLiterals.getHexSignificandRule();
   }

   // terminal fragment BinaryExponent:
   // BinaryExponentIndicator SignedInteger;
   public TerminalRule getBinaryExponentRule() {
      return gaLiterals.getBinaryExponentRule();
   }

   // terminal fragment BinaryExponentIndicator:
   // "p" | "P";
   public TerminalRule getBinaryExponentIndicatorRule() {
      return gaLiterals.getBinaryExponentIndicatorRule();
   }

   // / *
   // * 3.10.3. Boolean Literals
   // * / BooleanLiteral:
   // value=(TRUE | FALSE);
   public LiteralsGrammarAccess.BooleanLiteralElements getBooleanLiteralAccess() {
      return gaLiterals.getBooleanLiteralAccess();
   }

   public ParserRule getBooleanLiteralRule() {
      return getBooleanLiteralAccess().getRule();
   }

   // terminal TRUE:
   // "true";
   public TerminalRule getTRUERule() {
      return gaLiterals.getTRUERule();
   }

   // terminal FALSE:
   // "false";
   public TerminalRule getFALSERule() {
      return gaLiterals.getFALSERule();
   }

   // / *
   // * 3.10.4. Character Literals
   // * / CharacterLiteral:
   // value=CHARACTER;
   public LiteralsGrammarAccess.CharacterLiteralElements getCharacterLiteralAccess() {
      return gaLiterals.getCharacterLiteralAccess();
   }

   public ParserRule getCharacterLiteralRule() {
      return getCharacterLiteralAccess().getRule();
   }

   // terminal CHARACTER:
   // "\'" (EscapeSequence | !("\'" | "\\")) "\'";
   public TerminalRule getCHARACTERRule() {
      return gaLiterals.getCHARACTERRule();
   }

   // StringLiteral:
   // value=STRING;
   public LiteralsGrammarAccess.StringLiteralElements getStringLiteralAccess() {
      return gaLiterals.getStringLiteralAccess();
   }

   public ParserRule getStringLiteralRule() {
      return getStringLiteralAccess().getRule();
   }

   // terminal STRING:
   // "\"" (EscapeSequence | !("\\" | "\""))* "\"";
   public TerminalRule getSTRINGRule() {
      return gaLiterals.getSTRINGRule();
   }

   // terminal fragment EscapeSequence:
   // "\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | UnicodeEscape | OctalEscape;
   public TerminalRule getEscapeSequenceRule() {
      return gaLiterals.getEscapeSequenceRule();
   }

   // terminal fragment OctalEscape:
   // "\\" ZeroToThree OctalDigit OctalDigit | "\\" OctalDigit OctalDigit | "\\" OctalDigit;
   public TerminalRule getOctalEscapeRule() {
      return gaLiterals.getOctalEscapeRule();
   }

   // terminal fragment ZeroToThree:
   // "0".."3";
   public TerminalRule getZeroToThreeRule() {
      return gaLiterals.getZeroToThreeRule();
   }

   // terminal fragment UnicodeEscape:
   // "\\" UnicodeMarker HexDigit HexDigit HexDigit HexDigit;
   public TerminalRule getUnicodeEscapeRule() {
      return gaLiterals.getUnicodeEscapeRule();
   }

   // terminal fragment UnicodeMarker:
   // "u" "u"*;
   public TerminalRule getUnicodeMarkerRule() {
      return gaLiterals.getUnicodeMarkerRule();
   }

   // / *
   // * 3.10.7. The Null Literal
   // * / NullLiteral:
   // value=NULL;
   public LiteralsGrammarAccess.NullLiteralElements getNullLiteralAccess() {
      return gaLiterals.getNullLiteralAccess();
   }

   public ParserRule getNullLiteralRule() {
      return getNullLiteralAccess().getRule();
   }

   // terminal NULL:
   // "null";
   public TerminalRule getNULLRule() {
      return gaLiterals.getNULLRule();
   }

   // / *
   // * Identifier
   // * / terminal Identifier:
   // JavaLetter JavaLetterOrDigit*;
   public TerminalRule getIdentifierRule() {
      return gaLiterals.getIdentifierRule();
   }

   // terminal fragment JavaLetter:
   // "$" | "A".."Z" | "_" | "a".."z" | "¢".."¥" | "ª" | "µ" | "º" | "À".."Ö" | "Ø".."ö" | "ø".."ȶ" | "ɐ".."ˁ" |
   // "ˆ".."ˑ" |
   // "ˠ".."ˤ" | "ˮ" | "ͺ" | "Ά" | "Έ".."Ί" | "Ό" | "Ύ".."Ρ" | "Σ".."ώ" | "ϐ".."ϵ" | "Ϸ".."ϻ" | "Ѐ".."ҁ" | "Ҋ".."ӎ" |
   // "Ӑ".."ӵ" | "Ӹ".."ӹ" | "Ԁ".."ԏ" | "Ա".."Ֆ" | "ՙ" | "ա".."և" | "א".."ת" | "װ".."ײ" | "ء".."غ" | "ـ".."ي" | "ٮ".."ٯ"
   // |
   // "ٱ".."ۓ" | "ە" | "ۥ".."ۦ" | "ۮ".."ۯ" | "ۺ".."ۼ" | "ۿ" | "ܐ" | "ܒ".."ܯ" | "ݍ".."ݏ" | "ހ".."ޥ" | "ޱ" | "ऄ".."ह" |
   // "ऽ" |
   // "ॐ" | "क़".."ॡ" | "অ".."ঌ" | "এ".."ঐ" | "ও".."ন" | "প".."র" | "ল" | "শ".."হ" | "ঽ" | "ড়".."ঢ়" | "য়".."ৡ" | "ৰ".."৳"
   // |
   // "ਅ".."ਊ" | "ਏ".."ਐ" | "ਓ".."ਨ" | "ਪ".."ਰ" | "ਲ".."ਲ਼" | "ਵ".."ਸ਼" | "ਸ".."ਹ" | "ਖ਼".."ੜ" | "ਫ਼" | "ੲ".."ੴ" | "અ".."ઍ"
   // |
   // "એ".."ઑ" | "ઓ".."ન" | "પ".."ર" | "લ".."ળ" | "વ".."હ" | "ઽ" | "ૐ" | "ૠ".."ૡ" | "૱" | "ଅ".."ଌ" | "ଏ".."ଐ" | "ଓ".."ନ"
   // |
   // "ପ".."ର" | "ଲ".."ଳ" | "ଵ".."ହ" | "ଽ" | "ଡ଼".."ଢ଼" | "ୟ".."ୡ" | "ୱ" | "ஃ" | "அ".."ஊ" | "எ".."ஐ" | "ஒ".."க" | "ங".."ச"
   // |
   // "ஜ" | "ஞ".."ட" | "ண".."த" | "ந".."ப" | "ம".."வ" | "ஷ".."ஹ" | "௹" | "అ".."ఌ" | "ఎ".."ఐ" | "ఒ".."న" | "ప".."ళ" |
   // "వ".."హ" | "ౠ".."ౡ" | "ಅ".."ಌ" | "ಎ".."ಐ" | "ಒ".."ನ" | "ಪ".."ಳ" | "ವ".."ಹ" | "ಽ" | "ೞ" | "ೠ".."ೡ" | "അ".."ഌ" |
   // "എ".."ഐ" | "ഒ".."ന" | "പ".."ഹ" | "ൠ".."ൡ" | "අ".."ඖ" | "ක".."න" | "ඳ".."ර" | "ල" | "ව".."ෆ" | "ก".."ะ" | "า".."ำ"
   // |
   // "฿".."ๆ" | "ກ".."ຂ" | "ຄ" | "ງ".."ຈ" | "ຊ" | "ຍ" | "ດ".."ທ" | "ນ".."ຟ" | "ມ".."ຣ" | "ລ" | "ວ" | "ສ".."ຫ" |
   // "ອ".."ະ" |
   // "າ".."ຳ" | "ຽ" | "ເ".."ໄ" | "ໆ" | "ໜ".."ໝ" | "ༀ" | "ཀ".."ཇ" | "ཉ".."ཪ" | "ྈ".."ྋ" | "က".."အ" | "ဣ".."ဧ" | "ဩ".."ဪ"
   // |
   // "ၐ".."ၕ" | "Ⴀ".."Ⴥ" | "ა".."ჸ" | "ᄀ".."ᅙ" | "ᅟ".."ᆢ" | "ᆨ".."ᇹ" | "ሀ".."ሆ" | "ለ".."ቆ" | "ቈ" | "ቊ".."ቍ" | "ቐ".."ቖ"
   // |
   // "ቘ" | "ቚ".."ቝ" | "በ".."ኆ" | "ኈ" | "ኊ".."ኍ" | "ነ".."ኮ" | "ኰ" | "ኲ".."ኵ" | "ኸ".."ኾ" | "ዀ" | "ዂ".."ዅ" | "ወ".."ዎ" |
   // "ዐ".."ዖ" | "ዘ".."ዮ" | "ደ".."ጎ" | "ጐ" | "ጒ".."ጕ" | "ጘ".."ጞ" | "ጠ".."ፆ" | "ፈ".."ፚ" | "Ꭰ".."Ᏼ" | "ᐁ".."ᙬ" | "ᙯ".."ᙶ"
   // |
   // "ᚁ".."ᚚ" | "ᚠ".."ᛪ" | "ᛮ".."ᛰ" | "ᜀ".."ᜌ" | "ᜎ".."ᜑ" | "ᜠ".."ᜱ" | "ᝀ".."ᝑ" | "ᝠ".."ᝬ" | "ᝮ".."ᝰ" | "ក".."ឳ" | "ៗ"
   // |
   // "៛".."ៜ" | "ᠠ".."ᡷ" | "ᢀ".."ᢨ" | "ᤀ".."ᤜ" | "ᥐ".."ᥭ" | "ᥰ".."ᥴ" | "ᴀ".."ᵫ" | "Ḁ".."ẛ" | "Ạ".."ỹ" | "ἀ".."ἕ" |
   // "Ἐ".."Ἕ" | "ἠ".."ὅ" | "Ὀ".."Ὅ" | "ὐ".."ὗ" | "Ὑ" | "Ὓ" | "Ὕ" | "Ὗ".."ώ" | "ᾀ".."ᾴ" | "ᾶ".."ᾼ" | "ι" | "ῂ".."ῄ" |
   // "ῆ".."ῌ" | "ῐ".."ΐ" | "ῖ".."Ί" | "ῠ".."Ῥ" | "ῲ".."ῴ" | "ῶ".."ῼ" | "‿".."⁀" | "⁔" | "ⁱ" | "ⁿ" | "₠".."₱" | "ℂ" |
   // "ℇ" |
   // "ℊ".."ℓ" | "ℕ" | "ℙ".."ℝ" | "ℤ" | "Ω" | "ℨ" | "K".."ℭ" | "ℯ".."ℱ" | "ℳ".."ℹ" | "ℽ".."ℿ" | "ⅅ".."ⅉ" | "Ⅰ".."Ↄ" |
   // "々".."〇" | "〡".."〩" | "〱".."〵" | "〸".."〼" | "ぁ".."ゖ" | "ゝ".."ゟ" | "ァ".."ヿ" | "ㄅ".."ㄬ" | "ㄱ".."ㆎ" | "ㆠ".."ㆷ" |
   // "ㇰ".."ㇿ" | "㐀".."䶵" | "一".."龥" | "ꀀ".."ꒌ" | "가".."힣" | "豈".."鶴" | "侮".."頻" | "ﬀ".."ﬆ" | "ﬓ".."ﬗ" | "יִ" | "ײַ".."ﬨ"
   // |
   // "שׁ".."זּ" | "טּ".."לּ" | "מּ" | "נּ".."סּ" | "ףּ".."פּ" | "צּ".."ﮱ" | "ﯓ".."ﴽ" | "ﵐ".."ﶏ" | "ﶒ".."ﷇ" | "ﷰ".."﷼" | "︳".."︴"
   // |
   // "﹍".."﹏" | "﹩" | "ﹰ".."ﹴ" | "ﹶ".."ﻼ" | "＄" | "Ａ".."Ｚ" | "＿" | "ａ".."ｚ" | "･".."ﾾ" | "ￂ".."ￇ" | "ￊ".."ￏ" | "ￒ".."ￗ"
   // |
   // "ￚ".."ￜ" | "￠".."￡" | "￥".."￦" | "?".."?" "?".."?";
   public TerminalRule getJavaLetterRule() {
      return gaLiterals.getJavaLetterRule();
   }

   // terminal fragment JavaLetterOrDigit:
   // " ".."\b" | "".."" | "$" | "0".."9" | "A".."Z" | "_" | "a".."z" | "".."" | "¢".."¥" | "ª" | "­" | "µ" | "º" |
   // "À".."Ö" | "Ø".."ö" | "ø".."ȶ" | "ɐ".."ˁ" | "ˆ".."ˑ" | "ˠ".."ˤ" | "ˮ" | "̀".."͗" | "͝".."ͯ" | "ͺ" | "Ά" | "Έ".."Ί"
   // |
   // "Ό" | "Ύ".."Ρ" | "Σ".."ώ" | "ϐ".."ϵ" | "Ϸ".."ϻ" | "Ѐ".."ҁ" | "҃".."҆" | "Ҋ".."ӎ" | "Ӑ".."ӵ" | "Ӹ".."ӹ" | "Ԁ".."ԏ"
   // |
   // "Ա".."Ֆ" | "ՙ" | "ա".."և" | "֑".."֡" | "֣".."ֹ" | "ֻ".."ֽ" | "ֿ" | "ׁ".."ׂ" | "ׄ" | "א".."ת" | "װ".."ײ" | "؀".."؃"
   // |
   // "ؐ".."ؕ" | "ء".."غ" | "ـ".."٘" | "٠".."٩" | "ٮ".."ۓ" | "ە".."۝" | "۟".."ۨ" | "۪".."ۼ" | "ۿ" | "܏".."݊" | "ݍ".."ݏ"
   // |
   // "ހ".."ޱ" | "ँ".."ह" | "़".."्" | "ॐ".."॔" | "क़".."ॣ" | "०".."९" | "ঁ".."ঃ" | "অ".."ঌ" | "এ".."ঐ" | "ও".."ন" |
   // "প".."র" | "ল" | "শ".."হ" | "়".."ৄ" | "ে".."ৈ" | "ো".."্" | "ৗ" | "ড়".."ঢ়" | "য়".."ৣ" | "০".."৳" | "ਁ".."ਃ" |
   // "ਅ".."ਊ" | "ਏ".."ਐ" | "ਓ".."ਨ" | "ਪ".."ਰ" | "ਲ".."ਲ਼" | "ਵ".."ਸ਼" | "ਸ".."ਹ" | "਼" | "ਾ".."ੂ" | "ੇ".."ੈ" | "ੋ".."੍"
   // |
   // "ਖ਼".."ੜ" | "ਫ਼" | "੦".."ੴ" | "ઁ".."ઃ" | "અ".."ઍ" | "એ".."ઑ" | "ઓ".."ન" | "પ".."ર" | "લ".."ળ" | "વ".."હ" | "઼".."ૅ"
   // |
   // "ે".."ૉ" | "ો".."્" | "ૐ" | "ૠ".."ૣ" | "૦".."૯" | "૱" | "ଁ".."ଃ" | "ଅ".."ଌ" | "ଏ".."ଐ" | "ଓ".."ନ" | "ପ".."ର" |
   // "ଲ".."ଳ" | "ଵ".."ହ" | "଼".."ୃ" | "େ".."ୈ" | "ୋ".."୍" | "ୖ".."ୗ" | "ଡ଼".."ଢ଼" | "ୟ".."ୡ" | "୦".."୯" | "ୱ" | "ஂ".."ஃ"
   // |
   // "அ".."ஊ" | "எ".."ஐ" | "ஒ".."க" | "ங".."ச" | "ஜ" | "ஞ".."ட" | "ண".."த" | "ந".."ப" | "ம".."வ" | "ஷ".."ஹ" | "ா".."ூ"
   // |
   // "ெ".."ை" | "ொ".."்" | "ௗ" | "௧".."௯" | "௹" | "ఁ".."ః" | "అ".."ఌ" | "ఎ".."ఐ" | "ఒ".."న" | "ప".."ళ" | "వ".."హ" |
   // "ా".."ౄ" | "ె".."ై" | "ొ".."్" | "ౕ".."ౖ" | "ౠ".."ౡ" | "౦".."౯" | "ಂ".."ಃ" | "ಅ".."ಌ" | "ಎ".."ಐ" | "ಒ".."ನ" |
   // "ಪ".."ಳ" | "ವ".."ಹ" | "಼".."ೄ" | "ೆ".."ೈ" | "ೊ".."್" | "ೕ".."ೖ" | "ೞ" | "ೠ".."ೡ" | "೦".."೯" | "ം".."ഃ" | "അ".."ഌ"
   // |
   // "എ".."ഐ" | "ഒ".."ന" | "പ".."ഹ" | "ാ".."ൃ" | "െ".."ൈ" | "ൊ".."്" | "ൗ" | "ൠ".."ൡ" | "൦".."൯" | "ං".."ඃ" | "අ".."ඖ"
   // |
   // "ක".."න" | "ඳ".."ර" | "ල" | "ව".."ෆ" | "්" | "ා".."ු" | "ූ" | "ෘ".."ෟ" | "ෲ".."ෳ" | "ก".."ฺ" | "฿".."๎" | "๐".."๙"
   // |
   // "ກ".."ຂ" | "ຄ" | "ງ".."ຈ" | "ຊ" | "ຍ" | "ດ".."ທ" | "ນ".."ຟ" | "ມ".."ຣ" | "ລ" | "ວ" | "ສ".."ຫ" | "ອ".."ູ" |
   // "ົ".."ຽ" |
   // "ເ".."ໄ" | "ໆ" | "່".."ໍ" | "໐".."໙" | "ໜ".."ໝ" | "ༀ" | "༘".."༙" | "༠".."༩" | "༵" | "༷" | "༹" | "༾".."ཇ" |
   // "ཉ".."ཪ" |
   // "ཱ".."྄" | "྆".."ྋ" | "ྐ".."ྗ" | "ྙ".."ྼ" | "࿆" | "က".."အ" | "ဣ".."ဧ" | "ဩ".."ဪ" | "ာ".."ဲ" | "ံ".."္" | "၀".."၉"
   // |
   // "ၐ".."ၙ" | "Ⴀ".."Ⴥ" | "ა".."ჸ" | "ᄀ".."ᅙ" | "ᅟ".."ᆢ" | "ᆨ".."ᇹ" | "ሀ".."ሆ" | "ለ".."ቆ" | "ቈ" | "ቊ".."ቍ" | "ቐ".."ቖ"
   // |
   // "ቘ" | "ቚ".."ቝ" | "በ".."ኆ" | "ኈ" | "ኊ".."ኍ" | "ነ".."ኮ" | "ኰ" | "ኲ".."ኵ" | "ኸ".."ኾ" | "ዀ" | "ዂ".."ዅ" | "ወ".."ዎ" |
   // "ዐ".."ዖ" | "ዘ".."ዮ" | "ደ".."ጎ" | "ጐ" | "ጒ".."ጕ" | "ጘ".."ጞ" | "ጠ".."ፆ" | "ፈ".."ፚ" | "፩".."፱" | "Ꭰ".."Ᏼ" | "ᐁ".."ᙬ"
   // |
   // "ᙯ".."ᙶ" | "ᚁ".."ᚚ" | "ᚠ".."ᛪ" | "ᛮ".."ᛰ" | "ᜀ".."ᜌ" | "ᜎ".."᜔" | "ᜠ".."᜴" | "ᝀ".."ᝓ" | "ᝠ".."ᝬ" | "ᝮ".."ᝰ" |
   // "ᝲ".."ᝳ" | "ក".."៓" | "ៗ" | "៛".."៝" | "០".."៩" | "᠋".."᠍" | "᠐".."᠙" | "ᠠ".."ᡷ" | "ᢀ".."ᢩ" | "ᤀ".."ᤜ" | "ᤠ".."ᤫ"
   // |
   // "ᤰ".."᤻" | "᥆".."ᥭ" | "ᥰ".."ᥴ" | "ᴀ".."ᵫ" | "Ḁ".."ẛ" | "Ạ".."ỹ" | "ἀ".."ἕ" | "Ἐ".."Ἕ" | "ἠ".."ὅ" | "Ὀ".."Ὅ" |
   // "ὐ".."ὗ" | "Ὑ" | "Ὓ" | "Ὕ" | "Ὗ".."ώ" | "ᾀ".."ᾴ" | "ᾶ".."ᾼ" | "ι" | "ῂ".."ῄ" | "ῆ".."ῌ" | "ῐ".."ΐ" | "ῖ".."Ί" |
   // "ῠ".."Ῥ" | "ῲ".."ῴ" | "ῶ".."ῼ" | "‌".."‏" | "‪".."‮" | "‿".."⁀" | "⁔" | "⁠".."⁣" | "⁪".."⁯" | "ⁱ" | "ⁿ" | "₠".."₱"
   // |
   // "⃐".."⃜" | "⃡" | "⃥".."⃪" | "ℂ" | "ℇ" | "ℊ".."ℓ" | "ℕ" | "ℙ".."ℝ" | "ℤ" | "Ω" | "ℨ" | "K".."ℭ" | "ℯ".."ℱ" |
   // "ℳ".."ℹ"
   // | "ℽ".."ℿ" | "ⅅ".."ⅉ" | "Ⅰ".."Ↄ" | "々".."〇" | "〡".."〯" | "〱".."〵" | "〸".."〼" | "ぁ".."ゖ" | "゙".."゚" | "ゝ".."ゟ" |
   // "ァ".."ヿ" | "ㄅ".."ㄬ" | "ㄱ".."ㆎ" | "ㆠ".."ㆷ" | "ㇰ".."ㇿ" | "㐀".."䶵" | "一".."龥" | "ꀀ".."ꒌ" | "가".."힣" | "豈".."鶴" |
   // "侮".."頻" | "ﬀ".."ﬆ" | "ﬓ".."ﬗ" | "יִ".."ﬨ" | "שׁ".."זּ" | "טּ".."לּ" | "מּ" | "נּ".."סּ" | "ףּ".."פּ" | "צּ".."ﮱ" | "ﯓ".."ﴽ"
   // |
   // "ﵐ".."ﶏ" | "ﶒ".."ﷇ" | "ﷰ".."﷼" | "︀".."️" | "︠".."︣" | "︳".."︴" | "﹍".."﹏" | "﹩" | "ﹰ".."ﹴ" | "ﹶ".."ﻼ" | "﻿" | "＄"
   // |
   // "０".."９" | "Ａ".."Ｚ" | "＿" | "ａ".."ｚ" | "･".."ﾾ" | "ￂ".."ￇ" | "ￊ".."ￏ" | "ￒ".."ￗ" | "ￚ".."ￜ" | "￠".."￡" | "￥".."￦"
   // |
   // "￹".."￻" | "?".."?" "?".."?";
   public TerminalRule getJavaLetterOrDigitRule() {
      return gaLiterals.getJavaLetterOrDigitRule();
   }

   // terminal ML_COMMENT:
   // "/ *"->"* /";
   public TerminalRule getML_COMMENTRule() {
      return gaLiterals.getML_COMMENTRule();
   }

   // terminal SL_COMMENT:
   // "//" !("\n" | "\r")* ("\r"? "\n")?;
   public TerminalRule getSL_COMMENTRule() {
      return gaLiterals.getSL_COMMENTRule();
   }

   // terminal WS:
   // (" " | "\t" | "\r" | "\n")+;
   public TerminalRule getWSRule() {
      return gaLiterals.getWSRule();
   }
}
