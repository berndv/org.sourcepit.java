/**
 */

package org.sourcepit.java.literals.literals;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.literals.literals.LiteralsPackage
 * @generated
 */
public interface LiteralsFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   LiteralsFactory eINSTANCE = org.sourcepit.java.literals.literals.impl.LiteralsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>literal</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>literal</em>'.
    * @generated
    */
   literal createliteral();

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
   LiteralsPackage getLiteralsPackage();

} // LiteralsFactory
