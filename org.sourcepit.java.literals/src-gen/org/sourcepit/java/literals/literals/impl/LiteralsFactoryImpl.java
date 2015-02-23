/**
 */

package org.sourcepit.java.literals.literals.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.java.literals.literals.BooleanLiteral;
import org.sourcepit.java.literals.literals.CharacterLiteral;
import org.sourcepit.java.literals.literals.FloatingPointLiteral;
import org.sourcepit.java.literals.literals.IntegerLiteral;
import org.sourcepit.java.literals.literals.LiteralsFactory;
import org.sourcepit.java.literals.literals.LiteralsPackage;
import org.sourcepit.java.literals.literals.NullLiteral;
import org.sourcepit.java.literals.literals.StringLiteral;
import org.sourcepit.java.literals.literals.literal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class LiteralsFactoryImpl extends EFactoryImpl implements LiteralsFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static LiteralsFactory init() {
      try {
         LiteralsFactory theLiteralsFactory = (LiteralsFactory) EPackage.Registry.INSTANCE.getEFactory(LiteralsPackage.eNS_URI);
         if (theLiteralsFactory != null) {
            return theLiteralsFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new LiteralsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public LiteralsFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case LiteralsPackage.LITERAL :
            return createliteral();
         case LiteralsPackage.INTEGER_LITERAL :
            return createIntegerLiteral();
         case LiteralsPackage.FLOATING_POINT_LITERAL :
            return createFloatingPointLiteral();
         case LiteralsPackage.BOOLEAN_LITERAL :
            return createBooleanLiteral();
         case LiteralsPackage.CHARACTER_LITERAL :
            return createCharacterLiteral();
         case LiteralsPackage.STRING_LITERAL :
            return createStringLiteral();
         case LiteralsPackage.NULL_LITERAL :
            return createNullLiteral();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public literal createliteral() {
      literalImpl literal = new literalImpl();
      return literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public IntegerLiteral createIntegerLiteral() {
      IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
      return integerLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public FloatingPointLiteral createFloatingPointLiteral() {
      FloatingPointLiteralImpl floatingPointLiteral = new FloatingPointLiteralImpl();
      return floatingPointLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BooleanLiteral createBooleanLiteral() {
      BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
      return booleanLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public CharacterLiteral createCharacterLiteral() {
      CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
      return characterLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public StringLiteral createStringLiteral() {
      StringLiteralImpl stringLiteral = new StringLiteralImpl();
      return stringLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NullLiteral createNullLiteral() {
      NullLiteralImpl nullLiteral = new NullLiteralImpl();
      return nullLiteral;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public LiteralsPackage getLiteralsPackage() {
      return (LiteralsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static LiteralsPackage getPackage() {
      return LiteralsPackage.eINSTANCE;
   }

} // LiteralsFactoryImpl
