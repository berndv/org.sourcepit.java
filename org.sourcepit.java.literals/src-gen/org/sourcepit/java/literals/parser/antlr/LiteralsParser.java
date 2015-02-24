/*
 * generated by Xtext
 */

package org.sourcepit.java.literals.parser.antlr;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

import com.google.inject.Inject;

public class LiteralsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {

   @Inject
   private LiteralsGrammarAccess grammarAccess;

   @Override
   protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
      tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
   }

   @Override
   protected org.sourcepit.java.literals.parser.antlr.internal.InternalLiteralsParser createParser(
      XtextTokenStream stream) {
      return new org.sourcepit.java.literals.parser.antlr.internal.InternalLiteralsParser(stream, getGrammarAccess());
   }

   @Override
   protected String getDefaultRuleName() {
      return "Foo";
   }

   public LiteralsGrammarAccess getGrammarAccess() {
      return this.grammarAccess;
   }

   public void setGrammarAccess(LiteralsGrammarAccess grammarAccess) {
      this.grammarAccess = grammarAccess;
   }

}
