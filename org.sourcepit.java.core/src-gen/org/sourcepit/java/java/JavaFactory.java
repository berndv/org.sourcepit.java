/**
 */

package org.sourcepit.java.java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.java.JavaPackage
 * @generated
 */
public interface JavaFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   JavaFactory eINSTANCE = org.sourcepit.java.java.impl.JavaFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Model</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Model</em>'.
    * @generated
    */
   Model createModel();

   /**
    * Returns a new object of class '<em>Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Literal</em>'.
    * @generated
    */
   Literal createLiteral();

   /**
    * Returns a new object of class '<em>Integer Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Integer Literal</em>'.
    * @generated
    */
   IntegerLiteral createIntegerLiteral();

   /**
    * Returns a new object of class '<em>Floating Point Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Floating Point Literal</em>'.
    * @generated
    */
   FloatingPointLiteral createFloatingPointLiteral();

   /**
    * Returns a new object of class '<em>Boolean Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Boolean Literal</em>'.
    * @generated
    */
   BooleanLiteral createBooleanLiteral();

   /**
    * Returns a new object of class '<em>Character Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Character Literal</em>'.
    * @generated
    */
   CharacterLiteral createCharacterLiteral();

   /**
    * Returns a new object of class '<em>String Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>String Literal</em>'.
    * @generated
    */
   StringLiteral createStringLiteral();

   /**
    * Returns a new object of class '<em>Null Literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Null Literal</em>'.
    * @generated
    */
   NullLiteral createNullLiteral();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   JavaPackage getJavaPackage();

} // JavaFactory
