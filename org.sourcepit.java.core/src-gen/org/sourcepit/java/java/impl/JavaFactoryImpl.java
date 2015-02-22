/**
 */

package org.sourcepit.java.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.java.java.BooleanLiteral;
import org.sourcepit.java.java.CharacterLiteral;
import org.sourcepit.java.java.FloatingPointLiteral;
import org.sourcepit.java.java.IntegerLiteral;
import org.sourcepit.java.java.JavaFactory;
import org.sourcepit.java.java.JavaPackage;
import org.sourcepit.java.java.Literal;
import org.sourcepit.java.java.Model;
import org.sourcepit.java.java.NullLiteral;
import org.sourcepit.java.java.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class JavaFactoryImpl extends EFactoryImpl implements JavaFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static JavaFactory init() {
      try {
         JavaFactory theJavaFactory = (JavaFactory) EPackage.Registry.INSTANCE.getEFactory(JavaPackage.eNS_URI);
         if (theJavaFactory != null) {
            return theJavaFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new JavaFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public JavaFactoryImpl() {
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
         case JavaPackage.MODEL :
            return createModel();
         case JavaPackage.LITERAL :
            return createLiteral();
         case JavaPackage.INTEGER_LITERAL :
            return createIntegerLiteral();
         case JavaPackage.FLOATING_POINT_LITERAL :
            return createFloatingPointLiteral();
         case JavaPackage.BOOLEAN_LITERAL :
            return createBooleanLiteral();
         case JavaPackage.CHARACTER_LITERAL :
            return createCharacterLiteral();
         case JavaPackage.STRING_LITERAL :
            return createStringLiteral();
         case JavaPackage.NULL_LITERAL :
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
   public Model createModel() {
      ModelImpl model = new ModelImpl();
      return model;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Literal createLiteral() {
      LiteralImpl literal = new LiteralImpl();
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
   public JavaPackage getJavaPackage() {
      return (JavaPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static JavaPackage getPackage() {
      return JavaPackage.eINSTANCE;
   }

} // JavaFactoryImpl
