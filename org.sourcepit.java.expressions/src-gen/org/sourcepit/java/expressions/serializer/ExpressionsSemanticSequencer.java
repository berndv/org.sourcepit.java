
package org.sourcepit.java.expressions.serializer;

import org.eclipse.emf.ecore.EObject;
import org.sourcepit.java.expressions.expressions.ExpressionsPackage;
import org.sourcepit.java.expressions.expressions.Model;
import org.sourcepit.java.expressions.services.ExpressionsGrammarAccess;
import org.sourcepit.java.literals.literals.BooleanLiteral;
import org.sourcepit.java.literals.literals.CharacterLiteral;
import org.sourcepit.java.literals.literals.FloatingPointLiteral;
import org.sourcepit.java.literals.literals.IntegerLiteral;
import org.sourcepit.java.literals.literals.LiteralsPackage;
import org.sourcepit.java.literals.literals.NullLiteral;
import org.sourcepit.java.literals.literals.StringLiteral;
import org.sourcepit.java.literals.serializer.LiteralsSemanticSequencer;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class ExpressionsSemanticSequencer extends LiteralsSemanticSequencer {

   @Inject
   private ExpressionsGrammarAccess grammarAccess;

   public void createSequence(EObject context, EObject semanticObject) {
      if (semanticObject.eClass().getEPackage() == ExpressionsPackage.eINSTANCE)
         switch (semanticObject.eClass().getClassifierID()) {
            case ExpressionsPackage.MODEL :
               if (context == grammarAccess.getModelRule()) {
                  sequence_Model(context, (Model) semanticObject);
                  return;
               }
               else
                  break;
         }
      else if (semanticObject.eClass().getEPackage() == LiteralsPackage.eINSTANCE)
         switch (semanticObject.eClass().getClassifierID()) {
            case LiteralsPackage.BOOLEAN_LITERAL :
               if (context == grammarAccess.getBooleanLiteralRule() || context == grammarAccess.getLiteralRule()) {
                  sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.CHARACTER_LITERAL :
               if (context == grammarAccess.getCharacterLiteralRule() || context == grammarAccess.getLiteralRule()) {
                  sequence_CharacterLiteral(context, (CharacterLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.FLOATING_POINT_LITERAL :
               if (context == grammarAccess.getFloatingPointLiteralRule() || context == grammarAccess.getLiteralRule()) {
                  sequence_FloatingPointLiteral(context, (FloatingPointLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.INTEGER_LITERAL :
               if (context == grammarAccess.getIntegerLiteralRule() || context == grammarAccess.getLiteralRule()) {
                  sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.NULL_LITERAL :
               if (context == grammarAccess.getNullLiteralRule() || context == grammarAccess.getLiteralRule()) {
                  sequence_NullLiteral(context, (NullLiteral) semanticObject);
                  return;
               }
               else
                  break;
            case LiteralsPackage.STRING_LITERAL :
               if (context == grammarAccess.getStringLiteralRule() || context == grammarAccess.getLiteralRule()) {
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
    * greetings+=literal*
    */
   protected void sequence_Model(EObject context, Model semanticObject) {
      genericSequencer.createSequence(context, semanticObject);
   }
}
