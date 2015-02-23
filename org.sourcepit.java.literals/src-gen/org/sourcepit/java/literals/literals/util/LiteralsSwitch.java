/**
 */

package org.sourcepit.java.literals.literals.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.java.literals.literals.BooleanLiteral;
import org.sourcepit.java.literals.literals.CharacterLiteral;
import org.sourcepit.java.literals.literals.FloatingPointLiteral;
import org.sourcepit.java.literals.literals.IntegerLiteral;
import org.sourcepit.java.literals.literals.LiteralsPackage;
import org.sourcepit.java.literals.literals.NullLiteral;
import org.sourcepit.java.literals.literals.StringLiteral;
import org.sourcepit.java.literals.literals.literal;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.literals.literals.LiteralsPackage
 * @generated
 */
public class LiteralsSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static LiteralsPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public LiteralsSwitch() {
      if (modelPackage == null) {
         modelPackage = LiteralsPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case LiteralsPackage.LITERAL : {
            literal literal = (literal) theEObject;
            T result = caseliteral(literal);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case LiteralsPackage.INTEGER_LITERAL : {
            IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
            T result = caseIntegerLiteral(integerLiteral);
            if (result == null)
               result = caseliteral(integerLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case LiteralsPackage.FLOATING_POINT_LITERAL : {
            FloatingPointLiteral floatingPointLiteral = (FloatingPointLiteral) theEObject;
            T result = caseFloatingPointLiteral(floatingPointLiteral);
            if (result == null)
               result = caseliteral(floatingPointLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case LiteralsPackage.BOOLEAN_LITERAL : {
            BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
            T result = caseBooleanLiteral(booleanLiteral);
            if (result == null)
               result = caseliteral(booleanLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case LiteralsPackage.CHARACTER_LITERAL : {
            CharacterLiteral characterLiteral = (CharacterLiteral) theEObject;
            T result = caseCharacterLiteral(characterLiteral);
            if (result == null)
               result = caseliteral(characterLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case LiteralsPackage.STRING_LITERAL : {
            StringLiteral stringLiteral = (StringLiteral) theEObject;
            T result = caseStringLiteral(stringLiteral);
            if (result == null)
               result = caseliteral(stringLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case LiteralsPackage.NULL_LITERAL : {
            NullLiteral nullLiteral = (NullLiteral) theEObject;
            T result = caseNullLiteral(nullLiteral);
            if (result == null)
               result = caseliteral(nullLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseliteral(literal object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIntegerLiteral(IntegerLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Floating Point Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Floating Point Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFloatingPointLiteral(FloatingPointLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBooleanLiteral(BooleanLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Character Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Character Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCharacterLiteral(CharacterLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStringLiteral(StringLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNullLiteral(NullLiteral object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} // LiteralsSwitch
