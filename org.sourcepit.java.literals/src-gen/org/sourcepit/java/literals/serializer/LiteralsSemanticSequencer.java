
package org.sourcepit.java.literals.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.sourcepit.java.literals.literals.BooleanLiteral;
import org.sourcepit.java.literals.literals.CharacterLiteral;
import org.sourcepit.java.literals.literals.FloatingPointLiteral;
import org.sourcepit.java.literals.literals.IntegerLiteral;
import org.sourcepit.java.literals.literals.LiteralsPackage;
import org.sourcepit.java.literals.literals.NullLiteral;
import org.sourcepit.java.literals.literals.StringLiteral;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class LiteralsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

   @Inject
   private LiteralsGrammarAccess grammarAccess;

   public void createSequence(EObject context, EObject semanticObject) {
      if (semanticObject.eClass().getEPackage() == LiteralsPackage.eINSTANCE)
         switch (semanticObject.eClass().getClassifierID()) {
            case LiteralsPackage.BOOLEAN_LITERAL :
               if (context == grammarAccess.getBooleanLiteralRule() || context == grammarAccess.getFooRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.CHARACTER_LITERAL :
               if (context == grammarAccess.getCharacterLiteralRule() || context == grammarAccess.getFooRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_CharacterLiteral(context, (CharacterLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.FLOATING_POINT_LITERAL :
               if (context == grammarAccess.getFloatingPointLiteralRule() || context == grammarAccess.getFooRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_FloatingPointLiteral(context, (FloatingPointLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.INTEGER_LITERAL :
               if (context == grammarAccess.getFooRule() || context == grammarAccess.getIntegerLiteralRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.NULL_LITERAL :
               if (context == grammarAccess.getFooRule() || context == grammarAccess.getNullLiteralRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_NullLiteral(context, (NullLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.STRING_LITERAL :
               if (context == grammarAccess.getFooRule() || context == grammarAccess.getStringLiteralRule()
                  || context == grammarAccess.getLiteralRule()) {
                  sequence_StringLiteral(context, (StringLiteral) semanticObject);
                  return;
               }
               else
                  break;
         }
      if (errorAcceptor != null)
         errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
   }

   /**
    * Constraint:
    * (value=TRUE | value=FALSE)
    */
   protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * value=CHARACTER
    */
   protected void sequence_CharacterLiteral(EObject context, CharacterLiteral semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, LiteralsPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               LiteralsPackage.Literals.LITERAL__VALUE));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getCharacterLiteralAccess().getValueCHARACTERTerminalRuleCall_0(),
         semanticObject.getValue());
      feeder.finish();
   }


   /**
    * Constraint:
    * (value=DecimalFloatingPointLiteral | value=HexadecimalFloatingPointLiteral)
    */
   protected void sequence_FloatingPointLiteral(EObject context, FloatingPointLiteral semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * (value=DecimalIntegerLiteral | value=HexIntegerLiteral | value=OctalIntegerLiteral | value=BinaryIntegerLiteral)
    */
   protected void sequence_IntegerLiteral(EObject context, IntegerLiteral semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }


   /**
    * Constraint:
    * value=NULL
    */
   protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, LiteralsPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               LiteralsPackage.Literals.LITERAL__VALUE));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0(), semanticObject.getValue());
      feeder.finish();
   }


   /**
    * Constraint:
    * value=STRING
    */
   protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
      if (errorAcceptor != null) {
         if (transientValues.isValueTransient(semanticObject, LiteralsPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
               LiteralsPackage.Literals.LITERAL__VALUE));
      }
      INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
      SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
      feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(),
         semanticObject.getValue());
      feeder.finish();
   }
}
