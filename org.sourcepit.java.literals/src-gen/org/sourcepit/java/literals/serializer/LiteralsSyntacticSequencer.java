
package org.sourcepit.java.literals.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class LiteralsSyntacticSequencer extends AbstractSyntacticSequencer {

   protected LiteralsGrammarAccess grammarAccess;

   @Inject
   protected void init(IGrammarAccess access) {
      grammarAccess = (LiteralsGrammarAccess) access;
   }

   @Override
   protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
      if (ruleCall.getRule() == grammarAccess.getIdentifierRule())
         return getIdentifierToken(semanticObject, ruleCall, node);
      return "";
   }

   /**
    * terminal Identifier:
    * JavaLetter JavaLetterOrDigit*;
    */
   protected String getIdentifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
      if (node != null)
         return getTokenText(node);
      return "$";
   }

   @Override
   protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
      if (transition.getAmbiguousSyntaxes().isEmpty())
         return;
      List<INode> transitionNodes = collectNodes(fromNode, toNode);
      for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
         List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
         acceptNodes(getLastNavigableState(), syntaxNodes);
      }
   }

}
