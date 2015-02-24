
package org.sourcepit.java.literals.parser.antlr.internal;

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
public class InternalLiteralsLexer extends Lexer {
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

   public InternalLiteralsLexer() {
      ;
   }

   public InternalLiteralsLexer(CharStream input) {
      this(input, new RecognizerSharedState());
   }

   public InternalLiteralsLexer(CharStream input, RecognizerSharedState state) {
      super(input, state);

   }

   public String getGrammarFileName() {
      return "../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g";
   }

   // $ANTLR start "T__57"
   public final void mT__57() throws RecognitionException {
      try {
         int _type = T__57;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:11:7:
         // ( '@' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:11:9:
         // '@'
         {
            match('@');

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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:12:7:
         // ( 'public' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:12:9:
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

   // $ANTLR end "T__58"

   // $ANTLR start "RULE_DECIMALINTEGERLITERAL"
   public final void mRULE_DECIMALINTEGERLITERAL() throws RecognitionException {
      try {
         int _type = RULE_DECIMALINTEGERLITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:533:28:
         // ( RULE_DECIMALNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:533:30:
         // RULE_DECIMALNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_DECIMALNUMERAL();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:533:50:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt1 = 2;
            int LA1_0 = input.LA(1);

            if ((LA1_0 == 'L' || LA1_0 == 'l')) {
               alt1 = 1;
            }
            switch (alt1) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:533:50:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:535:24:
         // ( RULE_HEXNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:535:26:
         // RULE_HEXNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_HEXNUMERAL();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:535:42:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt2 = 2;
            int LA2_0 = input.LA(1);

            if ((LA2_0 == 'L' || LA2_0 == 'l')) {
               alt2 = 1;
            }
            switch (alt2) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:535:42:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:537:26:
         // ( RULE_OCTALNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:537:28:
         // RULE_OCTALNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_OCTALNUMERAL();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:537:46:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt3 = 2;
            int LA3_0 = input.LA(1);

            if ((LA3_0 == 'L' || LA3_0 == 'l')) {
               alt3 = 1;
            }
            switch (alt3) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:537:46:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:539:27:
         // ( RULE_BINARYNUMERAL ( RULE_INTEGERTYPESUFFIX )? )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:539:29:
         // RULE_BINARYNUMERAL ( RULE_INTEGERTYPESUFFIX )?
         {
            mRULE_BINARYNUMERAL();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:539:48:
            // ( RULE_INTEGERTYPESUFFIX )?
            int alt4 = 2;
            int LA4_0 = input.LA(1);

            if ((LA4_0 == 'L' || LA4_0 == 'l')) {
               alt4 = 1;
            }
            switch (alt4) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:539:48:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:541:33:
         // ( ( 'l' | 'L' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:541:35:
         // ( 'l' | 'L' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:30:
         // ( ( '0' | RULE_NONZERODIGIT ( RULE_DIGITS )? | RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:32:
         // ( '0' | RULE_NONZERODIGIT ( RULE_DIGITS )? | RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:32:
            // ( '0' | RULE_NONZERODIGIT ( RULE_DIGITS )? | RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS )
            int alt6 = 3;
            int LA6_0 = input.LA(1);

            if ((LA6_0 == '0')) {
               alt6 = 1;
            }
            else if (((LA6_0 >= '1' && LA6_0 <= '9'))) {
               int LA6_2 = input.LA(2);

               if ((LA6_2 == '_')) {
                  alt6 = 3;
               }
               else {
                  alt6 = 2;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 6, 0, input);

               throw nvae;
            }
            switch (alt6) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:33:
               // '0'
               {
                  match('0');

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:37:
               // RULE_NONZERODIGIT ( RULE_DIGITS )?
               {
                  mRULE_NONZERODIGIT();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:55:
                  // ( RULE_DIGITS )?
                  int alt5 = 2;
                  int LA5_0 = input.LA(1);

                  if (((LA5_0 >= '0' && LA5_0 <= '9'))) {
                     alt5 = 1;
                  }
                  switch (alt5) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:55:
                     // RULE_DIGITS
                     {
                        mRULE_DIGITS();

                     }
                        break;

                  }


               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:543:68:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:545:28:
         // ( '1' .. '9' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:545:30:
         // '1' .. '9'
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:22:
         // ( ( RULE_DIGIT | RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:24:
         // ( RULE_DIGIT | RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:24:
            // ( RULE_DIGIT | RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT )
            int alt8 = 2;
            int LA8_0 = input.LA(1);

            if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
               int LA8_1 = input.LA(2);

               if (((LA8_1 >= '0' && LA8_1 <= '9') || LA8_1 == '_')) {
                  alt8 = 2;
               }
               else {
                  alt8 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 8, 0, input);

               throw nvae;
            }
            switch (alt8) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:25:
               // RULE_DIGIT
               {
                  mRULE_DIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:36:
               // RULE_DIGIT ( RULE_DIGITSANDUNDERSCORES )? RULE_DIGIT
               {
                  mRULE_DIGIT();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:47:
                  // ( RULE_DIGITSANDUNDERSCORES )?
                  int alt7 = 2;
                  int LA7_0 = input.LA(1);

                  if (((LA7_0 >= '0' && LA7_0 <= '9'))) {
                     int LA7_1 = input.LA(2);

                     if (((LA7_1 >= '0' && LA7_1 <= '9') || LA7_1 == '_')) {
                        alt7 = 1;
                     }
                  }
                  else if ((LA7_0 == '_')) {
                     alt7 = 1;
                  }
                  switch (alt7) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:547:47:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:549:21:
         // ( ( '0' | RULE_NONZERODIGIT ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:549:23:
         // ( '0' | RULE_NONZERODIGIT )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:551:36:
         // ( RULE_DIGITORUNDERSCORE ( RULE_DIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:551:38:
         // RULE_DIGITORUNDERSCORE ( RULE_DIGITORUNDERSCORE )*
         {
            mRULE_DIGITORUNDERSCORE();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:551:61:
            // ( RULE_DIGITORUNDERSCORE )*
            loop9 : do {
               int alt9 = 2;
               int LA9_0 = input.LA(1);

               if (((LA9_0 >= '0' && LA9_0 <= '9') || LA9_0 == '_')) {
                  alt9 = 1;
               }


               switch (alt9) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:551:61:
                  // RULE_DIGITORUNDERSCORE
                  {
                     mRULE_DIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop9;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:553:33:
         // ( ( RULE_DIGIT | '_' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:553:35:
         // ( RULE_DIGIT | '_' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:555:27:
         // ( ( '_' )+ )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:555:29:
         // ( '_' )+
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:555:29:
            // ( '_' )+
            int cnt10 = 0;
            loop10 : do {
               int alt10 = 2;
               int LA10_0 = input.LA(1);

               if ((LA10_0 == '_')) {
                  alt10 = 1;
               }


               switch (alt10) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:555:29:
                  // '_'
                  {
                     match('_');

                  }
                     break;

                  default :
                     if (cnt10 >= 1)
                        break loop10;
                     EarlyExitException eee = new EarlyExitException(10, input);
                     throw eee;
               }
               cnt10++;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:557:26:
         // ( '0' ( 'x' | 'X' ) RULE_HEXDIGITS )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:557:28:
         // '0' ( 'x' | 'X' ) RULE_HEXDIGITS
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:25:
         // ( ( RULE_HEXDIGIT | RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:27:
         // ( RULE_HEXDIGIT | RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:27:
            // ( RULE_HEXDIGIT | RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT )
            int alt12 = 2;
            int LA12_0 = input.LA(1);

            if (((LA12_0 >= '0' && LA12_0 <= '9') || (LA12_0 >= 'A' && LA12_0 <= 'F') || (LA12_0 >= 'a' && LA12_0 <= 'f'))) {
               int LA12_1 = input.LA(2);

               if (((LA12_1 >= '0' && LA12_1 <= '9') || (LA12_1 >= 'A' && LA12_1 <= 'F') || LA12_1 == '_' || (LA12_1 >= 'a' && LA12_1 <= 'f'))) {
                  alt12 = 2;
               }
               else {
                  alt12 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 12, 0, input);

               throw nvae;
            }
            switch (alt12) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:28:
               // RULE_HEXDIGIT
               {
                  mRULE_HEXDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:42:
               // RULE_HEXDIGIT ( RULE_HEXDIGITSANDUNDERSCORES )? RULE_HEXDIGIT
               {
                  mRULE_HEXDIGIT();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:56:
                  // ( RULE_HEXDIGITSANDUNDERSCORES )?
                  int alt11 = 2;
                  int LA11_0 = input.LA(1);

                  if (((LA11_0 >= '0' && LA11_0 <= '9') || (LA11_0 >= 'A' && LA11_0 <= 'F') || (LA11_0 >= 'a' && LA11_0 <= 'f'))) {
                     int LA11_1 = input.LA(2);

                     if (((LA11_1 >= '0' && LA11_1 <= '9') || (LA11_1 >= 'A' && LA11_1 <= 'F') || LA11_1 == '_' || (LA11_1 >= 'a' && LA11_1 <= 'f'))) {
                        alt11 = 1;
                     }
                  }
                  else if ((LA11_0 == '_')) {
                     alt11 = 1;
                  }
                  switch (alt11) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:559:56:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:561:24:
         // ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:561:26:
         // ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:563:39:
         // ( RULE_HEXDIGITORUNDERSCORE ( RULE_HEXDIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:563:41:
         // RULE_HEXDIGITORUNDERSCORE ( RULE_HEXDIGITORUNDERSCORE )*
         {
            mRULE_HEXDIGITORUNDERSCORE();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:563:67:
            // ( RULE_HEXDIGITORUNDERSCORE )*
            loop13 : do {
               int alt13 = 2;
               int LA13_0 = input.LA(1);

               if (((LA13_0 >= '0' && LA13_0 <= '9') || (LA13_0 >= 'A' && LA13_0 <= 'F') || LA13_0 == '_' || (LA13_0 >= 'a' && LA13_0 <= 'f'))) {
                  alt13 = 1;
               }


               switch (alt13) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:563:67:
                  // RULE_HEXDIGITORUNDERSCORE
                  {
                     mRULE_HEXDIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop13;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:565:36:
         // ( ( RULE_HEXDIGIT | '_' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:565:38:
         // ( RULE_HEXDIGIT | '_' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:567:28:
         // ( ( '0' RULE_OCTALDIGITS | '0' RULE_UNDERSCORES RULE_OCTALDIGITS ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:567:30:
         // ( '0' RULE_OCTALDIGITS | '0' RULE_UNDERSCORES RULE_OCTALDIGITS )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:567:30:
            // ( '0' RULE_OCTALDIGITS | '0' RULE_UNDERSCORES RULE_OCTALDIGITS )
            int alt14 = 2;
            int LA14_0 = input.LA(1);

            if ((LA14_0 == '0')) {
               int LA14_1 = input.LA(2);

               if (((LA14_1 >= '0' && LA14_1 <= '7'))) {
                  alt14 = 1;
               }
               else if ((LA14_1 == '_')) {
                  alt14 = 2;
               }
               else {
                  NoViableAltException nvae = new NoViableAltException("", 14, 1, input);

                  throw nvae;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 14, 0, input);

               throw nvae;
            }
            switch (alt14) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:567:31:
               // '0' RULE_OCTALDIGITS
               {
                  match('0');
                  mRULE_OCTALDIGITS();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:567:52:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:27:
         // ( ( RULE_OCTALDIGIT | RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:29:
         // ( RULE_OCTALDIGIT | RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:29:
            // ( RULE_OCTALDIGIT | RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT )
            int alt16 = 2;
            int LA16_0 = input.LA(1);

            if (((LA16_0 >= '0' && LA16_0 <= '7'))) {
               int LA16_1 = input.LA(2);

               if (((LA16_1 >= '0' && LA16_1 <= '7') || LA16_1 == '_')) {
                  alt16 = 2;
               }
               else {
                  alt16 = 1;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 16, 0, input);

               throw nvae;
            }
            switch (alt16) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:30:
               // RULE_OCTALDIGIT
               {
                  mRULE_OCTALDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:46:
               // RULE_OCTALDIGIT ( RULE_OCTALDIGITSANDUNDERSCORES )? RULE_OCTALDIGIT
               {
                  mRULE_OCTALDIGIT();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:62:
                  // ( RULE_OCTALDIGITSANDUNDERSCORES )?
                  int alt15 = 2;
                  int LA15_0 = input.LA(1);

                  if (((LA15_0 >= '0' && LA15_0 <= '7'))) {
                     int LA15_1 = input.LA(2);

                     if (((LA15_1 >= '0' && LA15_1 <= '7') || LA15_1 == '_')) {
                        alt15 = 1;
                     }
                  }
                  else if ((LA15_0 == '_')) {
                     alt15 = 1;
                  }
                  switch (alt15) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:569:62:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:571:26:
         // ( '0' .. '7' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:571:28:
         // '0' .. '7'
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:573:41:
         // ( RULE_OCTALDIGITORUNDERSCORE ( RULE_OCTALDIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:573:43:
         // RULE_OCTALDIGITORUNDERSCORE ( RULE_OCTALDIGITORUNDERSCORE )*
         {
            mRULE_OCTALDIGITORUNDERSCORE();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:573:71:
            // ( RULE_OCTALDIGITORUNDERSCORE )*
            loop17 : do {
               int alt17 = 2;
               int LA17_0 = input.LA(1);

               if (((LA17_0 >= '0' && LA17_0 <= '7') || LA17_0 == '_')) {
                  alt17 = 1;
               }


               switch (alt17) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:573:71:
                  // RULE_OCTALDIGITORUNDERSCORE
                  {
                     mRULE_OCTALDIGITORUNDERSCORE();

                  }
                     break;

                  default :
                     break loop17;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:575:38:
         // ( ( RULE_OCTALDIGIT | '_' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:575:40:
         // ( RULE_OCTALDIGIT | '_' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:577:29:
         // ( '0' ( 'b' | 'B' ) RULE_BINARYDIGITS )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:577:31:
         // '0' ( 'b' | 'B' ) RULE_BINARYDIGITS
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:28:
         // ( ( RULE_BINARYDIGIT | RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:30:
         // ( RULE_BINARYDIGIT | RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:30:
            // ( RULE_BINARYDIGIT | RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT )
            int alt19 = 2;
            int LA19_0 = input.LA(1);

            if (((LA19_0 >= '0' && LA19_0 <= '1'))) {
               int LA19_1 = input.LA(2);

               if (((LA19_1 >= '0' && LA19_1 <= '1') || LA19_1 == '_')) {
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
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:31:
               // RULE_BINARYDIGIT
               {
                  mRULE_BINARYDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:48:
               // RULE_BINARYDIGIT ( RULE_BINARYDIGITSANDUNDERSCORES )? RULE_BINARYDIGIT
               {
                  mRULE_BINARYDIGIT();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:65:
                  // ( RULE_BINARYDIGITSANDUNDERSCORES )?
                  int alt18 = 2;
                  int LA18_0 = input.LA(1);

                  if (((LA18_0 >= '0' && LA18_0 <= '1'))) {
                     int LA18_1 = input.LA(2);

                     if (((LA18_1 >= '0' && LA18_1 <= '1') || LA18_1 == '_')) {
                        alt18 = 1;
                     }
                  }
                  else if ((LA18_0 == '_')) {
                     alt18 = 1;
                  }
                  switch (alt18) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:579:65:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:581:27:
         // ( ( '0' | '1' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:581:29:
         // ( '0' | '1' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:583:42:
         // ( RULE_BINARYDIGITORUNDERSCORE ( RULE_BINARYDIGITORUNDERSCORE )* )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:583:44:
         // RULE_BINARYDIGITORUNDERSCORE ( RULE_BINARYDIGITORUNDERSCORE )*
         {
            mRULE_BINARYDIGITORUNDERSCORE();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:583:73:
            // ( RULE_BINARYDIGITORUNDERSCORE )*
            loop20 : do {
               int alt20 = 2;
               int LA20_0 = input.LA(1);

               if (((LA20_0 >= '0' && LA20_0 <= '1') || LA20_0 == '_')) {
                  alt20 = 1;
               }


               switch (alt20) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:583:73:
                  // RULE_BINARYDIGITORUNDERSCORE
                  {
                     mRULE_BINARYDIGITORUNDERSCORE();

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

   // $ANTLR end "RULE_BINARYDIGITSANDUNDERSCORES"

   // $ANTLR start "RULE_BINARYDIGITORUNDERSCORE"
   public final void mRULE_BINARYDIGITORUNDERSCORE() throws RecognitionException {
      try {
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:585:39:
         // ( ( RULE_BINARYDIGIT | '_' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:585:41:
         // ( RULE_BINARYDIGIT | '_' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:34:
         // ( ( RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS (
         // RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )? |
         // RULE_DIGITS RULE_FLOATTYPESUFFIX ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:36:
         // ( RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS (
         // RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )? |
         // RULE_DIGITS RULE_FLOATTYPESUFFIX )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:36:
            // ( RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS (
            // RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )?
            // | RULE_DIGITS RULE_FLOATTYPESUFFIX )
            int alt27 = 4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:37:
               // RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )?
               {
                  mRULE_DIGITS();
                  match('.');
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:53:
                  // ( RULE_DIGITS )?
                  int alt21 = 2;
                  int LA21_0 = input.LA(1);

                  if (((LA21_0 >= '0' && LA21_0 <= '9'))) {
                     alt21 = 1;
                  }
                  switch (alt21) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:53:
                     // RULE_DIGITS
                     {
                        mRULE_DIGITS();

                     }
                        break;

                  }

                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:66:
                  // ( RULE_EXPONENTPART )?
                  int alt22 = 2;
                  int LA22_0 = input.LA(1);

                  if ((LA22_0 == 'E' || LA22_0 == 'e')) {
                     alt22 = 1;
                  }
                  switch (alt22) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:66:
                     // RULE_EXPONENTPART
                     {
                        mRULE_EXPONENTPART();

                     }
                        break;

                  }

                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:85:
                  // ( RULE_FLOATTYPESUFFIX )?
                  int alt23 = 2;
                  int LA23_0 = input.LA(1);

                  if ((LA23_0 == 'D' || LA23_0 == 'F' || LA23_0 == 'd' || LA23_0 == 'f')) {
                     alt23 = 1;
                  }
                  switch (alt23) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:85:
                     // RULE_FLOATTYPESUFFIX
                     {
                        mRULE_FLOATTYPESUFFIX();

                     }
                        break;

                  }


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:107:
               // '.' RULE_DIGITS ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )?
               {
                  match('.');
                  mRULE_DIGITS();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:123:
                  // ( RULE_EXPONENTPART )?
                  int alt24 = 2;
                  int LA24_0 = input.LA(1);

                  if ((LA24_0 == 'E' || LA24_0 == 'e')) {
                     alt24 = 1;
                  }
                  switch (alt24) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:123:
                     // RULE_EXPONENTPART
                     {
                        mRULE_EXPONENTPART();

                     }
                        break;

                  }

                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:142:
                  // ( RULE_FLOATTYPESUFFIX )?
                  int alt25 = 2;
                  int LA25_0 = input.LA(1);

                  if ((LA25_0 == 'D' || LA25_0 == 'F' || LA25_0 == 'd' || LA25_0 == 'f')) {
                     alt25 = 1;
                  }
                  switch (alt25) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:142:
                     // RULE_FLOATTYPESUFFIX
                     {
                        mRULE_FLOATTYPESUFFIX();

                     }
                        break;

                  }


               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:164:
               // RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )?
               {
                  mRULE_DIGITS();
                  mRULE_EXPONENTPART();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:194:
                  // ( RULE_FLOATTYPESUFFIX )?
                  int alt26 = 2;
                  int LA26_0 = input.LA(1);

                  if ((LA26_0 == 'D' || LA26_0 == 'F' || LA26_0 == 'd' || LA26_0 == 'f')) {
                     alt26 = 1;
                  }
                  switch (alt26) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:194:
                     // RULE_FLOATTYPESUFFIX
                     {
                        mRULE_FLOATTYPESUFFIX();

                     }
                        break;

                  }


               }
                  break;
               case 4 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:587:216:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:589:28:
         // ( RULE_EXPONENTINDICATOR RULE_SIGNEDINTEGER )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:589:30:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:591:33:
         // ( ( 'e' | 'E' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:591:35:
         // ( 'e' | 'E' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:593:29:
         // ( ( RULE_SIGN )? RULE_DIGITS )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:593:31:
         // ( RULE_SIGN )? RULE_DIGITS
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:593:31:
            // ( RULE_SIGN )?
            int alt28 = 2;
            int LA28_0 = input.LA(1);

            if ((LA28_0 == '+' || LA28_0 == '-')) {
               alt28 = 1;
            }
            switch (alt28) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:593:31:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:595:20:
         // ( ( '+' | '-' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:595:22:
         // ( '+' | '-' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:597:31:
         // ( ( 'f' | 'F' | 'd' | 'D' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:597:33:
         // ( 'f' | 'F' | 'd' | 'D' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:599:38:
         // ( RULE_HEXSIGNIFICAND RULE_BINARYEXPONENT ( RULE_FLOATTYPESUFFIX )? )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:599:40:
         // RULE_HEXSIGNIFICAND RULE_BINARYEXPONENT ( RULE_FLOATTYPESUFFIX )?
         {
            mRULE_HEXSIGNIFICAND();
            mRULE_BINARYEXPONENT();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:599:80:
            // ( RULE_FLOATTYPESUFFIX )?
            int alt29 = 2;
            int LA29_0 = input.LA(1);

            if ((LA29_0 == 'D' || LA29_0 == 'F' || LA29_0 == 'd' || LA29_0 == 'f')) {
               alt29 = 1;
            }
            switch (alt29) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:599:80:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:30:
         // ( ( RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:32:
         // ( RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:32:
            // ( RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ )
            int alt33 = 2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:33:
               // RULE_HEXNUMERAL ( '.' )?
               {
                  mRULE_HEXNUMERAL();
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:49:
                  // ( '.' )?
                  int alt30 = 2;
                  int LA30_0 = input.LA(1);

                  if ((LA30_0 == '.')) {
                     alt30 = 1;
                  }
                  switch (alt30) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:49:
                     // '.'
                     {
                        match('.');

                     }
                        break;

                  }


               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:54:
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

                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:68:
                  // ( RULE_HEXDIGIT )*
                  loop31 : do {
                     int alt31 = 2;
                     int LA31_0 = input.LA(1);

                     if (((LA31_0 >= '0' && LA31_0 <= '9') || (LA31_0 >= 'A' && LA31_0 <= 'F') || (LA31_0 >= 'a' && LA31_0 <= 'f'))) {
                        alt31 = 1;
                     }


                     switch (alt31) {
                        case 1 :
                        // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:68:
                        // RULE_HEXDIGIT
                        {
                           mRULE_HEXDIGIT();

                        }
                           break;

                        default :
                           break loop31;
                     }
                  }
                  while (true);

                  match('.');
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:87:
                  // ( RULE_HEXDIGIT )+
                  int cnt32 = 0;
                  loop32 : do {
                     int alt32 = 2;
                     int LA32_0 = input.LA(1);

                     if (((LA32_0 >= '0' && LA32_0 <= '9') || (LA32_0 >= 'A' && LA32_0 <= 'F') || (LA32_0 >= 'a' && LA32_0 <= 'f'))) {
                        alt32 = 1;
                     }


                     switch (alt32) {
                        case 1 :
                        // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:601:87:
                        // RULE_HEXDIGIT
                        {
                           mRULE_HEXDIGIT();

                        }
                           break;

                        default :
                           if (cnt32 >= 1)
                              break loop32;
                           EarlyExitException eee = new EarlyExitException(32, input);
                           throw eee;
                     }
                     cnt32++;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:603:30:
         // ( RULE_BINARYEXPONENTINDICATOR RULE_SIGNEDINTEGER )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:603:32:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:605:39:
         // ( ( 'p' | 'P' ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:605:41:
         // ( 'p' | 'P' )
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:607:11:
         // ( 'true' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:607:13:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:609:12:
         // ( 'false' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:609:14:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:611:16:
         // ( '\\'' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\'' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:611:18:
         // '\\'' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\''
         {
            match('\'');
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:611:23:
            // ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) )
            int alt34 = 2;
            int LA34_0 = input.LA(1);

            if ((LA34_0 == '\\')) {
               alt34 = 1;
            }
            else if (((LA34_0 >= '\u0000' && LA34_0 <= '&') || (LA34_0 >= '(' && LA34_0 <= '[') || (LA34_0 >= ']' && LA34_0 <= '\uFFFF'))) {
               alt34 = 2;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 34, 0, input);

               throw nvae;
            }
            switch (alt34) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:611:24:
               // RULE_ESCAPESEQUENCE
               {
                  mRULE_ESCAPESEQUENCE();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:611:44:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:613:13:
         // ( '\"' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:613:15:
         // '\"' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
         {
            match('\"');
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:613:19:
            // ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )*
            loop35 : do {
               int alt35 = 3;
               int LA35_0 = input.LA(1);

               if ((LA35_0 == '\\')) {
                  alt35 = 1;
               }
               else if (((LA35_0 >= '\u0000' && LA35_0 <= '!') || (LA35_0 >= '#' && LA35_0 <= '[') || (LA35_0 >= ']' && LA35_0 <= '\uFFFF'))) {
                  alt35 = 2;
               }


               switch (alt35) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:613:20:
                  // RULE_ESCAPESEQUENCE
                  {
                     mRULE_ESCAPESEQUENCE();

                  }
                     break;
                  case 2 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:613:40:
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
                     break loop35;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:615:30:
         // ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODEESCAPE | RULE_OCTALESCAPE )
         // )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:615:32:
         // ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODEESCAPE | RULE_OCTALESCAPE )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:615:32:
            // ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODEESCAPE | RULE_OCTALESCAPE
            // )
            int alt36 = 3;
            int LA36_0 = input.LA(1);

            if ((LA36_0 == '\\')) {
               switch (input.LA(2)) {
                  case '\"' :
                  case '\'' :
                  case '\\' :
                  case 'b' :
                  case 'f' :
                  case 'n' :
                  case 'r' :
                  case 't' : {
                     alt36 = 1;
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
                     alt36 = 3;
                  }
                     break;
                  case 'u' : {
                     alt36 = 2;
                  }
                     break;
                  default :
                     NoViableAltException nvae = new NoViableAltException("", 36, 1, input);

                     throw nvae;
               }

            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 36, 0, input);

               throw nvae;
            }
            switch (alt36) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:615:33:
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
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:615:74:
               // RULE_UNICODEESCAPE
               {
                  mRULE_UNICODEESCAPE();

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:615:93:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:617:27:
         // ( ( '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT |
         // '\\\\' RULE_OCTALDIGIT ) )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:617:29:
         // ( '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\'
         // RULE_OCTALDIGIT )
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:617:29:
            // ( '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT | '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT |
            // '\\\\' RULE_OCTALDIGIT )
            int alt37 = 3;
            int LA37_0 = input.LA(1);

            if ((LA37_0 == '\\')) {
               int LA37_1 = input.LA(2);

               if (((LA37_1 >= '0' && LA37_1 <= '3'))) {
                  int LA37_2 = input.LA(3);

                  if (((LA37_2 >= '0' && LA37_2 <= '7'))) {
                     int LA37_5 = input.LA(4);

                     if (((LA37_5 >= '0' && LA37_5 <= '7'))) {
                        alt37 = 1;
                     }
                     else {
                        alt37 = 2;
                     }
                  }
                  else {
                     alt37 = 3;
                  }
               }
               else if (((LA37_1 >= '4' && LA37_1 <= '7'))) {
                  int LA37_3 = input.LA(3);

                  if (((LA37_3 >= '0' && LA37_3 <= '7'))) {
                     alt37 = 2;
                  }
                  else {
                     alt37 = 3;
                  }
               }
               else {
                  NoViableAltException nvae = new NoViableAltException("", 37, 1, input);

                  throw nvae;
               }
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 37, 0, input);

               throw nvae;
            }
            switch (alt37) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:617:30:
               // '\\\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT
               {
                  match('\\');
                  mRULE_ZEROTOTHREE();
                  mRULE_OCTALDIGIT();
                  mRULE_OCTALDIGIT();

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:617:84:
               // '\\\\' RULE_OCTALDIGIT RULE_OCTALDIGIT
               {
                  match('\\');
                  mRULE_OCTALDIGIT();
                  mRULE_OCTALDIGIT();

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:617:121:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:619:27:
         // ( '0' .. '3' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:619:29:
         // '0' .. '3'
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:621:29:
         // ( '\\\\' RULE_UNICODEMARKER RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:621:31:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:623:29:
         // ( 'u' ( 'u' )* )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:623:31:
         // 'u' ( 'u' )*
         {
            match('u');
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:623:35:
            // ( 'u' )*
            loop38 : do {
               int alt38 = 2;
               int LA38_0 = input.LA(1);

               if ((LA38_0 == 'u')) {
                  alt38 = 1;
               }


               switch (alt38) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:623:35:
                  // 'u'
                  {
                     match('u');

                  }
                     break;

                  default :
                     break loop38;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:625:11:
         // ( 'null' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:625:13:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:627:17:
         // ( RULE_JAVALETTER ( RULE_JAVALETTERORDIGIT )* )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:627:19:
         // RULE_JAVALETTER ( RULE_JAVALETTERORDIGIT )*
         {
            mRULE_JAVALETTER();
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:627:35:
            // ( RULE_JAVALETTERORDIGIT )*
            loop39 : do {
               int alt39 = 2;
               int LA39_0 = input.LA(1);

               if (((LA39_0 >= '\u0000' && LA39_0 <= '\b') || (LA39_0 >= '\u000E' && LA39_0 <= '\u001B')
                  || LA39_0 == '$' || (LA39_0 >= '0' && LA39_0 <= '9') || (LA39_0 >= 'A' && LA39_0 <= 'Z')
                  || LA39_0 == '_' || (LA39_0 >= 'a' && LA39_0 <= 'z') || (LA39_0 >= '\u007F' && LA39_0 <= '\u009F')
                  || (LA39_0 >= '\u00A2' && LA39_0 <= '\u00A5') || LA39_0 == '\u00AA' || LA39_0 == '\u00AD'
                  || LA39_0 == '\u00B5' || LA39_0 == '\u00BA' || (LA39_0 >= '\u00C0' && LA39_0 <= '\u00D6')
                  || (LA39_0 >= '\u00D8' && LA39_0 <= '\u00F6') || (LA39_0 >= '\u00F8' && LA39_0 <= '\u0236')
                  || (LA39_0 >= '\u0250' && LA39_0 <= '\u02C1') || (LA39_0 >= '\u02C6' && LA39_0 <= '\u02D1')
                  || (LA39_0 >= '\u02E0' && LA39_0 <= '\u02E4') || LA39_0 == '\u02EE'
                  || (LA39_0 >= '\u0300' && LA39_0 <= '\u0357') || (LA39_0 >= '\u035D' && LA39_0 <= '\u036F')
                  || LA39_0 == '\u037A' || LA39_0 == '\u0386' || (LA39_0 >= '\u0388' && LA39_0 <= '\u038A')
                  || LA39_0 == '\u038C' || (LA39_0 >= '\u038E' && LA39_0 <= '\u03A1')
                  || (LA39_0 >= '\u03A3' && LA39_0 <= '\u03CE') || (LA39_0 >= '\u03D0' && LA39_0 <= '\u03F5')
                  || (LA39_0 >= '\u03F7' && LA39_0 <= '\u03FB') || (LA39_0 >= '\u0400' && LA39_0 <= '\u0481')
                  || (LA39_0 >= '\u0483' && LA39_0 <= '\u0486') || (LA39_0 >= '\u048A' && LA39_0 <= '\u04CE')
                  || (LA39_0 >= '\u04D0' && LA39_0 <= '\u04F5') || (LA39_0 >= '\u04F8' && LA39_0 <= '\u04F9')
                  || (LA39_0 >= '\u0500' && LA39_0 <= '\u050F') || (LA39_0 >= '\u0531' && LA39_0 <= '\u0556')
                  || LA39_0 == '\u0559' || (LA39_0 >= '\u0561' && LA39_0 <= '\u0587')
                  || (LA39_0 >= '\u0591' && LA39_0 <= '\u05A1') || (LA39_0 >= '\u05A3' && LA39_0 <= '\u05B9')
                  || (LA39_0 >= '\u05BB' && LA39_0 <= '\u05BD') || LA39_0 == '\u05BF'
                  || (LA39_0 >= '\u05C1' && LA39_0 <= '\u05C2') || LA39_0 == '\u05C4'
                  || (LA39_0 >= '\u05D0' && LA39_0 <= '\u05EA') || (LA39_0 >= '\u05F0' && LA39_0 <= '\u05F2')
                  || (LA39_0 >= '\u0600' && LA39_0 <= '\u0603') || (LA39_0 >= '\u0610' && LA39_0 <= '\u0615')
                  || (LA39_0 >= '\u0621' && LA39_0 <= '\u063A') || (LA39_0 >= '\u0640' && LA39_0 <= '\u0658')
                  || (LA39_0 >= '\u0660' && LA39_0 <= '\u0669') || (LA39_0 >= '\u066E' && LA39_0 <= '\u06D3')
                  || (LA39_0 >= '\u06D5' && LA39_0 <= '\u06DD') || (LA39_0 >= '\u06DF' && LA39_0 <= '\u06E8')
                  || (LA39_0 >= '\u06EA' && LA39_0 <= '\u06FC') || LA39_0 == '\u06FF'
                  || (LA39_0 >= '\u070F' && LA39_0 <= '\u074A') || (LA39_0 >= '\u074D' && LA39_0 <= '\u074F')
                  || (LA39_0 >= '\u0780' && LA39_0 <= '\u07B1') || (LA39_0 >= '\u0901' && LA39_0 <= '\u0939')
                  || (LA39_0 >= '\u093C' && LA39_0 <= '\u094D') || (LA39_0 >= '\u0950' && LA39_0 <= '\u0954')
                  || (LA39_0 >= '\u0958' && LA39_0 <= '\u0963') || (LA39_0 >= '\u0966' && LA39_0 <= '\u096F')
                  || (LA39_0 >= '\u0981' && LA39_0 <= '\u0983') || (LA39_0 >= '\u0985' && LA39_0 <= '\u098C')
                  || (LA39_0 >= '\u098F' && LA39_0 <= '\u0990') || (LA39_0 >= '\u0993' && LA39_0 <= '\u09A8')
                  || (LA39_0 >= '\u09AA' && LA39_0 <= '\u09B0') || LA39_0 == '\u09B2'
                  || (LA39_0 >= '\u09B6' && LA39_0 <= '\u09B9') || (LA39_0 >= '\u09BC' && LA39_0 <= '\u09C4')
                  || (LA39_0 >= '\u09C7' && LA39_0 <= '\u09C8') || (LA39_0 >= '\u09CB' && LA39_0 <= '\u09CD')
                  || LA39_0 == '\u09D7' || (LA39_0 >= '\u09DC' && LA39_0 <= '\u09DD')
                  || (LA39_0 >= '\u09DF' && LA39_0 <= '\u09E3') || (LA39_0 >= '\u09E6' && LA39_0 <= '\u09F3')
                  || (LA39_0 >= '\u0A01' && LA39_0 <= '\u0A03') || (LA39_0 >= '\u0A05' && LA39_0 <= '\u0A0A')
                  || (LA39_0 >= '\u0A0F' && LA39_0 <= '\u0A10') || (LA39_0 >= '\u0A13' && LA39_0 <= '\u0A28')
                  || (LA39_0 >= '\u0A2A' && LA39_0 <= '\u0A30') || (LA39_0 >= '\u0A32' && LA39_0 <= '\u0A33')
                  || (LA39_0 >= '\u0A35' && LA39_0 <= '\u0A36') || (LA39_0 >= '\u0A38' && LA39_0 <= '\u0A39')
                  || LA39_0 == '\u0A3C' || (LA39_0 >= '\u0A3E' && LA39_0 <= '\u0A42')
                  || (LA39_0 >= '\u0A47' && LA39_0 <= '\u0A48') || (LA39_0 >= '\u0A4B' && LA39_0 <= '\u0A4D')
                  || (LA39_0 >= '\u0A59' && LA39_0 <= '\u0A5C') || LA39_0 == '\u0A5E'
                  || (LA39_0 >= '\u0A66' && LA39_0 <= '\u0A74') || (LA39_0 >= '\u0A81' && LA39_0 <= '\u0A83')
                  || (LA39_0 >= '\u0A85' && LA39_0 <= '\u0A8D') || (LA39_0 >= '\u0A8F' && LA39_0 <= '\u0A91')
                  || (LA39_0 >= '\u0A93' && LA39_0 <= '\u0AA8') || (LA39_0 >= '\u0AAA' && LA39_0 <= '\u0AB0')
                  || (LA39_0 >= '\u0AB2' && LA39_0 <= '\u0AB3') || (LA39_0 >= '\u0AB5' && LA39_0 <= '\u0AB9')
                  || (LA39_0 >= '\u0ABC' && LA39_0 <= '\u0AC5') || (LA39_0 >= '\u0AC7' && LA39_0 <= '\u0AC9')
                  || (LA39_0 >= '\u0ACB' && LA39_0 <= '\u0ACD') || LA39_0 == '\u0AD0'
                  || (LA39_0 >= '\u0AE0' && LA39_0 <= '\u0AE3') || (LA39_0 >= '\u0AE6' && LA39_0 <= '\u0AEF')
                  || LA39_0 == '\u0AF1' || (LA39_0 >= '\u0B01' && LA39_0 <= '\u0B03')
                  || (LA39_0 >= '\u0B05' && LA39_0 <= '\u0B0C') || (LA39_0 >= '\u0B0F' && LA39_0 <= '\u0B10')
                  || (LA39_0 >= '\u0B13' && LA39_0 <= '\u0B28') || (LA39_0 >= '\u0B2A' && LA39_0 <= '\u0B30')
                  || (LA39_0 >= '\u0B32' && LA39_0 <= '\u0B33') || (LA39_0 >= '\u0B35' && LA39_0 <= '\u0B39')
                  || (LA39_0 >= '\u0B3C' && LA39_0 <= '\u0B43') || (LA39_0 >= '\u0B47' && LA39_0 <= '\u0B48')
                  || (LA39_0 >= '\u0B4B' && LA39_0 <= '\u0B4D') || (LA39_0 >= '\u0B56' && LA39_0 <= '\u0B57')
                  || (LA39_0 >= '\u0B5C' && LA39_0 <= '\u0B5D') || (LA39_0 >= '\u0B5F' && LA39_0 <= '\u0B61')
                  || (LA39_0 >= '\u0B66' && LA39_0 <= '\u0B6F') || LA39_0 == '\u0B71'
                  || (LA39_0 >= '\u0B82' && LA39_0 <= '\u0B83') || (LA39_0 >= '\u0B85' && LA39_0 <= '\u0B8A')
                  || (LA39_0 >= '\u0B8E' && LA39_0 <= '\u0B90') || (LA39_0 >= '\u0B92' && LA39_0 <= '\u0B95')
                  || (LA39_0 >= '\u0B99' && LA39_0 <= '\u0B9A') || LA39_0 == '\u0B9C'
                  || (LA39_0 >= '\u0B9E' && LA39_0 <= '\u0B9F') || (LA39_0 >= '\u0BA3' && LA39_0 <= '\u0BA4')
                  || (LA39_0 >= '\u0BA8' && LA39_0 <= '\u0BAA') || (LA39_0 >= '\u0BAE' && LA39_0 <= '\u0BB5')
                  || (LA39_0 >= '\u0BB7' && LA39_0 <= '\u0BB9') || (LA39_0 >= '\u0BBE' && LA39_0 <= '\u0BC2')
                  || (LA39_0 >= '\u0BC6' && LA39_0 <= '\u0BC8') || (LA39_0 >= '\u0BCA' && LA39_0 <= '\u0BCD')
                  || LA39_0 == '\u0BD7' || (LA39_0 >= '\u0BE7' && LA39_0 <= '\u0BEF') || LA39_0 == '\u0BF9'
                  || (LA39_0 >= '\u0C01' && LA39_0 <= '\u0C03') || (LA39_0 >= '\u0C05' && LA39_0 <= '\u0C0C')
                  || (LA39_0 >= '\u0C0E' && LA39_0 <= '\u0C10') || (LA39_0 >= '\u0C12' && LA39_0 <= '\u0C28')
                  || (LA39_0 >= '\u0C2A' && LA39_0 <= '\u0C33') || (LA39_0 >= '\u0C35' && LA39_0 <= '\u0C39')
                  || (LA39_0 >= '\u0C3E' && LA39_0 <= '\u0C44') || (LA39_0 >= '\u0C46' && LA39_0 <= '\u0C48')
                  || (LA39_0 >= '\u0C4A' && LA39_0 <= '\u0C4D') || (LA39_0 >= '\u0C55' && LA39_0 <= '\u0C56')
                  || (LA39_0 >= '\u0C60' && LA39_0 <= '\u0C61') || (LA39_0 >= '\u0C66' && LA39_0 <= '\u0C6F')
                  || (LA39_0 >= '\u0C82' && LA39_0 <= '\u0C83') || (LA39_0 >= '\u0C85' && LA39_0 <= '\u0C8C')
                  || (LA39_0 >= '\u0C8E' && LA39_0 <= '\u0C90') || (LA39_0 >= '\u0C92' && LA39_0 <= '\u0CA8')
                  || (LA39_0 >= '\u0CAA' && LA39_0 <= '\u0CB3') || (LA39_0 >= '\u0CB5' && LA39_0 <= '\u0CB9')
                  || (LA39_0 >= '\u0CBC' && LA39_0 <= '\u0CC4') || (LA39_0 >= '\u0CC6' && LA39_0 <= '\u0CC8')
                  || (LA39_0 >= '\u0CCA' && LA39_0 <= '\u0CCD') || (LA39_0 >= '\u0CD5' && LA39_0 <= '\u0CD6')
                  || LA39_0 == '\u0CDE' || (LA39_0 >= '\u0CE0' && LA39_0 <= '\u0CE1')
                  || (LA39_0 >= '\u0CE6' && LA39_0 <= '\u0CEF') || (LA39_0 >= '\u0D02' && LA39_0 <= '\u0D03')
                  || (LA39_0 >= '\u0D05' && LA39_0 <= '\u0D0C') || (LA39_0 >= '\u0D0E' && LA39_0 <= '\u0D10')
                  || (LA39_0 >= '\u0D12' && LA39_0 <= '\u0D28') || (LA39_0 >= '\u0D2A' && LA39_0 <= '\u0D39')
                  || (LA39_0 >= '\u0D3E' && LA39_0 <= '\u0D43') || (LA39_0 >= '\u0D46' && LA39_0 <= '\u0D48')
                  || (LA39_0 >= '\u0D4A' && LA39_0 <= '\u0D4D') || LA39_0 == '\u0D57'
                  || (LA39_0 >= '\u0D60' && LA39_0 <= '\u0D61') || (LA39_0 >= '\u0D66' && LA39_0 <= '\u0D6F')
                  || (LA39_0 >= '\u0D82' && LA39_0 <= '\u0D83') || (LA39_0 >= '\u0D85' && LA39_0 <= '\u0D96')
                  || (LA39_0 >= '\u0D9A' && LA39_0 <= '\u0DB1') || (LA39_0 >= '\u0DB3' && LA39_0 <= '\u0DBB')
                  || LA39_0 == '\u0DBD' || (LA39_0 >= '\u0DC0' && LA39_0 <= '\u0DC6') || LA39_0 == '\u0DCA'
                  || (LA39_0 >= '\u0DCF' && LA39_0 <= '\u0DD4') || LA39_0 == '\u0DD6'
                  || (LA39_0 >= '\u0DD8' && LA39_0 <= '\u0DDF') || (LA39_0 >= '\u0DF2' && LA39_0 <= '\u0DF3')
                  || (LA39_0 >= '\u0E01' && LA39_0 <= '\u0E3A') || (LA39_0 >= '\u0E3F' && LA39_0 <= '\u0E4E')
                  || (LA39_0 >= '\u0E50' && LA39_0 <= '\u0E59') || (LA39_0 >= '\u0E81' && LA39_0 <= '\u0E82')
                  || LA39_0 == '\u0E84' || (LA39_0 >= '\u0E87' && LA39_0 <= '\u0E88') || LA39_0 == '\u0E8A'
                  || LA39_0 == '\u0E8D' || (LA39_0 >= '\u0E94' && LA39_0 <= '\u0E97')
                  || (LA39_0 >= '\u0E99' && LA39_0 <= '\u0E9F') || (LA39_0 >= '\u0EA1' && LA39_0 <= '\u0EA3')
                  || LA39_0 == '\u0EA5' || LA39_0 == '\u0EA7' || (LA39_0 >= '\u0EAA' && LA39_0 <= '\u0EAB')
                  || (LA39_0 >= '\u0EAD' && LA39_0 <= '\u0EB9') || (LA39_0 >= '\u0EBB' && LA39_0 <= '\u0EBD')
                  || (LA39_0 >= '\u0EC0' && LA39_0 <= '\u0EC4') || LA39_0 == '\u0EC6'
                  || (LA39_0 >= '\u0EC8' && LA39_0 <= '\u0ECD') || (LA39_0 >= '\u0ED0' && LA39_0 <= '\u0ED9')
                  || (LA39_0 >= '\u0EDC' && LA39_0 <= '\u0EDD') || LA39_0 == '\u0F00'
                  || (LA39_0 >= '\u0F18' && LA39_0 <= '\u0F19') || (LA39_0 >= '\u0F20' && LA39_0 <= '\u0F29')
                  || LA39_0 == '\u0F35' || LA39_0 == '\u0F37' || LA39_0 == '\u0F39'
                  || (LA39_0 >= '\u0F3E' && LA39_0 <= '\u0F47') || (LA39_0 >= '\u0F49' && LA39_0 <= '\u0F6A')
                  || (LA39_0 >= '\u0F71' && LA39_0 <= '\u0F84') || (LA39_0 >= '\u0F86' && LA39_0 <= '\u0F8B')
                  || (LA39_0 >= '\u0F90' && LA39_0 <= '\u0F97') || (LA39_0 >= '\u0F99' && LA39_0 <= '\u0FBC')
                  || LA39_0 == '\u0FC6' || (LA39_0 >= '\u1000' && LA39_0 <= '\u1021')
                  || (LA39_0 >= '\u1023' && LA39_0 <= '\u1027') || (LA39_0 >= '\u1029' && LA39_0 <= '\u102A')
                  || (LA39_0 >= '\u102C' && LA39_0 <= '\u1032') || (LA39_0 >= '\u1036' && LA39_0 <= '\u1039')
                  || (LA39_0 >= '\u1040' && LA39_0 <= '\u1049') || (LA39_0 >= '\u1050' && LA39_0 <= '\u1059')
                  || (LA39_0 >= '\u10A0' && LA39_0 <= '\u10C5') || (LA39_0 >= '\u10D0' && LA39_0 <= '\u10F8')
                  || (LA39_0 >= '\u1100' && LA39_0 <= '\u1159') || (LA39_0 >= '\u115F' && LA39_0 <= '\u11A2')
                  || (LA39_0 >= '\u11A8' && LA39_0 <= '\u11F9') || (LA39_0 >= '\u1200' && LA39_0 <= '\u1206')
                  || (LA39_0 >= '\u1208' && LA39_0 <= '\u1246') || LA39_0 == '\u1248'
                  || (LA39_0 >= '\u124A' && LA39_0 <= '\u124D') || (LA39_0 >= '\u1250' && LA39_0 <= '\u1256')
                  || LA39_0 == '\u1258' || (LA39_0 >= '\u125A' && LA39_0 <= '\u125D')
                  || (LA39_0 >= '\u1260' && LA39_0 <= '\u1286') || LA39_0 == '\u1288'
                  || (LA39_0 >= '\u128A' && LA39_0 <= '\u128D') || (LA39_0 >= '\u1290' && LA39_0 <= '\u12AE')
                  || LA39_0 == '\u12B0' || (LA39_0 >= '\u12B2' && LA39_0 <= '\u12B5')
                  || (LA39_0 >= '\u12B8' && LA39_0 <= '\u12BE') || LA39_0 == '\u12C0'
                  || (LA39_0 >= '\u12C2' && LA39_0 <= '\u12C5') || (LA39_0 >= '\u12C8' && LA39_0 <= '\u12CE')
                  || (LA39_0 >= '\u12D0' && LA39_0 <= '\u12D6') || (LA39_0 >= '\u12D8' && LA39_0 <= '\u12EE')
                  || (LA39_0 >= '\u12F0' && LA39_0 <= '\u130E') || LA39_0 == '\u1310'
                  || (LA39_0 >= '\u1312' && LA39_0 <= '\u1315') || (LA39_0 >= '\u1318' && LA39_0 <= '\u131E')
                  || (LA39_0 >= '\u1320' && LA39_0 <= '\u1346') || (LA39_0 >= '\u1348' && LA39_0 <= '\u135A')
                  || (LA39_0 >= '\u1369' && LA39_0 <= '\u1371') || (LA39_0 >= '\u13A0' && LA39_0 <= '\u13F4')
                  || (LA39_0 >= '\u1401' && LA39_0 <= '\u166C') || (LA39_0 >= '\u166F' && LA39_0 <= '\u1676')
                  || (LA39_0 >= '\u1681' && LA39_0 <= '\u169A') || (LA39_0 >= '\u16A0' && LA39_0 <= '\u16EA')
                  || (LA39_0 >= '\u16EE' && LA39_0 <= '\u16F0') || (LA39_0 >= '\u1700' && LA39_0 <= '\u170C')
                  || (LA39_0 >= '\u170E' && LA39_0 <= '\u1714') || (LA39_0 >= '\u1720' && LA39_0 <= '\u1734')
                  || (LA39_0 >= '\u1740' && LA39_0 <= '\u1753') || (LA39_0 >= '\u1760' && LA39_0 <= '\u176C')
                  || (LA39_0 >= '\u176E' && LA39_0 <= '\u1770') || (LA39_0 >= '\u1772' && LA39_0 <= '\u1773')
                  || (LA39_0 >= '\u1780' && LA39_0 <= '\u17D3') || LA39_0 == '\u17D7'
                  || (LA39_0 >= '\u17DB' && LA39_0 <= '\u17DD') || (LA39_0 >= '\u17E0' && LA39_0 <= '\u17E9')
                  || (LA39_0 >= '\u180B' && LA39_0 <= '\u180D') || (LA39_0 >= '\u1810' && LA39_0 <= '\u1819')
                  || (LA39_0 >= '\u1820' && LA39_0 <= '\u1877') || (LA39_0 >= '\u1880' && LA39_0 <= '\u18A9')
                  || (LA39_0 >= '\u1900' && LA39_0 <= '\u191C') || (LA39_0 >= '\u1920' && LA39_0 <= '\u192B')
                  || (LA39_0 >= '\u1930' && LA39_0 <= '\u193B') || (LA39_0 >= '\u1946' && LA39_0 <= '\u196D')
                  || (LA39_0 >= '\u1970' && LA39_0 <= '\u1974') || (LA39_0 >= '\u1D00' && LA39_0 <= '\u1D6B')
                  || (LA39_0 >= '\u1E00' && LA39_0 <= '\u1E9B') || (LA39_0 >= '\u1EA0' && LA39_0 <= '\u1EF9')
                  || (LA39_0 >= '\u1F00' && LA39_0 <= '\u1F15') || (LA39_0 >= '\u1F18' && LA39_0 <= '\u1F1D')
                  || (LA39_0 >= '\u1F20' && LA39_0 <= '\u1F45') || (LA39_0 >= '\u1F48' && LA39_0 <= '\u1F4D')
                  || (LA39_0 >= '\u1F50' && LA39_0 <= '\u1F57') || LA39_0 == '\u1F59' || LA39_0 == '\u1F5B'
                  || LA39_0 == '\u1F5D' || (LA39_0 >= '\u1F5F' && LA39_0 <= '\u1F7D')
                  || (LA39_0 >= '\u1F80' && LA39_0 <= '\u1FB4') || (LA39_0 >= '\u1FB6' && LA39_0 <= '\u1FBC')
                  || LA39_0 == '\u1FBE' || (LA39_0 >= '\u1FC2' && LA39_0 <= '\u1FC4')
                  || (LA39_0 >= '\u1FC6' && LA39_0 <= '\u1FCC') || (LA39_0 >= '\u1FD0' && LA39_0 <= '\u1FD3')
                  || (LA39_0 >= '\u1FD6' && LA39_0 <= '\u1FDB') || (LA39_0 >= '\u1FE0' && LA39_0 <= '\u1FEC')
                  || (LA39_0 >= '\u1FF2' && LA39_0 <= '\u1FF4') || (LA39_0 >= '\u1FF6' && LA39_0 <= '\u1FFC')
                  || (LA39_0 >= '\u200C' && LA39_0 <= '\u200F') || (LA39_0 >= '\u202A' && LA39_0 <= '\u202E')
                  || (LA39_0 >= '\u203F' && LA39_0 <= '\u2040') || LA39_0 == '\u2054'
                  || (LA39_0 >= '\u2060' && LA39_0 <= '\u2063') || (LA39_0 >= '\u206A' && LA39_0 <= '\u206F')
                  || LA39_0 == '\u2071' || LA39_0 == '\u207F' || (LA39_0 >= '\u20A0' && LA39_0 <= '\u20B1')
                  || (LA39_0 >= '\u20D0' && LA39_0 <= '\u20DC') || LA39_0 == '\u20E1'
                  || (LA39_0 >= '\u20E5' && LA39_0 <= '\u20EA') || LA39_0 == '\u2102' || LA39_0 == '\u2107'
                  || (LA39_0 >= '\u210A' && LA39_0 <= '\u2113') || LA39_0 == '\u2115'
                  || (LA39_0 >= '\u2119' && LA39_0 <= '\u211D') || LA39_0 == '\u2124' || LA39_0 == '\u2126'
                  || LA39_0 == '\u2128' || (LA39_0 >= '\u212A' && LA39_0 <= '\u212D')
                  || (LA39_0 >= '\u212F' && LA39_0 <= '\u2131') || (LA39_0 >= '\u2133' && LA39_0 <= '\u2139')
                  || (LA39_0 >= '\u213D' && LA39_0 <= '\u213F') || (LA39_0 >= '\u2145' && LA39_0 <= '\u2149')
                  || (LA39_0 >= '\u2160' && LA39_0 <= '\u2183') || (LA39_0 >= '\u3005' && LA39_0 <= '\u3007')
                  || (LA39_0 >= '\u3021' && LA39_0 <= '\u302F') || (LA39_0 >= '\u3031' && LA39_0 <= '\u3035')
                  || (LA39_0 >= '\u3038' && LA39_0 <= '\u303C') || (LA39_0 >= '\u3041' && LA39_0 <= '\u3096')
                  || (LA39_0 >= '\u3099' && LA39_0 <= '\u309A') || (LA39_0 >= '\u309D' && LA39_0 <= '\u309F')
                  || (LA39_0 >= '\u30A1' && LA39_0 <= '\u30FF') || (LA39_0 >= '\u3105' && LA39_0 <= '\u312C')
                  || (LA39_0 >= '\u3131' && LA39_0 <= '\u318E') || (LA39_0 >= '\u31A0' && LA39_0 <= '\u31B7')
                  || (LA39_0 >= '\u31F0' && LA39_0 <= '\u31FF') || (LA39_0 >= '\u3400' && LA39_0 <= '\u4DB5')
                  || (LA39_0 >= '\u4E00' && LA39_0 <= '\u9FA5') || (LA39_0 >= '\uA000' && LA39_0 <= '\uA48C')
                  || (LA39_0 >= '\uAC00' && LA39_0 <= '\uD7A3') || (LA39_0 >= '\uD800' && LA39_0 <= '\uDBFF')
                  || (LA39_0 >= '\uF900' && LA39_0 <= '\uFA2D') || (LA39_0 >= '\uFA30' && LA39_0 <= '\uFA6A')
                  || (LA39_0 >= '\uFB00' && LA39_0 <= '\uFB06') || (LA39_0 >= '\uFB13' && LA39_0 <= '\uFB17')
                  || (LA39_0 >= '\uFB1D' && LA39_0 <= '\uFB28') || (LA39_0 >= '\uFB2A' && LA39_0 <= '\uFB36')
                  || (LA39_0 >= '\uFB38' && LA39_0 <= '\uFB3C') || LA39_0 == '\uFB3E'
                  || (LA39_0 >= '\uFB40' && LA39_0 <= '\uFB41') || (LA39_0 >= '\uFB43' && LA39_0 <= '\uFB44')
                  || (LA39_0 >= '\uFB46' && LA39_0 <= '\uFBB1') || (LA39_0 >= '\uFBD3' && LA39_0 <= '\uFD3D')
                  || (LA39_0 >= '\uFD50' && LA39_0 <= '\uFD8F') || (LA39_0 >= '\uFD92' && LA39_0 <= '\uFDC7')
                  || (LA39_0 >= '\uFDF0' && LA39_0 <= '\uFDFC') || (LA39_0 >= '\uFE00' && LA39_0 <= '\uFE0F')
                  || (LA39_0 >= '\uFE20' && LA39_0 <= '\uFE23') || (LA39_0 >= '\uFE33' && LA39_0 <= '\uFE34')
                  || (LA39_0 >= '\uFE4D' && LA39_0 <= '\uFE4F') || LA39_0 == '\uFE69'
                  || (LA39_0 >= '\uFE70' && LA39_0 <= '\uFE74') || (LA39_0 >= '\uFE76' && LA39_0 <= '\uFEFC')
                  || LA39_0 == '\uFEFF' || LA39_0 == '\uFF04' || (LA39_0 >= '\uFF10' && LA39_0 <= '\uFF19')
                  || (LA39_0 >= '\uFF21' && LA39_0 <= '\uFF3A') || LA39_0 == '\uFF3F'
                  || (LA39_0 >= '\uFF41' && LA39_0 <= '\uFF5A') || (LA39_0 >= '\uFF65' && LA39_0 <= '\uFFBE')
                  || (LA39_0 >= '\uFFC2' && LA39_0 <= '\uFFC7') || (LA39_0 >= '\uFFCA' && LA39_0 <= '\uFFCF')
                  || (LA39_0 >= '\uFFD2' && LA39_0 <= '\uFFD7') || (LA39_0 >= '\uFFDA' && LA39_0 <= '\uFFDC')
                  || (LA39_0 >= '\uFFE0' && LA39_0 <= '\uFFE1') || (LA39_0 >= '\uFFE5' && LA39_0 <= '\uFFE6') || (LA39_0 >= '\uFFF9' && LA39_0 <= '\uFFFB'))) {
                  alt39 = 1;
               }


               switch (alt39) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:627:35:
                  // RULE_JAVALETTERORDIGIT
                  {
                     mRULE_JAVALETTERORDIGIT();

                  }
                     break;

                  default :
                     break loop39;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:26:
         // ( ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' |
         // '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' |
         // '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A'
         // | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' ..
         // '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' ..
         // '\\u04F9' | '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0'
         // .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u064A' | '\\u066E' ..
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:28:
         // ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' |
         // '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' |
         // '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A'
         // | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' ..
         // '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' ..
         // '\\u04F9' | '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0'
         // .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u064A' | '\\u066E' ..
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
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:28:
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
            int alt40 = 294;
            int LA40_0 = input.LA(1);

            if ((LA40_0 == '$')) {
               alt40 = 1;
            }
            else if (((LA40_0 >= 'A' && LA40_0 <= 'Z'))) {
               alt40 = 2;
            }
            else if ((LA40_0 == '_')) {
               alt40 = 3;
            }
            else if (((LA40_0 >= 'a' && LA40_0 <= 'z'))) {
               alt40 = 4;
            }
            else if (((LA40_0 >= '\u00A2' && LA40_0 <= '\u00A5'))) {
               alt40 = 5;
            }
            else if ((LA40_0 == '\u00AA')) {
               alt40 = 6;
            }
            else if ((LA40_0 == '\u00B5')) {
               alt40 = 7;
            }
            else if ((LA40_0 == '\u00BA')) {
               alt40 = 8;
            }
            else if (((LA40_0 >= '\u00C0' && LA40_0 <= '\u00D6'))) {
               alt40 = 9;
            }
            else if (((LA40_0 >= '\u00D8' && LA40_0 <= '\u00F6'))) {
               alt40 = 10;
            }
            else if (((LA40_0 >= '\u00F8' && LA40_0 <= '\u0236'))) {
               alt40 = 11;
            }
            else if (((LA40_0 >= '\u0250' && LA40_0 <= '\u02C1'))) {
               alt40 = 12;
            }
            else if (((LA40_0 >= '\u02C6' && LA40_0 <= '\u02D1'))) {
               alt40 = 13;
            }
            else if (((LA40_0 >= '\u02E0' && LA40_0 <= '\u02E4'))) {
               alt40 = 14;
            }
            else if ((LA40_0 == '\u02EE')) {
               alt40 = 15;
            }
            else if ((LA40_0 == '\u037A')) {
               alt40 = 16;
            }
            else if ((LA40_0 == '\u0386')) {
               alt40 = 17;
            }
            else if (((LA40_0 >= '\u0388' && LA40_0 <= '\u038A'))) {
               alt40 = 18;
            }
            else if ((LA40_0 == '\u038C')) {
               alt40 = 19;
            }
            else if (((LA40_0 >= '\u038E' && LA40_0 <= '\u03A1'))) {
               alt40 = 20;
            }
            else if (((LA40_0 >= '\u03A3' && LA40_0 <= '\u03CE'))) {
               alt40 = 21;
            }
            else if (((LA40_0 >= '\u03D0' && LA40_0 <= '\u03F5'))) {
               alt40 = 22;
            }
            else if (((LA40_0 >= '\u03F7' && LA40_0 <= '\u03FB'))) {
               alt40 = 23;
            }
            else if (((LA40_0 >= '\u0400' && LA40_0 <= '\u0481'))) {
               alt40 = 24;
            }
            else if (((LA40_0 >= '\u048A' && LA40_0 <= '\u04CE'))) {
               alt40 = 25;
            }
            else if (((LA40_0 >= '\u04D0' && LA40_0 <= '\u04F5'))) {
               alt40 = 26;
            }
            else if (((LA40_0 >= '\u04F8' && LA40_0 <= '\u04F9'))) {
               alt40 = 27;
            }
            else if (((LA40_0 >= '\u0500' && LA40_0 <= '\u050F'))) {
               alt40 = 28;
            }
            else if (((LA40_0 >= '\u0531' && LA40_0 <= '\u0556'))) {
               alt40 = 29;
            }
            else if ((LA40_0 == '\u0559')) {
               alt40 = 30;
            }
            else if (((LA40_0 >= '\u0561' && LA40_0 <= '\u0587'))) {
               alt40 = 31;
            }
            else if (((LA40_0 >= '\u05D0' && LA40_0 <= '\u05EA'))) {
               alt40 = 32;
            }
            else if (((LA40_0 >= '\u05F0' && LA40_0 <= '\u05F2'))) {
               alt40 = 33;
            }
            else if (((LA40_0 >= '\u0621' && LA40_0 <= '\u063A'))) {
               alt40 = 34;
            }
            else if (((LA40_0 >= '\u0640' && LA40_0 <= '\u064A'))) {
               alt40 = 35;
            }
            else if (((LA40_0 >= '\u066E' && LA40_0 <= '\u066F'))) {
               alt40 = 36;
            }
            else if (((LA40_0 >= '\u0671' && LA40_0 <= '\u06D3'))) {
               alt40 = 37;
            }
            else if ((LA40_0 == '\u06D5')) {
               alt40 = 38;
            }
            else if (((LA40_0 >= '\u06E5' && LA40_0 <= '\u06E6'))) {
               alt40 = 39;
            }
            else if (((LA40_0 >= '\u06EE' && LA40_0 <= '\u06EF'))) {
               alt40 = 40;
            }
            else if (((LA40_0 >= '\u06FA' && LA40_0 <= '\u06FC'))) {
               alt40 = 41;
            }
            else if ((LA40_0 == '\u06FF')) {
               alt40 = 42;
            }
            else if ((LA40_0 == '\u0710')) {
               alt40 = 43;
            }
            else if (((LA40_0 >= '\u0712' && LA40_0 <= '\u072F'))) {
               alt40 = 44;
            }
            else if (((LA40_0 >= '\u074D' && LA40_0 <= '\u074F'))) {
               alt40 = 45;
            }
            else if (((LA40_0 >= '\u0780' && LA40_0 <= '\u07A5'))) {
               alt40 = 46;
            }
            else if ((LA40_0 == '\u07B1')) {
               alt40 = 47;
            }
            else if (((LA40_0 >= '\u0904' && LA40_0 <= '\u0939'))) {
               alt40 = 48;
            }
            else if ((LA40_0 == '\u093D')) {
               alt40 = 49;
            }
            else if ((LA40_0 == '\u0950')) {
               alt40 = 50;
            }
            else if (((LA40_0 >= '\u0958' && LA40_0 <= '\u0961'))) {
               alt40 = 51;
            }
            else if (((LA40_0 >= '\u0985' && LA40_0 <= '\u098C'))) {
               alt40 = 52;
            }
            else if (((LA40_0 >= '\u098F' && LA40_0 <= '\u0990'))) {
               alt40 = 53;
            }
            else if (((LA40_0 >= '\u0993' && LA40_0 <= '\u09A8'))) {
               alt40 = 54;
            }
            else if (((LA40_0 >= '\u09AA' && LA40_0 <= '\u09B0'))) {
               alt40 = 55;
            }
            else if ((LA40_0 == '\u09B2')) {
               alt40 = 56;
            }
            else if (((LA40_0 >= '\u09B6' && LA40_0 <= '\u09B9'))) {
               alt40 = 57;
            }
            else if ((LA40_0 == '\u09BD')) {
               alt40 = 58;
            }
            else if (((LA40_0 >= '\u09DC' && LA40_0 <= '\u09DD'))) {
               alt40 = 59;
            }
            else if (((LA40_0 >= '\u09DF' && LA40_0 <= '\u09E1'))) {
               alt40 = 60;
            }
            else if (((LA40_0 >= '\u09F0' && LA40_0 <= '\u09F3'))) {
               alt40 = 61;
            }
            else if (((LA40_0 >= '\u0A05' && LA40_0 <= '\u0A0A'))) {
               alt40 = 62;
            }
            else if (((LA40_0 >= '\u0A0F' && LA40_0 <= '\u0A10'))) {
               alt40 = 63;
            }
            else if (((LA40_0 >= '\u0A13' && LA40_0 <= '\u0A28'))) {
               alt40 = 64;
            }
            else if (((LA40_0 >= '\u0A2A' && LA40_0 <= '\u0A30'))) {
               alt40 = 65;
            }
            else if (((LA40_0 >= '\u0A32' && LA40_0 <= '\u0A33'))) {
               alt40 = 66;
            }
            else if (((LA40_0 >= '\u0A35' && LA40_0 <= '\u0A36'))) {
               alt40 = 67;
            }
            else if (((LA40_0 >= '\u0A38' && LA40_0 <= '\u0A39'))) {
               alt40 = 68;
            }
            else if (((LA40_0 >= '\u0A59' && LA40_0 <= '\u0A5C'))) {
               alt40 = 69;
            }
            else if ((LA40_0 == '\u0A5E')) {
               alt40 = 70;
            }
            else if (((LA40_0 >= '\u0A72' && LA40_0 <= '\u0A74'))) {
               alt40 = 71;
            }
            else if (((LA40_0 >= '\u0A85' && LA40_0 <= '\u0A8D'))) {
               alt40 = 72;
            }
            else if (((LA40_0 >= '\u0A8F' && LA40_0 <= '\u0A91'))) {
               alt40 = 73;
            }
            else if (((LA40_0 >= '\u0A93' && LA40_0 <= '\u0AA8'))) {
               alt40 = 74;
            }
            else if (((LA40_0 >= '\u0AAA' && LA40_0 <= '\u0AB0'))) {
               alt40 = 75;
            }
            else if (((LA40_0 >= '\u0AB2' && LA40_0 <= '\u0AB3'))) {
               alt40 = 76;
            }
            else if (((LA40_0 >= '\u0AB5' && LA40_0 <= '\u0AB9'))) {
               alt40 = 77;
            }
            else if ((LA40_0 == '\u0ABD')) {
               alt40 = 78;
            }
            else if ((LA40_0 == '\u0AD0')) {
               alt40 = 79;
            }
            else if (((LA40_0 >= '\u0AE0' && LA40_0 <= '\u0AE1'))) {
               alt40 = 80;
            }
            else if ((LA40_0 == '\u0AF1')) {
               alt40 = 81;
            }
            else if (((LA40_0 >= '\u0B05' && LA40_0 <= '\u0B0C'))) {
               alt40 = 82;
            }
            else if (((LA40_0 >= '\u0B0F' && LA40_0 <= '\u0B10'))) {
               alt40 = 83;
            }
            else if (((LA40_0 >= '\u0B13' && LA40_0 <= '\u0B28'))) {
               alt40 = 84;
            }
            else if (((LA40_0 >= '\u0B2A' && LA40_0 <= '\u0B30'))) {
               alt40 = 85;
            }
            else if (((LA40_0 >= '\u0B32' && LA40_0 <= '\u0B33'))) {
               alt40 = 86;
            }
            else if (((LA40_0 >= '\u0B35' && LA40_0 <= '\u0B39'))) {
               alt40 = 87;
            }
            else if ((LA40_0 == '\u0B3D')) {
               alt40 = 88;
            }
            else if (((LA40_0 >= '\u0B5C' && LA40_0 <= '\u0B5D'))) {
               alt40 = 89;
            }
            else if (((LA40_0 >= '\u0B5F' && LA40_0 <= '\u0B61'))) {
               alt40 = 90;
            }
            else if ((LA40_0 == '\u0B71')) {
               alt40 = 91;
            }
            else if ((LA40_0 == '\u0B83')) {
               alt40 = 92;
            }
            else if (((LA40_0 >= '\u0B85' && LA40_0 <= '\u0B8A'))) {
               alt40 = 93;
            }
            else if (((LA40_0 >= '\u0B8E' && LA40_0 <= '\u0B90'))) {
               alt40 = 94;
            }
            else if (((LA40_0 >= '\u0B92' && LA40_0 <= '\u0B95'))) {
               alt40 = 95;
            }
            else if (((LA40_0 >= '\u0B99' && LA40_0 <= '\u0B9A'))) {
               alt40 = 96;
            }
            else if ((LA40_0 == '\u0B9C')) {
               alt40 = 97;
            }
            else if (((LA40_0 >= '\u0B9E' && LA40_0 <= '\u0B9F'))) {
               alt40 = 98;
            }
            else if (((LA40_0 >= '\u0BA3' && LA40_0 <= '\u0BA4'))) {
               alt40 = 99;
            }
            else if (((LA40_0 >= '\u0BA8' && LA40_0 <= '\u0BAA'))) {
               alt40 = 100;
            }
            else if (((LA40_0 >= '\u0BAE' && LA40_0 <= '\u0BB5'))) {
               alt40 = 101;
            }
            else if (((LA40_0 >= '\u0BB7' && LA40_0 <= '\u0BB9'))) {
               alt40 = 102;
            }
            else if ((LA40_0 == '\u0BF9')) {
               alt40 = 103;
            }
            else if (((LA40_0 >= '\u0C05' && LA40_0 <= '\u0C0C'))) {
               alt40 = 104;
            }
            else if (((LA40_0 >= '\u0C0E' && LA40_0 <= '\u0C10'))) {
               alt40 = 105;
            }
            else if (((LA40_0 >= '\u0C12' && LA40_0 <= '\u0C28'))) {
               alt40 = 106;
            }
            else if (((LA40_0 >= '\u0C2A' && LA40_0 <= '\u0C33'))) {
               alt40 = 107;
            }
            else if (((LA40_0 >= '\u0C35' && LA40_0 <= '\u0C39'))) {
               alt40 = 108;
            }
            else if (((LA40_0 >= '\u0C60' && LA40_0 <= '\u0C61'))) {
               alt40 = 109;
            }
            else if (((LA40_0 >= '\u0C85' && LA40_0 <= '\u0C8C'))) {
               alt40 = 110;
            }
            else if (((LA40_0 >= '\u0C8E' && LA40_0 <= '\u0C90'))) {
               alt40 = 111;
            }
            else if (((LA40_0 >= '\u0C92' && LA40_0 <= '\u0CA8'))) {
               alt40 = 112;
            }
            else if (((LA40_0 >= '\u0CAA' && LA40_0 <= '\u0CB3'))) {
               alt40 = 113;
            }
            else if (((LA40_0 >= '\u0CB5' && LA40_0 <= '\u0CB9'))) {
               alt40 = 114;
            }
            else if ((LA40_0 == '\u0CBD')) {
               alt40 = 115;
            }
            else if ((LA40_0 == '\u0CDE')) {
               alt40 = 116;
            }
            else if (((LA40_0 >= '\u0CE0' && LA40_0 <= '\u0CE1'))) {
               alt40 = 117;
            }
            else if (((LA40_0 >= '\u0D05' && LA40_0 <= '\u0D0C'))) {
               alt40 = 118;
            }
            else if (((LA40_0 >= '\u0D0E' && LA40_0 <= '\u0D10'))) {
               alt40 = 119;
            }
            else if (((LA40_0 >= '\u0D12' && LA40_0 <= '\u0D28'))) {
               alt40 = 120;
            }
            else if (((LA40_0 >= '\u0D2A' && LA40_0 <= '\u0D39'))) {
               alt40 = 121;
            }
            else if (((LA40_0 >= '\u0D60' && LA40_0 <= '\u0D61'))) {
               alt40 = 122;
            }
            else if (((LA40_0 >= '\u0D85' && LA40_0 <= '\u0D96'))) {
               alt40 = 123;
            }
            else if (((LA40_0 >= '\u0D9A' && LA40_0 <= '\u0DB1'))) {
               alt40 = 124;
            }
            else if (((LA40_0 >= '\u0DB3' && LA40_0 <= '\u0DBB'))) {
               alt40 = 125;
            }
            else if ((LA40_0 == '\u0DBD')) {
               alt40 = 126;
            }
            else if (((LA40_0 >= '\u0DC0' && LA40_0 <= '\u0DC6'))) {
               alt40 = 127;
            }
            else if (((LA40_0 >= '\u0E01' && LA40_0 <= '\u0E30'))) {
               alt40 = 128;
            }
            else if (((LA40_0 >= '\u0E32' && LA40_0 <= '\u0E33'))) {
               alt40 = 129;
            }
            else if (((LA40_0 >= '\u0E3F' && LA40_0 <= '\u0E46'))) {
               alt40 = 130;
            }
            else if (((LA40_0 >= '\u0E81' && LA40_0 <= '\u0E82'))) {
               alt40 = 131;
            }
            else if ((LA40_0 == '\u0E84')) {
               alt40 = 132;
            }
            else if (((LA40_0 >= '\u0E87' && LA40_0 <= '\u0E88'))) {
               alt40 = 133;
            }
            else if ((LA40_0 == '\u0E8A')) {
               alt40 = 134;
            }
            else if ((LA40_0 == '\u0E8D')) {
               alt40 = 135;
            }
            else if (((LA40_0 >= '\u0E94' && LA40_0 <= '\u0E97'))) {
               alt40 = 136;
            }
            else if (((LA40_0 >= '\u0E99' && LA40_0 <= '\u0E9F'))) {
               alt40 = 137;
            }
            else if (((LA40_0 >= '\u0EA1' && LA40_0 <= '\u0EA3'))) {
               alt40 = 138;
            }
            else if ((LA40_0 == '\u0EA5')) {
               alt40 = 139;
            }
            else if ((LA40_0 == '\u0EA7')) {
               alt40 = 140;
            }
            else if (((LA40_0 >= '\u0EAA' && LA40_0 <= '\u0EAB'))) {
               alt40 = 141;
            }
            else if (((LA40_0 >= '\u0EAD' && LA40_0 <= '\u0EB0'))) {
               alt40 = 142;
            }
            else if (((LA40_0 >= '\u0EB2' && LA40_0 <= '\u0EB3'))) {
               alt40 = 143;
            }
            else if ((LA40_0 == '\u0EBD')) {
               alt40 = 144;
            }
            else if (((LA40_0 >= '\u0EC0' && LA40_0 <= '\u0EC4'))) {
               alt40 = 145;
            }
            else if ((LA40_0 == '\u0EC6')) {
               alt40 = 146;
            }
            else if (((LA40_0 >= '\u0EDC' && LA40_0 <= '\u0EDD'))) {
               alt40 = 147;
            }
            else if ((LA40_0 == '\u0F00')) {
               alt40 = 148;
            }
            else if (((LA40_0 >= '\u0F40' && LA40_0 <= '\u0F47'))) {
               alt40 = 149;
            }
            else if (((LA40_0 >= '\u0F49' && LA40_0 <= '\u0F6A'))) {
               alt40 = 150;
            }
            else if (((LA40_0 >= '\u0F88' && LA40_0 <= '\u0F8B'))) {
               alt40 = 151;
            }
            else if (((LA40_0 >= '\u1000' && LA40_0 <= '\u1021'))) {
               alt40 = 152;
            }
            else if (((LA40_0 >= '\u1023' && LA40_0 <= '\u1027'))) {
               alt40 = 153;
            }
            else if (((LA40_0 >= '\u1029' && LA40_0 <= '\u102A'))) {
               alt40 = 154;
            }
            else if (((LA40_0 >= '\u1050' && LA40_0 <= '\u1055'))) {
               alt40 = 155;
            }
            else if (((LA40_0 >= '\u10A0' && LA40_0 <= '\u10C5'))) {
               alt40 = 156;
            }
            else if (((LA40_0 >= '\u10D0' && LA40_0 <= '\u10F8'))) {
               alt40 = 157;
            }
            else if (((LA40_0 >= '\u1100' && LA40_0 <= '\u1159'))) {
               alt40 = 158;
            }
            else if (((LA40_0 >= '\u115F' && LA40_0 <= '\u11A2'))) {
               alt40 = 159;
            }
            else if (((LA40_0 >= '\u11A8' && LA40_0 <= '\u11F9'))) {
               alt40 = 160;
            }
            else if (((LA40_0 >= '\u1200' && LA40_0 <= '\u1206'))) {
               alt40 = 161;
            }
            else if (((LA40_0 >= '\u1208' && LA40_0 <= '\u1246'))) {
               alt40 = 162;
            }
            else if ((LA40_0 == '\u1248')) {
               alt40 = 163;
            }
            else if (((LA40_0 >= '\u124A' && LA40_0 <= '\u124D'))) {
               alt40 = 164;
            }
            else if (((LA40_0 >= '\u1250' && LA40_0 <= '\u1256'))) {
               alt40 = 165;
            }
            else if ((LA40_0 == '\u1258')) {
               alt40 = 166;
            }
            else if (((LA40_0 >= '\u125A' && LA40_0 <= '\u125D'))) {
               alt40 = 167;
            }
            else if (((LA40_0 >= '\u1260' && LA40_0 <= '\u1286'))) {
               alt40 = 168;
            }
            else if ((LA40_0 == '\u1288')) {
               alt40 = 169;
            }
            else if (((LA40_0 >= '\u128A' && LA40_0 <= '\u128D'))) {
               alt40 = 170;
            }
            else if (((LA40_0 >= '\u1290' && LA40_0 <= '\u12AE'))) {
               alt40 = 171;
            }
            else if ((LA40_0 == '\u12B0')) {
               alt40 = 172;
            }
            else if (((LA40_0 >= '\u12B2' && LA40_0 <= '\u12B5'))) {
               alt40 = 173;
            }
            else if (((LA40_0 >= '\u12B8' && LA40_0 <= '\u12BE'))) {
               alt40 = 174;
            }
            else if ((LA40_0 == '\u12C0')) {
               alt40 = 175;
            }
            else if (((LA40_0 >= '\u12C2' && LA40_0 <= '\u12C5'))) {
               alt40 = 176;
            }
            else if (((LA40_0 >= '\u12C8' && LA40_0 <= '\u12CE'))) {
               alt40 = 177;
            }
            else if (((LA40_0 >= '\u12D0' && LA40_0 <= '\u12D6'))) {
               alt40 = 178;
            }
            else if (((LA40_0 >= '\u12D8' && LA40_0 <= '\u12EE'))) {
               alt40 = 179;
            }
            else if (((LA40_0 >= '\u12F0' && LA40_0 <= '\u130E'))) {
               alt40 = 180;
            }
            else if ((LA40_0 == '\u1310')) {
               alt40 = 181;
            }
            else if (((LA40_0 >= '\u1312' && LA40_0 <= '\u1315'))) {
               alt40 = 182;
            }
            else if (((LA40_0 >= '\u1318' && LA40_0 <= '\u131E'))) {
               alt40 = 183;
            }
            else if (((LA40_0 >= '\u1320' && LA40_0 <= '\u1346'))) {
               alt40 = 184;
            }
            else if (((LA40_0 >= '\u1348' && LA40_0 <= '\u135A'))) {
               alt40 = 185;
            }
            else if (((LA40_0 >= '\u13A0' && LA40_0 <= '\u13F4'))) {
               alt40 = 186;
            }
            else if (((LA40_0 >= '\u1401' && LA40_0 <= '\u166C'))) {
               alt40 = 187;
            }
            else if (((LA40_0 >= '\u166F' && LA40_0 <= '\u1676'))) {
               alt40 = 188;
            }
            else if (((LA40_0 >= '\u1681' && LA40_0 <= '\u169A'))) {
               alt40 = 189;
            }
            else if (((LA40_0 >= '\u16A0' && LA40_0 <= '\u16EA'))) {
               alt40 = 190;
            }
            else if (((LA40_0 >= '\u16EE' && LA40_0 <= '\u16F0'))) {
               alt40 = 191;
            }
            else if (((LA40_0 >= '\u1700' && LA40_0 <= '\u170C'))) {
               alt40 = 192;
            }
            else if (((LA40_0 >= '\u170E' && LA40_0 <= '\u1711'))) {
               alt40 = 193;
            }
            else if (((LA40_0 >= '\u1720' && LA40_0 <= '\u1731'))) {
               alt40 = 194;
            }
            else if (((LA40_0 >= '\u1740' && LA40_0 <= '\u1751'))) {
               alt40 = 195;
            }
            else if (((LA40_0 >= '\u1760' && LA40_0 <= '\u176C'))) {
               alt40 = 196;
            }
            else if (((LA40_0 >= '\u176E' && LA40_0 <= '\u1770'))) {
               alt40 = 197;
            }
            else if (((LA40_0 >= '\u1780' && LA40_0 <= '\u17B3'))) {
               alt40 = 198;
            }
            else if ((LA40_0 == '\u17D7')) {
               alt40 = 199;
            }
            else if (((LA40_0 >= '\u17DB' && LA40_0 <= '\u17DC'))) {
               alt40 = 200;
            }
            else if (((LA40_0 >= '\u1820' && LA40_0 <= '\u1877'))) {
               alt40 = 201;
            }
            else if (((LA40_0 >= '\u1880' && LA40_0 <= '\u18A8'))) {
               alt40 = 202;
            }
            else if (((LA40_0 >= '\u1900' && LA40_0 <= '\u191C'))) {
               alt40 = 203;
            }
            else if (((LA40_0 >= '\u1950' && LA40_0 <= '\u196D'))) {
               alt40 = 204;
            }
            else if (((LA40_0 >= '\u1970' && LA40_0 <= '\u1974'))) {
               alt40 = 205;
            }
            else if (((LA40_0 >= '\u1D00' && LA40_0 <= '\u1D6B'))) {
               alt40 = 206;
            }
            else if (((LA40_0 >= '\u1E00' && LA40_0 <= '\u1E9B'))) {
               alt40 = 207;
            }
            else if (((LA40_0 >= '\u1EA0' && LA40_0 <= '\u1EF9'))) {
               alt40 = 208;
            }
            else if (((LA40_0 >= '\u1F00' && LA40_0 <= '\u1F15'))) {
               alt40 = 209;
            }
            else if (((LA40_0 >= '\u1F18' && LA40_0 <= '\u1F1D'))) {
               alt40 = 210;
            }
            else if (((LA40_0 >= '\u1F20' && LA40_0 <= '\u1F45'))) {
               alt40 = 211;
            }
            else if (((LA40_0 >= '\u1F48' && LA40_0 <= '\u1F4D'))) {
               alt40 = 212;
            }
            else if (((LA40_0 >= '\u1F50' && LA40_0 <= '\u1F57'))) {
               alt40 = 213;
            }
            else if ((LA40_0 == '\u1F59')) {
               alt40 = 214;
            }
            else if ((LA40_0 == '\u1F5B')) {
               alt40 = 215;
            }
            else if ((LA40_0 == '\u1F5D')) {
               alt40 = 216;
            }
            else if (((LA40_0 >= '\u1F5F' && LA40_0 <= '\u1F7D'))) {
               alt40 = 217;
            }
            else if (((LA40_0 >= '\u1F80' && LA40_0 <= '\u1FB4'))) {
               alt40 = 218;
            }
            else if (((LA40_0 >= '\u1FB6' && LA40_0 <= '\u1FBC'))) {
               alt40 = 219;
            }
            else if ((LA40_0 == '\u1FBE')) {
               alt40 = 220;
            }
            else if (((LA40_0 >= '\u1FC2' && LA40_0 <= '\u1FC4'))) {
               alt40 = 221;
            }
            else if (((LA40_0 >= '\u1FC6' && LA40_0 <= '\u1FCC'))) {
               alt40 = 222;
            }
            else if (((LA40_0 >= '\u1FD0' && LA40_0 <= '\u1FD3'))) {
               alt40 = 223;
            }
            else if (((LA40_0 >= '\u1FD6' && LA40_0 <= '\u1FDB'))) {
               alt40 = 224;
            }
            else if (((LA40_0 >= '\u1FE0' && LA40_0 <= '\u1FEC'))) {
               alt40 = 225;
            }
            else if (((LA40_0 >= '\u1FF2' && LA40_0 <= '\u1FF4'))) {
               alt40 = 226;
            }
            else if (((LA40_0 >= '\u1FF6' && LA40_0 <= '\u1FFC'))) {
               alt40 = 227;
            }
            else if (((LA40_0 >= '\u203F' && LA40_0 <= '\u2040'))) {
               alt40 = 228;
            }
            else if ((LA40_0 == '\u2054')) {
               alt40 = 229;
            }
            else if ((LA40_0 == '\u2071')) {
               alt40 = 230;
            }
            else if ((LA40_0 == '\u207F')) {
               alt40 = 231;
            }
            else if (((LA40_0 >= '\u20A0' && LA40_0 <= '\u20B1'))) {
               alt40 = 232;
            }
            else if ((LA40_0 == '\u2102')) {
               alt40 = 233;
            }
            else if ((LA40_0 == '\u2107')) {
               alt40 = 234;
            }
            else if (((LA40_0 >= '\u210A' && LA40_0 <= '\u2113'))) {
               alt40 = 235;
            }
            else if ((LA40_0 == '\u2115')) {
               alt40 = 236;
            }
            else if (((LA40_0 >= '\u2119' && LA40_0 <= '\u211D'))) {
               alt40 = 237;
            }
            else if ((LA40_0 == '\u2124')) {
               alt40 = 238;
            }
            else if ((LA40_0 == '\u2126')) {
               alt40 = 239;
            }
            else if ((LA40_0 == '\u2128')) {
               alt40 = 240;
            }
            else if (((LA40_0 >= '\u212A' && LA40_0 <= '\u212D'))) {
               alt40 = 241;
            }
            else if (((LA40_0 >= '\u212F' && LA40_0 <= '\u2131'))) {
               alt40 = 242;
            }
            else if (((LA40_0 >= '\u2133' && LA40_0 <= '\u2139'))) {
               alt40 = 243;
            }
            else if (((LA40_0 >= '\u213D' && LA40_0 <= '\u213F'))) {
               alt40 = 244;
            }
            else if (((LA40_0 >= '\u2145' && LA40_0 <= '\u2149'))) {
               alt40 = 245;
            }
            else if (((LA40_0 >= '\u2160' && LA40_0 <= '\u2183'))) {
               alt40 = 246;
            }
            else if (((LA40_0 >= '\u3005' && LA40_0 <= '\u3007'))) {
               alt40 = 247;
            }
            else if (((LA40_0 >= '\u3021' && LA40_0 <= '\u3029'))) {
               alt40 = 248;
            }
            else if (((LA40_0 >= '\u3031' && LA40_0 <= '\u3035'))) {
               alt40 = 249;
            }
            else if (((LA40_0 >= '\u3038' && LA40_0 <= '\u303C'))) {
               alt40 = 250;
            }
            else if (((LA40_0 >= '\u3041' && LA40_0 <= '\u3096'))) {
               alt40 = 251;
            }
            else if (((LA40_0 >= '\u309D' && LA40_0 <= '\u309F'))) {
               alt40 = 252;
            }
            else if (((LA40_0 >= '\u30A1' && LA40_0 <= '\u30FF'))) {
               alt40 = 253;
            }
            else if (((LA40_0 >= '\u3105' && LA40_0 <= '\u312C'))) {
               alt40 = 254;
            }
            else if (((LA40_0 >= '\u3131' && LA40_0 <= '\u318E'))) {
               alt40 = 255;
            }
            else if (((LA40_0 >= '\u31A0' && LA40_0 <= '\u31B7'))) {
               alt40 = 256;
            }
            else if (((LA40_0 >= '\u31F0' && LA40_0 <= '\u31FF'))) {
               alt40 = 257;
            }
            else if (((LA40_0 >= '\u3400' && LA40_0 <= '\u4DB5'))) {
               alt40 = 258;
            }
            else if (((LA40_0 >= '\u4E00' && LA40_0 <= '\u9FA5'))) {
               alt40 = 259;
            }
            else if (((LA40_0 >= '\uA000' && LA40_0 <= '\uA48C'))) {
               alt40 = 260;
            }
            else if (((LA40_0 >= '\uAC00' && LA40_0 <= '\uD7A3'))) {
               alt40 = 261;
            }
            else if (((LA40_0 >= '\uF900' && LA40_0 <= '\uFA2D'))) {
               alt40 = 262;
            }
            else if (((LA40_0 >= '\uFA30' && LA40_0 <= '\uFA6A'))) {
               alt40 = 263;
            }
            else if (((LA40_0 >= '\uFB00' && LA40_0 <= '\uFB06'))) {
               alt40 = 264;
            }
            else if (((LA40_0 >= '\uFB13' && LA40_0 <= '\uFB17'))) {
               alt40 = 265;
            }
            else if ((LA40_0 == '\uFB1D')) {
               alt40 = 266;
            }
            else if (((LA40_0 >= '\uFB1F' && LA40_0 <= '\uFB28'))) {
               alt40 = 267;
            }
            else if (((LA40_0 >= '\uFB2A' && LA40_0 <= '\uFB36'))) {
               alt40 = 268;
            }
            else if (((LA40_0 >= '\uFB38' && LA40_0 <= '\uFB3C'))) {
               alt40 = 269;
            }
            else if ((LA40_0 == '\uFB3E')) {
               alt40 = 270;
            }
            else if (((LA40_0 >= '\uFB40' && LA40_0 <= '\uFB41'))) {
               alt40 = 271;
            }
            else if (((LA40_0 >= '\uFB43' && LA40_0 <= '\uFB44'))) {
               alt40 = 272;
            }
            else if (((LA40_0 >= '\uFB46' && LA40_0 <= '\uFBB1'))) {
               alt40 = 273;
            }
            else if (((LA40_0 >= '\uFBD3' && LA40_0 <= '\uFD3D'))) {
               alt40 = 274;
            }
            else if (((LA40_0 >= '\uFD50' && LA40_0 <= '\uFD8F'))) {
               alt40 = 275;
            }
            else if (((LA40_0 >= '\uFD92' && LA40_0 <= '\uFDC7'))) {
               alt40 = 276;
            }
            else if (((LA40_0 >= '\uFDF0' && LA40_0 <= '\uFDFC'))) {
               alt40 = 277;
            }
            else if (((LA40_0 >= '\uFE33' && LA40_0 <= '\uFE34'))) {
               alt40 = 278;
            }
            else if (((LA40_0 >= '\uFE4D' && LA40_0 <= '\uFE4F'))) {
               alt40 = 279;
            }
            else if ((LA40_0 == '\uFE69')) {
               alt40 = 280;
            }
            else if (((LA40_0 >= '\uFE70' && LA40_0 <= '\uFE74'))) {
               alt40 = 281;
            }
            else if (((LA40_0 >= '\uFE76' && LA40_0 <= '\uFEFC'))) {
               alt40 = 282;
            }
            else if ((LA40_0 == '\uFF04')) {
               alt40 = 283;
            }
            else if (((LA40_0 >= '\uFF21' && LA40_0 <= '\uFF3A'))) {
               alt40 = 284;
            }
            else if ((LA40_0 == '\uFF3F')) {
               alt40 = 285;
            }
            else if (((LA40_0 >= '\uFF41' && LA40_0 <= '\uFF5A'))) {
               alt40 = 286;
            }
            else if (((LA40_0 >= '\uFF65' && LA40_0 <= '\uFFBE'))) {
               alt40 = 287;
            }
            else if (((LA40_0 >= '\uFFC2' && LA40_0 <= '\uFFC7'))) {
               alt40 = 288;
            }
            else if (((LA40_0 >= '\uFFCA' && LA40_0 <= '\uFFCF'))) {
               alt40 = 289;
            }
            else if (((LA40_0 >= '\uFFD2' && LA40_0 <= '\uFFD7'))) {
               alt40 = 290;
            }
            else if (((LA40_0 >= '\uFFDA' && LA40_0 <= '\uFFDC'))) {
               alt40 = 291;
            }
            else if (((LA40_0 >= '\uFFE0' && LA40_0 <= '\uFFE1'))) {
               alt40 = 292;
            }
            else if (((LA40_0 >= '\uFFE5' && LA40_0 <= '\uFFE6'))) {
               alt40 = 293;
            }
            else if (((LA40_0 >= '\uD800' && LA40_0 <= '\uDBFF'))) {
               alt40 = 294;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 40, 0, input);

               throw nvae;
            }
            switch (alt40) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:29:
               // '$'
               {
                  match('$');

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:33:
               // 'A' .. 'Z'
               {
                  matchRange('A', 'Z');

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:42:
               // '_'
               {
                  match('_');

               }
                  break;
               case 4 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:46:
               // 'a' .. 'z'
               {
                  matchRange('a', 'z');

               }
                  break;
               case 5 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:55:
               // '\\u00A2' .. '\\u00A5'
               {
                  matchRange('\u00A2', '\u00A5');

               }
                  break;
               case 6 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:74:
               // '\\u00AA'
               {
                  match('\u00AA');

               }
                  break;
               case 7 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:83:
               // '\\u00B5'
               {
                  match('\u00B5');

               }
                  break;
               case 8 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:92:
               // '\\u00BA'
               {
                  match('\u00BA');

               }
                  break;
               case 9 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:101:
               // '\\u00C0' .. '\\u00D6'
               {
                  matchRange('\u00C0', '\u00D6');

               }
                  break;
               case 10 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:120:
               // '\\u00D8' .. '\\u00F6'
               {
                  matchRange('\u00D8', '\u00F6');

               }
                  break;
               case 11 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:139:
               // '\\u00F8' .. '\\u0236'
               {
                  matchRange('\u00F8', '\u0236');

               }
                  break;
               case 12 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:158:
               // '\\u0250' .. '\\u02C1'
               {
                  matchRange('\u0250', '\u02C1');

               }
                  break;
               case 13 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:177:
               // '\\u02C6' .. '\\u02D1'
               {
                  matchRange('\u02C6', '\u02D1');

               }
                  break;
               case 14 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:196:
               // '\\u02E0' .. '\\u02E4'
               {
                  matchRange('\u02E0', '\u02E4');

               }
                  break;
               case 15 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:215:
               // '\\u02EE'
               {
                  match('\u02EE');

               }
                  break;
               case 16 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:224:
               // '\\u037A'
               {
                  match('\u037A');

               }
                  break;
               case 17 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:233:
               // '\\u0386'
               {
                  match('\u0386');

               }
                  break;
               case 18 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:242:
               // '\\u0388' .. '\\u038A'
               {
                  matchRange('\u0388', '\u038A');

               }
                  break;
               case 19 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:261:
               // '\\u038C'
               {
                  match('\u038C');

               }
                  break;
               case 20 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:270:
               // '\\u038E' .. '\\u03A1'
               {
                  matchRange('\u038E', '\u03A1');

               }
                  break;
               case 21 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:289:
               // '\\u03A3' .. '\\u03CE'
               {
                  matchRange('\u03A3', '\u03CE');

               }
                  break;
               case 22 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:308:
               // '\\u03D0' .. '\\u03F5'
               {
                  matchRange('\u03D0', '\u03F5');

               }
                  break;
               case 23 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:327:
               // '\\u03F7' .. '\\u03FB'
               {
                  matchRange('\u03F7', '\u03FB');

               }
                  break;
               case 24 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:346:
               // '\\u0400' .. '\\u0481'
               {
                  matchRange('\u0400', '\u0481');

               }
                  break;
               case 25 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:365:
               // '\\u048A' .. '\\u04CE'
               {
                  matchRange('\u048A', '\u04CE');

               }
                  break;
               case 26 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:384:
               // '\\u04D0' .. '\\u04F5'
               {
                  matchRange('\u04D0', '\u04F5');

               }
                  break;
               case 27 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:403:
               // '\\u04F8' .. '\\u04F9'
               {
                  matchRange('\u04F8', '\u04F9');

               }
                  break;
               case 28 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:422:
               // '\\u0500' .. '\\u050F'
               {
                  matchRange('\u0500', '\u050F');

               }
                  break;
               case 29 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:441:
               // '\\u0531' .. '\\u0556'
               {
                  matchRange('\u0531', '\u0556');

               }
                  break;
               case 30 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:460:
               // '\\u0559'
               {
                  match('\u0559');

               }
                  break;
               case 31 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:469:
               // '\\u0561' .. '\\u0587'
               {
                  matchRange('\u0561', '\u0587');

               }
                  break;
               case 32 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:488:
               // '\\u05D0' .. '\\u05EA'
               {
                  matchRange('\u05D0', '\u05EA');

               }
                  break;
               case 33 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:507:
               // '\\u05F0' .. '\\u05F2'
               {
                  matchRange('\u05F0', '\u05F2');

               }
                  break;
               case 34 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:526:
               // '\\u0621' .. '\\u063A'
               {
                  matchRange('\u0621', '\u063A');

               }
                  break;
               case 35 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:545:
               // '\\u0640' .. '\\u064A'
               {
                  matchRange('\u0640', '\u064A');

               }
                  break;
               case 36 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:564:
               // '\\u066E' .. '\\u066F'
               {
                  matchRange('\u066E', '\u066F');

               }
                  break;
               case 37 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:583:
               // '\\u0671' .. '\\u06D3'
               {
                  matchRange('\u0671', '\u06D3');

               }
                  break;
               case 38 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:602:
               // '\\u06D5'
               {
                  match('\u06D5');

               }
                  break;
               case 39 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:611:
               // '\\u06E5' .. '\\u06E6'
               {
                  matchRange('\u06E5', '\u06E6');

               }
                  break;
               case 40 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:630:
               // '\\u06EE' .. '\\u06EF'
               {
                  matchRange('\u06EE', '\u06EF');

               }
                  break;
               case 41 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:649:
               // '\\u06FA' .. '\\u06FC'
               {
                  matchRange('\u06FA', '\u06FC');

               }
                  break;
               case 42 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:668:
               // '\\u06FF'
               {
                  match('\u06FF');

               }
                  break;
               case 43 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:677:
               // '\\u0710'
               {
                  match('\u0710');

               }
                  break;
               case 44 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:686:
               // '\\u0712' .. '\\u072F'
               {
                  matchRange('\u0712', '\u072F');

               }
                  break;
               case 45 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:705:
               // '\\u074D' .. '\\u074F'
               {
                  matchRange('\u074D', '\u074F');

               }
                  break;
               case 46 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:724:
               // '\\u0780' .. '\\u07A5'
               {
                  matchRange('\u0780', '\u07A5');

               }
                  break;
               case 47 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:743:
               // '\\u07B1'
               {
                  match('\u07B1');

               }
                  break;
               case 48 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:752:
               // '\\u0904' .. '\\u0939'
               {
                  matchRange('\u0904', '\u0939');

               }
                  break;
               case 49 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:771:
               // '\\u093D'
               {
                  match('\u093D');

               }
                  break;
               case 50 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:780:
               // '\\u0950'
               {
                  match('\u0950');

               }
                  break;
               case 51 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:789:
               // '\\u0958' .. '\\u0961'
               {
                  matchRange('\u0958', '\u0961');

               }
                  break;
               case 52 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:808:
               // '\\u0985' .. '\\u098C'
               {
                  matchRange('\u0985', '\u098C');

               }
                  break;
               case 53 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:827:
               // '\\u098F' .. '\\u0990'
               {
                  matchRange('\u098F', '\u0990');

               }
                  break;
               case 54 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:846:
               // '\\u0993' .. '\\u09A8'
               {
                  matchRange('\u0993', '\u09A8');

               }
                  break;
               case 55 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:865:
               // '\\u09AA' .. '\\u09B0'
               {
                  matchRange('\u09AA', '\u09B0');

               }
                  break;
               case 56 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:884:
               // '\\u09B2'
               {
                  match('\u09B2');

               }
                  break;
               case 57 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:893:
               // '\\u09B6' .. '\\u09B9'
               {
                  matchRange('\u09B6', '\u09B9');

               }
                  break;
               case 58 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:912:
               // '\\u09BD'
               {
                  match('\u09BD');

               }
                  break;
               case 59 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:921:
               // '\\u09DC' .. '\\u09DD'
               {
                  matchRange('\u09DC', '\u09DD');

               }
                  break;
               case 60 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:940:
               // '\\u09DF' .. '\\u09E1'
               {
                  matchRange('\u09DF', '\u09E1');

               }
                  break;
               case 61 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:959:
               // '\\u09F0' .. '\\u09F3'
               {
                  matchRange('\u09F0', '\u09F3');

               }
                  break;
               case 62 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:978:
               // '\\u0A05' .. '\\u0A0A'
               {
                  matchRange('\u0A05', '\u0A0A');

               }
                  break;
               case 63 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:997:
               // '\\u0A0F' .. '\\u0A10'
               {
                  matchRange('\u0A0F', '\u0A10');

               }
                  break;
               case 64 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1016:
               // '\\u0A13' .. '\\u0A28'
               {
                  matchRange('\u0A13', '\u0A28');

               }
                  break;
               case 65 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1035:
               // '\\u0A2A' .. '\\u0A30'
               {
                  matchRange('\u0A2A', '\u0A30');

               }
                  break;
               case 66 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1054:
               // '\\u0A32' .. '\\u0A33'
               {
                  matchRange('\u0A32', '\u0A33');

               }
                  break;
               case 67 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1073:
               // '\\u0A35' .. '\\u0A36'
               {
                  matchRange('\u0A35', '\u0A36');

               }
                  break;
               case 68 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1092:
               // '\\u0A38' .. '\\u0A39'
               {
                  matchRange('\u0A38', '\u0A39');

               }
                  break;
               case 69 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1111:
               // '\\u0A59' .. '\\u0A5C'
               {
                  matchRange('\u0A59', '\u0A5C');

               }
                  break;
               case 70 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1130:
               // '\\u0A5E'
               {
                  match('\u0A5E');

               }
                  break;
               case 71 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1139:
               // '\\u0A72' .. '\\u0A74'
               {
                  matchRange('\u0A72', '\u0A74');

               }
                  break;
               case 72 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1158:
               // '\\u0A85' .. '\\u0A8D'
               {
                  matchRange('\u0A85', '\u0A8D');

               }
                  break;
               case 73 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1177:
               // '\\u0A8F' .. '\\u0A91'
               {
                  matchRange('\u0A8F', '\u0A91');

               }
                  break;
               case 74 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1196:
               // '\\u0A93' .. '\\u0AA8'
               {
                  matchRange('\u0A93', '\u0AA8');

               }
                  break;
               case 75 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1215:
               // '\\u0AAA' .. '\\u0AB0'
               {
                  matchRange('\u0AAA', '\u0AB0');

               }
                  break;
               case 76 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1234:
               // '\\u0AB2' .. '\\u0AB3'
               {
                  matchRange('\u0AB2', '\u0AB3');

               }
                  break;
               case 77 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1253:
               // '\\u0AB5' .. '\\u0AB9'
               {
                  matchRange('\u0AB5', '\u0AB9');

               }
                  break;
               case 78 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1272:
               // '\\u0ABD'
               {
                  match('\u0ABD');

               }
                  break;
               case 79 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1281:
               // '\\u0AD0'
               {
                  match('\u0AD0');

               }
                  break;
               case 80 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1290:
               // '\\u0AE0' .. '\\u0AE1'
               {
                  matchRange('\u0AE0', '\u0AE1');

               }
                  break;
               case 81 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1309:
               // '\\u0AF1'
               {
                  match('\u0AF1');

               }
                  break;
               case 82 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1318:
               // '\\u0B05' .. '\\u0B0C'
               {
                  matchRange('\u0B05', '\u0B0C');

               }
                  break;
               case 83 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1337:
               // '\\u0B0F' .. '\\u0B10'
               {
                  matchRange('\u0B0F', '\u0B10');

               }
                  break;
               case 84 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1356:
               // '\\u0B13' .. '\\u0B28'
               {
                  matchRange('\u0B13', '\u0B28');

               }
                  break;
               case 85 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1375:
               // '\\u0B2A' .. '\\u0B30'
               {
                  matchRange('\u0B2A', '\u0B30');

               }
                  break;
               case 86 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1394:
               // '\\u0B32' .. '\\u0B33'
               {
                  matchRange('\u0B32', '\u0B33');

               }
                  break;
               case 87 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1413:
               // '\\u0B35' .. '\\u0B39'
               {
                  matchRange('\u0B35', '\u0B39');

               }
                  break;
               case 88 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1432:
               // '\\u0B3D'
               {
                  match('\u0B3D');

               }
                  break;
               case 89 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1441:
               // '\\u0B5C' .. '\\u0B5D'
               {
                  matchRange('\u0B5C', '\u0B5D');

               }
                  break;
               case 90 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1460:
               // '\\u0B5F' .. '\\u0B61'
               {
                  matchRange('\u0B5F', '\u0B61');

               }
                  break;
               case 91 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1479:
               // '\\u0B71'
               {
                  match('\u0B71');

               }
                  break;
               case 92 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1488:
               // '\\u0B83'
               {
                  match('\u0B83');

               }
                  break;
               case 93 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1497:
               // '\\u0B85' .. '\\u0B8A'
               {
                  matchRange('\u0B85', '\u0B8A');

               }
                  break;
               case 94 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1516:
               // '\\u0B8E' .. '\\u0B90'
               {
                  matchRange('\u0B8E', '\u0B90');

               }
                  break;
               case 95 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1535:
               // '\\u0B92' .. '\\u0B95'
               {
                  matchRange('\u0B92', '\u0B95');

               }
                  break;
               case 96 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1554:
               // '\\u0B99' .. '\\u0B9A'
               {
                  matchRange('\u0B99', '\u0B9A');

               }
                  break;
               case 97 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1573:
               // '\\u0B9C'
               {
                  match('\u0B9C');

               }
                  break;
               case 98 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1582:
               // '\\u0B9E' .. '\\u0B9F'
               {
                  matchRange('\u0B9E', '\u0B9F');

               }
                  break;
               case 99 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1601:
               // '\\u0BA3' .. '\\u0BA4'
               {
                  matchRange('\u0BA3', '\u0BA4');

               }
                  break;
               case 100 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1620:
               // '\\u0BA8' .. '\\u0BAA'
               {
                  matchRange('\u0BA8', '\u0BAA');

               }
                  break;
               case 101 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1639:
               // '\\u0BAE' .. '\\u0BB5'
               {
                  matchRange('\u0BAE', '\u0BB5');

               }
                  break;
               case 102 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1658:
               // '\\u0BB7' .. '\\u0BB9'
               {
                  matchRange('\u0BB7', '\u0BB9');

               }
                  break;
               case 103 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1677:
               // '\\u0BF9'
               {
                  match('\u0BF9');

               }
                  break;
               case 104 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1686:
               // '\\u0C05' .. '\\u0C0C'
               {
                  matchRange('\u0C05', '\u0C0C');

               }
                  break;
               case 105 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1705:
               // '\\u0C0E' .. '\\u0C10'
               {
                  matchRange('\u0C0E', '\u0C10');

               }
                  break;
               case 106 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1724:
               // '\\u0C12' .. '\\u0C28'
               {
                  matchRange('\u0C12', '\u0C28');

               }
                  break;
               case 107 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1743:
               // '\\u0C2A' .. '\\u0C33'
               {
                  matchRange('\u0C2A', '\u0C33');

               }
                  break;
               case 108 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1762:
               // '\\u0C35' .. '\\u0C39'
               {
                  matchRange('\u0C35', '\u0C39');

               }
                  break;
               case 109 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1781:
               // '\\u0C60' .. '\\u0C61'
               {
                  matchRange('\u0C60', '\u0C61');

               }
                  break;
               case 110 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1800:
               // '\\u0C85' .. '\\u0C8C'
               {
                  matchRange('\u0C85', '\u0C8C');

               }
                  break;
               case 111 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1819:
               // '\\u0C8E' .. '\\u0C90'
               {
                  matchRange('\u0C8E', '\u0C90');

               }
                  break;
               case 112 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1838:
               // '\\u0C92' .. '\\u0CA8'
               {
                  matchRange('\u0C92', '\u0CA8');

               }
                  break;
               case 113 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1857:
               // '\\u0CAA' .. '\\u0CB3'
               {
                  matchRange('\u0CAA', '\u0CB3');

               }
                  break;
               case 114 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1876:
               // '\\u0CB5' .. '\\u0CB9'
               {
                  matchRange('\u0CB5', '\u0CB9');

               }
                  break;
               case 115 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1895:
               // '\\u0CBD'
               {
                  match('\u0CBD');

               }
                  break;
               case 116 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1904:
               // '\\u0CDE'
               {
                  match('\u0CDE');

               }
                  break;
               case 117 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1913:
               // '\\u0CE0' .. '\\u0CE1'
               {
                  matchRange('\u0CE0', '\u0CE1');

               }
                  break;
               case 118 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1932:
               // '\\u0D05' .. '\\u0D0C'
               {
                  matchRange('\u0D05', '\u0D0C');

               }
                  break;
               case 119 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1951:
               // '\\u0D0E' .. '\\u0D10'
               {
                  matchRange('\u0D0E', '\u0D10');

               }
                  break;
               case 120 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1970:
               // '\\u0D12' .. '\\u0D28'
               {
                  matchRange('\u0D12', '\u0D28');

               }
                  break;
               case 121 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:1989:
               // '\\u0D2A' .. '\\u0D39'
               {
                  matchRange('\u0D2A', '\u0D39');

               }
                  break;
               case 122 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2008:
               // '\\u0D60' .. '\\u0D61'
               {
                  matchRange('\u0D60', '\u0D61');

               }
                  break;
               case 123 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2027:
               // '\\u0D85' .. '\\u0D96'
               {
                  matchRange('\u0D85', '\u0D96');

               }
                  break;
               case 124 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2046:
               // '\\u0D9A' .. '\\u0DB1'
               {
                  matchRange('\u0D9A', '\u0DB1');

               }
                  break;
               case 125 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2065:
               // '\\u0DB3' .. '\\u0DBB'
               {
                  matchRange('\u0DB3', '\u0DBB');

               }
                  break;
               case 126 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2084:
               // '\\u0DBD'
               {
                  match('\u0DBD');

               }
                  break;
               case 127 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2093:
               // '\\u0DC0' .. '\\u0DC6'
               {
                  matchRange('\u0DC0', '\u0DC6');

               }
                  break;
               case 128 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2112:
               // '\\u0E01' .. '\\u0E30'
               {
                  matchRange('\u0E01', '\u0E30');

               }
                  break;
               case 129 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2131:
               // '\\u0E32' .. '\\u0E33'
               {
                  matchRange('\u0E32', '\u0E33');

               }
                  break;
               case 130 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2150:
               // '\\u0E3F' .. '\\u0E46'
               {
                  matchRange('\u0E3F', '\u0E46');

               }
                  break;
               case 131 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2169:
               // '\\u0E81' .. '\\u0E82'
               {
                  matchRange('\u0E81', '\u0E82');

               }
                  break;
               case 132 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2188:
               // '\\u0E84'
               {
                  match('\u0E84');

               }
                  break;
               case 133 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2197:
               // '\\u0E87' .. '\\u0E88'
               {
                  matchRange('\u0E87', '\u0E88');

               }
                  break;
               case 134 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2216:
               // '\\u0E8A'
               {
                  match('\u0E8A');

               }
                  break;
               case 135 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2225:
               // '\\u0E8D'
               {
                  match('\u0E8D');

               }
                  break;
               case 136 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2234:
               // '\\u0E94' .. '\\u0E97'
               {
                  matchRange('\u0E94', '\u0E97');

               }
                  break;
               case 137 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2253:
               // '\\u0E99' .. '\\u0E9F'
               {
                  matchRange('\u0E99', '\u0E9F');

               }
                  break;
               case 138 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2272:
               // '\\u0EA1' .. '\\u0EA3'
               {
                  matchRange('\u0EA1', '\u0EA3');

               }
                  break;
               case 139 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2291:
               // '\\u0EA5'
               {
                  match('\u0EA5');

               }
                  break;
               case 140 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2300:
               // '\\u0EA7'
               {
                  match('\u0EA7');

               }
                  break;
               case 141 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2309:
               // '\\u0EAA' .. '\\u0EAB'
               {
                  matchRange('\u0EAA', '\u0EAB');

               }
                  break;
               case 142 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2328:
               // '\\u0EAD' .. '\\u0EB0'
               {
                  matchRange('\u0EAD', '\u0EB0');

               }
                  break;
               case 143 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2347:
               // '\\u0EB2' .. '\\u0EB3'
               {
                  matchRange('\u0EB2', '\u0EB3');

               }
                  break;
               case 144 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2366:
               // '\\u0EBD'
               {
                  match('\u0EBD');

               }
                  break;
               case 145 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2375:
               // '\\u0EC0' .. '\\u0EC4'
               {
                  matchRange('\u0EC0', '\u0EC4');

               }
                  break;
               case 146 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2394:
               // '\\u0EC6'
               {
                  match('\u0EC6');

               }
                  break;
               case 147 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2403:
               // '\\u0EDC' .. '\\u0EDD'
               {
                  matchRange('\u0EDC', '\u0EDD');

               }
                  break;
               case 148 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2422:
               // '\\u0F00'
               {
                  match('\u0F00');

               }
                  break;
               case 149 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2431:
               // '\\u0F40' .. '\\u0F47'
               {
                  matchRange('\u0F40', '\u0F47');

               }
                  break;
               case 150 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2450:
               // '\\u0F49' .. '\\u0F6A'
               {
                  matchRange('\u0F49', '\u0F6A');

               }
                  break;
               case 151 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2469:
               // '\\u0F88' .. '\\u0F8B'
               {
                  matchRange('\u0F88', '\u0F8B');

               }
                  break;
               case 152 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2488:
               // '\\u1000' .. '\\u1021'
               {
                  matchRange('\u1000', '\u1021');

               }
                  break;
               case 153 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2507:
               // '\\u1023' .. '\\u1027'
               {
                  matchRange('\u1023', '\u1027');

               }
                  break;
               case 154 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2526:
               // '\\u1029' .. '\\u102A'
               {
                  matchRange('\u1029', '\u102A');

               }
                  break;
               case 155 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2545:
               // '\\u1050' .. '\\u1055'
               {
                  matchRange('\u1050', '\u1055');

               }
                  break;
               case 156 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2564:
               // '\\u10A0' .. '\\u10C5'
               {
                  matchRange('\u10A0', '\u10C5');

               }
                  break;
               case 157 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2583:
               // '\\u10D0' .. '\\u10F8'
               {
                  matchRange('\u10D0', '\u10F8');

               }
                  break;
               case 158 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2602:
               // '\\u1100' .. '\\u1159'
               {
                  matchRange('\u1100', '\u1159');

               }
                  break;
               case 159 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2621:
               // '\\u115F' .. '\\u11A2'
               {
                  matchRange('\u115F', '\u11A2');

               }
                  break;
               case 160 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2640:
               // '\\u11A8' .. '\\u11F9'
               {
                  matchRange('\u11A8', '\u11F9');

               }
                  break;
               case 161 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2659:
               // '\\u1200' .. '\\u1206'
               {
                  matchRange('\u1200', '\u1206');

               }
                  break;
               case 162 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2678:
               // '\\u1208' .. '\\u1246'
               {
                  matchRange('\u1208', '\u1246');

               }
                  break;
               case 163 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2697:
               // '\\u1248'
               {
                  match('\u1248');

               }
                  break;
               case 164 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2706:
               // '\\u124A' .. '\\u124D'
               {
                  matchRange('\u124A', '\u124D');

               }
                  break;
               case 165 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2725:
               // '\\u1250' .. '\\u1256'
               {
                  matchRange('\u1250', '\u1256');

               }
                  break;
               case 166 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2744:
               // '\\u1258'
               {
                  match('\u1258');

               }
                  break;
               case 167 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2753:
               // '\\u125A' .. '\\u125D'
               {
                  matchRange('\u125A', '\u125D');

               }
                  break;
               case 168 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2772:
               // '\\u1260' .. '\\u1286'
               {
                  matchRange('\u1260', '\u1286');

               }
                  break;
               case 169 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2791:
               // '\\u1288'
               {
                  match('\u1288');

               }
                  break;
               case 170 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2800:
               // '\\u128A' .. '\\u128D'
               {
                  matchRange('\u128A', '\u128D');

               }
                  break;
               case 171 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2819:
               // '\\u1290' .. '\\u12AE'
               {
                  matchRange('\u1290', '\u12AE');

               }
                  break;
               case 172 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2838:
               // '\\u12B0'
               {
                  match('\u12B0');

               }
                  break;
               case 173 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2847:
               // '\\u12B2' .. '\\u12B5'
               {
                  matchRange('\u12B2', '\u12B5');

               }
                  break;
               case 174 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2866:
               // '\\u12B8' .. '\\u12BE'
               {
                  matchRange('\u12B8', '\u12BE');

               }
                  break;
               case 175 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2885:
               // '\\u12C0'
               {
                  match('\u12C0');

               }
                  break;
               case 176 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2894:
               // '\\u12C2' .. '\\u12C5'
               {
                  matchRange('\u12C2', '\u12C5');

               }
                  break;
               case 177 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2913:
               // '\\u12C8' .. '\\u12CE'
               {
                  matchRange('\u12C8', '\u12CE');

               }
                  break;
               case 178 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2932:
               // '\\u12D0' .. '\\u12D6'
               {
                  matchRange('\u12D0', '\u12D6');

               }
                  break;
               case 179 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2951:
               // '\\u12D8' .. '\\u12EE'
               {
                  matchRange('\u12D8', '\u12EE');

               }
                  break;
               case 180 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2970:
               // '\\u12F0' .. '\\u130E'
               {
                  matchRange('\u12F0', '\u130E');

               }
                  break;
               case 181 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2989:
               // '\\u1310'
               {
                  match('\u1310');

               }
                  break;
               case 182 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:2998:
               // '\\u1312' .. '\\u1315'
               {
                  matchRange('\u1312', '\u1315');

               }
                  break;
               case 183 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3017:
               // '\\u1318' .. '\\u131E'
               {
                  matchRange('\u1318', '\u131E');

               }
                  break;
               case 184 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3036:
               // '\\u1320' .. '\\u1346'
               {
                  matchRange('\u1320', '\u1346');

               }
                  break;
               case 185 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3055:
               // '\\u1348' .. '\\u135A'
               {
                  matchRange('\u1348', '\u135A');

               }
                  break;
               case 186 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3074:
               // '\\u13A0' .. '\\u13F4'
               {
                  matchRange('\u13A0', '\u13F4');

               }
                  break;
               case 187 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3093:
               // '\\u1401' .. '\\u166C'
               {
                  matchRange('\u1401', '\u166C');

               }
                  break;
               case 188 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3112:
               // '\\u166F' .. '\\u1676'
               {
                  matchRange('\u166F', '\u1676');

               }
                  break;
               case 189 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3131:
               // '\\u1681' .. '\\u169A'
               {
                  matchRange('\u1681', '\u169A');

               }
                  break;
               case 190 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3150:
               // '\\u16A0' .. '\\u16EA'
               {
                  matchRange('\u16A0', '\u16EA');

               }
                  break;
               case 191 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3169:
               // '\\u16EE' .. '\\u16F0'
               {
                  matchRange('\u16EE', '\u16F0');

               }
                  break;
               case 192 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3188:
               // '\\u1700' .. '\\u170C'
               {
                  matchRange('\u1700', '\u170C');

               }
                  break;
               case 193 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3207:
               // '\\u170E' .. '\\u1711'
               {
                  matchRange('\u170E', '\u1711');

               }
                  break;
               case 194 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3226:
               // '\\u1720' .. '\\u1731'
               {
                  matchRange('\u1720', '\u1731');

               }
                  break;
               case 195 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3245:
               // '\\u1740' .. '\\u1751'
               {
                  matchRange('\u1740', '\u1751');

               }
                  break;
               case 196 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3264:
               // '\\u1760' .. '\\u176C'
               {
                  matchRange('\u1760', '\u176C');

               }
                  break;
               case 197 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3283:
               // '\\u176E' .. '\\u1770'
               {
                  matchRange('\u176E', '\u1770');

               }
                  break;
               case 198 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3302:
               // '\\u1780' .. '\\u17B3'
               {
                  matchRange('\u1780', '\u17B3');

               }
                  break;
               case 199 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3321:
               // '\\u17D7'
               {
                  match('\u17D7');

               }
                  break;
               case 200 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3330:
               // '\\u17DB' .. '\\u17DC'
               {
                  matchRange('\u17DB', '\u17DC');

               }
                  break;
               case 201 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3349:
               // '\\u1820' .. '\\u1877'
               {
                  matchRange('\u1820', '\u1877');

               }
                  break;
               case 202 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3368:
               // '\\u1880' .. '\\u18A8'
               {
                  matchRange('\u1880', '\u18A8');

               }
                  break;
               case 203 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3387:
               // '\\u1900' .. '\\u191C'
               {
                  matchRange('\u1900', '\u191C');

               }
                  break;
               case 204 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3406:
               // '\\u1950' .. '\\u196D'
               {
                  matchRange('\u1950', '\u196D');

               }
                  break;
               case 205 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3425:
               // '\\u1970' .. '\\u1974'
               {
                  matchRange('\u1970', '\u1974');

               }
                  break;
               case 206 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3444:
               // '\\u1D00' .. '\\u1D6B'
               {
                  matchRange('\u1D00', '\u1D6B');

               }
                  break;
               case 207 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3463:
               // '\\u1E00' .. '\\u1E9B'
               {
                  matchRange('\u1E00', '\u1E9B');

               }
                  break;
               case 208 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3482:
               // '\\u1EA0' .. '\\u1EF9'
               {
                  matchRange('\u1EA0', '\u1EF9');

               }
                  break;
               case 209 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3501:
               // '\\u1F00' .. '\\u1F15'
               {
                  matchRange('\u1F00', '\u1F15');

               }
                  break;
               case 210 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3520:
               // '\\u1F18' .. '\\u1F1D'
               {
                  matchRange('\u1F18', '\u1F1D');

               }
                  break;
               case 211 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3539:
               // '\\u1F20' .. '\\u1F45'
               {
                  matchRange('\u1F20', '\u1F45');

               }
                  break;
               case 212 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3558:
               // '\\u1F48' .. '\\u1F4D'
               {
                  matchRange('\u1F48', '\u1F4D');

               }
                  break;
               case 213 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3577:
               // '\\u1F50' .. '\\u1F57'
               {
                  matchRange('\u1F50', '\u1F57');

               }
                  break;
               case 214 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3596:
               // '\\u1F59'
               {
                  match('\u1F59');

               }
                  break;
               case 215 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3605:
               // '\\u1F5B'
               {
                  match('\u1F5B');

               }
                  break;
               case 216 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3614:
               // '\\u1F5D'
               {
                  match('\u1F5D');

               }
                  break;
               case 217 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3623:
               // '\\u1F5F' .. '\\u1F7D'
               {
                  matchRange('\u1F5F', '\u1F7D');

               }
                  break;
               case 218 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3642:
               // '\\u1F80' .. '\\u1FB4'
               {
                  matchRange('\u1F80', '\u1FB4');

               }
                  break;
               case 219 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3661:
               // '\\u1FB6' .. '\\u1FBC'
               {
                  matchRange('\u1FB6', '\u1FBC');

               }
                  break;
               case 220 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3680:
               // '\\u1FBE'
               {
                  match('\u1FBE');

               }
                  break;
               case 221 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3689:
               // '\\u1FC2' .. '\\u1FC4'
               {
                  matchRange('\u1FC2', '\u1FC4');

               }
                  break;
               case 222 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3708:
               // '\\u1FC6' .. '\\u1FCC'
               {
                  matchRange('\u1FC6', '\u1FCC');

               }
                  break;
               case 223 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3727:
               // '\\u1FD0' .. '\\u1FD3'
               {
                  matchRange('\u1FD0', '\u1FD3');

               }
                  break;
               case 224 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3746:
               // '\\u1FD6' .. '\\u1FDB'
               {
                  matchRange('\u1FD6', '\u1FDB');

               }
                  break;
               case 225 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3765:
               // '\\u1FE0' .. '\\u1FEC'
               {
                  matchRange('\u1FE0', '\u1FEC');

               }
                  break;
               case 226 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3784:
               // '\\u1FF2' .. '\\u1FF4'
               {
                  matchRange('\u1FF2', '\u1FF4');

               }
                  break;
               case 227 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3803:
               // '\\u1FF6' .. '\\u1FFC'
               {
                  matchRange('\u1FF6', '\u1FFC');

               }
                  break;
               case 228 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3822:
               // '\\u203F' .. '\\u2040'
               {
                  matchRange('\u203F', '\u2040');

               }
                  break;
               case 229 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3841:
               // '\\u2054'
               {
                  match('\u2054');

               }
                  break;
               case 230 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3850:
               // '\\u2071'
               {
                  match('\u2071');

               }
                  break;
               case 231 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3859:
               // '\\u207F'
               {
                  match('\u207F');

               }
                  break;
               case 232 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3868:
               // '\\u20A0' .. '\\u20B1'
               {
                  matchRange('\u20A0', '\u20B1');

               }
                  break;
               case 233 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3887:
               // '\\u2102'
               {
                  match('\u2102');

               }
                  break;
               case 234 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3896:
               // '\\u2107'
               {
                  match('\u2107');

               }
                  break;
               case 235 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3905:
               // '\\u210A' .. '\\u2113'
               {
                  matchRange('\u210A', '\u2113');

               }
                  break;
               case 236 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3924:
               // '\\u2115'
               {
                  match('\u2115');

               }
                  break;
               case 237 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3933:
               // '\\u2119' .. '\\u211D'
               {
                  matchRange('\u2119', '\u211D');

               }
                  break;
               case 238 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3952:
               // '\\u2124'
               {
                  match('\u2124');

               }
                  break;
               case 239 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3961:
               // '\\u2126'
               {
                  match('\u2126');

               }
                  break;
               case 240 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3970:
               // '\\u2128'
               {
                  match('\u2128');

               }
                  break;
               case 241 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3979:
               // '\\u212A' .. '\\u212D'
               {
                  matchRange('\u212A', '\u212D');

               }
                  break;
               case 242 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:3998:
               // '\\u212F' .. '\\u2131'
               {
                  matchRange('\u212F', '\u2131');

               }
                  break;
               case 243 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4017:
               // '\\u2133' .. '\\u2139'
               {
                  matchRange('\u2133', '\u2139');

               }
                  break;
               case 244 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4036:
               // '\\u213D' .. '\\u213F'
               {
                  matchRange('\u213D', '\u213F');

               }
                  break;
               case 245 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4055:
               // '\\u2145' .. '\\u2149'
               {
                  matchRange('\u2145', '\u2149');

               }
                  break;
               case 246 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4074:
               // '\\u2160' .. '\\u2183'
               {
                  matchRange('\u2160', '\u2183');

               }
                  break;
               case 247 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4093:
               // '\\u3005' .. '\\u3007'
               {
                  matchRange('\u3005', '\u3007');

               }
                  break;
               case 248 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4112:
               // '\\u3021' .. '\\u3029'
               {
                  matchRange('\u3021', '\u3029');

               }
                  break;
               case 249 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4131:
               // '\\u3031' .. '\\u3035'
               {
                  matchRange('\u3031', '\u3035');

               }
                  break;
               case 250 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4150:
               // '\\u3038' .. '\\u303C'
               {
                  matchRange('\u3038', '\u303C');

               }
                  break;
               case 251 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4169:
               // '\\u3041' .. '\\u3096'
               {
                  matchRange('\u3041', '\u3096');

               }
                  break;
               case 252 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4188:
               // '\\u309D' .. '\\u309F'
               {
                  matchRange('\u309D', '\u309F');

               }
                  break;
               case 253 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4207:
               // '\\u30A1' .. '\\u30FF'
               {
                  matchRange('\u30A1', '\u30FF');

               }
                  break;
               case 254 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4226:
               // '\\u3105' .. '\\u312C'
               {
                  matchRange('\u3105', '\u312C');

               }
                  break;
               case 255 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4245:
               // '\\u3131' .. '\\u318E'
               {
                  matchRange('\u3131', '\u318E');

               }
                  break;
               case 256 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4264:
               // '\\u31A0' .. '\\u31B7'
               {
                  matchRange('\u31A0', '\u31B7');

               }
                  break;
               case 257 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4283:
               // '\\u31F0' .. '\\u31FF'
               {
                  matchRange('\u31F0', '\u31FF');

               }
                  break;
               case 258 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4302:
               // '\\u3400' .. '\\u4DB5'
               {
                  matchRange('\u3400', '\u4DB5');

               }
                  break;
               case 259 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4321:
               // '\\u4E00' .. '\\u9FA5'
               {
                  matchRange('\u4E00', '\u9FA5');

               }
                  break;
               case 260 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4340:
               // '\\uA000' .. '\\uA48C'
               {
                  matchRange('\uA000', '\uA48C');

               }
                  break;
               case 261 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4359:
               // '\\uAC00' .. '\\uD7A3'
               {
                  matchRange('\uAC00', '\uD7A3');

               }
                  break;
               case 262 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4378:
               // '\\uF900' .. '\\uFA2D'
               {
                  matchRange('\uF900', '\uFA2D');

               }
                  break;
               case 263 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4397:
               // '\\uFA30' .. '\\uFA6A'
               {
                  matchRange('\uFA30', '\uFA6A');

               }
                  break;
               case 264 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4416:
               // '\\uFB00' .. '\\uFB06'
               {
                  matchRange('\uFB00', '\uFB06');

               }
                  break;
               case 265 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4435:
               // '\\uFB13' .. '\\uFB17'
               {
                  matchRange('\uFB13', '\uFB17');

               }
                  break;
               case 266 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4454:
               // '\\uFB1D'
               {
                  match('\uFB1D');

               }
                  break;
               case 267 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4463:
               // '\\uFB1F' .. '\\uFB28'
               {
                  matchRange('\uFB1F', '\uFB28');

               }
                  break;
               case 268 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4482:
               // '\\uFB2A' .. '\\uFB36'
               {
                  matchRange('\uFB2A', '\uFB36');

               }
                  break;
               case 269 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4501:
               // '\\uFB38' .. '\\uFB3C'
               {
                  matchRange('\uFB38', '\uFB3C');

               }
                  break;
               case 270 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4520:
               // '\\uFB3E'
               {
                  match('\uFB3E');

               }
                  break;
               case 271 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4529:
               // '\\uFB40' .. '\\uFB41'
               {
                  matchRange('\uFB40', '\uFB41');

               }
                  break;
               case 272 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4548:
               // '\\uFB43' .. '\\uFB44'
               {
                  matchRange('\uFB43', '\uFB44');

               }
                  break;
               case 273 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4567:
               // '\\uFB46' .. '\\uFBB1'
               {
                  matchRange('\uFB46', '\uFBB1');

               }
                  break;
               case 274 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4586:
               // '\\uFBD3' .. '\\uFD3D'
               {
                  matchRange('\uFBD3', '\uFD3D');

               }
                  break;
               case 275 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4605:
               // '\\uFD50' .. '\\uFD8F'
               {
                  matchRange('\uFD50', '\uFD8F');

               }
                  break;
               case 276 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4624:
               // '\\uFD92' .. '\\uFDC7'
               {
                  matchRange('\uFD92', '\uFDC7');

               }
                  break;
               case 277 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4643:
               // '\\uFDF0' .. '\\uFDFC'
               {
                  matchRange('\uFDF0', '\uFDFC');

               }
                  break;
               case 278 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4662:
               // '\\uFE33' .. '\\uFE34'
               {
                  matchRange('\uFE33', '\uFE34');

               }
                  break;
               case 279 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4681:
               // '\\uFE4D' .. '\\uFE4F'
               {
                  matchRange('\uFE4D', '\uFE4F');

               }
                  break;
               case 280 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4700:
               // '\\uFE69'
               {
                  match('\uFE69');

               }
                  break;
               case 281 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4709:
               // '\\uFE70' .. '\\uFE74'
               {
                  matchRange('\uFE70', '\uFE74');

               }
                  break;
               case 282 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4728:
               // '\\uFE76' .. '\\uFEFC'
               {
                  matchRange('\uFE76', '\uFEFC');

               }
                  break;
               case 283 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4747:
               // '\\uFF04'
               {
                  match('\uFF04');

               }
                  break;
               case 284 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4756:
               // '\\uFF21' .. '\\uFF3A'
               {
                  matchRange('\uFF21', '\uFF3A');

               }
                  break;
               case 285 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4775:
               // '\\uFF3F'
               {
                  match('\uFF3F');

               }
                  break;
               case 286 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4784:
               // '\\uFF41' .. '\\uFF5A'
               {
                  matchRange('\uFF41', '\uFF5A');

               }
                  break;
               case 287 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4803:
               // '\\uFF65' .. '\\uFFBE'
               {
                  matchRange('\uFF65', '\uFFBE');

               }
                  break;
               case 288 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4822:
               // '\\uFFC2' .. '\\uFFC7'
               {
                  matchRange('\uFFC2', '\uFFC7');

               }
                  break;
               case 289 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4841:
               // '\\uFFCA' .. '\\uFFCF'
               {
                  matchRange('\uFFCA', '\uFFCF');

               }
                  break;
               case 290 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4860:
               // '\\uFFD2' .. '\\uFFD7'
               {
                  matchRange('\uFFD2', '\uFFD7');

               }
                  break;
               case 291 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4879:
               // '\\uFFDA' .. '\\uFFDC'
               {
                  matchRange('\uFFDA', '\uFFDC');

               }
                  break;
               case 292 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4898:
               // '\\uFFE0' .. '\\uFFE1'
               {
                  matchRange('\uFFE0', '\uFFE1');

               }
                  break;
               case 293 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4917:
               // '\\uFFE5' .. '\\uFFE6'
               {
                  matchRange('\uFFE5', '\uFFE6');

               }
                  break;
               case 294 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:629:4936:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:33:
         // ( ( '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '$' | '0' .. '9' | 'A' .. 'Z' | '_' | 'a' .. 'z' |
         // '\\u007F' .. '\\u009F' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00AD' | '\\u00B5' | '\\u00BA' | '\\u00C0'
         // .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' ..
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:35:
         // ( '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '$' | '0' .. '9' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u007F'
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
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:35:
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
            int alt41 = 386;
            int LA41_0 = input.LA(1);

            if (((LA41_0 >= '\u0000' && LA41_0 <= '\b'))) {
               alt41 = 1;
            }
            else if (((LA41_0 >= '\u000E' && LA41_0 <= '\u001B'))) {
               alt41 = 2;
            }
            else if ((LA41_0 == '$')) {
               alt41 = 3;
            }
            else if (((LA41_0 >= '0' && LA41_0 <= '9'))) {
               alt41 = 4;
            }
            else if (((LA41_0 >= 'A' && LA41_0 <= 'Z'))) {
               alt41 = 5;
            }
            else if ((LA41_0 == '_')) {
               alt41 = 6;
            }
            else if (((LA41_0 >= 'a' && LA41_0 <= 'z'))) {
               alt41 = 7;
            }
            else if (((LA41_0 >= '\u007F' && LA41_0 <= '\u009F'))) {
               alt41 = 8;
            }
            else if (((LA41_0 >= '\u00A2' && LA41_0 <= '\u00A5'))) {
               alt41 = 9;
            }
            else if ((LA41_0 == '\u00AA')) {
               alt41 = 10;
            }
            else if ((LA41_0 == '\u00AD')) {
               alt41 = 11;
            }
            else if ((LA41_0 == '\u00B5')) {
               alt41 = 12;
            }
            else if ((LA41_0 == '\u00BA')) {
               alt41 = 13;
            }
            else if (((LA41_0 >= '\u00C0' && LA41_0 <= '\u00D6'))) {
               alt41 = 14;
            }
            else if (((LA41_0 >= '\u00D8' && LA41_0 <= '\u00F6'))) {
               alt41 = 15;
            }
            else if (((LA41_0 >= '\u00F8' && LA41_0 <= '\u0236'))) {
               alt41 = 16;
            }
            else if (((LA41_0 >= '\u0250' && LA41_0 <= '\u02C1'))) {
               alt41 = 17;
            }
            else if (((LA41_0 >= '\u02C6' && LA41_0 <= '\u02D1'))) {
               alt41 = 18;
            }
            else if (((LA41_0 >= '\u02E0' && LA41_0 <= '\u02E4'))) {
               alt41 = 19;
            }
            else if ((LA41_0 == '\u02EE')) {
               alt41 = 20;
            }
            else if (((LA41_0 >= '\u0300' && LA41_0 <= '\u0357'))) {
               alt41 = 21;
            }
            else if (((LA41_0 >= '\u035D' && LA41_0 <= '\u036F'))) {
               alt41 = 22;
            }
            else if ((LA41_0 == '\u037A')) {
               alt41 = 23;
            }
            else if ((LA41_0 == '\u0386')) {
               alt41 = 24;
            }
            else if (((LA41_0 >= '\u0388' && LA41_0 <= '\u038A'))) {
               alt41 = 25;
            }
            else if ((LA41_0 == '\u038C')) {
               alt41 = 26;
            }
            else if (((LA41_0 >= '\u038E' && LA41_0 <= '\u03A1'))) {
               alt41 = 27;
            }
            else if (((LA41_0 >= '\u03A3' && LA41_0 <= '\u03CE'))) {
               alt41 = 28;
            }
            else if (((LA41_0 >= '\u03D0' && LA41_0 <= '\u03F5'))) {
               alt41 = 29;
            }
            else if (((LA41_0 >= '\u03F7' && LA41_0 <= '\u03FB'))) {
               alt41 = 30;
            }
            else if (((LA41_0 >= '\u0400' && LA41_0 <= '\u0481'))) {
               alt41 = 31;
            }
            else if (((LA41_0 >= '\u0483' && LA41_0 <= '\u0486'))) {
               alt41 = 32;
            }
            else if (((LA41_0 >= '\u048A' && LA41_0 <= '\u04CE'))) {
               alt41 = 33;
            }
            else if (((LA41_0 >= '\u04D0' && LA41_0 <= '\u04F5'))) {
               alt41 = 34;
            }
            else if (((LA41_0 >= '\u04F8' && LA41_0 <= '\u04F9'))) {
               alt41 = 35;
            }
            else if (((LA41_0 >= '\u0500' && LA41_0 <= '\u050F'))) {
               alt41 = 36;
            }
            else if (((LA41_0 >= '\u0531' && LA41_0 <= '\u0556'))) {
               alt41 = 37;
            }
            else if ((LA41_0 == '\u0559')) {
               alt41 = 38;
            }
            else if (((LA41_0 >= '\u0561' && LA41_0 <= '\u0587'))) {
               alt41 = 39;
            }
            else if (((LA41_0 >= '\u0591' && LA41_0 <= '\u05A1'))) {
               alt41 = 40;
            }
            else if (((LA41_0 >= '\u05A3' && LA41_0 <= '\u05B9'))) {
               alt41 = 41;
            }
            else if (((LA41_0 >= '\u05BB' && LA41_0 <= '\u05BD'))) {
               alt41 = 42;
            }
            else if ((LA41_0 == '\u05BF')) {
               alt41 = 43;
            }
            else if (((LA41_0 >= '\u05C1' && LA41_0 <= '\u05C2'))) {
               alt41 = 44;
            }
            else if ((LA41_0 == '\u05C4')) {
               alt41 = 45;
            }
            else if (((LA41_0 >= '\u05D0' && LA41_0 <= '\u05EA'))) {
               alt41 = 46;
            }
            else if (((LA41_0 >= '\u05F0' && LA41_0 <= '\u05F2'))) {
               alt41 = 47;
            }
            else if (((LA41_0 >= '\u0600' && LA41_0 <= '\u0603'))) {
               alt41 = 48;
            }
            else if (((LA41_0 >= '\u0610' && LA41_0 <= '\u0615'))) {
               alt41 = 49;
            }
            else if (((LA41_0 >= '\u0621' && LA41_0 <= '\u063A'))) {
               alt41 = 50;
            }
            else if (((LA41_0 >= '\u0640' && LA41_0 <= '\u0658'))) {
               alt41 = 51;
            }
            else if (((LA41_0 >= '\u0660' && LA41_0 <= '\u0669'))) {
               alt41 = 52;
            }
            else if (((LA41_0 >= '\u066E' && LA41_0 <= '\u06D3'))) {
               alt41 = 53;
            }
            else if (((LA41_0 >= '\u06D5' && LA41_0 <= '\u06DD'))) {
               alt41 = 54;
            }
            else if (((LA41_0 >= '\u06DF' && LA41_0 <= '\u06E8'))) {
               alt41 = 55;
            }
            else if (((LA41_0 >= '\u06EA' && LA41_0 <= '\u06FC'))) {
               alt41 = 56;
            }
            else if ((LA41_0 == '\u06FF')) {
               alt41 = 57;
            }
            else if (((LA41_0 >= '\u070F' && LA41_0 <= '\u074A'))) {
               alt41 = 58;
            }
            else if (((LA41_0 >= '\u074D' && LA41_0 <= '\u074F'))) {
               alt41 = 59;
            }
            else if (((LA41_0 >= '\u0780' && LA41_0 <= '\u07B1'))) {
               alt41 = 60;
            }
            else if (((LA41_0 >= '\u0901' && LA41_0 <= '\u0939'))) {
               alt41 = 61;
            }
            else if (((LA41_0 >= '\u093C' && LA41_0 <= '\u094D'))) {
               alt41 = 62;
            }
            else if (((LA41_0 >= '\u0950' && LA41_0 <= '\u0954'))) {
               alt41 = 63;
            }
            else if (((LA41_0 >= '\u0958' && LA41_0 <= '\u0963'))) {
               alt41 = 64;
            }
            else if (((LA41_0 >= '\u0966' && LA41_0 <= '\u096F'))) {
               alt41 = 65;
            }
            else if (((LA41_0 >= '\u0981' && LA41_0 <= '\u0983'))) {
               alt41 = 66;
            }
            else if (((LA41_0 >= '\u0985' && LA41_0 <= '\u098C'))) {
               alt41 = 67;
            }
            else if (((LA41_0 >= '\u098F' && LA41_0 <= '\u0990'))) {
               alt41 = 68;
            }
            else if (((LA41_0 >= '\u0993' && LA41_0 <= '\u09A8'))) {
               alt41 = 69;
            }
            else if (((LA41_0 >= '\u09AA' && LA41_0 <= '\u09B0'))) {
               alt41 = 70;
            }
            else if ((LA41_0 == '\u09B2')) {
               alt41 = 71;
            }
            else if (((LA41_0 >= '\u09B6' && LA41_0 <= '\u09B9'))) {
               alt41 = 72;
            }
            else if (((LA41_0 >= '\u09BC' && LA41_0 <= '\u09C4'))) {
               alt41 = 73;
            }
            else if (((LA41_0 >= '\u09C7' && LA41_0 <= '\u09C8'))) {
               alt41 = 74;
            }
            else if (((LA41_0 >= '\u09CB' && LA41_0 <= '\u09CD'))) {
               alt41 = 75;
            }
            else if ((LA41_0 == '\u09D7')) {
               alt41 = 76;
            }
            else if (((LA41_0 >= '\u09DC' && LA41_0 <= '\u09DD'))) {
               alt41 = 77;
            }
            else if (((LA41_0 >= '\u09DF' && LA41_0 <= '\u09E3'))) {
               alt41 = 78;
            }
            else if (((LA41_0 >= '\u09E6' && LA41_0 <= '\u09F3'))) {
               alt41 = 79;
            }
            else if (((LA41_0 >= '\u0A01' && LA41_0 <= '\u0A03'))) {
               alt41 = 80;
            }
            else if (((LA41_0 >= '\u0A05' && LA41_0 <= '\u0A0A'))) {
               alt41 = 81;
            }
            else if (((LA41_0 >= '\u0A0F' && LA41_0 <= '\u0A10'))) {
               alt41 = 82;
            }
            else if (((LA41_0 >= '\u0A13' && LA41_0 <= '\u0A28'))) {
               alt41 = 83;
            }
            else if (((LA41_0 >= '\u0A2A' && LA41_0 <= '\u0A30'))) {
               alt41 = 84;
            }
            else if (((LA41_0 >= '\u0A32' && LA41_0 <= '\u0A33'))) {
               alt41 = 85;
            }
            else if (((LA41_0 >= '\u0A35' && LA41_0 <= '\u0A36'))) {
               alt41 = 86;
            }
            else if (((LA41_0 >= '\u0A38' && LA41_0 <= '\u0A39'))) {
               alt41 = 87;
            }
            else if ((LA41_0 == '\u0A3C')) {
               alt41 = 88;
            }
            else if (((LA41_0 >= '\u0A3E' && LA41_0 <= '\u0A42'))) {
               alt41 = 89;
            }
            else if (((LA41_0 >= '\u0A47' && LA41_0 <= '\u0A48'))) {
               alt41 = 90;
            }
            else if (((LA41_0 >= '\u0A4B' && LA41_0 <= '\u0A4D'))) {
               alt41 = 91;
            }
            else if (((LA41_0 >= '\u0A59' && LA41_0 <= '\u0A5C'))) {
               alt41 = 92;
            }
            else if ((LA41_0 == '\u0A5E')) {
               alt41 = 93;
            }
            else if (((LA41_0 >= '\u0A66' && LA41_0 <= '\u0A74'))) {
               alt41 = 94;
            }
            else if (((LA41_0 >= '\u0A81' && LA41_0 <= '\u0A83'))) {
               alt41 = 95;
            }
            else if (((LA41_0 >= '\u0A85' && LA41_0 <= '\u0A8D'))) {
               alt41 = 96;
            }
            else if (((LA41_0 >= '\u0A8F' && LA41_0 <= '\u0A91'))) {
               alt41 = 97;
            }
            else if (((LA41_0 >= '\u0A93' && LA41_0 <= '\u0AA8'))) {
               alt41 = 98;
            }
            else if (((LA41_0 >= '\u0AAA' && LA41_0 <= '\u0AB0'))) {
               alt41 = 99;
            }
            else if (((LA41_0 >= '\u0AB2' && LA41_0 <= '\u0AB3'))) {
               alt41 = 100;
            }
            else if (((LA41_0 >= '\u0AB5' && LA41_0 <= '\u0AB9'))) {
               alt41 = 101;
            }
            else if (((LA41_0 >= '\u0ABC' && LA41_0 <= '\u0AC5'))) {
               alt41 = 102;
            }
            else if (((LA41_0 >= '\u0AC7' && LA41_0 <= '\u0AC9'))) {
               alt41 = 103;
            }
            else if (((LA41_0 >= '\u0ACB' && LA41_0 <= '\u0ACD'))) {
               alt41 = 104;
            }
            else if ((LA41_0 == '\u0AD0')) {
               alt41 = 105;
            }
            else if (((LA41_0 >= '\u0AE0' && LA41_0 <= '\u0AE3'))) {
               alt41 = 106;
            }
            else if (((LA41_0 >= '\u0AE6' && LA41_0 <= '\u0AEF'))) {
               alt41 = 107;
            }
            else if ((LA41_0 == '\u0AF1')) {
               alt41 = 108;
            }
            else if (((LA41_0 >= '\u0B01' && LA41_0 <= '\u0B03'))) {
               alt41 = 109;
            }
            else if (((LA41_0 >= '\u0B05' && LA41_0 <= '\u0B0C'))) {
               alt41 = 110;
            }
            else if (((LA41_0 >= '\u0B0F' && LA41_0 <= '\u0B10'))) {
               alt41 = 111;
            }
            else if (((LA41_0 >= '\u0B13' && LA41_0 <= '\u0B28'))) {
               alt41 = 112;
            }
            else if (((LA41_0 >= '\u0B2A' && LA41_0 <= '\u0B30'))) {
               alt41 = 113;
            }
            else if (((LA41_0 >= '\u0B32' && LA41_0 <= '\u0B33'))) {
               alt41 = 114;
            }
            else if (((LA41_0 >= '\u0B35' && LA41_0 <= '\u0B39'))) {
               alt41 = 115;
            }
            else if (((LA41_0 >= '\u0B3C' && LA41_0 <= '\u0B43'))) {
               alt41 = 116;
            }
            else if (((LA41_0 >= '\u0B47' && LA41_0 <= '\u0B48'))) {
               alt41 = 117;
            }
            else if (((LA41_0 >= '\u0B4B' && LA41_0 <= '\u0B4D'))) {
               alt41 = 118;
            }
            else if (((LA41_0 >= '\u0B56' && LA41_0 <= '\u0B57'))) {
               alt41 = 119;
            }
            else if (((LA41_0 >= '\u0B5C' && LA41_0 <= '\u0B5D'))) {
               alt41 = 120;
            }
            else if (((LA41_0 >= '\u0B5F' && LA41_0 <= '\u0B61'))) {
               alt41 = 121;
            }
            else if (((LA41_0 >= '\u0B66' && LA41_0 <= '\u0B6F'))) {
               alt41 = 122;
            }
            else if ((LA41_0 == '\u0B71')) {
               alt41 = 123;
            }
            else if (((LA41_0 >= '\u0B82' && LA41_0 <= '\u0B83'))) {
               alt41 = 124;
            }
            else if (((LA41_0 >= '\u0B85' && LA41_0 <= '\u0B8A'))) {
               alt41 = 125;
            }
            else if (((LA41_0 >= '\u0B8E' && LA41_0 <= '\u0B90'))) {
               alt41 = 126;
            }
            else if (((LA41_0 >= '\u0B92' && LA41_0 <= '\u0B95'))) {
               alt41 = 127;
            }
            else if (((LA41_0 >= '\u0B99' && LA41_0 <= '\u0B9A'))) {
               alt41 = 128;
            }
            else if ((LA41_0 == '\u0B9C')) {
               alt41 = 129;
            }
            else if (((LA41_0 >= '\u0B9E' && LA41_0 <= '\u0B9F'))) {
               alt41 = 130;
            }
            else if (((LA41_0 >= '\u0BA3' && LA41_0 <= '\u0BA4'))) {
               alt41 = 131;
            }
            else if (((LA41_0 >= '\u0BA8' && LA41_0 <= '\u0BAA'))) {
               alt41 = 132;
            }
            else if (((LA41_0 >= '\u0BAE' && LA41_0 <= '\u0BB5'))) {
               alt41 = 133;
            }
            else if (((LA41_0 >= '\u0BB7' && LA41_0 <= '\u0BB9'))) {
               alt41 = 134;
            }
            else if (((LA41_0 >= '\u0BBE' && LA41_0 <= '\u0BC2'))) {
               alt41 = 135;
            }
            else if (((LA41_0 >= '\u0BC6' && LA41_0 <= '\u0BC8'))) {
               alt41 = 136;
            }
            else if (((LA41_0 >= '\u0BCA' && LA41_0 <= '\u0BCD'))) {
               alt41 = 137;
            }
            else if ((LA41_0 == '\u0BD7')) {
               alt41 = 138;
            }
            else if (((LA41_0 >= '\u0BE7' && LA41_0 <= '\u0BEF'))) {
               alt41 = 139;
            }
            else if ((LA41_0 == '\u0BF9')) {
               alt41 = 140;
            }
            else if (((LA41_0 >= '\u0C01' && LA41_0 <= '\u0C03'))) {
               alt41 = 141;
            }
            else if (((LA41_0 >= '\u0C05' && LA41_0 <= '\u0C0C'))) {
               alt41 = 142;
            }
            else if (((LA41_0 >= '\u0C0E' && LA41_0 <= '\u0C10'))) {
               alt41 = 143;
            }
            else if (((LA41_0 >= '\u0C12' && LA41_0 <= '\u0C28'))) {
               alt41 = 144;
            }
            else if (((LA41_0 >= '\u0C2A' && LA41_0 <= '\u0C33'))) {
               alt41 = 145;
            }
            else if (((LA41_0 >= '\u0C35' && LA41_0 <= '\u0C39'))) {
               alt41 = 146;
            }
            else if (((LA41_0 >= '\u0C3E' && LA41_0 <= '\u0C44'))) {
               alt41 = 147;
            }
            else if (((LA41_0 >= '\u0C46' && LA41_0 <= '\u0C48'))) {
               alt41 = 148;
            }
            else if (((LA41_0 >= '\u0C4A' && LA41_0 <= '\u0C4D'))) {
               alt41 = 149;
            }
            else if (((LA41_0 >= '\u0C55' && LA41_0 <= '\u0C56'))) {
               alt41 = 150;
            }
            else if (((LA41_0 >= '\u0C60' && LA41_0 <= '\u0C61'))) {
               alt41 = 151;
            }
            else if (((LA41_0 >= '\u0C66' && LA41_0 <= '\u0C6F'))) {
               alt41 = 152;
            }
            else if (((LA41_0 >= '\u0C82' && LA41_0 <= '\u0C83'))) {
               alt41 = 153;
            }
            else if (((LA41_0 >= '\u0C85' && LA41_0 <= '\u0C8C'))) {
               alt41 = 154;
            }
            else if (((LA41_0 >= '\u0C8E' && LA41_0 <= '\u0C90'))) {
               alt41 = 155;
            }
            else if (((LA41_0 >= '\u0C92' && LA41_0 <= '\u0CA8'))) {
               alt41 = 156;
            }
            else if (((LA41_0 >= '\u0CAA' && LA41_0 <= '\u0CB3'))) {
               alt41 = 157;
            }
            else if (((LA41_0 >= '\u0CB5' && LA41_0 <= '\u0CB9'))) {
               alt41 = 158;
            }
            else if (((LA41_0 >= '\u0CBC' && LA41_0 <= '\u0CC4'))) {
               alt41 = 159;
            }
            else if (((LA41_0 >= '\u0CC6' && LA41_0 <= '\u0CC8'))) {
               alt41 = 160;
            }
            else if (((LA41_0 >= '\u0CCA' && LA41_0 <= '\u0CCD'))) {
               alt41 = 161;
            }
            else if (((LA41_0 >= '\u0CD5' && LA41_0 <= '\u0CD6'))) {
               alt41 = 162;
            }
            else if ((LA41_0 == '\u0CDE')) {
               alt41 = 163;
            }
            else if (((LA41_0 >= '\u0CE0' && LA41_0 <= '\u0CE1'))) {
               alt41 = 164;
            }
            else if (((LA41_0 >= '\u0CE6' && LA41_0 <= '\u0CEF'))) {
               alt41 = 165;
            }
            else if (((LA41_0 >= '\u0D02' && LA41_0 <= '\u0D03'))) {
               alt41 = 166;
            }
            else if (((LA41_0 >= '\u0D05' && LA41_0 <= '\u0D0C'))) {
               alt41 = 167;
            }
            else if (((LA41_0 >= '\u0D0E' && LA41_0 <= '\u0D10'))) {
               alt41 = 168;
            }
            else if (((LA41_0 >= '\u0D12' && LA41_0 <= '\u0D28'))) {
               alt41 = 169;
            }
            else if (((LA41_0 >= '\u0D2A' && LA41_0 <= '\u0D39'))) {
               alt41 = 170;
            }
            else if (((LA41_0 >= '\u0D3E' && LA41_0 <= '\u0D43'))) {
               alt41 = 171;
            }
            else if (((LA41_0 >= '\u0D46' && LA41_0 <= '\u0D48'))) {
               alt41 = 172;
            }
            else if (((LA41_0 >= '\u0D4A' && LA41_0 <= '\u0D4D'))) {
               alt41 = 173;
            }
            else if ((LA41_0 == '\u0D57')) {
               alt41 = 174;
            }
            else if (((LA41_0 >= '\u0D60' && LA41_0 <= '\u0D61'))) {
               alt41 = 175;
            }
            else if (((LA41_0 >= '\u0D66' && LA41_0 <= '\u0D6F'))) {
               alt41 = 176;
            }
            else if (((LA41_0 >= '\u0D82' && LA41_0 <= '\u0D83'))) {
               alt41 = 177;
            }
            else if (((LA41_0 >= '\u0D85' && LA41_0 <= '\u0D96'))) {
               alt41 = 178;
            }
            else if (((LA41_0 >= '\u0D9A' && LA41_0 <= '\u0DB1'))) {
               alt41 = 179;
            }
            else if (((LA41_0 >= '\u0DB3' && LA41_0 <= '\u0DBB'))) {
               alt41 = 180;
            }
            else if ((LA41_0 == '\u0DBD')) {
               alt41 = 181;
            }
            else if (((LA41_0 >= '\u0DC0' && LA41_0 <= '\u0DC6'))) {
               alt41 = 182;
            }
            else if ((LA41_0 == '\u0DCA')) {
               alt41 = 183;
            }
            else if (((LA41_0 >= '\u0DCF' && LA41_0 <= '\u0DD4'))) {
               alt41 = 184;
            }
            else if ((LA41_0 == '\u0DD6')) {
               alt41 = 185;
            }
            else if (((LA41_0 >= '\u0DD8' && LA41_0 <= '\u0DDF'))) {
               alt41 = 186;
            }
            else if (((LA41_0 >= '\u0DF2' && LA41_0 <= '\u0DF3'))) {
               alt41 = 187;
            }
            else if (((LA41_0 >= '\u0E01' && LA41_0 <= '\u0E3A'))) {
               alt41 = 188;
            }
            else if (((LA41_0 >= '\u0E3F' && LA41_0 <= '\u0E4E'))) {
               alt41 = 189;
            }
            else if (((LA41_0 >= '\u0E50' && LA41_0 <= '\u0E59'))) {
               alt41 = 190;
            }
            else if (((LA41_0 >= '\u0E81' && LA41_0 <= '\u0E82'))) {
               alt41 = 191;
            }
            else if ((LA41_0 == '\u0E84')) {
               alt41 = 192;
            }
            else if (((LA41_0 >= '\u0E87' && LA41_0 <= '\u0E88'))) {
               alt41 = 193;
            }
            else if ((LA41_0 == '\u0E8A')) {
               alt41 = 194;
            }
            else if ((LA41_0 == '\u0E8D')) {
               alt41 = 195;
            }
            else if (((LA41_0 >= '\u0E94' && LA41_0 <= '\u0E97'))) {
               alt41 = 196;
            }
            else if (((LA41_0 >= '\u0E99' && LA41_0 <= '\u0E9F'))) {
               alt41 = 197;
            }
            else if (((LA41_0 >= '\u0EA1' && LA41_0 <= '\u0EA3'))) {
               alt41 = 198;
            }
            else if ((LA41_0 == '\u0EA5')) {
               alt41 = 199;
            }
            else if ((LA41_0 == '\u0EA7')) {
               alt41 = 200;
            }
            else if (((LA41_0 >= '\u0EAA' && LA41_0 <= '\u0EAB'))) {
               alt41 = 201;
            }
            else if (((LA41_0 >= '\u0EAD' && LA41_0 <= '\u0EB9'))) {
               alt41 = 202;
            }
            else if (((LA41_0 >= '\u0EBB' && LA41_0 <= '\u0EBD'))) {
               alt41 = 203;
            }
            else if (((LA41_0 >= '\u0EC0' && LA41_0 <= '\u0EC4'))) {
               alt41 = 204;
            }
            else if ((LA41_0 == '\u0EC6')) {
               alt41 = 205;
            }
            else if (((LA41_0 >= '\u0EC8' && LA41_0 <= '\u0ECD'))) {
               alt41 = 206;
            }
            else if (((LA41_0 >= '\u0ED0' && LA41_0 <= '\u0ED9'))) {
               alt41 = 207;
            }
            else if (((LA41_0 >= '\u0EDC' && LA41_0 <= '\u0EDD'))) {
               alt41 = 208;
            }
            else if ((LA41_0 == '\u0F00')) {
               alt41 = 209;
            }
            else if (((LA41_0 >= '\u0F18' && LA41_0 <= '\u0F19'))) {
               alt41 = 210;
            }
            else if (((LA41_0 >= '\u0F20' && LA41_0 <= '\u0F29'))) {
               alt41 = 211;
            }
            else if ((LA41_0 == '\u0F35')) {
               alt41 = 212;
            }
            else if ((LA41_0 == '\u0F37')) {
               alt41 = 213;
            }
            else if ((LA41_0 == '\u0F39')) {
               alt41 = 214;
            }
            else if (((LA41_0 >= '\u0F3E' && LA41_0 <= '\u0F47'))) {
               alt41 = 215;
            }
            else if (((LA41_0 >= '\u0F49' && LA41_0 <= '\u0F6A'))) {
               alt41 = 216;
            }
            else if (((LA41_0 >= '\u0F71' && LA41_0 <= '\u0F84'))) {
               alt41 = 217;
            }
            else if (((LA41_0 >= '\u0F86' && LA41_0 <= '\u0F8B'))) {
               alt41 = 218;
            }
            else if (((LA41_0 >= '\u0F90' && LA41_0 <= '\u0F97'))) {
               alt41 = 219;
            }
            else if (((LA41_0 >= '\u0F99' && LA41_0 <= '\u0FBC'))) {
               alt41 = 220;
            }
            else if ((LA41_0 == '\u0FC6')) {
               alt41 = 221;
            }
            else if (((LA41_0 >= '\u1000' && LA41_0 <= '\u1021'))) {
               alt41 = 222;
            }
            else if (((LA41_0 >= '\u1023' && LA41_0 <= '\u1027'))) {
               alt41 = 223;
            }
            else if (((LA41_0 >= '\u1029' && LA41_0 <= '\u102A'))) {
               alt41 = 224;
            }
            else if (((LA41_0 >= '\u102C' && LA41_0 <= '\u1032'))) {
               alt41 = 225;
            }
            else if (((LA41_0 >= '\u1036' && LA41_0 <= '\u1039'))) {
               alt41 = 226;
            }
            else if (((LA41_0 >= '\u1040' && LA41_0 <= '\u1049'))) {
               alt41 = 227;
            }
            else if (((LA41_0 >= '\u1050' && LA41_0 <= '\u1059'))) {
               alt41 = 228;
            }
            else if (((LA41_0 >= '\u10A0' && LA41_0 <= '\u10C5'))) {
               alt41 = 229;
            }
            else if (((LA41_0 >= '\u10D0' && LA41_0 <= '\u10F8'))) {
               alt41 = 230;
            }
            else if (((LA41_0 >= '\u1100' && LA41_0 <= '\u1159'))) {
               alt41 = 231;
            }
            else if (((LA41_0 >= '\u115F' && LA41_0 <= '\u11A2'))) {
               alt41 = 232;
            }
            else if (((LA41_0 >= '\u11A8' && LA41_0 <= '\u11F9'))) {
               alt41 = 233;
            }
            else if (((LA41_0 >= '\u1200' && LA41_0 <= '\u1206'))) {
               alt41 = 234;
            }
            else if (((LA41_0 >= '\u1208' && LA41_0 <= '\u1246'))) {
               alt41 = 235;
            }
            else if ((LA41_0 == '\u1248')) {
               alt41 = 236;
            }
            else if (((LA41_0 >= '\u124A' && LA41_0 <= '\u124D'))) {
               alt41 = 237;
            }
            else if (((LA41_0 >= '\u1250' && LA41_0 <= '\u1256'))) {
               alt41 = 238;
            }
            else if ((LA41_0 == '\u1258')) {
               alt41 = 239;
            }
            else if (((LA41_0 >= '\u125A' && LA41_0 <= '\u125D'))) {
               alt41 = 240;
            }
            else if (((LA41_0 >= '\u1260' && LA41_0 <= '\u1286'))) {
               alt41 = 241;
            }
            else if ((LA41_0 == '\u1288')) {
               alt41 = 242;
            }
            else if (((LA41_0 >= '\u128A' && LA41_0 <= '\u128D'))) {
               alt41 = 243;
            }
            else if (((LA41_0 >= '\u1290' && LA41_0 <= '\u12AE'))) {
               alt41 = 244;
            }
            else if ((LA41_0 == '\u12B0')) {
               alt41 = 245;
            }
            else if (((LA41_0 >= '\u12B2' && LA41_0 <= '\u12B5'))) {
               alt41 = 246;
            }
            else if (((LA41_0 >= '\u12B8' && LA41_0 <= '\u12BE'))) {
               alt41 = 247;
            }
            else if ((LA41_0 == '\u12C0')) {
               alt41 = 248;
            }
            else if (((LA41_0 >= '\u12C2' && LA41_0 <= '\u12C5'))) {
               alt41 = 249;
            }
            else if (((LA41_0 >= '\u12C8' && LA41_0 <= '\u12CE'))) {
               alt41 = 250;
            }
            else if (((LA41_0 >= '\u12D0' && LA41_0 <= '\u12D6'))) {
               alt41 = 251;
            }
            else if (((LA41_0 >= '\u12D8' && LA41_0 <= '\u12EE'))) {
               alt41 = 252;
            }
            else if (((LA41_0 >= '\u12F0' && LA41_0 <= '\u130E'))) {
               alt41 = 253;
            }
            else if ((LA41_0 == '\u1310')) {
               alt41 = 254;
            }
            else if (((LA41_0 >= '\u1312' && LA41_0 <= '\u1315'))) {
               alt41 = 255;
            }
            else if (((LA41_0 >= '\u1318' && LA41_0 <= '\u131E'))) {
               alt41 = 256;
            }
            else if (((LA41_0 >= '\u1320' && LA41_0 <= '\u1346'))) {
               alt41 = 257;
            }
            else if (((LA41_0 >= '\u1348' && LA41_0 <= '\u135A'))) {
               alt41 = 258;
            }
            else if (((LA41_0 >= '\u1369' && LA41_0 <= '\u1371'))) {
               alt41 = 259;
            }
            else if (((LA41_0 >= '\u13A0' && LA41_0 <= '\u13F4'))) {
               alt41 = 260;
            }
            else if (((LA41_0 >= '\u1401' && LA41_0 <= '\u166C'))) {
               alt41 = 261;
            }
            else if (((LA41_0 >= '\u166F' && LA41_0 <= '\u1676'))) {
               alt41 = 262;
            }
            else if (((LA41_0 >= '\u1681' && LA41_0 <= '\u169A'))) {
               alt41 = 263;
            }
            else if (((LA41_0 >= '\u16A0' && LA41_0 <= '\u16EA'))) {
               alt41 = 264;
            }
            else if (((LA41_0 >= '\u16EE' && LA41_0 <= '\u16F0'))) {
               alt41 = 265;
            }
            else if (((LA41_0 >= '\u1700' && LA41_0 <= '\u170C'))) {
               alt41 = 266;
            }
            else if (((LA41_0 >= '\u170E' && LA41_0 <= '\u1714'))) {
               alt41 = 267;
            }
            else if (((LA41_0 >= '\u1720' && LA41_0 <= '\u1734'))) {
               alt41 = 268;
            }
            else if (((LA41_0 >= '\u1740' && LA41_0 <= '\u1753'))) {
               alt41 = 269;
            }
            else if (((LA41_0 >= '\u1760' && LA41_0 <= '\u176C'))) {
               alt41 = 270;
            }
            else if (((LA41_0 >= '\u176E' && LA41_0 <= '\u1770'))) {
               alt41 = 271;
            }
            else if (((LA41_0 >= '\u1772' && LA41_0 <= '\u1773'))) {
               alt41 = 272;
            }
            else if (((LA41_0 >= '\u1780' && LA41_0 <= '\u17D3'))) {
               alt41 = 273;
            }
            else if ((LA41_0 == '\u17D7')) {
               alt41 = 274;
            }
            else if (((LA41_0 >= '\u17DB' && LA41_0 <= '\u17DD'))) {
               alt41 = 275;
            }
            else if (((LA41_0 >= '\u17E0' && LA41_0 <= '\u17E9'))) {
               alt41 = 276;
            }
            else if (((LA41_0 >= '\u180B' && LA41_0 <= '\u180D'))) {
               alt41 = 277;
            }
            else if (((LA41_0 >= '\u1810' && LA41_0 <= '\u1819'))) {
               alt41 = 278;
            }
            else if (((LA41_0 >= '\u1820' && LA41_0 <= '\u1877'))) {
               alt41 = 279;
            }
            else if (((LA41_0 >= '\u1880' && LA41_0 <= '\u18A9'))) {
               alt41 = 280;
            }
            else if (((LA41_0 >= '\u1900' && LA41_0 <= '\u191C'))) {
               alt41 = 281;
            }
            else if (((LA41_0 >= '\u1920' && LA41_0 <= '\u192B'))) {
               alt41 = 282;
            }
            else if (((LA41_0 >= '\u1930' && LA41_0 <= '\u193B'))) {
               alt41 = 283;
            }
            else if (((LA41_0 >= '\u1946' && LA41_0 <= '\u196D'))) {
               alt41 = 284;
            }
            else if (((LA41_0 >= '\u1970' && LA41_0 <= '\u1974'))) {
               alt41 = 285;
            }
            else if (((LA41_0 >= '\u1D00' && LA41_0 <= '\u1D6B'))) {
               alt41 = 286;
            }
            else if (((LA41_0 >= '\u1E00' && LA41_0 <= '\u1E9B'))) {
               alt41 = 287;
            }
            else if (((LA41_0 >= '\u1EA0' && LA41_0 <= '\u1EF9'))) {
               alt41 = 288;
            }
            else if (((LA41_0 >= '\u1F00' && LA41_0 <= '\u1F15'))) {
               alt41 = 289;
            }
            else if (((LA41_0 >= '\u1F18' && LA41_0 <= '\u1F1D'))) {
               alt41 = 290;
            }
            else if (((LA41_0 >= '\u1F20' && LA41_0 <= '\u1F45'))) {
               alt41 = 291;
            }
            else if (((LA41_0 >= '\u1F48' && LA41_0 <= '\u1F4D'))) {
               alt41 = 292;
            }
            else if (((LA41_0 >= '\u1F50' && LA41_0 <= '\u1F57'))) {
               alt41 = 293;
            }
            else if ((LA41_0 == '\u1F59')) {
               alt41 = 294;
            }
            else if ((LA41_0 == '\u1F5B')) {
               alt41 = 295;
            }
            else if ((LA41_0 == '\u1F5D')) {
               alt41 = 296;
            }
            else if (((LA41_0 >= '\u1F5F' && LA41_0 <= '\u1F7D'))) {
               alt41 = 297;
            }
            else if (((LA41_0 >= '\u1F80' && LA41_0 <= '\u1FB4'))) {
               alt41 = 298;
            }
            else if (((LA41_0 >= '\u1FB6' && LA41_0 <= '\u1FBC'))) {
               alt41 = 299;
            }
            else if ((LA41_0 == '\u1FBE')) {
               alt41 = 300;
            }
            else if (((LA41_0 >= '\u1FC2' && LA41_0 <= '\u1FC4'))) {
               alt41 = 301;
            }
            else if (((LA41_0 >= '\u1FC6' && LA41_0 <= '\u1FCC'))) {
               alt41 = 302;
            }
            else if (((LA41_0 >= '\u1FD0' && LA41_0 <= '\u1FD3'))) {
               alt41 = 303;
            }
            else if (((LA41_0 >= '\u1FD6' && LA41_0 <= '\u1FDB'))) {
               alt41 = 304;
            }
            else if (((LA41_0 >= '\u1FE0' && LA41_0 <= '\u1FEC'))) {
               alt41 = 305;
            }
            else if (((LA41_0 >= '\u1FF2' && LA41_0 <= '\u1FF4'))) {
               alt41 = 306;
            }
            else if (((LA41_0 >= '\u1FF6' && LA41_0 <= '\u1FFC'))) {
               alt41 = 307;
            }
            else if (((LA41_0 >= '\u200C' && LA41_0 <= '\u200F'))) {
               alt41 = 308;
            }
            else if (((LA41_0 >= '\u202A' && LA41_0 <= '\u202E'))) {
               alt41 = 309;
            }
            else if (((LA41_0 >= '\u203F' && LA41_0 <= '\u2040'))) {
               alt41 = 310;
            }
            else if ((LA41_0 == '\u2054')) {
               alt41 = 311;
            }
            else if (((LA41_0 >= '\u2060' && LA41_0 <= '\u2063'))) {
               alt41 = 312;
            }
            else if (((LA41_0 >= '\u206A' && LA41_0 <= '\u206F'))) {
               alt41 = 313;
            }
            else if ((LA41_0 == '\u2071')) {
               alt41 = 314;
            }
            else if ((LA41_0 == '\u207F')) {
               alt41 = 315;
            }
            else if (((LA41_0 >= '\u20A0' && LA41_0 <= '\u20B1'))) {
               alt41 = 316;
            }
            else if (((LA41_0 >= '\u20D0' && LA41_0 <= '\u20DC'))) {
               alt41 = 317;
            }
            else if ((LA41_0 == '\u20E1')) {
               alt41 = 318;
            }
            else if (((LA41_0 >= '\u20E5' && LA41_0 <= '\u20EA'))) {
               alt41 = 319;
            }
            else if ((LA41_0 == '\u2102')) {
               alt41 = 320;
            }
            else if ((LA41_0 == '\u2107')) {
               alt41 = 321;
            }
            else if (((LA41_0 >= '\u210A' && LA41_0 <= '\u2113'))) {
               alt41 = 322;
            }
            else if ((LA41_0 == '\u2115')) {
               alt41 = 323;
            }
            else if (((LA41_0 >= '\u2119' && LA41_0 <= '\u211D'))) {
               alt41 = 324;
            }
            else if ((LA41_0 == '\u2124')) {
               alt41 = 325;
            }
            else if ((LA41_0 == '\u2126')) {
               alt41 = 326;
            }
            else if ((LA41_0 == '\u2128')) {
               alt41 = 327;
            }
            else if (((LA41_0 >= '\u212A' && LA41_0 <= '\u212D'))) {
               alt41 = 328;
            }
            else if (((LA41_0 >= '\u212F' && LA41_0 <= '\u2131'))) {
               alt41 = 329;
            }
            else if (((LA41_0 >= '\u2133' && LA41_0 <= '\u2139'))) {
               alt41 = 330;
            }
            else if (((LA41_0 >= '\u213D' && LA41_0 <= '\u213F'))) {
               alt41 = 331;
            }
            else if (((LA41_0 >= '\u2145' && LA41_0 <= '\u2149'))) {
               alt41 = 332;
            }
            else if (((LA41_0 >= '\u2160' && LA41_0 <= '\u2183'))) {
               alt41 = 333;
            }
            else if (((LA41_0 >= '\u3005' && LA41_0 <= '\u3007'))) {
               alt41 = 334;
            }
            else if (((LA41_0 >= '\u3021' && LA41_0 <= '\u302F'))) {
               alt41 = 335;
            }
            else if (((LA41_0 >= '\u3031' && LA41_0 <= '\u3035'))) {
               alt41 = 336;
            }
            else if (((LA41_0 >= '\u3038' && LA41_0 <= '\u303C'))) {
               alt41 = 337;
            }
            else if (((LA41_0 >= '\u3041' && LA41_0 <= '\u3096'))) {
               alt41 = 338;
            }
            else if (((LA41_0 >= '\u3099' && LA41_0 <= '\u309A'))) {
               alt41 = 339;
            }
            else if (((LA41_0 >= '\u309D' && LA41_0 <= '\u309F'))) {
               alt41 = 340;
            }
            else if (((LA41_0 >= '\u30A1' && LA41_0 <= '\u30FF'))) {
               alt41 = 341;
            }
            else if (((LA41_0 >= '\u3105' && LA41_0 <= '\u312C'))) {
               alt41 = 342;
            }
            else if (((LA41_0 >= '\u3131' && LA41_0 <= '\u318E'))) {
               alt41 = 343;
            }
            else if (((LA41_0 >= '\u31A0' && LA41_0 <= '\u31B7'))) {
               alt41 = 344;
            }
            else if (((LA41_0 >= '\u31F0' && LA41_0 <= '\u31FF'))) {
               alt41 = 345;
            }
            else if (((LA41_0 >= '\u3400' && LA41_0 <= '\u4DB5'))) {
               alt41 = 346;
            }
            else if (((LA41_0 >= '\u4E00' && LA41_0 <= '\u9FA5'))) {
               alt41 = 347;
            }
            else if (((LA41_0 >= '\uA000' && LA41_0 <= '\uA48C'))) {
               alt41 = 348;
            }
            else if (((LA41_0 >= '\uAC00' && LA41_0 <= '\uD7A3'))) {
               alt41 = 349;
            }
            else if (((LA41_0 >= '\uF900' && LA41_0 <= '\uFA2D'))) {
               alt41 = 350;
            }
            else if (((LA41_0 >= '\uFA30' && LA41_0 <= '\uFA6A'))) {
               alt41 = 351;
            }
            else if (((LA41_0 >= '\uFB00' && LA41_0 <= '\uFB06'))) {
               alt41 = 352;
            }
            else if (((LA41_0 >= '\uFB13' && LA41_0 <= '\uFB17'))) {
               alt41 = 353;
            }
            else if (((LA41_0 >= '\uFB1D' && LA41_0 <= '\uFB28'))) {
               alt41 = 354;
            }
            else if (((LA41_0 >= '\uFB2A' && LA41_0 <= '\uFB36'))) {
               alt41 = 355;
            }
            else if (((LA41_0 >= '\uFB38' && LA41_0 <= '\uFB3C'))) {
               alt41 = 356;
            }
            else if ((LA41_0 == '\uFB3E')) {
               alt41 = 357;
            }
            else if (((LA41_0 >= '\uFB40' && LA41_0 <= '\uFB41'))) {
               alt41 = 358;
            }
            else if (((LA41_0 >= '\uFB43' && LA41_0 <= '\uFB44'))) {
               alt41 = 359;
            }
            else if (((LA41_0 >= '\uFB46' && LA41_0 <= '\uFBB1'))) {
               alt41 = 360;
            }
            else if (((LA41_0 >= '\uFBD3' && LA41_0 <= '\uFD3D'))) {
               alt41 = 361;
            }
            else if (((LA41_0 >= '\uFD50' && LA41_0 <= '\uFD8F'))) {
               alt41 = 362;
            }
            else if (((LA41_0 >= '\uFD92' && LA41_0 <= '\uFDC7'))) {
               alt41 = 363;
            }
            else if (((LA41_0 >= '\uFDF0' && LA41_0 <= '\uFDFC'))) {
               alt41 = 364;
            }
            else if (((LA41_0 >= '\uFE00' && LA41_0 <= '\uFE0F'))) {
               alt41 = 365;
            }
            else if (((LA41_0 >= '\uFE20' && LA41_0 <= '\uFE23'))) {
               alt41 = 366;
            }
            else if (((LA41_0 >= '\uFE33' && LA41_0 <= '\uFE34'))) {
               alt41 = 367;
            }
            else if (((LA41_0 >= '\uFE4D' && LA41_0 <= '\uFE4F'))) {
               alt41 = 368;
            }
            else if ((LA41_0 == '\uFE69')) {
               alt41 = 369;
            }
            else if (((LA41_0 >= '\uFE70' && LA41_0 <= '\uFE74'))) {
               alt41 = 370;
            }
            else if (((LA41_0 >= '\uFE76' && LA41_0 <= '\uFEFC'))) {
               alt41 = 371;
            }
            else if ((LA41_0 == '\uFEFF')) {
               alt41 = 372;
            }
            else if ((LA41_0 == '\uFF04')) {
               alt41 = 373;
            }
            else if (((LA41_0 >= '\uFF10' && LA41_0 <= '\uFF19'))) {
               alt41 = 374;
            }
            else if (((LA41_0 >= '\uFF21' && LA41_0 <= '\uFF3A'))) {
               alt41 = 375;
            }
            else if ((LA41_0 == '\uFF3F')) {
               alt41 = 376;
            }
            else if (((LA41_0 >= '\uFF41' && LA41_0 <= '\uFF5A'))) {
               alt41 = 377;
            }
            else if (((LA41_0 >= '\uFF65' && LA41_0 <= '\uFFBE'))) {
               alt41 = 378;
            }
            else if (((LA41_0 >= '\uFFC2' && LA41_0 <= '\uFFC7'))) {
               alt41 = 379;
            }
            else if (((LA41_0 >= '\uFFCA' && LA41_0 <= '\uFFCF'))) {
               alt41 = 380;
            }
            else if (((LA41_0 >= '\uFFD2' && LA41_0 <= '\uFFD7'))) {
               alt41 = 381;
            }
            else if (((LA41_0 >= '\uFFDA' && LA41_0 <= '\uFFDC'))) {
               alt41 = 382;
            }
            else if (((LA41_0 >= '\uFFE0' && LA41_0 <= '\uFFE1'))) {
               alt41 = 383;
            }
            else if (((LA41_0 >= '\uFFE5' && LA41_0 <= '\uFFE6'))) {
               alt41 = 384;
            }
            else if (((LA41_0 >= '\uFFF9' && LA41_0 <= '\uFFFB'))) {
               alt41 = 385;
            }
            else if (((LA41_0 >= '\uD800' && LA41_0 <= '\uDBFF'))) {
               alt41 = 386;
            }
            else {
               NoViableAltException nvae = new NoViableAltException("", 41, 0, input);

               throw nvae;
            }
            switch (alt41) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:36:
               // '\\u0000' .. '\\b'
               {
                  matchRange('\u0000', '\b');

               }
                  break;
               case 2 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:51:
               // '\\u000E' .. '\\u001B'
               {
                  matchRange('\u000E', '\u001B');

               }
                  break;
               case 3 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:70:
               // '$'
               {
                  match('$');

               }
                  break;
               case 4 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:74:
               // '0' .. '9'
               {
                  matchRange('0', '9');

               }
                  break;
               case 5 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:83:
               // 'A' .. 'Z'
               {
                  matchRange('A', 'Z');

               }
                  break;
               case 6 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:92:
               // '_'
               {
                  match('_');

               }
                  break;
               case 7 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:96:
               // 'a' .. 'z'
               {
                  matchRange('a', 'z');

               }
                  break;
               case 8 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:105:
               // '\\u007F' .. '\\u009F'
               {
                  matchRange('\u007F', '\u009F');

               }
                  break;
               case 9 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:124:
               // '\\u00A2' .. '\\u00A5'
               {
                  matchRange('\u00A2', '\u00A5');

               }
                  break;
               case 10 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:143:
               // '\\u00AA'
               {
                  match('\u00AA');

               }
                  break;
               case 11 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:152:
               // '\\u00AD'
               {
                  match('\u00AD');

               }
                  break;
               case 12 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:161:
               // '\\u00B5'
               {
                  match('\u00B5');

               }
                  break;
               case 13 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:170:
               // '\\u00BA'
               {
                  match('\u00BA');

               }
                  break;
               case 14 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:179:
               // '\\u00C0' .. '\\u00D6'
               {
                  matchRange('\u00C0', '\u00D6');

               }
                  break;
               case 15 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:198:
               // '\\u00D8' .. '\\u00F6'
               {
                  matchRange('\u00D8', '\u00F6');

               }
                  break;
               case 16 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:217:
               // '\\u00F8' .. '\\u0236'
               {
                  matchRange('\u00F8', '\u0236');

               }
                  break;
               case 17 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:236:
               // '\\u0250' .. '\\u02C1'
               {
                  matchRange('\u0250', '\u02C1');

               }
                  break;
               case 18 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:255:
               // '\\u02C6' .. '\\u02D1'
               {
                  matchRange('\u02C6', '\u02D1');

               }
                  break;
               case 19 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:274:
               // '\\u02E0' .. '\\u02E4'
               {
                  matchRange('\u02E0', '\u02E4');

               }
                  break;
               case 20 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:293:
               // '\\u02EE'
               {
                  match('\u02EE');

               }
                  break;
               case 21 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:302:
               // '\\u0300' .. '\\u0357'
               {
                  matchRange('\u0300', '\u0357');

               }
                  break;
               case 22 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:321:
               // '\\u035D' .. '\\u036F'
               {
                  matchRange('\u035D', '\u036F');

               }
                  break;
               case 23 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:340:
               // '\\u037A'
               {
                  match('\u037A');

               }
                  break;
               case 24 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:349:
               // '\\u0386'
               {
                  match('\u0386');

               }
                  break;
               case 25 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:358:
               // '\\u0388' .. '\\u038A'
               {
                  matchRange('\u0388', '\u038A');

               }
                  break;
               case 26 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:377:
               // '\\u038C'
               {
                  match('\u038C');

               }
                  break;
               case 27 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:386:
               // '\\u038E' .. '\\u03A1'
               {
                  matchRange('\u038E', '\u03A1');

               }
                  break;
               case 28 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:405:
               // '\\u03A3' .. '\\u03CE'
               {
                  matchRange('\u03A3', '\u03CE');

               }
                  break;
               case 29 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:424:
               // '\\u03D0' .. '\\u03F5'
               {
                  matchRange('\u03D0', '\u03F5');

               }
                  break;
               case 30 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:443:
               // '\\u03F7' .. '\\u03FB'
               {
                  matchRange('\u03F7', '\u03FB');

               }
                  break;
               case 31 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:462:
               // '\\u0400' .. '\\u0481'
               {
                  matchRange('\u0400', '\u0481');

               }
                  break;
               case 32 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:481:
               // '\\u0483' .. '\\u0486'
               {
                  matchRange('\u0483', '\u0486');

               }
                  break;
               case 33 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:500:
               // '\\u048A' .. '\\u04CE'
               {
                  matchRange('\u048A', '\u04CE');

               }
                  break;
               case 34 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:519:
               // '\\u04D0' .. '\\u04F5'
               {
                  matchRange('\u04D0', '\u04F5');

               }
                  break;
               case 35 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:538:
               // '\\u04F8' .. '\\u04F9'
               {
                  matchRange('\u04F8', '\u04F9');

               }
                  break;
               case 36 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:557:
               // '\\u0500' .. '\\u050F'
               {
                  matchRange('\u0500', '\u050F');

               }
                  break;
               case 37 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:576:
               // '\\u0531' .. '\\u0556'
               {
                  matchRange('\u0531', '\u0556');

               }
                  break;
               case 38 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:595:
               // '\\u0559'
               {
                  match('\u0559');

               }
                  break;
               case 39 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:604:
               // '\\u0561' .. '\\u0587'
               {
                  matchRange('\u0561', '\u0587');

               }
                  break;
               case 40 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:623:
               // '\\u0591' .. '\\u05A1'
               {
                  matchRange('\u0591', '\u05A1');

               }
                  break;
               case 41 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:642:
               // '\\u05A3' .. '\\u05B9'
               {
                  matchRange('\u05A3', '\u05B9');

               }
                  break;
               case 42 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:661:
               // '\\u05BB' .. '\\u05BD'
               {
                  matchRange('\u05BB', '\u05BD');

               }
                  break;
               case 43 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:680:
               // '\\u05BF'
               {
                  match('\u05BF');

               }
                  break;
               case 44 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:689:
               // '\\u05C1' .. '\\u05C2'
               {
                  matchRange('\u05C1', '\u05C2');

               }
                  break;
               case 45 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:708:
               // '\\u05C4'
               {
                  match('\u05C4');

               }
                  break;
               case 46 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:717:
               // '\\u05D0' .. '\\u05EA'
               {
                  matchRange('\u05D0', '\u05EA');

               }
                  break;
               case 47 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:736:
               // '\\u05F0' .. '\\u05F2'
               {
                  matchRange('\u05F0', '\u05F2');

               }
                  break;
               case 48 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:755:
               // '\\u0600' .. '\\u0603'
               {
                  matchRange('\u0600', '\u0603');

               }
                  break;
               case 49 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:774:
               // '\\u0610' .. '\\u0615'
               {
                  matchRange('\u0610', '\u0615');

               }
                  break;
               case 50 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:793:
               // '\\u0621' .. '\\u063A'
               {
                  matchRange('\u0621', '\u063A');

               }
                  break;
               case 51 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:812:
               // '\\u0640' .. '\\u0658'
               {
                  matchRange('\u0640', '\u0658');

               }
                  break;
               case 52 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:831:
               // '\\u0660' .. '\\u0669'
               {
                  matchRange('\u0660', '\u0669');

               }
                  break;
               case 53 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:850:
               // '\\u066E' .. '\\u06D3'
               {
                  matchRange('\u066E', '\u06D3');

               }
                  break;
               case 54 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:869:
               // '\\u06D5' .. '\\u06DD'
               {
                  matchRange('\u06D5', '\u06DD');

               }
                  break;
               case 55 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:888:
               // '\\u06DF' .. '\\u06E8'
               {
                  matchRange('\u06DF', '\u06E8');

               }
                  break;
               case 56 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:907:
               // '\\u06EA' .. '\\u06FC'
               {
                  matchRange('\u06EA', '\u06FC');

               }
                  break;
               case 57 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:926:
               // '\\u06FF'
               {
                  match('\u06FF');

               }
                  break;
               case 58 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:935:
               // '\\u070F' .. '\\u074A'
               {
                  matchRange('\u070F', '\u074A');

               }
                  break;
               case 59 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:954:
               // '\\u074D' .. '\\u074F'
               {
                  matchRange('\u074D', '\u074F');

               }
                  break;
               case 60 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:973:
               // '\\u0780' .. '\\u07B1'
               {
                  matchRange('\u0780', '\u07B1');

               }
                  break;
               case 61 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:992:
               // '\\u0901' .. '\\u0939'
               {
                  matchRange('\u0901', '\u0939');

               }
                  break;
               case 62 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1011:
               // '\\u093C' .. '\\u094D'
               {
                  matchRange('\u093C', '\u094D');

               }
                  break;
               case 63 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1030:
               // '\\u0950' .. '\\u0954'
               {
                  matchRange('\u0950', '\u0954');

               }
                  break;
               case 64 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1049:
               // '\\u0958' .. '\\u0963'
               {
                  matchRange('\u0958', '\u0963');

               }
                  break;
               case 65 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1068:
               // '\\u0966' .. '\\u096F'
               {
                  matchRange('\u0966', '\u096F');

               }
                  break;
               case 66 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1087:
               // '\\u0981' .. '\\u0983'
               {
                  matchRange('\u0981', '\u0983');

               }
                  break;
               case 67 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1106:
               // '\\u0985' .. '\\u098C'
               {
                  matchRange('\u0985', '\u098C');

               }
                  break;
               case 68 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1125:
               // '\\u098F' .. '\\u0990'
               {
                  matchRange('\u098F', '\u0990');

               }
                  break;
               case 69 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1144:
               // '\\u0993' .. '\\u09A8'
               {
                  matchRange('\u0993', '\u09A8');

               }
                  break;
               case 70 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1163:
               // '\\u09AA' .. '\\u09B0'
               {
                  matchRange('\u09AA', '\u09B0');

               }
                  break;
               case 71 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1182:
               // '\\u09B2'
               {
                  match('\u09B2');

               }
                  break;
               case 72 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1191:
               // '\\u09B6' .. '\\u09B9'
               {
                  matchRange('\u09B6', '\u09B9');

               }
                  break;
               case 73 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1210:
               // '\\u09BC' .. '\\u09C4'
               {
                  matchRange('\u09BC', '\u09C4');

               }
                  break;
               case 74 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1229:
               // '\\u09C7' .. '\\u09C8'
               {
                  matchRange('\u09C7', '\u09C8');

               }
                  break;
               case 75 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1248:
               // '\\u09CB' .. '\\u09CD'
               {
                  matchRange('\u09CB', '\u09CD');

               }
                  break;
               case 76 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1267:
               // '\\u09D7'
               {
                  match('\u09D7');

               }
                  break;
               case 77 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1276:
               // '\\u09DC' .. '\\u09DD'
               {
                  matchRange('\u09DC', '\u09DD');

               }
                  break;
               case 78 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1295:
               // '\\u09DF' .. '\\u09E3'
               {
                  matchRange('\u09DF', '\u09E3');

               }
                  break;
               case 79 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1314:
               // '\\u09E6' .. '\\u09F3'
               {
                  matchRange('\u09E6', '\u09F3');

               }
                  break;
               case 80 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1333:
               // '\\u0A01' .. '\\u0A03'
               {
                  matchRange('\u0A01', '\u0A03');

               }
                  break;
               case 81 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1352:
               // '\\u0A05' .. '\\u0A0A'
               {
                  matchRange('\u0A05', '\u0A0A');

               }
                  break;
               case 82 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1371:
               // '\\u0A0F' .. '\\u0A10'
               {
                  matchRange('\u0A0F', '\u0A10');

               }
                  break;
               case 83 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1390:
               // '\\u0A13' .. '\\u0A28'
               {
                  matchRange('\u0A13', '\u0A28');

               }
                  break;
               case 84 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1409:
               // '\\u0A2A' .. '\\u0A30'
               {
                  matchRange('\u0A2A', '\u0A30');

               }
                  break;
               case 85 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1428:
               // '\\u0A32' .. '\\u0A33'
               {
                  matchRange('\u0A32', '\u0A33');

               }
                  break;
               case 86 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1447:
               // '\\u0A35' .. '\\u0A36'
               {
                  matchRange('\u0A35', '\u0A36');

               }
                  break;
               case 87 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1466:
               // '\\u0A38' .. '\\u0A39'
               {
                  matchRange('\u0A38', '\u0A39');

               }
                  break;
               case 88 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1485:
               // '\\u0A3C'
               {
                  match('\u0A3C');

               }
                  break;
               case 89 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1494:
               // '\\u0A3E' .. '\\u0A42'
               {
                  matchRange('\u0A3E', '\u0A42');

               }
                  break;
               case 90 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1513:
               // '\\u0A47' .. '\\u0A48'
               {
                  matchRange('\u0A47', '\u0A48');

               }
                  break;
               case 91 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1532:
               // '\\u0A4B' .. '\\u0A4D'
               {
                  matchRange('\u0A4B', '\u0A4D');

               }
                  break;
               case 92 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1551:
               // '\\u0A59' .. '\\u0A5C'
               {
                  matchRange('\u0A59', '\u0A5C');

               }
                  break;
               case 93 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1570:
               // '\\u0A5E'
               {
                  match('\u0A5E');

               }
                  break;
               case 94 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1579:
               // '\\u0A66' .. '\\u0A74'
               {
                  matchRange('\u0A66', '\u0A74');

               }
                  break;
               case 95 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1598:
               // '\\u0A81' .. '\\u0A83'
               {
                  matchRange('\u0A81', '\u0A83');

               }
                  break;
               case 96 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1617:
               // '\\u0A85' .. '\\u0A8D'
               {
                  matchRange('\u0A85', '\u0A8D');

               }
                  break;
               case 97 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1636:
               // '\\u0A8F' .. '\\u0A91'
               {
                  matchRange('\u0A8F', '\u0A91');

               }
                  break;
               case 98 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1655:
               // '\\u0A93' .. '\\u0AA8'
               {
                  matchRange('\u0A93', '\u0AA8');

               }
                  break;
               case 99 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1674:
               // '\\u0AAA' .. '\\u0AB0'
               {
                  matchRange('\u0AAA', '\u0AB0');

               }
                  break;
               case 100 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1693:
               // '\\u0AB2' .. '\\u0AB3'
               {
                  matchRange('\u0AB2', '\u0AB3');

               }
                  break;
               case 101 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1712:
               // '\\u0AB5' .. '\\u0AB9'
               {
                  matchRange('\u0AB5', '\u0AB9');

               }
                  break;
               case 102 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1731:
               // '\\u0ABC' .. '\\u0AC5'
               {
                  matchRange('\u0ABC', '\u0AC5');

               }
                  break;
               case 103 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1750:
               // '\\u0AC7' .. '\\u0AC9'
               {
                  matchRange('\u0AC7', '\u0AC9');

               }
                  break;
               case 104 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1769:
               // '\\u0ACB' .. '\\u0ACD'
               {
                  matchRange('\u0ACB', '\u0ACD');

               }
                  break;
               case 105 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1788:
               // '\\u0AD0'
               {
                  match('\u0AD0');

               }
                  break;
               case 106 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1797:
               // '\\u0AE0' .. '\\u0AE3'
               {
                  matchRange('\u0AE0', '\u0AE3');

               }
                  break;
               case 107 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1816:
               // '\\u0AE6' .. '\\u0AEF'
               {
                  matchRange('\u0AE6', '\u0AEF');

               }
                  break;
               case 108 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1835:
               // '\\u0AF1'
               {
                  match('\u0AF1');

               }
                  break;
               case 109 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1844:
               // '\\u0B01' .. '\\u0B03'
               {
                  matchRange('\u0B01', '\u0B03');

               }
                  break;
               case 110 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1863:
               // '\\u0B05' .. '\\u0B0C'
               {
                  matchRange('\u0B05', '\u0B0C');

               }
                  break;
               case 111 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1882:
               // '\\u0B0F' .. '\\u0B10'
               {
                  matchRange('\u0B0F', '\u0B10');

               }
                  break;
               case 112 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1901:
               // '\\u0B13' .. '\\u0B28'
               {
                  matchRange('\u0B13', '\u0B28');

               }
                  break;
               case 113 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1920:
               // '\\u0B2A' .. '\\u0B30'
               {
                  matchRange('\u0B2A', '\u0B30');

               }
                  break;
               case 114 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1939:
               // '\\u0B32' .. '\\u0B33'
               {
                  matchRange('\u0B32', '\u0B33');

               }
                  break;
               case 115 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1958:
               // '\\u0B35' .. '\\u0B39'
               {
                  matchRange('\u0B35', '\u0B39');

               }
                  break;
               case 116 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1977:
               // '\\u0B3C' .. '\\u0B43'
               {
                  matchRange('\u0B3C', '\u0B43');

               }
                  break;
               case 117 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:1996:
               // '\\u0B47' .. '\\u0B48'
               {
                  matchRange('\u0B47', '\u0B48');

               }
                  break;
               case 118 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2015:
               // '\\u0B4B' .. '\\u0B4D'
               {
                  matchRange('\u0B4B', '\u0B4D');

               }
                  break;
               case 119 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2034:
               // '\\u0B56' .. '\\u0B57'
               {
                  matchRange('\u0B56', '\u0B57');

               }
                  break;
               case 120 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2053:
               // '\\u0B5C' .. '\\u0B5D'
               {
                  matchRange('\u0B5C', '\u0B5D');

               }
                  break;
               case 121 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2072:
               // '\\u0B5F' .. '\\u0B61'
               {
                  matchRange('\u0B5F', '\u0B61');

               }
                  break;
               case 122 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2091:
               // '\\u0B66' .. '\\u0B6F'
               {
                  matchRange('\u0B66', '\u0B6F');

               }
                  break;
               case 123 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2110:
               // '\\u0B71'
               {
                  match('\u0B71');

               }
                  break;
               case 124 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2119:
               // '\\u0B82' .. '\\u0B83'
               {
                  matchRange('\u0B82', '\u0B83');

               }
                  break;
               case 125 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2138:
               // '\\u0B85' .. '\\u0B8A'
               {
                  matchRange('\u0B85', '\u0B8A');

               }
                  break;
               case 126 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2157:
               // '\\u0B8E' .. '\\u0B90'
               {
                  matchRange('\u0B8E', '\u0B90');

               }
                  break;
               case 127 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2176:
               // '\\u0B92' .. '\\u0B95'
               {
                  matchRange('\u0B92', '\u0B95');

               }
                  break;
               case 128 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2195:
               // '\\u0B99' .. '\\u0B9A'
               {
                  matchRange('\u0B99', '\u0B9A');

               }
                  break;
               case 129 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2214:
               // '\\u0B9C'
               {
                  match('\u0B9C');

               }
                  break;
               case 130 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2223:
               // '\\u0B9E' .. '\\u0B9F'
               {
                  matchRange('\u0B9E', '\u0B9F');

               }
                  break;
               case 131 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2242:
               // '\\u0BA3' .. '\\u0BA4'
               {
                  matchRange('\u0BA3', '\u0BA4');

               }
                  break;
               case 132 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2261:
               // '\\u0BA8' .. '\\u0BAA'
               {
                  matchRange('\u0BA8', '\u0BAA');

               }
                  break;
               case 133 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2280:
               // '\\u0BAE' .. '\\u0BB5'
               {
                  matchRange('\u0BAE', '\u0BB5');

               }
                  break;
               case 134 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2299:
               // '\\u0BB7' .. '\\u0BB9'
               {
                  matchRange('\u0BB7', '\u0BB9');

               }
                  break;
               case 135 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2318:
               // '\\u0BBE' .. '\\u0BC2'
               {
                  matchRange('\u0BBE', '\u0BC2');

               }
                  break;
               case 136 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2337:
               // '\\u0BC6' .. '\\u0BC8'
               {
                  matchRange('\u0BC6', '\u0BC8');

               }
                  break;
               case 137 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2356:
               // '\\u0BCA' .. '\\u0BCD'
               {
                  matchRange('\u0BCA', '\u0BCD');

               }
                  break;
               case 138 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2375:
               // '\\u0BD7'
               {
                  match('\u0BD7');

               }
                  break;
               case 139 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2384:
               // '\\u0BE7' .. '\\u0BEF'
               {
                  matchRange('\u0BE7', '\u0BEF');

               }
                  break;
               case 140 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2403:
               // '\\u0BF9'
               {
                  match('\u0BF9');

               }
                  break;
               case 141 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2412:
               // '\\u0C01' .. '\\u0C03'
               {
                  matchRange('\u0C01', '\u0C03');

               }
                  break;
               case 142 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2431:
               // '\\u0C05' .. '\\u0C0C'
               {
                  matchRange('\u0C05', '\u0C0C');

               }
                  break;
               case 143 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2450:
               // '\\u0C0E' .. '\\u0C10'
               {
                  matchRange('\u0C0E', '\u0C10');

               }
                  break;
               case 144 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2469:
               // '\\u0C12' .. '\\u0C28'
               {
                  matchRange('\u0C12', '\u0C28');

               }
                  break;
               case 145 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2488:
               // '\\u0C2A' .. '\\u0C33'
               {
                  matchRange('\u0C2A', '\u0C33');

               }
                  break;
               case 146 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2507:
               // '\\u0C35' .. '\\u0C39'
               {
                  matchRange('\u0C35', '\u0C39');

               }
                  break;
               case 147 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2526:
               // '\\u0C3E' .. '\\u0C44'
               {
                  matchRange('\u0C3E', '\u0C44');

               }
                  break;
               case 148 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2545:
               // '\\u0C46' .. '\\u0C48'
               {
                  matchRange('\u0C46', '\u0C48');

               }
                  break;
               case 149 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2564:
               // '\\u0C4A' .. '\\u0C4D'
               {
                  matchRange('\u0C4A', '\u0C4D');

               }
                  break;
               case 150 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2583:
               // '\\u0C55' .. '\\u0C56'
               {
                  matchRange('\u0C55', '\u0C56');

               }
                  break;
               case 151 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2602:
               // '\\u0C60' .. '\\u0C61'
               {
                  matchRange('\u0C60', '\u0C61');

               }
                  break;
               case 152 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2621:
               // '\\u0C66' .. '\\u0C6F'
               {
                  matchRange('\u0C66', '\u0C6F');

               }
                  break;
               case 153 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2640:
               // '\\u0C82' .. '\\u0C83'
               {
                  matchRange('\u0C82', '\u0C83');

               }
                  break;
               case 154 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2659:
               // '\\u0C85' .. '\\u0C8C'
               {
                  matchRange('\u0C85', '\u0C8C');

               }
                  break;
               case 155 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2678:
               // '\\u0C8E' .. '\\u0C90'
               {
                  matchRange('\u0C8E', '\u0C90');

               }
                  break;
               case 156 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2697:
               // '\\u0C92' .. '\\u0CA8'
               {
                  matchRange('\u0C92', '\u0CA8');

               }
                  break;
               case 157 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2716:
               // '\\u0CAA' .. '\\u0CB3'
               {
                  matchRange('\u0CAA', '\u0CB3');

               }
                  break;
               case 158 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2735:
               // '\\u0CB5' .. '\\u0CB9'
               {
                  matchRange('\u0CB5', '\u0CB9');

               }
                  break;
               case 159 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2754:
               // '\\u0CBC' .. '\\u0CC4'
               {
                  matchRange('\u0CBC', '\u0CC4');

               }
                  break;
               case 160 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2773:
               // '\\u0CC6' .. '\\u0CC8'
               {
                  matchRange('\u0CC6', '\u0CC8');

               }
                  break;
               case 161 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2792:
               // '\\u0CCA' .. '\\u0CCD'
               {
                  matchRange('\u0CCA', '\u0CCD');

               }
                  break;
               case 162 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2811:
               // '\\u0CD5' .. '\\u0CD6'
               {
                  matchRange('\u0CD5', '\u0CD6');

               }
                  break;
               case 163 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2830:
               // '\\u0CDE'
               {
                  match('\u0CDE');

               }
                  break;
               case 164 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2839:
               // '\\u0CE0' .. '\\u0CE1'
               {
                  matchRange('\u0CE0', '\u0CE1');

               }
                  break;
               case 165 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2858:
               // '\\u0CE6' .. '\\u0CEF'
               {
                  matchRange('\u0CE6', '\u0CEF');

               }
                  break;
               case 166 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2877:
               // '\\u0D02' .. '\\u0D03'
               {
                  matchRange('\u0D02', '\u0D03');

               }
                  break;
               case 167 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2896:
               // '\\u0D05' .. '\\u0D0C'
               {
                  matchRange('\u0D05', '\u0D0C');

               }
                  break;
               case 168 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2915:
               // '\\u0D0E' .. '\\u0D10'
               {
                  matchRange('\u0D0E', '\u0D10');

               }
                  break;
               case 169 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2934:
               // '\\u0D12' .. '\\u0D28'
               {
                  matchRange('\u0D12', '\u0D28');

               }
                  break;
               case 170 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2953:
               // '\\u0D2A' .. '\\u0D39'
               {
                  matchRange('\u0D2A', '\u0D39');

               }
                  break;
               case 171 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2972:
               // '\\u0D3E' .. '\\u0D43'
               {
                  matchRange('\u0D3E', '\u0D43');

               }
                  break;
               case 172 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:2991:
               // '\\u0D46' .. '\\u0D48'
               {
                  matchRange('\u0D46', '\u0D48');

               }
                  break;
               case 173 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3010:
               // '\\u0D4A' .. '\\u0D4D'
               {
                  matchRange('\u0D4A', '\u0D4D');

               }
                  break;
               case 174 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3029:
               // '\\u0D57'
               {
                  match('\u0D57');

               }
                  break;
               case 175 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3038:
               // '\\u0D60' .. '\\u0D61'
               {
                  matchRange('\u0D60', '\u0D61');

               }
                  break;
               case 176 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3057:
               // '\\u0D66' .. '\\u0D6F'
               {
                  matchRange('\u0D66', '\u0D6F');

               }
                  break;
               case 177 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3076:
               // '\\u0D82' .. '\\u0D83'
               {
                  matchRange('\u0D82', '\u0D83');

               }
                  break;
               case 178 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3095:
               // '\\u0D85' .. '\\u0D96'
               {
                  matchRange('\u0D85', '\u0D96');

               }
                  break;
               case 179 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3114:
               // '\\u0D9A' .. '\\u0DB1'
               {
                  matchRange('\u0D9A', '\u0DB1');

               }
                  break;
               case 180 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3133:
               // '\\u0DB3' .. '\\u0DBB'
               {
                  matchRange('\u0DB3', '\u0DBB');

               }
                  break;
               case 181 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3152:
               // '\\u0DBD'
               {
                  match('\u0DBD');

               }
                  break;
               case 182 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3161:
               // '\\u0DC0' .. '\\u0DC6'
               {
                  matchRange('\u0DC0', '\u0DC6');

               }
                  break;
               case 183 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3180:
               // '\\u0DCA'
               {
                  match('\u0DCA');

               }
                  break;
               case 184 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3189:
               // '\\u0DCF' .. '\\u0DD4'
               {
                  matchRange('\u0DCF', '\u0DD4');

               }
                  break;
               case 185 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3208:
               // '\\u0DD6'
               {
                  match('\u0DD6');

               }
                  break;
               case 186 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3217:
               // '\\u0DD8' .. '\\u0DDF'
               {
                  matchRange('\u0DD8', '\u0DDF');

               }
                  break;
               case 187 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3236:
               // '\\u0DF2' .. '\\u0DF3'
               {
                  matchRange('\u0DF2', '\u0DF3');

               }
                  break;
               case 188 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3255:
               // '\\u0E01' .. '\\u0E3A'
               {
                  matchRange('\u0E01', '\u0E3A');

               }
                  break;
               case 189 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3274:
               // '\\u0E3F' .. '\\u0E4E'
               {
                  matchRange('\u0E3F', '\u0E4E');

               }
                  break;
               case 190 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3293:
               // '\\u0E50' .. '\\u0E59'
               {
                  matchRange('\u0E50', '\u0E59');

               }
                  break;
               case 191 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3312:
               // '\\u0E81' .. '\\u0E82'
               {
                  matchRange('\u0E81', '\u0E82');

               }
                  break;
               case 192 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3331:
               // '\\u0E84'
               {
                  match('\u0E84');

               }
                  break;
               case 193 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3340:
               // '\\u0E87' .. '\\u0E88'
               {
                  matchRange('\u0E87', '\u0E88');

               }
                  break;
               case 194 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3359:
               // '\\u0E8A'
               {
                  match('\u0E8A');

               }
                  break;
               case 195 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3368:
               // '\\u0E8D'
               {
                  match('\u0E8D');

               }
                  break;
               case 196 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3377:
               // '\\u0E94' .. '\\u0E97'
               {
                  matchRange('\u0E94', '\u0E97');

               }
                  break;
               case 197 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3396:
               // '\\u0E99' .. '\\u0E9F'
               {
                  matchRange('\u0E99', '\u0E9F');

               }
                  break;
               case 198 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3415:
               // '\\u0EA1' .. '\\u0EA3'
               {
                  matchRange('\u0EA1', '\u0EA3');

               }
                  break;
               case 199 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3434:
               // '\\u0EA5'
               {
                  match('\u0EA5');

               }
                  break;
               case 200 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3443:
               // '\\u0EA7'
               {
                  match('\u0EA7');

               }
                  break;
               case 201 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3452:
               // '\\u0EAA' .. '\\u0EAB'
               {
                  matchRange('\u0EAA', '\u0EAB');

               }
                  break;
               case 202 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3471:
               // '\\u0EAD' .. '\\u0EB9'
               {
                  matchRange('\u0EAD', '\u0EB9');

               }
                  break;
               case 203 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3490:
               // '\\u0EBB' .. '\\u0EBD'
               {
                  matchRange('\u0EBB', '\u0EBD');

               }
                  break;
               case 204 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3509:
               // '\\u0EC0' .. '\\u0EC4'
               {
                  matchRange('\u0EC0', '\u0EC4');

               }
                  break;
               case 205 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3528:
               // '\\u0EC6'
               {
                  match('\u0EC6');

               }
                  break;
               case 206 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3537:
               // '\\u0EC8' .. '\\u0ECD'
               {
                  matchRange('\u0EC8', '\u0ECD');

               }
                  break;
               case 207 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3556:
               // '\\u0ED0' .. '\\u0ED9'
               {
                  matchRange('\u0ED0', '\u0ED9');

               }
                  break;
               case 208 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3575:
               // '\\u0EDC' .. '\\u0EDD'
               {
                  matchRange('\u0EDC', '\u0EDD');

               }
                  break;
               case 209 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3594:
               // '\\u0F00'
               {
                  match('\u0F00');

               }
                  break;
               case 210 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3603:
               // '\\u0F18' .. '\\u0F19'
               {
                  matchRange('\u0F18', '\u0F19');

               }
                  break;
               case 211 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3622:
               // '\\u0F20' .. '\\u0F29'
               {
                  matchRange('\u0F20', '\u0F29');

               }
                  break;
               case 212 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3641:
               // '\\u0F35'
               {
                  match('\u0F35');

               }
                  break;
               case 213 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3650:
               // '\\u0F37'
               {
                  match('\u0F37');

               }
                  break;
               case 214 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3659:
               // '\\u0F39'
               {
                  match('\u0F39');

               }
                  break;
               case 215 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3668:
               // '\\u0F3E' .. '\\u0F47'
               {
                  matchRange('\u0F3E', '\u0F47');

               }
                  break;
               case 216 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3687:
               // '\\u0F49' .. '\\u0F6A'
               {
                  matchRange('\u0F49', '\u0F6A');

               }
                  break;
               case 217 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3706:
               // '\\u0F71' .. '\\u0F84'
               {
                  matchRange('\u0F71', '\u0F84');

               }
                  break;
               case 218 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3725:
               // '\\u0F86' .. '\\u0F8B'
               {
                  matchRange('\u0F86', '\u0F8B');

               }
                  break;
               case 219 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3744:
               // '\\u0F90' .. '\\u0F97'
               {
                  matchRange('\u0F90', '\u0F97');

               }
                  break;
               case 220 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3763:
               // '\\u0F99' .. '\\u0FBC'
               {
                  matchRange('\u0F99', '\u0FBC');

               }
                  break;
               case 221 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3782:
               // '\\u0FC6'
               {
                  match('\u0FC6');

               }
                  break;
               case 222 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3791:
               // '\\u1000' .. '\\u1021'
               {
                  matchRange('\u1000', '\u1021');

               }
                  break;
               case 223 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3810:
               // '\\u1023' .. '\\u1027'
               {
                  matchRange('\u1023', '\u1027');

               }
                  break;
               case 224 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3829:
               // '\\u1029' .. '\\u102A'
               {
                  matchRange('\u1029', '\u102A');

               }
                  break;
               case 225 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3848:
               // '\\u102C' .. '\\u1032'
               {
                  matchRange('\u102C', '\u1032');

               }
                  break;
               case 226 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3867:
               // '\\u1036' .. '\\u1039'
               {
                  matchRange('\u1036', '\u1039');

               }
                  break;
               case 227 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3886:
               // '\\u1040' .. '\\u1049'
               {
                  matchRange('\u1040', '\u1049');

               }
                  break;
               case 228 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3905:
               // '\\u1050' .. '\\u1059'
               {
                  matchRange('\u1050', '\u1059');

               }
                  break;
               case 229 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3924:
               // '\\u10A0' .. '\\u10C5'
               {
                  matchRange('\u10A0', '\u10C5');

               }
                  break;
               case 230 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3943:
               // '\\u10D0' .. '\\u10F8'
               {
                  matchRange('\u10D0', '\u10F8');

               }
                  break;
               case 231 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3962:
               // '\\u1100' .. '\\u1159'
               {
                  matchRange('\u1100', '\u1159');

               }
                  break;
               case 232 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:3981:
               // '\\u115F' .. '\\u11A2'
               {
                  matchRange('\u115F', '\u11A2');

               }
                  break;
               case 233 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4000:
               // '\\u11A8' .. '\\u11F9'
               {
                  matchRange('\u11A8', '\u11F9');

               }
                  break;
               case 234 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4019:
               // '\\u1200' .. '\\u1206'
               {
                  matchRange('\u1200', '\u1206');

               }
                  break;
               case 235 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4038:
               // '\\u1208' .. '\\u1246'
               {
                  matchRange('\u1208', '\u1246');

               }
                  break;
               case 236 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4057:
               // '\\u1248'
               {
                  match('\u1248');

               }
                  break;
               case 237 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4066:
               // '\\u124A' .. '\\u124D'
               {
                  matchRange('\u124A', '\u124D');

               }
                  break;
               case 238 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4085:
               // '\\u1250' .. '\\u1256'
               {
                  matchRange('\u1250', '\u1256');

               }
                  break;
               case 239 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4104:
               // '\\u1258'
               {
                  match('\u1258');

               }
                  break;
               case 240 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4113:
               // '\\u125A' .. '\\u125D'
               {
                  matchRange('\u125A', '\u125D');

               }
                  break;
               case 241 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4132:
               // '\\u1260' .. '\\u1286'
               {
                  matchRange('\u1260', '\u1286');

               }
                  break;
               case 242 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4151:
               // '\\u1288'
               {
                  match('\u1288');

               }
                  break;
               case 243 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4160:
               // '\\u128A' .. '\\u128D'
               {
                  matchRange('\u128A', '\u128D');

               }
                  break;
               case 244 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4179:
               // '\\u1290' .. '\\u12AE'
               {
                  matchRange('\u1290', '\u12AE');

               }
                  break;
               case 245 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4198:
               // '\\u12B0'
               {
                  match('\u12B0');

               }
                  break;
               case 246 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4207:
               // '\\u12B2' .. '\\u12B5'
               {
                  matchRange('\u12B2', '\u12B5');

               }
                  break;
               case 247 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4226:
               // '\\u12B8' .. '\\u12BE'
               {
                  matchRange('\u12B8', '\u12BE');

               }
                  break;
               case 248 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4245:
               // '\\u12C0'
               {
                  match('\u12C0');

               }
                  break;
               case 249 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4254:
               // '\\u12C2' .. '\\u12C5'
               {
                  matchRange('\u12C2', '\u12C5');

               }
                  break;
               case 250 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4273:
               // '\\u12C8' .. '\\u12CE'
               {
                  matchRange('\u12C8', '\u12CE');

               }
                  break;
               case 251 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4292:
               // '\\u12D0' .. '\\u12D6'
               {
                  matchRange('\u12D0', '\u12D6');

               }
                  break;
               case 252 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4311:
               // '\\u12D8' .. '\\u12EE'
               {
                  matchRange('\u12D8', '\u12EE');

               }
                  break;
               case 253 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4330:
               // '\\u12F0' .. '\\u130E'
               {
                  matchRange('\u12F0', '\u130E');

               }
                  break;
               case 254 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4349:
               // '\\u1310'
               {
                  match('\u1310');

               }
                  break;
               case 255 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4358:
               // '\\u1312' .. '\\u1315'
               {
                  matchRange('\u1312', '\u1315');

               }
                  break;
               case 256 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4377:
               // '\\u1318' .. '\\u131E'
               {
                  matchRange('\u1318', '\u131E');

               }
                  break;
               case 257 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4396:
               // '\\u1320' .. '\\u1346'
               {
                  matchRange('\u1320', '\u1346');

               }
                  break;
               case 258 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4415:
               // '\\u1348' .. '\\u135A'
               {
                  matchRange('\u1348', '\u135A');

               }
                  break;
               case 259 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4434:
               // '\\u1369' .. '\\u1371'
               {
                  matchRange('\u1369', '\u1371');

               }
                  break;
               case 260 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4453:
               // '\\u13A0' .. '\\u13F4'
               {
                  matchRange('\u13A0', '\u13F4');

               }
                  break;
               case 261 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4472:
               // '\\u1401' .. '\\u166C'
               {
                  matchRange('\u1401', '\u166C');

               }
                  break;
               case 262 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4491:
               // '\\u166F' .. '\\u1676'
               {
                  matchRange('\u166F', '\u1676');

               }
                  break;
               case 263 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4510:
               // '\\u1681' .. '\\u169A'
               {
                  matchRange('\u1681', '\u169A');

               }
                  break;
               case 264 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4529:
               // '\\u16A0' .. '\\u16EA'
               {
                  matchRange('\u16A0', '\u16EA');

               }
                  break;
               case 265 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4548:
               // '\\u16EE' .. '\\u16F0'
               {
                  matchRange('\u16EE', '\u16F0');

               }
                  break;
               case 266 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4567:
               // '\\u1700' .. '\\u170C'
               {
                  matchRange('\u1700', '\u170C');

               }
                  break;
               case 267 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4586:
               // '\\u170E' .. '\\u1714'
               {
                  matchRange('\u170E', '\u1714');

               }
                  break;
               case 268 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4605:
               // '\\u1720' .. '\\u1734'
               {
                  matchRange('\u1720', '\u1734');

               }
                  break;
               case 269 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4624:
               // '\\u1740' .. '\\u1753'
               {
                  matchRange('\u1740', '\u1753');

               }
                  break;
               case 270 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4643:
               // '\\u1760' .. '\\u176C'
               {
                  matchRange('\u1760', '\u176C');

               }
                  break;
               case 271 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4662:
               // '\\u176E' .. '\\u1770'
               {
                  matchRange('\u176E', '\u1770');

               }
                  break;
               case 272 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4681:
               // '\\u1772' .. '\\u1773'
               {
                  matchRange('\u1772', '\u1773');

               }
                  break;
               case 273 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4700:
               // '\\u1780' .. '\\u17D3'
               {
                  matchRange('\u1780', '\u17D3');

               }
                  break;
               case 274 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4719:
               // '\\u17D7'
               {
                  match('\u17D7');

               }
                  break;
               case 275 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4728:
               // '\\u17DB' .. '\\u17DD'
               {
                  matchRange('\u17DB', '\u17DD');

               }
                  break;
               case 276 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4747:
               // '\\u17E0' .. '\\u17E9'
               {
                  matchRange('\u17E0', '\u17E9');

               }
                  break;
               case 277 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4766:
               // '\\u180B' .. '\\u180D'
               {
                  matchRange('\u180B', '\u180D');

               }
                  break;
               case 278 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4785:
               // '\\u1810' .. '\\u1819'
               {
                  matchRange('\u1810', '\u1819');

               }
                  break;
               case 279 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4804:
               // '\\u1820' .. '\\u1877'
               {
                  matchRange('\u1820', '\u1877');

               }
                  break;
               case 280 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4823:
               // '\\u1880' .. '\\u18A9'
               {
                  matchRange('\u1880', '\u18A9');

               }
                  break;
               case 281 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4842:
               // '\\u1900' .. '\\u191C'
               {
                  matchRange('\u1900', '\u191C');

               }
                  break;
               case 282 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4861:
               // '\\u1920' .. '\\u192B'
               {
                  matchRange('\u1920', '\u192B');

               }
                  break;
               case 283 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4880:
               // '\\u1930' .. '\\u193B'
               {
                  matchRange('\u1930', '\u193B');

               }
                  break;
               case 284 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4899:
               // '\\u1946' .. '\\u196D'
               {
                  matchRange('\u1946', '\u196D');

               }
                  break;
               case 285 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4918:
               // '\\u1970' .. '\\u1974'
               {
                  matchRange('\u1970', '\u1974');

               }
                  break;
               case 286 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4937:
               // '\\u1D00' .. '\\u1D6B'
               {
                  matchRange('\u1D00', '\u1D6B');

               }
                  break;
               case 287 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4956:
               // '\\u1E00' .. '\\u1E9B'
               {
                  matchRange('\u1E00', '\u1E9B');

               }
                  break;
               case 288 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4975:
               // '\\u1EA0' .. '\\u1EF9'
               {
                  matchRange('\u1EA0', '\u1EF9');

               }
                  break;
               case 289 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:4994:
               // '\\u1F00' .. '\\u1F15'
               {
                  matchRange('\u1F00', '\u1F15');

               }
                  break;
               case 290 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5013:
               // '\\u1F18' .. '\\u1F1D'
               {
                  matchRange('\u1F18', '\u1F1D');

               }
                  break;
               case 291 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5032:
               // '\\u1F20' .. '\\u1F45'
               {
                  matchRange('\u1F20', '\u1F45');

               }
                  break;
               case 292 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5051:
               // '\\u1F48' .. '\\u1F4D'
               {
                  matchRange('\u1F48', '\u1F4D');

               }
                  break;
               case 293 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5070:
               // '\\u1F50' .. '\\u1F57'
               {
                  matchRange('\u1F50', '\u1F57');

               }
                  break;
               case 294 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5089:
               // '\\u1F59'
               {
                  match('\u1F59');

               }
                  break;
               case 295 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5098:
               // '\\u1F5B'
               {
                  match('\u1F5B');

               }
                  break;
               case 296 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5107:
               // '\\u1F5D'
               {
                  match('\u1F5D');

               }
                  break;
               case 297 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5116:
               // '\\u1F5F' .. '\\u1F7D'
               {
                  matchRange('\u1F5F', '\u1F7D');

               }
                  break;
               case 298 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5135:
               // '\\u1F80' .. '\\u1FB4'
               {
                  matchRange('\u1F80', '\u1FB4');

               }
                  break;
               case 299 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5154:
               // '\\u1FB6' .. '\\u1FBC'
               {
                  matchRange('\u1FB6', '\u1FBC');

               }
                  break;
               case 300 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5173:
               // '\\u1FBE'
               {
                  match('\u1FBE');

               }
                  break;
               case 301 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5182:
               // '\\u1FC2' .. '\\u1FC4'
               {
                  matchRange('\u1FC2', '\u1FC4');

               }
                  break;
               case 302 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5201:
               // '\\u1FC6' .. '\\u1FCC'
               {
                  matchRange('\u1FC6', '\u1FCC');

               }
                  break;
               case 303 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5220:
               // '\\u1FD0' .. '\\u1FD3'
               {
                  matchRange('\u1FD0', '\u1FD3');

               }
                  break;
               case 304 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5239:
               // '\\u1FD6' .. '\\u1FDB'
               {
                  matchRange('\u1FD6', '\u1FDB');

               }
                  break;
               case 305 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5258:
               // '\\u1FE0' .. '\\u1FEC'
               {
                  matchRange('\u1FE0', '\u1FEC');

               }
                  break;
               case 306 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5277:
               // '\\u1FF2' .. '\\u1FF4'
               {
                  matchRange('\u1FF2', '\u1FF4');

               }
                  break;
               case 307 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5296:
               // '\\u1FF6' .. '\\u1FFC'
               {
                  matchRange('\u1FF6', '\u1FFC');

               }
                  break;
               case 308 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5315:
               // '\\u200C' .. '\\u200F'
               {
                  matchRange('\u200C', '\u200F');

               }
                  break;
               case 309 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5334:
               // '\\u202A' .. '\\u202E'
               {
                  matchRange('\u202A', '\u202E');

               }
                  break;
               case 310 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5353:
               // '\\u203F' .. '\\u2040'
               {
                  matchRange('\u203F', '\u2040');

               }
                  break;
               case 311 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5372:
               // '\\u2054'
               {
                  match('\u2054');

               }
                  break;
               case 312 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5381:
               // '\\u2060' .. '\\u2063'
               {
                  matchRange('\u2060', '\u2063');

               }
                  break;
               case 313 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5400:
               // '\\u206A' .. '\\u206F'
               {
                  matchRange('\u206A', '\u206F');

               }
                  break;
               case 314 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5419:
               // '\\u2071'
               {
                  match('\u2071');

               }
                  break;
               case 315 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5428:
               // '\\u207F'
               {
                  match('\u207F');

               }
                  break;
               case 316 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5437:
               // '\\u20A0' .. '\\u20B1'
               {
                  matchRange('\u20A0', '\u20B1');

               }
                  break;
               case 317 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5456:
               // '\\u20D0' .. '\\u20DC'
               {
                  matchRange('\u20D0', '\u20DC');

               }
                  break;
               case 318 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5475:
               // '\\u20E1'
               {
                  match('\u20E1');

               }
                  break;
               case 319 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5484:
               // '\\u20E5' .. '\\u20EA'
               {
                  matchRange('\u20E5', '\u20EA');

               }
                  break;
               case 320 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5503:
               // '\\u2102'
               {
                  match('\u2102');

               }
                  break;
               case 321 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5512:
               // '\\u2107'
               {
                  match('\u2107');

               }
                  break;
               case 322 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5521:
               // '\\u210A' .. '\\u2113'
               {
                  matchRange('\u210A', '\u2113');

               }
                  break;
               case 323 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5540:
               // '\\u2115'
               {
                  match('\u2115');

               }
                  break;
               case 324 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5549:
               // '\\u2119' .. '\\u211D'
               {
                  matchRange('\u2119', '\u211D');

               }
                  break;
               case 325 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5568:
               // '\\u2124'
               {
                  match('\u2124');

               }
                  break;
               case 326 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5577:
               // '\\u2126'
               {
                  match('\u2126');

               }
                  break;
               case 327 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5586:
               // '\\u2128'
               {
                  match('\u2128');

               }
                  break;
               case 328 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5595:
               // '\\u212A' .. '\\u212D'
               {
                  matchRange('\u212A', '\u212D');

               }
                  break;
               case 329 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5614:
               // '\\u212F' .. '\\u2131'
               {
                  matchRange('\u212F', '\u2131');

               }
                  break;
               case 330 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5633:
               // '\\u2133' .. '\\u2139'
               {
                  matchRange('\u2133', '\u2139');

               }
                  break;
               case 331 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5652:
               // '\\u213D' .. '\\u213F'
               {
                  matchRange('\u213D', '\u213F');

               }
                  break;
               case 332 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5671:
               // '\\u2145' .. '\\u2149'
               {
                  matchRange('\u2145', '\u2149');

               }
                  break;
               case 333 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5690:
               // '\\u2160' .. '\\u2183'
               {
                  matchRange('\u2160', '\u2183');

               }
                  break;
               case 334 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5709:
               // '\\u3005' .. '\\u3007'
               {
                  matchRange('\u3005', '\u3007');

               }
                  break;
               case 335 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5728:
               // '\\u3021' .. '\\u302F'
               {
                  matchRange('\u3021', '\u302F');

               }
                  break;
               case 336 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5747:
               // '\\u3031' .. '\\u3035'
               {
                  matchRange('\u3031', '\u3035');

               }
                  break;
               case 337 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5766:
               // '\\u3038' .. '\\u303C'
               {
                  matchRange('\u3038', '\u303C');

               }
                  break;
               case 338 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5785:
               // '\\u3041' .. '\\u3096'
               {
                  matchRange('\u3041', '\u3096');

               }
                  break;
               case 339 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5804:
               // '\\u3099' .. '\\u309A'
               {
                  matchRange('\u3099', '\u309A');

               }
                  break;
               case 340 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5823:
               // '\\u309D' .. '\\u309F'
               {
                  matchRange('\u309D', '\u309F');

               }
                  break;
               case 341 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5842:
               // '\\u30A1' .. '\\u30FF'
               {
                  matchRange('\u30A1', '\u30FF');

               }
                  break;
               case 342 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5861:
               // '\\u3105' .. '\\u312C'
               {
                  matchRange('\u3105', '\u312C');

               }
                  break;
               case 343 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5880:
               // '\\u3131' .. '\\u318E'
               {
                  matchRange('\u3131', '\u318E');

               }
                  break;
               case 344 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5899:
               // '\\u31A0' .. '\\u31B7'
               {
                  matchRange('\u31A0', '\u31B7');

               }
                  break;
               case 345 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5918:
               // '\\u31F0' .. '\\u31FF'
               {
                  matchRange('\u31F0', '\u31FF');

               }
                  break;
               case 346 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5937:
               // '\\u3400' .. '\\u4DB5'
               {
                  matchRange('\u3400', '\u4DB5');

               }
                  break;
               case 347 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5956:
               // '\\u4E00' .. '\\u9FA5'
               {
                  matchRange('\u4E00', '\u9FA5');

               }
                  break;
               case 348 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5975:
               // '\\uA000' .. '\\uA48C'
               {
                  matchRange('\uA000', '\uA48C');

               }
                  break;
               case 349 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:5994:
               // '\\uAC00' .. '\\uD7A3'
               {
                  matchRange('\uAC00', '\uD7A3');

               }
                  break;
               case 350 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6013:
               // '\\uF900' .. '\\uFA2D'
               {
                  matchRange('\uF900', '\uFA2D');

               }
                  break;
               case 351 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6032:
               // '\\uFA30' .. '\\uFA6A'
               {
                  matchRange('\uFA30', '\uFA6A');

               }
                  break;
               case 352 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6051:
               // '\\uFB00' .. '\\uFB06'
               {
                  matchRange('\uFB00', '\uFB06');

               }
                  break;
               case 353 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6070:
               // '\\uFB13' .. '\\uFB17'
               {
                  matchRange('\uFB13', '\uFB17');

               }
                  break;
               case 354 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6089:
               // '\\uFB1D' .. '\\uFB28'
               {
                  matchRange('\uFB1D', '\uFB28');

               }
                  break;
               case 355 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6108:
               // '\\uFB2A' .. '\\uFB36'
               {
                  matchRange('\uFB2A', '\uFB36');

               }
                  break;
               case 356 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6127:
               // '\\uFB38' .. '\\uFB3C'
               {
                  matchRange('\uFB38', '\uFB3C');

               }
                  break;
               case 357 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6146:
               // '\\uFB3E'
               {
                  match('\uFB3E');

               }
                  break;
               case 358 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6155:
               // '\\uFB40' .. '\\uFB41'
               {
                  matchRange('\uFB40', '\uFB41');

               }
                  break;
               case 359 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6174:
               // '\\uFB43' .. '\\uFB44'
               {
                  matchRange('\uFB43', '\uFB44');

               }
                  break;
               case 360 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6193:
               // '\\uFB46' .. '\\uFBB1'
               {
                  matchRange('\uFB46', '\uFBB1');

               }
                  break;
               case 361 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6212:
               // '\\uFBD3' .. '\\uFD3D'
               {
                  matchRange('\uFBD3', '\uFD3D');

               }
                  break;
               case 362 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6231:
               // '\\uFD50' .. '\\uFD8F'
               {
                  matchRange('\uFD50', '\uFD8F');

               }
                  break;
               case 363 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6250:
               // '\\uFD92' .. '\\uFDC7'
               {
                  matchRange('\uFD92', '\uFDC7');

               }
                  break;
               case 364 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6269:
               // '\\uFDF0' .. '\\uFDFC'
               {
                  matchRange('\uFDF0', '\uFDFC');

               }
                  break;
               case 365 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6288:
               // '\\uFE00' .. '\\uFE0F'
               {
                  matchRange('\uFE00', '\uFE0F');

               }
                  break;
               case 366 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6307:
               // '\\uFE20' .. '\\uFE23'
               {
                  matchRange('\uFE20', '\uFE23');

               }
                  break;
               case 367 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6326:
               // '\\uFE33' .. '\\uFE34'
               {
                  matchRange('\uFE33', '\uFE34');

               }
                  break;
               case 368 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6345:
               // '\\uFE4D' .. '\\uFE4F'
               {
                  matchRange('\uFE4D', '\uFE4F');

               }
                  break;
               case 369 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6364:
               // '\\uFE69'
               {
                  match('\uFE69');

               }
                  break;
               case 370 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6373:
               // '\\uFE70' .. '\\uFE74'
               {
                  matchRange('\uFE70', '\uFE74');

               }
                  break;
               case 371 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6392:
               // '\\uFE76' .. '\\uFEFC'
               {
                  matchRange('\uFE76', '\uFEFC');

               }
                  break;
               case 372 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6411:
               // '\\uFEFF'
               {
                  match('\uFEFF');

               }
                  break;
               case 373 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6420:
               // '\\uFF04'
               {
                  match('\uFF04');

               }
                  break;
               case 374 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6429:
               // '\\uFF10' .. '\\uFF19'
               {
                  matchRange('\uFF10', '\uFF19');

               }
                  break;
               case 375 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6448:
               // '\\uFF21' .. '\\uFF3A'
               {
                  matchRange('\uFF21', '\uFF3A');

               }
                  break;
               case 376 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6467:
               // '\\uFF3F'
               {
                  match('\uFF3F');

               }
                  break;
               case 377 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6476:
               // '\\uFF41' .. '\\uFF5A'
               {
                  matchRange('\uFF41', '\uFF5A');

               }
                  break;
               case 378 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6495:
               // '\\uFF65' .. '\\uFFBE'
               {
                  matchRange('\uFF65', '\uFFBE');

               }
                  break;
               case 379 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6514:
               // '\\uFFC2' .. '\\uFFC7'
               {
                  matchRange('\uFFC2', '\uFFC7');

               }
                  break;
               case 380 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6533:
               // '\\uFFCA' .. '\\uFFCF'
               {
                  matchRange('\uFFCA', '\uFFCF');

               }
                  break;
               case 381 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6552:
               // '\\uFFD2' .. '\\uFFD7'
               {
                  matchRange('\uFFD2', '\uFFD7');

               }
                  break;
               case 382 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6571:
               // '\\uFFDA' .. '\\uFFDC'
               {
                  matchRange('\uFFDA', '\uFFDC');

               }
                  break;
               case 383 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6590:
               // '\\uFFE0' .. '\\uFFE1'
               {
                  matchRange('\uFFE0', '\uFFE1');

               }
                  break;
               case 384 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6609:
               // '\\uFFE5' .. '\\uFFE6'
               {
                  matchRange('\uFFE5', '\uFFE6');

               }
                  break;
               case 385 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6628:
               // '\\uFFF9' .. '\\uFFFB'
               {
                  matchRange('\uFFF9', '\uFFFB');

               }
                  break;
               case 386 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:631:6647:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:633:17:
         // ( '/*' ( options {greedy=false; } : . )* '*/' )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:633:19:
         // '/*' ( options {greedy=false; } : . )* '*/'
         {
            match("/*");

            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:633:24:
            // ( options {greedy=false; } : . )*
            loop42 : do {
               int alt42 = 2;
               int LA42_0 = input.LA(1);

               if ((LA42_0 == '*')) {
                  int LA42_1 = input.LA(2);

                  if ((LA42_1 == '/')) {
                     alt42 = 2;
                  }
                  else if (((LA42_1 >= '\u0000' && LA42_1 <= '.') || (LA42_1 >= '0' && LA42_1 <= '\uFFFF'))) {
                     alt42 = 1;
                  }


               }
               else if (((LA42_0 >= '\u0000' && LA42_0 <= ')') || (LA42_0 >= '+' && LA42_0 <= '\uFFFF'))) {
                  alt42 = 1;
               }


               switch (alt42) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:633:52:
                  // .
                  {
                     matchAny();

                  }
                     break;

                  default :
                     break loop42;
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:17:
         // ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:19:
         // '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
         {
            match("//");

            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:24:
            // (~ ( ( '\\n' | '\\r' ) ) )*
            loop43 : do {
               int alt43 = 2;
               int LA43_0 = input.LA(1);

               if (((LA43_0 >= '\u0000' && LA43_0 <= '\t') || (LA43_0 >= '\u000B' && LA43_0 <= '\f') || (LA43_0 >= '\u000E' && LA43_0 <= '\uFFFF'))) {
                  alt43 = 1;
               }


               switch (alt43) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:24:
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
                     break loop43;
               }
            }
            while (true);

            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:40:
            // ( ( '\\r' )? '\\n' )?
            int alt45 = 2;
            int LA45_0 = input.LA(1);

            if ((LA45_0 == '\n' || LA45_0 == '\r')) {
               alt45 = 1;
            }
            switch (alt45) {
               case 1 :
               // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:41:
               // ( '\\r' )? '\\n'
               {
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:41:
                  // ( '\\r' )?
                  int alt44 = 2;
                  int LA44_0 = input.LA(1);

                  if ((LA44_0 == '\r')) {
                     alt44 = 1;
                  }
                  switch (alt44) {
                     case 1 :
                     // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:635:41:
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
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:637:9:
         // ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:637:11:
         // ( ' ' | '\\t' | '\\r' | '\\n' )+
         {
            // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:637:11:
            // ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt46 = 0;
            loop46 : do {
               int alt46 = 2;
               int LA46_0 = input.LA(1);

               if (((LA46_0 >= '\t' && LA46_0 <= '\n') || LA46_0 == '\r' || LA46_0 == ' ')) {
                  alt46 = 1;
               }


               switch (alt46) {
                  case 1 :
                  // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:
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
                     if (cnt46 >= 1)
                        break loop46;
                     EarlyExitException eee = new EarlyExitException(46, input);
                     throw eee;
               }
               cnt46++;
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
      // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:8:
      // ( T__57 | T__58 | RULE_DECIMALINTEGERLITERAL | RULE_HEXINTEGERLITERAL | RULE_OCTALINTEGERLITERAL |
      // RULE_BINARYINTEGERLITERAL | RULE_DECIMALFLOATINGPOINTLITERAL | RULE_HEXADECIMALFLOATINGPOINTLITERAL | RULE_TRUE
      // | RULE_FALSE | RULE_CHARACTER | RULE_STRING | RULE_NULL | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT |
      // RULE_WS )
      int alt47 = 17;
      alt47 = dfa47.predict(input);
      switch (alt47) {
         case 1 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:10:
         // T__57
         {
            mT__57();

         }
            break;
         case 2 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:16:
         // T__58
         {
            mT__58();

         }
            break;
         case 3 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:22:
         // RULE_DECIMALINTEGERLITERAL
         {
            mRULE_DECIMALINTEGERLITERAL();

         }
            break;
         case 4 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:49:
         // RULE_HEXINTEGERLITERAL
         {
            mRULE_HEXINTEGERLITERAL();

         }
            break;
         case 5 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:72:
         // RULE_OCTALINTEGERLITERAL
         {
            mRULE_OCTALINTEGERLITERAL();

         }
            break;
         case 6 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:97:
         // RULE_BINARYINTEGERLITERAL
         {
            mRULE_BINARYINTEGERLITERAL();

         }
            break;
         case 7 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:123:
         // RULE_DECIMALFLOATINGPOINTLITERAL
         {
            mRULE_DECIMALFLOATINGPOINTLITERAL();

         }
            break;
         case 8 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:156:
         // RULE_HEXADECIMALFLOATINGPOINTLITERAL
         {
            mRULE_HEXADECIMALFLOATINGPOINTLITERAL();

         }
            break;
         case 9 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:193:
         // RULE_TRUE
         {
            mRULE_TRUE();

         }
            break;
         case 10 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:203:
         // RULE_FALSE
         {
            mRULE_FALSE();

         }
            break;
         case 11 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:214:
         // RULE_CHARACTER
         {
            mRULE_CHARACTER();

         }
            break;
         case 12 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:229:
         // RULE_STRING
         {
            mRULE_STRING();

         }
            break;
         case 13 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:241:
         // RULE_NULL
         {
            mRULE_NULL();

         }
            break;
         case 14 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:251:
         // RULE_IDENTIFIER
         {
            mRULE_IDENTIFIER();

         }
            break;
         case 15 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:267:
         // RULE_ML_COMMENT
         {
            mRULE_ML_COMMENT();

         }
            break;
         case 16 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:283:
         // RULE_SL_COMMENT
         {
            mRULE_SL_COMMENT();

         }
            break;
         case 17 :
         // ../org.sourcepit.java.literals/src-gen/org/sourcepit/java/literals/parser/antlr/internal/InternalLiterals.g:1:299:
         // RULE_WS
         {
            mRULE_WS();

         }
            break;

      }

   }


   protected DFA27 dfa27 = new DFA27(this);
   protected DFA33 dfa33 = new DFA33(this);
   protected DFA47 dfa47 = new DFA47(this);
   static final String DFA27_eotS = "\12\uffff";
   static final String DFA27_eofS = "\12\uffff";
   static final String DFA27_minS = "\2\56\2\uffff\1\56\1\60\2\uffff\1\56\1\60";
   static final String DFA27_maxS = "\1\71\1\146\2\uffff\1\146\1\137\2\uffff\1\146\1\137";
   static final String DFA27_acceptS = "\2\uffff\1\2\1\1\2\uffff\1\3\1\4\2\uffff";
   static final String DFA27_specialS = "\12\uffff}>";
   static final String[] DFA27_transitionS = { "\1\2\1\uffff\12\1",
      "\1\3\1\uffff\12\4\12\uffff\1\7\1\6\1\7\30\uffff\1\5\4\uffff" + "\1\7\1\6\1\7", "", "",
      "\1\3\1\uffff\12\10\12\uffff\1\7\1\6\1\7\30\uffff\1\11\4\uffff" + "\1\7\1\6\1\7", "\12\10\45\uffff\1\11", "", "",
      "\1\3\1\uffff\12\10\12\uffff\1\7\1\6\1\7\30\uffff\1\11\4\uffff" + "\1\7\1\6\1\7", "\12\10\45\uffff\1\11" };

   static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
   static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
   static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
   static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
   static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
   static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
   static final short[][] DFA27_transition;

   static {
      int numStates = DFA27_transitionS.length;
      DFA27_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
      }
   }

   class DFA27 extends DFA {

      public DFA27(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 27;
         this.eot = DFA27_eot;
         this.eof = DFA27_eof;
         this.min = DFA27_min;
         this.max = DFA27_max;
         this.accept = DFA27_accept;
         this.special = DFA27_special;
         this.transition = DFA27_transition;
      }

      public String getDescription() {
         return "587:36: ( RULE_DIGITS '.' ( RULE_DIGITS )? ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | '.' RULE_DIGITS ( RULE_EXPONENTPART )? ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_EXPONENTPART ( RULE_FLOATTYPESUFFIX )? | RULE_DIGITS RULE_FLOATTYPESUFFIX )";
      }
   }

   static final String DFA33_eotS = "\3\uffff\1\5\2\uffff\3\5";
   static final String DFA33_eofS = "\11\uffff";
   static final String DFA33_minS = "\1\60\1\130\2\56\2\uffff\1\60\2\56";
   static final String DFA33_maxS = "\1\60\1\170\2\146\2\uffff\3\146";
   static final String DFA33_acceptS = "\4\uffff\1\2\1\1\3\uffff";
   static final String DFA33_specialS = "\11\uffff}>";
   static final String[] DFA33_transitionS = { "\1\1", "\1\2\37\uffff\1\2",
      "\1\4\1\uffff\12\3\7\uffff\6\3\32\uffff\6\3", "\1\6\1\uffff\12\7\7\uffff\6\7\32\uffff\6\7", "", "",
      "\12\4\7\uffff\6\4\32\uffff\6\4", "\1\6\1\uffff\12\10\7\uffff\6\10\32\uffff\6\10",
      "\1\6\1\uffff\12\10\7\uffff\6\10\32\uffff\6\10" };

   static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
   static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
   static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
   static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
   static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
   static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
   static final short[][] DFA33_transition;

   static {
      int numStates = DFA33_transitionS.length;
      DFA33_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
      }
   }

   class DFA33 extends DFA {

      public DFA33(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 33;
         this.eot = DFA33_eot;
         this.eof = DFA33_eof;
         this.min = DFA33_min;
         this.max = DFA33_max;
         this.accept = DFA33_accept;
         this.special = DFA33_special;
         this.transition = DFA33_transition;
      }

      public String getDescription() {
         return "601:32: ( RULE_HEXNUMERAL ( '.' )? | '0' ( 'x' | 'X' ) ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )+ )";
      }
   }

   static final String DFA47_eotS = "\2\uffff\1\13\2\21\1\uffff\2\13\2\uffff\1\13\3\uffff\1\13\3\uffff"
      + "\1\36\2\uffff\1\21\3\13\2\uffff\1\13\1\53\2\uffff\1\36\1\uffff\1"
      + "\36\1\uffff\1\21\1\uffff\1\21\1\uffff\4\13\1\uffff\1\53\1\uffff"
      + "\1\36\1\uffff\1\36\1\uffff\1\21\1\uffff\1\21\1\uffff\1\101\1\13"
      + "\1\103\1\13\1\53\1\uffff\1\53\1\36\1\uffff\1\21\2\uffff\1\105\1" + "\uffff\1\106\2\uffff";
   static final String DFA47_eofS = "\107\uffff";
   static final String DFA47_minS = "\1\11\1\uffff\1\165\2\56\1\uffff\1\162\1\141\2\uffff\1\165\1\uffff"
      + "\1\52\1\uffff\1\142\1\56\2\uffff\1\56\2\60\1\56\1\165\2\154\2\uffff"
      + "\1\154\1\56\2\uffff\1\56\1\60\1\56\1\60\1\56\1\60\1\56\1\60\1\145"
      + "\1\163\1\154\1\151\1\uffff\1\56\1\60\1\56\1\60\1\56\1\60\1\56\1"
      + "\60\1\56\1\60\1\0\1\145\1\0\1\143\1\56\1\60\2\56\1\60\1\56\1\60" + "\1\uffff\1\0\1\uffff\1\0\2\uffff";
   static final String DFA47_maxS = "\1\uffe6\1\uffff\1\165\1\170\1\146\1\uffff\1\162\1\141\2\uffff"
      + "\1\165\1\uffff\1\57\1\uffff\1\142\1\146\2\uffff\1\146\2\137\1\146"
      + "\1\165\2\154\2\uffff\1\154\1\160\2\uffff\1\146\1\137\1\146\1\137"
      + "\1\146\1\137\1\146\1\137\1\145\1\163\1\154\1\151\1\uffff\1\160\2"
      + "\146\1\137\1\146\1\137\1\146\1\137\1\146\1\137\1\ufffb\1\145\1\ufffb"
      + "\1\143\1\160\1\146\1\160\1\146\1\137\1\146\1\137\1\uffff\1\ufffb" + "\1\uffff\1\ufffb\2\uffff";
   static final String DFA47_acceptS = "\1\uffff\1\1\3\uffff\1\7\2\uffff\1\13\1\14\1\uffff\1\16\1\uffff"
      + "\1\21\2\uffff\1\6\1\3\7\uffff\1\17\1\20\2\uffff\1\10\1\5\14\uffff"
      + "\1\4\25\uffff\1\11\1\uffff\1\15\1\uffff\1\12\1\2";
   static final String DFA47_specialS = "\107\uffff}>";
   static final String[] DFA47_transitionS = {
      "\2\15\2\uffff\1\15\22\uffff\1\15\1\uffff\1\11\1\uffff\1\13"
         + "\2\uffff\1\10\6\uffff\1\5\1\14\1\3\11\4\6\uffff\1\1\32\13\4"
         + "\uffff\1\13\1\uffff\5\13\1\7\7\13\1\12\1\13\1\2\3\13\1\6\6\13"
         + "\47\uffff\4\13\4\uffff\1\13\12\uffff\1\13\4\uffff\1\13\5\uffff"
         + "\27\13\1\uffff\37\13\1\uffff\u013f\13\31\uffff\162\13\4\uffff"
         + "\14\13\16\uffff\5\13\11\uffff\1\13\u008b\uffff\1\13\13\uffff"
         + "\1\13\1\uffff\3\13\1\uffff\1\13\1\uffff\24\13\1\uffff\54\13"
         + "\1\uffff\46\13\1\uffff\5\13\4\uffff\u0082\13\10\uffff\105\13"
         + "\1\uffff\46\13\2\uffff\2\13\6\uffff\20\13\41\uffff\46\13\2\uffff"
         + "\1\13\7\uffff\47\13\110\uffff\33\13\5\uffff\3\13\56\uffff\32"
         + "\13\5\uffff\13\13\43\uffff\2\13\1\uffff\143\13\1\uffff\1\13"
         + "\17\uffff\2\13\7\uffff\2\13\12\uffff\3\13\2\uffff\1\13\20\uffff"
         + "\1\13\1\uffff\36\13\35\uffff\3\13\60\uffff\46\13\13\uffff\1"
         + "\13\u0152\uffff\66\13\3\uffff\1\13\22\uffff\1\13\7\uffff\12"
         + "\13\43\uffff\10\13\2\uffff\2\13\2\uffff\26\13\1\uffff\7\13\1"
         + "\uffff\1\13\3\uffff\4\13\3\uffff\1\13\36\uffff\2\13\1\uffff"
         + "\3\13\16\uffff\4\13\21\uffff\6\13\4\uffff\2\13\2\uffff\26\13"
         + "\1\uffff\7\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\37\uffff"
         + "\4\13\1\uffff\1\13\23\uffff\3\13\20\uffff\11\13\1\uffff\3\13"
         + "\1\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff\5\13\3\uffff"
         + "\1\13\22\uffff\1\13\17\uffff\2\13\17\uffff\1\13\23\uffff\10"
         + "\13\2\uffff\2\13\2\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff"
         + "\5\13\3\uffff\1\13\36\uffff\2\13\1\uffff\3\13\17\uffff\1\13"
         + "\21\uffff\1\13\1\uffff\6\13\3\uffff\3\13\1\uffff\4\13\3\uffff"
         + "\2\13\1\uffff\1\13\1\uffff\2\13\3\uffff\2\13\3\uffff\3\13\3"
         + "\uffff\10\13\1\uffff\3\13\77\uffff\1\13\13\uffff\10\13\1\uffff"
         + "\3\13\1\uffff\27\13\1\uffff\12\13\1\uffff\5\13\46\uffff\2\13"
         + "\43\uffff\10\13\1\uffff\3\13\1\uffff\27\13\1\uffff\12\13\1\uffff"
         + "\5\13\3\uffff\1\13\40\uffff\1\13\1\uffff\2\13\43\uffff\10\13"
         + "\1\uffff\3\13\1\uffff\27\13\1\uffff\20\13\46\uffff\2\13\43\uffff"
         + "\22\13\3\uffff\30\13\1\uffff\11\13\1\uffff\1\13\2\uffff\7\13"
         + "\72\uffff\60\13\1\uffff\2\13\13\uffff\10\13\72\uffff\2\13\1"
         + "\uffff\1\13\2\uffff\2\13\1\uffff\1\13\2\uffff\1\13\6\uffff\4"
         + "\13\1\uffff\7\13\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff"
         + "\2\13\1\uffff\4\13\1\uffff\2\13\11\uffff\1\13\2\uffff\5\13\1"
         + "\uffff\1\13\25\uffff\2\13\42\uffff\1\13\77\uffff\10\13\1\uffff"
         + "\42\13\35\uffff\4\13\164\uffff\42\13\1\uffff\5\13\1\uffff\2"
         + "\13\45\uffff\6\13\112\uffff\46\13\12\uffff\51\13\7\uffff\132"
         + "\13\5\uffff\104\13\5\uffff\122\13\6\uffff\7\13\1\uffff\77\13"
         + "\1\uffff\1\13\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff"
         + "\4\13\2\uffff\47\13\1\uffff\1\13\1\uffff\4\13\2\uffff\37\13"
         + "\1\uffff\1\13\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff"
         + "\4\13\2\uffff\7\13\1\uffff\7\13\1\uffff\27\13\1\uffff\37\13"
         + "\1\uffff\1\13\1\uffff\4\13\2\uffff\7\13\1\uffff\47\13\1\uffff"
         + "\23\13\105\uffff\125\13\14\uffff\u026c\13\2\uffff\10\13\12\uffff"
         + "\32\13\5\uffff\113\13\3\uffff\3\13\17\uffff\15\13\1\uffff\4"
         + "\13\16\uffff\22\13\16\uffff\22\13\16\uffff\15\13\1\uffff\3\13"
         + "\17\uffff\64\13\43\uffff\1\13\3\uffff\2\13\103\uffff\130\13"
         + "\10\uffff\51\13\127\uffff\35\13\63\uffff\36\13\2\uffff\5\13"
         + "\u038b\uffff\154\13\u0094\uffff\u009c\13\4\uffff\132\13\6\uffff"
         + "\26\13\2\uffff\6\13\2\uffff\46\13\2\uffff\6\13\2\uffff\10\13"
         + "\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\37\13\2\uffff"
         + "\65\13\1\uffff\7\13\1\uffff\1\13\3\uffff\3\13\1\uffff\7\13\3"
         + "\uffff\4\13\2\uffff\6\13\4\uffff\15\13\5\uffff\3\13\1\uffff"
         + "\7\13\102\uffff\2\13\23\uffff\1\13\34\uffff\1\13\15\uffff\1"
         + "\13\40\uffff\22\13\120\uffff\1\13\4\uffff\1\13\2\uffff\12\13"
         + "\1\uffff\1\13\3\uffff\5\13\6\uffff\1\13\1\uffff\1\13\1\uffff"
         + "\1\13\1\uffff\4\13\1\uffff\3\13\1\uffff\7\13\3\uffff\3\13\5"
         + "\uffff\5\13\26\uffff\44\13\u0e81\uffff\3\13\31\uffff\11\13\7"
         + "\uffff\5\13\2\uffff\5\13\4\uffff\126\13\6\uffff\3\13\1\uffff"
         + "\137\13\5\uffff\50\13\4\uffff\136\13\21\uffff\30\13\70\uffff"
         + "\20\13\u0200\uffff\u19b6\13\112\uffff\u51a6\13\132\uffff\u048d"
         + "\13\u0773\uffff\u2ba4\13\134\uffff\u0400\13\u1d00\uffff\u012e"
         + "\13\2\uffff\73\13\u0095\uffff\7\13\14\uffff\5\13\5\uffff\1\13"
         + "\1\uffff\12\13\1\uffff\15\13\1\uffff\5\13\1\uffff\1\13\1\uffff"
         + "\2\13\1\uffff\2\13\1\uffff\154\13\41\uffff\u016b\13\22\uffff"
         + "\100\13\2\uffff\66\13\50\uffff\15\13\66\uffff\2\13\30\uffff"
         + "\3\13\31\uffff\1\13\6\uffff\5\13\1\uffff\u0087\13\7\uffff\1"
         + "\13\34\uffff\32\13\4\uffff\1\13\1\uffff\32\13\12\uffff\132\13"
         + "\3\uffff\6\13\2\uffff\6\13\2\uffff\6\13\2\uffff\3\13\3\uffff" + "\2\13\3\uffff\2\13",
      "",
      "\1\16",
      "\1\5\1\uffff\10\22\2\5\10\uffff\1\20\1\uffff\3\5\21\uffff"
         + "\1\17\6\uffff\1\23\2\uffff\1\20\1\uffff\3\5\21\uffff\1\17",
      "\1\5\1\uffff\12\25\12\uffff\3\5\30\uffff\1\24\4\uffff\3\5",
      "",
      "\1\26",
      "\1\27",
      "",
      "",
      "\1\30",
      "",
      "\1\31\4\uffff\1\32",
      "",
      "\1\33",
      "\1\35\1\uffff\12\34\7\uffff\6\34\32\uffff\6\34",
      "",
      "",
      "\1\5\1\uffff\10\37\2\5\12\uffff\3\5\30\uffff\1\40\4\uffff" + "\3\5",
      "\10\41\2\5\45\uffff\1\42",
      "\12\43\45\uffff\1\44",
      "\1\5\1\uffff\12\45\12\uffff\3\5\30\uffff\1\46\4\uffff\3\5",
      "\1\47",
      "\1\50",
      "\1\51",
      "",
      "",
      "\1\52",
      "\1\35\1\uffff\12\54\7\uffff\6\54\11\uffff\1\35\16\uffff\1" + "\55\1\uffff\6\54\11\uffff\1\35",
      "",
      "",
      "\1\5\1\uffff\10\56\2\5\12\uffff\3\5\30\uffff\1\57\4\uffff" + "\3\5",
      "\10\56\2\5\45\uffff\1\57",
      "\1\5\1\uffff\10\60\2\5\12\uffff\3\5\30\uffff\1\61\4\uffff" + "\3\5",
      "\10\41\2\5\45\uffff\1\42",
      "\1\5\1\uffff\12\62\12\uffff\3\5\30\uffff\1\63\4\uffff\3\5",
      "\12\43\45\uffff\1\44",
      "\1\5\1\uffff\12\64\12\uffff\3\5\30\uffff\1\65\4\uffff\3\5",
      "\12\64\45\uffff\1\65",
      "\1\66",
      "\1\67",
      "\1\70",
      "\1\71",
      "",
      "\1\35\1\uffff\12\72\7\uffff\6\72\11\uffff\1\35\16\uffff\1" + "\73\1\uffff\6\72\11\uffff\1\35",
      "\12\74\7\uffff\6\74\30\uffff\1\73\1\uffff\6\74",
      "\1\5\1\uffff\10\56\2\5\12\uffff\3\5\30\uffff\1\57\4\uffff" + "\3\5",
      "\10\56\2\5\45\uffff\1\57",
      "\1\5\1\uffff\10\75\2\5\12\uffff\3\5\30\uffff\1\76\4\uffff" + "\3\5",
      "\10\75\2\5\45\uffff\1\76",
      "\1\5\1\uffff\12\77\12\uffff\3\5\30\uffff\1\100\4\uffff\3\5",
      "\12\77\45\uffff\1\100",
      "\1\5\1\uffff\12\64\12\uffff\3\5\30\uffff\1\65\4\uffff\3\5",
      "\12\64\45\uffff\1\65",
      "\11\13\5\uffff\16\13\10\uffff\1\13\13\uffff\12\13\7\uffff"
         + "\32\13\4\uffff\1\13\1\uffff\32\13\4\uffff\41\13\2\uffff\4\13"
         + "\4\uffff\1\13\2\uffff\1\13\7\uffff\1\13\4\uffff\1\13\5\uffff"
         + "\27\13\1\uffff\37\13\1\uffff\u013f\13\31\uffff\162\13\4\uffff"
         + "\14\13\16\uffff\5\13\11\uffff\1\13\21\uffff\130\13\5\uffff\23"
         + "\13\12\uffff\1\13\13\uffff\1\13\1\uffff\3\13\1\uffff\1\13\1"
         + "\uffff\24\13\1\uffff\54\13\1\uffff\46\13\1\uffff\5\13\4\uffff"
         + "\u0082\13\1\uffff\4\13\3\uffff\105\13\1\uffff\46\13\2\uffff"
         + "\2\13\6\uffff\20\13\41\uffff\46\13\2\uffff\1\13\7\uffff\47\13"
         + "\11\uffff\21\13\1\uffff\27\13\1\uffff\3\13\1\uffff\1\13\1\uffff"
         + "\2\13\1\uffff\1\13\13\uffff\33\13\5\uffff\3\13\15\uffff\4\13"
         + "\14\uffff\6\13\13\uffff\32\13\5\uffff\31\13\7\uffff\12\13\4"
         + "\uffff\146\13\1\uffff\11\13\1\uffff\12\13\1\uffff\23\13\2\uffff"
         + "\1\13\17\uffff\74\13\2\uffff\3\13\60\uffff\62\13\u014f\uffff"
         + "\71\13\2\uffff\22\13\2\uffff\5\13\3\uffff\14\13\2\uffff\12\13"
         + "\21\uffff\3\13\1\uffff\10\13\2\uffff\2\13\2\uffff\26\13\1\uffff"
         + "\7\13\1\uffff\1\13\3\uffff\4\13\2\uffff\11\13\2\uffff\2\13\2"
         + "\uffff\3\13\11\uffff\1\13\4\uffff\2\13\1\uffff\5\13\2\uffff"
         + "\16\13\15\uffff\3\13\1\uffff\6\13\4\uffff\2\13\2\uffff\26\13"
         + "\1\uffff\7\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff"
         + "\1\13\1\uffff\5\13\4\uffff\2\13\2\uffff\3\13\13\uffff\4\13\1"
         + "\uffff\1\13\7\uffff\17\13\14\uffff\3\13\1\uffff\11\13\1\uffff"
         + "\3\13\1\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff\5\13\2"
         + "\uffff\12\13\1\uffff\3\13\1\uffff\3\13\2\uffff\1\13\17\uffff"
         + "\4\13\2\uffff\12\13\1\uffff\1\13\17\uffff\3\13\1\uffff\10\13"
         + "\2\uffff\2\13\2\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff"
         + "\5\13\2\uffff\10\13\3\uffff\2\13\2\uffff\3\13\10\uffff\2\13"
         + "\4\uffff\2\13\1\uffff\3\13\4\uffff\12\13\1\uffff\1\13\20\uffff"
         + "\2\13\1\uffff\6\13\3\uffff\3\13\1\uffff\4\13\3\uffff\2\13\1"
         + "\uffff\1\13\1\uffff\2\13\3\uffff\2\13\3\uffff\3\13\3\uffff\10"
         + "\13\1\uffff\3\13\4\uffff\5\13\3\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\17\uffff\11\13\11\uffff\1\13\7\uffff\3\13\1\uffff\10\13"
         + "\1\uffff\3\13\1\uffff\27\13\1\uffff\12\13\1\uffff\5\13\4\uffff"
         + "\7\13\1\uffff\3\13\1\uffff\4\13\7\uffff\2\13\11\uffff\2\13\4"
         + "\uffff\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff"
         + "\27\13\1\uffff\12\13\1\uffff\5\13\2\uffff\11\13\1\uffff\3\13"
         + "\1\uffff\4\13\7\uffff\2\13\7\uffff\1\13\1\uffff\2\13\4\uffff"
         + "\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff\27\13"
         + "\1\uffff\20\13\4\uffff\6\13\2\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\10\uffff\2\13\4\uffff\12\13\22\uffff\2\13\1\uffff\22\13"
         + "\3\uffff\30\13\1\uffff\11\13\1\uffff\1\13\2\uffff\7\13\3\uffff"
         + "\1\13\4\uffff\6\13\1\uffff\1\13\1\uffff\10\13\22\uffff\2\13"
         + "\15\uffff\72\13\4\uffff\20\13\1\uffff\12\13\47\uffff\2\13\1"
         + "\uffff\1\13\2\uffff\2\13\1\uffff\1\13\2\uffff\1\13\6\uffff\4"
         + "\13\1\uffff\7\13\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff"
         + "\2\13\1\uffff\15\13\1\uffff\3\13\2\uffff\5\13\1\uffff\1\13\1"
         + "\uffff\6\13\2\uffff\12\13\2\uffff\2\13\42\uffff\1\13\27\uffff"
         + "\2\13\6\uffff\12\13\13\uffff\1\13\1\uffff\1\13\1\uffff\1\13"
         + "\4\uffff\12\13\1\uffff\42\13\6\uffff\24\13\1\uffff\6\13\4\uffff"
         + "\10\13\1\uffff\44\13\11\uffff\1\13\71\uffff\42\13\1\uffff\5"
         + "\13\1\uffff\2\13\1\uffff\7\13\3\uffff\4\13\6\uffff\12\13\6\uffff"
         + "\12\13\106\uffff\46\13\12\uffff\51\13\7\uffff\132\13\5\uffff"
         + "\104\13\5\uffff\122\13\6\uffff\7\13\1\uffff\77\13\1\uffff\1"
         + "\13\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\47\13\1\uffff\1\13\1\uffff\4\13\2\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\7\13\1\uffff\7\13\1\uffff\27\13\1\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\47\13\1\uffff\23\13\16\uffff"
         + "\11\13\56\uffff\125\13\14\uffff\u026c\13\2\uffff\10\13\12\uffff"
         + "\32\13\5\uffff\113\13\3\uffff\3\13\17\uffff\15\13\1\uffff\7"
         + "\13\13\uffff\25\13\13\uffff\24\13\14\uffff\15\13\1\uffff\3\13"
         + "\1\uffff\2\13\14\uffff\124\13\3\uffff\1\13\3\uffff\3\13\2\uffff"
         + "\12\13\41\uffff\3\13\2\uffff\12\13\6\uffff\130\13\10\uffff\52"
         + "\13\126\uffff\35\13\3\uffff\14\13\4\uffff\14\13\12\uffff\50"
         + "\13\2\uffff\5\13\u038b\uffff\154\13\u0094\uffff\u009c\13\4\uffff"
         + "\132\13\6\uffff\26\13\2\uffff\6\13\2\uffff\46\13\2\uffff\6\13"
         + "\2\uffff\10\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff"
         + "\37\13\2\uffff\65\13\1\uffff\7\13\1\uffff\1\13\3\uffff\3\13"
         + "\1\uffff\7\13\3\uffff\4\13\2\uffff\6\13\4\uffff\15\13\5\uffff"
         + "\3\13\1\uffff\7\13\17\uffff\4\13\32\uffff\5\13\20\uffff\2\13"
         + "\23\uffff\1\13\13\uffff\4\13\6\uffff\6\13\1\uffff\1\13\15\uffff"
         + "\1\13\40\uffff\22\13\36\uffff\15\13\4\uffff\1\13\3\uffff\6\13"
         + "\27\uffff\1\13\4\uffff\1\13\2\uffff\12\13\1\uffff\1\13\3\uffff"
         + "\5\13\6\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1"
         + "\uffff\3\13\1\uffff\7\13\3\uffff\3\13\5\uffff\5\13\26\uffff"
         + "\44\13\u0e81\uffff\3\13\31\uffff\17\13\1\uffff\5\13\2\uffff"
         + "\5\13\4\uffff\126\13\2\uffff\2\13\2\uffff\3\13\1\uffff\137\13"
         + "\5\uffff\50\13\4\uffff\136\13\21\uffff\30\13\70\uffff\20\13"
         + "\u0200\uffff\u19b6\13\112\uffff\u51a6\13\132\uffff\u048d\13"
         + "\u0773\uffff\u2ba4\13\134\uffff\u0400\13\u1d00\uffff\u012e\13"
         + "\2\uffff\73\13\u0095\uffff\7\13\14\uffff\5\13\5\uffff\14\13"
         + "\1\uffff\15\13\1\uffff\5\13\1\uffff\1\13\1\uffff\2\13\1\uffff"
         + "\2\13\1\uffff\154\13\41\uffff\u016b\13\22\uffff\100\13\2\uffff"
         + "\66\13\50\uffff\15\13\3\uffff\20\13\20\uffff\4\13\17\uffff\2"
         + "\13\30\uffff\3\13\31\uffff\1\13\6\uffff\5\13\1\uffff\u0087\13"
         + "\2\uffff\1\13\4\uffff\1\13\13\uffff\12\13\7\uffff\32\13\4\uffff"
         + "\1\13\1\uffff\32\13\12\uffff\132\13\3\uffff\6\13\2\uffff\6\13"
         + "\2\uffff\6\13\2\uffff\3\13\3\uffff\2\13\3\uffff\2\13\22\uffff" + "\3\13",
      "\1\102",
      "\11\13\5\uffff\16\13\10\uffff\1\13\13\uffff\12\13\7\uffff"
         + "\32\13\4\uffff\1\13\1\uffff\32\13\4\uffff\41\13\2\uffff\4\13"
         + "\4\uffff\1\13\2\uffff\1\13\7\uffff\1\13\4\uffff\1\13\5\uffff"
         + "\27\13\1\uffff\37\13\1\uffff\u013f\13\31\uffff\162\13\4\uffff"
         + "\14\13\16\uffff\5\13\11\uffff\1\13\21\uffff\130\13\5\uffff\23"
         + "\13\12\uffff\1\13\13\uffff\1\13\1\uffff\3\13\1\uffff\1\13\1"
         + "\uffff\24\13\1\uffff\54\13\1\uffff\46\13\1\uffff\5\13\4\uffff"
         + "\u0082\13\1\uffff\4\13\3\uffff\105\13\1\uffff\46\13\2\uffff"
         + "\2\13\6\uffff\20\13\41\uffff\46\13\2\uffff\1\13\7\uffff\47\13"
         + "\11\uffff\21\13\1\uffff\27\13\1\uffff\3\13\1\uffff\1\13\1\uffff"
         + "\2\13\1\uffff\1\13\13\uffff\33\13\5\uffff\3\13\15\uffff\4\13"
         + "\14\uffff\6\13\13\uffff\32\13\5\uffff\31\13\7\uffff\12\13\4"
         + "\uffff\146\13\1\uffff\11\13\1\uffff\12\13\1\uffff\23\13\2\uffff"
         + "\1\13\17\uffff\74\13\2\uffff\3\13\60\uffff\62\13\u014f\uffff"
         + "\71\13\2\uffff\22\13\2\uffff\5\13\3\uffff\14\13\2\uffff\12\13"
         + "\21\uffff\3\13\1\uffff\10\13\2\uffff\2\13\2\uffff\26\13\1\uffff"
         + "\7\13\1\uffff\1\13\3\uffff\4\13\2\uffff\11\13\2\uffff\2\13\2"
         + "\uffff\3\13\11\uffff\1\13\4\uffff\2\13\1\uffff\5\13\2\uffff"
         + "\16\13\15\uffff\3\13\1\uffff\6\13\4\uffff\2\13\2\uffff\26\13"
         + "\1\uffff\7\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff"
         + "\1\13\1\uffff\5\13\4\uffff\2\13\2\uffff\3\13\13\uffff\4\13\1"
         + "\uffff\1\13\7\uffff\17\13\14\uffff\3\13\1\uffff\11\13\1\uffff"
         + "\3\13\1\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff\5\13\2"
         + "\uffff\12\13\1\uffff\3\13\1\uffff\3\13\2\uffff\1\13\17\uffff"
         + "\4\13\2\uffff\12\13\1\uffff\1\13\17\uffff\3\13\1\uffff\10\13"
         + "\2\uffff\2\13\2\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff"
         + "\5\13\2\uffff\10\13\3\uffff\2\13\2\uffff\3\13\10\uffff\2\13"
         + "\4\uffff\2\13\1\uffff\3\13\4\uffff\12\13\1\uffff\1\13\20\uffff"
         + "\2\13\1\uffff\6\13\3\uffff\3\13\1\uffff\4\13\3\uffff\2\13\1"
         + "\uffff\1\13\1\uffff\2\13\3\uffff\2\13\3\uffff\3\13\3\uffff\10"
         + "\13\1\uffff\3\13\4\uffff\5\13\3\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\17\uffff\11\13\11\uffff\1\13\7\uffff\3\13\1\uffff\10\13"
         + "\1\uffff\3\13\1\uffff\27\13\1\uffff\12\13\1\uffff\5\13\4\uffff"
         + "\7\13\1\uffff\3\13\1\uffff\4\13\7\uffff\2\13\11\uffff\2\13\4"
         + "\uffff\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff"
         + "\27\13\1\uffff\12\13\1\uffff\5\13\2\uffff\11\13\1\uffff\3\13"
         + "\1\uffff\4\13\7\uffff\2\13\7\uffff\1\13\1\uffff\2\13\4\uffff"
         + "\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff\27\13"
         + "\1\uffff\20\13\4\uffff\6\13\2\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\10\uffff\2\13\4\uffff\12\13\22\uffff\2\13\1\uffff\22\13"
         + "\3\uffff\30\13\1\uffff\11\13\1\uffff\1\13\2\uffff\7\13\3\uffff"
         + "\1\13\4\uffff\6\13\1\uffff\1\13\1\uffff\10\13\22\uffff\2\13"
         + "\15\uffff\72\13\4\uffff\20\13\1\uffff\12\13\47\uffff\2\13\1"
         + "\uffff\1\13\2\uffff\2\13\1\uffff\1\13\2\uffff\1\13\6\uffff\4"
         + "\13\1\uffff\7\13\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff"
         + "\2\13\1\uffff\15\13\1\uffff\3\13\2\uffff\5\13\1\uffff\1\13\1"
         + "\uffff\6\13\2\uffff\12\13\2\uffff\2\13\42\uffff\1\13\27\uffff"
         + "\2\13\6\uffff\12\13\13\uffff\1\13\1\uffff\1\13\1\uffff\1\13"
         + "\4\uffff\12\13\1\uffff\42\13\6\uffff\24\13\1\uffff\6\13\4\uffff"
         + "\10\13\1\uffff\44\13\11\uffff\1\13\71\uffff\42\13\1\uffff\5"
         + "\13\1\uffff\2\13\1\uffff\7\13\3\uffff\4\13\6\uffff\12\13\6\uffff"
         + "\12\13\106\uffff\46\13\12\uffff\51\13\7\uffff\132\13\5\uffff"
         + "\104\13\5\uffff\122\13\6\uffff\7\13\1\uffff\77\13\1\uffff\1"
         + "\13\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\47\13\1\uffff\1\13\1\uffff\4\13\2\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\7\13\1\uffff\7\13\1\uffff\27\13\1\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\47\13\1\uffff\23\13\16\uffff"
         + "\11\13\56\uffff\125\13\14\uffff\u026c\13\2\uffff\10\13\12\uffff"
         + "\32\13\5\uffff\113\13\3\uffff\3\13\17\uffff\15\13\1\uffff\7"
         + "\13\13\uffff\25\13\13\uffff\24\13\14\uffff\15\13\1\uffff\3\13"
         + "\1\uffff\2\13\14\uffff\124\13\3\uffff\1\13\3\uffff\3\13\2\uffff"
         + "\12\13\41\uffff\3\13\2\uffff\12\13\6\uffff\130\13\10\uffff\52"
         + "\13\126\uffff\35\13\3\uffff\14\13\4\uffff\14\13\12\uffff\50"
         + "\13\2\uffff\5\13\u038b\uffff\154\13\u0094\uffff\u009c\13\4\uffff"
         + "\132\13\6\uffff\26\13\2\uffff\6\13\2\uffff\46\13\2\uffff\6\13"
         + "\2\uffff\10\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff"
         + "\37\13\2\uffff\65\13\1\uffff\7\13\1\uffff\1\13\3\uffff\3\13"
         + "\1\uffff\7\13\3\uffff\4\13\2\uffff\6\13\4\uffff\15\13\5\uffff"
         + "\3\13\1\uffff\7\13\17\uffff\4\13\32\uffff\5\13\20\uffff\2\13"
         + "\23\uffff\1\13\13\uffff\4\13\6\uffff\6\13\1\uffff\1\13\15\uffff"
         + "\1\13\40\uffff\22\13\36\uffff\15\13\4\uffff\1\13\3\uffff\6\13"
         + "\27\uffff\1\13\4\uffff\1\13\2\uffff\12\13\1\uffff\1\13\3\uffff"
         + "\5\13\6\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1"
         + "\uffff\3\13\1\uffff\7\13\3\uffff\3\13\5\uffff\5\13\26\uffff"
         + "\44\13\u0e81\uffff\3\13\31\uffff\17\13\1\uffff\5\13\2\uffff"
         + "\5\13\4\uffff\126\13\2\uffff\2\13\2\uffff\3\13\1\uffff\137\13"
         + "\5\uffff\50\13\4\uffff\136\13\21\uffff\30\13\70\uffff\20\13"
         + "\u0200\uffff\u19b6\13\112\uffff\u51a6\13\132\uffff\u048d\13"
         + "\u0773\uffff\u2ba4\13\134\uffff\u0400\13\u1d00\uffff\u012e\13"
         + "\2\uffff\73\13\u0095\uffff\7\13\14\uffff\5\13\5\uffff\14\13"
         + "\1\uffff\15\13\1\uffff\5\13\1\uffff\1\13\1\uffff\2\13\1\uffff"
         + "\2\13\1\uffff\154\13\41\uffff\u016b\13\22\uffff\100\13\2\uffff"
         + "\66\13\50\uffff\15\13\3\uffff\20\13\20\uffff\4\13\17\uffff\2"
         + "\13\30\uffff\3\13\31\uffff\1\13\6\uffff\5\13\1\uffff\u0087\13"
         + "\2\uffff\1\13\4\uffff\1\13\13\uffff\12\13\7\uffff\32\13\4\uffff"
         + "\1\13\1\uffff\32\13\12\uffff\132\13\3\uffff\6\13\2\uffff\6\13"
         + "\2\uffff\6\13\2\uffff\3\13\3\uffff\2\13\3\uffff\2\13\22\uffff" + "\3\13",
      "\1\104",
      "\1\35\1\uffff\12\72\7\uffff\6\72\11\uffff\1\35\16\uffff\1" + "\73\1\uffff\6\72\11\uffff\1\35",
      "\12\74\7\uffff\6\74\30\uffff\1\73\1\uffff\6\74",
      "\1\35\1\uffff\12\74\7\uffff\6\74\11\uffff\1\35\16\uffff\1" + "\73\1\uffff\6\74\11\uffff\1\35",
      "\1\5\1\uffff\10\75\2\5\12\uffff\3\5\30\uffff\1\76\4\uffff" + "\3\5",
      "\10\75\2\5\45\uffff\1\76",
      "\1\5\1\uffff\12\77\12\uffff\3\5\30\uffff\1\100\4\uffff\3\5",
      "\12\77\45\uffff\1\100",
      "",
      "\11\13\5\uffff\16\13\10\uffff\1\13\13\uffff\12\13\7\uffff"
         + "\32\13\4\uffff\1\13\1\uffff\32\13\4\uffff\41\13\2\uffff\4\13"
         + "\4\uffff\1\13\2\uffff\1\13\7\uffff\1\13\4\uffff\1\13\5\uffff"
         + "\27\13\1\uffff\37\13\1\uffff\u013f\13\31\uffff\162\13\4\uffff"
         + "\14\13\16\uffff\5\13\11\uffff\1\13\21\uffff\130\13\5\uffff\23"
         + "\13\12\uffff\1\13\13\uffff\1\13\1\uffff\3\13\1\uffff\1\13\1"
         + "\uffff\24\13\1\uffff\54\13\1\uffff\46\13\1\uffff\5\13\4\uffff"
         + "\u0082\13\1\uffff\4\13\3\uffff\105\13\1\uffff\46\13\2\uffff"
         + "\2\13\6\uffff\20\13\41\uffff\46\13\2\uffff\1\13\7\uffff\47\13"
         + "\11\uffff\21\13\1\uffff\27\13\1\uffff\3\13\1\uffff\1\13\1\uffff"
         + "\2\13\1\uffff\1\13\13\uffff\33\13\5\uffff\3\13\15\uffff\4\13"
         + "\14\uffff\6\13\13\uffff\32\13\5\uffff\31\13\7\uffff\12\13\4"
         + "\uffff\146\13\1\uffff\11\13\1\uffff\12\13\1\uffff\23\13\2\uffff"
         + "\1\13\17\uffff\74\13\2\uffff\3\13\60\uffff\62\13\u014f\uffff"
         + "\71\13\2\uffff\22\13\2\uffff\5\13\3\uffff\14\13\2\uffff\12\13"
         + "\21\uffff\3\13\1\uffff\10\13\2\uffff\2\13\2\uffff\26\13\1\uffff"
         + "\7\13\1\uffff\1\13\3\uffff\4\13\2\uffff\11\13\2\uffff\2\13\2"
         + "\uffff\3\13\11\uffff\1\13\4\uffff\2\13\1\uffff\5\13\2\uffff"
         + "\16\13\15\uffff\3\13\1\uffff\6\13\4\uffff\2\13\2\uffff\26\13"
         + "\1\uffff\7\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff"
         + "\1\13\1\uffff\5\13\4\uffff\2\13\2\uffff\3\13\13\uffff\4\13\1"
         + "\uffff\1\13\7\uffff\17\13\14\uffff\3\13\1\uffff\11\13\1\uffff"
         + "\3\13\1\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff\5\13\2"
         + "\uffff\12\13\1\uffff\3\13\1\uffff\3\13\2\uffff\1\13\17\uffff"
         + "\4\13\2\uffff\12\13\1\uffff\1\13\17\uffff\3\13\1\uffff\10\13"
         + "\2\uffff\2\13\2\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff"
         + "\5\13\2\uffff\10\13\3\uffff\2\13\2\uffff\3\13\10\uffff\2\13"
         + "\4\uffff\2\13\1\uffff\3\13\4\uffff\12\13\1\uffff\1\13\20\uffff"
         + "\2\13\1\uffff\6\13\3\uffff\3\13\1\uffff\4\13\3\uffff\2\13\1"
         + "\uffff\1\13\1\uffff\2\13\3\uffff\2\13\3\uffff\3\13\3\uffff\10"
         + "\13\1\uffff\3\13\4\uffff\5\13\3\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\17\uffff\11\13\11\uffff\1\13\7\uffff\3\13\1\uffff\10\13"
         + "\1\uffff\3\13\1\uffff\27\13\1\uffff\12\13\1\uffff\5\13\4\uffff"
         + "\7\13\1\uffff\3\13\1\uffff\4\13\7\uffff\2\13\11\uffff\2\13\4"
         + "\uffff\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff"
         + "\27\13\1\uffff\12\13\1\uffff\5\13\2\uffff\11\13\1\uffff\3\13"
         + "\1\uffff\4\13\7\uffff\2\13\7\uffff\1\13\1\uffff\2\13\4\uffff"
         + "\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff\27\13"
         + "\1\uffff\20\13\4\uffff\6\13\2\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\10\uffff\2\13\4\uffff\12\13\22\uffff\2\13\1\uffff\22\13"
         + "\3\uffff\30\13\1\uffff\11\13\1\uffff\1\13\2\uffff\7\13\3\uffff"
         + "\1\13\4\uffff\6\13\1\uffff\1\13\1\uffff\10\13\22\uffff\2\13"
         + "\15\uffff\72\13\4\uffff\20\13\1\uffff\12\13\47\uffff\2\13\1"
         + "\uffff\1\13\2\uffff\2\13\1\uffff\1\13\2\uffff\1\13\6\uffff\4"
         + "\13\1\uffff\7\13\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff"
         + "\2\13\1\uffff\15\13\1\uffff\3\13\2\uffff\5\13\1\uffff\1\13\1"
         + "\uffff\6\13\2\uffff\12\13\2\uffff\2\13\42\uffff\1\13\27\uffff"
         + "\2\13\6\uffff\12\13\13\uffff\1\13\1\uffff\1\13\1\uffff\1\13"
         + "\4\uffff\12\13\1\uffff\42\13\6\uffff\24\13\1\uffff\6\13\4\uffff"
         + "\10\13\1\uffff\44\13\11\uffff\1\13\71\uffff\42\13\1\uffff\5"
         + "\13\1\uffff\2\13\1\uffff\7\13\3\uffff\4\13\6\uffff\12\13\6\uffff"
         + "\12\13\106\uffff\46\13\12\uffff\51\13\7\uffff\132\13\5\uffff"
         + "\104\13\5\uffff\122\13\6\uffff\7\13\1\uffff\77\13\1\uffff\1"
         + "\13\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\47\13\1\uffff\1\13\1\uffff\4\13\2\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\7\13\1\uffff\7\13\1\uffff\27\13\1\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\47\13\1\uffff\23\13\16\uffff"
         + "\11\13\56\uffff\125\13\14\uffff\u026c\13\2\uffff\10\13\12\uffff"
         + "\32\13\5\uffff\113\13\3\uffff\3\13\17\uffff\15\13\1\uffff\7"
         + "\13\13\uffff\25\13\13\uffff\24\13\14\uffff\15\13\1\uffff\3\13"
         + "\1\uffff\2\13\14\uffff\124\13\3\uffff\1\13\3\uffff\3\13\2\uffff"
         + "\12\13\41\uffff\3\13\2\uffff\12\13\6\uffff\130\13\10\uffff\52"
         + "\13\126\uffff\35\13\3\uffff\14\13\4\uffff\14\13\12\uffff\50"
         + "\13\2\uffff\5\13\u038b\uffff\154\13\u0094\uffff\u009c\13\4\uffff"
         + "\132\13\6\uffff\26\13\2\uffff\6\13\2\uffff\46\13\2\uffff\6\13"
         + "\2\uffff\10\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff"
         + "\37\13\2\uffff\65\13\1\uffff\7\13\1\uffff\1\13\3\uffff\3\13"
         + "\1\uffff\7\13\3\uffff\4\13\2\uffff\6\13\4\uffff\15\13\5\uffff"
         + "\3\13\1\uffff\7\13\17\uffff\4\13\32\uffff\5\13\20\uffff\2\13"
         + "\23\uffff\1\13\13\uffff\4\13\6\uffff\6\13\1\uffff\1\13\15\uffff"
         + "\1\13\40\uffff\22\13\36\uffff\15\13\4\uffff\1\13\3\uffff\6\13"
         + "\27\uffff\1\13\4\uffff\1\13\2\uffff\12\13\1\uffff\1\13\3\uffff"
         + "\5\13\6\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1"
         + "\uffff\3\13\1\uffff\7\13\3\uffff\3\13\5\uffff\5\13\26\uffff"
         + "\44\13\u0e81\uffff\3\13\31\uffff\17\13\1\uffff\5\13\2\uffff"
         + "\5\13\4\uffff\126\13\2\uffff\2\13\2\uffff\3\13\1\uffff\137\13"
         + "\5\uffff\50\13\4\uffff\136\13\21\uffff\30\13\70\uffff\20\13"
         + "\u0200\uffff\u19b6\13\112\uffff\u51a6\13\132\uffff\u048d\13"
         + "\u0773\uffff\u2ba4\13\134\uffff\u0400\13\u1d00\uffff\u012e\13"
         + "\2\uffff\73\13\u0095\uffff\7\13\14\uffff\5\13\5\uffff\14\13"
         + "\1\uffff\15\13\1\uffff\5\13\1\uffff\1\13\1\uffff\2\13\1\uffff"
         + "\2\13\1\uffff\154\13\41\uffff\u016b\13\22\uffff\100\13\2\uffff"
         + "\66\13\50\uffff\15\13\3\uffff\20\13\20\uffff\4\13\17\uffff\2"
         + "\13\30\uffff\3\13\31\uffff\1\13\6\uffff\5\13\1\uffff\u0087\13"
         + "\2\uffff\1\13\4\uffff\1\13\13\uffff\12\13\7\uffff\32\13\4\uffff"
         + "\1\13\1\uffff\32\13\12\uffff\132\13\3\uffff\6\13\2\uffff\6\13"
         + "\2\uffff\6\13\2\uffff\3\13\3\uffff\2\13\3\uffff\2\13\22\uffff" + "\3\13",
      "",
      "\11\13\5\uffff\16\13\10\uffff\1\13\13\uffff\12\13\7\uffff"
         + "\32\13\4\uffff\1\13\1\uffff\32\13\4\uffff\41\13\2\uffff\4\13"
         + "\4\uffff\1\13\2\uffff\1\13\7\uffff\1\13\4\uffff\1\13\5\uffff"
         + "\27\13\1\uffff\37\13\1\uffff\u013f\13\31\uffff\162\13\4\uffff"
         + "\14\13\16\uffff\5\13\11\uffff\1\13\21\uffff\130\13\5\uffff\23"
         + "\13\12\uffff\1\13\13\uffff\1\13\1\uffff\3\13\1\uffff\1\13\1"
         + "\uffff\24\13\1\uffff\54\13\1\uffff\46\13\1\uffff\5\13\4\uffff"
         + "\u0082\13\1\uffff\4\13\3\uffff\105\13\1\uffff\46\13\2\uffff"
         + "\2\13\6\uffff\20\13\41\uffff\46\13\2\uffff\1\13\7\uffff\47\13"
         + "\11\uffff\21\13\1\uffff\27\13\1\uffff\3\13\1\uffff\1\13\1\uffff"
         + "\2\13\1\uffff\1\13\13\uffff\33\13\5\uffff\3\13\15\uffff\4\13"
         + "\14\uffff\6\13\13\uffff\32\13\5\uffff\31\13\7\uffff\12\13\4"
         + "\uffff\146\13\1\uffff\11\13\1\uffff\12\13\1\uffff\23\13\2\uffff"
         + "\1\13\17\uffff\74\13\2\uffff\3\13\60\uffff\62\13\u014f\uffff"
         + "\71\13\2\uffff\22\13\2\uffff\5\13\3\uffff\14\13\2\uffff\12\13"
         + "\21\uffff\3\13\1\uffff\10\13\2\uffff\2\13\2\uffff\26\13\1\uffff"
         + "\7\13\1\uffff\1\13\3\uffff\4\13\2\uffff\11\13\2\uffff\2\13\2"
         + "\uffff\3\13\11\uffff\1\13\4\uffff\2\13\1\uffff\5\13\2\uffff"
         + "\16\13\15\uffff\3\13\1\uffff\6\13\4\uffff\2\13\2\uffff\26\13"
         + "\1\uffff\7\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\2\uffff"
         + "\1\13\1\uffff\5\13\4\uffff\2\13\2\uffff\3\13\13\uffff\4\13\1"
         + "\uffff\1\13\7\uffff\17\13\14\uffff\3\13\1\uffff\11\13\1\uffff"
         + "\3\13\1\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff\5\13\2"
         + "\uffff\12\13\1\uffff\3\13\1\uffff\3\13\2\uffff\1\13\17\uffff"
         + "\4\13\2\uffff\12\13\1\uffff\1\13\17\uffff\3\13\1\uffff\10\13"
         + "\2\uffff\2\13\2\uffff\26\13\1\uffff\7\13\1\uffff\2\13\1\uffff"
         + "\5\13\2\uffff\10\13\3\uffff\2\13\2\uffff\3\13\10\uffff\2\13"
         + "\4\uffff\2\13\1\uffff\3\13\4\uffff\12\13\1\uffff\1\13\20\uffff"
         + "\2\13\1\uffff\6\13\3\uffff\3\13\1\uffff\4\13\3\uffff\2\13\1"
         + "\uffff\1\13\1\uffff\2\13\3\uffff\2\13\3\uffff\3\13\3\uffff\10"
         + "\13\1\uffff\3\13\4\uffff\5\13\3\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\17\uffff\11\13\11\uffff\1\13\7\uffff\3\13\1\uffff\10\13"
         + "\1\uffff\3\13\1\uffff\27\13\1\uffff\12\13\1\uffff\5\13\4\uffff"
         + "\7\13\1\uffff\3\13\1\uffff\4\13\7\uffff\2\13\11\uffff\2\13\4"
         + "\uffff\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff"
         + "\27\13\1\uffff\12\13\1\uffff\5\13\2\uffff\11\13\1\uffff\3\13"
         + "\1\uffff\4\13\7\uffff\2\13\7\uffff\1\13\1\uffff\2\13\4\uffff"
         + "\12\13\22\uffff\2\13\1\uffff\10\13\1\uffff\3\13\1\uffff\27\13"
         + "\1\uffff\20\13\4\uffff\6\13\2\uffff\3\13\1\uffff\4\13\11\uffff"
         + "\1\13\10\uffff\2\13\4\uffff\12\13\22\uffff\2\13\1\uffff\22\13"
         + "\3\uffff\30\13\1\uffff\11\13\1\uffff\1\13\2\uffff\7\13\3\uffff"
         + "\1\13\4\uffff\6\13\1\uffff\1\13\1\uffff\10\13\22\uffff\2\13"
         + "\15\uffff\72\13\4\uffff\20\13\1\uffff\12\13\47\uffff\2\13\1"
         + "\uffff\1\13\2\uffff\2\13\1\uffff\1\13\2\uffff\1\13\6\uffff\4"
         + "\13\1\uffff\7\13\1\uffff\3\13\1\uffff\1\13\1\uffff\1\13\2\uffff"
         + "\2\13\1\uffff\15\13\1\uffff\3\13\2\uffff\5\13\1\uffff\1\13\1"
         + "\uffff\6\13\2\uffff\12\13\2\uffff\2\13\42\uffff\1\13\27\uffff"
         + "\2\13\6\uffff\12\13\13\uffff\1\13\1\uffff\1\13\1\uffff\1\13"
         + "\4\uffff\12\13\1\uffff\42\13\6\uffff\24\13\1\uffff\6\13\4\uffff"
         + "\10\13\1\uffff\44\13\11\uffff\1\13\71\uffff\42\13\1\uffff\5"
         + "\13\1\uffff\2\13\1\uffff\7\13\3\uffff\4\13\6\uffff\12\13\6\uffff"
         + "\12\13\106\uffff\46\13\12\uffff\51\13\7\uffff\132\13\5\uffff"
         + "\104\13\5\uffff\122\13\6\uffff\7\13\1\uffff\77\13\1\uffff\1"
         + "\13\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\47\13\1\uffff\1\13\1\uffff\4\13\2\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\1\13\1\uffff\4\13\2\uffff"
         + "\7\13\1\uffff\7\13\1\uffff\27\13\1\uffff\37\13\1\uffff\1\13"
         + "\1\uffff\4\13\2\uffff\7\13\1\uffff\47\13\1\uffff\23\13\16\uffff"
         + "\11\13\56\uffff\125\13\14\uffff\u026c\13\2\uffff\10\13\12\uffff"
         + "\32\13\5\uffff\113\13\3\uffff\3\13\17\uffff\15\13\1\uffff\7"
         + "\13\13\uffff\25\13\13\uffff\24\13\14\uffff\15\13\1\uffff\3\13"
         + "\1\uffff\2\13\14\uffff\124\13\3\uffff\1\13\3\uffff\3\13\2\uffff"
         + "\12\13\41\uffff\3\13\2\uffff\12\13\6\uffff\130\13\10\uffff\52"
         + "\13\126\uffff\35\13\3\uffff\14\13\4\uffff\14\13\12\uffff\50"
         + "\13\2\uffff\5\13\u038b\uffff\154\13\u0094\uffff\u009c\13\4\uffff"
         + "\132\13\6\uffff\26\13\2\uffff\6\13\2\uffff\46\13\2\uffff\6\13"
         + "\2\uffff\10\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff"
         + "\37\13\2\uffff\65\13\1\uffff\7\13\1\uffff\1\13\3\uffff\3\13"
         + "\1\uffff\7\13\3\uffff\4\13\2\uffff\6\13\4\uffff\15\13\5\uffff"
         + "\3\13\1\uffff\7\13\17\uffff\4\13\32\uffff\5\13\20\uffff\2\13"
         + "\23\uffff\1\13\13\uffff\4\13\6\uffff\6\13\1\uffff\1\13\15\uffff"
         + "\1\13\40\uffff\22\13\36\uffff\15\13\4\uffff\1\13\3\uffff\6\13"
         + "\27\uffff\1\13\4\uffff\1\13\2\uffff\12\13\1\uffff\1\13\3\uffff"
         + "\5\13\6\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\4\13\1"
         + "\uffff\3\13\1\uffff\7\13\3\uffff\3\13\5\uffff\5\13\26\uffff"
         + "\44\13\u0e81\uffff\3\13\31\uffff\17\13\1\uffff\5\13\2\uffff"
         + "\5\13\4\uffff\126\13\2\uffff\2\13\2\uffff\3\13\1\uffff\137\13"
         + "\5\uffff\50\13\4\uffff\136\13\21\uffff\30\13\70\uffff\20\13"
         + "\u0200\uffff\u19b6\13\112\uffff\u51a6\13\132\uffff\u048d\13"
         + "\u0773\uffff\u2ba4\13\134\uffff\u0400\13\u1d00\uffff\u012e\13"
         + "\2\uffff\73\13\u0095\uffff\7\13\14\uffff\5\13\5\uffff\14\13"
         + "\1\uffff\15\13\1\uffff\5\13\1\uffff\1\13\1\uffff\2\13\1\uffff"
         + "\2\13\1\uffff\154\13\41\uffff\u016b\13\22\uffff\100\13\2\uffff"
         + "\66\13\50\uffff\15\13\3\uffff\20\13\20\uffff\4\13\17\uffff\2"
         + "\13\30\uffff\3\13\31\uffff\1\13\6\uffff\5\13\1\uffff\u0087\13"
         + "\2\uffff\1\13\4\uffff\1\13\13\uffff\12\13\7\uffff\32\13\4\uffff"
         + "\1\13\1\uffff\32\13\12\uffff\132\13\3\uffff\6\13\2\uffff\6\13"
         + "\2\uffff\6\13\2\uffff\3\13\3\uffff\2\13\3\uffff\2\13\22\uffff" + "\3\13", "", "" };

   static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
   static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
   static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
   static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
   static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
   static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
   static final short[][] DFA47_transition;

   static {
      int numStates = DFA47_transitionS.length;
      DFA47_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
      }
   }

   class DFA47 extends DFA {

      public DFA47(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 47;
         this.eot = DFA47_eot;
         this.eof = DFA47_eof;
         this.min = DFA47_min;
         this.max = DFA47_max;
         this.accept = DFA47_accept;
         this.special = DFA47_special;
         this.transition = DFA47_transition;
      }

      public String getDescription() {
         return "1:1: Tokens : ( T__57 | T__58 | RULE_DECIMALINTEGERLITERAL | RULE_HEXINTEGERLITERAL | RULE_OCTALINTEGERLITERAL | RULE_BINARYINTEGERLITERAL | RULE_DECIMALFLOATINGPOINTLITERAL | RULE_HEXADECIMALFLOATINGPOINTLITERAL | RULE_TRUE | RULE_FALSE | RULE_CHARACTER | RULE_STRING | RULE_NULL | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
      }
   }


}