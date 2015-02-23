/**
 */

package org.sourcepit.java.literals.literals.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.java.literals.literals.LiteralsPackage
 * @generated
 */
public class LiteralsAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static LiteralsPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public LiteralsAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = LiteralsPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object
    * of the model.
    * <!-- end-user-doc -->
    * 
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected LiteralsSwitch<Adapter> modelSwitch = new LiteralsSwitch<Adapter>() {
      @Override
      public Adapter caseliteral(literal object) {
         return createliteralAdapter();
      }

      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object) {
         return createIntegerLiteralAdapter();
      }

      @Override
      public Adapter caseFloatingPointLiteral(FloatingPointLiteral object) {
         return createFloatingPointLiteralAdapter();
      }

      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object) {
         return createBooleanLiteralAdapter();
      }

      @Override
      public Adapter caseCharacterLiteral(CharacterLiteral object) {
         return createCharacterLiteralAdapter();
      }

      @Override
      public Adapter caseStringLiteral(StringLiteral object) {
         return createStringLiteralAdapter();
      }

      @Override
      public Adapter caseNullLiteral(NullLiteral object) {
         return createNullLiteralAdapter();
      }

      @Override
      public Adapter defaultCase(EObject object) {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject) target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.literal
    * <em>literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.literal
    * @generated
    */
   public Adapter createliteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.IntegerLiteral
    * <em>Integer Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.IntegerLiteral
    * @generated
    */
   public Adapter createIntegerLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.FloatingPointLiteral
    * <em>Floating Point Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.FloatingPointLiteral
    * @generated
    */
   public Adapter createFloatingPointLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.BooleanLiteral
    * <em>Boolean Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.BooleanLiteral
    * @generated
    */
   public Adapter createBooleanLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.CharacterLiteral
    * <em>Character Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.CharacterLiteral
    * @generated
    */
   public Adapter createCharacterLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.StringLiteral
    * <em>String Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.StringLiteral
    * @generated
    */
   public Adapter createStringLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.java.literals.literals.NullLiteral
    * <em>Null Literal</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.java.literals.literals.NullLiteral
    * @generated
    */
   public Adapter createNullLiteralAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} // LiteralsAdapterFactory
