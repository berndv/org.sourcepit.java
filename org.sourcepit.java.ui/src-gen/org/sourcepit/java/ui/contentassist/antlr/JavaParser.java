/*
 * generated by Xtext
 */

package org.sourcepit.java.ui.contentassist.antlr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.sourcepit.java.services.JavaGrammarAccess;

import com.google.inject.Inject;

public class JavaParser extends AbstractContentAssistParser {

   @Inject
   private JavaGrammarAccess grammarAccess;

   private Map<AbstractElement, String> nameMappings;

   @Override
   protected org.sourcepit.java.ui.contentassist.antlr.internal.InternalJavaParser createParser() {
      org.sourcepit.java.ui.contentassist.antlr.internal.InternalJavaParser result = new org.sourcepit.java.ui.contentassist.antlr.internal.InternalJavaParser(
         null);
      result.setGrammarAccess(grammarAccess);
      return result;
   }

   @Override
   protected String getRuleName(AbstractElement element) {
      if (nameMappings == null) {
         nameMappings = new HashMap<AbstractElement, String>() {
            private static final long serialVersionUID = 1L;
            {
               put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
               put(grammarAccess.getIntegerLiteralAccess().getValueAlternatives_0(),
                  "rule__IntegerLiteral__ValueAlternatives_0");
               put(grammarAccess.getFloatingPointLiteralAccess().getValueAlternatives_0(),
                  "rule__FloatingPointLiteral__ValueAlternatives_0");
               put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0(),
                  "rule__BooleanLiteral__ValueAlternatives_0");
               put(grammarAccess.getModelAccess().getLiteralsAssignment(), "rule__Model__LiteralsAssignment");
               put(grammarAccess.getIntegerLiteralAccess().getValueAssignment(),
                  "rule__IntegerLiteral__ValueAssignment");
               put(grammarAccess.getFloatingPointLiteralAccess().getValueAssignment(),
                  "rule__FloatingPointLiteral__ValueAssignment");
               put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(),
                  "rule__BooleanLiteral__ValueAssignment");
               put(grammarAccess.getCharacterLiteralAccess().getValueAssignment(),
                  "rule__CharacterLiteral__ValueAssignment");
               put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
               put(grammarAccess.getNullLiteralAccess().getValueAssignment(), "rule__NullLiteral__ValueAssignment");
            }
         };
      }
      return nameMappings.get(element);
   }

   @Override
   protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
      try {
         org.sourcepit.java.ui.contentassist.antlr.internal.InternalJavaParser typedParser = (org.sourcepit.java.ui.contentassist.antlr.internal.InternalJavaParser) parser;
         typedParser.entryRuleModel();
         return typedParser.getFollowElements();
      }
      catch (RecognitionException ex) {
         throw new RuntimeException(ex);
      }
   }

   @Override
   protected String[] getInitialHiddenTokens() {
      return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
   }

   public JavaGrammarAccess getGrammarAccess() {
      return this.grammarAccess;
   }

   public void setGrammarAccess(JavaGrammarAccess grammarAccess) {
      this.grammarAccess = grammarAccess;
   }
}