
package org.sourcepit.java.type.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sourcepit.java.type.services.TypeGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class TypeSyntacticSequencer extends AbstractSyntacticSequencer {

   protected TypeGrammarAccess grammarAccess;
   protected AbstractElementAlias match_arrayInitializer_CommaKeyword_3_q;
   protected AbstractElementAlias match_classOrInterfaceType_FullStopKeyword_1_0_a;
   protected AbstractElementAlias match_classOrInterfaceType_FullStopKeyword_1_0_p;
   protected AbstractElementAlias match_elementValueArrayInitializer_CommaKeyword_3_q;
   protected AbstractElementAlias match_enumBody_CommaKeyword_3_q;
   protected AbstractElementAlias match_enumConstant___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
   protected AbstractElementAlias match_staticInitializer_StaticKeyword_0_q;
   protected AbstractElementAlias match_wildcardBounds_ExtendsKeyword_0_0_or_SuperKeyword_1_0;

   @Inject
   protected void init(IGrammarAccess access) {
      grammarAccess = (TypeGrammarAccess) access;
      match_arrayInitializer_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArrayInitializerAccess()
         .getCommaKeyword_3());
      match_classOrInterfaceType_FullStopKeyword_1_0_a = new TokenAlias(true, true,
         grammarAccess.getClassOrInterfaceTypeAccess().getFullStopKeyword_1_0());
      match_classOrInterfaceType_FullStopKeyword_1_0_p = new TokenAlias(true, false,
         grammarAccess.getClassOrInterfaceTypeAccess().getFullStopKeyword_1_0());
      match_elementValueArrayInitializer_CommaKeyword_3_q = new TokenAlias(false, true,
         grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_3());
      match_enumBody_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getEnumBodyAccess()
         .getCommaKeyword_3());
      match_enumConstant___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true,
         new TokenAlias(false, false, grammarAccess.getEnumConstantAccess().getLeftParenthesisKeyword_2_0()),
         new TokenAlias(false, false, grammarAccess.getEnumConstantAccess().getRightParenthesisKeyword_2_2()));
      match_staticInitializer_StaticKeyword_0_q = new TokenAlias(false, true,
         grammarAccess.getStaticInitializerAccess().getStaticKeyword_0());
      match_wildcardBounds_ExtendsKeyword_0_0_or_SuperKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(
         false, false, grammarAccess.getWildcardBoundsAccess().getExtendsKeyword_0_0()), new TokenAlias(false, false,
         grammarAccess.getWildcardBoundsAccess().getSuperKeyword_1_0()));
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
         if (match_arrayInitializer_CommaKeyword_3_q.equals(syntax))
            emit_arrayInitializer_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
         else if (match_classOrInterfaceType_FullStopKeyword_1_0_a.equals(syntax))
            emit_classOrInterfaceType_FullStopKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
         else if (match_classOrInterfaceType_FullStopKeyword_1_0_p.equals(syntax))
            emit_classOrInterfaceType_FullStopKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
         else if (match_elementValueArrayInitializer_CommaKeyword_3_q.equals(syntax))
            emit_elementValueArrayInitializer_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
         else if (match_enumBody_CommaKeyword_3_q.equals(syntax))
            emit_enumBody_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
         else if (match_enumConstant___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
            emit_enumConstant___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject,
               getLastNavigableState(), syntaxNodes);
         else if (match_staticInitializer_StaticKeyword_0_q.equals(syntax))
            emit_staticInitializer_StaticKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
         else if (match_wildcardBounds_ExtendsKeyword_0_0_or_SuperKeyword_1_0.equals(syntax))
            emit_wildcardBounds_ExtendsKeyword_0_0_or_SuperKeyword_1_0(semanticObject, getLastNavigableState(),
               syntaxNodes);
         else
            acceptNodes(getLastNavigableState(), syntaxNodes);
      }
   }

   /**
    * Syntax:
    * ','?
    */
   protected void emit_arrayInitializer_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition,
      List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * '.'*
    */
   protected void emit_classOrInterfaceType_FullStopKeyword_1_0_a(EObject semanticObject, ISynNavigable transition,
      List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * '.'+
    */
   protected void emit_classOrInterfaceType_FullStopKeyword_1_0_p(EObject semanticObject, ISynNavigable transition,
      List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * ','?
    */
   protected void emit_elementValueArrayInitializer_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition,
      List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * ','?
    */
   protected void emit_enumBody_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * ('(' ')')?
    */
   protected void emit_enumConstant___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject,
      ISynNavigable transition, List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * 'static'?
    */
   protected void emit_staticInitializer_StaticKeyword_0_q(EObject semanticObject, ISynNavigable transition,
      List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

   /**
    * Syntax:
    * 'extends' | 'super'
    */
   protected void emit_wildcardBounds_ExtendsKeyword_0_0_or_SuperKeyword_1_0(EObject semanticObject,
      ISynNavigable transition, List<INode> nodes) {
      acceptNodes(transition, nodes);
   }

}
