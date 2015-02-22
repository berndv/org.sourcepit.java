/**
 */

package org.sourcepit.java.java.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.java.java.BooleanLiteral;
import org.sourcepit.java.java.CharacterLiteral;
import org.sourcepit.java.java.FloatingPointLiteral;
import org.sourcepit.java.java.IntegerLiteral;
import org.sourcepit.java.java.JavaPackage;
import org.sourcepit.java.java.Literal;
import org.sourcepit.java.java.Model;
import org.sourcepit.java.java.NullLiteral;
import org.sourcepit.java.java.StringLiteral;

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
 * @see org.sourcepit.java.java.JavaPackage
 * @generated
 */
public class JavaSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static JavaPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaSwitch() {
      if (modelPackage == null) {
         modelPackage = JavaPackage.eINSTANCE;
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
         case JavaPackage.MODEL : {
            Model model = (Model) theEObject;
            T result = caseModel(model);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.LITERAL : {
            Literal literal = (Literal) theEObject;
            T result = caseLiteral(literal);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.INTEGER_LITERAL : {
            IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
            T result = caseIntegerLiteral(integerLiteral);
            if (result == null)
               result = caseLiteral(integerLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.FLOATING_POINT_LITERAL : {
            FloatingPointLiteral floatingPointLiteral = (FloatingPointLiteral) theEObject;
            T result = caseFloatingPointLiteral(floatingPointLiteral);
            if (result == null)
               result = caseLiteral(floatingPointLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.BOOLEAN_LITERAL : {
            BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
            T result = caseBooleanLiteral(booleanLiteral);
            if (result == null)
               result = caseLiteral(booleanLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.CHARACTER_LITERAL : {
            CharacterLiteral characterLiteral = (CharacterLiteral) theEObject;
            T result = caseCharacterLiteral(characterLiteral);
            if (result == null)
               result = caseLiteral(characterLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.STRING_LITERAL : {
            StringLiteral stringLiteral = (StringLiteral) theEObject;
            T result = caseStringLiteral(stringLiteral);
            if (result == null)
               result = caseLiteral(stringLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case JavaPackage.NULL_LITERAL : {
            NullLiteral nullLiteral = (NullLiteral) theEObject;
            T result = caseNullLiteral(nullLiteral);
            if (result == null)
               result = caseLiteral(nullLiteral);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Model</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModel(Model object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLiteral(Literal object) {
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

} // JavaSwitch
